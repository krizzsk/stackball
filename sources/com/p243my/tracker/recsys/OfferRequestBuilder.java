package com.p243my.tracker.recsys;

import android.os.Handler;
import com.p243my.tracker.obfuscated.C7806d;
import com.p243my.tracker.recsys.OfferRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.tracker.recsys.OfferRequestBuilder */
public final class OfferRequestBuilder {

    /* renamed from: a */
    private final String f20216a;

    /* renamed from: b */
    private final List<String> f20217b = new ArrayList();

    /* renamed from: c */
    private String f20218c = null;

    /* renamed from: d */
    private Boolean f20219d = null;

    /* renamed from: e */
    private OfferRequest.OnCompleteListener f20220e;

    /* renamed from: f */
    private Handler f20221f = C7806d.f19851a;

    private OfferRequestBuilder(String str) {
        this.f20216a = str;
    }

    public static OfferRequestBuilder newBuilder(String str) {
        return new OfferRequestBuilder(str);
    }

    public OfferRequest build() {
        return new OfferRequest(this.f20216a, this.f20217b, this.f20218c, this.f20219d, this.f20220e, this.f20221f);
    }

    public OfferRequestBuilder withData(String str) {
        this.f20218c = str;
        return this;
    }

    public OfferRequestBuilder withHandler(Handler handler) {
        this.f20221f = handler;
        return this;
    }

    public OfferRequestBuilder withPlacementIds(String... strArr) {
        if (!this.f20217b.isEmpty()) {
            this.f20217b.clear();
        }
        if (strArr == null) {
            return this;
        }
        for (String str : strArr) {
            if (str != null && !this.f20217b.contains(str)) {
                this.f20217b.add(str);
            }
        }
        return this;
    }

    public OfferRequestBuilder withRequestListener(OfferRequest.OnCompleteListener onCompleteListener) {
        this.f20220e = onCompleteListener;
        return this;
    }

    public OfferRequestBuilder withReset(boolean z) {
        this.f20219d = Boolean.valueOf(z);
        return this;
    }
}
