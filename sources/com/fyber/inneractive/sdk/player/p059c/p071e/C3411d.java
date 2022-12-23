package com.fyber.inneractive.sdk.player.p059c.p071e;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.c.e.d */
public final class C3411d {

    /* renamed from: a */
    private static final C3406a f9240a = new C3406a("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false);

    /* renamed from: b */
    private static final Pattern f9241b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C3412a, List<C3406a>> f9242c = new HashMap<>();

    /* renamed from: d */
    private static final SparseIntArray f9243d;

    /* renamed from: e */
    private static final SparseIntArray f9244e;

    /* renamed from: f */
    private static final Map<String, Integer> f9245f;

    /* renamed from: g */
    private static int f9246g = -1;

    /* renamed from: com.fyber.inneractive.sdk.player.c.e.d$c */
    private interface C3414c {
        /* renamed from: a */
        int mo19196a();

        /* renamed from: a */
        MediaCodecInfo mo19197a(int i);

        /* renamed from: a */
        boolean mo19198a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo19199b();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.e.d$b */
    public static class C3413b extends Exception {
        /* synthetic */ C3413b(Throwable th, byte b) {
            this(th);
        }

        private C3413b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: a */
    public static C3406a m8512a() {
        return f9240a;
    }

    /* renamed from: a */
    public static C3406a m8513a(String str, boolean z) throws C3413b {
        List<C3406a> b = m8517b(str, z);
        if (b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    /* renamed from: b */
    private static synchronized List<C3406a> m8517b(String str, boolean z) throws C3413b {
        synchronized (C3411d.class) {
            C3412a aVar = new C3412a(str, z);
            List<C3406a> list = f9242c.get(aVar);
            if (list != null) {
                return list;
            }
            List<C3406a> a = m8514a(aVar, C3560t.f9655a >= 21 ? new C3416e(z) : new C3415d((byte) 0));
            if (z && a.isEmpty() && 21 <= C3560t.f9655a && C3560t.f9655a <= 23) {
                a = m8514a(aVar, (C3414c) new C3415d((byte) 0));
                if (!a.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a.get(0).f9191a);
                }
            }
            m8515a(a);
            List<C3406a> unmodifiableList = Collections.unmodifiableList(a);
            f9242c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: b */
    public static int m8516b() throws C3413b {
        if (f9246g == -1) {
            int i = 0;
            C3406a a = m8513a("video/avc", false);
            if (a != null) {
                MediaCodecInfo.CodecProfileLevel[] a2 = a.mo19186a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = a2[i].level;
                    int i4 = 9437184;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, C3560t.f9655a >= 21 ? 345600 : 172800);
            }
            f9246g = i;
        }
        return f9246g;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m8510a(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L_0x0036;
                case 3006244: goto L_0x002c;
                case 3199032: goto L_0x0023;
                case 3214780: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0040
        L_0x0019:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0040
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 2
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            if (r2 == 0) goto L_0x004f
            if (r2 == r8) goto L_0x004f
            if (r2 == r7) goto L_0x004a
            if (r2 == r6) goto L_0x004a
            return r0
        L_0x004a:
            android.util.Pair r9 = m8511a((java.lang.String) r9, (java.lang.String[]) r1)
            return r9
        L_0x004f:
            int r2 = r1.length
            r3 = 4
            java.lang.String r4 = "Ignoring malformed HEVC codec string: "
            java.lang.String r5 = "MediaCodecUtil"
            if (r2 >= r3) goto L_0x0067
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r5, r9)
            return r0
        L_0x0067:
            java.util.regex.Pattern r2 = f9241b
            r3 = r1[r8]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0085
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r5, r9)
            return r0
        L_0x0085:
            java.lang.String r9 = r2.group(r8)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0093
            r7 = 1
            goto L_0x009b
        L_0x0093:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00c7
        L_0x009b:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = f9245f
            r1 = r1[r6]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x00bd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown HEVC level string: "
            r9.<init>(r1)
            java.lang.String r1 = r2.group(r8)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r5, r9)
            return r0
        L_0x00bd:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r9)
            return r0
        L_0x00c7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown HEVC profile string: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r5, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.m8510a(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b2 A[Catch:{ Exception -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0235 A[SYNTHETIC, Splitter:B:149:0x0235] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x027b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.fyber.inneractive.sdk.player.p059c.p071e.C3406a> m8514a(com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.C3412a r17, com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.C3414c r18) throws com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.C3413b {
        /*
            r1 = r17
            r2 = r18
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0286 }
            r4.<init>()     // Catch:{ Exception -> 0x0286 }
            java.lang.String r5 = r1.f9247a     // Catch:{ Exception -> 0x0286 }
            int r6 = r18.mo19196a()     // Catch:{ Exception -> 0x0286 }
            boolean r7 = r18.mo19199b()     // Catch:{ Exception -> 0x0286 }
            r8 = 0
        L_0x0014:
            if (r8 >= r6) goto L_0x0285
            android.media.MediaCodecInfo r9 = r2.mo19197a(r8)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x0286 }
            java.lang.String r11 = ".secure"
            if (r0 != 0) goto L_0x01af
            if (r7 != 0) goto L_0x0030
            boolean r0 = r10.endsWith(r11)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0030
            goto L_0x01af
        L_0x0030:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            r13 = 21
            if (r0 >= r13) goto L_0x0068
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0068
            goto L_0x01af
        L_0x0068:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            r13 = 18
            if (r0 >= r13) goto L_0x0078
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0078
            goto L_0x01af
        L_0x0078:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            if (r0 >= r13) goto L_0x0090
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "a70"
            java.lang.String r13 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0090
            goto L_0x01af
        L_0x0090:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            r13 = 16
            if (r0 != r13) goto L_0x0118
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "dlxu"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "protou"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "ville"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "villeplus"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "villec2"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            java.lang.String r14 = "gee"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6602"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6603"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6606"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C6616"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "L36h"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "SO-02E"
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0118
            goto L_0x01af
        L_0x0118:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            if (r0 != r13) goto L_0x014d
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "C1504"
            java.lang.String r13 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C1505"
            java.lang.String r13 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C1604"
            java.lang.String r13 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "C1605"
            java.lang.String r13 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x014d
            goto L_0x01af
        L_0x014d:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            java.lang.String r13 = "jflte"
            r14 = 19
            if (r0 > r14) goto L_0x0198
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "samsung"
            java.lang.String r15 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9657c     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            java.lang.String r15 = "d2"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            java.lang.String r15 = "serrano"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            java.lang.String r15 = "santos"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            java.lang.String r15 = "t0"
            boolean r0 = r0.startsWith(r15)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0198
            goto L_0x01af
        L_0x0198:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            if (r0 > r14) goto L_0x01ad
            java.lang.String r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x01ad
            goto L_0x01af
        L_0x01ad:
            r0 = 1
            goto L_0x01b0
        L_0x01af:
            r0 = 0
        L_0x01b0:
            if (r0 == 0) goto L_0x027b
            java.lang.String[] r13 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x0286 }
            int r14 = r13.length     // Catch:{ Exception -> 0x0286 }
            r15 = 0
        L_0x01b8:
            if (r15 >= r14) goto L_0x027b
            r12 = r13[r15]     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r12.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0271
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r12)     // Catch:{ Exception -> 0x022a }
            boolean r3 = r2.mo19198a(r5, r0)     // Catch:{ Exception -> 0x022a }
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x022a }
            r16 = r6
            r6 = 22
            if (r2 > r6) goto L_0x01fa
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9658d     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r6 = "ODROID-XU3"
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x01f8 }
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9658d     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r6 = "Nexus 10"
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x01f8 }
            if (r2 == 0) goto L_0x01fa
        L_0x01e6:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01f8 }
            if (r2 != 0) goto L_0x01f6
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01f8 }
            if (r2 == 0) goto L_0x01fa
        L_0x01f6:
            r2 = 1
            goto L_0x01fb
        L_0x01f8:
            r0 = move-exception
            goto L_0x022d
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            if (r7 == 0) goto L_0x0201
            boolean r6 = r1.f9248b     // Catch:{ Exception -> 0x01f8 }
            if (r6 == r3) goto L_0x0207
        L_0x0201:
            if (r7 != 0) goto L_0x020f
            boolean r6 = r1.f9248b     // Catch:{ Exception -> 0x01f8 }
            if (r6 != 0) goto L_0x020f
        L_0x0207:
            com.fyber.inneractive.sdk.player.c.e.a r0 = com.fyber.inneractive.sdk.player.p059c.p071e.C3406a.m8474a((java.lang.String) r10, (java.lang.String) r5, (android.media.MediaCodecInfo.CodecCapabilities) r0, (boolean) r2)     // Catch:{ Exception -> 0x01f8 }
            r4.add(r0)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x0273
        L_0x020f:
            if (r7 != 0) goto L_0x0273
            if (r3 == 0) goto L_0x0273
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f8 }
            r3.<init>()     // Catch:{ Exception -> 0x01f8 }
            r3.append(r10)     // Catch:{ Exception -> 0x01f8 }
            r3.append(r11)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01f8 }
            com.fyber.inneractive.sdk.player.c.e.a r0 = com.fyber.inneractive.sdk.player.p059c.p071e.C3406a.m8474a((java.lang.String) r3, (java.lang.String) r5, (android.media.MediaCodecInfo.CodecCapabilities) r0, (boolean) r2)     // Catch:{ Exception -> 0x01f8 }
            r4.add(r0)     // Catch:{ Exception -> 0x01f8 }
            return r4
        L_0x022a:
            r0 = move-exception
            r16 = r6
        L_0x022d:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ Exception -> 0x0286 }
            r3 = 23
            java.lang.String r6 = "MediaCodecUtil"
            if (r2 > r3) goto L_0x0252
            boolean r2 = r4.isEmpty()     // Catch:{ Exception -> 0x0286 }
            if (r2 != 0) goto L_0x0252
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = "Skipping codec "
            r0.<init>(r2)     // Catch:{ Exception -> 0x0286 }
            r0.append(r10)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = " (failed to query capabilities)"
            r0.append(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0286 }
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0273
        L_0x0252:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = "Failed to query codec "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0286 }
            r1.append(r10)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch:{ Exception -> 0x0286 }
            r1.append(r12)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0286 }
            android.util.Log.e(r6, r1)     // Catch:{ Exception -> 0x0286 }
            throw r0     // Catch:{ Exception -> 0x0286 }
        L_0x0271:
            r16 = r6
        L_0x0273:
            int r15 = r15 + 1
            r2 = r18
            r6 = r16
            goto L_0x01b8
        L_0x027b:
            r16 = r6
            int r8 = r8 + 1
            r2 = r18
            r6 = r16
            goto L_0x0014
        L_0x0285:
            return r4
        L_0x0286:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.c.e.d$b r1 = new com.fyber.inneractive.sdk.player.c.e.d$b
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.m8514a(com.fyber.inneractive.sdk.player.c.e.d$a, com.fyber.inneractive.sdk.player.c.e.d$c):java.util.List");
    }

    /* renamed from: a */
    private static void m8515a(List<C3406a> list) {
        if (C3560t.f9655a < 26) {
            if (list.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(list.get(0).f9191a)) {
                for (int i = 1; i < list.size(); i++) {
                    C3406a aVar = list.get(i);
                    if ("OMX.google.raw.decoder".equals(aVar.f9191a)) {
                        list.remove(i);
                        list.add(0, aVar);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m8511a(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
                num2 = valueOf;
            } else {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            Integer valueOf2 = Integer.valueOf(f9243d.get(num2.intValue()));
            if (valueOf2 == null) {
                Log.w("MediaCodecUtil", "Unknown AVC profile: " + num2);
                return null;
            }
            Integer valueOf3 = Integer.valueOf(f9244e.get(num.intValue()));
            if (valueOf3 != null) {
                return new Pair<>(valueOf2, valueOf3);
            }
            Log.w("MediaCodecUtil", "Unknown AVC level: " + num);
            return null;
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.e.d$e */
    private static final class C3416e implements C3414c {

        /* renamed from: a */
        private final int f9249a;

        /* renamed from: b */
        private MediaCodecInfo[] f9250b;

        /* renamed from: b */
        public final boolean mo19199b() {
            return true;
        }

        public C3416e(boolean z) {
            this.f9249a = z ? 1 : 0;
        }

        /* renamed from: a */
        public final int mo19196a() {
            m8526c();
            return this.f9250b.length;
        }

        /* renamed from: a */
        public final MediaCodecInfo mo19197a(int i) {
            m8526c();
            return this.f9250b[i];
        }

        /* renamed from: a */
        public final boolean mo19198a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: c */
        private void m8526c() {
            if (this.f9250b == null) {
                this.f9250b = new MediaCodecList(this.f9249a).getCodecInfos();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.e.d$d */
    private static final class C3415d implements C3414c {
        /* renamed from: b */
        public final boolean mo19199b() {
            return false;
        }

        private C3415d() {
        }

        /* synthetic */ C3415d(byte b) {
            this();
        }

        /* renamed from: a */
        public final int mo19196a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: a */
        public final MediaCodecInfo mo19197a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public final boolean mo19198a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.e.d$a */
    private static final class C3412a {

        /* renamed from: a */
        public final String f9247a;

        /* renamed from: b */
        public final boolean f9248b;

        public C3412a(String str, boolean z) {
            this.f9247a = str;
            this.f9248b = z;
        }

        public final int hashCode() {
            String str = this.f9247a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f9248b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C3412a.class) {
                C3412a aVar = (C3412a) obj;
                return TextUtils.equals(this.f9247a, aVar.f9247a) && this.f9248b == aVar.f9248b;
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9243d = sparseIntArray;
        sparseIntArray.put(66, 1);
        f9243d.put(77, 2);
        f9243d.put(88, 4);
        f9243d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f9244e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        f9244e.put(11, 4);
        f9244e.put(12, 8);
        f9244e.put(13, 16);
        f9244e.put(20, 32);
        f9244e.put(21, 64);
        f9244e.put(22, 128);
        f9244e.put(30, 256);
        f9244e.put(31, 512);
        f9244e.put(32, 1024);
        f9244e.put(40, 2048);
        f9244e.put(41, 4096);
        f9244e.put(42, 8192);
        f9244e.put(50, 16384);
        f9244e.put(51, 32768);
        f9244e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f9245f = hashMap;
        hashMap.put("L30", 1);
        f9245f.put("L60", 4);
        f9245f.put("L63", 16);
        f9245f.put("L90", 64);
        f9245f.put("L93", 256);
        f9245f.put("L120", 1024);
        f9245f.put("L123", 4096);
        f9245f.put("L150", 16384);
        f9245f.put("L153", 65536);
        f9245f.put("L156", 262144);
        f9245f.put("L180", 1048576);
        f9245f.put("L183", 4194304);
        f9245f.put("L186", 16777216);
        f9245f.put("H30", 2);
        f9245f.put("H60", 8);
        f9245f.put("H63", 32);
        f9245f.put("H90", 128);
        f9245f.put("H93", 512);
        f9245f.put("H120", 2048);
        f9245f.put("H123", 8192);
        f9245f.put("H150", 32768);
        f9245f.put("H153", 131072);
        f9245f.put("H156", 524288);
        f9245f.put("H180", 2097152);
        f9245f.put("H183", 8388608);
        f9245f.put("H186", 33554432);
    }
}
