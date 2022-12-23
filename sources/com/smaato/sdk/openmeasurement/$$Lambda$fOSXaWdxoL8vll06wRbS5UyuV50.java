package com.smaato.sdk.openmeasurement;

import com.iab.omid.library.smaato.adsession.video.VideoEvents;
import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$fOSXaWdxoL8vll06wRbS5UyuV50  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$fOSXaWdxoL8vll06wRbS5UyuV50 implements Consumer {
    public static final /* synthetic */ $$Lambda$fOSXaWdxoL8vll06wRbS5UyuV50 INSTANCE = new $$Lambda$fOSXaWdxoL8vll06wRbS5UyuV50();

    private /* synthetic */ $$Lambda$fOSXaWdxoL8vll06wRbS5UyuV50() {
    }

    public final void accept(Object obj) {
        ((VideoEvents) obj).complete();
    }
}
