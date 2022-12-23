package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: com.inmobi.media.ef */
/* compiled from: NativeDataSource */
final class C5156ef extends PagerAdapter implements C5179el {

    /* renamed from: a */
    private static final String f11836a = C5156ef.class.getSimpleName();

    /* renamed from: e */
    private static Handler f11837e = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f11838b;

    /* renamed from: c */
    private final C5016bj f11839c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5162eh f11840d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SparseArray<Runnable> f11841f = new SparseArray<>();

    C5156ef(C5016bj bjVar, C5162eh ehVar) {
        this.f11839c = bjVar;
        this.f11840d = ehVar;
    }

    public final int getItemPosition(Object obj) {
        Object tag = obj == null ? null : ((View) obj).getTag();
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -2;
    }

    public final int getCount() {
        return this.f11839c.mo40184c();
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C5012bh a = this.f11839c.mo40180a(i);
        if (a == null) {
            return null;
        }
        ViewGroup a2 = this.f11840d.mo40456a(viewGroup, a);
        int abs = Math.abs(this.f11840d.f11856a - i);
        final int i2 = i;
        final ViewGroup viewGroup2 = a2;
        final ViewGroup viewGroup3 = viewGroup;
        final C5012bh bhVar = a;
        C51582 r1 = new Runnable() {
            public final void run() {
                if (!C5156ef.this.f11838b) {
                    C5156ef.this.f11841f.remove(i2);
                    C5156ef.this.f11840d.mo40459b(viewGroup2, bhVar);
                }
            }
        };
        this.f11841f.put(i, r1);
        f11837e.postDelayed(r1, (long) (abs * 50));
        a2.setLayoutParams(C5198eq.m11897a((C5010bf) a, viewGroup));
        a2.setTag(Integer.valueOf(i));
        viewGroup.addView(a2);
        return a2;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, final Object obj) {
        viewGroup.removeView((View) obj);
        Runnable runnable = this.f11841f.get(i);
        if (runnable != null) {
            f11837e.removeCallbacks(runnable);
            C5198eq.class.getSimpleName();
        }
        f11837e.post(new Runnable() {
            public final void run() {
                C5156ef.this.f11840d.f11858c.mo40539a((View) obj);
            }
        });
    }

    public final void destroy() {
        this.f11838b = true;
        int size = this.f11841f.size();
        for (int i = 0; i < size; i++) {
            f11837e.removeCallbacks(this.f11841f.get(this.f11841f.keyAt(i)));
        }
        this.f11841f.clear();
    }
}
