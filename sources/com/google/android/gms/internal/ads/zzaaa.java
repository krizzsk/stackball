package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzaaa {
    static List<String> zzre() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzaaz.zzi("gad:dynamite_module:experiment_id", ""));
        zza(arrayList, zzabl.zzcwo);
        zza(arrayList, zzabl.zzcwp);
        zza(arrayList, zzabl.zzcwq);
        zza(arrayList, zzabl.zzcwr);
        zza(arrayList, zzabl.zzcws);
        zza(arrayList, zzabl.zzcwy);
        zza(arrayList, zzabl.zzcwt);
        zza(arrayList, zzabl.zzcwu);
        zza(arrayList, zzabl.zzcwv);
        zza(arrayList, zzabl.zzcww);
        zza(arrayList, zzabl.zzcwx);
        return arrayList;
    }

    static List<String> zzrf() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzabv.zzcxv);
        return arrayList;
    }

    private static void zza(List<String> list, zzaaz<String> zzaaz) {
        String str = zzaaz.get();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
