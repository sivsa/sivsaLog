package com.sivasalog.user.mylibrarylog;

import android.util.Log;

public class SivsaLibrary {

    private static final String TAG = "SivsaLibrary_LOG";

    public static void SivsaLog(String message){
        Log.e(TAG,message);
    }

}
