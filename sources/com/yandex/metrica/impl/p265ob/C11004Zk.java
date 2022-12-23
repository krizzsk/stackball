package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.Zk */
abstract class C11004Zk<T> {

    /* renamed from: a */
    private List<Object> f26474a;

    /* renamed from: b */
    private final C10892Wk f26475b;

    C11004Zk(T t, C10892Wk wk) {
        this.f26474a = m28399c(t);
        this.f26475b = wk;
    }

    /* renamed from: c */
    private List<Object> m28399c(T t) {
        Pattern pattern;
        Pattern pattern2;
        ArrayList arrayList = new ArrayList();
        if (t == null) {
            return arrayList;
        }
        int b = mo61743b(t);
        List<C11215em> a = mo61742a(t);
        arrayList.add(new C10170Cl(b));
        for (C11215em next : a) {
            int ordinal = next.f26845a.ordinal();
            Object obj = null;
            if (ordinal == 0) {
                obj = new C10818Uk(next.f26846b);
            } else if (ordinal == 1) {
                obj = new C10436Kk(next.f26846b);
            } else if (ordinal == 2) {
                try {
                    pattern = Pattern.compile(next.f26846b);
                } catch (Throwable unused) {
                    pattern = null;
                }
                if (pattern != null) {
                    obj = new C11662pl(pattern);
                }
            } else if (ordinal == 3) {
                try {
                    pattern2 = Pattern.compile(next.f26846b);
                } catch (Throwable unused2) {
                    pattern2 = null;
                }
                if (pattern2 != null) {
                    obj = new C10647Pk(pattern2);
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10892Wk mo62594a() {
        return this.f26475b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<C11215em> mo61742a(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo61743b(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<Object> mo62595b() {
        return this.f26474a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo62596d(T t) {
        this.f26475b.mo62457a();
        this.f26474a = m28399c(t);
    }
}
