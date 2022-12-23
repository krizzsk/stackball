package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.share.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbft;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.net.URISyntaxException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzage<T extends zzbfj & zzbfm & zzbfq & zzbfr & zzbft> implements zzaga<T> {
    private final zzc zzdaq;
    private final zzaor zzdar;

    public zzage(zzc zzc, zzaor zzaor) {
        this.zzdaq = zzc;
        this.zzdar = zzaor;
    }

    private static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            zzq.zzky();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            zzq.zzky();
            return 6;
        } else if (Constants.URL_CAMPAIGN.equalsIgnoreCase(str)) {
            return zzq.zzky().zzxk();
        } else {
            return -1;
        }
    }

    private final void zzab(boolean z) {
        zzaor zzaor = this.zzdar;
        if (zzaor != null) {
            zzaor.zzac(z);
        }
    }

    static Uri zza(Context context, zzdt zzdt, Uri uri, View view, Activity activity) {
        if (zzdt == null) {
            return uri;
        }
        try {
            if (zzdt.zzc(uri)) {
                return zzdt.zza(uri, context, view, activity);
            }
            return uri;
        } catch (zzdw unused) {
            return uri;
        } catch (Exception e) {
            zzq.zzla().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            zzawr.zzc(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfj zzbfj = (zzbfj) obj;
        String zzc = zzavj.zzc((String) map.get("u"), zzbfj.getContext(), true);
        String str = (String) map.get(CampaignUnit.JSON_KEY_SESSION_ID);
        if (str == null) {
            zzawr.zzfc("Action missing from an open GMSG.");
            return;
        }
        zzc zzc2 = this.zzdaq;
        if (zzc2 != null && !zzc2.zzjx()) {
            this.zzdaq.zzbm(zzc);
        } else if (MraidJsMethods.EXPAND.equalsIgnoreCase(str)) {
            if (((zzbfm) zzbfj).zzabo()) {
                zzawr.zzfc("Cannot expand WebView that is already expanded.");
                return;
            }
            zzab(false);
            ((zzbfq) zzbfj).zzb(zzc(map), zzd(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            zzab(false);
            if (zzc != null) {
                ((zzbfq) zzbfj).zza(zzc(map), zzd(map), zzc);
            } else {
                ((zzbfq) zzbfj).zza(zzc(map), zzd(map), (String) map.get(TJAdUnitConstants.String.HTML), (String) map.get("baseurl"));
            }
        } else if (!TapjoyConstants.TJC_APP_PLACEMENT.equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzab(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String valueOf = String.valueOf(str2);
                    zzawr.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(zze(zza(zzbfj.getContext(), ((zzbfr) zzbfj).zzabm(), data, ((zzbft) zzbfj).getView(), zzbfj.zzzh())));
                }
            }
            if (intent != null) {
                ((zzbfq) zzbfj).zza(new zzd(intent));
                return;
            }
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zze(zza(zzbfj.getContext(), ((zzbfr) zzbfj).zzabm(), Uri.parse(zzc), ((zzbft) zzbfj).getView(), zzbfj.zzzh())).toString();
            }
            ((zzbfq) zzbfj).zza(new zzd((String) map.get("i"), zzc, (String) map.get(InneractiveMediationDefs.GENDER_MALE), (String) map.get("p"), (String) map.get(Constants.URL_CAMPAIGN), (String) map.get(InneractiveMediationDefs.GENDER_FEMALE), (String) map.get("e")));
        } else {
            zzab(true);
            if (TextUtils.isEmpty(zzc)) {
                zzawr.zzfc("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbfq) zzbfj).zza(new zzd(new zzagh(zzbfj.getContext(), ((zzbfr) zzbfj).zzabm(), ((zzbft) zzbfj).getView()).zze(map)));
            } catch (ActivityNotFoundException e2) {
                zzawr.zzfc(e2.getMessage());
            }
        }
    }
}
