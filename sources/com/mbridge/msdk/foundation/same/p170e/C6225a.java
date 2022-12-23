package com.mbridge.msdk.foundation.same.p170e;

/* renamed from: com.mbridge.msdk.foundation.same.e.a */
/* compiled from: CommonTask */
public abstract class C6225a implements Runnable {

    /* renamed from: b */
    public static long f15466b;

    /* renamed from: c */
    public C6226a f15467c = C6226a.READY;

    /* renamed from: d */
    public C6227b f15468d;

    /* renamed from: com.mbridge.msdk.foundation.same.e.a$a */
    /* compiled from: CommonTask */
    public enum C6226a {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    /* renamed from: com.mbridge.msdk.foundation.same.e.a$b */
    /* compiled from: CommonTask */
    public interface C6227b {
        /* renamed from: a */
        void mo42873a(C6226a aVar);
    }

    /* renamed from: a */
    public abstract void mo42876a();

    /* renamed from: b */
    public abstract void mo42877b();

    public final void run() {
        try {
            if (this.f15467c == C6226a.READY) {
                m15763a(C6226a.RUNNING);
                mo42876a();
                m15763a(C6226a.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public C6225a() {
        f15466b++;
    }

    /* renamed from: d */
    public final void mo43804d() {
        if (this.f15467c != C6226a.CANCEL) {
            m15763a(C6226a.CANCEL);
            mo42877b();
        }
    }

    /* renamed from: a */
    private void m15763a(C6226a aVar) {
        this.f15467c = aVar;
        C6227b bVar = this.f15468d;
        if (bVar != null) {
            bVar.mo42873a(aVar);
        }
    }
}
