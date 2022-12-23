package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzarj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarj> CREATOR = new zzarm();
    public final ApplicationInfo applicationInfo;
    public final String packageName;
    public final zzazz zzdls;
    public final PackageInfo zzdly;
    public final List<String> zzdmi;
    public final String zzdms;
    public final Bundle zzdpe;
    public final boolean zzdpf;
    public final String zzdpg;
    public zzdir zzdph;
    public String zzdpi;

    public zzarj(Bundle bundle, zzazz zzazz, ApplicationInfo applicationInfo2, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3, zzdir zzdir, String str4) {
        this.zzdpe = bundle;
        this.zzdls = zzazz;
        this.packageName = str;
        this.applicationInfo = applicationInfo2;
        this.zzdmi = list;
        this.zzdly = packageInfo;
        this.zzdms = str2;
        this.zzdpf = z;
        this.zzdpg = str3;
        this.zzdph = zzdir;
        this.zzdpi = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzdpe, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdls, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzdmi, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdly, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdms, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdpf);
        SafeParcelWriter.writeString(parcel, 9, this.zzdpg, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzdph, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzdpi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
