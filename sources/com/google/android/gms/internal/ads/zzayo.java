package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzayo implements zzy {
    private final /* synthetic */ String zzdxx;
    private final /* synthetic */ zzayp zzdxy;

    zzayo(zzaym zzaym, String str, zzayp zzayp) {
        this.zzdxx = str;
        this.zzdxy = zzayp;
    }

    public final void zzc(zzae zzae) {
        String str = this.zzdxx;
        String zzae2 = zzae.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzae2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzae2);
        zzawr.zzfc(sb.toString());
        this.zzdxy.zzb(null);
    }
}
