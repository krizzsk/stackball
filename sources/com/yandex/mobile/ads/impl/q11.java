package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class q11 implements bl1 {

    /* renamed from: a */
    private final Context f38967a;

    /* renamed from: b */
    private final ue1 f38968b = new ue1();

    /* renamed from: c */
    private final List<p11> f38969c;

    public q11(Context context, ck1 ck1) {
        this.f38967a = context.getApplicationContext();
        this.f38969c = m41061a(ck1);
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        Iterator<p11> it = this.f38969c.iterator();
        while (it.hasNext()) {
            p11 next = it.next();
            String b = next.mo69295b();
            if (((float) next.mo69294a()) <= ((float) j2)) {
                lm1.m38835a(this.f38967a).mo68491a(b, (r41<fv0>) null);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private List<p11> m41061a(ck1 ck1) {
        LinkedList linkedList = new LinkedList();
        C13413ii a = ck1.mo66321a();
        long d = (long) a.mo67786d();
        List<qe1> a2 = this.f38968b.mo70343a(a);
        ArrayList arrayList = new ArrayList();
        for (qe1 next : a2) {
            if (NotificationCompat.CATEGORY_PROGRESS.equals(next.mo69585a())) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qe1 qe1 = (qe1) it.next();
            String c = qe1.mo69587c();
            VastTimeOffset b = qe1.mo69586b();
            p11 p11 = null;
            if (b != null) {
                Long valueOf = VastTimeOffset.C15570b.MILLISECONDS.equals(b.mo71999c()) ? Long.valueOf((long) b.mo72000d()) : null;
                if (VastTimeOffset.C15570b.PERCENTS.equals(b.mo71999c())) {
                    valueOf = Long.valueOf(tk0.m42363a(b.mo72000d(), d));
                }
                if (valueOf != null) {
                    p11 = new p11(c, valueOf.longValue());
                }
            }
            if (p11 != null) {
                linkedList.add(p11);
            }
        }
        return linkedList;
    }
}
