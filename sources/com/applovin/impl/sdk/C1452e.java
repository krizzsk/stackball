package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e */
public class C1452e extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    public static int f3420a = -1;

    /* renamed from: b */
    private final AudioManager f3421b;

    /* renamed from: c */
    private final Context f3422c;

    /* renamed from: d */
    private final C1469j f3423d;

    /* renamed from: e */
    private final Set<C1454a> f3424e = new HashSet();

    /* renamed from: f */
    private final Object f3425f = new Object();

    /* renamed from: g */
    private boolean f3426g;

    /* renamed from: h */
    private int f3427h;

    /* renamed from: com.applovin.impl.sdk.e$a */
    public interface C1454a {
        void onRingerModeChanged(int i);
    }

    C1452e(C1469j jVar) {
        this.f3423d = jVar;
        Context D = jVar.mo13065D();
        this.f3422c = D;
        this.f3421b = (AudioManager) D.getSystemService("audio");
    }

    /* renamed from: a */
    public static boolean m2996a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    private void m2997b() {
        this.f3423d.mo13139v().mo13277b("AudioSessionManager", "Observing ringer mode...");
        this.f3427h = f3420a;
        this.f3422c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f3423d.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f3423d.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: b */
    private void m2998b(final int i) {
        if (!this.f3426g) {
            C1505q v = this.f3423d.mo13139v();
            v.mo13277b("AudioSessionManager", "Ringer mode is " + i);
            synchronized (this.f3425f) {
                for (final C1454a next : this.f3424e) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            next.onRingerModeChanged(i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: c */
    private void m2999c() {
        this.f3423d.mo13139v().mo13277b("AudioSessionManager", "Stopping observation of mute switch state...");
        this.f3422c.unregisterReceiver(this);
        this.f3423d.mo13108ae().unregisterReceiver(this);
    }

    /* renamed from: a */
    public int mo13039a() {
        return this.f3421b.getRingerMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13040a(com.applovin.impl.sdk.C1452e.C1454a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3425f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.e$a> r1 = r2.f3424e     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.e$a> r1 = r2.f3424e     // Catch:{ all -> 0x0020 }
            r1.add(r3)     // Catch:{ all -> 0x0020 }
            java.util.Set<com.applovin.impl.sdk.e$a> r3 = r2.f3424e     // Catch:{ all -> 0x0020 }
            int r3 = r3.size()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r3 != r1) goto L_0x001e
            r2.m2997b()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1452e.mo13040a(com.applovin.impl.sdk.e$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13041b(com.applovin.impl.sdk.C1452e.C1454a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f3425f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.e$a> r1 = r2.f3424e     // Catch:{ all -> 0x001f }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.e$a> r1 = r2.f3424e     // Catch:{ all -> 0x001f }
            r1.remove(r3)     // Catch:{ all -> 0x001f }
            java.util.Set<com.applovin.impl.sdk.e$a> r3 = r2.f3424e     // Catch:{ all -> 0x001f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            r2.m2999c()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1452e.mo13041b(com.applovin.impl.sdk.e$a):void");
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            m2998b(this.f3421b.getRingerMode());
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3426g = true;
            this.f3427h = this.f3421b.getRingerMode();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f3426g = false;
            if (this.f3427h != this.f3421b.getRingerMode()) {
                this.f3427h = f3420a;
                m2998b(this.f3421b.getRingerMode());
            }
        }
    }
}
