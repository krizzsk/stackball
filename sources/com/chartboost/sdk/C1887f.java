package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.CBError;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.IdentityHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.f */
public abstract class C1887f {

    /* renamed from: a */
    public final Handler f4711a;

    /* renamed from: b */
    public final C1883d f4712b;

    /* renamed from: c */
    public boolean f4713c = false;

    /* renamed from: d */
    private boolean f4714d;

    /* renamed from: e */
    protected JSONObject f4715e;

    /* renamed from: f */
    private C1889b f4716f;

    /* renamed from: g */
    public final C1838c f4717g;

    /* renamed from: h */
    protected int f4718h;

    /* renamed from: i */
    public final Map<View, Runnable> f4719i = new IdentityHashMap();

    /* renamed from: j */
    protected boolean f4720j = true;

    /* renamed from: k */
    protected boolean f4721k = true;

    /* renamed from: l */
    private Context f4722l;

    /* renamed from: com.chartboost.sdk.f$a */
    class C1888a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f4723a;

        /* renamed from: b */
        final /* synthetic */ View f4724b;

        C1888a(boolean z, View view) {
            this.f4723a = z;
            this.f4724b = view;
        }

        public void run() {
            if (!this.f4723a) {
                this.f4724b.setVisibility(8);
                this.f4724b.setClickable(false);
            }
            synchronized (C1887f.this.f4719i) {
                C1887f.this.f4719i.remove(this.f4724b);
            }
        }
    }

    public C1887f(Context context, C1838c cVar, Handler handler, C1883d dVar) {
        this.f4722l = context;
        this.f4711a = handler;
        this.f4712b = dVar;
        this.f4717g = cVar;
        this.f4716f = null;
        this.f4718h = CBUtility.m4006b(context);
        this.f4714d = false;
    }

    /* renamed from: b */
    public static boolean m4400b(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    /* renamed from: a */
    public CBError.CBImpressionError mo14515a(RelativeLayout relativeLayout) {
        if (this.f4716f != null) {
            return null;
        }
        if (relativeLayout == null || relativeLayout.getContext() == null) {
            return CBError.CBImpressionError.ERROR_CREATING_VIEW;
        }
        this.f4716f = mo14516a(relativeLayout.getContext());
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1889b mo14516a(Context context);

    /* renamed from: c */
    public void mo14526c() {
        C1889b bVar = this.f4716f;
        if (bVar != null) {
            bVar.mo14539a();
        }
        this.f4716f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14527d() {
        this.f4717g.mo14291s();
    }

    /* renamed from: e */
    public JSONObject mo14528e() {
        return this.f4715e;
    }

    /* renamed from: f */
    public int mo14529f() {
        return this.f4718h;
    }

    /* renamed from: g */
    public float mo14530g() {
        return 0.0f;
    }

    /* renamed from: h */
    public float mo14531h() {
        return 0.0f;
    }

    /* renamed from: i */
    public C1889b mo14532i() {
        return this.f4716f;
    }

    /* renamed from: j */
    public boolean mo14533j() {
        return false;
    }

    /* renamed from: k */
    public void mo14534k() {
        this.f4713c = true;
    }

    /* renamed from: l */
    public void mo14535l() {
        if (this.f4713c) {
            this.f4713c = false;
        }
        C1889b i = mo14532i();
        if (i == null) {
            return;
        }
        if (i.f4731f == null || CBUtility.m4006b(this.f4722l) != i.f4731f.intValue()) {
            i.mo14542a(false);
        }
    }

    /* renamed from: m */
    public void mo14536m() {
        mo14527d();
    }

    /* renamed from: n */
    public CBError.CBImpressionError mo14537n() {
        Activity e = this.f4712b.mo14494e();
        if (e == null) {
            this.f4716f = null;
            return CBError.CBImpressionError.NO_HOST_ACTIVITY;
        } else if (!this.f4721k && !this.f4720j) {
            return CBError.CBImpressionError.WRONG_ORIENTATION;
        } else {
            if (this.f4716f == null) {
                this.f4716f = mo14516a((Context) e);
            }
            if (this.f4717g.f4464q.f4422b != 0 || this.f4716f.mo14543a(e)) {
                return null;
            }
            this.f4716f = null;
            return CBError.CBImpressionError.ERROR_CREATING_VIEW;
        }
    }

    /* renamed from: com.chartboost.sdk.f$b */
    public abstract class C1889b extends RelativeLayout {

        /* renamed from: a */
        private boolean f4726a = false;

        /* renamed from: b */
        private int f4727b = -1;

        /* renamed from: c */
        private int f4728c = -1;

        /* renamed from: d */
        private int f4729d = -1;

        /* renamed from: e */
        private int f4730e = -1;

        /* renamed from: f */
        Integer f4731f = null;

        /* renamed from: g */
        private Context f4732g;

        /* renamed from: com.chartboost.sdk.f$b$a */
        class C1890a implements Runnable {
            C1890a() {
            }

            public void run() {
                C1889b.this.requestLayout();
            }
        }

        public C1889b(Context context) {
            super(context);
            this.f4732g = context;
            setFocusableInTouchMode(true);
            requestFocus();
        }

        /* renamed from: b */
        private boolean m4424b(int i, int i2) {
            Integer num;
            C1838c cVar = C1887f.this.f4717g;
            boolean z = true;
            if (cVar != null && cVar.f4464q.f4422b == 1) {
                return true;
            }
            if (this.f4726a) {
                return false;
            }
            int b = CBUtility.m4006b(this.f4732g);
            if (this.f4727b == i && this.f4728c == i2 && (num = this.f4731f) != null && num.intValue() == b) {
                return true;
            }
            this.f4726a = true;
            try {
                if (C1887f.this.f4720j && CBUtility.m4009b(b)) {
                    C1887f.this.f4718h = b;
                } else if (C1887f.this.f4721k && CBUtility.m4004a(b)) {
                    C1887f.this.f4718h = b;
                }
                mo14540a(i, i2);
                post(new C1890a());
                this.f4727b = i;
                this.f4728c = i2;
                this.f4731f = Integer.valueOf(b);
            } catch (Exception e) {
                CBLogging.m3992a("CBViewProtocol", "Exception raised while layouting Subviews", e);
                z = false;
            }
            this.f4726a = false;
            return z;
        }

        /* renamed from: a */
        public void mo14539a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo14540a(int i, int i2);

        /* renamed from: a */
        public final void mo14542a(boolean z) {
            if (z) {
                this.f4731f = null;
            }
            mo14543a((Activity) getContext());
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            synchronized (C1887f.this.f4719i) {
                for (Runnable removeCallbacks : C1887f.this.f4719i.values()) {
                    C1887f.this.f4711a.removeCallbacks(removeCallbacks);
                }
                C1887f.this.f4719i.clear();
            }
        }

        /* access modifiers changed from: protected */
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            C1838c cVar;
            super.onSizeChanged(i, i2, i3, i4);
            this.f4729d = i;
            this.f4730e = i2;
            if (this.f4727b != -1 && this.f4728c != -1 && (cVar = C1887f.this.f4717g) != null && cVar.f4464q.f4422b == 0) {
                mo14544b();
            }
        }

        /* renamed from: a */
        public boolean mo14543a(Activity activity) {
            int i;
            int i2;
            if (this.f4729d == -1 || this.f4730e == -1) {
                try {
                    i2 = getWidth();
                    i = getHeight();
                    if (i2 == 0 || i == 0) {
                        View findViewById = activity.getWindow().findViewById(16908290);
                        if (findViewById == null) {
                            findViewById = activity.getWindow().getDecorView();
                        }
                        int width = findViewById.getWidth();
                        i = findViewById.getHeight();
                        i2 = width;
                    }
                } catch (Exception unused) {
                    i2 = 0;
                    i = 0;
                }
                if (i2 == 0 || i == 0) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    int i3 = displayMetrics.widthPixels;
                    i = displayMetrics.heightPixels;
                    i2 = i3;
                }
                this.f4729d = i2;
                this.f4730e = i;
            }
            return m4424b(this.f4729d, this.f4730e);
        }

        /* renamed from: a */
        public final void mo14541a(View view) {
            int i = 200;
            if (200 == getId()) {
                i = ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR;
            }
            View findViewById = findViewById(i);
            while (findViewById != null) {
                i++;
                findViewById = findViewById(i);
            }
            view.setId(i);
            view.setSaveEnabled(false);
        }

        /* renamed from: b */
        public final void mo14544b() {
            mo14542a(false);
        }
    }

    /* renamed from: b */
    public boolean mo14525b(JSONObject jSONObject) {
        JSONObject a = C1825e.m4024a(jSONObject, "assets");
        this.f4715e = a;
        if (a != null) {
            return true;
        }
        this.f4715e = new JSONObject();
        CBLogging.m3993b("CBViewProtocol", "Media got from the response is null or empty");
        mo14519a(CBError.CBImpressionError.INVALID_RESPONSE);
        return false;
    }

    /* renamed from: a */
    public void mo14519a(CBError.CBImpressionError cBImpressionError) {
        this.f4717g.mo14273a(cBImpressionError);
    }

    /* renamed from: a */
    public void mo14517a() {
        if (!this.f4714d) {
            this.f4714d = true;
            this.f4717g.mo14290r();
        }
    }

    /* renamed from: b */
    public void mo14524b() {
        synchronized (this.f4719i) {
            for (Runnable removeCallbacks : this.f4719i.values()) {
                this.f4711a.removeCallbacks(removeCallbacks);
            }
            this.f4719i.clear();
        }
        mo14526c();
    }

    /* renamed from: a */
    public boolean mo14523a(JSONObject jSONObject) {
        return this.f4717g.mo14278b(jSONObject);
    }

    /* renamed from: a */
    public void mo14520a(String str, JSONObject jSONObject) {
        this.f4717g.mo14277b(str, jSONObject);
    }

    /* renamed from: a */
    public void mo14521a(boolean z, View view) {
        mo14522a(z, view, true);
    }

    /* renamed from: a */
    public void mo14522a(boolean z, View view, boolean z2) {
        int i = 8;
        if ((z && view.getVisibility() == 0) || (!z && view.getVisibility() == 8)) {
            synchronized (this.f4719i) {
                if (!this.f4719i.containsKey(view)) {
                    return;
                }
            }
        }
        if (!z2) {
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
            view.setClickable(z);
            return;
        }
        C1888a aVar = new C1888a(z, view);
        int i2 = this.f4717g.f4464q.f4422b;
        this.f4717g.f4457j.f4702a.mo14703a(z, view, 500);
        mo14518a(view, (Runnable) aVar, 500);
    }

    /* renamed from: a */
    public void mo14518a(View view, Runnable runnable, long j) {
        synchronized (this.f4719i) {
            Runnable runnable2 = this.f4719i.get(view);
            if (runnable2 != null) {
                this.f4711a.removeCallbacks(runnable2);
            }
            this.f4719i.put(view, runnable);
        }
        this.f4711a.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static int m4399a(String str) {
        if (str != null) {
            if (!str.startsWith("#")) {
                try {
                    return Color.parseColor(str);
                } catch (IllegalArgumentException unused) {
                    str = "#" + str;
                }
            }
            if (str.length() == 4 || str.length() == 5) {
                StringBuilder sb = new StringBuilder((str.length() * 2) + 1);
                sb.append("#");
                int i = 0;
                while (i < str.length() - 1) {
                    i++;
                    sb.append(str.charAt(i));
                    sb.append(str.charAt(i));
                }
                str = sb.toString();
            }
            try {
                return Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                CBLogging.m3994b("CBViewProtocol", "error parsing color " + str, e);
            }
        }
        return 0;
    }
}
