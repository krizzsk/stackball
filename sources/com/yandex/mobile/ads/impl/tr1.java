package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.core.initializer.C12158e;

class tr1 implements C12158e.C12160b {

    /* renamed from: a */
    final /* synthetic */ Context f40431a;

    /* renamed from: b */
    final /* synthetic */ BidderTokenLoadListener f40432b;

    /* renamed from: c */
    final /* synthetic */ ur1 f40433c;

    tr1(ur1 ur1, Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        this.f40433c = ur1;
        this.f40431a = context;
        this.f40432b = bidderTokenLoadListener;
    }

    /* renamed from: a */
    public void mo64612a(C14564s6 s6Var, l30 l30) {
        String a = this.f40433c.f40867b.mo70047a(this.f40431a, s6Var, l30);
        if (a != null) {
            this.f40433c.f40868c.post(new Runnable(a) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BidderTokenLoadListener.this.onBidderTokenLoaded(this.f$1);
                }
            });
        } else {
            this.f40433c.f40868c.post(new Runnable() {
                public final void run() {
                    BidderTokenLoadListener.this.onBidderTokenFailedToLoad("Cannot load bidder token. Token generation failed");
                }
            });
        }
    }

    /* renamed from: a */
    public void mo64611a(C12350a2 a2Var) {
        this.f40433c.f40868c.post(new Runnable() {
            public final void run() {
                BidderTokenLoadListener.this.onBidderTokenFailedToLoad("Cannot load bidder token. SDK initialization failed.");
            }
        });
    }
}
