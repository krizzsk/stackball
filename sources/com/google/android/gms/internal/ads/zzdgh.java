package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdgh implements zzctz<zzcel> {
    private final /* synthetic */ zzdgi zzgtc;

    zzdgh(zzdgi zzdgi) {
        this.zzgtc = zzdgi;
    }

    public final void zzapn() {
        synchronized (this.zzgtc) {
            zzcel unused = this.zzgtc.zzgtb = null;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzcel zzcel = (zzcel) obj;
        synchronized (this.zzgtc) {
            zzcel unused = this.zzgtc.zzgtb = zzcel;
            this.zzgtc.zzgtb.zzahk();
        }
    }
}
