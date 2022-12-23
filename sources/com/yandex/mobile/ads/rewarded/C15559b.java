package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.C14559s3;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.d61;
import com.yandex.mobile.ads.impl.d80;
import com.yandex.mobile.ads.impl.e61;
import com.yandex.mobile.ads.impl.e80;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.m80;
import com.yandex.mobile.ads.impl.t51;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.xa0;

/* renamed from: com.yandex.mobile.ads.rewarded.b */
public class C15559b extends m80 {

    /* renamed from: T */
    private final C15558a f44106T;

    /* renamed from: U */
    private final t51 f44107U = new t51();

    /* renamed from: V */
    private final e61 f44108V;

    /* renamed from: W */
    private final xa0 f44109W;

    /* renamed from: X */
    private d61 f44110X;

    public C15559b(Context context, C15558a aVar, C15230y2 y2Var) {
        super(context, C12115n.REWARDED, aVar, y2Var, new v70());
        this.f44106T = aVar;
        this.f44108V = new e61(aVar);
        xa0 xa0 = new xa0();
        this.f44109W = xa0;
        aVar.mo71956a((h41.C13275a) xa0);
    }

    /* renamed from: B */
    public void mo68609B() {
        this.f44110X = this.f44108V.mo66771a(this.f29209b, this.f29213f, this.f29227t);
        super.mo68609B();
    }

    /* renamed from: D */
    public void mo71960D() {
        d61 d61 = this.f44110X;
        if (d61 != null) {
            d61.mo66233a();
        }
    }

    /* renamed from: a */
    public void mo64487a(int i, Bundle bundle) {
        if (i != 13) {
            super.mo64487a(i, bundle);
            return;
        }
        d61 d61 = this.f44110X;
        if (d61 != null) {
            d61.mo66233a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public d80 mo68611a(e80 e80) {
        return e80.mo66775a(this);
    }

    /* renamed from: a */
    public void mo64360a(AdResponse<String> adResponse) {
        this.f44109W.mo70852a(adResponse);
        if (this.f44107U.mo70129a(adResponse.mo64410A())) {
            super.mo64360a(adResponse);
        } else {
            mo64404a(C14559s3.f39812e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71961a(RewardedAdEventListener rewardedAdEventListener) {
        this.f44106T.mo71958a(rewardedAdEventListener);
    }
}
