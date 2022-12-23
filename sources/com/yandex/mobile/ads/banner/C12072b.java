package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.C12123r;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C12719cb;
import com.yandex.mobile.ads.impl.C12850d4;
import com.yandex.mobile.ads.impl.C12866db;
import com.yandex.mobile.ads.impl.C15224y1;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.cb0;
import com.yandex.mobile.ads.impl.db0;
import com.yandex.mobile.ads.impl.dm1;
import com.yandex.mobile.ads.impl.fb0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.xa0;
import com.yandex.mobile.ads.impl.z81;
import com.yandex.mobile.ads.impl.zo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.banner.b */
public class C12072b extends C12084k {

    /* renamed from: K */
    private final C12077d f29035K;

    /* renamed from: L */
    private final VideoController f29036L;

    /* renamed from: M */
    private final dm1 f29037M;

    /* renamed from: N */
    private final C12719cb f29038N;

    /* renamed from: O */
    private final xa0 f29039O;

    /* renamed from: P */
    private C12080g f29040P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final ViewTreeObserver.OnPreDrawListener f29041Q = new C12073a();

    /* renamed from: R */
    private C12866db f29042R;

    /* renamed from: S */
    private C12866db f29043S;

    /* renamed from: T */
    private db0 f29044T;

    /* renamed from: com.yandex.mobile.ads.banner.b$a */
    class C12073a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: com.yandex.mobile.ads.banner.b$a$a */
        class C12074a implements Runnable {
            C12074a() {
            }

            public void run() {
                C12072b.this.m31193c(false);
            }
        }

        C12073a() {
        }

        public boolean onPreDraw() {
            C12072b.this.mo68677w();
            C12072b.this.f29208a.postDelayed(new C12074a(), 50);
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.banner.b$b */
    class C12075b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12078e f29047b;

        C12075b(C12078e eVar) {
            this.f29047b = eVar;
        }

        public void run() {
            C12080g A = C12072b.this.mo64353A();
            if (A != null && A.indexOfChild(this.f29047b) == -1) {
                RelativeLayout.LayoutParams a = C12850d4.m34987a(C12072b.this.f29209b, this.f29047b.mo64388k());
                C12072b.this.m31191b(A, this.f29047b);
                A.addView(this.f29047b, a);
                lo1.m38867a((View) this.f29047b, C12072b.this.f29041Q);
            }
        }
    }

