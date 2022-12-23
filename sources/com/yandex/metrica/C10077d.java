package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import com.yandex.metrica.impl.p265ob.C10589O6;

/* renamed from: com.yandex.metrica.d */
class C10077d implements C10589O6 {

    /* renamed from: a */
    final /* synthetic */ JobParameters f24237a;

    /* renamed from: b */
    final /* synthetic */ JobWorkItem f24238b;

    /* renamed from: c */
    final /* synthetic */ ConfigurationJobService f24239c;

    C10077d(ConfigurationJobService configurationJobService, JobParameters jobParameters, JobWorkItem jobWorkItem) {
        this.f24239c = configurationJobService;
        this.f24237a = jobParameters;
        this.f24238b = jobWorkItem;
    }

    /* renamed from: a */
    public void mo60962a() {
        try {
            this.f24237a.completeWork(this.f24238b);
            ConfigurationJobService.m25766b(this.f24239c, this.f24237a);
        } catch (Throwable unused) {
        }
    }
}
