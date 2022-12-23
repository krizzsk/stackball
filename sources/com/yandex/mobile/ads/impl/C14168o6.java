package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.collection.ArrayMap;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.o6 */
public final class C14168o6 implements eo1 {

    /* renamed from: a */
    private final fo1 f38095a;

    /* renamed from: b */
    private final zn1 f38096b;

    /* renamed from: c */
    private final Map<String, C14169a<? extends View>> f38097c = new ArrayMap();

    /* renamed from: com.yandex.mobile.ads.impl.o6$a */
    public static final class C14169a<T extends View> {

        /* renamed from: a */
        private final String f38098a;

        /* renamed from: b */
        private final fo1 f38099b;

        /* renamed from: c */
        private final ao1<T> f38100c;

        /* renamed from: d */
        private final zn1 f38101d;

        /* renamed from: e */
        private final BlockingQueue<T> f38102e;

        /* renamed from: f */
        private final AtomicBoolean f38103f = new AtomicBoolean(false);

        /* renamed from: g */
        private final boolean f38104g;

        public C14169a(String str, fo1 fo1, ao1<T> ao1, zn1 zn1, int i) {
            Intrinsics.checkNotNullParameter(str, "viewName");
            Intrinsics.checkNotNullParameter(ao1, "viewFactory");
            Intrinsics.checkNotNullParameter(zn1, "viewCreator");
            this.f38098a = str;
            this.f38099b = fo1;
            this.f38100c = ao1;
            this.f38101d = zn1;
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i, false);
            this.f38102e = arrayBlockingQueue;
            this.f38104g = !arrayBlockingQueue.isEmpty();
            int i2 = 0;
            while (i2 < i) {
                i2++;
                this.f38101d.mo71259a(this, 0);
            }
        }

        /* renamed from: a */
        public final void mo69120a() {
            if (!this.f38103f.get()) {
                try {
                    T a = this.f38100c.mo65489a();
                    Intrinsics.checkNotNullExpressionValue(a, "viewFactory.createView()");
                    this.f38102e.offer(a);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public final T mo69121b() {
            long nanoTime = System.nanoTime();
            T poll = this.f38102e.poll();
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (poll == null) {
                long nanoTime3 = System.nanoTime();
                try {
                    this.f38101d.mo71258a(this);
                    poll = (View) this.f38102e.poll(16, TimeUnit.MILLISECONDS);
                    if (poll == null) {
                        poll = this.f38100c.mo65489a();
                        Intrinsics.checkNotNullExpressionValue(poll, "viewFactory.createView()");
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    poll = this.f38100c.mo65489a();
                    Intrinsics.checkNotNullExpressionValue(poll, "{\n                Thread…reateView()\n            }");
                }
                long nanoTime4 = System.nanoTime() - nanoTime3;
                fo1 fo1 = this.f38099b;
                if (fo1 != null) {
                    fo1.mo67056a(this.f38098a, nanoTime4);
                }
            } else {
                fo1 fo12 = this.f38099b;
                if (fo12 != null) {
                    fo12.mo67055a(nanoTime2);
                }
            }
            long nanoTime5 = System.nanoTime();
            this.f38101d.mo71259a(this, this.f38102e.size());
            long nanoTime6 = System.nanoTime() - nanoTime5;
            fo1 fo13 = this.f38099b;
            if (fo13 != null) {
                fo13.mo67057b(nanoTime6);
            }
            Intrinsics.checkNotNull(poll);
            return (View) poll;
        }

        /* renamed from: c */
        public final boolean mo69122c() {
            return this.f38104g;
        }

        /* renamed from: d */
        public final String mo69123d() {
            return this.f38098a;
        }
    }

    public C14168o6(fo1 fo1, zn1 zn1) {
        Intrinsics.checkNotNullParameter(zn1, "viewCreator");
        this.f38095a = fo1;
        this.f38096b = zn1;
    }

    /* renamed from: a */
    public <T extends View> void mo65947a(String str, ao1<T> ao1, int i) {
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(ao1, "factory");
        synchronized (this.f38097c) {
            if (!this.f38097c.containsKey(str)) {
                this.f38097c.put(str, new C14169a(str, this.f38095a, ao1, this.f38096b, i));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: a */
    public <T extends View> T mo65946a(String str) {
        C14169a aVar;
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TAG_KEY);
        synchronized (this.f38097c) {
            Map<String, C14169a<? extends View>> map = this.f38097c;
            Intrinsics.checkNotNullParameter(map, "<this>");
            C14169a<? extends View> aVar2 = map.get(str);
            if (aVar2 != null) {
                aVar = aVar2;
            } else {
                throw new NoSuchElementException("Factory is not registered");
            }
        }
        return aVar.mo69121b();
    }
}
