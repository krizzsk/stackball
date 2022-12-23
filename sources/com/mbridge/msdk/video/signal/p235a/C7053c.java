package com.mbridge.msdk.video.signal.p235a;

import android.app.Activity;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.videocommon.p239d.C7179c;

/* renamed from: com.mbridge.msdk.video.signal.a.c */
/* compiled from: DefaultJSCommon */
public class C7053c implements C7068c {

    /* renamed from: a */
    protected boolean f17545a = false;

    /* renamed from: b */
    protected boolean f17546b = false;

    /* renamed from: c */
    protected int f17547c = 0;

    /* renamed from: d */
    protected int f17548d = 0;

    /* renamed from: e */
    protected int f17549e = 0;

    /* renamed from: f */
    protected int f17550f = 0;

    /* renamed from: g */
    protected int f17551g = 1;

    /* renamed from: h */
    protected int f17552h = -1;

    /* renamed from: i */
    protected String f17553i;

    /* renamed from: j */
    protected C7179c f17554j;

    /* renamed from: k */
    protected C6097a f17555k;

    /* renamed from: l */
    public C7068c.C7069a f17556l = new C7054a();

    /* renamed from: m */
    protected int f17557m = 2;

    /* renamed from: f */
    public void mo48818f() {
    }

    /* renamed from: a */
    public final void mo48801a(int i) {
        this.f17557m = i;
    }

    /* renamed from: c */
    public final void mo48813c(int i) {
        this.f17547c = i;
    }

    /* renamed from: b */
    public final void mo48808b(int i) {
        this.f17548d = i;
    }

    /* renamed from: d */
    public final void mo48815d(int i) {
        this.f17549e = i;
    }

    /* renamed from: j */
    public final int mo48825j() {
        if (this.f17547c == 0 && this.f17546b) {
            this.f17547c = 1;
        }
        return this.f17547c;
    }

    /* renamed from: k */
    public final int mo48826k() {
        if (this.f17548d == 0 && this.f17546b) {
            this.f17548d = 1;
        }
        return this.f17548d;
    }

    /* renamed from: l */
    public final int mo48827l() {
        if (this.f17549e == 0 && this.f17546b) {
            this.f17549e = 1;
        }
        return this.f17549e;
    }

    /* renamed from: e */
    public final void mo48817e(int i) {
        this.f17550f = i;
    }

    /* renamed from: a */
    public final int mo48800a() {
        return this.f17550f;
    }

    /* renamed from: m */
    public final boolean mo48828m() {
        return this.f17546b;
    }

    /* renamed from: a */
    public final void mo48807a(boolean z) {
        C6361q.m16154a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.f17546b = z;
    }

    /* renamed from: b */
    public final boolean mo48811b() {
        return this.f17545a;
    }

    /* renamed from: b */
    public final void mo48810b(boolean z) {
        this.f17545a = z;
    }

    /* renamed from: a */
    public final void mo48806a(String str) {
        C6361q.m16154a("DefaultJSCommon", "setUnitId:" + str);
        this.f17553i = str;
    }

    /* renamed from: a */
    public final void mo48804a(C7068c.C7069a aVar) {
        C6361q.m16154a("DefaultJSCommon", "setTrackingListener:" + aVar);
        this.f17556l = aVar;
    }

    /* renamed from: a */
    public final void mo48805a(C7179c cVar) {
        C6361q.m16154a("DefaultJSCommon", "setSetting:" + cVar);
        this.f17554j = cVar;
    }

    /* renamed from: e */
    public final void mo48816e() {
        C6361q.m16154a("DefaultJSCommon", "release");
        C6097a aVar = this.f17555k;
        if (aVar != null) {
            aVar.mo42843a(false);
            this.f17555k.mo42841a((NativeListener.NativeTrackingListener) null);
            this.f17555k.mo42837a();
        }
    }

