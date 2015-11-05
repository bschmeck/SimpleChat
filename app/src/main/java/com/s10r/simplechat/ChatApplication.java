package com.s10r.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by bschmeckpeper on 11/5/15.
 */
public class ChatApplication extends Application {
    public static final String APPLICATION_ID="tDXmKUq9qr5wKwEfFcTVEsgGunLmZkKdZEsXiAC2";
    public static final String CLIENT_KEY="l6pxU2B2UyhdT8TsJoaefkMp1CIEmydZGkCWAZtA";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        ParseObject.registerSubclass(Message.class);

        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
    }
}
