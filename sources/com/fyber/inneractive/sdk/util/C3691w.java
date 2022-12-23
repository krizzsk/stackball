package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.C3654j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.fyber.inneractive.sdk.util.w */
public final class C3691w {

    /* renamed from: a */
    public static String f9989a = "IAVisibilityTracker";

    /* renamed from: b */
    public Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> f9990b;

    /* renamed from: c */
    public WeakHashMap<Context, WeakHashMap<View, C3696b>> f9991c;

    /* renamed from: d */
    C3654j<Rect> f9992d;

    /* renamed from: e */
    C3654j<HashSet<View>> f9993e;

    /* renamed from: com.fyber.inneractive.sdk.util.w$a */
    private static class C3695a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C3691w f9998a = new C3691w((byte) 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.util.w$b */
    public interface C3696b {
        /* renamed from: a */
        void mo18474a(float f, Rect rect);
    }

    /* synthetic */ C3691w(byte b) {
        this();
    }

    private C3691w() {
        this.f9991c = new WeakHashMap<>();
        this.f9990b = new WeakHashMap();
        this.f9992d = new C3654j<>(16, new C3654j.C3655a<Rect>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo18457a() {
                return new Rect();
            }
        });
        this.f9993e = new C3654j<>(16, new C3654j.C3655a<HashSet<View>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo18457a() {
                return new HashSet();
            }
        });
    }

    /* renamed from: a */
    public static C3691w m9191a() {
        return C3695a.f9998a;
    }

    /* renamed from: a */
    public final void mo19598a(final Context context, View view, C3696b bVar) {
        View view2;
        ViewTreeObserver viewTreeObserver;
        IAlog.m9034b("%strackView called with context: %s view: %s", m9195c(), context, view);
        if (context != null) {
            WeakHashMap weakHashMap = this.f9991c.get(context);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.f9991c.put(context, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        view2 = activity.getWindow().getDecorView();
                        viewTreeObserver = view2.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            C36943 r2 = new ViewTreeObserver.OnPreDrawListener() {
                                public final boolean onPreDraw() {
                                    C3691w.m9193a(C3691w.this, context);
                                    return true;
                                }
                            };
                            viewTreeObserver.addOnPreDrawListener(r2);
                            this.f9990b.put(context, new Pair(viewTreeObserver, r2));
                        }
                    }
                }
                view2 = view.getRootView();
                viewTreeObserver = view2.getViewTreeObserver();
                C36943 r22 = new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        C3691w.m9193a(C3691w.this, context);
                        return true;
                    }
                };
                viewTreeObserver.addOnPreDrawListener(r22);
                this.f9990b.put(context, new Pair(viewTreeObserver, r22));
            }
            weakHashMap.put(view, bVar);
            m9194b();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    /* renamed from: a */
    public final void mo19599a(View view) {
        IAlog.m9034b("%sunTrackView called with view", m9195c());
        if (view == null) {
            IAlog.m9034b("%sunTrackView called with a null view!", m9195c());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.m9034b("%sview.getContext() returned null!", m9195c());
            return;
        }
        Map map = this.f9991c.get(context);
        if (map != null) {
            m9192a(context, (Map<View, C3696b>) map, view);
        } else {
            for (Context context2 : new HashSet(this.f9991c.keySet())) {
                m9192a(context2, (Map<View, C3696b>) this.f9991c.get(context2), view);
            }
        }
        m9194b();
    }

    /* renamed from: a */
    private void m9192a(Context context, Map<View, C3696b> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f9870a <= 2) {
                IAlog.m9033a("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f9991c.remove(context);
                Pair pair = this.f9990b.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f9990b.remove(context);
                }
            }
        }
    }

    /* renamed from: b */
    private void m9194b() {
        for (Context next : this.f9991c.keySet()) {
            IAlog.m9034b("%stracking context: %s", m9195c(), next);
            for (View view : this.f9991c.get(next).keySet()) {
                IAlog.m9034b("%stracking view: %s", m9195c(), view);
            }
        }
    }

    /* renamed from: c */
    private static String m9195c() {
        return f9989a + ": ";
    }

    /* renamed from: a */
    static /* synthetic */ void m9193a(C3691w wVar, Context context) {
        WeakHashMap weakHashMap;
        if (context != null && (weakHashMap = wVar.f9991c.get(context)) != null) {
            HashSet a = wVar.f9993e.mo19573a();
            a.addAll(weakHashMap.keySet());
            Iterator it = a.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                C3696b bVar = (C3696b) weakHashMap.get(view);
                float f = 0.0f;
                Rect a2 = wVar.f9992d.mo19573a();
                if (view != null && view.getParent() != null && view.isShown() && view.getGlobalVisibleRect(a2)) {
                    f = ((float) (a2.height() * a2.width())) / ((float) (view.getHeight() * view.getWidth()));
                }
                bVar.mo18474a(f, a2);
                wVar.f9992d.mo19574a(a2);
            }
            a.clear();
            wVar.f9993e.mo19574a(a);
        }
    }
}
