package com.p243my.target;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: com.my.target.n8 */
public class C7566n8 {
    /* renamed from: a */
    public static boolean m19950a() {
        try {
            Class.forName("com.google.android.exoplayer2.ExoPlayer");
            Class.forName(C7389e9.class.getName());
            return true;
        } catch (Throwable unused) {
            C7374e0.m18989a("ExoPlayer doesn't exist, add ExoPlayer dependency to play video");
            return false;
        }
    }

    /* renamed from: a */
    public static float[] m19951a(float f, float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = (f / 100.0f) * fArr[i];
        }
        return fArr2;
    }

    /* renamed from: a */
    public static <T extends C7685u1> float[] m19952a(C7686u2<T> u2Var, float f) {
        float f2;
        TreeSet<Float> treeSet = new TreeSet<>();
        for (C7413g2 next : u2Var.mo51658d()) {
            float point = next.getPoint();
            float pointP = next.getPointP();
            if (pointP >= 0.0f && pointP <= 100.0f) {
                point = f * (pointP / 100.0f);
            } else if (point < 0.0f || point > f) {
                C7374e0.m18989a("Midroll banner" + next.getId() + " excluded, had point=" + point + ", pointP=" + pointP + ", content duration=" + f);
            }
            float round = ((float) Math.round(point * 10.0f)) / 10.0f;
            next.setPoint(round);
            treeSet.add(Float.valueOf(round));
        }
        Iterator<C7617q1> it = u2Var.mo51661g().iterator();
        while (it.hasNext()) {
            C7617q1 next2 = it.next();
            float s = next2.mo51408s();
            float t = next2.mo51409t();
            if (t >= 0.0f && t <= 100.0f) {
                f2 = (t / 100.0f) * f;
            } else if (s < 0.0f || s > f) {
                C7374e0.m18989a("Midroll service" + next2.mo51402m() + " excluded, had point=" + s + ", pointP=" + t + ", content duration=" + f);
            } else {
                f2 = next2.mo51408s();
            }
            float round2 = ((float) Math.round(f2 * 10.0f)) / 10.0f;
            next2.mo51373b(round2);
            treeSet.add(Float.valueOf(round2));
        }
        float[] fArr = new float[treeSet.size()];
        int i = 0;
        for (Float floatValue : treeSet) {
            fArr[i] = floatValue.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: a */
    public static <T extends C7685u1> float[] m19953a(C7686u2<T> u2Var, float[] fArr, float f) {
        return (fArr == null || fArr.length == 0) ? m19952a(u2Var, f) : m19955b(u2Var, fArr, f);
    }

    /* renamed from: b */
    public static boolean m19954b() {
        try {
            Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static <T extends C7685u1> float[] m19955b(C7686u2<T> u2Var, float[] fArr, float f) {
        String str;
        String str2;
        Arrays.sort(fArr);
        TreeSet<Float> treeSet = new TreeSet<>();
        int i = 0;
        int i2 = 0;
        for (C7413g2 next : u2Var.mo51658d()) {
            if (i2 >= fArr.length) {
                str2 = "Midroll mediabanner missing: not enough user midPoints";
            } else {
                float f2 = fArr[i2];
                if (f2 > f) {
                    str2 = "Cannot set midPoint " + f2 + ": out of duration";
                } else {
                    next.setPoint(f2);
                    treeSet.add(Float.valueOf(f2));
                    if (!"statistics".equals(next.getType())) {
                        i2++;
                    }
                }
            }
            C7374e0.m18989a(str2);
            next.setPoint(-1.0f);
        }
        Iterator<C7617q1> it = u2Var.mo51661g().iterator();
        while (it.hasNext()) {
            C7617q1 next2 = it.next();
            if (i2 >= fArr.length) {
                str = "Midroll service missing: not enough user midPoints";
            } else {
                float f3 = fArr[i2];
                if (f3 > f) {
                    str = "Cannot set midPoint " + f3 + ": out of duration";
                } else {
                    next2.mo51373b(f3);
                    treeSet.add(Float.valueOf(f3));
                    i2++;
                }
            }
            C7374e0.m18989a(str);
            next2.mo51373b(-1.0f);
        }
        float[] fArr2 = new float[treeSet.size()];
        for (Float floatValue : treeSet) {
            fArr2[i] = floatValue.floatValue();
            i++;
        }
        return fArr2;
    }
}
