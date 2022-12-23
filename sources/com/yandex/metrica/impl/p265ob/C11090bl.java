package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import com.yandex.metrica.impl.p265ob.C10893Wl;

/* renamed from: com.yandex.metrica.impl.ob.bl */
class C11090bl {

    /* renamed from: a */
    private final C10409Jk f26616a;

    /* renamed from: b */
    private final C10892Wk f26617b;

    /* renamed from: c */
    private final int f26618c;

    C11090bl(C11004Zk<?> zk, int i) {
        this(zk, i, new C10409Jk(zk.mo62595b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10893Wl.C10895b mo62704a(String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, C10893Wl.C10895b> a = this.f26617b.mo62456a(this.f26618c, str);
        if (a != null) {
            return (C10893Wl.C10895b) a.second;
        }
        C10893Wl.C10895b a2 = this.f26616a.mo61632a(str);
        this.f26617b.mo62458a(this.f26618c, str, a2 != null, a2);
        return a2;
    }

    C11090bl(C11004Zk<?> zk, int i, C10409Jk jk) {
        this.f26618c = i;
        this.f26616a = jk;
        this.f26617b = zk.mo62594a();
    }
}
