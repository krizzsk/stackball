package com.iab.omid.library.smaato.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.smaato.p121c.C4819a;
import com.iab.omid.library.smaato.p121c.C4821b;
import com.iab.omid.library.smaato.p122d.C4825b;
import com.iab.omid.library.smaato.p122d.C4828d;
import com.iab.omid.library.smaato.p122d.C4830f;
import com.iab.omid.library.smaato.walking.p124a.C4845c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class TreeWalker implements C4819a.C4820a {

    /* renamed from: a */
    private static TreeWalker f10888a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10889b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10890c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10891j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m10759h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10892k = new Runnable() {
        public final void run() {
            if (TreeWalker.f10890c != null) {
                TreeWalker.f10890c.post(TreeWalker.f10891j);
                TreeWalker.f10890c.postDelayed(TreeWalker.f10892k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f10893d = new ArrayList();

    /* renamed from: e */
    private int f10894e;

    /* renamed from: f */
    private C4821b f10895f = new C4821b();

    /* renamed from: g */
    private C4840a f10896g = new C4840a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4849b f10897h = new C4849b(new C4845c());

    /* renamed from: i */
    private double f10898i;

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m10751a(long j) {
        if (this.f10893d.size() > 0) {
            for (TreeWalkerTimeLogger onTreeProcessed : this.f10893d) {
                onTreeProcessed.onTreeProcessed(this.f10894e, j);
            }
        }
    }

    /* renamed from: a */
    private void m10752a(View view, C4819a aVar, JSONObject jSONObject, C4850c cVar) {
        aVar.mo39548a(view, jSONObject, this, cVar == C4850c.PARENT_VIEW);
    }

    /* renamed from: a */
    private boolean m10753a(View view, JSONObject jSONObject) {
        String a = this.f10896g.mo39585a(view);
        if (a == null) {
            return false;
        }
        C4825b.m10695a(jSONObject, a);
        this.f10896g.mo39592e();
        return true;
    }

    /* renamed from: b */
    private void m10754b(View view, JSONObject jSONObject) {
        ArrayList<String> b = this.f10896g.mo39587b(view);
        if (b != null) {
            C4825b.m10697a(jSONObject, (List<String>) b);
        }
    }

    public static TreeWalker getInstance() {
        return f10888a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m10759h() {
        m10760i();
        mo39579d();
        m10761j();
    }

    /* renamed from: i */
    private void m10760i() {
        this.f10894e = 0;
        this.f10898i = C4828d.m10708a();
    }

    /* renamed from: j */
    private void m10761j() {
        m10751a((long) (C4828d.m10708a() - this.f10898i));
    }

    /* renamed from: k */
    private void m10762k() {
        if (f10890c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10890c = handler;
            handler.post(f10891j);
            f10890c.postDelayed(f10892k, 200);
        }
    }

    /* renamed from: l */
    private void m10763l() {
        Handler handler = f10890c;
        if (handler != null) {
            handler.removeCallbacks(f10892k);
            f10890c = null;
        }
    }

    /* renamed from: a */
    public void mo39575a() {
        m10762k();
    }

    /* renamed from: a */
    public void mo39549a(View view, C4819a aVar, JSONObject jSONObject) {
        C4850c c;
        if (C4830f.m10725d(view) && (c = this.f10896g.mo39589c(view)) != C4850c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo39547a(view);
            C4825b.m10698a(jSONObject, a);
            if (!m10753a(view, a)) {
                m10754b(view, a);
                m10752a(view, aVar, a, c);
            }
            this.f10894e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10893d.contains(treeWalkerTimeLogger)) {
            this.f10893d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo39577b() {
        mo39578c();
        this.f10893d.clear();
        f10889b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f10897h.mo39607a();
            }
        });
    }

    /* renamed from: c */
    public void mo39578c() {
        m10763l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39579d() {
        this.f10896g.mo39590c();
        double a = C4828d.m10708a();
        C4819a a2 = this.f10895f.mo39550a();
        if (this.f10896g.mo39588b().size() > 0) {
            this.f10897h.mo39609b(a2.mo39547a((View) null), this.f10896g.mo39588b(), a);
        }
        if (this.f10896g.mo39586a().size() > 0) {
            JSONObject a3 = a2.mo39547a((View) null);
            m10752a((View) null, a2, a3, C4850c.PARENT_VIEW);
            C4825b.m10694a(a3);
            this.f10897h.mo39608a(a3, this.f10896g.mo39586a(), a);
        } else {
            this.f10897h.mo39607a();
        }
        this.f10896g.mo39591d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10893d.contains(treeWalkerTimeLogger)) {
            this.f10893d.remove(treeWalkerTimeLogger);
        }
    }
}
