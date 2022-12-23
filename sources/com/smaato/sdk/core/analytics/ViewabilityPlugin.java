package com.smaato.sdk.core.analytics;

import android.content.Context;
import com.smaato.sdk.core.p249di.DiRegistry;

public interface ViewabilityPlugin {
    DiRegistry diRegistry();

    String getName();

    void init(Context context);
}
