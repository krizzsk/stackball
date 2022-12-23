package com.yandex.metrica.impl.p265ob;

import com.tapjoy.TJAdUnitConstants;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.metrica.impl.ob.E */
public class C10199E implements C10237F2 {

    /* renamed from: a */
    private final Set<Integer> f24527a = new HashSet();

    /* renamed from: b */
    private final Set<Integer> f24528b = new HashSet();

    /* renamed from: c */
    private volatile C10200a f24529c = C10200a.UNKNOWN;

    /* renamed from: d */
    private final Set<C10201b> f24530d = new CopyOnWriteArraySet();

    /* renamed from: com.yandex.metrica.impl.ob.E$a */
    public enum C10200a {
        UNKNOWN("unknown"),
        BACKGROUND("background"),
        VISIBLE(TJAdUnitConstants.String.VISIBLE);

        private C10200a(String str) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E$b */
    public interface C10201b {
        /* renamed from: a */
        void mo61213a(C10200a aVar);
    }

    /* renamed from: d */
    private void m26174d() {
        C10200a aVar = C10200a.UNKNOWN;
        if (!this.f24527a.isEmpty()) {
            aVar = C10200a.VISIBLE;
        } else if (!this.f24528b.isEmpty()) {
            aVar = C10200a.BACKGROUND;
        }
        if (this.f24529c != aVar) {
            this.f24529c = aVar;
            for (C10201b a : this.f24530d) {
                a.mo61213a(this.f24529c);
            }
        }
    }

    /* renamed from: a */
    public void mo61207a() {
        m26174d();
    }

    /* renamed from: b */
    public void mo61209b() {
        if (this.f24529c == C10200a.VISIBLE) {
            this.f24529c = C10200a.BACKGROUND;
        }
    }

    /* renamed from: c */
    public C10200a mo61211c() {
        return this.f24529c;
    }

    /* renamed from: a */
    public C10200a mo61206a(C10201b bVar) {
        this.f24530d.add(bVar);
        return this.f24529c;
    }

    /* renamed from: c */
    public void mo61212c(int i) {
        this.f24527a.add(Integer.valueOf(i));
        this.f24528b.remove(Integer.valueOf(i));
        m26174d();
    }

    /* renamed from: b */
    public void mo61210b(int i) {
        this.f24528b.add(Integer.valueOf(i));
        this.f24527a.remove(Integer.valueOf(i));
        m26174d();
    }

    /* renamed from: a */
    public void mo61208a(int i) {
        this.f24527a.remove(Integer.valueOf(i));
        m26174d();
    }
}
