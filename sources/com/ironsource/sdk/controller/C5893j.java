package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.p150g.C6007c;
import com.ironsource.sdk.p150g.C6008d;
import com.ironsource.sdk.p153j.C6025a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.controller.j */
public final class C5893j {

    /* renamed from: a */
    private Map<String, C6007c> f14396a = new LinkedHashMap();

    /* renamed from: b */
    private Map<String, C6007c> f14397b = new LinkedHashMap();

    /* renamed from: c */
    private Map<String, C6007c> f14398c = new LinkedHashMap();

    /* renamed from: b */
    private Map<String, C6007c> m14538b(C6008d.C6013e eVar) {
        if (eVar.name().equalsIgnoreCase(C6008d.C6013e.RewardedVideo.name())) {
            return this.f14396a;
        }
        if (eVar.name().equalsIgnoreCase(C6008d.C6013e.Interstitial.name())) {
            return this.f14397b;
        }
        if (eVar.name().equalsIgnoreCase(C6008d.C6013e.Banner.name())) {
            return this.f14398c;
        }
        return null;
    }

    /* renamed from: a */
    public final C6007c mo42310a(C6008d.C6013e eVar, String str) {
        Map<String, C6007c> b;
        if (TextUtils.isEmpty(str) || (b = m14538b(eVar)) == null) {
            return null;
        }
        return b.get(str);
    }

    /* renamed from: a */
    public final C6007c mo42311a(C6008d.C6013e eVar, String str, Map<String, String> map, C6025a aVar) {
        C6007c cVar = new C6007c(str, str, map, aVar);
        mo42313a(eVar, str, cVar);
        return cVar;
    }

    /* renamed from: a */
    public final Collection<C6007c> mo42312a(C6008d.C6013e eVar) {
        Map<String, C6007c> b = m14538b(eVar);
        return b != null ? b.values() : new ArrayList();
    }

    /* renamed from: a */
    public void mo42313a(C6008d.C6013e eVar, String str, C6007c cVar) {
        Map<String, C6007c> b;
        if (!TextUtils.isEmpty(str) && (b = m14538b(eVar)) != null) {
            b.put(str, cVar);
        }
    }
}
