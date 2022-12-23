package com.p243my.target;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p243my.target.C7346c6;
import com.p243my.target.C7516l1;
import com.p243my.target.C7651s5;
import com.p243my.target.C7749y4;
import com.p243my.target.C7772z4;
import com.p243my.target.ads.Reward;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.my.target.y4 */
public class C7749y4 implements C7772z4, C7651s5.C7652a {

    /* renamed from: a */
    public final C7516l1 f19667a;

    /* renamed from: b */
    public final C7363d6 f19668b;

    /* renamed from: c */
    public final Context f19669c;

    /* renamed from: d */
    public final WeakReference<Activity> f19670d;

    /* renamed from: e */
    public final C7580o1 f19671e;

    /* renamed from: f */
    public final C7751b f19672f;

    /* renamed from: g */
    public final C7516l1.C7518b f19673g;

    /* renamed from: h */
    public final C7346c6.C7347a f19674h;

    /* renamed from: i */
    public String f19675i;

    /* renamed from: j */
    public C7516l1 f19676j;

    /* renamed from: k */
    public C7457i6 f19677k;

    /* renamed from: l */
    public C7457i6 f19678l;

    /* renamed from: m */
    public C7772z4.C7773a f19679m;

    /* renamed from: n */
    public C7753d f19680n;

    /* renamed from: o */
    public C7523l2 f19681o;

    /* renamed from: p */
    public boolean f19682p;

    /* renamed from: q */
    public Uri f19683q;

    /* renamed from: r */
    public C7346c6 f19684r;

    /* renamed from: s */
    public C7651s5 f19685s;

    /* renamed from: t */
    public ViewGroup f19686t;

    /* renamed from: u */
    public C7755f f19687u;

    /* renamed from: v */
    public C7756g f19688v;

    /* renamed from: com.my.target.y4$b */
    public class C7751b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final C7516l1 f19689a;

