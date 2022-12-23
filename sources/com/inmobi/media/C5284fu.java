package com.inmobi.media;

import com.p243my.target.ads.Reward;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.fu */
/* compiled from: EventProcessor */
public class C5284fu implements C5289fw {

    /* renamed from: f */
    private static final String f12081f = C5284fu.class.getSimpleName();

    /* renamed from: a */
    public AtomicBoolean f12082a = new AtomicBoolean(false);

    /* renamed from: b */
    public AtomicBoolean f12083b = new AtomicBoolean(false);

    /* renamed from: c */
    public HashMap<String, C5281fr> f12084c = new HashMap<>(1);

    /* renamed from: d */
    public List<String> f12085d = new LinkedList();

    /* renamed from: e */
    public ScheduledExecutorService f12086e;

    /* renamed from: g */
    private C5282fs f12087g;

    /* renamed from: h */
    private C5290fx f12088h;

    public C5284fu(C5282fs fsVar, C5290fx fxVar, C5281fr frVar) {
        this.f12087g = fsVar;
        this.f12088h = fxVar;
        mo40604a(frVar);
    }

    /* renamed from: a */
    public final void mo40607a(String str, boolean z) {
        if (!this.f12083b.get()) {
            m12098a(str, m12099b(str).f12071f, z);
        }
    }

    /* renamed from: a */
    private void m12098a(final String str, long j, final boolean z) {
        if (!this.f12085d.contains(str)) {
            this.f12085d.add(str);
            if (this.f12086e == null) {
                this.f12086e = Executors.newSingleThreadScheduledExecutor(new C5326gv(f12081f));
            }
            this.f12086e.scheduleAtFixedRate(new Runnable() {

                /* renamed from: b */
                final /* synthetic */ C5361hu f12090b = null;

                public final void run() {
                    C5284fu.m12097a(C5284fu.this, str, this.f12090b, z);
                }
            }, m12096a(str), j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    private long m12096a(String str) {
        C5281fr b = m12099b(str);
        long c = this.f12087g.mo40599c();
        if (c == -1) {
            this.f12087g.mo40600c(System.currentTimeMillis());
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(c) + b.f12071f;
        if (seconds - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > 0) {
            return seconds - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        return 0;
    }

    /* renamed from: b */
    private C5281fr m12099b(String str) {
        return this.f12084c.get(str);
    }

    /* renamed from: a */
    public final void mo40604a(C5281fr frVar) {
        String str = frVar.f12067b;
        if (str == null) {
            str = Reward.DEFAULT;
        }
        this.f12084c.put(str, frVar);
    }

    /* renamed from: a */
    public final void mo40605a(C5283ft ftVar) {
        ftVar.f12078a.get(0).intValue();
        this.f12087g.mo40595a(ftVar.f12078a);
        this.f12087g.mo40600c(System.currentTimeMillis());
        this.f12082a.set(false);
    }

    /* renamed from: a */
    public final void mo40606a(C5283ft ftVar, boolean z) {
        ftVar.f12078a.get(0).intValue();
        if (ftVar.f12080c && z) {
            this.f12087g.mo40595a(ftVar.f12078a);
        }
        this.f12087g.mo40600c(System.currentTimeMillis());
        this.f12082a.set(false);
    }

    /* renamed from: a */
    static /* synthetic */ void m12097a(C5284fu fuVar, String str, C5361hu huVar, boolean z) {
        int i;
        long j;
        C5283ft c;
        if (!fuVar.f12083b.get() && !fuVar.f12082a.get()) {
            fuVar.f12087g.mo40598b(fuVar.m12099b(str).f12066a);
            int a = fuVar.f12087g.mo40594a();
            int a2 = C5342he.m12326a();
            if (a2 != 1) {
                i = fuVar.m12099b(str).f12074i;
            } else {
                i = fuVar.m12099b(str).f12072g;
            }
            if (a2 != 1) {
                j = fuVar.m12099b(str).f12075j;
            } else {
                j = fuVar.m12099b(str).f12073h;
            }
            long j2 = j;
            if ((i <= a || fuVar.f12087g.mo40596a(fuVar.m12099b(str).f12068c) || fuVar.f12087g.mo40597a(fuVar.m12099b(str).f12071f, fuVar.m12099b(str).f12068c)) && (c = fuVar.f12088h.mo40592c()) != null) {
                fuVar.f12082a.set(true);
                C5281fr b = fuVar.m12099b(str);
                C5286fv a3 = C5286fv.m12104a();
                String str2 = b.f12070e;
                int i2 = b.f12069d + 1;
                a3.mo40609a(c, str2, i2, i2, j2, huVar, fuVar, z);
            }
        }
    }
}
