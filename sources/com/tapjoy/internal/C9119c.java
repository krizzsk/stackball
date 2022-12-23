package com.tapjoy.internal;

import android.app.Dialog;
import android.content.Context;

/* renamed from: com.tapjoy.internal.c */
public final class C9119c extends Dialog {

    /* renamed from: a */
    private boolean f22436a = false;

    public C9119c(Context context) {
        super(context, 16973835);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(17170445);
    }

    public final void show() {
        this.f22436a = false;
        super.show();
    }

    public final void cancel() {
        this.f22436a = true;
        super.cancel();
    }
}
