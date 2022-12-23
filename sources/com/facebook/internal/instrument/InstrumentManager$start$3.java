package com.facebook.internal.instrument;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: InstrumentManager.kt */
final class InstrumentManager$start$3 implements FeatureManager.Callback {
    public static final InstrumentManager$start$3 INSTANCE = new InstrumentManager$start$3();

    InstrumentManager$start$3() {
    }

    public final void onCompleted(boolean z) {
        if (z) {
            ANRHandler.enable();
        }
    }
}
