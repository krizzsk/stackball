package com.yandex.metrica.impl.p265ob;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Be */
public class C10135Be implements C10149C0<C10136a, C10459Le> {

    /* renamed from: a */
    public final C10459Le f24401a;

    /* renamed from: b */
    public final List<C10136a> f24402b;

    /* renamed from: com.yandex.metrica.impl.ob.Be$a */
    public static class C10136a {

        /* renamed from: a */
        public final String f24403a;

        /* renamed from: b */
        public final JSONObject f24404b;

        /* renamed from: c */
        public final C10202E0 f24405c;

        public C10136a(String str, JSONObject jSONObject, C10202E0 e0) {
            this.f24403a = str;
            this.f24404b = jSONObject;
            this.f24405c = e0;
        }

        public String toString() {
            return "Candidate{trackingId='" + this.f24403a + '\'' + ", additionalParams=" + this.f24404b + ", source=" + this.f24405c + '}';
        }
    }

    public C10135Be(C10459Le le, List<C10136a> list) {
        this.f24401a = le;
        this.f24402b = list;
    }

    /* renamed from: a */
    public List<C10136a> mo61111a() {
        return this.f24402b;
    }

    /* renamed from: b */
    public Object mo61112b() {
        return this.f24401a;
    }

    public String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f24401a + ", candidates=" + this.f24402b + '}';
    }
}
