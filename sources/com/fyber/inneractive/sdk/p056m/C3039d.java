package com.fyber.inneractive.sdk.p056m;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.C2677R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.mraid.C3071a;
import com.fyber.inneractive.sdk.mraid.C3072aa;
import com.fyber.inneractive.sdk.mraid.C3073ab;
import com.fyber.inneractive.sdk.mraid.C3074b;
import com.fyber.inneractive.sdk.mraid.C3077e;
import com.fyber.inneractive.sdk.mraid.C3078f;
import com.fyber.inneractive.sdk.mraid.C3093s;
import com.fyber.inneractive.sdk.mraid.C3094t;
import com.fyber.inneractive.sdk.mraid.C3095u;
import com.fyber.inneractive.sdk.mraid.C3096v;
import com.fyber.inneractive.sdk.mraid.C3098x;
import com.fyber.inneractive.sdk.mraid.C3099y;
import com.fyber.inneractive.sdk.p049h.C2942af;
import com.fyber.inneractive.sdk.p049h.C2977r;
import com.fyber.inneractive.sdk.p056m.C3028a;
import com.fyber.inneractive.sdk.p056m.C3039d.C3051c;
import com.fyber.inneractive.sdk.p084ui.IAcloseButton;
import com.fyber.inneractive.sdk.util.C3629aj;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.m.d */
public abstract class C3039d<T extends C3051c> extends C3028a<T> {

    /* renamed from: a */
    private static final String[] f7488a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", CalendarEventParameters.DATE_FORMAT};

    /* renamed from: A */
    protected int f7489A = -1;

    /* renamed from: B */
    protected int f7490B = -1;

    /* renamed from: C */
    protected int f7491C = -1;

    /* renamed from: D */
    protected int f7492D = -1;

    /* renamed from: E */
    protected Orientation f7493E = Orientation.NONE;

    /* renamed from: F */
    private final int f7494F;

    /* renamed from: G */
    private final int f7495G;

    /* renamed from: H */
    private ViewGroup f7496H;

    /* renamed from: I */
    private C3037c f7497I;

    /* renamed from: J */
    private boolean f7498J = false;

    /* renamed from: K */
    private int f7499K;

    /* renamed from: L */
    private C3039d<T>.f f7500L;

    /* renamed from: M */
    private IAcloseButton f7501M;

    /* renamed from: N */
    private int f7502N;

    /* renamed from: O */
    private FrameLayout f7503O;

    /* renamed from: P */
    private FrameLayout f7504P;

    /* renamed from: Q */
    private RelativeLayout f7505Q;

    /* renamed from: R */
    private int f7506R;

    /* renamed from: S */
    private int f7507S;

    /* renamed from: u */
    protected C3072aa f7508u = C3072aa.HIDDEN;

    /* renamed from: v */
    protected C3052d f7509v;

    /* renamed from: w */
    public boolean f7510w;

    /* renamed from: x */
    protected float f7511x;

    /* renamed from: y */
    public int f7512y = -1;

    /* renamed from: z */
    public int f7513z = -1;

    /* renamed from: com.fyber.inneractive.sdk.m.d$c */
    public interface C3051c extends C3066l {
        /* renamed from: a */
        void mo18461a();

        /* renamed from: a */
        void mo18462a(InneractiveUnitController.AdDisplayError adDisplayError);

        /* renamed from: a */
        void mo18464a(boolean z);

        /* renamed from: a */
        void mo18465a(boolean z, Orientation orientation);

        /* renamed from: a */
        boolean mo18466a(String str);

        /* renamed from: c */
        void mo18469c();

        /* renamed from: d */
        void mo18470d();

        /* renamed from: e */
        void mo18471e();
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$d */
    public enum C3052d {
        INLINE,
        INTERSTITIAL
    }

    /* renamed from: u */
    public static void m7187u() {
    }

    /* renamed from: a */
    public void mo18603a(String str) {
    }

