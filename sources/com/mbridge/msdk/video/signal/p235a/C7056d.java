package com.mbridge.msdk.video.signal.p235a;

import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.signal.C7155e;
import com.mbridge.msdk.video.signal.C7159g;

/* renamed from: com.mbridge.msdk.video.signal.a.d */
/* compiled from: DefaultJSContainerModule */
public class C7056d implements C7155e, C7159g {
    public void configurationChanged(int i, int i2, int i3) {
    }

    public void showVideoClickView(int i) {
        C6361q.m16154a("js", "showVideoClickView:" + i);
    }

    public void showEndcard(int i) {
        C6361q.m16154a("js", "showEndcard,type=" + i);
    }

    public boolean endCardShowing() {
        C6361q.m16154a("js", "endCardShowing");
        return true;
    }

    public boolean miniCardShowing() {
        C6361q.m16154a("js", "miniCardShowing");
        return false;
    }

    public void notifyCloseBtn(int i) {
        C6361q.m16154a("js", "notifyCloseBtn:state = " + i);
    }

    public void toggleCloseBtn(int i) {
        C6361q.m16154a("js", "toggleCloseBtn:state=" + i);
    }

    public void readyStatus(int i) {
        C6361q.m16154a("js", "readyStatus:isReady=" + i);
    }

    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        C6361q.m16154a("js", "showMiniCard top = " + i + " left = " + i2 + " width = " + i3 + " height = " + i4 + " radius = " + i5);
    }

    public void resizeMiniCard(int i, int i2, int i3) {
        C6361q.m16154a("js", "showMiniCard width = " + i + " height = " + i2 + " radius = " + i3);
    }

    public boolean showAlertWebView() {
        C6361q.m16154a("js", "showAlertWebView ,msg=");
        return false;
    }

    public void hideAlertWebview() {
        C6361q.m16154a("js", "hideAlertWebview ,msg=");
    }

    public void ivRewardAdsWithoutVideo(String str) {
        C6361q.m16154a("js", "ivRewardAdsWithoutVideo,params=");
    }
}
