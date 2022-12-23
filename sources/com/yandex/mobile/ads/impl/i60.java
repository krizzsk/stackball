package com.yandex.mobile.ads.impl;

import java.util.List;

public class i60 extends C13370i {

    /* renamed from: b */
    private final List<C13382a> f34745b;

    /* renamed from: com.yandex.mobile.ads.impl.i60$a */
    public static class C13382a {

        /* renamed from: a */
        private final String f34746a;

        /* renamed from: b */
        private final String f34747b;

        public C13382a(String str, String str2) {
            this.f34746a = str;
            this.f34747b = str2;
        }

        /* renamed from: a */
        public String mo67737a() {
            return this.f34746a;
        }

        /* renamed from: b */
        public String mo67738b() {
            return this.f34747b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C13382a.class != obj.getClass()) {
                return false;
            }
            C13382a aVar = (C13382a) obj;
            if (!this.f34746a.equals(aVar.f34746a)) {
                return false;
            }
            return this.f34747b.equals(aVar.f34747b);
        }

        public int hashCode() {
            return (this.f34746a.hashCode() * 31) + this.f34747b.hashCode();
        }
    }

    public i60(String str, List<C13382a> list) {
        super(str);
        this.f34745b = list;
    }

    /* renamed from: b */
    public List<C13382a> mo67736b() {
        return this.f34745b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i60.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.f34745b.equals(((i60) obj).f34745b);
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.f34745b.hashCode();
    }
}
