package p269io.presage.common.network.models;

import com.ogury.p245ed.internal.C8467mq;
import java.io.Serializable;

/* renamed from: io.presage.common.network.models.RewardItem */
public final class RewardItem implements Serializable {

    /* renamed from: a */
    private String f44182a;

    /* renamed from: b */
    private String f44183b;

    public static /* synthetic */ RewardItem copy$default(RewardItem rewardItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardItem.f44182a;
        }
        if ((i & 2) != 0) {
            str2 = rewardItem.f44183b;
        }
        return rewardItem.copy(str, str2);
    }

    public final String component1() {
        return this.f44182a;
    }

    public final String component2() {
        return this.f44183b;
    }

    public final RewardItem copy(String str, String str2) {
        C8467mq.m23881b(str, "name");
        C8467mq.m23881b(str2, "value");
        return new RewardItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardItem)) {
            return false;
        }
        RewardItem rewardItem = (RewardItem) obj;
        return C8467mq.m23880a((Object) this.f44182a, (Object) rewardItem.f44182a) && C8467mq.m23880a((Object) this.f44183b, (Object) rewardItem.f44183b);
    }

    public final int hashCode() {
        return (this.f44182a.hashCode() * 31) + this.f44183b.hashCode();
    }

    public final String toString() {
        return "RewardItem(name=" + this.f44182a + ", value=" + this.f44183b + ')';
    }

    public RewardItem(String str, String str2) {
        C8467mq.m23881b(str, "name");
        C8467mq.m23881b(str2, "value");
        this.f44182a = str;
        this.f44183b = str2;
    }

    public final String getName() {
        return this.f44182a;
    }

    public final String getValue() {
        return this.f44183b;
    }

    public final void setName(String str) {
        C8467mq.m23881b(str, "<set-?>");
        this.f44182a = str;
    }

    public final void setValue(String str) {
        C8467mq.m23881b(str, "<set-?>");
        this.f44183b = str;
    }
}
