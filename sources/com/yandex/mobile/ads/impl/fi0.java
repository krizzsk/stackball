package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fi0 {

    /* renamed from: a */
    public static final fi0 f33372a = new fi0();

    private fi0() {
    }

    /* renamed from: a */
    private final void m36027a(JSONObject jSONObject, boolean z, List<String> list, ny0 ny0, ly0 ly0) {
        JSONObject jSONObject2 = jSONObject;
        ny0 ny02 = ny0;
        ly0 ly02 = ly0;
        String b = z ? m36029b(jSONObject2, ny02, ly02) : m36025a(jSONObject2, ny02, ly02);
        if (b == null) {
            List<String> list2 = list;
        } else {
            list.add(b);
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            if (obj instanceof JSONObject) {
                Intrinsics.checkNotNullExpressionValue(next, SDKConstants.PARAM_KEY);
                f33372a.m36027a((JSONObject) obj, false, list, ny0, ly0);
            }
        }
        Iterator<String> keys2 = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys2, "keys");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            Object obj2 = jSONObject2.get(next2);
            if (obj2 instanceof JSONArray) {
                Intrinsics.checkNotNullExpressionValue(next2, SDKConstants.PARAM_KEY);
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    Object obj3 = jSONArray.get(i);
                    if (obj3 instanceof JSONObject) {
                        f33372a.m36027a((JSONObject) obj3, false, list, ny0, ly0);
                    }
                    i = i2;
                }
            }
        }
    }

    /* renamed from: b */
    private final String m36029b(JSONObject jSONObject, ny0 ny0, ly0 ly0) {
        return (String) ai0.m33743a(jSONObject, "type", $$Lambda$fi0$udONvwXYNVyMzZbW4mYVMwmQ6d8.INSTANCE, ny0, ly0);
    }

    /* renamed from: c */
    public final List<String> mo67020c(JSONObject jSONObject, ny0 ny0, ly0 ly0) throws JSONException, oy0, C12741cj {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(ny0, "logger");
        Intrinsics.checkNotNullParameter(ly0, "env");
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                Intrinsics.checkNotNullExpressionValue(next, SDKConstants.PARAM_KEY);
                ArrayList arrayList = new ArrayList();
                f33372a.m36027a((JSONObject) obj, true, arrayList, new fd1(ny0, next), ly0);
                linkedHashMap.put(next, arrayList);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList(jSONObject.length());
        while (!linkedHashMap.isEmpty()) {
            m36026a((String) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getKey(), linkedHashMap, linkedHashSet, arrayList2);
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m36030b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() > 0;
    }

    /* renamed from: a */
    private final String m36025a(JSONObject jSONObject, ny0 ny0, ly0 ly0) {
        $$Lambda$fi0$byHRd4mYd1W6ey7uebt8xU7w8Fg r0 = $$Lambda$fi0$byHRd4mYd1W6ey7uebt8xU7w8Fg.INSTANCE;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter("type", SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(r0, "validator");
        Intrinsics.checkNotNullParameter(ny0, "logger");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter("type", SDKConstants.PARAM_KEY);
        Object opt = jSONObject.opt("type");
        String str = null;
        if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
            opt = null;
        }
        if (opt != null) {
            if (r0.mo65491a(opt)) {
                str = opt;
            } else {
                ny0.mo65565c(py0.m41004a(jSONObject, "type", opt));
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36028a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() > 0;
    }

    /* renamed from: a */
    private final void m36026a(String str, Map<String, List<String>> map, Set<String> set, List<String> list) {
        if (set.contains(str)) {
            List<T> list2 = CollectionsKt.toList(set);
            StringBuilder sb = new StringBuilder();
            int size = list2.size();
            for (int indexOf = list2.indexOf(str); indexOf < size; indexOf++) {
                sb.append((String) list2.get(indexOf));
                sb.append(" -> ");
            }
            sb.append(str);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "output.toString()");
            throw new C12741cj(sb2);
        }
        List<String> list3 = map.get(str);
        if (!(list3 == null || list3.isEmpty())) {
            for (String str2 : list3) {
                if (map.containsKey(str2)) {
                    set.add(str);
                    m36026a(str2, map, set, list);
                    set.remove(str);
                }
            }
        }
        list.add(str);
        map.remove(str);
    }
}
