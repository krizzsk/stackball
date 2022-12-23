package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C9424io;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.gv */
public class C9336gv extends C9365hg {

    /* renamed from: h */
    private static final String f23076h = C9336gv.class.getSimpleName();

    /* renamed from: i */
    private static C9336gv f23077i;

    /* renamed from: a */
    final String f23078a;

    /* renamed from: b */
    final C9382hr f23079b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C9344gz f23080j;

    /* renamed from: k */
    private boolean f23081k;

    /* renamed from: l */
    private boolean f23082l;

    /* renamed from: m */
    private long f23083m;

    /* renamed from: n */
    private Context f23084n;

    /* renamed from: o */
    private C9424io f23085o;

    /* renamed from: p */
    private Activity f23086p;

    /* renamed from: q */
    private C9347ha f23087q;

    /* renamed from: r */
    private Handler f23088r;

    /* renamed from: s */
    private Runnable f23089s;

    /* renamed from: a */
    public static void m25034a() {
        C9336gv gvVar = f23077i;
        if (gvVar != null) {
            C93371 r1 = new Runnable(gvVar) {

                /* renamed from: a */
                final /* synthetic */ C9336gv f23090a;

                {
                    this.f23090a = r1;
                }

                public final void run() {
                    C9336gv.m25036a(this.f23090a);
                }
            };
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null && mainLooper.getThread() == Thread.currentThread()) {
                r1.run();
            } else {
                C9501u.m25539a().post(r1);
            }
        }
    }

    public C9336gv(C9344gz gzVar, String str, C9382hr hrVar, Context context) {
        this.f23080j = gzVar;
        this.f23078a = str;
        this.f23079b = hrVar;
        this.f23084n = context;
    }

    /* renamed from: b */
    public final void mo58224b() {
        Iterator it = this.f23079b.f23250a.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C9403ia) it.next()).f23323c.iterator();
            while (it2.hasNext()) {
                C9400hz hzVar = (C9400hz) it2.next();
                if (hzVar.f23317l != null) {
                    hzVar.f23317l.mo58330b();
                }
                if (hzVar.f23318m != null) {
                    hzVar.f23318m.mo58330b();
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo58225c() {
        Iterator it = this.f23079b.f23250a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Iterator it2 = ((C9403ia) it.next()).f23323c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    continue;
                    break;
                }
                C9400hz hzVar = (C9400hz) it2.next();
                if ((hzVar.f23317l == null || hzVar.f23317l.mo58329a()) && (hzVar.f23318m == null || hzVar.f23318m.mo58329a())) {
                }
            }
            z = false;
            continue;
            if (!z) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo58223a(C9347ha haVar, C9293fw fwVar) {
        this.f23087q = haVar;
        Activity a = C9330gr.m25022a();
        this.f23086p = a;
        if (a != null && !a.isFinishing()) {
            try {
                m25035a(this.f23086p, haVar, fwVar);
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity a2 = C9051a.m24280a(this.f23084n);
        this.f23086p = a2;
        if (a2 != null && !a2.isFinishing()) {
            try {
                m25035a(this.f23086p, haVar, fwVar);
                return;
            } catch (WindowManager.BadTokenException unused2) {
            }
        }
        C9340gw.m25049b("Failed to show the content for \"{}\". No usable activity found.", this.f23078a);
        haVar.mo57312a(this.f23078a, this.f23185f, (C9324gl) null);
    }

    /* renamed from: a */
    private void m25035a(final Activity activity, final C9347ha haVar, C9293fw fwVar) {
        if (this.f23081k) {
            TapjoyLog.m24274e(f23076h, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.f23081k = true;
        this.f23082l = true;
        f23077i = this;
        this.f23186g = fwVar.f22972a;
        this.f23085o = new C9424io(activity, this.f23079b, new C9424io.C9427a() {
            /* renamed from: a */
            public final void mo58228a(C9400hz hzVar) {
                C9292fv fvVar;
                if (!(!(C9336gv.this.f23186g instanceof C9292fv) || (fvVar = (C9292fv) C9336gv.this.f23186g) == null || fvVar.f22971c == null)) {
                    fvVar.f22971c.mo58146a();
                }
                C9336gv.this.f23080j.mo58244a(C9336gv.this.f23079b.f23251b, hzVar.f23316k);
                if (!C9465jq.m25449c(hzVar.f23313h)) {
                    C9336gv.this.f23184e.mo57541a(activity, hzVar.f23313h, C9465jq.m25448b(hzVar.f23314i));
                    C9336gv.this.f23183d = true;
                } else if (!C9465jq.m25449c(hzVar.f23312g)) {
                    C9365hg.m25169a((Context) activity, hzVar.f23312g);
                }
                haVar.mo57311a(C9336gv.this.f23078a, (C9324gl) null);
                if (hzVar.f23315j) {
                    C9336gv.m25036a(C9336gv.this);
                }
            }

            /* renamed from: a */
            public final void mo58227a() {
                C9336gv.m25036a(C9336gv.this);
            }
        });
        Window window = activity.getWindow();
        C9424io ioVar = this.f23085o;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        Window.Callback callback = window.getCallback();
        window.setCallback((Window.Callback) null);
        window.addContentView(ioVar, layoutParams);
        window.setCallback(callback);
        this.f23083m = SystemClock.elapsedRealtime();
        this.f23080j.mo58242a(this.f23079b.f23251b);
        fwVar.mo58153a();
        C9285fq fqVar = this.f23186g;
        if (fqVar != null) {
            fqVar.mo58149b();
        }
        haVar.mo57314c(this.f23078a);
        if (this.f23079b.f23252c > 0.0f) {
            this.f23088r = new Handler(Looper.getMainLooper());
            C93393 r5 = new Runnable() {
                public final void run() {
                    C9336gv.m25036a(C9336gv.this);
                }
            };
            this.f23089s = r5;
            this.f23088r.postDelayed(r5, (long) (this.f23079b.f23252c * 1000.0f));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25036a(C9336gv gvVar) {
        C9347ha haVar;
        if (gvVar.f23082l) {
            gvVar.f23082l = false;
            Handler handler = gvVar.f23088r;
            if (handler != null) {
                handler.removeCallbacks(gvVar.f23089s);
                gvVar.f23089s = null;
                gvVar.f23088r = null;
            }
            if (f23077i == gvVar) {
                f23077i = null;
            }
            gvVar.f23080j.mo58243a(gvVar.f23079b.f23251b, SystemClock.elapsedRealtime() - gvVar.f23083m);
            if (!gvVar.f23183d && (haVar = gvVar.f23087q) != null) {
                haVar.mo57312a(gvVar.f23078a, gvVar.f23185f, (C9324gl) null);
                gvVar.f23087q = null;
            }
            ViewGroup viewGroup = (ViewGroup) gvVar.f23085o.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(gvVar.f23085o);
            }
            gvVar.f23085o = null;
            Activity activity = gvVar.f23086p;
            if (activity instanceof TJContentActivity) {
                activity.finish();
            }
            gvVar.f23086p = null;
        }
    }
}
