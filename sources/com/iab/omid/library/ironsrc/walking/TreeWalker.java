package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.p109c.C4719a;
import com.iab.omid.library.ironsrc.p109c.C4721b;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.p110d.C4728d;
import com.iab.omid.library.ironsrc.p110d.C4730f;
import com.iab.omid.library.ironsrc.walking.C4740a;
import com.iab.omid.library.ironsrc.walking.p112a.C4746c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4719a.C4720a {

    /* renamed from: a */
    private static TreeWalker f10664a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10665b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10666c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10667j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m10321h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10668k = new Runnable() {
        public final void run() {
            if (TreeWalker.f10666c != null) {
                TreeWalker.f10666c.post(TreeWalker.f10667j);
                TreeWalker.f10666c.postDelayed(TreeWalker.f10668k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f10669d = new ArrayList();

    /* renamed from: e */
    private int f10670e;

    /* renamed from: f */
    private C4721b f10671f = new C4721b();

    /* renamed from: g */
    private C4740a f10672g = new C4740a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4750b f10673h = new C4750b(new C4746c());

    /* renamed from: i */
    private long f10674i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m10312a(long j) {
        if (this.f10669d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10669d) {
                next.onTreeProcessed(this.f10670e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10670e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m10313a(View view, C4719a aVar, JSONObject jSONObject, C4751c cVar) {
        aVar.mo39162a(view, jSONObject, this, cVar == C4751c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m10314a(String str, View view, JSONObject jSONObject) {
        C4719a b = this.f10671f.mo39165b();
        String a = this.f10672g.mo39205a(str);
        if (a != null) {
            JSONObject a2 = b.mo39161a(view);
            C4725b.m10251a(a2, str);
            C4725b.m10256b(a2, a);
            C4725b.m10253a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m10315a(View view, JSONObject jSONObject) {
        String a = this.f10672g.mo39204a(view);
        if (a == null) {
            return false;
        }
        C4725b.m10251a(jSONObject, a);
        this.f10672g.mo39213e();
        return true;
    }

    /* renamed from: b */
    private void m10316b(View view, JSONObject jSONObject) {
        C4740a.C4741a b = this.f10672g.mo39208b(view);
        if (b != null) {
            C4725b.m10250a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f10664a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m10321h() {
        m10322i();
        mo39197d();
        m10323j();
    }

    /* renamed from: i */
    private void m10322i() {
        this.f10670e = 0;
        this.f10674i = C4728d.m10264a();
    }

    /* renamed from: j */
    private void m10323j() {
        m10312a(C4728d.m10264a() - this.f10674i);
    }

    /* renamed from: k */
    private void m10324k() {
        if (f10666c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10666c = handler;
            handler.post(f10667j);
            f10666c.postDelayed(f10668k, 200);
        }
    }

    /* renamed from: l */
    private void m10325l() {
        Handler handler = f10666c;
        if (handler != null) {
            handler.removeCallbacks(f10668k);
            f10666c = null;
        }
    }

    /* renamed from: a */
    public void mo39193a() {
        m10324k();
    }

    /* renamed from: a */
    public void mo39163a(View view, C4719a aVar, JSONObject jSONObject) {
        C4751c c;
        if (C4730f.m10281d(view) && (c = this.f10672g.mo39210c(view)) != C4751c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo39161a(view);
            C4725b.m10253a(jSONObject, a);
            if (!m10315a(view, a)) {
                m10316b(view, a);
                m10313a(view, aVar, a, c);
            }
            this.f10670e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10669d.contains(treeWalkerTimeLogger)) {
            this.f10669d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo39195b() {
        mo39196c();
        this.f10669d.clear();
        f10665b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f10673h.mo39231a();
            }
        });
    }

    /* renamed from: c */
    public void mo39196c() {
        m10325l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39197d() {
        this.f10672g.mo39211c();
        long a = C4728d.m10264a();
        C4719a a2 = this.f10671f.mo39164a();
        if (this.f10672g.mo39209b().size() > 0) {
            Iterator<String> it = this.f10672g.mo39209b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo39161a((View) null);
                m10314a(next, this.f10672g.mo39207b(next), a3);
                C4725b.m10249a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10673h.mo39233b(a3, hashSet, a);
            }
        }
        if (this.f10672g.mo39206a().size() > 0) {
            JSONObject a4 = a2.mo39161a((View) null);
            m10313a((View) null, a2, a4, C4751c.PARENT_VIEW);
            C4725b.m10249a(a4);
            this.f10673h.mo39232a(a4, this.f10672g.mo39206a(), a);
        } else {
            this.f10673h.mo39231a();
        }
        this.f10672g.mo39212d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10669d.contains(treeWalkerTimeLogger)) {
            this.f10669d.remove(treeWalkerTimeLogger);
        }
    }
}
