package com.mbridge.msdk.videocommon.p237b;

import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.b */
/* compiled from: AdUnitInfo */
public final class C7169b {

    /* renamed from: a */
    private int f17886a;

    /* renamed from: b */
    private int f17887b;

    /* renamed from: c */
    private C7168a f17888c;

    public C7169b(int i, int i2, C7168a aVar) {
        this.f17886a = i;
        this.f17887b = i2;
        this.f17888c = aVar;
    }

    /* renamed from: a */
    public final int mo49080a() {
        return this.f17886a;
    }

    /* renamed from: b */
    public final int mo49081b() {
        return this.f17887b;
    }

    /* renamed from: a */
    public static List<C7169b> m18095a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                    arrayList.add(new C7169b(optInt, optInt2, optJSONObject2 != null ? C7168a.m18094a(optJSONObject2) : null));
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
