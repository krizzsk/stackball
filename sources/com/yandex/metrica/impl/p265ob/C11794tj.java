package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11993ym;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.tj */
public class C11794tj {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63747a(C11885vj vjVar, C11993ym.C11994a aVar) {
        JSONObject optJSONObject;
        if (vjVar.mo63924O() && (optJSONObject = aVar.optJSONObject("socket")) != null) {
            C11428kg.C11453p pVar = new C11428kg.C11453p();
            long optLong = optJSONObject.optLong("seconds_to_live");
            long optLong2 = optJSONObject.optLong("first_delay_seconds", pVar.f27551f);
            int optInt = optJSONObject.optInt("launch_delay_seconds", pVar.f27552g);
            long optLong3 = optJSONObject.optLong("open_event_interval_seconds", pVar.f27553h);
            long optLong4 = optJSONObject.optLong("min_failed_request_interval_seconds", pVar.f27554i);
            long optLong5 = optJSONObject.optLong("min_successful_request_interval_seconds", pVar.f27555j);
            long optLong6 = optJSONObject.optLong("open_retry_interval_seconds", pVar.f27556k);
            String optString = optJSONObject.optString("token");
            JSONArray optJSONArray = optJSONObject.optJSONArray("ports_https");
            JSONArray jSONArray = new JSONArray();
            if (optJSONArray == null) {
                optJSONArray = jSONArray;
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("ports_http");
            JSONArray jSONArray2 = new JSONArray();
            if (optJSONArray2 == null) {
                optJSONArray2 = jSONArray2;
            }
            boolean z = optJSONArray.length() > 0 || optJSONArray2.length() > 0;
            if (optLong > 0 && !TextUtils.isEmpty(optString) && z) {
                List<Integer> a = m30454a(optJSONArray);
                List<Integer> a2 = m30454a(optJSONArray2);
                if (!((ArrayList) a).isEmpty() || !((ArrayList) a2).isEmpty()) {
                    vjVar.mo63930a(new C10226Ei(optLong, optString, a, a2, optLong2, optInt, optLong3, optLong4, optLong5, optLong6));
                }
            }
        }
    }

    /* renamed from: a */
    private List<Integer> m30454a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            int optInt = jSONArray.optInt(i);
            if (optInt != 0) {
                arrayList.add(Integer.valueOf(optInt));
            }
        }
        return arrayList;
    }
}
