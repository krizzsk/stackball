package com.flurry.sdk;

import com.flurry.sdk.C2542dk;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.di */
public final class C2537di<RequestObjectType, ResponseObjectType> extends C2542dk {

    /* renamed from: a */
    public C2539a<RequestObjectType, ResponseObjectType> f5953a;

    /* renamed from: b */
    public RequestObjectType f5954b;

    /* renamed from: c */
    public C2587dw<RequestObjectType> f5955c;

    /* renamed from: d */
    public C2587dw<ResponseObjectType> f5956d;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public ResponseObjectType f5957v;

    /* renamed from: com.flurry.sdk.di$a */
    public interface C2539a<RequestObjectType, ResponseObjectType> {
        /* renamed from: a */
        void mo17574a(C2537di<RequestObjectType, ResponseObjectType> diVar, ResponseObjectType responseobjecttype);
    }

    /* renamed from: a */
    public final void mo17573a() {
        this.f5975l = new C2542dk.C2546b() {
            /* renamed from: a */
            public final void mo17754a(OutputStream outputStream) throws Exception {
                if (C2537di.this.f5954b != null && C2537di.this.f5955c != null) {
                    C2537di.this.f5955c.mo17563a(outputStream, C2537di.this.f5954b);
                }
            }

            /* renamed from: a */
            public final void mo17753a(C2542dk dkVar, InputStream inputStream) throws Exception {
                if (dkVar.mo17762d() && C2537di.this.f5956d != null) {
                    C2537di diVar = C2537di.this;
                    Object unused = diVar.f5957v = diVar.f5956d.mo17562a(inputStream);
                }
            }

            /* renamed from: a */
            public final void mo17752a() {
                C2537di.m5509d(C2537di.this);
            }
        };
        super.mo17573a();
    }

    /* renamed from: d */
    static /* synthetic */ void m5509d(C2537di diVar) {
        if (diVar.f5953a != null && !diVar.mo17765g()) {
            diVar.f5953a.mo17574a(diVar, diVar.f5957v);
        }
    }
}
