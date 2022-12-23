package com.yandex.metrica.impl.p265ob;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.yandex.metrica.ConfigurationService;

/* renamed from: com.yandex.metrica.impl.ob.F6 */
public class C10245F6 implements C10330H6, C10212E6 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f24644a;

    /* renamed from: b */
    private final AlarmManager f24645b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10616Om f24646c;

    public C10245F6(Context context) {
        this(context, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), new C10580Nm());
    }

    /* renamed from: a */
    static PendingIntent m26233a(C10245F6 f6, Context context) {
        f6.getClass();
        try {
            return PendingIntent.getService(context, 7695435, new Intent(context, ConfigurationService.class).setAction("com.yandex.metrica.configuration.ACTION_SCHEDULED_START"), C10796U2.m27890a(23) ? 201326592 : 134217728);
        } catch (Throwable unused) {
            return null;
        }
    }

    C10245F6(Context context, AlarmManager alarmManager, C10616Om om) {
        this.f24644a = context;
        this.f24645b = alarmManager;
        this.f24646c = om;
    }

    /* renamed from: a */
    public void mo61171a(long j, boolean z) {
        AlarmManager alarmManager = this.f24645b;
        if (alarmManager != null) {
            try {
                PendingIntent a = m26233a(this, this.f24644a);
                if (a != null) {
                    alarmManager.set(3, this.f24646c.mo61842c() + j, a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo61170a() {
        AlarmManager alarmManager = this.f24645b;
        if (alarmManager != null) {
            try {
                PendingIntent a = m26233a(this, this.f24644a);
                if (a != null) {
                    alarmManager.cancel(a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo61172a(Bundle bundle) {
        try {
            this.f24644a.startService(new Intent().setComponent(new ComponentName(this.f24644a.getPackageName(), ConfigurationService.class.getName())).setAction("com.yandex.metrica.configuration.ACTION_INIT").putExtras(bundle));
        } catch (Throwable unused) {
        }
    }
}
