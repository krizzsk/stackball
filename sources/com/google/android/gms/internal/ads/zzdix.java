package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdix implements zzdiy {
    private final Object[] zzgxw;

    public zzdix(zzuj zzuj, String str, int i, String str2, zzut zzut) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzuj.zzceg));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zzr(zzuj.extras));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzuj.extras.getString("npa"));
        }
        if (hashSet.contains(InneractiveMediationDefs.KEY_GENDER)) {
            arrayList.add(Integer.valueOf(zzuj.zzceh));
        }
        if (hashSet.contains("keywords")) {
            if (zzuj.zzcei != null) {
                arrayList.add(zzuj.zzcei.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzuj.zzcej));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzuj.zzacq));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzuj.zzbli));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzuj.zzcek);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.LOCATION)) {
            if (zzuj.zzmp != null) {
                arrayList.add(zzuj.zzmp.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzuj.zzcem);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zzr(zzuj.zzcen));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zzr(zzuj.zzceo));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzuj.zzcep != null) {
                arrayList.add(zzuj.zzcep.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzuj.zzceq);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzuj.zzcer);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzuj.zzces));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzuj.zzacr));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzuj.zzacs);
        }
        if (hashSet.contains("orientation")) {
            if (zzut != null) {
                arrayList.add(Integer.valueOf(zzut.orientation));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.zzgxw = arrayList.toArray();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdix)) {
            return false;
        }
        return Arrays.equals(this.zzgxw, ((zzdix) obj).zzgxw);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzgxw);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.zzgxw);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }

    private static String zzr(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = zzr((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
