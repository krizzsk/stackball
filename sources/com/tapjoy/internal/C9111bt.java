package com.tapjoy.internal;

import com.facebook.internal.security.CertificateUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bt */
public final class C9111bt implements Closeable {

    /* renamed from: a */
    final Writer f22428a;

    /* renamed from: b */
    private final List f22429b;

    /* renamed from: c */
    private String f22430c;

    /* renamed from: d */
    private String f22431d = CertificateUtil.DELIMITER;

    /* renamed from: e */
    private boolean f22432e;

    public C9111bt(Writer writer) {
        ArrayList arrayList = new ArrayList();
        this.f22429b = arrayList;
        arrayList.add(C9108bq.EMPTY_DOCUMENT);
        if (writer != null) {
            this.f22428a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    public final C9111bt mo57881a() {
        return m24426a(C9108bq.EMPTY_ARRAY, "[");
    }

    /* renamed from: b */
    public final C9111bt mo57889b() {
        return m24425a(C9108bq.EMPTY_ARRAY, C9108bq.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    public final C9111bt mo57891c() {
        return m24426a(C9108bq.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    public final C9111bt mo57893d() {
        return m24425a(C9108bq.EMPTY_OBJECT, C9108bq.NONEMPTY_OBJECT, "}");
    }

    /* renamed from: a */
    private C9111bt m24426a(C9108bq bqVar, String str) {
        m24429a(true);
        this.f22429b.add(bqVar);
        this.f22428a.write(str);
        return this;
    }

    /* renamed from: a */
    private C9111bt m24425a(C9108bq bqVar, C9108bq bqVar2, String str) {
        C9108bq e = m24431e();
        if (e == bqVar2 || e == bqVar) {
            List list = this.f22429b;
            list.remove(list.size() - 1);
            if (e == bqVar2) {
                m24433g();
            }
            this.f22428a.write(str);
            return this;
        }
        throw new IllegalStateException("Nesting problem: " + this.f22429b);
    }

    /* renamed from: e */
    private C9108bq m24431e() {
        List list = this.f22429b;
        return (C9108bq) list.get(list.size() - 1);
    }

    /* renamed from: a */
    private void m24428a(C9108bq bqVar) {
        List list = this.f22429b;
        list.set(list.size() - 1, bqVar);
    }

    /* renamed from: b */
    public final C9111bt mo57890b(String str) {
        if (str == null) {
            return m24432f();
        }
        m24429a(false);
        m24430c(str);
        return this;
    }

    /* renamed from: f */
    private C9111bt m24432f() {
        m24429a(false);
        this.f22428a.write("null");
        return this;
    }

    /* renamed from: a */
    public final C9111bt mo57882a(long j) {
        m24429a(false);
        this.f22428a.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public final C9111bt mo57884a(Number number) {
        if (number == null) {
            return m24432f();
        }
        String obj = number.toString();
        if (this.f22432e || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m24429a(false);
            this.f22428a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void close() {
        this.f22428a.close();
        if (m24431e() != C9108bq.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    /* renamed from: c */
    private void m24430c(String str) {
        this.f22428a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                this.f22428a.write("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '\\') {
                    if (charAt != 8232 && charAt != 8233) {
                        switch (charAt) {
                            case 8:
                                this.f22428a.write("\\b");
                                continue;
                            case 9:
                                this.f22428a.write("\\t");
                                continue;
                            case 10:
                                this.f22428a.write("\\n");
                                continue;
                            default:
                                if (charAt <= 31) {
                                    this.f22428a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    continue;
                                }
                                break;
                        }
                    } else {
                        this.f22428a.write(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    }
                } else {
                    this.f22428a.write(92);
                }
                this.f22428a.write(charAt);
            } else {
                this.f22428a.write("\\r");
            }
        }
        this.f22428a.write("\"");
    }

    /* renamed from: g */
    private void m24433g() {
        if (this.f22430c != null) {
            this.f22428a.write("\n");
            for (int i = 1; i < this.f22429b.size(); i++) {
                this.f22428a.write(this.f22430c);
            }
        }
    }

    /* renamed from: com.tapjoy.internal.bt$1 */
    static /* synthetic */ class C91121 {

        /* renamed from: a */
        static final /* synthetic */ int[] f22433a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bq[] r0 = com.tapjoy.internal.C9108bq.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22433a = r0
                com.tapjoy.internal.bq r1 = com.tapjoy.internal.C9108bq.EMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22433a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bq r1 = com.tapjoy.internal.C9108bq.EMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22433a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bq r1 = com.tapjoy.internal.C9108bq.NONEMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22433a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bq r1 = com.tapjoy.internal.C9108bq.DANGLING_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22433a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bq r1 = com.tapjoy.internal.C9108bq.NONEMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9111bt.C91121.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m24429a(boolean z) {
        int i = C91121.f22433a[m24431e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                m24428a(C9108bq.NONEMPTY_ARRAY);
                m24433g();
            } else if (i == 3) {
                this.f22428a.append(',');
                m24433g();
            } else if (i == 4) {
                this.f22428a.append(this.f22431d);
                m24428a(C9108bq.NONEMPTY_OBJECT);
            } else if (i != 5) {
                throw new IllegalStateException("Nesting problem: " + this.f22429b);
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (this.f22432e || z) {
            m24428a(C9108bq.NONEMPTY_DOCUMENT);
        } else {
            throw new IllegalStateException("JSON must start with an array or an object.");
        }
    }

    /* renamed from: a */
    public final C9111bt mo57885a(Object obj) {
        if (obj == null) {
            return m24432f();
        }
        if (obj instanceof C9109br) {
            if (this.f22429b.size() == this.f22429b.size()) {
                return this;
            }
            throw new IllegalStateException(obj.getClass().getName() + ".writeToJson(JsonWriter) wrote incomplete value");
        } else if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            m24429a(false);
            this.f22428a.write(booleanValue ? "true" : "false");
            return this;
        } else if (obj instanceof Number) {
            if (obj instanceof Long) {
                return mo57882a(((Number) obj).longValue());
            }
            if (!(obj instanceof Double)) {
                return mo57884a((Number) obj);
            }
            double doubleValue = ((Number) obj).doubleValue();
            if (this.f22432e || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                m24429a(false);
                this.f22428a.append(Double.toString(doubleValue));
                return this;
            }
            throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
        } else if (obj instanceof String) {
            return mo57890b((String) obj);
        } else {
            if (obj instanceof C9099bl) {
                return mo57883a((C9099bl) obj);
            }
            if (obj instanceof Collection) {
                return mo57887a((Collection) obj);
            }
            if (obj instanceof Map) {
                return mo57888a((Map) obj);
            }
            if (obj instanceof Date) {
                Date date = (Date) obj;
                if (date == null) {
                    return m24432f();
                }
                return mo57890b(C9504w.m25547a(date));
            } else if (obj instanceof Object[]) {
                return m24427a((Object[]) obj);
            } else {
                throw new IllegalArgumentException("Unknown type: " + obj.getClass().getName());
            }
        }
    }

    /* renamed from: a */
    private C9111bt m24427a(Object[] objArr) {
        if (objArr == null) {
            return m24432f();
        }
        mo57881a();
        for (Object a : objArr) {
            mo57885a(a);
        }
        mo57889b();
        return this;
    }

    /* renamed from: a */
    public final C9111bt mo57883a(C9099bl blVar) {
        m24429a(false);
        blVar.mo57841a(this.f22428a);
        return this;
    }

    /* renamed from: a */
    public final C9111bt mo57887a(Collection collection) {
        if (collection == null) {
            return m24432f();
        }
        mo57881a();
        for (Object a : collection) {
            mo57885a(a);
        }
        mo57889b();
        return this;
    }

    /* renamed from: a */
    public final C9111bt mo57886a(String str) {
        if (str != null) {
            C9108bq e = m24431e();
            if (e == C9108bq.NONEMPTY_OBJECT) {
                this.f22428a.write(44);
            } else if (e != C9108bq.EMPTY_OBJECT) {
                throw new IllegalStateException("Nesting problem: " + this.f22429b);
            }
            m24433g();
            m24428a(C9108bq.DANGLING_NAME);
            m24430c(str);
            return this;
        }
        throw new NullPointerException("name == null");
    }

    /* renamed from: a */
    public final C9111bt mo57888a(Map map) {
        if (map == null) {
            return m24432f();
        }
        mo57891c();
        for (Map.Entry entry : map.entrySet()) {
            mo57886a(String.valueOf(entry.getKey()));
            mo57885a(entry.getValue());
        }
        mo57893d();
        return this;
    }
}
