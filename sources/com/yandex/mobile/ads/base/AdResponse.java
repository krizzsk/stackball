package com.yandex.mobile.ads.base;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.base.model.C12110a;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.lo1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AdResponse<T> implements Parcelable {
    public static final Parcelable.Creator<AdResponse> CREATOR = new C12086a();

    /* renamed from: J */
    public static final Integer f29065J = 100;

    /* renamed from: K */
    private static final Integer f29066K = 1000;

    /* renamed from: A */
    private final boolean f29067A;

    /* renamed from: B */
    private final boolean f29068B;

    /* renamed from: C */
    private final int f29069C;

    /* renamed from: D */
    private final int f29070D;

    /* renamed from: E */
    private final int f29071E;

    /* renamed from: F */
    private final int f29072F;

    /* renamed from: G */
    private final int f29073G;

    /* renamed from: H */
    private final int f29074H;

    /* renamed from: I */
    private FalseClick f29075I;

    /* renamed from: b */
    private final C12115n f29076b;

    /* renamed from: c */
    private final String f29077c;

    /* renamed from: d */
    private final String f29078d;

    /* renamed from: e */
    private final String f29079e;

    /* renamed from: f */
    private final SizeInfo f29080f;

    /* renamed from: g */
    private final List<String> f29081g;

    /* renamed from: h */
    private final List<String> f29082h;

    /* renamed from: i */
    private final Long f29083i;

    /* renamed from: j */
    private final String f29084j;

    /* renamed from: k */
    private final Locale f29085k;

    /* renamed from: l */
    private final List<String> f29086l;

    /* renamed from: m */
    private final AdImpressionData f29087m;

    /* renamed from: n */
    private final List<Long> f29088n;

    /* renamed from: o */
    private final List<Integer> f29089o;

    /* renamed from: p */
    private final String f29090p;

    /* renamed from: q */
    private final String f29091q;

    /* renamed from: r */
    private final String f29092r;

    /* renamed from: s */
    private final C12110a f29093s;

    /* renamed from: t */
    private final String f29094t;

    /* renamed from: u */
    private final MediationData f29095u;

    /* renamed from: v */
    private final RewardData f29096v;

    /* renamed from: w */
    private final Long f29097w;

    /* renamed from: x */
    private final T f29098x;

    /* renamed from: y */
    private final boolean f29099y;

    /* renamed from: z */
    private final boolean f29100z;

    /* renamed from: com.yandex.mobile.ads.base.AdResponse$a */
    class C12086a implements Parcelable.Creator<AdResponse> {
        C12086a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new AdResponse(parcel);
        }

        public Object[] newArray(int i) {
            return new AdResponse[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.AdResponse$b */
    public static class C12087b<T> {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public int f29101A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public int f29102B;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public int f29103C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public int f29104D;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public boolean f29105E;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public boolean f29106F;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public boolean f29107G;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public boolean f29108H;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C12115n f29109a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f29110b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f29111c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f29112d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C12110a f29113e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public SizeInfo.C12090b f29114f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public List<String> f29115g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public List<String> f29116h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Long f29117i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f29118j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Locale f29119k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public List<String> f29120l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public FalseClick f29121m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public AdImpressionData f29122n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public List<Long> f29123o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public List<Integer> f29124p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public String f29125q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public MediationData f29126r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public RewardData f29127s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public Long f29128t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public T f29129u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public String f29130v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public String f29131w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public String f29132x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public int f29133y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public int f29134z;

        /* renamed from: a */
        public C12087b<T> mo64455a(C12115n nVar) {
            this.f29109a = nVar;
            return this;
        }

        /* renamed from: b */
        public C12087b<T> mo64465b(int i) {
            this.f29134z = i;
            return this;
        }

        /* renamed from: c */
        public C12087b<T> mo64472c(List<String> list) {
            this.f29115g = list;
            return this;
        }

        /* renamed from: d */
        public C12087b<T> mo64475d(String str) {
            this.f29110b = str;
            return this;
        }

        /* renamed from: e */
        public C12087b<T> mo64479e(String str) {
            this.f29112d = str;
            return this;
        }

        /* renamed from: f */
        public C12087b<T> mo64482f(String str) {
            this.f29118j = str;
            return this;
        }

        /* renamed from: g */
        public C12087b<T> mo64483g(String str) {
            this.f29111c = str;
            return this;
        }

        /* renamed from: h */
        public C12087b<T> mo64484h(String str) {
            this.f29132x = str;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64451a(SizeInfo.C12090b bVar) {
            this.f29114f = bVar;
            return this;
        }

        /* renamed from: b */
        public C12087b<T> mo64468b(List<String> list) {
            this.f29120l = list;
            return this;
        }

        /* renamed from: c */
        public C12087b<T> mo64470c(int i) {
            this.f29102B = i;
            return this;
        }

        /* renamed from: d */
        public C12087b<T> mo64476d(List<Integer> list) {
            this.f29124p = list;
            return this;
        }

        /* renamed from: e */
        public C12087b<T> mo64478e(int i) {
            this.f29133y = i;
            return this;
        }

        /* renamed from: f */
        public C12087b<T> mo64481f(int i) {
            this.f29101A = i;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64458a(Long l) {
            this.f29117i = l;
            return this;
        }

        /* renamed from: b */
        public C12087b<T> mo64467b(String str) {
            this.f29125q = str;
            return this;
        }

        /* renamed from: c */
        public C12087b<T> mo64471c(String str) {
            this.f29130v = str;
            return this;
        }

        /* renamed from: d */
        public C12087b<T> mo64474d(int i) {
            this.f29103C = i;
            return this;
        }

        /* renamed from: e */
        public C12087b<T> mo64480e(List<String> list) {
            this.f29116h = list;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64462a(Locale locale) {
            this.f29119k = locale;
            return this;
        }

        /* renamed from: b */
        public C12087b<T> mo64466b(Long l) {
            this.f29128t = l;
            return this;
        }

        /* renamed from: c */
        public C12087b<T> mo64473c(boolean z) {
            this.f29105E = z;
            return this;
        }

        /* renamed from: d */
        public C12087b<T> mo64477d(boolean z) {
            this.f29107G = z;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64456a(FalseClick falseClick) {
            this.f29121m = falseClick;
            return this;
        }

        /* renamed from: b */
        public C12087b<T> mo64469b(boolean z) {
            this.f29108H = z;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64457a(AdImpressionData adImpressionData) {
            this.f29122n = adImpressionData;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64461a(List<Long> list) {
            this.f29123o = list;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64450a(int i) {
            this.f29104D = i;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64452a(MediationData mediationData) {
            this.f29126r = mediationData;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64459a(T t) {
            this.f29129u = t;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64454a(RewardData rewardData) {
            this.f29127s = rewardData;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64460a(String str) {
            this.f29131w = str;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64453a(C12110a aVar) {
            this.f29113e = aVar;
            return this;
        }

        /* renamed from: a */
        public C12087b<T> mo64463a(boolean z) {
            this.f29106F = z;
            return this;
        }

        /* renamed from: a */
        public AdResponse<T> mo64464a() {
            return new AdResponse<>(this, (C12086a) null);
        }
    }

    /* synthetic */ AdResponse(C12087b bVar, C12086a aVar) {
        this(bVar);
    }

    /* renamed from: A */
    public RewardData mo64410A() {
        return this.f29096v;
    }

    /* renamed from: B */
    public Long mo64411B() {
        return this.f29097w;
    }

    /* renamed from: C */
    public String mo64412C() {
        return this.f29094t;
    }

    /* renamed from: D */
    public SizeInfo mo64413D() {
        return this.f29080f;
    }

    /* renamed from: E */
    public boolean mo64414E() {
        return this.f29100z;
    }

    /* renamed from: F */
    public boolean mo64415F() {
        return this.f29068B;
    }

    /* renamed from: G */
    public boolean mo64416G() {
        return this.f29099y;
    }

    /* renamed from: H */
    public boolean mo64417H() {
        return this.f29067A;
    }

    /* renamed from: I */
    public boolean mo64418I() {
        return this.f29070D > 0;
    }

    /* renamed from: J */
    public boolean mo64419J() {
        return this.f29074H == 0;
    }

    /* renamed from: a */
    public int mo64420a(Context context) {
        int i = lo1.f36769b;
        return Math.round(TypedValue.applyDimension(1, (float) this.f29074H, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: b */
    public int mo64421b(Context context) {
        int i = lo1.f36769b;
        return Math.round(TypedValue.applyDimension(1, (float) this.f29073G, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: c */
    public int mo64422c() {
        return this.f29074H;
    }

    /* renamed from: d */
    public String mo64423d() {
        return this.f29092r;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public List<Long> mo64425e() {
        return this.f29088n;
    }

    /* renamed from: f */
    public int mo64426f() {
        return this.f29070D * f29066K.intValue();
    }

    /* renamed from: g */
    public int mo64427g() {
        return this.f29071E * f29066K.intValue();
    }

    /* renamed from: h */
    public List<String> mo64428h() {
        return this.f29086l;
    }

    /* renamed from: i */
    public String mo64429i() {
        return this.f29091q;
    }

    /* renamed from: j */
    public List<String> mo64430j() {
        return this.f29081g;
    }

    /* renamed from: k */
    public String mo64431k() {
        return this.f29090p;
    }

    /* renamed from: l */
    public C12115n mo64432l() {
        return this.f29076b;
    }

    /* renamed from: m */
    public String mo64433m() {
        return this.f29077c;
    }

    /* renamed from: n */
    public String mo64434n() {
        return this.f29079e;
    }

    /* renamed from: o */
    public List<Integer> mo64435o() {
        return this.f29089o;
    }

    /* renamed from: p */
    public int mo64436p() {
        return this.f29073G;
    }

    /* renamed from: q */
    public List<String> mo64437q() {
        return this.f29082h;
    }

    /* renamed from: r */
    public Long mo64438r() {
        return this.f29083i;
    }

    /* renamed from: s */
    public C12110a mo64439s() {
        return this.f29093s;
    }

    /* renamed from: t */
    public String mo64440t() {
        return this.f29084j;
    }

    /* renamed from: u */
    public FalseClick mo64441u() {
        return this.f29075I;
    }

    /* renamed from: v */
    public AdImpressionData mo64442v() {
        return this.f29087m;
    }

    /* renamed from: w */
    public Locale mo64443w() {
        return this.f29085k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12115n nVar = this.f29076b;
        int i2 = -1;
        parcel.writeInt(nVar == null ? -1 : nVar.ordinal());
        parcel.writeString(this.f29077c);
        parcel.writeString(this.f29078d);
        parcel.writeString(this.f29079e);
        parcel.writeParcelable(this.f29080f, i);
        parcel.writeStringList(this.f29081g);
        parcel.writeStringList(this.f29082h);
        parcel.writeValue(this.f29083i);
        parcel.writeString(this.f29084j);
        parcel.writeSerializable(this.f29085k);
        parcel.writeStringList(this.f29086l);
        parcel.writeParcelable(this.f29075I, i);
        parcel.writeParcelable(this.f29087m, i);
        parcel.writeList(this.f29088n);
        parcel.writeList(this.f29089o);
        parcel.writeString(this.f29090p);
        parcel.writeString(this.f29091q);
        parcel.writeString(this.f29092r);
        C12110a aVar = this.f29093s;
        if (aVar != null) {
            i2 = aVar.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f29094t);
        parcel.writeParcelable(this.f29095u, i);
        parcel.writeParcelable(this.f29096v, i);
        parcel.writeValue(this.f29097w);
        parcel.writeSerializable(this.f29098x.getClass());
        parcel.writeValue(this.f29098x);
        parcel.writeByte(this.f29099y ? (byte) 1 : 0);
        parcel.writeByte(this.f29100z ? (byte) 1 : 0);
        parcel.writeByte(this.f29067A ? (byte) 1 : 0);
        parcel.writeByte(this.f29068B ? (byte) 1 : 0);
        parcel.writeInt(this.f29069C);
        parcel.writeInt(this.f29070D);
        parcel.writeInt(this.f29071E);
        parcel.writeInt(this.f29072F);
        parcel.writeInt(this.f29073G);
        parcel.writeInt(this.f29074H);
    }

    /* renamed from: x */
    public MediationData mo64445x() {
        return this.f29095u;
    }

    /* renamed from: y */
    public String mo64446y() {
        return this.f29078d;
    }

    /* renamed from: z */
    public T mo64447z() {
        return this.f29098x;
    }

    private AdResponse(C12087b<T> bVar) {
        this.f29076b = bVar.f29109a;
        this.f29079e = bVar.f29112d;
        this.f29077c = bVar.f29110b;
        this.f29078d = bVar.f29111c;
        int C = bVar.f29133y;
        this.f29073G = C;
        int D = bVar.f29134z;
        this.f29074H = D;
        this.f29080f = new SizeInfo(C, D, bVar.f29114f != null ? bVar.f29114f : SizeInfo.C12090b.FIXED);
        this.f29081g = bVar.f29115g;
        this.f29082h = bVar.f29116h;
        this.f29083i = bVar.f29117i;
        this.f29084j = bVar.f29118j;
        this.f29085k = bVar.f29119k;
        this.f29086l = bVar.f29120l;
        this.f29088n = bVar.f29123o;
        this.f29089o = bVar.f29124p;
        this.f29075I = bVar.f29121m;
        this.f29087m = bVar.f29122n;
        this.f29069C = bVar.f29101A;
        this.f29070D = bVar.f29102B;
        this.f29071E = bVar.f29103C;
        this.f29072F = bVar.f29104D;
        this.f29090p = bVar.f29130v;
        this.f29091q = bVar.f29125q;
        this.f29092r = bVar.f29131w;
        this.f29093s = bVar.f29113e;
        this.f29094t = bVar.f29132x;
        this.f29098x = bVar.f29129u;
        this.f29095u = bVar.f29126r;
        this.f29096v = bVar.f29127s;
        this.f29097w = bVar.f29128t;
        this.f29099y = bVar.f29105E;
        this.f29100z = bVar.f29106F;
        this.f29067A = bVar.f29107G;
        this.f29068B = bVar.f29108H;
    }

    protected AdResponse(Parcel parcel) {
        C12115n nVar;
        C12110a aVar;
        int readInt = parcel.readInt();
        T t = null;
        if (readInt == -1) {
            nVar = null;
        } else {
            nVar = C12115n.values()[readInt];
        }
        this.f29076b = nVar;
        this.f29077c = parcel.readString();
        this.f29078d = parcel.readString();
        this.f29079e = parcel.readString();
        this.f29080f = (SizeInfo) parcel.readParcelable(SizeInfo.class.getClassLoader());
        this.f29081g = parcel.createStringArrayList();
        this.f29082h = parcel.createStringArrayList();
        this.f29083i = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f29084j = parcel.readString();
        this.f29085k = (Locale) parcel.readSerializable();
        this.f29086l = parcel.createStringArrayList();
        this.f29075I = (FalseClick) parcel.readParcelable(FalseClick.class.getClassLoader());
        this.f29087m = (AdImpressionData) parcel.readParcelable(AdImpressionData.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f29088n = arrayList;
        parcel.readList(arrayList, Long.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f29089o = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        this.f29090p = parcel.readString();
        this.f29091q = parcel.readString();
        this.f29092r = parcel.readString();
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            aVar = null;
        } else {
            aVar = C12110a.values()[readInt2];
        }
        this.f29093s = aVar;
        this.f29094t = parcel.readString();
        this.f29095u = (MediationData) parcel.readParcelable(MediationData.class.getClassLoader());
        this.f29096v = (RewardData) parcel.readParcelable(RewardData.class.getClassLoader());
        this.f29097w = (Long) parcel.readValue(Long.class.getClassLoader());
        Class cls = (Class) parcel.readSerializable();
        this.f29098x = cls != null ? parcel.readValue(cls.getClassLoader()) : t;
        boolean z = true;
        this.f29099y = parcel.readByte() != 0;
        this.f29100z = parcel.readByte() != 0;
        this.f29067A = parcel.readByte() != 0;
        this.f29068B = parcel.readByte() == 0 ? false : z;
        this.f29069C = parcel.readInt();
        this.f29070D = parcel.readInt();
        this.f29071E = parcel.readInt();
        this.f29072F = parcel.readInt();
        this.f29073G = parcel.readInt();
        this.f29074H = parcel.readInt();
    }
}
