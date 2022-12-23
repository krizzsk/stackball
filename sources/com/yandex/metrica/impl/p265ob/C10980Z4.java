package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Z4 */
public class C10980Z4 {

    /* renamed from: a */
    private Long f26400a;

    /* renamed from: b */
    private int f26401b;

    /* renamed from: c */
    private C10616Om f26402c;

    /* renamed from: com.yandex.metrica.impl.ob.Z4$a */
    public static class C10981a {

        /* renamed from: a */
        public final long f26403a;

        /* renamed from: b */
        public final long f26404b;

        /* renamed from: c */
        public final int f26405c;

        public C10981a(long j, long j2, int i) {
            this.f26403a = j;
            this.f26405c = i;
            this.f26404b = j2;
        }
    }

    public C10980Z4() {
        this(new C10580Nm());
    }

    /* renamed from: a */
    public C10981a mo62570a() {
        if (this.f26400a == null) {
            this.f26400a = Long.valueOf(this.f26402c.mo61841b());
        }
        long longValue = this.f26400a.longValue();
        long longValue2 = this.f26400a.longValue();
        int i = this.f26401b;
        C10981a aVar = new C10981a(longValue, longValue2, i);
        this.f26401b = i + 1;
        return aVar;
    }

    public C10980Z4(C10616Om om) {
        this.f26402c = om;
    }
}
