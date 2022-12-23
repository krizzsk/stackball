package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3558r;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.v */
public interface C3396v {

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.v$c */
    public interface C3399c {
        /* renamed from: a */
        SparseArray<C3396v> mo19162a();

        /* renamed from: a */
        C3396v mo19163a(int i, C3398b bVar);
    }

    /* renamed from: a */
    void mo19174a();

    /* renamed from: a */
    void mo19175a(C3548k kVar, boolean z);

    /* renamed from: a */
    void mo19176a(C3558r rVar, C3270h hVar, C3400d dVar);

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.v$b */
    public static final class C3398b {

        /* renamed from: a */
        public final int f9166a;

        /* renamed from: b */
        public final String f9167b;

        /* renamed from: c */
        public final List<C3397a> f9168c;

        /* renamed from: d */
        public final byte[] f9169d;

        public C3398b(int i, String str, List<C3397a> list, byte[] bArr) {
            List<C3397a> list2;
            this.f9166a = i;
            this.f9167b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f9168c = list2;
            this.f9169d = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.v$a */
    public static final class C3397a {

        /* renamed from: a */
        public final String f9163a;

        /* renamed from: b */
        public final int f9164b;

        /* renamed from: c */
        public final byte[] f9165c;

        public C3397a(String str, int i, byte[] bArr) {
            this.f9163a = str;
            this.f9164b = i;
            this.f9165c = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.v$d */
    public static final class C3400d {

        /* renamed from: a */
        private final String f9170a;

        /* renamed from: b */
        private final int f9171b;

        /* renamed from: c */
        private final int f9172c;

        /* renamed from: d */
        private int f9173d;

        /* renamed from: e */
        private String f9174e;

        public C3400d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public C3400d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f9170a = str;
            this.f9171b = i2;
            this.f9172c = i3;
            this.f9173d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public final void mo19181a() {
            int i = this.f9173d;
            this.f9173d = i == Integer.MIN_VALUE ? this.f9171b : i + this.f9172c;
            this.f9174e = this.f9170a + this.f9173d;
        }

        /* renamed from: b */
        public final int mo19182b() {
            m8460d();
            return this.f9173d;
        }

        /* renamed from: c */
        public final String mo19183c() {
            m8460d();
            return this.f9174e;
        }

        /* renamed from: d */
        private void m8460d() {
            if (this.f9173d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
