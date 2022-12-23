package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1369c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.g */
public class C1499g<T> extends C1488b {

    /* renamed from: a */
    private String f3663a;

    /* renamed from: com.applovin.impl.sdk.network.g$a */
    public static class C1500a<T> extends C1488b.C1489a<T> {
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f3664n;

        public C1500a(C1469j jVar) {
            super(jVar);
            this.f3626h = false;
            this.f3627i = ((Integer) jVar.mo13088a(C1369c.f3056dp)).intValue();
            this.f3628j = ((Integer) jVar.mo13088a(C1369c.f3055do)).intValue();
            this.f3629k = ((Integer) jVar.mo13088a(C1369c.f3058dr)).intValue();
        }

        /* renamed from: b */
        public C1500a mo13199a(T t) {
            this.f3625g = t;
            return this;
        }

        /* renamed from: b */
        public C1500a mo13202a(JSONObject jSONObject) {
            this.f3624f = jSONObject;
            return this;
        }

        /* renamed from: b */
        public C1499g<T> mo13204a() {
            return new C1499g<>(this);
        }

        /* renamed from: c */
        public C1500a mo13201a(Map<String, String> map) {
            this.f3622d = map;
            return this;
        }

        /* renamed from: c */
        public C1500a mo13203a(boolean z) {
            this.f3630l = z;
            return this;
        }

        /* renamed from: d */
        public C1500a mo13198a(int i) {
            this.f3627i = i;
            return this;
        }

        /* renamed from: d */
        public C1500a mo13200a(String str) {
            this.f3620b = str;
            return this;
        }

        /* renamed from: d */
        public C1500a mo13207b(Map<String, String> map) {
            this.f3623e = map;
            return this;
        }

        /* renamed from: e */
        public C1500a mo13205b(int i) {
            this.f3628j = i;
            return this;
        }

        /* renamed from: e */
        public C1500a mo13210c(String str) {
            this.f3621c = str;
            return this;
        }

        /* renamed from: f */
        public C1500a mo13209c(int i) {
            this.f3629k = i;
            return this;
        }

        /* renamed from: f */
        public C1500a mo13206b(String str) {
            this.f3619a = str;
            return this;
        }

        /* renamed from: g */
        public C1500a mo13255g(String str) {
            this.f3664n = str;
            return this;
        }
    }

    protected C1499g(C1500a aVar) {
        super(aVar);
        this.f3663a = aVar.f3664n;
    }

    /* renamed from: b */
    public static C1500a m3280b(C1469j jVar) {
        return new C1500a(jVar);
    }

    /* renamed from: o */
    public boolean mo13241o() {
        return this.f3663a != null;
    }

    /* renamed from: p */
    public String mo13242p() {
        return this.f3663a;
    }
}
