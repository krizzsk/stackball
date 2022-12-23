package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public class zzazw {
    public static void zzed(String str) {
        if (isLoggable(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    public static void zzb(String str, Throwable th) {
        if (isLoggable(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzfa(String str) {
        if (isLoggable(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    public static void zzc(String str, Throwable th) {
        if (isLoggable(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzfb(String str) {
        if (isLoggable(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    public static void zzfc(String str) {
        if (isLoggable(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }

    public static void zzd(String str, Throwable th) {
        if (isLoggable(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    private static String zzfd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void zze(String str, Throwable th) {
        if (!isLoggable(5)) {
            return;
        }
        if (th != null) {
            zzd(zzfd(str), th);
        } else {
            zzfc(zzfd(str));
        }
    }

    public static void zzfe(String str) {
        zze(str, (Throwable) null);
    }

    public static boolean isLoggable(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }
}
