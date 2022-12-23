package com.ironsource.sdk.p143a;

import android.content.Context;
import com.adcolony.adcolonysdk.BuildConfig;
import com.ironsource.p131a.C5489c;
import com.ironsource.p133c.C5499a;
import com.ironsource.sdk.utils.C6058a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.b */
public final class C5822b implements C5489c {

    /* renamed from: a */
    private static Map<String, Object> f14152a = new HashMap();

    /* renamed from: com.ironsource.sdk.a.b$a */
    public static class C5823a {

        /* renamed from: a */
        public String f14153a;

        /* renamed from: b */
        public String f14154b;

        /* renamed from: c */
        public Context f14155c;

        /* renamed from: d */
        public String f14156d;
    }

    private C5822b(C5823a aVar) {
        Context context = aVar.f14155c;
        C6058a a = C6058a.m14963a(context);
        f14152a.put("deviceos", SDKUtils.encodeString(a.f14847c));
        f14152a.put("deviceosversion", SDKUtils.encodeString(a.f14848d));
        f14152a.put("deviceapilevel", Integer.valueOf(a.f14849e));
        f14152a.put("deviceoem", SDKUtils.encodeString(a.f14845a));
        f14152a.put("devicemodel", SDKUtils.encodeString(a.f14846b));
        f14152a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f14152a.put("applicationkey", SDKUtils.encodeString(aVar.f14154b));
        f14152a.put("sessionid", SDKUtils.encodeString(aVar.f14153a));
        f14152a.put("sdkversion", SDKUtils.encodeString(C6058a.m14964a()));
        f14152a.put("applicationuserid", SDKUtils.encodeString(aVar.f14156d));
        f14152a.put("env", BuildConfig.FLAVOR);
        f14152a.put("origin", "n");
        f14152a.put("connectiontype", C5499a.m13042a(aVar.f14155c));
    }

    public /* synthetic */ C5822b(C5823a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static void m14388a(String str) {
        f14152a.put("connectiontype", SDKUtils.encodeString(str));
    }

    /* renamed from: a */
    public final Map<String, Object> mo41100a() {
        return f14152a;
    }
}
