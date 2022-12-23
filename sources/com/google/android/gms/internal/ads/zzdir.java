package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdir extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdir> CREATOR = new zzdiw();
    private final zzdiu[] zzgwq;
    private final int[] zzgwr;
    private final int[] zzgws;
    private final int zzgwt;
    public final zzdiu zzgwu;
    public final int zzgwv;
    public final int zzgww;
    public final int zzgwx;
    public final String zzgwy;
    private final int zzgwz;
    public final int zzgxa;
    private final int zzgxb;
    private final int zzgxc;
    @Nullable
    public final Context zzvf;

    private zzdir(@Nullable Context context, zzdiu zzdiu, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzgwq = zzdiu.values();
        this.zzgwr = zzdit.zzatb();
        this.zzgws = zzdit.zzatc();
        this.zzvf = context;
        this.zzgwt = zzdiu.ordinal();
        this.zzgwu = zzdiu;
        this.zzgwv = i;
        this.zzgww = i2;
        this.zzgwx = i3;
        this.zzgwy = str;
        if ("oldest".equals(str2)) {
            i4 = zzdit.zzgxf;
        } else if ("lru".equals(str2) || !"lfu".equals(str2)) {
            i4 = zzdit.zzgxg;
        } else {
            i4 = zzdit.zzgxh;
        }
        this.zzgxa = i4;
        this.zzgwz = i4 - 1;
        "onAdClosed".equals(str3);
        int i5 = zzdit.zzgxj;
        this.zzgxc = i5;
        this.zzgxb = i5 - 1;
    }

    public zzdir(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        this.zzgwq = zzdiu.values();
        this.zzgwr = zzdit.zzatb();
        int[] zzatc = zzdit.zzatc();
        this.zzgws = zzatc;
        this.zzvf = null;
        this.zzgwt = i;
        this.zzgwu = this.zzgwq[i];
        this.zzgwv = i2;
        this.zzgww = i3;
        this.zzgwx = i4;
        this.zzgwy = str;
        this.zzgwz = i5;
        this.zzgxa = this.zzgwr[i5];
        this.zzgxb = i6;
        this.zzgxc = zzatc[i6];
    }

    public static zzdir zza(zzdiu zzdiu, Context context) {
        if (zzdiu == zzdiu.Rewarded) {
            return new zzdir(context, zzdiu, ((Integer) zzvj.zzpv().zzd(zzzz.zzctg)).intValue(), ((Integer) zzvj.zzpv().zzd(zzzz.zzctm)).intValue(), ((Integer) zzvj.zzpv().zzd(zzzz.zzcto)).intValue(), (String) zzvj.zzpv().zzd(zzzz.zzctq), (String) zzvj.zzpv().zzd(zzzz.zzcti), (String) zzvj.zzpv().zzd(zzzz.zzctk));
        } else if (zzdiu == zzdiu.Interstitial) {
            return new zzdir(context, zzdiu, ((Integer) zzvj.zzpv().zzd(zzzz.zzcth)).intValue(), ((Integer) zzvj.zzpv().zzd(zzzz.zzctn)).intValue(), ((Integer) zzvj.zzpv().zzd(zzzz.zzctp)).intValue(), (String) zzvj.zzpv().zzd(zzzz.zzctr), (String) zzvj.zzpv().zzd(zzzz.zzctj), (String) zzvj.zzpv().zzd(zzzz.zzctl));
        } else if (zzdiu != zzdiu.AppOpen) {
            return null;
        } else {
            return new zzdir(context, zzdiu, ((Integer) zzvj.zzpv().zzd(zzzz.zzctu)).intValue(), ((Integer) zzvj.zzpv().zzd(zzzz.zzctw)).intValue(), ((Integer) zzvj.zzpv().zzd(zzzz.zzctx)).intValue(), (String) zzvj.zzpv().zzd(zzzz.zzcts), (String) zzvj.zzpv().zzd(zzzz.zzctt), (String) zzvj.zzpv().zzd(zzzz.zzctv));
        }
    }

    public static boolean zzasz() {
        return ((Boolean) zzvj.zzpv().zzd(zzzz.zzctf)).booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzgwt);
        SafeParcelWriter.writeInt(parcel, 2, this.zzgwv);
        SafeParcelWriter.writeInt(parcel, 3, this.zzgww);
        SafeParcelWriter.writeInt(parcel, 4, this.zzgwx);
        SafeParcelWriter.writeString(parcel, 5, this.zzgwy, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzgwz);
        SafeParcelWriter.writeInt(parcel, 7, this.zzgxb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
