package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

public class vm1 implements bl1 {

    /* renamed from: a */
    private final qn1 f41327a;

    /* renamed from: b */
    private final C15034w7 f41328b = new C15034w7();

    /* renamed from: c */
    private final C13206gi f41329c = new C13206gi();

    public vm1(qn1 qn1) {
        this.f41327a = qn1;
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        pu0 pu0 = (pu0) this.f41327a.mo70379b();
        if (pu0 != null) {
            PlaybackControlsContainer a = pu0.mo69436a().mo69647a();
            TextView textView = null;
            ProgressBar c = a != null ? a.mo71932c() : null;
            if (c != null) {
                this.f41328b.mo70655a(c, j, j2, false);
            }
            PlaybackControlsContainer a2 = pu0.mo69436a().mo69647a();
            if (a2 != null) {
                textView = a2.mo71930a();
            }
            TextView textView2 = textView;
            if (textView2 != null) {
                this.f41329c.mo67309a(textView2, j, j2);
            }
        }
    }
}
