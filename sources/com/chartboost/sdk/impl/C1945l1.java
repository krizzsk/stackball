package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.chartboost.sdk.C1892h;
import com.chartboost.sdk.Libraries.CBLogging;

/* renamed from: com.chartboost.sdk.impl.l1 */
public class C1945l1 extends FrameLayout {

    /* renamed from: a */
    private View f4990a;

    /* renamed from: b */
    private boolean f4991b;

    /* renamed from: com.chartboost.sdk.impl.l1$a */
    public interface C1946a {
        /* renamed from: a */
        void mo14650a();

        /* renamed from: a */
        void mo14651a(int i);

        /* renamed from: a */
        void mo14652a(int i, int i2);

        /* renamed from: a */
        void mo14653a(MediaPlayer.OnCompletionListener onCompletionListener);

        /* renamed from: a */
        void mo14654a(MediaPlayer.OnErrorListener onErrorListener);

        /* renamed from: a */
        void mo14655a(MediaPlayer.OnPreparedListener onPreparedListener);

        /* renamed from: a */
        void mo14656a(Uri uri);

        /* renamed from: b */
        int mo14658b();

        /* renamed from: c */
        boolean mo14659c();

        /* renamed from: d */
        int mo14660d();

        /* renamed from: e */
        void mo14661e();
    }

    public C1945l1(Context context) {
        super(context);
        m4691b();
    }

    /* renamed from: b */
    private void m4691b() {
        this.f4991b = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Choosing ");
        sb.append(this.f4991b ? "texture" : "surface");
        sb.append(" solution for video playback");
        CBLogging.m3995c("VideoInit", sb.toString());
        C1892h a = C1892h.m4431a();
        if (this.f4991b) {
            this.f4990a = (View) a.mo14549a(new C1941k1(getContext()));
        } else {
            this.f4990a = (View) a.mo14549a(new C1938j1(getContext()));
        }
        this.f4990a.setContentDescription("CBVideo");
        addView(this.f4990a, new FrameLayout.LayoutParams(-1, -1));
        if (!this.f4991b) {
            ((SurfaceView) this.f4990a).setZOrderMediaOverlay(true);
        }
    }

    /* renamed from: a */
    public C1946a mo14694a() {
        return (C1946a) this.f4990a;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo14694a().mo14652a(i, i2);
    }
}
