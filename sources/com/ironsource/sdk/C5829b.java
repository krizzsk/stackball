package com.ironsource.sdk;

import com.ironsource.sdk.p153j.C6025a;
import java.util.Map;

/* renamed from: com.ironsource.sdk.b */
public final class C5829b {

    /* renamed from: a */
    public final boolean f14184a;

    /* renamed from: b */
    public String f14185b;

    /* renamed from: c */
    public String f14186c;

    /* renamed from: d */
    public boolean f14187d;

    /* renamed from: e */
    public C5820a f14188e;

    /* renamed from: f */
    public Map<String, String> f14189f;

    /* renamed from: g */
    public C6025a f14190g;

    /* renamed from: h */
    public boolean f14191h = false;

    C5829b(String str, String str2, boolean z, boolean z2, Map<String, String> map, C6025a aVar, C5820a aVar2) {
        this.f14185b = str;
        this.f14186c = str2;
        this.f14184a = z;
        this.f14187d = z2;
        this.f14189f = map;
        this.f14190g = aVar;
        this.f14188e = aVar2;
    }

    /* renamed from: a */
    public final boolean mo42159a() {
        C5820a aVar = this.f14188e;
        if (aVar != null) {
            if (aVar.f14149b > 0 && aVar.f14148a > 0) {
                return true;
            }
        }
        return false;
    }
}
