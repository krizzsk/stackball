package com.yandex.mobile.ads.exo.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12320a;
import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.exo.trackselection.TrackSelectionParameters;
import com.yandex.mobile.ads.impl.ih1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class DefaultTrackSelector extends C12328c {

    /* renamed from: d */
    private static final int[] f30218d = new int[0];

    /* renamed from: b */
    private final C12330d.C12332b f30219b;

    /* renamed from: c */
    private final AtomicReference<Parameters> f30220c;

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR = new C12312a();

        /* renamed from: A */
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> f30221A;

        /* renamed from: B */
        private final SparseBooleanArray f30222B;

        /* renamed from: g */
        public final int f30223g;

        /* renamed from: h */
        public final int f30224h;

        /* renamed from: i */
        public final int f30225i;

        /* renamed from: j */
        public final int f30226j;

        /* renamed from: k */
        public final boolean f30227k;

        /* renamed from: l */
        public final boolean f30228l;

        /* renamed from: m */
        public final boolean f30229m;

        /* renamed from: n */
        public final int f30230n;

        /* renamed from: o */
        public final int f30231o;

        /* renamed from: p */
        public final boolean f30232p;

        /* renamed from: q */
        public final int f30233q;

        /* renamed from: r */
        public final int f30234r;

        /* renamed from: s */
        public final boolean f30235s;

        /* renamed from: t */
        public final boolean f30236t;

        /* renamed from: u */
        public final boolean f30237u;

        /* renamed from: v */
        public final boolean f30238v;

        /* renamed from: w */
        public final boolean f30239w;

        /* renamed from: x */
        public final boolean f30240x;

        /* renamed from: y */
        public final boolean f30241y;

        /* renamed from: z */
        public final int f30242z;

        /* renamed from: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$Parameters$a */
        class C12312a implements Parcelable.Creator<Parameters> {
            C12312a() {
            }

            public Object createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            public Object[] newArray(int i) {
                return new Parameters[i];
            }
        }

        static {
            new C12316c().mo65374a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Parameters(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, int i6, boolean z4, String str, int i7, int i8, boolean z5, boolean z6, boolean z7, boolean z8, String str2, int i9, boolean z9, int i10, boolean z10, boolean z11, boolean z12, int i11, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super((String) null, str2, i9, z9, i10);
            this.f30223g = i;
            this.f30224h = i2;
            this.f30225i = i3;
            this.f30226j = i4;
            this.f30227k = z;
            this.f30228l = z2;
            this.f30229m = z3;
            this.f30230n = i5;
            this.f30231o = i6;
            this.f30232p = z4;
            this.f30233q = i7;
            this.f30234r = i8;
            this.f30235s = z5;
            this.f30236t = z6;
            this.f30237u = z7;
            this.f30238v = z8;
            this.f30239w = z10;
            this.f30240x = z11;
            this.f30241y = z12;
            this.f30242z = i11;
            this.f30221A = sparseArray;
            this.f30222B = sparseBooleanArray;
        }

        /* renamed from: a */
        public static Parameters m32443a(Context context) {
            return new C12316c(context).mo65374a();
        }

        /* renamed from: b */
        public final boolean mo65357b(int i, TrackGroupArray trackGroupArray) {
            Map map = this.f30221A.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            if (super.equals(obj) && this.f30223g == parameters.f30223g && this.f30224h == parameters.f30224h && this.f30225i == parameters.f30225i && this.f30226j == parameters.f30226j && this.f30227k == parameters.f30227k && this.f30228l == parameters.f30228l && this.f30229m == parameters.f30229m && this.f30232p == parameters.f30232p && this.f30230n == parameters.f30230n && this.f30231o == parameters.f30231o && this.f30233q == parameters.f30233q && this.f30234r == parameters.f30234r && this.f30235s == parameters.f30235s && this.f30236t == parameters.f30236t && this.f30237u == parameters.f30237u && this.f30238v == parameters.f30238v && this.f30239w == parameters.f30239w && this.f30240x == parameters.f30240x && this.f30241y == parameters.f30241y && this.f30242z == parameters.f30242z) {
                SparseBooleanArray sparseBooleanArray = this.f30222B;
                SparseBooleanArray sparseBooleanArray2 = parameters.f30222B;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                z = false;
                if (z) {
                    SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = this.f30221A;
                    SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = parameters.f30221A;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey < 0) {
                                    break;
                                }
                                Map valueAt = sparseArray.valueAt(i2);
                                Map valueAt2 = sparseArray2.valueAt(indexOfKey);
                                if (valueAt2.size() == valueAt.size()) {
                                    Iterator it = valueAt.entrySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z3 = true;
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                        if (valueAt2.containsKey(trackGroupArray)) {
                                            if (!ih1.m37382a(entry.getValue(), valueAt2.get(trackGroupArray))) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z3 = false;
                                if (!z3) {
                                    break;
                                }
                                i2++;
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f30223g) * 31) + this.f30224h) * 31) + this.f30225i) * 31) + this.f30226j) * 31) + (this.f30227k ? 1 : 0)) * 31) + (this.f30228l ? 1 : 0)) * 31) + (this.f30229m ? 1 : 0)) * 31) + (this.f30232p ? 1 : 0)) * 31) + this.f30230n) * 31) + this.f30231o) * 31) + this.f30233q) * 31) + this.f30234r) * 31) + (this.f30235s ? 1 : 0)) * 31) + (this.f30236t ? 1 : 0)) * 31) + (this.f30237u ? 1 : 0)) * 31) + (this.f30238v ? 1 : 0)) * 31) + (this.f30239w ? 1 : 0)) * 31) + (this.f30240x ? 1 : 0)) * 31) + (this.f30241y ? 1 : 0)) * 31) + this.f30242z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f30223g);
            parcel.writeInt(this.f30224h);
            parcel.writeInt(this.f30225i);
            parcel.writeInt(this.f30226j);
            parcel.writeInt(this.f30227k ? 1 : 0);
            parcel.writeInt(this.f30228l ? 1 : 0);
            parcel.writeInt(this.f30229m ? 1 : 0);
            parcel.writeInt(this.f30230n);
            parcel.writeInt(this.f30231o);
            parcel.writeInt(this.f30232p ? 1 : 0);
            parcel.writeInt(this.f30233q);
            parcel.writeInt(this.f30234r);
            parcel.writeInt(this.f30235s ? 1 : 0);
            parcel.writeInt(this.f30236t ? 1 : 0);
            parcel.writeInt(this.f30237u ? 1 : 0);
            parcel.writeInt(this.f30238v ? 1 : 0);
            parcel.writeInt(this.f30239w ? 1 : 0);
            parcel.writeInt(this.f30240x ? 1 : 0);
            parcel.writeInt(this.f30241y ? 1 : 0);
            parcel.writeInt(this.f30242z);
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = this.f30221A;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                Map valueAt = sparseArray.valueAt(i2);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f30222B);
        }

        /* renamed from: a */
        public final boolean mo65356a(int i) {
            return this.f30222B.get(i);
        }

        /* renamed from: a */
        public final SelectionOverride mo65355a(int i, TrackGroupArray trackGroupArray) {
            Map map = this.f30221A.get(i);
            if (map != null) {
                return (SelectionOverride) map.get(trackGroupArray);
            }
            return null;
        }

        /* renamed from: a */
        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> m32442a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                    trackGroupArray.getClass();
                    hashMap.put(trackGroupArray, (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        Parameters(Parcel parcel) {
            super(parcel);
            this.f30223g = parcel.readInt();
            this.f30224h = parcel.readInt();
            this.f30225i = parcel.readInt();
            this.f30226j = parcel.readInt();
            this.f30227k = ih1.m37381a(parcel);
            this.f30228l = ih1.m37381a(parcel);
            this.f30229m = ih1.m37381a(parcel);
            this.f30230n = parcel.readInt();
            this.f30231o = parcel.readInt();
            this.f30232p = ih1.m37381a(parcel);
            this.f30233q = parcel.readInt();
            this.f30234r = parcel.readInt();
            this.f30235s = ih1.m37381a(parcel);
            this.f30236t = ih1.m37381a(parcel);
            this.f30237u = ih1.m37381a(parcel);
            this.f30238v = ih1.m37381a(parcel);
            this.f30239w = ih1.m37381a(parcel);
            this.f30240x = ih1.m37381a(parcel);
            this.f30241y = ih1.m37381a(parcel);
            this.f30242z = parcel.readInt();
            this.f30221A = m32442a(parcel);
            this.f30222B = (SparseBooleanArray) ih1.m37372a(parcel.readSparseBooleanArray());
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new C12313a();

        /* renamed from: b */
        public final int f30243b;

        /* renamed from: c */
        public final int[] f30244c;

        /* renamed from: d */
        public final int f30245d;

        /* renamed from: e */
        public final int f30246e;

        /* renamed from: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$SelectionOverride$a */
        class C12313a implements Parcelable.Creator<SelectionOverride> {
            C12313a() {
            }

            public Object createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            public Object[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        SelectionOverride(Parcel parcel) {
            this.f30243b = parcel.readInt();
            int[] iArr = new int[parcel.readByte()];
            this.f30244c = iArr;
            parcel.readIntArray(iArr);
            this.f30245d = parcel.readInt();
            this.f30246e = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            if (this.f30243b == selectionOverride.f30243b && Arrays.equals(this.f30244c, selectionOverride.f30244c) && this.f30245d == selectionOverride.f30245d && this.f30246e == selectionOverride.f30246e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f30243b * 31) + Arrays.hashCode(this.f30244c)) * 31) + this.f30245d) * 31) + this.f30246e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f30243b);
            parcel.writeInt(this.f30244c.length);
            parcel.writeIntArray(this.f30244c);
            parcel.writeInt(this.f30245d);
            parcel.writeInt(this.f30246e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$a */
    private static final class C12314a {

        /* renamed from: a */
        public final int f30247a;

        /* renamed from: b */
        public final int f30248b;

        /* renamed from: c */
        public final String f30249c;

        public C12314a(int i, int i2, String str) {
            this.f30247a = i;
            this.f30248b = i2;
            this.f30249c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12314a.class != obj.getClass()) {
                return false;
            }
            C12314a aVar = (C12314a) obj;
            if (this.f30247a == aVar.f30247a && this.f30248b == aVar.f30248b && TextUtils.equals(this.f30249c, aVar.f30249c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f30247a * 31) + this.f30248b) * 31;
            String str = this.f30249c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$b */
    protected static final class C12315b implements Comparable<C12315b> {

        /* renamed from: b */
        public final boolean f30250b;

        /* renamed from: c */
        private final String f30251c;

        /* renamed from: d */
        private final Parameters f30252d;

        /* renamed from: e */
        private final boolean f30253e;

        /* renamed from: f */
        private final int f30254f;

        /* renamed from: g */
        private final int f30255g;

        /* renamed from: h */
        private final int f30256h;

        /* renamed from: i */
        private final boolean f30257i;

        /* renamed from: j */
        private final int f30258j;

        /* renamed from: k */
        private final int f30259k;

        /* renamed from: l */
        private final int f30260l;

        public C12315b(Format format, Parameters parameters, int i) {
            this.f30252d = parameters;
            this.f30251c = DefaultTrackSelector.m32434a(format.f29518B);
            int i2 = 0;
            this.f30253e = DefaultTrackSelector.m32436a(i, false);
            this.f30254f = DefaultTrackSelector.m32433a(format, parameters.f30284b, false);
            boolean z = true;
            this.f30257i = (format.f29524d & 1) != 0;
            int i3 = format.f29543w;
            this.f30258j = i3;
            this.f30259k = format.f29544x;
            int i4 = format.f29526f;
            this.f30260l = i4;
            if ((i4 != -1 && i4 > parameters.f30234r) || (i3 != -1 && i3 > parameters.f30233q)) {
                z = false;
            }
            this.f30250b = z;
            String[] b = ih1.m37391b();
            int i5 = Integer.MAX_VALUE;
            int i6 = 0;
            while (true) {
                if (i6 >= b.length) {
                    break;
                }
                int a = DefaultTrackSelector.m32433a(format, b[i6], false);
                if (a > 0) {
                    i5 = i6;
                    i2 = a;
                    break;
                }
                i6++;
            }
            this.f30255g = i5;
            this.f30256h = i2;
        }

        /* renamed from: a */
        public int compareTo(C12315b bVar) {
            int a;
            int b;
            boolean z = this.f30253e;
            int i = 1;
            if (z != bVar.f30253e) {
                return z ? 1 : -1;
            }
            int i2 = this.f30254f;
            int i3 = bVar.f30254f;
            if (i2 != i3) {
                return DefaultTrackSelector.m32432a(i2, i3);
            }
            boolean z2 = this.f30250b;
            if (z2 != bVar.f30250b) {
                if (z2) {
                    return 1;
                }
                return -1;
            } else if (!this.f30252d.f30239w || (b = DefaultTrackSelector.m32440c(this.f30260l, bVar.f30260l)) == 0) {
                boolean z3 = this.f30257i;
                if (z3 == bVar.f30257i) {
                    int i4 = this.f30255g;
                    int i5 = bVar.f30255g;
                    if (i4 != i5) {
                        return -DefaultTrackSelector.m32432a(i4, i5);
                    }
                    int i6 = this.f30256h;
                    int i7 = bVar.f30256h;
                    if (i6 != i7) {
                        return DefaultTrackSelector.m32432a(i6, i7);
                    }
                    if (!this.f30250b || !this.f30253e) {
                        i = -1;
                    }
                    int i8 = this.f30258j;
                    int i9 = bVar.f30258j;
                    if (i8 != i9) {
                        a = DefaultTrackSelector.m32432a(i8, i9);
                    } else {
                        int i10 = this.f30259k;
                        int i11 = bVar.f30259k;
                        if (i10 != i11) {
                            a = DefaultTrackSelector.m32432a(i10, i11);
                        } else if (!ih1.m37382a((Object) this.f30251c, (Object) bVar.f30251c)) {
                            return 0;
                        } else {
                            a = DefaultTrackSelector.m32432a(this.f30260l, bVar.f30260l);
                        }
                    }
                    return i * a;
                } else if (z3) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (b > 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$d */
    protected static final class C12317d implements Comparable<C12317d> {

        /* renamed from: b */
        public final boolean f30276b;

        /* renamed from: c */
        private final boolean f30277c;

        /* renamed from: d */
        private final boolean f30278d;

        /* renamed from: e */
        private final boolean f30279e;

        /* renamed from: f */
        private final int f30280f;

        /* renamed from: g */
        private final int f30281g;

        /* renamed from: h */
        private final int f30282h;

        /* renamed from: i */
        private final boolean f30283i;

        public C12317d(Format format, Parameters parameters, int i, String str) {
            boolean z = false;
            this.f30277c = DefaultTrackSelector.m32436a(i, false);
            int i2 = format.f29524d & (~parameters.f30288f);
            boolean z2 = (i2 & 1) != 0;
            this.f30278d = z2;
            boolean z3 = (i2 & 2) != 0;
            int a = DefaultTrackSelector.m32433a(format, parameters.f30285c, parameters.f30287e);
            this.f30280f = a;
            int bitCount = Integer.bitCount(format.f29525e & parameters.f30286d);
            this.f30281g = bitCount;
            this.f30283i = (format.f29525e & 1088) != 0;
            this.f30279e = (a > 0 && !z3) || (a == 0 && z3);
            int a2 = DefaultTrackSelector.m32433a(format, str, DefaultTrackSelector.m32434a(str) == null);
            this.f30282h = a2;
            if (a > 0 || ((parameters.f30285c == null && bitCount > 0) || z2 || (z3 && a2 > 0))) {
                z = true;
            }
            this.f30276b = z;
        }

        /* renamed from: a */
        public int compareTo(C12317d dVar) {
            boolean z;
            boolean z2 = this.f30277c;
            if (z2 != dVar.f30277c) {
                return z2 ? 1 : -1;
            }
            int i = this.f30280f;
            int i2 = dVar.f30280f;
            if (i != i2) {
                return DefaultTrackSelector.m32432a(i, i2);
            }
            int i3 = this.f30281g;
            int i4 = dVar.f30281g;
            if (i3 != i4) {
                return DefaultTrackSelector.m32432a(i3, i4);
            }
            boolean z3 = this.f30278d;
            if (z3 == dVar.f30278d) {
                boolean z4 = this.f30279e;
                if (z4 == dVar.f30279e) {
                    int i5 = this.f30282h;
                    int i6 = dVar.f30282h;
                    if (i5 != i6) {
                        return DefaultTrackSelector.m32432a(i5, i6);
                    }
                    if (i3 != 0 || (z = this.f30283i) == dVar.f30283i) {
                        return 0;
                    }
                    if (z) {
                        return -1;
                    }
                    return 1;
                } else if (z4) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (z3) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public DefaultTrackSelector(Context context) {
        this(context, (C12330d.C12332b) new C12320a.C12324d());
    }

    /* renamed from: a */
    static int m32432a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: a */
    protected static boolean m32436a(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m32440c(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x021f, code lost:
        if (r4 < 0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0629, code lost:
        if (r8 == 2) goto L_0x062d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0155 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015d A[LOOP:1: B:21:0x0049->B:65:0x015d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0183  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.yandex.mobile.ads.exo.RendererConfiguration[], com.yandex.mobile.ads.exo.trackselection.C12330d[]> mo65354a(com.yandex.mobile.ads.exo.trackselection.C12328c.C12329a r37, int[][][] r38, int[] r39) throws com.yandex.mobile.ads.impl.k40 {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            java.util.concurrent.atomic.AtomicReference<com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$Parameters> r2 = r0.f30220c
            java.lang.Object r2 = r2.get()
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$Parameters r2 = (com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector.Parameters) r2
            int r3 = r37.mo65398a()
            int r4 = r37.mo65398a()
            com.yandex.mobile.ads.exo.trackselection.d$a[] r5 = new com.yandex.mobile.ads.exo.trackselection.C12330d.C12331a[r4]
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0019:
            r10 = 2
            if (r7 >= r4) goto L_0x02b7
            int r14 = r1.mo65399a(r7)
            if (r10 != r14) goto L_0x02a0
            if (r8 != 0) goto L_0x0287
            com.yandex.mobile.ads.exo.source.TrackGroupArray r8 = r1.mo65400b(r7)
            r14 = r38[r7]
            r15 = r39[r7]
            boolean r11 = r2.f30240x
            if (r11 != 0) goto L_0x0174
            boolean r11 = r2.f30239w
            if (r11 != 0) goto L_0x0174
            boolean r11 = r2.f30229m
            if (r11 == 0) goto L_0x003b
            r11 = 24
            goto L_0x003d
        L_0x003b:
            r11 = 16
        L_0x003d:
            boolean r6 = r2.f30228l
            if (r6 == 0) goto L_0x0047
            r6 = r15 & r11
            if (r6 == 0) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            r15 = 0
        L_0x0049:
            int r12 = r8.f30063b
            if (r15 >= r12) goto L_0x0174
            com.yandex.mobile.ads.exo.source.TrackGroup r12 = r8.mo65240a((int) r15)
            r24 = r14[r15]
            int r13 = r2.f30223g
            int r10 = r2.f30224h
            int r0 = r2.f30225i
            r25 = r3
            int r3 = r2.f30226j
            r26 = r4
            int r4 = r2.f30230n
            r27 = r9
            int r9 = r2.f30231o
            boolean r1 = r2.f30232p
            r28 = r5
            int r5 = r12.f30059b
            r29 = r7
            r7 = 2
            if (r5 >= r7) goto L_0x0078
            int[] r0 = f30218d
        L_0x0072:
            r30 = r6
            r33 = r14
            goto L_0x0152
        L_0x0078:
            java.util.List r1 = m32435a(r12, r4, r9, r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r4 = r1.size()
            if (r4 >= r7) goto L_0x0087
            int[] r0 = f30218d
            goto L_0x0072
        L_0x0087:
            if (r6 != 0) goto L_0x00f7
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r30 = r6
            r5 = 0
            r7 = 0
            r9 = 0
        L_0x0093:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x00f2
            java.lang.Object r6 = r1.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.yandex.mobile.ads.exo.Format r6 = r12.mo65232a((int) r6)
            java.lang.String r6 = r6.f29530j
            boolean r16 = r4.add(r6)
            r31 = r4
            r32 = r9
            r33 = r14
            if (r16 == 0) goto L_0x00e9
            r4 = 0
            r9 = 0
        L_0x00b7:
            int r14 = r1.size()
            if (r4 >= r14) goto L_0x00e4
            java.lang.Object r14 = r1.get(r4)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.yandex.mobile.ads.exo.Format r16 = r12.mo65232a((int) r14)
            r18 = r24[r14]
            r17 = r6
            r19 = r11
            r20 = r13
            r21 = r10
            r22 = r0
            r23 = r3
            boolean r14 = m32438a(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r14 == 0) goto L_0x00e1
            int r9 = r9 + 1
        L_0x00e1:
            int r4 = r4 + 1
            goto L_0x00b7
        L_0x00e4:
            if (r9 <= r7) goto L_0x00e9
            r7 = r9
            r9 = r6
            goto L_0x00eb
        L_0x00e9:
            r9 = r32
        L_0x00eb:
            int r5 = r5 + 1
            r4 = r31
            r14 = r33
            goto L_0x0093
        L_0x00f2:
            r32 = r9
            r33 = r14
            goto L_0x00fd
        L_0x00f7:
            r30 = r6
            r33 = r14
            r32 = 0
        L_0x00fd:
            int r4 = r1.size()
            r5 = 1
            int r4 = r4 - r5
        L_0x0103:
            if (r4 < 0) goto L_0x012d
            java.lang.Object r5 = r1.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.yandex.mobile.ads.exo.Format r16 = r12.mo65232a((int) r5)
            r18 = r24[r5]
            r17 = r32
            r19 = r11
            r20 = r13
            r21 = r10
            r22 = r0
            r23 = r3
            boolean r5 = m32438a(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r5 != 0) goto L_0x012a
            r1.remove(r4)
        L_0x012a:
            int r4 = r4 + -1
            goto L_0x0103
        L_0x012d:
            int r0 = r1.size()
            r3 = 2
            if (r0 >= r3) goto L_0x0137
            int[] r0 = f30218d
            goto L_0x0152
        L_0x0137:
            int r0 = com.yandex.mobile.ads.impl.ih1.f34858a
            int r0 = r1.size()
            int[] r3 = new int[r0]
            r4 = 0
        L_0x0140:
            if (r4 >= r0) goto L_0x0151
            java.lang.Object r5 = r1.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x0140
        L_0x0151:
            r0 = r3
        L_0x0152:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x015d
            com.yandex.mobile.ads.exo.trackselection.d$a r1 = new com.yandex.mobile.ads.exo.trackselection.d$a
            r3 = 0
            r4 = 0
            r1.<init>(r12, r0, r4, r3)
            goto L_0x0181
        L_0x015d:
            int r15 = r15 + 1
            r0 = r36
            r1 = r37
            r3 = r25
            r4 = r26
            r9 = r27
            r5 = r28
            r7 = r29
            r6 = r30
            r14 = r33
            r10 = 2
            goto L_0x0049
        L_0x0174:
            r25 = r3
            r26 = r4
            r28 = r5
            r29 = r7
            r27 = r9
            r33 = r14
            r1 = 0
        L_0x0181:
            if (r1 != 0) goto L_0x0274
            r0 = -1
            r1 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0189:
            int r7 = r8.f30063b
            if (r3 >= r7) goto L_0x0262
            com.yandex.mobile.ads.exo.source.TrackGroup r7 = r8.mo65240a((int) r3)
            int r9 = r2.f30230n
            int r10 = r2.f30231o
            boolean r11 = r2.f30232p
            java.util.List r9 = m32435a(r7, r9, r10, r11)
            r10 = r33[r3]
            r11 = 0
        L_0x019e:
            int r12 = r7.f30059b
            if (r11 >= r12) goto L_0x025a
            com.yandex.mobile.ads.exo.Format r12 = r7.mo65232a((int) r11)
            int r13 = r12.f29525e
            r13 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01ae
            goto L_0x024e
        L_0x01ae:
            r13 = r10[r11]
            boolean r14 = r2.f30241y
            boolean r13 = m32436a((int) r13, (boolean) r14)
            if (r13 == 0) goto L_0x024e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r14 = r9
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r13 = r14.contains(r13)
            if (r13 == 0) goto L_0x01f0
            int r13 = r12.f29535o
            r14 = -1
            if (r13 == r14) goto L_0x01ce
            int r15 = r2.f30223g
            if (r13 > r15) goto L_0x01f0
        L_0x01ce:
            int r13 = r12.f29536p
            if (r13 == r14) goto L_0x01d6
            int r14 = r2.f30224h
            if (r13 > r14) goto L_0x01f0
        L_0x01d6:
            float r13 = r12.f29537q
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 == 0) goto L_0x01e5
            int r14 = r2.f30225i
            float r14 = (float) r14
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x01f0
        L_0x01e5:
            int r13 = r12.f29526f
            r14 = -1
            if (r13 == r14) goto L_0x01ee
            int r14 = r2.f30226j
            if (r13 > r14) goto L_0x01f0
        L_0x01ee:
            r13 = 1
            goto L_0x01f1
        L_0x01f0:
            r13 = 0
        L_0x01f1:
            if (r13 != 0) goto L_0x01f8
            boolean r14 = r2.f30227k
            if (r14 != 0) goto L_0x01f8
            goto L_0x024e
        L_0x01f8:
            if (r13 == 0) goto L_0x01fc
            r14 = 2
            goto L_0x01fd
        L_0x01fc:
            r14 = 1
        L_0x01fd:
            r15 = r10[r11]
            r16 = r4
            r4 = 0
            boolean r15 = m32436a((int) r15, (boolean) r4)
            if (r15 == 0) goto L_0x020a
            int r14 = r14 + 1000
        L_0x020a:
            if (r14 <= r5) goto L_0x020e
            r4 = 1
            goto L_0x020f
        L_0x020e:
            r4 = 0
        L_0x020f:
            if (r14 != r5) goto L_0x0240
            int r4 = r12.f29526f
            int r4 = m32440c(r4, r0)
            r17 = r5
            boolean r5 = r2.f30239w
            if (r5 == 0) goto L_0x0222
            if (r4 == 0) goto L_0x0222
            if (r4 >= 0) goto L_0x023e
            goto L_0x023c
        L_0x0222:
            int r4 = r12.mo64774c()
            if (r4 == r1) goto L_0x022d
            int r4 = m32440c(r4, r1)
            goto L_0x0233
        L_0x022d:
            int r4 = r12.f29526f
            int r4 = m32440c(r4, r0)
        L_0x0233:
            if (r15 == 0) goto L_0x023a
            if (r13 == 0) goto L_0x023a
            if (r4 <= 0) goto L_0x023e
            goto L_0x023c
        L_0x023a:
            if (r4 >= 0) goto L_0x023e
        L_0x023c:
            r4 = 1
            goto L_0x0242
        L_0x023e:
            r4 = 0
            goto L_0x0242
        L_0x0240:
            r17 = r5
        L_0x0242:
            if (r4 == 0) goto L_0x0252
            int r0 = r12.f29526f
            int r1 = r12.mo64774c()
            r6 = r7
            r4 = r11
            r5 = r14
            goto L_0x0256
        L_0x024e:
            r16 = r4
            r17 = r5
        L_0x0252:
            r4 = r16
            r5 = r17
        L_0x0256:
            int r11 = r11 + 1
            goto L_0x019e
        L_0x025a:
            r16 = r4
            r17 = r5
            int r3 = r3 + 1
            goto L_0x0189
        L_0x0262:
            if (r6 != 0) goto L_0x0266
            r12 = 0
            goto L_0x0275
        L_0x0266:
            com.yandex.mobile.ads.exo.trackselection.d$a r0 = new com.yandex.mobile.ads.exo.trackselection.d$a
            r1 = 1
            int[] r3 = new int[r1]
            r1 = 0
            r3[r1] = r4
            r4 = 0
            r0.<init>(r6, r3, r1, r4)
            r12 = r0
            goto L_0x0275
        L_0x0274:
            r12 = r1
        L_0x0275:
            r28[r29] = r12
            r0 = r28[r29]
            if (r0 == 0) goto L_0x0281
            r0 = r37
            r6 = r29
            r8 = 1
            goto L_0x0292
        L_0x0281:
            r0 = r37
            r6 = r29
            r8 = 0
            goto L_0x0292
        L_0x0287:
            r25 = r3
            r26 = r4
            r28 = r5
            r27 = r9
            r0 = r37
            r6 = r7
        L_0x0292:
            com.yandex.mobile.ads.exo.source.TrackGroupArray r1 = r0.mo65400b(r6)
            int r1 = r1.f30063b
            if (r1 <= 0) goto L_0x029c
            r13 = 1
            goto L_0x029d
        L_0x029c:
            r13 = 0
        L_0x029d:
            r9 = r27 | r13
            goto L_0x02aa
        L_0x02a0:
            r0 = r1
            r25 = r3
            r26 = r4
            r28 = r5
            r6 = r7
            r27 = r9
        L_0x02aa:
            int r7 = r6 + 1
            r1 = r0
            r3 = r25
            r4 = r26
            r5 = r28
            r0 = r36
            goto L_0x0019
        L_0x02b7:
            r0 = r1
            r25 = r3
            r28 = r5
            r27 = r9
            r6 = r4
            r1 = -1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x02c3:
            if (r4 >= r6) goto L_0x0455
            int r7 = r0.mo65399a(r4)
            r8 = 1
            if (r8 != r7) goto L_0x0441
            r7 = r27 ^ 1
            com.yandex.mobile.ads.exo.source.TrackGroupArray r8 = r0.mo65400b(r4)
            r9 = r38[r4]
            r10 = r39[r4]
            r10 = -1
            r11 = -1
            r12 = 0
            r13 = 0
        L_0x02da:
            int r14 = r8.f30063b
            if (r12 >= r14) goto L_0x032f
            com.yandex.mobile.ads.exo.source.TrackGroup r14 = r8.mo65240a((int) r12)
            r15 = r9[r12]
            r16 = r10
            r17 = r11
            r10 = 0
        L_0x02e9:
            int r11 = r14.f30059b
            if (r10 >= r11) goto L_0x0326
            r11 = r15[r10]
            r18 = r3
            boolean r3 = r2.f30241y
            boolean r3 = m32436a((int) r11, (boolean) r3)
            if (r3 == 0) goto L_0x031d
            com.yandex.mobile.ads.exo.Format r3 = r14.mo65232a((int) r10)
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$b r11 = new com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$b
            r19 = r14
            r14 = r15[r10]
            r11.<init>(r3, r2, r14)
            boolean r3 = r11.f30250b
            if (r3 != 0) goto L_0x030f
            boolean r3 = r2.f30235s
            if (r3 != 0) goto L_0x030f
            goto L_0x031f
        L_0x030f:
            if (r13 == 0) goto L_0x0317
            int r3 = r11.compareTo(r13)
            if (r3 <= 0) goto L_0x031f
        L_0x0317:
            r17 = r10
            r13 = r11
            r16 = r12
            goto L_0x031f
        L_0x031d:
            r19 = r14
        L_0x031f:
            int r10 = r10 + 1
            r3 = r18
            r14 = r19
            goto L_0x02e9
        L_0x0326:
            r18 = r3
            int r12 = r12 + 1
            r10 = r16
            r11 = r17
            goto L_0x02da
        L_0x032f:
            r18 = r3
            r3 = -1
            if (r10 != r3) goto L_0x033f
            r20 = r1
            r16 = r2
            r19 = r4
            r26 = r6
            r0 = 0
            goto L_0x040c
        L_0x033f:
            com.yandex.mobile.ads.exo.source.TrackGroup r3 = r8.mo65240a((int) r10)
            boolean r8 = r2.f30240x
            if (r8 != 0) goto L_0x03ef
            boolean r8 = r2.f30239w
            if (r8 != 0) goto L_0x03ef
            if (r7 == 0) goto L_0x03ef
            r7 = r9[r10]
            int r8 = r2.f30234r
            boolean r9 = r2.f30236t
            boolean r10 = r2.f30237u
            boolean r12 = r2.f30238v
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r16 = r2
            r2 = 0
            r15 = 0
            r17 = 0
        L_0x0362:
            int r0 = r3.f30059b
            if (r15 >= r0) goto L_0x03b0
            com.yandex.mobile.ads.exo.Format r0 = r3.mo65232a((int) r15)
            r26 = r6
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$a r6 = new com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$a
            r19 = r4
            int r4 = r0.f29543w
            r20 = r1
            int r1 = r0.f29544x
            java.lang.String r0 = r0.f29530j
            r6.<init>(r4, r1, r0)
            boolean r0 = r14.add(r6)
            if (r0 == 0) goto L_0x03a7
            r0 = 0
            r1 = 0
        L_0x0383:
            int r4 = r3.f30059b
            if (r0 >= r4) goto L_0x03a2
            com.yandex.mobile.ads.exo.Format r29 = r3.mo65232a((int) r0)
            r30 = r7[r0]
            r31 = r6
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r12
            boolean r4 = m32437a(r29, r30, r31, r32, r33, r34, r35)
            if (r4 == 0) goto L_0x039f
            int r1 = r1 + 1
        L_0x039f:
            int r0 = r0 + 1
            goto L_0x0383
        L_0x03a2:
            if (r1 <= r2) goto L_0x03a7
            r2 = r1
            r17 = r6
        L_0x03a7:
            int r15 = r15 + 1
            r4 = r19
            r1 = r20
            r6 = r26
            goto L_0x0362
        L_0x03b0:
            r20 = r1
            r19 = r4
            r26 = r6
            r0 = 1
            if (r2 <= r0) goto L_0x03e2
            r17.getClass()
            int[] r0 = new int[r2]
            r1 = 0
            r2 = 0
        L_0x03c0:
            int r4 = r3.f30059b
            if (r1 >= r4) goto L_0x03e4
            com.yandex.mobile.ads.exo.Format r29 = r3.mo65232a((int) r1)
            r30 = r7[r1]
            r31 = r17
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r12
            boolean r4 = m32437a(r29, r30, r31, r32, r33, r34, r35)
            if (r4 == 0) goto L_0x03df
            int r4 = r2 + 1
            r0[r2] = r1
            r2 = r4
        L_0x03df:
            int r1 = r1 + 1
            goto L_0x03c0
        L_0x03e2:
            int[] r0 = f30218d
        L_0x03e4:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x03f7
            com.yandex.mobile.ads.exo.trackselection.d$a r1 = new com.yandex.mobile.ads.exo.trackselection.d$a
            r2 = 0
            r4 = 0
            r1.<init>(r3, r0, r4, r2)
            goto L_0x03f9
        L_0x03ef:
            r20 = r1
            r16 = r2
            r19 = r4
            r26 = r6
        L_0x03f7:
            r4 = 0
            r1 = 0
        L_0x03f9:
            if (r1 != 0) goto L_0x0405
            com.yandex.mobile.ads.exo.trackselection.d$a r1 = new com.yandex.mobile.ads.exo.trackselection.d$a
            r0 = 1
            int[] r2 = new int[r0]
            r2[r4] = r11
            r1.<init>(r3, r2)
        L_0x0405:
            r13.getClass()
            android.util.Pair r0 = android.util.Pair.create(r1, r13)
        L_0x040c:
            if (r0 == 0) goto L_0x043e
            if (r5 == 0) goto L_0x041a
            java.lang.Object r1 = r0.second
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$b r1 = (com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector.C12315b) r1
            int r1 = r1.compareTo(r5)
            if (r1 <= 0) goto L_0x043e
        L_0x041a:
            r1 = r20
            r2 = -1
            if (r1 == r2) goto L_0x0422
            r2 = 0
            r28[r1] = r2
        L_0x0422:
            java.lang.Object r1 = r0.first
            com.yandex.mobile.ads.exo.trackselection.d$a r1 = (com.yandex.mobile.ads.exo.trackselection.C12330d.C12331a) r1
            r28[r19] = r1
            com.yandex.mobile.ads.exo.source.TrackGroup r2 = r1.f30303a
            int[] r1 = r1.f30304b
            r3 = 0
            r1 = r1[r3]
            com.yandex.mobile.ads.exo.Format r1 = r2.mo65232a((int) r1)
            java.lang.String r1 = r1.f29518B
            java.lang.Object r0 = r0.second
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$b r0 = (com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector.C12315b) r0
            r5 = r0
            r3 = r1
            r1 = r19
            goto L_0x044b
        L_0x043e:
            r1 = r20
            goto L_0x0449
        L_0x0441:
            r16 = r2
            r18 = r3
            r19 = r4
            r26 = r6
        L_0x0449:
            r3 = r18
        L_0x044b:
            int r4 = r19 + 1
            r0 = r37
            r2 = r16
            r6 = r26
            goto L_0x02c3
        L_0x0455:
            r16 = r2
            r18 = r3
            r0 = r6
            r3 = 0
            r4 = 0
            r14 = -1
        L_0x045d:
            if (r4 >= r0) goto L_0x059a
            r1 = r37
            int r2 = r1.mo65399a(r4)
            r5 = 1
            if (r2 == r5) goto L_0x0589
            r5 = 2
            if (r2 == r5) goto L_0x0589
            r5 = 3
            if (r2 == r5) goto L_0x04e6
            com.yandex.mobile.ads.exo.source.TrackGroupArray r2 = r1.mo65400b(r4)
            r5 = r38[r4]
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0478:
            int r10 = r2.f30063b
            if (r6 >= r10) goto L_0x04ce
            com.yandex.mobile.ads.exo.source.TrackGroup r10 = r2.mo65240a((int) r6)
            r11 = r5[r6]
            r12 = 0
        L_0x0483:
            int r13 = r10.f30059b
            if (r12 >= r13) goto L_0x04c5
            r13 = r11[r12]
            r26 = r0
            r15 = r16
            boolean r0 = r15.f30241y
            boolean r0 = m32436a((int) r13, (boolean) r0)
            if (r0 == 0) goto L_0x04ba
            com.yandex.mobile.ads.exo.Format r0 = r10.mo65232a((int) r12)
            int r0 = r0.f29524d
            r13 = 1
            r0 = r0 & r13
            if (r0 == 0) goto L_0x04a1
            r0 = 1
            goto L_0x04a2
        L_0x04a1:
            r0 = 0
        L_0x04a2:
            if (r0 == 0) goto L_0x04a6
            r0 = 2
            goto L_0x04a7
        L_0x04a6:
            r0 = 1
        L_0x04a7:
            r13 = r11[r12]
            r39 = r2
            r2 = 0
            boolean r13 = m32436a((int) r13, (boolean) r2)
            if (r13 == 0) goto L_0x04b4
            int r0 = r0 + 1000
        L_0x04b4:
            if (r0 <= r8) goto L_0x04bc
            r8 = r0
            r9 = r10
            r7 = r12
            goto L_0x04bc
        L_0x04ba:
            r39 = r2
        L_0x04bc:
            int r12 = r12 + 1
            r2 = r39
            r16 = r15
            r0 = r26
            goto L_0x0483
        L_0x04c5:
            r26 = r0
            r39 = r2
            r15 = r16
            int r6 = r6 + 1
            goto L_0x0478
        L_0x04ce:
            r26 = r0
            r15 = r16
            if (r9 != 0) goto L_0x04d6
            r0 = 0
            goto L_0x04e2
        L_0x04d6:
            com.yandex.mobile.ads.exo.trackselection.d$a r0 = new com.yandex.mobile.ads.exo.trackselection.d$a
            r2 = 1
            int[] r5 = new int[r2]
            r2 = 0
            r5[r2] = r7
            r6 = 0
            r0.<init>(r9, r5, r2, r6)
        L_0x04e2:
            r28[r4] = r0
            goto L_0x058d
        L_0x04e6:
            r26 = r0
            r15 = r16
            com.yandex.mobile.ads.exo.source.TrackGroupArray r0 = r1.mo65400b(r4)
            r2 = r38[r4]
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 0
        L_0x04f4:
            int r9 = r0.f30063b
            if (r5 >= r9) goto L_0x054e
            com.yandex.mobile.ads.exo.source.TrackGroup r9 = r0.mo65240a((int) r5)
            r10 = r2[r5]
            r11 = r8
            r8 = r7
            r7 = r6
            r6 = 0
        L_0x0502:
            int r12 = r9.f30059b
            if (r6 >= r12) goto L_0x0540
            r12 = r10[r6]
            boolean r13 = r15.f30241y
            boolean r12 = m32436a((int) r12, (boolean) r13)
            if (r12 == 0) goto L_0x0531
            com.yandex.mobile.ads.exo.Format r12 = r9.mo65232a((int) r6)
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$d r13 = new com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$d
            r39 = r0
            r0 = r10[r6]
            r16 = r2
            r2 = r18
            r13.<init>(r12, r15, r0, r2)
            boolean r0 = r13.f30276b
            if (r0 == 0) goto L_0x0537
            if (r11 == 0) goto L_0x052d
            int r0 = r13.compareTo(r11)
            if (r0 <= 0) goto L_0x0537
        L_0x052d:
            r7 = r6
            r8 = r9
            r11 = r13
            goto L_0x0537
        L_0x0531:
            r39 = r0
            r16 = r2
            r2 = r18
        L_0x0537:
            int r6 = r6 + 1
            r0 = r39
            r18 = r2
            r2 = r16
            goto L_0x0502
        L_0x0540:
            r39 = r0
            r16 = r2
            r2 = r18
            int r5 = r5 + 1
            r6 = r7
            r7 = r8
            r8 = r11
            r2 = r16
            goto L_0x04f4
        L_0x054e:
            r2 = r18
            if (r7 != 0) goto L_0x0555
            r0 = 0
            r5 = 0
            goto L_0x0568
        L_0x0555:
            com.yandex.mobile.ads.exo.trackselection.d$a r0 = new com.yandex.mobile.ads.exo.trackselection.d$a
            r5 = 1
            int[] r9 = new int[r5]
            r5 = 0
            r9[r5] = r6
            r6 = 0
            r0.<init>(r7, r9, r5, r6)
            r8.getClass()
            android.util.Pair r0 = android.util.Pair.create(r0, r8)
        L_0x0568:
            if (r0 == 0) goto L_0x0590
            if (r3 == 0) goto L_0x0576
            java.lang.Object r6 = r0.second
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$d r6 = (com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector.C12317d) r6
            int r6 = r6.compareTo(r3)
            if (r6 <= 0) goto L_0x0590
        L_0x0576:
            r3 = -1
            if (r14 == r3) goto L_0x057c
            r3 = 0
            r28[r14] = r3
        L_0x057c:
            java.lang.Object r3 = r0.first
            com.yandex.mobile.ads.exo.trackselection.d$a r3 = (com.yandex.mobile.ads.exo.trackselection.C12330d.C12331a) r3
            r28[r4] = r3
            java.lang.Object r0 = r0.second
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$d r0 = (com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector.C12317d) r0
            r3 = r0
            r14 = r4
            goto L_0x0590
        L_0x0589:
            r26 = r0
            r15 = r16
        L_0x058d:
            r2 = r18
            r5 = 0
        L_0x0590:
            int r4 = r4 + 1
            r18 = r2
            r16 = r15
            r0 = r26
            goto L_0x045d
        L_0x059a:
            r1 = r37
            r15 = r16
            r5 = 0
            r0 = r25
            r4 = 0
        L_0x05a2:
            if (r4 >= r0) goto L_0x05db
            boolean r2 = r15.mo65356a((int) r4)
            if (r2 == 0) goto L_0x05ae
            r3 = 0
            r28[r4] = r3
            goto L_0x05d8
        L_0x05ae:
            r3 = 0
            com.yandex.mobile.ads.exo.source.TrackGroupArray r2 = r1.mo65400b(r4)
            boolean r6 = r15.mo65357b(r4, r2)
            if (r6 == 0) goto L_0x05d8
            com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$SelectionOverride r6 = r15.mo65355a(r4, r2)
            if (r6 != 0) goto L_0x05c1
            r7 = r3
            goto L_0x05d6
        L_0x05c1:
            com.yandex.mobile.ads.exo.trackselection.d$a r7 = new com.yandex.mobile.ads.exo.trackselection.d$a
            int r8 = r6.f30243b
            com.yandex.mobile.ads.exo.source.TrackGroup r2 = r2.mo65240a((int) r8)
            int[] r8 = r6.f30244c
            int r9 = r6.f30245d
            int r6 = r6.f30246e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r2, r8, r9, r6)
        L_0x05d6:
            r28[r4] = r7
        L_0x05d8:
            int r4 = r4 + 1
            goto L_0x05a2
        L_0x05db:
            r2 = r36
            r3 = 0
            com.yandex.mobile.ads.exo.trackselection.d$b r4 = r2.f30219b
            com.yandex.mobile.ads.impl.bb r6 = r36.mo65405a()
            com.yandex.mobile.ads.exo.trackselection.a$d r4 = (com.yandex.mobile.ads.exo.trackselection.C12320a.C12324d) r4
            r7 = r28
            com.yandex.mobile.ads.exo.trackselection.d[] r4 = r4.mo65385a(r7, r6)
            com.yandex.mobile.ads.impl.u31[] r6 = new com.yandex.mobile.ads.impl.u31[r0]
            r7 = 0
        L_0x05ef:
            if (r7 >= r0) goto L_0x0610
            boolean r8 = r15.mo65356a((int) r7)
            if (r8 != 0) goto L_0x0604
            int r8 = r1.mo65399a(r7)
            r9 = 6
            if (r8 == r9) goto L_0x0602
            r8 = r4[r7]
            if (r8 == 0) goto L_0x0604
        L_0x0602:
            r8 = 1
            goto L_0x0605
        L_0x0604:
            r8 = 0
        L_0x0605:
            if (r8 == 0) goto L_0x060a
            com.yandex.mobile.ads.impl.u31 r8 = com.yandex.mobile.ads.impl.u31.f40561b
            goto L_0x060b
        L_0x060a:
            r8 = r3
        L_0x060b:
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x05ef
        L_0x0610:
            int r0 = r15.f30242z
            if (r0 != 0) goto L_0x0616
            goto L_0x0685
        L_0x0616:
            r3 = 0
            r7 = -1
            r14 = -1
        L_0x0619:
            int r8 = r37.mo65398a()
            if (r3 >= r8) goto L_0x0670
            int r8 = r1.mo65399a(r3)
            r9 = r4[r3]
            r10 = 1
            if (r8 == r10) goto L_0x062c
            r10 = 2
            if (r8 != r10) goto L_0x066a
            goto L_0x062d
        L_0x062c:
            r10 = 2
        L_0x062d:
            if (r9 == 0) goto L_0x066a
            r11 = r38[r3]
            com.yandex.mobile.ads.exo.source.TrackGroupArray r12 = r1.mo65400b(r3)
            com.yandex.mobile.ads.exo.source.TrackGroup r13 = r9.mo65387a()
            int r12 = r12.mo65239a((com.yandex.mobile.ads.exo.source.TrackGroup) r13)
            r13 = 0
        L_0x063e:
            int r15 = r9.mo65390d()
            if (r13 >= r15) goto L_0x0657
            r15 = r11[r12]
            int r16 = r9.mo65388b(r13)
            r15 = r15[r16]
            r5 = 32
            r15 = r15 & r5
            if (r15 == r5) goto L_0x0653
            r5 = 0
            goto L_0x0658
        L_0x0653:
            int r13 = r13 + 1
            r5 = 0
            goto L_0x063e
        L_0x0657:
            r5 = 1
        L_0x0658:
            if (r5 == 0) goto L_0x066a
            r5 = 1
            if (r8 != r5) goto L_0x0663
            r8 = -1
            if (r7 == r8) goto L_0x0661
            goto L_0x0666
        L_0x0661:
            r7 = r3
            goto L_0x066c
        L_0x0663:
            r8 = -1
            if (r14 == r8) goto L_0x0668
        L_0x0666:
            r1 = 0
            goto L_0x0673
        L_0x0668:
            r14 = r3
            goto L_0x066c
        L_0x066a:
            r5 = 1
            r8 = -1
        L_0x066c:
            int r3 = r3 + 1
            r5 = 0
            goto L_0x0619
        L_0x0670:
            r5 = 1
            r8 = -1
            r1 = 1
        L_0x0673:
            if (r7 == r8) goto L_0x0678
            if (r14 == r8) goto L_0x0678
            goto L_0x0679
        L_0x0678:
            r5 = 0
        L_0x0679:
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0685
            com.yandex.mobile.ads.impl.u31 r1 = new com.yandex.mobile.ads.impl.u31
            r1.<init>(r0)
            r6[r7] = r1
            r6[r14] = r1
        L_0x0685:
            android.util.Pair r0 = android.util.Pair.create(r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector.mo65354a(com.yandex.mobile.ads.exo.trackselection.c$a, int[][][], int[]):android.util.Pair");
    }

    public DefaultTrackSelector(Context context, C12330d.C12332b bVar) {
        this(Parameters.m32443a(context), bVar);
    }

    public DefaultTrackSelector(Parameters parameters, C12330d.C12332b bVar) {
        this.f30219b = bVar;
        this.f30220c = new AtomicReference<>(parameters);
    }

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector$c */
    public static final class C12316c extends TrackSelectionParameters.C12319b {

        /* renamed from: c */
        private int f30261c;

        /* renamed from: d */
        private int f30262d;

        /* renamed from: e */
        private int f30263e;

        /* renamed from: f */
        private int f30264f;

        /* renamed from: g */
        private boolean f30265g;

        /* renamed from: h */
        private boolean f30266h;

        /* renamed from: i */
        private int f30267i;

        /* renamed from: j */
        private int f30268j;

        /* renamed from: k */
        private boolean f30269k;

        /* renamed from: l */
        private int f30270l;

        /* renamed from: m */
        private int f30271m;

        /* renamed from: n */
        private boolean f30272n;

        /* renamed from: o */
        private boolean f30273o;

        /* renamed from: p */
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> f30274p = new SparseArray<>();

        /* renamed from: q */
        private final SparseBooleanArray f30275q = new SparseBooleanArray();

        @Deprecated
        public C12316c() {
            m32448b();
        }

        /* renamed from: b */
        private void m32448b() {
            this.f30261c = Integer.MAX_VALUE;
            this.f30262d = Integer.MAX_VALUE;
            this.f30263e = Integer.MAX_VALUE;
            this.f30264f = Integer.MAX_VALUE;
            this.f30265g = true;
            this.f30266h = true;
            this.f30267i = Integer.MAX_VALUE;
            this.f30268j = Integer.MAX_VALUE;
            this.f30269k = true;
            this.f30270l = Integer.MAX_VALUE;
            this.f30271m = Integer.MAX_VALUE;
            this.f30272n = true;
            this.f30273o = true;
        }

        /* renamed from: a */
        public C12316c mo65375a(Context context, boolean z) {
            Point b = ih1.m37389b(context);
            int i = b.x;
            int i2 = b.y;
            this.f30267i = i;
            this.f30268j = i2;
            this.f30269k = z;
            return this;
        }

        public C12316c(Context context) {
            super(context);
            m32448b();
            mo65375a(context, true);
        }

        /* renamed from: a */
        public TrackSelectionParameters.C12319b mo65376a(Context context) {
            super.mo65376a(context);
            return this;
        }

        /* renamed from: a */
        public Parameters mo65374a() {
            return new Parameters(this.f30261c, this.f30262d, this.f30263e, this.f30264f, this.f30265g, false, this.f30266h, this.f30267i, this.f30268j, this.f30269k, (String) null, this.f30270l, this.f30271m, this.f30272n, false, false, false, this.f30289a, this.f30290b, false, 0, false, false, this.f30273o, 0, this.f30274p, this.f30275q);
        }
    }

    /* renamed from: a */
    private static boolean m32438a(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if ((format.f29525e & 16384) != 0 || !m32436a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !ih1.m37382a((Object) format.f29530j, (Object) str)) {
            return false;
        }
        int i7 = format.f29535o;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = format.f29536p;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f = format.f29537q;
        if (f != -1.0f && f > ((float) i5)) {
            return false;
        }
        int i9 = format.f29526f;
        if (i9 == -1 || i9 <= i6) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m32437a(Format format, int i, C12314a aVar, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        String str;
        int i4;
        if (!m32436a(i, false)) {
            return false;
        }
        int i5 = format.f29526f;
        if (i5 != -1 && i5 > i2) {
            return false;
        }
        if (!z3 && ((i4 = format.f29543w) == -1 || i4 != aVar.f30247a)) {
            return false;
        }
        if (!z && ((str = format.f29530j) == null || !TextUtils.equals(str, aVar.f30249c))) {
            return false;
        }
        if (z2 || ((i3 = format.f29544x) != -1 && i3 == aVar.f30248b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected static String m32434a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    protected static int m32433a(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f29518B)) {
            return 4;
        }
        String a = m32434a(str);
        String a2 = m32434a(format.f29518B);
        if (a2 == null || a == null) {
            if (!z || a2 != null) {
                return 0;
            }
            return 1;
        } else if (a2.startsWith(a) || a.startsWith(a2)) {
            return 3;
        } else {
            int i = ih1.f34858a;
            if (a2.split("-", 2)[0].equals(a.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.Integer> m32435a(com.yandex.mobile.ads.exo.source.TrackGroup r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f30059b
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.f30059b
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00a6
            if (r14 != r2) goto L_0x0020
            goto L_0x00a6
        L_0x0020:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0024:
            int r5 = r12.f30059b
            r6 = 1
            if (r3 >= r5) goto L_0x0080
            com.yandex.mobile.ads.exo.Format r5 = r12.mo65232a((int) r3)
            int r7 = r5.f29535o
            if (r7 <= 0) goto L_0x007d
            int r8 = r5.f29536p
            if (r8 <= 0) goto L_0x007d
            if (r15 == 0) goto L_0x0045
            if (r7 <= r8) goto L_0x003b
            r9 = 1
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r13 <= r14) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r9 == r6) goto L_0x0045
            r6 = r13
            r9 = r14
            goto L_0x0047
        L_0x0045:
            r9 = r13
            r6 = r14
        L_0x0047:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L_0x0057
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.yandex.mobile.ads.impl.ih1.m37366a((int) r11, (int) r7)
            r6.<init>(r9, r7)
            goto L_0x0061
        L_0x0057:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.yandex.mobile.ads.impl.ih1.m37366a((int) r10, (int) r8)
            r7.<init>(r8, r6)
            r6 = r7
        L_0x0061:
            int r7 = r5.f29535o
            int r5 = r5.f29536p
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L_0x007d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x007d
            if (r8 >= r4) goto L_0x007d
            r4 = r8
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0080:
            if (r4 == r2) goto L_0x00a6
            int r13 = r0.size()
            int r13 = r13 - r6
        L_0x0087:
            if (r13 < 0) goto L_0x00a6
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.yandex.mobile.ads.exo.Format r14 = r12.mo65232a((int) r14)
            int r14 = r14.mo64774c()
            r15 = -1
            if (r14 == r15) goto L_0x00a0
            if (r14 <= r4) goto L_0x00a3
        L_0x00a0:
            r0.remove(r13)
        L_0x00a3:
            int r13 = r13 + -1
            goto L_0x0087
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector.m32435a(com.yandex.mobile.ads.exo.source.TrackGroup, int, int, boolean):java.util.List");
    }
}
