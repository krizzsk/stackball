package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Dk */
class C10195Dk implements C11693ql {

    /* renamed from: a */
    private final C10898Wn f24524a;

    C10195Dk() {
        this(new C10898Wn());
    }

    /* renamed from: a */
    public Bundle mo61202a(Activity activity) {
        ActivityInfo activityInfo;
        C10898Wn wn = this.f24524a;
        ComponentName componentName = activity.getComponentName();
        wn.getClass();
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    C10195Dk(C10898Wn wn) {
        this.f24524a = wn;
    }
}
