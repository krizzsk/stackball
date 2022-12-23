package com.mbridge.msdk.p161c;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6198h;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6156n;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.reward.adapter.C6758b;
import com.mbridge.msdk.reward.adapter.C6779d;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.mbridge.msdk.c.a */
/* compiled from: LoopTimer */
public final class C6090a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f15009a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f15010b;

    /* renamed from: c */
    private LinkedList<C6198h> f15011c;

    /* renamed from: d */
    private LinkedList<C6198h> f15012d;

    /* renamed from: e */
    private int f15013e;

    /* renamed from: f */
    private int f15014f;

    /* renamed from: g */
    private C6143d f15015g;

    /* renamed from: h */
    private C7176a f15016h;

    /* renamed from: i */
    private C6156n f15017i;

    /* renamed from: j */
    private C6148f f15018j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f15019k;

    /* renamed from: com.mbridge.msdk.c.a$a */
    /* compiled from: LoopTimer */
    static class C6093a {

        /* renamed from: a */
        static C6090a f15023a = new C6090a();
    }

    private C6090a() {
        this.f15010b = false;
        this.f15011c = new LinkedList<>();
        this.f15012d = new LinkedList<>();
        this.f15013e = 0;
        this.f15014f = 0;
        this.f15019k = new Handler() {
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r5) {
                /*
                    r4 = this;
                    com.mbridge.msdk.c.a r0 = com.mbridge.msdk.p161c.C6090a.this
                    monitor-enter(r0)
                    int r5 = r5.what     // Catch:{ all -> 0x0036 }
                    r1 = 1
                    if (r5 == r1) goto L_0x0012
                    r1 = 2
                    if (r5 == r1) goto L_0x000c
                    goto L_0x0034
                L_0x000c:
                    com.mbridge.msdk.c.a r5 = com.mbridge.msdk.p161c.C6090a.this     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.p161c.C6090a.m15173c(r5)     // Catch:{ all -> 0x0036 }
                    goto L_0x0034
                L_0x0012:
                    com.mbridge.msdk.c.a r5 = com.mbridge.msdk.p161c.C6090a.this     // Catch:{ all -> 0x0036 }
                    boolean r5 = r5.f15010b     // Catch:{ all -> 0x0036 }
                    if (r5 == 0) goto L_0x001c
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    return
                L_0x001c:
                    com.mbridge.msdk.c.a r5 = com.mbridge.msdk.p161c.C6090a.this     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.c.a r2 = com.mbridge.msdk.p161c.C6090a.this     // Catch:{ all -> 0x0036 }
                    long r2 = r2.f15009a     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.p161c.C6090a.m15168a((com.mbridge.msdk.p161c.C6090a) r5, (long) r2)     // Catch:{ all -> 0x0036 }
                    android.os.Message r5 = r4.obtainMessage(r1)     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.c.a r1 = com.mbridge.msdk.p161c.C6090a.this     // Catch:{ all -> 0x0036 }
                    long r1 = r1.f15009a     // Catch:{ all -> 0x0036 }
                    r4.sendMessageDelayed(r5, r1)     // Catch:{ all -> 0x0036 }
                L_0x0034:
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    return
                L_0x0036:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p161c.C6090a.C60911.handleMessage(android.os.Message):void");
            }
        };
    }

    /* renamed from: a */
    private boolean m15171a(C6198h hVar) {
        boolean z = false;
        if (hVar == null || TextUtils.isEmpty(hVar.mo43656a())) {
            return false;
        }
        String a = hVar.mo43656a();
        try {
            if (this.f15015g != null) {
                long j = 0;
                if (this.f15016h != null) {
                    j = this.f15016h.mo49098d();
                }
                int a2 = this.f15015g.mo42952a(a, j);
                if (a2 != -1) {
                    if (a2 != 1) {
                    }
                } else if (!TextUtils.isEmpty(a)) {
                    if (this.f15011c != null && this.f15011c.contains(a)) {
                        this.f15011c.remove(a);
                    } else if (this.f15012d != null && this.f15012d.contains(a)) {
                        this.f15012d.remove(a);
                    }
                    if (this.f15017i != null) {
                        this.f15017i.mo43029a(a);
                    }
                }
                try {
                    this.f15019k.sendMessage(this.f15019k.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z = true;
            C6361q.m16155a("LoopTimer", th.getMessage(), th);
            return z;
        }
    }

    /* renamed from: a */
    private void m15169a(String str, String str2, boolean z) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (d != null) {
                final C6779d dVar = new C6779d(d, str, str2);
                dVar.mo47045b(z);
                dVar.mo47014a((C6758b) new C6758b() {
                    /* renamed from: a */
                    public final void mo42804a() {
                    }

                    /* renamed from: a */
                    public final void mo42805a(String str) {
                        C6090a.this.f15019k.sendMessage(C6090a.this.f15019k.obtainMessage(2));
                        dVar.mo47014a((C6758b) null);
                    }

                    /* renamed from: b */
                    public final void mo42806b(String str) {
                        C6090a.this.f15019k.sendMessage(C6090a.this.f15019k.obtainMessage(2));
                        dVar.mo47014a((C6758b) null);
                    }
                });
                dVar.mo47037a(1, 8000, false);
            }
        } catch (Exception e) {
            C6361q.m16155a("LoopTimer", e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public final void mo42801a(String str, String str2) {
        if (!this.f15011c.contains(str2)) {
            this.f15011c.add(new C6198h(str, str2, 94));
            C6156n nVar = this.f15017i;
            if (nVar != null) {
                nVar.mo43030a(str, str2, 94);
            }
        }
    }

    /* renamed from: b */
    public final void mo42802b(String str, String str2) {
        if (!this.f15012d.contains(str2)) {
            this.f15012d.add(new C6198h(str, str2, 287));
            C6156n nVar = this.f15017i;
            if (nVar != null) {
                nVar.mo43030a(str, str2, 287);
            }
        }
    }

    /* renamed from: a */
    public final void mo42800a(long j) {
        if (this.f15018j == null) {
            this.f15018j = C6148f.m15420a(C6122a.m15302b().mo42895d());
        }
        if (this.f15017i == null) {
            this.f15017i = C6156n.m15462a((C6146e) this.f15018j);
        }
        List<C6198h> a = this.f15017i.mo43028a(287);
        if (a != null) {
            this.f15012d.addAll(a);
            for (C6198h next : a) {
                mo42802b(next.mo43657b(), next.mo43656a());
            }
        }
        List<C6198h> a2 = this.f15017i.mo43028a(94);
        if (a2 != null) {
            this.f15011c.addAll(a2);
            for (C6198h next2 : a2) {
                mo42801a(next2.mo43657b(), next2.mo43656a());
            }
        }
        if (this.f15015g == null) {
            this.f15015g = C6143d.m15367a((C6146e) this.f15018j);
        }
        if (this.f15016h == null) {
            this.f15016h = C7177b.m18135a().mo49112b();
        }
        this.f15009a = j;
        this.f15010b = false;
        Handler handler = this.f15019k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f15009a);
    }

    /* renamed from: a */
    static /* synthetic */ void m15168a(C6090a aVar, long j) {
        LinkedList<C6198h> linkedList = aVar.f15011c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.f15013e == 0 || aVar.f15011c.size() <= aVar.f15013e) {
            LinkedList<C6198h> linkedList2 = aVar.f15012d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f15014f == 0 || aVar.f15012d.size() == aVar.f15014f) {
                aVar.f15014f = 0;
                aVar.f15013e = 0;
                Handler handler = aVar.f15019k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m15173c(C6090a aVar) {
        try {
            if (aVar.f15011c != null && aVar.f15011c.size() > 0 && aVar.f15013e < aVar.f15011c.size()) {
                C6198h hVar = aVar.f15011c.get(aVar.f15013e);
                aVar.f15013e++;
                if (aVar.m15171a(hVar)) {
                    aVar.m15169a(hVar.mo43657b(), hVar.mo43656a(), false);
                }
            } else if (aVar.f15012d != null && aVar.f15012d.size() > 0 && aVar.f15014f < aVar.f15012d.size()) {
                C6198h hVar2 = aVar.f15012d.get(aVar.f15014f);
                aVar.f15014f++;
                if (aVar.m15171a(hVar2)) {
                    aVar.m15169a(hVar2.mo43657b(), hVar2.mo43656a(), true);
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("LoopTimer", th.getMessage(), th);
        }
    }
}
