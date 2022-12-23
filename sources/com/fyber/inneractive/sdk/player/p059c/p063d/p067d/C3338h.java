package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.h */
final class C3338h {

    /* renamed from: a */
    private static final int[] f8792a = {C3560t.m8893e("isom"), C3560t.m8893e("iso2"), C3560t.m8893e("iso3"), C3560t.m8893e("iso4"), C3560t.m8893e("iso5"), C3560t.m8893e("iso6"), C3560t.m8893e("avc1"), C3560t.m8893e("hvc1"), C3560t.m8893e("hev1"), C3560t.m8893e("mp41"), C3560t.m8893e("mp42"), C3560t.m8893e("3g2a"), C3560t.m8893e("3g2b"), C3560t.m8893e("3gr6"), C3560t.m8893e("3gs6"), C3560t.m8893e("3ge6"), C3560t.m8893e("3gg6"), C3560t.m8893e("M4V "), C3560t.m8893e("M4A "), C3560t.m8893e("f4v "), C3560t.m8893e("kddi"), C3560t.m8893e("M4VP"), C3560t.m8893e("qt  "), C3560t.m8893e("MSNV")};

    /* renamed from: a */
    public static boolean m8261a(C3269g gVar) throws IOException, InterruptedException {
        return m8262a(gVar, true);
    }

    /* renamed from: b */
    public static boolean m8263b(C3269g gVar) throws IOException, InterruptedException {
        return m8262a(gVar, false);
    }

    /* renamed from: a */
    private static boolean m8262a(C3269g gVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        C3269g gVar2 = gVar;
        long d = gVar.mo19015d();
        if (d == -1 || d > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            d = 4096;
        }
        int i = (int) d;
        C3548k kVar = new C3548k(64);
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            kVar.mo19379a(8);
            gVar2.mo19014c(kVar.f9625a, 0, 8);
            long h = kVar.mo19394h();
            int j = kVar.mo19396j();
            int i3 = 16;
            if (h == 1) {
                gVar2.mo19014c(kVar.f9625a, 8, 8);
                kVar.mo19384b(16);
                h = kVar.mo19402p();
            } else {
                i3 = 8;
            }
            long j2 = (long) i3;
            if (h >= j2) {
                i2 += i3;
                if (j != C3317a.f8561B) {
                    if (j != C3317a.f8570K && j != C3317a.f8572M) {
                        if ((((long) i2) + h) - j2 >= ((long) i)) {
                            break;
                        }
                        int i4 = (int) (h - j2);
                        i2 += i4;
                        if (j == C3317a.f8586a) {
                            if (i4 < 8) {
                                return false;
                            }
                            kVar.mo19379a(i4);
                            gVar2.mo19014c(kVar.f9625a, 0, i4);
                            int i5 = i4 / 4;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    break;
                                }
                                if (i6 == 1) {
                                    kVar.mo19388d(4);
                                } else {
                                    int j3 = kVar.mo19396j();
                                    if ((j3 >>> 8) != C3560t.m8893e("3gp")) {
                                        int[] iArr = f8792a;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length) {
                                                z3 = false;
                                                break;
                                            } else if (iArr[i7] == j3) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    if (z3) {
                                        z4 = true;
                                        break;
                                    }
                                }
                                i6++;
                            }
                            if (!z4) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            gVar2.mo19013c(i4);
                        }
                    } else {
                        z2 = true;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        if (!z4 || z != z2) {
            return false;
        }
        return true;
    }
}
