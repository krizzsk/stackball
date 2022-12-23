package com.mbridge.msdk.video.signal.p235a;

import android.content.res.Configuration;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.signal.C7050a;

/* renamed from: com.mbridge.msdk.video.signal.a.a */
/* compiled from: DefaultJSActivity */
public class C7051a implements C7050a {
    /* renamed from: a */
    public void mo48790a() {
        C6361q.m16154a("js", "DefaultJSActivity-onPause");
    }

    /* renamed from: b */
    public void mo48793b() {
        C6361q.m16154a("js", "DefaultJSActivity-onResume");
    }

    /* renamed from: f */
    public void mo48797f() {
        C6361q.m16154a("js", "DefaultJSActivity-onDestory");
    }

    /* renamed from: c */
    public final void mo48794c() {
        C6361q.m16154a("js", "DefaultJSActivity-onStop");
    }

    /* renamed from: d */
    public final void mo48795d() {
        C6361q.m16154a("js", "DefaultJSActivity-onStart");
    }

    /* renamed from: e */
    public final void mo48796e() {
        C6361q.m16154a("js", "DefaultJSActivity-onRestart");
    }

    /* renamed from: a */
    public void mo48792a(Configuration configuration) {
        C6361q.m16154a("js", "DefaultJSActivity-onConfigurationChanged:" + configuration.orientation);
    }

    /* renamed from: g */
    public void mo48798g() {
        C6361q.m16154a("js", "DefaultJSActivity-onBackPressed");
    }

    /* renamed from: h */
    public int mo48799h() {
        C6361q.m16154a("js", "isSystemResume");
        return 0;
    }

    /* renamed from: a */
    public void mo48791a(int i) {
        C6361q.m16154a("js", "setSystemResume,isResume:" + i);
    }
}
