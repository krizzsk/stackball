package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.C12066R;

/* renamed from: com.yandex.mobile.ads.impl.e6 */
public class C12957e6 {

    /* renamed from: a */
    private final C12572b6 f32915a;

    /* renamed from: b */
    private final C12854d6 f32916b = new C12854d6();

    /* renamed from: c */
    private final Context f32917c;

    C12957e6(Context context, C13476j6 j6Var) {
        this.f32917c = context;
        this.f32915a = new C12572b6(context, j6Var);
    }

    /* renamed from: a */
    public Dialog mo66769a() {
        Dialog dialog = new Dialog(this.f32917c, C12066R.style.YandexAdsInternal_BottomAdtuneDialog);
        View a = this.f32915a.mo66008a();
        this.f32916b.mo66429a(a, dialog);
        dialog.setContentView(a);
        dialog.getWindow().setGravity(80);
        return dialog;
    }
}
