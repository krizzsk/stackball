package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ba1 implements C12714ca<aa1> {

    /* renamed from: a */
    private final z91 f31280a = new z91();

    /* renamed from: b */
    private final C12372ab f31281b = new C12372ab();

    /* renamed from: b */
    public aa1 mo65715a(JSONObject jSONObject) throws JSONException {
        s91 s91;
        C15300za zaVar;
        Intrinsics.checkNotNullParameter(jSONObject, "jsonValue");
        Object opt = jSONObject.opt("ColorWizButton");
        ArrayList arrayList = null;
        String str = opt instanceof String ? (String) opt : null;
        Object opt2 = jSONObject.opt("ColorWizButtonText");
        String str2 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jSONObject.opt("ColorWizBack");
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jSONObject.opt("ColorWizBackRight");
        String str4 = opt4 instanceof String ? (String) opt4 : null;
        JSONObject optJSONObject = jSONObject.optJSONObject("backgroundColors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("smart-center");
        JSONArray optJSONArray = jSONObject.optJSONArray("smart-centers");
        if (optJSONObject2 == null) {
            s91 = null;
        } else {
            s91 = this.f31280a.mo65715a(optJSONObject2);
        }
        if (optJSONObject == null) {
            zaVar = null;
        } else {
            zaVar = this.f31281b.mo65715a(optJSONObject);
        }
        if (optJSONArray != null) {
            IntRange until = RangesKt.until(0, optJSONArray.length());
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                z91 z91 = this.f31280a;
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(nextInt);
                Intrinsics.checkNotNullExpressionValue(optJSONObject3, "smartCentersJsonArray.optJSONObject(index)");
                arrayList.add(z91.mo65715a(optJSONObject3));
            }
        }
        return new aa1(str, str2, str3, str4, zaVar, s91, arrayList);
    }
}
