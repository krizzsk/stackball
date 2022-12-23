package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.p136c.C5519b;
import com.ironsource.sdk.service.C6051c;
import com.ironsource.sdk.service.C6055e;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.u */
public class C5920u {

    /* renamed from: a */
    static final String f14464a = C5920u.class.getSimpleName();

    /* renamed from: b */
    C6055e f14465b;

    /* renamed from: c */
    C6051c f14466c;

    /* renamed from: d */
    Context f14467d;

    /* renamed from: e */
    private final String f14468e = "oneToken";

    /* renamed from: f */
    private C5519b f14469f;

    /* renamed from: com.ironsource.sdk.controller.u$a */
    static class C5921a {

        /* renamed from: a */
        String f14470a;

        /* renamed from: b */
        JSONObject f14471b;

        /* renamed from: c */
        String f14472c;

        /* renamed from: d */
        String f14473d;

        private C5921a() {
        }

        /* synthetic */ C5921a(byte b) {
            this();
        }
    }

    public C5920u(Context context, C6055e eVar) {
        this.f14465b = eVar;
        this.f14467d = context;
        this.f14466c = new C6051c();
        this.f14469f = new C5519b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo42333a() {
        JSONObject a = this.f14469f.mo41244a();
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a.get(next);
            if (obj instanceof String) {
                a.put(next, C5505a.C55061.m13070a((String) obj));
            }
        }
        return a;
    }
}
