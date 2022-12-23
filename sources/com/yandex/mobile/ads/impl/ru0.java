package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

public class ru0 {

    /* renamed from: a */
    private final st0 f39720a;

    /* renamed from: b */
    private final jm1 f39721b;

    /* renamed from: com.yandex.mobile.ads.impl.ru0$a */
    private static class C14536a implements View.OnClickListener {

        /* renamed from: a */
        private final wt0 f39722a;

        /* renamed from: b */
        private final CheckBox f39723b;

        /* renamed from: c */
        private boolean f39724c;

        C14536a(st0 st0, CheckBox checkBox, jm1 jm1) {
            this.f39723b = checkBox;
            this.f39724c = jm1.mo68064a();
            this.f39722a = new wt0(st0);
        }

        public void onClick(View view) {
            boolean z = !this.f39724c;
            this.f39724c = z;
            this.f39723b.setChecked(z);
            this.f39722a.mo70753a(this.f39724c);
        }
    }

    public ru0(st0 st0, jm1 jm1) {
        this.f39720a = st0;
        this.f39721b = jm1;
    }

    /* renamed from: a */
    public void mo69824a(PlaybackControlsContainer playbackControlsContainer) {
        if (playbackControlsContainer != null) {
            CheckBox b = playbackControlsContainer.mo71931b();
            if (b != null) {
                b.setOnClickListener(new C14536a(this.f39720a, b, this.f39721b));
                b.setVisibility(0);
            }
            ProgressBar c = playbackControlsContainer.mo71932c();
            if (c != null) {
                c.setVisibility(0);
            }
            TextView a = playbackControlsContainer.mo71930a();
            if (a != null) {
                a.setText("");
                a.setVisibility(0);
            }
            playbackControlsContainer.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo69825b(PlaybackControlsContainer playbackControlsContainer) {
        if (playbackControlsContainer != null) {
            CheckBox b = playbackControlsContainer.mo71931b();
            if (b != null) {
                b.setOnClickListener((View.OnClickListener) null);
                b.setVisibility(8);
            }
            ProgressBar c = playbackControlsContainer.mo71932c();
            if (c != null) {
                c.setProgress(0);
                c.setVisibility(8);
            }
            TextView a = playbackControlsContainer.mo71930a();
            if (a != null) {
                a.setText("");
                a.setVisibility(8);
            }
            playbackControlsContainer.setVisibility(8);
        }
    }
}
