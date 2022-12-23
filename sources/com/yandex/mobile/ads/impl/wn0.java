package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;

public final class wn0 {

    /* renamed from: a */
    private static final ArrayList<C15065a> f42065a = new ArrayList<>();

    /* renamed from: b */
    public static final /* synthetic */ int f42066b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.wn0$a */
    private static final class C15065a {
    }

    /* renamed from: a */
    public static String m43724a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case TsExtractor.TS_STREAM_TYPE_AC4:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static String m43725b(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e = ih1.m37399e(str.trim());
        if (e.startsWith("avc1") || e.startsWith("avc3")) {
            return "video/avc";
        }
        if (e.startsWith("hev1") || e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e.startsWith("dvav") || e.startsWith("dva1") || e.startsWith("dvhe") || e.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (e.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (e.startsWith("vp9") || e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e.startsWith("vp8") || e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (e.startsWith("mp4a")) {
            if (e.startsWith("mp4a.")) {
                String substring = e.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = m43724a(Integer.parseInt(ih1.m37400f(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (e.startsWith("ac-3") || e.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (e.startsWith("ec-3") || e.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (e.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (e.startsWith("ac-4") || e.startsWith("dac4")) {
                return MimeTypes.AUDIO_AC4;
            }
            if (e.startsWith("dtsc") || e.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (e.startsWith("dtsh") || e.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (e.startsWith("opus")) {
                return "audio/opus";
            }
            if (e.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (e.startsWith("flac")) {
                return "audio/flac";
            }
            if (e.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (e.startsWith("wvtt")) {
                return "text/vtt";
            }
            int size = f42065a.size();
            for (int i = 0; i < size; i++) {
                f42065a.get(i).getClass();
                if (e.startsWith((String) null)) {
                    break;
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    private static String m43726c(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: d */
    public static int m43727d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m43728e(str)) {
            return 1;
        }
        if (m43730g(str)) {
            return 2;
        }
        if ("text".equals(m43726c(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        int size = f42065a.size();
        for (int i = 0; i < size; i++) {
            f42065a.get(i).getClass();
            if (str.equals((Object) null)) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static boolean m43728e(String str) {
        return "audio".equals(m43726c(str));
    }

    /* renamed from: f */
    public static boolean m43729f(String str) {
        return "text".equals(m43726c(str));
    }

    /* renamed from: g */
    public static boolean m43730g(String str) {
        return "video".equals(m43726c(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m43723a(java.lang.String r5) {
        /*
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 7
            r2 = 6
            r3 = 5
            r4 = 0
            switch(r0) {
                case -2123537834: goto L_0x005d;
                case -1095064472: goto L_0x0052;
                case 187078296: goto L_0x0047;
                case 187078297: goto L_0x003c;
                case 1504578661: goto L_0x0031;
                case 1504831518: goto L_0x0026;
                case 1505942594: goto L_0x001b;
                case 1556697186: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0068
        L_0x0010:
            java.lang.String r0 = "audio/true-hd"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0019
            goto L_0x0068
        L_0x0019:
            r5 = 7
            goto L_0x0069
        L_0x001b:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0024
            goto L_0x0068
        L_0x0024:
            r5 = 6
            goto L_0x0069
        L_0x0026:
            java.lang.String r0 = "audio/mpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002f
            goto L_0x0068
        L_0x002f:
            r5 = 5
            goto L_0x0069
        L_0x0031:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x003a
            goto L_0x0068
        L_0x003a:
            r5 = 4
            goto L_0x0069
        L_0x003c:
            java.lang.String r0 = "audio/ac4"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0045
            goto L_0x0068
        L_0x0045:
            r5 = 3
            goto L_0x0069
        L_0x0047:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0050
            goto L_0x0068
        L_0x0050:
            r5 = 2
            goto L_0x0069
        L_0x0052:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x005b
            goto L_0x0068
        L_0x005b:
            r5 = 1
            goto L_0x0069
        L_0x005d:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r5 = 0
            goto L_0x0069
        L_0x0068:
            r5 = -1
        L_0x0069:
            switch(r5) {
                case 0: goto L_0x007c;
                case 1: goto L_0x007b;
                case 2: goto L_0x007a;
                case 3: goto L_0x0077;
                case 4: goto L_0x0076;
                case 5: goto L_0x0073;
                case 6: goto L_0x0070;
                case 7: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            return r4
        L_0x006d:
            r5 = 14
            return r5
        L_0x0070:
            r5 = 8
            return r5
        L_0x0073:
            r5 = 9
            return r5
        L_0x0076:
            return r2
        L_0x0077:
            r5 = 17
            return r5
        L_0x007a:
            return r3
        L_0x007b:
            return r1
        L_0x007c:
            r5 = 18
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wn0.m43723a(java.lang.String):int");
    }
}
