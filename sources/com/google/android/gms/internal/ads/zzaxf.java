package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzaxf {
    public String getDefaultUserAgent(Context context) {
        return "";
    }

    public boolean isAttachedToWindow(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean zza(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzbe(Context context) {
    }

    public void zzg(Activity activity) {
    }

    public int zzxk() {
        return 5;
    }

    public int zzxn() {
        return 1;
    }

    public long zzxo() {
        return -1;
    }

    public boolean zza(Context context, WebSettings webSettings) {
        zzaze.zza(context, new zzaxi(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public static boolean zza(zzbek zzbek) {
        if (zzbek == null) {
            return false;
        }
        zzbek.onPause();
        return true;
    }

    public static boolean zzb(zzbek zzbek) {
        if (zzbek == null) {
            return false;
        }
        zzbek.onResume();
        return true;
    }

    public zzbej zza(zzbek zzbek, zzst zzst, boolean z) {
        return new zzbfl(zzbek, zzst, z);
    }

    public ViewGroup.LayoutParams zzxl() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static boolean zzxm() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public CookieManager zzbf(Context context) {
        if (zzxm()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzawr.zzc("Failed to obtain CookieManager.", th);
            zzq.zzla().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public zztp zza(Context context, TelephonyManager telephonyManager) {
        return zztp.ENUM_UNKNOWN;
    }

    public int zza(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int zzb(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private zzaxf() {
    }

    public static zzaxf zzda(int i) {
        if (i >= 28) {
            return new zzaxq();
        }
        if (i >= 26) {
            return new zzaxn();
        }
        if (i >= 24) {
            return new zzaxo();
        }
        if (i >= 21) {
            return new zzaxl();
        }
        if (i >= 19) {
            return new zzaxm();
        }
        if (i >= 18) {
            return new zzaxj();
        }
        if (i >= 17) {
            return new zzaxk();
        }
        return new zzaxf();
    }
}
