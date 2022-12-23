package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzub;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    public final int orientation;
    public final String url;
    public final zzazz zzbmo;
    public final zzub zzceb;
    public final zzafj zzczu;
    public final zzafl zzczw;
    public final zzbek zzdce;
    public final zzd zzdks;
    public final zzo zzdkt;
    public final String zzdku;
    public final boolean zzdkv;
    public final String zzdkw;
    public final zzt zzdkx;
    public final int zzdky;
    public final String zzdkz;
    public final zzg zzdla;

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(zzub zzub, zzo zzo, zzt zzt, zzbek zzbek, int i, zzazz zzazz, String str, zzg zzg, String str2, String str3) {
        this.zzdks = null;
        this.zzceb = null;
        this.zzdkt = zzo;
        this.zzdce = zzbek;
        this.zzczu = null;
        this.zzczw = null;
        this.zzdku = str2;
        this.zzdkv = false;
        this.zzdkw = str3;
        this.zzdkx = null;
        this.orientation = i;
        this.zzdky = 1;
        this.url = null;
        this.zzbmo = zzazz;
        this.zzdkz = str;
        this.zzdla = zzg;
    }

    public AdOverlayInfoParcel(zzub zzub, zzo zzo, zzt zzt, zzbek zzbek, boolean z, int i, zzazz zzazz) {
        this.zzdks = null;
        this.zzceb = zzub;
        this.zzdkt = zzo;
        this.zzdce = zzbek;
        this.zzczu = null;
        this.zzczw = null;
        this.zzdku = null;
        this.zzdkv = z;
        this.zzdkw = null;
        this.zzdkx = zzt;
        this.orientation = i;
        this.zzdky = 2;
        this.url = null;
        this.zzbmo = zzazz;
        this.zzdkz = null;
        this.zzdla = null;
    }

    public AdOverlayInfoParcel(zzub zzub, zzo zzo, zzafj zzafj, zzafl zzafl, zzt zzt, zzbek zzbek, boolean z, int i, String str, zzazz zzazz) {
        this.zzdks = null;
        this.zzceb = zzub;
        this.zzdkt = zzo;
        this.zzdce = zzbek;
        this.zzczu = zzafj;
        this.zzczw = zzafl;
        this.zzdku = null;
        this.zzdkv = z;
        this.zzdkw = null;
        this.zzdkx = zzt;
        this.orientation = i;
        this.zzdky = 3;
        this.url = str;
        this.zzbmo = zzazz;
        this.zzdkz = null;
        this.zzdla = null;
    }

    public AdOverlayInfoParcel(zzub zzub, zzo zzo, zzafj zzafj, zzafl zzafl, zzt zzt, zzbek zzbek, boolean z, int i, String str, String str2, zzazz zzazz) {
        this.zzdks = null;
        this.zzceb = zzub;
        this.zzdkt = zzo;
        this.zzdce = zzbek;
        this.zzczu = zzafj;
        this.zzczw = zzafl;
        this.zzdku = str2;
        this.zzdkv = z;
        this.zzdkw = str;
        this.zzdkx = zzt;
        this.orientation = i;
        this.zzdky = 3;
        this.url = null;
        this.zzbmo = zzazz;
        this.zzdkz = null;
        this.zzdla = null;
    }

    public AdOverlayInfoParcel(zzd zzd, zzub zzub, zzo zzo, zzt zzt, zzazz zzazz) {
        this.zzdks = zzd;
        this.zzceb = zzub;
        this.zzdkt = zzo;
        this.zzdce = null;
        this.zzczu = null;
        this.zzczw = null;
        this.zzdku = null;
        this.zzdkv = false;
        this.zzdkw = null;
        this.zzdkx = zzt;
        this.orientation = -1;
        this.zzdky = 4;
        this.url = null;
        this.zzbmo = zzazz;
        this.zzdkz = null;
        this.zzdla = null;
    }

    AdOverlayInfoParcel(zzd zzd, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzazz zzazz, String str4, zzg zzg, IBinder iBinder6) {
        this.zzdks = zzd;
        this.zzceb = (zzub) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzdkt = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzdce = (zzbek) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzczu = (zzafj) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zzczw = (zzafl) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzdku = str;
        this.zzdkv = z;
        this.zzdkw = str2;
        this.zzdkx = (zzt) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.orientation = i;
        this.zzdky = i2;
        this.url = str3;
        this.zzbmo = zzazz;
        this.zzdkz = str4;
        this.zzdla = zzg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdks, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzceb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzdkt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzdce).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zzczw).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdku, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdkv);
        SafeParcelWriter.writeString(parcel, 9, this.zzdkw, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzdkx).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.orientation);
        SafeParcelWriter.writeInt(parcel, 12, this.zzdky);
        SafeParcelWriter.writeString(parcel, 13, this.url, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzbmo, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzdkz, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzdla, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzczu).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
