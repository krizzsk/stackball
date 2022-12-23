package com.moat.analytics.mobile.inm;

import android.app.Activity;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.z */
class C7291z {

    /* renamed from: a */
    String f18282a = "{}";

    /* renamed from: b */
    private C7295c f18283b = new C7295c();

    /* renamed from: c */
    private JSONObject f18284c;

    /* renamed from: d */
    private Rect f18285d;

    /* renamed from: e */
    private Rect f18286e;

    /* renamed from: f */
    private JSONObject f18287f;

    /* renamed from: g */
    private JSONObject f18288g;

    /* renamed from: h */
    private Location f18289h;

    /* renamed from: i */
    private Map<String, Object> f18290i = new HashMap();

    /* renamed from: com.moat.analytics.mobile.inm.z$a */
    static class C7293a {

        /* renamed from: a */
        int f18291a = 0;

        /* renamed from: b */
        final Set<Rect> f18292b = new HashSet();

        /* renamed from: c */
        boolean f18293c = false;

        C7293a() {
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.z$b */
    static class C7294b {

        /* renamed from: a */
        final View f18294a;

        /* renamed from: b */
        final Rect f18295b;

        C7294b(View view, C7294b bVar) {
            this.f18294a = view;
            this.f18295b = bVar != null ? C7291z.m18635b(view, bVar.f18295b.left, bVar.f18295b.top) : C7291z.m18646k(view);
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.z$c */
    static class C7295c {

        /* renamed from: a */
        Rect f18296a = new Rect(0, 0, 0, 0);

        /* renamed from: b */
        double f18297b = 0.0d;

        /* renamed from: c */
        double f18298c = 0.0d;

        C7295c() {
        }
    }

    C7291z() {
    }

    /* renamed from: a */
    static int m18620a(Rect rect, Set<Rect> set) {
        int i = 0;
        if (set.isEmpty()) {
            return 0;
        }
        ArrayList<Rect> arrayList = new ArrayList<>();
        arrayList.addAll(set);
        Collections.sort(arrayList, new Comparator<Rect>() {
            /* renamed from: a */
            public final int compare(Rect rect, Rect rect2) {
                return Integer.valueOf(rect.top).compareTo(Integer.valueOf(rect2.top));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Rect rect2 : arrayList) {
            arrayList2.add(Integer.valueOf(rect2.left));
            arrayList2.add(Integer.valueOf(rect2.right));
        }
        Collections.sort(arrayList2);
        int i2 = 0;
        while (i < arrayList2.size() - 1) {
            int i3 = i + 1;
            if (!((Integer) arrayList2.get(i)).equals(arrayList2.get(i3))) {
                Rect rect3 = new Rect(((Integer) arrayList2.get(i)).intValue(), rect.top, ((Integer) arrayList2.get(i3)).intValue(), rect.bottom);
                int i4 = rect.top;
                for (Rect rect4 : arrayList) {
                    if (Rect.intersects(rect4, rect3)) {
                        if (rect4.bottom > i4) {
                            i2 += rect3.width() * (rect4.bottom - Math.max(i4, rect4.top));
                            i4 = rect4.bottom;
                        }
                        if (rect4.bottom == rect3.bottom) {
                            break;
                        }
                    }
                }
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: a */
    private static Rect m18621a(DisplayMetrics displayMetrics) {
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: a */
    static Rect m18622a(View view) {
        return view != null ? m18646k(view) : new Rect(0, 0, 0, 0);
    }

    /* renamed from: a */
    static C7293a m18624a(Rect rect, View view) {
        C7293a aVar = new C7293a();
        try {
            ArrayDeque<View> i = m18644i(view);
            if (i != null) {
                if (!i.isEmpty()) {
                    C7261p.m18548b(2, "VisibilityInfo", view, "starting covering rect search");
                    C7294b bVar = null;
                    loop0:
                    while (true) {
                        if (i.isEmpty()) {
                            break;
                        }
                        View pollLast = i.pollLast();
                        C7294b bVar2 = new C7294b(pollLast, bVar);
                        if (pollLast.getParent() != null && (pollLast.getParent() instanceof ViewGroup)) {
                            ViewGroup viewGroup = (ViewGroup) pollLast.getParent();
                            int childCount = viewGroup.getChildCount();
                            boolean z = false;
                            for (int i2 = 0; i2 < childCount; i2++) {
                                if (aVar.f18291a >= 500) {
                                    C7261p.m18544a(3, "VisibilityInfo", (Object) null, "Short-circuiting cover retrieval, reached max");
                                    break loop0;
                                }
                                View childAt = viewGroup.getChildAt(i2);
                                if (childAt == pollLast) {
                                    z = true;
                                } else {
                                    aVar.f18291a++;
                                    if (m18631a(childAt, pollLast, z)) {
                                        m18637b(new C7294b(childAt, bVar), rect, aVar);
                                        if (aVar.f18293c) {
                                            return aVar;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            continue;
                        }
                        bVar = bVar2;
                    }
                    return aVar;
                }
            }
            return aVar;
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: a */
    private static C7295c m18625a(View view, Rect rect, boolean z, boolean z2, boolean z3) {
        C7295c cVar = new C7295c();
        int b = m18632b(rect);
        if (view != null && z && z2 && !z3 && b > 0) {
            Rect rect2 = new Rect(0, 0, 0, 0);
            if (m18630a(view, rect2)) {
                int b2 = m18632b(rect2);
                if (b2 < b) {
                    C7261p.m18548b(2, "VisibilityInfo", (Object) null, "Ad is clipped");
                }
                if (view.getRootView() instanceof ViewGroup) {
                    cVar.f18296a = rect2;
                    C7293a a = m18624a(rect2, view);
                    if (a.f18293c) {
                        cVar.f18298c = 1.0d;
                    } else {
                        int a2 = m18620a(rect2, a.f18292b);
                        if (a2 > 0) {
                            cVar.f18298c = ((double) a2) / (((double) b2) * 1.0d);
                        }
                        cVar.f18297b = ((double) (b2 - a2)) / (((double) b) * 1.0d);
                    }
                }
            }
        }
        return cVar;
    }

    /* renamed from: a */
    private static Map<String, String> m18626a(Rect rect) {
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(rect.left));
        hashMap.put("y", String.valueOf(rect.top));
        hashMap.put("w", String.valueOf(rect.right - rect.left));
        hashMap.put("h", String.valueOf(rect.bottom - rect.top));
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, String> m18627a(Rect rect, DisplayMetrics displayMetrics) {
        return m18626a(m18633b(rect, displayMetrics));
    }

    /* renamed from: a */
    private static JSONObject m18628a(Location location) {
        Map<String, String> b = m18636b(location);
        if (b == null) {
            return null;
        }
        return new JSONObject(b);
    }

    /* renamed from: a */
    private static void m18629a(C7294b bVar, Rect rect, C7293a aVar) {
        Rect rect2 = bVar.f18295b;
        if (rect2.setIntersect(rect, rect2)) {
            if (Build.VERSION.SDK_INT >= 22) {
                Rect rect3 = new Rect(0, 0, 0, 0);
                if (m18630a(bVar.f18294a, rect3)) {
                    Rect rect4 = bVar.f18295b;
                    if (rect4.setIntersect(rect3, rect4)) {
                        rect2 = rect4;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (C7276w.m18582a().f18244c) {
                C7261p.m18548b(2, "VisibilityInfo", bVar.f18294a, String.format(Locale.ROOT, "Covered by %s-%s alpha=%f", new Object[]{bVar.f18294a.getClass().getName(), rect2.toString(), Float.valueOf(bVar.f18294a.getAlpha())}));
            }
            aVar.f18292b.add(rect2);
            if (rect2.contains(rect)) {
                aVar.f18293c = true;
            }
        }
    }

    /* renamed from: a */
    private static boolean m18630a(View view, Rect rect) {
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationInWindow(iArr);
        int[] iArr2 = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationOnScreen(iArr2);
        rect.offset(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        return true;
    }

    /* renamed from: a */
    private static boolean m18631a(View view, View view2, boolean z) {
        return z ? Build.VERSION.SDK_INT < 21 || view.getZ() >= view2.getZ() : Build.VERSION.SDK_INT >= 21 && view.getZ() > view2.getZ();
    }

    /* renamed from: b */
    private static int m18632b(Rect rect) {
        return rect.width() * rect.height();
    }

    /* renamed from: b */
    private static Rect m18633b(Rect rect, DisplayMetrics displayMetrics) {
        float f = displayMetrics.density;
        if (f == 0.0f) {
            return rect;
        }
        return new Rect(Math.round(((float) rect.left) / f), Math.round(((float) rect.top) / f), Math.round(((float) rect.right) / f), Math.round(((float) rect.bottom) / f));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Rect m18635b(View view, int i, int i2) {
        int left = i + view.getLeft();
        int top = i2 + view.getTop();
        return new Rect(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    /* renamed from: b */
    private static Map<String, String> m18636b(Location location) {
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.toString(location.getLatitude()));
        hashMap.put("longitude", Double.toString(location.getLongitude()));
        hashMap.put("timestamp", Long.toString(location.getTime()));
        hashMap.put("horizontalAccuracy", Float.toString(location.getAccuracy()));
        return hashMap;
    }

    /* renamed from: b */
    private static void m18637b(C7294b bVar, Rect rect, C7293a aVar) {
        if (m18643h(bVar.f18294a)) {
            boolean z = true;
            if (bVar.f18294a instanceof ViewGroup) {
                int i = 0;
                boolean z2 = !ViewGroup.class.equals(bVar.f18294a.getClass().getSuperclass()) || !m18645j(bVar.f18294a);
                ViewGroup viewGroup = (ViewGroup) bVar.f18294a;
                int childCount = viewGroup.getChildCount();
                while (i < childCount) {
                    int i2 = aVar.f18291a + 1;
                    aVar.f18291a = i2;
                    if (i2 <= 500) {
                        m18637b(new C7294b(viewGroup.getChildAt(i), bVar), rect, aVar);
                        if (!aVar.f18293c) {
                            i++;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                z = z2;
            }
            if (z) {
                m18629a(bVar, rect, aVar);
            }
        }
    }

    /* renamed from: c */
    private static boolean m18638c(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view != null && view.isAttachedToWindow() : (view == null || view.getWindowToken() == null) ? false : true;
    }

    /* renamed from: d */
    private static boolean m18639d(View view) {
        return view != null && view.hasWindowFocus();
    }

    /* renamed from: e */
    private static boolean m18640e(View view) {
        return view == null || !view.isShown();
    }

    /* renamed from: f */
    private static float m18641f(View view) {
        if (view == null) {
            return 0.0f;
        }
        return m18642g(view);
    }

    /* renamed from: g */
    private static float m18642g(View view) {
        float alpha = view.getAlpha();
        while (view != null && view.getParent() != null && ((double) alpha) != 0.0d && (view.getParent() instanceof View)) {
            alpha *= ((View) view.getParent()).getAlpha();
            view = (View) view.getParent();
        }
        return alpha;
    }

    /* renamed from: h */
    private static boolean m18643h(View view) {
        return view.isShown() && ((double) view.getAlpha()) > 0.0d;
    }

    /* renamed from: i */
    private static ArrayDeque<View> m18644i(View view) {
        ArrayDeque<View> arrayDeque = new ArrayDeque<>();
        int i = 0;
        View view2 = view;
        while (true) {
            if (view2.getParent() == null && view2 != view.getRootView()) {
                break;
            }
            i++;
            if (i <= 50) {
                arrayDeque.add(view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
                view2 = (View) view2.getParent();
            } else {
                C7261p.m18544a(3, "VisibilityInfo", (Object) null, "Short-circuiting chain retrieval, reached max");
                break;
            }
        }
        return arrayDeque;
    }

    /* renamed from: j */
    private static boolean m18645j(View view) {
        return Build.VERSION.SDK_INT < 19 || view.getBackground() == null || view.getBackground().getAlpha() == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static Rect m18646k(View view) {
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* renamed from: l */
    private static DisplayMetrics m18647l(View view) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 17 || C7221a.f18094a == null || (activity = (Activity) C7221a.f18094a.get()) == null) {
            return view.getContext().getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49434a(String str, View view) {
        HashMap hashMap = new HashMap();
        if (view != null) {
            try {
                DisplayMetrics l = m18647l(view);
                boolean c = m18638c(view);
                boolean d = m18639d(view);
                boolean e = m18640e(view);
                float f = m18641f(view);
                hashMap.put("dr", Float.valueOf(l.density));
                hashMap.put("dv", Double.valueOf(C7264s.m18552a()));
                hashMap.put("adKey", str);
                boolean z = false;
                boolean z2 = true;
                hashMap.put("isAttached", Integer.valueOf(c ? 1 : 0));
                hashMap.put("inFocus", Integer.valueOf(d ? 1 : 0));
                hashMap.put("isHidden", Integer.valueOf(e ? 1 : 0));
                hashMap.put("opacity", Float.valueOf(f));
                Rect a = m18621a(l);
                Rect a2 = m18622a(view);
                C7295c a3 = m18625a(view, a2, c, d, e);
                if (this.f18284c == null || a3.f18297b != this.f18283b.f18297b || !a3.f18296a.equals(this.f18283b.f18296a) || a3.f18298c != this.f18283b.f18298c) {
                    this.f18283b = a3;
                    this.f18284c = new JSONObject(m18627a(this.f18283b.f18296a, l));
                    z = true;
                }
                hashMap.put("coveredPercent", Double.valueOf(a3.f18298c));
                if (this.f18288g == null || !a.equals(this.f18286e)) {
                    this.f18286e = a;
                    this.f18288g = new JSONObject(m18627a(a, l));
                    z = true;
                }
                if (this.f18287f == null || !a2.equals(this.f18285d)) {
                    this.f18285d = a2;
                    this.f18287f = new JSONObject(m18627a(a2, l));
                    z = true;
                }
                if (this.f18290i == null || !hashMap.equals(this.f18290i)) {
                    this.f18290i = hashMap;
                    z = true;
                }
                Location b = C7258o.m18520a().mo49412b();
                if (!C7258o.m18525a(b, this.f18289h)) {
                    this.f18289h = b;
                } else {
                    z2 = z;
                }
                if (z2) {
                    JSONObject jSONObject = new JSONObject(this.f18290i);
                    jSONObject.accumulate("screen", this.f18288g);
                    jSONObject.accumulate("view", this.f18287f);
                    jSONObject.accumulate(TJAdUnitConstants.String.VISIBLE, this.f18284c);
                    jSONObject.accumulate("maybe", this.f18284c);
                    jSONObject.accumulate("visiblePercent", Double.valueOf(this.f18283b.f18297b));
                    if (b != null) {
                        jSONObject.accumulate(FirebaseAnalytics.Param.LOCATION, m18628a(b));
                    }
                    this.f18282a = jSONObject.toString();
                }
            } catch (Exception e2) {
                C7252m.m18508a(e2);
                this.f18282a = "{}";
            }
        }
    }
}
