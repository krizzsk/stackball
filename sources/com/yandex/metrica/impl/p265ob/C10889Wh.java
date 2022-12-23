package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Wh */
public class C10889Wh {

    /* renamed from: a */
    private final String f26172a;

    /* renamed from: b */
    private final String f26173b;

    /* renamed from: c */
    private final C10364I9 f26174c;

    public C10889Wh(String str, String str2) {
        this(str, str2, C10619P0.m27164i().mo61893u());
    }

    /* renamed from: a */
    public String mo62453a() {
        C10364I9 i9 = this.f26174c;
        String str = this.f26172a;
        String str2 = this.f26173b;
        i9.getClass();
        return i9.mo61444a(new C11984ye("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, (String) null).mo64145a(), (String) null);
    }

    C10889Wh(String str, String str2, C10364I9 i9) {
        this.f26172a = str;
        this.f26173b = str2;
        this.f26174c = i9;
    }

    /* renamed from: a */
    public void mo62454a(String str) {
        this.f26174c.mo61504a(this.f26172a, this.f26173b, str);
    }
}
