package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10910X3;
import com.yandex.metrica.impl.p265ob.C11156dh;
import com.yandex.metrica.impl.p265ob.C11286gh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X4 */
public class C10912X4 extends C11286gh {

    /* renamed from: o */
    private List<String> f26239o;

    /* renamed from: p */
    private String f26240p;

    /* renamed from: q */
    private Boolean f26241q;

    /* renamed from: C */
    public String mo62471C() {
        return this.f26240p;
    }

    /* renamed from: D */
    public List<String> mo62472D() {
        return this.f26239o;
    }

    /* renamed from: E */
    public Boolean mo62473E() {
        return this.f26241q;
    }

    /* renamed from: a */
    public void mo62475a(List<String> list) {
        this.f26239o = list;
    }

    /* renamed from: h */
    public void mo62476h(String str) {
        this.f26240p = str;
    }

    public String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.f26239o + ", mApiKey='" + this.f26240p + '\'' + ", statisticsSending=" + this.f26241q + '}';
    }

    /* renamed from: a */
    public void mo62474a(Boolean bool) {
        this.f26241q = bool;
    }

    /* renamed from: com.yandex.metrica.impl.ob.X4$a */
    public static final class C10913a extends C11156dh.C11157a<C10910X3.C10911a, C10913a> {

        /* renamed from: d */
        public final String f26242d;

        /* renamed from: e */
        public final boolean f26243e;

        public C10913a(String str, String str2, String str3, String str4, Boolean bool) {
            super(str, str2, str3);
            this.f26242d = str4;
            this.f26243e = ((Boolean) C11993ym.m30961a(bool, Boolean.TRUE)).booleanValue();
        }

        /* renamed from: a */
        public Object mo62467a(Object obj) {
            C10910X3.C10911a aVar = (C10910X3.C10911a) obj;
            String str = aVar.f26222a;
            String str2 = this.f26741a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f26223b;
            String str4 = this.f26742b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f26224c;
            String str6 = this.f26743c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f26225d;
            String str8 = this.f26242d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f26233l;
            return new C10913a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.f26243e) : bool);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
            r3 = r3.f26225d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = r3.f26223b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r0 = r3.f26224c;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo62468b(java.lang.Object r3) {
            /*
                r2 = this;
                com.yandex.metrica.impl.ob.X3$a r3 = (com.yandex.metrica.impl.p265ob.C10910X3.C10911a) r3
                java.lang.String r0 = r3.f26222a
                if (r0 == 0) goto L_0x000f
                java.lang.String r1 = r2.f26741a
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x000f
                goto L_0x0036
            L_0x000f:
                java.lang.String r0 = r3.f26223b
                if (r0 == 0) goto L_0x001c
                java.lang.String r1 = r2.f26742b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x001c
                goto L_0x0036
            L_0x001c:
                java.lang.String r0 = r3.f26224c
                if (r0 == 0) goto L_0x0029
                java.lang.String r1 = r2.f26743c
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0029
                goto L_0x0036
            L_0x0029:
                java.lang.String r3 = r3.f26225d
                if (r3 == 0) goto L_0x0038
                java.lang.String r0 = r2.f26242d
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0036
                goto L_0x0038
            L_0x0036:
                r3 = 0
                goto L_0x0039
            L_0x0038:
                r3 = 1
            L_0x0039:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10912X4.C10913a.mo62468b(java.lang.Object):boolean");
        }

        public C10913a(C10910X3.C10911a aVar) {
            this(aVar.f26222a, aVar.f26223b, aVar.f26224c, aVar.f26225d, aVar.f26233l);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X4$b */
    public static class C10914b extends C11286gh.C11287a<C10912X4, C10913a> {
        public C10914b(Context context, String str) {
            super(context, str);
        }

        /* renamed from: a */
        public C11156dh mo61924a(Object obj) {
            C11156dh.C11159c cVar = (C11156dh.C11159c) obj;
            C10912X4 x4 = (C10912X4) mo62973a(cVar);
            x4.mo62475a(cVar.f26746a.mo62020l());
            x4.mo62476h(((C10913a) cVar.f26747b).f26242d);
            x4.mo62474a(Boolean.valueOf(((C10913a) cVar.f26747b).f26243e));
            return x4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11156dh mo62478a() {
            return new C10912X4();
        }
    }
}
