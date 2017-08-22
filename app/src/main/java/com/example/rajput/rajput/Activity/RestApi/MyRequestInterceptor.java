package com.example.rajput.rajput.Activity.RestApi;

import android.content.Context;
import android.util.Log;

import com.example.rajput.rajput.Activity.Utility.StorageManager;

import retrofit.RequestInterceptor;

/**
 * Created by Ravi on 22-08-2017.
 */

public class MyRequestInterceptor implements RequestInterceptor {
    Context context;

    public MyRequestInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public void intercept(RequestFacade request) {
        if (StorageManager.getAuthToken(context) != null) {
            Log.e("Token", "token-------------------------------" + StorageManager.getAuthToken(context));
            // request.addHeader("Authorization", "Token token=" + StorageManager.getAuthToken(context).replace("\"", ""));

            request.addQueryParam("access_token",StorageManager.getAuthToken(context));
            //request.addHeader("Authorization", "Bearer 9e4952c254fedaa2c1e6eda30ed745ee9af8129432b99eb45c2d46744bac6b3f");

//            9e4952c254fedaa2c1e6eda30ed745ee9af8129432b99eb45c2d46744bac6b3f
        }
    }
}

