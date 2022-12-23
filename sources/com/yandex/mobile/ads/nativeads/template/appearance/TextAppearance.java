package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

public final class TextAppearance implements Parcelable {
    public static final Parcelable.Creator<TextAppearance> CREATOR = new C15542a();

    /* renamed from: b */
    private final String f44057b;

    /* renamed from: c */
    private final int f44058c;

    /* renamed from: d */
    private final float f44059d;

    /* renamed from: e */
    private final int f44060e;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f44061a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f44062b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f44063c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f44064d;

        public TextAppearance build() {
            return new TextAppearance(this, (C15542a) null);
        }

        public Builder setFontFamilyName(String str) {
            this.f44061a = str;
            return this;
        }

        public Builder setFontStyle(int i) {
            this.f44064d = i;
            return this;
        }

        public Builder setTextColor(int i) {
            this.f44062b = i;
            return this;
        }

        public Builder setTextSize(float f) {
            this.f44063c = f;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance$a */
    class C15542a implements Parcelable.Creator<TextAppearance> {
        C15542a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new TextAppearance(parcel);
        }

        public Object[] newArray(int i) {
            return new TextAppearance[i];
        }
    }

    /* synthetic */ TextAppearance(Builder builder, C15542a aVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextAppearance.class != obj.getClass()) {
            return false;
        }
        TextAppearance textAppearance = (TextAppearance) obj;
        if (this.f44058c != textAppearance.f44058c || Float.compare(textAppearance.f44059d, this.f44059d) != 0 || this.f44060e != textAppearance.f44060e) {
            return false;
        }
        String str = this.f44057b;
        if (str != null) {
            if (!str.equals(textAppearance.f44057b)) {
                return false;
            }
            return true;
        } else if (textAppearance.f44057b == null) {
            return true;
        }
        return false;
    }

    public String getFontFamilyName() {
        return this.f44057b;
    }

    public int getFontStyle() {
        return this.f44060e;
    }

    public int getTextColor() {
        return this.f44058c;
    }

    public float getTextSize() {
        return this.f44059d;
    }

    public int hashCode() {
        int i = this.f44058c * 31;
        float f = this.f44059d;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        String str = this.f44057b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((floatToIntBits + i2) * 31) + this.f44060e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f44058c);
        parcel.writeFloat(this.f44059d);
        parcel.writeString(this.f44057b);
        parcel.writeInt(this.f44060e);
    }

    private TextAppearance(Builder builder) {
        this.f44058c = builder.f44062b;
        this.f44059d = builder.f44063c;
        this.f44057b = builder.f44061a;
        this.f44060e = builder.f44064d;
    }

    protected TextAppearance(Parcel parcel) {
        this.f44058c = parcel.readInt();
        this.f44059d = parcel.readFloat();
        this.f44057b = parcel.readString();
        this.f44060e = parcel.readInt();
    }
}
