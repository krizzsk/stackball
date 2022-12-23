package com.tapjoy.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.bn */
public abstract class C9101bn implements C9098bk, C9107bp {

    /* renamed from: a */
    private HashMap f22388a;

    /* renamed from: a */
    public static C9101bn m24357a(InputStream inputStream) {
        return C9103a.m24374a().mo57862a(inputStream);
    }

    /* renamed from: b */
    public static C9101bn m24359b(String str) {
        return C9103a.m24374a().mo57864a(str);
    }

    /* renamed from: com.tapjoy.internal.bn$a */
    public static abstract class C9103a {

        /* renamed from: a */
        private static C9103a f22390a;

        /* renamed from: a */
        public static C9103a m24374a() {
            C9103a aVar = f22390a;
            if (aVar != null) {
                return aVar;
            }
            C9103a aVar2 = C9104bo.f22391a;
            f22390a = aVar2;
            return aVar2;
        }

        /* renamed from: a */
        public final C9101bn mo57862a(InputStream inputStream) {
            return mo57863a((Reader) new InputStreamReader(inputStream, C9460jm.f23555c));
        }

        /* renamed from: a */
        public C9101bn mo57863a(Reader reader) {
            return mo57864a(C9475jy.m25459a(reader));
        }

        /* renamed from: a */
        public C9101bn mo57864a(String str) {
            return mo57862a((InputStream) new ByteArrayInputStream(str.getBytes(C9460jm.f23555c.name())));
        }
    }

    /* renamed from: a */
    public final Object mo57848a(String str) {
        HashMap hashMap = this.f22388a;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo57849a(String str, Object obj) {
        if (this.f22388a == null) {
            this.f22388a = new HashMap();
        }
        this.f22388a.put(str, obj);
    }

    /* renamed from: a */
    public final boolean mo57856a() {
        return mo57871k() == C9110bs.BEGIN_OBJECT;
    }

    /* renamed from: t */
    private boolean m24361t() {
        if (mo57871k() != C9110bs.NULL) {
            return false;
        }
        mo57875o();
        return true;
    }

    /* renamed from: b */
    public final String mo57857b() {
        if (m24361t()) {
            return null;
        }
        return mo57873m();
    }

    /* renamed from: c */
    public final String mo57858c(String str) {
        if (m24361t()) {
            return str;
        }
        return mo57873m();
    }

    /* renamed from: com.tapjoy.internal.bn$1 */
    static /* synthetic */ class C91021 {

        /* renamed from: a */
        static final /* synthetic */ int[] f22389a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bs[] r0 = com.tapjoy.internal.C9110bs.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22389a = r0
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22389a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22389a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.NULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22389a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22389a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.NUMBER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22389a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tapjoy.internal.bs r1 = com.tapjoy.internal.C9110bs.STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9101bn.C91021.<clinit>():void");
        }
    }

    /* renamed from: u */
    private Object m24362u() {
        C9110bs k = mo57871k();
        switch (C91021.f22389a[k.ordinal()]) {
            case 1:
                return mo57859c();
            case 2:
                return mo57860d();
            case 3:
                mo57875o();
                return null;
            case 4:
                return Boolean.valueOf(mo57874n());
            case 5:
                return new C9128ci(mo57873m());
            case 6:
                return mo57873m();
            default:
                throw new IllegalStateException("Expected a value but was " + k);
        }
    }

    /* renamed from: c */
    public final List mo57859c() {
        LinkedList linkedList = new LinkedList();
        m24358a((List) linkedList);
        return linkedList;
    }

    /* renamed from: a */
    private void m24358a(List list) {
        mo57866f();
        while (mo57870j()) {
            list.add(m24362u());
        }
        mo57867g();
    }

    /* renamed from: d */
    public final Map mo57860d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mo57855a((Map) linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo57855a(Map map) {
        mo57868h();
        while (mo57870j()) {
            map.put(mo57872l(), m24362u());
        }
        mo57869i();
    }

    @Nullable
    /* renamed from: a */
    public final Object mo57853a(C9093bi biVar) {
        if (m24361t()) {
            return null;
        }
        return biVar.mo57847a(this);
    }

    /* renamed from: a */
    public final void mo57854a(List list, C9093bi biVar) {
        mo57866f();
        while (mo57870j()) {
            list.add(biVar.mo57847a(this));
        }
        mo57867g();
    }

    /* renamed from: d */
    private static URI m24360d(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new C9114bv(e);
        }
    }

    /* renamed from: e */
    public final URL mo57861e() {
        URI uri = (URI) mo57848a("BASE_URI");
        if (uri != null) {
            return uri.resolve(m24360d(mo57873m())).toURL();
        }
        return new URL(mo57873m());
    }
}
