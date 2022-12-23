package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.dk */
public final class C12901dk implements C13325hj {

    /* renamed from: a */
    private final Context f32685a;

    /* renamed from: b */
    private final List<af1> f32686b = new ArrayList();

    /* renamed from: c */
    private final C13325hj f32687c;

    /* renamed from: d */
    private C13325hj f32688d;

    /* renamed from: e */
    private C13325hj f32689e;

    /* renamed from: f */
    private C13325hj f32690f;

    /* renamed from: g */
    private C13325hj f32691g;

    /* renamed from: h */
    private C13325hj f32692h;

    /* renamed from: i */
    private C13325hj f32693i;

    /* renamed from: j */
    private C13325hj f32694j;

    /* renamed from: k */
    private C13325hj f32695k;

    public C12901dk(Context context, C13325hj hjVar) {
        this.f32685a = context.getApplicationContext();
        this.f32687c = (C13325hj) C13479j9.m37703a(hjVar);
    }

    /* renamed from: a */
    public void mo65277a(af1 af1) {
        this.f32687c.mo65277a(af1);
        this.f32686b.add(af1);
        C13325hj hjVar = this.f32688d;
        if (hjVar != null) {
            hjVar.mo65277a(af1);
        }
        C13325hj hjVar2 = this.f32689e;
        if (hjVar2 != null) {
            hjVar2.mo65277a(af1);
        }
        C13325hj hjVar3 = this.f32690f;
        if (hjVar3 != null) {
            hjVar3.mo65277a(af1);
        }
        C13325hj hjVar4 = this.f32691g;
        if (hjVar4 != null) {
            hjVar4.mo65277a(af1);
        }
        C13325hj hjVar5 = this.f32692h;
        if (hjVar5 != null) {
            hjVar5.mo65277a(af1);
        }
        C13325hj hjVar6 = this.f32693i;
        if (hjVar6 != null) {
            hjVar6.mo65277a(af1);
        }
        C13325hj hjVar7 = this.f32694j;
        if (hjVar7 != null) {
            hjVar7.mo65277a(af1);
        }
    }

    /* renamed from: b */
    public Map<String, List<String>> mo65278b() {
        C13325hj hjVar = this.f32695k;
        return hjVar == null ? Collections.emptyMap() : hjVar.mo65278b();
    }

    public void close() throws IOException {
        C13325hj hjVar = this.f32695k;
        if (hjVar != null) {
            try {
                hjVar.close();
            } finally {
                this.f32695k = null;
            }
        }
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws IOException {
        boolean z = true;
        C13479j9.m37708b(this.f32695k == null);
        String scheme = jjVar.f35322a.getScheme();
        Uri uri = jjVar.f35322a;
        int i = ih1.f34858a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = jjVar.f35322a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f32688d == null) {
                    x60 x60 = new x60();
                    this.f32688d = x60;
                    m35358a((C13325hj) x60);
                }
                this.f32695k = this.f32688d;
            } else {
                if (this.f32689e == null) {
                    C14364q9 q9Var = new C14364q9(this.f32685a);
                    this.f32689e = q9Var;
                    m35358a((C13325hj) q9Var);
                }
                this.f32695k = this.f32689e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f32689e == null) {
                C14364q9 q9Var2 = new C14364q9(this.f32685a);
                this.f32689e = q9Var2;
                m35358a((C13325hj) q9Var2);
            }
            this.f32695k = this.f32689e;
        } else if ("content".equals(scheme)) {
            if (this.f32690f == null) {
                C14460rh rhVar = new C14460rh(this.f32685a);
                this.f32690f = rhVar;
                m35358a((C13325hj) rhVar);
            }
            this.f32695k = this.f32690f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f32691g == null) {
                try {
                    C13325hj hjVar = (C13325hj) Class.forName("com.yandex.mobile.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f32691g = hjVar;
                    m35358a(hjVar);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f32691g == null) {
                    this.f32691g = this.f32687c;
                }
            }
            this.f32695k = this.f32691g;
        } else if ("udp".equals(scheme)) {
            if (this.f32692h == null) {
                hg1 hg1 = new hg1(2000, 8000);
                this.f32692h = hg1;
                m35358a((C13325hj) hg1);
            }
            this.f32695k = this.f32692h;
        } else if ("data".equals(scheme)) {
            if (this.f32693i == null) {
                C13056fj fjVar = new C13056fj();
                this.f32693i = fjVar;
                m35358a((C13325hj) fjVar);
            }
            this.f32695k = this.f32693i;
        } else if ("rawresource".equals(scheme)) {
            if (this.f32694j == null) {
                p21 p21 = new p21(this.f32685a);
                this.f32694j = p21;
                m35358a((C13325hj) p21);
            }
            this.f32695k = this.f32694j;
        } else {
            this.f32695k = this.f32687c;
        }
        return this.f32695k.mo65275a(jjVar);
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws IOException {
        C13325hj hjVar = this.f32695k;
        hjVar.getClass();
        return hjVar.mo65274a(bArr, i, i2);
    }

    /* renamed from: a */
    public Uri mo65276a() {
        C13325hj hjVar = this.f32695k;
        if (hjVar == null) {
            return null;
        }
        return hjVar.mo65276a();
    }

    /* renamed from: a */
    private void m35358a(C13325hj hjVar) {
        for (int i = 0; i < this.f32686b.size(); i++) {
            hjVar.mo65277a(this.f32686b.get(i));
        }
    }
}
