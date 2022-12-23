package com.p243my.target;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p243my.target.C7346c6;
import com.p243my.target.C7409g0;
import com.p243my.target.C7516l1;
import com.p243my.target.C7596p1;
import com.p243my.target.C7733x4;
import com.p243my.target.ads.Reward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.o4 */
public class C7583o4 implements C7733x4, C7516l1.C7518b {

    /* renamed from: a */
    public final C7346c6 f19126a;

    /* renamed from: b */
    public final C7580o1 f19127b;

    /* renamed from: c */
    public final C7516l1 f19128c;

    /* renamed from: d */
    public final WeakReference<Activity> f19129d;

    /* renamed from: e */
    public final Context f19130e;

    /* renamed from: f */
    public String f19131f;

    /* renamed from: g */
    public Integer f19132g;

    /* renamed from: h */
    public boolean f19133h;

    /* renamed from: i */
    public C7559n1 f19134i;

    /* renamed from: j */
    public C7457i6 f19135j;

    /* renamed from: k */
    public boolean f19136k;

    /* renamed from: l */
    public C7733x4.C7734a f19137l;

    /* renamed from: m */
    public boolean f19138m;

    /* renamed from: n */
    public C7359d2 f19139n;

    /* renamed from: o */
    public long f19140o;

    /* renamed from: p */
    public long f19141p;

    /* renamed from: q */
    public final Handler f19142q;

    /* renamed from: r */
    public final C7586c f19143r;

    /* renamed from: s */
    public final C7722w5 f19144s;

    /* renamed from: t */
    public C7432h0 f19145t;

    /* renamed from: com.my.target.o4$a */
    public class C7584a implements View.OnClickListener {
        public C7584a() {
        }

        public void onClick(View view) {
            C7583o4.this.mo51289i();
        }
    }

    /* renamed from: com.my.target.o4$b */
    public class C7585b implements C7409g0.C7411b {

        /* renamed from: a */
        public final /* synthetic */ C7768z1 f19147a;

        public C7585b(C7768z1 z1Var) {
            this.f19147a = z1Var;
        }

        /* renamed from: a */
        public void mo49488a(Context context) {
            if (C7583o4.this.f19137l != null) {
                C7583o4.this.f19137l.mo51333a(this.f19147a, context);
            }
        }
    }

    /* renamed from: com.my.target.o4$c */
    public static class C7586c implements Runnable {

        /* renamed from: a */
        public final C7346c6 f19149a;

        public C7586c(C7346c6 c6Var) {
            this.f19149a = c6Var;
        }

        public void run() {
            C7374e0.m18989a("banner became just closeable");
            this.f19149a.setCloseVisible(true);
        }
    }

    public C7583o4(Context context) {
        this(C7516l1.m19650b("interstitial"), new Handler(Looper.getMainLooper()), new C7346c6(context), context);
    }

    public C7583o4(C7516l1 l1Var, Handler handler, C7346c6 c6Var, Context context) {
        this.f19133h = true;
        this.f19134i = C7559n1.m19904b();
        this.f19128c = l1Var;
        this.f19130e = context.getApplicationContext();
        this.f19142q = handler;
        this.f19126a = c6Var;
        this.f19129d = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>((Object) null);
        this.f19131f = "loading";
        this.f19127b = C7580o1.m19988e();
        c6Var.setOnCloseListener(new C7346c6.C7347a() {
            /* renamed from: d */
            public final void mo49437d() {
                C7583o4.this.mo51290k();
            }
        });
        this.f19143r = new C7586c(c6Var);
        this.f19144s = new C7722w5(context);
        l1Var.mo50756a((C7516l1.C7518b) this);
    }

    /* renamed from: a */
    public static C7583o4 m20000a(Context context) {
        return new C7583o4(context);
    }

