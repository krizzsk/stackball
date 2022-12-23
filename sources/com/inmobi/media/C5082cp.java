package com.inmobi.media;

import com.google.android.exoplayer2.util.MimeTypes;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cp */
/* compiled from: VastCompanionAd */
public class C5082cp {

    /* renamed from: f */
    static final ArrayList<String> f11629f = new ArrayList<>(Arrays.asList(new String[]{MimeTypes.IMAGE_JPEG, "image/png"}));
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f11630h = C5082cp.class.getSimpleName();

    /* renamed from: a */
    int f11631a;

    /* renamed from: b */
    int f11632b;

    /* renamed from: c */
    List<C5083a> f11633c = new ArrayList();

    /* renamed from: d */
    public List<C5030br> f11634d = new ArrayList();

    /* renamed from: e */
    public String f11635e = null;

    /* renamed from: g */
    public boolean f11636g;

    /* renamed from: i */
    private String f11637i;

    /* renamed from: com.inmobi.media.cp$a */
    /* compiled from: VastCompanionAd */
    public static final class C5083a {

        /* renamed from: a */
        public byte f11638a;

        /* renamed from: b */
        public String f11639b;

        C5083a(byte b, String str) {
            this.f11638a = b;
            this.f11639b = str;
        }

        public final String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                byte b = this.f11638a;
                jSONObject.put("type", b != 1 ? b != 2 ? b != 3 ? "unknown" : "iframe" : TJAdUnitConstants.String.HTML : "static");
                jSONObject.put("content", this.f11639b);
                return jSONObject.toString();
            } catch (JSONException e) {
                String unused = C5082cp.f11630h;
                C5275fn.m12068a().mo40590a(new C5308gk(e));
                return "";
            }
        }
    }

    public C5082cp(int i, int i2, String str) {
        this.f11637i = str;
        this.f11631a = i;
        this.f11632b = i2;
    }

    /* renamed from: a */
    public final List<C5083a> mo40343a(int i) {
        ArrayList arrayList = new ArrayList();
        for (C5083a next : this.f11633c) {
            if (next.f11638a == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo40346a(C5083a aVar) {
        this.f11633c.add(aVar);
    }

    /* renamed from: a */
    public final List<C5030br> mo40344a(String str) {
        ArrayList arrayList = new ArrayList();
        for (C5030br next : this.f11634d) {
            if (next.f11469d.equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo40345a(C5030br brVar) {
        this.f11634d.add(brVar);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11637i != null) {
                jSONObject.put("id", this.f11637i);
            }
            jSONObject.put("width", this.f11631a);
            jSONObject.put("height", this.f11632b);
            jSONObject.put("clickThroughUrl", this.f11635e);
            JSONArray jSONArray = new JSONArray();
            for (C5083a aVar : this.f11633c) {
                jSONArray.put(aVar.toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (C5030br brVar : this.f11634d) {
                jSONArray2.put(brVar.toString());
            }
            jSONObject.put("trackers", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }
}
