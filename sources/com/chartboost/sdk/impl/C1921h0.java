package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C1887f;
import com.chartboost.sdk.C1892h;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.C1830i;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.CBError;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.h0 */
public class C1921h0 extends C1887f {

    /* renamed from: m */
    C1830i f4871m = new C1830i(this);

    /* renamed from: n */
    C1830i f4872n = new C1830i(this);

    /* renamed from: o */
    C1830i f4873o = new C1830i(this);

    /* renamed from: p */
    C1830i f4874p = new C1830i(this);

    /* renamed from: q */
    C1830i f4875q = new C1830i(this);

    /* renamed from: r */
    C1830i f4876r = new C1830i(this);

    /* renamed from: s */
    protected float f4877s = 1.0f;

    /* renamed from: com.chartboost.sdk.impl.h0$a */
    public class C1922a extends C1887f.C1889b {

        /* renamed from: i */
        protected C1963o1 f4878i;

        /* renamed from: j */
        protected C1967p1 f4879j;

        /* renamed from: k */
        private boolean f4880k = false;

        /* renamed from: l */
        protected C1967p1 f4881l;

        /* renamed from: m */
        protected ImageView f4882m;

        /* renamed from: com.chartboost.sdk.impl.h0$a$a */
        class C1923a extends C1967p1 {
            C1923a(Context context, C1921h0 h0Var) {
                super(context);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo14620a(MotionEvent motionEvent) {
                C1922a.this.mo14626a(motionEvent.getX(), motionEvent.getY(), (float) C1922a.this.f4881l.getWidth(), (float) C1922a.this.f4881l.getHeight());
            }
        }

        /* renamed from: com.chartboost.sdk.impl.h0$a$b */
        class C1924b extends C1967p1 {
            C1924b(Context context) {
                super(context);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo14620a(MotionEvent motionEvent) {
                C1922a.this.mo14627c();
            }
        }

