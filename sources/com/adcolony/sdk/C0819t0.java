package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.MotionEventCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.t0 */
class C0819t0 extends Button {

    /* renamed from: A */
    private C0589c f1384A;

    /* renamed from: B */
    private C0645d0 f1385B;

    /* renamed from: a */
    private final int f1386a = 0;

    /* renamed from: b */
    private final int f1387b = 1;

    /* renamed from: c */
    private final int f1388c = 2;

    /* renamed from: d */
    private final int f1389d = 3;

    /* renamed from: e */
    private final int f1390e = 1;

    /* renamed from: f */
    private final int f1391f = 2;

    /* renamed from: g */
    private final int f1392g = 3;

    /* renamed from: h */
    private final int f1393h = 0;

    /* renamed from: i */
    private final int f1394i = 1;

    /* renamed from: j */
    private final int f1395j = 2;

    /* renamed from: k */
    private final int f1396k = 1;

    /* renamed from: l */
    private final int f1397l = 2;

    /* renamed from: m */
    private int f1398m;

    /* renamed from: n */
    private int f1399n;

    /* renamed from: o */
    private int f1400o;

    /* renamed from: p */
    private int f1401p;

    /* renamed from: q */
    private int f1402q;

    /* renamed from: r */
    private int f1403r;

    /* renamed from: s */
    private int f1404s;

    /* renamed from: t */
    private int f1405t;

    /* renamed from: u */
    private int f1406u;

    /* renamed from: v */
    private int f1407v;

    /* renamed from: w */
    private String f1408w;

    /* renamed from: x */
    private String f1409x;

    /* renamed from: y */
    private String f1410y;

    /* renamed from: z */
    private String f1411z;

