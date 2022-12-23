package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcbk implements zzcaf {
    private final zzazz zzbmo;
    private final zzdgo zzfkd;
    private final zzdhe zzfll;
    private final zzbro zzfqc;
    private final zzbqw zzfqd;
    private boolean zzfqh = false;
    private boolean zzfqk = false;
    private final zzaly zzfuh;
    private final zzamd zzfui;
    private final zzame zzfuj;
    private final Context zzvf;

    public zzcbk(zzaly zzaly, zzamd zzamd, zzame zzame, zzbro zzbro, zzbqw zzbqw, Context context, zzdgo zzdgo, zzazz zzazz, zzdhe zzdhe) {
        this.zzfuh = zzaly;
        this.zzfui = zzamd;
        this.zzfuj = zzame;
        this.zzfqc = zzbro;
        this.zzfqd = zzbqw;
        this.zzvf = context;
        this.zzfkd = zzdgo;
        this.zzbmo = zzazz;
        this.zzfll = zzdhe;
    }

    public final void cancelUnconfirmedClick() {
    }

    public final void destroy() {
    }

    public final void setClickConfirmingView(View view) {
    }

    public final void zza(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zza(zzaer zzaer) {
    }

    public final void zzakl() {
    }

    public final void zzakn() {
    }

    public final void zzfx(String str) {
    }

    public final void zzg(Bundle bundle) {
    }

    public final void zzh(Bundle bundle) {
    }

    public final boolean zzi(Bundle bundle) {
        return false;
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            HashMap<String, View> zzb = zzb(map);
            HashMap<String, View> zzb2 = zzb(map2);
            if (this.zzfuj != null) {
                this.zzfuj.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
            } else if (this.zzfuh != null) {
                this.zzfuh.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzfuh.zzv(wrap);
            } else if (this.zzfui != null) {
                this.zzfui.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzfui.zzv(wrap);
            }
        } catch (RemoteException e) {
            zzawr.zzd("Failed to call trackView", e);
        }
    }

    private static HashMap<String, View> zzb(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final void zza(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            if (this.zzfuj != null) {
                this.zzfuj.zzw(wrap);
            } else if (this.zzfuh != null) {
                this.zzfuh.zzw(wrap);
            } else if (this.zzfui != null) {
                this.zzfui.zzw(wrap);
            }
        } catch (RemoteException e) {
            zzawr.zzd("Failed to call untrackView", e);
        }
    }

    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfqk || !this.zzfkd.zzdfj) {
            zzac(view);
        }
    }

    private final void zzac(View view) {
        try {
            if (this.zzfuj != null && !this.zzfuj.getOverrideClickHandling()) {
                this.zzfuj.zzu(ObjectWrapper.wrap(view));
                this.zzfqd.onAdClicked();
            } else if (this.zzfuh != null && !this.zzfuh.getOverrideClickHandling()) {
                this.zzfuh.zzu(ObjectWrapper.wrap(view));
                this.zzfqd.onAdClicked();
            } else if (this.zzfui != null && !this.zzfui.getOverrideClickHandling()) {
                this.zzfui.zzu(ObjectWrapper.wrap(view));
                this.zzfqd.onAdClicked();
            }
        } catch (RemoteException e) {
            zzawr.zzd("Failed to call handleClick", e);
        }
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfqk) {
            zzawr.zzfc("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzfkd.zzdfj) {
            zzawr.zzfc("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        } else {
            zzac(view);
        }
    }

    public final void zzsk() {
        this.zzfqk = true;
    }

    public final boolean isCustomClickGestureEnabled() {
        return this.zzfkd.zzdfj;
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.zzfqh && this.zzfkd.zzgtw != null) {
                this.zzfqh |= zzq.zzlg().zzb(this.zzvf, this.zzbmo.zzbnd, this.zzfkd.zzgtw.toString(), this.zzfll.zzgux);
            }
            if (this.zzfuj != null && !this.zzfuj.getOverrideImpressionRecording()) {
                this.zzfuj.recordImpression();
                this.zzfqc.onAdImpression();
            } else if (this.zzfuh != null && !this.zzfuh.getOverrideImpressionRecording()) {
                this.zzfuh.recordImpression();
                this.zzfqc.onAdImpression();
            } else if (this.zzfui != null && !this.zzfui.getOverrideImpressionRecording()) {
                this.zzfui.recordImpression();
                this.zzfqc.onAdImpression();
            }
        } catch (RemoteException e) {
            zzawr.zzd("Failed to call recordImpression", e);
        }
    }

    public final void zza(zzww zzww) {
        zzawr.zzfc("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zza(zzws zzws) {
        zzawr.zzfc("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzakm() {
        zzawr.zzfc("Mute This Ad is not supported for 3rd party ads");
    }
}
