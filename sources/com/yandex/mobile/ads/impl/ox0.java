package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class ox0 {
    ox0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo69282a(Rect rect, List<Rect> list) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(Integer.valueOf(rect.left));
        treeSet.add(Integer.valueOf(rect.right));
        for (Rect next : list) {
            treeSet.add(Integer.valueOf(next.left));
            treeSet.add(Integer.valueOf(next.right));
        }
        ArrayList arrayList = new ArrayList(treeSet);
        TreeSet treeSet2 = new TreeSet();
        treeSet2.add(Integer.valueOf(rect.top));
        treeSet2.add(Integer.valueOf(rect.bottom));
        for (Rect next2 : list) {
            treeSet2.add(Integer.valueOf(next2.top));
            treeSet2.add(Integer.valueOf(next2.bottom));
        }
        ArrayList arrayList2 = new ArrayList(treeSet2);
        m40613a(rect, arrayList, arrayList2);
        for (Rect a : list) {
            m40613a(a, arrayList, arrayList2);
        }
        int[] iArr = new int[2];
        iArr[1] = arrayList2.size() - 1;
        iArr[0] = arrayList.size() - 1;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        for (Rect next3 : list) {
            for (int i = next3.left; i < next3.right; i++) {
                for (int i2 = next3.top; i2 < next3.bottom; i2++) {
                    bArr[i][i2] = 1;
                }
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size() - 1; i4++) {
            for (int i5 = 0; i5 < arrayList2.size() - 1; i5++) {
                if (bArr[i4][i5] == 1) {
                    i3 += Integer.valueOf(((Integer) arrayList.get(i4 + 1)).intValue() - ((Integer) arrayList.get(i4)).intValue()).intValue() * Integer.valueOf(((Integer) arrayList2.get(i5 + 1)).intValue() - ((Integer) arrayList2.get(i5)).intValue()).intValue();
                }
            }
        }
        return i3;
    }

    /* renamed from: a */
    private void m40613a(Rect rect, List<Integer> list, List<Integer> list2) {
        rect.left = Collections.binarySearch(list, Integer.valueOf(rect.left));
        rect.top = Collections.binarySearch(list2, Integer.valueOf(rect.top));
        rect.right = Collections.binarySearch(list, Integer.valueOf(rect.right));
        rect.bottom = Collections.binarySearch(list2, Integer.valueOf(rect.bottom));
    }
}