    /* renamed from: a */
    public void mo48802a(int i, String str) {
        C6361q.m16154a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    /* renamed from: f */
    public final void mo48819f(int i) {
        this.f17552h = i;
    }

    /* renamed from: g */
    public final int mo48820g() {
        return this.f17552h;
    }

    /* renamed from: g */
    public String mo48821g(int i) {
        C6361q.m16154a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    /* renamed from: h */
    public final void mo48823h(int i) {
        C6361q.m16154a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.f17551g = i;
    }

    /* renamed from: h */
    public final int mo48822h() {
        C6361q.m16154a("DefaultJSCommon", "getAlertDialogRole " + this.f17551g);
        return this.f17551g;
    }

    /* renamed from: a */
    public void mo48803a(Activity activity) {
        C6361q.m16154a("DefaultJSCommon", "setActivity ");
    }

    /* renamed from: c */
    public String mo48812c() {
        C6361q.m16154a("DefaultJSCommon", "init");
        return "{}";
    }

    public void click(int i, String str) {
        C6361q.m16154a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    public void handlerH5Exception(int i, String str) {
        C6361q.m16154a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    /* renamed from: d */
    public void mo48814d() {
        C6361q.m16154a("DefaultJSCommon", "finish");
    }

    /* renamed from: b */
    public void mo48809b(String str) {
        C6361q.m16154a("DefaultJSCommon", "setNotchArea");
    }

    /* renamed from: i */
    public String mo48824i() {
        C6361q.m16154a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    /* renamed from: com.mbridge.msdk.video.signal.a.c$b */
    /* compiled from: DefaultJSCommon */
    public static class C7055b implements C7068c.C7069a {

        /* renamed from: a */
        private C7068c f17558a;

        /* renamed from: b */
        private C7068c.C7069a f17559b;

        public C7055b(C7068c cVar, C7068c.C7069a aVar) {
            this.f17558a = cVar;
            this.f17559b = aVar;
        }

        public final boolean onInterceptDefaultLoadingDialog() {
            C7068c.C7069a aVar = this.f17559b;
            return aVar != null && aVar.onInterceptDefaultLoadingDialog();
        }

        public final void onShowLoading(Campaign campaign) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onShowLoading(campaign);
            }
        }

        public final void onDismissLoading(Campaign campaign) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onDismissLoading(campaign);
            }
        }

        public final void onStartRedirection(Campaign campaign, String str) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onStartRedirection(campaign, str);
            }
        }

        public final void onFinishRedirection(Campaign campaign, String str) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onFinishRedirection(campaign, str);
            }
            C7068c cVar = this.f17558a;
            if (cVar != null) {
                cVar.mo48814d();
            }
        }

        public final void onRedirectionFailed(Campaign campaign, String str) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onRedirectionFailed(campaign, str);
            }
            C7068c cVar = this.f17558a;
            if (cVar != null) {
                cVar.mo48814d();
            }
        }

        public final void onDownloadStart(Campaign campaign) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onDownloadStart(campaign);
            }
        }

        public final void onDownloadFinish(Campaign campaign) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onDownloadFinish(campaign);
            }
        }

        public final void onDownloadProgress(int i) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.onDownloadProgress(i);
            }
        }

        /* renamed from: a */
        public final void mo48316a() {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.mo48316a();
            }
        }

        /* renamed from: a */
        public final void mo48318a(boolean z) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.mo48318a(z);
            }
        }

        /* renamed from: a */
        public final void mo48317a(int i, String str) {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.mo48317a(i, str);
            }
        }

        /* renamed from: b */
        public final void mo48319b() {
            C7068c.C7069a aVar = this.f17559b;
            if (aVar != null) {
                aVar.mo48319b();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.signal.a.c$a */
    /* compiled from: DefaultJSCommon */
    public static class C7054a implements C7068c.C7069a {
        public boolean onInterceptDefaultLoadingDialog() {
            C6361q.m16154a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        public void onShowLoading(Campaign campaign) {
            C6361q.m16154a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        public void onDismissLoading(Campaign campaign) {
            C6361q.m16154a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        public void onStartRedirection(Campaign campaign, String str) {
            C6361q.m16154a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onFinishRedirection(Campaign campaign, String str) {
            C6361q.m16154a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onRedirectionFailed(Campaign campaign, String str) {
            C6361q.m16154a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onDownloadStart(Campaign campaign) {
            C6361q.m16154a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        public void onDownloadFinish(Campaign campaign) {
            C6361q.m16154a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        public void onDownloadProgress(int i) {
            C6361q.m16154a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        /* renamed from: a */
        public void mo48316a() {
            C6361q.m16154a("DefaultJSCommon", "onInitSuccess");
        }

        /* renamed from: a */
        public void mo48318a(boolean z) {
            C6361q.m16154a("DefaultJSCommon", "onStartInstall");
        }

        /* renamed from: a */
        public void mo48317a(int i, String str) {
            C6361q.m16154a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }

        /* renamed from: b */
        public void mo48319b() {
            C6361q.m16154a("DefaultJSCommon", "videoLocationReady");
        }
    }
}
