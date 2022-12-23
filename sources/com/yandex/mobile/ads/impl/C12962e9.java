package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.yandex.mobile.ads.impl.e9 */
public class C12962e9 implements Comparable<C12962e9> {

    /* renamed from: g */
    private static final Pattern f32926g = Pattern.compile("^[\\d]*(\\.[\\d]*)*(\\-.*)?");

    /* renamed from: b */
    private final String f32927b;

    /* renamed from: c */
    private int[] f32928c;

    /* renamed from: d */
    private String f32929d;

    /* renamed from: e */
    private Integer f32930e;

    /* renamed from: f */
    private boolean f32931f = true;

    public C12962e9(String str) {
        this.f32927b = str.toLowerCase(Locale.US);
        m35602a();
    }

    /* renamed from: a */
    private void m35602a() {
        String[] split = this.f32927b.split("-");
        int i = 0;
        if (!f32926g.matcher(this.f32927b).matches()) {
            this.f32931f = false;
        }
        String[] split2 = split[0].split("\\.");
        if (this.f32931f) {
            this.f32928c = new int[split2.length];
            while (true) {
                int[] iArr = this.f32928c;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = Integer.parseInt(split2[i]);
                i++;
            }
            int indexOf = this.f32927b.indexOf(45);
            if (indexOf < 0 || indexOf >= this.f32927b.length() - 1) {
                this.f32930e = 2;
                return;
            }
            String substring = this.f32927b.substring(indexOf);
            this.f32929d = substring;
            this.f32930e = Integer.valueOf(substring.endsWith("-snapshot") ^ true ? 1 : 0);
        }
    }

    /* renamed from: a */
    public int compareTo(C12962e9 e9Var) {
        int compareTo;
        int i;
        int i2;
        int i3;
        boolean z = this.f32931f;
        if (!z || !e9Var.f32931f) {
            if (!z) {
                if (!e9Var.f32931f && (compareTo = this.f32927b.compareTo(e9Var.f32927b)) >= 0) {
                    return compareTo > 0 ? 1 : 0;
                }
                return -1;
            }
        }
        int max = Math.max(this.f32928c.length, e9Var.f32928c.length);
        int i4 = 0;
        while (true) {
            if (i4 >= max) {
                i = 0;
                break;
            }
            int[] iArr = this.f32928c;
            if (i4 >= iArr.length) {
                i2 = 0;
            } else {
                i2 = iArr[i4];
            }
            int[] iArr2 = e9Var.f32928c;
            if (i4 >= iArr2.length) {
                i3 = 0;
            } else {
                i3 = iArr2[i4];
            }
            if (i2 > i3) {
                i = 1;
                break;
            } else if (i2 < i3) {
                i = -1;
                break;
            } else {
                i4++;
            }
        }
        if (i != 0) {
            return i;
        }
        if (!this.f32930e.equals(e9Var.f32930e)) {
            return this.f32930e.compareTo(e9Var.f32930e);
        }
        if (!this.f32930e.equals(2)) {
            int compareTo2 = this.f32929d.compareTo(e9Var.f32929d);
            if (compareTo2 < 0) {
                return -1;
            }
            if (compareTo2 > 0) {
                return 1;
            }
        }
        return 0;
    }
}