    public C12072b(Context context, C12080g gVar, C12077d dVar, C15230y2 y2Var) {
        super(context, new C12076c(gVar), C12115n.BANNER, y2Var);
        this.f29035K = dVar;
        m31188a(gVar);
        dm1 dm1 = new dm1();
        this.f29037M = dm1;
        this.f29036L = new VideoController(dm1);
        this.f29038N = new C12719cb();
        xa0 xa0 = new xa0();
        this.f29039O = xa0;
        dVar.mo64378a((h41.C13275a) xa0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31189a(com.yandex.mobile.ads.banner.C12080g r16, com.yandex.mobile.ads.banner.C12078e r17) {
        /*
            r0 = r17
            int r1 = com.yandex.mobile.ads.impl.lo1.f36769b
            r1 = 1
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x003f
            r0.setDrawingCacheEnabled(r1)     // Catch:{ Exception -> 0x003f }
            r4 = 1065353216(0x3f800000, float:1.0)
            android.content.Context r5 = r17.getContext()     // Catch:{ Exception -> 0x003f }
            float r5 = com.yandex.mobile.ads.impl.lo1.m38862a((android.content.Context) r5)     // Catch:{ Exception -> 0x003f }
            float r4 = r4 / r5
            r5 = 1084227584(0x40a00000, float:5.0)
            float r4 = r4 / r5
            int r5 = r17.getWidth()     // Catch:{ Exception -> 0x003f }
            float r5 = (float) r5     // Catch:{ Exception -> 0x003f }
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x003f }
            int r6 = r17.getHeight()     // Catch:{ Exception -> 0x003f }
            float r6 = (float) r6     // Catch:{ Exception -> 0x003f }
            float r6 = r6 * r4
            int r4 = java.lang.Math.round(r6)     // Catch:{ Exception -> 0x003f }
            android.graphics.Bitmap r6 = r17.getDrawingCache()     // Catch:{ Exception -> 0x003f }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r6, r5, r4, r1)     // Catch:{ Exception -> 0x003f }
            r0.setDrawingCacheEnabled(r2)     // Catch:{ Exception -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            r5 = r4
            if (r5 != 0) goto L_0x0045
            goto L_0x00f0
        L_0x0045:
            int r4 = r5.getWidth()
            int r13 = r5.getHeight()
            int r14 = r4 * r13
            int[] r15 = new int[r14]
            r7 = 0
            r9 = 0
            r10 = 0
            r6 = r15
            r8 = r4
            r11 = r4
            r12 = r13
            r5.getPixels(r6, r7, r8, r9, r10, r11, r12)
            r5 = 0
            r6 = 0
        L_0x005d:
            if (r5 >= r13) goto L_0x0077
            r7 = 0
        L_0x0060:
            if (r7 >= r4) goto L_0x0074
            int r8 = r5 * r4
            int r8 = r8 + r7
            r8 = r15[r8]
            int r8 = android.graphics.Color.alpha(r8)
            r9 = 255(0xff, float:3.57E-43)
            if (r8 == r9) goto L_0x0071
            int r6 = r6 + 1
        L_0x0071:
            int r7 = r7 + 1
            goto L_0x0060
        L_0x0074:
            int r5 = r5 + 1
            goto L_0x005d
        L_0x0077:
            float r5 = (float) r6
            float r6 = (float) r14
            r7 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            if (r5 == 0) goto L_0x0088
            goto L_0x00f0
        L_0x0088:
            r3 = 3
            int[] r3 = new int[r3]
            r3 = {16, 16, 16} // fill-array
            java.lang.Class<int> r5 = int.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r5, r3)
            int[][][] r3 = (int[][][]) r3
            r5 = 0
        L_0x0097:
            r6 = 16
            if (r5 >= r13) goto L_0x00c5
            r7 = 0
        L_0x009c:
            if (r7 >= r4) goto L_0x00c2
            int r8 = r5 * r4
            int r8 = r8 + r7
            r8 = r15[r8]
            int r9 = android.graphics.Color.red(r8)
            int r9 = r9 / r6
            int r10 = android.graphics.Color.green(r8)
            int r10 = r10 / r6
            int r8 = android.graphics.Color.blue(r8)
            int r8 = r8 / r6
            r11 = r3[r9]
            r11 = r11[r10]
            r9 = r3[r9]
            r9 = r9[r10]
            r9 = r9[r8]
            int r9 = r9 + r1
            r11[r8] = r9
            int r7 = r7 + 1
            goto L_0x009c
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x0097
        L_0x00c5:
            r1 = 0
            r4 = 0
            r5 = 0
        L_0x00c8:
            if (r1 >= r6) goto L_0x00ec
            r7 = 0
        L_0x00cb:
            if (r7 >= r6) goto L_0x00e9
            r8 = 0
        L_0x00ce:
            if (r8 >= r6) goto L_0x00e6
            r9 = r3[r8]
            r9 = r9[r7]
            r9 = r9[r1]
            if (r9 <= r5) goto L_0x00e3
            int r4 = r8 * 16
            int r5 = r7 * 16
            int r10 = r1 * 16
            int r4 = android.graphics.Color.rgb(r4, r5, r10)
            r5 = r9
        L_0x00e3:
            int r8 = r8 + 1
            goto L_0x00ce
        L_0x00e6:
            int r7 = r7 + 1
            goto L_0x00cb
        L_0x00e9:
            int r1 = r1 + 1
            goto L_0x00c8
        L_0x00ec:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x00f0:
            int r1 = r3.intValue()
            r3 = r16
            r3.setBackgroundColor(r1)
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.banner.C12072b.m31189a(com.yandex.mobile.ads.banner.g, com.yandex.mobile.ads.banner.e):void");
    }

    /* renamed from: A */
    public C12080g mo64353A() {
        return this.f29040P;
    }

    /* renamed from: B */
    public VideoController mo64354B() {
        return this.f29036L;
    }

    public void onAdLoaded() {
        C12080g gVar;
        super.onAdLoaded();
        C12866db dbVar = this.f29043S;
        boolean z = false;
        if (dbVar != this.f29042R) {
            m31183a(this.f29209b, dbVar);
            this.f29043S = this.f29042R;
        }
        SizeInfo n = mo64592d().mo70108n();
        Context context = this.f29209b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (z81.m44504a(context)) {
            if (SizeInfo.C12090b.FLEXIBLE == (n == null ? null : n.mo64493d())) {
                z = true;
            }
        }
        if (z && (gVar = this.f29040P) != null) {
            gVar.getLayoutParams().height = -2;
        }
    }

    public void onLeftApplication() {
        this.f29035K.mo64382e();
    }

    public void onReturnedToApplication() {
        this.f29035K.mo64383f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo64368u() {
        C12080g gVar = this.f29040P;
        if (gVar != null) {
            return lo1.m38872c(gVar.findViewById(2));
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo64369y() {
        AdResponse g = mo64595g();
        SizeInfo D = g != null ? g.mo64413D() : null;
        if (D == null) {
            return false;
        }
        SizeInfo n = this.f29213f.mo70108n();
        if (n != null ? mo71191a(D, n) : false) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public void mo64370z() {
        m31183a(this.f29209b, this.f29043S, this.f29042R);
        mo64364c();
        C12072b.class.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m31193c(boolean z) {
        int childCount;
        C12080g gVar = this.f29040P;
        if (gVar != null && gVar.getChildCount() > 0 && (childCount = gVar.getChildCount() - (z ^ true ? 1 : 0)) > 0) {
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = gVar.getChildAt(i);
                if (childAt instanceof C12123r) {
                    arrayList.add((C12123r) childAt);
                }
            }
            gVar.removeViews(0, childCount);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C12123r) arrayList.get(i2)).mo64617d();
            }
            arrayList.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo64363b(SizeInfo sizeInfo) {
        return sizeInfo.mo64491c(this.f29209b) >= 0 && sizeInfo.mo64488a(this.f29209b) >= 0;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if ((r0 != 0 && (!(r0 == 1 || r0 == 3) || !r1)) != false) goto L_0x002c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m31191b(com.yandex.mobile.ads.banner.C12080g r6, com.yandex.mobile.ads.banner.C12078e r7) {
        /*
            r5 = this;
            com.yandex.mobile.ads.base.SizeInfo r0 = r7.mo64388k()
            android.content.Context r1 = r5.f29209b
            boolean r1 = com.yandex.mobile.ads.impl.z81.m44504a(r1)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            com.yandex.mobile.ads.base.SizeInfo$b r0 = r0.mo64493d()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0027
            if (r0 == r2) goto L_0x0023
            r4 = 3
            if (r0 == r4) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r2 == 0) goto L_0x003b
            android.os.Handler r0 = r5.f29208a
            com.yandex.mobile.ads.banner.-$$Lambda$b$Zr-jV9wvRAp08q0LXkb7mCq8bE4 r1 = new com.yandex.mobile.ads.banner.-$$Lambda$b$Zr-jV9wvRAp08q0LXkb7mCq8bE4
            r1.<init>(r7)
            r6 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r6)
            goto L_0x003e
        L_0x003b:
            r7.setVisibility(r3)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.banner.C12072b.m31191b(com.yandex.mobile.ads.banner.g, com.yandex.mobile.ads.banner.e):void");
    }

    /* renamed from: c */
    public void mo64364c() {
        super.mo64364c();
        this.f29035K.mo64376a((BannerAdEventListener) null);
        db0 db0 = this.f29044T;
        if (db0 != null) {
            db0.mo66544c();
        }
        this.f29044T = null;
        if (this.f29040P != null) {
            m31193c(true);
            this.f29040P.setVisibility(8);
            lo1.m38877f(this.f29040P);
            this.f29040P = null;
        }
    }

    /* renamed from: a */
    public void mo64360a(Object obj) {
        AdResponse adResponse = (AdResponse) obj;
        super.mo64358a((AdResponse<String>) adResponse);
        this.f29039O.mo70852a(adResponse);
        C12866db a = this.f29038N.mo66243a(adResponse).mo66793a(this);
        this.f29042R = a;
        a.mo66542a(this.f29209b, adResponse);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = r3.f29213f.mo70108n();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64356a(android.webkit.WebView r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002a
            com.yandex.mobile.ads.banner.e r4 = (com.yandex.mobile.ads.banner.C12078e) r4
            com.yandex.mobile.ads.banner.g r0 = r3.f29040P
            if (r0 == 0) goto L_0x002a
            com.yandex.mobile.ads.base.SizeInfo r0 = r4.mo64388k()
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.yandex.mobile.ads.impl.t1 r2 = r3.f29213f
            com.yandex.mobile.ads.base.SizeInfo r2 = r2.mo70108n()
            if (r2 == 0) goto L_0x001c
            boolean r0 = r3.mo71191a((com.yandex.mobile.ads.base.SizeInfo) r0, (com.yandex.mobile.ads.base.SizeInfo) r2)
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x002a
            com.yandex.mobile.ads.banner.g r0 = r3.f29040P
            r0.setVisibility(r1)
            r3.m31187a((com.yandex.mobile.ads.banner.C12078e) r4)
            r3.mo68673a((java.util.Map<java.lang.String, java.lang.String>) r5)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.banner.C12072b.mo64356a(android.webkit.WebView, java.util.Map):void");
    }

    /* renamed from: a */
    public void mo64359a(AdImpressionData adImpressionData) {
        this.f29035K.mo64380b(adImpressionData);
    }

    /* renamed from: a */
    public void mo64357a(BannerAdEventListener bannerAdEventListener) {
        mo64581a((C15224y1) this.f29035K);
        this.f29035K.mo64376a(bannerAdEventListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo64362a(int i) {
        C12080g gVar = this.f29040P;
        if (gVar != null) {
            return lo1.m38868a(gVar.findViewById(2), i);
        }
        return false;
    }

    /* renamed from: a */
    public void mo64358a(AdResponse<String> adResponse) {
        super.mo64358a(adResponse);
        this.f29039O.mo70852a(adResponse);
        C12866db a = this.f29038N.mo66243a(adResponse).mo66793a(this);
        this.f29042R = a;
        a.mo66542a(this.f29209b, adResponse);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64361a(String str, AdResponse<String> adResponse, SizeInfo sizeInfo) {
        cb0 a = mo64355a(adResponse, sizeInfo);
        boolean a2 = new zo0().mo71268a(str);
        db0 a3 = fb0.m35946a().mo66950a(a2).mo66655a(a, this, this.f29037M, mo68675t());
        this.f29044T = a3;
        a3.mo66543a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public cb0 mo64355a(AdResponse<String> adResponse, SizeInfo sizeInfo) {
        return new C12078e(this.f29209b, adResponse, this.f29213f, sizeInfo);
    }

    /* renamed from: a */
    private void m31188a(C12080g gVar) {
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setVisibility(8);
        gVar.setBackgroundColor(0);
        this.f29040P = gVar;
    }

    /* renamed from: a */
    private void m31187a(C12078e eVar) {
        this.f29208a.post(new C12075b(eVar));
    }

    /* renamed from: a */
    private void m31183a(Context context, C12866db... dbVarArr) {
        Iterator it = new HashSet(Arrays.asList(dbVarArr)).iterator();
        while (it.hasNext()) {
            C12866db dbVar = (C12866db) it.next();
            if (dbVar != null) {
                dbVar.mo66541a(context);
            }
        }
    }
}
