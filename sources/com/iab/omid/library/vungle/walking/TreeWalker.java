package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.p127c.C4868a;
import com.iab.omid.library.vungle.p127c.C4870b;
import com.iab.omid.library.vungle.p128d.C4874b;
import com.iab.omid.library.vungle.p128d.C4877d;
import com.iab.omid.library.vungle.p128d.C4879f;
import com.iab.omid.library.vungle.walking.C4889a;
import com.iab.omid.library.vungle.walking.p130a.C4895c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4868a.C4869a {

    /* renamed from: a */
    private static TreeWalker f10997a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10998b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10999c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f11000j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m10978h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f11001k = new Runnable() {
        public void run() {
            if (TreeWalker.f10999c != null) {
                TreeWalker.f10999c.post(TreeWalker.f11000j);
                TreeWalker.f10999c.postDelayed(TreeWalker.f11001k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f11002d = new ArrayList();

    /* renamed from: e */
    private int f11003e;

    /* renamed from: f */
    private C4870b f11004f = new C4870b();

    /* renamed from: g */
    private C4889a f11005g = new C4889a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4899b f11006h = new C4899b(new C4895c());

    /* renamed from: i */
    private long f11007i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m10969a(long j) {
        if (this.f11002d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f11002d) {
                next.onTreeProcessed(this.f11003e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f11003e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m10970a(View view, C4868a aVar, JSONObject jSONObject, C4900c cVar) {
        aVar.mo39732a(view, jSONObject, this, cVar == C4900c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m10971a(String str, View view, JSONObject jSONObject) {
        C4868a b = this.f11004f.mo39735b();
        String a = this.f11005g.mo39775a(str);
        if (a != null) {
            JSONObject a2 = b.mo39731a(view);
            C4874b.m10908a(a2, str);
            C4874b.m10913b(a2, a);
            C4874b.m10910a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m10972a(View view, JSONObject jSONObject) {
        String a = this.f11005g.mo39774a(view);
        if (a == null) {
            return false;
        }
        C4874b.m10908a(jSONObject, a);
        this.f11005g.mo39783e();
        return true;
    }

    /* renamed from: b */
    private void m10973b(View view, JSONObject jSONObject) {
        C4889a.C4890a b = this.f11005g.mo39778b(view);
        if (b != null) {
            C4874b.m10907a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f10997a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m10978h() {
        m10979i();
        mo39767d();
        m10980j();
    }

    /* renamed from: i */
    private void m10979i() {
        this.f11003e = 0;
        this.f11007i = C4877d.m10921a();
    }

    /* renamed from: j */
    private void m10980j() {
        m10969a(C4877d.m10921a() - this.f11007i);
    }

    /* renamed from: k */
    private void m10981k() {
        if (f10999c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10999c = handler;
            handler.post(f11000j);
            f10999c.postDelayed(f11001k, 200);
        }
    }

    /* renamed from: l */
    private void m10982l() {
        Handler handler = f10999c;
        if (handler != null) {
            handler.removeCallbacks(f11001k);
            f10999c = null;
        }
    }

    /* renamed from: a */
    public void mo39763a() {
        m10981k();
    }

    /* renamed from: a */
    public void mo39733a(View view, C4868a aVar, JSONObject jSONObject) {
        C4900c c;
        if (C4879f.m10938d(view) && (c = this.f11005g.mo39780c(view)) != C4900c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo39731a(view);
            C4874b.m10910a(jSONObject, a);
            if (!m10972a(view, a)) {
                m10973b(view, a);
                m10970a(view, aVar, a, c);
            }
            this.f11003e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f11002d.contains(treeWalkerTimeLogger)) {
            this.f11002d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo39765b() {
        mo39766c();
        this.f11002d.clear();
        f10998b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f11006h.mo39801a();
            }
        });
    }

    /* renamed from: c */
    public void mo39766c() {
        m10982l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39767d() {
        this.f11005g.mo39781c();
        long a = C4877d.m10921a();
        C4868a a2 = this.f11004f.mo39734a();
        if (this.f11005g.mo39779b().size() > 0) {
            Iterator<String> it = this.f11005g.mo39779b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo39731a((View) null);
                m10971a(next, this.f11005g.mo39777b(next), a3);
                C4874b.m10906a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f11006h.mo39803b(a3, hashSet, a);
            }
        }
        if (this.f11005g.mo39776a().size() > 0) {
            JSONObject a4 = a2.mo39731a((View) null);
            m10970a((View) null, a2, a4, C4900c.PARENT_VIEW);
            C4874b.m10906a(a4);
            this.f11006h.mo39802a(a4, this.f11005g.mo39776a(), a);
        } else {
            this.f11006h.mo39801a();
        }
        this.f11005g.mo39782d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f11002d.contains(treeWalkerTimeLogger)) {
            this.f11002d.remove(treeWalkerTimeLogger);
        }
    }
}
