package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C11060b2;
import com.yandex.metrica.impl.p265ob.C11493lg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Lh */
public class C10463Lh {

    /* renamed from: a */
    private static final Map<C11493lg.C11498e.C11500b.C11501a, String> f25128a = Collections.unmodifiableMap(new C10464a());

    /* renamed from: b */
    private static final Map<C11060b2.C11064d, String> f25129b = Collections.unmodifiableMap(new C10465b());

    /* renamed from: com.yandex.metrica.impl.ob.Lh$a */
    class C10464a extends HashMap<C11493lg.C11498e.C11500b.C11501a, String> {
        C10464a() {
            put(C11493lg.C11498e.C11500b.C11501a.COMPLETE, "complete");
            put(C11493lg.C11498e.C11500b.C11501a.ERROR, "error");
            put(C11493lg.C11498e.C11500b.C11501a.OFFLINE, "offline");
            put(C11493lg.C11498e.C11500b.C11501a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Lh$b */
    class C10465b extends HashMap<C11060b2.C11064d, String> {
        C10465b() {
            put(C11060b2.C11064d.WIFI, TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
            put(C11060b2.C11064d.CELL, "cell");
            put(C11060b2.C11064d.OFFLINE, "offline");
            put(C11060b2.C11064d.UNDEFINED, "undefined");
        }
    }

    /* renamed from: a */
    public String mo61736a(C11493lg.C11498e.C11500b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("id", bVar.mo63302d().f27680a);
            jSONObject.putOpt("url", bVar.mo63302d().f27681b);
            jSONObject.putOpt("status", f25128a.get(bVar.mo63306h()));
            jSONObject.putOpt("code", bVar.mo63304f());
            if (!C10796U2.m27893a(bVar.mo63303e())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.mo63303e(), 0));
            } else if (!C10796U2.m27893a(bVar.mo63300b())) {
                jSONObject.putOpt("body", Base64.encodeToString(bVar.mo63300b(), 0));
            }
            jSONObject.putOpt("headers", m26843a(bVar.mo63305g()));
            Throwable c = bVar.mo63301c();
            if (c != null) {
                str = c.toString() + "\n" + Log.getStackTraceString(c);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", f25129b.get(bVar.mo63294a()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    /* renamed from: a */
    private JSONObject m26843a(Map<String, List<String>> map) throws JSONException {
        if (C10796U2.m27897b((Map) map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (!C10796U2.m27896b((Collection) next.getValue())) {
                List<String> list = (List) next.getValue();
                if (list.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i = 0; i < 10; i++) {
                        arrayList.add(list.get(i));
                    }
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(C10796U2.m27879a(str2, 100));
                    }
                }
                jSONObject.putOpt(str, TextUtils.join(",", arrayList2));
            }
        }
        return jSONObject;
    }
}
