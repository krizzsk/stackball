package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.H9 */
public abstract class C10333H9 {

    /* renamed from: a */
    private final C12019z8 f24822a;

    /* renamed from: b */
    private final String f24823b;

    public C10333H9(C12019z8 z8Var) {
        this(z8Var, (String) null);
    }

    /* renamed from: a */
    public long mo61443a(String str, long j) {
        return this.f24822a.mo62112a(str, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C10333H9> T mo61449b(String str, String str2) {
        synchronized (this) {
            this.f24822a.mo62113a(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11984ye mo61453c(String str) {
        return new C11984ye(str, this.f24823b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo61455d(String str) {
        return this.f24822a.mo62121b(str, (String) null);
    }

    /* renamed from: e */
    public <T extends C10333H9> T mo61457e(String str) {
        synchronized (this) {
            this.f24822a.mo62118b(str);
        }
        return this;
    }

    public C10333H9(C12019z8 z8Var, String str) {
        this.f24822a = z8Var;
        this.f24823b = str;
    }

    /* renamed from: a */
    public int mo61442a(String str, int i) {
        return this.f24822a.mo62111a(str, i);
    }

    /* renamed from: d */
    public Set<String> mo61456d() {
        return this.f24822a.mo62115a();
    }

    /* renamed from: a */
    public String mo61444a(String str, String str2) {
        return this.f24822a.mo62121b(str, str2);
    }

    /* renamed from: a */
    public boolean mo61446a(String str, boolean z) {
        return this.f24822a.mo62123b(str, z);
    }

    /* renamed from: c */
    public void mo61454c() {
        synchronized (this) {
            this.f24822a.mo62122b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<String> mo61445a(String str, List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String b = this.f24822a.mo62121b(str, (String) null);
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONArray jSONArray = new JSONArray(b);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: b */
    public <T extends C10333H9> T mo61448b(String str, long j) {
        synchronized (this) {
            this.f24822a.mo62120b(str, j);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C10333H9> T mo61447b(String str, int i) {
        synchronized (this) {
            this.f24822a.mo62119b(str, i);
        }
        return this;
    }

    /* renamed from: b */
    public <T extends C10333H9> T mo61451b(String str, boolean z) {
        synchronized (this) {
            this.f24822a.mo62114a(str, z);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C10333H9> T mo61450b(String str, List<String> list) {
        String str2;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        try {
            JSONArray jSONArray = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f24822a.mo62113a(str, str2);
        return this;
    }

    /* renamed from: b */
    public boolean mo61452b(String str) {
        return this.f24822a.mo62117a(str);
    }
}
