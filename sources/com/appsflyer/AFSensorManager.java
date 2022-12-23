package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.C1766r;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AFSensorManager {
    public static volatile AFSensorManager sInstance;

    /* renamed from: ɨ */
    private static final Handler f3972 = new Handler(Looper.getMainLooper());

    /* renamed from: І */
    private static final BitSet f3973 = new BitSet(6);

    /* renamed from: ı */
    final Runnable f3974 = new Runnable() {
        public final void run() {
            synchronized (AFSensorManager.this.f3983) {
                AFSensorManager aFSensorManager = AFSensorManager.this;
                aFSensorManager.f3975.execute(new Runnable() {
                    public final void run() {
                        try {
                            for (Sensor next : AFSensorManager.this.f3979.getSensorList(-1)) {
                                if (AFSensorManager.m3722(next.getType())) {
                                    C1766r rVar = new C1766r(next, AFSensorManager.this.f3975);
                                    if (!AFSensorManager.this.f3977.containsKey(rVar)) {
                                        AFSensorManager.this.f3977.put(rVar, rVar);
                                    }
                                    AFSensorManager.this.f3979.registerListener((SensorEventListener) AFSensorManager.this.f3977.get(rVar), next, 0);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        boolean unused2 = AFSensorManager.this.f3981 = true;
                    }
                });
                AFSensorManager.this.f3982.postDelayed(AFSensorManager.this.f3984, 100);
                AFSensorManager.this.f3978 = true;
            }
        }
    };
    /* access modifiers changed from: package-private */

    /* renamed from: Ɩ */
    public final Executor f3975 = Executors.newSingleThreadExecutor();

    /* renamed from: ǃ */
    final Runnable f3976 = new Runnable() {
        public final void run() {
            synchronized (AFSensorManager.this.f3983) {
                AFSensorManager aFSensorManager = AFSensorManager.this;
                aFSensorManager.f3975.execute(new Runnable() {
                    public final void run() {
                        try {
                            if (!AFSensorManager.this.f3977.isEmpty()) {
                                for (C1766r rVar : AFSensorManager.this.f3977.values()) {
                                    AFSensorManager.this.f3979.unregisterListener(rVar);
                                    rVar.mo14098(AFSensorManager.this.f3987, true);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        int unused2 = AFSensorManager.this.f3980 = 0;
                        boolean unused3 = AFSensorManager.this.f3981 = false;
                    }
                });
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ȷ */
    public final Map<C1766r, C1766r> f3977 = new HashMap(f3973.size());

    /* renamed from: ɩ */
    boolean f3978;
    /* access modifiers changed from: private */

    /* renamed from: ɪ */
    public final SensorManager f3979;
    /* access modifiers changed from: package-private */

    /* renamed from: ɹ */
    public int f3980 = 1;
    /* access modifiers changed from: private */

    /* renamed from: ɾ */
    public boolean f3981;

    /* renamed from: Ι */
    final Handler f3982;

    /* renamed from: ι */
    final Object f3983 = new Object();
    /* access modifiers changed from: private */

    /* renamed from: г */
    public final Runnable f3984 = new Runnable() {
        public final void run() {
            synchronized (AFSensorManager.this.f3983) {
                if (AFSensorManager.this.f3980 == 0) {
                    int unused = AFSensorManager.this.f3980 = 1;
                }
                AFSensorManager.this.f3982.postDelayed(AFSensorManager.this.f3976, ((long) AFSensorManager.this.f3980) * 500);
            }
        }
    };

    /* renamed from: і */
    final Runnable f3985 = new Runnable() {
        public final void run() {
            synchronized (AFSensorManager.this.f3983) {
                if (AFSensorManager.this.f3978) {
                    AFSensorManager.this.f3982.removeCallbacks(AFSensorManager.this.f3974);
                    AFSensorManager.this.f3982.removeCallbacks(AFSensorManager.this.f3976);
                    AFSensorManager aFSensorManager = AFSensorManager.this;
                    aFSensorManager.f3975.execute(new Runnable() {
                        public final void run() {
                            try {
                                if (!AFSensorManager.this.f3977.isEmpty()) {
                                    for (C1766r rVar : AFSensorManager.this.f3977.values()) {
                                        AFSensorManager.this.f3979.unregisterListener(rVar);
                                        rVar.mo14098(AFSensorManager.this.f3987, true);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            int unused2 = AFSensorManager.this.f3980 = 0;
                            boolean unused3 = AFSensorManager.this.f3981 = false;
                        }
                    });
                    AFSensorManager.this.f3978 = false;
                }
            }
        }
    };

    /* renamed from: Ӏ */
    long f3986 = 0;
    /* access modifiers changed from: private */

    /* renamed from: ӏ */
    public final Map<C1766r, Map<String, Object>> f3987 = new ConcurrentHashMap(f3973.size());

    static {
        f3973.set(1);
        f3973.set(2);
        f3973.set(4);
    }

    private AFSensorManager(SensorManager sensorManager, Handler handler) {
        this.f3979 = sensorManager;
        this.f3982 = handler;
    }

    /* renamed from: ǃ */
    static AFSensorManager m3720(Context context) {
        if (sInstance != null) {
            return sInstance;
        }
        return m3715((SensorManager) context.getApplicationContext().getSystemService("sensor"), f3972);
    }

    /* renamed from: ı */
    private static AFSensorManager m3715(SensorManager sensorManager, Handler handler) {
        if (sInstance == null) {
            synchronized (AFSensorManager.class) {
                if (sInstance == null) {
                    sInstance = new AFSensorManager(sensorManager, handler);
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ */
    public static boolean m3722(int i) {
        return i >= 0 && f3973.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final List<Map<String, Object>> mo13855() {
        for (C1766r r1 : this.f3977.values()) {
            r1.mo14098(this.f3987, true);
        }
        Map<C1766r, Map<String, Object>> map = this.f3987;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.f3987.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final List<Map<String, Object>> mo13854() {
        synchronized (this.f3983) {
            if (!this.f3977.isEmpty() && this.f3981) {
                for (C1766r r2 : this.f3977.values()) {
                    r2.mo14098(this.f3987, false);
                }
            }
            if (this.f3987.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Collections.emptyList());
                return copyOnWriteArrayList;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.f3987.values());
            return copyOnWriteArrayList2;
        }
    }
}
