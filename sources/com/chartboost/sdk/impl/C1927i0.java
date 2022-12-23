package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C1887f;
import com.chartboost.sdk.C1892h;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.C1830i;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.C1921h0;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.i0 */
public class C1927i0 extends C1921h0 {

    /* renamed from: A */
    protected int f4888A = 0;

    /* renamed from: B */
    private boolean f4889B = false;

    /* renamed from: C */
    private boolean f4890C = false;

    /* renamed from: D */
    JSONObject f4891D;

    /* renamed from: E */
    protected boolean f4892E;

    /* renamed from: F */
    protected boolean f4893F;

    /* renamed from: G */
    protected boolean f4894G;

    /* renamed from: H */
    protected boolean f4895H;

    /* renamed from: I */
    protected boolean f4896I = false;

    /* renamed from: J */
    protected int f4897J;

    /* renamed from: K */
    protected C1830i f4898K;

    /* renamed from: L */
    protected C1830i f4899L;

    /* renamed from: M */
    protected C1830i f4900M;

    /* renamed from: N */
    protected C1830i f4901N;

    /* renamed from: O */
    protected C1830i f4902O;

    /* renamed from: P */
    protected C1830i f4903P;

    /* renamed from: Q */
    protected C1830i f4904Q;

    /* renamed from: R */
    protected C1830i f4905R;

    /* renamed from: S */
    protected boolean f4906S = false;

    /* renamed from: T */
    protected boolean f4907T = false;

    /* renamed from: U */
    protected boolean f4908U = false;

    /* renamed from: V */
    private Context f4909V;

    /* renamed from: t */
    final C1828g f4910t;

    /* renamed from: u */
    protected int f4911u = 0;

    /* renamed from: v */
    protected int f4912v;

    /* renamed from: w */
    protected String f4913w;

    /* renamed from: x */
    protected String f4914x;

    /* renamed from: y */
    private boolean f4915y = false;

    /* renamed from: z */
    protected int f4916z = 0;

    /* renamed from: com.chartboost.sdk.impl.i0$b */
    public class C1929b extends C1921h0.C1922a {

        /* renamed from: o */
        private final C1967p1 f4917o;

        /* renamed from: p */
        final C1957o0 f4918p;

        /* renamed from: q */
        C1943l0 f4919q;

        /* renamed from: r */
        private View f4920r;

        /* renamed from: s */
        final C1917g0 f4921s;

        /* renamed from: t */
        final C1937j0 f4922t;

        /* renamed from: u */
        private final C1967p1 f4923u;

