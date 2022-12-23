package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Uc */
public class C10807Uc {

    /* renamed from: a */
    public final long f25910a;

    /* renamed from: b */
    public final float f25911b;

    /* renamed from: c */
    public final int f25912c;

    /* renamed from: d */
    public final int f25913d;

    /* renamed from: e */
    public final long f25914e;

    /* renamed from: f */
    public final int f25915f;

    /* renamed from: g */
    public final boolean f25916g;

    /* renamed from: h */
    public final long f25917h;

    /* renamed from: i */
    public final boolean f25918i;

    /* renamed from: j */
    public final boolean f25919j;

    /* renamed from: k */
    public final boolean f25920k;

    /* renamed from: l */
    public final boolean f25921l;

    /* renamed from: m */
    public final C10220Ec f25922m;

    /* renamed from: n */
    public final C10220Ec f25923n;

    /* renamed from: o */
    public final C10220Ec f25924o;

    /* renamed from: p */
    public final C10220Ec f25925p;

    /* renamed from: q */
    public final C10401Jc f25926q;

    public C10807Uc(long j, float f, int i, int i2, long j2, int i3, boolean z, long j3, boolean z2, boolean z3, boolean z4, boolean z5, C10220Ec ec, C10220Ec ec2, C10220Ec ec3, C10220Ec ec4, C10401Jc jc) {
        this.f25910a = j;
        this.f25911b = f;
        this.f25912c = i;
        this.f25913d = i2;
        this.f25914e = j2;
        this.f25915f = i3;
        this.f25916g = z;
        this.f25917h = j3;
        this.f25918i = z2;
        this.f25919j = z3;
        this.f25920k = z4;
        this.f25921l = z5;
        this.f25922m = ec;
        this.f25923n = ec2;
        this.f25924o = ec3;
        this.f25925p = ec4;
        this.f25926q = jc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10807Uc.class != obj.getClass()) {
            return false;
        }
        C10807Uc uc = (C10807Uc) obj;
        if (this.f25910a != uc.f25910a || Float.compare(uc.f25911b, this.f25911b) != 0 || this.f25912c != uc.f25912c || this.f25913d != uc.f25913d || this.f25914e != uc.f25914e || this.f25915f != uc.f25915f || this.f25916g != uc.f25916g || this.f25917h != uc.f25917h || this.f25918i != uc.f25918i || this.f25919j != uc.f25919j || this.f25920k != uc.f25920k || this.f25921l != uc.f25921l) {
            return false;
        }
        C10220Ec ec = this.f25922m;
        if (ec == null ? uc.f25922m != null : !ec.equals(uc.f25922m)) {
            return false;
        }
        C10220Ec ec2 = this.f25923n;
        if (ec2 == null ? uc.f25923n != null : !ec2.equals(uc.f25923n)) {
            return false;
        }
        C10220Ec ec3 = this.f25924o;
        if (ec3 == null ? uc.f25924o != null : !ec3.equals(uc.f25924o)) {
            return false;
        }
        C10220Ec ec4 = this.f25925p;
        if (ec4 == null ? uc.f25925p != null : !ec4.equals(uc.f25925p)) {
            return false;
        }
        C10401Jc jc = this.f25926q;
        C10401Jc jc2 = uc.f25926q;
        if (jc != null) {
            return jc.equals(jc2);
        }
        if (jc2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f25910a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        float f = this.f25911b;
        int i2 = 0;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j2 = this.f25914e;
        long j3 = this.f25917h;
        int i3 = (((((((((((((((((((((i + floatToIntBits) * 31) + this.f25912c) * 31) + this.f25913d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f25915f) * 31) + (this.f25916g ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f25918i ? 1 : 0)) * 31) + (this.f25919j ? 1 : 0)) * 31) + (this.f25920k ? 1 : 0)) * 31) + (this.f25921l ? 1 : 0)) * 31;
        C10220Ec ec = this.f25922m;
        int hashCode = (i3 + (ec != null ? ec.hashCode() : 0)) * 31;
        C10220Ec ec2 = this.f25923n;
        int hashCode2 = (hashCode + (ec2 != null ? ec2.hashCode() : 0)) * 31;
        C10220Ec ec3 = this.f25924o;
        int hashCode3 = (hashCode2 + (ec3 != null ? ec3.hashCode() : 0)) * 31;
        C10220Ec ec4 = this.f25925p;
        int hashCode4 = (hashCode3 + (ec4 != null ? ec4.hashCode() : 0)) * 31;
        C10401Jc jc = this.f25926q;
        if (jc != null) {
            i2 = jc.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "LocationArguments{updateTimeInterval=" + this.f25910a + ", updateDistanceInterval=" + this.f25911b + ", recordsCountToForceFlush=" + this.f25912c + ", maxBatchSize=" + this.f25913d + ", maxAgeToForceFlush=" + this.f25914e + ", maxRecordsToStoreLocally=" + this.f25915f + ", collectionEnabled=" + this.f25916g + ", lbsUpdateTimeInterval=" + this.f25917h + ", lbsCollectionEnabled=" + this.f25918i + ", passiveCollectionEnabled=" + this.f25919j + ", allCellsCollectingEnabled=" + this.f25920k + ", connectedCellCollectingEnabled=" + this.f25921l + ", wifiAccessConfig=" + this.f25922m + ", lbsAccessConfig=" + this.f25923n + ", gpsAccessConfig=" + this.f25924o + ", passiveAccessConfig=" + this.f25925p + ", gplConfig=" + this.f25926q + '}';
    }
}
