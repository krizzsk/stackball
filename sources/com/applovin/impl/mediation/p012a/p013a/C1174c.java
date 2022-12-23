package com.applovin.impl.mediation.p012a.p013a;

import android.text.SpannedString;
import com.applovin.sdk.C1701R;

/* renamed from: com.applovin.impl.mediation.a.a.c */
public abstract class C1174c {

    /* renamed from: a */
    protected C1175a f2204a;

    /* renamed from: b */
    protected SpannedString f2205b;

    /* renamed from: c */
    protected SpannedString f2206c;

    /* renamed from: com.applovin.impl.mediation.a.a.c$a */
    public enum C1175a {
        SECTION(0),
        SIMPLE(1),
        DETAIL(2),
        RIGHT_DETAIL(3),
        COUNT(4);
        

        /* renamed from: f */
        private final int f2213f;

        private C1175a(int i) {
            this.f2213f = i;
        }

        /* renamed from: a */
        public int mo12166a() {
            return this.f2213f;
        }

        /* renamed from: b */
        public int mo12167b() {
            if (this == SECTION) {
                return C1701R.layout.list_section;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? C1701R.layout.list_item_detail : C1701R.layout.list_item_right_detail;
        }
    }

    public C1174c(C1175a aVar) {
        this.f2204a = aVar;
    }

    /* renamed from: a */
    public static int m1872a() {
        return C1175a.COUNT.mo12166a();
    }

    /* renamed from: b */
    public boolean mo12157b() {
        return false;
    }

    /* renamed from: c */
    public SpannedString mo12158c() {
        return this.f2205b;
    }

    /* renamed from: d */
    public SpannedString mo12159d() {
        return this.f2206c;
    }

    /* renamed from: e */
    public int mo12160e() {
        return this.f2204a.mo12166a();
    }

    /* renamed from: f */
    public int mo12161f() {
        return this.f2204a.mo12167b();
    }

    /* renamed from: g */
    public int mo12162g() {
        return 0;
    }

    /* renamed from: h */
    public int mo12163h() {
        return 0;
    }

    /* renamed from: i */
    public int mo12164i() {
        return 0;
    }

    /* renamed from: j */
    public int mo12165j() {
        return 0;
    }
}
