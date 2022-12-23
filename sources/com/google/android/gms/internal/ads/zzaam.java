package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzaam {
    private final Object lock = new Object();
    boolean zzcuv = true;
    private final List<zzaak> zzcuw = new LinkedList();
    private final Map<String, String> zzcux = new LinkedHashMap();
    private zzaam zzcuy;

    public zzaam(boolean z, String str, String str2) {
        this.zzcux.put("action", str);
        this.zzcux.put("ad_format", str2);
    }

    public final void zzc(zzaam zzaam) {
        synchronized (this.lock) {
            this.zzcuy = zzaam;
        }
    }

    public final zzaak zzex(long j) {
        if (!this.zzcuv) {
            return null;
        }
        return new zzaak(j, (String) null, (zzaak) null);
    }

    public final boolean zza(zzaak zzaak, long j, String... strArr) {
        synchronized (this.lock) {
            for (String zzaak2 : strArr) {
                this.zzcuw.add(new zzaak(j, zzaak2, zzaak));
            }
        }
        return true;
    }

    public final String zzrl() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.lock) {
            for (zzaak next : this.zzcuw) {
                long time = next.getTime();
                String zzrj = next.zzrj();
                zzaak zzrk = next.zzrk();
                if (zzrk != null && time > 0) {
                    sb2.append(zzrj);
                    sb2.append('.');
                    sb2.append(time - zzrk.getTime());
                    sb2.append(',');
                }
            }
            this.zzcuw.clear();
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void zzh(String str, String str2) {
        zzaac zzvv;
        if (this.zzcuv && !TextUtils.isEmpty(str2) && (zzvv = zzq.zzla().zzvv()) != null) {
            synchronized (this.lock) {
                zzaag zzcs = zzvv.zzcs(str);
                Map<String, String> map = this.zzcux;
                map.put(str, zzcs.zzg(map.get(str), str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> zzrm() {
        synchronized (this.lock) {
            zzaac zzvv = zzq.zzla().zzvv();
            if (zzvv != null) {
                if (this.zzcuy != null) {
                    Map<String, String> zza = zzvv.zza(this.zzcux, this.zzcuy.zzrm());
                    return zza;
                }
            }
            Map<String, String> map = this.zzcux;
            return map;
        }
    }
}
