package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13325hj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.mb */
public abstract class C13966mb implements C13325hj {

    /* renamed from: a */
    private final boolean f37279a;

    /* renamed from: b */
    private final ArrayList<af1> f37280b = new ArrayList<>(1);

    /* renamed from: c */
    private int f37281c;

    /* renamed from: d */
    private C13504jj f37282d;

    protected C13966mb(boolean z) {
        this.f37279a = z;
    }

    /* renamed from: a */
    public final void mo65277a(af1 af1) {
        if (!this.f37280b.contains(af1)) {
            this.f37280b.add(af1);
            this.f37281c++;
        }
    }

    /* renamed from: b */
    public /* synthetic */ Map<String, List<String>> mo65278b() {
        return C13325hj.CC.$default$b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68635b(C13504jj jjVar) {
        for (int i = 0; i < this.f37281c; i++) {
            this.f37280b.get(i).mo65750c(this, jjVar, this.f37279a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo68637c(C13504jj jjVar) {
        this.f37282d = jjVar;
        for (int i = 0; i < this.f37281c; i++) {
            this.f37280b.get(i).mo65749b(this, jjVar, this.f37279a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68634a(int i) {
        C13504jj jjVar = this.f37282d;
        int i2 = ih1.f34858a;
        for (int i3 = 0; i3 < this.f37281c; i3++) {
            this.f37280b.get(i3).mo65748a(this, jjVar, this.f37279a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo68636c() {
        C13504jj jjVar = this.f37282d;
        int i = ih1.f34858a;
        for (int i2 = 0; i2 < this.f37281c; i2++) {
            this.f37280b.get(i2).mo65747a(this, jjVar, this.f37279a);
        }
        this.f37282d = null;
    }
}
