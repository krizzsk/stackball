package com.moat.analytics.mobile.inm;

import android.app.Application;
import com.moat.analytics.mobile.inm.C7270v;

public abstract class MoatAnalytics {

    /* renamed from: a */
    private static MoatAnalytics f18091a;

    public static synchronized MoatAnalytics getInstance() {
        MoatAnalytics moatAnalytics;
        synchronized (MoatAnalytics.class) {
            if (f18091a == null) {
                try {
                    f18091a = new C7250k();
                } catch (Exception e) {
                    C7252m.m18508a(e);
                    f18091a = new C7270v.C7271a();
                }
            }
            moatAnalytics = f18091a;
        }
        return moatAnalytics;
    }

    public abstract void prepareNativeDisplayTracking(String str);

    public abstract void start(Application application);

    public abstract void start(MoatOptions moatOptions, Application application);
}
