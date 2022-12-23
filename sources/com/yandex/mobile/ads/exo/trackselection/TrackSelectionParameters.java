package com.yandex.mobile.ads.exo.trackselection;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Locale;

public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR = new C12318a();

    /* renamed from: b */
    public final String f30284b;

    /* renamed from: c */
    public final String f30285c;

    /* renamed from: d */
    public final int f30286d;

    /* renamed from: e */
    public final boolean f30287e;

    /* renamed from: f */
    public final int f30288f;

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.TrackSelectionParameters$a */
    class C12318a implements Parcelable.Creator<TrackSelectionParameters> {
        C12318a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        public Object[] newArray(int i) {
            return new TrackSelectionParameters[i];
        }
    }

    static {
        new TrackSelectionParameters((String) null, (String) null, 0, false, 0);
    }

    TrackSelectionParameters(String str, String str2, int i, boolean z, int i2) {
        this.f30284b = ih1.m37395d(str);
        this.f30285c = ih1.m37395d(str2);
        this.f30286d = i;
        this.f30287e = z;
        this.f30288f = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        if (TextUtils.equals(this.f30284b, trackSelectionParameters.f30284b) && TextUtils.equals(this.f30285c, trackSelectionParameters.f30285c) && this.f30286d == trackSelectionParameters.f30286d && this.f30287e == trackSelectionParameters.f30287e && this.f30288f == trackSelectionParameters.f30288f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30284b;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f30285c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode + i) * 31) + this.f30286d) * 31) + (this.f30287e ? 1 : 0)) * 31) + this.f30288f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30284b);
        parcel.writeString(this.f30285c);
        parcel.writeInt(this.f30286d);
        boolean z = this.f30287e;
        int i2 = ih1.f34858a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f30288f);
    }

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.TrackSelectionParameters$b */
    public static class C12319b {

        /* renamed from: a */
        String f30289a;

        /* renamed from: b */
        int f30290b;

        public C12319b(Context context) {
            this();
            mo65376a(context);
        }

        /* renamed from: a */
        public C12319b mo65376a(Context context) {
            CaptioningManager captioningManager;
            String str;
            int i = ih1.f34858a;
            if (i >= 19 && ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.f30290b = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    if (i >= 21) {
                        str = locale.toLanguageTag();
                    } else {
                        str = locale.toString();
                    }
                    this.f30289a = str;
                }
            }
            return this;
        }

        @Deprecated
        public C12319b() {
            this.f30289a = null;
            this.f30290b = 0;
        }
    }

    TrackSelectionParameters(Parcel parcel) {
        this.f30284b = parcel.readString();
        this.f30285c = parcel.readString();
        this.f30286d = parcel.readInt();
        this.f30287e = ih1.m37381a(parcel);
        this.f30288f = parcel.readInt();
    }
}
