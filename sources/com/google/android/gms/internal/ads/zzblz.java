package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzblz extends zzblx {
    private final View view;
    private final zzbek zzdce;
    private final Executor zzfhi;
    private final zzdgn zzfik;
    private final zzbnt zzfja;
    private final zzcae zzfjb;
    private final zzbvx zzfjc;
    private final zzegt<zzcte> zzfjd;
    private zzum zzfje;
    private final Context zzvf;

    zzblz(zzbnv zzbnv, Context context, zzdgn zzdgn, View view2, zzbek zzbek, zzbnt zzbnt, zzcae zzcae, zzbvx zzbvx, zzegt<zzcte> zzegt, Executor executor) {
        super(zzbnv);
        this.zzvf = context;
        this.view = view2;
        this.zzdce = zzbek;
        this.zzfik = zzdgn;
        this.zzfja = zzbnt;
        this.zzfjb = zzcae;
        this.zzfjc = zzbvx;
        this.zzfjd = zzegt;
        this.zzfhi = executor;
    }

    public final View zzahe() {
        return this.view;
    }

    public final void zza(ViewGroup viewGroup, zzum zzum) {
        zzbek zzbek;
        if (viewGroup != null && (zzbek = this.zzdce) != null) {
            zzbek.zza(zzbfz.zzb(zzum));
            viewGroup.setMinimumHeight(zzum.heightPixels);
            viewGroup.setMinimumWidth(zzum.widthPixels);
            this.zzfje = zzum;
        }
    }

    public final zzxl getVideoController() {
        try {
            return this.zzfja.getVideoController();
        } catch (zzdhk unused) {
            return null;
        }
    }

    public final zzdgn zzahd() {
        boolean z;
        zzum zzum = this.zzfje;
        if (zzum != null) {
            return zzdhh.zze(zzum);
        }
        if (this.zzfkd.zzguc) {
            Iterator<String> it = this.zzfkd.zzgtk.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new zzdgn(this.view.getWidth(), this.view.getHeight(), false);
            }
        }
        return zzdhh.zza(this.zzfkd.zzgtq, this.zzfik);
    }

    public final zzdgn zzahi() {
        return this.zzfik;
    }

    public final int zzahj() {
        return this.zzfgj.zzgus.zzgup.zzgug;
    }

    public final void zzkf() {
        this.zzfjc.zzajr();
    }

    public final void zzahk() {
        this.zzfhi.execute(new zzbly(this));
        super.zzahk();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzahl() {
        if (this.zzfjb.zzalo() != null) {
            try {
                this.zzfjb.zzalo().zza(this.zzfjd.get(), ObjectWrapper.wrap(this.zzvf));
            } catch (RemoteException e) {
                zzawr.zzc("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
