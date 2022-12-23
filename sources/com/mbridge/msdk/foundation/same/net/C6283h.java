package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Process;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p176e.C6264a;
import com.mbridge.msdk.foundation.same.net.p176e.C6268c;
import com.mbridge.msdk.foundation.same.net.p177f.C6270a;
import com.mbridge.msdk.foundation.same.net.p177f.C6272c;
import com.mbridge.msdk.foundation.tools.C6361q;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.mbridge.msdk.foundation.same.net.h */
/* compiled from: NetworkDispatcher */
public class C6283h {

    /* renamed from: a */
    private static final String f15592a = C6283h.class.getSimpleName();

    /* renamed from: b */
    private C6264a f15593b = new C6268c();

    /* renamed from: c */
    private C6273g f15594c;

    /* renamed from: d */
    private C6243c f15595d;

    public C6283h(Context context, SSLSocketFactory sSLSocketFactory, C6243c cVar) {
        this.f15594c = new C6270a(this.f15593b, cVar);
        this.f15595d = cVar;
    }

    /* renamed from: a */
    public final void mo43863a(C6290i iVar) {
        Process.setThreadPriority(10);
        try {
            this.f15595d.mo43822c(iVar);
            if (iVar.mo43884c()) {
                iVar.mo43881a("network-discard-cancelled");
                this.f15595d.mo43821b(iVar);
                this.f15595d.mo43817a(iVar);
                return;
            }
            this.f15595d.mo43823d(iVar);
            this.f15595d.mo43820a((C6290i<?>) iVar, (C6293k<?>) iVar.mo43837a(this.f15594c.mo43851a(iVar)));
        } catch (C6240a e) {
            this.f15595d.mo43819a((C6290i<?>) iVar, e);
        } catch (Exception e2) {
            String str = f15592a;
            C6361q.m16158d(str, "Unhandled exception " + e2.getMessage());
            this.f15595d.mo43819a((C6290i<?>) iVar, new C6240a(4, (C6272c) null));
        }
    }
}
