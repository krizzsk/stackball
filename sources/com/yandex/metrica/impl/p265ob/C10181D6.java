package com.yandex.metrica.impl.p265ob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationJobService;

/* renamed from: com.yandex.metrica.impl.ob.D6 */
public class C10181D6 implements C10330H6, C10212E6 {

    /* renamed from: a */
    private final Context f24477a;

    /* renamed from: b */
    private final JobScheduler f24478b;

    public C10181D6(Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }

    /* renamed from: a */
    public void mo61171a(long j, boolean z) {
        JobInfo.Builder minimumLatency = new JobInfo.Builder(1512302345, new ComponentName(this.f24477a.getPackageName(), ConfigurationJobService.class.getName())).setMinimumLatency(j);
        if (z) {
            minimumLatency.setOverrideDeadline(j);
        }
        JobScheduler jobScheduler = this.f24478b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(minimumLatency.build());
            } catch (Throwable unused) {
            }
        }
    }

    C10181D6(Context context, JobScheduler jobScheduler) {
        this.f24477a = context;
        this.f24478b = jobScheduler;
    }

    /* renamed from: a */
    public void mo61170a() {
        JobScheduler jobScheduler = this.f24478b;
        if (jobScheduler != null) {
            try {
                jobScheduler.cancel(1512302345);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo61172a(Bundle bundle) {
        JobInfo build = new JobInfo.Builder(1512302346, new ComponentName(this.f24477a.getPackageName(), ConfigurationJobService.class.getName())).setTransientExtras(bundle).setOverrideDeadline(10).build();
        JobScheduler jobScheduler = this.f24478b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(build);
            } catch (Throwable unused) {
            }
        }
    }
}
