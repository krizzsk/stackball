package com.tapjoy.internal;

import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.ac */
public final class C9054ac {
    /* renamed from: a */
    public static Iterable m24287a(ViewGroup viewGroup) {
        final C9056a aVar = new C9056a(viewGroup);
        return new Iterable() {
            public final Iterator iterator() {
                return aVar;
            }
        };
    }

    /* renamed from: com.tapjoy.internal.ac$a */
    static class C9056a implements Iterator {

        /* renamed from: a */
        private final ViewGroup f22316a;

        /* renamed from: b */
        private int f22317b;

        /* renamed from: c */
        private int f22318c = 0;

        public C9056a(ViewGroup viewGroup) {
            this.f22316a = viewGroup;
            this.f22317b = viewGroup.getChildCount();
        }

        public final boolean hasNext() {
            return this.f22318c < this.f22317b;
        }

        public final void remove() {
            this.f22316a.removeViewAt(this.f22318c - 1);
        }

        public final /* synthetic */ Object next() {
            ViewGroup viewGroup = this.f22316a;
            int i = this.f22318c;
            this.f22318c = i + 1;
            return viewGroup.getChildAt(i);
        }
    }
}
