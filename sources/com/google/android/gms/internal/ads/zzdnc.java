package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public final class zzdnc {
    private final SharedPreferences zzcip;
    private final File zzhcy;
    private final File zzhcz;
    private final zzgb zzvl;

    public zzdnc(Context context, zzgb zzgb) {
        this.zzcip = context.getSharedPreferences("pcvmspf", 0);
        this.zzhcy = zzdnb.zza(context.getDir("pccache", 0), false);
        this.zzhcz = zzdnb.zza(context.getDir("tmppccache", 0), true);
        this.zzvl = zzgb;
    }

    public final zzdmz zzeb(int i) {
        zzgh zzec = zzec(i);
        if (zzec == null) {
            return null;
        }
        String zzdh = zzec.zzdh();
        return new zzdmz(zzec, zzdnb.zza(zzdh, "pcam", zzavh()), zzdnb.zza(zzdh, "pcbc", zzavh()), zzdnb.zza(zzdh, "pcopt", zzavh()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0135, code lost:
        if (r0.commit() != false) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzgd r8, com.google.android.gms.internal.ads.zzdni r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzgh r9 = r8.zzdd()
            java.lang.String r9 = r9.zzdh()
            com.google.android.gms.internal.ads.zzeaq r0 = r8.zzde()
            byte[] r0 = r0.toByteArray()
            com.google.android.gms.internal.ads.zzeaq r1 = r8.zzdf()
            byte[] r1 = r1.toByteArray()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r3 = "pcbc"
            java.lang.String r4 = "pcam"
            r5 = 0
            if (r2 != 0) goto L_0x0059
            if (r1 == 0) goto L_0x0059
            int r2 = r1.length
            if (r2 != 0) goto L_0x0029
            goto L_0x0059
        L_0x0029:
            java.io.File r2 = r7.zzhcz
            com.google.android.gms.internal.ads.zzdnb.zzd(r2)
            java.io.File r2 = r7.zzhcz
            r2.mkdirs()
            java.io.File r2 = r7.zzhcz
            java.io.File r2 = com.google.android.gms.internal.ads.zzdnb.zza((java.lang.String) r9, (java.io.File) r2)
            r2.mkdirs()
            java.io.File r2 = r7.zzhcz
            java.io.File r2 = com.google.android.gms.internal.ads.zzdnb.zza(r9, r4, r2)
            if (r0 == 0) goto L_0x004e
            int r6 = r0.length
            if (r6 <= 0) goto L_0x004e
            boolean r0 = com.google.android.gms.internal.ads.zzdnb.zza((java.io.File) r2, (byte[]) r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            java.io.File r0 = r7.zzhcz
            java.io.File r9 = com.google.android.gms.internal.ads.zzdnb.zza(r9, r3, r0)
            boolean r9 = com.google.android.gms.internal.ads.zzdnb.zza((java.io.File) r9, (byte[]) r1)
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            if (r9 != 0) goto L_0x005d
            return r5
        L_0x005d:
            com.google.android.gms.internal.ads.zzgh r9 = r8.zzdd()
            java.lang.String r9 = r9.zzdh()
            java.io.File r0 = r7.zzhcz
            java.io.File r9 = com.google.android.gms.internal.ads.zzdnb.zza(r9, r4, r0)
            boolean r9 = r9.exists()
            com.google.android.gms.internal.ads.zzgh r9 = r8.zzdd()
            java.lang.String r9 = r9.zzdh()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 != 0) goto L_0x00b4
            java.io.File r0 = r7.zzhcz
            java.io.File r0 = com.google.android.gms.internal.ads.zzdnb.zza(r9, r4, r0)
            java.io.File r2 = r7.zzhcz
            java.io.File r2 = com.google.android.gms.internal.ads.zzdnb.zza(r9, r3, r2)
            java.io.File r6 = r7.zzavh()
            java.io.File r4 = com.google.android.gms.internal.ads.zzdnb.zza(r9, r4, r6)
            java.io.File r6 = r7.zzavh()
            java.io.File r9 = com.google.android.gms.internal.ads.zzdnb.zza(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00a6
            boolean r0 = r0.renameTo(r4)
            if (r0 == 0) goto L_0x00b4
        L_0x00a6:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00b4
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x00b4
            r9 = 1
            goto L_0x00b5
        L_0x00b4:
            r9 = 0
        L_0x00b5:
            if (r9 == 0) goto L_0x0138
            com.google.android.gms.internal.ads.zzgh$zza r9 = com.google.android.gms.internal.ads.zzgh.zzdm()
            com.google.android.gms.internal.ads.zzgh r0 = r8.zzdd()
            java.lang.String r0 = r0.zzdh()
            com.google.android.gms.internal.ads.zzgh$zza r9 = r9.zzau(r0)
            com.google.android.gms.internal.ads.zzgh r0 = r8.zzdd()
            java.lang.String r0 = r0.zzdi()
            com.google.android.gms.internal.ads.zzgh$zza r9 = r9.zzav(r0)
            com.google.android.gms.internal.ads.zzgh r0 = r8.zzdd()
            long r2 = r0.zzdk()
            com.google.android.gms.internal.ads.zzgh$zza r9 = r9.zzdk(r2)
            com.google.android.gms.internal.ads.zzgh r0 = r8.zzdd()
            long r2 = r0.zzdl()
            com.google.android.gms.internal.ads.zzgh$zza r9 = r9.zzdl(r2)
            com.google.android.gms.internal.ads.zzgh r8 = r8.zzdd()
            long r2 = r8.zzdj()
            com.google.android.gms.internal.ads.zzgh$zza r8 = r9.zzdj(r2)
            com.google.android.gms.internal.ads.zzedo r8 = r8.zzbet()
            com.google.android.gms.internal.ads.zzecd r8 = (com.google.android.gms.internal.ads.zzecd) r8
            com.google.android.gms.internal.ads.zzgh r8 = (com.google.android.gms.internal.ads.zzgh) r8
            int r9 = com.google.android.gms.internal.ads.zzdnh.zzhdc
            com.google.android.gms.internal.ads.zzgh r9 = r7.zzec(r9)
            android.content.SharedPreferences r0 = r7.zzcip
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0126
            java.lang.String r2 = r8.zzdh()
            java.lang.String r3 = r9.zzdh()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0126
            java.lang.String r2 = r7.zzavi()
            java.lang.String r9 = zza(r9)
            r0.putString(r2, r9)
        L_0x0126:
            java.lang.String r9 = r7.zzavj()
            java.lang.String r8 = zza(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r1 = 0
        L_0x0139:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            int r9 = com.google.android.gms.internal.ads.zzdnh.zzhdc
            com.google.android.gms.internal.ads.zzgh r9 = r7.zzec(r9)
            if (r9 == 0) goto L_0x014d
            java.lang.String r9 = r9.zzdh()
            r8.add(r9)
        L_0x014d:
            int r9 = com.google.android.gms.internal.ads.zzdnh.zzhdd
            com.google.android.gms.internal.ads.zzgh r9 = r7.zzec(r9)
            if (r9 == 0) goto L_0x015c
            java.lang.String r9 = r9.zzdh()
            r8.add(r9)
        L_0x015c:
            java.io.File r9 = r7.zzavh()
            java.io.File[] r9 = r9.listFiles()
            int r0 = r9.length
        L_0x0165:
            if (r5 >= r0) goto L_0x0181
            r2 = r9[r5]
            java.lang.String r2 = r2.getName()
            boolean r3 = r8.contains(r2)
            if (r3 != 0) goto L_0x017e
            java.io.File r3 = r7.zzavh()
            java.io.File r2 = com.google.android.gms.internal.ads.zzdnb.zza((java.lang.String) r2, (java.io.File) r3)
            com.google.android.gms.internal.ads.zzdnb.zzd(r2)
        L_0x017e:
            int r5 = r5 + 1
            goto L_0x0165
        L_0x0181:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdnc.zza(com.google.android.gms.internal.ads.zzgd, com.google.android.gms.internal.ads.zzdni):boolean");
    }

    private final File zzavh() {
        File file = new File(this.zzhcy, Integer.toString(this.zzvl.zzw()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String zza(zzgh zzgh) {
        return Hex.bytesToStringLowercase(zzgh.zzbce().toByteArray());
    }

    private final String zzavi() {
        int zzw = this.zzvl.zzw();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(zzw);
        return sb.toString();
    }

    private final String zzavj() {
        int zzw = this.zzvl.zzw();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(zzw);
        return sb.toString();
    }

    private final zzgh zzec(int i) {
        String str;
        if (i == zzdnh.zzhdc) {
            str = this.zzcip.getString(zzavj(), (String) null);
        } else {
            str = i == zzdnh.zzhdd ? this.zzcip.getString(zzavi(), (String) null) : null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zzgh zzl = zzgh.zzl(zzeaq.zzu(Hex.stringToBytes(str)));
            String zzdh = zzl.zzdh();
            if (zzdnb.zza(zzdh, "pcam", zzavh()).exists() && zzdnb.zza(zzdh, "pcbc", zzavh()).exists()) {
                return zzl;
            }
            return null;
        } catch (zzeco unused) {
        }
    }
}
