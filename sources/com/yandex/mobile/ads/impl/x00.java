package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.w00;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public abstract class x00 implements qh0, ci0<w00> {

    /* renamed from: a */
    public static final C15131d f42347a = new C15131d((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.x00$a */
    public static class C15128a extends x00 {

        /* renamed from: b */
        private final C14577sc f42348b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15128a(C14577sc scVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(scVar, "value");
            this.f42348b = scVar;
        }

        /* renamed from: b */
        public C14577sc mo70781b() {
            return this.f42348b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x00$b */
    public static class C15129b extends x00 {

        /* renamed from: b */
        private final C13494jg f42349b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15129b(C13494jg jgVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(jgVar, "value");
            this.f42349b = jgVar;
        }

        /* renamed from: b */
        public C13494jg mo70782b() {
            return this.f42349b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x00$c */
    static final class C15130c extends Lambda implements Function2<ly0, JSONObject, x00> {

        /* renamed from: b */
        public static final C15130c f42350b = new C15130c();

        C15130c() {
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0112, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
            throw com.yandex.mobile.ads.impl.py0.m41004a(r13, "type", r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            /*
                r11 = this;
                com.yandex.mobile.ads.impl.ly0 r12 = (com.yandex.mobile.ads.impl.ly0) r12
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                java.lang.String r0 = "env"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r1 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
                com.yandex.mobile.ads.impl.x00$d r1 = com.yandex.mobile.ads.impl.x00.f42347a
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "json"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                com.yandex.mobile.ads.impl.ny0 r3 = r12.mo66818b()
                java.lang.String r1 = "type"
                r2 = 0
                r5 = 2
                r0 = r13
                r4 = r12
                java.lang.Object r0 = com.yandex.mobile.ads.impl.ai0.m33744a(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yandex.mobile.ads.impl.gd1 r1 = r12.mo68529a()
                com.yandex.mobile.ads.impl.ci0 r1 = r1.mo66059a(r0)
                boolean r2 = r1 instanceof com.yandex.mobile.ads.impl.x00
                r3 = 0
                if (r2 == 0) goto L_0x0038
                com.yandex.mobile.ads.impl.x00 r1 = (com.yandex.mobile.ads.impl.x00) r1
                goto L_0x0039
            L_0x0038:
                r1 = r3
            L_0x0039:
                java.lang.String r2 = "bool_int"
                java.lang.String r4 = "integer"
                java.lang.String r5 = "color"
                java.lang.String r6 = "url"
                java.lang.String r7 = "number"
                java.lang.String r8 = "string"
                if (r1 != 0) goto L_0x0048
                goto L_0x006b
            L_0x0048:
                boolean r0 = r1 instanceof com.yandex.mobile.ads.impl.x00.C15134g
                if (r0 == 0) goto L_0x004e
                r0 = r8
                goto L_0x006b
            L_0x004e:
                boolean r0 = r1 instanceof com.yandex.mobile.ads.impl.x00.C15133f
                if (r0 == 0) goto L_0x0054
                r0 = r7
                goto L_0x006b
            L_0x0054:
                boolean r0 = r1 instanceof com.yandex.mobile.ads.impl.x00.C15132e
                if (r0 == 0) goto L_0x005a
                r0 = r4
                goto L_0x006b
            L_0x005a:
                boolean r0 = r1 instanceof com.yandex.mobile.ads.impl.x00.C15128a
                if (r0 == 0) goto L_0x0060
                r0 = r2
                goto L_0x006b
            L_0x0060:
                boolean r0 = r1 instanceof com.yandex.mobile.ads.impl.x00.C15129b
                if (r0 == 0) goto L_0x0066
                r0 = r5
                goto L_0x006b
            L_0x0066:
                boolean r0 = r1 instanceof com.yandex.mobile.ads.impl.x00.C15135h
                if (r0 == 0) goto L_0x011a
                r0 = r6
            L_0x006b:
                int r9 = r0.hashCode()
                r10 = 0
                switch(r9) {
                    case -1034364087: goto L_0x00f9;
                    case -891985903: goto L_0x00df;
                    case 116079: goto L_0x00c5;
                    case 94842723: goto L_0x00ab;
                    case 1958052158: goto L_0x0090;
                    case 2005892378: goto L_0x0075;
                    default: goto L_0x0073;
                }
            L_0x0073:
                goto L_0x0113
            L_0x0075:
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L_0x0113
                com.yandex.mobile.ads.impl.x00$a r0 = new com.yandex.mobile.ads.impl.x00$a
                com.yandex.mobile.ads.impl.sc r2 = new com.yandex.mobile.ads.impl.sc
                if (r1 != 0) goto L_0x0082
                goto L_0x0086
            L_0x0082:
                java.lang.Object r3 = r1.mo70779a()
            L_0x0086:
                com.yandex.mobile.ads.impl.sc r3 = (com.yandex.mobile.ads.impl.C14577sc) r3
                r2.<init>(r12, r3, r10, r13)
                r0.<init>(r2)
                goto L_0x0112
            L_0x0090:
                boolean r2 = r0.equals(r4)
                if (r2 == 0) goto L_0x0113
                com.yandex.mobile.ads.impl.x00$e r0 = new com.yandex.mobile.ads.impl.x00$e
                com.yandex.mobile.ads.impl.eh0 r2 = new com.yandex.mobile.ads.impl.eh0
                if (r1 != 0) goto L_0x009d
                goto L_0x00a1
            L_0x009d:
                java.lang.Object r3 = r1.mo70779a()
            L_0x00a1:
                com.yandex.mobile.ads.impl.eh0 r3 = (com.yandex.mobile.ads.impl.eh0) r3
                r2.<init>(r12, r3, r10, r13)
                r0.<init>(r2)
                goto L_0x0112
            L_0x00ab:
                boolean r2 = r0.equals(r5)
                if (r2 == 0) goto L_0x0113
                com.yandex.mobile.ads.impl.x00$b r0 = new com.yandex.mobile.ads.impl.x00$b
                com.yandex.mobile.ads.impl.jg r2 = new com.yandex.mobile.ads.impl.jg
                if (r1 != 0) goto L_0x00b8
                goto L_0x00bc
            L_0x00b8:
                java.lang.Object r3 = r1.mo70779a()
            L_0x00bc:
                com.yandex.mobile.ads.impl.jg r3 = (com.yandex.mobile.ads.impl.C13494jg) r3
                r2.<init>(r12, r3, r10, r13)
                r0.<init>(r2)
                goto L_0x0112
            L_0x00c5:
                boolean r2 = r0.equals(r6)
                if (r2 == 0) goto L_0x0113
                com.yandex.mobile.ads.impl.x00$h r0 = new com.yandex.mobile.ads.impl.x00$h
                com.yandex.mobile.ads.impl.ah1 r2 = new com.yandex.mobile.ads.impl.ah1
                if (r1 != 0) goto L_0x00d2
                goto L_0x00d6
            L_0x00d2:
                java.lang.Object r3 = r1.mo70779a()
            L_0x00d6:
                com.yandex.mobile.ads.impl.ah1 r3 = (com.yandex.mobile.ads.impl.ah1) r3
                r2.<init>(r12, r3, r10, r13)
                r0.<init>(r2)
                goto L_0x0112
            L_0x00df:
                boolean r2 = r0.equals(r8)
                if (r2 == 0) goto L_0x0113
                com.yandex.mobile.ads.impl.x00$g r0 = new com.yandex.mobile.ads.impl.x00$g
                com.yandex.mobile.ads.impl.lb1 r2 = new com.yandex.mobile.ads.impl.lb1
                if (r1 != 0) goto L_0x00ec
                goto L_0x00f0
            L_0x00ec:
                java.lang.Object r3 = r1.mo70779a()
            L_0x00f0:
                com.yandex.mobile.ads.impl.lb1 r3 = (com.yandex.mobile.ads.impl.lb1) r3
                r2.<init>(r12, r3, r10, r13)
                r0.<init>(r2)
                goto L_0x0112
            L_0x00f9:
                boolean r2 = r0.equals(r7)
                if (r2 == 0) goto L_0x0113
                com.yandex.mobile.ads.impl.x00$f r0 = new com.yandex.mobile.ads.impl.x00$f
                com.yandex.mobile.ads.impl.zv0 r2 = new com.yandex.mobile.ads.impl.zv0
                if (r1 != 0) goto L_0x0106
                goto L_0x010a
            L_0x0106:
                java.lang.Object r3 = r1.mo70779a()
            L_0x010a:
                com.yandex.mobile.ads.impl.zv0 r3 = (com.yandex.mobile.ads.impl.zv0) r3
                r2.<init>(r12, r3, r10, r13)
                r0.<init>(r2)
            L_0x0112:
                return r0
            L_0x0113:
                java.lang.String r12 = "type"
                com.yandex.mobile.ads.impl.oy0 r12 = com.yandex.mobile.ads.impl.py0.m41004a((org.json.JSONObject) r13, (java.lang.String) r12, r0)
                throw r12
            L_0x011a:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x00.C15130c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x00$d */
    public static final class C15131d {
        private C15131d() {
        }

        public /* synthetic */ C15131d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x00$e */
    public static class C15132e extends x00 {

        /* renamed from: b */
        private final eh0 f42351b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15132e(eh0 eh0) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(eh0, "value");
            this.f42351b = eh0;
        }

        /* renamed from: b */
        public eh0 mo70783b() {
            return this.f42351b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x00$f */
    public static class C15133f extends x00 {

        /* renamed from: b */
        private final zv0 f42352b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15133f(zv0 zv0) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(zv0, "value");
            this.f42352b = zv0;
        }

        /* renamed from: b */
        public zv0 mo70784b() {
            return this.f42352b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x00$g */
    public static class C15134g extends x00 {

        /* renamed from: b */
        private final lb1 f42353b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15134g(lb1 lb1) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lb1, "value");
            this.f42353b = lb1;
        }

        /* renamed from: b */
        public lb1 mo70785b() {
            return this.f42353b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x00$h */
    public static class C15135h extends x00 {

        /* renamed from: b */
        private final ah1 f42354b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15135h(ah1 ah1) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(ah1, "value");
            this.f42354b = ah1;
        }

        /* renamed from: b */
        public ah1 mo70786b() {
            return this.f42354b;
        }
    }

    static {
        C15130c cVar = C15130c.f42350b;
    }

    private x00() {
    }

    public /* synthetic */ x00(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public w00 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C15134g) {
            return new w00.C15024g(((C15134g) this).mo70785b().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C15133f) {
            return new w00.C15023f(((C15133f) this).mo70784b().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C15132e) {
            return new w00.C15022e(((C15132e) this).mo70783b().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C15128a) {
            return new w00.C15018a(((C15128a) this).mo70781b().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C15129b) {
            return new w00.C15019b(((C15129b) this).mo70782b().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C15135h) {
            return new w00.C15025h(((C15135h) this).mo70786b().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public Object mo70779a() {
        if (this instanceof C15134g) {
            return ((C15134g) this).mo70785b();
        }
        if (this instanceof C15133f) {
            return ((C15133f) this).mo70784b();
        }
        if (this instanceof C15132e) {
            return ((C15132e) this).mo70783b();
        }
        if (this instanceof C15128a) {
            return ((C15128a) this).mo70781b();
        }
        if (this instanceof C15129b) {
            return ((C15129b) this).mo70782b();
        }
        if (this instanceof C15135h) {
            return ((C15135h) this).mo70786b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
