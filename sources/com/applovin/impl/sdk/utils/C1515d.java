package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1469j;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.d */
public class C1515d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private static final Set<C1515d> f3702a = new HashSet();

    /* renamed from: b */
    private final C1554p f3703b;

    private C1515d(long j, final C1469j jVar, final Runnable runnable) {
        this.f3703b = C1554p.m3559a(j, jVar, new Runnable() {
            public void run() {
                jVar.mo13108ae().unregisterReceiver(C1515d.this);
                C1515d.this.mo13306a();
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        f3702a.add(this);
        jVar.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        jVar.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public static C1515d m3417a(long j, C1469j jVar, Runnable runnable) {
        return new C1515d(j, jVar, runnable);
    }

    /* renamed from: a */
    public void mo13306a() {
        this.f3703b.mo13347d();
        f3702a.remove(this);
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3703b.mo13345b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f3703b.mo13346c();
        }
    }
}
