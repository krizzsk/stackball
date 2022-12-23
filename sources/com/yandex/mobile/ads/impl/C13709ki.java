package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ki */
public class C13709ki {

    /* renamed from: a */
    private final FalseClick f36142a;

    /* renamed from: b */
    private final List<qe1> f36143b;

    /* renamed from: com.yandex.mobile.ads.impl.ki$a */
    public static class C13710a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public FalseClick f36144a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<qe1> f36145b;

        /* renamed from: a */
        public C13710a mo68235a(FalseClick falseClick) {
            this.f36144a = falseClick;
            return this;
        }

        /* renamed from: a */
        public C13710a mo68236a(List<qe1> list) {
            this.f36145b = list;
            return this;
        }
    }

    public C13709ki(C13710a aVar) {
        this.f36142a = aVar.f36144a;
        this.f36143b = aVar.f36145b;
    }

    /* renamed from: a */
    public FalseClick mo68231a() {
        return this.f36142a;
    }

    /* renamed from: b */
    public List<qe1> mo68232b() {
        return this.f36143b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13709ki.class != obj.getClass()) {
            return false;
        }
        C13709ki kiVar = (C13709ki) obj;
        FalseClick falseClick = this.f36142a;
        if (falseClick == null ? kiVar.f36142a != null : !falseClick.equals(kiVar.f36142a)) {
            return false;
        }
        List<qe1> list = this.f36143b;
        List<qe1> list2 = kiVar.f36143b;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        FalseClick falseClick = this.f36142a;
        int i = 0;
        int hashCode = (falseClick != null ? falseClick.hashCode() : 0) * 31;
        List<qe1> list = this.f36143b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
