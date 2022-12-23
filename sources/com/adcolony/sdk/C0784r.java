package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.MotionEventCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.r */
class C0784r extends EditText {

    /* renamed from: A */
    private C0589c f1300A;

    /* renamed from: B */
    private C0645d0 f1301B;

    /* renamed from: a */
    private final int f1302a = 0;

    /* renamed from: b */
    private final int f1303b = 1;

    /* renamed from: c */
    private final int f1304c = 2;

    /* renamed from: d */
    private final int f1305d = 3;

    /* renamed from: e */
    private final int f1306e = 1;

    /* renamed from: f */
    private final int f1307f = 2;

    /* renamed from: g */
    private final int f1308g = 3;

    /* renamed from: h */
    private final int f1309h = 0;

    /* renamed from: i */
    private final int f1310i = 1;

    /* renamed from: j */
    private final int f1311j = 2;

    /* renamed from: k */
    private final int f1312k = 1;

    /* renamed from: l */
    private final int f1313l = 2;

    /* renamed from: m */
    private int f1314m;

    /* renamed from: n */
    private int f1315n;

    /* renamed from: o */
    private int f1316o;

    /* renamed from: p */
    private int f1317p;

    /* renamed from: q */
    private int f1318q;

    /* renamed from: r */
    private int f1319r;

    /* renamed from: s */
    private int f1320s;

    /* renamed from: t */
    private int f1321t;

    /* renamed from: u */
    private int f1322u;

    /* renamed from: v */
    private int f1323v;

    /* renamed from: w */
    private String f1324w;

    /* renamed from: x */
    private String f1325x;

    /* renamed from: y */
    private String f1326y;

    /* renamed from: z */
    private String f1327z;

