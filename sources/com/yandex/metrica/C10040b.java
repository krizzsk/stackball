package com.yandex.metrica;

import android.app.job.JobParameters;

/* renamed from: com.yandex.metrica.b */
class C10040b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JobParameters f24086a;

    /* renamed from: b */
    final /* synthetic */ ConfigurationJobService f24087b;

    C10040b(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        this.f24087b = configurationJobService;
        this.f24086a = jobParameters;
    }

    public void run() {
        ConfigurationJobService.m25765a(this.f24087b, this.f24086a);
    }
}
