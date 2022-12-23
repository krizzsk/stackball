package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONObject;

public final class py0 {
    /* renamed from: a */
    public static final oy0 m41002a(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        qy0 qy0 = qy0.MISSING_VALUE;
        return new oy0(qy0, "Value for key '" + str + "' is missing", (Throwable) null, new yh0(jSONObject), hi0.m36984a(jSONObject, 0, 1), 4);
    }

    /* renamed from: b */
    public static final oy0 m41007b(JSONObject jSONObject, String str, Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(obj, "value");
        qy0 qy0 = qy0.TYPE_MISMATCH;
        return new oy0(qy0, "Value for key '" + str + "' has wrong type " + obj.getClass().getName(), (Throwable) null, new yh0(jSONObject), hi0.m36984a(jSONObject, 0, 1), 4);
    }

    /* renamed from: a */
    public static final oy0 m40998a(String str, String str2, Object obj, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "expressionKey");
        Intrinsics.checkNotNullParameter(str2, "rawExpression");
        qy0 qy0 = qy0.TYPE_MISMATCH;
        return new oy0(qy0, "Expression \"" + str + "\": \"" + str2 + "\" received value of wrong type: '" + obj + '\'', th, (wh0) null, (String) null, 24);
    }

    /* renamed from: b */
    public static final oy0 m41006b(JSONArray jSONArray, String str, int i, Object obj) {
        Intrinsics.checkNotNullParameter(jSONArray, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(obj, "value");
        qy0 qy0 = qy0.TYPE_MISMATCH;
        return new oy0(qy0, "Value at " + i + " position of '" + str + "' has wrong type " + obj.getClass().getName(), (Throwable) null, new xh0(jSONArray), hi0.m36983a(jSONArray, 0, 1), 4);
    }

    /* renamed from: a */
    public static final <T> oy0 m41004a(JSONObject jSONObject, String str, T t) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        qy0 qy0 = qy0.INVALID_VALUE;
        return new oy0(qy0, "Value '" + t + "' for key '" + str + "' is not valid", (Throwable) null, new yh0(jSONObject), hi0.m36984a(jSONObject, 0, 1), 4);
    }

    /* renamed from: a */
    public static final <T> oy0 m41005a(JSONObject jSONObject, String str, T t, Throwable th) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(th, "cause");
        qy0 qy0 = qy0.INVALID_VALUE;
        return new oy0(qy0, "Value '" + t + "' for key '" + str + "' is not valid", th, new yh0(jSONObject), (String) null, 16);
    }

    /* renamed from: a */
    public static final <T> oy0 m41001a(JSONArray jSONArray, String str, int i, T t, Throwable th) {
        Intrinsics.checkNotNullParameter(jSONArray, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(th, "cause");
        qy0 qy0 = qy0.INVALID_VALUE;
        return new oy0(qy0, "Value '" + t + "' at " + i + " position of '" + str + "' is not valid", th, new xh0(jSONArray), (String) null, 16);
    }

    /* renamed from: a */
    public static final <T> oy0 m41000a(JSONArray jSONArray, String str, int i, T t) {
        Intrinsics.checkNotNullParameter(jSONArray, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        qy0 qy0 = qy0.INVALID_VALUE;
        return new oy0(qy0, "Value '" + t + "' at " + i + " position of '" + str + "' is not valid", (Throwable) null, new xh0(jSONArray), hi0.m36983a(jSONArray, 0, 1), 4);
    }

    /* renamed from: a */
    public static final <T> oy0 m40996a(String str, T t) {
        Intrinsics.checkNotNullParameter(str, "path");
        qy0 qy0 = qy0.INVALID_VALUE;
        return new oy0(qy0, "Value '" + t + "' at path '" + str + "' is not valid", (Throwable) null, (wh0) null, (String) null, 28);
    }

    /* renamed from: a */
    public static final <T> oy0 m40997a(String str, String str2, T t) {
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(str2, "path");
        qy0 qy0 = qy0.INVALID_VALUE;
        return new oy0(qy0, "Value '" + t + "' for key '" + str + "' at path '" + str2 + "' is not valid", (Throwable) null, (wh0) null, (String) null, 28);
    }

    /* renamed from: a */
    public static final oy0 m40999a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(str2, "expression");
        Intrinsics.checkNotNullParameter(str3, "variableName");
        qy0 qy0 = qy0.MISSING_VARIABLE;
        return new oy0(qy0, "Undefined variable '" + str3 + "' at \"" + str + "\": \"" + str2 + Typography.quote, (Throwable) null, (wh0) null, (String) null, 28);
    }

    /* renamed from: a */
    public static final oy0 m41003a(JSONObject jSONObject, String str, oy0 oy0) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(oy0, "cause");
        qy0 qy0 = qy0.DEPENDENCY_FAILED;
        return new oy0(qy0, "Value for key '" + str + "' is failed to create", oy0, new yh0(jSONObject), hi0.m36984a(jSONObject, 0, 1));
    }
}
