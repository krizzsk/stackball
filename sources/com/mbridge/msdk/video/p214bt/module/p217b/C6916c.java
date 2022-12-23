package com.mbridge.msdk.video.p214bt.module.p217b;

import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.p214bt.module.p216a.C6913b;
import com.mbridge.msdk.videocommon.p237b.C7170c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.c */
/* compiled from: H5ShowRewardListener */
public final class C6916c extends C6915b {

    /* renamed from: a */
    private C6913b f17052a;

    /* renamed from: b */
    private String f17053b;

    public C6916c(C6913b bVar, String str) {
        this.f17052a = bVar;
        this.f17053b = str;
    }

    /* renamed from: a */
    public final void mo47003a() {
        if (this.f17052a != null) {
            C6361q.m16154a("H5ShowRewardListener", "onAdShow");
            this.f17052a.mo48345a(this.f17053b);
        }
    }

    /* renamed from: a */
    public final void mo47008a(boolean z, C7170c cVar) {
        if (this.f17052a != null) {
            C6361q.m16154a("H5ShowRewardListener", "onAdClose");
            this.f17052a.mo48349a(this.f17053b, z, cVar);
        }
    }

    /* renamed from: a */
    public final void mo47005a(String str) {
        if (this.f17052a != null) {
            C6361q.m16154a("H5ShowRewardListener", "onShowFail");
            this.f17052a.mo48347a(this.f17053b, str);
        }
    }

    /* renamed from: a */
    public final void mo47009a(boolean z, String str, String str2) {
        if (this.f17052a != null) {
            C6361q.m16154a("H5ShowRewardListener", "onVideoAdClicked");
            this.f17052a.mo48348a(this.f17053b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo47006a(String str, String str2) {
        if (this.f17052a != null) {
            C6361q.m16154a("H5ShowRewardListener", "onVideoComplete");
            this.f17052a.mo48351b(this.f17053b, str, str2);
        }
    }

    /* renamed from: b */
    public final void mo47010b(String str, String str2) {
        if (this.f17052a != null) {
            C6361q.m16154a("H5ShowRewardListener", "onEndcardShow");
            this.f17052a.mo48352c(this.f17053b, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo47004a(int i, String str, String str2) {
        if (this.f17052a != null) {
            C6361q.m16154a("H5ShowRewardListener", "onAutoLoad");
            this.f17052a.mo48346a(this.f17053b, i, str, str2);
        }
    }
}
