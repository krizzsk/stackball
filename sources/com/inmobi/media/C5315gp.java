package com.inmobi.media;

import android.content.Context;
import com.appsflyer.ServerParameters;
import com.mbridge.msdk.MBridgeConstans;

/* renamed from: com.inmobi.media.gp */
/* compiled from: SdkInfo */
public final class C5315gp {
    /* renamed from: b */
    public static String m12226b() {
        return "9.1.1";
    }

    /* renamed from: c */
    public static String m12228c() {
        return MBridgeConstans.NATIVE_VIDEO_VERSION;
    }

    /* renamed from: d */
    public static String m12229d() {
        return "android";
    }

    /* renamed from: e */
    public static String m12230e() {
        return "https://www.inmobi.com/products/sdk/#downloads";
    }

    /* renamed from: a */
    public static String m12222a() {
        StringBuilder sb = new StringBuilder();
        for (char c : m12226b().toCharArray()) {
            if (c == '.') {
                sb.append("T");
            } else {
                sb.append((char) ((c - '0') + 65));
            }
        }
        return "pr-SAND-" + sb + "-20201019";
    }

    /* renamed from: a */
    public static String m12223a(Context context) {
        return C5307gj.m12157a(context, "sdk_version_store").mo40648b(ServerParameters.SDK_DATA_SDK_VERSION);
    }

    /* renamed from: a */
    public static void m12224a(Context context, String str) {
        C5307gj.m12157a(context, "sdk_version_store").mo40645a(ServerParameters.SDK_DATA_SDK_VERSION, str);
    }

    /* renamed from: b */
    public static boolean m12227b(Context context) {
        return C5307gj.m12157a(context, "sdk_version_store").mo40649b("db_deletion_failed", false);
    }

    /* renamed from: a */
    public static void m12225a(Context context, boolean z) {
        C5307gj.m12157a(context, "sdk_version_store").mo40646a("db_deletion_failed", z);
    }
}
