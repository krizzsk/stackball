package com.smaato.sdk.richmedia.framework;

import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidSupportsProperties;

/* renamed from: com.smaato.sdk.richmedia.framework.-$$Lambda$RichMediaModuleInterface$Z5SK5vrJStgUJVK-420-RfIRwPs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RichMediaModuleInterface$Z5SK5vrJStgUJVK420RfIRwPs implements Consumer {
    public static final /* synthetic */ $$Lambda$RichMediaModuleInterface$Z5SK5vrJStgUJVK420RfIRwPs INSTANCE = new $$Lambda$RichMediaModuleInterface$Z5SK5vrJStgUJVK420RfIRwPs();

    private /* synthetic */ $$Lambda$RichMediaModuleInterface$Z5SK5vrJStgUJVK420RfIRwPs() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).registerFactory(MraidSupportsProperties.class, $$Lambda$RichMediaModuleInterface$1ojrBKWBrcDhNwbB_IIsYoyGPgU.INSTANCE);
    }
}
