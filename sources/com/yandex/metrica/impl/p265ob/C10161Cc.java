package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.metrica.impl.p265ob.C10474M;
import com.yandex.metrica.impl.p265ob.C10883Wc;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Cc */
public class C10161Cc {

    /* renamed from: a */
    private Context f24451a;

    public C10161Cc(Context context) {
        this.f24451a = context;
    }

    /* renamed from: a */
    public String mo61146a(C11630pd pdVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", pdVar.f27913a.mo62449a());
            jSONObject.put(ServerParameters.LAT_KEY, pdVar.mo63480c().getLatitude());
            jSONObject.put(ServerParameters.LON_KEY, pdVar.mo63480c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(pdVar.mo63480c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(pdVar.mo63482e()));
            jSONObject.put("receive_elapsed_realtime_seconds", pdVar.mo63481d());
            jSONObject.putOpt("precision", pdVar.mo63480c().hasAccuracy() ? Float.valueOf(pdVar.mo63480c().getAccuracy()) : null);
            jSONObject.putOpt("direction", pdVar.mo63480c().hasBearing() ? Float.valueOf(pdVar.mo63480c().getBearing()) : null);
            jSONObject.putOpt("speed", pdVar.mo63480c().hasSpeed() ? Float.valueOf(pdVar.mo63480c().getSpeed()) : null);
            jSONObject.putOpt("altitude", pdVar.mo63480c().hasAltitude() ? Double.valueOf(pdVar.mo63480c().getAltitude()) : null);
            jSONObject.putOpt(IronSourceConstants.EVENTS_PROVIDER, C10585O2.m27103a(pdVar.mo63480c().getProvider(), (String) null));
            jSONObject.put("charge_type", pdVar.mo63478a().mo61753a());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return C11993ym.m30977b(this.f24451a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public C11630pd mo61147b(long j, String str) {
        String str2;
        try {
            str2 = C11993ym.m30962a(this.f24451a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                long optLong = jSONObject.optLong("receive_timestamp", 0);
                long optLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0);
                C10883Wc.C10884a a = C10883Wc.C10884a.m28133a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString(IronSourceConstants.EVENTS_PROVIDER, (String) null));
                location.setLongitude(jSONObject.optDouble(ServerParameters.LON_KEY, 0.0d));
                location.setLatitude(jSONObject.optDouble(ServerParameters.LAT_KEY, 0.0d));
                location.setTime(jSONObject.optLong("timestamp", 0));
                location.setAccuracy((float) jSONObject.optDouble("precision", 0.0d));
                location.setBearing((float) jSONObject.optDouble("direction", 0.0d));
                location.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
                location.setAltitude(jSONObject.optDouble("altitude", 0.0d));
                return new C11630pd(a, optLong, optLong2, location, C10474M.C10476b.C10477a.m26871a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))), Long.valueOf(j));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public C10781Tc mo61144a(long j, String str) {
        String str2;
        try {
            str2 = C11993ym.m30962a(this.f24451a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            C10781Tc tc = new C10781Tc();
            try {
                tc.mo62286a(Long.valueOf(j));
                JSONObject jSONObject = new JSONObject(str2);
                tc.mo62289b(jSONObject.optLong("timestamp", 0));
                tc.mo62283a(jSONObject.optLong("elapsed_realtime_seconds", 0));
                tc.mo62287a(jSONObject.optJSONArray("cell_info"));
                tc.mo62290b(jSONObject.optJSONArray("wifi_info"));
                tc.mo62284a(C10474M.C10476b.C10477a.m26871a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))));
                tc.mo62285a(C10883Wc.C10884a.m28133a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return tc;
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo61145a(C10781Tc tc) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", tc.mo62292d());
            jSONObject.put("elapsed_realtime_seconds", tc.mo62291c());
            jSONObject.putOpt("wifi_info", tc.mo62295g());
            jSONObject.putOpt("cell_info", tc.mo62282a());
            if (tc.mo62288b() != null) {
                jSONObject.put("charge_type", tc.mo62288b().mo61753a());
            }
            if (tc.mo62293e() != null) {
                jSONObject.put("collection_mode", tc.mo62293e().mo62449a());
            }
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return C11993ym.m30977b(this.f24451a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }
}
