package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public abstract class zzckt implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final Object mLock = new Object();
    protected final zzbaj<InputStream> zzdej = new zzbaj<>();
    protected boolean zzgbr = false;
    protected boolean zzgbs = false;
    protected zzarj zzgbt;
    protected zzaqr zzgbu;

    /* access modifiers changed from: protected */
    public final void zzaot() {
        synchronized (this.mLock) {
            this.zzgbs = true;
            if (this.zzgbu.isConnected() || this.zzgbu.isConnecting()) {
                this.zzgbu.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public void onConnectionSuspended(int i) {
        zzawr.zzed("Cannot connect to remote service, fallback to local instance.");
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzawr.zzed("Disconnected from remote ad request service.");
        this.zzdej.setException(new zzclc(0));
    }
}
