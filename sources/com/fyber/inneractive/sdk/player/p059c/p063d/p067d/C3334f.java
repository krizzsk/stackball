package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.p072f.C3417a;
import com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3420a;
import com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3428e;
import com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3435h;
import com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3438j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.IronSourceSegment;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.f */
final class C3334f {

    /* renamed from: A */
    private static final int f8741A = C3560t.m8893e("sosn");

    /* renamed from: B */
    private static final int f8742B = C3560t.m8893e("tvsh");

    /* renamed from: C */
    private static final int f8743C = C3560t.m8893e("----");

    /* renamed from: D */
    private static final String[] f8744D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f8745a = C3560t.m8893e("nam");

    /* renamed from: b */
    private static final int f8746b = C3560t.m8893e("trk");

    /* renamed from: c */
    private static final int f8747c = C3560t.m8893e("cmt");

    /* renamed from: d */
    private static final int f8748d = C3560t.m8893e("day");

    /* renamed from: e */
    private static final int f8749e = C3560t.m8893e("ART");

    /* renamed from: f */
    private static final int f8750f = C3560t.m8893e("too");

    /* renamed from: g */
    private static final int f8751g = C3560t.m8893e("alb");

    /* renamed from: h */
    private static final int f8752h = C3560t.m8893e("com");

    /* renamed from: i */
    private static final int f8753i = C3560t.m8893e("wrt");

    /* renamed from: j */
    private static final int f8754j = C3560t.m8893e("lyr");

    /* renamed from: k */
    private static final int f8755k = C3560t.m8893e(IronSourceSegment.GENDER);

    /* renamed from: l */
    private static final int f8756l = C3560t.m8893e("covr");

    /* renamed from: m */
    private static final int f8757m = C3560t.m8893e("gnre");

    /* renamed from: n */
    private static final int f8758n = C3560t.m8893e("grp");

    /* renamed from: o */
    private static final int f8759o = C3560t.m8893e("disk");

    /* renamed from: p */
    private static final int f8760p = C3560t.m8893e("trkn");

    /* renamed from: q */
    private static final int f8761q = C3560t.m8893e("tmpo");

    /* renamed from: r */
    private static final int f8762r = C3560t.m8893e("cpil");

    /* renamed from: s */
    private static final int f8763s = C3560t.m8893e("aART");

    /* renamed from: t */
    private static final int f8764t = C3560t.m8893e("sonm");

    /* renamed from: u */
    private static final int f8765u = C3560t.m8893e("soal");

    /* renamed from: v */
    private static final int f8766v = C3560t.m8893e("soar");

    /* renamed from: w */
    private static final int f8767w = C3560t.m8893e("soaa");

    /* renamed from: x */
    private static final int f8768x = C3560t.m8893e("soco");

    /* renamed from: y */
    private static final int f8769y = C3560t.m8893e("rtng");

    /* renamed from: z */
    private static final int f8770z = C3560t.m8893e("pgap");

