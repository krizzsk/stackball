package com.fyber.inneractive.sdk.p055l;

import android.app.Application;
import android.app.NotificationManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.support.p003v4.media.session.PlaybackStateCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.config.C2800n;
import com.fyber.inneractive.sdk.config.C2807s;
import com.fyber.inneractive.sdk.config.C2808t;
import com.fyber.inneractive.sdk.config.C2810v;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3657l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.l.a */
public final class C3024a {
    /* renamed from: a */
    static String m7048a() {
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            return "unity3d";
        } catch (Throwable unused) {
            return "native";
        }
    }

    /* renamed from: b */
    static Boolean m7051b() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return Boolean.valueOf(((PowerManager) C3657l.m9125p().getSystemService("power")).isPowerSaveMode());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    static Long m7052c() {
        try {
            Application p = C3657l.m9125p();
            return Long.valueOf((m7046a(p, true) + p.getCacheDir().getFreeSpace()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    static Boolean m7053d() {
        boolean z;
        try {
            AudioManager audioManager = (AudioManager) C3657l.m9125p().getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                z = false;
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                        z = true;
                    }
                }
            } else {
                z = audioManager.isWiredHeadsetOn();
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r7.isRemovable() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r4 = r4 + (m7046a(com.fyber.inneractive.sdk.util.C3657l.m9125p(), false) / android.support.p003v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0056 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Long m7054e() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1048576(0x100000, double:5.180654E-318)
            r4 = 0
            r6 = 26
            if (r0 < r6) goto L_0x0067
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C3657l.m9125p()     // Catch:{ all -> 0x007a }
            java.lang.String r6 = "storagestats"
            java.lang.Object r0 = r0.getSystemService(r6)     // Catch:{ all -> 0x007a }
            android.app.usage.StorageStatsManager r0 = (android.app.usage.StorageStatsManager) r0     // Catch:{ all -> 0x007a }
            android.app.Application r6 = com.fyber.inneractive.sdk.util.C3657l.m9125p()     // Catch:{ all -> 0x007a }
            java.lang.String r7 = "storage"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ all -> 0x007a }
            android.os.storage.StorageManager r6 = (android.os.storage.StorageManager) r6     // Catch:{ all -> 0x007a }
            java.util.List r6 = r6.getStorageVolumes()     // Catch:{ all -> 0x007a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x007a }
        L_0x002c:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x007a }
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x007a }
            android.os.storage.StorageVolume r7 = (android.os.storage.StorageVolume) r7     // Catch:{ all -> 0x007a }
            java.lang.String r8 = r7.getUuid()     // Catch:{ all -> 0x0056 }
            if (r8 != 0) goto L_0x0041
            java.util.UUID r8 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch:{ all -> 0x0056 }
            goto L_0x004d
        L_0x0041:
            java.lang.String r8 = r7.getUuid()     // Catch:{ all -> 0x0056 }
            byte[] r8 = r8.getBytes()     // Catch:{ all -> 0x0056 }
            java.util.UUID r8 = java.util.UUID.nameUUIDFromBytes(r8)     // Catch:{ all -> 0x0056 }
        L_0x004d:
            if (r8 == 0) goto L_0x002c
            long r8 = r0.getTotalBytes(r8)     // Catch:{ all -> 0x0056 }
            long r8 = r8 / r2
            long r4 = r4 + r8
            goto L_0x002c
        L_0x0056:
            boolean r7 = r7.isRemovable()     // Catch:{ all -> 0x002c }
            if (r7 == 0) goto L_0x002c
            android.app.Application r7 = com.fyber.inneractive.sdk.util.C3657l.m9125p()     // Catch:{ all -> 0x002c }
            long r7 = m7046a(r7, r1)     // Catch:{ all -> 0x002c }
            long r7 = r7 / r2
            long r4 = r4 + r7
            goto L_0x002c
        L_0x0067:
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C3657l.m9125p()     // Catch:{ all -> 0x007a }
            long r6 = m7046a(r0, r1)     // Catch:{ all -> 0x007a }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x007a }
            long r0 = r0.getTotalSpace()     // Catch:{ all -> 0x007a }
            long r6 = r6 + r0
            long r4 = r6 / r2
        L_0x007a:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p055l.C3024a.m7054e():java.lang.Long");
    }

    /* renamed from: f */
    static String m7055f() {
        try {
            boolean z = false;
            int ringerMode = ((AudioManager) C3657l.m9125p().getSystemService("audio")).getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                z = true;
            }
            return z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: g */
    static Boolean m7056g() {
        int intExtra;
        try {
            Intent registerReceiver = C3657l.m9125p().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = false;
            if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("plugged", -1)) == 1 || intExtra == 2 || intExtra == 4)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    static String m7057h() {
        try {
            Intent registerReceiver = C3657l.m9125p().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return "";
            }
            float intExtra = ((float) (registerReceiver.getIntExtra("level", -1) * 100)) / ((float) registerReceiver.getIntExtra("scale", -1));
            if (intExtra < 5.0f) {
                return "1";
            }
            if (intExtra <= 9.0f) {
                return "2";
            }
            if (intExtra <= 24.0f) {
                return ExifInterface.GPS_MEASUREMENT_3D;
            }
            if (intExtra <= 39.0f) {
                return "4";
            }
            if (intExtra <= 54.0f) {
                return CampaignEx.CLICKMODE_ON;
            }
            if (intExtra <= 69.0f) {
                return "6";
            }
            if (intExtra <= 84.0f) {
                return "7";
            }
            if (intExtra <= 100.0f) {
                return "8";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: i */
    static Boolean m7058i() {
        if (C3657l.m9123d("android.permission.BLUETOOTH") && Build.VERSION.SDK_INT >= 18) {
            try {
                BluetoothManager bluetoothManager = (BluetoothManager) C3657l.m9125p().getSystemService("bluetooth");
                if (bluetoothManager.getAdapter().getProfileConnectionState(1) != 2) {
                    if (bluetoothManager.getAdapter().getProfileConnectionState(2) != 2) {
                        return null;
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: j */
    static Boolean m7059j() {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        try {
            boolean z = false;
            if (Settings.System.getInt(C3657l.m9125p().getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    static Boolean m7060k() {
        try {
            NotificationManager notificationManager = (NotificationManager) C3657l.m9125p().getSystemService("notification");
            if (Build.VERSION.SDK_INT < 23) {
                return null;
            }
            int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
            return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static UnitDisplayType m7047a(String str) {
        C2808t a;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        C2807s b = C2739a.m5959b(str);
        if (b == null || b.f6641b.size() <= 0 || (a = b.mo18062a()) == null) {
            return unitDisplayType;
        }
        C2810v vVar = a.f6648f;
        C2800n nVar = a.f6645c;
        if (vVar != null) {
            return vVar.f6659j;
        }
        return nVar != null ? nVar.f6633b : unitDisplayType;
    }

    /* renamed from: l */
    public static Long m7061l() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert((long) Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m7049a(Context context) {
        try {
            String y = C3657l.m9134y();
            if (Build.VERSION.SDK_INT < 19 || context.getExternalFilesDirs((String) null).length < 2 || (!"mounted".equals(y) && !"mounted_ro".equals(y))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static long m7046a(Context context, boolean z) {
        try {
            if (!m7049a(context)) {
                return 0;
            }
            if (z) {
                return m7050b(context).getFreeSpace();
            }
            return m7050b(context).getTotalSpace();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static File m7050b(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        for (File file : context.getExternalCacheDirs()) {
            if (!Environment.isExternalStorageEmulated(file)) {
                return file;
            }
        }
        return null;
    }
}
