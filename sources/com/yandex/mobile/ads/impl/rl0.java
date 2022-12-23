package com.yandex.mobile.ads.impl;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.rl0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class rl0 {

    /* renamed from: a */
    private static final Pattern f39485a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<C14470b, List<ol0>> f39486b = new HashMap<>();

    /* renamed from: c */
    private static final SparseIntArray f39487c;

    /* renamed from: d */
    private static final SparseIntArray f39488d;

    /* renamed from: e */
    private static final SparseIntArray f39489e;

    /* renamed from: f */
    private static final SparseIntArray f39490f;

    /* renamed from: g */
    private static final Map<String, Integer> f39491g;

    /* renamed from: h */
    private static final Map<String, Integer> f39492h;

    /* renamed from: i */
    private static final Map<String, Integer> f39493i;

    /* renamed from: j */
    private static final SparseIntArray f39494j;

    /* renamed from: k */
    private static final SparseIntArray f39495k;

    /* renamed from: l */
    private static int f39496l = -1;

    /* renamed from: com.yandex.mobile.ads.impl.rl0$b */
    private static final class C14470b {

        /* renamed from: a */
        public final String f39497a;

        /* renamed from: b */
        public final boolean f39498b;

        /* renamed from: c */
        public final boolean f39499c;

        public C14470b(String str, boolean z, boolean z2) {
            this.f39497a = str;
            this.f39498b = z;
            this.f39499c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C14470b.class) {
                return false;
            }
            C14470b bVar = (C14470b) obj;
            if (TextUtils.equals(this.f39497a, bVar.f39497a) && this.f39498b == bVar.f39498b && this.f39499c == bVar.f39499c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = (((this.f39497a.hashCode() + 31) * 31) + (this.f39498b ? 1231 : 1237)) * 31;
            if (!this.f39499c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rl0$c */
    public static class C14471c extends Exception {
        private C14471c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rl0$d */
    private interface C14472d {
        /* renamed from: a */
        int mo69778a();

        /* renamed from: a */
        MediaCodecInfo mo69779a(int i);

        /* renamed from: a */
        boolean mo69780a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo69781b();

        /* renamed from: b */
        boolean mo69782b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* renamed from: com.yandex.mobile.ads.impl.rl0$e */
    private static final class C14473e implements C14472d {
        private C14473e() {
        }

        /* renamed from: a */
        public int mo69778a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: a */
        public boolean mo69780a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        /* renamed from: b */
        public boolean mo69781b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo69782b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        /* renamed from: a */
        public MediaCodecInfo mo69779a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rl0$f */
    private static final class C14474f implements C14472d {

        /* renamed from: a */
        private final int f39500a;

        /* renamed from: b */
        private MediaCodecInfo[] f39501b;

        public C14474f(boolean z, boolean z2) {
            this.f39500a = (z || z2) ? 1 : 0;
        }

        /* renamed from: a */
        public boolean mo69780a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        /* renamed from: b */
        public boolean mo69781b() {
            return true;
        }

        /* renamed from: b */
        public boolean mo69782b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        /* renamed from: a */
        public int mo69778a() {
            if (this.f39501b == null) {
                this.f39501b = new MediaCodecList(this.f39500a).getCodecInfos();
            }
            return this.f39501b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo69779a(int i) {
            if (this.f39501b == null) {
                this.f39501b = new MediaCodecList(this.f39500a).getCodecInfos();
            }
            return this.f39501b[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rl0$g */
    private interface C14475g<T> {
        /* renamed from: a */
        int mo65582a(T t);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39487c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f39488d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f39489e = sparseIntArray3;
        sparseIntArray3.put(0, 1);
        sparseIntArray3.put(1, 2);
        sparseIntArray3.put(2, 4);
        sparseIntArray3.put(3, 8);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f39490f = sparseIntArray4;
        sparseIntArray4.put(10, 1);
        sparseIntArray4.put(11, 2);
        sparseIntArray4.put(20, 4);
        sparseIntArray4.put(21, 8);
        sparseIntArray4.put(30, 16);
        sparseIntArray4.put(31, 32);
        sparseIntArray4.put(40, 64);
        sparseIntArray4.put(41, 128);
        sparseIntArray4.put(50, 256);
        sparseIntArray4.put(51, 512);
        sparseIntArray4.put(60, 2048);
        sparseIntArray4.put(61, 4096);
        sparseIntArray4.put(62, 8192);
        HashMap hashMap = new HashMap();
        f39491g = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
        HashMap hashMap2 = new HashMap();
        f39492h = hashMap2;
        hashMap2.put("00", 1);
        hashMap2.put("01", 2);
        hashMap2.put("02", 4);
        hashMap2.put("03", 8);
        hashMap2.put("04", 16);
        hashMap2.put("05", 32);
        hashMap2.put("06", 64);
        hashMap2.put("07", 128);
        hashMap2.put("08", 256);
        hashMap2.put("09", 512);
        HashMap hashMap3 = new HashMap();
        f39493i = hashMap3;
        hashMap3.put("01", 1);
        hashMap3.put("02", 2);
        hashMap3.put("03", 4);
        hashMap3.put("04", 8);
        hashMap3.put("05", 16);
        hashMap3.put("06", 32);
        hashMap3.put("07", 64);
        hashMap3.put("08", 128);
        hashMap3.put("09", 256);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        f39494j = sparseIntArray5;
        sparseIntArray5.put(0, 1);
        sparseIntArray5.put(1, 2);
        sparseIntArray5.put(2, 4);
        sparseIntArray5.put(3, 8);
        sparseIntArray5.put(4, 16);
        sparseIntArray5.put(5, 32);
        sparseIntArray5.put(6, 64);
        sparseIntArray5.put(7, 128);
        sparseIntArray5.put(8, 256);
        sparseIntArray5.put(9, 512);
        sparseIntArray5.put(10, 1024);
        sparseIntArray5.put(11, 2048);
        sparseIntArray5.put(12, 4096);
        sparseIntArray5.put(13, 8192);
        sparseIntArray5.put(14, 16384);
        sparseIntArray5.put(15, 32768);
        sparseIntArray5.put(16, 65536);
        sparseIntArray5.put(17, 131072);
        sparseIntArray5.put(18, 262144);
        sparseIntArray5.put(19, 524288);
        sparseIntArray5.put(20, 1048576);
        sparseIntArray5.put(21, 2097152);
        sparseIntArray5.put(22, 4194304);
        sparseIntArray5.put(23, 8388608);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        f39495k = sparseIntArray6;
        sparseIntArray6.put(1, 1);
        sparseIntArray6.put(2, 2);
        sparseIntArray6.put(3, 3);
        sparseIntArray6.put(4, 4);
        sparseIntArray6.put(5, 5);
        sparseIntArray6.put(6, 6);
        sparseIntArray6.put(17, 17);
        sparseIntArray6.put(20, 20);
        sparseIntArray6.put(23, 23);
        sparseIntArray6.put(29, 29);
        sparseIntArray6.put(39, 39);
        sparseIntArray6.put(42, 42);
    }

    /* renamed from: a */
    public static synchronized List<ol0> m41610a(String str, boolean z, boolean z2) throws C14471c {
        C14472d dVar;
        synchronized (rl0.class) {
            C14470b bVar = new C14470b(str, z, z2);
            HashMap<C14470b, List<ol0>> hashMap = f39486b;
            List<ol0> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = ih1.f34858a;
            if (i >= 21) {
                dVar = new C14474f(z, z2);
            } else {
                dVar = new C14473e();
            }
            ArrayList<ol0> a = m41609a(bVar, dVar);
            if (z && a.isEmpty() && 21 <= i && i <= 23) {
                a = m41609a(bVar, (C14472d) new C14473e());
                if (!a.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a.get(0).f38260a);
                }
            }
            m41612a(str, (List<ol0>) a);
            List<ol0> unmodifiableList = Collections.unmodifiableList(a);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m41617b(ol0 ol0) {
        return ol0.f38260a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: a */
    public static List<ol0> m41611a(List<ol0> list, Format format) {
        ArrayList arrayList = new ArrayList(list);
        m41613a(arrayList, new C14475g() {
            /* renamed from: a */
            public final int mo65582a(Object obj) {
                return rl0.m41604a(Format.this, (ol0) obj);
            }
        });
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m41604a(Format format, ol0 ol0) {
        try {
            return ol0.mo69200a(format) ? 1 : 0;
        } catch (C14471c unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static int m41603a() throws C14471c {
        int i;
        if (f39496l == -1) {
            int i2 = 0;
            List<ol0> a = m41610a("video/avc", false, false);
            ol0 ol0 = a.isEmpty() ? null : a.get(0);
            if (ol0 != null) {
                MediaCodecInfo.CodecProfileLevel[] a2 = ol0.mo69202a();
                int length = a2.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = a2[i2].level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, ih1.f34858a >= 21 ? 345600 : 172800);
            }
            f39496l = i2;
        }
        return f39496l;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m41607a(com.yandex.mobile.ads.exo.Format r13) {
        /*
            java.lang.String r0 = r13.f29527g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r13.f29530j
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "MediaCodecUtil"
            if (r2 == 0) goto L_0x00a4
            java.lang.String r13 = r13.f29527g
            int r2 = r0.length
            java.lang.String r7 = "Ignoring malformed Dolby Vision codec string: "
            if (r2 >= r3) goto L_0x0035
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x00a3
        L_0x0035:
            java.util.regex.Pattern r2 = f39485a
            r3 = r0[r5]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x00a3
        L_0x0056:
            java.lang.String r13 = r2.group(r5)
            java.util.Map<java.lang.String, java.lang.Integer> r2 = f39492h
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x007b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown Dolby Vision profile string: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x00a3
        L_0x007b:
            r13 = r0[r4]
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f39493i
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x009e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown Dolby Vision level string: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x00a3
        L_0x009e:
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r2, r0)
        L_0x00a3:
            return r1
        L_0x00a4:
            r2 = 0
            r7 = r0[r2]
            r7.getClass()
            int r8 = r7.hashCode()
            r9 = 6
            r10 = 4
            r11 = -1
            switch(r8) {
                case 3004662: goto L_0x00f7;
                case 3006243: goto L_0x00ec;
                case 3006244: goto L_0x00e1;
                case 3199032: goto L_0x00d6;
                case 3214780: goto L_0x00cb;
                case 3356560: goto L_0x00c0;
                case 3624515: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x0102
        L_0x00b5:
            java.lang.String r8 = "vp09"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00be
            goto L_0x0102
        L_0x00be:
            r7 = 6
            goto L_0x0103
        L_0x00c0:
            java.lang.String r8 = "mp4a"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00c9
            goto L_0x0102
        L_0x00c9:
            r7 = 5
            goto L_0x0103
        L_0x00cb:
            java.lang.String r8 = "hvc1"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00d4
            goto L_0x0102
        L_0x00d4:
            r7 = 4
            goto L_0x0103
        L_0x00d6:
            java.lang.String r8 = "hev1"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00df
            goto L_0x0102
        L_0x00df:
            r7 = 3
            goto L_0x0103
        L_0x00e1:
            java.lang.String r8 = "avc2"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00ea
            goto L_0x0102
        L_0x00ea:
            r7 = 2
            goto L_0x0103
        L_0x00ec:
            java.lang.String r8 = "avc1"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00f5
            goto L_0x0102
        L_0x00f5:
            r7 = 1
            goto L_0x0103
        L_0x00f7:
            java.lang.String r8 = "av01"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r7 = 0
            goto L_0x0103
        L_0x0102:
            r7 = -1
        L_0x0103:
            r8 = 16
            switch(r7) {
                case 0: goto L_0x032f;
                case 1: goto L_0x027a;
                case 2: goto L_0x027a;
                case 3: goto L_0x01e6;
                case 4: goto L_0x01e6;
                case 5: goto L_0x018a;
                case 6: goto L_0x0109;
                default: goto L_0x0108;
            }
        L_0x0108:
            return r1
        L_0x0109:
            java.lang.String r13 = r13.f29527g
            int r2 = r0.length
            java.lang.String r7 = "Ignoring malformed VP9 codec string: "
            if (r2 >= r3) goto L_0x0123
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x0189
        L_0x0123:
            r2 = r0[r5]     // Catch:{ NumberFormatException -> 0x0177 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0177 }
            r0 = r0[r4]     // Catch:{ NumberFormatException -> 0x0177 }
            int r13 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0177 }
            android.util.SparseIntArray r0 = f39489e
            int r0 = r0.get(r2, r11)
            if (r0 != r11) goto L_0x014c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Unknown VP9 profile: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
            goto L_0x0189
        L_0x014c:
            android.util.SparseIntArray r2 = f39490f
            int r2 = r2.get(r13, r11)
            if (r2 != r11) goto L_0x0169
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown VP9 level: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x0189
        L_0x0169:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.<init>(r13, r0)
            goto L_0x0189
        L_0x0177:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
        L_0x0189:
            return r1
        L_0x018a:
            java.lang.String r13 = r13.f29527g
            int r7 = r0.length
            java.lang.String r9 = "Ignoring malformed MP4A codec string: "
            if (r7 == r3) goto L_0x01a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x01e5
        L_0x01a4:
            r3 = r0[r5]     // Catch:{ NumberFormatException -> 0x01d3 }
            int r3 = java.lang.Integer.parseInt(r3, r8)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.String r3 = com.yandex.mobile.ads.impl.wn0.m43724a((int) r3)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r3 = r5.equals(r3)     // Catch:{ NumberFormatException -> 0x01d3 }
            if (r3 == 0) goto L_0x01e5
            r0 = r0[r4]     // Catch:{ NumberFormatException -> 0x01d3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01d3 }
            android.util.SparseIntArray r3 = f39495k     // Catch:{ NumberFormatException -> 0x01d3 }
            int r0 = r3.get(r0, r11)     // Catch:{ NumberFormatException -> 0x01d3 }
            if (r0 == r11) goto L_0x01e5
            android.util.Pair r3 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01d3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x01d3 }
            r3.<init>(r0, r2)     // Catch:{ NumberFormatException -> 0x01d3 }
            r1 = r3
            goto L_0x01e5
        L_0x01d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
        L_0x01e5:
            return r1
        L_0x01e6:
            java.lang.String r13 = r13.f29527g
            int r2 = r0.length
            java.lang.String r7 = "Ignoring malformed HEVC codec string: "
            if (r2 >= r10) goto L_0x0201
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x0279
        L_0x0201:
            java.util.regex.Pattern r2 = f39485a
            r8 = r0[r5]
            java.util.regex.Matcher r2 = r2.matcher(r8)
            boolean r8 = r2.matches()
            if (r8 != 0) goto L_0x0222
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x0279
        L_0x0222:
            java.lang.String r13 = r2.group(r5)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x0230
            r4 = 1
            goto L_0x0238
        L_0x0230:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x0265
        L_0x0238:
            r13 = r0[r3]
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f39491g
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x025b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown HEVC level string: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x0279
        L_0x025b:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            r1.<init>(r13, r0)
            goto L_0x0279
        L_0x0265:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown HEVC profile string: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
        L_0x0279:
            return r1
        L_0x027a:
            java.lang.String r13 = r13.f29527g
            int r7 = r0.length
            java.lang.String r12 = "Ignoring malformed AVC codec string: "
            if (r7 >= r4) goto L_0x0295
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x032e
        L_0x0295:
            r7 = r0[r5]     // Catch:{ NumberFormatException -> 0x031c }
            int r7 = r7.length()     // Catch:{ NumberFormatException -> 0x031c }
            if (r7 != r9) goto L_0x02b2
            r3 = r0[r5]     // Catch:{ NumberFormatException -> 0x031c }
            java.lang.String r2 = r3.substring(r2, r4)     // Catch:{ NumberFormatException -> 0x031c }
            int r2 = java.lang.Integer.parseInt(r2, r8)     // Catch:{ NumberFormatException -> 0x031c }
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x031c }
            java.lang.String r0 = r0.substring(r10)     // Catch:{ NumberFormatException -> 0x031c }
            int r13 = java.lang.Integer.parseInt(r0, r8)     // Catch:{ NumberFormatException -> 0x031c }
            goto L_0x02c1
        L_0x02b2:
            int r2 = r0.length     // Catch:{ NumberFormatException -> 0x031c }
            if (r2 < r3) goto L_0x0309
            r2 = r0[r5]     // Catch:{ NumberFormatException -> 0x031c }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x031c }
            r0 = r0[r4]     // Catch:{ NumberFormatException -> 0x031c }
            int r13 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x031c }
        L_0x02c1:
            android.util.SparseIntArray r0 = f39487c
            int r0 = r0.get(r2, r11)
            if (r0 != r11) goto L_0x02de
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Unknown AVC profile: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
            goto L_0x032e
        L_0x02de:
            android.util.SparseIntArray r2 = f39488d
            int r2 = r2.get(r13, r11)
            if (r2 != r11) goto L_0x02fb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown AVC level: "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
            goto L_0x032e
        L_0x02fb:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.<init>(r13, r0)
            goto L_0x032e
        L_0x0309:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x031c }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x031c }
            r0.append(r12)     // Catch:{ NumberFormatException -> 0x031c }
            r0.append(r13)     // Catch:{ NumberFormatException -> 0x031c }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x031c }
            android.util.Log.w(r6, r0)     // Catch:{ NumberFormatException -> 0x031c }
            goto L_0x032e
        L_0x031c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r6, r13)
        L_0x032e:
            return r1
        L_0x032f:
            java.lang.String r7 = r13.f29527g
            com.yandex.mobile.ads.exo.video.ColorInfo r13 = r13.f29542v
            int r8 = r0.length
            java.lang.String r12 = "Ignoring malformed AV1 codec string: "
            if (r8 >= r10) goto L_0x034c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
            goto L_0x03e7
        L_0x034c:
            r8 = r0[r5]     // Catch:{ NumberFormatException -> 0x03d5 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x03d5 }
            r10 = r0[r4]     // Catch:{ NumberFormatException -> 0x03d5 }
            java.lang.String r2 = r10.substring(r2, r4)     // Catch:{ NumberFormatException -> 0x03d5 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x03d5 }
            r0 = r0[r3]     // Catch:{ NumberFormatException -> 0x03d5 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03d5 }
            if (r8 == 0) goto L_0x037a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Unknown AV1 profile: "
            r13.append(r0)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
            goto L_0x03e7
        L_0x037a:
            r3 = 8
            if (r0 == r3) goto L_0x0397
            r7 = 10
            if (r0 == r7) goto L_0x0397
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r13.append(r2)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
            goto L_0x03e7
        L_0x0397:
            if (r0 != r3) goto L_0x039b
            r4 = 1
            goto L_0x03aa
        L_0x039b:
            if (r13 == 0) goto L_0x03aa
            byte[] r0 = r13.f30314e
            if (r0 != 0) goto L_0x03a8
            int r13 = r13.f30313d
            r0 = 7
            if (r13 == r0) goto L_0x03a8
            if (r13 != r9) goto L_0x03aa
        L_0x03a8:
            r4 = 4096(0x1000, float:5.74E-42)
        L_0x03aa:
            android.util.SparseIntArray r13 = f39494j
            int r13 = r13.get(r2, r11)
            if (r13 != r11) goto L_0x03c7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Unknown AV1 level: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
            goto L_0x03e7
        L_0x03c7:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r1.<init>(r0, r13)
            goto L_0x03e7
        L_0x03d5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r6, r13)
        L_0x03e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rl0.m41607a(com.yandex.mobile.ads.exo.Format):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r1.f39498b == false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014b A[SYNTHETIC, Splitter:B:80:0x014b] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0174 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.ol0> m41609a(com.yandex.mobile.ads.impl.rl0.C14470b r26, com.yandex.mobile.ads.impl.rl0.C14472d r27) throws com.yandex.mobile.ads.impl.rl0.C14471c {
        /*
            r1 = r26
            r2 = r27
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0199 }
            r5.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r15 = r1.f39497a     // Catch:{ Exception -> 0x0199 }
            int r14 = r27.mo69778a()     // Catch:{ Exception -> 0x0199 }
            boolean r13 = r27.mo69781b()     // Catch:{ Exception -> 0x0199 }
            r16 = 0
            r12 = 0
        L_0x001a:
            if (r12 >= r14) goto L_0x0198
            android.media.MediaCodecInfo r0 = r2.mo69779a(r12)     // Catch:{ Exception -> 0x0199 }
            int r6 = com.yandex.mobile.ads.impl.ih1.f34858a     // Catch:{ Exception -> 0x0199 }
            r7 = 29
            if (r6 < r7) goto L_0x002e
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x0199 }
            if (r9 == 0) goto L_0x002e
            r9 = 1
            goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 == 0) goto L_0x0039
        L_0x0031:
            r23 = r12
            r24 = r13
            r25 = r14
            goto L_0x016a
        L_0x0039:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x0199 }
            boolean r9 = m41615a(r0, r11, r13, r15)     // Catch:{ Exception -> 0x0199 }
            if (r9 != 0) goto L_0x0044
            goto L_0x0031
        L_0x0044:
            java.lang.String r10 = m41608a((android.media.MediaCodecInfo) r0, (java.lang.String) r11, (java.lang.String) r15)     // Catch:{ Exception -> 0x0199 }
            if (r10 != 0) goto L_0x004b
            goto L_0x0031
        L_0x004b:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x0139 }
            boolean r17 = r2.mo69782b(r4, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r18 = r2.mo69780a(r4, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r8 = r1.f39499c     // Catch:{ Exception -> 0x0139 }
            if (r8 != 0) goto L_0x005d
            if (r18 != 0) goto L_0x0031
        L_0x005d:
            if (r8 == 0) goto L_0x0062
            if (r17 != 0) goto L_0x0062
            goto L_0x0031
        L_0x0062:
            boolean r8 = r2.mo69782b(r3, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r17 = r2.mo69780a(r3, r10, r9)     // Catch:{ Exception -> 0x0139 }
            boolean r7 = r1.f39498b     // Catch:{ Exception -> 0x0139 }
            if (r7 != 0) goto L_0x0070
            if (r17 != 0) goto L_0x0031
        L_0x0070:
            if (r7 == 0) goto L_0x0075
            if (r8 != 0) goto L_0x0075
            goto L_0x0031
        L_0x0075:
            r7 = 29
            if (r6 < r7) goto L_0x0082
            boolean r7 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0139 }
            r19 = r7
            r17 = 1
            goto L_0x008c
        L_0x0082:
            boolean r7 = m41614a((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x0139 }
            r17 = 1
            r7 = r7 ^ 1
            r19 = r7
        L_0x008c:
            boolean r20 = m41614a((android.media.MediaCodecInfo) r0)     // Catch:{ Exception -> 0x0139 }
            r7 = 29
            if (r6 < r7) goto L_0x0099
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x0139 }
            goto L_0x00bc
        L_0x0099:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = com.yandex.mobile.ads.impl.ih1.m37399e((java.lang.String) r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0139 }
            if (r6 != 0) goto L_0x00bb
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0139 }
            if (r6 != 0) goto L_0x00bb
            java.lang.String r6 = "c2.google."
            boolean r0 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0139 }
            if (r0 != 0) goto L_0x00bb
            r0 = 1
            goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            boolean r17 = m41616a((java.lang.String) r11)     // Catch:{ Exception -> 0x0139 }
            if (r13 == 0) goto L_0x00c6
            boolean r6 = r1.f39498b     // Catch:{ Exception -> 0x0139 }
            if (r6 == r8) goto L_0x00cc
        L_0x00c6:
            if (r13 != 0) goto L_0x00fc
            boolean r6 = r1.f39498b     // Catch:{ Exception -> 0x00f1 }
            if (r6 != 0) goto L_0x00fc
        L_0x00cc:
            r18 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r21 = r10
            r10 = r19
            r22 = r11
            r11 = r20
            r23 = r12
            r12 = r0
            r24 = r13
            r13 = r17
            r25 = r14
            r14 = r18
            com.yandex.mobile.ads.impl.ol0 r0 = com.yandex.mobile.ads.impl.ol0.m40444a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ed }
            r5.add(r0)     // Catch:{ Exception -> 0x00ed }
            goto L_0x016a
        L_0x00ed:
            r0 = move-exception
            r1 = r22
            goto L_0x0143
        L_0x00f1:
            r0 = move-exception
            r21 = r10
            r23 = r12
            r24 = r13
            r25 = r14
            r1 = r11
            goto L_0x0143
        L_0x00fc:
            r21 = r10
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            if (r24 != 0) goto L_0x016a
            if (r8 == 0) goto L_0x016a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ed }
            r6.<init>()     // Catch:{ Exception -> 0x00ed }
            r14 = r22
            r6.append(r14)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0136 }
            r18 = 1
            r7 = r15
            r8 = r21
            r10 = r19
            r11 = r20
            r12 = r0
            r13 = r17
            r1 = r14
            r14 = r18
            com.yandex.mobile.ads.impl.ol0 r0 = com.yandex.mobile.ads.impl.ol0.m40444a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0134 }
            r5.add(r0)     // Catch:{ Exception -> 0x0134 }
            return r5
        L_0x0134:
            r0 = move-exception
            goto L_0x0143
        L_0x0136:
            r0 = move-exception
            r1 = r14
            goto L_0x0143
        L_0x0139:
            r0 = move-exception
            r21 = r10
            r1 = r11
            r23 = r12
            r24 = r13
            r25 = r14
        L_0x0143:
            int r6 = com.yandex.mobile.ads.impl.ih1.f34858a     // Catch:{ Exception -> 0x0199 }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x0174
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0199 }
            if (r6 != 0) goto L_0x0174
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r0.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x0199 }
            r0.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0199 }
            android.util.Log.e(r8, r0)     // Catch:{ Exception -> 0x0199 }
        L_0x016a:
            int r12 = r23 + 1
            r1 = r26
            r13 = r24
            r14 = r25
            goto L_0x001a
        L_0x0174:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r2.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x0199 }
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            r1 = r21
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            android.util.Log.e(r8, r1)     // Catch:{ Exception -> 0x0199 }
            throw r0     // Catch:{ Exception -> 0x0199 }
        L_0x0198:
            return r5
        L_0x0199:
            r0 = move-exception
            com.yandex.mobile.ads.impl.rl0$c r1 = new com.yandex.mobile.ads.impl.rl0$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rl0.m41609a(com.yandex.mobile.ads.impl.rl0$b, com.yandex.mobile.ads.impl.rl0$d):java.util.ArrayList");
    }

    /* renamed from: a */
    private static String m41608a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03c2, code lost:
        if (r3.startsWith(new java.lang.String(r4, kotlin.text.Charsets.UTF_8)) != false) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r9.startsWith(new java.lang.String(r1, kotlin.text.Charsets.UTF_8)) != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cf, code lost:
        if (new java.lang.String(r2, kotlin.text.Charsets.UTF_8).equals(r1) != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x023c, code lost:
        if (new java.lang.String(r1, kotlin.text.Charsets.UTF_8).equals(r9) != false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0327, code lost:
        if (new java.lang.String(r1, kotlin.text.Charsets.UTF_8).equals(r9) != false) goto L_0x0329;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m41615a(android.media.MediaCodecInfo r7, java.lang.String r8, boolean r9, java.lang.String r10) {
        /*
            boolean r7 = r7.isEncoder()
            r0 = 0
            if (r7 != 0) goto L_0x03f9
            if (r9 != 0) goto L_0x0013
            java.lang.String r7 = ".secure"
            boolean r7 = r8.endsWith(r7)
            if (r7 == 0) goto L_0x0013
            goto L_0x03f9
        L_0x0013:
            int r7 = com.yandex.mobile.ads.impl.ih1.f34858a
            r9 = 21
            if (r7 >= r9) goto L_0x004a
            java.lang.String r9 = "CIPAACDecoder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0049
            java.lang.String r9 = "CIPMP3Decoder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0049
            java.lang.String r9 = "CIPVorbisDecoder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0049
            java.lang.String r9 = "CIPAMRNBDecoder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0049
            java.lang.String r9 = "AACDecoder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0049
            java.lang.String r9 = "MP3Decoder"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x004a
        L_0x0049:
            return r0
        L_0x004a:
            r9 = 18
            if (r7 >= r9) goto L_0x00a3
            java.lang.String r9 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x00a3
            java.lang.String r9 = "YTcw"
            byte[] r9 = android.util.Base64.decode(r9, r0)
            java.lang.String r1 = "decode(\"YTcw\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            r1.<init>(r9, r2)
            java.lang.String r9 = com.yandex.mobile.ads.impl.ih1.f34859b
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = "WGlhb21p"
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"WGlhb21p\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            java.lang.String r1 = com.yandex.mobile.ads.impl.ih1.f34860c
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = "SE0="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"SE0=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r9 = r9.startsWith(r2)
            if (r9 == 0) goto L_0x00a3
        L_0x00a2:
            return r0
        L_0x00a3:
            r9 = 16
            if (r7 != r9) goto L_0x01d2
            java.lang.String r1 = "OMX.qcom.audio.decoder.mp3"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x01d2
            java.lang.String r1 = "ZGx4dQ=="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"ZGx4dQ==\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            java.lang.String r1 = com.yandex.mobile.ads.impl.ih1.f34859b
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "cHJvdG91"
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"cHJvdG91\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "dmlsbGU="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"dmlsbGU=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "dmlsbGVwbHVz"
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"dmlsbGVwbHVz\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "dmlsbGVjMg=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"dmlsbGVjMg==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "Z2Vl"
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"Z2Vl\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r1.startsWith(r3)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "QzY2MDI="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"QzY2MDI=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "QzY2MDM="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"QzY2MDM=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "QzY2MDY="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"QzY2MDY=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "QzY2MTY="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"QzY2MTY=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "TDM2aA=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"TDM2aA==\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L_0x01d1
            java.lang.String r2 = "U08tMDJF"
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r3 = "decode(\"U08tMDJF\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r2, r4)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01d2
        L_0x01d1:
            return r0
        L_0x01d2:
            if (r7 != r9) goto L_0x023f
            java.lang.String r9 = "OMX.qcom.audio.decoder.aac"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x023f
            java.lang.String r9 = "QzE1MDQ="
            byte[] r9 = android.util.Base64.decode(r9, r0)
            java.lang.String r1 = "decode(\"QzE1MDQ=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            r1.<init>(r9, r2)
            java.lang.String r9 = com.yandex.mobile.ads.impl.ih1.f34859b
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x023e
            java.lang.String r1 = "QzE1MDU="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"QzE1MDU=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r2.equals(r9)
            if (r1 != 0) goto L_0x023e
            java.lang.String r1 = "QzE2MDQ="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"QzE2MDQ=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r2.equals(r9)
            if (r1 != 0) goto L_0x023e
            java.lang.String r1 = "QzE2MDU="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"QzE2MDU=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x023f
        L_0x023e:
            return r0
        L_0x023f:
            r9 = 24
            if (r7 >= r9) goto L_0x032a
            java.lang.String r9 = "OMX.SEC.aac.dec"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0253
            java.lang.String r9 = "OMX.Exynos.AAC.Decoder"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x032a
        L_0x0253:
            com.yandex.mobile.ads.impl.x11 r9 = com.yandex.mobile.ads.impl.x11.f42358a
            com.yandex.mobile.ads.impl.rk0 r9 = r9.mo70789b()
            com.yandex.mobile.ads.impl.sk0 r9 = (com.yandex.mobile.ads.impl.sk0) r9
            java.lang.String r9 = r9.mo70006b()
            java.lang.String r1 = com.yandex.mobile.ads.impl.ih1.f34860c
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x032a
            java.lang.String r9 = com.yandex.mobile.ads.impl.ih1.f34859b
            java.lang.String r1 = "emVyb2ZsdGU="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"emVyb2ZsdGU=\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r9.startsWith(r2)
            if (r1 != 0) goto L_0x0329
            java.lang.String r1 = "emVyb2x0ZQ=="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"emVyb2x0ZQ==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r9.startsWith(r2)
            if (r1 != 0) goto L_0x0329
            java.lang.String r1 = "emVubHRl"
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"emVubHRl\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r9.startsWith(r2)
            if (r1 != 0) goto L_0x0329
            java.lang.String r1 = "U0MtMDVH"
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"U0MtMDVH\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r2.equals(r9)
            if (r1 != 0) goto L_0x0329
            java.lang.String r1 = "bWFyaW5lbHRlYXR0"
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"bWFyaW5lbHRlYXR0\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r2.equals(r9)
            if (r1 != 0) goto L_0x0329
            java.lang.String r1 = "NDA0U0M="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"NDA0U0M=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r2.equals(r9)
            if (r1 != 0) goto L_0x0329
            java.lang.String r1 = "U0MtMDRH"
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"U0MtMDRH\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r1 = r2.equals(r9)
            if (r1 != 0) goto L_0x0329
            java.lang.String r1 = "U0NWMzE="
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r2 = "decode(\"U0NWMzE=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x032a
        L_0x0329:
            return r0
        L_0x032a:
            java.lang.String r9 = "decode(\"amZsdGU=\", Base64.DEFAULT)"
            java.lang.String r1 = "amZsdGU="
            r2 = 19
            if (r7 > r2) goto L_0x03c5
            java.lang.String r3 = "OMX.SEC.vp8.dec"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x03c5
            com.yandex.mobile.ads.impl.x11 r3 = com.yandex.mobile.ads.impl.x11.f42358a
            com.yandex.mobile.ads.impl.rk0 r3 = r3.mo70789b()
            com.yandex.mobile.ads.impl.sk0 r3 = (com.yandex.mobile.ads.impl.sk0) r3
            java.lang.String r3 = r3.mo70006b()
            java.lang.String r4 = com.yandex.mobile.ads.impl.ih1.f34860c
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x03c5
            java.lang.String r3 = com.yandex.mobile.ads.impl.ih1.f34859b
            java.lang.String r4 = "ZDI="
            byte[] r4 = android.util.Base64.decode(r4, r0)
            java.lang.String r5 = "decode(\"ZDI=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r4, r6)
            boolean r4 = r3.startsWith(r5)
            if (r4 != 0) goto L_0x03c4
            java.lang.String r4 = "c2VycmFubw=="
            byte[] r4 = android.util.Base64.decode(r4, r0)
            java.lang.String r5 = "decode(\"c2VycmFubw==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r4, r6)
            boolean r4 = r3.startsWith(r5)
            if (r4 != 0) goto L_0x03c4
            byte[] r4 = android.util.Base64.decode(r1, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r4, r6)
            boolean r4 = r3.startsWith(r5)
            if (r4 != 0) goto L_0x03c4
            java.lang.String r4 = "c2FudG9z"
            byte[] r4 = android.util.Base64.decode(r4, r0)
            java.lang.String r5 = "decode(\"c2FudG9z\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r4, r6)
            boolean r4 = r3.startsWith(r5)
            if (r4 != 0) goto L_0x03c4
            java.lang.String r4 = "dDA="
            byte[] r4 = android.util.Base64.decode(r4, r0)
            java.lang.String r5 = "decode(\"dDA=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r4, r6)
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x03c5
        L_0x03c4:
            return r0
        L_0x03c5:
            if (r7 > r2) goto L_0x03e6
            java.lang.String r7 = com.yandex.mobile.ads.impl.ih1.f34859b
            byte[] r1 = android.util.Base64.decode(r1, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r9)
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            r9.<init>(r1, r2)
            boolean r7 = r7.startsWith(r9)
            if (r7 == 0) goto L_0x03e6
            java.lang.String r7 = "OMX.qcom.video.decoder.vp8"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x03e6
            return r0
        L_0x03e6:
            java.lang.String r7 = "audio/eac3-joc"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x03f7
            java.lang.String r7 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x03f7
            return r0
        L_0x03f7:
            r7 = 1
            return r7
        L_0x03f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rl0.m41615a(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m41612a(String str, List<ol0> list) {
        if ("audio/raw".equals(str)) {
            if (ih1.f34858a < 26) {
                String str2 = ih1.f34859b;
                byte[] decode = Base64.decode("Ujk=", 0);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(\"Ujk=\", Base64.DEFAULT)");
                if (str2.equals(new String(decode, Charsets.UTF_8)) && list.size() == 1 && list.get(0).f38260a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    list.add(ol0.m40444a("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
            }
            m41613a(list, $$Lambda$rl0$_JPBDtCGVkECg1slIGNhLiEyoao.INSTANCE);
        }
        int i = ih1.f34858a;
        if (i < 21 && list.size() > 1) {
            String str3 = list.get(0).f38260a;
            if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                m41613a(list, $$Lambda$rl0$rqQLDxNNqwIB_Ot6Ve7YZTqaZ0.INSTANCE);
            }
        }
        if (i < 30 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f38260a)) {
            list.add(list.remove(0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m41605a(ol0 ol0) {
        String str = ol0.f38260a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (ih1.f34858a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: a */
    private static boolean m41614a(MediaCodecInfo mediaCodecInfo) {
        if (ih1.f34858a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String e = ih1.m37399e(mediaCodecInfo.getName());
        if (e.startsWith("arc.")) {
            return false;
        }
        if (e.startsWith("omx.google.") || e.startsWith("omx.ffmpeg.") || ((e.startsWith("omx.sec.") && e.contains(".sw.")) || e.equals("omx.qcom.video.decoder.hevcswvdec") || e.startsWith("c2.android.") || e.startsWith("c2.google.") || (!e.startsWith("omx.") && !e.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m41616a(String str) {
        if (ih1.f34858a > 22) {
            return false;
        }
        byte[] decode = Base64.decode("T0RST0lELVhVMw==", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(\"T0RST0lELVhVMw==\",\n      Base64.DEFAULT)");
        String str2 = new String(decode, Charsets.UTF_8);
        String str3 = ih1.f34861d;
        if (!str2.equals(str3)) {
            byte[] decode2 = Base64.decode("TmV4dXMgMTA=", 0);
            Intrinsics.checkNotNullExpressionValue(decode2, "decode(\"TmV4dXMgMTA=\",\n      Base64.DEFAULT)");
            if (!new String(decode2, Charsets.UTF_8).equals(str3)) {
                return false;
            }
        }
        if ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m41606a(C14475g gVar, Object obj, Object obj2) {
        return gVar.mo65582a(obj2) - gVar.mo65582a(obj);
    }

    /* renamed from: a */
    private static <T> void m41613a(List<T> list, C14475g<T> gVar) {
        Collections.sort(list, new Comparator() {
            public final int compare(Object obj, Object obj2) {
                return rl0.m41606a(rl0.C14475g.this, obj, obj2);
            }
        });
    }
}
