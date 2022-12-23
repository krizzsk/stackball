package com.yandex.metrica.impl.p265ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.xi */
public final class C11954xi implements Parcelable {
    public static final C11955a CREATOR = new C11955a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Boolean f28724a;

    /* renamed from: b */
    private final C11171e1 f28725b;

    /* renamed from: c */
    private final String f28726c;

    /* renamed from: com.yandex.metrica.impl.ob.xi$a */
    public static final class C11955a implements Parcelable.Creator<C11954xi> {
        private C11955a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(readValue instanceof Boolean)) {
                readValue = null;
            }
            C11171e1 a = C11171e1.m28808a(parcel.readString());
            Intrinsics.checkNotNullExpressionValue(a, "IdentifierStatus.from(parcel.readString())");
            return new C11954xi((Boolean) readValue, a, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new C11954xi[i];
        }

        public /* synthetic */ C11955a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11954xi(Boolean bool, C11171e1 e1Var, String str) {
        this.f28724a = bool;
        this.f28725b = e1Var;
        this.f28726c = str;
    }

    /* renamed from: a */
    public final String mo64089a() {
        return this.f28726c;
    }

    /* renamed from: b */
    public final Boolean mo64090b() {
        return this.f28724a;
    }

    /* renamed from: c */
    public final C11171e1 mo64091c() {
        return this.f28725b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11954xi)) {
            return false;
        }
        C11954xi xiVar = (C11954xi) obj;
        return Intrinsics.areEqual((Object) this.f28724a, (Object) xiVar.f28724a) && Intrinsics.areEqual((Object) this.f28725b, (Object) xiVar.f28725b) && Intrinsics.areEqual((Object) this.f28726c, (Object) xiVar.f28726c);
    }

    public int hashCode() {
        Boolean bool = this.f28724a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C11171e1 e1Var = this.f28725b;
        int hashCode2 = (hashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 31;
        String str = this.f28726c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "FeaturesInternal(sslPinning=" + this.f28724a + ", status=" + this.f28725b + ", errorExplanation=" + this.f28726c + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f28724a);
        parcel.writeString(this.f28725b.mo62803a());
        parcel.writeString(this.f28726c);
    }

    public C11954xi() {
        this((Boolean) null, C11171e1.UNKNOWN, (String) null);
    }
}
