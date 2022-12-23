package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.C12134x;
import com.yandex.mobile.ads.core.initializer.C12150a;

public class f71 {

    /* renamed from: a */
    private final Context f33270a;

    /* renamed from: b */
    private final C14564s6 f33271b;

    /* renamed from: c */
    private final C12150a f33272c;

    /* renamed from: d */
    private final i71 f33273d;

    /* renamed from: e */
    private final g71 f33274e = g71.m36498a();

    /* renamed from: f */
    private final s41 f33275f = s41.m41806a();

    /* renamed from: g */
    private final C12134x f33276g = new C12134x();

    /* renamed from: com.yandex.mobile.ads.impl.f71$a */
    public interface C13035a {
        /* renamed from: a */
        void mo64758a();

        /* renamed from: a */
        void mo64759a(op1 op1);
    }

    public f71(Context context, C14564s6 s6Var, C12150a aVar) {
        this.f33270a = context.getApplicationContext();
        this.f33271b = s6Var;
        this.f33272c = aVar;
        this.f33273d = new i71(context);
    }

    /* renamed from: a */
    public void mo66935a(y71 y71, C13035a aVar) {
        String str;
        if (this.f33273d.mo67749a()) {
            j71 j71 = new j71(this.f33270a, this.f33274e, aVar);
            l30 a = this.f33272c.mo64744a();
            Context context = this.f33270a;
            String a2 = a.mo68311a();
            if (!TextUtils.isEmpty(a2)) {
                String a3 = this.f33276g.mo64674a(context, a, this.f33271b, y71);
                StringBuilder sb = new StringBuilder(a2);
                sb.append(a2.endsWith("/") ? "" : "/");
                sb.append("v1/startup");
                sb.append("?");
                sb.append(a3);
                str = sb.toString();
            } else {
                str = null;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                h71 h71 = new h71(this.f33270a, str2, this.f33273d, a, j71);
                h71.mo68339b((Object) this);
                s41 s41 = this.f33275f;
                Context context2 = this.f33270a;
                synchronized (s41) {
                    lv0.m39021a(context2).mo70284a(h71);
                }
                return;
            }
            j71.mo64579a((op1) new C15026w1(11));
            return;
        }
        aVar.mo64758a();
    }

    /* renamed from: a */
    public void mo66934a() {
        this.f33275f.mo69870a(this.f33270a, this);
    }
}
