package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Fk */
class C10262Fk implements C11693ql {

    /* renamed from: a */
    private final Bundle f24704a;

    C10262Fk(Context context) {
        this(context, new C10898Wn());
    }

    /* renamed from: a */
    public Bundle mo61202a(Activity activity) {
        return this.f24704a;
    }

    C10262Fk(Context context, C10898Wn wn) {
        ApplicationInfo a = wn.mo62460a(context, context.getPackageName(), 128);
        if (a != null) {
            this.f24704a = a.metaData;
        } else {
            this.f24704a = null;
        }
    }
}
