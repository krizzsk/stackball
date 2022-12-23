package com.mbridge.msdk.playercommon;

import com.mbridge.msdk.foundation.tools.C6361q;

public class DefaultVideoPlayerStatusListener implements VideoPlayerStatusListener {
    protected static final String TAG = "DefaultVideoPlayerStatusListener";

    public void onPlayStarted(int i) {
        C6361q.m16154a(TAG, "onPlayStarted:" + i);
    }

    public void onPlayCompleted() {
        C6361q.m16154a(TAG, "onPlayCompleted");
    }

    public void onPlayError(String str) {
        C6361q.m16154a(TAG, "onPlayError:" + str);
    }

    public void onPlayProgress(int i, int i2) {
        C6361q.m16154a(TAG, "onPlayProgress:" + i + ",allDuration:" + i2);
    }

    public void onBufferingStart(String str) {
        C6361q.m16154a(TAG, "OnBufferingStart:" + str);
    }

    public void onBufferingEnd() {
        C6361q.m16154a(TAG, "OnBufferingEnd");
    }

    public void onPlaySetDataSourceError(String str) {
        C6361q.m16154a(TAG, "onPlaySetDataSourceError:" + str);
    }

    public void onPlayProgressMS(int i, int i2) {
        C6361q.m16154a(TAG, "onPlayProgressMS:");
    }
}
