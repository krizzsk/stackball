package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.p103c.C4670a;
import com.iab.omid.library.inmobi.p103c.C4672b;
import com.iab.omid.library.inmobi.p104d.C4676b;
import com.iab.omid.library.inmobi.p104d.C4679d;
import com.iab.omid.library.inmobi.p104d.C4681f;
import com.iab.omid.library.inmobi.walking.p106a.C4696c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4670a.C4671a {

    /* renamed from: a */
    private static TreeWalker f10552a = new TreeWalker();

    /* renamed from: b */
    private static Handler f10553b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f10554c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10555j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m10103h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10556k = new Runnable() {
        public final void run() {
            if (TreeWalker.f10554c != null) {
                TreeWalker.f10554c.post(TreeWalker.f10555j);
                TreeWalker.f10554c.postDelayed(TreeWalker.f10556k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f10557d = new ArrayList();

    /* renamed from: e */
    private int f10558e;

    /* renamed from: f */
    private C4672b f10559f = new C4672b();

    /* renamed from: g */
    private C4691a f10560g = new C4691a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4700b f10561h = new C4700b(new C4696c());

    /* renamed from: i */
    private long f10562i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m10094a(long j) {
        if (this.f10557d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10557d) {
                next.onTreeProcessed(this.f10558e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10558e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m10095a(View view, C4670a aVar, JSONObject jSONObject, C4701c cVar) {
        aVar.mo38982a(view, jSONObject, this, cVar == C4701c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m10096a(String str, View view, JSONObject jSONObject) {
        C4670a b = this.f10559f.mo38985b();
        String a = this.f10560g.mo39022a(str);
        if (a != null) {
            JSONObject a2 = b.mo38981a(view);
            C4676b.m10036a(a2, str);
            C4676b.m10042b(a2, a);
            C4676b.m10039a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m10097a(View view, JSONObject jSONObject) {
        String a = this.f10560g.mo39021a(view);
        if (a == null) {
            return false;
        }
        C4676b.m10036a(jSONObject, a);
        this.f10560g.mo39030e();
        return true;
    }

    /* renamed from: b */
    private void m10098b(View view, JSONObject jSONObject) {
        ArrayList<String> b = this.f10560g.mo39025b(view);
        if (b != null) {
            C4676b.m10038a(jSONObject, (List<String>) b);
        }
    }

    public static TreeWalker getInstance() {
        return f10552a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m10103h() {
        m10104i();
        mo39014d();
        m10105j();
    }

    /* renamed from: i */
    private void m10104i() {
        this.f10558e = 0;
        this.f10562i = C4679d.m10050a();
    }

    /* renamed from: j */
    private void m10105j() {
        m10094a(C4679d.m10050a() - this.f10562i);
    }

    /* renamed from: k */
    private void m10106k() {
        if (f10554c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10554c = handler;
            handler.post(f10555j);
            f10554c.postDelayed(f10556k, 200);
        }
    }

    /* renamed from: l */
    private void m10107l() {
        Handler handler = f10554c;
        if (handler != null) {
            handler.removeCallbacks(f10556k);
            f10554c = null;
        }
    }

    /* renamed from: a */
    public void mo39010a() {
        m10106k();
    }

    /* renamed from: a */
    public void mo38983a(View view, C4670a aVar, JSONObject jSONObject) {
        C4701c c;
        if (C4681f.m10067d(view) && (c = this.f10560g.mo39027c(view)) != C4701c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo38981a(view);
            C4676b.m10039a(jSONObject, a);
            if (!m10097a(view, a)) {
                m10098b(view, a);
                m10095a(view, aVar, a, c);
            }
            this.f10558e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10557d.contains(treeWalkerTimeLogger)) {
            this.f10557d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo39012b() {
        mo39013c();
        this.f10557d.clear();
        f10553b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f10561h.mo39045a();
            }
        });
    }

    /* renamed from: c */
    public void mo39013c() {
        m10107l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39014d() {
        this.f10560g.mo39028c();
        long a = C4679d.m10050a();
        C4670a a2 = this.f10559f.mo38984a();
        if (this.f10560g.mo39026b().size() > 0) {
            Iterator<String> it = this.f10560g.mo39026b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo38981a((View) null);
                m10096a(next, this.f10560g.mo39024b(next), a3);
                C4676b.m10035a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10561h.mo39047b(a3, hashSet, a);
            }
        }
        if (this.f10560g.mo39023a().size() > 0) {
            JSONObject a4 = a2.mo38981a((View) null);
            m10095a((View) null, a2, a4, C4701c.PARENT_VIEW);
            C4676b.m10035a(a4);
            this.f10561h.mo39046a(a4, this.f10560g.mo39023a(), a);
        } else {
            this.f10561h.mo39045a();
        }
        this.f10560g.mo39029d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10557d.contains(treeWalkerTimeLogger)) {
            this.f10557d.remove(treeWalkerTimeLogger);
        }
    }
}
