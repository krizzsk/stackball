package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.p091c.C4571a;
import com.iab.omid.library.adcolony.p091c.C4573b;
import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.p092d.C4580d;
import com.iab.omid.library.adcolony.p092d.C4582f;
import com.iab.omid.library.adcolony.walking.C4592a;
import com.iab.omid.library.adcolony.walking.p094a.C4598c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4571a.C4572a {

    /* renamed from: g */
    private static TreeWalker f10335g = new TreeWalker();

    /* renamed from: h */
    private static Handler f10336h = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Handler f10337i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f10338j = new C4590b();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f10339k = new C4591c();

    /* renamed from: a */
    private List<TreeWalkerTimeLogger> f10340a = new ArrayList();

    /* renamed from: b */
    private int f10341b;

    /* renamed from: c */
    private C4573b f10342c = new C4573b();

    /* renamed from: d */
    private C4592a f10343d = new C4592a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4602b f10344e = new C4602b(new C4598c());

    /* renamed from: f */
    private long f10345f;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.TreeWalker$a */
    class C4589a implements Runnable {
        C4589a() {
        }

        public void run() {
            TreeWalker.this.f10344e.mo38685a();
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.TreeWalker$b */
    static class C4590b implements Runnable {
        C4590b() {
        }

        public void run() {
            TreeWalker.getInstance().m9666h();
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.TreeWalker$c */
    static class C4591c implements Runnable {
        C4591c() {
        }

        public void run() {
            if (TreeWalker.f10337i != null) {
                TreeWalker.f10337i.post(TreeWalker.f10338j);
                TreeWalker.f10337i.postDelayed(TreeWalker.f10339k, 200);
            }
        }
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m9657a(long j) {
        if (this.f10340a.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f10340a) {
                next.onTreeProcessed(this.f10341b, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f10341b, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m9658a(View view, C4571a aVar, JSONObject jSONObject, C4603c cVar) {
        aVar.mo38616a(view, jSONObject, this, cVar == C4603c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m9659a(String str, View view, JSONObject jSONObject) {
        C4571a b = this.f10342c.mo38619b();
        String a = this.f10343d.mo38659a(str);
        if (a != null) {
            JSONObject a2 = b.mo38615a(view);
            C4577b.m9596a(a2, str);
            C4577b.m9601b(a2, a);
            C4577b.m9598a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m9660a(View view, JSONObject jSONObject) {
        String a = this.f10343d.mo38658a(view);
        if (a == null) {
            return false;
        }
        C4577b.m9596a(jSONObject, a);
        this.f10343d.mo38667e();
        return true;
    }

    /* renamed from: b */
    private void m9661b(View view, JSONObject jSONObject) {
        C4592a.C4593a b = this.f10343d.mo38662b(view);
        if (b != null) {
            C4577b.m9595a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f10335g;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m9666h() {
        m9667i();
        mo38651d();
        m9668j();
    }

    /* renamed from: i */
    private void m9667i() {
        this.f10341b = 0;
        this.f10345f = C4580d.m9609a();
    }

    /* renamed from: j */
    private void m9668j() {
        m9657a(C4580d.m9609a() - this.f10345f);
    }

    /* renamed from: k */
    private void m9669k() {
        if (f10337i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f10337i = handler;
            handler.post(f10338j);
            f10337i.postDelayed(f10339k, 200);
        }
    }

    /* renamed from: l */
    private void m9670l() {
        Handler handler = f10337i;
        if (handler != null) {
            handler.removeCallbacks(f10339k);
            f10337i = null;
        }
    }

    /* renamed from: a */
    public void mo38647a() {
        m9669k();
    }

    /* renamed from: a */
    public void mo38617a(View view, C4571a aVar, JSONObject jSONObject) {
        C4603c c;
        if (C4582f.m9626d(view) && (c = this.f10343d.mo38664c(view)) != C4603c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo38615a(view);
            C4577b.m9598a(jSONObject, a);
            if (!m9660a(view, a)) {
                m9661b(view, a);
                m9658a(view, aVar, a, c);
            }
            this.f10341b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f10340a.contains(treeWalkerTimeLogger)) {
            this.f10340a.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo38649b() {
        mo38650c();
        this.f10340a.clear();
        f10336h.post(new C4589a());
    }

    /* renamed from: c */
    public void mo38650c() {
        m9670l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo38651d() {
        this.f10343d.mo38665c();
        long a = C4580d.m9609a();
        C4571a a2 = this.f10342c.mo38618a();
        if (this.f10343d.mo38663b().size() > 0) {
            Iterator<String> it = this.f10343d.mo38663b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo38615a((View) null);
                m9659a(next, this.f10343d.mo38661b(next), a3);
                C4577b.m9594a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f10344e.mo38687b(a3, hashSet, a);
            }
        }
        if (this.f10343d.mo38660a().size() > 0) {
            JSONObject a4 = a2.mo38615a((View) null);
            m9658a((View) null, a2, a4, C4603c.PARENT_VIEW);
            C4577b.m9594a(a4);
            this.f10344e.mo38686a(a4, this.f10343d.mo38660a(), a);
        } else {
            this.f10344e.mo38685a();
        }
        this.f10343d.mo38666d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f10340a.contains(treeWalkerTimeLogger)) {
            this.f10340a.remove(treeWalkerTimeLogger);
        }
    }
}
