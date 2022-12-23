package com.p243my.target.common;

import android.content.Context;
import com.p243my.target.C7374e0;
import com.p243my.target.C7395f0;
import com.p243my.target.C7456i5;
import com.p243my.target.C7553m8;
import com.p243my.target.C7591o8;
import com.p243my.target.common.MyTargetConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.common.MyTargetManager */
public final class MyTargetManager {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static volatile MyTargetConfig myTargetConfig = new MyTargetConfig.Builder().build();

    public static String getBidderToken(Context context) {
        C7456i5 c = C7456i5.m19373c();
        c.mo50398a(MyTargetPrivacy.currentPrivacy().isConsent());
        return c.mo50396a(context);
    }

    public static MyTargetConfig getSdkConfig() {
        return myTargetConfig;
    }

    public static void initSdk(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            C7374e0.m18991c("MyTarget cannot be initialized due to a null application context");
        } else if (INITIALIZED.compareAndSet(false, true)) {
            C7374e0.m18991c("MyTarget initialization");
            C7395f0.m19086a(new Runnable(applicationContext) {
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    MyTargetManager.lambda$initSdk$0(this.f$0);
                }
            });
        }
    }

    static /* synthetic */ void lambda$initSdk$0(Context context) {
        C7553m8.m19858a(context);
        C7456i5.m19373c().mo50401c(context);
        C7591o8.m20042a(context);
    }

    public static void setDebugMode(boolean z) {
        C7374e0.f18489a = z;
        if (z) {
            C7374e0.m18989a("Debug mode enabled");
        }
    }

    public static void setSdkConfig(MyTargetConfig myTargetConfig2) {
        myTargetConfig = myTargetConfig2;
    }
}
