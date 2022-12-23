package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.C12066R;

/* renamed from: com.yandex.mobile.ads.impl.wj */
public class C15053wj implements C14257p6 {
    /* renamed from: a */
    public void mo66191a(qj1 qj1) {
        TextView c = qj1.mo69606c();
        if (c != null) {
            c.setText(C12066R.string.yandex_ads_internal_instream_advertiser_yandex);
            c.setVisibility(0);
        }
        ImageView b = qj1.mo69605b();
        if (b != null) {
            b.setImageDrawable(b.getContext().getResources().getDrawable(C12066R.C12067drawable.yandex_instream_internal_advertiser));
            b.setVisibility(0);
        }
    }
}
