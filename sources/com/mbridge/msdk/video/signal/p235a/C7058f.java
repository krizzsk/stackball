package com.mbridge.msdk.video.signal.p235a;

import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.signal.C7160h;

/* renamed from: com.mbridge.msdk.video.signal.a.f */
/* compiled from: DefaultJSRewardVideoV1 */
public class C7058f implements C7160h {
    /* renamed from: a */
    public String mo48834a() {
        C6361q.m16154a("js", "getEndScreenInfo");
        return "{}";
    }

    public void notifyCloseBtn(int i) {
        C6361q.m16154a("js", "notifyCloseBtn,state=" + i);
    }

    public void toggleCloseBtn(int i) {
        C6361q.m16154a("js", "toggleCloseBtn,state=" + i);
    }

    /* renamed from: a */
    public void mo48835a(String str) {
        C6361q.m16154a("js", "triggerCloseBtn,state=" + str);
    }

    /* renamed from: b */
    public void mo48836b(String str) {
        C6361q.m16154a("js", "setOrientation,landscape=" + str);
    }

    /* renamed from: c */
    public void mo48837c(String str) {
        C6361q.m16154a("js", "handlerPlayableException，msg=" + str);
    }
}
