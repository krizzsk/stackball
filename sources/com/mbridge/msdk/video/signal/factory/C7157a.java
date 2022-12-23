package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.C7050a;
import com.mbridge.msdk.video.signal.C7067b;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.video.signal.C7155e;
import com.mbridge.msdk.video.signal.C7156f;
import com.mbridge.msdk.video.signal.C7160h;
import com.mbridge.msdk.video.signal.C7161i;
import com.mbridge.msdk.video.signal.p235a.C7051a;
import com.mbridge.msdk.video.signal.p235a.C7052b;
import com.mbridge.msdk.video.signal.p235a.C7053c;
import com.mbridge.msdk.video.signal.p235a.C7056d;
import com.mbridge.msdk.video.signal.p235a.C7057e;
import com.mbridge.msdk.video.signal.p235a.C7058f;
import com.mbridge.msdk.video.signal.p235a.C7059g;

/* renamed from: com.mbridge.msdk.video.signal.factory.a */
/* compiled from: DefaultJSFactory */
public class C7157a implements IJSFactory {

    /* renamed from: a */
    protected C7050a f17853a;

    /* renamed from: b */
    protected C7068c f17854b;

    /* renamed from: c */
    protected C7161i f17855c;

    /* renamed from: d */
    protected C7156f f17856d;

    /* renamed from: e */
    protected C7155e f17857e;

    /* renamed from: f */
    protected C7160h f17858f;

    /* renamed from: g */
    protected C7067b f17859g;

    public C7050a getActivityProxy() {
        if (this.f17853a == null) {
            this.f17853a = new C7051a();
        }
        return this.f17853a;
    }

    public C7068c getJSCommon() {
        if (this.f17854b == null) {
            this.f17854b = new C7053c();
        }
        return this.f17854b;
    }

    public C7161i getJSVideoModule() {
        if (this.f17855c == null) {
            this.f17855c = new C7059g();
        }
        return this.f17855c;
    }

    public C7156f getJSNotifyProxy() {
        if (this.f17856d == null) {
            this.f17856d = new C7057e();
        }
        return this.f17856d;
    }

    public C7155e getJSContainerModule() {
        if (this.f17857e == null) {
            this.f17857e = new C7056d();
        }
        return this.f17857e;
    }

    public C7160h getIJSRewardVideoV1() {
        if (this.f17858f == null) {
            this.f17858f = new C7058f();
        }
        return this.f17858f;
    }

    public C7067b getJSBTModule() {
        if (this.f17859g == null) {
            this.f17859g = new C7052b();
        }
        return this.f17859g;
    }
}
