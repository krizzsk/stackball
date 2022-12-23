package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.v60;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Typography;
import org.json.JSONObject;

public class di0 {

    /* renamed from: a */
    private static final rh1<String> f32587a = $$Lambda$di0$jpnLoEru3oQxIeeDmwDFVi_Tkk.INSTANCE;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m35289a(String str) {
        return !str.isEmpty();
    }

    /* renamed from: b */
    public static <T> v60<T> m35290b(JSONObject jSONObject, String str, boolean z, v60<T> v60, ny0 ny0, ly0 ly0) {
        return m35294b(jSONObject, str, z, v60, zh0.m44627b(), zh0.m44605a(), ny0, ly0);
    }

    /* renamed from: c */
    public static <T> v60<List<T>> m35298c(JSONObject jSONObject, String str, boolean z, v60<List<T>> v60, Function2<ly0, JSONObject, T> function2, gj0<T> gj0, ny0 ny0, ly0 ly0) {
        try {
            return new v60.C14870d(z, zh0.m44615a(jSONObject, str, (Function2) function2, (gj0) gj0, zh0.m44605a(), ly0));
        } catch (oy0 e) {
            ei0.m35671a(e);
            v60<List<T>> a = m35287a(z, m35288a(jSONObject, str, ny0, ly0), v60);
            if (a != null) {
                return a;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static <T> v60<T> m35277a(JSONObject jSONObject, String str, boolean z, v60<T> v60, ny0 ny0, ly0 ly0) {
        return m35283a(jSONObject, str, z, v60, zh0.m44627b(), zh0.m44605a(), ny0, ly0);
    }

    /* renamed from: b */
    public static <T> v60<T> m35291b(JSONObject jSONObject, String str, boolean z, v60<T> v60, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        return m35294b(jSONObject, str, z, v60, zh0.m44627b(), rh1, ny0, ly0);
    }

    /* renamed from: a */
    public static <T> v60<T> m35278a(JSONObject jSONObject, String str, boolean z, v60<T> v60, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        return m35283a(jSONObject, str, z, v60, zh0.m44627b(), rh1, ny0, ly0);
    }

    /* renamed from: b */
    public static <R, T> v60<T> m35294b(JSONObject jSONObject, String str, boolean z, v60<T> v60, Function1<R, T> function1, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        Object a = zh0.m44611a(jSONObject, str, (Function1) function1, (rh1) rh1, ny0);
        if (a != null) {
            return new v60.C14870d(z, a);
        }
        String a2 = m35288a(jSONObject, str, ny0, ly0);
        if (a2 != null) {
            return new v60.C14869c(z, a2);
        }
        if (v60 != null) {
            return w60.m43538a(v60, z);
        }
        return z ? v60.C14868b.f41196b : v60.C14867a.f41195b;
    }

    /* renamed from: a */
    public static <R, T> v60<T> m35281a(JSONObject jSONObject, String str, boolean z, v60<T> v60, Function1<R, T> function1, ny0 ny0, ly0 ly0) {
        return m35283a(jSONObject, str, z, v60, function1, zh0.m44605a(), ny0, ly0);
    }

    /* renamed from: a */
    public static <R, T> v60<T> m35283a(JSONObject jSONObject, String str, boolean z, v60<T> v60, Function1<R, T> function1, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        try {
            return new v60.C14870d(z, zh0.m44610a(jSONObject, str, (Function1) function1, (rh1) rh1));
        } catch (oy0 e) {
            ei0.m35671a(e);
            v60<T> a = m35287a(z, m35288a(jSONObject, str, ny0, ly0), v60);
            if (a != null) {
                return a;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public static <T> v60<T> m35297b(JSONObject jSONObject, String str, boolean z, v60<T> v60, Function2<ly0, JSONObject, T> function2, ny0 ny0, ly0 ly0) {
        rh1 a = zh0.m44605a();
        int i = zh0.f43126d;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        T t = null;
        if (optJSONObject != null) {
            try {
                T invoke = function2.invoke(ly0, optJSONObject);
                if (invoke == null) {
                    ny0.mo65565c(py0.m41004a(jSONObject, str, optJSONObject));
                } else {
                    try {
                        if (!a.mo65491a(invoke)) {
                            ny0.mo65565c(py0.m41004a(jSONObject, str, optJSONObject));
                        } else {
                            t = invoke;
                        }
                    } catch (ClassCastException unused) {
                        ny0.mo65565c(py0.m41007b(jSONObject, str, optJSONObject));
                    }
                }
            } catch (ClassCastException unused2) {
                ny0.mo65565c(py0.m41007b(jSONObject, str, optJSONObject));
            } catch (Exception e) {
                ny0.mo65565c(py0.m41005a(jSONObject, str, optJSONObject, (Throwable) e));
            }
        }
        if (t != null) {
            return new v60.C14870d(z, t);
        }
        String a2 = m35288a(jSONObject, str, ny0, ly0);
        if (a2 != null) {
            return new v60.C14869c(z, a2);
        }
        if (v60 != null) {
            return w60.m43538a(v60, z);
        }
        return z ? v60.C14868b.f41196b : v60.C14867a.f41195b;
    }

    /* renamed from: a */
    public static <T> v60<T> m35286a(JSONObject jSONObject, String str, boolean z, v60<T> v60, Function2<ly0, JSONObject, T> function2, ny0 ny0, ly0 ly0) {
        try {
            return new v60.C14870d(z, zh0.m44613a(jSONObject, str, (Function2) function2, zh0.m44605a(), ly0));
        } catch (oy0 e) {
            ei0.m35671a(e);
            v60<T> a = m35287a(z, m35288a(jSONObject, str, ny0, ly0), v60);
            if (a != null) {
                return a;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static String m35288a(JSONObject jSONObject, String str, ny0 ny0, ly0 ly0) {
        return (String) zh0.m44625b(jSONObject, Typography.dollar + str, f32587a, ny0, ly0);
    }

    /* renamed from: a */
    public static <R, T> v60<n50<T>> m35280a(JSONObject jSONObject, String str, boolean z, v60<n50<T>> v60, Function1<R, T> function1, gj0<T> gj0, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        boolean z2 = z;
        v60<n50<T>> v602 = v60;
        n50<T> a = zh0.m44603a(jSONObject, str, function1, gj0, zh0.m44605a(), ny0, ly0, cg1);
        if (a != null) {
            return new v60.C14870d(z, a);
        }
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        String a2 = m35288a(jSONObject, str, ny0, ly0);
        if (a2 != null) {
            return new v60.C14869c(z, a2);
        }
        if (v602 != null) {
            return w60.m43538a(v60, z);
        }
        return z2 ? v60.C14868b.f41196b : v60.C14867a.f41195b;
    }

    /* renamed from: a */
    public static <T> v60<List<T>> m35285a(JSONObject jSONObject, String str, boolean z, v60<List<T>> v60, Function2<ly0, JSONObject, T> function2, gj0<T> gj0, ny0 ny0, ly0 ly0) {
        try {
            return new v60.C14870d(z, zh0.m44616a(jSONObject, str, function2, gj0, zh0.m44605a(), ny0, ly0));
        } catch (oy0 e) {
            ei0.m35671a(e);
            v60<List<T>> a = m35287a(z, m35288a(jSONObject, str, ny0, ly0), v60);
            if (a != null) {
                return a;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static <T> v60<T> m35287a(boolean z, String str, v60<T> v60) {
        if (str != null) {
            return new v60.C14869c(z, str);
        }
        if (v60 != null) {
            return w60.m43538a(v60, z);
        }
        if (z) {
            return z ? v60.C14868b.f41196b : v60.C14867a.f41195b;
        }
        return null;
    }

    /* renamed from: a */
    public static <R, T> v60<f50<T>> m35282a(JSONObject jSONObject, String str, boolean z, v60<f50<T>> v60, Function1<R, T> function1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m35284a(jSONObject, str, z, v60, function1, zh0.m44605a(), ny0, ly0, cg1);
    }

    /* renamed from: a */
    public static <T> v60<f50<T>> m35279a(JSONObject jSONObject, String str, boolean z, v60<f50<T>> v60, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m35284a(jSONObject, str, z, v60, zh0.m44627b(), rh1, ny0, ly0, cg1);
    }

    /* renamed from: b */
    public static <R, T> v60<f50<T>> m35293b(JSONObject jSONObject, String str, boolean z, v60<f50<T>> v60, Function1<R, T> function1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m35295b(jSONObject, str, z, v60, function1, zh0.m44605a(), ny0, ly0, cg1);
    }

    /* renamed from: a */
    public static <R, T> v60<f50<T>> m35284a(JSONObject jSONObject, String str, boolean z, v60<f50<T>> v60, Function1<R, T> function1, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        try {
            return new v60.C14870d(z, zh0.m44600a(jSONObject, str, (Function1) function1, (rh1) rh1, ny0, (cg1) cg1));
        } catch (oy0 e) {
            ei0.m35671a(e);
            v60<f50<T>> a = m35287a(z, m35288a(jSONObject, str, ny0, ly0), v60);
            if (a != null) {
                return a;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public static <T> v60<f50<T>> m35292b(JSONObject jSONObject, String str, boolean z, v60<f50<T>> v60, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m35295b(jSONObject, str, z, v60, zh0.m44627b(), rh1, ny0, ly0, cg1);
    }

    /* renamed from: b */
    public static <R, T> v60<f50<T>> m35295b(JSONObject jSONObject, String str, boolean z, v60<f50<T>> v60, Function1<R, T> function1, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        f50 a = zh0.m44601a(jSONObject, str, (Function1) function1, (rh1) rh1, ny0, (f50) null, (cg1) cg1);
        if (a != null) {
            return new v60.C14870d(z, a);
        }
        String a2 = m35288a(jSONObject, str, ny0, ly0);
        if (a2 != null) {
            return new v60.C14869c(z, a2);
        }
        if (v60 != null) {
            return w60.m43538a(v60, z);
        }
        return z ? v60.C14868b.f41196b : v60.C14867a.f41195b;
    }

    /* renamed from: b */
    public static <T> v60<List<T>> m35296b(JSONObject jSONObject, String str, boolean z, v60<List<T>> v60, Function2<ly0, JSONObject, T> function2, gj0<T> gj0, ny0 ny0, ly0 ly0) {
        List<T> b = zh0.m44626b(jSONObject, str, function2, gj0, ny0, ly0);
        if (b != null) {
            return new v60.C14870d(z, b);
        }
        String a = m35288a(jSONObject, str, ny0, ly0);
        if (a != null) {
            return new v60.C14869c(z, a);
        }
        if (v60 != null) {
            return w60.m43538a(v60, z);
        }
        return z ? v60.C14868b.f41196b : v60.C14867a.f41195b;
    }
}
