package com.amazon.device.ads;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.AdVideoPlayer;

class VideoActionHandler implements AdActivity.AdActivityAdapter {
    /* access modifiers changed from: private */
    public Activity activity;
    private RelativeLayout layout;
    private AdVideoPlayer player;

    public boolean onBackPressed() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onWindowFocusChanged() {
    }

    VideoActionHandler() {
    }

    VideoActionHandler(AdVideoPlayer adVideoPlayer, Activity activity2) {
        this.player = adVideoPlayer;
        this.activity = activity2;
    }

    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    public void onCreate() {
        Bundle extras = this.activity.getIntent().getExtras();
        RelativeLayout relativeLayout = new RelativeLayout(this.activity);
        this.layout = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.activity.setContentView(this.layout);
        initPlayer(extras);
        this.player.playVideo();
    }

    private void setPlayerListener(AdVideoPlayer adVideoPlayer) {
        adVideoPlayer.setListener(new AdVideoPlayer.AdVideoPlayerListener() {
            public void onError() {
                VideoActionHandler.this.activity.finish();
            }

            public void onComplete() {
                VideoActionHandler.this.activity.finish();
            }
        });
    }

    private void initPlayer(Bundle bundle) {
        AdVideoPlayer adVideoPlayer = new AdVideoPlayer(this.activity);
        this.player = adVideoPlayer;
        adVideoPlayer.setPlayData(bundle.getString("url"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.player.setLayoutParams(layoutParams);
        this.player.setViewGroup(this.layout);
        setPlayerListener(this.player);
    }

    public void onStop() {
        AdVideoPlayer adVideoPlayer = this.player;
        if (adVideoPlayer != null) {
            adVideoPlayer.releasePlayer();
            this.player = null;
        }
        this.activity.finish();
    }

    public void onDestroy() {
        AdVideoPlayer adVideoPlayer = this.player;
        if (adVideoPlayer != null) {
            adVideoPlayer.releasePlayer();
            this.player = null;
        }
        this.activity.finish();
    }

    public void preOnCreate() {
        this.activity.requestWindowFeature(1);
    }
}
