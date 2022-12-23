package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p265ob.C10116Am;
import com.yandex.metrica.impl.p265ob.C10120B1;
import com.yandex.metrica.impl.p265ob.C10205E2;
import com.yandex.metrica.impl.p265ob.C10619P0;
import com.yandex.metrica.impl.p265ob.C11968y1;
import com.yandex.metrica.impl.p265ob.C12000z1;

public class MetricaService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C11968y1 f24024c;

    /* renamed from: a */
    private final C10026e f24025a = new C10022a();

    /* renamed from: b */
    private final IMetricaService.C10020a f24026b = new C10023b(this);

    /* renamed from: com.yandex.metrica.MetricaService$a */
    class C10022a implements C10026e {
        C10022a() {
        }

        /* renamed from: a */
        public void mo60881a(int i) {
            MetricaService.this.stopSelfResult(i);
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$b */
    class C10023b extends IMetricaService.C10020a {
        C10023b(MetricaService metricaService) {
        }

        /* renamed from: a */
        public void mo60833a(int i, Bundle bundle) throws RemoteException {
            MetricaService.f24024c.mo61078a(i, bundle);
        }

        /* renamed from: b */
        public void mo60835b(Bundle bundle) throws RemoteException {
            MetricaService.f24024c.mo61088b(bundle);
        }

        public void reportData(Bundle bundle) throws RemoteException {
            MetricaService.f24024c.reportData(bundle);
        }

        /* renamed from: a */
        public void mo60834a(Bundle bundle) throws RemoteException {
            MetricaService.f24024c.mo61082a(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$c */
    static class C10024c extends Binder {
        C10024c() {
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$d */
    static class C10025d extends Binder {
        C10025d() {
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$e */
    public interface C10026e {
        /* renamed from: a */
        void mo60881a(int i);
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder;
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            iBinder = new C10025d();
        } else if ("com.yandex.metrica.ACTION_C_BG_L".equals(action)) {
            iBinder = new C10024c();
        } else {
            iBinder = this.f24026b;
        }
        f24024c.mo61079a(intent);
        return iBinder;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f24024c.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        C10619P0.m27163a(getApplicationContext());
        C10116Am.m25999a(getApplicationContext());
        C11968y1 y1Var = f24024c;
        if (y1Var == null) {
            f24024c = new C12000z1(new C10120B1(getApplicationContext(), this.f24025a));
        } else {
            y1Var.mo61083a(this.f24025a);
        }
        f24024c.mo61077a();
        C10619P0.m27164i().mo61873a(new C10205E2(f24024c));
    }

    public void onDestroy() {
        f24024c.mo61086b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
        f24024c.mo61089c(intent);
    }

    public void onStart(Intent intent, int i) {
        f24024c.mo61080a(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        f24024c.mo61081a(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        f24024c.mo61087b(intent);
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            return false;
        }
        if ("com.yandex.metrica.ACTION_C_BG_L".equals(action)) {
            return true;
        }
        if (intent.getData() == null) {
            return false;
        }
        return true;
    }
}
