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
                .applicationId("LqxKDR6bFq7L8UlynnZjwAR4MvIXXQvCp8pP13Nf")
                .clientKey("vDoFkzpqiceXKib14QwK8un69wOj2WCb4OCEwEEz")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
