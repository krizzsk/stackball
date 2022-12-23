package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.k */
public final class C5727k {

    /* renamed from: a */
    public ArrayList<C5728l> f13759a = new ArrayList<>();

    /* renamed from: b */
    public C5728l f13760b;

    /* renamed from: c */
    public C5720d f13761c;

    /* renamed from: d */
    public JSONObject f13762d;

    public C5727k(C5720d dVar) {
        this.f13761c = dVar;
    }

    /* renamed from: a */
    public final C5728l mo41977a() {
        Iterator<C5728l> it = this.f13759a.iterator();
        while (it.hasNext()) {
            C5728l next = it.next();
            if (next.f13765c) {
                return next;
            }
        }
        return this.f13760b;
    }

    /* renamed from: a */
    public final C5728l mo41978a(String str) {
        Iterator<C5728l> it = this.f13759a.iterator();
        while (it.hasNext()) {
            C5728l next = it.next();
            if (next.f13764b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo41979b() {
        JSONObject jSONObject = this.f13762d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f13762d.optString("adapterName");
    }
}