    /* renamed from: a */
    private static C3438j m8248a(int i, String str, C3548k kVar) {
        int j = kVar.mo19396j();
        if (kVar.mo19396j() == C3317a.f8592aF) {
            kVar.mo19388d(8);
            return new C3438j(str, (String) null, kVar.mo19392f(j - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + C3317a.m8208c(i));
        return null;
    }

    /* renamed from: a */
    private static C3435h m8246a(int i, String str, C3548k kVar, boolean z, boolean z2) {
        int b = m8249b(kVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + C3317a.m8208c(i));
            return null;
        } else if (z) {
            return new C3438j(str, (String) null, Integer.toString(b));
        } else {
            return new C3428e("und", str, Integer.toString(b));
        }
    }

    /* renamed from: b */
    private static C3438j m8250b(int i, String str, C3548k kVar) {
        int j = kVar.mo19396j();
        if (kVar.mo19396j() == C3317a.f8592aF && j >= 22) {
            kVar.mo19388d(10);
            int e = kVar.mo19389e();
            if (e > 0) {
                String valueOf = String.valueOf(e);
                int e2 = kVar.mo19389e();
                if (e2 > 0) {
                    valueOf = valueOf + "/" + e2;
                }
                return new C3438j(str, (String) null, valueOf);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + C3317a.m8208c(i));
        return null;
    }

    /* renamed from: b */
    private static int m8249b(C3548k kVar) {
        kVar.mo19388d(4);
        if (kVar.mo19396j() == C3317a.f8592aF) {
            kVar.mo19388d(8);
            return kVar.mo19387d();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: a */
    public static C3417a.C3419a m8245a(C3548k kVar) {
        int j = kVar.f9626b + kVar.mo19396j();
        int j2 = kVar.mo19396j();
        int i = (j2 >> 24) & 255;
        C3417a.C3419a aVar = null;
        if (i == 169 || i == 65533) {
            int i2 = 16777215 & j2;
            if (i2 == f8747c) {
                int j3 = kVar.mo19396j();
                if (kVar.mo19396j() == C3317a.f8592aF) {
                    kVar.mo19388d(8);
                    String f = kVar.mo19392f(j3 - 16);
                    aVar = new C3428e("und", f, f);
                } else {
                    Log.w("MetadataUtil", "Failed to parse comment attribute: " + C3317a.m8208c(j2));
                }
                kVar.mo19386c(j);
                return aVar;
            }
            if (i2 != f8745a) {
                if (i2 != f8746b) {
                    if (i2 != f8752h) {
                        if (i2 != f8753i) {
                            if (i2 == f8748d) {
                                C3438j a = m8248a(j2, "TDRC", kVar);
                                kVar.mo19386c(j);
                                return a;
                            } else if (i2 == f8749e) {
                                C3438j a2 = m8248a(j2, "TPE1", kVar);
                                kVar.mo19386c(j);
                                return a2;
                            } else if (i2 == f8750f) {
                                C3438j a3 = m8248a(j2, "TSSE", kVar);
                                kVar.mo19386c(j);
                                return a3;
                            } else if (i2 == f8751g) {
                                C3438j a4 = m8248a(j2, "TALB", kVar);
                                kVar.mo19386c(j);
                                return a4;
                            } else if (i2 == f8754j) {
                                C3438j a5 = m8248a(j2, "USLT", kVar);
                                kVar.mo19386c(j);
                                return a5;
                            } else if (i2 == f8755k) {
                                C3438j a6 = m8248a(j2, "TCON", kVar);
                                kVar.mo19386c(j);
                                return a6;
                            } else if (i2 == f8758n) {
                                C3438j a7 = m8248a(j2, "TIT1", kVar);
                                kVar.mo19386c(j);
                                return a7;
                            }
                        }
                    }
                    C3438j a8 = m8248a(j2, "TCOM", kVar);
                    kVar.mo19386c(j);
                    return a8;
                }
            }
            C3438j a9 = m8248a(j2, "TIT2", kVar);
            kVar.mo19386c(j);
            return a9;
        }
        try {
            if (j2 == f8757m) {
                int b = m8249b(kVar);
                String str = (b <= 0 || b > f8744D.length) ? null : f8744D[b - 1];
                if (str != null) {
                    aVar = new C3438j("TCON", (String) null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return aVar;
            } else if (j2 == f8759o) {
                C3438j b2 = m8250b(j2, "TPOS", kVar);
                kVar.mo19386c(j);
                return b2;
            } else if (j2 == f8760p) {
                C3438j b3 = m8250b(j2, "TRCK", kVar);
                kVar.mo19386c(j);
                return b3;
            } else if (j2 == f8761q) {
                C3435h a10 = m8246a(j2, "TBPM", kVar, true, false);
                kVar.mo19386c(j);
                return a10;
            } else if (j2 == f8762r) {
                C3435h a11 = m8246a(j2, "TCMP", kVar, true, true);
                kVar.mo19386c(j);
                return a11;
            } else if (j2 == f8756l) {
                int j4 = kVar.mo19396j();
                if (kVar.mo19396j() == C3317a.f8592aF) {
                    int b4 = C3317a.m8207b(kVar.mo19396j());
                    String str2 = b4 == 13 ? MimeTypes.IMAGE_JPEG : b4 == 14 ? "image/png" : null;
                    if (str2 == null) {
                        Log.w("MetadataUtil", "Unrecognized cover art flags: " + b4);
                    } else {
                        kVar.mo19388d(4);
                        int i3 = j4 - 16;
                        byte[] bArr = new byte[i3];
                        kVar.mo19382a(bArr, 0, i3);
                        aVar = new C3420a(str2, (String) null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                kVar.mo19386c(j);
                return aVar;
            } else if (j2 == f8763s) {
                C3438j a12 = m8248a(j2, "TPE2", kVar);
                kVar.mo19386c(j);
                return a12;
            } else if (j2 == f8764t) {
                C3438j a13 = m8248a(j2, "TSOT", kVar);
                kVar.mo19386c(j);
                return a13;
            } else if (j2 == f8765u) {
                C3438j a14 = m8248a(j2, "TSO2", kVar);
                kVar.mo19386c(j);
                return a14;
            } else if (j2 == f8766v) {
                C3438j a15 = m8248a(j2, "TSOA", kVar);
                kVar.mo19386c(j);
                return a15;
            } else if (j2 == f8767w) {
                C3438j a16 = m8248a(j2, "TSOP", kVar);
                kVar.mo19386c(j);
                return a16;
            } else if (j2 == f8768x) {
                C3438j a17 = m8248a(j2, "TSOC", kVar);
                kVar.mo19386c(j);
                return a17;
            } else if (j2 == f8769y) {
                C3435h a18 = m8246a(j2, "ITUNESADVISORY", kVar, false, false);
                kVar.mo19386c(j);
                return a18;
            } else if (j2 == f8770z) {
                C3435h a19 = m8246a(j2, "ITUNESGAPLESS", kVar, false, true);
                kVar.mo19386c(j);
                return a19;
            } else if (j2 == f8741A) {
                C3438j a20 = m8248a(j2, "TVSHOWSORT", kVar);
                kVar.mo19386c(j);
                return a20;
            } else if (j2 == f8742B) {
                C3438j a21 = m8248a(j2, "TVSHOW", kVar);
                kVar.mo19386c(j);
                return a21;
            } else if (j2 == f8743C) {
                C3435h a22 = m8247a(kVar, j);
                kVar.mo19386c(j);
                return a22;
            }
        } finally {
            kVar.mo19386c(j);
        }
        Log.d("MetadataUtil", "Skipped unknown metadata entry: " + C3317a.m8208c(j2));
        kVar.mo19386c(j);
        return null;
    }

    /* renamed from: a */
    private static C3435h m8247a(C3548k kVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (kVar.f9626b < i) {
            int i4 = kVar.f9626b;
            int j = kVar.mo19396j();
            int j2 = kVar.mo19396j();
            kVar.mo19388d(4);
            if (j2 == C3317a.f8590aD) {
                str = kVar.mo19392f(j - 12);
            } else if (j2 == C3317a.f8591aE) {
                str2 = kVar.mo19392f(j - 12);
            } else {
                if (j2 == C3317a.f8592aF) {
                    i2 = i4;
                    i3 = j;
                }
                kVar.mo19388d(j - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i2 == -1) {
            return null;
        }
        kVar.mo19386c(i2);
        kVar.mo19388d(16);
        return new C3428e("und", str2, kVar.mo19392f(i3 - 16));
    }
}
