package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.yandex.mobile.ads.impl.c8 */
public class C12708c8 {

    /* renamed from: k */
    private static final RectF f31841k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f31842l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Field> f31843m = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f31844a = 0;

    /* renamed from: b */
    private boolean f31845b = false;

    /* renamed from: c */
    private float f31846c = -1.0f;

    /* renamed from: d */
    private float f31847d = -1.0f;

    /* renamed from: e */
    private float f31848e = -1.0f;

    /* renamed from: f */
    private int[] f31849f = new int[0];

    /* renamed from: g */
    private TextPaint f31850g;

    /* renamed from: h */
    private final TextView f31851h;

    /* renamed from: i */
    private final Context f31852i;

    /* renamed from: j */
    private final C12711c f31853j;

    /* renamed from: com.yandex.mobile.ads.impl.c8$a */
    private static class C12709a extends C12711c {
        C12709a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66231a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C12708c8.m34618b(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c8$b */
    private static class C12710b extends C12709a {
        C12710b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo66232a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66231a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c8$c */
    private static class C12711c {
        C12711c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66231a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo66232a(TextView textView) {
            return ((Boolean) C12708c8.m34618b(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C12708c8(TextView textView) {
        this.f31851h = textView;
        this.f31852i = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f31853j = new C12710b();
        } else if (i >= 23) {
            this.f31853j = new C12709a();
        } else {
            this.f31853j = new C12711c();
        }
    }

    /* renamed from: b */
    static <T> T m34618b(Object obj, String str, T t) {
        try {
            return m34619b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: c */
    private boolean m34620c() {
        return !(this.f31851h instanceof EditText);
    }

    /* renamed from: a */
    public void mo66228a(int i) {
        if (m34620c()) {
            if (i == 0) {
                this.f31844a = 0;
                this.f31847d = -1.0f;
                this.f31848e = -1.0f;
                this.f31846c = -1.0f;
                this.f31849f = new int[0];
                this.f31845b = false;
            } else if (i == 1) {
                DisplayMetrics displayMetrics = this.f31852i.getResources().getDisplayMetrics();
                float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                float applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                if (applyDimension <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + applyDimension + "px) is less or equal to (0px)");
                } else if (applyDimension2 > applyDimension) {
                    this.f31844a = 1;
                    this.f31847d = applyDimension;
                    this.f31848e = applyDimension2;
                    this.f31846c = 1.0f;
                    if (!m34620c() || this.f31844a != 1) {
                        this.f31845b = false;
                    } else {
                        int floor = ((int) Math.floor((double) ((this.f31848e - this.f31847d) / this.f31846c))) + 1;
                        int[] iArr = new int[floor];
                        for (int i2 = 0; i2 < floor; i2++) {
                            iArr[i2] = Math.round(this.f31847d + (((float) i2) * this.f31846c));
                        }
                        if (floor != 0) {
                            Arrays.sort(iArr);
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < floor; i3++) {
                                int i4 = iArr[i3];
                                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                                    arrayList.add(Integer.valueOf(i4));
                                }
                            }
                            if (floor != arrayList.size()) {
                                int size = arrayList.size();
                                iArr = new int[size];
                                for (int i5 = 0; i5 < size; i5++) {
                                    iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
                                }
                            }
                        }
                        this.f31849f = iArr;
                        this.f31845b = true;
                    }
                    if (this.f31845b) {
                        mo66227a();
                    }
                } else {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + applyDimension2 + "px) is less or equal to minimum auto-size text size (" + applyDimension + "px)");
                }
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* renamed from: b */
    private static Method m34619b(String str) {
        try {
            Method method = f31842l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f31842l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo66230b() {
        return m34620c() && this.f31844a != 0;
    }

    /* renamed from: a */
    public void mo66229a(int i, float f) {
        Resources resources;
        Context context = this.f31852i;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (applyDimension != this.f31851h.getPaint().getTextSize()) {
            this.f31851h.getPaint().setTextSize(applyDimension);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f31851h.isInLayout() : false;
            if (this.f31851h.getLayout() != null) {
                this.f31845b = false;
                try {
                    Method b = m34619b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.f31851h, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f31851h.requestLayout();
                } else {
                    this.f31851h.forceLayout();
                }
                this.f31851h.invalidate();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m34615a(android.graphics.RectF r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int[] r2 = r0.f31849f
            int r2 = r2.length
            if (r2 == 0) goto L_0x0179
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 1
            r6 = 0
        L_0x000e:
            if (r5 > r2) goto L_0x0174
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r0.f31849f
            r7 = r7[r6]
            android.widget.TextView r8 = r0.f31851h
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r0.f31851h
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L_0x002f
            android.widget.TextView r10 = r0.f31851h
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L_0x002f
            r8 = r9
        L_0x002f:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 16
            r15 = -1
            if (r9 < r10) goto L_0x003e
            android.widget.TextView r11 = r0.f31851h
            int r11 = r11.getMaxLines()
            r14 = r11
            goto L_0x003f
        L_0x003e:
            r14 = -1
        L_0x003f:
            android.text.TextPaint r11 = r0.f31850g
            if (r11 != 0) goto L_0x004b
            android.text.TextPaint r11 = new android.text.TextPaint
            r11.<init>()
            r0.f31850g = r11
            goto L_0x004e
        L_0x004b:
            r11.reset()
        L_0x004e:
            android.text.TextPaint r11 = r0.f31850g
            android.widget.TextView r12 = r0.f31851h
            android.text.TextPaint r12 = r12.getPaint()
            r11.set(r12)
            android.text.TextPaint r11 = r0.f31850g
            float r7 = (float) r7
            r11.setTextSize(r7)
            android.widget.TextView r7 = r0.f31851h
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r12 = "getLayoutAlignment"
            java.lang.Object r7 = m34618b(r7, r12, r11)
            android.text.Layout$Alignment r7 = (android.text.Layout.Alignment) r7
            float r11 = r1.right
            int r13 = java.lang.Math.round(r11)
            r11 = 23
            if (r9 < r11) goto L_0x00d0
            int r9 = r8.length()
            android.text.TextPaint r10 = r0.f31850g
            android.text.StaticLayout$Builder r9 = android.text.StaticLayout.Builder.obtain(r8, r4, r9, r10, r13)
            android.text.StaticLayout$Builder r7 = r9.setAlignment(r7)
            android.widget.TextView r10 = r0.f31851h
            float r10 = r10.getLineSpacingExtra()
            android.widget.TextView r11 = r0.f31851h
            float r11 = r11.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r7 = r7.setLineSpacing(r10, r11)
            android.widget.TextView r10 = r0.f31851h
            boolean r10 = r10.getIncludeFontPadding()
            android.text.StaticLayout$Builder r7 = r7.setIncludePad(r10)
            android.widget.TextView r10 = r0.f31851h
            int r10 = r10.getBreakStrategy()
            android.text.StaticLayout$Builder r7 = r7.setBreakStrategy(r10)
            android.widget.TextView r10 = r0.f31851h
            int r10 = r10.getHyphenationFrequency()
            android.text.StaticLayout$Builder r7 = r7.setHyphenationFrequency(r10)
            if (r14 != r15) goto L_0x00b7
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b8
        L_0x00b7:
            r10 = r14
        L_0x00b8:
            r7.setMaxLines(r10)
            com.yandex.mobile.ads.impl.c8$c r7 = r0.f31853j     // Catch:{ ClassCastException -> 0x00c3 }
            android.widget.TextView r10 = r0.f31851h     // Catch:{ ClassCastException -> 0x00c3 }
            r7.mo66231a(r9, r10)     // Catch:{ ClassCastException -> 0x00c3 }
            goto L_0x00ca
        L_0x00c3:
            java.lang.String r7 = "ACTVAutoSizeHelper"
            java.lang.String r10 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
            android.util.Log.w(r7, r10)
        L_0x00ca:
            android.text.StaticLayout r7 = r9.build()
            r4 = r14
            goto L_0x00f4
        L_0x00d0:
            if (r9 < r10) goto L_0x00f6
            android.widget.TextView r9 = r0.f31851h
            float r9 = r9.getLineSpacingMultiplier()
            android.widget.TextView r10 = r0.f31851h
            float r16 = r10.getLineSpacingExtra()
            android.widget.TextView r10 = r0.f31851h
            boolean r17 = r10.getIncludeFontPadding()
            android.text.StaticLayout r18 = new android.text.StaticLayout
            android.text.TextPaint r12 = r0.f31850g
            r10 = r18
            r11 = r8
            r4 = r14
            r14 = r7
            r7 = -1
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7 = r18
        L_0x00f4:
            r9 = -1
            goto L_0x013c
        L_0x00f6:
            r4 = r14
            r9 = -1
            android.widget.TextView r10 = r0.f31851h
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r12 = "mSpacingMult"
            java.lang.Object r10 = m34616a(r10, r12, r11)
            java.lang.Float r10 = (java.lang.Float) r10
            float r15 = r10.floatValue()
            android.widget.TextView r10 = r0.f31851h
            r11 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r12 = "mSpacingAdd"
            java.lang.Object r10 = m34616a(r10, r12, r11)
            java.lang.Float r10 = (java.lang.Float) r10
            float r16 = r10.floatValue()
            android.widget.TextView r10 = r0.f31851h
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.String r12 = "mIncludePad"
            java.lang.Object r10 = m34616a(r10, r12, r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r17 = r10.booleanValue()
            android.text.StaticLayout r18 = new android.text.StaticLayout
            android.text.TextPaint r12 = r0.f31850g
            r10 = r18
            r11 = r8
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7 = r18
        L_0x013c:
            if (r4 == r9) goto L_0x0154
            int r9 = r7.getLineCount()
            if (r9 > r4) goto L_0x015f
            int r4 = r7.getLineCount()
            int r4 = r4 - r3
            int r4 = r7.getLineEnd(r4)
            int r8 = r8.length()
            if (r4 == r8) goto L_0x0154
            goto L_0x015f
        L_0x0154:
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r7 = r1.bottom
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0161
        L_0x015f:
            r4 = 0
            goto L_0x0162
        L_0x0161:
            r4 = 1
        L_0x0162:
            if (r4 == 0) goto L_0x016e
            int r6 = r6 + 1
            r4 = 0
            r19 = r6
            r6 = r5
            r5 = r19
            goto L_0x000e
        L_0x016e:
            int r6 = r6 + -1
            r2 = r6
            r4 = 0
            goto L_0x000e
        L_0x0174:
            int[] r1 = r0.f31849f
            r1 = r1[r6]
            return r1
        L_0x0179:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12708c8.m34615a(android.graphics.RectF):int");
    }

    /* renamed from: a */
    private static <T> T m34616a(Object obj, String str, T t) {
        try {
            Field a = m34617a(str);
            if (a == null) {
                return t;
            }
            return a.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: a */
    private static Field m34617a(String str) {
        try {
            Field field = f31843m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f31843m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo66227a() {
        int i;
        if (m34620c() && this.f31844a != 0) {
            if (this.f31845b) {
                if (this.f31851h.getMeasuredHeight() > 0 && this.f31851h.getMeasuredWidth() > 0) {
                    if (this.f31853j.mo66232a(this.f31851h)) {
                        i = 1048576;
                    } else {
                        i = (this.f31851h.getMeasuredWidth() - this.f31851h.getTotalPaddingLeft()) - this.f31851h.getTotalPaddingRight();
                    }
                    int height = (this.f31851h.getHeight() - this.f31851h.getCompoundPaddingBottom()) - this.f31851h.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f31841k;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float a = (float) m34615a(rectF);
                            if (a != this.f31851h.getTextSize()) {
                                mo66229a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f31845b = true;
        }
    }
}
