package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.t */
public class C1560t {

    /* renamed from: a */
    public static final C1560t f3799a = new C1560t();

    /* renamed from: b */
    protected String f3800b;

    /* renamed from: c */
    protected final List<C1560t> f3801c;

    /* renamed from: d */
    private final C1560t f3802d;

    /* renamed from: e */
    private final String f3803e;

    /* renamed from: f */
    private final Map<String, String> f3804f;

    private C1560t() {
        this.f3802d = null;
        this.f3803e = "";
        this.f3804f = Collections.emptyMap();
        this.f3800b = "";
        this.f3801c = Collections.emptyList();
    }

    public C1560t(String str, Map<String, String> map, C1560t tVar) {
        this.f3802d = tVar;
        this.f3803e = str;
        this.f3804f = Collections.unmodifiableMap(map);
        this.f3801c = new ArrayList();
    }

    /* renamed from: a */
    public String mo13356a() {
        return this.f3803e;
    }

    /* renamed from: a */
    public List<C1560t> mo13357a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f3801c.size());
            for (C1560t next : this.f3801c) {
                if (str.equalsIgnoreCase(next.mo13356a())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public C1560t mo13358b(String str) {
        if (str != null) {
            for (C1560t next : this.f3801c) {
                if (str.equalsIgnoreCase(next.mo13356a())) {
                    return next;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public Map<String, String> mo13359b() {
        return this.f3804f;
    }

    /* renamed from: c */
    public C1560t mo13360c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        } else if (this.f3801c.size() <= 0) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                C1560t tVar = (C1560t) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(tVar.mo13356a())) {
                    return tVar;
                }
                arrayList.addAll(tVar.mo13362d());
            }
            return null;
        }
    }

    /* renamed from: c */
    public String mo13361c() {
        return this.f3800b;
    }

    /* renamed from: d */
    public List<C1560t> mo13362d() {
        return Collections.unmodifiableList(this.f3801c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f3803e + '\'' + ", text='" + this.f3800b + '\'' + ", attributes=" + this.f3804f + '}';
    }
}
