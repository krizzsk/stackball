package com.yandex.metrica;

import android.app.job.JobParameters;
import com.yandex.metrica.impl.p265ob.C10589O6;

/* renamed from: com.yandex.metrica.c */
class C10076c implements C10589O6 {

    /* renamed from: a */
    final /* synthetic */ JobParameters f24235a;

    /* renamed from: b */
    final /* synthetic */ ConfigurationJobService f24236b;

    C10076c(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        this.f24236b = configurationJobService;
        this.f24235a = jobParameters;
    }

    /* renamed from: a */
    public void mo60962a() {
        try {
            this.f24236b.jobFinished(this.f24235a, false);
        } catch (Throwable unused) {
        }
    }
}