    /* renamed from: com.adcolony.sdk.r$a */
    class C0785a implements C0685f0 {
        C0785a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9837a(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$b */
    class C0786b implements C0685f0 {
        C0786b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9847k(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$c */
    class C0787c implements C0685f0 {
        C0787c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9841e(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$d */
    class C0788d implements C0685f0 {
        C0788d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9842f(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$e */
    class C0789e implements C0685f0 {
        C0789e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9840d(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$f */
    class C0790f implements C0685f0 {
        C0790f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9846j(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$g */
    class C0791g implements C0685f0 {
        C0791g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9843g(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$h */
    class C0792h implements C0685f0 {
        C0792h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9844h(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$i */
    class C0793i implements C0685f0 {
        C0793i() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9838b(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.r$j */
    class C0794j implements C0685f0 {
        C0794j() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0784r.this.mo9839c(d0Var)) {
                C0784r.this.mo9845i(d0Var);
            }
        }
    }

    private C0784r(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9835a(boolean z, int i) {
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
    public void mo9837a(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f1322u = C0894y.m1163d(b, "x");
        this.f1323v = C0894y.m1163d(b, "y");
        setGravity(mo9835a(true, this.f1322u) | mo9835a(false, this.f1323v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9838b(C0645d0 d0Var) {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "text", getText().toString());
        d0Var.mo9530a(b).mo9536d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9839c(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        return C0894y.m1163d(b, "id") == this.f1314m && C0894y.m1163d(b, "container_id") == this.f1300A.mo9450c() && C0894y.m1169h(b, "ad_session_id").equals(this.f1300A.mo9441a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9840d(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "background_color");
        this.f1325x = h;
        setBackgroundColor(C0849u0.m944f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9841e(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f1315n = C0894y.m1163d(b, "x");
        this.f1316o = C0894y.m1163d(b, "y");
        this.f1317p = C0894y.m1163d(b, "width");
        this.f1318q = C0894y.m1163d(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1315n, this.f1316o, 0, 0);
        layoutParams.width = this.f1317p;
        layoutParams.height = this.f1318q;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9842f(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "font_color");
        this.f1326y = h;
        setTextColor(C0849u0.m944f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9843g(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), ViewHierarchyConstants.TEXT_SIZE);
        this.f1321t = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9844h(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "font_style");
        this.f1319r = d;
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
    public void mo9845i(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "text");
        this.f1327z = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9846j(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "font_family");
        this.f1320s = d;
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
    public void mo9847k(C0645d0 d0Var) {
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
        C0894y.m1156b(b, "view_id", this.f1314m);
        C0894y.m1148a(b, "ad_session_id", this.f1324w);
        C0894y.m1156b(b, "container_x", this.f1315n + x);
        C0894y.m1156b(b, "container_y", this.f1316o + y);
        C0894y.m1156b(b, "view_x", x);
        C0894y.m1156b(b, "view_y", y);
        C0894y.m1156b(b, "id", this.f1300A.mo9450c());
        if (action == 0) {
            new C0645d0("AdContainer.on_touch_began", this.f1300A.mo9469k(), b).mo9536d();
        } else if (action == 1) {
            if (!this.f1300A.mo9476p()) {
                c.mo9585a(d.mo9506d().get(this.f1324w));
            }
            new C0645d0("AdContainer.on_touch_ended", this.f1300A.mo9469k(), b).mo9536d();
        } else if (action == 2) {
            new C0645d0("AdContainer.on_touch_moved", this.f1300A.mo9469k(), b).mo9536d();
        } else if (action == 3) {
            new C0645d0("AdContainer.on_touch_cancelled", this.f1300A.mo9469k(), b).mo9536d();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action2)) + this.f1315n);
            C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action2)) + this.f1316o);
            C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action2));
            C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action2));
            new C0645d0("AdContainer.on_touch_began", this.f1300A.mo9469k(), b).mo9536d();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action3)) + this.f1315n);
            C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action3)) + this.f1316o);
            C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action3));
            C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f1300A.mo9476p()) {
                c.mo9585a(d.mo9506d().get(this.f1324w));
            }
            new C0645d0("AdContainer.on_touch_ended", this.f1300A.mo9469k(), b).mo9536d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9836a() {
        C0897z0 b = this.f1301B.mo9532b();
        this.f1324w = C0894y.m1169h(b, "ad_session_id");
        this.f1315n = C0894y.m1163d(b, "x");
        this.f1316o = C0894y.m1163d(b, "y");
        this.f1317p = C0894y.m1163d(b, "width");
        this.f1318q = C0894y.m1163d(b, "height");
        this.f1320s = C0894y.m1163d(b, "font_family");
        this.f1319r = C0894y.m1163d(b, "font_style");
        this.f1321t = C0894y.m1163d(b, ViewHierarchyConstants.TEXT_SIZE);
        this.f1325x = C0894y.m1169h(b, "background_color");
        this.f1326y = C0894y.m1169h(b, "font_color");
        this.f1327z = C0894y.m1169h(b, "text");
        this.f1322u = C0894y.m1163d(b, "align_x");
        this.f1323v = C0894y.m1163d(b, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f1317p, this.f1318q);
        layoutParams.setMargins(this.f1315n, this.f1316o, 0, 0);
        layoutParams.gravity = 0;
        this.f1300A.addView(this, layoutParams);
        int i = this.f1320s;
        if (i == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i2 = this.f1319r;
        if (i2 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i2 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i2 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i2 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setText(this.f1327z);
        setTextSize((float) this.f1321t);
        setGravity(mo9835a(true, this.f1322u) | mo9835a(false, this.f1323v));
        if (!this.f1325x.equals("")) {
            setBackgroundColor(C0849u0.m944f(this.f1325x));
        }
        if (!this.f1326y.equals("")) {
            setTextColor(C0849u0.m944f(this.f1326y));
        }
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_visible", (C0685f0) new C0786b(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_bounds", (C0685f0) new C0787c(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_font_color", (C0685f0) new C0788d(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_background_color", (C0685f0) new C0789e(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_typeface", (C0685f0) new C0790f(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_font_size", (C0685f0) new C0791g(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_font_style", (C0685f0) new C0792h(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.get_text", (C0685f0) new C0793i(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.set_text", (C0685f0) new C0794j(), true));
        this.f1300A.mo9465i().add(C0578a.m135a("TextView.align", (C0685f0) new C0785a(), true));
        this.f1300A.mo9467j().add("TextView.set_visible");
        this.f1300A.mo9467j().add("TextView.set_bounds");
        this.f1300A.mo9467j().add("TextView.set_font_color");
        this.f1300A.mo9467j().add("TextView.set_background_color");
        this.f1300A.mo9467j().add("TextView.set_typeface");
        this.f1300A.mo9467j().add("TextView.set_font_size");
        this.f1300A.mo9467j().add("TextView.set_font_style");
        this.f1300A.mo9467j().add("TextView.get_text");
        this.f1300A.mo9467j().add("TextView.set_text");
        this.f1300A.mo9467j().add("TextView.align");
    }

    C0784r(Context context, C0645d0 d0Var, int i, C0589c cVar) {
        super(context);
        this.f1314m = i;
        this.f1301B = d0Var;
        this.f1300A = cVar;
    }
}
