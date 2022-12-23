package com.p243my.target.nativeads;

import android.content.Context;
import com.p243my.target.C7317b;
import com.p243my.target.C7374e0;
import com.p243my.target.C7435h2;
import com.p243my.target.C7524l3;
import com.p243my.target.C7618q2;
import com.p243my.target.C7641s;
import com.p243my.target.C7699v2;
import com.p243my.target.common.BaseAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeBannerAdLoader */
public final class NativeBannerAdLoader extends BaseAd {
    private C7317b<C7699v2> adFactory;
    private final Context appContext;
    private OnLoad onLoad;

    /* renamed from: com.my.target.nativeads.NativeBannerAdLoader$OnLoad */
    public interface OnLoad {
        void onLoad(List<NativeBannerAd> list);
    }

    private NativeBannerAdLoader(int i, int i2, Context context) {
        super(i, "nativebanner");
        if (i2 < 1) {
            C7374e0.m18989a("NativeBannerAdLoader: invalid bannersCount < 1, bannersCount set to 1");
            i2 = 1;
        }
        this.adConfig.setBannersCount(i2);
        this.adConfig.setMediationEnabled(false);
        this.appContext = context.getApplicationContext();
        C7374e0.m18991c("NativeBannerAdLoader created. Version: 5.15.0");
    }

    private void handleResult(C7699v2 v2Var, String str) {
        OnLoad onLoad2;
        ArrayList arrayList;
        if (this.onLoad != null) {
            List<C7435h2> c = v2Var == null ? null : v2Var.mo51727c();
            if (c == null || c.size() < 1) {
                onLoad2 = this.onLoad;
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                for (C7435h2 banner : c) {
                    NativeBannerAd nativeBannerAd = new NativeBannerAd(this.adConfig.getSlotId(), this.appContext);
                    nativeBannerAd.setCachePolicy(this.adConfig.getCachePolicy());
                    nativeBannerAd.setBanner(banner);
                    arrayList.add(nativeBannerAd);
                }
                onLoad2 = this.onLoad;
            }
            onLoad2.onLoad(arrayList);
        }
    }

    public static NativeBannerAdLoader newLoader(int i, int i2, Context context) {
        return new NativeBannerAdLoader(i, i2, context);
    }

    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public /* synthetic */ void lambda$load$0$NativeBannerAdLoader(C7317b bVar, C7699v2 v2Var, String str) {
        if (bVar == this.adFactory) {
            this.adFactory = null;
            handleResult(v2Var, str);
        }
    }

    public NativeBannerAdLoader load() {
        C7524l3 a = this.metricFactory.mo50803a();
        C7317b<C7699v2> a2 = C7641s.m20282a(this.adConfig, this.metricFactory);
        this.adFactory = a2;
        a2.mo49685a(new C7641s.C7643b(a2) {
            public final /* synthetic */ C7317b f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeBannerAdLoader.this.lambda$load$0$NativeBannerAdLoader(this.f$1, (C7699v2) q2Var, str);
            }
        }).mo49692b(a, this.appContext);
        return this;
    }

    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public NativeBannerAdLoader setOnLoad(OnLoad onLoad2) {
        this.onLoad = onLoad2;
        return this;
    }
}
