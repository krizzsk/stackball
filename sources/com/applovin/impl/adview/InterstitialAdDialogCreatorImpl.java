package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.adview.InterstitialAdDialogCreator;
import com.applovin.impl.sdk.C1505q;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

public class InterstitialAdDialogCreatorImpl implements InterstitialAdDialogCreator {

    /* renamed from: a */
    private static final Object f1818a = new Object();

    /* renamed from: b */
    private static WeakReference<C1138o> f1819b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private static WeakReference<Context> f1820c = new WeakReference<>((Object) null);

    public AppLovinInterstitialAdDialog createInterstitialAdDialog(AppLovinSdk appLovinSdk, Context context) {
        C1138o oVar;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        synchronized (f1818a) {
            oVar = (C1138o) f1819b.get();
            if (oVar != null) {
                if (f1820c.get() == context) {
                    C1505q.m3345i("InterstitialAdDialogCreator", "An interstitial dialog is already showing, returning it");
                }
            }
            oVar = new C1138o(appLovinSdk, context);
            f1819b = new WeakReference<>(oVar);
            f1820c = new WeakReference<>(context);
        }
        return oVar;
    }
}
