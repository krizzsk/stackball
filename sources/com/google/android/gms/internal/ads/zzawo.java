package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzawo implements zzqq {
    private final Object lock = new Object();
    private final zzawt zzduw;
    private final zzawm zzdvc;
    private final zzawk zzdvd;
    private final HashSet<zzawc> zzdve = new HashSet<>();
    private final HashSet<zzawl> zzdvf = new HashSet<>();

    public zzawo(String str, zzawt zzawt) {
        this.zzdvd = new zzawk(str, zzawt);
        this.zzduw = zzawt;
        this.zzdvc = new zzawm();
    }

    public final void zzb(zzawc zzawc) {
        synchronized (this.lock) {
            this.zzdve.add(zzawc);
        }
    }

    public final void zzb(HashSet<zzawc> hashSet) {
        synchronized (this.lock) {
            this.zzdve.addAll(hashSet);
        }
    }

    public final Bundle zza(Context context, zzawj zzawj) {
        HashSet hashSet = new HashSet();
        synchronized (this.lock) {
            hashSet.addAll(this.zzdve);
            this.zzdve.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(TapjoyConstants.TJC_APP_PLACEMENT, this.zzdvd.zzo(context, this.zzdvc.zzwm()));
        Bundle bundle2 = new Bundle();
        Iterator<zzawl> it = this.zzdvf.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzawc) it2.next()).toBundle());
            }
            bundle.putParcelableArrayList(CampaignUnit.JSON_KEY_ADS, arrayList);
            zzawj.zza(hashSet);
            return bundle;
        }
        zzawl next = it.next();
        throw new NoSuchMethodError();
    }

    public final void zzp(boolean z) {
        long currentTimeMillis = zzq.zzld().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zzduw.zzwx() > ((Long) zzvj.zzpv().zzd(zzzz.zzclp)).longValue()) {
                this.zzdvd.zzdut = -1;
                return;
            }
            this.zzdvd.zzdut = this.zzduw.zzwy();
            return;
        }
        this.zzduw.zzez(currentTimeMillis);
        this.zzduw.zzcz(this.zzdvd.zzdut);
    }

    public final void zzvs() {
        synchronized (this.lock) {
            this.zzdvd.zzvs();
        }
    }

    public final void zzvr() {
        synchronized (this.lock) {
            this.zzdvd.zzvr();
        }
    }

    public final void zza(zzuj zzuj, long j) {
        synchronized (this.lock) {
            this.zzdvd.zza(zzuj, j);
        }
    }

    public final zzawc zza(Clock clock, String str) {
        return new zzawc(clock, this, this.zzdvc.zzwl(), str);
    }
}
