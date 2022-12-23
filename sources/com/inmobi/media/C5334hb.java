package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.inmobi.media.hb */
/* compiled from: SystemBroadcastObserver */
public class C5334hb {

    /* renamed from: a */
    private static final String f12217a = C5334hb.class.getSimpleName();

    /* renamed from: b */
    private static HashMap<String, CopyOnWriteArrayList<C5338c>> f12218b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, C5337b> f12219c = new HashMap<>();

    /* renamed from: d */
    private static HashMap<String, ConnectivityManager.NetworkCallback> f12220d = new HashMap<>();

    /* renamed from: com.inmobi.media.hb$a */
    /* compiled from: SystemBroadcastObserver */
    static class C5336a {

        /* renamed from: a */
        static final C5334hb f12222a = new C5334hb();
    }

    /* renamed from: com.inmobi.media.hb$c */
    /* compiled from: SystemBroadcastObserver */
    public interface C5338c {
        /* renamed from: a */
        void mo40125a(boolean z);
    }

    /* renamed from: a */
    public static C5334hb m12304a() {
        return C5336a.f12222a;
    }

    /* renamed from: a */
    public final void mo40704a(String str, C5338c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = f12218b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(cVar);
        }
        f12218b.put(str, copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() == 1) {
            m12306a(str);
        }
    }

    /* renamed from: a */
    public final void mo40703a(C5338c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            mo40704a("android.net.conn.CONNECTIVITY_CHANGE", cVar);
        } else {
            mo40704a("SYSTEM_CONNECTIVITY_CHANGE", cVar);
        }
    }

    /* renamed from: a */
    private void m12306a(String str) {
        Context c = C5314go.m12203c();
        if (c == null) {
            return;
        }
        if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
            if (connectivityManager != null) {
                C53351 r1 = new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        super.onAvailable(network);
                        C5334hb.m12310b(true, "SYSTEM_CONNECTIVITY_CHANGE");
                    }

                    public final void onLost(Network network) {
                        super.onLost(network);
                        C5334hb.m12310b(false, "SYSTEM_CONNECTIVITY_CHANGE");
                    }
                };
                f12220d.put(str, r1);
                connectivityManager.registerDefaultNetworkCallback(r1);
                return;
            }
            return;
        }
        C5337b bVar = new C5337b();
        f12219c.put(str, bVar);
        c.registerReceiver(bVar, new IntentFilter(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m12310b(boolean z, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = f12218b.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((C5338c) it.next()).mo40125a(z);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m12305a(C5338c cVar, String str) {
        Context c;
        CopyOnWriteArrayList copyOnWriteArrayList = f12218b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(cVar);
            if (copyOnWriteArrayList.size() == 0 && (c = C5314go.m12203c()) != null) {
                if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str) && f12220d.get(str) != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        connectivityManager.unregisterNetworkCallback(f12220d.get(str));
                        f12220d.remove(str);
                    }
                } else if (f12219c.get(str) != null) {
                    c.unregisterReceiver(f12219c.get(str));
                    f12219c.remove(str);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m12309b(C5338c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            m12305a(cVar, "android.net.conn.CONNECTIVITY_CHANGE");
        } else {
            m12305a(cVar, "SYSTEM_CONNECTIVITY_CHANGE");
        }
    }

    /* renamed from: com.inmobi.media.hb$b */
    /* compiled from: SystemBroadcastObserver */
    static final class C5337b extends BroadcastReceiver {

        /* renamed from: a */
        private static final String f12223a = C5337b.class.getSimpleName();

        C5337b() {
        }

        public final void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (intent != null) {
                try {
                    if (intent.getAction() != null) {
                        boolean z = true;
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
                                C5334hb.m12310b(z, intent.getAction());
                                intent.getAction();
                            }
                        } else if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                                z = powerManager.isDeviceIdleMode();
                                C5334hb.m12310b(z, intent.getAction());
                                intent.getAction();
                            }
                        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                            C5334hb.m12310b(z, intent.getAction());
                            intent.getAction();
                        }
                        z = false;
                        C5334hb.m12310b(z, intent.getAction());
                        intent.getAction();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
