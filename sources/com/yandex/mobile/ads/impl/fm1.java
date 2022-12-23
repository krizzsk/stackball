package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;

public final class fm1 {

    /* renamed from: a */
    private final WindowManager f33393a;

    /* renamed from: b */
    private final C13063b f33394b;

    /* renamed from: c */
    private final C13062a f33395c;

    /* renamed from: d */
    private long f33396d;

    /* renamed from: e */
    private long f33397e;

    /* renamed from: f */
    private long f33398f;

    /* renamed from: g */
    private long f33399g;

    /* renamed from: h */
    private long f33400h;

    /* renamed from: i */
    private boolean f33401i;

    /* renamed from: j */
    private long f33402j;

    /* renamed from: k */
    private long f33403k;

    /* renamed from: l */
    private long f33404l;

    /* renamed from: com.yandex.mobile.ads.impl.fm1$a */
    private final class C13062a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f33405a;

        public C13062a(DisplayManager displayManager) {
            this.f33405a = displayManager;
        }

        /* renamed from: a */
        public void mo67038a() {
            this.f33405a.registerDisplayListener(this, (Handler) null);
        }

        /* renamed from: b */
        public void mo67039b() {
            this.f33405a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                fm1.this.m36054c();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fm1$b */
    private static final class C13063b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        private static final C13063b f33407f = new C13063b();

        /* renamed from: b */
        public volatile long f33408b = -9223372036854775807L;

        /* renamed from: c */
        private final Handler f33409c;

        /* renamed from: d */
        private Choreographer f33410d;

        /* renamed from: e */
        private int f33411e;

        private C13063b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            handlerThread.start();
            Handler a = ih1.m37370a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f33409c = a;
            a.sendEmptyMessage(0);
        }

        /* renamed from: b */
        public static C13063b m36060b() {
            return f33407f;
        }

        /* renamed from: a */
        public void mo67043a() {
            this.f33409c.sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void mo67044c() {
            this.f33409c.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f33408b = j;
            this.f33410d.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f33410d = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f33411e + 1;
                this.f33411e = i2;
                if (i2 == 1) {
                    this.f33410d.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f33411e - 1;
                this.f33411e = i3;
                if (i3 == 0) {
                    this.f33410d.removeFrameCallback(this);
                    this.f33408b = -9223372036854775807L;
                }
                return true;
            }
        }
    }

    public fm1(Context context) {
        C13062a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f33393a = (WindowManager) context.getSystemService("window");
        } else {
            this.f33393a = null;
        }
        if (this.f33393a != null) {
            this.f33395c = ih1.f34858a >= 17 ? m36051a(context) : aVar;
            this.f33394b = C13063b.m36060b();
        } else {
            this.f33395c = null;
            this.f33394b = null;
        }
        this.f33396d = -9223372036854775807L;
        this.f33397e = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m36054c() {
        Display defaultDisplay = this.f33393a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f33396d = refreshRate;
            this.f33397e = (refreshRate * 80) / 100;
        }
    }

    /* renamed from: b */
    public void mo67037b() {
        this.f33401i = false;
        if (this.f33393a != null) {
            this.f33394b.mo67043a();
            C13062a aVar = this.f33395c;
            if (aVar != null) {
                aVar.mo67038a();
            }
            m36054c();
        }
    }

    /* renamed from: a */
    public void mo67036a() {
        if (this.f33393a != null) {
            C13062a aVar = this.f33395c;
            if (aVar != null) {
                aVar.mo67039b();
            }
            this.f33394b.mo67044c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo67035a(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f33401i
            if (r2 == 0) goto L_0x0042
            long r2 = r10.f33398f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r10.f33404l
            r4 = 1
            long r2 = r2 + r4
            r10.f33404l = r2
            long r2 = r10.f33400h
            r10.f33399g = r2
        L_0x0019:
            long r2 = r10.f33404l
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r10.f33403k
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.f33399g
            long r2 = r2 + r4
            boolean r4 = r10.m36053b(r2, r13)
            if (r4 == 0) goto L_0x0033
            r10.f33401i = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r10.f33402j
            long r4 = r4 + r2
            long r6 = r10.f33403k
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r10.m36053b(r0, r13)
            if (r2 == 0) goto L_0x0042
            r10.f33401i = r6
        L_0x0042:
            r4 = r13
            r2 = r0
        L_0x0044:
            boolean r6 = r10.f33401i
            if (r6 != 0) goto L_0x0053
            r10.f33403k = r0
            r10.f33402j = r13
            r13 = 0
            r10.f33404l = r13
            r13 = 1
            r10.f33401i = r13
        L_0x0053:
            r10.f33398f = r11
            r10.f33400h = r2
            com.yandex.mobile.ads.impl.fm1$b r11 = r10.f33394b
            if (r11 == 0) goto L_0x008e
            long r12 = r10.f33396d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0067
            goto L_0x008e
        L_0x0067:
            long r11 = r11.f33408b
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x006e
            return r4
        L_0x006e:
            long r13 = r10.f33396d
            long r0 = r4 - r11
            long r0 = r0 / r13
            long r0 = r0 * r13
            long r11 = r11 + r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x007d
            long r13 = r11 - r13
            goto L_0x0081
        L_0x007d:
            long r13 = r13 + r11
            r8 = r11
            r11 = r13
            r13 = r8
        L_0x0081:
            long r0 = r11 - r4
            long r4 = r4 - r13
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r11 = r13
        L_0x008a:
            long r13 = r10.f33397e
            long r11 = r11 - r13
            return r11
        L_0x008e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fm1.mo67035a(long, long):long");
    }

    /* renamed from: b */
    private boolean m36053b(long j, long j2) {
        return Math.abs((j2 - this.f33402j) - (j - this.f33403k)) > 20000000;
    }

    /* renamed from: a */
    private C13062a m36051a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C13062a(displayManager);
    }
}
