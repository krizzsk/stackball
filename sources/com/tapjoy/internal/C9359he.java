package com.tapjoy.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.WindowManager;
import com.tapjoy.TJContentActivity;

/* renamed from: com.tapjoy.internal.he */
public class C9359he extends C9365hg {

    /* renamed from: h */
    private static final String f23161h = C9359he.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static C9359he f23162i;

    /* renamed from: a */
    final String f23163a;

    /* renamed from: b */
    final C9390hu f23164b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C9344gz f23165j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9119c f23166k;

    /* renamed from: l */
    private boolean f23167l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f23168m;

    /* renamed from: n */
    private Context f23169n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f23170o = false;

    /* renamed from: a */
    public static void m25149a() {
        C9359he heVar = f23162i;
        if (heVar != null) {
            heVar.m25159e();
        }
    }

    public C9359he(C9344gz gzVar, String str, C9390hu huVar, Context context) {
        this.f23165j = gzVar;
        this.f23163a = str;
        this.f23164b = huVar;
        this.f23169n = context;
    }

    /* renamed from: b */
    public final void mo58224b() {
        C9390hu huVar = this.f23164b;
        if (huVar.f23274a != null) {
            huVar.f23274a.mo58330b();
        }
        if (huVar.f23275b != null) {
            huVar.f23275b.mo58330b();
        }
        huVar.f23276c.mo58330b();
        if (huVar.f23278e != null) {
            huVar.f23278e.mo58330b();
        }
        if (huVar.f23279f != null) {
            huVar.f23279f.mo58330b();
        }
        if (huVar.f23286m != null && huVar.f23286m.f23288a != null) {
            huVar.f23286m.f23288a.mo58330b();
        }
    }

