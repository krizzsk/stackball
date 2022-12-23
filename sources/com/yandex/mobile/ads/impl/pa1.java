package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.C12066R;

public class pa1 implements C14257p6 {

    /* renamed from: a */
    private final qa1 f38571a;

    public pa1(qa1 qa1) {
        this.f38571a = qa1;
    }

    /* renamed from: a */
    public void mo66191a(qj1 qj1) {
        TextView c = qj1.mo69606c();
        if (c != null) {
            c.setText(C12066R.string.yandex_ads_internal_instream_advertiser_social);
            c.setVisibility(0);
            c.setOnClickListener(new oa1(this.f38571a));
        }
        ImageView b = qj1.mo69605b();
        if (b != null) {
            b.setImageDrawable(b.getContext().getResources().getDrawable(C12066R.C12067drawable.yandex_instream_internal_advertiser_social));
            b.setVisibility(0);
            b.setOnClickListener(new oa1(this.f38571a));
        }
    }
}
