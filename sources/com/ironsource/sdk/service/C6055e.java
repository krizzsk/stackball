package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.Omid;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5527g;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.e */
public final class C6055e {

    /* renamed from: b */
    private static C6055e f14827b;

    /* renamed from: a */
    private JSONObject f14828a = new JSONObject();

    private C6055e() {
    }

    /* renamed from: a */
    public static synchronized C6055e m14934a() {
        C6055e eVar;
        synchronized (C6055e.class) {
            if (f14827b == null) {
                f14827b = new C6055e();
            }
            eVar = f14827b;
        }
        return eVar;
    }

    /* renamed from: a */
    private void m14935a(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo42603a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(C5527g.m13135a(activity)));
            }
            mo42603a("appOrientation", SDKUtils.translateRequestedOrientation(C5527g.m13164n(activity)));
        }
    }

    /* renamed from: a */
    private void m14936a(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String next : map.keySet()) {
            mo42603a(next, SDKUtils.encodeString(map.get(next)));
        }
    }

    /* renamed from: c */
    private static void m14937c() {
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", Omid.getVersion());
        hashMap.put("omidPartnerVersion", "7");
        f14827b.m14936a((Map<String, String>) hashMap);
    }

    /* renamed from: c */
    private void m14938c(final Context context) {
        if (context != null) {
            try {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C6055e.this.mo42604a(C6050b.m14922a(context));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private void m14939c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo42603a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static void m14940d() {
        if (IronSourceQaProperties.isInitialized()) {
            f14827b.m14936a(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    /* renamed from: d */
    private void m14941d(Context context) {
        if (context != null) {
            mo42604a(C6050b.m14925c(context));
            mo42604a(C6050b.m14924b(context));
        }
    }

    /* renamed from: a */
    public final String mo42600a(Context context) {
        try {
            return C5505a.C55061.m13082c(mo42605b(context).toString());
        } catch (Exception unused) {
            return C5505a.C55061.m13082c(new JSONObject().toString());
        }
    }

    /* renamed from: a */
    public final void mo42601a(Context context, String str, String str2) {
        m14938c(context);
        if (context instanceof Activity) {
            m14935a((Activity) context);
        }
        m14941d(context);
        mo42602a(str2);
        mo42607b(str);
    }

    /* renamed from: a */
    public final void mo42602a(String str) {
        if (str != null) {
            mo42603a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    /* renamed from: a */
    public final synchronized void mo42603a(String str, Object obj) {
        try {
            this.f14828a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo42604a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo42603a(next, jSONObject.opt(next));
        }
    }

    /* renamed from: b */
    public final JSONObject mo42605b(Context context) {
        mo42606b();
        m14941d(context);
        try {
            return new JSONObject(this.f14828a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public final void mo42606b() {
        m14939c(SDKUtils.getControllerConfig());
        m14936a(SDKUtils.getInitSDKParams());
        m14940d();
        m14937c();
    }

    /* renamed from: b */
    public final void mo42607b(String str) {
        if (str != null) {
            mo42603a("applicationKey", SDKUtils.encodeString(str));
        }
    }
}
