package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C11262g4;

/* renamed from: com.yandex.metrica.impl.ob.u4 */
public class C11805u4 {

    /* renamed from: a */
    private final C10306G9 f28354a;

    /* renamed from: b */
    private final C10363I8 f28355b;

    /* renamed from: c */
    private C11839v6 f28356c;

    /* renamed from: d */
    private C11782t8 f28357d;

    /* renamed from: e */
    private final C11508ln f28358e;

    /* renamed from: f */
    private final C10089A f28359f;

    /* renamed from: g */
    private final C11333i4 f28360g;

    /* renamed from: h */
    private C11806a f28361h;

    /* renamed from: i */
    private final C10616Om f28362i;

    /* renamed from: j */
    private final int f28363j;

    /* renamed from: k */
    private long f28364k;

    /* renamed from: l */
    private long f28365l;

    /* renamed from: m */
    private int f28366m;

    /* renamed from: com.yandex.metrica.impl.ob.u4$a */
    public interface C11806a {
    }

    public C11805u4(C10306G9 g9, C10363I8 i8, C11839v6 v6Var, C11782t8 t8Var, C10089A a, C11508ln lnVar, int i, C11806a aVar, C11333i4 i4Var, C10616Om om) {
        this.f28354a = g9;
        this.f28355b = i8;
        this.f28356c = v6Var;
        this.f28357d = t8Var;
        this.f28359f = a;
        this.f28358e = lnVar;
        this.f28363j = i;
        this.f28360g = i4Var;
        this.f28362i = om;
        this.f28361h = aVar;
        this.f28364k = g9.mo61359b(0);
        this.f28365l = g9.mo61374k();
        this.f28366m = g9.mo61369h();
    }

    /* renamed from: a */
    public void mo63759a(C11411k0 k0Var) {
        this.f28356c.mo63820c(k0Var);
    }

    /* renamed from: b */
    public void mo63762b(C11411k0 k0Var) {
        mo63760a(k0Var, this.f28356c.mo63819b(k0Var));
    }

    /* renamed from: c */
    public void mo63763c(C11411k0 k0Var) {
        mo63760a(k0Var, this.f28356c.mo63819b(k0Var));
        int i = this.f28363j;
        this.f28366m = i;
        this.f28354a.mo61356a(i).mo61454c();
    }

    /* renamed from: d */
    public void mo63765d(C11411k0 k0Var) {
        mo63760a(k0Var, this.f28356c.mo63819b(k0Var));
        long b = this.f28362i.mo61841b();
        this.f28364k = b;
        this.f28354a.mo61360c(b).mo61454c();
    }

    /* renamed from: e */
    public void mo63767e(C11411k0 k0Var) {
        mo63760a(k0Var, this.f28356c.mo63819b(k0Var));
        long b = this.f28362i.mo61841b();
        this.f28365l = b;
        this.f28354a.mo61364e(b).mo61454c();
    }

    /* renamed from: f */
    public void mo63768f(C11411k0 k0Var) {
        mo63760a(k0Var, this.f28356c.mo63822f(k0Var));
    }

    /* renamed from: a */
    public void mo63760a(C11411k0 k0Var, C11904w6 w6Var) {
        if (TextUtils.isEmpty(k0Var.mo63162o())) {
            k0Var.mo62215e(this.f28354a.mo61376m());
        }
        k0Var.mo62214d(this.f28354a.mo61375l());
        k0Var.mo63142a(Integer.valueOf(this.f28355b.mo61492g()));
        C11904w6 w6Var2 = w6Var;
        this.f28357d.mo63711a(this.f28358e.mo63309a(k0Var).mo62917a(k0Var), k0Var.mo63161n(), w6Var2, this.f28359f.mo61034a(), this.f28360g);
        ((C11262g4.C11263a) this.f28361h).f26950a.mo63312g();
    }

    /* renamed from: b */
    public void mo63761b() {
        int i = this.f28363j;
        this.f28366m = i;
        this.f28354a.mo61356a(i).mo61454c();
    }

    /* renamed from: c */
    public boolean mo63764c() {
        return this.f28366m < this.f28363j;
    }

    /* renamed from: d */
    public boolean mo63766d() {
        return this.f28362i.mo61841b() - this.f28364k > C11738s6.f28122a;
    }

    /* renamed from: a */
    public long mo63758a() {
        return this.f28365l;
    }
}
