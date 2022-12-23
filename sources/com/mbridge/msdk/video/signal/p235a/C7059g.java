package com.mbridge.msdk.video.signal.p235a;

import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.signal.C7161i;

/* renamed from: com.mbridge.msdk.video.signal.a.g */
/* compiled from: DefaultJSVideoModule */
public class C7059g implements C7161i {
    public int getBorderViewHeight() {
        return 0;
    }

    public int getBorderViewLeft() {
        return 0;
    }

    public int getBorderViewRadius() {
        return 0;
    }

    public int getBorderViewTop() {
        return 0;
    }

    public int getBorderViewWidth() {
        return 0;
    }

    public boolean isH5Canvas() {
        return false;
    }

    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C6361q.m16154a("js", "showVideoLocation:marginTop=" + i + ",marginLeft=" + i2 + ",width=" + i3 + ",height=" + i4 + ",radius=" + i5 + ",borderTop=" + i6 + ",borderTop=" + i6 + ",borderLeft=" + i7 + ",borderWidth=" + i8 + ",borderHeight=" + i9);
    }

    public void soundOperate(int i, int i2) {
        C6361q.m16154a("js", "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    public void soundOperate(int i, int i2, String str) {
        C6361q.m16154a("js", "soundOperate:mute=" + i + ",soundViewVisible=" + i2 + ",pt=" + str);
    }

    public void videoOperate(int i) {
        C6361q.m16154a("js", "videoOperate:" + i);
    }

    public void closeVideoOperate(int i, int i2) {
        C6361q.m16154a("js", "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    public void progressOperate(int i, int i2) {
        C6361q.m16154a("js", "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    public String getCurrentProgress() {
        C6361q.m16154a("js", "getCurrentProgress");
        return "{}";
    }

    public void setScaleFitXY(int i) {
        C6361q.m16154a("js", "setScaleFitXY:" + i);
    }

    public void setVisible(int i) {
        C6361q.m16154a("js", "setVisible:" + i);
    }

    public void setCover(boolean z) {
        C6361q.m16154a("js", "setCover:" + z);
    }

    public void notifyCloseBtn(int i) {
        C6361q.m16154a("js", "notifyCloseBtn:" + i);
    }

    public void showIVRewardAlertView(String str) {
        C6361q.m16154a("js", "showAlertView:");
    }

    public void showAlertView() {
        C6361q.m16154a("js", "showAlertView:");
    }

    public void hideAlertView(int i) {
        C6361q.m16154a("js", "hideAlertView:");
    }

    public void alertWebViewShowed() {
        C6361q.m16154a("js", "alertWebViewShowed:");
    }

    public void dismissAllAlert() {
        C6361q.m16154a("js", "dismissAllAlert");
    }

    public void setMiniEndCardState(boolean z) {
        C6361q.m16154a("js", "setMiniEndCardState" + z);
    }
}
