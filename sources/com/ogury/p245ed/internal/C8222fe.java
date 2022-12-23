package com.ogury.p245ed.internal;

import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fe */
public final class C8222fe {

    /* renamed from: a */
    private final boolean f21285a;

    /* renamed from: b */
    private final long f21286b;

    /* renamed from: c */
    private final JSONObject f21287c;

    /* renamed from: d */
    private final boolean f21288d;

    /* renamed from: e */
    private final String f21289e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8222fe)) {
            return false;
        }
        C8222fe feVar = (C8222fe) obj;
        return this.f21285a == feVar.f21285a && this.f21286b == feVar.f21286b && C8467mq.m23880a((Object) this.f21287c, (Object) feVar.f21287c) && this.f21288d == feVar.f21288d && C8467mq.m23880a((Object) this.f21289e, (Object) feVar.f21289e);
    }

    public final int hashCode() {
        boolean z = this.f21285a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f21286b)) * 31) + this.f21287c.hashCode()) * 31;
        boolean z3 = this.f21288d;
        if (!z3) {
            z2 = z3;
        }
        int i = (hashCode + (z2 ? 1 : 0)) * 31;
        String str = this.f21289e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProfigRequest(allowRequest=" + this.f21285a + ", jobScheduleWindow=" + this.f21286b + ", request=" + this.f21287c + ", profigEnabled=" + this.f21288d + ", profigHash=" + this.f21289e + ')';
    }

    public /* synthetic */ C8222fe(long j, JSONObject jSONObject, boolean z) {
        this(false, j, jSONObject, z, (String) null);
    }

    public C8222fe(boolean z, long j, JSONObject jSONObject, boolean z2, String str) {
        C8467mq.m23881b(jSONObject, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        this.f21285a = z;
        this.f21286b = j;
        this.f21287c = jSONObject;
        this.f21288d = z2;
        this.f21289e = str;
    }

    /* renamed from: a */
    public final boolean mo53485a() {
        return this.f21285a;
    }

    /* renamed from: b */
    public final JSONObject mo53486b() {
        return this.f21287c;
    }

    /* renamed from: c */
    public final String mo53487c() {
        return this.f21289e;
    }
}
