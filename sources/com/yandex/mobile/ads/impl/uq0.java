package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.yandex.mobile.ads.nativeads.MediaView;

public class uq0 implements sq0 {

    /* renamed from: a */
    private final q61 f40845a = new q61();

    /* renamed from: a */
    public TextView mo65901a(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("body"));
    }

    /* renamed from: b */
    public TextView mo65902b(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("warning"));
    }

    /* renamed from: c */
    public ImageView mo65903c(View view) {
        return (ImageView) this.f40845a.mo69499a(ImageView.class, view.findViewWithTag("favicon"));
    }

    /* renamed from: d */
    public TextView mo65904d(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("age"));
    }

    /* renamed from: e */
    public View mo65905e(View view) {
        return (View) this.f40845a.mo69499a(View.class, view.findViewWithTag(CampaignEx.JSON_KEY_STAR));
    }

    /* renamed from: f */
    public MediaView mo65906f(View view) {
        return (MediaView) this.f40845a.mo69499a(MediaView.class, view.findViewWithTag("media"));
    }

    /* renamed from: g */
    public TextView mo65907g(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("title"));
    }

    /* renamed from: h */
    public TextView mo65908h(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("price"));
    }

    /* renamed from: i */
    public ImageView mo65909i(View view) {
        return (ImageView) this.f40845a.mo69499a(ImageView.class, view.findViewWithTag("feedback"));
    }

    /* renamed from: j */
    public TextView mo65910j(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("sponsored"));
    }

    /* renamed from: k */
    public TextView mo65911k(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("call_to_action"));
    }

    /* renamed from: l */
    public TextView mo65912l(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("domain"));
    }

    /* renamed from: m */
    public ImageView mo65913m(View view) {
        return (ImageView) this.f40845a.mo69499a(ImageView.class, view.findViewWithTag(RewardPlus.ICON));
    }

    /* renamed from: n */
    public TextView mo65914n(View view) {
        return (TextView) this.f40845a.mo69499a(TextView.class, view.findViewWithTag("review_count"));
    }
}
