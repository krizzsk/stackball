package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C9314gf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.fm */
public class C9277fm extends C9285fq {

    /* renamed from: c */
    private static final String f22941c = C9277fm.class.getSimpleName();

    public C9277fm(String str, String str2) {
        super(str, str2, "ad");
    }

    /* renamed from: a */
    public final C9314gf.C9316a mo58135a(String str, JSONObject jSONObject) {
        return mo58147a(str, m24884a(jSONObject), m24885b(jSONObject));
    }

    /* renamed from: b */
    public final C9314gf.C9316a mo58136b(String str, JSONObject jSONObject) {
        return mo58150b(str, m24884a(jSONObject), m24885b(jSONObject));
    }

    /* renamed from: a */
    public static Map m24884a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                String str = f22941c;
                TapjoyLog.m24273d(str, "Unable to getAdUnitDimensions. Invalid params: " + e);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Map m24885b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject2.getLong(next)));
                }
            } catch (JSONException e) {
                String str = f22941c;
                TapjoyLog.m24273d(str, "Unable to getAdUnitValues. Invalid params: " + e);
            }
        }
        return hashMap;
    }
}
