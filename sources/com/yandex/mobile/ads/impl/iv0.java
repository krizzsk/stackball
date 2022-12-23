package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class iv0<T> {

    /* renamed from: j */
    private static final long f35045j = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private final Context f35046a;

    /* renamed from: b */
    private final C14645t1 f35047b;

    /* renamed from: c */
    private final g60 f35048c = new g60();

    /* renamed from: d */
    private final gn0 f35049d = new gn0();

    /* renamed from: e */
    private final s51 f35050e = new s51();

    /* renamed from: f */
    private final C15251yh f35051f = new C15251yh();

    /* renamed from: g */
    private final f51<T> f35052g;

    /* renamed from: h */
    private final ua0 f35053h = new ua0();

    /* renamed from: i */
    private final rj0 f35054i = new rj0();

    public iv0(Context context, C14645t1 t1Var, f51<T> f51) {
        this.f35046a = context.getApplicationContext();
        this.f35047b = t1Var;
        this.f35052g = f51;
    }

    /* renamed from: a */
    private Long m37590a(Map<String, String> map, wb0 wb0) {
        Integer num;
        String str = map.get(wb0.mo70671a());
        int i = C13278h5.f34274b;
        try {
            num = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            num = null;
        }
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * f35045j);
        }
        return null;
    }

    /* renamed from: a */
    public AdResponse<T> mo67895a(fv0 fv0, Map<String, String> map, C12115n nVar) {
        boolean z;
        int i;
        int i2;
        AdResponse.C12087b bVar = new AdResponse.C12087b();
        bVar.mo64479e(this.f35047b.mo70096c());
        bVar.mo64455a(nVar);
        int a = p90.m40708a(map, wb0.YMAD_HEADER_WIDTH);
        int a2 = p90.m40708a(map, wb0.YMAD_HEADER_HEIGHT);
        bVar.mo64478e(a);
        bVar.mo64465b(a2);
        bVar.mo64475d(map.get(wb0.YMAD_TYPE_FORMAT.mo70671a()));
        bVar.mo64483g(map.get(wb0.YMAD_PRODUCT_TYPE.mo70671a()));
        SizeInfo n = this.f35047b.mo70108n();
        AdImpressionData adImpressionData = null;
        bVar.mo64451a(n != null ? n.mo64493d() : null);
        bVar.mo64472c(p90.m40710b(map, wb0.YMAD_SHOW_NOTICE));
        wb0 wb0 = wb0.YMAD_NOTICE_DELAY;
        ArrayList arrayList = new ArrayList();
        String str = map.get(wb0.mo70671a());
        if (!TextUtils.isEmpty(str)) {
            for (String trim : (String[]) C13378i5.m37282a((T[]) str.split(","))) {
                try {
                    String decode = URLDecoder.decode(trim.trim(), "UTF-8");
                    if (C13278h5.m36799a(decode, 0L) != null) {
                        arrayList.add(C13278h5.m36799a(decode, 0L));
                    }
                } catch (Exception unused) {
                }
            }
        }
        bVar.mo64461a((List<Long>) arrayList);
        wb0 wb02 = wb0.YMAD_VISIBILITY_PERCENT;
        ArrayList arrayList2 = new ArrayList();
        String str2 = map.get(wb02.mo70671a());
        if (!TextUtils.isEmpty(str2)) {
            for (String trim2 : (String[]) C13378i5.m37282a((T[]) str2.split(","))) {
                String decode2 = URLDecoder.decode(trim2.trim(), "UTF-8");
                int i3 = C13278h5.f34274b;
                try {
                    i = Integer.parseInt(decode2);
                } catch (NumberFormatException unused2) {
                    i = 0;
                }
                try {
                    if (Integer.valueOf(Math.min(i, AdResponse.f29065J.intValue())) != null) {
                        int i4 = C13278h5.f34274b;
                        try {
                            i2 = Integer.parseInt(decode2);
                        } catch (NumberFormatException unused3) {
                            i2 = 0;
                        }
                        arrayList2.add(Integer.valueOf(Math.min(i2, AdResponse.f29065J.intValue())));
                    }
                } catch (Exception unused4) {
                }
            }
        }
        bVar.mo64476d((List<Integer>) arrayList2);
        bVar.mo64480e(p90.m40710b(map, wb0.YMAD_CLICK_TRACKING_URLS));
        bVar.mo64458a(m37590a(map, wb0.YMAD_CLOSE_BUTTON_DELAY));
        bVar.mo64466b(m37590a(map, wb0.YMAD_REWARD_DELAY));
        bVar.mo64482f(map.get(wb0.YMAD_DESIGN.mo70671a()));
        this.f35054i.getClass();
        String str3 = map.get(wb0.YMAD_LANGUAGE.mo70671a());
        Locale[] availableLocales = Locale.getAvailableLocales();
        int length = availableLocales.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                z = false;
                break;
            } else if (availableLocales[i5].getLanguage().equals(str3)) {
                z = true;
                break;
            } else {
                i5++;
            }
        }
        bVar.mo64462a(z ? new Locale(str3) : null);
        bVar.mo64468b(p90.m40710b(map, wb0.YMAD_RENDER_TRACKING_URLS));
        bVar.mo64481f(p90.m40708a(map, wb0.YMAD_PREFETCH_COUNT));
        bVar.mo64470c(p90.m40708a(map, wb0.YMAD_REFRESH_PERIOD));
        bVar.mo64474d(p90.m40708a(map, wb0.YMAD_RELOAD_TIMEOUT));
        bVar.mo64450a(p90.m40708a(map, wb0.YMAD_EMPTY_INTERVAL));
        bVar.mo64484h(map.get(wb0.YMAD_SERVER_LOG_ID.mo70671a()));
        bVar.mo64473c(p90.m40709a(map, wb0.YMAD_PRELOAD_NATIVE_VIDEO, false));
        bVar.mo64467b(map.get(wb0.YMAD_RENDERER.mo70671a()));
        bVar.mo64453a(this.f35051f.mo71078a(map));
        bVar.mo64454a(this.f35050e.mo69888a(fv0));
        this.f35048c.getClass();
        Map<String, String> map2 = fv0.f33757c;
        ArrayList arrayList3 = (ArrayList) p90.m40710b(map2, wb0.YMAD_FALSE_CLICK_URL);
        String str4 = arrayList3.isEmpty() ? null : (String) arrayList3.get(0);
        Long a3 = C13278h5.m36799a(map2.get(wb0.YMAD_FALSE_CLICK_INTERVAL.mo70671a()), (Long) null);
        bVar.mo64456a((str4 == null || a3 == null) ? null : new FalseClick(str4, a3.longValue()));
        this.f35053h.getClass();
        String str5 = map.get(wb0.YMAD_IMPRESSION_DATA.mo70671a());
        if (!TextUtils.isEmpty(str5)) {
            adImpressionData = new AdImpressionData(str5);
        }
        bVar.mo64457a(adImpressionData);
        this.f35046a.getSharedPreferences("YadPreferenceFile", 0).edit().putString("SessionData", map.get(wb0.YMAD_SESSION_DATA.mo70671a())).apply();
        bVar.mo64477d(p90.m40709a(map, wb0.YMAD_ROTATION_ENABLED, false));
        bVar.mo64469b(p90.m40709a(map, wb0.YMAD_NON_SKIPPABLE_AD_ENABLED, false));
        boolean a4 = p90.m40709a(map, wb0.YMAD_MEDIATION, false);
        bVar.mo64463a(a4);
        if (a4) {
            bVar.mo64452a(this.f35049d.mo66870a(fv0));
        } else {
            bVar.mo64459a(this.f35052g.mo66111a(fv0));
        }
        bVar.mo64471c(map.get(wb0.YMAD_SOURCE.mo70671a()));
        bVar.mo64460a(map.get(wb0.YMAD_ID.mo70671a()));
        return bVar.mo64464a();
    }
}
