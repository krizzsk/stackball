package com.fyber.inneractive.sdk.config.p034a.p035a;

import com.fyber.inneractive.sdk.config.p034a.C2750b;
import com.fyber.inneractive.sdk.config.p034a.C2759k;
import com.fyber.inneractive.sdk.config.p034a.C2764p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.a.a.d */
public abstract class C2744d extends C2764p {

    /* renamed from: a */
    public String f6469a;

    /* renamed from: b */
    public List<C2750b> f6470b = new ArrayList();

    /* renamed from: d */
    public Map<String, C2759k> f6471d = new HashMap();

    /* renamed from: c */
    public abstract C2744d mo17979c();

    public C2744d(String str) {
        this.f6469a = str;
    }

    /* renamed from: b */
    public final String mo17985b(String str) {
        return mo17982a(str, (String) null);
    }

    /* renamed from: a */
    public final int mo17981a(String str, int i) {
        Integer c = mo17986c(str);
        return c != null ? c.intValue() : i;
    }

    /* renamed from: a */
    public final double mo17980a(String str, double d) {
        Double e = mo17988e(str);
        return e != null ? e.doubleValue() : d;
    }

    /* renamed from: a */
    public final boolean mo17984a(String str, boolean z) {
        Boolean d = mo17987d(str);
        return d != null ? d.booleanValue() : z;
    }

    public String toString() {
        return String.format("id: %s, params: %s exp: %s", new Object[]{this.f6469a, this.f6506c, this.f6470b});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17983a(C2744d dVar) {
        dVar.f6469a = this.f6469a;
        dVar.f6506c = this.f6506c;
        dVar.f6470b = new ArrayList(this.f6470b);
        dVar.f6471d = new HashMap(this.f6471d);
    }

    /* renamed from: a */
    public final String mo17982a(String str, String str2) {
        String str3;
        Iterator<String> it = this.f6471d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = this.f6471d.get(it.next()).mo17985b(str);
            if (str3 != null) {
                break;
            }
        }
        return str3 == null ? super.mo17982a(str, str2) : str3;
    }

    /* renamed from: c */
    public final Integer mo17986c(String str) {
        Integer num;
        Iterator<String> it = this.f6471d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = this.f6471d.get(it.next()).mo17986c(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.mo17986c(str) : num;
    }

    /* renamed from: e */
    public final Double mo17988e(String str) {
        Double d;
        Iterator<String> it = this.f6471d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d = null;
                break;
            }
            d = this.f6471d.get(it.next()).mo17988e(str);
            if (d != null) {
                break;
            }
        }
        return d == null ? super.mo17988e(str) : d;
    }

    /* renamed from: d */
    public final Boolean mo17987d(String str) {
        Boolean bool;
        Iterator<String> it = this.f6471d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = this.f6471d.get(it.next()).mo17987d(str);
            if (bool != null) {
                break;
            }
        }
        return bool == null ? super.mo17987d(str) : bool;
    }
}
