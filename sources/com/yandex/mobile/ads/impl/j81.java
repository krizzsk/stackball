package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15550v;

public class j81 {

    /* renamed from: a */
    private final k41 f35150a;

    /* renamed from: b */
    private final ed0 f35151b;

    /* renamed from: c */
    private final i81 f35152c;

    /* renamed from: d */
    private final tx0 f35153d;

    public j81(Context context, k41 k41, C15550v vVar) {
        this.f35150a = k41;
        this.f35151b = vVar.mo71925d();
        this.f35152c = new i81(context);
        this.f35153d = new tx0(context);
    }

    /* renamed from: a */
    public void mo67944a(Context context, f81 f81) {
        Bitmap a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(f81.mo66940d()));
        if (this.f35153d.mo70242a(intent) && (a = this.f35151b.mo66167a(this.f35152c.mo67750a(f81.mo66938b()))) != null) {
            ((C13198gf) this.f35150a).mo67276a(h41.C13276b.SHORTCUT);
            String c = f81.mo66939c();
            Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            intent2.putExtra("android.intent.extra.shortcut.NAME", c);
            intent2.putExtra("android.intent.extra.shortcut.ICON", a);
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
            intent2.putExtra("duplicate", false);
            try {
                context.sendBroadcast(intent2);
            } catch (Exception unused) {
            }
        }
    }
}
