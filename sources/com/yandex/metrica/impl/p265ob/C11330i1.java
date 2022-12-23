package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.yandex.metrica.impl.p265ob.C10091A0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i1 */
public final class C11330i1 {

    /* renamed from: a */
    private final JSONObject f27090a = new JSONObject();

    /* renamed from: b */
    private final Context f27091b;

    /* renamed from: c */
    private final C10091A0 f27092c;

    public C11330i1(Context context, C10091A0 a0) {
        this.f27091b = context;
        this.f27092c = a0;
    }

    /* renamed from: a */
    static <T> T m29180a(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t);
        }
        return jSONObject.get(str);
    }

    /* renamed from: d */
    private void m29181d() throws JSONException {
        if (C10796U2.m27890a(24)) {
            JSONObject jSONObject = (JSONObject) m29180a(this.f27090a, "dfid", new JSONObject());
            jSONObject.putOpt("wids", (Integer) C10796U2.m27875a(new C10825V2(1), this.f27091b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
            jSONObject.putOpt("widl", (Integer) C10796U2.m27875a(new C10825V2(2), this.f27091b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11330i1 mo63027b() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) m29180a(this.f27090a, "dfid", new JSONObject());
        if (C10796U2.m27890a(21)) {
            jSONArray = new JSONArray(Build.SUPPORTED_ABIS);
        } else {
            ArrayList arrayList = new ArrayList();
            String str = Build.CPU_ABI;
            if (!"unknown".equals(str)) {
                arrayList.add(str);
            }
            String str2 = Build.CPU_ABI2;
            if (!"unknown".equals(str2)) {
                arrayList.add(str2);
            }
            jSONArray = new JSONArray(arrayList);
        }
        jSONObject.put("cpu_abis", jSONArray);
        return this;
    }

    /* renamed from: c */
    public C11330i1 mo63028c() {
        try {
            JSONObject jSONObject = (JSONObject) m29180a(this.f27090a, "dfid", new JSONObject());
            C10091A0.C10092a a = this.f27092c.mo61040a();
            jSONObject.put("tds", a.f24300a);
            jSONObject.put("fds", a.f24301b);
            ((JSONObject) m29180a(this.f27090a, "dfid", new JSONObject())).put("boot_time", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            m29181d();
            ((JSONObject) m29180a(this.f27090a, "dfid", new JSONObject())).put("lc", C11993ym.m30982b((List<?>) C11616p1.m29998a(this.f27091b).mo63447a()));
        } catch (Throwable unused) {
        }
        try {
            Object obj = Class.forName("kotlin.KotlinVersion").getDeclaredField("CURRENT").get((Object) null);
            int intValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue3 = ((Integer) obj.getClass().getDeclaredMethod("getPatch", new Class[0]).invoke(obj, new Object[0])).intValue();
            ((JSONObject) m29180a(this.f27090a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", intValue).put("minor", intValue2).put("patch", intValue3));
        } catch (ClassNotFoundException unused2) {
        }
        return this;
    }

    public String toString() {
        return this.f27090a.toString();
    }

    /* renamed from: a */
    public String mo63026a() {
        return this.f27090a.toString();
    }
}