        public C7751b(C7516l1 l1Var) {
            this.f19689a = l1Var;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C7749y4 y4Var = C7749y4.this;
            y4Var.f19688v = null;
            y4Var.mo51875d();
            this.f19689a.mo50757a(C7749y4.this.f19671e);
        }
    }

    /* renamed from: com.my.target.y4$c */
    public class C7752c implements C7346c6.C7347a {
        public C7752c() {
        }

        /* renamed from: d */
        public void mo49437d() {
            C7651s5 s5Var = C7749y4.this.f19685s;
            if (s5Var != null) {
                s5Var.dismiss();
            }
        }
    }

    /* renamed from: com.my.target.y4$d */
    public interface C7753d {
        /* renamed from: a */
        void mo50585a();

        /* renamed from: a */
        void mo50586a(float f, float f2, C7523l2 l2Var, Context context);

        /* renamed from: a */
        void mo50587a(String str, C7523l2 l2Var, Context context);

        /* renamed from: b */
        void mo50588b();

        void onLoad();

        void onNoAd(String str);
    }

    /* renamed from: com.my.target.y4$e */
    public static class C7754e implements Runnable {

        /* renamed from: a */
        public C7523l2 f19692a;

        /* renamed from: b */
        public Context f19693b;

        /* renamed from: c */
        public C7651s5 f19694c;

        /* renamed from: d */
        public Uri f19695d;

        /* renamed from: e */
        public C7516l1 f19696e;

        public C7754e(C7523l2 l2Var, C7651s5 s5Var, Uri uri, C7516l1 l1Var, Context context) {
            this.f19692a = l2Var;
            this.f19693b = context.getApplicationContext();
            this.f19694c = s5Var;
            this.f19695d = uri;
            this.f19696e = l1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m20897a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f19696e.mo50770f(str);
                return;
            }
            this.f19696e.mo50759a(MraidJsMethods.EXPAND, "Failed to handling mraid");
            this.f19694c.dismiss();
        }

        public void run() {
            C7378e3 d = C7378e3.m19007d();
            d.mo50288b(this.f19695d.toString(), (String) null, this.f19693b);
            C7395f0.m19090c(new Runnable(C7648s3.m20310a(this.f19692a.getMraidJs(), (String) d.mo50287b())) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7749y4.C7754e.this.m20897a(this.f$1);
                }
            });
        }
    }

    /* renamed from: com.my.target.y4$f */
    public class C7755f implements C7516l1.C7518b {

        /* renamed from: a */
        public final C7516l1 f19697a;

        /* renamed from: b */
        public final String f19698b;

        public C7755f(C7516l1 l1Var, String str) {
            this.f19697a = l1Var;
            this.f19698b = str;
        }

        /* renamed from: a */
        public void mo51878a() {
            C7749y4 y4Var = C7749y4.this;
            C7346c6 c6Var = y4Var.f19684r;
            if (c6Var != null && y4Var.f19677k != null) {
                if (c6Var.getParent() != null) {
                    ((ViewGroup) C7749y4.this.f19684r.getParent()).removeView(C7749y4.this.f19684r);
                    C7749y4.this.f19684r.removeAllViews();
                    C7749y4 y4Var2 = C7749y4.this;
                    y4Var2.mo51868a(y4Var2.f19677k);
                    C7749y4.this.mo51873b(Reward.DEFAULT);
                    C7749y4.this.f19684r.setOnCloseListener((C7346c6.C7347a) null);
                    C7749y4.this.f19684r = null;
                }
                C7753d dVar = C7749y4.this.f19680n;
                if (dVar != null) {
                    dVar.mo50585a();
                }
            }
        }

        /* renamed from: a */
        public void mo50771a(C7516l1 l1Var, WebView webView) {
            String str;
            C7749y4 y4Var;
            StringBuilder sb = new StringBuilder();
            sb.append("onPageLoaded callback from ");
            sb.append(l1Var == C7749y4.this.f19676j ? " second " : " primary ");
            sb.append("webview");
            C7374e0.m18989a(sb.toString());
            ArrayList arrayList = new ArrayList();
            if (C7749y4.this.mo51874c()) {
                arrayList.add("'inlineVideo'");
            }
            arrayList.add("'vpaid'");
            l1Var.mo50760a((ArrayList<String>) arrayList);
            l1Var.mo50768d(this.f19698b);
            l1Var.mo50761a(l1Var.mo50766c());
            C7651s5 s5Var = C7749y4.this.f19685s;
            if (s5Var == null || !s5Var.isShowing()) {
                y4Var = C7749y4.this;
                str = Reward.DEFAULT;
            } else {
                y4Var = C7749y4.this;
                str = "expanded";
            }
            y4Var.mo51873b(str);
            l1Var.mo50767d();
            C7749y4 y4Var2 = C7749y4.this;
            if (l1Var != y4Var2.f19676j) {
                C7753d dVar = y4Var2.f19680n;
                if (dVar != null) {
                    dVar.onLoad();
                }
                C7772z4.C7773a aVar = C7749y4.this.f19679m;
                if (aVar != null) {
                    aVar.mo50582a(webView);
                }
            }
        }

        /* renamed from: a */
        public void mo50772a(boolean z) {
            if (!z || C7749y4.this.f19685s == null) {
                this.f19697a.mo50761a(z);
            }
        }

        /* renamed from: a */
        public boolean mo50773a(float f, float f2) {
            C7753d dVar;
            C7523l2 l2Var;
            C7749y4 y4Var = C7749y4.this;
            if (!y4Var.f19682p) {
                this.f19697a.mo50759a("playheadEvent", "Calling VPAID command before VPAID init");
                return false;
            } else if (f < 0.0f || f2 < 0.0f || (dVar = y4Var.f19680n) == null || (l2Var = y4Var.f19681o) == null) {
                return true;
            } else {
                dVar.mo50586a(f, f2, l2Var, y4Var.f19669c);
                return true;
            }
        }

        /* renamed from: a */
        public boolean mo50774a(int i, int i2, int i3, int i4, boolean z, int i5) {
            C7516l1 l1Var;
            String str;
            int i6 = i;
            int i7 = i2;
            boolean z2 = z;
            C7749y4.this.f19688v = new C7756g();
            C7749y4 y4Var = C7749y4.this;
            if (y4Var.f19686t == null) {
                C7374e0.m18989a("Unable to set resize properties: container view for resize is not defined");
                l1Var = this.f19697a;
                str = "container view for resize is not defined";
            } else if (i6 < 50 || i7 < 50) {
                C7374e0.m18989a("Unable to set resize properties: properties cannot be less than closeable container");
                l1Var = this.f19697a;
                str = "properties cannot be less than closeable container";
            } else {
                C7761y8 c = C7761y8.m20950c(y4Var.f19669c);
                C7749y4.this.f19688v.mo51882a(z2);
                C7749y4.this.f19688v.mo51880a(c.mo51902b(i6), c.mo51902b(i7), c.mo51902b(i3), c.mo51902b(i4), i5);
                if (z2) {
                    return true;
                }
                Rect rect = new Rect();
                C7749y4.this.f19686t.getGlobalVisibleRect(rect);
                if (C7749y4.this.f19688v.mo51883a(rect)) {
                    return true;
                }
                C7374e0.m18989a("Unable to set resize properties: allowOffscreen is false, maxSize is (" + rect.width() + "," + rect.height() + ") resize properties: (" + C7749y4.this.f19688v.mo51885b() + "," + C7749y4.this.f19688v.mo51879a() + ")");
                l1Var = this.f19697a;
                str = "resize properties with allowOffscreen false out of viewport";
            }
            l1Var.mo50759a("setResizeProperties", str);
            C7749y4.this.f19688v = null;
            return false;
        }

        /* renamed from: a */
        public boolean mo50775a(Uri uri) {
            return C7749y4.this.mo51872a(uri);
        }

        /* renamed from: a */
        public boolean mo50776a(ConsoleMessage consoleMessage, C7516l1 l1Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("Console message: from ");
            sb.append(l1Var == C7749y4.this.f19676j ? " second " : " primary ");
            sb.append("webview: ");
            sb.append(consoleMessage.message());
            C7374e0.m18989a(sb.toString());
            return true;
        }

        /* renamed from: a */
        public boolean mo50777a(String str) {
            C7523l2 l2Var;
            C7749y4 y4Var = C7749y4.this;
            if (!y4Var.f19682p) {
                this.f19697a.mo50759a("vpaidEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            C7753d dVar = y4Var.f19680n;
            if (dVar == null || (l2Var = y4Var.f19681o) == null) {
                return true;
            }
            dVar.mo50587a(str, l2Var, y4Var.f19669c);
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
            C7374e0.m18989a("Orientation properties isn't supported in standard banners");
            return false;
        }

        /* renamed from: b */
        public void mo50780b(Uri uri) {
            C7523l2 l2Var;
            C7749y4 y4Var = C7749y4.this;
            C7772z4.C7773a aVar = y4Var.f19679m;
            if (aVar != null && (l2Var = y4Var.f19681o) != null) {
                aVar.mo50584a(l2Var, uri.toString());
            }
        }

        /* renamed from: c */
        public void mo50781c() {
        }

        /* renamed from: d */
        public void mo50782d() {
            C7651s5 s5Var = C7749y4.this.f19685s;
            if (s5Var != null) {
                s5Var.dismiss();
            }
        }

        /* renamed from: f */
        public boolean mo50783f() {
            C7457i6 i6Var;
            if (!C7749y4.this.f19675i.equals(Reward.DEFAULT)) {
                C7374e0.m18989a("Unable to resize: wrong state for resize: " + C7749y4.this.f19675i);
                C7516l1 l1Var = this.f19697a;
                l1Var.mo50759a(MraidJsMethods.RESIZE, "wrong state for resize " + C7749y4.this.f19675i);
                return false;
            }
            C7749y4 y4Var = C7749y4.this;
            C7756g gVar = y4Var.f19688v;
            if (gVar == null) {
                C7374e0.m18989a("Unable to resize: resize properties not set");
                this.f19697a.mo50759a(MraidJsMethods.RESIZE, "resize properties not set");
                return false;
            }
            ViewGroup viewGroup = y4Var.f19686t;
            if (viewGroup == null || (i6Var = y4Var.f19677k) == null) {
                C7374e0.m18989a("Unable to resize: views not initialized");
                this.f19697a.mo50759a(MraidJsMethods.RESIZE, "views not initialized");
                return false;
            } else if (!gVar.mo51884a(viewGroup, i6Var)) {
                C7374e0.m18989a("Unable to resize: views not visible");
                this.f19697a.mo50759a(MraidJsMethods.RESIZE, "views not visible");
                return false;
            } else {
                C7749y4.this.f19684r = new C7346c6(C7749y4.this.f19669c);
                C7749y4 y4Var2 = C7749y4.this;
                y4Var2.f19688v.mo51881a(y4Var2.f19684r);
                C7749y4 y4Var3 = C7749y4.this;
                if (!y4Var3.f19688v.mo51886b(y4Var3.f19684r)) {
                    C7374e0.m18989a("Unable to resize: close button is out of visible range");
                    this.f19697a.mo50759a(MraidJsMethods.RESIZE, "close button is out of visible range");
                    C7749y4.this.f19684r = null;
                    return false;
                }
                ViewGroup viewGroup2 = (ViewGroup) C7749y4.this.f19677k.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(C7749y4.this.f19677k);
                }
                C7749y4 y4Var4 = C7749y4.this;
                y4Var4.f19684r.addView(y4Var4.f19677k, new FrameLayout.LayoutParams(-1, -1));
                C7749y4.this.f19684r.setOnCloseListener(new C7346c6.C7347a() {
                    /* renamed from: d */
                    public final void mo49437d() {
                        C7749y4.C7755f.this.mo51878a();
                    }
                });
                C7749y4 y4Var5 = C7749y4.this;
                y4Var5.f19686t.addView(y4Var5.f19684r);
                C7749y4.this.mo51873b("resized");
                C7753d dVar = C7749y4.this.f19680n;
                if (dVar == null) {
                    return true;
                }
                dVar.mo50588b();
                return true;
            }
        }

        /* renamed from: g */
        public void mo50784g() {
            C7749y4.this.f19682p = true;
        }
    }

    /* renamed from: com.my.target.y4$g */
    public static class C7756g {

        /* renamed from: a */
        public boolean f19700a = true;

        /* renamed from: b */
        public int f19701b;

        /* renamed from: c */
        public int f19702c;

        /* renamed from: d */
        public int f19703d;

        /* renamed from: e */
        public int f19704e;

        /* renamed from: f */
        public int f19705f;

        /* renamed from: g */
        public Rect f19706g;

        /* renamed from: h */
        public Rect f19707h;

        /* renamed from: i */
        public int f19708i;

        /* renamed from: j */
        public int f19709j;

        /* renamed from: a */
        public int mo51879a() {
            return this.f19704e;
        }

        /* renamed from: a */
        public void mo51880a(int i, int i2, int i3, int i4, int i5) {
            this.f19703d = i;
            this.f19704e = i2;
            this.f19701b = i3;
            this.f19702c = i4;
            this.f19705f = i5;
        }

        /* renamed from: a */
        public void mo51881a(C7346c6 c6Var) {
            Rect rect;
            Rect rect2 = this.f19707h;
            if (rect2 == null || (rect = this.f19706g) == null) {
                C7374e0.m18989a("Setup views before resizing");
                return;
            }
            int i = (rect2.top - rect.top) + this.f19702c;
            this.f19708i = i;
            this.f19709j = (rect2.left - rect.left) + this.f19701b;
            if (!this.f19700a) {
                if (i + this.f19704e > rect.height()) {
                    C7374e0.m18989a("Try to reposition creative vertically because of resize allowOffscreen:false and out of max size properties");
                    this.f19708i = this.f19706g.height() - this.f19704e;
                }
                if (this.f19709j + this.f19703d > this.f19706g.width()) {
                    C7374e0.m18989a("Try to reposition creative horizontally because of resize allowOffscreen:false and out of max size properties");
                    this.f19709j = this.f19706g.width() - this.f19703d;
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f19703d, this.f19704e);
            layoutParams.topMargin = this.f19708i;
            layoutParams.leftMargin = this.f19709j;
            c6Var.setLayoutParams(layoutParams);
            c6Var.setCloseGravity(this.f19705f);
        }

        /* renamed from: a */
        public void mo51882a(boolean z) {
            this.f19700a = z;
        }

        /* renamed from: a */
        public boolean mo51883a(Rect rect) {
            return this.f19703d <= rect.width() && this.f19704e <= rect.height();
        }

        /* renamed from: a */
        public boolean mo51884a(ViewGroup viewGroup, C7457i6 i6Var) {
            this.f19706g = new Rect();
            this.f19707h = new Rect();
            return viewGroup.getGlobalVisibleRect(this.f19706g) && i6Var.getGlobalVisibleRect(this.f19707h);
        }

        /* renamed from: b */
        public int mo51885b() {
            return this.f19703d;
        }

        /* renamed from: b */
        public boolean mo51886b(C7346c6 c6Var) {
            if (this.f19706g == null) {
                return false;
            }
            int i = this.f19709j;
            int i2 = this.f19708i;
            Rect rect = this.f19706g;
            Rect rect2 = new Rect(i, i2, rect.right, rect.bottom);
            int i3 = this.f19709j;
            int i4 = this.f19708i;
            Rect rect3 = new Rect(i3, i4, this.f19703d + i3, this.f19704e + i4);
            Rect rect4 = new Rect();
            c6Var.mo49816b(this.f19705f, rect3, rect4);
            return rect2.contains(rect4);
        }
    }

    public C7749y4(ViewGroup viewGroup) {
        this(C7516l1.m19650b(TJAdUnitConstants.String.INLINE), new C7457i6(viewGroup.getContext()), new C7363d6(viewGroup.getContext()), viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004d, code lost:
        if (r7 == null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7749y4(com.p243my.target.C7516l1 r4, com.p243my.target.C7457i6 r5, com.p243my.target.C7363d6 r6, android.view.ViewGroup r7) {
        /*
            r3 = this;
            r3.<init>()
            com.my.target.y4$c r0 = new com.my.target.y4$c
            r1 = 0
            r0.<init>()
            r3.f19674h = r0
            r3.f19667a = r4
            r3.f19677k = r5
            r3.f19668b = r6
            android.content.Context r6 = r7.getContext()
            r3.f19669c = r6
            boolean r0 = r6 instanceof android.app.Activity
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r0 == 0) goto L_0x0038
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            android.app.Activity r6 = (android.app.Activity) r6
            r7.<init>(r6)
            r3.f19670d = r7
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            android.view.View r6 = r6.findViewById(r2)
        L_0x0033:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r3.f19686t = r6
            goto L_0x0050
        L_0x0038:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r1)
            r3.f19670d = r6
            android.view.View r6 = r7.getRootView()
            if (r6 == 0) goto L_0x0050
            android.view.View r7 = r6.findViewById(r2)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r3.f19686t = r7
            if (r7 != 0) goto L_0x0050
            goto L_0x0033
        L_0x0050:
            java.lang.String r6 = "loading"
            r3.f19675i = r6
            com.my.target.o1 r6 = com.p243my.target.C7580o1.m19988e()
            r3.f19671e = r6
            r3.mo51868a((com.p243my.target.C7457i6) r5)
            com.my.target.y4$f r6 = new com.my.target.y4$f
            java.lang.String r7 = "inline"
            r6.<init>(r4, r7)
            r3.f19673g = r6
            r4.mo50756a((com.p243my.target.C7516l1.C7518b) r6)
            com.my.target.y4$b r6 = new com.my.target.y4$b
            r6.<init>(r4)
            r3.f19672f = r6
            r5.addOnLayoutChangeListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7749y4.<init>(com.my.target.l1, com.my.target.i6, com.my.target.d6, android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public static C7749y4 m20872a(ViewGroup viewGroup) {
        return new C7749y4(viewGroup);
    }

    /* renamed from: a */
    public void mo49732a() {
        C7457i6 i6Var;
        if ((this.f19685s == null || this.f19676j != null) && (i6Var = this.f19677k) != null) {
            i6Var.mo49590e();
        }
    }

    /* renamed from: a */
    public void mo49733a(int i) {
        mo51873b("hidden");
        mo51870a((C7753d) null);
        mo49736a((C7772z4.C7773a) null);
        this.f19667a.mo50753a();
        C7346c6 c6Var = this.f19684r;
        if (c6Var != null) {
            c6Var.removeAllViews();
            this.f19684r.setOnCloseListener((C7346c6.C7347a) null);
            ViewParent parent = this.f19684r.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f19684r);
            }
            this.f19684r = null;
        }
        C7457i6 i6Var = this.f19677k;
        if (i6Var != null) {
            if (i <= 0) {
                i6Var.mo50403a(true);
            }
            if (this.f19677k.getParent() != null) {
                ((ViewGroup) this.f19677k.getParent()).removeView(this.f19677k);
            }
            this.f19677k.mo49584a(i);
            this.f19677k = null;
        }
        C7516l1 l1Var = this.f19676j;
        if (l1Var != null) {
            l1Var.mo50753a();
            this.f19676j = null;
        }
        C7457i6 i6Var2 = this.f19678l;
        if (i6Var2 != null) {
            i6Var2.mo50403a(true);
            if (this.f19678l.getParent() != null) {
                ((ViewGroup) this.f19678l.getParent()).removeView(this.f19678l);
            }
            this.f19678l.mo49584a(0);
            this.f19678l = null;
        }
    }

    /* renamed from: a */
    public void mo51867a(C7346c6 c6Var, FrameLayout frameLayout) {
        this.f19668b.setVisibility(8);
        frameLayout.addView(c6Var, new ViewGroup.LayoutParams(-1, -1));
        if (this.f19683q != null) {
            this.f19676j = C7516l1.m19650b(TJAdUnitConstants.String.INLINE);
            C7457i6 i6Var = new C7457i6(this.f19669c);
            this.f19678l = i6Var;
            mo51869a(this.f19676j, i6Var, c6Var);
        } else {
            C7457i6 i6Var2 = this.f19677k;
            if (!(i6Var2 == null || i6Var2.getParent() == null)) {
                ((ViewGroup) this.f19677k.getParent()).removeView(this.f19677k);
                c6Var.addView(this.f19677k, new ViewGroup.LayoutParams(-1, -1));
                mo51873b("expanded");
            }
        }
        c6Var.setCloseVisible(true);
        c6Var.setOnCloseListener(this.f19674h);
        C7753d dVar = this.f19680n;
        if (dVar != null && this.f19683q == null) {
            dVar.mo50588b();
        }
        C7374e0.m18989a("MRAID dialog create");
    }

    /* renamed from: a */
    public void mo51868a(C7457i6 i6Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        this.f19668b.addView(i6Var, 0);
        i6Var.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo51869a(C7516l1 l1Var, C7457i6 i6Var, C7346c6 c6Var) {
        Uri uri;
        C7755f fVar = new C7755f(l1Var, TJAdUnitConstants.String.INLINE);
        this.f19687u = fVar;
        l1Var.mo50756a((C7516l1.C7518b) fVar);
        c6Var.addView(i6Var, new ViewGroup.LayoutParams(-1, -1));
        l1Var.mo50755a(i6Var);
        C7651s5 s5Var = this.f19685s;
        if (s5Var != null) {
            C7523l2 l2Var = this.f19681o;
            if (l2Var == null || (uri = this.f19683q) == null) {
                s5Var.dismiss();
                return;
            }
            C7395f0.m19086a(new C7754e(l2Var, s5Var, uri, l1Var, this.f19669c));
        }
    }

    /* renamed from: a */
    public void mo49735a(C7523l2 l2Var) {
        C7457i6 i6Var;
        this.f19681o = l2Var;
        String source = l2Var.getSource();
        if (source == null || (i6Var = this.f19677k) == null) {
            mo51871a("failed to load, failed MRAID initialization");
            return;
        }
        this.f19667a.mo50755a(i6Var);
        this.f19667a.mo50770f(source);
    }

    /* renamed from: a */
    public void mo50263a(C7651s5 s5Var, FrameLayout frameLayout) {
        this.f19685s = s5Var;
        C7346c6 c6Var = this.f19684r;
        if (!(c6Var == null || c6Var.getParent() == null)) {
            ((ViewGroup) this.f19684r.getParent()).removeView(this.f19684r);
        }
        C7346c6 c6Var2 = new C7346c6(this.f19669c);
        this.f19684r = c6Var2;
        mo51867a(c6Var2, frameLayout);
    }

    /* renamed from: a */
    public void mo51870a(C7753d dVar) {
        this.f19680n = dVar;
    }

    /* renamed from: a */
    public void mo49736a(C7772z4.C7773a aVar) {
        this.f19679m = aVar;
    }

    /* renamed from: a */
    public final void mo51871a(String str) {
        C7753d dVar = this.f19680n;
        if (dVar != null) {
            dVar.onNoAd(str);
        }
    }

    /* renamed from: a */
    public void mo49738a(boolean z) {
        C7457i6 i6Var;
        if ((this.f19685s == null || this.f19676j != null) && (i6Var = this.f19677k) != null) {
            i6Var.mo50403a(z);
        }
    }

    /* renamed from: a */
    public boolean mo51872a(Uri uri) {
        if (this.f19677k == null) {
            C7374e0.m18989a("Cannot expand: webview destroyed");
            return false;
        } else if (!this.f19675i.equals(Reward.DEFAULT) && !this.f19675i.equals("resized")) {
            return false;
        } else {
            this.f19683q = uri;
            C7651s5.m20348a(this, this.f19669c).show();
            return true;
        }
    }

    /* renamed from: b */
    public void mo49739b() {
        C7457i6 i6Var;
        if ((this.f19685s == null || this.f19676j != null) && (i6Var = this.f19677k) != null) {
            i6Var.mo50403a(false);
        }
    }

    /* renamed from: b */
    public void mo51873b(String str) {
        C7374e0.m18989a("MRAID state set to " + str);
        this.f19675i = str;
        this.f19667a.mo50769e(str);
        C7516l1 l1Var = this.f19676j;
        if (l1Var != null) {
            l1Var.mo50769e(str);
        }
        if ("hidden".equals(str)) {
            C7374e0.m18989a("MraidPresenter: Mraid on close");
        }
    }

    /* renamed from: b */
    public void mo50265b(boolean z) {
        C7516l1 l1Var = this.f19676j;
        if (l1Var == null) {
            l1Var = this.f19667a;
        }
        l1Var.mo50761a(z);
        C7457i6 i6Var = this.f19678l;
        if (i6Var == null) {
            return;
        }
        if (z) {
            i6Var.mo49590e();
        } else {
            i6Var.mo50403a(false);
        }
    }

    /* renamed from: c */
    public boolean mo51874c() {
        C7457i6 i6Var;
        Activity activity = (Activity) this.f19670d.get();
        if (activity == null || (i6Var = this.f19677k) == null) {
            return false;
        }
        return C7761y8.m20941a(activity, (View) i6Var);
    }

    /* renamed from: d */
    public void mo51875d() {
        C7580o1 o1Var;
        int i;
        int i2;
        int measuredWidth;
        int i3;
        C7457i6 i6Var;
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = this.f19669c.getResources().getDisplayMetrics();
        this.f19671e.mo51272a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ViewGroup viewGroup = this.f19686t;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            this.f19671e.mo51277c(iArr[0], iArr[1], iArr[0] + this.f19686t.getMeasuredWidth(), iArr[1] + this.f19686t.getMeasuredHeight());
        }
        if (!this.f19675i.equals("expanded") && !this.f19675i.equals("resized")) {
            this.f19668b.getLocationOnScreen(iArr);
            this.f19671e.mo51275b(iArr[0], iArr[1], iArr[0] + this.f19668b.getMeasuredWidth(), iArr[1] + this.f19668b.getMeasuredHeight());
        }
        C7457i6 i6Var2 = this.f19678l;
        if (i6Var2 != null) {
            i6Var2.getLocationOnScreen(iArr);
            o1Var = this.f19671e;
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = iArr[0] + this.f19678l.getMeasuredWidth();
            i3 = iArr[1];
            i6Var = this.f19678l;
        } else {
            C7457i6 i6Var3 = this.f19677k;
            if (i6Var3 != null) {
                i6Var3.getLocationOnScreen(iArr);
                o1Var = this.f19671e;
                i = iArr[0];
                i2 = iArr[1];
                measuredWidth = iArr[0] + this.f19677k.getMeasuredWidth();
                i3 = iArr[1];
                i6Var = this.f19677k;
            } else {
                return;
            }
        }
        o1Var.mo51273a(i, i2, measuredWidth, i3 + i6Var.getMeasuredHeight());
    }

    /* renamed from: f */
    public void mo49743f() {
        C7523l2 l2Var;
        C7772z4.C7773a aVar = this.f19679m;
        if (aVar != null && (l2Var = this.f19681o) != null) {
            aVar.mo50583a((C7768z1) l2Var);
        }
    }

    public C7363d6 getView() {
        return this.f19668b;
    }

    /* renamed from: q */
    public void mo50267q() {
        this.f19668b.setVisibility(0);
        if (this.f19683q != null) {
            this.f19683q = null;
            C7516l1 l1Var = this.f19676j;
            if (l1Var != null) {
                l1Var.mo50761a(false);
                this.f19676j.mo50769e("hidden");
                this.f19676j.mo50753a();
                this.f19676j = null;
                this.f19667a.mo50761a(true);
            }
            C7457i6 i6Var = this.f19678l;
            if (i6Var != null) {
                i6Var.mo50403a(true);
                if (this.f19678l.getParent() != null) {
                    ((ViewGroup) this.f19678l.getParent()).removeView(this.f19678l);
                }
                this.f19678l.mo49584a(0);
                this.f19678l = null;
            }
        } else {
            C7457i6 i6Var2 = this.f19677k;
            if (i6Var2 != null) {
                if (i6Var2.getParent() != null) {
                    ((ViewGroup) this.f19677k.getParent()).removeView(this.f19677k);
                }
                mo51868a(this.f19677k);
            }
        }
        C7346c6 c6Var = this.f19684r;
        if (!(c6Var == null || c6Var.getParent() == null)) {
            ((ViewGroup) this.f19684r.getParent()).removeView(this.f19684r);
        }
        this.f19684r = null;
        mo51873b(Reward.DEFAULT);
        C7753d dVar = this.f19680n;
        if (dVar != null) {
            dVar.mo50585a();
        }
        mo51875d();
        this.f19667a.mo50757a(this.f19671e);
        this.f19677k.mo49590e();
    }
}
