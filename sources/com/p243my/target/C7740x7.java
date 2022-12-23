package com.p243my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* renamed from: com.my.target.x7 */
public class C7740x7 {

    /* renamed from: A */
    public static final int f19599A = m20817a();

    /* renamed from: B */
    public static final int f19600B = m20817a();

    /* renamed from: C */
    public static final int f19601C = m20817a();

    /* renamed from: D */
    public static final int f19602D = m20817a();

    /* renamed from: E */
    public static final int f19603E = m20817a();

    /* renamed from: F */
    public static final int f19604F = m20817a();

    /* renamed from: G */
    public static final int f19605G = m20817a();

    /* renamed from: H */
    public static final int f19606H = m20817a();

    /* renamed from: I */
    public static final int f19607I = m20817a();

    /* renamed from: J */
    public static final int f19608J = m20817a();

    /* renamed from: K */
    public static final int f19609K = m20817a();

    /* renamed from: L */
    public static final int f19610L = m20817a();

    /* renamed from: M */
    public static final int f19611M = m20817a();

    /* renamed from: N */
    public static final int f19612N = m20817a();

    /* renamed from: O */
    public static final int f19613O = m20817a();

    /* renamed from: P */
    public static final int f19614P = m20817a();

    /* renamed from: Q */
    public static final int f19615Q = m20817a();

    /* renamed from: R */
    public static final int f19616R = m20817a();

    /* renamed from: S */
    public static final int f19617S = m20817a();

    /* renamed from: T */
    public static final int f19618T = m20817a();

    /* renamed from: U */
    public static final int f19619U = m20817a();

    /* renamed from: V */
    public static final int f19620V = m20817a();

    /* renamed from: W */
    public static int f19621W = 0;

    /* renamed from: a */
    public static final int f19622a = m20817a();

    /* renamed from: b */
    public static final int f19623b = m20817a();

    /* renamed from: c */
    public static final int f19624c = m20817a();

    /* renamed from: d */
    public static final int f19625d = m20817a();

    /* renamed from: e */
    public static final int f19626e = m20817a();

    /* renamed from: f */
    public static final int f19627f = m20817a();

    /* renamed from: g */
    public static final int f19628g = m20817a();

    /* renamed from: h */
    public static final int f19629h = m20817a();

    /* renamed from: i */
    public static final int f19630i = m20817a();

    /* renamed from: j */
    public static final int f19631j = m20817a();

    /* renamed from: k */
    public static final int f19632k = m20817a();

    /* renamed from: l */
    public static final int f19633l = m20817a();

    /* renamed from: m */
    public static final int f19634m = m20817a();

    /* renamed from: n */
    public static final int f19635n = m20817a();

    /* renamed from: o */
    public static final int f19636o = m20817a();

    /* renamed from: p */
    public static final int f19637p = m20817a();

    /* renamed from: q */
    public static final int f19638q = m20817a();

    /* renamed from: r */
    public static final int f19639r = m20817a();

    /* renamed from: s */
    public static final int f19640s = m20817a();

    /* renamed from: t */
    public static final int f19641t = m20817a();

    /* renamed from: u */
    public static final int f19642u = m20817a();

    /* renamed from: v */
    public static final int f19643v = m20817a();

    /* renamed from: w */
    public static final int f19644w = m20817a();

    /* renamed from: x */
    public static final int f19645x = m20817a();

    /* renamed from: y */
    public static final int f19646y = m20817a();

    /* renamed from: z */
    public static final int f19647z = m20817a();

    /* renamed from: X */
    public final SparseIntArray f19648X = new SparseIntArray();

    /* renamed from: Y */
    public final float f19649Y;

    public C7740x7(Context context) {
        int i;
        float f;
        C7761y8 c = C7761y8.m20950c(context);
        DisplayMetrics a = C7761y8.m20934a(context);
        int i2 = a.heightPixels;
        if (i2 <= 0 || (i = a.widthPixels) <= 0) {
            this.f19649Y = 1.0f;
            mo51839a(c);
            return;
        }
        float f2 = a.density;
        float min = Math.min(((float) i) / f2, ((float) i2) / f2);
        if (min >= 720.0f) {
            f = 2.0f;
        } else if (min >= 600.0f) {
            f = 1.2f;
        } else {
            this.f19649Y = 1.0f;
            mo51839a(c);
        }
        this.f19649Y = f;
        mo51839a(c);
    }

    /* renamed from: a */
    public static int m20817a() {
        int i = f19621W;
        f19621W = i + 1;
        return i;
    }

    /* renamed from: a */
    public static C7740x7 m20818a(Context context) {
        return new C7740x7(context);
    }

    /* renamed from: a */
    public int mo51837a(int i) {
        return this.f19648X.get(i);
    }

    /* renamed from: a */
    public final void mo51838a(int i, int i2) {
        this.f19648X.put(i, (int) (((float) i2) * this.f19649Y));
    }

    /* renamed from: a */
    public final void mo51839a(C7761y8 y8Var) {
        mo51838a(f19622a, y8Var.mo51902b(200));
        mo51838a(f19623b, y8Var.mo51902b(1));
        mo51838a(f19624c, y8Var.mo51902b(4));
        mo51838a(f19625d, 1);
        mo51838a(f19626e, 18);
        mo51838a(f19627f, y8Var.mo51902b(16));
        mo51838a(f19628g, y8Var.mo51902b(8));
        mo51838a(f19629h, y8Var.mo51902b(6));
        mo51838a(f19630i, y8Var.mo51902b(2));
        mo51838a(f19631j, y8Var.mo51902b(48));
        mo51838a(f19632k, y8Var.mo51902b(6));
        mo51838a(f19633l, y8Var.mo51902b(6));
        mo51838a(f19634m, y8Var.mo51902b(14));
        mo51838a(f19635n, y8Var.mo51902b(20));
        mo51838a(f19636o, y8Var.mo51902b(27));
        mo51838a(f19637p, 22);
        mo51838a(f19638q, 2);
        mo51838a(f19639r, 16);
        mo51838a(f19640s, 3);
        mo51838a(f19641t, 16);
        mo51838a(f19642u, y8Var.mo51902b(6));
        mo51838a(f19643v, y8Var.mo51902b(2));
        mo51838a(f19644w, 1);
        mo51838a(f19645x, y8Var.mo51902b(3));
        mo51838a(f19647z, 16);
        mo51838a(f19619U, 14);
        mo51838a(f19646y, 1);
        mo51838a(f19599A, 2);
        mo51838a(f19600B, 2);
        mo51838a(f19601C, y8Var.mo51902b(32));
        mo51838a(f19602D, y8Var.mo51902b(16));
        mo51838a(f19604F, y8Var.mo51902b(2));
        mo51838a(f19605G, 16);
        mo51838a(f19607I, 16);
        mo51838a(f19608J, 2);
        mo51838a(f19609K, 14);
        mo51838a(f19606H, 22);
        mo51838a(f19612N, 16);
        mo51838a(f19613O, 16);
        mo51838a(f19610L, y8Var.mo51902b(4));
        mo51838a(f19611M, y8Var.mo51902b(8));
        mo51838a(f19614P, y8Var.mo51902b(100));
        mo51838a(f19615Q, y8Var.mo51902b(32));
        mo51838a(f19616R, y8Var.mo51902b(136));
        mo51838a(f19617S, y8Var.mo51902b(156));
        mo51838a(f19603E, y8Var.mo51902b(24));
        mo51838a(f19618T, y8Var.mo51902b(10));
        mo51838a(f19620V, y8Var.mo51902b(40));
    }
}
