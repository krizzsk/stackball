package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.mediation.base.C15434a;
import java.util.HashMap;
import java.util.Map;

public class um0<T extends C15434a> {

    /* renamed from: a */
    private final wm0 f40798a;

    public um0(wm0 wm0) {
        this.f40798a = wm0;
    }

    /* renamed from: a */
    public T mo70374a(Context context, hn0 hn0, Class<T> cls) {
        String str;
        T t = null;
        try {
            String c = hn0.mo67571c();
            Object a = h31.m36785a(Class.forName(c), new Object[0]);
            T t2 = (C15434a) cls.cast(a);
            if (t2 != null) {
                return t2;
            }
            if (a == null) {
                try {
                    str = String.format("Instantiation failed for %s", new Object[]{c});
                } catch (ClassCastException e) {
                    e = e;
                    t = t2;
                    m42750a(context, hn0, "does_not_conform_to_protocol", (Exception) e);
                    return t;
                } catch (Exception e2) {
                    e = e2;
                    t = t2;
                    m42750a(context, hn0, "could_not_create_adapter", e);
                    return t;
                }
            } else {
                str = String.format("Cast from %s to %s is failed", new Object[]{a.getClass().getName(), cls.getName()});
            }
            m42751a(context, hn0, "could_not_create_adapter", str);
            return t2;
        } catch (ClassCastException e3) {
            e = e3;
            m42750a(context, hn0, "does_not_conform_to_protocol", (Exception) e);
            return t;
        } catch (Exception e4) {
            e = e4;
            m42750a(context, hn0, "could_not_create_adapter", e);
            return t;
        }
    }

    /* renamed from: a */
    private void m42750a(Context context, hn0 hn0, String str, Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        hashMap.put("description", String.format("%s %s", new Object[]{exc.getClass().getName(), exc.getMessage()}));
        this.f40798a.mo70721a(context, hn0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    private void m42751a(Context context, hn0 hn0, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        hashMap.put("description", str2);
        this.f40798a.mo70721a(context, hn0, (Map<String, Object>) hashMap);
    }
}
