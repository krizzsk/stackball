package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

public final class ButtonAppearance implements Parcelable {
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new C15537a();

    /* renamed from: b */
    private final TextAppearance f44005b;

    /* renamed from: c */
    private final int f44006c;

    /* renamed from: d */
    private final float f44007d;

    /* renamed from: e */
    private final int f44008e;

    /* renamed from: f */
    private final int f44009f;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f44010a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f44011b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f44012c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f44013d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TextAppearance f44014e;

        public ButtonAppearance build() {
            return new ButtonAppearance(this, (C15537a) null);
        }

        public Builder setBorderColor(int i) {
            this.f44010a = i;
            return this;
        }

        public Builder setBorderWidth(float f) {
            this.f44011b = f;
            return this;
        }

        public Builder setNormalColor(int i) {
            this.f44012c = i;
            return this;
        }

        public Builder setPressedColor(int i) {
            this.f44013d = i;
            return this;
        }

        public Builder setTextAppearance(TextAppearance textAppearance) {
            this.f44014e = textAppearance;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance$a */
    class C15537a implements Parcelable.Creator<ButtonAppearance> {
        C15537a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new ButtonAppearance(parcel);
        }

        public Object[] newArray(int i) {
            return new ButtonAppearance[i];
        }
    }

    /* synthetic */ ButtonAppearance(Builder builder, C15537a aVar) {
        this(builder);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ButtonAppearance.class != obj.getClass()) {
            return false;
        }
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        if (this.f44006c != buttonAppearance.f44006c || Float.compare(buttonAppearance.f44007d, this.f44007d) != 0 || this.f44008e != buttonAppearance.f44008e || this.f44009f != buttonAppearance.f44009f) {
            return false;
        }
        TextAppearance textAppearance = this.f44005b;
        if (textAppearance != null) {
            if (!textAppearance.equals(buttonAppearance.f44005b)) {
                return false;
            }
            return true;
        } else if (buttonAppearance.f44005b == null) {
            return true;
        }
        return false;
    }

    public int getBorderColor() {
        return this.f44006c;
    }

    public float getBorderWidth() {
        return this.f44007d;
    }

    public int getNormalColor() {
        return this.f44008e;
    }

    public int getPressedColor() {
        return this.f44009f;
    }

    public TextAppearance getTextAppearance() {
        return this.f44005b;
    }

    public int hashCode() {
        int i = this.f44006c * 31;
        float f = this.f44007d;
        int i2 = 0;
        int floatToIntBits = (((((i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f44008e) * 31) + this.f44009f) * 31;
        TextAppearance textAppearance = this.f44005b;
        if (textAppearance != null) {
            i2 = textAppearance.hashCode();
        }
        return floatToIntBits + i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f44006c);
        parcel.writeFloat(this.f44007d);
        parcel.writeInt(this.f44008e);
        parcel.writeInt(this.f44009f);
        parcel.writeParcelable(this.f44005b, 0);
    }

    private ButtonAppearance(Builder builder) {
        this.f44006c = builder.f44010a;
        this.f44007d = builder.f44011b;
        this.f44008e = builder.f44012c;
        this.f44009f = builder.f44013d;
        this.f44005b = builder.f44014e;
    }

    protected ButtonAppearance(Parcel parcel) {
        this.f44006c = parcel.readInt();
        this.f44007d = parcel.readFloat();
        this.f44008e = parcel.readInt();
        this.f44009f = parcel.readInt();
        this.f44005b = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
    }
}
