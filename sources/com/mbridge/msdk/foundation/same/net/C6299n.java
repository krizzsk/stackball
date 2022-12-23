package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import com.mbridge.msdk.foundation.same.net.p175d.C6255b;

/* renamed from: com.mbridge.msdk.foundation.same.net.n */
/* compiled from: VolleyManager */
public final class C6299n {

    /* renamed from: c */
    private static C6299n f15643c;

    /* renamed from: a */
    private C6291j f15644a;

    /* renamed from: b */
    private C6255b f15645b;

    private C6299n() {
    }

    /* renamed from: a */
    public static void m15941a(Context context) {
        if (f15643c == null) {
            C6299n nVar = new C6299n();
            f15643c = nVar;
            nVar.f15644a = new C6291j(context.getApplicationContext());
            f15643c.f15645b = new C6255b(m15943b(), 3);
        }
    }

    /* renamed from: a */
    public static void m15942a(C6290i iVar) {
        m15943b().mo43894a(iVar);
    }

    /* renamed from: b */
    private static C6291j m15943b() {
        C6291j jVar = f15643c.f15644a;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("RequestQueue not initialized");
    }

    /* renamed from: a */
    public static C6255b m15940a() {
        C6255b bVar = f15643c.f15645b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("FileDownloader not initialized");
    }
}
