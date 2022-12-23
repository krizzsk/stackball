package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzaqw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqw> CREATOR = new zzaqv();
    private final int errorCode;
    private final int orientation;
    private final int versionCode;
    private final zzaqy zzblw;
    private final boolean zzbmg;
    private final boolean zzbmh;
    private final boolean zzbnf;
    private final boolean zzcey;
    private final boolean zzcez;
    private final List<String> zzdeu;
    private final List<String> zzdev;
    private final List<String> zzdew;
    private final List<String> zzdey;
    private final boolean zzdez;
    private final long zzdfb;
    private final String zzdku;
    private final boolean zzdme;
    private final boolean zzdmr;
    private String zzdms;
    private final boolean zzdne;
    private String zzdnr;
    private final long zzdns;
    private final boolean zzdnt;
    private final long zzdnu;
    private final List<String> zzdnv;
    private final String zzdnw;
    private final long zzdnx;
    private final String zzdny;
    private final boolean zzdnz;
    private final String zzdoa;
    private final String zzdob;
    private final boolean zzdoc;
    private final boolean zzdod;
    private final boolean zzdoe;
    private zzari zzdof;
    private String zzdog;
    private final String zzdoh;
    private final zzatc zzdoi;
    private final List<String> zzdoj;
    private final List<String> zzdok;
    private final boolean zzdol;
    private final String zzdom;
    private final zzaum zzdon;
    private final String zzdoo;
    private final boolean zzdop;
    private Bundle zzdoq;
    private final int zzdor;
    private final boolean zzdos;
    private final String zzdot;
    private String zzdou;
    private boolean zzdov;
    private boolean zzdow;

    zzaqw(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzari zzari, String str7, String str8, boolean z8, boolean z9, zzatc zzatc, List<String> list4, List<String> list5, boolean z10, zzaqy zzaqy, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaum zzaum, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12, String str13, boolean z18, boolean z19) {
        zzarl zzarl;
        zzari zzari2 = zzari;
        this.versionCode = i;
        this.zzdku = str;
        this.zzdnr = str2;
        List<String> list8 = null;
        this.zzdeu = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.zzdev = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.zzdns = j;
        this.zzdnt = z;
        this.zzdnu = j2;
        this.zzdnv = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.zzdfb = j3;
        this.orientation = i3;
        this.zzdnw = str3;
        this.zzdnx = j4;
        this.zzdny = str4;
        this.zzdnz = z2;
        this.zzdoa = str5;
        this.zzdob = str6;
        this.zzdoc = z3;
        this.zzbnf = z4;
        this.zzdme = z5;
        this.zzdod = z6;
        this.zzdop = z13;
        this.zzdoe = z7;
        this.zzdof = zzari2;
        this.zzdog = str7;
        this.zzdoh = str8;
        if (this.zzdnr == null && zzari2 != null && (zzarl = (zzarl) zzari2.zza(zzarl.CREATOR)) != null && !TextUtils.isEmpty(zzarl.zzdpj)) {
            this.zzdnr = zzarl.zzdpj;
        }
        this.zzcey = z8;
        this.zzcez = z9;
        this.zzdoi = zzatc;
        this.zzdoj = list4;
        this.zzdok = list5;
        this.zzdol = z10;
        this.zzblw = zzaqy;
        this.zzdmr = z11;
        this.zzdms = str9;
        this.zzdey = list6;
        this.zzdez = z12;
        this.zzdom = str10;
        this.zzdon = zzaum;
        this.zzdoo = str11;
        this.zzdne = z14;
        this.zzdoq = bundle;
        this.zzbmg = z15;
        this.zzdor = i4;
        this.zzdos = z16;
        this.zzdew = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.zzbmh = z17;
        this.zzdot = str12;
        this.zzdou = str13;
        this.zzdov = z18;
        this.zzdow = z19;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzdku, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdnr, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzdeu, false);
        SafeParcelWriter.writeInt(parcel, 5, this.errorCode);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdev, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzdns);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdnt);
        SafeParcelWriter.writeLong(parcel, 9, this.zzdnu);
        SafeParcelWriter.writeStringList(parcel, 10, this.zzdnv, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzdfb);
        SafeParcelWriter.writeInt(parcel, 12, this.orientation);
        SafeParcelWriter.writeString(parcel, 13, this.zzdnw, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzdnx);
        SafeParcelWriter.writeString(parcel, 15, this.zzdny, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzdnz);
        SafeParcelWriter.writeString(parcel, 19, this.zzdoa, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzdob, false);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzdoc);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzbnf);
        SafeParcelWriter.writeBoolean(parcel, 24, this.zzdme);
        SafeParcelWriter.writeBoolean(parcel, 25, this.zzdod);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzdoe);
        SafeParcelWriter.writeParcelable(parcel, 28, this.zzdof, i, false);
        SafeParcelWriter.writeString(parcel, 29, this.zzdog, false);
        SafeParcelWriter.writeString(parcel, 30, this.zzdoh, false);
        SafeParcelWriter.writeBoolean(parcel, 31, this.zzcey);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzcez);
        SafeParcelWriter.writeParcelable(parcel, 33, this.zzdoi, i, false);
        SafeParcelWriter.writeStringList(parcel, 34, this.zzdoj, false);
        SafeParcelWriter.writeStringList(parcel, 35, this.zzdok, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzdol);
        SafeParcelWriter.writeParcelable(parcel, 37, this.zzblw, i, false);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdmr);
        SafeParcelWriter.writeString(parcel, 39, this.zzdms, false);
        SafeParcelWriter.writeStringList(parcel, 40, this.zzdey, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdez);
        SafeParcelWriter.writeString(parcel, 43, this.zzdom, false);
        SafeParcelWriter.writeParcelable(parcel, 44, this.zzdon, i, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdoo, false);
        SafeParcelWriter.writeBoolean(parcel, 46, this.zzdop);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdne);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdoq, false);
        SafeParcelWriter.writeBoolean(parcel, 49, this.zzbmg);
        SafeParcelWriter.writeInt(parcel, 50, this.zzdor);
        SafeParcelWriter.writeBoolean(parcel, 51, this.zzdos);
        SafeParcelWriter.writeStringList(parcel, 52, this.zzdew, false);
        SafeParcelWriter.writeBoolean(parcel, 53, this.zzbmh);
        SafeParcelWriter.writeString(parcel, 54, this.zzdot, false);
        SafeParcelWriter.writeString(parcel, 55, this.zzdou, false);
        SafeParcelWriter.writeBoolean(parcel, 56, this.zzdov);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdow);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
