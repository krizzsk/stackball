package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

public class il0 implements C13838l9<dm0>, C12394al<dm0> {

    /* renamed from: a */
    private final od0 f34914a;

    /* renamed from: b */
    private final gm0 f34915b;

    public il0(od0 od0, gm0 gm0) {
        this.f34914a = od0;
        this.f34915b = gm0;
    }

    /* renamed from: a */
    public boolean mo67820a(Object obj) {
        dm0 dm0 = (dm0) obj;
        od0 od0 = this.f34914a;
        hd0 a = m37458a(dm0.mo66637a());
        View a2 = m37457a(od0);
        boolean z = (a2 == null || a == null || !od0.mo65825a(a2, (Object) a)) ? false : true;
        gm0 gm0 = this.f34915b;
        View a3 = m37457a(gm0);
        boolean z2 = a3 != null && gm0.mo65825a(a3, dm0);
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo65797b(Object obj) {
        dm0 dm0 = (dm0) obj;
        hd0 a = m37458a(dm0.mo66637a());
        ImageView imageView = (ImageView) m37457a(this.f34914a);
        if (!(imageView == null || a == null)) {
            this.f34914a.mo69135a(imageView, a);
            imageView.setVisibility(0);
        }
        MediaView mediaView = (MediaView) m37457a(this.f34915b);
        if (mediaView != null) {
            this.f34915b.mo65824a(dm0);
            mediaView.setVisibility(0);
        }
    }

    /* renamed from: c */
    public void mo67823c(Object obj) {
        dm0 dm0 = (dm0) obj;
        hd0 a = m37458a(dm0.mo66637a());
        ImageView imageView = (ImageView) m37457a(this.f34914a);
        if (!(imageView == null || a == null)) {
            this.f34914a.mo69135a(imageView, a);
            imageView.setVisibility(0);
        }
        MediaView mediaView = (MediaView) m37457a(this.f34915b);
        if (mediaView != null) {
            this.f34915b.mo65826b(mediaView, dm0);
            mediaView.setVisibility(0);
        }
    }

    /* renamed from: d */
    public boolean mo67824d() {
        gm0 gm0 = this.f34915b;
        boolean z = gm0 != null && gm0.mo70380c();
        od0 od0 = this.f34914a;
        boolean z2 = od0 != null && od0.mo70380c();
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void destroy() {
        gm0 gm0 = this.f34915b;
        if (gm0 != null) {
            gm0.mo66668a();
        }
    }

    /* renamed from: e */
    public gm0.C13214a mo67826e() {
        gm0 gm0 = this.f34915b;
        if (gm0 != null) {
            return gm0.mo65827e();
        }
        od0 od0 = this.f34914a;
        if (od0 == null) {
            return null;
        }
        od0.getClass();
        return gm0.C13214a.f34041f;
    }

    /* renamed from: a */
    public void mo67817a() {
        ImageView imageView = (ImageView) m37457a(this.f34914a);
        if (imageView != null) {
            this.f34914a.mo69134a(imageView);
        }
        MediaView mediaView = (MediaView) m37457a(this.f34915b);
        if (mediaView != null) {
            this.f34915b.mo65866a(mediaView);
        }
    }

    /* renamed from: b */
    public boolean mo67821b() {
        gm0 gm0 = this.f34915b;
        boolean z = gm0 != null && gm0.mo70381d();
        od0 od0 = this.f34914a;
        boolean z2 = od0 != null && od0.mo70381d();
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public io1 mo67822c() {
        MediaView mediaView = (MediaView) m37457a(this.f34915b);
        ImageView imageView = (ImageView) m37457a(this.f34914a);
        if (mediaView != null) {
            return new io1(mediaView);
        }
        if (imageView != null) {
            return new io1(imageView);
        }
        return null;
    }

    /* renamed from: a */
    public void mo67818a(C13690k9<dm0> k9Var, yn1 yn1) {
        dm0 d = k9Var.mo68169d();
        od0 od0 = this.f34914a;
        if (od0 != null) {
            od0.mo65867a(k9Var, yn1, m37458a(d.mo66637a()));
        }
        gm0 gm0 = this.f34915b;
        if (gm0 != null) {
            gm0.mo65867a(k9Var, yn1, d);
        }
    }

    /* renamed from: a */
    private hd0 m37458a(List<hd0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: a */
    private <V extends View, T> V m37457a(un1<V, T> un1) {
        if (un1 != null) {
            return un1.mo70379b();
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo67819a(int i) {
        gm0 gm0 = this.f34915b;
        boolean z = gm0 != null && lo1.m38868a(gm0.mo70379b(), i);
        od0 od0 = this.f34914a;
        boolean z2 = od0 != null && lo1.m38868a(od0.mo70379b(), i);
        if (z || z2) {
            return true;
        }
        return false;
    }
}
