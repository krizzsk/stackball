package com.yandex.mobile.ads.base;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import com.yandex.mobile.ads.impl.lo1;
import java.util.Locale;

public class SizeInfo implements Parcelable {
    public static final Parcelable.Creator<SizeInfo> CREATOR = new C12089a();

    /* renamed from: b */
    private final int f29136b;

    /* renamed from: c */
    private final int f29137c;

    /* renamed from: d */
    private final String f29138d;

    /* renamed from: e */
    private final C12090b f29139e;

    /* renamed from: com.yandex.mobile.ads.base.SizeInfo$a */
    class C12089a implements Parcelable.Creator<SizeInfo> {
        C12089a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new SizeInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new SizeInfo[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.SizeInfo$b */
    public enum C12090b {
        FIXED("fixed"),
        FLEXIBLE("flexible"),
        STICKY("sticky");
        

        /* renamed from: b */
        private final String f29144b;

        private C12090b(String str) {
            this.f29144b = str;
        }

        /* renamed from: a */
        public String mo64502a() {
            return this.f29144b;
        }
    }

    public SizeInfo(int i, int i2, C12090b bVar) {
        this.f29136b = (i >= 0 || -1 == i) ? i : 0;
        this.f29137c = (i2 >= 0 || -2 == i2) ? i2 : 0;
        this.f29139e = bVar;
        this.f29138d = String.format(Locale.US, "%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* renamed from: a */
    public int mo64488a(Context context) {
        int i = this.f29137c;
        return -2 == i ? lo1.m38869b(context) : i;
    }

    /* renamed from: b */
    public int mo64489b(Context context) {
        int i = this.f29137c;
        if (-2 == i) {
            int i2 = lo1.f36769b;
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        int i3 = lo1.f36769b;
        return Math.round(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: c */
    public int mo64490c() {
        return this.f29137c;
    }

    /* renamed from: d */
    public int mo64492d(Context context) {
        int i = this.f29136b;
        if (-1 == i) {
            int i2 = lo1.f36769b;
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        int i3 = lo1.f36769b;
        return Math.round(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo64495e() {
        return this.f29136b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SizeInfo sizeInfo = (SizeInfo) obj;
        if (this.f29136b == sizeInfo.f29136b && this.f29137c == sizeInfo.f29137c && this.f29139e == sizeInfo.f29139e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f29136b * 31) + this.f29137c) * 31) + this.f29138d.hashCode()) * 31) + this.f29139e.hashCode();
    }

    public String toString() {
        return this.f29138d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29136b);
        parcel.writeInt(this.f29137c);
        parcel.writeInt(this.f29139e.ordinal());
        parcel.writeString(this.f29138d);
    }

    /* renamed from: c */
    public int mo64491c(Context context) {
        int i = this.f29136b;
        return -1 == i ? lo1.m38873d(context) : i;
    }

    protected SizeInfo(Parcel parcel) {
        this.f29136b = parcel.readInt();
        this.f29137c = parcel.readInt();
        this.f29139e = C12090b.values()[parcel.readInt()];
        this.f29138d = parcel.readString();
    }

    /* renamed from: d */
    public C12090b mo64493d() {
        return this.f29139e;
    }
}
