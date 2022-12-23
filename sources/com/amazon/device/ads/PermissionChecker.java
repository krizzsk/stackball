package com.amazon.device.ads;

import android.content.Context;

class PermissionChecker {
    PermissionChecker() {
    }

    public boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public boolean hasInternetPermission(Context context) {
        return hasPermission(context, "android.permission.INTERNET");
    }

    public boolean hasPhonePermission(Context context) {
        return hasPermission(context, "android.permission.CALL_PHONE");
    }

    public boolean hasWriteCalendarPermission(Context context) {
        return hasPermission(context, "android.permission.WRITE_CALENDAR");
    }

    public boolean hasReadCalendarPermission(Context context) {
        return hasPermission(context, "android.permission.READ_CALENDAR");
    }

    public boolean hasWriteExternalStoragePermission(Context context) {
        return hasPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public boolean hasLocationPermission(Context context) {
        return hasPermission(context, "android.permission.ACCESS_FINE_LOCATION") || hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