        protected C1922a(Context context) {
            super(context);
            setBackgroundColor(0);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            C1892h a = C1892h.m4431a();
            C1963o1 o1Var = (C1963o1) a.mo14549a(new C1963o1(context));
            this.f4878i = o1Var;
            addView(o1Var, new RelativeLayout.LayoutParams(-1, -1));
            C1967p1 p1Var = (C1967p1) a.mo14549a(new C1923a(context, C1921h0.this));
            this.f4881l = p1Var;
            mo14541a((View) p1Var);
            this.f4881l.setContentDescription("CBAd");
            ImageView imageView = (ImageView) a.mo14549a(new ImageView(context));
            this.f4882m = imageView;
            imageView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            addView(this.f4882m);
            addView(this.f4881l);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo14627c() {
            C1921h0.this.mo14517a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo14628d() {
            C1924b bVar = new C1924b(getContext());
            this.f4879j = bVar;
            bVar.setContentDescription("CBClose");
            addView(this.f4879j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14626a(float f, float f2, float f3, float f4) {
            C1921h0.this.mo14523a(C1825e.m4025a(C1825e.m4023a("x", (Object) Float.valueOf(f)), C1825e.m4023a("y", (Object) Float.valueOf(f2)), C1825e.m4023a("w", (Object) Float.valueOf(f3)), C1825e.m4023a("h", (Object) Float.valueOf(f4))));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14540a(int i, int i2) {
            int i3;
            int i4;
            if (!this.f4880k) {
                mo14628d();
                this.f4880k = true;
            }
            boolean b = CBUtility.m4009b(C1921h0.this.mo14529f());
            C1830i iVar = b ? C1921h0.this.f4871m : C1921h0.this.f4872n;
            C1830i iVar2 = b ? C1921h0.this.f4873o : C1921h0.this.f4874p;
            if (!iVar.mo14248e()) {
                C1921h0 h0Var = C1921h0.this;
                C1830i iVar3 = h0Var.f4871m;
                iVar = iVar == iVar3 ? h0Var.f4872n : iVar3;
            }
            if (!iVar2.mo14248e()) {
                C1921h0 h0Var2 = C1921h0.this;
                C1830i iVar4 = h0Var2.f4873o;
                iVar2 = iVar2 == iVar4 ? h0Var2.f4874p : iVar4;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            C1921h0.this.mo14624a(layoutParams, iVar, 1.0f);
            C1921h0.this.f4877s = Math.min(Math.min(((float) i) / ((float) layoutParams.width), ((float) i2) / ((float) layoutParams.height)), 1.0f);
            C1921h0 h0Var3 = C1921h0.this;
            float f = h0Var3.f4877s;
            layoutParams.width = (int) (((float) layoutParams.width) * f);
            layoutParams.height = (int) (((float) layoutParams.height) * f);
            Point b2 = h0Var3.mo14625b(b ? "frame-portrait" : "frame-landscape");
            layoutParams.leftMargin = Math.round((((float) (i - layoutParams.width)) / 2.0f) + ((((float) b2.x) / iVar.mo14242a()) * C1921h0.this.f4877s));
            layoutParams.topMargin = Math.round((((float) (i2 - layoutParams.height)) / 2.0f) + ((((float) b2.y) / iVar.mo14242a()) * C1921h0.this.f4877s));
            C1921h0.this.mo14624a(layoutParams2, iVar2, 1.0f);
            Point b3 = C1921h0.this.mo14625b(b ? "close-portrait" : "close-landscape");
            if (b3.x == 0 && b3.y == 0) {
                i4 = layoutParams.leftMargin + layoutParams.width + Math.round(((float) (-layoutParams2.width)) / 2.0f);
                i3 = layoutParams.topMargin + Math.round(((float) (-layoutParams2.height)) / 2.0f);
            } else {
                int round = Math.round(((((float) layoutParams.leftMargin) + (((float) layoutParams.width) / 2.0f)) + ((float) b3.x)) - (((float) layoutParams2.width) / 2.0f));
                i3 = Math.round(((((float) layoutParams.topMargin) + (((float) layoutParams.height) / 2.0f)) + ((float) b3.y)) - (((float) layoutParams2.height) / 2.0f));
                i4 = round;
            }
            layoutParams2.leftMargin = Math.min(Math.max(0, i4), i - layoutParams2.width);
            layoutParams2.topMargin = Math.min(Math.max(0, i3), i2 - layoutParams2.height);
            this.f4878i.setLayoutParams(layoutParams);
            this.f4879j.setLayoutParams(layoutParams2);
            this.f4878i.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f4878i.mo14746a(iVar);
            this.f4879j.mo14757a(iVar2);
            C1830i iVar5 = b ? C1921h0.this.f4875q : C1921h0.this.f4876r;
            if (!iVar5.mo14248e()) {
                C1921h0 h0Var4 = C1921h0.this;
                C1830i iVar6 = h0Var4.f4875q;
                iVar5 = iVar5 == iVar6 ? h0Var4.f4876r : iVar6;
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            C1921h0 h0Var5 = C1921h0.this;
            h0Var5.mo14624a(layoutParams3, iVar5, h0Var5.f4877s);
            Point b4 = C1921h0.this.mo14625b(b ? "ad-portrait" : "ad-landscape");
            layoutParams3.leftMargin = Math.round((((float) (i - layoutParams3.width)) / 2.0f) + ((((float) b4.x) / iVar5.mo14242a()) * C1921h0.this.f4877s));
            layoutParams3.topMargin = Math.round((((float) (i2 - layoutParams3.height)) / 2.0f) + ((((float) b4.y) / iVar5.mo14242a()) * C1921h0.this.f4877s));
            this.f4882m.setLayoutParams(layoutParams3);
            this.f4881l.setLayoutParams(layoutParams3);
            this.f4881l.mo14756a(ImageView.ScaleType.FIT_CENTER);
            this.f4881l.mo14757a(iVar5);
        }

        /* renamed from: a */
        public void mo14539a() {
            super.mo14539a();
            this.f4878i = null;
            this.f4879j = null;
            this.f4881l = null;
            this.f4882m = null;
        }
    }

    public C1921h0(Context context, C1838c cVar, Handler handler, C1883d dVar) {
        super(context, cVar, handler, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1887f.C1889b mo14516a(Context context) {
        return new C1922a(context);
    }

    /* renamed from: b */
    public boolean mo14525b(JSONObject jSONObject) {
        if (!super.mo14525b(jSONObject)) {
            return false;
        }
        if (this.f4715e.isNull("frame-portrait") || this.f4715e.isNull("close-portrait")) {
            this.f4720j = false;
        }
        if (this.f4715e.isNull("frame-landscape") || this.f4715e.isNull("close-landscape")) {
            this.f4721k = false;
        }
        if (this.f4715e.isNull("ad-portrait")) {
            this.f4720j = false;
        }
        if (this.f4715e.isNull("ad-landscape")) {
            this.f4721k = false;
        }
        if (this.f4872n.mo14243a("frame-landscape") && this.f4871m.mo14243a("frame-portrait") && this.f4874p.mo14243a("close-landscape") && this.f4873o.mo14243a("close-portrait") && this.f4876r.mo14243a("ad-landscape") && this.f4875q.mo14243a("ad-portrait")) {
            return true;
        }
        CBLogging.m3993b("ImageViewProtocol", "Error while downloading the assets");
        mo14519a(CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE);
        return false;
    }

    /* renamed from: a */
    public void mo14624a(ViewGroup.LayoutParams layoutParams, C1830i iVar, float f) {
        if (iVar != null && iVar.mo14248e()) {
            layoutParams.width = (int) ((((float) iVar.mo14247d()) / iVar.mo14242a()) * f);
            layoutParams.height = (int) ((((float) iVar.mo14246c()) / iVar.mo14242a()) * f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Point mo14625b(String str) {
        JSONObject a = C1825e.m4024a(this.f4715e, str, "offset");
        if (a != null) {
            return new Point(a.optInt("x"), a.optInt("y"));
        }
        return new Point(0, 0);
    }

    /* renamed from: b */
    public void mo14524b() {
        super.mo14524b();
        this.f4872n = null;
        this.f4871m = null;
        this.f4874p = null;
        this.f4873o = null;
        this.f4876r = null;
        this.f4875q = null;
    }
}
