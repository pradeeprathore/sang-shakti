package com.example.rajput.rajput.Activity.Utility;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ravi on 22-08-2017.
 */

public class StorageManager {

    public static final String PREFS_ID = "AOP_PREFS";
    public static final String PREFS_KEY = "AOP_PREFS_String";
    private static final String APP_PREFERENCE = "app_preference";
    private static final String PREF_USER_ID = "pref_user_id";
    private static final String PREF_AUTH_TOKEN = "app_auth_token";
    private static final String PREF_JOB_START_TIME = "app_JobStartTime";
    private static final String PREF_JOB_NEW_REQUEST = "app_newRequest";
    private static final String PREF_ST_NAME = "app_st_name";
    private static final String PREF_TICKET_STATUS = "app_ticket_status";
    private static final String PREF_TICKET_NUMBER = "app_ticket_number";
    private static final String PREF_PART_DOWNLOAD = "app_part_download";
    private static final String PREF_DATE = "app_date";
    private static final String PREF_SERVICE_DURATION = "app_service_duration";
    private static final String PREF_LAST_SYNC = "last_sync_time";
    private static final String LOGIN_USER = "login_user";
    private static final String PREF_HISTORY_FROM_DATE = "from_date";
    private static final String PREF_HISTORY_TO_DATE = "to_date";
    private static final String PREF_FIRST_FRAGMENT = "first_fragment";
    private static final String PREF_SECOND_FRAGMENT = "second_fragment";
    private static final String PREF_MODIFIED_DATE = "modified_date";


    public StorageManager() {
        super();
    }


    public static String getSTid(Context context) {
        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_USER_ID, null);
        return position;
    }

    public static void storeSTid(Context context, String id) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_USER_ID, id); //3

        editor.commit(); //4
    }


    public static String getAuthToken(Context context) {
        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_AUTH_TOKEN, null);
        return position;
    }

    public static void storeAuthToken(Context context, String token) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_AUTH_TOKEN, token); //3
        editor.commit(); //4

    }


    public static String getJobStartTime(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_JOB_START_TIME, null);
        return position;
    }

    public static void storeJobStartTime(Context context, String startTime) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_JOB_START_TIME, startTime); //3
        editor.commit(); //4
    }


    public static boolean getNewRequest(Context context) {
// TODO Auto-generated method stub

        SharedPreferences settings;
        boolean position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getBoolean(PREF_JOB_NEW_REQUEST, false);
        return position;
    }//getPWDFromSP()


    public static void setNewRequest(Context context, boolean value) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putBoolean(PREF_JOB_NEW_REQUEST, value); //3
        editor.commit(); //4

    }//savePWDInSP()


    public static String getStName(Context context) {


        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_ST_NAME, null);
        return position;
    }

    public static void storeStName(Context context, String stName) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_ST_NAME, stName); //3
        editor.commit(); //4
    }


    public static String getTicketStatus(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_TICKET_STATUS, null);
        return position;
    }

    public static void storeTicketStatus(Context context, String token) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_TICKET_STATUS, token); //3
        editor.commit(); //4
    }


    public static String getTicketNumber(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_TICKET_NUMBER, null);
        return position;
    }

    public static void storeTicketNumber(Context context, String token) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_TICKET_NUMBER, token); //3
        editor.commit(); //4
    }


    public static long getServiceDuration(Context context) {

        SharedPreferences settings;
        long position;

        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getLong(PREF_SERVICE_DURATION, 0);
        return position;
    }

    public static void storeServiceDuration(Context context, long time) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putLong(PREF_SERVICE_DURATION, time); //3

        editor.commit(); //4
    }

    public static String getLastSyncTime(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_LAST_SYNC, null);
        return position;
    }

    public static void storeLastSyncDate(Context context, String date) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_LAST_SYNC, date); //3
        editor.commit(); //4
    }

    public static String getLoginUser(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(LOGIN_USER, null);
        return position;
    }

    public static void setLoginUser(Context context, String date) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(LOGIN_USER, date); //3
        editor.commit(); //4
    }


    public static int getObservationStatus(Context context) {

        SharedPreferences settings;
        int position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getInt("observation", 0);
        return position;
    }

    public static void setObservationStatus(Context context, int i) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putInt("observation", i); //3
        editor.commit(); //4
    }


    public static String getFromDate(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_HISTORY_FROM_DATE, null);
        return position;
    }

    public static void setFromDate(Context context, String date) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_HISTORY_FROM_DATE, date); //3
        editor.commit(); //4
    }


    public static String getToDate(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_HISTORY_TO_DATE, null);
        return position;
    }

    public static void setToDate(Context context, String date) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_HISTORY_TO_DATE, date); //3
        editor.commit(); //4
    }


    public static String getModifiedDate(Context context) {

        SharedPreferences settings;
        String position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getString(PREF_MODIFIED_DATE, null);
        return position;
    }

    public static void setModifiedDate(Context context, String date) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREF_MODIFIED_DATE, date); //3
        editor.commit(); //4
    }


    public static void clearSharedPreference(Context context) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.clear();
        editor.commit();
    }


    public static void removeValue(Context context) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.remove(PREFS_KEY);
        editor.commit();
    }


    public static boolean getFirstFragmentRequest(Context context) {
// TODO Auto-generated method stub

        SharedPreferences settings;
        boolean position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getBoolean(PREF_FIRST_FRAGMENT, false);
        return position;
    }//getPWDFromSP()


    public static void setFirstFragmentRequest(Context context, boolean value) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putBoolean(PREF_FIRST_FRAGMENT, value); //3
        editor.commit(); //4

    }//savePWDInSP()


    public static boolean getSecondFragmentRequest(Context context) {
// TODO Auto-generated method stub

        SharedPreferences settings;
        boolean position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getBoolean(PREF_SECOND_FRAGMENT, false);
        return position;
    }//getPWDFromSP()


    public static void setSecondFragmentRequest(Context context, boolean value) {

        SharedPreferences settings;
        SharedPreferences.Editor editor;
        //settings = PreferenceManager.getDefaultSharedPreferences(context);
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putBoolean(PREF_SECOND_FRAGMENT, value); //3
        editor.commit(); //4

    }//savePWDInSP()

    public static int getIntField(Context context, String key) {

        SharedPreferences settings;
        int position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getInt(key, 0);
        return position;
    }

    public static void addIntField(Context context, String key, int date) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putInt(key, date); //3
        editor.commit(); //4
    }

    public static boolean getBooleanField(Context context, String key) {

        SharedPreferences settings;
        boolean position;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE);
        position = settings.getBoolean(key, false);
        return position;
    }

    public static void addBooleanField(Context context, String key, boolean bool) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;
        settings = context.getSharedPreferences(PREFS_ID, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putBoolean(key, bool); //3
        editor.commit(); //4
    }


}
