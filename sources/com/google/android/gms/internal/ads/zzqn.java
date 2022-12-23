package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzqn implements Runnable {
    private final /* synthetic */ zzqo zzbqg;

    zzqn(zzqo zzqo) {
        this.zzbqg = zzqo;
    }

    public final void run() {
        synchronized (this.zzbqg.lock) {
            if (!this.zzbqg.foreground || !this.zzbqg.zzbqh) {
                zzawr.zzed("App is still foreground");
            } else {
                boolean unused = this.zzbqg.foreground = false;
                zzawr.zzed("App went background");
                for (zzqq zzp : this.zzbqg.zzbqi) {
                    try {
                        zzp.zzp(false);
                    } catch (Exception e) {
                        zzazw.zzc("", e);
                    }
                }
            }
        }
    }
}
