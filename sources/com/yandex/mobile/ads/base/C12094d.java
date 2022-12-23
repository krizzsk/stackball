package com.yandex.mobile.ads.base;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.C12348a0;
import com.yandex.mobile.ads.impl.C12468b0;
import com.yandex.mobile.ads.impl.C12947e0;
import com.yandex.mobile.ads.impl.C13371i0;

/* renamed from: com.yandex.mobile.ads.base.d */
class C12094d implements C12468b0 {
    C12094d() {
    }

    /* renamed from: a */
    public C12348a0 mo64515a(Context context, RelativeLayout relativeLayout, ResultReceiver resultReceiver, C13371i0 i0Var, C12947e0 e0Var, Intent intent, Window window) {
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (!TextUtils.isEmpty(stringExtra)) {
            return new C12093c(context, relativeLayout, i0Var, window, stringExtra);
        }
        return null;
    }
}