    public void setResizeProperties() {
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$h */
    public static abstract class C3056h implements C3051c {
        /* renamed from: a */
        public void mo18461a() {
        }

        /* renamed from: a */
        public void mo18463a(String str, String str2) {
        }

        /* renamed from: a */
        public void mo18464a(boolean z) {
        }

        /* renamed from: a */
        public boolean mo18466a(String str) {
            return false;
        }

        /* renamed from: b */
        public final void mo18468b(boolean z) {
        }

        /* renamed from: c */
        public void mo18469c() {
        }

        /* renamed from: d */
        public void mo18470d() {
        }

        /* renamed from: e */
        public void mo18471e() {
        }

        /* renamed from: a */
        public C3685u.C3686a mo18460a(String str, C3629aj ajVar) {
            return new C3685u.C3686a(C3685u.C3688c.FAILED, new Exception("Internal error"), "null");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$a */
    public enum C3049a {
        ;
        

        /* renamed from: a */
        public static final int f7526a = 1;

        /* renamed from: b */
        public static final int f7527b = 2;

        static {
            f7528c = new int[]{1, 2};
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$e */
    public enum C3053e {
        ;
        

        /* renamed from: a */
        public static final int f7536a = 1;

        /* renamed from: b */
        public static final int f7537b = 2;

        /* renamed from: c */
        public static final int f7538c = 3;

        static {
            f7539d = new int[]{1, 2, 3};
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$g */
    private class C3055g implements C3028a.C3033a {

        /* renamed from: a */
        C3071a f7543a;

        /* renamed from: b */
        C3629aj f7544b;

        C3055g(C3071a aVar, C3629aj ajVar) {
            this.f7543a = aVar;
            this.f7544b = ajVar;
        }

        /* renamed from: a */
        public final String mo18574a() {
            return this.f7543a.f7580a;
        }

        /* renamed from: b */
        public final String mo18575b() {
            return this.f7543a.mo18657a();
        }

        /* renamed from: c */
        public final void mo18576c() {
            this.f7543a.mo18664d();
        }

        /* renamed from: d */
        public final void mo18577d() {
            C3071a aVar = this.f7543a;
            if (aVar != null) {
                aVar.mo18659c();
            }
        }

        public final String toString() {
            return "action = " + this.f7543a.f7580a + " url = " + this.f7543a.mo18657a();
        }
    }

    public C3039d(Context context, boolean z, C3052d dVar, int i, int i2) {
        super(context, z);
        this.f7509v = dVar;
        this.f7494F = i;
        this.f7495G = i2;
    }

    /* renamed from: a */
    public boolean mo18549a(String str, C3629aj ajVar) {
        if (!CampaignEx.JSON_KEY_MRAID.equals(Uri.parse(str).getScheme())) {
            return false;
        }
        m7177a(URI.create(str), ajVar);
        return true;
    }

    /* renamed from: c */
    public final C3685u.C3686a mo18607c(String str, C3629aj ajVar) {
        String str2;
        if (this.f7454g != null) {
            return ((C3051c) this.f7454g).mo18460a(str, ajVar);
        }
        C3685u.C3688c cVar = C3685u.C3688c.FAILED;
        Exception exc = new Exception("No webview listener available");
        if (mo18618v() == null) {
            str2 = "null";
        } else {
            str2 = mo18618v().getClass().getName();
        }
        return new C3685u.C3686a(cVar, exc, str2);
    }

    /* renamed from: a */
    private boolean m7177a(URI uri, C3629aj ajVar) {
        int i;
        String host = uri.getHost();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && rawQuery.length() > 0) {
                for (String str : rawQuery.split("&")) {
                    int indexOf = str.indexOf("=");
                    linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
                }
            }
            C3074b a = C3078f.m7279a(host, linkedHashMap, this, ajVar);
            if (a != null) {
                if (!(a instanceof C3077e) || this.f7509v != C3052d.INTERSTITIAL) {
                    a.f7580a = host;
                    IAlog.m9033a("Processing MRaid command: %s", host);
                    if (a instanceof C3071a) {
                        mo18548a((C3028a.C3033a) new C3055g((C3071a) a, ajVar));
                    } else {
                        if (a.mo18658b()) {
                            mo18564m();
                        }
                        a.mo18664d();
                    }
                }
                return true;
            }
            if (this.f7450c != null) {
                this.f7450c.mo18579a("window.mraidbridge.nativeCallComplete('" + host + "');");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18561j() {
        int i;
        super.mo18561j();
        this.f7508u = C3072aa.LOADING;
        Context v = mo18618v();
        if (v instanceof Activity) {
            i = ((Activity) v).getRequestedOrientation();
        } else {
            i = -1;
        }
        this.f7499K = i;
        this.f7504P = new FrameLayout(mo18618v());
        this.f7505Q = new RelativeLayout(mo18618v());
        FrameLayout frameLayout = new FrameLayout(mo18618v());
        frameLayout.setBackgroundColor(-858993460);
        this.f7503O = frameLayout;
        mo18606b(v);
        this.f7450c.setOnKeyListener(new View.OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4 || !C3039d.this.mo18611q()) {
                    return false;
                }
                IAlog.m9033a("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
                C3039d.this.mo18613s();
                return true;
            }
        });
    }

    public void setAdDefaultSize(int i, int i2) {
        this.f7506R = i;
        this.f7507S = i2;
        this.f7491C = i;
        this.f7492D = i2;
    }

    /* renamed from: b */
    public final void mo18606b(Context context) {
        int i;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.f7511x = displayMetrics.density;
        int i2 = 0;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i2 = rect.top;
            i = window.findViewById(16908290).getTop() - i2;
        } else {
            i = 0;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        double d = (double) i3;
        this.f7512y = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * d);
        this.f7513z = (int) (((double) i4) * (160.0d / ((double) displayMetrics.densityDpi)));
        int i5 = (displayMetrics.heightPixels - i2) - i;
        if (mo18556e().getScaleX() == 1.0f || mo18556e().getScaleY() == 1.0f) {
            this.f7489A = (int) (d * (160.0d / ((double) displayMetrics.densityDpi)));
            this.f7490B = (int) (((double) i5) * (160.0d / ((double) displayMetrics.densityDpi)));
            return;
        }
        this.f7512y = mo18556e().getWidthDp();
        this.f7513z = mo18556e().getHeightDp();
        int b = (C3657l.m9119b(mo18556e().getHeightDp()) - i2) - i;
        this.f7489A = this.f7512y;
        this.f7490B = (int) (((double) b) * (160.0d / ((double) displayMetrics.densityDpi)));
    }

    /* renamed from: b */
    public final void mo18551b(boolean z) {
        mo19531b();
        C3037c cVar = this.f7497I;
        if (!(cVar == null || cVar.getParent() == null || !(this.f7497I.getParent() instanceof ViewGroup))) {
            ((ViewGroup) this.f7497I.getParent()).removeView(this.f7497I);
            this.f7497I = null;
        }
        m7188z();
        this.f7449b = false;
        super.mo18551b(z);
    }

    /* renamed from: b */
    private void mo19531b() {
        try {
            if (this.f7500L != null) {
                IAlog.m9034b("%sunregistering orientation broadcast receiver", IAlog.m9029a((Object) this));
                C3039d<T>.f fVar = this.f7500L;
                try {
                    IAlog.m9034b("%sunregister screen broadcast receiver called", IAlog.m9029a((Object) C3039d.this));
                    if (fVar.f7540a != null) {
                        IAlog.m9034b("%sunregistering broadcast receiver", IAlog.m9029a((Object) C3039d.this));
                        fVar.f7540a.unregisterReceiver(fVar);
                        fVar.f7540a = null;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (IllegalArgumentException e) {
            if (!e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.f7500L = null;
    }

    /* renamed from: a */
    public void mo18599a() {
        ArrayList arrayList = new ArrayList();
        if (mo18556e().getScaleX() == 1.0f || mo18556e().getScaleY() == 1.0f) {
            arrayList.add(C3098x.m7314a(this.f7512y, this.f7513z));
            arrayList.add(C3096v.m7311a(this.f7489A, this.f7490B));
        } else {
            arrayList.add(C3098x.m7314a(mo18556e().getWidthDp(), mo18556e().getHeightDp()));
            arrayList.add(C3096v.m7311a(mo18556e().getWidthDp(), mo18556e().getHeightDp()));
        }
        arrayList.add(C3095u.m7309a(C3657l.m9106a(mo18556e() != null ? mo18556e().getWidth() : this.f7489A), C3657l.m9106a(mo18556e() != null ? mo18556e().getHeight() : this.f7490B)));
        if (this.f7450c != null) {
            String arrayList2 = arrayList.toString();
            if (arrayList2.length() >= 2) {
                String str = "{" + arrayList2.substring(1, arrayList2.length() - 1) + "}";
                this.f7450c.mo18579a("window.mraidbridge.fireChangeEvent(" + str + ");");
                IAlog.m9033a("Fire changes: %s", str);
            }
        }
        C3072aa aaVar = C3072aa.f7574b;
        this.f7508u = aaVar;
        mo18602a((C3094t) C3099y.m7316a(aaVar));
    }

    /* renamed from: q */
    public final boolean mo18611q() {
        return this.f7508u == C3072aa.EXPANDED;
    }

    /* renamed from: r */
    public final boolean mo18612r() {
        return this.f7508u == C3072aa.RESIZED;
    }

    /* renamed from: s */
    public final void mo18613s() {
        this.f7498J = false;
        if (this.f7508u == C3072aa.EXPANDED || this.f7508u == C3072aa.RESIZED) {
            m7183e(false);
            if (this.f7450c != null) {
                if (this.f7508u == C3072aa.EXPANDED) {
                    m7188z();
                    ViewGroup viewGroup = (ViewGroup) this.f7503O.getParent();
                    if (viewGroup != null) {
                        viewGroup.addView(this.f7450c, this.f7502N, new FrameLayout.LayoutParams(this.f7506R, this.f7507S, 17));
                        viewGroup.removeView(this.f7503O);
                        viewGroup.invalidate();
                        this.f7450c.requestLayout();
                    }
                    this.f7491C = this.f7506R;
                    this.f7492D = this.f7507S;
                } else if (this.f7508u == C3072aa.RESIZED) {
                    this.f7491C = this.f7506R;
                    this.f7492D = this.f7507S;
                    this.f7450c.setLayoutParams(new FrameLayout.LayoutParams(this.f7506R, this.f7507S, 17));
                }
            }
            this.f7508u = C3072aa.f7574b;
            m7182d(false);
            mo18602a((C3094t) C3099y.m7316a(this.f7508u));
        } else if (this.f7508u == C3072aa.f7574b) {
            if (this.f7450c != null) {
                this.f7450c.setVisibility(4);
            }
            C3072aa aaVar = C3072aa.HIDDEN;
            this.f7508u = aaVar;
            mo18602a((C3094t) C3099y.m7316a(aaVar));
        }
        if (this.f7454g != null) {
            ((C3051c) this.f7454g).mo18471e();
        }
    }

    /* renamed from: a */
    public final void mo18604a(String str, int i, int i2, boolean z, boolean z2) {
        if (this.f7450c != null && this.f7494F != C3049a.f7527b && this.f7508u == C3072aa.f7574b) {
            if (str == null || URLUtil.isValidUrl(str)) {
                int i3 = 0;
                try {
                    ViewGroup viewGroup = (ViewGroup) this.f7450c.getRootView().findViewById(16908290);
                    this.f7496H = viewGroup;
                    if (viewGroup == null) {
                        IAlog.m9036d("Couldn't find content in the view tree", new Object[0]);
                        mo18601a(C3078f.C3080a.RESIZE, "Ad can be resized only if it's state is default or resized.");
                        return;
                    }
                    mo18608c(z);
                    m7182d(z2);
                    if (this.f7492D >= 0) {
                        this.f7492D = C3657l.m9119b(i2);
                    }
                    if (this.f7491C >= 0) {
                        this.f7491C = C3657l.m9119b(i);
                    }
                    C3037c cVar = this.f7450c;
                    if (str != null) {
                        C3037c cVar2 = new C3037c(mo18618v());
                        this.f7497I = cVar2;
                        cVar2.setId(C2677R.C2679id.inneractive_webview_mraid);
                        this.f7497I.loadUrl(str);
                        this.f7497I.setWebChromeClient(this.f7451d);
                        this.f7497I.setWebViewClient(this.f7452e);
                        cVar = this.f7497I;
                        cVar.setOnKeyListener(new View.OnKeyListener() {
                            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                                if (i != 4 || !C3039d.this.mo18611q()) {
                                    return false;
                                }
                                IAlog.m9033a("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
                                C3039d.this.mo18613s();
                                return true;
                            }
                        });
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) this.f7450c.getParent();
                        if (viewGroup2 != null) {
                            int childCount = viewGroup2.getChildCount();
                            while (i3 < childCount && viewGroup2.getChildAt(i3) != this.f7450c) {
                                i3++;
                            }
                            this.f7502N = i3;
                            C3670q.m9157a((View) this.f7503O);
                            viewGroup2.addView(this.f7503O, i3, new ViewGroup.LayoutParams(this.f7450c.getWidth(), this.f7450c.getHeight()));
                            viewGroup2.removeView(this.f7450c);
                        }
                    }
                    float f = this.f7511x;
                    int i4 = (int) ((50.0f * f) + 0.5f);
                    if (i2 >= 0 && i >= 0) {
                        i = (int) (((float) i) * f);
                        i2 = (int) (((float) i2) * f);
                        if (i < i4) {
                            i = i4;
                        }
                        if (i2 < i4) {
                            i2 = i4;
                        }
                    }
                    View view = new View(mo18618v());
                    view.setBackgroundColor(mo18618v().getResources().getColor(C2677R.color.ia_mraid_expanded_dimmed_bk));
                    view.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return true;
                        }
                    });
                    this.f7505Q.addView(view, new RelativeLayout.LayoutParams(-1, -1));
                    C3670q.m9157a((View) cVar);
                    this.f7504P.addView(cVar, new RelativeLayout.LayoutParams(-1, -1));
                    C3670q.m9157a((View) this.f7504P);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                    layoutParams.addRule(13);
                    this.f7505Q.addView(this.f7504P, layoutParams);
                    C3670q.m9157a((View) this.f7505Q);
                    this.f7496H.addView(this.f7505Q, new ViewGroup.LayoutParams(-1, -1));
                    if (cVar != null && !cVar.hasFocus()) {
                        cVar.requestFocus();
                    }
                    if (this.f7495G == C3053e.f7536a || (!this.f7510w && this.f7495G != C3053e.f7537b)) {
                        m7183e(true);
                    }
                    C3072aa aaVar = C3072aa.EXPANDED;
                    this.f7508u = aaVar;
                    mo18602a((C3094t) C3099y.m7316a(aaVar));
                    int i5 = this.f7491C;
                    if (!(i5 == -1 || this.f7492D == -1)) {
                        mo18602a((C3094t) C3093s.m7306a(C3657l.m9106a(i5), C3657l.m9106a(this.f7492D)));
                    }
                    if (this.f7454g != null) {
                        ((C3051c) this.f7454g).mo18469c();
                    }
                } catch (Exception unused) {
                    IAlog.m9036d("Couldn't find content in the view tree", new Object[0]);
                    mo18601a(C3078f.C3080a.RESIZE, "Ad can be resized only if it's state is default or resized.");
                }
            } else {
                mo18601a(C3078f.C3080a.EXPAND, "URL passed to expand() was invalid.");
            }
        }
    }

    /* renamed from: a */
    public final void mo18600a(int i, int i2, int i3, int i4, boolean z) {
        if (this.f7450c != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) this.f7450c.getRootView().findViewById(16908290);
                this.f7496H = viewGroup;
                if (viewGroup == null) {
                    IAlog.m9036d("Couldn't find content in the view tree", new Object[0]);
                    mo18601a(C3078f.C3080a.RESIZE, "Ad can be resized only if it's state is default or resized.");
                } else if (this.f7494F != C3049a.f7527b) {
                    if (this.f7508u != C3072aa.f7574b && this.f7508u != C3072aa.RESIZED) {
                        mo18601a(C3078f.C3080a.RESIZE, "Ad can be resized only if it's state is default or resized.");
                    } else if (i >= 0 || i2 >= 0) {
                        mo18608c(false);
                        if (this.f7495G == C3053e.f7536a || (!this.f7510w && this.f7495G != C3053e.f7537b)) {
                            m7183e(true);
                        }
                        m7182d(false);
                        this.f7492D = C3657l.m9119b(i2);
                        this.f7491C = C3657l.m9119b(i);
                        if (!z) {
                            int i5 = (i3 + i) - this.f7512y;
                            if (i5 > 0) {
                                i3 -= i5;
                            }
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            int i6 = (i4 + i2) - this.f7513z;
                            if (i6 > 0) {
                                i4 -= i6;
                            }
                            if (i4 < 0) {
                                i4 = 0;
                            }
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C3657l.m9119b(i), C3657l.m9119b(i2));
                        layoutParams.leftMargin = i3;
                        layoutParams.topMargin = i4;
                        if (i3 == 0 && i4 == 0) {
                            layoutParams.gravity = 17;
                        }
                        this.f7450c.setLayoutParams(layoutParams);
                        if (this.f7508u != C3072aa.RESIZED) {
                            C3072aa aaVar = C3072aa.RESIZED;
                            this.f7508u = aaVar;
                            mo18602a((C3094t) C3099y.m7316a(aaVar));
                            int i7 = this.f7491C;
                            if (!(i7 == -1 || this.f7492D == -1)) {
                                mo18602a((C3094t) C3093s.m7306a(C3657l.m9106a(i7), C3657l.m9106a(this.f7492D)));
                            }
                        }
                        if (this.f7454g != null) {
                            ((C3051c) this.f7454g).mo18470d();
                        }
                    } else {
                        mo18601a(C3078f.C3080a.RESIZE, "Creative size passed to resize() was invalid.");
                    }
                }
            } catch (Exception unused) {
                IAlog.m9036d("Couldn't find content in the view tree", new Object[0]);
                mo18601a(C3078f.C3080a.RESIZE, "Ad can be resized only if it's state is default or resized.");
            }
        }
    }

    /* renamed from: d */
    public final void mo18609d(final String str) {
        C3662m.m9137a().post(new Runnable() {
            public final void run() {
                Toast.makeText(C3657l.m9125p(), str, 0).show();
            }
        });
    }

    /* renamed from: t */
    public final void mo18617t() {
        mo18602a((C3094t) C3096v.m7311a(this.f7489A, this.f7490B));
    }

    /* renamed from: a */
    public final void mo18605a(Map<String, String> map) {
        boolean z;
        Map<String, String> map2 = map;
        Context v = mo18618v();
        if (C3656k.m9101m()) {
            try {
                HashMap hashMap = new HashMap();
                if (!map2.containsKey("description") || !map2.containsKey("start")) {
                    throw new IllegalArgumentException("Missing start and description fields");
                }
                hashMap.put("title", map2.get("description"));
                if (!map2.containsKey("start") || map2.get("start") == null) {
                    throw new IllegalArgumentException("Invalid calendar event: start is null.");
                }
                Date f = m7184f(map2.get("start"));
                if (f != null) {
                    hashMap.put("beginTime", Long.valueOf(f.getTime()));
                    if (map2.containsKey("end") && map2.get("end") != null) {
                        Date f2 = m7184f(map2.get("end"));
                        if (f2 != null) {
                            hashMap.put(SDKConstants.PARAM_END_TIME, Long.valueOf(f2.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map2.containsKey(FirebaseAnalytics.Param.LOCATION)) {
                        hashMap.put("eventLocation", map2.get(FirebaseAnalytics.Param.LOCATION));
                    }
                    if (map2.containsKey("summary")) {
                        hashMap.put("description", map2.get("summary"));
                    }
                    if (map2.containsKey("transparency")) {
                        hashMap.put("availability", Integer.valueOf(TJAdUnitConstants.String.TRANSPARENT.equals(map2.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (map2.containsKey("frequency")) {
                        String str = map2.get("frequency");
                        int parseInt = map2.containsKey(TJAdUnitConstants.String.INTERVAL) ? Integer.parseInt(map2.get(TJAdUnitConstants.String.INTERVAL)) : -1;
                        if ("daily".equals(str)) {
                            sb.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                        } else if ("weekly".equals(str)) {
                            sb.append("FREQ=WEEKLY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                            if (map2.containsKey("daysInWeek")) {
                                String g = m7185g(map2.get("daysInWeek"));
                                if (g != null) {
                                    sb.append("BYDAY=" + g + ";");
                                } else {
                                    throw new IllegalArgumentException("invalid ");
                                }
                            }
                        } else if ("monthly".equals(str)) {
                            sb.append("FREQ=MONTHLY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                            if (map2.containsKey("daysInMonth")) {
                                String h = m7186h(map2.get("daysInMonth"));
                                if (h != null) {
                                    sb.append("BYMONTHDAY=" + h + ";");
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                        }
                    }
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(sb2)) {
                        hashMap.put("rrule", sb2);
                    }
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                    for (String str2 : hashMap.keySet()) {
                        Object obj = hashMap.get(str2);
                        if (obj instanceof Long) {
                            type.putExtra(str2, ((Long) obj).longValue());
                        } else if (obj instanceof Integer) {
                            type.putExtra(str2, ((Integer) obj).intValue());
                        } else {
                            type.putExtra(str2, (String) obj);
                        }
                    }
                    type.setFlags(268435456);
                    v.startActivity(type);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
            } catch (ActivityNotFoundException unused) {
                IAlog.m9034b("There is no calendar app installed!", new Object[0]);
                mo18601a(C3078f.C3080a.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e) {
                IAlog.m9034b("invalid parameters for create calendar ", e.getMessage());
                mo18601a(C3078f.C3080a.CREATE_CALENDAR_EVENT, e.getMessage());
            } catch (Exception unused2) {
                IAlog.m9034b("Failed to create calendar event.", new Object[0]);
                mo18601a(C3078f.C3080a.CREATE_CALENDAR_EVENT, "could not create calendar event");
            }
        } else {
            IAlog.m9034b("createCalendarEvent supported for devices post-ICS", new Object[0]);
            mo18601a(C3078f.C3080a.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
            z = false;
        }
        if (z && this.f7454g != null) {
            ((C3051c) this.f7454g).mo18461a();
        }
    }

    /* renamed from: f */
    private static Date m7184f(String str) {
        Date date = null;
        int i = 0;
        while (i < f7488a.length) {
            try {
                date = new SimpleDateFormat(f7488a[i], Locale.getDefault()).parse(str);
                if (date != null) {
                    break;
                }
                i++;
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    /* renamed from: g */
    private static String m7185g(String str) throws IllegalArgumentException {
        String str2;
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] split = str.split(",");
        for (String parseInt : split) {
            int parseInt2 = Integer.parseInt(parseInt);
            if (parseInt2 == 7) {
                parseInt2 = 0;
            }
            if (!zArr[parseInt2]) {
                StringBuilder sb2 = new StringBuilder();
                switch (parseInt2) {
                    case 0:
                        str2 = "SU";
                        break;
                    case 1:
                        str2 = "MO";
                        break;
                    case 2:
                        str2 = "TU";
                        break;
                    case 3:
                        str2 = "WE";
                        break;
                    case 4:
                        str2 = "TH";
                        break;
                    case 5:
                        str2 = "FR";
                        break;
                    case 6:
                        str2 = "SA";
                        break;
                    default:
                        throw new IllegalArgumentException("invalid day of week " + parseInt2);
                }
                sb2.append(str2);
                sb2.append(",");
                sb.append(sb2.toString());
                zArr[parseInt2] = true;
            }
        }
        if (split.length != 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
    }

    /* renamed from: h */
    private static String m7186h(String str) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] split = str.split(",");
        for (String parseInt : split) {
            int parseInt2 = Integer.parseInt(parseInt);
            int i = parseInt2 + 31;
            if (!zArr[i]) {
                StringBuilder sb2 = new StringBuilder();
                if (parseInt2 == 0 || parseInt2 < -31 || parseInt2 > 31) {
                    throw new IllegalArgumentException("invalid day of month " + parseInt2);
                }
                sb2.append(String.valueOf(parseInt2));
                sb2.append(",");
                sb.append(sb2.toString());
                zArr[i] = true;
            }
        }
        if (split.length != 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
    }

    /* renamed from: d */
    private void m7182d(boolean z) {
        try {
            Activity activity = (Activity) mo18618v();
            if (activity == null) {
                return;
            }
            if (!z || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                activity.setRequestedOrientation(this.f7499K);
            } else {
                activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
            }
        } catch (Exception unused) {
            IAlog.m9034b("Failed to modify the device orientation.", new Object[0]);
        }
    }

    public void setOrientationProperties(boolean z, String str) {
        if ("portrait".equals(str)) {
            this.f7493E = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f7493E = Orientation.LANDSCAPE;
        } else {
            this.f7493E = Orientation.NONE;
        }
        if (this.f7454g != null) {
            ((C3051c) this.f7454g).mo18465a(z, this.f7493E);
        }
    }

    /* renamed from: e */
    private void m7183e(boolean z) {
        if (this.f7496H != null) {
            if (z) {
                int b = C3657l.m9119b(35);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = C3657l.m9119b(10);
                layoutParams.topMargin = C3657l.m9119b(10);
                if (this.f7501M == null) {
                    IAcloseButton iAcloseButton = new IAcloseButton(mo18618v(), b);
                    this.f7501M = iAcloseButton;
                    iAcloseButton.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            C3039d.this.mo18613s();
                        }
                    });
                }
                C3670q.m9157a((View) this.f7501M);
                this.f7505Q.addView(this.f7501M, layoutParams);
            } else {
                this.f7505Q.removeView(this.f7501M);
            }
            if (this.f7454g != null) {
                ((C3051c) this.f7454g).mo18464a(z);
            }
            this.f7510w = !z;
        }
    }

    /* renamed from: c */
    public final void mo18608c(boolean z) {
        this.f7510w = z;
        if (this.f7454g != null) {
            ((C3051c) this.f7454g).mo18464a(this.f7510w);
        }
    }

    /* renamed from: v */
    public final Context mo18618v() {
        if (this.f7450c != null) {
            return this.f7450c.getContext();
        }
        return null;
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$b */
    private class C3050b implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: b */
        private final String f7530b;

        /* renamed from: c */
        private final String f7531c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public MediaScannerConnection f7532d;

        /* synthetic */ C3050b(C3039d dVar, String str, byte b) {
            this(str);
        }

        private C3050b(String str) {
            this.f7530b = str;
            this.f7531c = null;
        }

        public final void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f7532d;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f7530b, this.f7531c);
            }
        }

        public final void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f7532d;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.m.d$f */
    class C3054f extends BroadcastReceiver {

        /* renamed from: a */
        Context f7540a;

        /* renamed from: c */
        private int f7542c = -1;

        C3054f() {
        }

        public final void onReceive(Context context, Intent intent) {
            int r;
            if ((this.f7540a != null) && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (r = C3657l.m9127r()) != this.f7542c) {
                this.f7542c = r;
                C3039d.m7179b(C3039d.this, context);
            }
        }
    }

    /* renamed from: a */
    public final void mo18602a(C3094t tVar) {
        if (this.f7450c != null) {
            String str = "{" + tVar.toString() + "}";
            this.f7450c.mo18579a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.m9033a("Fire changes: %s", str);
        }
    }

    /* renamed from: w */
    public final void mo18619w() {
        if (this.f7450c != null) {
            this.f7450c.mo18579a("window.mraidbridge.fireReadyEvent();");
        }
    }

    /* renamed from: p */
    public final void mo18598p() {
        mo19531b();
    }

    /* renamed from: x */
    public final int mo18620x() {
        return this.f7491C;
    }

    /* renamed from: y */
    public final int mo18621y() {
        return this.f7492D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C3629aj mo18562k() {
        C3037c cVar;
        if (this.f7508u != C3072aa.EXPANDED || (cVar = this.f7497I) == null) {
            return super.mo18562k();
        }
        return cVar.getLastClickedLocation();
    }

    /* renamed from: z */
    private void m7188z() {
        FrameLayout frameLayout = this.f7504P;
        if (frameLayout != null && this.f7505Q != null) {
            frameLayout.removeAllViewsInLayout();
            this.f7505Q.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f7496H;
            if (viewGroup != null) {
                viewGroup.removeView(this.f7505Q);
            }
        }
    }

    /* renamed from: a */
    public boolean mo18547a(WebView webView, String str) {
        IAlog.m9034b("%shandle url for: %s webView = %s", IAlog.m9029a((Object) this), str, webView);
        if (this.f7508u != C3072aa.EXPANDED || TextUtils.isEmpty(str) || !webView.equals(this.f7497I) || this.f7498J) {
            return super.mo18547a(webView, str);
        }
        this.f7498J = true;
        return false;
    }

    /* renamed from: e */
    public final void mo18610e(String str) {
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        IAConfigManager.m5937h().mo18441a(new C2942af(new C2977r<String>() {
            /* renamed from: a */
            public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                String str = (String) obj;
                if (exc == null) {
                    C3039d.m7176a(C3039d.this, str);
                } else {
                    C3662m.m9137a().post(new Runnable() {
                        public final void run() {
                            C3039d.this.mo18609d("Image failed to download.");
                            C3039d.this.mo18601a(C3078f.C3080a.STORE_PICTURE, "Error downloading and saving image file.");
                            IAlog.m9034b("failed to download and save the image file.", new Object[0]);
                        }
                    });
                }
            }
        }, str));
    }

    /* renamed from: a */
    public final void mo18601a(C3078f.C3080a aVar, String str) {
        String str2 = aVar.f7603q;
        if (this.f7450c != null) {
            C3037c cVar = this.f7450c;
            cVar.mo18579a("window.mraidbridge.fireErrorEvent('" + str2 + "', '" + str + "');");
        }
    }

    /* renamed from: a */
    public void mo18545a(boolean z) {
        mo18602a((C3094t) new C3073ab(z));
        super.mo18545a(z);
    }

    /* renamed from: o */
    public final void mo18597o() {
        if (this.f7500L == null) {
            try {
                IAlog.m9034b("%sregistering orientation broadcast receiver", IAlog.m9029a((Object) this));
                C3039d<T>.f fVar = new C3054f();
                this.f7500L = fVar;
                Context v = mo18618v();
                IAlog.m9034b("%sregister screen broadcast receiver", IAlog.m9029a((Object) C3039d.this));
                fVar.f7540a = v;
                v.registerReceiver(fVar, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            } catch (Exception e) {
                IAlog.m9036d("%sfailed registering orientation broadcast recevier", IAlog.m9029a((Object) this));
                if (IAlog.f9870a >= 3) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7176a(C3039d dVar, String str) {
        if (dVar.mo18618v() != null) {
            C3050b bVar = new C3050b(dVar, str, (byte) 0);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(dVar.mo18618v().getApplicationContext(), bVar);
            bVar.f7532d = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m7179b(C3039d dVar, final Context context) {
        if (dVar.f7450c != null) {
            dVar.f7450c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    if (C3039d.this.f7450c == null) {
                        return false;
                    }
                    C3039d.this.f7450c.getViewTreeObserver().removeOnPreDrawListener(this);
                    C3039d.this.mo18606b(context);
                    C3039d dVar = C3039d.this;
                    dVar.mo18602a((C3094t) C3098x.m7314a(dVar.f7512y, C3039d.this.f7513z));
                    C3039d dVar2 = C3039d.this;
                    dVar2.mo18602a((C3094t) C3096v.m7311a(dVar2.f7489A, C3039d.this.f7490B));
                    C3039d dVar3 = C3039d.this;
                    dVar3.mo18602a((C3094t) C3095u.m7309a(dVar3.f7489A, C3039d.this.f7490B));
                    if (C3039d.this.f7491C > 0 && C3039d.this.f7492D > 0) {
                        C3039d dVar4 = C3039d.this;
                        dVar4.mo18602a((C3094t) C3093s.m7306a(C3657l.m9106a(dVar4.f7491C), C3657l.m9106a(C3039d.this.f7492D)));
                        return false;
                    } else if (C3039d.this.mo18556e() == null || C3039d.this.mo18556e().getWidth() <= 0 || C3039d.this.mo18556e().getHeight() <= 0) {
                        return false;
                    } else {
                        C3039d dVar5 = C3039d.this;
                        dVar5.mo18602a((C3094t) C3093s.m7306a(C3657l.m9106a(dVar5.mo18556e().getWidth()), C3657l.m9106a(C3039d.this.mo18556e().getHeight())));
                        return false;
                    }
                }
            });
        }
    }
}
