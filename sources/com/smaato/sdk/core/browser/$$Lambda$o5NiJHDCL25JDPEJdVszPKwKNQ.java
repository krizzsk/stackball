package com.smaato.sdk.core.browser;

import android.webkit.CookieSyncManager;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.core.browser.-$$Lambda$o5NiJHDCL25JDPEJdV-szPKwKNQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$o5NiJHDCL25JDPEJdVszPKwKNQ implements Consumer {
    public static final /* synthetic */ $$Lambda$o5NiJHDCL25JDPEJdVszPKwKNQ INSTANCE = new $$Lambda$o5NiJHDCL25JDPEJdVszPKwKNQ();

    private /* synthetic */ $$Lambda$o5NiJHDCL25JDPEJdVszPKwKNQ() {
    }

    public final void accept(Object obj) {
        ((CookieSyncManager) obj).stopSync();
    }
}
