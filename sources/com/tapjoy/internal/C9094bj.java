package com.tapjoy.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.tapjoy.internal.bj */
public final class C9094bj {

    /* renamed from: a */
    public static final C9093bi f22384a = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            Point point = new Point();
            bnVar.mo57868h();
            while (bnVar.mo57870j()) {
                String l = bnVar.mo57872l();
                if ("x".equals(l)) {
                    point.x = bnVar.mo57878r();
                } else if ("y".equals(l)) {
                    point.y = bnVar.mo57878r();
                } else {
                    bnVar.mo57879s();
                }
            }
            bnVar.mo57869i();
            return point;
        }
    };

    /* renamed from: b */
    public static final C9093bi f22385b = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            Rect rect = new Rect();
            int i = C90973.f22386a[bnVar.mo57871k().ordinal()];
            if (i == 1) {
                bnVar.mo57866f();
                rect.left = bnVar.mo57878r();
                rect.top = bnVar.mo57878r();
                rect.right = bnVar.mo57878r();
                rect.bottom = bnVar.mo57878r();
                while (bnVar.mo57870j()) {
                    bnVar.mo57879s();
                }
                bnVar.mo57867g();
            } else if (i == 2) {
                bnVar.mo57868h();
                while (bnVar.mo57870j()) {
                    String l = bnVar.mo57872l();
                    if ("left".equals(l)) {
                        rect.left = bnVar.mo57878r();
                    } else if ("top".equals(l)) {
                        rect.top = bnVar.mo57878r();
                    } else if ("right".equals(l)) {
                        rect.right = bnVar.mo57878r();
                    } else if (TJAdUnitConstants.String.BOTTOM.equals(l)) {
                        rect.bottom = bnVar.mo57878r();
                    } else {
                        bnVar.mo57879s();
                    }
                }
                bnVar.mo57869i();
            } else {
                throw new IllegalStateException("Unexpected token: " + bnVar.mo57871k());
            }
            return rect;
        }
    };

    /* renamed from: com.tapjoy.internal.bj$3 */
    static /* synthetic */ class C90973 {

        /* renamed from: a */
        static final /* synthetic */ int[] f22386a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tapjoy.internal.bs[] r0 = com.tapjoy.internal.C9110bs.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22386a = r0
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22386a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9094bj.C90973.<clinit>():void");
        }
    }
}
