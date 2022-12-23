package com.yandex.metrica;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.yandex.metrica.impl.p265ob.C10245F6;
import com.yandex.metrica.impl.p265ob.C10393J6;
import com.yandex.metrica.impl.p265ob.C10539N6;
import com.yandex.metrica.impl.p265ob.C10619P0;
import com.yandex.metrica.impl.p265ob.C10626P6;
import com.yandex.metrica.impl.p265ob.C10659Q6;
import com.yandex.metrica.impl.p265ob.C10695R6;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationService extends Service {

    /* renamed from: a */
    private Map<String, C10626P6> f24010a = new HashMap();

    /* renamed from: b */
    private C10393J6 f24011b;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C10619P0.m27163a(getApplicationContext());
        String.format("[ConfigurationService:%s]", new Object[]{getPackageName()});
        this.f24011b = new C10393J6();
        Context applicationContext = getApplicationContext();
        C10539N6 n6 = new C10539N6(applicationContext, this.f24011b.mo61599a(), new C10245F6(applicationContext));
        this.f24010a.put("com.yandex.metrica.configuration.ACTION_INIT", new C10695R6(getApplicationContext(), n6));
        this.f24010a.put("com.yandex.metrica.configuration.ACTION_SCHEDULED_START", new C10659Q6(getApplicationContext(), n6));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Bundle bundle = null;
        C10626P6 p6 = this.f24010a.get(intent == null ? null : intent.getAction());
        if (p6 == null) {
            return 2;
        }
        C10393J6 j6 = this.f24011b;
        if (intent != null) {
            bundle = intent.getExtras();
        }
        j6.mo61600a(p6, bundle);
        return 2;
    }
}
