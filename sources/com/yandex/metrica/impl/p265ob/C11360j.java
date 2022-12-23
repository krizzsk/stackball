package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.billing_interface.C10068a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j */
public class C11360j implements C11727s {

    /* renamed from: a */
    private boolean f27139a;

    /* renamed from: b */
    private final C11800u f27140b;

    /* renamed from: c */
    private final Map<String, C10068a> f27141c = new HashMap();

    public C11360j(C11800u uVar) {
        C11901w3 w3Var = (C11901w3) uVar;
        for (C10068a next : w3Var.mo64007a()) {
            this.f27141c.put(next.f24200b, next);
        }
        this.f27139a = w3Var.mo64009b();
        this.f27140b = w3Var;
    }

    /* renamed from: a */
    public void mo63053a(Map<String, C10068a> map) {
        for (C10068a next : map.values()) {
            this.f27141c.put(next.f24200b, next);
        }
        ((C11901w3) this.f27140b).mo64008a(new ArrayList(this.f27141c.values()), this.f27139a);
    }

    /* renamed from: b */
    public void mo63055b() {
        if (!this.f27139a) {
            this.f27139a = true;
            ((C11901w3) this.f27140b).mo64008a(new ArrayList(this.f27141c.values()), this.f27139a);
        }
    }

    /* renamed from: a */
    public C10068a mo63052a(String str) {
        return this.f27141c.get(str);
    }

    /* renamed from: a */
    public boolean mo63054a() {
        return this.f27139a;
    }
}
