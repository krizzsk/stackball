package com.mbridge.msdk.video.p214bt.module.p217b;

import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.videocommon.p237b.C7170c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.b */
/* compiled from: DefaultShowRewardListener */
public class C6915b implements C6922h {
    /* renamed from: a */
    public void mo47003a() {
        C6361q.m16154a("ShowRewardListener", "onAdShow");
    }

    /* renamed from: a */
    public void mo47008a(boolean z, C7170c cVar) {
        C6361q.m16154a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + cVar);
    }

    /* renamed from: a */
    public void mo47005a(String str) {
        C6361q.m16154a("ShowRewardListener", "onShowFail:" + str);
    }

    /* renamed from: a */
    public void mo47009a(boolean z, String str, String str2) {
        C6361q.m16154a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    /* renamed from: a */
    public void mo47006a(String str, String str2) {
        C6361q.m16154a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    /* renamed from: a */
    public void mo47007a(boolean z, int i) {
        C6361q.m16154a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    /* renamed from: b */
    public void mo47010b(String str, String str2) {
        C6361q.m16154a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    /* renamed from: a */
    public void mo47004a(int i, String str, String str2) {
        C6361q.m16154a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
