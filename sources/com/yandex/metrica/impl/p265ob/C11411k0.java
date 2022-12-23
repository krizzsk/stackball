package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.metrica.impl.p265ob.C10322H;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.k0 */
public class C11411k0 implements Parcelable {
    public static final Parcelable.Creator<C11411k0> CREATOR = new C11412a();

    /* renamed from: a */
    String f27298a;

    /* renamed from: b */
    String f27299b;

    /* renamed from: c */
    private String f27300c;

    /* renamed from: d */
    private String f27301d;

    /* renamed from: e */
    int f27302e;

    /* renamed from: f */
    int f27303f;

    /* renamed from: g */
    private Pair<String, String> f27304g;

    /* renamed from: h */
    int f27305h;

    /* renamed from: i */
    private String f27306i;

    /* renamed from: j */
    private long f27307j;

    /* renamed from: k */
    private long f27308k;

    /* renamed from: l */
    private C10533N0 f27309l;

    /* renamed from: m */
    private C10351I0 f27310m;

    /* renamed from: n */
    private Bundle f27311n;

    /* renamed from: o */
    private Boolean f27312o;

    /* renamed from: p */
    private Integer f27313p;

    /* renamed from: com.yandex.metrica.impl.ob.k0$a */
    class C11412a implements Parcelable.Creator<C11411k0> {
        C11412a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C11541n0.class.getClassLoader());
            Integer num = null;
            C10351I0 a = readBundle.containsKey("CounterReport.Source") ? C10351I0.m26494a(readBundle.getInt("CounterReport.Source")) : null;
            C11411k0 k0Var = new C11411k0();
            k0Var.f27302e = readBundle.getInt("CounterReport.Type", C11413k1.EVENT_TYPE_UNDEFINED.mo63170b());
            k0Var.f27303f = readBundle.getInt("CounterReport.CustomType");
            String string = readBundle.getString("CounterReport.Value");
            int i = C10585O2.f25307a;
            if (string == null) {
                string = "";
            }
            k0Var.f27299b = string;
            C11411k0 a2 = C11411k0.m29407a(k0Var.mo62215e(readBundle.getString("CounterReport.UserInfo")).mo63148c(readBundle.getString("CounterReport.Environment")).mo62213b(readBundle.getString("CounterReport.Event")), (!readBundle.containsKey("CounterReport.AppEnvironmentDiffKey") || !readBundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? null : new Pair(readBundle.getString("CounterReport.AppEnvironmentDiffKey"), readBundle.getString("CounterReport.AppEnvironmentDiffValue")));
            a2.f27305h = readBundle.getInt("CounterReport.TRUNCATED");
            C11411k0 a3 = a2.mo62214d(readBundle.getString("CounterReport.ProfileID")).mo63138a(readBundle.getLong("CounterReport.CreationElapsedRealtime")).mo63146b(readBundle.getLong("CounterReport.CreationTimestamp")).mo63140a(C10533N0.m26998a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")))).mo63139a(a).mo63147c(readBundle.getBundle("CounterReport.Payload")).mo63141a(readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null);
            if (readBundle.containsKey("CounterReport.OpenId")) {
                num = Integer.valueOf(readBundle.getInt("CounterReport.OpenId"));
            }
            return a3.mo63142a(num);
        }

        public Object[] newArray(int i) {
            return new C11411k0[i];
        }
    }

    public C11411k0() {
        this("", 0);
    }

    /* renamed from: a */
    public C11411k0 mo62212a(byte[] bArr) {
        this.f27299b = new String(Base64.encode(bArr, 0));
        return this;
    }

    /* renamed from: b */
    public C11411k0 mo62213b(String str) {
        this.f27298a = str;
        return this;
    }

    /* renamed from: c */
    public C11411k0 mo63148c(String str) {
        this.f27301d = str;
        return this;
    }

