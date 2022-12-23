package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.C1837b;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.b0 */
public class C1899b0 {
    /* renamed from: a */
    private static C1837b m4468a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return new C1837b(TJAdUnitConstants.String.HTML, str.substring(str.lastIndexOf(47) + 1), str);
    }

    /* renamed from: b */
    public static C1908e0 m4472b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return new C1908e0();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject2.optJSONArray("seatbid");
        C1905d0 d0Var = new C1905d0();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    String optString = jSONObject3.optString("seat");
                    JSONArray optJSONArray2 = jSONObject3.optJSONArray(BidResponsed.KEY_BID_ID);
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                            if (jSONObject4 != null) {
                                JSONObject optJSONObject = jSONObject4.optJSONObject("ext").optJSONObject("bidder");
                                if (optJSONObject == null) {
                                    optJSONObject = jSONObject4.getJSONObject("ext");
                                }
                                if (optJSONObject != null) {
                                    d0Var = m4470a(optJSONObject);
                                    C1837b a = m4468a(d0Var.mo14576e());
                                    if (a != null) {
                                        arrayList.add(a);
                                    }
                                }
                                arrayList2.add(m4469a(jSONObject4, d0Var));
                            }
                        }
                    }
                    arrayList3.add(new C1911f0(optString, arrayList2));
                }
            }
        }
        return m4471a(jSONObject2, arrayList3, arrayList);
    }

    /* renamed from: a */
    private static C1905d0 m4470a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("imptrackers");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i, ""));
            }
        }
        return new C1905d0(jSONObject.optString("crtype", ""), jSONObject.optString(Creative.AD_ID, ""), jSONObject.optString("cgn", ""), jSONObject.getString("template"), arrayList);
    }

    /* renamed from: a */
    private static C1902c0 m4469a(JSONObject jSONObject, C1905d0 d0Var) throws JSONException {
        return new C1902c0(jSONObject.getString("id"), jSONObject.getString("impid"), Double.valueOf(jSONObject.getDouble("price")), jSONObject.optString("burl", ""), jSONObject.optString("crid", ""), jSONObject.optString("adm", ""), d0Var);
    }

    /* renamed from: a */
    private static C1908e0 m4471a(JSONObject jSONObject, ArrayList<C1911f0> arrayList, ArrayList<C1837b> arrayList2) throws JSONException {
        return new C1908e0(jSONObject.getString("id"), jSONObject.optString("nbr", ""), jSONObject.optString(BidResponsed.KEY_CUR, "USD"), jSONObject.optString("bidid", ""), arrayList, arrayList2);
    }
}
