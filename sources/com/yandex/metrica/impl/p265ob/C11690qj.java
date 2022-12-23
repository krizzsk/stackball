package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10140Bi;
import com.yandex.metrica.impl.p265ob.C11993ym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.qj */
public class C11690qj {

    /* renamed from: a */
    private static final Map<String, C10140Bi.C10141a> f28028a = Collections.unmodifiableMap(new C11691a());

    /* renamed from: com.yandex.metrica.impl.ob.qj$a */
    class C11691a extends HashMap<String, C10140Bi.C10141a> {
        C11691a() {
            put(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI, C10140Bi.C10141a.WIFI);
            put("cell", C10140Bi.C10141a.CELL);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63554a(C11885vj vjVar, C11993ym.C11994a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("requests");
        if (optJSONObject != null && optJSONObject.has("list") && (optJSONArray = optJSONObject.optJSONArray("list")) != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(m30119a(optJSONArray.getJSONObject(i)));
                } catch (Throwable unused) {
                }
            }
            if (!arrayList.isEmpty()) {
                vjVar.mo63970g((List<C10140Bi>) arrayList);
            }
        }
    }

    /* renamed from: a */
    private C10140Bi m30119a(JSONObject jSONObject) throws JSONException {
        int i;
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> keys = jSONObject2.keys();
        while (true) {
            i = 0;
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            while (i < jSONArray.length()) {
                arrayList.add(new Pair(next, jSONArray.getString(i)));
                i++;
            }
        }
        String e = C11993ym.m30992e(jSONObject, "id");
        String e2 = C11993ym.m30992e(jSONObject, "url");
        String e3 = C11993ym.m30992e(jSONObject, "method");
        Long valueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i < jSONArray2.length()) {
                arrayList2.add(f28028a.get(jSONArray2.getString(i)));
                i++;
            }
        }
        return new C10140Bi(e, e2, e3, arrayList, valueOf, arrayList2);
    }
}
