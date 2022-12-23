package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.ep */
public class C2622ep {

    /* renamed from: a */
    public static final String f6152a = C2622ep.class.getSimpleName();

    /* renamed from: a */
    public static String m5714a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length != 5) {
            return null;
        }
        return split[3];
    }

    /* renamed from: b */
    public static String m5715b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length != 5) {
            return null;
        }
        return split[4];
    }

    /* renamed from: a */
    public static String m5713a(File file, String str) {
        String str2 = str + ".fcb";
        String[] a = C2617el.m5690a(file, Pattern.compile(".*" + Pattern.quote(str2) + ".*"));
        if (a.length > 0) {
            return a[0];
        }
        return null;
    }

    /* renamed from: com.flurry.sdk.ep$a */
    public enum C2623a {
        UNKNOWN((byte) -1),
        ACTIVE((byte) 0),
        INACTIVE((byte) 1),
        BACKGROUND((byte) 2);
        

        /* renamed from: e */
        public byte f6158e;

        private C2623a(byte b) {
            this.f6158e = b;
        }
    }

    /* renamed from: com.flurry.sdk.ep$b */
    public enum C2624b {
        UNAVAILABLE(-2),
        UNKNOWN(-1),
        SUCCESS(0),
        SERVICE_MISSING(1),
        SERVICE_UPDATING(2),
        SERVICE_VERSION_UPDATE_REQUIRED(3),
        SERVICE_DISABLED(4),
        SERVICE_INVALID(5);
        

        /* renamed from: i */
        public int f6168i;

        private C2624b(int i) {
            this.f6168i = i;
        }
    }

    /* renamed from: a */
    public static C2624b m5712a(Context context) {
        try {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable == 0) {
                return C2624b.SUCCESS;
            }
            if (isGooglePlayServicesAvailable == 1) {
                return C2624b.SERVICE_MISSING;
            }
            if (isGooglePlayServicesAvailable == 2) {
                return C2624b.SERVICE_VERSION_UPDATE_REQUIRED;
            }
            if (isGooglePlayServicesAvailable == 3) {
                return C2624b.SERVICE_DISABLED;
            }
            if (isGooglePlayServicesAvailable == 9) {
                return C2624b.SERVICE_INVALID;
            }
            if (isGooglePlayServicesAvailable != 18) {
                return C2624b.UNAVAILABLE;
            }
            return C2624b.SERVICE_UPDATING;
        } catch (Exception | NoClassDefFoundError unused) {
            C2530db.m5476a(f6152a, "Error retrieving Google Play Services Availability. This probably means google play services is unavailable.");
            return C2624b.UNAVAILABLE;
        }
    }
}
