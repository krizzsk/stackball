package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcae {
    public static final zzcae zzfsw = new zzcag().zzals();
    private final zzadx zzfsp;
    private final zzads zzfsq;
    private final zzael zzfsr;
    private final zzaeg zzfss;
    private final zzahu zzfst;
    private final SimpleArrayMap<String, zzaed> zzfsu;
    private final SimpleArrayMap<String, zzady> zzfsv;

    public final zzadx zzall() {
        return this.zzfsp;
    }

    public final zzads zzalm() {
        return this.zzfsq;
    }

    public final zzael zzaln() {
        return this.zzfsr;
    }

    public final zzaeg zzalo() {
        return this.zzfss;
    }

    public final zzahu zzalp() {
        return this.zzfst;
    }

    public final zzaed zzgb(String str) {
        return this.zzfsu.get(str);
    }

    public final zzady zzgc(String str) {
        return this.zzfsv.get(str);
    }

    public final ArrayList<String> zzalq() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzfsr != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzfsp != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzfsq != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.zzfsu.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzfst != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> zzalr() {
        ArrayList<String> arrayList = new ArrayList<>(this.zzfsu.size());
        for (int i = 0; i < this.zzfsu.size(); i++) {
            arrayList.add(this.zzfsu.keyAt(i));
        }
        return arrayList;
    }

    private zzcae(zzcag zzcag) {
        this.zzfsp = zzcag.zzfsp;
        this.zzfsq = zzcag.zzfsq;
        this.zzfsr = zzcag.zzfsr;
        this.zzfsu = new SimpleArrayMap<>(zzcag.zzfsu);
        this.zzfsv = new SimpleArrayMap<>(zzcag.zzfsv);
        this.zzfss = zzcag.zzfss;
        this.zzfst = zzcag.zzfst;
    }
}
