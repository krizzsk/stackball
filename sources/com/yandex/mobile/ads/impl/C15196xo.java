package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.mobile.ads.impl.l50;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.xo */
public final class C15196xo implements l50 {

    /* renamed from: a */
    private final DisplayMetrics f42646a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final View f42647b;

    /* renamed from: c */
    private final j50 f42648c;

    /* renamed from: d */
    private final C15066wo f42649d;

    /* renamed from: e */
    private final Paint f42650e = new Paint();

    /* renamed from: f */
    private final RectF f42651f = new RectF();

    /* renamed from: g */
    private final Path f42652g = new Path();

    /* renamed from: h */
    private final RectF f42653h = new RectF();

    /* renamed from: i */
    private final Path f42654i = new Path();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float[] f42655j;

    /* renamed from: k */
    private boolean f42656k;

    /* renamed from: l */
    private boolean f42657l;

    /* renamed from: m */
    private final List<C15055wl> f42658m = new ArrayList();

    /* renamed from: com.yandex.mobile.ads.impl.xo$a */
    public /* synthetic */ class C15197a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42659a;

        static {
            int[] iArr = new int[C13794kx.values().length];
            C13794kx kxVar = C13794kx.DP;
            iArr[0] = 1;
            C13794kx kxVar2 = C13794kx.SP;
            iArr[1] = 2;
            f42659a = iArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xo$b */
    static final class C15198b extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ C15196xo f42660b;

        /* renamed from: c */
        final /* synthetic */ C15066wo f42661c;

        /* renamed from: d */
        final /* synthetic */ j50 f42662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15198b(C15196xo xoVar, C15066wo woVar, j50 j50) {
            super(1);
            this.f42660b = xoVar;
            this.f42661c = woVar;
            this.f42662d = j50;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "$noName_0");
            this.f42660b.m44082a(this.f42661c, this.f42662d);
            this.f42660b.f42647b.invalidate();
            return Unit.INSTANCE;
        }
    }

    public C15196xo(DisplayMetrics displayMetrics, View view, j50 j50, C15066wo woVar) {
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(j50, "expressionResolver");
        Intrinsics.checkNotNullParameter(woVar, "border");
        this.f42646a = displayMetrics;
        this.f42647b = view;
        this.f42648c = j50;
        this.f42649d = woVar;
        m44081a(j50, woVar);
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0) {
            mo70927a(width, height);
        }
    }

    /* renamed from: c */
    private final void m44086c() {
        float[] fArr = this.f42655j;
        float[] fArr2 = fArr == null ? null : (float[]) fArr.clone();
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i = 0; i < length; i++) {
                fArr2[i] = m44078a(fArr2[i], this.f42651f.width(), this.f42651f.height());
            }
            this.f42652g.addRoundRect(this.f42651f, (float[]) fArr2.clone(), Path.Direction.CW);
            this.f42652g.close();
            if (this.f42657l) {
                float a = ((float) m44080a(this.f42649d.f42076e)) / 2.0f;
                int length2 = fArr2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr2[i2] = Math.max(0.0f, fArr2[i2] - a);
                }
                this.f42654i.addRoundRect(this.f42653h, fArr2, Path.Direction.CW);
                this.f42654i.close();
            }
        }
    }

    /* renamed from: e */
    private final boolean m44087e() {
        return this.f42656k || this.f42657l || cf1.m34707a(this.f42647b);
    }

    /* renamed from: a */
    public /* synthetic */ void mo65870a(C15055wl wlVar) {
        l50.CC.$default$a(this, wlVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo65871b() {
        l50.CC.$default$b(this);
    }

    /* renamed from: d */
    public final C15066wo mo70930d() {
        return this.f42649d;
    }

    public /* synthetic */ void release() {
        l50.CC.$default$release(this);
    }

    /* renamed from: b */
    public final void mo70929b(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f42657l) {
            if (this.f42652g.isEmpty()) {
                m44086c();
            }
            canvas.drawPath(this.f42654i, this.f42650e);
        }
    }

    /* renamed from: a */
    public List<C15055wl> mo65869a() {
        return this.f42658m;
    }

    /* renamed from: a */
    private final void m44081a(j50 j50, C15066wo woVar) {
        f50<C13794kx> f50;
        f50<Integer> f502;
        f50<Integer> f503;
        f50<Integer> f504;
        f50<Integer> f505;
        f50<Integer> f506;
        f50<Integer> f507;
        m44082a(woVar, j50);
        C15198b bVar = new C15198b(this, woVar, j50);
        f50<Integer> f508 = woVar.f42072a;
        C15055wl wlVar = null;
        C15055wl a = f508 == null ? null : f508.mo66923a(j50, bVar);
        if (a == null) {
            a = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(a, "border.cornerRadius?.obs…lback) ?: Disposable.NULL");
        mo65870a(a);
        C13873lq lqVar = woVar.f42073b;
        C15055wl a2 = (lqVar == null || (f507 = lqVar.f36788c) == null) ? null : f507.mo66923a(j50, bVar);
        if (a2 == null) {
            a2 = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(a2, "border.cornersRadius?.to…lback) ?: Disposable.NULL");
        mo65870a(a2);
        C13873lq lqVar2 = woVar.f42073b;
        C15055wl a3 = (lqVar2 == null || (f506 = lqVar2.f36789d) == null) ? null : f506.mo66923a(j50, bVar);
        if (a3 == null) {
            a3 = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(a3, "border.cornersRadius?.to…lback) ?: Disposable.NULL");
        mo65870a(a3);
        C13873lq lqVar3 = woVar.f42073b;
        C15055wl a4 = (lqVar3 == null || (f505 = lqVar3.f36787b) == null) ? null : f505.mo66923a(j50, bVar);
        if (a4 == null) {
            a4 = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(a4, "border.cornersRadius?.bo…lback) ?: Disposable.NULL");
        mo65870a(a4);
        C13873lq lqVar4 = woVar.f42073b;
        C15055wl a5 = (lqVar4 == null || (f504 = lqVar4.f36786a) == null) ? null : f504.mo66923a(j50, bVar);
        if (a5 == null) {
            a5 = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(a5, "border.cornersRadius?.bo…lback) ?: Disposable.NULL");
        mo65870a(a5);
        mo65870a(woVar.f42074c.mo66923a(j50, bVar));
        C15405zy zyVar = woVar.f42076e;
        C15055wl a6 = (zyVar == null || (f503 = zyVar.f43503a) == null) ? null : f503.mo66923a(j50, bVar);
        if (a6 == null) {
            a6 = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(a6, "border.stroke?.color?.ob…lback) ?: Disposable.NULL");
        mo65870a(a6);
        C15405zy zyVar2 = woVar.f42076e;
        C15055wl a7 = (zyVar2 == null || (f502 = zyVar2.f43505c) == null) ? null : f502.mo66923a(j50, bVar);
        if (a7 == null) {
            a7 = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(a7, "border.stroke?.width?.ob…lback) ?: Disposable.NULL");
        mo65870a(a7);
        C15405zy zyVar3 = woVar.f42076e;
        if (!(zyVar3 == null || (f50 = zyVar3.f43504b) == null)) {
            wlVar = f50.mo66923a(j50, bVar);
        }
        if (wlVar == null) {
            wlVar = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(wlVar, "border.stroke?.unit?.obs…lback) ?: Disposable.NULL");
        mo65870a(wlVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m44082a(C15066wo woVar, j50 j50) {
        boolean z;
        f50<Integer> f50;
        Integer a;
        float a2 = (float) m44080a(woVar.f42076e);
        this.f42657l = a2 > 0.0f;
        this.f42650e.setStrokeWidth(a2);
        Paint paint = this.f42650e;
        C15405zy zyVar = woVar.f42076e;
        paint.setColor((zyVar == null || (f50 = zyVar.f43503a) == null || (a = f50.mo66924a(this.f42648c)) == null) ? 0 : a.intValue());
        this.f42650e.setStyle(Paint.Style.STROKE);
        this.f42650e.setAntiAlias(true);
        DisplayMetrics displayMetrics = this.f42646a;
        Intrinsics.checkNotNullParameter(displayMetrics, "metrics");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        C13873lq lqVar = woVar.f42073b;
        Integer num = null;
        f50<Integer> f502 = lqVar == null ? null : lqVar.f36788c;
        if (f502 == null) {
            f502 = woVar.f42072a;
        }
        float a3 = (float) C14175ob.m40330a(f502 == null ? null : f502.mo66924a(j50), displayMetrics);
        C13873lq lqVar2 = woVar.f42073b;
        f50<Integer> f503 = lqVar2 == null ? null : lqVar2.f36789d;
        if (f503 == null) {
            f503 = woVar.f42072a;
        }
        float a4 = (float) C14175ob.m40330a(f503 == null ? null : f503.mo66924a(j50), displayMetrics);
        C13873lq lqVar3 = woVar.f42073b;
        f50<Integer> f504 = lqVar3 == null ? null : lqVar3.f36786a;
        if (f504 == null) {
            f504 = woVar.f42072a;
        }
        float a5 = (float) C14175ob.m40330a(f504 == null ? null : f504.mo66924a(j50), displayMetrics);
        C13873lq lqVar4 = woVar.f42073b;
        f50<Integer> f505 = lqVar4 == null ? null : lqVar4.f36787b;
        if (f505 == null) {
            f505 = woVar.f42072a;
        }
        if (f505 != null) {
            num = f505.mo66924a(j50);
        }
        float a6 = (float) C14175ob.m40330a(num, displayMetrics);
        float[] fArr = {a3, a3, a4, a4, a6, a6, a5, a5};
        this.f42655j = fArr;
        float first = ArraysKt.first(fArr);
        int i = 0;
        while (true) {
            if (i >= 8) {
                z = true;
                break;
            }
            float f = fArr[i];
            i++;
            if (!Float.valueOf(f).equals(Float.valueOf(first))) {
                z = false;
                break;
            }
        }
        this.f42656k = !z;
        this.f42654i.reset();
        this.f42652g.reset();
        if (m44087e()) {
            this.f42647b.setClipToOutline(false);
            return;
        }
        this.f42647b.setOutlineProvider(new C15260yo(this));
        this.f42647b.setClipToOutline(true);
    }

    /* renamed from: a */
    public final void mo70927a(int i, int i2) {
        float a = ((float) m44080a(this.f42649d.f42076e)) / 2.0f;
        float f = (float) i;
        float f2 = (float) i2;
        this.f42653h.set(a, a, f - a, f2 - a);
        this.f42651f.set(0.0f, 0.0f, f, f2);
        this.f42654i.reset();
        this.f42652g.reset();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final float m44078a(float f, float f2, float f3) {
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        float min = Math.min(f3, f2) / ((float) 2);
        if (f > min) {
            ii0 ii0 = ii0.f34887a;
        }
        return Math.min(f, min);
    }

    /* renamed from: a */
    public final void mo70928a(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (m44087e()) {
            if (this.f42652g.isEmpty()) {
                m44086c();
            }
            canvas.clipPath(this.f42652g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0003, code lost:
        r0 = r3.f43504b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m44080a(com.yandex.mobile.ads.impl.C15405zy r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            goto L_0x0007
        L_0x0003:
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.kx> r0 = r3.f43504b
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = 0
            goto L_0x0011
        L_0x0009:
            com.yandex.mobile.ads.impl.j50 r1 = r2.f42648c
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            com.yandex.mobile.ads.impl.kx r0 = (com.yandex.mobile.ads.impl.C13794kx) r0
        L_0x0011:
            if (r0 != 0) goto L_0x0015
            r0 = -1
            goto L_0x001d
        L_0x0015:
            int[] r1 = com.yandex.mobile.ads.impl.C15196xo.C15197a.f42659a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x001d:
            r1 = 1
            if (r0 == r1) goto L_0x004d
            r1 = 2
            if (r0 == r1) goto L_0x003c
            if (r3 != 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r3 = r3.f43505c
            if (r3 != 0) goto L_0x002b
            goto L_0x0035
        L_0x002b:
            com.yandex.mobile.ads.impl.j50 r0 = r2.f42648c
            java.lang.Object r3 = r3.mo66924a((com.yandex.mobile.ads.impl.j50) r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x005d
        L_0x0037:
            int r3 = r3.intValue()
            goto L_0x005d
        L_0x003c:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r3 = r3.f43505c
            com.yandex.mobile.ads.impl.j50 r0 = r2.f42648c
            java.lang.Object r3 = r3.mo66924a((com.yandex.mobile.ads.impl.j50) r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            android.util.DisplayMetrics r0 = r2.f42646a
            int r3 = com.yandex.mobile.ads.impl.C14175ob.m40349c(r3, r0)
            goto L_0x005d
        L_0x004d:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r3 = r3.f43505c
            com.yandex.mobile.ads.impl.j50 r0 = r2.f42648c
            java.lang.Object r3 = r3.mo66924a((com.yandex.mobile.ads.impl.j50) r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            android.util.DisplayMetrics r0 = r2.f42646a
            int r3 = com.yandex.mobile.ads.impl.C14175ob.m40330a((java.lang.Integer) r3, (android.util.DisplayMetrics) r0)
        L_0x005d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15196xo.m44080a(com.yandex.mobile.ads.impl.zy):int");
    }
}