    /* renamed from: c */
    public final boolean mo58225c() {
        C9390hu huVar = this.f23164b;
        if (huVar.f23276c == null || huVar.f23276c.f23297b == null) {
            return false;
        }
        if (huVar.f23286m != null && huVar.f23286m.f23288a != null && huVar.f23286m.f23288a.f23297b == null) {
            return false;
        }
        if (huVar.f23275b == null || huVar.f23279f == null || huVar.f23275b.f23297b == null || huVar.f23279f.f23297b == null) {
            return (huVar.f23274a == null || huVar.f23278e == null || huVar.f23274a.f23297b == null || huVar.f23278e.f23297b == null) ? false : true;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo58223a(final C9347ha haVar, final C9293fw fwVar) {
        Activity a = C9051a.m24280a(this.f23169n);
        if (a != null && !a.isFinishing()) {
            try {
                m25150a(a, haVar, fwVar);
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity a2 = C9330gr.m25022a();
        try {
            TJContentActivity.start(C9344gz.m25060a().f23115e, new TJContentActivity.AbstractContentProducer() {
                public final void show(Activity activity) {
                    try {
                        C9359he.this.m25150a(activity, haVar, fwVar);
                    } catch (WindowManager.BadTokenException unused) {
                        C9340gw.m25049b("Failed to show the content for \"{}\" caused by invalid activity", C9359he.this.f23163a);
                        haVar.mo57312a(C9359he.this.f23163a, C9359he.this.f23185f, (C9324gl) null);
                    }
                }

                public final void dismiss(Activity activity) {
                    C9359he.this.m25159e();
                }
            }, (a2 == null || (a2.getWindow().getAttributes().flags & 1024) == 0) ? false : true);
        } catch (ActivityNotFoundException unused2) {
            if (a2 != null && !a2.isFinishing()) {
                try {
                    m25150a(a2, haVar, fwVar);
                    return;
                } catch (WindowManager.BadTokenException unused3) {
                    C9340gw.m25049b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f23163a);
                    haVar.mo57312a(this.f23163a, this.f23185f, (C9324gl) null);
                }
            }
            C9340gw.m25049b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f23163a);
            haVar.mo57312a(this.f23163a, this.f23185f, (C9324gl) null);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25150a(final android.app.Activity r13, final com.tapjoy.internal.C9347ha r14, com.tapjoy.internal.C9293fw r15) {
        /*
            r12 = this;
            boolean r0 = r12.f23167l
            if (r0 == 0) goto L_0x0013
            java.lang.String r13 = f23161h
            com.tapjoy.TapjoyErrorMessage r14 = new com.tapjoy.TapjoyErrorMessage
            com.tapjoy.TapjoyErrorMessage$ErrorType r15 = com.tapjoy.TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR
            java.lang.String r0 = "Content is already displayed"
            r14.<init>(r15, r0)
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r13, (com.tapjoy.TapjoyErrorMessage) r14)
            return
        L_0x0013:
            r0 = 1
            r12.f23167l = r0
            f23162i = r12
            com.tapjoy.internal.fq r1 = r15.f22972a
            r12.f23186g = r1
            com.tapjoy.internal.c r1 = new com.tapjoy.internal.c
            r1.<init>(r13)
            r12.f23166k = r1
            com.tapjoy.internal.he$2 r2 = new com.tapjoy.internal.he$2
            r2.<init>(r14)
            r1.setOnCancelListener(r2)
            com.tapjoy.internal.c r1 = r12.f23166k
            com.tapjoy.internal.he$3 r2 = new com.tapjoy.internal.he$3
            r2.<init>(r13, r14)
            r1.setOnDismissListener(r2)
            com.tapjoy.internal.c r1 = r12.f23166k
            r2 = 0
            r1.setCanceledOnTouchOutside(r2)
            com.tapjoy.internal.iq r1 = new com.tapjoy.internal.iq
            com.tapjoy.internal.hu r3 = r12.f23164b
            com.tapjoy.internal.he$4 r4 = new com.tapjoy.internal.he$4
            r4.<init>(r13, r14)
            r1.<init>(r13, r3, r4)
            com.tapjoy.internal.ip r3 = new com.tapjoy.internal.ip
            com.tapjoy.internal.hu r4 = r12.f23164b
            r3.<init>(r13, r4, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r13)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = 17
            r6 = -2
            r4.<init>(r6, r6, r5)
            r1.addView(r3, r4)
            com.tapjoy.internal.c r4 = r12.f23166k
            r4.setContentView(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x018a
            com.tapjoy.internal.c r1 = r12.f23166k
            android.view.Window r1 = r1.getWindow()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 16
            if (r4 != r5) goto L_0x0098
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "4.1.2"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0098
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            android.content.Context r5 = r1.getContext()
            java.lang.Boolean r5 = m25148a((android.content.Context) r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0093
            r1 = 0
            goto L_0x0099
        L_0x0093:
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r1.setFlags(r4, r4)
        L_0x0098:
            r1 = 1
        L_0x0099:
            if (r1 == 0) goto L_0x018a
            int r1 = com.tapjoy.internal.C9057ad.C9059a.f22322b
            com.tapjoy.internal.ae r4 = new com.tapjoy.internal.ae
            r4.<init>()
            int[] r5 = com.tapjoy.internal.C9057ad.C90581.f22320a
            int r1 = r1 - r0
            r1 = r5[r1]
            r5 = 1114636288(0x42700000, float:60.0)
            r6 = 1050253722(0x3e99999a, float:0.3)
            r7 = 1053609165(0x3ecccccd, float:0.4)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L_0x0151
            r9 = 2
            r10 = -1093874483(0xffffffffbecccccd, float:-0.4)
            r11 = -1032847360(0xffffffffc2700000, float:-60.0)
            if (r1 == r9) goto L_0x0122
            r2 = 3
            if (r1 == r2) goto L_0x00f3
            r2 = 4
            if (r1 == r2) goto L_0x00c3
            goto L_0x017f
        L_0x00c3:
            com.tapjoy.internal.ag r1 = new com.tapjoy.internal.ag
            r1.<init>()
            r1.f22337a = r0
            r1.f22338b = r5
            com.tapjoy.internal.af r0 = r1.mo57756a()
            com.tapjoy.internal.ae r0 = r4.mo57753a(r0)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r1.<init>(r7, r8, r7, r8)
            com.tapjoy.internal.ae r0 = r0.mo57753a(r1)
            com.tapjoy.internal.ah r1 = new com.tapjoy.internal.ah
            r1.<init>()
            com.tapjoy.internal.ah r1 = r1.mo57758a(r6)
            com.tapjoy.internal.ah r1 = r1.mo57759b(r10)
            android.view.animation.Animation r1 = r1.mo57757a()
            r0.mo57753a(r1)
            goto L_0x017f
        L_0x00f3:
            com.tapjoy.internal.ag r1 = new com.tapjoy.internal.ag
            r1.<init>()
            r1.f22337a = r0
            r1.f22338b = r11
            com.tapjoy.internal.af r0 = r1.mo57756a()
            com.tapjoy.internal.ae r0 = r4.mo57753a(r0)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r1.<init>(r7, r8, r7, r8)
            com.tapjoy.internal.ae r0 = r0.mo57753a(r1)
            com.tapjoy.internal.ah r1 = new com.tapjoy.internal.ah
            r1.<init>()
            com.tapjoy.internal.ah r1 = r1.mo57758a(r6)
            com.tapjoy.internal.ah r1 = r1.mo57759b(r8)
            android.view.animation.Animation r1 = r1.mo57757a()
            r0.mo57753a(r1)
            goto L_0x017f
        L_0x0122:
            com.tapjoy.internal.ag r0 = new com.tapjoy.internal.ag
            r0.<init>()
            r0.f22337a = r2
            r0.f22338b = r11
            com.tapjoy.internal.af r0 = r0.mo57756a()
            com.tapjoy.internal.ae r0 = r4.mo57753a(r0)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r1.<init>(r7, r8, r7, r8)
            com.tapjoy.internal.ae r0 = r0.mo57753a(r1)
            com.tapjoy.internal.ah r1 = new com.tapjoy.internal.ah
            r1.<init>()
            com.tapjoy.internal.ah r1 = r1.mo57758a(r10)
            com.tapjoy.internal.ah r1 = r1.mo57759b(r6)
            android.view.animation.Animation r1 = r1.mo57757a()
            r0.mo57753a(r1)
            goto L_0x017f
        L_0x0151:
            com.tapjoy.internal.ag r0 = new com.tapjoy.internal.ag
            r0.<init>()
            r0.f22337a = r2
            r0.f22338b = r5
            com.tapjoy.internal.af r0 = r0.mo57756a()
            com.tapjoy.internal.ae r0 = r4.mo57753a(r0)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r1.<init>(r7, r8, r7, r8)
            com.tapjoy.internal.ae r0 = r0.mo57753a(r1)
            com.tapjoy.internal.ah r1 = new com.tapjoy.internal.ah
            r1.<init>()
            com.tapjoy.internal.ah r1 = r1.mo57758a(r8)
            com.tapjoy.internal.ah r1 = r1.mo57759b(r6)
            android.view.animation.Animation r1 = r1.mo57757a()
            r0.mo57753a(r1)
        L_0x017f:
            com.tapjoy.internal.ad r0 = r4.mo57752b()
            android.view.animation.Animation r0 = r0.mo57751a()
            r3.startAnimation(r0)
        L_0x018a:
            com.tapjoy.internal.c r0 = r12.f23166k     // Catch:{ BadTokenException -> 0x01d0 }
            r0.show()     // Catch:{ BadTokenException -> 0x01d0 }
            com.tapjoy.internal.c r0 = r12.f23166k
            android.view.Window r0 = r0.getWindow()
            r1 = -1
            r0.setLayout(r1, r1)
            android.view.Window r13 = r13.getWindow()
            android.view.WindowManager$LayoutParams r13 = r13.getAttributes()
            int r13 = r13.flags
            r0 = 1024(0x400, float:1.435E-42)
            r13 = r13 & r0
            if (r13 == 0) goto L_0x01b1
            com.tapjoy.internal.c r13 = r12.f23166k
            android.view.Window r13 = r13.getWindow()
            r13.setFlags(r0, r0)
        L_0x01b1:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r12.f23168m = r0
            com.tapjoy.internal.gz r13 = r12.f23165j
            com.tapjoy.internal.hu r0 = r12.f23164b
            java.util.Map r0 = r0.f23284k
            r13.mo58242a((java.util.Map) r0)
            r15.mo58153a()
            com.tapjoy.internal.fq r13 = r12.f23186g
            if (r13 == 0) goto L_0x01ca
            r13.mo58149b()
        L_0x01ca:
            java.lang.String r13 = r12.f23163a
            r14.mo57314c(r13)
            return
        L_0x01d0:
            r13 = move-exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9359he.m25150a(android.app.Activity, com.tapjoy.internal.ha, com.tapjoy.internal.fw):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25159e() {
        C9119c cVar = this.f23166k;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: a */
    private static Boolean m25148a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            Object obj = bundle.get("tapjoy:hardwareAccelerated");
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
