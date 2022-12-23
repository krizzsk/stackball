package com.smaato.sdk.video.vast.player;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StubOnGestureListener;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.C8920R;
import com.smaato.sdk.video.vast.widget.CircularProgressBar;
import com.smaato.sdk.video.vast.widget.VastSurfaceHolder;

public abstract class VideoPlayerView extends FrameLayout {
    private ImageButton muteButton;
    private ImageButton skipButton;
    private View surfaceHolderView;
    /* access modifiers changed from: private */
    public VideoPlayerPresenter videoPlayerPresenter;
    private CircularProgressBar videoProgressBar = ((CircularProgressBar) findViewById(C8920R.C8922id.smaato_sdk_video_video_progress));

    static /* synthetic */ void lambda$onSurfaceChanged$7(Surface surface, int i, int i2, VideoPlayerPresenter videoPlayerPresenter2) {
    }

    /* access modifiers changed from: protected */
    public abstract VastSurfaceHolder initVastSurfaceHolder(Context context);

    protected VideoPlayerView(Context context) {
        super(context);
        inflate(context, C8920R.layout.smaato_sdk_video_player_view, this);
        VastSurfaceHolder initVastSurfaceHolder = initVastSurfaceHolder(context);
        initVastSurfaceHolder.setOnSurfaceAvailableListener(new VastSurfaceHolder.OnSurfaceAvailableListener() {
            public final void onSurfaceAvailable(Surface surface, int i, int i2) {
                VideoPlayerView.this.onSurfaceAvailable(surface, i, i2);
            }
        });
        initVastSurfaceHolder.setOnSurfaceChangedListener(new VastSurfaceHolder.OnSurfaceChangedListener() {
            public final void onSurfaceChanged(Surface surface, int i, int i2) {
                VideoPlayerView.this.onSurfaceChanged(surface, i, i2);
            }
        });
        initVastSurfaceHolder.setOnSurfaceDestroyedListener(new VastSurfaceHolder.OnSurfaceDestroyedListener() {
            public final void onSurfaceDestroyed(Surface surface) {
                VideoPlayerView.this.onSurfaceDestroyed(surface);
            }
        });
        GestureDetector gestureDetector = new GestureDetector(getContext(), new StubOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Objects.onNotNull(VideoPlayerView.this.videoPlayerPresenter, new Consumer(motionEvent) {
                    public final /* synthetic */ MotionEvent f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        ((VideoPlayerPresenter) obj).onVideoClicked(this.f$0.getX(), this.f$0.getY());
                    }
                });
                return true;
            }
        });
        View view = initVastSurfaceHolder.getView();
        view.setId(C8920R.C8922id.smaato_sdk_video_surface_holder_view_id);
        view.setOnTouchListener(new View.OnTouchListener(gestureDetector) {
            public final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.onTouchEvent(motionEvent);
            }
        });
        ((FrameLayout) findViewById(C8920R.C8922id.smaato_sdk_video_player_surface_layout)).addView(view, new ViewGroup.LayoutParams(-1, -1));
        this.surfaceHolderView = view;
        ImageButton imageButton = (ImageButton) findViewById(C8920R.C8922id.smaato_sdk_video_skip_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoPlayerView.this.lambda$initSkipButton$4$VideoPlayerView(view);
            }
        });
        this.skipButton = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(C8920R.C8922id.smaato_sdk_video_mute_button);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoPlayerView.this.lambda$initMuteButton$5$VideoPlayerView(view);
            }
        });
        this.muteButton = imageButton2;
    }

    /* access modifiers changed from: package-private */
    public void setVideoPlayerPresenter(VideoPlayerPresenter videoPlayerPresenter2) {
        Threads.ensureMainThread();
        this.videoPlayerPresenter = videoPlayerPresenter2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (size > 0 && size2 > 0) {
            Objects.onNotNull(this.videoPlayerPresenter, new Consumer(size, size2) {
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    VideoPlayerView.this.lambda$onMeasure$0$VideoPlayerView(this.f$1, this.f$2, (VideoPlayerPresenter) obj);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void changeMuteIcon(boolean z) {
        Threads.runOnUi(new Runnable(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VideoPlayerView.this.lambda$changeMuteIcon$1$VideoPlayerView(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$changeMuteIcon$1$VideoPlayerView(boolean z) {
        this.muteButton.setImageResource(z ? C8920R.C8921drawable.smaato_sdk_video_muted : C8920R.C8921drawable.smaato_sdk_video_unmuted);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Objects.onNotNull(this.videoPlayerPresenter, $$Lambda$AFjJWyL9s9dpmBXg7HATvu8cTQY.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public final void setVideoSize(int i, int i2) {
        Threads.runOnUi(new Runnable(i, i2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                VideoPlayerView.this.lambda$setVideoSize$3$VideoPlayerView(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$setVideoSize$3$VideoPlayerView(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.surfaceHolderView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.gravity = 17;
        this.surfaceHolderView.setLayoutParams(layoutParams);
    }

    public /* synthetic */ void lambda$initSkipButton$4$VideoPlayerView(View view) {
        Objects.onNotNull(this.videoPlayerPresenter, $$Lambda$HJ4rt0RHo5i3W26xHUUOv4Nb0.INSTANCE);
    }

    public /* synthetic */ void lambda$initMuteButton$5$VideoPlayerView(View view) {
        Objects.onNotNull(this.videoPlayerPresenter, $$Lambda$HRIpwZASCEWVkRr12iO8OvnL50.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void onSurfaceAvailable(Surface surface, int i, int i2) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer(surface) {
            public final /* synthetic */ Surface f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).onSurfaceAvailable(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onSurfaceChanged(Surface surface, int i, int i2) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer(surface, i, i2) {
            public final /* synthetic */ Surface f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                VideoPlayerView.lambda$onSurfaceChanged$7(this.f$0, this.f$1, this.f$2, (VideoPlayerPresenter) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onSurfaceDestroyed(Surface surface) {
        Objects.onNotNull(this.videoPlayerPresenter, new Consumer(surface) {
            public final /* synthetic */ Surface f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VideoPlayerPresenter) obj).onSurfaceDestroyed$378a8b81();
            }
        });
        surface.release();
    }

    /* access modifiers changed from: package-private */
    public final void updateProgressBar(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        Threads.runOnUi(new Runnable(j3, j4, String.valueOf(((int) (j2 / 1000)) - ((int) (j / 1000)))) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r6;
            }

            public final void run() {
                VideoPlayerView.this.lambda$updateProgressBar$9$VideoPlayerView(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$updateProgressBar$9$VideoPlayerView(long j, long j2, String str) {
        this.videoProgressBar.setProgress((float) j, (float) j2, str);
    }

    /* access modifiers changed from: package-private */
    public final void showSkipButton() {
        Threads.runOnUi(new Runnable() {
            public final void run() {
                VideoPlayerView.this.lambda$showSkipButton$10$VideoPlayerView();
            }
        });
    }

    public /* synthetic */ void lambda$showSkipButton$10$VideoPlayerView() {
        if (!(this.skipButton.getVisibility() == 0)) {
            this.skipButton.setAlpha(0.0f);
            this.skipButton.setVisibility(0);
            this.skipButton.animate().alpha(1.0f).setDuration(300).start();
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        if (!(Build.VERSION.SDK_INT >= 18 && isInLayout())) {
            requestLayout();
        }
    }

    public /* synthetic */ void lambda$onMeasure$0$VideoPlayerView(int i, int i2, VideoPlayerPresenter videoPlayerPresenter2) {
        videoPlayerPresenter2.videoViewResizeManager.resizeToContainerSizes(this, i, i2);
    }
}
