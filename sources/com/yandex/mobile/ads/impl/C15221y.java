package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.h41;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.y */
public class C15221y {

    /* renamed from: a */
    private final C15232y3 f42719a = new C15232y3();

    /* renamed from: b */
    private final WeakReference<C15126x> f42720b;

    /* renamed from: c */
    private final sn0 f42721c;

    /* renamed from: d */
    private final C14645t1 f42722d;

    /* renamed from: e */
    private final h60 f42723e;

    /* renamed from: f */
    private C15222a f42724f;

    /* renamed from: g */
    private h41.C13275a f42725g;

    /* renamed from: h */
    private long f42726h;

    /* renamed from: com.yandex.mobile.ads.impl.y$a */
    public enum C15222a {
        BROWSER("browser"),
        WEBVIEW("webview"),
        CUSTOM(Payload.CUSTOM);
        

        /* renamed from: b */
        final String f42731b;

        private C15222a(String str) {
            this.f42731b = str;
        }
    }

    C15221y(Context context, C14645t1 t1Var, C15126x xVar, FalseClick falseClick) {
        this.f42722d = t1Var;
        this.f42720b = new WeakReference<>(xVar);
        this.f42721c = sn0.m42091b(context);
        this.f42723e = falseClick != null ? new h60(context, t1Var, falseClick) : null;
    }

    /* renamed from: a */
    public void mo70952a(h41.C13275a aVar) {
        this.f42725g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo70954b(C15222a aVar) {
        Objects.toString(aVar);
        this.f42726h = System.currentTimeMillis();
        this.f42724f = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70953a(C15222a aVar) {
        Objects.toString(aVar);
        if (this.f42726h != 0 && this.f42724f == aVar) {
            long currentTimeMillis = System.currentTimeMillis() - this.f42726h;
            int i = (currentTimeMillis > 1000 ? 1 : (currentTimeMillis == 1000 ? 0 : -1));
            String str = i < 0 ? "<1" : (i <= 0 || currentTimeMillis > 2000) ? (currentTimeMillis <= 2000 || currentTimeMillis > 3000) ? (currentTimeMillis <= 3000 || currentTimeMillis > 5000) ? (currentTimeMillis <= 5000 || currentTimeMillis > TapjoyConstants.TIMER_INCREMENT) ? (currentTimeMillis <= TapjoyConstants.TIMER_INCREMENT || currentTimeMillis > MBInterstitialActivity.WEB_LOAD_TIME) ? (currentTimeMillis <= MBInterstitialActivity.WEB_LOAD_TIME || currentTimeMillis > SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) ? ">20" : "15-20" : "10-15" : "5-10" : "3-5" : "2-3" : "1-2";
            HashMap hashMap = new HashMap();
            hashMap.put("type", aVar.f42731b);
            hashMap.put("ad_type", this.f42722d.mo70092b().mo64574a());
            hashMap.put("block_id", this.f42722d.mo70096c());
            hashMap.put("ad_unit_id", this.f42722d.mo70096c());
            hashMap.put(TJAdUnitConstants.String.INTERVAL, str);
            hashMap.putAll(this.f42719a.mo70991a(this.f42722d.mo70080a()));
            h41.C13275a aVar2 = this.f42725g;
            if (aVar2 != null) {
                hashMap.putAll(aVar2.mo66063a());
            }
            this.f42721c.mo70035a(new h41(h41.C13276b.RETURNED_TO_APP, hashMap));
            C15126x xVar = (C15126x) this.f42720b.get();
            if (xVar != null) {
                xVar.onReturnedToApplication();
            }
            h60 h60 = this.f42723e;
            if (h60 != null) {
                h60.mo67420a(currentTimeMillis);
            }
            this.f42726h = 0;
            this.f42724f = null;
        }
    }
}
