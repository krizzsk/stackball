package com.yandex.mobile.ads.exo.extractor.mp4;

import android.util.Log;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.exo.metadata.id3.ApicFrame;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;
import com.yandex.mobile.ads.impl.fy0;

/* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.e */
final class C12207e {

    /* renamed from: a */
    static final String[] f29678a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    private static CommentFrame m31839a(int i, fy0 fy0) {
        int f = fy0.mo67113f();
        if (fy0.mo67113f() == 1684108385) {
            fy0.mo67114f(8);
            String a = fy0.mo67099a(f - 16);
            return new CommentFrame("und", a, a);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + C12194a.m31798a(i));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[Catch:{ all -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[Catch:{ all -> 0x019b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:125:0x0132=Splitter:B:125:0x0132, B:208:0x021d=Splitter:B:208:0x021d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.mobile.ads.exo.metadata.Metadata.Entry m31842b(com.yandex.mobile.ads.impl.fy0 r11) {
        /*
            int r0 = r11.mo67105b()
            int r1 = r11.mo67113f()
            int r0 = r0 + r1
            int r1 = r11.mo67113f()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "TCON"
            java.lang.String r4 = "MetadataUtil"
            r5 = 0
            r6 = 169(0xa9, float:2.37E-43)
            if (r2 == r6) goto L_0x018a
            r6 = 253(0xfd, float:3.55E-43)
            if (r2 != r6) goto L_0x0020
            goto L_0x018a
        L_0x0020:
            r2 = 1735291493(0x676e7265, float:1.1260334E24)
            r6 = 1
            if (r1 != r2) goto L_0x0048
            int r1 = m31844c(r11)     // Catch:{ all -> 0x019b }
            if (r1 <= 0) goto L_0x0035
            java.lang.String[] r2 = f29678a     // Catch:{ all -> 0x019b }
            int r7 = r2.length     // Catch:{ all -> 0x019b }
            if (r1 > r7) goto L_0x0035
            int r1 = r1 - r6
            r1 = r2[r1]     // Catch:{ all -> 0x019b }
            goto L_0x0036
        L_0x0035:
            r1 = r5
        L_0x0036:
            if (r1 == 0) goto L_0x003f
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r2 = new com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x019b }
            r2.<init>(r3, r5, r1)     // Catch:{ all -> 0x019b }
            r5 = r2
            goto L_0x0044
        L_0x003f:
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x019b }
        L_0x0044:
            r11.mo67112e(r0)
            return r5
        L_0x0048:
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r1 != r2) goto L_0x0057
            java.lang.String r2 = "TPOS"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31841a(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0057:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r1 != r2) goto L_0x0066
            java.lang.String r2 = "TRCK"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31841a(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0066:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 0
            if (r1 != r2) goto L_0x0076
            java.lang.String r2 = "TBPM"
            com.yandex.mobile.ads.exo.metadata.id3.Id3Frame r1 = m31840a(r1, r2, r11, r6, r3)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0076:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r1 != r2) goto L_0x0085
            java.lang.String r2 = "TCMP"
            com.yandex.mobile.ads.exo.metadata.id3.Id3Frame r1 = m31840a(r1, r2, r11, r6, r6)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0085:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r1 != r2) goto L_0x0092
            com.yandex.mobile.ads.exo.metadata.id3.ApicFrame r1 = m31838a(r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0092:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r1 != r2) goto L_0x00a1
            java.lang.String r2 = "TPE2"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x00a1:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r1 != r2) goto L_0x00b0
            java.lang.String r2 = "TSOT"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x00b0:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r1 != r2) goto L_0x00bf
            java.lang.String r2 = "TSO2"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x00bf:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r1 != r2) goto L_0x00ce
            java.lang.String r2 = "TSOA"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x00ce:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r1 != r2) goto L_0x00dd
            java.lang.String r2 = "TSOP"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x00dd:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r1 != r2) goto L_0x00ec
            java.lang.String r2 = "TSOC"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x00ec:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r1 != r2) goto L_0x00fb
            java.lang.String r2 = "ITUNESADVISORY"
            com.yandex.mobile.ads.exo.metadata.id3.Id3Frame r1 = m31840a(r1, r2, r11, r3, r3)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x00fb:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r1 != r2) goto L_0x010a
            java.lang.String r2 = "ITUNESGAPLESS"
            com.yandex.mobile.ads.exo.metadata.id3.Id3Frame r1 = m31840a(r1, r2, r11, r3, r6)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x010a:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r1 != r2) goto L_0x0119
            java.lang.String r2 = "TVSHOWSORT"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0119:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r1 != r2) goto L_0x0128
            java.lang.String r2 = "TVSHOW"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0128:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r1 != r2) goto L_0x021d
            r1 = -1
            r2 = r5
            r3 = r2
            r4 = -1
            r6 = -1
        L_0x0132:
            int r7 = r11.mo67105b()     // Catch:{ all -> 0x019b }
            if (r7 >= r0) goto L_0x016d
            int r7 = r11.mo67105b()     // Catch:{ all -> 0x019b }
            int r8 = r11.mo67113f()     // Catch:{ all -> 0x019b }
            int r9 = r11.mo67113f()     // Catch:{ all -> 0x019b }
            r10 = 4
            r11.mo67114f(r10)     // Catch:{ all -> 0x019b }
            r10 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r9 != r10) goto L_0x0154
            int r8 = r8 + -12
            java.lang.String r2 = r11.mo67099a((int) r8)     // Catch:{ all -> 0x019b }
            goto L_0x0132
        L_0x0154:
            r10 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r9 != r10) goto L_0x0160
            int r8 = r8 + -12
            java.lang.String r3 = r11.mo67099a((int) r8)     // Catch:{ all -> 0x019b }
            goto L_0x0132
        L_0x0160:
            r10 = 1684108385(0x64617461, float:1.6635614E22)
            if (r9 != r10) goto L_0x0167
            r4 = r7
            r6 = r8
        L_0x0167:
            int r8 = r8 + -12
            r11.mo67114f(r8)     // Catch:{ all -> 0x019b }
            goto L_0x0132
        L_0x016d:
            if (r2 == 0) goto L_0x0186
            if (r3 == 0) goto L_0x0186
            if (r4 != r1) goto L_0x0174
            goto L_0x0186
        L_0x0174:
            r11.mo67112e(r4)     // Catch:{ all -> 0x019b }
            r1 = 16
            r11.mo67114f(r1)     // Catch:{ all -> 0x019b }
            int r6 = r6 - r1
            java.lang.String r1 = r11.mo67099a((int) r6)     // Catch:{ all -> 0x019b }
            com.yandex.mobile.ads.exo.metadata.id3.InternalFrame r5 = new com.yandex.mobile.ads.exo.metadata.id3.InternalFrame     // Catch:{ all -> 0x019b }
            r5.<init>(r2, r3, r1)     // Catch:{ all -> 0x019b }
        L_0x0186:
            r11.mo67112e(r0)
            return r5
        L_0x018a:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            r6 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r6) goto L_0x019e
            com.yandex.mobile.ads.exo.metadata.id3.CommentFrame r1 = m31839a(r1, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x019b:
            r1 = move-exception
            goto L_0x024d
        L_0x019e:
            r6 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r6) goto L_0x0243
            r6 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r6) goto L_0x01aa
            goto L_0x0243
        L_0x01aa:
            r6 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r6) goto L_0x0239
            r6 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r6) goto L_0x01b6
            goto L_0x0239
        L_0x01b6:
            r6 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r6) goto L_0x01c5
            java.lang.String r2 = "TDRC"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x01c5:
            r6 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r6) goto L_0x01d4
            java.lang.String r2 = "TPE1"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x01d4:
            r6 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r6) goto L_0x01e3
            java.lang.String r2 = "TSSE"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x01e3:
            r6 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r6) goto L_0x01f2
            java.lang.String r2 = "TALB"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x01f2:
            r6 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r6) goto L_0x0201
            java.lang.String r2 = "USLT"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0201:
            r6 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r6) goto L_0x020e
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r3, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x020e:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L_0x021d
            java.lang.String r2 = "TIT1"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x021d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x019b }
            r2.<init>()     // Catch:{ all -> 0x019b }
            java.lang.String r3 = "Skipped unknown metadata entry: "
            r2.append(r3)     // Catch:{ all -> 0x019b }
            java.lang.String r1 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31798a(r1)     // Catch:{ all -> 0x019b }
            r2.append(r1)     // Catch:{ all -> 0x019b }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x019b }
            android.util.Log.d(r4, r1)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r5
        L_0x0239:
            java.lang.String r2 = "TCOM"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x0243:
            java.lang.String r2 = "TIT2"
            com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame r1 = m31843b(r1, r2, r11)     // Catch:{ all -> 0x019b }
            r11.mo67112e(r0)
            return r1
        L_0x024d:
            r11.mo67112e(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12207e.m31842b(com.yandex.mobile.ads.impl.fy0):com.yandex.mobile.ads.exo.metadata.Metadata$Entry");
    }

    /* renamed from: c */
    private static int m31844c(fy0 fy0) {
        fy0.mo67114f(4);
        if (fy0.mo67113f() == 1684108385) {
            fy0.mo67114f(8);
            return fy0.mo67126r();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: a */
    private static Id3Frame m31840a(int i, String str, fy0 fy0, boolean z, boolean z2) {
        int c = m31844c(fy0);
        if (z2) {
            c = Math.min(1, c);
        }
        if (c < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + C12194a.m31798a(i));
            return null;
        } else if (z) {
            return new TextInformationFrame(str, (String) null, Integer.toString(c));
        } else {
            return new CommentFrame("und", str, Integer.toString(c));
        }
    }

    /* renamed from: a */
    private static TextInformationFrame m31841a(int i, String str, fy0 fy0) {
        int f = fy0.mo67113f();
        if (fy0.mo67113f() == 1684108385 && f >= 22) {
            fy0.mo67114f(10);
            int x = fy0.mo67132x();
            if (x > 0) {
                String str2 = "" + x;
                int x2 = fy0.mo67132x();
                if (x2 > 0) {
                    str2 = str2 + "/" + x2;
                }
                return new TextInformationFrame(str, (String) null, str2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + C12194a.m31798a(i));
        return null;
    }

    /* renamed from: a */
    private static ApicFrame m31838a(fy0 fy0) {
        int f = fy0.mo67113f();
        if (fy0.mo67113f() == 1684108385) {
            int f2 = fy0.mo67113f() & ViewCompat.MEASURED_SIZE_MASK;
            String str = f2 == 13 ? MimeTypes.IMAGE_JPEG : f2 == 14 ? "image/png" : null;
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + f2);
                return null;
            }
            fy0.mo67114f(4);
            int i = f - 16;
            byte[] bArr = new byte[i];
            fy0.mo67104a(bArr, 0, i);
            return new ApicFrame(str, (String) null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: b */
    private static TextInformationFrame m31843b(int i, String str, fy0 fy0) {
        int f = fy0.mo67113f();
        if (fy0.mo67113f() == 1684108385) {
            fy0.mo67114f(8);
            return new TextInformationFrame(str, (String) null, fy0.mo67099a(f - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + C12194a.m31798a(i));
        return null;
    }
}
