package com.smaato.sdk.richmedia.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import java.util.concurrent.atomic.AtomicBoolean;

final class OrientationBroadcastReceiver extends BroadcastReceiver {
    final Context context;
    final AtomicBoolean isRegistered = new AtomicBoolean();
    final ChangeSender<Whatever> orientationChangeSender;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.smaato.sdk.core.util.notifier.ChangeSender<com.smaato.sdk.core.util.Whatever>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    OrientationBroadcastReceiver(android.content.Context r2, com.smaato.sdk.core.util.notifier.ChangeSender<com.smaato.sdk.core.util.Whatever> r3) {
        /*
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.isRegistered = r0
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.context = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.util.notifier.ChangeSender r2 = (com.smaato.sdk.core.util.notifier.ChangeSender) r2
            r1.orientationChangeSender = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.framework.OrientationBroadcastReceiver.<init>(android.content.Context, com.smaato.sdk.core.util.notifier.ChangeSender):void");
    }

    public final void onReceive(Context context2, Intent intent) {
        if (intent != null && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction())) {
            this.orientationChangeSender.newValue(Whatever.INSTANCE);
        }
    }
}
