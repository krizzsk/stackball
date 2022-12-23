package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.core.ad.-$$Lambda$AdLoader$ayCf2_bsV1DXmhFgwxOFxw1fD44  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$AdLoader$ayCf2_bsV1DXmhFgwxOFxw1fD44 implements Consumer {
    public static final /* synthetic */ $$Lambda$AdLoader$ayCf2_bsV1DXmhFgwxOFxw1fD44 INSTANCE = new $$Lambda$AdLoader$ayCf2_bsV1DXmhFgwxOFxw1fD44();

    private /* synthetic */ $$Lambda$AdLoader$ayCf2_bsV1DXmhFgwxOFxw1fD44() {
    }

    public final void accept(Object obj) {
        ((AdLoader.TaskRequestHolder) obj).task.cancel();
    }
}
