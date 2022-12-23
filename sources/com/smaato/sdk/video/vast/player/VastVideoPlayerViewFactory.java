package com.smaato.sdk.video.vast.player;

import android.content.Context;
import com.smaato.sdk.video.vast.widget.VastVideoPlayerView;

public class VastVideoPlayerViewFactory {
    static VastVideoPlayerView getVastVideoPlayerView(Context context) {
        return new VastVideoPlayerView(context);
    }
}
