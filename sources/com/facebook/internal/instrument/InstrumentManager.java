package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo72092d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, mo72093d2 = {"Lcom/facebook/internal/instrument/InstrumentManager;", "", "()V", "start", "", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: InstrumentManager.kt */
public final class InstrumentManager {
    public static final InstrumentManager INSTANCE = new InstrumentManager();

    private InstrumentManager() {
    }

    @JvmStatic
    public static final void start() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, InstrumentManager$start$1.INSTANCE);
            FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, InstrumentManager$start$2.INSTANCE);
            FeatureManager.checkFeature(FeatureManager.Feature.AnrReport, InstrumentManager$start$3.INSTANCE);
        }
    }
}
