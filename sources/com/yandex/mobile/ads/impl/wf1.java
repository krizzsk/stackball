package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class wf1 {

    /* renamed from: a */
    public final String f41998a;

    /* renamed from: b */
    public final String f41999b;

    /* renamed from: c */
    public final boolean f42000c;

    /* renamed from: d */
    public final long f42001d;

    /* renamed from: e */
    public final long f42002e;

    /* renamed from: f */
    public final yf1 f42003f;

    /* renamed from: g */
    private final String[] f42004g;

    /* renamed from: h */
    public final String f42005h;

    /* renamed from: i */
    public final String f42006i;

    /* renamed from: j */
    private final HashMap<String, Integer> f42007j;

    /* renamed from: k */
    private final HashMap<String, Integer> f42008k;

    /* renamed from: l */
    private List<wf1> f42009l;

    private wf1(String str, String str2, long j, long j2, yf1 yf1, String[] strArr, String str3, String str4) {
        this.f41998a = str;
        this.f41999b = str2;
        this.f42006i = str4;
        this.f42003f = yf1;
        this.f42004g = strArr;
        this.f42000c = str2 != null;
        this.f42001d = j;
        this.f42002e = j2;
        this.f42005h = (String) C13479j9.m37703a(str3);
        this.f42007j = new HashMap<>();
        this.f42008k = new HashMap<>();
    }

    /* renamed from: a */
    public static wf1 m43628a(String str) {
        return new wf1((String) null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (yf1) null, (String[]) null, "", (String) null);
    }

    /* renamed from: b */
    public long[] mo70701b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m43633a((TreeSet<Long>) treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: a */
    public static wf1 m43629a(String str, long j, long j2, yf1 yf1, String[] strArr, String str2, String str3) {
        return new wf1(str, (String) null, j, j2, yf1, strArr, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo70700a(long r9) {
        /*
            r8 = this;
            long r0 = r8.f42001d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0011
            long r5 = r8.f42002e
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x002b
        L_0x0011:
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x001b
            long r0 = r8.f42002e
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x002b
        L_0x001b:
            if (r4 != 0) goto L_0x0023
            long r0 = r8.f42002e
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x002b
        L_0x0023:
            if (r5 > 0) goto L_0x002d
            long r0 = r8.f42002e
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x002d
        L_0x002b:
            r9 = 1
            goto L_0x002e
        L_0x002d:
            r9 = 0
        L_0x002e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wf1.mo70700a(long):boolean");
    }

    /* renamed from: a */
    public void mo70699a(wf1 wf1) {
        if (this.f42009l == null) {
            this.f42009l = new ArrayList();
        }
        this.f42009l.add(wf1);
    }

    /* renamed from: a */
    public wf1 mo70697a(int i) {
        List<wf1> list = this.f42009l;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public int mo70696a() {
        List<wf1> list = this.f42009l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    private void m43633a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f41998a);
        boolean equals2 = "div".equals(this.f41998a);
        if (z || equals || (equals2 && this.f42006i != null)) {
            long j = this.f42001d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f42002e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f42009l != null) {
            for (int i = 0; i < this.f42009l.size(); i++) {
                this.f42009l.get(i).m43633a(treeSet, z || equals);
            }
        }
    }

    /* renamed from: a */
    public List<C14683ti> mo70698a(long j, Map<String, yf1> map, Map<String, xf1> map2, Map<String, String> map3) {
        int i;
        int i2;
        long j2 = j;
        Map<String, xf1> map4 = map2;
        ArrayList arrayList = new ArrayList();
        m43630a(j2, this.f42005h, (List<Pair<String, String>>) arrayList);
        TreeMap treeMap = new TreeMap();
        m43632a(j, false, this.f42005h, (Map<String, SpannableStringBuilder>) treeMap);
        m43631a(j2, map, (Map<String, SpannableStringBuilder>) treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                xf1 xf1 = map4.get(pair.first);
                arrayList2.add(new C14683ti(decodeByteArray, xf1.f42552b, 0, xf1.f42553c, xf1.f42555e, xf1.f42556f, xf1.f42557g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            xf1 xf12 = map4.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            int length = spannableStringBuilder.length();
            for (int i3 = 0; i3 < length; i3++) {
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                        i5++;
                    }
                    int i6 = i5 - i4;
                    if (i6 > 0) {
                        spannableStringBuilder.delete(i3, i3 + i6);
                        length -= i6;
                    }
                }
            }
            if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
                length--;
            }
            int i7 = 0;
            while (true) {
                i = length - 1;
                if (i7 >= i) {
                    break;
                }
                if (spannableStringBuilder.charAt(i7) == 10) {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == ' ') {
                        spannableStringBuilder.delete(i8, i7 + 2);
                        length--;
                    }
                }
                i7++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
                spannableStringBuilder.delete(i, length);
                length--;
            }
            int i9 = 0;
            while (true) {
                i2 = length - 1;
                if (i9 >= i2) {
                    break;
                }
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    int i10 = i9 + 1;
                    if (spannableStringBuilder.charAt(i10) == 10) {
                        spannableStringBuilder.delete(i9, i10);
                        length--;
                    }
                }
                i9++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i2) == 10) {
                spannableStringBuilder.delete(i2, length);
            }
            arrayList2.add(new C14683ti((CharSequence) spannableStringBuilder, (Layout.Alignment) null, xf12.f42553c, xf12.f42554d, xf12.f42555e, xf12.f42552b, Integer.MIN_VALUE, xf12.f42556f, xf12.f42558h, xf12.f42559i));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private void m43630a(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f42005h)) {
            str = this.f42005h;
        }
        if (!mo70700a(j) || !"div".equals(this.f41998a) || this.f42006i == null) {
            for (int i = 0; i < mo70696a(); i++) {
                mo70697a(i).m43630a(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f42006i));
    }

    /* renamed from: a */
    private void m43632a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f42007j.clear();
        this.f42008k.clear();
        if (!"metadata".equals(this.f41998a)) {
            if (!"".equals(this.f42005h)) {
                str = this.f42005h;
            }
            if (this.f42000c && z) {
                m43627a(str, map).append(this.f41999b);
            } else if ("br".equals(this.f41998a) && z) {
                m43627a(str, map).append(10);
            } else if (mo70700a(j)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f42007j.put((String) next.getKey(), Integer.valueOf(((SpannableStringBuilder) next.getValue()).length()));
                }
                boolean equals = "p".equals(this.f41998a);
                for (int i = 0; i < mo70696a(); i++) {
                    mo70697a(i).m43632a(j, z || equals, str, map);
                }
                if (equals) {
                    SpannableStringBuilder a = m43627a(str, map);
                    int length = a.length() - 1;
                    while (length >= 0 && a.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && a.charAt(length) != 10) {
                        a.append(10);
                    }
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f42008k.put((String) next2.getKey(), Integer.valueOf(((SpannableStringBuilder) next2.getValue()).length()));
                }
            }
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m43627a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    /* renamed from: a */
    private void m43631a(long j, Map<String, yf1> map, Map<String, SpannableStringBuilder> map2) {
        int i;
        if (mo70700a(j)) {
            Iterator<Map.Entry<String, Integer>> it = this.f42008k.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                int intValue = this.f42007j.containsKey(str) ? this.f42007j.get(str).intValue() : 0;
                int intValue2 = ((Integer) next.getValue()).intValue();
                if (intValue != intValue2) {
                    SpannableStringBuilder spannableStringBuilder = map2.get(str);
                    yf1 yf1 = this.f42003f;
                    String[] strArr = this.f42004g;
                    if (yf1 == null && strArr == null) {
                        yf1 = null;
                    } else if (yf1 == null && strArr.length == 1) {
                        yf1 = map.get(strArr[0]);
                    } else if (yf1 == null && strArr.length > 1) {
                        yf1 = new yf1();
                        int length = strArr.length;
                        while (i < length) {
                            yf1.mo71057a(map.get(strArr[i]));
                            i++;
                        }
                    } else if (yf1 != null && strArr != null && strArr.length == 1) {
                        yf1 = yf1.mo71057a(map.get(strArr[0]));
                    } else if (!(yf1 == null || strArr == null || strArr.length <= 1)) {
                        int length2 = strArr.length;
                        while (i < length2) {
                            yf1.mo71057a(map.get(strArr[i]));
                            i++;
                        }
                    }
                    if (yf1 != null) {
                        if (yf1.mo71071g() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(yf1.mo71071g()), intValue, intValue2, 33);
                        }
                        if (yf1.mo71075k()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (yf1.mo71076l()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (yf1.mo71074j()) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(yf1.mo71060b()), intValue, intValue2, 33);
                        }
                        if (yf1.mo71073i()) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(yf1.mo71053a()), intValue, intValue2, 33);
                        }
                        if (yf1.mo71066c() != null) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(yf1.mo71066c()), intValue, intValue2, 33);
                        }
                        if (yf1.mo71072h() != null) {
                            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(yf1.mo71072h()), intValue, intValue2, 33);
                        }
                        int e = yf1.mo71069e();
                        if (e == 1) {
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) yf1.mo71067d(), true), intValue, intValue2, 33);
                        } else if (e == 2) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(yf1.mo71067d()), intValue, intValue2, 33);
                        } else if (e == 3) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(yf1.mo71067d() / 100.0f), intValue, intValue2, 33);
                        }
                    }
                }
            }
            while (i < mo70696a()) {
                mo70697a(i).m43631a(j, map, map2);
                i++;
            }
        }
    }
}
