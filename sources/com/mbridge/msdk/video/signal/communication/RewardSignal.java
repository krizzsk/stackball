package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.C6366u;

public class RewardSignal extends BaseRewardSignal implements IRewardCommunication {

    /* renamed from: e */
    private Handler f17582e = new Handler(Looper.getMainLooper());

    public void getEndScreenInfo(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.getEndScreenInfo(obj, str);
                }
            });
        }
    }

    public void install(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.install(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.install(obj, str);
                }
            });
        }
    }

    public void notifyCloseBtn(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.notifyCloseBtn(obj, str);
                }
            });
        }
    }

    public void toggleCloseBtn(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.toggleCloseBtn(obj, str);
                }
            });
        }
    }

    public void triggerCloseBtn(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.getEndScreenInfo(obj, str);
                }
            });
        }
    }

    public void setOrientation(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.setOrientation(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.setOrientation(obj, str);
                }
            });
        }
    }

    public void handlerPlayableException(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.handlerPlayableException(obj, str);
                }
            });
        }
    }

    public void openURL(final Object obj, final String str) {
        if (C6366u.m16207b()) {
            super.openURL(obj, str);
        } else {
            this.f17582e.post(new Runnable() {
                public final void run() {
                    RewardSignal.super.openURL(obj, str);
                }
            });
        }
    }
}
