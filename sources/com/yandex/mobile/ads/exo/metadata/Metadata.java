package com.yandex.mobile.ads.exo.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C12229a();

    /* renamed from: b */
    private final Entry[] f29860b;

    public interface Entry extends Parcelable {

        /* renamed from: com.yandex.mobile.ads.exo.metadata.Metadata$Entry$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static byte[] $default$a(Entry entry) {
                return null;
            }

            public static Format $default$b(Entry entry) {
                return null;
            }
        }

        /* renamed from: a */
        byte[] mo64872a();

        /* renamed from: b */
        Format mo64873b();
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.Metadata$a */
    class C12229a implements Parcelable.Creator<Metadata> {
        C12229a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        public Object[] newArray(int i) {
            return new Metadata[i];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f29860b = entryArr;
    }

    /* renamed from: a */
    public Entry mo64994a(int i) {
        return this.f29860b[i];
    }

    /* renamed from: c */
    public int mo64997c() {
        return this.f29860b.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f29860b, ((Metadata) obj).f29860b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29860b);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f29860b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29860b.length);
        for (Entry writeParcelable : this.f29860b) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    /* renamed from: a */
    public Metadata mo64995a(Metadata metadata) {
        return metadata == null ? this : mo64996a(metadata.f29860b);
    }

    public Metadata(List<? extends Entry> list) {
        Entry[] entryArr = new Entry[list.size()];
        this.f29860b = entryArr;
        list.toArray(entryArr);
    }

    /* renamed from: a */
    public Metadata mo64996a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        Entry[] entryArr2 = this.f29860b;
        int i = ih1.f34858a;
        Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
        return new Metadata((Entry[]) copyOf);
    }

    Metadata(Parcel parcel) {
        this.f29860b = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f29860b;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
