package com.smaato.sdk.res;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.smaato.sdk.SmaatoBridge;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class IntentLauncherImpl implements IntentLauncher {
    private final SmaatoBridge bridge;
    private final Context context;

    @Inject
    IntentLauncherImpl(Context context2, SmaatoBridge smaatoBridge) {
        this.context = context2;
        this.bridge = smaatoBridge;
    }

    public void launch(Intent intent) {
        if (intent != null) {
            Activity activity = this.bridge.activityProvider().get();
            if (activity != null) {
                activity.startActivity(intent);
            } else {
                this.context.startActivity(intent.addFlags(268435456));
            }
        } else {
            throw new NullPointerException("'intent' specified as non-null is null");
        }
    }
}
