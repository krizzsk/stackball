package com.iab.omid.library.oguryco.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.oguryco.p115c.C4770a;
import com.iab.omid.library.oguryco.p115c.C4772b;
import com.iab.omid.library.oguryco.p116d.C4776b;
import com.iab.omid.library.oguryco.p116d.C4779d;
import com.iab.omid.library.oguryco.p116d.C4781f;
import com.iab.omid.library.oguryco.walking.C4791a;
import com.iab.omid.library.oguryco.walking.p118a.C4797c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4770a.C4771a {

    /* renamed from: a */
    private static TreeWalker f10785a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10786b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10787c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10788j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m10550h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10789k = new Runnable() {
        public final void run() {
            if (TreeWalker.f10787c != null) {
                TreeWalker.f10787c.post(TreeWalker.f10788j);
                TreeWalker.f10787c.postDelayed(TreeWalker.f10789k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f10790d = new ArrayList();

    /* renamed from: e */
    private int f10791e;

    /* renamed from: f */
    private C4772b f10792f = new C4772b();

    /* renamed from: g */
    private C4791a f10793g = new C4791a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4801b f10794h = new C4801b(new C4797c());

    /* renamed from: i */
    private long f10795i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m10541a(long j) {
        if (this.f10790d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10790d) {
                next.onTreeProcessed(this.f10791e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10791e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m10542a(View view, C4770a aVar, JSONObject jSONObject, C4802c cVar) {
        aVar.mo39376a(view, jSONObject, this, cVar == C4802c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m10543a(String str, View view, JSONObject jSONObject) {
        C4770a b = this.f10792f.mo39379b();
        String a = this.f10793g.mo39419a(str);
        if (a != null) {
            JSONObject a2 = b.mo39375a(view);
            C4776b.m10480a(a2, str);
            C4776b.m10485b(a2, a);
            C4776b.m10482a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m10544a(View view, JSONObject jSONObject) {
        String a = this.f10793g.mo39418a(view);
        if (a == null) {
            return false;
        }
        C4776b.m10480a(jSONObject, a);
        this.f10793g.mo39427e();
        return true;
    }

    /* renamed from: b */
    private void m10545b(View view, JSONObject jSONObject) {
        C4791a.C4792a b = this.f10793g.mo39422b(view);
        if (b != null) {
            C4776b.m10479a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f10785a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m10550h() {
        m10551i();
        mo39411d();
        m10552j();
    }

    /* renamed from: i */
    private void m10551i() {
        this.f10791e = 0;
        this.f10795i = C4779d.m10493a();
    }

    /* renamed from: j */
    private void m10552j() {
        m10541a(C4779d.m10493a() - this.f10795i);
    }

    /* renamed from: k */
    private void m10553k() {
        if (f10787c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10787c = handler;
            handler.post(f10788j);
            f10787c.postDelayed(f10789k, 200);
        }
    }

    /* renamed from: l */
    private void m10554l() {
        Handler handler = f10787c;
        if (handler != null) {
            handler.removeCallbacks(f10789k);
            f10787c = null;
        }
    }

    /* renamed from: a */
    public void mo39407a() {
        m10553k();
    }

    /* renamed from: a */
    public void mo39377a(View view, C4770a aVar, JSONObject jSONObject) {
        C4802c c;
        if (C4781f.m10510d(view) && (c = this.f10793g.mo39424c(view)) != C4802c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo39375a(view);
            C4776b.m10482a(jSONObject, a);
            if (!m10544a(view, a)) {
                m10545b(view, a);
                m10542a(view, aVar, a, c);
            }
            this.f10791e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10790d.contains(treeWalkerTimeLogger)) {
            this.f10790d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo39409b() {
        mo39410c();
        this.f10790d.clear();
        f10786b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f10794h.mo39445a();
            }
        });
    }

    /* renamed from: c */
    public void mo39410c() {
        m10554l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39411d() {
        this.f10793g.mo39425c();
        long a = C4779d.m10493a();
        C4770a a2 = this.f10792f.mo39378a();
        if (this.f10793g.mo39423b().size() > 0) {
            Iterator<String> it = this.f10793g.mo39423b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo39375a((View) null);
                m10543a(next, this.f10793g.mo39421b(next), a3);
                C4776b.m10478a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10794h.mo39447b(a3, hashSet, a);
            }
        }
        if (this.f10793g.mo39420a().size() > 0) {
            JSONObject a4 = a2.mo39375a((View) null);
            m10542a((View) null, a2, a4, C4802c.PARENT_VIEW);
            C4776b.m10478a(a4);
            this.f10794h.mo39446a(a4, this.f10793g.mo39420a(), a);
        } else {
            this.f10794h.mo39445a();
        }
        this.f10793g.mo39426d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10790d.contains(treeWalkerTimeLogger)) {
            this.f10790d.remove(treeWalkerTimeLogger);
        }
    }
}
