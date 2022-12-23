package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Xh */
public class C10929Xh {

    /* renamed from: a */
    private final C10691R2 f26287a;

    /* renamed from: b */
    private final C10889Wh f26288b;

    public C10929Xh(C10889Wh wh) {
        this(wh, new C10691R2());
    }

    /* renamed from: a */
    public long mo62485a(int i) {
        return m28212a().optLong(String.valueOf(i));
    }

    C10929Xh(C10889Wh wh, C10691R2 r2) {
        this.f26288b = wh;
        this.f26287a = r2;
    }

    /* renamed from: a */
    public void mo62486a(int i, long j) {
        JSONObject a = m28212a();
        try {
            a.put(String.valueOf(i), j);
        } catch (Throwable unused) {
        }
        this.f26288b.mo62454a(a.toString());
    }

    /* renamed from: a */
    public void mo62487a(long j) {
        ArrayList arrayList = new ArrayList();
        JSONObject a = m28212a();
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            long optLong = a.optLong(next);
            C10691R2 r2 = this.f26287a;
            if (r2.mo62107b(optLong, j, "last socket open on " + next)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a.remove((String) it.next());
            }
            this.f26288b.mo62454a(a.toString());
        }
    }

    /* renamed from: a */
    private JSONObject m28212a() {
        JSONObject jSONObject = new JSONObject();
        String a = this.f26288b.mo62453a();
        if (TextUtils.isEmpty(a)) {
            return jSONObject;
        }
        try {
            return new JSONObject(a);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