        /* renamed from: com.chartboost.sdk.impl.i0$b$a */
        class C1930a extends C1967p1 {
            C1930a(Context context, C1927i0 i0Var) {
                super(context);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo14620a(MotionEvent motionEvent) {
                C1929b bVar = C1929b.this;
                if (C1927i0.this.f4717g.f4448a == 2) {
                    bVar.f4922t.mo14698a(false);
                }
                C1929b bVar2 = C1929b.this;
                if (C1927i0.this.f4911u == 1) {
                    bVar2.mo14642e(false);
                }
                C1929b.this.mo14640d(true);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.i0$b$b */
        class C1931b extends C1967p1 {
            C1931b(Context context, C1927i0 i0Var) {
                super(context);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo14620a(MotionEvent motionEvent) {
                C1929b.this.mo14627c();
            }
        }

        /* renamed from: com.chartboost.sdk.impl.i0$b$c */
        class C1932c implements Runnable {
            C1932c() {
            }

            public void run() {
                Object[] objArr = new Object[1];
                objArr[0] = C1927i0.this.f4892E ? "hidden" : "shown";
                CBLogging.m3996d("InterstitialVideoViewProtocol", String.format("controls %s automatically from timer", objArr));
                C1929b bVar = C1929b.this;
                bVar.f4918p.mo14724a(!C1927i0.this.f4892E, true);
                synchronized (C1927i0.this.f4719i) {
                    C1927i0.this.f4719i.remove(C1929b.this.f4918p);
                }
            }
        }

        /* renamed from: com.chartboost.sdk.impl.i0$b$d */
        class C1933d implements Runnable {
            C1933d() {
            }

            public void run() {
                C1929b.this.f4922t.mo14698a(false);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.i0$b$e */
        class C1934e implements Runnable {
            C1934e() {
            }

            public void run() {
                try {
                    C1927i0.this.mo14517a();
                } catch (Exception e) {
                    CBLogging.m3993b("InterstitialVideoViewProtocol", "onCloseButton Runnable.run" + e.toString());
                }
            }
        }

        /* renamed from: b */
        private void m4619b(boolean z) {
            if (z) {
                this.f4922t.mo14698a(true);
            } else {
                this.f4922t.setVisibility(0);
            }
            C1927i0.this.f4711a.postDelayed(new C1933d(), 2500);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14540a(int i, int i2) {
            super.mo14540a(i, i2);
            m4618a(C1927i0.this.f4911u, false);
            boolean b = CBUtility.m4009b(C1927i0.this.mo14529f());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f4878i.getLayoutParams();
            C1927i0 i0Var = C1927i0.this;
            i0Var.mo14624a(layoutParams2, b ? i0Var.f4899L : i0Var.f4898K, 1.0f);
            Point b2 = C1927i0.this.mo14625b(b ? "replay-portrait" : "replay-landscape");
            int round = Math.round(((((float) layoutParams6.leftMargin) + (((float) layoutParams6.width) / 2.0f)) + ((float) b2.x)) - (((float) layoutParams2.width) / 2.0f));
            int round2 = Math.round(((((float) layoutParams6.topMargin) + (((float) layoutParams6.height) / 2.0f)) + ((float) b2.y)) - (((float) layoutParams2.height) / 2.0f));
            layoutParams2.leftMargin = Math.min(Math.max(0, round), i - layoutParams2.width);
            layoutParams2.topMargin = Math.min(Math.max(0, round2), i2 - layoutParams2.height);
            this.f4917o.bringToFront();
            if (b) {
                this.f4917o.mo14757a(C1927i0.this.f4899L);
            } else {
                this.f4917o.mo14757a(C1927i0.this.f4898K);
            }
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.f4881l.getLayoutParams();
            if (!C1927i0.this.mo14635t()) {
                layoutParams3.width = layoutParams7.width;
                layoutParams3.height = layoutParams7.height;
                layoutParams3.leftMargin = layoutParams7.leftMargin;
                layoutParams3.topMargin = layoutParams7.topMargin;
                layoutParams4.width = layoutParams7.width;
                layoutParams4.height = layoutParams7.height;
                layoutParams4.leftMargin = layoutParams7.leftMargin;
                layoutParams4.topMargin = layoutParams7.topMargin;
            } else {
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
                C1830i iVar = b ? C1927i0.this.f4873o : C1927i0.this.f4874p;
                C1927i0.this.mo14624a(layoutParams8, iVar, 1.0f);
                layoutParams8.leftMargin = 0;
                layoutParams8.topMargin = 0;
                layoutParams8.addRule(11);
                this.f4923u.setLayoutParams(layoutParams8);
                this.f4923u.mo14757a(iVar);
            }
            layoutParams5.width = layoutParams7.width;
            layoutParams5.height = 72;
            layoutParams5.leftMargin = layoutParams7.leftMargin;
            layoutParams5.topMargin = (layoutParams7.topMargin + layoutParams7.height) - 72;
            if (C1927i0.this.f4907T) {
                this.f4920r.setLayoutParams(layoutParams);
            }
            if (C1927i0.this.f4717g.f4448a == 2) {
                this.f4919q.setLayoutParams(layoutParams3);
            }
            this.f4918p.setLayoutParams(layoutParams4);
            this.f4921s.setLayoutParams(layoutParams5);
            this.f4917o.setLayoutParams(layoutParams2);
            if (C1927i0.this.f4717g.f4448a == 2) {
                this.f4919q.mo14691a();
            }
            this.f4918p.mo14734h();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo14627c() {
            C1927i0 i0Var = C1927i0.this;
            if (i0Var.f4911u != 1 || i0Var.f4717g.f4450c.f4748a != 1) {
                if (C1927i0.this.f4911u == 1) {
                    mo14642e(false);
                    this.f4918p.mo14727c();
                    C1927i0 i0Var2 = C1927i0.this;
                    int i = i0Var2.f4912v;
                    if (i < 1) {
                        i0Var2.f4912v = i + 1;
                        i0Var2.f4717g.mo14294v();
                    }
                }
                C1927i0.this.f4711a.post(new C1934e());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo14628d() {
            super.mo14628d();
            C1927i0 i0Var = C1927i0.this;
            if (i0Var.f4911u != 0 || (i0Var.f4893F && !i0Var.mo14631p())) {
                m4618a(C1927i0.this.f4911u, false);
            } else {
                mo14640d(false);
            }
        }

        /* renamed from: e */
        public void mo14641e() {
            mo14642e(true);
            this.f4918p.mo14727c();
            C1927i0 i0Var = C1927i0.this;
            int i = i0Var.f4912v + 1;
            i0Var.f4912v = i;
            if (i <= 1 && !i0Var.mo14632q()) {
                C1927i0 i0Var2 = C1927i0.this;
                if (i0Var2.f4916z >= 1) {
                    i0Var2.f4717g.mo14294v();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public boolean mo14643f() {
            C1927i0 i0Var = C1927i0.this;
            if (i0Var.f4911u == 1 && i0Var.f4912v < 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("close-");
                sb.append(CBUtility.m4009b(C1927i0.this.mo14529f()) ? "portrait" : "landscape");
                JSONObject a = C1825e.m4024a(C1927i0.this.mo14528e(), sb.toString());
                float optDouble = a != null ? (float) a.optDouble(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY, -1.0d) : -1.0f;
                int round = optDouble >= 0.0f ? Math.round(optDouble * 1000.0f) : -1;
                C1927i0.this.f4897J = round;
                if (round < 0 || round > this.f4918p.mo14720a().mo14660d()) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo14644g() {
            C1927i0.this.f4893F = false;
            mo14640d(true);
        }

        private C1929b(Context context) {
            super(context);
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            C1892h a = C1892h.m4431a();
            if (C1927i0.this.f4907T) {
                View view = new View(context);
                this.f4920r = view;
                view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                this.f4920r.setVisibility(8);
                addView(this.f4920r);
            }
            if (C1927i0.this.f4717g.f4448a == 2) {
                C1943l0 l0Var = (C1943l0) a.mo14549a(new C1943l0(context, C1927i0.this));
                this.f4919q = l0Var;
                l0Var.setVisibility(8);
                addView(this.f4919q);
            }
            C1957o0 o0Var = (C1957o0) a.mo14549a(new C1957o0(context, C1927i0.this));
            this.f4918p = o0Var;
            mo14541a((View) o0Var.f5036g);
            this.f4918p.setVisibility(8);
            addView(this.f4918p);
            C1917g0 g0Var = (C1917g0) a.mo14549a(new C1917g0(context, C1927i0.this));
            this.f4921s = g0Var;
            g0Var.setVisibility(8);
            addView(this.f4921s);
            if (C1927i0.this.f4717g.f4448a == 2) {
                C1937j0 j0Var = (C1937j0) a.mo14549a(new C1937j0(context, C1927i0.this));
                this.f4922t = j0Var;
                j0Var.setVisibility(8);
                addView(this.f4922t);
            } else {
                this.f4922t = null;
            }
            C1930a aVar = new C1930a(getContext(), C1927i0.this);
            this.f4917o = aVar;
            aVar.setVisibility(8);
            addView(this.f4917o);
            C1931b bVar = new C1931b(getContext(), C1927i0.this);
            this.f4923u = bVar;
            bVar.setVisibility(8);
            this.f4923u.setContentDescription("CBClose");
            addView(this.f4923u);
            JSONObject optJSONObject3 = C1927i0.this.f4891D.optJSONObject(NotificationCompat.CATEGORY_PROGRESS);
            JSONObject optJSONObject4 = C1927i0.this.f4891D.optJSONObject("video-controls-background");
            if (optJSONObject3 != null && !optJSONObject3.isNull("background-color") && !optJSONObject3.isNull("border-color") && !optJSONObject3.isNull("progress-color") && !optJSONObject3.isNull("radius")) {
                C1927i0.this.f4906S = true;
                C1940k0 b = this.f4918p.mo14725b();
                b.mo14673a(C1887f.m4399a(optJSONObject3.optString("background-color")));
                b.mo14676b(C1887f.m4399a(optJSONObject3.optString("border-color")));
                b.mo14677c(C1887f.m4399a(optJSONObject3.optString("progress-color")));
                b.mo14675b((float) optJSONObject3.optDouble("radius", 0.0d));
            }
            if (optJSONObject4 != null && !optJSONObject4.isNull("color")) {
                this.f4918p.mo14721a(C1887f.m4399a(optJSONObject4.optString("color")));
            }
            if (C1927i0.this.f4717g.f4448a == 2 && C1927i0.this.f4894G && (optJSONObject2 = C1927i0.this.f4891D.optJSONObject("post-video-toaster")) != null) {
                this.f4921s.mo14618a(optJSONObject2.optString("title"), optJSONObject2.optString("tagline"));
            }
            if (C1927i0.this.f4717g.f4448a == 2 && C1927i0.this.f4893F && (optJSONObject = C1927i0.this.f4891D.optJSONObject("confirmation")) != null) {
                this.f4919q.mo14692a(optJSONObject.optString("text"), C1887f.m4399a(optJSONObject.optString("color")));
            }
            String str = "";
            if (C1927i0.this.f4717g.f4448a == 2 && C1927i0.this.f4895H) {
                JSONObject a2 = C1825e.m4024a(C1927i0.this.f4891D, "post-video-reward-toaster");
                this.f4922t.mo14697a((a2 == null || !a2.optString("position").equals("inside-top")) ? 1 : 0);
                this.f4922t.mo14649a(a2 != null ? a2.optString("text") : str);
                if (C1927i0.this.f4903P.mo14248e()) {
                    this.f4922t.mo14648a(C1927i0.this.f4905R);
                }
            }
            JSONObject e = C1927i0.this.mo14528e();
            if (e == null || e.isNull("video-click-button")) {
                this.f4918p.mo14729d();
            }
            this.f4918p.mo14728c(C1927i0.this.f4891D.optBoolean("video-progress-timer-enabled"));
            if (C1927i0.this.f4908U || C1927i0.this.f4907T) {
                this.f4882m.setVisibility(4);
            }
            String[] strArr = new String[1];
            strArr[0] = CBUtility.m4009b(C1927i0.this.mo14529f()) ? "video-portrait" : "video-landscape";
            JSONObject a3 = C1825e.m4024a(e, strArr);
            str = a3 != null ? a3.optString("id") : str;
            C1927i0.this.f4914x = str;
            if (str.isEmpty()) {
                C1927i0.this.mo14519a(CBError.CBImpressionError.VIDEO_ID_MISSING);
                return;
            }
            if (C1927i0.this.f4913w == null) {
                C1927i0.this.f4913w = C1927i0.this.f4910t.mo14235a(C1927i0.this.f4914x);
            }
            String str2 = C1927i0.this.f4913w;
            if (str2 == null) {
                C1927i0.this.mo14519a(CBError.CBImpressionError.VIDEO_UNAVAILABLE);
            } else {
                this.f4918p.mo14722a(str2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo14638b(float f, float f2, float f3, float f4) {
            if (C1927i0.this.f4911u == 1) {
                mo14642e(false);
            }
            C1927i0.this.mo14523a(C1825e.m4025a(C1825e.m4023a("x", (Object) Float.valueOf(f)), C1825e.m4023a("y", (Object) Float.valueOf(f2)), C1825e.m4023a("w", (Object) Float.valueOf(f3)), C1825e.m4023a("h", (Object) Float.valueOf(f4))));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo14640d(boolean z) {
            C1927i0 i0Var = C1927i0.this;
            if (i0Var.f4911u != 1) {
                if (i0Var.f4893F) {
                    m4618a(0, z);
                    return;
                }
                m4618a(1, z);
                JSONObject a = C1825e.m4024a(C1927i0.this.f4891D, "timer");
                if (C1927i0.this.f4912v >= 1 || a == null || a.isNull(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY)) {
                    this.f4918p.mo14723a(!C1927i0.this.f4892E);
                } else {
                    Object[] objArr = new Object[1];
                    objArr[0] = C1927i0.this.f4892E ? TJAdUnitConstants.String.VISIBLE : "hidden";
                    CBLogging.m3996d("InterstitialVideoViewProtocol", String.format("controls starting %s, setting timer", objArr));
                    this.f4918p.mo14723a(C1927i0.this.f4892E);
                    C1927i0.this.mo14518a((View) this.f4918p, (Runnable) new C1932c(), Math.round(a.optDouble(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY, 0.0d) * 1000.0d));
                }
                this.f4918p.mo14732f();
                C1927i0 i0Var2 = C1927i0.this;
                if (i0Var2.f4912v <= 1) {
                    i0Var2.f4717g.mo14295w();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo14642e(boolean z) {
            JSONObject jSONObject;
            this.f4918p.mo14733g();
            C1927i0 i0Var = C1927i0.this;
            if (i0Var.f4911u == 1 && z) {
                if (i0Var.f4912v < 1 && (jSONObject = i0Var.f4891D) != null && !jSONObject.isNull("post-video-reward-toaster")) {
                    C1927i0 i0Var2 = C1927i0.this;
                    if (i0Var2.f4895H && i0Var2.f4903P.mo14248e() && C1927i0.this.f4904Q.mo14248e()) {
                        m4619b(true);
                    }
                }
                m4618a(2, true);
                if (CBUtility.m4009b(CBUtility.m4006b(getContext()))) {
                    requestLayout();
                }
            }
        }

        /* renamed from: c */
        public C1967p1 mo14639c(boolean z) {
            return ((!C1927i0.this.mo14635t() || !z) && (C1927i0.this.mo14635t() || z)) ? this.f4879j : this.f4923u;
        }

        /* renamed from: a */
        private void m4618a(int i, boolean z) {
            C1927i0 i0Var = C1927i0.this;
            i0Var.f4911u = i;
            boolean z2 = true;
            if (i == 0) {
                i0Var.mo14522a(!i0Var.mo14635t(), (View) this.f4881l, z);
                C1927i0 i0Var2 = C1927i0.this;
                if (i0Var2.f4717g.f4448a == 2) {
                    i0Var2.mo14522a(true, (View) this.f4919q, z);
                }
                C1927i0 i0Var3 = C1927i0.this;
                if (i0Var3.f4907T) {
                    i0Var3.mo14522a(false, this.f4920r, z);
                }
                C1927i0.this.mo14522a(false, (View) this.f4918p, z);
                C1927i0.this.mo14522a(false, (View) this.f4917o, z);
                C1927i0.this.mo14522a(false, (View) this.f4921s, z);
                this.f4881l.setEnabled(false);
                this.f4917o.setEnabled(false);
                this.f4918p.setEnabled(false);
            } else if (i == 1) {
                i0Var.mo14522a(false, (View) this.f4881l, z);
                C1927i0 i0Var4 = C1927i0.this;
                if (i0Var4.f4717g.f4448a == 2) {
                    i0Var4.mo14522a(false, (View) this.f4919q, z);
                }
                C1927i0 i0Var5 = C1927i0.this;
                if (i0Var5.f4907T) {
                    i0Var5.mo14522a(true, this.f4920r, z);
                }
                C1927i0.this.mo14522a(true, (View) this.f4918p, z);
                C1927i0.this.mo14522a(false, (View) this.f4917o, z);
                C1927i0.this.mo14522a(false, (View) this.f4921s, z);
                this.f4881l.setEnabled(true);
                this.f4917o.setEnabled(false);
                this.f4918p.setEnabled(true);
            } else if (i == 2) {
                i0Var.mo14522a(true, (View) this.f4881l, z);
                C1927i0 i0Var6 = C1927i0.this;
                if (i0Var6.f4717g.f4448a == 2) {
                    i0Var6.mo14522a(false, (View) this.f4919q, z);
                }
                C1927i0 i0Var7 = C1927i0.this;
                if (i0Var7.f4907T) {
                    i0Var7.mo14522a(false, this.f4920r, z);
                }
                C1927i0.this.mo14522a(false, (View) this.f4918p, z);
                C1927i0.this.mo14522a(true, (View) this.f4917o, z);
                C1927i0.this.mo14522a(C1927i0.this.f4904Q.mo14248e() && C1927i0.this.f4903P.mo14248e() && C1927i0.this.f4894G, (View) this.f4921s, z);
                this.f4917o.setEnabled(true);
                this.f4881l.setEnabled(true);
                this.f4918p.setEnabled(false);
                if (C1927i0.this.f4896I) {
                    m4619b(false);
                }
            }
            boolean f = mo14643f();
            C1967p1 c = mo14639c(true);
            c.setEnabled(f);
            C1927i0.this.mo14522a(f, (View) c, z);
            C1967p1 c2 = mo14639c(false);
            c2.setEnabled(false);
            C1927i0.this.mo14522a(false, (View) c2, z);
            C1927i0 i0Var8 = C1927i0.this;
            if (i0Var8.f4908U || i0Var8.f4907T) {
                C1927i0 i0Var9 = C1927i0.this;
                i0Var9.mo14522a(!i0Var9.mo14635t(), (View) this.f4882m, z);
            }
            C1927i0 i0Var10 = C1927i0.this;
            i0Var10.mo14522a(!i0Var10.mo14635t(), (View) this.f4878i, z);
            if (i == 0) {
                z2 = false;
            }
            mo14542a(z2);
        }

        /* renamed from: a */
        public void mo14539a() {
            C1927i0.this.mo14534k();
            super.mo14539a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14626a(float f, float f2, float f3, float f4) {
            C1927i0 i0Var = C1927i0.this;
            if ((!i0Var.f4892E || i0Var.f4911u != 1) && C1927i0.this.f4911u != 0) {
                mo14638b(f, f2, f3, f4);
            }
        }
    }

    public C1927i0(Context context, C1838c cVar, C1828g gVar, Handler handler, C1883d dVar) {
        super(context, cVar, handler, dVar);
        this.f4909V = context;
        this.f4910t = gVar;
        this.f4911u = 0;
        this.f4898K = new C1830i(this);
        this.f4899L = new C1830i(this);
        this.f4900M = new C1830i(this);
        this.f4901N = new C1830i(this);
        this.f4902O = new C1830i(this);
        this.f4903P = new C1830i(this);
        this.f4904Q = new C1830i(this);
        this.f4905R = new C1830i(this);
        this.f4912v = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1887f.C1889b mo14516a(Context context) {
        return new C1929b(context);
    }

    /* renamed from: b */
    public boolean mo14525b(JSONObject jSONObject) {
        if (!super.mo14525b(jSONObject)) {
            return false;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("ux");
        this.f4891D = optJSONObject;
        if (optJSONObject == null) {
            this.f4891D = C1825e.m4025a(new C1825e.C1826a[0]);
        }
        if (this.f4715e.isNull("video-landscape") || this.f4715e.isNull("replay-landscape")) {
            this.f4721k = false;
        }
        if (!this.f4898K.mo14243a("replay-landscape") || !this.f4899L.mo14243a("replay-portrait") || !this.f4902O.mo14243a("video-click-button") || !this.f4903P.mo14243a("post-video-reward-icon") || !this.f4904Q.mo14243a("post-video-button") || !this.f4900M.mo14243a("video-confirmation-button") || !this.f4901N.mo14243a("video-confirmation-icon") || !this.f4905R.mo14243a("post-video-reward-icon")) {
            CBLogging.m3993b("InterstitialVideoViewProtocol", "Error while downloading the assets");
            mo14519a(CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE);
            return false;
        }
        this.f4892E = this.f4891D.optBoolean("video-controls-togglable");
        this.f4907T = jSONObject.optBoolean("fullscreen");
        this.f4908U = jSONObject.optBoolean("preroll_popup_fullscreen");
        if (this.f4717g.f4448a == 2) {
            JSONObject optJSONObject2 = this.f4891D.optJSONObject("confirmation");
            JSONObject optJSONObject3 = this.f4891D.optJSONObject("post-video-toaster");
            if (optJSONObject3 != null && !optJSONObject3.isNull("title") && !optJSONObject3.isNull("tagline")) {
                this.f4894G = true;
            }
            if (optJSONObject2 != null && !optJSONObject2.isNull("text") && !optJSONObject2.isNull("color")) {
                this.f4893F = true;
            }
            if (!this.f4891D.isNull("post-video-reward-toaster")) {
                this.f4895H = true;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14527d() {
        if (this.f4893F && (!this.f4900M.mo14248e() || !this.f4901N.mo14248e())) {
            this.f4893F = false;
        }
        super.mo14527d();
    }

    /* renamed from: g */
    public float mo14530g() {
        return (float) this.f4888A;
    }

    /* renamed from: h */
    public float mo14531h() {
        return (float) this.f4916z;
    }

    /* renamed from: j */
    public boolean mo14533j() {
        mo14532i().mo14627c();
        return true;
    }

    /* renamed from: k */
    public void mo14534k() {
        super.mo14534k();
        if (this.f4911u == 1 && !this.f4915y) {
            this.f4915y = true;
            mo14532i().f4918p.mo14731e();
        }
    }

    /* renamed from: l */
    public void mo14535l() {
        super.mo14535l();
        if (this.f4911u == 1 && this.f4915y) {
            mo14532i().f4918p.mo14720a().mo14651a(this.f4916z);
            mo14532i().f4918p.mo14732f();
        }
        this.f4915y = false;
    }

    /* renamed from: o */
    public C1929b mo14532i() {
        return (C1929b) super.mo14532i();
    }

    /* renamed from: p */
    public boolean mo14631p() {
        return this.f4717g.f4448a == 1;
    }

    /* renamed from: q */
    public boolean mo14632q() {
        return this.f4890C;
    }

    /* renamed from: r */
    public boolean mo14633r() {
        return this.f4911u == 1;
    }

    /* renamed from: s */
    public boolean mo14634s() {
        return this.f4889B;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14635t() {
        /*
            r4 = this;
            int r0 = r4.f4911u
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001d
            if (r0 == r2) goto L_0x000c
            r3 = 2
            if (r0 == r3) goto L_0x002e
            goto L_0x002d
        L_0x000c:
            boolean r0 = r4.f4907T
            if (r0 != 0) goto L_0x002d
            android.content.Context r0 = r4.f4909V
            int r0 = com.chartboost.sdk.Libraries.CBUtility.m4006b((android.content.Context) r0)
            boolean r0 = com.chartboost.sdk.Libraries.CBUtility.m4009b((int) r0)
            if (r0 == 0) goto L_0x002e
            goto L_0x002d
        L_0x001d:
            boolean r0 = r4.f4908U
            if (r0 != 0) goto L_0x002d
            android.content.Context r0 = r4.f4909V
            int r0 = com.chartboost.sdk.Libraries.CBUtility.m4006b((android.content.Context) r0)
            boolean r0 = com.chartboost.sdk.Libraries.CBUtility.m4009b((int) r0)
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1927i0.mo14635t():boolean");
    }

    /* renamed from: u */
    public void mo14636u() {
        if (this.f4913w != null) {
            new File(this.f4913w).delete();
        }
        this.f4890C = true;
        mo14519a(CBError.CBImpressionError.ERROR_PLAYING_VIDEO);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo14637v() {
        this.f4717g.mo14269H();
    }

    /* renamed from: a */
    public void mo14629a(boolean z) {
        this.f4889B = z;
    }

    /* renamed from: b */
    public void mo14524b() {
        super.mo14524b();
        this.f4898K = null;
        this.f4899L = null;
        this.f4902O = null;
        this.f4903P = null;
        this.f4904Q = null;
        this.f4900M = null;
        this.f4901N = null;
        this.f4905R = null;
    }
}
