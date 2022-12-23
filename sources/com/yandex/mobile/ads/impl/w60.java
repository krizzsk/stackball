package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.v60;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class w60 {
    /* renamed from: a */
    public static final <T> T m43539a(v60<T> v60, ly0 ly0, String str, JSONObject jSONObject, Function3<? super String, ? super JSONObject, ? super ly0, ? extends T> function3) {
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            return function3.invoke(str, jSONObject, ly0);
        }
        if (v60 instanceof v60.C14870d) {
            return ((v60.C14870d) v60).mo70453b();
        }
        if (v60 instanceof v60.C14869c) {
            return function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        }
        throw py0.m41002a(jSONObject, str);
    }

    /* renamed from: b */
    public static final <T extends qh0> List<T> m43542b(v60<? extends List<? extends ci0<T>>> v60, ly0 ly0, String str, JSONObject jSONObject, gj0<T> gj0, Function3<? super String, ? super JSONObject, ? super ly0, ? extends List<? extends T>> function3) {
        List<T> list;
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(gj0, "validator");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            list = (List) function3.invoke(str, jSONObject, ly0);
        } else if (v60 instanceof v60.C14870d) {
            ArrayList arrayList = new ArrayList();
            for (ci0 a : (Iterable) ((v60.C14870d) v60).mo70453b()) {
                qh0 a2 = m43537a(a, ly0, jSONObject);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            list = arrayList;
        } else if (v60 instanceof v60.C14869c) {
            list = (List) function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        } else {
            throw py0.m41002a(jSONObject, str);
        }
        if (gj0.mo65494a(list)) {
            return list;
        }
        throw py0.m41004a(jSONObject, str, list);
    }

    /* renamed from: c */
    public static final <T> T m43543c(v60<T> v60, ly0 ly0, String str, JSONObject jSONObject, Function3<? super String, ? super JSONObject, ? super ly0, ? extends T> function3) {
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            return function3.invoke(str, jSONObject, ly0);
        }
        if (v60 instanceof v60.C14870d) {
            return ((v60.C14870d) v60).mo70453b();
        }
        if (v60 instanceof v60.C14869c) {
            return function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T> f50<T> m43544d(v60<f50<T>> v60, ly0 ly0, String str, JSONObject jSONObject, Function3<? super String, ? super JSONObject, ? super ly0, ? extends f50<T>> function3) {
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            return (f50) function3.invoke(str, jSONObject, ly0);
        }
        if (v60 instanceof v60.C14870d) {
            return (f50) ((v60.C14870d) v60).mo70453b();
        }
        if (v60 instanceof v60.C14869c) {
            return (f50) function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends qh0> T m43545e(v60<? extends ci0<T>> v60, ly0 ly0, String str, JSONObject jSONObject, Function3<? super String, ? super JSONObject, ? super ly0, ? extends T> function3) {
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            return (qh0) function3.invoke(str, jSONObject, ly0);
        }
        if (v60 instanceof v60.C14870d) {
            return m43537a((ci0) ((v60.C14870d) v60).mo70453b(), ly0, jSONObject);
        }
        if (v60 instanceof v60.C14869c) {
            return (qh0) function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        }
        return null;
    }

    /* renamed from: f */
    public static final <T extends qh0> T m43546f(v60<? extends ci0<T>> v60, ly0 ly0, String str, JSONObject jSONObject, Function3<? super String, ? super JSONObject, ? super ly0, ? extends T> function3) {
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            return (qh0) function3.invoke(str, jSONObject, ly0);
        }
        if (v60 instanceof v60.C14870d) {
            ci0 ci0 = (ci0) ((v60.C14870d) v60).mo70453b();
            Intrinsics.checkNotNullParameter(ci0, "<this>");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "data");
            try {
                return ci0.mo65774a(ly0, jSONObject);
            } catch (oy0 e) {
                throw py0.m41003a(jSONObject, str, e);
            }
        } else if (v60 instanceof v60.C14869c) {
            return (qh0) function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        } else {
            throw py0.m41002a(jSONObject, str);
        }
    }

    /* renamed from: a */
    public static final <T extends qh0> List<T> m43540a(v60<? extends List<? extends ci0<T>>> v60, ly0 ly0, String str, JSONObject jSONObject, gj0<T> gj0, Function3<? super String, ? super JSONObject, ? super ly0, ? extends List<? extends T>> function3) {
        List<T> list;
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(gj0, "validator");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            list = (List) function3.invoke(str, jSONObject, ly0);
        } else if (v60 instanceof v60.C14870d) {
            ArrayList arrayList = new ArrayList();
            for (ci0 a : (Iterable) ((v60.C14870d) v60).mo70453b()) {
                qh0 a2 = m43537a(a, ly0, jSONObject);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            list = arrayList;
        } else {
            list = v60 instanceof v60.C14869c ? (List) function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0) : null;
        }
        if (list == null) {
            return null;
        }
        if (gj0.mo65494a(list)) {
            return list;
        }
        ly0.mo66818b().mo65565c(py0.m41004a(jSONObject, str, list));
        return null;
    }

    /* renamed from: a */
    public static final <T extends qh0> T m43537a(ci0<T> ci0, ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ci0, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        try {
            return ci0.mo65774a(ly0, jSONObject);
        } catch (oy0 e) {
            ly0.mo66818b().mo65565c(e);
            return null;
        }
    }

    /* renamed from: a */
    public static final <T> v60<T> m43538a(v60<T> v60, boolean z) {
        v60.C14867a aVar = v60.C14867a.f41195b;
        if (Intrinsics.areEqual((Object) v60, (Object) aVar) || Intrinsics.areEqual((Object) v60, (Object) v60.C14868b.f41196b)) {
            return z ? v60.C14868b.f41196b : aVar;
        }
        if (v60 instanceof v60.C14870d) {
            return new v60.C14870d(z, ((v60.C14870d) v60).mo70453b());
        }
        if (v60 instanceof v60.C14869c) {
            return new v60.C14869c(z, ((v60.C14869c) v60).mo70452b());
        }
        throw new IllegalStateException("Unknown field type");
    }

    /* renamed from: b */
    public static final <T> f50<T> m43541b(v60<f50<T>> v60, ly0 ly0, String str, JSONObject jSONObject, Function3<? super String, ? super JSONObject, ? super ly0, ? extends f50<T>> function3) {
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has(str)) {
            return (f50) function3.invoke(str, jSONObject, ly0);
        }
        if (v60 instanceof v60.C14870d) {
            return (f50) ((v60.C14870d) v60).mo70453b();
        }
        if (v60 instanceof v60.C14869c) {
            return (f50) function3.invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        }
        throw py0.m41002a(jSONObject, str);
    }
}
