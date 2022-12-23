package com.ironsource.sdk.p150g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.g.b */
public final class C6005b implements Parcelable {
    public static final Parcelable.Creator<C6005b> CREATOR = new Parcelable.Creator<C6005b>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C6005b(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C6005b[i];
        }
    };

    /* renamed from: a */
    public String f14721a;

    /* renamed from: b */
    public String f14722b;

    /* renamed from: c */
    public String f14723c;

    /* renamed from: d */
    public boolean f14724d;

    /* renamed from: e */
    public int f14725e;

    /* renamed from: f */
    public String f14726f;

    /* renamed from: g */
    public String f14727g;

    /* renamed from: h */
    public boolean f14728h;

    /* renamed from: i */
    public boolean f14729i;

    /* renamed from: j */
    public Map<String, String> f14730j;

    /* renamed from: k */
    private ArrayList<String> f14731k;

    /* renamed from: l */
    private ArrayList<String> f14732l;

    /* renamed from: m */
    private ArrayList<String> f14733m;

    /* renamed from: n */
    private ArrayList<String> f14734n;

    /* renamed from: o */
    private Map<String, String> f14735o;

    public C6005b() {
        m14835a();
    }

    private C6005b(Parcel parcel) {
        m14835a();
        try {
            boolean z = true;
            this.f14724d = parcel.readByte() != 0;
            this.f14725e = parcel.readInt();
            this.f14721a = parcel.readString();
            this.f14722b = parcel.readString();
            this.f14723c = parcel.readString();
            this.f14726f = parcel.readString();
            this.f14727g = parcel.readString();
            this.f14735o = m14834a(parcel.readString());
            this.f14729i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f14728h = z;
            this.f14730j = m14834a(parcel.readString());
        } catch (Throwable unused) {
            m14835a();
        }
    }

    /* synthetic */ C6005b(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: a */
    private static Map<String, String> m14834a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m14835a() {
        this.f14724d = false;
        this.f14725e = -1;
        this.f14731k = new ArrayList<>();
        this.f14732l = new ArrayList<>();
        this.f14733m = new ArrayList<>();
        this.f14734n = new ArrayList<>();
        this.f14728h = true;
        this.f14729i = false;
        this.f14727g = "";
        this.f14726f = "";
        this.f14735o = new HashMap();
        this.f14730j = new HashMap();
    }

    /* renamed from: a */
    public final void mo42541a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && this.f14733m.indexOf(str) == -1) {
            this.f14733m.add(str);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f14724d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f14725e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f14731k);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f14732l);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f14726f);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f14727g);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f14735o);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.f14728h);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.f14729i);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.f14730j);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = 1;
            parcel.writeByte((byte) (this.f14724d ? 1 : 0));
            parcel.writeInt(this.f14725e);
            parcel.writeString(this.f14721a);
            parcel.writeString(this.f14722b);
            parcel.writeString(this.f14723c);
            parcel.writeString(this.f14726f);
            parcel.writeString(this.f14727g);
            parcel.writeString(new JSONObject(this.f14735o).toString());
            parcel.writeByte((byte) (this.f14729i ? 1 : 0));
            if (!this.f14728h) {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
            parcel.writeString(new JSONObject(this.f14730j).toString());
        } catch (Throwable unused) {
        }
    }
}
