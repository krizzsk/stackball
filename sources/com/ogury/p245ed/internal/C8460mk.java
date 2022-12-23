package com.ogury.p245ed.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.mk */
public final class C8460mk implements C8459mj, C8492nm<Object> {

    /* renamed from: a */
    public static final C8461a f21686a = new C8461a((byte) 0);

    /* renamed from: c */
    private static final Map<Class<? extends Object<?>>, Integer> f21687c;

    /* renamed from: d */
    private static final HashMap<String, String> f21688d;

    /* renamed from: e */
    private static final HashMap<String, String> f21689e;

    /* renamed from: f */
    private static final HashMap<String, String> f21690f;

    /* renamed from: g */
    private static final Map<String, String> f21691g;

    /* renamed from: b */
    private final Class<?> f21692b;

    public C8460mk(Class<?> cls) {
        C8467mq.m23881b(cls, "jClass");
        this.f21692b = cls;
    }

    /* renamed from: a */
    public final Class<?> mo53971a() {
        return this.f21692b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8460mk) && C8467mq.m23880a((Object) C8430li.m23853a(this), (Object) C8430li.m23853a((C8492nm) obj));
    }

    public final int hashCode() {
        return C8430li.m23853a(this).hashCode();
    }

    public final String toString() {
        return mo53971a().toString() + " (Kotlin reflection is not available)";
    }

    /* renamed from: com.ogury.ed.internal.mk$a */
    public static final class C8461a {
        private C8461a() {
        }

        public /* synthetic */ C8461a(byte b) {
            this();
        }
    }

    static {
        int i = 0;
        Iterable b = C8394km.m23757b(C8431lj.class, C8432lk.class, C8443lv.class, C8447lz.class, C8449ma.class, C8450mb.class, C8451mc.class, C8452md.class, C8453me.class, C8454mf.class, C8433ll.class, C8434lm.class, C8435ln.class, C8436lo.class, C8437lp.class, C8438lq.class, C8439lr.class, C8440ls.class, C8441lt.class, C8442lu.class, C8444lw.class, C8445lx.class, C8446ly.class);
        Collection arrayList = new ArrayList(C8394km.m23759a(b));
        for (Object next : b) {
            int i2 = i + 1;
            if (i < 0) {
                C8394km.m23758b();
            }
            arrayList.add(C8383kb.m23743a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f21687c = C8424lc.m23847a((List) arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f21688d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f21689e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(f21688d);
        hashMap3.putAll(f21689e);
        Collection<String> values = f21688d.values();
        C8467mq.m23878a((Object) values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            C8467mq.m23878a((Object) str, "kotlinName");
            sb.append(C8516oc.m23960a(str));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C8380jz a = C8383kb.m23743a(sb2, str + ".Companion");
            hashMap3.put(a.mo53853a(), a.mo53854b());
        }
        for (Map.Entry next2 : f21687c.entrySet()) {
            hashMap3.put(((Class) next2.getKey()).getName(), "kotlin.Function".concat(String.valueOf(((Number) next2.getValue()).intValue())));
        }
        f21690f = hashMap3;
        Map map = hashMap3;
        Map<String, String> linkedHashMap = new LinkedHashMap<>(C8424lc.m23844a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C8516oc.m23960a((String) entry.getValue()));
        }
        f21691g = linkedHashMap;
    }
}
