package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.yandex.mobile.ads.base.C12130v;
import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.C14437r3;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.nt0;

/* renamed from: com.yandex.mobile.ads.nativeads.u */
class C15549u implements nt0 {

    /* renamed from: a */
    final C15493g0 f44082a;

    /* renamed from: b */
    private final C12130v f44083b = C12130v.m31590a();

    /* renamed from: c */
    private C15550v f44084c;

    C15549u(C15493g0 g0Var) {
        this.f44082a = g0Var;
    }

    /* renamed from: a */
    public void mo71916a(C15550v vVar) {
        this.f44084c = vVar;
        this.f44082a.mo71661a(vVar);
    }

    /* renamed from: b */
    public C12135y mo71919b(Context context, int i) {
        Pair<C12135y.C12136a, String> a = mo71732a(context, i, !this.f44083b.mo64672b(context), true);
        C12135y a2 = mo71733a(context, (C12135y.C12136a) a.first, true, i);
        a2.mo64676a((String) a.second);
        return a2;
    }

    /* renamed from: a */
    public C12135y mo69078a(Context context, int i) {
        Pair<C12135y.C12136a, String> a = mo71732a(context, i, !this.f44083b.mo64672b(context), false);
        C12135y a2 = mo71733a(context, (C12135y.C12136a) a.first, false, i);
        a2.mo64676a((String) a.second);
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo71920b() {
        View e;
        C15550v vVar = this.f44084c;
        if (vVar == null || (e = vVar.mo71926e()) == null) {
            return true;
        }
        int i = lo1.f36769b;
        int height = e.getHeight();
        if (e.getWidth() < 10 || height < 10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r4 = r4.mo71926e();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<com.yandex.mobile.ads.base.C12135y.C12136a, java.lang.String> mo71732a(android.content.Context r2, int r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0008
            if (r5 != 0) goto L_0x0008
            com.yandex.mobile.ads.base.y$a r3 = com.yandex.mobile.ads.base.C12135y.C12136a.APPLICATION_INACTIVE
            goto L_0x0058
        L_0x0008:
            boolean r4 = r1.mo71917a()
            if (r4 == 0) goto L_0x0011
            com.yandex.mobile.ads.base.y$a r3 = com.yandex.mobile.ads.base.C12135y.C12136a.SUPERVIEW_HIDDEN
            goto L_0x0058
        L_0x0011:
            boolean r4 = r1.mo71920b()
            if (r4 == 0) goto L_0x001a
            com.yandex.mobile.ads.base.y$a r3 = com.yandex.mobile.ads.base.C12135y.C12136a.TOO_SMALL
            goto L_0x0058
        L_0x001a:
            com.yandex.mobile.ads.nativeads.v r4 = r1.f44084c
            r0 = 1
            if (r4 == 0) goto L_0x002e
            android.view.View r4 = r4.mo71926e()
            if (r4 == 0) goto L_0x002e
            int r4 = com.yandex.mobile.ads.impl.lo1.m38870b((android.view.View) r4)
            if (r4 >= r0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r4 = 0
            goto L_0x002f
        L_0x002e:
            r4 = 1
        L_0x002f:
            if (r4 == 0) goto L_0x0034
            com.yandex.mobile.ads.base.y$a r3 = com.yandex.mobile.ads.base.C12135y.C12136a.VISIBLE_AREA_TOO_SMALL
            goto L_0x0058
        L_0x0034:
            com.yandex.mobile.ads.nativeads.v r4 = r1.f44084c
            if (r4 == 0) goto L_0x0041
            android.view.View r4 = r4.mo71926e()
            boolean r3 = com.yandex.mobile.ads.impl.lo1.m38868a((android.view.View) r4, (int) r3)
            r0 = r0 ^ r3
        L_0x0041:
            if (r0 == 0) goto L_0x0048
            if (r5 != 0) goto L_0x0048
            com.yandex.mobile.ads.base.y$a r3 = com.yandex.mobile.ads.base.C12135y.C12136a.NOT_VISIBLE_FOR_PERCENT
            goto L_0x0058
        L_0x0048:
            com.yandex.mobile.ads.nativeads.g0 r2 = r1.f44082a
            com.yandex.mobile.ads.nativeads.g0$a r2 = r2.mo71659a((boolean) r5)
            com.yandex.mobile.ads.nativeads.f0 r2 = (com.yandex.mobile.ads.nativeads.C15491f0) r2
            com.yandex.mobile.ads.base.y$a r3 = r2.mo71668b()
            java.lang.String r2 = r2.mo71667a()
        L_0x0058:
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r3, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.C15549u.mo71732a(android.content.Context, int, boolean, boolean):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12135y mo71733a(Context context, C12135y.C12136a aVar, boolean z, int i) {
        return new C12135y(aVar, new C14437r3());
    }

    /* renamed from: a */
    public boolean mo71917a() {
        View e;
        C15550v vVar = this.f44084c;
        if (vVar == null || (e = vVar.mo71926e()) == null) {
            return true;
        }
        return lo1.m38874d(e);
    }

    /* renamed from: a */
    public boolean mo71918a(int i) {
        View e;
        C15550v vVar = this.f44084c;
        if (vVar == null || (e = vVar.mo71926e()) == null || lo1.m38870b(e) < i) {
            return false;
        }
        return true;
    }
}
