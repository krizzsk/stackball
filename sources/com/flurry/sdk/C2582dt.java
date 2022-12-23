package com.flurry.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.dt */
public class C2582dt<ObjectType> implements C2587dw<ObjectType> {

    /* renamed from: a */
    protected final C2587dw<ObjectType> f6057a;

    public C2582dt(C2587dw<ObjectType> dwVar) {
        this.f6057a = dwVar;
    }

    /* renamed from: a */
    public void mo17563a(OutputStream outputStream, ObjectType objecttype) throws IOException {
        C2587dw<ObjectType> dwVar = this.f6057a;
        if (dwVar != null && outputStream != null && objecttype != null) {
            dwVar.mo17563a(outputStream, objecttype);
        }
    }

    /* renamed from: a */
    public ObjectType mo17562a(InputStream inputStream) throws IOException {
        C2587dw<ObjectType> dwVar = this.f6057a;
        if (dwVar == null || inputStream == null) {
            return null;
        }
        return dwVar.mo17562a(inputStream);
    }
}
