package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.inmobi.unification.sdk.model.ASRequestParams;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.inmobi.media.an */
/* compiled from: AdPlacement */
public final class C4955an implements Parcelable {
    public static final Parcelable.Creator<C4955an> CREATOR = new Parcelable.Creator<C4955an>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C4955an[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C4955an(parcel, (byte) 0);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f11222a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f11223b;

    /* renamed from: c */
    private final String f11224c;

    /* renamed from: d */
    private String f11225d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, String> f11226e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f11227f;

    /* renamed from: g */
    private final String f11228g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f11229h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f11230i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f11231j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f11232k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ASRequestParams f11233l;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ C4955an(long j, long j2, String str, String str2, String str3, byte b) {
        this(j, j2, str, str2, str3);
    }

    /* synthetic */ C4955an(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: com.inmobi.media.an$a */
    /* compiled from: AdPlacement */
    public static class C4957a {

        /* renamed from: a */
        private long f11234a = Long.MIN_VALUE;

        /* renamed from: b */
        private long f11235b = Long.MIN_VALUE;

        /* renamed from: c */
        private String f11236c;

        /* renamed from: d */
        private Map<String, String> f11237d;

        /* renamed from: e */
        private String f11238e;

        /* renamed from: f */
        private String f11239f;

        /* renamed from: g */
        private String f11240g;

        /* renamed from: h */
        private String f11241h = "";

        /* renamed from: i */
        private boolean f11242i;

        /* renamed from: j */
        private String f11243j = "activity";

        /* renamed from: k */
        private ASRequestParams f11244k;

        public C4957a(String str, String str2) {
            this.f11239f = str;
            this.f11236c = str2;
            this.f11240g = UUID.randomUUID().toString();
        }

        /* renamed from: a */
        public final C4957a mo40086a(long j) {
            this.f11234a = j;
            return this;
        }

        /* renamed from: b */
        public final C4957a mo40093b(long j) {
            this.f11235b = j;
            return this;
        }

        /* renamed from: a */
        public final C4957a mo40087a(C4955an anVar) {
            this.f11235b = anVar.f11223b;
            this.f11234a = anVar.f11222a;
            this.f11243j = anVar.f11231j;
            this.f11237d = anVar.f11226e;
            this.f11241h = anVar.f11230i;
            return this;
        }

        /* renamed from: a */
        public final C4957a mo40089a(String str) {
            this.f11241h = str;
            return this;
        }

        /* renamed from: b */
        public final C4957a mo40094b(String str) {
            this.f11243j = str;
            return this;
        }

        /* renamed from: a */
        public final C4957a mo40090a(Map<String, String> map) {
            this.f11237d = map;
            return this;
        }

        /* renamed from: c */
        public final C4957a mo40095c(String str) {
            this.f11238e = str;
            return this;
        }

        /* renamed from: a */
        public final C4957a mo40091a(boolean z) {
            this.f11242i = z;
            return this;
        }

        /* renamed from: a */
        public final C4957a mo40088a(ASRequestParams aSRequestParams) {
            this.f11244k = aSRequestParams;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.inmobi.media.C4955an mo40092a() {
            /*
                r10 = this;
                java.lang.String r0 = r10.f11236c
                int r1 = r0.hashCode()
                r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
                r3 = 2
                if (r1 == r2) goto L_0x001c
                r2 = 557596132(0x213c3de4, float:6.377879E-19)
                if (r1 == r2) goto L_0x0012
                goto L_0x0026
            L_0x0012:
                java.lang.String r1 = "AerServ"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0026
                r0 = 2
                goto L_0x0027
            L_0x001c:
                java.lang.String r1 = "InMobi"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0026
                r0 = 1
                goto L_0x0027
            L_0x0026:
                r0 = -1
            L_0x0027:
                r1 = -9223372036854775808
                if (r0 == r3) goto L_0x003a
                long r3 = r10.f11234a
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0032
                goto L_0x0040
            L_0x0032:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "When the integration type is IM, IM-Plc can't be empty"
                r0.<init>(r1)
                throw r0
            L_0x003a:
                long r3 = r10.f11235b
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0079
            L_0x0040:
                com.inmobi.media.an r0 = new com.inmobi.media.an
                long r2 = r10.f11234a
                long r4 = r10.f11235b
                java.util.Map<java.lang.String, java.lang.String> r1 = r10.f11237d
                java.lang.String r6 = com.inmobi.media.C4955an.m11192a((java.util.Map<java.lang.String, java.lang.String>) r1)
                java.lang.String r7 = r10.f11239f
                java.lang.String r8 = r10.f11236c
                r9 = 0
                r1 = r0
                r1.<init>(r2, r4, r6, r7, r8, r9)
                java.lang.String r1 = r10.f11238e
                java.lang.String unused = r0.f11227f = r1
                java.util.Map<java.lang.String, java.lang.String> r1 = r10.f11237d
                java.util.Map unused = r0.f11226e = r1
                java.lang.String r1 = r10.f11241h
                java.lang.String unused = r0.f11230i = r1
                java.lang.String r1 = r10.f11243j
                java.lang.String unused = r0.f11231j = r1
                java.lang.String r1 = r10.f11240g
                java.lang.String unused = r0.f11229h = r1
                boolean r1 = r10.f11242i
                boolean unused = r0.f11232k = r1
                com.inmobi.unification.sdk.model.ASRequestParams r1 = r10.f11244k
                com.inmobi.unification.sdk.model.ASRequestParams unused = r0.f11233l = r1
                return r0
            L_0x0079:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "When the integration type is AS, AS-Plc can't be empty"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4955an.C4957a.mo40092a():com.inmobi.media.an");
        }
    }

    private C4955an(long j, long j2, String str, String str2, String str3) {
        this.f11230i = "";
        this.f11231j = "activity";
        this.f11222a = j;
        this.f11223b = j2;
        this.f11224c = str3;
        this.f11225d = str;
        this.f11228g = str2;
        if (str == null) {
            this.f11225d = "";
        }
    }

    private C4955an(Parcel parcel) {
        this.f11230i = "";
        String str = "activity";
        this.f11231j = str;
        this.f11223b = parcel.readLong();
        this.f11222a = parcel.readLong();
        this.f11224c = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            char c = 65535;
            int hashCode = readString.hashCode();
            if (hashCode != -1655966961) {
                if (hashCode == -1006804125 && readString.equals("others")) {
                    c = 2;
                }
            } else if (readString.equals(str)) {
                c = 1;
            }
            if (c == 2) {
                str = "others";
            }
        }
        this.f11231j = str;
        this.f11228g = parcel.readString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = r2.get("tp");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11192a(java.util.Map<java.lang.String, java.lang.String> r2) {
        /*
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = "tp"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0010
            return r0
        L_0x0010:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4955an.m11192a(java.util.Map):java.lang.String");
    }

    /* renamed from: a */
    public final String mo40062a() {
        return this.f11224c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo40064b() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f11224c
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001c
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 2
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == r3) goto L_0x002c
            java.lang.String r0 = "im"
            return r0
        L_0x002c:
            java.lang.String r0 = "as"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4955an.mo40064b():java.lang.String");
    }

    /* renamed from: b */
    public final void mo40066b(Map<String, String> map) {
        this.f11226e = map;
    }

    /* renamed from: c */
    public final Map<String, String> mo40067c() {
        return this.f11226e;
    }

    /* renamed from: d */
    public final String mo40068d() {
        return this.f11227f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo40070e() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f11224c
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001c
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 2
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == r3) goto L_0x002c
            long r0 = r4.f11222a
            return r0
        L_0x002c:
            long r0 = r4.f11223b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4955an.mo40070e():long");
    }

    /* renamed from: f */
    public final boolean mo40072f() {
        return this.f11232k;
    }

    /* renamed from: g */
    public final ASRequestParams mo40073g() {
        return this.f11233l;
    }

    /* renamed from: h */
    public final long mo40074h() {
        return this.f11223b;
    }

    /* renamed from: i */
    public final long mo40076i() {
        return this.f11222a;
    }

    /* renamed from: j */
    public final String mo40077j() {
        return this.f11225d;
    }

    /* renamed from: k */
    public final String mo40078k() {
        return this.f11228g;
    }

    /* renamed from: a */
    public final void mo40063a(String str) {
        this.f11230i = str;
    }

    /* renamed from: l */
    public final String mo40079l() {
        return this.f11230i;
    }

    /* renamed from: m */
    public final String mo40080m() {
        return this.f11231j;
    }

    /* renamed from: b */
    public final void mo40065b(String str) {
        this.f11231j = str;
    }

    /* renamed from: n */
    public final String mo40081n() {
        return this.f11229h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C4955an anVar = (C4955an) obj;
            return this.f11222a == anVar.f11222a && this.f11223b == anVar.f11223b && this.f11224c.equals(anVar.f11224c) && this.f11231j.equals(anVar.f11231j) && this.f11225d.equals(anVar.f11225d) && this.f11228g.equals(anVar.f11228g);
        }
    }

    public final int hashCode() {
        long j = this.f11223b;
        long j2 = this.f11222a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 31)))) * 30) + this.f11228g.hashCode()) * 29) + this.f11231j.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mo40062a()
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001e
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 2
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == r3) goto L_0x0032
            long r0 = r4.f11222a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0032:
            long r0 = r4.f11223b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4955an.toString():java.lang.String");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11223b);
        parcel.writeLong(this.f11222a);
        parcel.writeString(this.f11224c);
        parcel.writeString(this.f11231j);
        parcel.writeString(this.f11228g);
    }
}
