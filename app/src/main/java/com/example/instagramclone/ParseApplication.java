package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jQWtAUjhkjcr03MnOpXNPIDluGRnjz25ICZfrcVj")
                .clientKey("Xct6WgswJxXeaConoUbCZeNKHi59Le4fLl23BTdQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
