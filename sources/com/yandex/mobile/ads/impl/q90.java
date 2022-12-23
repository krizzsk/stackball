package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

public final class q90 implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: c */
    public static final C14367b f39028c = new C14367b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String[] f39029b;

    private q90(String[] strArr) {
        this.f39029b = strArr;
    }

    public /* synthetic */ q90(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    /* renamed from: a */
    public final String mo69510a(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        String[] strArr = this.f39029b;
        int length = strArr.length - 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement <= length) {
            while (true) {
                int i = length - 2;
                if (StringsKt.equals(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == progressionLastElement) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo69511b(int i) {
        return this.f39029b[(i * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof q90) && Arrays.equals(this.f39029b, ((q90) obj).f39029b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f39029b);
    }

    public Iterator<Pair<String, String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.m45515to(mo69509a(i), mo69511b(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f39029b.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String a = mo69509a(i);
                String b = mo69511b(i);
                sb.append(a);
                sb.append(": ");
                if (jh1.m37839c(a)) {
                    b = "██";
                }
                sb.append(b);
                sb.append("\n");
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: com.yandex.mobile.ads.impl.q90$b */
    public static final class C14367b {
        private C14367b() {
        }

        public /* synthetic */ C14367b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final q90 mo69523a(String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "namesAndValues");
            int i = 0;
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length - 1;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (strArr2[i2] != null) {
                            String str = strArr2[i2];
                            if (str != null) {
                                strArr2[i2] = StringsKt.trim((CharSequence) str).toString();
                                if (i3 > length) {
                                    break;
                                }
                                i2 = i3;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                }
                int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr2.length - 1, 2);
                if (progressionLastElement >= 0) {
                    while (true) {
                        int i4 = i + 2;
                        String str2 = strArr2[i];
                        String str3 = strArr2[i + 1];
                        m41125a(str2);
                        m41126a(str3, str2);
                        if (i == progressionLastElement) {
                            break;
                        }
                        i = i4;
                    }
                }
                return new q90(strArr2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        @JvmStatic
        /* renamed from: a */
        public final q90 mo69522a(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (str != null) {
                    String obj = StringsKt.trim((CharSequence) str).toString();
                    if (str2 != null) {
                        String obj2 = StringsKt.trim((CharSequence) str2).toString();
                        m41125a(obj);
                        m41126a(obj2, obj);
                        strArr[i] = obj;
                        strArr[i + 1] = obj2;
                        i += 2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return new q90(strArr, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m41125a(String str) {
            if (str.length() > 0) {
                int length = str.length() - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        char charAt = str.charAt(i);
                        if (!('!' <= charAt && charAt <= '~')) {
                            throw new IllegalArgumentException(jh1.m37820a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                        } else if (i2 <= length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("name is empty".toString());
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0028 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m41126a(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x0062
                r1 = 0
                r2 = 0
            L_0x000a:
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L_0x0025
                r5 = 32
                if (r5 > r4) goto L_0x001f
                r5 = 126(0x7e, float:1.77E-43)
                if (r4 > r5) goto L_0x001f
                r5 = 1
                goto L_0x0020
            L_0x001f:
                r5 = 0
            L_0x0020:
                if (r5 == 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r5 = 0
                goto L_0x0026
            L_0x0025:
                r5 = 1
            L_0x0026:
                if (r5 != 0) goto L_0x005d
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = com.yandex.mobile.ads.impl.jh1.m37820a((java.lang.String) r1, (java.lang.Object[]) r0)
                boolean r9 = com.yandex.mobile.ads.impl.jh1.m37839c(r9)
                if (r9 == 0) goto L_0x0049
                java.lang.String r8 = ""
                goto L_0x004f
            L_0x0049:
                java.lang.String r9 = ": "
                java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r8)
            L_0x004f:
                java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L_0x005d:
                if (r3 <= r0) goto L_0x0060
                goto L_0x0062
            L_0x0060:
                r2 = r3
                goto L_0x000a
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q90.C14367b.m41126a(java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: b */
    public final Map<String, List<String>> mo69512b() {
        TreeMap treeMap = new TreeMap(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String a = mo69509a(i);
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "US");
                if (a != null) {
                    String lowerCase = a.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    List list = (List) treeMap.get(lowerCase);
                    if (list == null) {
                        list = new ArrayList(2);
                        treeMap.put(lowerCase, list);
                    }
                    list.add(mo69511b(i));
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        return treeMap;
    }

    /* renamed from: com.yandex.mobile.ads.impl.q90$a */
    public static final class C14366a {

        /* renamed from: a */
        private final List<String> f39030a = new ArrayList(20);

        /* renamed from: a */
        public final C14366a mo69519a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            this.f39030a.add(str);
            this.f39030a.add(StringsKt.trim((CharSequence) str2).toString());
            return this;
        }

        /* renamed from: b */
        public final List<String> mo69521b() {
            return this.f39030a;
        }

        /* renamed from: a */
        public final C14366a mo69518a(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            int i = 0;
            while (i < this.f39030a.size()) {
                if (StringsKt.equals(str, this.f39030a.get(i), true)) {
                    this.f39030a.remove(i);
                    this.f39030a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: a */
        public final q90 mo69520a() {
            Object[] array = this.f39030a.toArray(new String[0]);
            if (array != null) {
                return new q90((String[]) array, (DefaultConstructorMarker) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: a */
    public final String mo69509a(int i) {
        return this.f39029b[i * 2];
    }

    /* renamed from: a */
    public final C14366a mo69508a() {
        C14366a aVar = new C14366a();
        CollectionsKt.addAll(aVar.mo69521b(), (T[]) this.f39029b);
        return aVar;
    }
}
