package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.adcolony.sdk.C0580a0;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.adcolony.sdk.c */
class C0589c extends FrameLayout {

    /* renamed from: a */
    private HashMap<Integer, C0857v0> f221a;

    /* renamed from: b */
    private HashMap<Integer, C0819t0> f222b;

    /* renamed from: c */
    private HashMap<Integer, C0872w0> f223c;

    /* renamed from: d */
    private HashMap<Integer, C0784r> f224d;

    /* renamed from: e */
    private HashMap<Integer, C0868w> f225e;

    /* renamed from: f */
    private HashMap<Integer, Boolean> f226f;

    /* renamed from: g */
    private HashMap<Integer, View> f227g;

    /* renamed from: h */
    private int f228h;

    /* renamed from: i */
    private int f229i;

    /* renamed from: j */
    private int f230j;

    /* renamed from: k */
    private int f231k;

    /* renamed from: l */
    private String f232l;

    /* renamed from: m */
    boolean f233m;

    /* renamed from: n */
    boolean f234n;

    /* renamed from: o */
    private float f235o = 0.0f;

    /* renamed from: p */
    private double f236p = 0.0d;

    /* renamed from: q */
    private int f237q = 0;

    /* renamed from: r */
    private int f238r = 0;

    /* renamed from: s */
    private ArrayList<C0685f0> f239s;

    /* renamed from: t */
    private ArrayList<String> f240t;

    /* renamed from: u */
    private boolean f241u;

    /* renamed from: v */
    private boolean f242v;

    /* renamed from: w */
    private boolean f243w;

    /* renamed from: x */
    private AdSession f244x;

    /* renamed from: y */
    Context f245y;

    /* renamed from: z */
    VideoView f246z;

