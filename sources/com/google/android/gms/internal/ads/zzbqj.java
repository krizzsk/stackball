package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzbqj {
    private final zzdhe zzfll;
    private Bundle zzfmv;
    private final String zzfmw;
    private final zzdgz zzfmx;
    private final Context zzvf;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static class zza {
        /* access modifiers changed from: private */
        public zzdhe zzfll;
        /* access modifiers changed from: private */
        public Bundle zzfmv;
        /* access modifiers changed from: private */
        public String zzfmw;
        /* access modifiers changed from: private */
        public zzdgz zzfmx;
        /* access modifiers changed from: private */
        public Context zzvf;

        public final zza zzcb(Context context) {
            this.zzvf = context;
            return this;
        }

        public final zza zza(zzdhe zzdhe) {
            this.zzfll = zzdhe;
            return this;
        }

        public final zza zzf(Bundle bundle) {
            this.zzfmv = bundle;
            return this;
        }

        public final zza zzfv(String str) {
            this.zzfmw = str;
            return this;
        }

        public final zzbqj zzair() {
            return new zzbqj(this);
        }

        public final zza zza(zzdgz zzdgz) {
            this.zzfmx = zzdgz;
            return this;
        }
    }

    private zzbqj(zza zza2) {
        this.zzvf = zza2.zzvf;
        this.zzfll = zza2.zzfll;
        this.zzfmv = zza2.zzfmv;
        this.zzfmw = zza2.zzfmw;
        this.zzfmx = zza2.zzfmx;
    }

    /* access modifiers changed from: package-private */
    public final zza zzaim() {
        return new zza().zzcb(this.zzvf).zza(this.zzfll).zzfv(this.zzfmw).zzf(this.zzfmv);
    }

    /* access modifiers changed from: package-private */
    public final zzdhe zzain() {
        return this.zzfll;
    }

    /* access modifiers changed from: package-private */
    public final zzdgz zzaio() {
        return this.zzfmx;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzaip() {
        return this.zzfmv;
    }

    /* access modifiers changed from: package-private */
    public final String zzaiq() {
        return this.zzfmw;
    }

    /* access modifiers changed from: package-private */
    public final Context zzca(Context context) {
        if (this.zzfmw != null) {
            return context;
        }
        return this.zzvf;
    }
}
