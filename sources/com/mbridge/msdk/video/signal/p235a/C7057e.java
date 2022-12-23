package com.mbridge.msdk.video.signal.p235a;

import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.C7156f;

/* renamed from: com.mbridge.msdk.video.signal.a.e */
/* compiled from: DefaultJSNotifyProxy */
public class C7057e implements C7156f {
    /* renamed from: a */
    public void mo48829a(int i) {
        C6361q.m16154a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i);
    }

    /* renamed from: a */
    public void mo48831a(int i, String str) {
        C6361q.m16154a("DefaultJSNotifyProxy", "onClick:" + i + ",pt:" + str);
    }

    /* renamed from: a */
    public void mo48832a(MBridgeVideoView.C7025a aVar) {
        C6361q.m16154a("DefaultJSNotifyProxy", "onProgressNotify:" + aVar.toString());
    }

    /* renamed from: a */
    public void mo48833a(Object obj) {
        C6361q.m16154a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    /* renamed from: a */
    public void mo48830a(int i, int i2, int i3, int i4) {
        C6361q.m16154a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
