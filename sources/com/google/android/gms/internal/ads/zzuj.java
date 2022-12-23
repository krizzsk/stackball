package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzuj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuj> CREATOR = new zzul();
    public final Bundle extras;
    public final int versionCode;
    public final int zzacq;
    public final int zzacr;
    public final String zzacs;
    public final boolean zzbli;
    @Deprecated
    public final long zzceg;
    @Deprecated
    public final int zzceh;
    public final List<String> zzcei;
    public final boolean zzcej;
    public final String zzcek;
    public final zzza zzcel;
    public final String zzcem;
    public final Bundle zzcen;
    public final Bundle zzceo;
    public final List<String> zzcep;
    public final String zzceq;
    public final String zzcer;
    @Deprecated
    public final boolean zzces;
    public final List<String> zzcet;
    public final zzud zzceu;
    public final Location zzmp;

    public zzuj(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzza zzza, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzud zzud, int i4, String str5, List<String> list3) {
        this.versionCode = i;
        this.zzceg = j;
        this.extras = bundle == null ? new Bundle() : bundle;
        this.zzceh = i2;
        this.zzcei = list;
        this.zzcej = z;
        this.zzacq = i3;
        this.zzbli = z2;
        this.zzcek = str;
        this.zzcel = zzza;
        this.zzmp = location;
        this.zzcem = str2;
        this.zzcen = bundle2 == null ? new Bundle() : bundle2;
        this.zzceo = bundle3;
        this.zzcep = list2;
        this.zzceq = str3;
        this.zzcer = str4;
        this.zzces = z3;
        this.zzceu = zzud;
        this.zzacr = i4;
        this.zzacs = str5;
        this.zzcet = list3 == null ? new ArrayList<>() : list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, this.zzceg);
        SafeParcelWriter.writeBundle(parcel, 3, this.extras, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzceh);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzcei, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzcej);
        SafeParcelWriter.writeInt(parcel, 7, this.zzacq);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbli);
        SafeParcelWriter.writeString(parcel, 9, this.zzcek, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzcel, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzmp, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzcem, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzcen, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzceo, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzcep, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzceq, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzcer, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzces);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzceu, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzacr);
        SafeParcelWriter.writeString(parcel, 21, this.zzacs, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzcet, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzuj)) {
            return false;
        }
        zzuj zzuj = (zzuj) obj;
        if (this.versionCode != zzuj.versionCode || this.zzceg != zzuj.zzceg || !Objects.equal(this.extras, zzuj.extras) || this.zzceh != zzuj.zzceh || !Objects.equal(this.zzcei, zzuj.zzcei) || this.zzcej != zzuj.zzcej || this.zzacq != zzuj.zzacq || this.zzbli != zzuj.zzbli || !Objects.equal(this.zzcek, zzuj.zzcek) || !Objects.equal(this.zzcel, zzuj.zzcel) || !Objects.equal(this.zzmp, zzuj.zzmp) || !Objects.equal(this.zzcem, zzuj.zzcem) || !Objects.equal(this.zzcen, zzuj.zzcen) || !Objects.equal(this.zzceo, zzuj.zzceo) || !Objects.equal(this.zzcep, zzuj.zzcep) || !Objects.equal(this.zzceq, zzuj.zzceq) || !Objects.equal(this.zzcer, zzuj.zzcer) || this.zzces != zzuj.zzces || this.zzacr != zzuj.zzacr || !Objects.equal(this.zzacs, zzuj.zzacs) || !Objects.equal(this.zzcet, zzuj.zzcet)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.versionCode), Long.valueOf(this.zzceg), this.extras, Integer.valueOf(this.zzceh), this.zzcei, Boolean.valueOf(this.zzcej), Integer.valueOf(this.zzacq), Boolean.valueOf(this.zzbli), this.zzcek, this.zzcel, this.zzmp, this.zzcem, this.zzcen, this.zzceo, this.zzcep, this.zzceq, this.zzcer, Boolean.valueOf(this.zzces), Integer.valueOf(this.zzacr), this.zzacs, this.zzcet);
    }
}
