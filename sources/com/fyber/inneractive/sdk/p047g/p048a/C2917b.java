package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.p051j.C3022i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.g.a.b */
public final class C2917b implements C3022i {

    /* renamed from: a */
    public C2922g f6949a;

    /* renamed from: b */
    public C2923h f6950b;

    /* renamed from: c */
    public int f6951c;

    /* renamed from: d */
    public int f6952d;

    /* renamed from: e */
    public String f6953e;

    /* renamed from: f */
    public String f6954f;

    /* renamed from: g */
    Map<C2933r, List<String>> f6955g = new HashMap();

    public C2917b(C2922g gVar, int i, int i2) {
        this.f6949a = gVar;
        this.f6951c = i;
        this.f6952d = i2;
    }

    /* renamed from: a */
    public final void mo18377a(C2933r rVar, String str) {
        List list = this.f6955g.get(rVar);
        if (list == null) {
            list = new ArrayList();
            this.f6955g.put(rVar, list);
        }
        list.add(str);
    }

    /* renamed from: a */
    public final List<String> mo18376a(C2933r rVar) {
        Map<C2933r, List<String>> map;
        if (rVar == null || (map = this.f6955g) == null) {
            return null;
        }
        return map.get(rVar);
    }

    /* renamed from: a */
    public final JSONObject mo18379a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f6951c);
            jSONObject.put("h", this.f6952d);
            jSONObject.put("type", this.f6949a.toString());
            if (this.f6950b != null) {
                str = this.f6950b.f6992e;
            } else {
                str = "none";
            }
            jSONObject.put(StaticResource.CREATIVE_TYPE, str);
            jSONObject.put("content", this.f6953e);
        } catch (JSONException e) {
            IAlog.m9034b("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.f6951c);
        sb.append(" h:");
        sb.append(this.f6952d);
        sb.append(" type:");
        sb.append(this.f6949a.toString());
        sb.append(" creativeType: ");
        C2923h hVar = this.f6950b;
        if (hVar != null) {
            str = hVar.f6992e;
        } else {
            str = "none";
        }
        sb.append(str);
        sb.append(" ctr:");
        sb.append(this.f6954f);
        sb.append(" events:");
        sb.append(this.f6955g);
        return sb.toString();
    }
}
