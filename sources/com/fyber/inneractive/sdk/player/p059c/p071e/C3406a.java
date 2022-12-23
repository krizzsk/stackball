package com.fyber.inneractive.sdk.player.p059c.p071e;

import android.media.MediaCodecInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.e.a */
public final class C3406a {

    /* renamed from: a */
    public final String f9191a;

    /* renamed from: b */
    public final boolean f9192b;

    /* renamed from: c */
    public final boolean f9193c;

    /* renamed from: d */
    public final String f9194d;

    /* renamed from: e */
    public final MediaCodecInfo.CodecCapabilities f9195e;

    /* renamed from: a */
    public static C3406a m8474a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        return new C3406a(str, str2, codecCapabilities, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if ((com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a >= 21 && r4.isFeatureSupported("tunneled-playback")) != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3406a(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8781a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f9191a = r2
            r1.f9194d = r3
            r1.f9195e = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            int r5 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r0 = 19
            if (r5 < r0) goto L_0x0025
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r5 == 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r1.f9192b = r5
            if (r4 == 0) goto L_0x0043
            int r5 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r0 = 21
            if (r5 < r0) goto L_0x003f
            java.lang.String r5 = "tunneled-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x003f
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r4 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            r1.f9193c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p071e.C3406a.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean):void");
    }

    /* renamed from: a */
    public final MediaCodecInfo.CodecProfileLevel[] mo19186a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9195e;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.f9195e.profileLevels;
    }

    /* renamed from: a */
    public final boolean mo19185a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9195e;
        if (codecCapabilities == null) {
            mo19184a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo19184a("sizeAndRate.vCaps");
            return false;
        } else if (m8475a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m8475a(videoCapabilities, i2, i, d)) {
                mo19184a("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f9191a + ", " + this.f9194d + "] [" + C3560t.f9659e + "]");
            return true;
        }
    }

    /* renamed from: a */
    public final void mo19184a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f9191a + ", " + this.f9194d + "] [" + C3560t.f9659e + "]");
    }

    /* renamed from: a */
    private static boolean m8475a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
