package com.mbridge.msdk.video.dynview.p227h.p229b;

import android.os.CountDownTimer;

/* renamed from: com.mbridge.msdk.video.dynview.h.b.b */
/* compiled from: MBCountDownTimer */
public final class C6973b {

    /* renamed from: a */
    private long f17180a = 0;

    /* renamed from: b */
    private long f17181b;

    /* renamed from: c */
    private C6972a f17182c;

    /* renamed from: d */
    private C6974a f17183d;

    /* renamed from: a */
    public final C6973b mo48492a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.f17181b = j;
        return this;
    }

    /* renamed from: a */
    public final C6973b mo48493a(C6972a aVar) {
        this.f17182c = aVar;
        return this;
    }

    /* renamed from: b */
    public final C6973b mo48495b(long j) {
        this.f17180a = j;
        return this;
    }

    /* renamed from: a */
    public final void mo48494a() {
        C6974a aVar = this.f17183d;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f17183d = null;
            }
            if (this.f17181b <= 0) {
                this.f17181b = this.f17180a + 1000;
            }
            C6974a aVar2 = new C6974a(this.f17180a, this.f17181b);
            this.f17183d = aVar2;
            aVar2.mo48497a(this.f17182c);
        }
        this.f17183d.start();
    }

    /* renamed from: b */
    public final void mo48496b() {
        C6974a aVar = this.f17183d;
        if (aVar != null) {
            aVar.cancel();
            this.f17183d = null;
        }
    }

    /* renamed from: com.mbridge.msdk.video.dynview.h.b.b$a */
    /* compiled from: MBCountDownTimer */
    private static class C6974a extends CountDownTimer {

        /* renamed from: a */
        private C6972a f17184a;

        public C6974a(long j, long j2) {
            super(j, j2);
        }

        public final void onTick(long j) {
            C6972a aVar = this.f17184a;
            if (aVar != null) {
                aVar.mo48491a(j);
            }
        }

        public final void onFinish() {
            C6972a aVar = this.f17184a;
            if (aVar != null) {
                aVar.mo48490a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo48497a(C6972a aVar) {
            this.f17184a = aVar;
        }
    }
}
