package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.Gj */
class C10317Gj {

    /* renamed from: a */
    private final Context f24791a;

    /* renamed from: b */
    private final C10442L0 f24792b;

    /* renamed from: c */
    private final C10732Rm f24793c;

    C10317Gj(Context context, C10442L0 l0, C10732Rm rm) {
        this.f24791a = context;
        this.f24792b = l0;
        this.f24793c = rm;
    }

    /* renamed from: a */
    public String mo61400a() {
        return C10823V0.m27962a(this.f24792b.mo61697a(this.f24791a, "uuid.dat"));
    }

    /* renamed from: a */
    public String mo61401a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f24793c.mo62208a();
            }
            File a = this.f24792b.mo61697a(this.f24791a, "uuid.dat");
            if (a != null) {
                C10823V0.m27965a(str, "uuid.dat", new FileOutputStream(a));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
