package p269io.presage.interstitial.optinvideo;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.p245ed.OguryAdClickCallback;
import com.ogury.p245ed.internal.C8068bm;
import com.ogury.p245ed.internal.C8193ej;
import com.ogury.p245ed.internal.C8270gs;
import com.ogury.p245ed.internal.C8276gw;
import com.ogury.p245ed.internal.C8280h;
import com.ogury.p245ed.internal.C8386ke;
import com.ogury.p245ed.internal.C8432lk;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8468mr;
import com.ogury.p245ed.internal.C8534t;
import p269io.presage.common.AdConfig;
import p269io.presage.common.network.models.RewardItem;
import p269io.presage.interstitial.PresageInterstitialCallback;

@Deprecated
/* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideo */
public final class PresageOptinVideo {

    /* renamed from: a */
    private final C8068bm f44188a;

    /* renamed from: b */
    private final C8270gs f44189b;

    private PresageOptinVideo(C8068bm bmVar) {
        this.f44188a = bmVar;
        this.f44189b = new C8270gs();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageOptinVideo(Context context, AdConfig adConfig) {
        this(new C8068bm(context, adConfig, C8193ej.OPTIN_VIDEO));
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(adConfig, "adConfig");
    }

    public final boolean isLoaded() {
        return this.f44188a.mo53220b();
    }

    /* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideo$a */
    static final class C15580a extends C8468mr implements C8432lk<RewardItem, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ PresageOptinVideoCallback f44190a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15580a(PresageOptinVideoCallback presageOptinVideoCallback) {
            super(1);
            this.f44190a = presageOptinVideoCallback;
        }

        /* renamed from: a */
        private void m45486a(RewardItem rewardItem) {
            C8467mq.m23881b(rewardItem, "rewardItem");
            PresageOptinVideoCallback presageOptinVideoCallback = this.f44190a;
            if (presageOptinVideoCallback != null) {
                presageOptinVideoCallback.onAdRewarded(rewardItem);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m45486a((RewardItem) obj);
            return C8386ke.f21633a;
        }
    }

    public final void setOptinVideoCallback(PresageOptinVideoCallback presageOptinVideoCallback) {
        this.f44188a.mo53214a((C8280h) this.f44189b.mo53623a((PresageInterstitialCallback) presageOptinVideoCallback));
        this.f44188a.mo53216a((C8432lk<? super RewardItem, C8386ke>) new C15580a(presageOptinVideoCallback));
    }

    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f44189b.mo53624a(oguryAdClickCallback);
    }

    public final void load() {
        this.f44188a.mo53213a();
    }

    public final void show() {
        this.f44188a.mo53217a((C8534t) C8276gw.f21393a);
    }

    public final void setUserId(String str) {
        C8467mq.m23881b(str, DataKeys.USER_ID);
        this.f44188a.mo53218a(str);
    }
}
