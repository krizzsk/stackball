package com.fyber.inneractive.sdk.p050i;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3654j;
import com.fyber.inneractive.sdk.util.C3662m;

/* renamed from: com.fyber.inneractive.sdk.i.b */
public final class C2992b {

    /* renamed from: a */
    C3654j<Rect> f7279a;

    /* renamed from: b */
    final C3018e f7280b;

    /* renamed from: c */
    float f7281c = 0.0f;

    /* renamed from: d */
    int f7282d = 1;

    /* renamed from: e */
    float f7283e = 0.0f;

    /* renamed from: f */
    long f7284f = 0;

    /* renamed from: g */
    boolean f7285g = false;

    /* renamed from: h */
    boolean f7286h = false;

    /* renamed from: i */
    private final FrameLayout f7287i;

    /* renamed from: j */
    private final C2995a f7288j;

    /* renamed from: k */
    private final Runnable f7289k = new Runnable() {
        public final void run() {
            C2992b.this.mo18455d();
        }
    };

    /* renamed from: com.fyber.inneractive.sdk.i.b$a */
    interface C2995a {
        /* renamed from: a */
        void mo18458a();
    }

    public C2992b(C3018e eVar, FrameLayout frameLayout, C2995a aVar) {
        this.f7280b = eVar;
        this.f7287i = frameLayout;
        this.f7288j = aVar;
        this.f7279a = new C3654j<>(4, new C3654j.C3655a<Rect>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo18457a() {
                return new Rect();
            }
        });
    }

    /* renamed from: a */
    public final void mo18452a() {
        this.f7285g = false;
        C3662m.m9137a().removeCallbacks(this.f7289k);
    }

    /* renamed from: b */
    public final void mo18453b() {
        if (this.f7285g) {
            mo18452a();
        }
    }

    /* renamed from: c */
    public final void mo18454c() {
        if (!this.f7286h && !this.f7285g && this.f7284f != 0) {
            this.f7284f = 0;
            this.f7285g = true;
            mo18455d();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18455d() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "IAVisibilityTracker: onCheckVisibility"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            int r1 = r10.f7282d
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r2 = r10.f7279a
            java.lang.Object r2 = r2.mo19573a()
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.widget.FrameLayout r3 = r10.f7287i
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.isShown()
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.getGlobalVisibleRect(r2)
            if (r4 == 0) goto L_0x0048
            int r4 = r2.height()
            int r5 = r2.width()
            int r4 = r4 * r5
            float r4 = (float) r4
            int r5 = r3.getHeight()
            int r3 = r3.getWidth()
            int r5 = r5 * r3
            float r3 = (float) r5
            float r4 = r4 / r3
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r3 = r10.f7279a
            r3.mo19574a(r2)
            r10.f7281c = r4
            r2 = 0
            r5 = 1
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x006f
            float r4 = r10.f7283e
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r6
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f7284f
            long r6 = r6 - r8
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x006f
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006f
            r4 = 1
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r6[r0] = r7
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r6[r5] = r7
            java.lang.String r7 = "BannerVisibilityTracker | visible = %s, minVis = %f"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r6)
            if (r4 == 0) goto L_0x00a1
            boolean r4 = r10.f7285g
            if (r4 == 0) goto L_0x00a1
            com.fyber.inneractive.sdk.i.b$a r1 = r10.f7288j
            if (r1 == 0) goto L_0x00d2
            boolean r1 = r10.f7286h
            if (r1 != 0) goto L_0x00d2
            r10.f7286h = r5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "BannerVisibilityTracker | firing viewable"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r1, r0)
            com.fyber.inneractive.sdk.i.b$a r0 = r10.f7288j
            r0.mo18458a()
            return
        L_0x00a1:
            boolean r0 = r10.f7285g
            if (r0 == 0) goto L_0x00d2
            float r0 = r10.f7281c
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ae
            r10.f7284f = r2
            goto L_0x00be
        L_0x00ae:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00be
            long r0 = r10.f7284f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00be
            long r0 = java.lang.System.currentTimeMillis()
            r10.f7284f = r0
        L_0x00be:
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.C3662m.m9137a()
            java.lang.Runnable r1 = r10.f7289k
            r0.removeCallbacks(r1)
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.C3662m.m9137a()
            java.lang.Runnable r1 = r10.f7289k
            r2 = 50
            r0.postDelayed(r1, r2)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p050i.C2992b.mo18455d():void");
    }
}
