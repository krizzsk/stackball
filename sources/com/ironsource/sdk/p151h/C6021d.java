package com.ironsource.sdk.p151h;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.d */
public final class C6021d {

    /* renamed from: a */
    private String f14787a;

    public C6021d(String str) {
        this.f14787a = str;
    }

    /* renamed from: a */
    private boolean m14861a(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m14862b().getPath()) != 0;
    }

    /* renamed from: b */
    private C6020c m14862b() {
        C6020c cVar = new C6020c(this.f14787a, "metadata.json");
        if (!cVar.exists()) {
            IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), cVar.getPath());
        }
        return cVar;
    }

    /* renamed from: a */
    public final synchronized JSONObject mo42570a() {
        return new JSONObject(IronSourceStorageUtils.readFile(m14862b()));
    }

    /* renamed from: a */
    public final synchronized boolean mo42571a(String str) {
        JSONObject a = mo42570a();
        if (!a.has(str)) {
            return true;
        }
        a.remove(str);
        return m14861a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo42572a(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo42570a();
        a.put(str, jSONObject);
        return m14861a(a);
    }

    /* renamed from: a */
    public final boolean mo42573a(ArrayList<C6020c> arrayList) {
        Iterator<C6020c> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!mo42571a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo42574b(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo42570a();
        JSONObject optJSONObject = a.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            a.putOpt(str, jSONObject);
        }
        return m14861a(a);
    }
}
