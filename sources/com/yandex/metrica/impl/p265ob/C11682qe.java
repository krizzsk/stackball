package com.yandex.metrica.impl.p265ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qe */
public class C11682qe extends C11715re {

    /* renamed from: j */
    public static final /* synthetic */ int f28011j = 0;

    /* renamed from: f */
    private final C11984ye f28012f = new C11984ye("init_event_pref_key", mo63600c());

    /* renamed from: g */
    private final C11984ye f28013g = new C11984ye("init_event_pref_key");

    /* renamed from: h */
    private final C11984ye f28014h = new C11984ye("first_event_pref_key", mo63600c());

    /* renamed from: i */
    private final C11984ye f28015i = new C11984ye("fitst_event_description_key", mo63600c());

    public C11682qe(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    private void m30096a(C11984ye yeVar) {
        this.f28085b.edit().remove(yeVar.mo64145a()).apply();
    }

    @Deprecated
    /* renamed from: b */
    public String mo63536b(String str) {
        return this.f28085b.getString(this.f28013g.mo64145a(), (String) null);
    }

    /* renamed from: c */
    public String mo63537c(String str) {
        return this.f28085b.getString(this.f28014h.mo64145a(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63538d() {
        return "_initpreferences";
    }

    /* renamed from: d */
    public String mo63539d(String str) {
        return this.f28085b.getString(this.f28012f.mo64145a(), (String) null);
    }

    @Deprecated
    /* renamed from: f */
    public void mo63540f() {
        m30096a(this.f28013g);
    }

    /* renamed from: g */
    public void mo63541g() {
        m30096a(this.f28015i);
    }

    /* renamed from: h */
    public void mo63542h() {
        m30096a(this.f28014h);
    }

    /* renamed from: i */
    public void mo63543i() {
        m30096a(this.f28012f);
    }

    /* renamed from: j */
    public void mo63544j() {
        mo63598a(this.f28012f.mo64145a(), "DONE").mo63599b();
    }
}