    /* renamed from: com.adcolony.sdk.t0$a */
    class C0820a implements C0685f0 {
        C0820a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9883a(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$b */
    class C0821b implements C0685f0 {
        C0821b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9893k(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$c */
    class C0822c implements C0685f0 {
        C0822c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9887e(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$d */
    class C0823d implements C0685f0 {
        C0823d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9888f(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$e */
    class C0824e implements C0685f0 {
        C0824e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9886d(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$f */
    class C0825f implements C0685f0 {
        C0825f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9892j(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$g */
    class C0826g implements C0685f0 {
        C0826g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9889g(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$h */
    class C0827h implements C0685f0 {
        C0827h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9890h(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$i */
    class C0828i implements C0685f0 {
        C0828i() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9884b(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.t0$j */
    class C0829j implements C0685f0 {
        C0829j() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0819t0.this.mo9885c(d0Var)) {
                C0819t0.this.mo9891i(d0Var);
            }
        }
    }

    private C0819t0(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9881a(boolean z, int i) {
        if (i == 0) {
            return z ? 1 : 16;
        }
        if (i != 1) {
            if (i != 2) {
                return 17;
            }
            if (z) {
                return GravityCompat.END;
            }
            return 80;
        } else if (z) {
            return GravityCompat.START;
        } else {
            return 48;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9883a(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f1406u = C0894y.m1163d(b, "x");
        this.f1407v = C0894y.m1163d(b, "y");
        setGravity(mo9881a(true, this.f1406u) | mo9881a(false, this.f1407v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9884b(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "text", getText().toString());
        d0Var.mo9530a(b).mo9536d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9885c(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        return C0894y.m1163d(b, "id") == this.f1398m && C0894y.m1163d(b, "container_id") == this.f1384A.mo9450c() && C0894y.m1169h(b, "ad_session_id").equals(this.f1384A.mo9441a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9886d(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "background_color");
        this.f1408w = h;
        setBackgroundColor(C0849u0.m944f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9887e(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f1399n = C0894y.m1163d(b, "x");
        this.f1400o = C0894y.m1163d(b, "y");
        this.f1401p = C0894y.m1163d(b, "width");
        this.f1402q = C0894y.m1163d(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1399n, this.f1400o, 0, 0);
        layoutParams.width = this.f1401p;
        layoutParams.height = this.f1402q;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9888f(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "font_color");
        this.f1409x = h;
        setTextColor(C0849u0.m944f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9889g(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), ViewHierarchyConstants.TEXT_SIZE);
        this.f1405t = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9890h(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "font_style");
        this.f1403r = d;
        if (d == 0) {
            setTypeface(getTypeface(), 0);
        } else if (d == 1) {
            setTypeface(getTypeface(), 1);
        } else if (d == 2) {
            setTypeface(getTypeface(), 2);
        } else if (d == 3) {
            setTypeface(getTypeface(), 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9891i(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "text");
        this.f1410y = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9892j(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "font_family");
        this.f1404s = d;
        if (d == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (d == 1) {
            setTypeface(Typeface.SERIF);
        } else if (d == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (d == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9893k(C0645d0 d0Var) {
        if (C0894y.m1155b(d0Var.mo9532b(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0693i c = C0578a.m143c();
        C0612d d = c.mo9597d();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0897z0 b = C0894y.m1151b();
        C0894y.m1156b(b, "view_id", this.f1398m);
        C0894y.m1148a(b, "ad_session_id", this.f1411z);
        C0894y.m1156b(b, "container_x", this.f1399n + x);
        C0894y.m1156b(b, "container_y", this.f1400o + y);
        C0894y.m1156b(b, "view_x", x);
        C0894y.m1156b(b, "view_y", y);
        C0894y.m1156b(b, "id", this.f1384A.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f1384A.mo9476p()) {
                    c.mo9585a(d.mo9506d().get(this.f1411z));
                }
                if (x <= 0 || x >= getWidth() || i <= 0 || i >= getHeight()) {
                    new C0645d0("AdContainer.on_touch_cancelled", this.f1384A.mo9469k(), b).mo9536d();
                    return true;
                }
                new C0645d0("AdContainer.on_touch_ended", this.f1384A.mo9469k(), b).mo9536d();
                return true;
            } else if (action == 2) {
                new C0645d0("AdContainer.on_touch_moved", this.f1384A.mo9469k(), b).mo9536d();
                return true;
            } else if (action == 3) {
                new C0645d0("AdContainer.on_touch_cancelled", this.f1384A.mo9469k(), b).mo9536d();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action2)) + this.f1399n);
                C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action2)) + this.f1400o);
                C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action2));
                C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action2));
                new C0645d0("AdContainer.on_touch_began", this.f1384A.mo9469k(), b).mo9536d();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action3)) + this.f1399n);
                C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action3)) + this.f1400o);
                C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action3));
                C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f1384A.mo9476p()) {
                    c.mo9585a(d.mo9506d().get(this.f1411z));
                }
                if (x2 <= 0 || x2 >= getWidth() || y2 <= 0 || y2 >= getHeight()) {
                    new C0645d0("AdContainer.on_touch_cancelled", this.f1384A.mo9469k(), b).mo9536d();
                    return true;
                }
                new C0645d0("AdContainer.on_touch_ended", this.f1384A.mo9469k(), b).mo9536d();
                return true;
            }
        } else {
            new C0645d0("AdContainer.on_touch_began", this.f1384A.mo9469k(), b).mo9536d();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9882a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        C0897z0 b = this.f1385B.mo9532b();
        this.f1411z = C0894y.m1169h(b, "ad_session_id");
        this.f1399n = C0894y.m1163d(b, "x");
        this.f1400o = C0894y.m1163d(b, "y");
        this.f1401p = C0894y.m1163d(b, "width");
        this.f1402q = C0894y.m1163d(b, "height");
        this.f1404s = C0894y.m1163d(b, "font_family");
        this.f1403r = C0894y.m1163d(b, "font_style");
        this.f1405t = C0894y.m1163d(b, ViewHierarchyConstants.TEXT_SIZE);
        this.f1408w = C0894y.m1169h(b, "background_color");
        this.f1409x = C0894y.m1169h(b, "font_color");
        this.f1410y = C0894y.m1169h(b, "text");
        this.f1406u = C0894y.m1163d(b, "align_x");
        this.f1407v = C0894y.m1163d(b, "align_y");
        C0693i c = C0578a.m143c();
        if (this.f1410y.equals("")) {
            this.f1410y = "Learn More";
        }
        setVisibility(4);
        if (C0894y.m1155b(b, "wrap_content")) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f1401p, this.f1402q);
        }
        layoutParams.gravity = 0;
        setText(this.f1410y);
        setTextSize((float) this.f1405t);
        if (C0894y.m1155b(b, "overlay")) {
            this.f1399n = 0;
            this.f1400o = 0;
            i2 = (int) (c.mo9611o().mo9750o() * 6.0f);
            i = (int) (c.mo9611o().mo9750o() * 6.0f);
            int o = (int) (c.mo9611o().mo9750o() * 4.0f);
            setPadding(o, o, o, o);
            layoutParams.gravity = 8388693;
        } else {
            i2 = 0;
            i = 0;
        }
        layoutParams.setMargins(this.f1399n, this.f1400o, i2, i);
        this.f1384A.addView(this, layoutParams);
        int i3 = this.f1404s;
        if (i3 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i3 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i3 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i3 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i4 = this.f1403r;
        if (i4 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i4 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i4 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i4 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(mo9881a(true, this.f1406u) | mo9881a(false, this.f1407v));
        if (!this.f1408w.equals("")) {
            setBackgroundColor(C0849u0.m944f(this.f1408w));
        }
        if (!this.f1409x.equals("")) {
            setTextColor(C0849u0.m944f(this.f1409x));
        }
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_visible", (C0685f0) new C0821b(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_bounds", (C0685f0) new C0822c(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_font_color", (C0685f0) new C0823d(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_background_color", (C0685f0) new C0824e(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_typeface", (C0685f0) new C0825f(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_font_size", (C0685f0) new C0826g(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_font_style", (C0685f0) new C0827h(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.get_text", (C0685f0) new C0828i(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.set_text", (C0685f0) new C0829j(), true));
        this.f1384A.mo9465i().add(C0578a.m135a("TextView.align", (C0685f0) new C0820a(), true));
        this.f1384A.mo9467j().add("TextView.set_visible");
        this.f1384A.mo9467j().add("TextView.set_bounds");
        this.f1384A.mo9467j().add("TextView.set_font_color");
        this.f1384A.mo9467j().add("TextView.set_background_color");
        this.f1384A.mo9467j().add("TextView.set_typeface");
        this.f1384A.mo9467j().add("TextView.set_font_size");
        this.f1384A.mo9467j().add("TextView.set_font_style");
        this.f1384A.mo9467j().add("TextView.get_text");
        this.f1384A.mo9467j().add("TextView.set_text");
        this.f1384A.mo9467j().add("TextView.align");
    }

    C0819t0(Context context, C0645d0 d0Var, int i, C0589c cVar) {
        super(context);
        this.f1398m = i;
        this.f1385B = d0Var;
        this.f1384A = cVar;
    }

    C0819t0(Context context, int i, C0645d0 d0Var, int i2, C0589c cVar) {
        super(context, (AttributeSet) null, i);
        this.f1398m = i2;
        this.f1385B = d0Var;
        this.f1384A = cVar;
    }
}
