package com.smaato.sdk.video.vast.widget;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.p250ui.ProgressView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.video.C8920R;
import com.smaato.sdk.video.vast.player.VideoPlayerView;
import com.smaato.sdk.video.vast.widget.element.VastElementView;

public class VastVideoPlayerView extends AdContentView {
    private VastElementView companionAdView = ((VastElementView) findViewById(C8920R.C8922id.smaato_sdk_video_companion_view_id));
    private VastElementView iconView = ((VastElementView) findViewById(C8920R.C8922id.smaato_sdk_video_icon_view_id));
    private VideoPlayerView videoPlayerView;
    @Inject
    private VideoPlayerViewFactory videoPlayerViewFactory;

    public VastVideoPlayerView(Context context) {
        super(context);
        AndroidsInjector.inject((View) this);
        inflate(context, C8920R.layout.smaato_sdk_video_vast_video_player_view, this);
        VideoPlayerView videoPlayerView2 = this.videoPlayerViewFactory.getVideoPlayerView(context);
        this.videoPlayerView = videoPlayerView2;
        videoPlayerView2.setId(C8920R.C8922id.smaato_sdk_video_video_player_view_id);
        FrameLayout frameLayout = (FrameLayout) findViewById(C8920R.C8922id.smaato_sdk_video_player_layout);
        frameLayout.removeAllViews();
        frameLayout.addView(this.videoPlayerView, new RelativeLayout.LayoutParams(-1, -1));
    }

    public VastElementView getIconView() {
        return this.iconView;
    }

    public VastElementView getCompanionAdView() {
        return this.companionAdView;
    }

    public VideoPlayerView getVideoPlayerView() {
        return this.videoPlayerView;
    }

    public void showCompanion() {
        Threads.runOnUi(new Runnable() {
            public final void run() {
                VastVideoPlayerView.this.lambda$showCompanion$0$VastVideoPlayerView();
            }
        });
    }

    public /* synthetic */ void lambda$showCompanion$0$VastVideoPlayerView() {
        this.companionAdView.setVisibility(0);
        this.companionAdView.requestFocus();
    }

    public void showProgressIndicator(boolean z) {
        Threads.runOnUi(new Runnable(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VastVideoPlayerView.this.lambda$showProgressIndicator$1$VastVideoPlayerView(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$showProgressIndicator$1$VastVideoPlayerView(boolean z) {
        if (z) {
            addView(new ProgressView(getContext()));
        } else {
            removeView((ProgressView) findViewById(C8920R.C8922id.smaato_sdk_core_progress_view_id));
        }
    }

    public void hidePlayer() {
        Threads.runOnUi(new Runnable() {
            public final void run() {
                VastVideoPlayerView.this.lambda$hidePlayer$3$VastVideoPlayerView();
            }
        });
    }

    public /* synthetic */ void lambda$hidePlayer$3$VastVideoPlayerView() {
        Objects.onNotNull(this.videoPlayerView, $$Lambda$VastVideoPlayerView$Fi1DqPJFIUuB8hZx0_KUyUWa9uc.INSTANCE);
    }
}
