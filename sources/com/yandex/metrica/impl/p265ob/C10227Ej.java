package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Ej */
public class C10227Ej {

    /* renamed from: a */
    private final C10168Cj f24603a;

    /* renamed from: b */
    private final C11054an f24604b;

    /* renamed from: c */
    private final C10317Gj f24605c;

    /* renamed from: d */
    private final C10194Dj f24606d;

    C10227Ej(C10168Cj cj, C10194Dj dj, C11054an anVar, C10317Gj gj) {
        this.f24603a = cj;
        this.f24606d = dj;
        this.f24604b = anVar;
        this.f24605c = gj;
    }

    /* renamed from: a */
    public C11258g1 mo61244a() {
        String str;
        try {
            this.f24604b.mo62656a();
            str = this.f24605c.mo61400a();
            try {
                if (TextUtils.isEmpty(str)) {
                    str = this.f24603a.mo61155a();
                    if (!TextUtils.isEmpty(str) || this.f24606d.mo61116a()) {
                        str = this.f24605c.mo61401a(str);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        this.f24604b.mo62657b();
        if (str == null) {
            return new C11258g1((String) null, C11171e1.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)");
        }
        return new C11258g1(str, C11171e1.f26755b, (String) null);
    }
}
