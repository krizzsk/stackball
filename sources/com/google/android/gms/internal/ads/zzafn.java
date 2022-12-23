package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzafn {
    public static final zzaga<zzbek> zzczy = zzafm.zzczx;
    public static final zzaga<zzbek> zzczz = zzafp.zzczx;
    public static final zzaga<zzbek> zzdaa = zzafo.zzczx;
    public static final zzaga<zzbek> zzdab = new zzaft();
    public static final zzaga<zzbek> zzdac = new zzafs();
    public static final zzaga<zzbek> zzdad = zzafr.zzczx;
    public static final zzaga<Object> zzdae = new zzafv();
    public static final zzaga<zzbek> zzdaf = new zzafu();
    public static final zzaga<zzbek> zzdag = zzafq.zzczx;
    public static final zzaga<zzbek> zzdah = new zzafx();
    public static final zzaga<zzbek> zzdai = new zzafw();
    public static final zzaga<zzbbx> zzdaj = new zzbdi();
    public static final zzaga<zzbbx> zzdak = new zzbdh();
    public static final zzaga<zzbek> zzdal = new zzafk();
    public static final zzagg zzdam = new zzagg();
    public static final zzaga<zzbek> zzdan = new zzafz();
    public static final zzaga<zzbek> zzdao = new zzafy();
    public static final zzaga<zzbek> zzdap = new zzagb();

    static final /* synthetic */ void zza(zzbfr zzbfr, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzdt zzabm = zzbfr.zzabm();
            if (zzabm != null) {
                zzabm.zzcb().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzawr.zzfc("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void zza(zzbfj zzbfj, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzawr.zzfc("URL missing from httpTrack GMSG.");
        } else {
            new zzayz(zzbfj.getContext(), ((zzbfu) zzbfj).zzzk().zzbnd, str).zzwn();
        }
    }

    static final /* synthetic */ void zza(zzaif zzaif, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzawr.zzfc("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzdt zzabm = ((zzbfr) zzaif).zzabm();
            if (zzabm != null && zzabm.zzb(parse)) {
                parse = zzabm.zza(parse, ((zzbfj) zzaif).getContext(), ((zzbft) zzaif).getView(), ((zzbfj) zzaif).zzzh());
            }
        } catch (zzdw unused) {
            String valueOf = String.valueOf(str);
            zzawr.zzfc(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        zzbfj zzbfj = (zzbfj) zzaif;
        new zzayz(zzbfj.getContext(), ((zzbfu) zzaif).zzzk().zzbnd, zzavj.zzb(parse, zzbfj.getContext())).zzwn();
    }

    static final /* synthetic */ void zzb(zzbfj zzbfj, Map map) {
        PackageManager packageManager = zzbfj.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString(InneractiveMediationDefs.GENDER_MALE);
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString(Constants.URL_CAMPAIGN);
                        jSONObject2.optString(InneractiveMediationDefs.GENDER_FEMALE);
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                zzawr.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            zzawr.zzc("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        zzawr.zzc("Error parsing the intent data.", e3);
                    }
                }
                ((zzaif) zzbfj).zzb("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzaif) zzbfj).zzb("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzaif) zzbfj).zzb("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void zzc(zzbfj zzbfj, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzawr.zzfc("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbfj.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzaif) zzbfj).zza("openableURLs", hashMap);
    }
}
