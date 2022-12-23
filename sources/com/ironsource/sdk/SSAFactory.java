package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.p146d.C5980b;

@Deprecated
public class SSAFactory {
    public static C6000f getPublisherInstance(Activity activity) {
        return C5980b.m14743a((Context) activity);
    }

    public static C6000f getPublisherTestInstance(Activity activity, int i) {
        return C5980b.m14744a((Context) activity, i);
    }
}
