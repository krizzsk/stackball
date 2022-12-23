package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;

/* renamed from: com.adcolony.sdk.w */
class C0868w extends ImageView {

    /* renamed from: a */
    private int f1523a;

    /* renamed from: b */
    private int f1524b;

    /* renamed from: c */
    private int f1525c;

    /* renamed from: d */
    private int f1526d;

    /* renamed from: e */
    private int f1527e;

    /* renamed from: f */
    private boolean f1528f;

    /* renamed from: g */
    private boolean f1529g;

    /* renamed from: h */
    private boolean f1530h;

    /* renamed from: i */
    private String f1531i;

    /* renamed from: j */
    private String f1532j;

    /* renamed from: k */
    private C0645d0 f1533k;

    /* renamed from: l */
    private C0589c f1534l;

    /* renamed from: com.adcolony.sdk.w$a */
    class C0869a implements C0685f0 {
        C0869a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0868w.this.m1027a(d0Var)) {
                C0868w.this.m1033d(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w$b */
    class C0870b implements C0685f0 {
        C0870b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0868w.this.m1027a(d0Var)) {
                C0868w.this.m1029b(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w$c */
    class C0871c implements C0685f0 {
        C0871c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0868w.this.m1027a(d0Var)) {
                C0868w.this.m1031c(d0Var);
            }
        }
    }

    private C0868w(Context context) {
        super(context);
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
        C0894y.m1156b(b, "view_id", this.f1523a);
        C0894y.m1148a(b, "ad_session_id", this.f1532j);
        C0894y.m1156b(b, "container_x", this.f1524b + x);
        C0894y.m1156b(b, "container_y", this.f1525c + y);
        C0894y.m1156b(b, "view_x", x);
        C0894y.m1156b(b, "view_y", y);
        C0894y.m1156b(b, "id", this.f1534l.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f1534l.mo9476p()) {
                    c.mo9585a(d.mo9506d().get(this.f1532j));
                }
                if (x <= 0 || x >= this.f1526d || i <= 0 || i >= this.f1527e) {
                    new C0645d0("AdContainer.on_touch_cancelled", this.f1534l.mo9469k(), b).mo9536d();
                    return true;
                }
                new C0645d0("AdContainer.on_touch_ended", this.f1534l.mo9469k(), b).mo9536d();
                return true;
            } else if (action == 2) {
                new C0645d0("AdContainer.on_touch_moved", this.f1534l.mo9469k(), b).mo9536d();
                return true;
            } else if (action == 3) {
                new C0645d0("AdContainer.on_touch_cancelled", this.f1534l.mo9469k(), b).mo9536d();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action2)) + this.f1524b);
                C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action2)) + this.f1525c);
                C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action2));
                C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action2));
                new C0645d0("AdContainer.on_touch_began", this.f1534l.mo9469k(), b).mo9536d();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action3)) + this.f1524b);
                C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action3)) + this.f1525c);
                C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action3));
                C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f1534l.mo9476p()) {
                    c.mo9585a(d.mo9506d().get(this.f1532j));
                }
                if (x2 <= 0 || x2 >= this.f1526d || y2 <= 0 || y2 >= this.f1527e) {
                    new C0645d0("AdContainer.on_touch_cancelled", this.f1534l.mo9469k(), b).mo9536d();
                    return true;
                }
                new C0645d0("AdContainer.on_touch_ended", this.f1534l.mo9469k(), b).mo9536d();
                return true;
            }
        } else {
            new C0645d0("AdContainer.on_touch_began", this.f1534l.mo9469k(), b).mo9536d();
            return true;
        }
    }

    C0868w(Context context, C0645d0 d0Var, int i, C0589c cVar) {
        super(context);
        this.f1523a = i;
        this.f1533k = d0Var;
        this.f1534l = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1027a(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        return C0894y.m1163d(b, "id") == this.f1523a && C0894y.m1163d(b, "container_id") == this.f1534l.mo9450c() && C0894y.m1169h(b, "ad_session_id").equals(this.f1534l.mo9441a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1029b(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f1524b = C0894y.m1163d(b, "x");
        this.f1525c = C0894y.m1163d(b, "y");
        this.f1526d = C0894y.m1163d(b, "width");
        this.f1527e = C0894y.m1163d(b, "height");
        if (this.f1528f) {
            float o = (((float) this.f1527e) * C0578a.m143c().mo9611o().mo9750o()) / ((float) getDrawable().getIntrinsicHeight());
            this.f1527e = (int) (((float) getDrawable().getIntrinsicHeight()) * o);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * o);
            this.f1526d = intrinsicWidth;
            this.f1524b -= intrinsicWidth;
            this.f1525c -= this.f1527e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1524b, this.f1525c, 0, 0);
        layoutParams.width = this.f1526d;
        layoutParams.height = this.f1527e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1031c(C0645d0 d0Var) {
        this.f1531i = C0894y.m1169h(d0Var.mo9532b(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f1531i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m1033d(C0645d0 d0Var) {
        if (C0894y.m1155b(d0Var.mo9532b(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9946a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        C0897z0 b = this.f1533k.mo9532b();
        this.f1532j = C0894y.m1169h(b, "ad_session_id");
        this.f1524b = C0894y.m1163d(b, "x");
        this.f1525c = C0894y.m1163d(b, "y");
        this.f1526d = C0894y.m1163d(b, "width");
        this.f1527e = C0894y.m1163d(b, "height");
        this.f1531i = C0894y.m1169h(b, "filepath");
        this.f1528f = C0894y.m1155b(b, "dpi");
        this.f1529g = C0894y.m1155b(b, "invert_y");
        this.f1530h = C0894y.m1155b(b, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f1531i)));
        if (this.f1528f) {
            float o = (((float) this.f1527e) * C0578a.m143c().mo9611o().mo9750o()) / ((float) getDrawable().getIntrinsicHeight());
            this.f1527e = (int) (((float) getDrawable().getIntrinsicHeight()) * o);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * o);
            this.f1526d = intrinsicWidth;
            this.f1524b -= intrinsicWidth;
            if (this.f1529g) {
                i = this.f1525c + this.f1527e;
            } else {
                i = this.f1525c - this.f1527e;
            }
            this.f1525c = i;
        }
        setVisibility(4);
        if (this.f1530h) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f1526d, this.f1527e);
        }
        layoutParams.setMargins(this.f1524b, this.f1525c, 0, 0);
        layoutParams.gravity = 0;
        this.f1534l.addView(this, layoutParams);
        this.f1534l.mo9465i().add(C0578a.m135a("ImageView.set_visible", (C0685f0) new C0869a(), true));
        this.f1534l.mo9465i().add(C0578a.m135a("ImageView.set_bounds", (C0685f0) new C0870b(), true));
        this.f1534l.mo9465i().add(C0578a.m135a("ImageView.set_image", (C0685f0) new C0871c(), true));
        this.f1534l.mo9467j().add("ImageView.set_visible");
        this.f1534l.mo9467j().add("ImageView.set_bounds");
        this.f1534l.mo9467j().add("ImageView.set_image");
    }
}