    /* renamed from: d */
    public int mo63150d() {
        return this.f27305h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C11411k0 mo62215e(String str) {
        this.f27300c = str;
        return this;
    }

    /* renamed from: f */
    public C11411k0 mo62216f(String str) {
        this.f27299b = str;
        return this;
    }

    /* renamed from: g */
    public String mo63154g() {
        return this.f27298a;
    }

    /* renamed from: h */
    public String mo63155h() {
        return this.f27301d;
    }

    /* renamed from: i */
    public C10533N0 mo63156i() {
        return this.f27309l;
    }

    /* renamed from: j */
    public Integer mo63157j() {
        return this.f27313p;
    }

    /* renamed from: k */
    public Bundle mo63158k() {
        return this.f27311n;
    }

    /* renamed from: l */
    public String mo63159l() {
        return this.f27306i;
    }

    /* renamed from: m */
    public C10351I0 mo63160m() {
        return this.f27310m;
    }

    /* renamed from: n */
    public int mo63161n() {
        return this.f27302e;
    }

    /* renamed from: o */
    public String mo63162o() {
        return this.f27300c;
    }

    /* renamed from: p */
    public String mo63163p() {
        return this.f27299b;
    }

    /* renamed from: q */
    public byte[] mo63164q() {
        return Base64.decode(this.f27299b, 0);
    }

    public String toString() {
        return String.format(Locale.US, "[event: %s, type: %s, value: %s]", new Object[]{this.f27298a, C11413k1.m29450a(this.f27302e).mo63169a(), C10796U2.m27879a(this.f27299b, (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f27298a);
        bundle.putString("CounterReport.Value", this.f27299b);
        bundle.putInt("CounterReport.Type", this.f27302e);
        bundle.putInt("CounterReport.CustomType", this.f27303f);
        bundle.putInt("CounterReport.TRUNCATED", this.f27305h);
        bundle.putString("CounterReport.ProfileID", this.f27306i);
        bundle.putInt("CounterReport.UniquenessStatus", this.f27309l.f25231a);
        Bundle bundle2 = this.f27311n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f27301d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f27300c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f27304g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f27307j);
        bundle.putLong("CounterReport.CreationTimestamp", this.f27308k);
        C10351I0 i0 = this.f27310m;
        if (i0 != null) {
            bundle.putInt("CounterReport.Source", i0.f24858a);
        }
        Boolean bool = this.f27312o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f27313p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        parcel.writeBundle(bundle);
    }

    public C11411k0(String str, int i) {
        this("", str, i);
    }

    /* renamed from: a */
    public C11411k0 mo63137a(int i) {
        this.f27302e = i;
        return this;
    }

    /* renamed from: b */
    public Pair<String, String> mo63145b() {
        return this.f27304g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11411k0 mo63147c(Bundle bundle) {
        this.f27311n = bundle;
        return this;
    }

    /* renamed from: d */
    public C11411k0 mo62214d(String str) {
        this.f27306i = str;
        return this;
    }

    /* renamed from: e */
    public long mo63152e() {
        return this.f27307j;
    }

    /* renamed from: f */
    public long mo63153f() {
        return this.f27308k;
    }

    public C11411k0(String str, String str2, int i) {
        this(str, str2, i, new C10580Nm());
    }

    /* renamed from: d */
    private static C11411k0 m29416d(C11411k0 k0Var) {
        C11411k0 k0Var2 = new C11411k0();
        k0Var2.f27308k = k0Var.f27308k;
        k0Var2.f27307j = k0Var.f27307j;
        k0Var2.f27300c = k0Var.f27300c;
        k0Var2.f27304g = k0Var.f27304g;
        k0Var2.f27301d = k0Var.f27301d;
        k0Var2.f27311n = k0Var.f27311n;
        k0Var2.f27306i = k0Var.f27306i;
        return k0Var2;
    }

    /* renamed from: e */
    public static C11411k0 m29417e(C11411k0 k0Var) {
        return m29410a(k0Var, C11413k1.EVENT_TYPE_APP_UPDATE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11411k0 mo63143a(String str, String str2) {
        if (this.f27304g == null) {
            this.f27304g = new Pair<>(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11411k0 mo63146b(long j) {
        this.f27308k = j;
        return this;
    }

    /* renamed from: c */
    public Boolean mo63149c() {
        return this.f27312o;
    }

    public C11411k0(String str, String str2, int i, C10580Nm nm) {
        this.f27309l = C10533N0.UNKNOWN;
        this.f27298a = str2;
        this.f27302e = i;
        this.f27299b = str;
        this.f27307j = nm.mo61842c();
        this.f27308k = nm.mo61840a();
    }

    /* renamed from: c */
    public static C11411k0 m29415c(C11411k0 k0Var) {
        return m29410a(k0Var, C11413k1.EVENT_TYPE_INIT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bundle mo63144b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    /* renamed from: a */
    static C11411k0 m29407a(C11411k0 k0Var, Pair pair) {
        k0Var.f27304g = pair;
        return k0Var;
    }

    /* renamed from: b */
    public static C11411k0 m29414b(C11411k0 k0Var) {
        return m29410a(k0Var, C11413k1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11411k0 mo63138a(long j) {
        this.f27307j = j;
        return this;
    }

    /* renamed from: a */
    public C11411k0 mo63140a(C10533N0 n0) {
        this.f27309l = n0;
        return this;
    }

    /* renamed from: a */
    public C11411k0 mo63139a(C10351I0 i0) {
        this.f27310m = i0;
        return this;
    }

    /* renamed from: a */
    public C11411k0 mo63141a(Boolean bool) {
        this.f27312o = bool;
        return this;
    }

    /* renamed from: a */
    public C11411k0 mo63142a(Integer num) {
        this.f27313p = num;
        return this;
    }

    /* renamed from: a */
    public static C11411k0 m29405a(Bundle bundle) {
        if (bundle != null) {
            try {
                C11411k0 k0Var = (C11411k0) bundle.getParcelable("CounterReport.Object");
                if (k0Var != null) {
                    return k0Var;
                }
            } catch (Throwable unused) {
                return new C11411k0();
            }
        }
        return new C11411k0();
    }

    /* renamed from: a */
    private static C11411k0 m29410a(C11411k0 k0Var, C11413k1 k1Var) {
        C11411k0 d = m29416d(k0Var);
        d.f27302e = k1Var.mo63170b();
        return d;
    }

    /* renamed from: a */
    public static C11411k0 m29406a(C11411k0 k0Var) {
        return m29410a(k0Var, C11413k1.EVENT_TYPE_ALIVE);
    }

    /* renamed from: a */
    public static C11411k0 m29408a(C11411k0 k0Var, C10415K0 k0) {
        C11411k0 a = m29410a(k0Var, C11413k1.EVENT_TYPE_START);
        String a2 = k0.mo61640a();
        C10752Sf sf = new C10752Sf();
        if (a2 != null) {
            sf.f25778b = a2.getBytes();
        }
        a.mo62212a(C11169e.m28804a((C11169e) sf));
        a.f27308k = k0Var.f27308k;
        a.f27307j = k0Var.f27307j;
        return a;
    }

    /* renamed from: a */
    public static C11411k0 m29409a(C11411k0 k0Var, C11229f4 f4Var) {
        Context g = f4Var.mo62874g();
        C11330i1 c = new C11330i1(g, new C10091A0(g)).mo63028c();
        try {
            c.mo63027b();
        } catch (Throwable unused) {
        }
        C11411k0 d = m29416d(k0Var);
        d.f27302e = C11413k1.EVENT_TYPE_IDENTITY.mo63170b();
        d.f27299b = c.mo63026a();
        return d;
    }

    /* renamed from: a */
    public static C11411k0 m29412a(C11411k0 k0Var, Collection<C11347ie> collection, C10322H h, C10173D d, List<String> list) {
        String str;
        String str2;
        C11411k0 d2 = m29416d(k0Var);
        try {
            JSONArray jSONArray = new JSONArray();
            for (C11347ie next : collection) {
                jSONArray.put(new JSONObject().put("name", next.f27118a).put("granted", next.f27119b));
            }
            JSONObject jSONObject = new JSONObject();
            if (h != null) {
                jSONObject.put("background_restricted", h.f24798b);
                C10322H.C10323a aVar = h.f24797a;
                d.getClass();
                if (aVar != null) {
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 1) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 2) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 3) {
                        str2 = "RARE";
                    } else if (ordinal == 4) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray(list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        d2.f27302e = C11413k1.EVENT_TYPE_PERMISSIONS.mo63170b();
        d2.f27299b = str;
        return d2;
    }

    /* renamed from: a */
    public static C11411k0 m29411a(C11411k0 k0Var, String str) {
        C11411k0 d = m29416d(k0Var);
        d.f27302e = C11413k1.EVENT_TYPE_APP_FEATURES.mo63170b();
        d.f27299b = str;
        return d;
    }

    /* renamed from: a */
    public static C11411k0 m29404a() {
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_SEND_REVENUE_EVENT.mo63170b();
        return k0Var;
    }

    /* renamed from: a */
    public static C11411k0 m29413a(String str) {
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_WEBVIEW_SYNC.mo63170b();
        k0Var.f27299b = str;
        k0Var.f27310m = C10351I0.JS;
        return k0Var;
    }
}
