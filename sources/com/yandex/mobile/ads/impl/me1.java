package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.td0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class me1 extends za0 implements td0.C14668a, C15126x {

    /* renamed from: A */
    private final C13955m5 f37354A;

    /* renamed from: B */
    private final sd0 f37355B;

    /* renamed from: C */
    private final td0 f37356C;

    /* renamed from: D */
    private final C15016w f37357D;

    /* renamed from: E */
    private final ta0 f37358E;

    /* renamed from: F */
    private final C14351q2 f37359F;

    /* renamed from: G */
    private final C14352q3 f37360G;

    /* renamed from: H */
    private s31 f37361H;

    /* renamed from: z */
    private final tv0 f37362z;

    /* renamed from: com.yandex.mobile.ads.impl.me1$a */
    class C13975a implements oe1 {
        C13975a() {
        }

        /* renamed from: a */
        public C12135y mo68678a(int i) {
            C12135y.C12136a aVar;
            if (!me1.m39426b(me1.this)) {
                aVar = C12135y.C12136a.AD_NOT_LOADED;
            } else if (me1.m39427c(me1.this)) {
                aVar = C12135y.C12136a.SUPERVIEW_HIDDEN;
            } else if (!me1.this.mo64368u()) {
                aVar = C12135y.C12136a.NOT_VISIBLE_FOR_PERCENT;
            } else {
                aVar = C12135y.C12136a.SUCCESS;
            }
            return new C12135y(aVar, new C14437r3());
        }

        /* renamed from: b */
        public C12135y mo68679b(int i) {
            C12135y.C12136a aVar;
            if (me1.this.mo64600l()) {
                aVar = C12135y.C12136a.APPLICATION_INACTIVE;
            } else if (!me1.m39426b(me1.this)) {
                aVar = C12135y.C12136a.AD_NOT_LOADED;
            } else if (me1.m39427c(me1.this)) {
                aVar = C12135y.C12136a.SUPERVIEW_HIDDEN;
            } else if (!me1.this.mo64362a(i) || !me1.this.mo64368u()) {
                aVar = C12135y.C12136a.NOT_VISIBLE_FOR_PERCENT;
            } else {
                aVar = C12135y.C12136a.SUCCESS;
            }
            return new C12135y(aVar, new C14437r3());
        }
    }

    protected me1(Context context, C13955m5 m5Var, C12115n nVar, C15230y2 y2Var) {
        super(context, nVar, y2Var);
        C13975a aVar = new C13975a();
        this.f37354A = m5Var;
        ta0 ta0 = new ta0();
        this.f37358E = ta0;
        C14351q2 q2Var = new C14351q2(ta0);
        this.f37359F = q2Var;
        wd0 wd0 = new wd0(context, mo64592d());
        sd0 sd0 = new sd0();
        this.f37355B = sd0;
        this.f37356C = new ud0().mo70335a(context, this, wd0, q2Var, sd0);
        tv0 a = new uv0().mo70416a(context, mo64592d(), wd0, aVar, C13278h5.m36800a(this));
        this.f37362z = a;
        a.mo69630a(sd0);
        sd0.mo69952a((o70) new sv0(a));
        this.f37357D = new C15016w(context, mo64592d(), this);
        this.f37360G = new C14352q3(context, m5Var, new wa0());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo64362a(int i);

    /* renamed from: b */
    public void mo68674b(AdResponse<String> adResponse) {
        if (mo64363b(adResponse.mo64413D())) {
            super.mo68674b(adResponse);
        } else {
            mo64404a(C14559s3.f39812e);
        }
    }

    /* renamed from: c */
    public void mo64364c() {
        toString();
        super.mo64364c();
        this.f37362z.mo69625a();
        s31 s31 = this.f37361H;
        if (s31 != null) {
            s31.mo69856c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public sd0 mo68675t() {
        return this.f37355B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract boolean mo64368u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo68676v() {
        if ((!this.f37354A.mo64374a()) || mo64600l()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public synchronized void mo68677w() {
        toString();
        this.f37362z.mo69631b();
        s31 s31 = this.f37361H;
        if (s31 != null) {
            s31.mo69855b();
        }
    }

    /* renamed from: a */
    public void mo64403a(Intent intent) {
        intent.getAction();
        this.f37354A.mo64374a();
        this.f37362z.mo69626a(intent, this.f37354A.mo64374a());
    }

    /* renamed from: b */
    public void mo64405b(int i) {
        d71 a = l71.m38631c().mo68362a(this.f29209b);
        if (a != null && a.mo66477y()) {
            if (i == 0) {
                this.f37362z.mo69631b();
            } else {
                this.f37362z.mo69625a();
            }
        } else if (this.f37354A.mo64374a()) {
            this.f37362z.mo69631b();
        } else {
            this.f37362z.mo69625a();
        }
        getClass().toString();
    }

    /* renamed from: a */
    public synchronized void mo64358a(AdResponse<String> adResponse) {
        super.mo64360a(adResponse);
        AdResponse<String> adResponse2 = adResponse;
        this.f37361H = new s31(this.f29209b, this.f37360G, adResponse2, this.f29213f, this.f37359F, this.f37355B, adResponse.mo64428h());
    }

    /* renamed from: c */
    static boolean m39427c(me1 me1) {
        return !me1.f37354A.mo64374a();
    }

    /* renamed from: a */
    public void mo66857a(String str) {
        mo71192d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68673a(Map<String, String> map) {
        toString();
        this.f37358E.mo70140a(this.f29227t);
        AdResponse<T> adResponse = this.f29227t;
        if (adResponse != null) {
            int i = C13278h5.f34274b;
            List<String> j = adResponse.mo64430j();
            List<Long> e = adResponse.mo64425e();
            List<Integer> o = adResponse.mo64435o();
            ArrayList arrayList = new ArrayList();
            if (j != null) {
                int i2 = 0;
                while (i2 < j.size()) {
                    String str = j.get(i2);
                    if (map != null) {
                        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                        for (Map.Entry next : map.entrySet()) {
                            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                        }
                        str = buildUpon.build().toString();
                    }
                    long longValue = e.size() > i2 ? e.get(i2).longValue() : 0;
                    int intValue = o.size() > i2 ? o.get(i2).intValue() : 0;
                    k81 k81 = new k81();
                    k81.mo68161a(str);
                    k81.mo68160a(longValue);
                    k81.mo68159a(intValue);
                    arrayList.add(k81);
                    i2++;
                }
            }
            this.f37356C.mo70156a(arrayList, this.f29227t.mo64442v());
            this.f37362z.mo69627a((AdResponse) this.f29227t, (List<k81>) arrayList);
        }
        C15016w wVar = this.f37357D;
        AdResponse<T> adResponse2 = this.f29227t;
        wVar.mo70605a(adResponse2 != null ? adResponse2.mo64441u() : null);
        synchronized (this) {
            toString();
            this.f37362z.mo69631b();
            s31 s31 = this.f37361H;
            if (s31 != null) {
                s31.mo69855b();
            }
        }
    }

    /* renamed from: b */
    static boolean m39426b(me1 me1) {
        return me1.f29227t != null;
    }

    /* renamed from: a */
    public void mo64487a(int i, Bundle bundle) {
        if (i == 14) {
            this.f37355B.mo68156c();
        } else if (i != 15) {
            switch (i) {
                case 6:
                    onLeftApplication();
                    this.f37357D.mo70611f();
                    return;
                case 7:
                    onLeftApplication();
                    this.f37357D.mo70609d();
                    return;
                case 8:
                    this.f37357D.mo70610e();
                    return;
                case 9:
                    this.f37357D.mo70604a();
                    this.f37355B.mo68930b();
                    return;
                default:
                    return;
            }
        } else {
            this.f37355B.mo68157e();
        }
    }
}
