package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbcu implements zzgs, zzmf, zzoi<zznu>, zzpm {
    private static int zzefr;
    private static int zzefs;
    private int bytesTransferred;
    private final zzbby zzeet;
    private final zzbcr zzeft;
    private final zzhk zzefu;
    private final zzhk zzefv;
    private final zzni zzefw;
    private zzgt zzefx;
    private ByteBuffer zzefy;
    private boolean zzefz;
    private zzbdc zzega;
    private Set<WeakReference<zzbcn>> zzegb = new HashSet();
    private final Context zzvf;

    public zzbcu(Context context, zzbby zzbby) {
        this.zzvf = context;
        this.zzeet = zzbby;
        this.zzeft = new zzbcr();
        this.zzefu = new zzpg(this.zzvf, zzld.zzbad, 0, zzaxa.zzdwf, this, -1);
        this.zzefv = new zzio(zzld.zzbad);
        this.zzefw = new zznd();
        if (zzawr.zzwo()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzawr.zzeg(sb.toString());
        }
        zzefr++;
        zzgt zza = zzgx.zza(new zzhk[]{this.zzefv, this.zzefu}, this.zzefw, this.zzeft);
        this.zzefx = zza;
        zza.zza((zzgs) this);
    }

    public final void zza(zzhl zzhl) {
    }

    public final void zza(zzhp zzhp, Object obj) {
    }

    public final void zza(zzna zzna, zznl zznl) {
    }

    public final void zzb(Surface surface) {
    }

    public final void zzd(String str, long j, long j2) {
    }

    public final void zze(zziy zziy) {
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj) {
    }

    public final void zzej() {
    }

    public final void zzf(int i, long j) {
    }

    public final void zzf(zziy zziy) {
    }

    public final void zzf(boolean z) {
    }

    public final void zzk(zzhf zzhf) {
    }

    public final zzgt zzaah() {
        return this.zzefx;
    }

    public static int zzaai() {
        return zzefr;
    }

    public static int zzaaj() {
        return zzefs;
    }

    public final void zza(zzbdc zzbdc) {
        this.zzega = zzbdc;
    }

    public final zzbcr zzaak() {
        return this.zzeft;
    }

    public final void zza(Uri[] uriArr, String str) {
        zza(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzmk zzmk;
        if (this.zzefx != null) {
            this.zzefy = byteBuffer;
            this.zzefz = z;
            if (uriArr.length == 1) {
                zzmk = zzb(uriArr[0], str);
            } else {
                zzmk[] zzmkArr = new zzmk[uriArr.length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzmkArr[i] = zzb(uriArr[i], str);
                }
                zzmk = new zzml(zzmkArr);
            }
            this.zzefx.zza(zzmk);
            zzefs++;
        }
    }

    public final void release() {
        zzgt zzgt = this.zzefx;
        if (zzgt != null) {
            zzgt.zzb((zzgs) this);
            this.zzefx.release();
            this.zzefx = null;
            zzefs--;
        }
    }

    public final long getBytesTransferred() {
        return (long) this.bytesTransferred;
    }

    public final void zzb(IOException iOException) {
        zzbdc zzbdc = this.zzega;
        if (zzbdc != null) {
            zzbdc.zza("onLoadError", iOException);
        }
    }

    public final void zzb(int i, int i2, int i3, float f) {
        zzbdc zzbdc = this.zzega;
        if (zzbdc != null) {
            zzbdc.zzn(i, i2);
        }
    }

    public final void zza(boolean z, int i) {
        zzbdc zzbdc = this.zzega;
        if (zzbdc != null) {
            zzbdc.zzdj(i);
        }
    }

    public final void zza(zzgq zzgq) {
        zzbdc zzbdc = this.zzega;
        if (zzbdc != null) {
            zzbdc.zza("onPlayerError", zzgq);
        }
    }

    public final void zzdi(int i) {
        for (WeakReference<zzbcn> weakReference : this.zzegb) {
            zzbcn zzbcn = (zzbcn) weakReference.get();
            if (zzbcn != null) {
                zzbcn.setReceiveBufferSize(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        if (this.zzefx != null) {
            zzgu zzgu = new zzgu(this.zzefu, 1, surface);
            if (z) {
                this.zzefx.zzb(zzgu);
                return;
            }
            this.zzefx.zza(zzgu);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        if (this.zzefx != null) {
            zzgu zzgu = new zzgu(this.zzefv, 2, Float.valueOf(f));
            if (z) {
                this.zzefx.zzb(zzgu);
                return;
            }
            this.zzefx.zza(zzgu);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaw(boolean z) {
        if (this.zzefx != null) {
            for (int i = 0; i < this.zzefx.zzel(); i++) {
                this.zzefw.zzf(i, !z);
            }
        }
    }

    private final zzmk zzb(Uri uri, String str) {
        zznt zznt;
        if (!this.zzefz || this.zzefy.limit() <= 0) {
            if (this.zzeet.zzedz > 0) {
                zznt = new zzbcw(this, str);
            } else {
                zznt = new zzbcv(this, str);
            }
            if (this.zzeet.zzeea) {
                zznt = new zzbcy(this, zznt);
            }
            if (this.zzefy.limit() > 0) {
                byte[] bArr = new byte[this.zzefy.limit()];
                this.zzefy.get(bArr);
                zznt = new zzbcx(zznt, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.zzefy.limit()];
            this.zzefy.get(bArr2);
            zznt = new zzbct(bArr2);
        }
        return new zzmg(uri, zznt, zzbda.zzegf, this.zzeet.zzeeb, zzaxa.zzdwf, this, (String) null, this.zzeet.zzedx);
    }

    public final void finalize() throws Throwable {
        zzefr--;
        if (zzawr.zzwo()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzawr.zzeg(sb.toString());
        }
    }

    public final /* synthetic */ void zzc(Object obj, int i) {
        this.bytesTransferred += i;
    }

    public final /* synthetic */ void zza(Object obj, zznv zznv) {
        this.bytesTransferred = 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zznu zza(zznt zznt) {
        return new zzbcp(this.zzvf, zznt.zzio(), this, new zzbcz(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        zzbdc zzbdc = this.zzega;
        if (zzbdc != null) {
            zzbdc.zzb(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zznu zzfj(String str) {
        return new zznx(str, (zzou<String>) null, this.zzeet.zzeea ? null : this, this.zzeet.zzedu, this.zzeet.zzedw, true, (zzoc) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zznu zzfk(String str) {
        zzbcn zzbcn = new zzbcn(str, this.zzeet.zzeea ? null : this, this.zzeet.zzedu, this.zzeet.zzedw, this.zzeet.zzedz);
        this.zzegb.add(new WeakReference(zzbcn));
        return zzbcn;
    }
}
