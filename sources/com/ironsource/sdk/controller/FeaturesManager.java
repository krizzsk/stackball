package com.ironsource.sdk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FeaturesManager {

    /* renamed from: a */
    private static volatile FeaturesManager f14263a;

    /* renamed from: b */
    private Map<String, ?> f14264b;

    /* renamed from: c */
    private ArrayList<String> f14265c = new ArrayList<String>() {
        {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
        }
    };

    private FeaturesManager() {
        if (f14263a == null) {
            this.f14264b = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f14263a == null) {
            synchronized (FeaturesManager.class) {
                if (f14263a == null) {
                    f14263a = new FeaturesManager();
                }
            }
        }
        return f14263a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList<String> mo42222a() {
        return new ArrayList<>(this.f14265c);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f14264b.containsKey("debugMode")) {
                num = (Integer) this.f14264b.get("debugMode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map != null) {
            this.f14264b = map;
        }
    }
}
