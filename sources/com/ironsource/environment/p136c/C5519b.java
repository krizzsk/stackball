package com.ironsource.environment.p136c;

import com.ironsource.environment.C5530i;
import com.ironsource.environment.p135b.C5516b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo72093d2 = {"Lcom/ironsource/environment/token/TokenProvider;", "", "()V", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "mTokenKeyList", "Ljava/util/ArrayList;", "", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getToken", "environment_release"}, mo72094k = 1, mo72095mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.c.b */
public final class C5519b {

    /* renamed from: a */
    private final ArrayList<String> f12725a = new ArrayList<>(new C5518a().f12724a);

    /* renamed from: b */
    private final C5530i f12726b = new C5530i();

    /* renamed from: a */
    public final JSONObject mo41244a() {
        JSONObject a = C5530i.m13183a(this.f12725a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        JSONObject a2 = C5516b.m13098a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        return a;
    }
}
