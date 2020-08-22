package com.kevini.self_disciplinehelper.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Kevini on 2019/1/31.
 */

public class SharePreferencesHelper {
    public static boolean save(String key, String value, Context context) {
        SharedPreferences preferences = context.getSharedPreferences("a", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();
        return true;
    }

    public static String getValue(String key,Context context) {
        SharedPreferences preferences = context.getSharedPreferences("a", Context.MODE_PRIVATE);
        String value = preferences.getString(key,"-1");
        return value;
    }

}
