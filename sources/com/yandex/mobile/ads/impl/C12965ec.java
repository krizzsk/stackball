package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.C15411a;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.InstreamAdListener;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ec */
public class C12965ec {

    /* renamed from: a */
    private final WeakReference<ViewGroup> f32949a;

    /* renamed from: b */
    private final List<bk1> f32950b;

    /* renamed from: c */
    private final InstreamAdBinder f32951c;

    /* renamed from: d */
    private final C15411a f32952d;

    /* renamed from: e */
    private InstreamAdView f32953e;

    public C12965ec(ViewGroup viewGroup, List<bk1> list, InstreamAdBinder instreamAdBinder) {
        this.f32951c = instreamAdBinder;
        this.f32952d = new C15411a(instreamAdBinder);
        this.f32949a = new WeakReference<>(viewGroup);
        this.f32950b = list;
    }

    /* renamed from: a */
    public void mo66797a() {
        ViewGroup viewGroup = (ViewGroup) this.f32949a.get();
        if (viewGroup != null) {
            if (this.f32953e == null) {
                this.f32953e = new InstreamAdView(viewGroup.getContext());
                viewGroup.addView(this.f32953e, new ViewGroup.LayoutParams(-1, -1));
            }
            this.f32952d.mo71313a(this.f32953e, this.f32950b);
        }
    }

    /* renamed from: b */
    public void mo66801b() {
        InstreamAdView instreamAdView;
        ViewGroup viewGroup = (ViewGroup) this.f32949a.get();
        if (!(viewGroup == null || (instreamAdView = this.f32953e) == null)) {
            viewGroup.removeView(instreamAdView);
        }
        this.f32953e = null;
        this.f32951c.setInstreamAdListener((InstreamAdListener) null);
        this.f32951c.unbind();
        this.f32951c.invalidateAdPlayer();
        this.f32951c.invalidateVideoPlayer();
    }

    /* renamed from: a */
    public void mo66800a(qk1 qk1) {
        this.f32951c.setVideoAdPlaybackListener(qk1);
    }

    /* renamed from: a */
    public void mo66798a(mj1 mj1) {
        this.f32952d.mo71311a(mj1);
    }

    /* renamed from: a */
    public void mo66799a(nj1 nj1) {
        this.f32952d.mo71312a(nj1);
    }
}
