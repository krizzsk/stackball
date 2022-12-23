package com.facebook.appevents.p028ml;

import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.ml.ModelManager$enableMTML$1 */
/* compiled from: ModelManager.kt */
final class ModelManager$enableMTML$1 implements Runnable {
    public static final ModelManager$enableMTML$1 INSTANCE = new ModelManager$enableMTML$1();

    ModelManager$enableMTML$1() {
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                SuggestedEventsManager.enable();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