    /* renamed from: a */
    public void mo50705a() {
        this.f19136k = false;
        C7457i6 i6Var = this.f19135j;
        if (i6Var != null) {
            i6Var.mo49590e();
        }
        long j = this.f19140o;
        if (j > 0) {
            mo51281a(j);
        }
    }

    /* renamed from: a */
    public void mo50706a(int i) {
        C7457i6 i6Var;
        this.f19142q.removeCallbacks(this.f19143r);
        if (!this.f19136k) {
            this.f19136k = true;
            if (i <= 0 && (i6Var = this.f19135j) != null) {
                i6Var.mo50403a(true);
            }
        }
        ViewParent parent = this.f19126a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f19126a);
        }
        this.f19128c.mo50753a();
        C7457i6 i6Var2 = this.f19135j;
        if (i6Var2 != null) {
            i6Var2.mo49584a(i);
            this.f19135j = null;
        }
        this.f19126a.removeAllViews();
    }

    /* renamed from: a */
    public final void mo51281a(long j) {
        this.f19142q.removeCallbacks(this.f19143r);
        this.f19141p = System.currentTimeMillis();
        this.f19142q.postDelayed(this.f19143r, j);
    }

    /* renamed from: a */
    public void mo50771a(C7516l1 l1Var, WebView webView) {
        C7359d2 d2Var;
        this.f19131f = Reward.DEFAULT;
        mo51293n();
        ArrayList arrayList = new ArrayList();
        if (mo51291l()) {
            arrayList.add("'inlineVideo'");
        }
        arrayList.add("'vpaid'");
        l1Var.mo50760a((ArrayList<String>) arrayList);
        l1Var.mo50768d("interstitial");
        l1Var.mo50761a(l1Var.mo50766c());
        mo51287c(Reward.DEFAULT);
        l1Var.mo50767d();
        l1Var.mo50757a(this.f19127b);
        C7733x4.C7734a aVar = this.f19137l;
        if (aVar != null && (d2Var = this.f19139n) != null) {
            aVar.mo51334a((C7768z1) d2Var, (View) this.f19126a);
            this.f19137l.mo51759a(webView);
        }
    }

    /* renamed from: a */
    public void mo50708a(C7665t2 t2Var, C7359d2 d2Var) {
        this.f19139n = d2Var;
        long allowCloseDelay = (long) (d2Var.getAllowCloseDelay() * 1000.0f);
        this.f19140o = allowCloseDelay;
        if (allowCloseDelay > 0) {
            this.f19126a.setCloseVisible(false);
            C7374e0.m18989a("banner will be allowed to close in " + this.f19140o + " millis");
            mo51281a(this.f19140o);
        } else {
            C7374e0.m18989a("banner is allowed to close");
            this.f19126a.setCloseVisible(true);
        }
        String source = d2Var.getSource();
        if (source != null) {
            mo51285b(source);
        }
        mo51282a((C7768z1) d2Var);
    }

    /* renamed from: a */
    public void mo50709a(C7733x4.C7734a aVar) {
        this.f19137l = aVar;
    }

    /* renamed from: a */
    public final void mo51282a(C7768z1 z1Var) {
        C7596p1 adChoices = z1Var.getAdChoices();
        if (adChoices == null) {
            this.f19144s.setVisibility(8);
        } else if (this.f19144s.getParent() == null) {
            int a = C7761y8.m20931a(10, this.f19130e);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(a, a, a, a);
            this.f19126a.addView(this.f19144s, layoutParams);
            this.f19144s.setImageBitmap(adChoices.mo51318c().getBitmap());
            this.f19144s.setOnClickListener(new C7584a());
            List<C7596p1.C7597a> a2 = adChoices.mo51315a();
            if (a2 != null) {
                C7432h0 a3 = C7432h0.m19222a(a2);
                this.f19145t = a3;
                a3.mo50261a((C7409g0.C7411b) new C7585b(z1Var));
            }
        }
    }

    /* renamed from: a */
    public void mo50772a(boolean z) {
        this.f19128c.mo50761a(z);
    }

    /* renamed from: a */
    public boolean mo50773a(float f, float f2) {
        C7733x4.C7734a aVar;
        C7359d2 d2Var;
        if (!this.f19138m) {
            this.f19128c.mo50759a("playheadEvent", "Calling VPAID command before VPAID init");
            return false;
        } else if (f < 0.0f || f2 < 0.0f || (aVar = this.f19137l) == null || (d2Var = this.f19139n) == null) {
            return true;
        } else {
            aVar.mo51760a(d2Var, f, f2, this.f19130e);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo51283a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public boolean mo50774a(int i, int i2, int i3, int i4, boolean z, int i5) {
        C7374e0.m18989a("setResizeProperties method not used with interstitials");
        return false;
    }

    /* renamed from: a */
    public boolean mo50775a(Uri uri) {
        C7374e0.m18989a("Expand method not used with interstitials");
        return false;
    }

    /* renamed from: a */
    public boolean mo50776a(ConsoleMessage consoleMessage, C7516l1 l1Var) {
        C7374e0.m18989a("Console message: " + consoleMessage.message());
        return true;
    }

    /* renamed from: a */
    public boolean mo51284a(C7559n1 n1Var) {
        if ("none".equals(n1Var.toString())) {
            return true;
        }
        Activity activity = (Activity) this.f19129d.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            int i = activityInfo.screenOrientation;
            return i != -1 ? i == n1Var.mo50958a() : mo51283a(activityInfo.configChanges, 128) && mo51283a(activityInfo.configChanges, 1024);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo50777a(String str) {
        boolean z = false;
        if (!this.f19138m) {
            this.f19128c.mo50759a("vpaidEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        C7733x4.C7734a aVar = this.f19137l;
        boolean z2 = aVar != null;
        C7359d2 d2Var = this.f19139n;
        if (d2Var != null) {
            z = true;
        }
        if (z && z2) {
            aVar.mo51762b(d2Var, str, this.f19130e);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo50778a(String str, JsResult jsResult) {
        C7374e0.m18989a("JS Alert: " + str);
        jsResult.confirm();
        return true;
    }

    /* renamed from: a */
    public boolean mo50779a(boolean z, C7559n1 n1Var) {
        if (!mo51284a(n1Var)) {
            C7516l1 l1Var = this.f19128c;
            l1Var.mo50759a("setOrientationProperties", "Unable to force orientation to " + n1Var);
            return false;
        }
        this.f19133h = z;
        this.f19134i = n1Var;
        return mo51288h();
    }

    /* renamed from: b */
    public void mo50711b() {
        this.f19136k = true;
        C7457i6 i6Var = this.f19135j;
        if (i6Var != null) {
            i6Var.mo50403a(false);
        }
        this.f19142q.removeCallbacks(this.f19143r);
        if (this.f19141p > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f19141p;
            if (currentTimeMillis > 0) {
                long j = this.f19140o;
                if (currentTimeMillis < j) {
                    this.f19140o = j - currentTimeMillis;
                    return;
                }
            }
            this.f19140o = 0;
        }
    }

    /* renamed from: b */
    public void mo50780b(Uri uri) {
        C7733x4.C7734a aVar = this.f19137l;
        if (aVar != null) {
            aVar.mo51335a(this.f19139n, uri.toString(), this.f19126a.getContext());
        }
    }

    /* renamed from: b */
    public void mo51285b(String str) {
        C7457i6 i6Var = new C7457i6(this.f19130e);
        this.f19135j = i6Var;
        this.f19128c.mo50755a(i6Var);
        this.f19126a.addView(this.f19135j, new FrameLayout.LayoutParams(-1, -1));
        this.f19128c.mo50770f(str);
    }

    /* renamed from: b */
    public boolean mo51286b(int i) {
        Activity activity = (Activity) this.f19129d.get();
        if (activity == null || !mo51284a(this.f19134i)) {
            C7516l1 l1Var = this.f19128c;
            l1Var.mo50759a("setOrientationProperties", "Attempted to lock orientation to unsupported value: " + this.f19134i.toString());
            return false;
        }
        if (this.f19132g == null) {
            this.f19132g = Integer.valueOf(activity.getRequestedOrientation());
        }
        activity.setRequestedOrientation(i);
        return true;
    }

    /* renamed from: c */
    public void mo50781c() {
        mo51293n();
    }

    /* renamed from: c */
    public final void mo51287c(String str) {
        C7374e0.m18989a("MRAID state set to " + str);
        this.f19131f = str;
        this.f19128c.mo50769e(str);
        if ("hidden".equals(str)) {
            C7374e0.m18989a("InterstitialMraidPresenter: Mraid on close");
            C7733x4.C7734a aVar = this.f19137l;
            if (aVar != null) {
                aVar.mo51332a();
            }
        }
    }

    /* renamed from: d */
    public void mo50782d() {
        mo51290k();
    }

    public void destroy() {
        mo50706a(0);
    }

    /* renamed from: e */
    public void mo50717e() {
        this.f19136k = true;
        C7457i6 i6Var = this.f19135j;
        if (i6Var != null) {
            i6Var.mo50403a(false);
        }
    }

    /* renamed from: f */
    public boolean mo50783f() {
        C7374e0.m18989a("resize method not used with interstitials");
        return false;
    }

    /* renamed from: g */
    public void mo50784g() {
        this.f19138m = true;
    }

    public View getCloseButton() {
        return null;
    }

    /* renamed from: h */
    public boolean mo51288h() {
        if (!"none".equals(this.f19134i.toString())) {
            return mo51286b(this.f19134i.mo50958a());
        }
        if (this.f19133h) {
            mo51292m();
            return true;
        }
        Activity activity = (Activity) this.f19129d.get();
        if (activity != null) {
            return mo51286b(C7761y8.m20932a(activity));
        }
        this.f19128c.mo50759a("setOrientationProperties", "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
        return false;
    }

    /* renamed from: i */
    public void mo51289i() {
        C7596p1 adChoices;
        C7359d2 d2Var = this.f19139n;
        if (d2Var != null && (adChoices = d2Var.getAdChoices()) != null) {
            C7432h0 h0Var = this.f19145t;
            if (h0Var == null || !h0Var.mo50266c()) {
                Activity activity = (Activity) this.f19129d.get();
                if (h0Var == null || activity == null) {
                    C7534l8.m19712a(adChoices.mo51317b(), this.f19130e);
                } else {
                    h0Var.mo50260a((Context) activity);
                }
            }
        }
    }

    /* renamed from: j */
    public View mo50719j() {
        return this.f19126a;
    }

    /* renamed from: k */
    public void mo51290k() {
        if (this.f19135j != null && !"loading".equals(this.f19131f) && !"hidden".equals(this.f19131f)) {
            mo51292m();
            if (Reward.DEFAULT.equals(this.f19131f)) {
                this.f19126a.setVisibility(4);
                mo51287c("hidden");
            }
        }
    }

    /* renamed from: l */
    public final boolean mo51291l() {
        C7457i6 i6Var;
        Activity activity = (Activity) this.f19129d.get();
        if (activity == null || (i6Var = this.f19135j) == null) {
            return false;
        }
        return C7761y8.m20941a(activity, (View) i6Var);
    }

    /* renamed from: m */
    public void mo51292m() {
        Integer num;
        Activity activity = (Activity) this.f19129d.get();
        if (!(activity == null || (num = this.f19132g) == null)) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.f19132g = null;
    }

    /* renamed from: n */
    public final void mo51293n() {
        DisplayMetrics displayMetrics = this.f19130e.getResources().getDisplayMetrics();
        this.f19127b.mo51272a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f19127b.mo51275b(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f19127b.mo51273a(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f19127b.mo51277c(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
