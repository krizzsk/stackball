package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.f50;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public class zh0 {

    /* renamed from: a */
    private static final rh1<?> f43123a = $$Lambda$zh0$e_XaRyB92iWrpvr8Bxck1mK9O0.INSTANCE;

    /* renamed from: b */
    private static final Function1<?, ?> f43124b = $$Lambda$zh0$h9y7bWcOBBLzzEmJ5Brfi_k4F4.INSTANCE;

    /* renamed from: c */
    private static final n50<?> f43125c = new C14185oh(Collections.emptyList());

    /* renamed from: d */
    public static final /* synthetic */ int f43126d = 0;

    /* renamed from: com.yandex.mobile.ads.impl.zh0$a */
    private interface C15315a {

        /* renamed from: a */
        public static final C15315a f43127a = $$Lambda$zh0$a$Ft5tvU35BNAll6OMHgVx1Fsb0A8.INSTANCE;

        /* renamed from: b */
        public static final C15315a f43128b = $$Lambda$zh0$a$KWVWv4Nf5x11M8wL2xJ7i1WvDo.INSTANCE;

        /* renamed from: com.yandex.mobile.ads.impl.zh0$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: a */
            public static /* synthetic */ void m44631a(oy0 oy0) {
                throw oy0;
            }

            /* renamed from: c */
            public static /* synthetic */ void m44632c(oy0 oy0) {
            }
        }

        /* renamed from: b */
        void mo65628b(oy0 oy0);
    }

    static {
        $$Lambda$zh0$uuL5XE9v4qLAC5FWMV3wq3OBkk r0 = $$Lambda$zh0$uuL5XE9v4qLAC5FWMV3wq3OBkk.INSTANCE;
        $$Lambda$zh0$CHINP0hYIhaHk4CYvCD_1qyee4 r02 = $$Lambda$zh0$CHINP0hYIhaHk4CYvCD_1qyee4.INSTANCE;
    }

    /* renamed from: a */
    public static <R, T> f50 m44601a(JSONObject jSONObject, String str, Function1 function1, rh1 rh1, ny0 ny0, f50 f50, cg1 cg1) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        ny0 ny02 = ny0;
        Object a = m44606a(jSONObject, str);
        if (a == null) {
            return null;
        }
        if (f50.m35901a(a)) {
            return new f50.C13031c(str, a.toString(), function1, rh1, ny0, cg1, C15302zc.f43075a, f50);
        }
        Function1 function12 = function1;
        try {
            Object invoke = function1.invoke(a);
            if (invoke == null) {
                ny0.mo65565c(py0.m41004a(jSONObject, str, a));
                return null;
            }
            rh1 rh12 = rh1;
            try {
                if (rh1.mo65491a(invoke)) {
                    return f50.f33229a.mo66929a(invoke);
                }
                ny0.mo65565c(py0.m41004a(jSONObject, str, a));
                return null;
            } catch (ClassCastException unused) {
                ny0.mo65565c(py0.m41007b(jSONObject, str, a));
                return null;
            }
        } catch (ClassCastException unused2) {
            ny0.mo65565c(py0.m41007b(jSONObject, str, a));
            return null;
        } catch (Exception e) {
            ny0.mo65565c(py0.m41005a(jSONObject, str, a, (Throwable) e));
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m44617a(Object obj) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m44618a(String str) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m44619a(List list) {
        return true;
    }

    /* renamed from: b */
    public static <T extends qh0> T m44622b(JSONObject jSONObject, String str, Function2<ly0, JSONObject, T> function2, ny0 ny0, ly0 ly0) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (qh0) function2.invoke(ly0, optJSONObject);
        } catch (oy0 e) {
            ny0.mo65565c(e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Object m44623b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static <T> List<T> m44629c(JSONObject jSONObject, String str, Function2<ly0, JSONObject, T> function2, gj0<T> gj0, ny0 ny0, ly0 ly0) {
        return m44615a(jSONObject, str, (Function2) function2, (gj0) gj0, (rh1) f43123a, ly0);
    }

    /* renamed from: c */
    private static <T> T m44628c(T t) {
        if (t == null || t == JSONObject.NULL) {
            return null;
        }
        return t;
    }

    /* renamed from: b */
    public static <R, T> f50<T> m44621b(JSONObject jSONObject, String str, Function1<R, T> function1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m44601a(jSONObject, str, (Function1) function1, (rh1) f43123a, ny0, (f50) null, (cg1) cg1);
    }

    /* renamed from: b */
    public static <T> List<T> m44626b(JSONObject jSONObject, String str, Function2<ly0, JSONObject, T> function2, gj0<T> gj0, ny0 ny0, ly0 ly0) {
        T invoke;
        rh1<?> rh1 = f43123a;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) m44628c(optJSONArray.optJSONObject(i));
            if (!(jSONObject2 == null || (invoke = function2.invoke(ly0, jSONObject2)) == null)) {
                try {
                    if (!rh1.mo65491a(invoke)) {
                        ny0.mo65565c(py0.m41000a(optJSONArray, str, i, invoke));
                    } else {
                        arrayList.add(invoke);
                    }
                } catch (ClassCastException unused) {
                    ny0.mo65565c(py0.m41006b(optJSONArray, str, i, invoke));
                }
            }
        }
        try {
            if (gj0.mo65494a(arrayList)) {
                return arrayList;
            }
            ny0.mo65565c(py0.m41004a(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused2) {
            ny0.mo65565c(py0.m41007b(jSONObject, str, arrayList));
            return null;
        }
    }

    /* renamed from: a */
    public static <R, T> f50 m44600a(JSONObject jSONObject, String str, Function1 function1, rh1 rh1, ny0 ny0, cg1 cg1) {
        Object a = m44606a(jSONObject, str);
        if (a == null) {
            throw py0.m41002a(jSONObject, str);
        } else if (f50.m35901a(a)) {
            return new f50.C13031c(str, a.toString(), function1, rh1, ny0, cg1, C15302zc.f43075a, (f50) null);
        } else {
            try {
                Object invoke = function1.invoke(a);
                if (invoke != null) {
                    try {
                        if (rh1.mo65491a(invoke)) {
                            return f50.f33229a.mo66929a(invoke);
                        }
                        throw py0.m41004a(jSONObject, str, a);
                    } catch (ClassCastException unused) {
                        throw py0.m41007b(jSONObject, str, a);
                    }
                } else {
                    throw py0.m41004a(jSONObject, str, a);
                }
            } catch (ClassCastException unused2) {
                throw py0.m41007b(jSONObject, str, a);
            } catch (Exception e) {
                throw py0.m41005a(jSONObject, str, a, (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    static <T> Function1<T, T> m44627b() {
        return f43124b;
    }

    /* renamed from: b */
    public static <T> T m44624b(JSONObject jSONObject, String str, ny0 ny0, ly0 ly0) {
        return m44611a(jSONObject, str, (Function1) f43124b, (rh1) f43123a, ny0);
    }

    /* renamed from: a */
    public static <R, T> Object m44611a(JSONObject jSONObject, String str, Function1 function1, rh1 rh1, ny0 ny0) {
        Object a = m44606a(jSONObject, str);
        if (a == null) {
            return null;
        }
        try {
            Object invoke = function1.invoke(a);
            if (invoke == null) {
                ny0.mo65565c(py0.m41004a(jSONObject, str, a));
                return null;
            }
            try {
                if (rh1.mo65491a(invoke)) {
                    return invoke;
                }
                ny0.mo65565c(py0.m41004a(jSONObject, str, a));
                return null;
            } catch (ClassCastException unused) {
                ny0.mo65565c(py0.m41007b(jSONObject, str, a));
                return null;
            }
        } catch (ClassCastException unused2) {
            ny0.mo65565c(py0.m41007b(jSONObject, str, a));
            return null;
        } catch (Exception e) {
            ny0.mo65565c(py0.m41005a(jSONObject, str, a, (Throwable) e));
            return null;
        }
    }

    /* renamed from: b */
    public static <T> T m44625b(JSONObject jSONObject, String str, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        return m44611a(jSONObject, str, (Function1) f43124b, (rh1) rh1, ny0);
    }

    /* renamed from: b */
    public static <T> f50<T> m44620b(JSONObject jSONObject, String str, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m44601a(jSONObject, str, (Function1) f43124b, (rh1) rh1, ny0, (f50) null, (cg1) cg1);
    }

    /* renamed from: a */
    public static <T> Object m44613a(JSONObject jSONObject, String str, Function2 function2, rh1 rh1, ly0 ly0) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            try {
                Object invoke = function2.invoke(ly0, optJSONObject);
                if (invoke != null) {
                    try {
                        if (rh1.mo65491a(invoke)) {
                            return invoke;
                        }
                        throw py0.m41004a(jSONObject, str, invoke);
                    } catch (ClassCastException unused) {
                        throw py0.m41007b(jSONObject, str, invoke);
                    }
                } else {
                    throw py0.m41004a(jSONObject, str, null);
                }
            } catch (oy0 e) {
                throw py0.m41003a(jSONObject, str, e);
            }
        } else {
            throw py0.m41002a(jSONObject, str);
        }
    }

    /* renamed from: a */
    public static <R, T> Object m44610a(JSONObject jSONObject, String str, Function1 function1, rh1 rh1) {
        Object a = m44606a(jSONObject, str);
        if (a != null) {
            try {
                Object invoke = function1.invoke(a);
                if (invoke != null) {
                    try {
                        if (rh1.mo65491a(invoke)) {
                            return invoke;
                        }
                        throw py0.m41004a(jSONObject, str, invoke);
                    } catch (ClassCastException unused) {
                        throw py0.m41007b(jSONObject, str, invoke);
                    }
                } else {
                    throw py0.m41004a(jSONObject, str, a);
                }
            } catch (ClassCastException unused2) {
                throw py0.m41007b(jSONObject, str, a);
            } catch (Exception e) {
                throw py0.m41005a(jSONObject, str, a, (Throwable) e);
            }
        } else {
            throw py0.m41002a(jSONObject, str);
        }
    }

    /* renamed from: a */
    public static <T> List<T> m44616a(JSONObject jSONObject, String str, Function2<ly0, JSONObject, T> function2, gj0<T> gj0, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = (JSONObject) m44628c(optJSONArray.optJSONObject(i));
                if (jSONObject2 != null) {
                    try {
                        T invoke = function2.invoke(ly0, jSONObject2);
                        if (invoke != null) {
                            try {
                                if (!rh1.mo65491a(invoke)) {
                                    ny0.mo65565c(py0.m41000a(optJSONArray, str, i, invoke));
                                } else {
                                    arrayList.add(invoke);
                                }
                            } catch (ClassCastException unused) {
                                ny0.mo65565c(py0.m41006b(optJSONArray, str, i, invoke));
                            }
                        }
                    } catch (ClassCastException unused2) {
                        ny0.mo65565c(py0.m41006b(optJSONArray, str, i, jSONObject2));
                    } catch (Exception e) {
                        ny0.mo65565c(py0.m41001a(optJSONArray, str, i, jSONObject2, e));
                    }
                }
            }
            try {
                if (gj0.mo65494a(arrayList)) {
                    return arrayList;
                }
                throw py0.m41004a(jSONObject, str, arrayList);
            } catch (ClassCastException unused3) {
                throw py0.m41007b(jSONObject, str, arrayList);
            }
        } else {
            throw py0.m41002a(jSONObject, str);
        }
    }

    /* renamed from: a */
    public static <R, T> n50<T> m44603a(JSONObject jSONObject, String str, Function1<R, T> function1, gj0<T> gj0, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m44604a(jSONObject, str, function1, gj0, rh1, ny0, ly0, cg1, C15315a.f43128b);
    }

    /* renamed from: a */
    private static <R, T> n50 m44604a(JSONObject jSONObject, String str, Function1<R, T> function1, gj0<T> gj0, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1, C15315a aVar) {
        ArrayList arrayList;
        C15315a aVar2;
        int i;
        ArrayList arrayList2;
        int i2;
        int i3;
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        gj0<T> gj02 = gj0;
        ny0 ny02 = ny0;
        C15315a aVar3 = aVar;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            aVar3.mo65628b(py0.m41002a(jSONObject, str));
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return f43125c;
        }
        ArrayList arrayList3 = new ArrayList(length);
        boolean z = false;
        int i4 = 0;
        while (i4 < length) {
            Object c = m44628c(optJSONArray.opt(i4));
            if (c == null) {
                Function1<R, T> function12 = function1;
                rh1<T> rh12 = rh1;
                i2 = i4;
                arrayList2 = arrayList3;
                i = length;
            } else {
                if (f50.m35901a(c)) {
                    i3 = i4;
                    arrayList2 = arrayList3;
                    i = length;
                    arrayList2.add(new f50.C13031c(str2 + "[" + i4 + "]", c.toString(), function1, rh1, ny0, cg1, C15302zc.f43075a, (f50) null));
                    z = true;
                    Function1<R, T> function13 = function1;
                } else {
                    i3 = i4;
                    arrayList2 = arrayList3;
                    i = length;
                    try {
                        T invoke = function1.invoke(c);
                        if (invoke != null) {
                            try {
                                if (!rh1.mo65491a(invoke)) {
                                    i2 = i3;
                                    try {
                                        ny02.mo65565c(py0.m41000a(optJSONArray, str2, i2, invoke));
                                    } catch (ClassCastException unused) {
                                    }
                                } else {
                                    i2 = i3;
                                    arrayList2.add(invoke);
                                }
                            } catch (ClassCastException unused2) {
                                i2 = i3;
                                ny02.mo65565c(py0.m41006b(optJSONArray, str2, i2, invoke));
                                i4 = i2 + 1;
                                arrayList3 = arrayList2;
                                length = i;
                                C15315a aVar4 = aVar;
                            }
                        }
                    } catch (ClassCastException unused3) {
                        rh1<T> rh13 = rh1;
                        i2 = i3;
                        ny02.mo65565c(py0.m41006b(optJSONArray, str2, i2, c));
                    } catch (Exception e) {
                        rh1<T> rh14 = rh1;
                        i2 = i3;
                        ny02.mo65565c(py0.m41001a(optJSONArray, str2, i2, c, e));
                    }
                }
                rh1<T> rh15 = rh1;
                i2 = i3;
            }
            i4 = i2 + 1;
            arrayList3 = arrayList2;
            length = i;
            C15315a aVar42 = aVar;
        }
        ArrayList arrayList4 = arrayList3;
        if (z) {
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                Object obj = arrayList4.get(i5);
                if (!(obj instanceof f50)) {
                    arrayList4.set(i5, f50.f33229a.mo66929a(obj));
                }
            }
            return new hq0(str2, arrayList4, gj02, ly0.mo66818b());
        }
        try {
            if (gj02.mo65494a(arrayList4)) {
                return new C14185oh(arrayList4);
            }
            aVar2 = aVar;
            arrayList = arrayList4;
            try {
                aVar2.mo65628b(py0.m41004a(jSONObject2, str2, arrayList4));
                return null;
            } catch (ClassCastException unused4) {
                aVar2.mo65628b(py0.m41007b(jSONObject2, str2, arrayList));
                return null;
            }
        } catch (ClassCastException unused5) {
            aVar2 = aVar;
            arrayList = arrayList4;
            aVar2.mo65628b(py0.m41007b(jSONObject2, str2, arrayList));
            return null;
        }
    }

    /* renamed from: a */
    public static <T> List m44615a(JSONObject jSONObject, String str, Function2 function2, gj0 gj0, rh1 rh1, ly0 ly0) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (i < length) {
                JSONObject jSONObject3 = (JSONObject) m44628c(optJSONArray.optJSONObject(i));
                if (jSONObject3 != null) {
                    try {
                        Object invoke = function2.invoke(ly0, jSONObject3);
                        if (invoke != null) {
                            try {
                                if (rh1.mo65491a(invoke)) {
                                    arrayList.add(invoke);
                                    i++;
                                } else {
                                    throw py0.m41000a(optJSONArray, str, i, jSONObject3);
                                }
                            } catch (ClassCastException unused) {
                                throw py0.m41006b(optJSONArray, str, i, invoke);
                            }
                        } else {
                            throw py0.m41000a(optJSONArray, str, i, jSONObject3);
                        }
                    } catch (ClassCastException unused2) {
                        throw py0.m41006b(optJSONArray, str, i, jSONObject3);
                    } catch (Exception e) {
                        throw py0.m41001a(optJSONArray, str, i, jSONObject3, e);
                    }
                } else {
                    Intrinsics.checkNotNullParameter(optJSONArray, "json");
                    Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                    qy0 qy0 = qy0.MISSING_VALUE;
                    throw new oy0(qy0, "Value at " + i + " position of '" + str + "' is missing", (Throwable) null, new xh0(optJSONArray), hi0.m36983a(optJSONArray, 0, 1), 4);
                }
            }
            try {
                if (gj0.mo65494a(arrayList)) {
                    return arrayList;
                }
                throw py0.m41004a(jSONObject, str, arrayList);
            } catch (ClassCastException unused3) {
                throw py0.m41007b(jSONObject, str, arrayList);
            }
        } else {
            throw py0.m41002a(jSONObject, str);
        }
    }

    /* renamed from: a */
    static <T> rh1<T> m44605a() {
        return f43123a;
    }

    /* renamed from: a */
    public static <R, T> T m44609a(JSONObject jSONObject, String str, Function1<R, T> function1, ny0 ny0, ly0 ly0) {
        return m44610a(jSONObject, str, (Function1) function1, (rh1) f43123a);
    }

    /* renamed from: a */
    public static <T> T m44612a(JSONObject jSONObject, String str, Function2<ly0, JSONObject, T> function2, ny0 ny0, ly0 ly0) {
        return m44613a(jSONObject, str, (Function2) function2, (rh1) f43123a, ly0);
    }

    /* renamed from: a */
    public static <R, T> f50<T> m44598a(JSONObject jSONObject, String str, Function1<R, T> function1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m44600a(jSONObject, str, (Function1) function1, (rh1) f43123a, ny0, (cg1) cg1);
    }

    /* renamed from: a */
    public static <R, T> n50<T> m44602a(JSONObject jSONObject, String str, Function1<R, T> function1, gj0<T> gj0, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        n50<T> a = m44604a(jSONObject, str, function1, gj0, f43123a, ny0, ly0, cg1, C15315a.f43127a);
        if (a != null) {
            return a;
        }
        throw py0.m40996a(str, jSONObject);
    }

    /* renamed from: a */
    public static <T> List<T> m44614a(JSONObject jSONObject, String str, Function2<ly0, JSONObject, T> function2, gj0<T> gj0, ny0 ny0, ly0 ly0) {
        return m44616a(jSONObject, str, function2, gj0, f43123a, ny0, ly0);
    }

    /* renamed from: a */
    public static <R, T> f50<T> m44599a(JSONObject jSONObject, String str, Function1<R, T> function1, ny0 ny0, ly0 ly0, f50<T> f50, cg1<T> cg1) {
        return m44601a(jSONObject, str, (Function1) function1, (rh1) f43123a, ny0, (f50) f50, (cg1) cg1);
    }

    /* renamed from: a */
    public static <T> T m44607a(JSONObject jSONObject, String str, ny0 ny0, ly0 ly0) {
        return m44610a(jSONObject, str, (Function1) f43124b, (rh1) f43123a);
    }

    /* renamed from: a */
    public static <T> T m44608a(JSONObject jSONObject, String str, rh1<T> rh1, ny0 ny0, ly0 ly0) {
        return m44610a(jSONObject, str, (Function1) f43124b, (rh1) rh1);
    }

    /* renamed from: a */
    public static <T> f50<T> m44597a(JSONObject jSONObject, String str, rh1<T> rh1, ny0 ny0, ly0 ly0, cg1<T> cg1) {
        return m44600a(jSONObject, str, (Function1) f43124b, (rh1) rh1, ny0, (cg1) cg1);
    }

    /* renamed from: a */
    private static Object m44606a(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            return null;
        }
        return opt;
    }
}
