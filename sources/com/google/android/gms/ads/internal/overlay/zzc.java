package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzapa;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzrv;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzub;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzzz;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzc extends zzapf implements zzy {
    private static final int zzdjp = Color.argb(0, 0, 0, 0);
    protected final Activity zzaad;
    private boolean zzblz = false;
    zzbek zzdce;
    AdOverlayInfoParcel zzdjq;
    private zzi zzdjr;
    private zzq zzdjs;
    private boolean zzdjt = false;
    private FrameLayout zzdju;
    private WebChromeClient.CustomViewCallback zzdjv;
    private boolean zzdjw = false;
    private zzj zzdjx;
    private boolean zzdjy = false;
    int zzdjz = 0;
    private final Object zzdka = new Object();
    private Runnable zzdkb;
    private boolean zzdkc;
    private boolean zzdkd;
    private boolean zzdke = false;
    private boolean zzdkf = false;
    private boolean zzdkg = true;

    public zzc(Activity activity) {
        this.zzaad = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onRestart() {
    }

    public final void close() {
        this.zzdjz = 2;
        this.zzaad.finish();
    }

    public final void zzuf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjq;
        if (adOverlayInfoParcel != null && this.zzdjt) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdju != null) {
            this.zzaad.setContentView(this.zzdjx);
            this.zzdkd = true;
            this.zzdju.removeAllViews();
            this.zzdju = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdjv;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdjv = null;
        }
        this.zzdjt = false;
    }

    public final void zzug() {
        this.zzdjz = 1;
        this.zzaad.finish();
    }

    public final void onBackPressed() {
        this.zzdjz = 0;
    }

    public final boolean zzuh() {
        this.zzdjz = 0;
        zzbek zzbek = this.zzdce;
        if (zzbek == null) {
            return true;
        }
        boolean zzabq = zzbek.zzabq();
        if (!zzabq) {
            this.zzdce.zza("onbackblocked", Collections.emptyMap());
        }
        return zzabq;
    }

    public void onCreate(Bundle bundle) {
        this.zzaad.requestWindowFeature(1);
        this.zzdjw = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.zzaad.getIntent());
            this.zzdjq = zzc;
            if (zzc != null) {
                if (zzc.zzbmo.zzdzo > 7500000) {
                    this.zzdjz = 3;
                }
                if (this.zzaad.getIntent() != null) {
                    this.zzdkg = this.zzaad.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzdjq.zzdla != null) {
                    this.zzblz = this.zzdjq.zzdla.zzblz;
                } else {
                    this.zzblz = false;
                }
                if (this.zzblz && this.zzdjq.zzdla.zzbme != -1) {
                    new zzl(this).zzwn();
                }
                if (bundle == null) {
                    if (this.zzdjq.zzdkt != null && this.zzdkg) {
                        this.zzdjq.zzdkt.zzua();
                    }
                    if (!(this.zzdjq.zzdky == 1 || this.zzdjq.zzceb == null)) {
                        this.zzdjq.zzceb.onAdClicked();
                    }
                }
                zzj zzj = new zzj(this.zzaad, this.zzdjq.zzdkz, this.zzdjq.zzbmo.zzbnd);
                this.zzdjx = zzj;
                zzj.setId(1000);
                zzq.zzky().zzg(this.zzaad);
                int i = this.zzdjq.zzdky;
                if (i == 1) {
                    zzaj(false);
                } else if (i == 2) {
                    this.zzdjr = new zzi(this.zzdjq.zzdce);
                    zzaj(false);
                } else if (i == 3) {
                    zzaj(true);
                } else {
                    throw new zzg("Could not determine ad overlay type.");
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e) {
            zzawr.zzfc(e.getMessage());
            this.zzdjz = 3;
            this.zzaad.finish();
        }
    }

    public final void onStart() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue()) {
            zzbek zzbek = this.zzdce;
            if (zzbek == null || zzbek.isDestroyed()) {
                zzawr.zzfc("The webview does not exist. Ignoring action.");
                return;
            }
            zzq.zzky();
            zzaxf.zzb(this.zzdce);
        }
    }

    public final void onResume() {
        if (this.zzdjq.zzdkt != null) {
            this.zzdjq.zzdkt.onResume();
        }
        zza(this.zzaad.getResources().getConfiguration());
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue()) {
            zzbek zzbek = this.zzdce;
            if (zzbek == null || zzbek.isDestroyed()) {
                zzawr.zzfc("The webview does not exist. Ignoring action.");
                return;
            }
            zzq.zzky();
            zzaxf.zzb(this.zzdce);
        }
    }

    public final void onPause() {
        zzuf();
        if (this.zzdjq.zzdkt != null) {
            this.zzdjq.zzdkt.onPause();
        }
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue() && this.zzdce != null && (!this.zzaad.isFinishing() || this.zzdjr == null)) {
            zzq.zzky();
            zzaxf.zza(this.zzdce);
        }
        zzuj();
    }

    public final void zzad(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdjw);
    }

    public final void onStop() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue() && this.zzdce != null && (!this.zzaad.isFinishing() || this.zzdjr == null)) {
            zzq.zzky();
            zzaxf.zza(this.zzdce);
        }
        zzuj();
    }

    public final void onDestroy() {
        zzbek zzbek = this.zzdce;
        if (zzbek != null) {
            try {
                this.zzdjx.removeView(zzbek.getView());
            } catch (NullPointerException unused) {
            }
        }
        zzuj();
    }

    private final void zzai(boolean z) {
        int intValue = ((Integer) zzvj.zzpv().zzd(zzzz.zzcqp)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = z ? intValue : 0;
        zzp.paddingRight = z ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        this.zzdjs = new zzq(this.zzaad, zzp, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdjq.zzdkv);
        this.zzdjx.addView(this.zzdjs, layoutParams);
    }

    public final void zzdp() {
        this.zzdkd = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r0 = r6.zzdjq;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzzk<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzz.zzclu
            com.google.android.gms.internal.ads.zzzv r1 = com.google.android.gms.internal.ads.zzvj.zzpv()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdjq
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.zzg r0 = r0.zzdla
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.zzdjq
            com.google.android.gms.ads.internal.zzg r0 = r0.zzdla
            boolean r0 = r0.zzbmg
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            com.google.android.gms.internal.ads.zzzk<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzzz.zzclv
            com.google.android.gms.internal.ads.zzzv r4 = com.google.android.gms.internal.ads.zzvj.zzpv()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdjq
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.zzg r3 = r3.zzdla
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.zzdjq
            com.google.android.gms.ads.internal.zzg r3 = r3.zzdla
            boolean r3 = r3.zzbmh
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r7 == 0) goto L_0x0062
            if (r8 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0062
            if (r3 != 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzapb r7 = new com.google.android.gms.internal.ads.zzapb
            com.google.android.gms.internal.ads.zzbek r4 = r6.zzdce
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.zzdv(r4)
        L_0x0062:
            com.google.android.gms.ads.internal.overlay.zzq r7 = r6.zzdjs
            if (r7 == 0) goto L_0x0071
            if (r3 != 0) goto L_0x006e
            if (r8 == 0) goto L_0x006d
            if (r0 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            r7.zzal(r1)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzc.zza(boolean, boolean):void");
    }

    public final void zzui() {
        this.zzdjx.removeView(this.zzdjs);
        zzai(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzaad.getApplicationInfo().targetSdkVersion >= ((Integer) zzvj.zzpv().zzd(zzzz.zzcsn)).intValue()) {
            if (this.zzaad.getApplicationInfo().targetSdkVersion <= ((Integer) zzvj.zzpv().zzd(zzzz.zzcso)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzvj.zzpv().zzd(zzzz.zzcsp)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzvj.zzpv().zzd(zzzz.zzcsq)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzaad.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzq.zzla().zzb(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzaad);
        this.zzdju = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdju.addView(view, -1, -1);
        this.zzaad.setContentView(this.zzdju);
        this.zzdkd = true;
        this.zzdjv = customViewCallback;
        this.zzdjt = true;
    }

    private final void zzaj(boolean z) throws zzg {
        if (!this.zzdkd) {
            this.zzaad.requestWindowFeature(1);
        }
        Window window = this.zzaad.getWindow();
        if (window != null) {
            zzbfw zzabj = this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabj() : null;
            boolean z2 = false;
            boolean z3 = zzabj != null && zzabj.zzaap();
            this.zzdjy = false;
            if (z3) {
                int i = this.zzdjq.orientation;
                zzq.zzky();
                if (i == 6) {
                    if (this.zzaad.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.zzdjy = z2;
                } else {
                    int i2 = this.zzdjq.orientation;
                    zzq.zzky();
                    if (i2 == 7) {
                        if (this.zzaad.getResources().getConfiguration().orientation == 2) {
                            z2 = true;
                        }
                        this.zzdjy = z2;
                    }
                }
            }
            boolean z4 = this.zzdjy;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z4);
            zzawr.zzed(sb.toString());
            setRequestedOrientation(this.zzdjq.orientation);
            zzq.zzky();
            window.setFlags(16777216, 16777216);
            zzawr.zzed("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzblz) {
                this.zzdjx.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.zzdjx.setBackgroundColor(zzdjp);
            }
            this.zzaad.setContentView(this.zzdjx);
            this.zzdkd = true;
            if (z) {
                try {
                    zzq.zzkx();
                    zzbek zza = zzbes.zza(this.zzaad, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabh() : null, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabi() : null, true, z3, (zzdt) null, this.zzdjq.zzbmo, (zzaam) null, (zzi) null, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzzi() : null, zzst.zzmz(), (zzrv) null, false);
                    this.zzdce = zza;
                    zza.zzabj().zza((zzub) null, this.zzdjq.zzczu, (zzo) null, this.zzdjq.zzczw, this.zzdjq.zzdkx, true, (zzagd) null, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabj().zzaao() : null, (zzapa) null, (zzaun) null);
                    this.zzdce.zzabj().zza((zzbfv) new zzf(this));
                    if (this.zzdjq.url != null) {
                        this.zzdce.loadUrl(this.zzdjq.url);
                    } else if (this.zzdjq.zzdkw != null) {
                        this.zzdce.loadDataWithBaseURL(this.zzdjq.zzdku, this.zzdjq.zzdkw, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
                    } else {
                        throw new zzg("No URL or HTML to display in ad overlay.");
                    }
                    if (this.zzdjq.zzdce != null) {
                        this.zzdjq.zzdce.zzb(this);
                    }
                } catch (Exception e) {
                    zzawr.zzc("Error obtaining webview.", e);
                    throw new zzg("Could not obtain webview for the overlay.");
                }
            } else {
                zzbek zzbek = this.zzdjq.zzdce;
                this.zzdce = zzbek;
                zzbek.zzbt(this.zzaad);
            }
            this.zzdce.zza(this);
            if (this.zzdjq.zzdce != null) {
                zzc(this.zzdjq.zzdce.zzabn(), this.zzdjx);
            }
            ViewParent parent = this.zzdce.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzdce.getView());
            }
            if (this.zzblz) {
                this.zzdce.zzabv();
            }
            this.zzdce.zza((ViewGroup) null, this.zzaad, this.zzdjq.zzdku, this.zzdjq.zzdkw);
            this.zzdjx.addView(this.zzdce.getView(), -1, -1);
            if (!z && !this.zzdjy) {
                zzum();
            }
            zzai(z3);
            if (this.zzdce.zzabl()) {
                zza(z3, true);
                return;
            }
            return;
        }
        throw new zzg("Invalid activity, no window available.");
    }

    private final void zzuj() {
        if (this.zzaad.isFinishing() && !this.zzdke) {
            this.zzdke = true;
            zzbek zzbek = this.zzdce;
            if (zzbek != null) {
                zzbek.zzdn(this.zzdjz);
                synchronized (this.zzdka) {
                    if (!this.zzdkc && this.zzdce.zzabr()) {
                        this.zzdkb = new zze(this);
                        zzaxa.zzdwf.postDelayed(this.zzdkb, ((Long) zzvj.zzpv().zzd(zzzz.zzclt)).longValue());
                        return;
                    }
                }
            }
            zzuk();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzuk() {
        if (!this.zzdkf) {
            this.zzdkf = true;
            zzbek zzbek = this.zzdce;
            if (zzbek != null) {
                this.zzdjx.removeView(zzbek.getView());
                zzi zzi = this.zzdjr;
                if (zzi != null) {
                    this.zzdce.zzbt(zzi.zzvf);
                    this.zzdce.zzba(false);
                    this.zzdjr.parent.addView(this.zzdce.getView(), this.zzdjr.index, this.zzdjr.zzdkm);
                    this.zzdjr = null;
                } else if (this.zzaad.getApplicationContext() != null) {
                    this.zzdce.zzbt(this.zzaad.getApplicationContext());
                }
                this.zzdce = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjq;
            if (!(adOverlayInfoParcel == null || adOverlayInfoParcel.zzdkt == null)) {
                this.zzdjq.zzdkt.zztz();
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjq;
            if (adOverlayInfoParcel2 != null && adOverlayInfoParcel2.zzdce != null) {
                zzc(this.zzdjq.zzdce.zzabn(), this.zzdjq.zzdce.getView());
            }
        }
    }

    private static void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper != null && view != null) {
            zzq.zzll().zza(iObjectWrapper, view);
        }
    }

    public final void zzul() {
        if (this.zzdjy) {
            this.zzdjy = false;
            zzum();
        }
    }

    private final void zzum() {
        this.zzdce.zzum();
    }

    public final void zzun() {
        this.zzdjx.zzdko = true;
    }

    public final void zzuo() {
        synchronized (this.zzdka) {
            this.zzdkc = true;
            if (this.zzdkb != null) {
                zzaxa.zzdwf.removeCallbacks(this.zzdkb);
                zzaxa.zzdwf.post(this.zzdkb);
            }
        }
    }

    private final void zza(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjq;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdla == null || !this.zzdjq.zzdla.zzbma) ? false : true;
        boolean zza = zzq.zzky().zza(this.zzaad, configuration);
        if ((this.zzblz && !z3) || zza) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzdjq) != null && adOverlayInfoParcel.zzdla != null && this.zzdjq.zzdla.zzbmf) {
            z2 = true;
        }
        Window window = this.zzaad.getWindow();
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclw)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT >= 19 && z2) {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }
}
