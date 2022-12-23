package com.yandex.mobile.ads.base;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C13403ib;
import com.yandex.mobile.ads.impl.C14559s3;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C15139x2;
import com.yandex.mobile.ads.impl.a51;
import com.yandex.mobile.ads.impl.ug1;

/* renamed from: com.yandex.mobile.ads.base.q */
class C12122q implements Runnable {

    /* renamed from: b */
    final /* synthetic */ ug1 f29241b;

    /* renamed from: c */
    final /* synthetic */ C12116o f29242c;

    C12122q(C12116o oVar, ug1 ug1) {
        this.f29242c = oVar;
        this.f29241b = ug1;
    }

    public void run() {
        if (!this.f29242c.mo64599k()) {
            String a = this.f29241b.mo67199a(this.f29242c.f29213f);
            if (!TextUtils.isEmpty(a)) {
                this.f29242c.f29217j.mo70970b(C15139x2.NETWORK_REQUEST);
                this.f29242c.f29213f.mo70088a(this.f29241b.mo67197a());
                C12116o oVar = this.f29242c;
                C14645t1 t1Var = oVar.f29213f;
                a51 c = oVar.f29223p;
                Context context = this.f29242c.f29209b;
                c.getClass();
                t1Var.mo70093b(context.getResources().getConfiguration().orientation);
                ug1 ug1 = this.f29241b;
                C12116o oVar2 = this.f29242c;
                C13403ib a2 = this.f29242c.mo64575a(a, ug1.mo67198a(oVar2.f29209b, oVar2.f29213f, oVar2.f29215h));
                int i = C13278h5.f34274b;
                a2.mo68339b((Object) toString());
                this.f29242c.f29210c.mo64525a(a2);
                return;
            }
            this.f29242c.mo64404a(C14559s3.f39821n);
        }
    }
}
