package com.amazon.device.ads;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

class AdVideoPlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    private static String LOGTAG = AdVideoPlayer.class.getSimpleName();
    private String contentUrl_;
    private Context context_;
    private ViewGroup.LayoutParams layoutParams_ = null;
    private AdVideoPlayerListener listener_;
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
    private boolean released_ = false;
    private VideoView videoView_ = null;
    private ViewGroup viewGroup_ = null;

    public interface AdVideoPlayerListener {
        void onComplete();

        void onError();
    }

    public AdVideoPlayer(Context context) {
        this.context_ = context;
    }

    public void setPlayData(String str) {
        this.released_ = false;
        this.contentUrl_ = str;
    }

    public void setListener(AdVideoPlayerListener adVideoPlayerListener) {
        this.listener_ = adVideoPlayerListener;
    }

    public void playVideo() {
        this.logger.mo10938d("in playVideo");
        initializeVideoView();
        loadPlayerContent();
        startPlaying();
    }

    private void initializeVideoView() {
        VideoView videoView = new VideoView(this.context_);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
        videoView.setLayoutParams(this.layoutParams_);
        this.videoView_ = videoView;
        this.viewGroup_.addView(videoView);
    }

    private void loadPlayerContent() {
        this.videoView_.setVideoURI(Uri.parse(this.contentUrl_));
    }

    public void startPlaying() {
        this.logger.mo10938d("in startPlaying");
        displayPlayerControls();
        this.videoView_.start();
    }

    private void displayPlayerControls() {
        this.logger.mo10938d("in displayPlayerControls");
        MediaController mediaController = new MediaController(this.context_);
        this.videoView_.setMediaController(mediaController);
        mediaController.setAnchorView(this.videoView_);
        mediaController.requestFocus();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        removePlayerFromParent();
        AdVideoPlayerListener adVideoPlayerListener = this.listener_;
        if (adVideoPlayerListener == null) {
            return false;
        }
        adVideoPlayerListener.onError();
        return false;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        releasePlayer();
        AdVideoPlayerListener adVideoPlayerListener = this.listener_;
        if (adVideoPlayerListener != null) {
            adVideoPlayerListener.onComplete();
        }
    }

    private void removePlayerFromParent() {
        this.logger.mo10938d("in removePlayerFromParent");
        this.viewGroup_.removeView(this.videoView_);
    }

    public void releasePlayer() {
        this.logger.mo10938d("in releasePlayer");
        if (!this.released_) {
            this.released_ = true;
            this.videoView_.stopPlayback();
            removePlayerFromParent();
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.layoutParams_ = layoutParams;
    }

    public void setViewGroup(ViewGroup viewGroup) {
        this.viewGroup_ = viewGroup;
    }
}
