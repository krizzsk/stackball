package com.yandex.mobile.ads.impl;

import androidx.collection.ArrayMap;
import com.yandex.mobile.ads.impl.ci0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ed1<T extends ci0<?>> implements ly0 {

    /* renamed from: a */
    private final ny0 f32960a;

    /* renamed from: b */
    private final ek0<T> f32961b;

    /* renamed from: com.yandex.mobile.ads.impl.ed1$a */
    public interface C12969a<T> {
        /* renamed from: a */
        T mo66820a(ly0 ly0, boolean z, JSONObject jSONObject) throws JSONException;
    }

    public ed1(ny0 ny0, ek0<T> ek0) {
        Intrinsics.checkNotNullParameter(ny0, "logger");
        Intrinsics.checkNotNullParameter(ek0, "mainTemplateProvider");
        this.f32960a = ny0;
        this.f32961b = ek0;
    }

    /* renamed from: a */
    public final void mo66817a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ArrayMap arrayMap = new ArrayMap();
        try {
            List<String> c = fi0.f33372a.mo67020c(jSONObject, this.f32960a, this);
            this.f32961b.mo66842b(arrayMap);
            gd1 a = gd1.f33955a.mo67253a(arrayMap);
            Iterator it = ((ArrayList) c).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    my0 my0 = new my0(a, new fd1(this.f32960a, str));
                    C12969a c2 = mo66819c();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.getJSONObject(name)");
                    arrayMap.put(str, (ci0) c2.mo66820a(my0, true, jSONObject2));
                } catch (oy0 e) {
                    this.f32960a.mo65564a(e, str);
                }
            }
        } catch (Exception e2) {
            this.f32960a.mo65565c(e2);
        }
        this.f32961b.mo66841a(arrayMap);
    }

    /* renamed from: b */
    public ny0 mo66818b() {
        return this.f32960a;
    }

    /* renamed from: c */
    public abstract C12969a<T> mo66819c();
}
