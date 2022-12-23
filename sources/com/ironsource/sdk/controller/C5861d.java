package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C5923w;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.ironsource.sdk.controller.d */
class C5861d {

    /* renamed from: b */
    private static final String f14296b = C5861d.class.getSimpleName();

    /* renamed from: a */
    final C5923w.C5942d f14297a;

    C5861d(C5923w.C5942d dVar) {
        this.f14297a = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo42248a(String str, String str2) {
        if (this.f14297a == null) {
            Logger.m14955e(f14296b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C5923w.C5942d.class.getDeclaredMethod(str, new Class[]{String.class});
        if (Build.VERSION.SDK_INT >= 17) {
            if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
                throw new AccessControlException("Trying to access a private function: " + str);
            }
        }
        declaredMethod.invoke(this.f14297a, new Object[]{str2});
    }
}
