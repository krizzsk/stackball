package com.p243my.target;

import android.content.Context;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.m3 */
public final class C7542m3 {

    /* renamed from: a */
    public static volatile C7542m3 f18985a;

    /* renamed from: b */
    public final CookieHandler f18986b;

    public C7542m3(CookieManager cookieManager) {
        this.f18986b = cookieManager;
    }

    /* renamed from: a */
    public static C7542m3 m19769a(Context context) {
        C7542m3 m3Var = f18985a;
        if (m3Var == null) {
            synchronized (C7542m3.class) {
                m3Var = f18985a;
                if (m3Var == null) {
                    m3Var = new C7542m3(new CookieManager(new C7561n3(context.getApplicationContext()), (CookiePolicy) null));
                    f18985a = m3Var;
                }
            }
        }
        return m3Var;
    }

    /* renamed from: a */
    public void mo50850a(URLConnection uRLConnection) {
        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
        try {
            this.f18986b.put(URI.create(uRLConnection.getURL().toString()), headerFields);
        } catch (Throwable th) {
            C7374e0.m18989a("unable to set cookies from urlconnection: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo50851a(URLConnection uRLConnection, Map<String, List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            for (String addRequestProperty : (List) next.getValue()) {
                uRLConnection.addRequestProperty(str, addRequestProperty);
            }
        }
    }

    /* renamed from: b */
    public void mo50852b(URLConnection uRLConnection) {
        HashMap hashMap = new HashMap();
        try {
            mo50851a(uRLConnection, this.f18986b.get(URI.create(uRLConnection.getURL().toString()), hashMap));
        } catch (Throwable th) {
            C7374e0.m18989a("unable to set cookies to urlconnection " + th.getMessage());
        }
    }
}
