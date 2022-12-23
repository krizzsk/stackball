package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.internal.C9288fs;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.fp */
public final class C9283fp extends C9334gt implements Observer {

    /* renamed from: b */
    private final Map f22956b = new HashMap();

    /* renamed from: c */
    private final C9271fi f22957c = new C9271fi();

    /* renamed from: d */
    private boolean f22958d;

    /* renamed from: e */
    private final C9297fz f22959e = new C9297fz() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo58144a(Object obj) {
            return "AppLaunch";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo58145a() {
            return super.mo58145a() && !C9369hk.m25184c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo58143a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            return TJPlacementManager.createPlacement(context, "AppLaunch", true, tJPlacementListener);
        }
    };

    /* renamed from: a */
    public static void m24892a() {
    }

    static {
        C9334gt.f23075a = new C9283fp();
    }

    private C9283fp() {
    }

    public final void update(Observable observable, Object obj) {
        C9288fs.C9289a aVar = C9288fs.f22968d;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r3 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r5.f22957c.mo58125a() != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r5.f22959e.mo58161c((java.lang.Object) null);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58141a(android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 == 0) goto L_0x0055
            int r1 = r6.getTaskId()
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            goto L_0x0053
        L_0x000c:
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L_0x0053
            java.util.Set r2 = r6.getCategories()
            if (r2 == 0) goto L_0x002e
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = r6.getAction()
            java.lang.String r4 = "android.intent.action.MAIN"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            goto L_0x0053
        L_0x0032:
            android.content.ComponentName r6 = r6.getComponent()
            if (r6 != 0) goto L_0x0039
            goto L_0x0053
        L_0x0039:
            java.lang.String r6 = r6.getClassName()
            java.util.Map r2 = r5.f22956b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r2.put(r6, r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0052
            int r6 = r6.intValue()
            if (r6 != r1) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = 1
        L_0x0053:
            if (r3 != 0) goto L_0x0061
        L_0x0055:
            boolean r6 = r5.f22958d
            if (r6 != 0) goto L_0x0067
            com.tapjoy.internal.fi r6 = r5.f22957c
            boolean r6 = r6.mo58125a()
            if (r6 == 0) goto L_0x0067
        L_0x0061:
            com.tapjoy.internal.fz r6 = r5.f22959e
            r1 = 0
            r6.mo58161c(r1)
        L_0x0067:
            r5.f22958d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9283fp.mo58141a(android.app.Activity):void");
    }
}