    /* renamed from: com.adcolony.sdk.c$a */
    class C0590a implements C0685f0 {
        C0590a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0589c cVar = C0589c.this;
                cVar.mo9444a((View) cVar.mo9451c(d0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$b */
    class C0591b implements C0685f0 {
        C0591b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0589c.this.mo9462g(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c */
    class C0592c implements C0685f0 {

        /* renamed from: com.adcolony.sdk.c$c$a */
        class C0593a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f250a;

            C0593a(C0645d0 d0Var) {
                this.f250a = d0Var;
            }

            public void run() {
                C0589c cVar = C0589c.this;
                cVar.mo9444a((View) cVar.mo9454d(this.f250a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C0592c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0849u0.m931b((Runnable) new C0593a(d0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$d */
    class C0594d implements C0685f0 {

        /* renamed from: com.adcolony.sdk.c$d$a */
        class C0595a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f253a;

            C0595a(C0645d0 d0Var) {
                this.f253a = d0Var;
            }

            public void run() {
                C0589c.this.mo9464h(this.f253a);
            }
        }

        C0594d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0849u0.m931b((Runnable) new C0595a(d0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$e */
    class C0596e implements C0685f0 {
        C0596e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0589c cVar = C0589c.this;
                cVar.mo9444a(cVar.mo9448b(d0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$f */
    class C0597f implements C0685f0 {
        C0597f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0589c.this.mo9460f(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$g */
    class C0598g implements C0685f0 {
        C0598g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0589c cVar = C0589c.this;
                cVar.mo9444a((View) cVar.mo9440a(d0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$h */
    class C0599h implements C0685f0 {
        C0599h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0589c.this.mo9466i(d0Var)) {
                C0589c.this.mo9458e(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$i */
    class C0600i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f259a;

        C0600i(boolean z) {
            this.f259a = z;
        }

        public void run() {
            C0589c cVar = C0589c.this;
            if (!cVar.f233m) {
                cVar.m193a(this.f259a);
                C0589c.this.m195b(this.f259a);
            }
        }
    }

    C0589c(Context context, String str) {
        super(context);
        this.f245y = context;
        this.f232l = str;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0857v0 mo9451c(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "id");
        C0857v0 v0Var = new C0857v0(this.f245y, d0Var, d, this);
        v0Var.mo9925d();
        this.f221a.put(Integer.valueOf(d), v0Var);
        this.f227g.put(Integer.valueOf(d), v0Var);
        return v0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0872w0 mo9454d(C0645d0 d0Var) {
        C0872w0 w0Var;
        C0897z0 b = d0Var.mo9532b();
        int d = C0894y.m1163d(b, "id");
        boolean b2 = C0894y.m1155b(b, "is_module");
        C0693i c = C0578a.m143c();
        if (b2) {
            w0Var = c.mo9573E().get(Integer.valueOf(C0894y.m1163d(b, "module_id")));
            if (w0Var == null) {
                new C0580a0.C0581a().mo9419a("Module WebView created with invalid id").mo9421a(C0580a0.f191i);
                return null;
            }
            w0Var.mo9955a(d0Var, d, this);
        } else {
            try {
                w0Var = new C0872w0(this.f245y, d0Var, d, c.mo9617u().mo9548e(), this);
            } catch (RuntimeException e) {
                C0580a0.C0581a aVar = new C0580a0.C0581a();
                aVar.mo9419a(e.toString() + ": during WebView initialization.").mo9419a(" Disabling AdColony.").mo9421a(C0580a0.f191i);
                AdColony.disable();
                return null;
            }
        }
        this.f223c.put(Integer.valueOf(d), w0Var);
        this.f227g.put(Integer.valueOf(d), w0Var);
        C0897z0 b3 = C0894y.m1151b();
        C0894y.m1156b(b3, "module_id", w0Var.mo9562e());
        C0894y.m1156b(b3, "mraid_module_id", w0Var.mo9561d());
        d0Var.mo9530a(b3).mo9536d();
        return w0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9458e(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "id");
        View remove = this.f227g.remove(Integer.valueOf(d));
        C0868w remove2 = this.f225e.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C0612d d2 = C0578a.m143c().mo9597d();
            String c = d0Var.mo9535c();
            d2.mo9500a(c, "" + d);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9460f(C0645d0 d0Var) {
        TextView textView;
        int d = C0894y.m1163d(d0Var.mo9532b(), "id");
        View remove = this.f227g.remove(Integer.valueOf(d));
        if (this.f226f.remove(Integer.valueOf(d)).booleanValue()) {
            textView = this.f224d.remove(Integer.valueOf(d));
        } else {
            textView = this.f222b.remove(Integer.valueOf(d));
        }
        if (remove == null || textView == null) {
            C0612d d2 = C0578a.m143c().mo9597d();
            String c = d0Var.mo9535c();
            d2.mo9500a(c, "" + d);
            return false;
        }
        removeView(textView);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9462g(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "id");
        View remove = this.f227g.remove(Integer.valueOf(d));
        C0857v0 remove2 = this.f221a.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C0612d d2 = C0578a.m143c().mo9597d();
            String c = d0Var.mo9535c();
            d2.mo9500a(c, "" + d);
            return false;
        }
        if (remove2.mo9924c()) {
            remove2.mo9930j();
        }
        remove2.mo9922a();
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9464h(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "id");
        C0693i c = C0578a.m143c();
        View remove = this.f227g.remove(Integer.valueOf(d));
        C0872w0 remove2 = this.f223c.remove(Integer.valueOf(d));
        if (remove2 == null || remove == null) {
            C0612d d2 = c.mo9597d();
            String c2 = d0Var.mo9535c();
            d2.mo9500a(c2, "" + d);
            return false;
        }
        c.mo9617u().mo9540a(remove2.mo9562e());
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9466i(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        return C0894y.m1163d(b, "container_id") == this.f230j && C0894y.m1169h(b, "ad_session_id").equals(this.f232l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9468j(C0645d0 d0Var) {
        Rect rect;
        this.f221a = new HashMap<>();
        this.f222b = new HashMap<>();
        this.f223c = new HashMap<>();
        this.f224d = new HashMap<>();
        this.f225e = new HashMap<>();
        this.f226f = new HashMap<>();
        this.f227g = new HashMap<>();
        this.f239s = new ArrayList<>();
        this.f240t = new ArrayList<>();
        C0897z0 b = d0Var.mo9532b();
        if (C0894y.m1155b(b, TJAdUnitConstants.String.TRANSPARENT)) {
            setBackgroundColor(0);
        }
        this.f230j = C0894y.m1163d(b, "id");
        this.f228h = C0894y.m1163d(b, "width");
        this.f229i = C0894y.m1163d(b, "height");
        this.f231k = C0894y.m1163d(b, "module_id");
        this.f234n = C0894y.m1155b(b, "viewability_enabled");
        this.f241u = this.f230j == 1;
        C0693i c = C0578a.m143c();
        if (this.f228h == 0 && this.f229i == 0) {
            if (this.f243w) {
                rect = c.mo9611o().mo9755t();
            } else {
                rect = c.mo9611o().mo9754s();
            }
            this.f228h = rect.width();
            this.f229i = rect.height();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f228h, this.f229i));
        }
        this.f239s.add(C0578a.m135a("VideoView.create", (C0685f0) new C0590a(), true));
        this.f239s.add(C0578a.m135a("VideoView.destroy", (C0685f0) new C0591b(), true));
        this.f239s.add(C0578a.m135a("WebView.create", (C0685f0) new C0592c(), true));
        this.f239s.add(C0578a.m135a("WebView.destroy", (C0685f0) new C0594d(), true));
        this.f239s.add(C0578a.m135a("TextView.create", (C0685f0) new C0596e(), true));
        this.f239s.add(C0578a.m135a("TextView.destroy", (C0685f0) new C0597f(), true));
        this.f239s.add(C0578a.m135a("ImageView.create", (C0685f0) new C0598g(), true));
        this.f239s.add(C0578a.m135a("ImageView.destroy", (C0685f0) new C0599h(), true));
        this.f240t.add("VideoView.create");
        this.f240t.add("VideoView.destroy");
        this.f240t.add("WebView.create");
        this.f240t.add("WebView.destroy");
        this.f240t.add("TextView.create");
        this.f240t.add("TextView.destroy");
        this.f240t.add("ImageView.create");
        this.f240t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.f245y);
        this.f246z = videoView;
        videoView.setVisibility(8);
        addView(this.f246z);
        setClipToPadding(false);
        if (this.f234n) {
            m195b(C0894y.m1155b(d0Var.mo9532b(), "advanced_viewability"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo9469k() {
        return this.f231k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public HashMap<Integer, C0819t0> mo9470l() {
        return this.f222b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<Integer, C0857v0> mo9471m() {
        return this.f221a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public HashMap<Integer, C0872w0> mo9472n() {
        return this.f223c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo9473o() {
        return this.f242v;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        C0693i c = C0578a.m143c();
        C0612d d = c.mo9597d();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0897z0 b = C0894y.m1151b();
        C0894y.m1156b(b, "view_id", -1);
        C0894y.m1148a(b, "ad_session_id", this.f232l);
        C0894y.m1156b(b, "container_x", x);
        C0894y.m1156b(b, "container_y", y);
        C0894y.m1156b(b, "view_x", x);
        C0894y.m1156b(b, "view_y", y);
        C0894y.m1156b(b, "id", this.f230j);
        if (action == 0) {
            new C0645d0("AdContainer.on_touch_began", this.f231k, b).mo9536d();
        } else if (action == 1) {
            if (!this.f241u) {
                c.mo9585a(d.mo9506d().get(this.f232l));
            }
            new C0645d0("AdContainer.on_touch_ended", this.f231k, b).mo9536d();
        } else if (action == 2) {
            new C0645d0("AdContainer.on_touch_moved", this.f231k, b).mo9536d();
        } else if (action == 3) {
            new C0645d0("AdContainer.on_touch_cancelled", this.f231k, b).mo9536d();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0894y.m1156b(b, "container_x", (int) motionEvent2.getX(action2));
            C0894y.m1156b(b, "container_y", (int) motionEvent2.getY(action2));
            C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action2));
            C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action2));
            new C0645d0("AdContainer.on_touch_began", this.f231k, b).mo9536d();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0894y.m1156b(b, "container_x", (int) motionEvent2.getX(action3));
            C0894y.m1156b(b, "container_y", (int) motionEvent2.getY(action3));
            C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action3));
            C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action3));
            C0894y.m1156b(b, "x", (int) motionEvent2.getX(action3));
            C0894y.m1156b(b, "y", (int) motionEvent2.getY(action3));
            if (!this.f241u) {
                c.mo9585a(d.mo9506d().get(this.f232l));
            }
            new C0645d0("AdContainer.on_touch_ended", this.f231k, b).mo9536d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo9476p() {
        return this.f241u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo9477q() {
        return this.f243w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo9478r() {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "id", this.f232l);
        new C0645d0("AdSession.on_error", this.f231k, b).mo9536d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0868w mo9440a(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "id");
        C0868w wVar = new C0868w(this.f245y, d0Var, d, this);
        wVar.mo9946a();
        this.f225e.put(Integer.valueOf(d), wVar);
        this.f227g.put(Integer.valueOf(d), wVar);
        return wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo9448b(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        int d = C0894y.m1163d(b, "id");
        if (C0894y.m1155b(b, "editable")) {
            C0784r rVar = new C0784r(this.f245y, d0Var, d, this);
            rVar.mo9836a();
            this.f224d.put(Integer.valueOf(d), rVar);
            this.f227g.put(Integer.valueOf(d), rVar);
            this.f226f.put(Integer.valueOf(d), Boolean.TRUE);
            return rVar;
        } else if (!C0894y.m1155b(b, "button")) {
            C0819t0 t0Var = new C0819t0(this.f245y, d0Var, d, this);
            t0Var.mo9882a();
            this.f222b.put(Integer.valueOf(d), t0Var);
            this.f227g.put(Integer.valueOf(d), t0Var);
            this.f226f.put(Integer.valueOf(d), Boolean.FALSE);
            return t0Var;
        } else {
            C0819t0 t0Var2 = new C0819t0(this.f245y, 16974145, d0Var, d, this);
            t0Var2.mo9882a();
            this.f222b.put(Integer.valueOf(d), t0Var2);
            this.f227g.put(Integer.valueOf(d), t0Var2);
            this.f226f.put(Integer.valueOf(d), Boolean.FALSE);
            return t0Var2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ArrayList<C0685f0> mo9465i() {
        return this.f239s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9450c() {
        return this.f230j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m193a(boolean z) {
        C0872w0 w0Var;
        double d;
        View view = (View) getParent();
        AdColonyAdView adColonyAdView = C0578a.m143c().mo9597d().mo9506d().get(this.f232l);
        if (adColonyAdView == null) {
            w0Var = null;
        } else {
            w0Var = adColonyAdView.getWebView();
        }
        C0872w0 w0Var2 = w0Var;
        Context b = C0578a.m141b();
        boolean z2 = true;
        float a = C0582a1.m157a(view, b, true, z, true, adColonyAdView != null);
        if (b == null) {
            d = 0.0d;
        } else {
            d = C0849u0.m899a(C0849u0.m904a(b));
        }
        int a2 = C0849u0.m902a((View) w0Var2);
        int b2 = C0849u0.m922b((View) w0Var2);
        if (a2 == this.f237q && b2 == this.f238r) {
            z2 = false;
        }
        if (z2) {
            this.f237q = a2;
            this.f238r = b2;
            m191a(a2, b2, w0Var2);
        }
        if (!(this.f235o == a && this.f236p == d && !z2)) {
            m190a(a, d);
        }
        this.f235o = a;
        this.f236p = d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9452c(boolean z) {
        this.f241u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public HashMap<Integer, View> mo9456e() {
        return this.f227g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9457e(boolean z) {
        this.f242v = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public HashMap<Integer, C0868w> mo9463h() {
        return this.f225e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public HashMap<Integer, Boolean> mo9461g() {
        return this.f226f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public HashMap<Integer, C0784r> mo9459f() {
        return this.f224d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m195b(boolean z) {
        C0849u0.m916a((Runnable) new C0600i(z), 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9447b() {
        return this.f229i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9449b(int i) {
        this.f228h = i;
    }

    /* renamed from: a */
    private void m191a(int i, int i2, C0872w0 w0Var) {
        float o = C0578a.m143c().mo9611o().mo9750o();
        if (w0Var != null) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1156b(b, "app_orientation", C0849u0.m938d(C0849u0.m945f()));
            C0894y.m1156b(b, "width", (int) (((float) w0Var.mo9969o()) / o));
            C0894y.m1156b(b, "height", (int) (((float) w0Var.mo9968n()) / o));
            C0894y.m1156b(b, "x", i);
            C0894y.m1156b(b, "y", i2);
            C0894y.m1148a(b, "ad_session_id", this.f232l);
            new C0645d0("MRAID.on_size_change", this.f231k, b).mo9536d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9453d() {
        return this.f228h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9455d(boolean z) {
        this.f243w = z;
    }

    /* renamed from: a */
    private void m190a(float f, double d) {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1156b(b, "id", this.f230j);
        C0894y.m1148a(b, "ad_session_id", this.f232l);
        C0894y.m1145a(b, "exposure", (double) f);
        C0894y.m1145a(b, "volume", d);
        new C0645d0("AdContainer.on_exposure_change", this.f231k, b).mo9536d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9441a() {
        return this.f232l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9442a(int i) {
        this.f229i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9445a(AdSession adSession) {
        this.f244x = adSession;
        mo9446a((Map) this.f227g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9446a(Map map) {
        if (this.f244x != null && map != null) {
            for (Map.Entry value : map.entrySet()) {
                mo9444a((View) value.getValue(), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9444a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f244x;
        if (adSession != null && view != null) {
            try {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9443a(View view) {
        AdSession adSession = this.f244x;
        if (adSession != null && view != null) {
            try {
                adSession.removeFriendlyObstruction(view);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ArrayList<String> mo9467j() {
        return this.f240t;
    }
}
