package com.chartboost.sdk.Model;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.chartboost.sdk.C1892h;
import com.chartboost.sdk.Libraries.C1823d;
import com.chartboost.sdk.Libraries.C1832j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Networking.C1856h;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.Tracking.C1876g;
import com.chartboost.sdk.impl.C1909e1;
import com.chartboost.sdk.impl.C1912f1;
import com.chartboost.sdk.impl.C1919g1;
import com.chartboost.sdk.impl.C1935i1;
import com.chartboost.sdk.impl.C1995w0;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Model.g */
public class C1842g {

    /* renamed from: a */
    public final C1823d f4491a;

    /* renamed from: b */
    public final C1856h f4492b;

    /* renamed from: c */
    public final AtomicReference<C1844h> f4493c;

    /* renamed from: d */
    public final C1832j f4494d;

    /* renamed from: e */
    public final String f4495e;

    /* renamed from: f */
    public final String f4496f;

    /* renamed from: g */
    public final String f4497g;

    /* renamed from: h */
    public final String f4498h;

    /* renamed from: i */
    public String f4499i;

    /* renamed from: j */
    public String f4500j;

    /* renamed from: k */
    public final String f4501k;

    /* renamed from: l */
    public final String f4502l;

    /* renamed from: m */
    public final String f4503m;

    /* renamed from: n */
    public final String f4504n;

    /* renamed from: o */
    public final JSONObject f4505o;

    /* renamed from: p */
    public final String f4506p;

    /* renamed from: q */
    public final boolean f4507q;

    /* renamed from: r */
    public final String f4508r;

    /* renamed from: s */
    public final C1995w0 f4509s;

    /* renamed from: t */
    private final C1876g f4510t;

    /* renamed from: u */
    private final Context f4511u;

    /* renamed from: com.chartboost.sdk.Model.g$a */
    public static class C1843a {

        /* renamed from: a */
        public int f4512a = 0;

        /* renamed from: b */
        public int f4513b = 0;

        /* renamed from: c */
        public int f4514c = 0;

        /* renamed from: d */
        public int f4515d = 0;

        /* renamed from: e */
        public float f4516e = 0.0f;

        /* renamed from: f */
        public String f4517f = "";
    }

    public C1842g(Context context, String str, C1823d dVar, C1856h hVar, AtomicReference<C1844h> atomicReference, SharedPreferences sharedPreferences, C1832j jVar, C1912f1 f1Var, C1876g gVar, C1995w0 w0Var) {
        String str2;
        this.f4511u = context;
        this.f4491a = dVar;
        this.f4492b = hVar;
        this.f4493c = atomicReference;
        this.f4494d = jVar;
        this.f4510t = gVar;
        this.f4509s = w0Var;
        this.f4502l = str;
        if ("sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || ((str2 = Build.MANUFACTURER) != null && str2.contains("Genymotion"))) {
            this.f4495e = "Android Simulator";
        } else {
            this.f4495e = Build.MODEL;
        }
        this.f4503m = Build.MANUFACTURER + " " + Build.MODEL;
        this.f4504n = C1935i1.m4638d(context);
        this.f4496f = "Android " + Build.VERSION.RELEASE;
        this.f4497g = Locale.getDefault().getCountry();
        this.f4498h = Locale.getDefault().getLanguage();
        this.f4501k = "8.2.1";
        try {
            String packageName = context.getPackageName();
            this.f4499i = context.getPackageManager().getPackageInfo(packageName, 128).versionName;
            this.f4500j = packageName;
        } catch (Exception e) {
            CBLogging.m3992a("RequestBody", "Exception raised getting package mager object", e);
        }
        C1909e1 a = m4135a(context, f1Var);
        this.f4506p = m4136a(a);
        this.f4505o = m4137a(a, f1Var);
        this.f4507q = CBUtility.m4014f();
        this.f4508r = CBUtility.m4012d();
        hVar.mo14336a(context);
    }

    /* renamed from: a */
    public int mo14304a() {
        return this.f4492b.mo14336a(this.f4511u);
    }

    /* renamed from: b */
    public int mo14306b() {
        return this.f4492b.mo14338b();
    }

    /* renamed from: c */
    public String mo14307c() {
        return this.f4492b.mo14337a();
    }

    /* renamed from: d */
    public C1843a mo14308d() {
        C1843a aVar = new C1843a();
        Context context = this.f4511u;
        if (context == null) {
            return aVar;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        aVar.f4512a = displayMetrics.widthPixels;
        aVar.f4513b = displayMetrics.heightPixels;
        DisplayMetrics displayMetrics2 = (DisplayMetrics) C1892h.m4431a().mo14549a(new DisplayMetrics());
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) this.f4511u.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
        }
        aVar.f4514c = displayMetrics2.widthPixels;
        aVar.f4515d = displayMetrics2.heightPixels;
        aVar.f4516e = displayMetrics2.density;
        aVar.f4517f = "" + displayMetrics2.densityDpi;
        return aVar;
    }

    /* renamed from: e */
    public C1823d.C1824a mo14309e() {
        return this.f4491a.mo14231c(this.f4511u);
    }

    /* renamed from: f */
    public int mo14310f() {
        return this.f4509s.mo14854a();
    }

    /* renamed from: g */
    public int mo14311g() {
        return this.f4509s.mo14858b();
    }

    /* renamed from: h */
    public JSONObject mo14312h() {
        return this.f4509s.mo14860c();
    }

    /* renamed from: i */
    public C1876g mo14313i() {
        return this.f4510t;
    }

    /* renamed from: j */
    public int mo14314j() {
        C1876g gVar = this.f4510t;
        if (gVar != null) {
            return gVar.mo14449c();
        }
        return -1;
    }

    /* renamed from: k */
    public List<DataUseConsent> mo14315k() {
        return this.f4509s.mo14861d();
    }

    /* renamed from: l */
    public boolean mo14316l() {
        return CBUtility.m4009b(CBUtility.m4006b(this.f4511u));
    }

    /* renamed from: a */
    private String m4136a(C1909e1 e1Var) {
        return e1Var != null ? e1Var.mo14595d() : "";
    }

    /* renamed from: a */
    private JSONObject m4137a(C1909e1 e1Var, C1912f1 f1Var) {
        if (e1Var == null || f1Var == null) {
            return new JSONObject();
        }
        return mo14305a(e1Var, new C1919g1());
    }

    /* renamed from: a */
    private C1909e1 m4135a(Context context, C1912f1 f1Var) {
        if (f1Var != null) {
            return f1Var.mo14599a(context);
        }
        return null;
    }

    /* renamed from: a */
    public JSONObject mo14305a(C1909e1 e1Var, C1919g1 g1Var) {
        if (g1Var != null) {
            return g1Var.mo14621a(e1Var);
        }
        return new JSONObject();
    }
}
