package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

public interface tf1 {

    /* renamed from: com.yandex.mobile.ads.impl.tf1$a */
    public static final class C14675a {

        /* renamed from: a */
        public final String f40307a;

        /* renamed from: b */
        public final byte[] f40308b;

        public C14675a(String str, int i, byte[] bArr) {
            this.f40307a = str;
            this.f40308b = bArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tf1$b */
    public static final class C14676b {

        /* renamed from: a */
        public final String f40309a;

        /* renamed from: b */
        public final List<C14675a> f40310b;

        /* renamed from: c */
        public final byte[] f40311c;

        public C14676b(int i, String str, List<C14675a> list, byte[] bArr) {
            List<C14675a> list2;
            this.f40309a = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f40310b = list2;
            this.f40311c = bArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tf1$c */
    public interface C14677c {
        /* renamed from: a */
        SparseArray<tf1> mo70175a();

        /* renamed from: a */
        tf1 mo70176a(int i, C14676b bVar);
    }

    /* renamed from: com.yandex.mobile.ads.impl.tf1$d */
    public static final class C14678d {

        /* renamed from: a */
        private final String f40312a;

        /* renamed from: b */
        private final int f40313b;

        /* renamed from: c */
        private final int f40314c;

        /* renamed from: d */
        private int f40315d;

        /* renamed from: e */
        private String f40316e;

        public C14678d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f40312a = str;
            this.f40313b = i2;
            this.f40314c = i3;
            this.f40315d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public void mo70177a() {
            int i = this.f40315d;
            this.f40315d = i == Integer.MIN_VALUE ? this.f40313b : i + this.f40314c;
            this.f40316e = this.f40312a + this.f40315d;
        }

        /* renamed from: b */
        public String mo70178b() {
            if (this.f40315d != Integer.MIN_VALUE) {
                return this.f40316e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: c */
        public int mo70179c() {
            int i = this.f40315d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    void mo66377a();

    /* renamed from: a */
    void mo66378a(de1 de1, x50 x50, C14678d dVar);

    /* renamed from: a */
    void mo66379a(fy0 fy0, int i) throws jy0;
}
