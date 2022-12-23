package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.MediaView;

public class aw0 implements sq0 {

    /* renamed from: a */
    private final int f30831a;

    /* renamed from: b */
    private final q61 f30832b = new q61();

    public aw0(int i) {
        this.f30831a = i;
    }

    /* renamed from: a */
    public TextView mo65901a(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("body_" + this.f30831a));
    }

    /* renamed from: b */
    public TextView mo65902b(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("warning_" + this.f30831a));
    }

    /* renamed from: c */
    public ImageView mo65903c(View view) {
        q61 q61 = this.f30832b;
        return (ImageView) q61.mo69499a(ImageView.class, view.findViewWithTag("favicon_" + this.f30831a));
    }

    /* renamed from: d */
    public TextView mo65904d(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("age_" + this.f30831a));
    }

    /* renamed from: e */
    public View mo65905e(View view) {
        q61 q61 = this.f30832b;
        return (View) q61.mo69499a(View.class, view.findViewWithTag("rating_" + this.f30831a));
    }

    /* renamed from: f */
    public MediaView mo65906f(View view) {
        q61 q61 = this.f30832b;
        return (MediaView) q61.mo69499a(MediaView.class, view.findViewWithTag("media_" + this.f30831a));
    }

    /* renamed from: g */
    public TextView mo65907g(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("title_" + this.f30831a));
    }

    /* renamed from: h */
    public TextView mo65908h(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("price_" + this.f30831a));
    }

    /* renamed from: i */
    public ImageView mo65909i(View view) {
        q61 q61 = this.f30832b;
        return (ImageView) q61.mo69499a(ImageView.class, view.findViewWithTag("feedback_" + this.f30831a));
    }

    /* renamed from: j */
    public TextView mo65910j(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("sponsored_" + this.f30831a));
    }

    /* renamed from: k */
    public TextView mo65911k(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("call_to_action_" + this.f30831a));
    }

    /* renamed from: l */
    public TextView mo65912l(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("domain_" + this.f30831a));
    }

    /* renamed from: m */
    public ImageView mo65913m(View view) {
        q61 q61 = this.f30832b;
        return (ImageView) q61.mo69499a(ImageView.class, view.findViewWithTag("icon_" + this.f30831a));
    }

    /* renamed from: n */
    public TextView mo65914n(View view) {
        q61 q61 = this.f30832b;
        return (TextView) q61.mo69499a(TextView.class, view.findViewWithTag("review_count_" + this.f30831a));
    }
}
