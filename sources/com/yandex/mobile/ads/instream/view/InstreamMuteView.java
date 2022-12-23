package com.yandex.mobile.ads.instream.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.iq0;
import com.yandex.mobile.ads.impl.sp1;

public class InstreamMuteView extends ImageView implements iq0 {

    /* renamed from: a */
    private final sp1 f43572a;

    /* renamed from: b */
    private boolean f43573b;

    public InstreamMuteView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private sp1 m44931a() {
        return new sp1(C12066R.C12067drawable.yandex_ads_internal_ic_sound_off_default, C12066R.C12067drawable.yandex_ads_internal_ic_sound_on_default);
    }

    /* renamed from: b */
    private void m44932b() {
        setMuted(this.f43573b);
    }

    public void setMuted(boolean z) {
        this.f43573b = z;
        this.f43572a.mo70044a(this, z);
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43572a = m44931a();
        m44932b();
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43572a = m44931a();
        m44932b();
    }
}
