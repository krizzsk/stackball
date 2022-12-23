package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final String zzacs;
    private final int zzdgl;
    private final String zzdhp;
    private final String zzelw;
    private final Bundle zzelx;
    private final Bundle zzely;
    private final int zzelz;
    private final boolean zzmo;
    private final Location zzmp;
    private final Context zzvf;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i, int i2, String str2, String str3) {
        this.zzelw = str;
        this.zzelx = bundle;
        this.zzely = bundle2;
        this.zzvf = context;
        this.zzmo = z;
        this.zzmp = location;
        this.zzdgl = i;
        this.zzelz = i2;
        this.zzacs = str2;
        this.zzdhp = str3;
    }

    public String getBidResponse() {
        return this.zzelw;
    }

    public Bundle getServerParameters() {
        return this.zzelx;
    }

    public Bundle getMediationExtras() {
        return this.zzely;
    }

    public Context getContext() {
        return this.zzvf;
    }

    public Location getLocation() {
        return this.zzmp;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzdgl;
    }

    public boolean isTestRequest() {
        return this.zzmo;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzelz;
    }

    public String getMaxAdContentRating() {
        return this.zzacs;
    }

    public String getWatermark() {
        return this.zzdhp;
    }
}
