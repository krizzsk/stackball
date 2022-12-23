package com.yandex.metrica.impl.p265ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.M6 */
public class C10496M6 {

    /* renamed from: a */
    private Context f25176a;

    /* renamed from: b */
    private ServiceConnection f25177b;

    /* renamed from: com.yandex.metrica.impl.ob.M6$a */
    class C10497a implements ServiceConnection {
        C10497a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public C10496M6(Context context) {
        this(context, new C10497a());
    }

    /* renamed from: a */
    public void mo61780a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Context context = this.f25176a;
            Intent intent = null;
            try {
                ResolveInfo resolveService = context.getPackageManager().resolveService(C10326H2.m26427a(context).setPackage(str), 0);
                if (resolveService != null) {
                    Intent intent2 = new Intent();
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    intent = intent2.setClassName(serviceInfo.packageName, serviceInfo.name).setAction("com.yandex.metrica.ACTION_C_BG_L");
                }
            } catch (Throwable unused) {
            }
            if (intent != null) {
                this.f25176a.bindService(intent, this.f25177b, 1);
            }
        }
    }

    C10496M6(Context context, ServiceConnection serviceConnection) {
        this.f25176a = context;
        this.f25177b = serviceConnection;
    }

    /* renamed from: a */
    public void mo61779a() {
        this.f25176a.unbindService(this.f25177b);
    }
}
