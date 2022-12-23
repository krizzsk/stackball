package com.iab.omid.library.corpmailru.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.corpmailru.p097c.C4621a;
import com.iab.omid.library.corpmailru.p097c.C4623b;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import com.iab.omid.library.corpmailru.p098d.C4630d;
import com.iab.omid.library.corpmailru.p098d.C4632f;
import com.iab.omid.library.corpmailru.walking.C4642a;
import com.iab.omid.library.corpmailru.walking.p100a.C4648c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4621a.C4622a {

    /* renamed from: a */
    private static TreeWalker f10448a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10449b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10450c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10451j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m9890h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10452k = new Runnable() {
        public void run() {
            if (TreeWalker.f10450c != null) {
                TreeWalker.f10450c.post(TreeWalker.f10451j);
                TreeWalker.f10450c.postDelayed(TreeWalker.f10452k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f10453d = new ArrayList();

    /* renamed from: e */
    private int f10454e;

    /* renamed from: f */
    private C4623b f10455f = new C4623b();

    /* renamed from: g */
    private C4642a f10456g = new C4642a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4652b f10457h = new C4652b(new C4648c());

    /* renamed from: i */
    private long f10458i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: a */
    private void m9881a(long j) {
        if (this.f10453d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10453d) {
                next.onTreeProcessed(this.f10454e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10454e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m9882a(View view, C4621a aVar, JSONObject jSONObject, C4653c cVar) {
        aVar.mo38810a(view, jSONObject, this, cVar == C4653c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m9883a(String str, View view, JSONObject jSONObject) {
        C4621a b = this.f10455f.mo38813b();
        String a = this.f10456g.mo38853a(str);
        if (a != null) {
            JSONObject a2 = b.mo38809a(view);
            C4627b.m9820a(a2, str);
            C4627b.m9825b(a2, a);
            C4627b.m9822a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m9884a(View view, JSONObject jSONObject) {
        String a = this.f10456g.mo38852a(view);
        if (a == null) {
            return false;
        }
        C4627b.m9820a(jSONObject, a);
        this.f10456g.mo38861e();
        return true;
    }

    /* renamed from: b */
    private void m9885b(View view, JSONObject jSONObject) {
        C4642a.C4643a b = this.f10456g.mo38856b(view);
        if (b != null) {
            C4627b.m9819a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f10448a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m9890h() {
        m9891i();
        mo38845d();
        m9892j();
    }

    /* renamed from: i */
    private void m9891i() {
        this.f10454e = 0;
        this.f10458i = C4630d.m9833a();
    }

    /* renamed from: j */
    private void m9892j() {
        m9881a(C4630d.m9833a() - this.f10458i);
    }

    /* renamed from: k */
    private void m9893k() {
        if (f10450c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10450c = handler;
            handler.post(f10451j);
            f10450c.postDelayed(f10452k, 200);
        }
    }

    /* renamed from: l */
    private void m9894l() {
        Handler handler = f10450c;
        if (handler != null) {
            handler.removeCallbacks(f10452k);
            f10450c = null;
        }
    }

    /* renamed from: a */
    public void mo38841a() {
        m9893k();
    }

    /* renamed from: a */
    public void mo38811a(View view, C4621a aVar, JSONObject jSONObject) {
        C4653c c;
        if (C4632f.m9850d(view) && (c = this.f10456g.mo38858c(view)) != C4653c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo38809a(view);
            C4627b.m9822a(jSONObject, a);
            if (!m9884a(view, a)) {
                m9885b(view, a);
                m9882a(view, aVar, a, c);
            }
            this.f10454e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10453d.contains(treeWalkerTimeLogger)) {
            this.f10453d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo38843b() {
        mo38844c();
        this.f10453d.clear();
        f10449b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f10457h.mo38879a();
            }
        });
    }

    /* renamed from: c */
    public void mo38844c() {
        m9894l();
    }

    /* renamed from: d */
    public void mo38845d() {
        this.f10456g.mo38859c();
        long a = C4630d.m9833a();
        C4621a a2 = this.f10455f.mo38812a();
        if (this.f10456g.mo38857b().size() > 0) {
            Iterator<String> it = this.f10456g.mo38857b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo38809a((View) null);
                m9883a(next, this.f10456g.mo38855b(next), a3);
                C4627b.m9818a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10457h.mo38881b(a3, hashSet, a);
            }
        }
        if (this.f10456g.mo38854a().size() > 0) {
            JSONObject a4 = a2.mo38809a((View) null);
            m9882a((View) null, a2, a4, C4653c.PARENT_VIEW);
            C4627b.m9818a(a4);
            this.f10457h.mo38880a(a4, this.f10456g.mo38854a(), a);
        } else {
            this.f10457h.mo38879a();
        }
        this.f10456g.mo38860d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10453d.contains(treeWalkerTimeLogger)) {
            this.f10453d.remove(treeWalkerTimeLogger);
        }
    }
}
