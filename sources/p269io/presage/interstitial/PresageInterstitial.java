package p269io.presage.interstitial;

import android.content.Context;
import com.ogury.p245ed.OguryAdClickCallback;
import com.ogury.p245ed.internal.C8068bm;
import com.ogury.p245ed.internal.C8193ej;
import com.ogury.p245ed.internal.C8270gs;
import com.ogury.p245ed.internal.C8276gw;
import com.ogury.p245ed.internal.C8280h;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8534t;
import p269io.presage.common.AdConfig;

@Deprecated
/* renamed from: io.presage.interstitial.PresageInterstitial */
public final class PresageInterstitial {

    /* renamed from: a */
    private final C8068bm f44186a;

    /* renamed from: b */
    private final C8270gs f44187b;

    private PresageInterstitial(C8068bm bmVar) {
        this.f44186a = bmVar;
        this.f44187b = new C8270gs();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageInterstitial(Context context) {
        this(context, (AdConfig) null);
        C8467mq.m23881b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PresageInterstitial(Context context, AdConfig adConfig) {
        this(new C8068bm(context, adConfig, C8193ej.INTERSTITIAL));
        C8467mq.m23881b(context, "context");
    }

    public final boolean isLoaded() {
        return this.f44186a.mo53220b();
    }

    public final void setInterstitialCallback(PresageInterstitialCallback presageInterstitialCallback) {
        this.f44186a.mo53214a((C8280h) this.f44187b.mo53623a(presageInterstitialCallback));
    }

    public final void setOnAdClickedCallback(OguryAdClickCallback oguryAdClickCallback) {
        this.f44187b.mo53624a(oguryAdClickCallback);
    }

    public final void load() {
        this.f44186a.mo53213a();
    }

    public final void show() {
        this.f44186a.mo53217a((C8534t) C8276gw.f21393a);
    }
}
