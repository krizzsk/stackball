package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.yandex.metrica.impl.p265ob.C10181D6;
import com.yandex.metrica.impl.p265ob.C10393J6;
import com.yandex.metrica.impl.p265ob.C10539N6;
import com.yandex.metrica.impl.p265ob.C10619P0;
import com.yandex.metrica.impl.p265ob.C10626P6;
import com.yandex.metrica.impl.p265ob.C10659Q6;
import com.yandex.metrica.impl.p265ob.C10695R6;
import com.yandex.metrica.impl.p265ob.C11725rn;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ConfigurationJobService extends JobService {

    /* renamed from: a */
    private C10393J6 f24007a;

    /* renamed from: b */
    SparseArray<C10626P6> f24008b = new SparseArray<>();

    /* renamed from: c */
    Map<String, C10626P6> f24009c = new HashMap();

    /* renamed from: a */
    static void m25765a(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        configurationJobService.getClass();
        while (true) {
            try {
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork != null) {
                    Intent intent = dequeueWork.getIntent();
                    if (intent != null) {
                        C10626P6 p6 = configurationJobService.f24009c.get(intent.getAction());
                        if (p6 != null) {
                            configurationJobService.f24007a.mo61601a(p6, intent.getExtras(), new C10077d(configurationJobService, jobParameters, dequeueWork));
                        } else {
                            jobParameters.completeWork(dequeueWork);
                        }
                    } else {
                        jobParameters.completeWork(dequeueWork);
                    }
                } else {
                    return;
                }
            } catch (Throwable unused) {
                configurationJobService.jobFinished(jobParameters, true);
                return;
            }
        }
    }

    /* renamed from: b */
    static void m25766b(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        ((C11725rn) configurationJobService.f24007a.mo61599a()).execute(new C10040b(configurationJobService, jobParameters));
    }

    public boolean complexJob(int i) {
        return i == 1512302347;
    }

    public void onCreate() {
        super.onCreate();
        C10619P0.m27163a(getApplicationContext());
        Context applicationContext = getApplicationContext();
        String.format(Locale.US, "[ConfigurationJobService:%s]", new Object[]{applicationContext.getPackageName()});
        this.f24007a = new C10393J6();
        C10539N6 n6 = new C10539N6(getApplicationContext(), this.f24007a.mo61599a(), new C10181D6(applicationContext));
        this.f24008b.append(1512302345, new C10659Q6(getApplicationContext(), n6));
        this.f24008b.append(1512302346, new C10695R6(getApplicationContext(), n6));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        jobFinished(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x003f
            int r1 = r6.getJobId()     // Catch:{ all -> 0x003c }
            boolean r1 = r5.complexJob(r1)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x001e
            com.yandex.metrica.impl.ob.J6 r1 = r5.f24007a     // Catch:{ all -> 0x003c }
            com.yandex.metrica.impl.ob.sn r1 = r1.mo61599a()     // Catch:{ all -> 0x003c }
            com.yandex.metrica.b r2 = new com.yandex.metrica.b     // Catch:{ all -> 0x003c }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x003c }
            com.yandex.metrica.impl.ob.rn r1 = (com.yandex.metrica.impl.p265ob.C11725rn) r1     // Catch:{ all -> 0x003c }
            r1.execute(r2)     // Catch:{ all -> 0x003c }
            goto L_0x003a
        L_0x001e:
            android.util.SparseArray<com.yandex.metrica.impl.ob.P6> r1 = r5.f24008b     // Catch:{ all -> 0x003c }
            int r2 = r6.getJobId()     // Catch:{ all -> 0x003c }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x003c }
            com.yandex.metrica.impl.ob.P6 r1 = (com.yandex.metrica.impl.p265ob.C10626P6) r1     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003f
            com.yandex.metrica.impl.ob.J6 r2 = r5.f24007a     // Catch:{ all -> 0x003c }
            android.os.Bundle r3 = r6.getTransientExtras()     // Catch:{ all -> 0x003c }
            com.yandex.metrica.c r4 = new com.yandex.metrica.c     // Catch:{ all -> 0x003c }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x003c }
            r2.mo61601a(r1, r3, r4)     // Catch:{ all -> 0x003c }
        L_0x003a:
            r0 = 1
            goto L_0x003f
        L_0x003c:
            r5.jobFinished(r6, r0)     // Catch:{ all -> 0x003f }
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.ConfigurationJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return jobParameters != null && complexJob(jobParameters.getJobId());
    }
}
