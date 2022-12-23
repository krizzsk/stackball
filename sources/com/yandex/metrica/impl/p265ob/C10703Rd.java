package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C11060b2;
import java.util.EnumSet;

/* renamed from: com.yandex.metrica.impl.ob.Rd */
public class C10703Rd implements C10808Ud {

    /* renamed from: c */
    private static final EnumSet<C11060b2.C11064d> f25597c = EnumSet.of(C11060b2.C11064d.OFFLINE);

    /* renamed from: a */
    private C11921wm f25598a = new C11724rm();

    /* renamed from: b */
    private final Context f25599b;

    public C10703Rd(Context context) {
        this.f25599b = context;
    }

    /* renamed from: a */
    public boolean mo62128a() {
        C11921wm wmVar = this.f25598a;
        Context context = this.f25599b;
        ((C11724rm) wmVar).getClass();
        return !f25597c.contains(C11060b2.m28557a(context));
    }
}
