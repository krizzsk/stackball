package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.jt0;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class et0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15230y2 f33148a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15156x9 f33149b = new C15156x9();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final md0 f33150c = new md0();

    /* renamed from: d */
    private final xc0 f33151d;

    /* renamed from: com.yandex.mobile.ads.impl.et0$a */
    class C13006a implements pd0 {

        /* renamed from: a */
        final /* synthetic */ vq0 f33152a;

        /* renamed from: b */
        final /* synthetic */ ed0 f33153b;

        /* renamed from: c */
        final /* synthetic */ C13007b f33154c;

        C13006a(vq0 vq0, ed0 ed0, C13007b bVar) {
            this.f33152a = vq0;
            this.f33153b = ed0;
            this.f33154c = bVar;
        }

        /* renamed from: a */
        public void mo66874a(Map<String, Bitmap> map) {
            et0.this.f33148a.mo70965a(C15139x2.IMAGE_LOADING);
            et0.this.f33150c.mo68648a(this.f33152a, map);
            et0.this.f33149b.mo70848a(this.f33152a, map);
            this.f33153b.mo66168a(map);
            ((jt0.C13587b) this.f33154c).mo68092b();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.et0$b */
    interface C13007b {
    }

    et0(Context context, C15230y2 y2Var) {
        this.f33148a = y2Var;
        this.f33151d = new xc0(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66873a(vq0 vq0, ed0 ed0, C13007b bVar) {
        as0 c = vq0.mo70515c();
        Set<hd0> a = this.f33151d.mo70871a(c.mo65856c());
        this.f33151d.getClass();
        HashSet hashSet = new HashSet();
        List<C14535ru> b = c.mo65854b();
        if (b != null) {
            for (C14535ru b2 : b) {
                List<hd0> b3 = b2.mo69819b();
                if (b3 != null) {
                    hashSet.addAll(b3);
                }
            }
        }
        a.addAll(hashSet);
        this.f33148a.mo70970b(C15139x2.IMAGE_LOADING);
        this.f33151d.mo70873a(a, new C13006a(vq0, ed0, bVar));
    }
}
