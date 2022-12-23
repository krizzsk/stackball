package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.mobile.ads.impl.n0 */
public class C14049n0 implements C13371i0 {

    /* renamed from: a */
    private final Activity f37615a;

    /* renamed from: b */
    private final ResultReceiver f37616b;

    public C14049n0(Activity activity, ResultReceiver resultReceiver) {
        this.f37615a = activity;
        this.f37616b = resultReceiver;
    }

    /* renamed from: a */
    public void mo68876a(int i) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f37615a.setRequestedOrientation(i);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo68877a(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.f37616b;
        if (resultReceiver != null) {
            resultReceiver.send(i, bundle);
        }
    }

    /* renamed from: a */
    public void mo68875a() {
        this.f37615a.finish();
    }
}
