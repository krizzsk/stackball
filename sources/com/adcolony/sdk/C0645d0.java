package com.adcolony.sdk;

import com.adcolony.sdk.C0580a0;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.d0 */
class C0645d0 {

    /* renamed from: a */
    private String f355a;

    /* renamed from: b */
    private C0897z0 f356b;

    C0645d0(C0897z0 z0Var) {
        try {
            this.f356b = z0Var;
            this.f355a = z0Var.mo10078g("m_type");
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a("JSON Error in ADCMessage constructor: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0645d0 mo9529a() {
        return mo9530a((C0897z0) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0897z0 mo9532b() {
        return this.f356b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9535c() {
        return this.f355a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9536d() {
        C0578a.m140a(this.f355a, this.f356b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0645d0 mo9531a(String str) {
        return mo9530a(C0894y.m1153b(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9533b(C0897z0 z0Var) {
        this.f356b = z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0645d0 mo9530a(C0897z0 z0Var) {
        try {
            C0645d0 d0Var = new C0645d0("reply", this.f356b.mo10071c("m_origin"), z0Var);
            d0Var.f356b.mo10065b("m_id", this.f356b.mo10071c("m_id"));
            return d0Var;
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a("JSON error in ADCMessage's createReply(): ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            return new C0645d0("JSONException", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9534b(String str) {
        this.f355a = str;
    }

    C0645d0(String str, int i) {
        try {
            this.f355a = str;
            C0897z0 z0Var = new C0897z0();
            this.f356b = z0Var;
            z0Var.mo10065b("m_target", i);
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a("JSON Error in ADCMessage constructor: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
        }
    }

    C0645d0(String str, int i, String str2) {
        try {
            this.f355a = str;
            C0897z0 b = C0894y.m1153b(str2);
            this.f356b = b;
            b.mo10065b("m_target", i);
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a("JSON Error in ADCMessage constructor: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
        }
    }

    C0645d0(String str, int i, C0897z0 z0Var) {
        try {
            this.f355a = str;
            z0Var = z0Var == null ? new C0897z0() : z0Var;
            this.f356b = z0Var;
            z0Var.mo10065b("m_target", i);
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a("JSON Error in ADCMessage constructor: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
        }
    }
}
