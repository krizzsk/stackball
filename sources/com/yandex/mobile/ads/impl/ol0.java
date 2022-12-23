package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.yandex.mobile.ads.exo.Format;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class ol0 {

    /* renamed from: a */
    public final String f38260a;

    /* renamed from: b */
    public final String f38261b;

    /* renamed from: c */
    public final String f38262c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f38263d;

    /* renamed from: e */
    public final boolean f38264e;

    /* renamed from: f */
    public final boolean f38265f;

    /* renamed from: g */
    public final boolean f38266g;

    /* renamed from: h */
    private final boolean f38267h;

    private ol0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f38260a = (String) C13479j9.m37703a(str);
        this.f38261b = str2;
        this.f38262c = str3;
        this.f38263d = codecCapabilities;
        this.f38266g = z;
        boolean z7 = true;
        this.f38264e = !z5 && codecCapabilities != null && m40446a(codecCapabilities);
        if (codecCapabilities != null) {
            m40450c(codecCapabilities);
        }
        if (!z6 && (codecCapabilities == null || !m40449b(codecCapabilities))) {
            z7 = false;
        }
        this.f38265f = z7;
        this.f38267h = wn0.m43730g(str2);
    }

    /* renamed from: a */
    public static ol0 m40444a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new ol0(str, str2, str3, codecCapabilities, false, z, z2, z3, z4, z5);
    }

    /* renamed from: b */
    public static ol0 m40448b(String str) {
        return new ol0(str, (String) null, (String) null, (MediaCodecInfo.CodecCapabilities) null, true, false, true, false, false, false);
    }

    /* renamed from: c */
    private static boolean m40450c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ih1.f34858a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public String toString() {
        return this.f38260a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] mo69202a() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f38263d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ol0.mo69202a():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* renamed from: b */
    public boolean mo69203b(Format format) {
        if (this.f38267h) {
            return this.f38264e;
        }
        Pair<Integer, Integer> a = rl0.m41607a(format);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0117, code lost:
        if (r3 == false) goto L_0x01ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ff A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo69200a(com.yandex.mobile.ads.exo.Format r12) throws com.yandex.mobile.ads.impl.rl0.C14471c {
        /*
            r11 = this;
            java.lang.String r0 = r12.f29527g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008f
            java.lang.String r3 = r11.f38261b
            if (r3 != 0) goto L_0x000c
            goto L_0x008f
        L_0x000c:
            java.lang.String r0 = com.yandex.mobile.ads.impl.wn0.m43725b(r0)
            if (r0 != 0) goto L_0x0014
            goto L_0x008f
        L_0x0014:
            java.lang.String r3 = r11.f38261b
            boolean r3 = r3.equals(r0)
            java.lang.String r4 = ", "
            if (r3 != 0) goto L_0x003c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "codec.mime "
            r3.append(r5)
            java.lang.String r5 = r12.f29527g
            r3.append(r5)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r11.m40445a((java.lang.String) r0)
        L_0x003a:
            r0 = 0
            goto L_0x0090
        L_0x003c:
            android.util.Pair r3 = com.yandex.mobile.ads.impl.rl0.m41607a((com.yandex.mobile.ads.exo.Format) r12)
            if (r3 != 0) goto L_0x0043
            goto L_0x008f
        L_0x0043:
            java.lang.Object r5 = r3.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r6 = r11.f38267h
            if (r6 != 0) goto L_0x005c
            r6 = 42
            if (r5 == r6) goto L_0x005c
            goto L_0x008f
        L_0x005c:
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r11.mo69202a()
            int r7 = r6.length
            r8 = 0
        L_0x0062:
            if (r8 >= r7) goto L_0x0072
            r9 = r6[r8]
            int r10 = r9.profile
            if (r10 != r5) goto L_0x006f
            int r9 = r9.level
            if (r9 < r3) goto L_0x006f
            goto L_0x008f
        L_0x006f:
            int r8 = r8 + 1
            goto L_0x0062
        L_0x0072:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "codec.profileLevel, "
            r3.append(r5)
            java.lang.String r5 = r12.f29527g
            r3.append(r5)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r11.m40445a((java.lang.String) r0)
            goto L_0x003a
        L_0x008f:
            r0 = 1
        L_0x0090:
            if (r0 != 0) goto L_0x0093
            return r2
        L_0x0093:
            boolean r0 = r11.f38267h
            r3 = 21
            if (r0 == 0) goto L_0x00db
            int r0 = r12.f29535o
            if (r0 <= 0) goto L_0x00da
            int r4 = r12.f29536p
            if (r4 > 0) goto L_0x00a2
            goto L_0x00da
        L_0x00a2:
            int r5 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r5 < r3) goto L_0x00ae
            float r12 = r12.f29537q
            double r1 = (double) r12
            boolean r12 = r11.mo69199a((int) r0, (int) r4, (double) r1)
            return r12
        L_0x00ae:
            int r0 = r0 * r4
            int r3 = com.yandex.mobile.ads.impl.rl0.m41603a()
            if (r0 > r3) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r1 = 0
        L_0x00b8:
            if (r1 != 0) goto L_0x00da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "legacyFrameSize, "
            r0.append(r2)
            int r2 = r12.f29535o
            r0.append(r2)
            java.lang.String r2 = "x"
            r0.append(r2)
            int r12 = r12.f29536p
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.m40445a((java.lang.String) r12)
        L_0x00da:
            return r1
        L_0x00db:
            int r0 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r0 < r3) goto L_0x0200
            int r3 = r12.f29544x
            r4 = -1
            if (r3 == r4) goto L_0x0119
            android.media.MediaCodecInfo$CodecCapabilities r5 = r11.f38263d
            if (r5 != 0) goto L_0x00ef
            java.lang.String r3 = "sampleRate.caps"
            r11.m40445a((java.lang.String) r3)
        L_0x00ed:
            r3 = 0
            goto L_0x0117
        L_0x00ef:
            android.media.MediaCodecInfo$AudioCapabilities r5 = r5.getAudioCapabilities()
            if (r5 != 0) goto L_0x00fb
            java.lang.String r3 = "sampleRate.aCaps"
            r11.m40445a((java.lang.String) r3)
            goto L_0x00ed
        L_0x00fb:
            boolean r5 = r5.isSampleRateSupported(r3)
            if (r5 != 0) goto L_0x0116
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "sampleRate.support, "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r11.m40445a((java.lang.String) r3)
            goto L_0x00ed
        L_0x0116:
            r3 = 1
        L_0x0117:
            if (r3 == 0) goto L_0x01ff
        L_0x0119:
            int r12 = r12.f29543w
            if (r12 == r4) goto L_0x0200
            android.media.MediaCodecInfo$CodecCapabilities r3 = r11.f38263d
            if (r3 != 0) goto L_0x0129
            java.lang.String r12 = "channelCount.caps"
            r11.m40445a((java.lang.String) r12)
        L_0x0126:
            r12 = 0
            goto L_0x01fc
        L_0x0129:
            android.media.MediaCodecInfo$AudioCapabilities r3 = r3.getAudioCapabilities()
            if (r3 != 0) goto L_0x0135
            java.lang.String r12 = "channelCount.aCaps"
            r11.m40445a((java.lang.String) r12)
            goto L_0x0126
        L_0x0135:
            java.lang.String r4 = r11.f38260a
            java.lang.String r5 = r11.f38261b
            int r3 = r3.getMaxInputChannelCount()
            if (r3 > r1) goto L_0x01e3
            r6 = 26
            if (r0 < r6) goto L_0x0147
            if (r3 <= 0) goto L_0x0147
            goto L_0x01e3
        L_0x0147:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01a0
            goto L_0x01e3
        L_0x01a0:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01aa
            r0 = 6
            goto L_0x01b7
        L_0x01aa:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01b5
            r0 = 16
            goto L_0x01b7
        L_0x01b5:
            r0 = 30
        L_0x01b7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AssumedMaxChannelAdjustment: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ", ["
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = " to "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "]"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "MediaCodecInfo"
            android.util.Log.w(r4, r3)
            r3 = r0
        L_0x01e3:
            if (r3 >= r12) goto L_0x01fb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "channelCount.support, "
            r0.append(r3)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.m40445a((java.lang.String) r12)
            goto L_0x0126
        L_0x01fb:
            r12 = 1
        L_0x01fc:
            if (r12 == 0) goto L_0x01ff
            goto L_0x0200
        L_0x01ff:
            r1 = 0
        L_0x0200:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ol0.mo69200a(com.yandex.mobile.ads.exo.Format):boolean");
    }

    /* renamed from: b */
    private static boolean m40449b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ih1.f34858a >= 21 && codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: a */
    public boolean mo69201a(Format format, Format format2, boolean z) {
        if (!this.f38267h) {
            if ("audio/mp4a-latm".equals(this.f38261b) && format.f29530j.equals(format2.f29530j) && format.f29543w == format2.f29543w && format.f29544x == format2.f29544x) {
                Pair<Integer, Integer> a = rl0.m41607a(format);
                Pair<Integer, Integer> a2 = rl0.m41607a(format2);
                if (!(a == null || a2 == null)) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } else if (!format.f29530j.equals(format2.f29530j) || format.f29538r != format2.f29538r || ((!this.f38264e && (format.f29535o != format2.f29535o || format.f29536p != format2.f29536p)) || ((z || format2.f29542v != null) && !ih1.m37382a((Object) format.f29542v, (Object) format2.f29542v)))) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo69199a(int i, int i2, double d) {
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f38263d;
        if (codecCapabilities == null) {
            m40445a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m40445a("sizeAndRate.vCaps");
            return false;
        }
        if (!m40447a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f38260a)) {
                    byte[] decode = Base64.decode("bWN2NWE=", 0);
                    Intrinsics.checkNotNullExpressionValue(decode, "decode(\"bWN2NWE=\", Base64.DEFAULT)");
                    if (new String(decode, Charsets.UTF_8).equals(ih1.f34859b)) {
                        z = false;
                        if (z && m40447a(videoCapabilities, i2, i, d)) {
                            Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f38260a + ", " + this.f38261b + "] [" + ih1.f34862e + "]");
                        }
                    }
                }
                z = true;
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f38260a + ", " + this.f38261b + "] [" + ih1.f34862e + "]");
            }
            m40445a("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m40445a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f38260a + ", " + this.f38261b + "] [" + ih1.f34862e + "]");
    }

    /* renamed from: a */
    private static boolean m40446a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ih1.f34858a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: a */
    private static boolean m40447a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(ih1.m37366a(i, widthAlignment) * widthAlignment, ih1.m37366a(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }
}
