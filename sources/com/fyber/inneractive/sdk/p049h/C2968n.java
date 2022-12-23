package com.fyber.inneractive.sdk.p049h;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.config.C2805q;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3621ac;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.h.n */
public final class C2968n extends C2959h {
    /* synthetic */ C2968n(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, byte b) {
        this(str, str2, str3, l, str4, str5, str6, str7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo18423a() {
        return super.mo18423a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18424a(String str) {
        super.mo18424a(str);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18426b() {
        super.mo18426b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ String mo18427c() {
        return super.mo18427c();
    }

    private C2968n(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        super(C2739a.m5957a());
        mo18425a("osn", "Android");
        mo18425a("osv", Build.VERSION.RELEASE);
        mo18425a(ServerParameters.MODEL, C3656k.m9092e());
        mo18425a("sdkv", str7 == null ? "7.8.4" : str7);
        mo18425a("pkgn", C3656k.m9094f());
        mo18425a("pkgv", C3656k.m9095g());
        mo18425a(AppsFlyerProperties.APP_ID, str);
        mo18425a("session", str2);
        mo18425a("adnt", str3);
        mo18425a("anid", l);
        mo18425a(CampaignEx.JSON_KEY_CREATIVE_ID, str4);
        mo18425a("adomain", str5);
        mo18425a("campaign_id", str6);
    }

    /* renamed from: com.fyber.inneractive.sdk.h.n$a */
    public static class C2969a {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final SimpleDateFormat f7227h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

        /* renamed from: a */
        InneractiveAdRequest f7228a;

        /* renamed from: b */
        C2966l f7229b;

        /* renamed from: c */
        C2967m f7230c;

        /* renamed from: d */
        JSONArray f7231d;

        /* renamed from: e */
        C3018e f7232e;

        /* renamed from: f */
        JSONArray f7233f;
        /* access modifiers changed from: package-private */

        /* renamed from: g */
        public boolean f7234g;

        public C2969a(C2966l lVar) {
            this(lVar, (InneractiveAdRequest) null, (C3018e) null, (JSONArray) null);
        }

        public C2969a(C2967m mVar) {
            this(mVar, (InneractiveAdRequest) null, (C3018e) null, (JSONArray) null);
        }

        public C2969a(C2966l lVar, InneractiveAdRequest inneractiveAdRequest, C3018e eVar) {
            this(lVar, inneractiveAdRequest, eVar, (JSONArray) null);
        }

        public C2969a(C2966l lVar, InneractiveAdRequest inneractiveAdRequest, C3018e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f7229b = lVar;
            this.f7228a = inneractiveAdRequest;
            this.f7231d = jSONArray;
        }

        public C2969a(C2967m mVar, InneractiveAdRequest inneractiveAdRequest, C3018e eVar) {
            this(mVar, inneractiveAdRequest, eVar, (JSONArray) null);
        }

        public C2969a(C2967m mVar, InneractiveAdRequest inneractiveAdRequest, C3018e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f7230c = mVar;
            this.f7228a = inneractiveAdRequest;
            this.f7231d = jSONArray;
        }

        private C2969a(C3018e eVar) {
            this.f7234g = false;
            this.f7232e = eVar;
            this.f7233f = new JSONArray();
        }

        /* renamed from: a */
        public final C2969a mo18433a(C2971b bVar) {
            this.f7233f.put(bVar.f7243a);
            return this;
        }

        /* renamed from: a */
        public final C2969a mo18434a(String str) {
            try {
                this.f7233f.put(new JSONObject(str));
            } catch (Exception unused) {
            }
            return this;
        }

        /* renamed from: a */
        public final C2969a mo18435a(Object... objArr) {
            if (objArr.length > 0) {
                C2971b bVar = new C2971b();
                for (int i = 0; i < objArr.length - 1; i += 2) {
                    bVar.mo18438a(objArr[i].toString(), objArr[i + 1]);
                }
                mo18433a(bVar);
            }
            return this;
        }

        /* renamed from: b */
        public final void mo18436b(String str) {
            String str2;
            String str3;
            String str4;
            Long l;
            String str5;
            String str6;
            String str7;
            String str8;
            Integer num;
            String str9;
            boolean z;
            C3018e eVar = this.f7232e;
            UnitDisplayType unitDisplayType = null;
            if (eVar != null) {
                String impressionId = eVar.f7419v != null ? eVar.f7419v.getImpressionId() : null;
                C3018e eVar2 = this.f7232e;
                String demandSource = eVar2.f7419v != null ? eVar2.f7419v.getDemandSource() : null;
                Long b = this.f7232e.mo18498b();
                C3018e eVar3 = this.f7232e;
                String creativeId = eVar3.f7419v != null ? eVar3.f7419v.getCreativeId() : null;
                String c = this.f7232e.mo18499c();
                C3018e eVar4 = this.f7232e;
                str6 = impressionId;
                str5 = demandSource;
                l = b;
                str4 = creativeId;
                str3 = c;
                str2 = eVar4.f7419v != null ? eVar4.f7419v.getCampaignId() : null;
            } else {
                l = null;
                str6 = "";
                str5 = str6;
                str4 = str5;
                str3 = str4;
                str2 = str3;
            }
            C2968n nVar = new C2968n(IAConfigManager.f6419n.f6432d, str6, str5, l, str4, str3, str2, str, (byte) 0);
            InneractiveAdRequest inneractiveAdRequest = this.f7228a;
            C2809u selectedUnitConfig = inneractiveAdRequest == null ? null : inneractiveAdRequest.getSelectedUnitConfig();
            if (selectedUnitConfig != null) {
                C2805q c2 = selectedUnitConfig.mo18066c();
                Track track = Track.ERRORS;
                if (c2.f6638a == null) {
                    z = false;
                } else {
                    z = c2.f6638a.contains(track);
                }
                if (!z || selectedUnitConfig.mo18069f()) {
                    return;
                }
            }
            C3018e eVar5 = this.f7232e;
            if (eVar5 == null) {
                str7 = "";
            } else {
                str7 = eVar5.f7402e;
            }
            if (TextUtils.isEmpty(IAConfigManager.f6419n.f6441m)) {
                str8 = "";
            } else {
                str8 = IAConfigManager.f6419n.f6441m;
            }
            if (this.f7229b == null && this.f7230c == null) {
                IAlog.m9034b("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
                return;
            }
            InneractiveAdRequest inneractiveAdRequest2 = this.f7228a;
            String spotId = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSpotId();
            StringBuilder sb = new StringBuilder();
            InneractiveAdRequest inneractiveAdRequest3 = this.f7228a;
            if (inneractiveAdRequest3 != null && !TextUtils.isEmpty(inneractiveAdRequest3.getMediationName())) {
                sb.append(this.f7228a.getMediationName());
                sb.append("_");
            }
            C3018e eVar6 = this.f7232e;
            if (eVar6 != null) {
                unitDisplayType = eVar6.f7415r;
            }
            sb.append(unitDisplayType != null ? unitDisplayType.toString() : "unknown");
            String sb2 = sb.toString();
            C3018e eVar7 = this.f7232e;
            if (eVar7 == null) {
                num = "";
            } else {
                num = Integer.valueOf(eVar7.f7406i);
            }
            C3018e eVar8 = this.f7232e;
            if (eVar8 == null) {
                str9 = "";
            } else {
                str9 = eVar8.f7407j;
            }
            final C2968n nVar2 = nVar;
            final String str10 = str7;
            final String str11 = str8;
            final String str12 = sb2;
            final String str13 = spotId;
            final Integer num2 = num;
            final String str14 = str9;
            C3662m.m9138a(new Runnable() {
                public final void run() {
                    String str;
                    nVar2.mo18425a("contentid", str10);
                    nVar2.mo18425a("fairbidv", str11);
                    if (C2969a.this.f7229b != null) {
                        nVar2.mo18425a(NotificationCompat.CATEGORY_ERROR, Integer.valueOf(C2969a.this.f7229b.f7203N));
                        C2966l lVar = C2969a.this.f7229b;
                        str = C2966l.m6640a();
                        IAlog.m9034b("Event dispatcher - dispatching error: %s", C2969a.this.f7229b);
                        IAlog.m9030a(IAlog.f9871b, "%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(C2969a.this.f7229b.f7203N));
                    } else if (C2969a.this.f7230c != null) {
                        nVar2.mo18425a("event", Integer.valueOf(C2969a.this.f7230c.f7226v));
                        C2967m mVar = C2969a.this.f7230c;
                        str = C2967m.m6641a();
                        IAlog.m9034b("Event dispatcher - dispatching event: %s", C2969a.this.f7230c);
                        IAlog.m9030a(IAlog.f9871b, "%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(C2969a.this.f7230c.f7226v));
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str12)) {
                        nVar2.mo18425a("placement_type", str12);
                    }
                    if (!TextUtils.isEmpty(str13)) {
                        nVar2.mo18425a("spot_id", str13);
                    }
                    nVar2.mo18425a("ciso", C3656k.m9096h());
                    nVar2.mo18425a("ad_type", num2);
                    if (C2969a.this.f7234g && !TextUtils.isEmpty(str14)) {
                        nVar2.mo18424a(str14);
                    }
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    nVar2.mo18425a("n", C3621ac.m9043a().f9885f);
                    nVar2.mo18425a("date_created", Long.valueOf(instance.getTimeInMillis()));
                    nVar2.mo18425a("day", C2969a.f7227h.format(instance.getTime()));
                    nVar2.mo18425a("hour", Integer.valueOf(instance.get(11)));
                    C2968n nVar = nVar2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(C2969a.this.f7229b != null ? String.valueOf(C2969a.this.f7229b.f7203N) : String.valueOf(C2969a.this.f7230c.f7226v));
                    nVar.mo18425a("table", sb.toString());
                    if (C2969a.this.f7231d == null) {
                        C2969a.this.f7231d = new JSONArray();
                    }
                    nVar2.mo18425a("experiments", C2969a.this.f7231d);
                    if (C2969a.this.f7233f != null && C2969a.this.f7233f.length() > 0) {
                        nVar2.mo18425a("extra", C2969a.this.f7233f);
                    }
                    nVar2.mo18426b();
                }
            });
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.h.n$b */
    public static class C2971b {

        /* renamed from: a */
        JSONObject f7243a = new JSONObject();

        /* renamed from: a */
        public final C2971b mo18438a(String str, Object obj) {
            try {
                this.f7243a.put(str, obj);
            } catch (Exception unused) {
                IAlog.m9036d("Got exception adding param to json object: %s, %s", str, obj);
            }
            return this;
        }
    }

    /* renamed from: d */
    public final boolean mo18428d() {
        return (TextUtils.isEmpty(super.mo18423a()) || this.f7120a == null || this.f7120a.size() == 0) ? false : true;
    }
}
