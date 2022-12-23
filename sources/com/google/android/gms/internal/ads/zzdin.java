package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zztf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdin implements zzdio {
    private final ConcurrentHashMap<zzdiy, zzdil> zzgwg;
    private zzdir zzgwh;
    private zzdip zzgwi = new zzdip();

    public zzdin(zzdir zzdir) {
        this.zzgwg = new ConcurrentHashMap<>(zzdir.zzgww);
        this.zzgwh = zzdir;
    }

    public final synchronized zzdiv<?> zza(zzdiy zzdiy) {
        zzdiv<?> zzdiv;
        zzdil zzdil = this.zzgwg.get(zzdiy);
        zzdiv = null;
        if (zzdil != null) {
            zzdiv = zzdil.zzask();
            if (zzdiv == null) {
                this.zzgwi.zzast();
            }
            zza(zzdiv, zzdil.zzaso());
        } else {
            this.zzgwi.zzass();
            zza((zzdiv<?>) null, (zzdjl) null);
        }
        return zzdiv;
    }

    public final synchronized boolean zza(zzdiy zzdiy, zzdiv<?> zzdiv) {
        boolean zzb;
        zzdil zzdil = this.zzgwg.get(zzdiy);
        zzdiv.zzgxv = zzq.zzld().currentTimeMillis();
        if (zzdil == null) {
            zzdil = new zzdil(this.zzgwh.zzgww, this.zzgwh.zzgwx * 1000);
            if (this.zzgwg.size() == this.zzgwh.zzgwv) {
                int i = zzdiq.zzgwp[this.zzgwh.zzgxa - 1];
                long j = Long.MAX_VALUE;
                zzdiy zzdiy2 = null;
                if (i == 1) {
                    for (Map.Entry next : this.zzgwg.entrySet()) {
                        if (((zzdil) next.getValue()).getCreationTimeMillis() < j) {
                            j = ((zzdil) next.getValue()).getCreationTimeMillis();
                            zzdiy2 = (zzdiy) next.getKey();
                        }
                    }
                    if (zzdiy2 != null) {
                        this.zzgwg.remove(zzdiy2);
                    }
                } else if (i == 2) {
                    for (Map.Entry next2 : this.zzgwg.entrySet()) {
                        if (((zzdil) next2.getValue()).zzasl() < j) {
                            j = ((zzdil) next2.getValue()).zzasl();
                            zzdiy2 = (zzdiy) next2.getKey();
                        }
                    }
                    if (zzdiy2 != null) {
                        this.zzgwg.remove(zzdiy2);
                    }
                } else if (i == 3) {
                    int i2 = Integer.MAX_VALUE;
                    for (Map.Entry next3 : this.zzgwg.entrySet()) {
                        if (((zzdil) next3.getValue()).zzasm() < i2) {
                            i2 = ((zzdil) next3.getValue()).zzasm();
                            zzdiy2 = (zzdiy) next3.getKey();
                        }
                    }
                    if (zzdiy2 != null) {
                        this.zzgwg.remove(zzdiy2);
                    }
                }
                this.zzgwi.zzasv();
            }
            this.zzgwg.put(zzdiy, zzdil);
            this.zzgwi.zzasu();
        }
        zzb = zzdil.zzb(zzdiv);
        this.zzgwi.zzasw();
        zzdis zzasx = this.zzgwi.zzasx();
        zzdjl zzaso = zzdil.zzaso();
        if (zzdiv != null) {
            zzdiv.zzgxt.zzaij().zzd((zztf.zzb) ((zzecd) zztf.zzb.zznf().zza(zztf.zzb.zza.zznh().zza(zztf.zzb.C15659zzb.IN_MEMORY).zza(zztf.zzb.zze.zznl().zzs(zzasx.zzgxd).zzt(zzasx.zzgxe).zzbx(zzaso.zzgym))).zzbet()));
        }
        dumpToLog();
        return zzb;
    }

    public final synchronized boolean zzb(zzdiy zzdiy) {
        zzdil zzdil = this.zzgwg.get(zzdiy);
        if (zzdil == null) {
            return true;
        }
        if (zzdil.size() < this.zzgwh.zzgww) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final zzdiy zza(zzuj zzuj, String str, zzut zzut) {
        return new zzdix(zzuj, str, new zzarr(this.zzgwh.zzvf).zzvb().zzdpy, this.zzgwh.zzgwy, zzut);
    }

    public final zzdir zzasr() {
        return this.zzgwh;
    }

    private final void zza(zzdiv<?> zzdiv, zzdjl zzdjl) {
        if (zzdiv != null) {
            zzdiv.zzgxt.zzaij().zzc((zztf.zzb) ((zzecd) zztf.zzb.zznf().zza(zztf.zzb.zza.zznh().zza(zztf.zzb.C15659zzb.IN_MEMORY).zza(zztf.zzb.zzd.zznj().zzq(zzdjl.zzgyl).zzbv(zzdjl.zzgym))).zzbet()));
        }
        dumpToLog();
    }

    private final void dumpToLog() {
        if (zzdir.zzasz()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzgwh.zzgwu);
            sb.append(" PoolCollection");
            sb.append(this.zzgwi.zzasy());
            int i = 0;
            for (Map.Entry next : this.zzgwg.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(next.getValue());
                sb.append("#");
                sb.append(((zzdiy) next.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzdil) next.getValue()).size(); i2++) {
                    sb.append("[O]");
                }
                for (int size = ((zzdil) next.getValue()).size(); size < this.zzgwh.zzgww; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzdil) next.getValue()).zzasn());
                sb.append("\n");
            }
            while (i < this.zzgwh.zzgwv) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzawr.zzed(sb.toString());
        }
    }
}
