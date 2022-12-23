package com.chartboost.sdk;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C1887f;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1836a;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1950m1;
import com.chartboost.sdk.impl.C1952n;
import com.chartboost.sdk.impl.C1979s1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.chartboost.sdk.e */
public class C1885e {

    /* renamed from: a */
    final C1950m1 f4702a;

    /* renamed from: b */
    private final C1952n f4703b;

    /* renamed from: c */
    private final AtomicReference<C1844h> f4704c;

    /* renamed from: d */
    private final Handler f4705d;

    /* renamed from: e */
    C1979s1 f4706e = null;

    /* renamed from: f */
    private int f4707f = -1;

    /* renamed from: com.chartboost.sdk.e$a */
    class C1886a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1838c f4708a;

        /* renamed from: b */
        final /* synthetic */ Activity f4709b;

        C1886a(C1838c cVar, Activity activity) {
            this.f4708a = cVar;
            this.f4709b = activity;
        }

        public void run() {
            C1838c cVar = this.f4708a;
            cVar.f4449b = 4;
            int i = 1;
            if (cVar.f4464q.f4422b == 1) {
                i = 6;
            }
            Integer a = C1950m1.m4714a(this.f4708a.f4464q.f4436p);
            if (a != null) {
                i = a.intValue();
            }
            C1883d dVar = this.f4708a.f4455h;
            dVar.getClass();
            C1883d.C1884a aVar = new C1883d.C1884a(13);
            C1838c cVar2 = this.f4708a;
            aVar.f4700c = cVar2;
            aVar.f4699b = this.f4709b;
            C1885e.this.f4702a.mo14700a(i, cVar2, (Runnable) aVar);
        }
    }

    public C1885e(C1950m1 m1Var, C1952n nVar, AtomicReference<C1844h> atomicReference, Handler handler) {
        this.f4702a = m1Var;
        this.f4703b = nVar;
        this.f4704c = atomicReference;
        this.f4705d = handler;
    }

    /* renamed from: c */
    private void m4390c(C1838c cVar) {
        int i;
        C1979s1 s1Var = this.f4706e;
        if (s1Var == null || s1Var.mo14792d() == cVar) {
            int i2 = 1;
            boolean z = cVar.f4449b != 2;
            cVar.f4449b = 2;
            Activity e = cVar.f4455h.mo14494e();
            CBError.CBImpressionError cBImpressionError = e == null ? CBError.CBImpressionError.NO_HOST_ACTIVITY : null;
            if (cBImpressionError == null) {
                cBImpressionError = cVar.mo14271a((RelativeLayout) null);
            }
            if (cBImpressionError != null) {
                CBLogging.m3993b("CBViewController", "Unable to create the view while trying th display the impression");
                cVar.mo14273a(cBImpressionError);
                return;
            }
            if (this.f4706e == null) {
                C1979s1 s1Var2 = (C1979s1) C1892h.m4431a().mo14549a(new C1979s1(e, cVar));
                this.f4706e = s1Var2;
                e.addContentView(s1Var2, new FrameLayout.LayoutParams(-1, -1));
            }
            CBUtility.m4002a(e, cVar.f4464q.f4422b, this.f4704c.get());
            if (this.f4707f == -1 && ((i = cVar.f4448a) == 1 || i == 2)) {
                this.f4707f = e.getWindow().getDecorView().getSystemUiVisibility();
                Chartboost.setActivityAttrs(e);
            }
            this.f4706e.mo14794f();
            CBLogging.m3995c("CBViewController", "Displaying the impression");
            C1979s1 s1Var3 = this.f4706e;
            cVar.f4472y = s1Var3;
            if (z) {
                if (cVar.f4464q.f4422b == 0) {
                    s1Var3.mo14790b().mo14717a(this.f4702a, cVar.f4464q);
                }
                if (cVar.f4464q.f4422b == 1) {
                    i2 = 6;
                }
                Integer a = C1950m1.m4714a(cVar.f4464q.f4436p);
                if (a != null) {
                    i2 = a.intValue();
                }
                cVar.mo14287o();
                C1883d dVar = cVar.f4455h;
                dVar.getClass();
                C1883d.C1884a aVar = new C1883d.C1884a(12);
                aVar.f4700c = cVar;
                this.f4702a.mo14701a(i2, cVar, (Runnable) aVar, this);
                this.f4703b.mo14706a();
                return;
            }
            return;
        }
        C1874e.m4311e(new C1868a("show_ad_already_visible_error", "", cVar.mo14280e().mo14553a(), cVar.mo14282g()));
        CBLogging.m3993b("CBViewController", "Impression already visible");
        cVar.mo14273a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
    }

    /* renamed from: a */
    public void mo14507a(C1838c cVar) {
        CBLogging.m3995c("CBViewController", "Dismissing impression");
        C1886a aVar = new C1886a(cVar, cVar.f4455h.mo14494e());
        if (cVar.f4444A) {
            cVar.mo14274a((Runnable) aVar);
        } else {
            aVar.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14510b(C1838c cVar) {
        if (cVar.f4449b != 0) {
            m4390c(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14511d(C1838c cVar) {
        RelativeLayout f = cVar.mo14281f();
        CBError.CBImpressionError a = cVar.mo14271a(f);
        C1887f.C1889b j = cVar.mo14284j();
        if (f == null || j == null) {
            cVar.mo14273a(CBError.CBImpressionError.ERROR_DISPLAYING_VIEW);
        } else if (a != null) {
            cVar.mo14273a(a);
        } else {
            cVar.f4449b = 2;
            f.addView(j);
            this.f4703b.mo14706a();
        }
    }

    /* renamed from: e */
    public void mo14512e(C1838c cVar) {
        CBLogging.m3995c("CBViewController", "Removing impression");
        cVar.f4449b = 5;
        cVar.mo14276b();
        String str = null;
        this.f4706e = null;
        this.f4703b.mo14711c();
        C1836a aVar = cVar.f4464q;
        if (aVar != null) {
            str = aVar.f4429i;
        }
        Handler handler = this.f4705d;
        C1894a aVar2 = cVar.f4450c;
        aVar2.getClass();
        handler.post(new C1894a.C1895a(3, cVar.f4460m, (CBError.CBImpressionError) null, (ChartboostError) null, true, str));
        if (cVar.mo14270I()) {
            Handler handler2 = this.f4705d;
            C1894a aVar3 = cVar.f4450c;
            aVar3.getClass();
            handler2.post(new C1894a.C1895a(2, cVar.f4460m, (CBError.CBImpressionError) null, (ChartboostError) null, true, str));
        }
        mo14509a(cVar.f4455h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo14513f(C1838c cVar) {
        CBLogging.m3995c("CBViewController", "Removing impression silently");
        cVar.mo14272a();
        try {
            ((ViewGroup) this.f4706e.getParent()).removeView(this.f4706e);
        } catch (Exception e) {
            CBLogging.m3992a("CBViewController", "Exception removing impression silently", e);
        }
        this.f4706e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14508a(C1838c cVar, Activity activity) {
        C1883d dVar = cVar.f4455h;
        dVar.getClass();
        C1883d.C1884a aVar = new C1883d.C1884a(14);
        aVar.f4700c = cVar;
        this.f4705d.post(aVar);
        cVar.mo14292t();
        CBUtility.m4007b(activity, cVar.f4464q.f4422b, this.f4704c.get());
        if (this.f4707f != -1) {
            int i = cVar.f4448a;
            if (i == 1 || i == 2) {
                activity.getWindow().getDecorView().setSystemUiVisibility(this.f4707f);
                this.f4707f = -1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14509a(C1883d dVar) {
        CBLogging.m3995c("CBViewController", "Attempting to close impression activity");
        Activity e = dVar.mo14494e();
        if (e != null && (e instanceof CBImpressionActivity)) {
            CBLogging.m3995c("CBViewController", "Closing impression activity");
            dVar.mo14484a();
            e.finish();
        }
    }

    /* renamed from: a */
    public C1979s1 mo14506a() {
        return this.f4706e;
    }
}
