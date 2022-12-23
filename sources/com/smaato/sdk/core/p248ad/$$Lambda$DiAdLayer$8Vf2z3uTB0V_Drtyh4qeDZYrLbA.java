package com.smaato.sdk.core.p248ad;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;

/* renamed from: com.smaato.sdk.core.ad.-$$Lambda$DiAdLayer$8Vf2z3uTB0V_Drtyh4qeDZYrLbA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiAdLayer$8Vf2z3uTB0V_Drtyh4qeDZYrLbA implements ClassFactory {
    public static final /* synthetic */ $$Lambda$DiAdLayer$8Vf2z3uTB0V_Drtyh4qeDZYrLbA INSTANCE = new $$Lambda$DiAdLayer$8Vf2z3uTB0V_Drtyh4qeDZYrLbA();

    private /* synthetic */ $$Lambda$DiAdLayer$8Vf2z3uTB0V_Drtyh4qeDZYrLbA() {
    }

    public final Object get(DiConstructor diConstructor) {
        return PreferenceManager.getDefaultSharedPreferences((Context) diConstructor.get(Application.class));
    }
}
