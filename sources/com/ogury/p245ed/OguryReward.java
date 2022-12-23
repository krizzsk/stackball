package com.ogury.p245ed;

import com.ogury.p245ed.internal.C8467mq;
import java.io.Serializable;

/* renamed from: com.ogury.ed.OguryReward */
public final class OguryReward implements Serializable {

    /* renamed from: a */
    private final String f20797a;

    /* renamed from: b */
    private final String f20798b;

    public static /* synthetic */ OguryReward copy$default(OguryReward oguryReward, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oguryReward.f20797a;
        }
        if ((i & 2) != 0) {
            str2 = oguryReward.f20798b;
        }
        return oguryReward.copy(str, str2);
    }

    public final String component1() {
        return this.f20797a;
    }

    public final String component2() {
        return this.f20798b;
    }

    public final OguryReward copy(String str, String str2) {
        C8467mq.m23881b(str, "name");
        C8467mq.m23881b(str2, "value");
        return new OguryReward(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OguryReward)) {
            return false;
        }
        OguryReward oguryReward = (OguryReward) obj;
        return C8467mq.m23880a((Object) this.f20797a, (Object) oguryReward.f20797a) && C8467mq.m23880a((Object) this.f20798b, (Object) oguryReward.f20798b);
    }

    public final int hashCode() {
        return (this.f20797a.hashCode() * 31) + this.f20798b.hashCode();
    }

    public final String toString() {
        return "OguryReward(name=" + this.f20797a + ", value=" + this.f20798b + ')';
    }

    public OguryReward(String str, String str2) {
        C8467mq.m23881b(str, "name");
        C8467mq.m23881b(str2, "value");
        this.f20797a = str;
        this.f20798b = str2;
    }

    public final String getName() {
        return this.f20797a;
    }

    public final String getValue() {
        return this.f20798b;
    }
}
