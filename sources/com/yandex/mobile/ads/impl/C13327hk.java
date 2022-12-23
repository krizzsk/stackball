package com.yandex.mobile.ads.impl;

import com.google.firebase.FirebaseError;
import com.yandex.mobile.ads.impl.uk0;
import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: com.yandex.mobile.ads.impl.hk */
final class C13327hk implements z20 {

    /* renamed from: a */
    private final byte[] f34427a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C13329b> f34428b = new ArrayDeque<>();

    /* renamed from: c */
    private final wh1 f34429c = new wh1();

    /* renamed from: d */
    private y20 f34430d;

    /* renamed from: e */
    private int f34431e;

    /* renamed from: f */
    private int f34432f;

    /* renamed from: g */
    private long f34433g;

    /* renamed from: com.yandex.mobile.ads.impl.hk$b */
    private static final class C13329b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f34434a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f34435b;

        private C13329b(int i, long j) {
            this.f34434a = i;
            this.f34435b = j;
        }
    }

    /* renamed from: a */
    public void mo67560a(y20 y20) {
        this.f34430d = y20;
    }

    /* renamed from: a */
    public void mo67559a() {
        this.f34431e = 0;
        this.f34428b.clear();
        this.f34429c.mo70706b();
    }

    /* renamed from: a */
    public boolean mo67561a(C13416ik ikVar) throws IOException, InterruptedException {
        int i;
        String str;
        double d;
        this.f34430d.getClass();
        while (true) {
            if (this.f34428b.isEmpty() || ikVar.mo67811c() < this.f34428b.peek().f34435b) {
                if (this.f34431e == 0) {
                    long a = this.f34429c.mo70705a(ikVar, true, false, 4);
                    if (a == -2) {
                        ikVar.mo67812d();
                        while (true) {
                            ikVar.mo67806a(this.f34427a, 0, 4, false);
                            int a2 = wh1.m43651a(this.f34427a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                int a3 = (int) wh1.m43652a(this.f34427a, a2, false);
                                if (((uk0.C14764b) this.f34430d).mo70359a(a3)) {
                                    ikVar.mo67813d(a2);
                                    a = (long) a3;
                                }
                            }
                            ikVar.mo67813d(1);
                        }
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f34432f = (int) a;
                    this.f34431e = 1;
                }
                if (this.f34431e == 1) {
                    this.f34433g = this.f34429c.mo70705a(ikVar, false, true, 8);
                    this.f34431e = 2;
                }
                y20 y20 = this.f34430d;
                int i2 = this.f34432f;
                uk0.this.getClass();
                switch (i2) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        i = 2;
                        break;
                    case 134:
                    case FirebaseError.ERROR_WEAK_PASSWORD:
                    case 21358:
                    case 2274716:
                        i = 3;
                        break;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i = 1;
                        break;
                    case 161:
                    case 163:
                    case 165:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        i = 5;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == 0) {
                    ikVar.mo67813d((int) this.f34433g);
                    this.f34431e = 0;
                } else if (i == 1) {
                    long c = ikVar.mo67811c();
                    this.f34428b.push(new C13329b(this.f34432f, this.f34433g + c));
                    uk0.this.mo70357a(this.f34432f, c, this.f34433g);
                    this.f34431e = 0;
                    return true;
                } else if (i == 2) {
                    long j = this.f34433g;
                    if (j <= 8) {
                        uk0.this.mo70356a(this.f34432f, m36997a(ikVar, (int) j));
                        this.f34431e = 0;
                        return true;
                    }
                    throw new jy0("Invalid integer size: " + this.f34433g);
                } else if (i == 3) {
                    long j2 = this.f34433g;
                    if (j2 <= 2147483647L) {
                        y20 y202 = this.f34430d;
                        int i3 = this.f34432f;
                        int i4 = (int) j2;
                        if (i4 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i4];
                            ikVar.mo67809b(bArr, 0, i4, false);
                            while (i4 > 0 && bArr[i4 - 1] == 0) {
                                i4--;
                            }
                            str = new String(bArr, 0, i4);
                        }
                        uk0.this.mo70358a(i3, str);
                        this.f34431e = 0;
                        return true;
                    }
                    throw new jy0("String element size: " + this.f34433g);
                } else if (i == 4) {
                    uk0.this.mo70355a(this.f34432f, (int) this.f34433g, ikVar);
                    this.f34431e = 0;
                    return true;
                } else if (i == 5) {
                    long j3 = this.f34433g;
                    if (j3 == 4 || j3 == 8) {
                        y20 y203 = this.f34430d;
                        int i5 = this.f34432f;
                        int i6 = (int) j3;
                        long a4 = m36997a(ikVar, i6);
                        if (i6 == 4) {
                            d = (double) Float.intBitsToFloat((int) a4);
                        } else {
                            d = Double.longBitsToDouble(a4);
                        }
                        uk0.this.mo70354a(i5, d);
                        this.f34431e = 0;
                        return true;
                    }
                    throw new jy0("Invalid float size: " + this.f34433g);
                } else {
                    throw new jy0("Invalid element type " + i);
                }
            } else {
                uk0.this.mo70353a(this.f34428b.pop().f34434a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private long m36997a(C13416ik ikVar, int i) throws IOException, InterruptedException {
        ikVar.mo67809b(this.f34427a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f34427a[i2] & 255));
        }
        return j;
    }
}
