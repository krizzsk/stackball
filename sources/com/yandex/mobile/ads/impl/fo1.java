package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class fo1 {

    /* renamed from: a */
    private final C13084b f33467a;

    /* renamed from: b */
    private final g11 f33468b = new g11();

    /* renamed from: c */
    private final C13083a f33469c = new C13083a(this);

    /* renamed from: d */
    private final Handler f33470d = new Handler(Looper.getMainLooper());

    /* renamed from: com.yandex.mobile.ads.impl.fo1$a */
    private final class C13083a implements Runnable {

        /* renamed from: b */
        private boolean f33471b;

        /* renamed from: c */
        final /* synthetic */ fo1 f33472c;

        public C13083a(fo1 fo1) {
            Intrinsics.checkNotNullParameter(fo1, "this$0");
            this.f33472c = fo1;
        }

        /* renamed from: a */
        public final void mo67058a(Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            if (!this.f33471b) {
                handler.post(this);
                this.f33471b = true;
            }
        }

        public void run() {
            this.f33472c.mo67054a();
            this.f33471b = false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fo1$b */
    public interface C13084b {

        /* renamed from: a */
        public static final C13084b f33473a = new C13085a();

        /* renamed from: com.yandex.mobile.ads.impl.fo1$b$a */
        public static final class C13085a implements C13084b {
            C13085a() {
            }

            /* renamed from: a */
            public void mo67060a(String str, Map<String, ? extends Object> map) {
                Intrinsics.checkNotNullParameter(str, "message");
                Intrinsics.checkNotNullParameter(map, IronSourceConstants.EVENTS_RESULT);
            }
        }

        /* renamed from: a */
        void mo67060a(String str, Map<String, ? extends Object> map);
    }

    public fo1(C13084b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "reporter");
        this.f33467a = bVar;
    }

    /* renamed from: a */
    public final void mo67055a(long j) {
        synchronized (this.f33468b) {
            this.f33468b.mo67149a(j);
            this.f33469c.mo67058a(this.f33470d);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final void mo67057b(long j) {
        synchronized (this.f33468b) {
            this.f33468b.mo67152b(j);
            this.f33469c.mo67058a(this.f33470d);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo67056a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "viewName");
        synchronized (this.f33468b) {
            this.f33468b.mo67150a(str, j);
            this.f33469c.mo67058a(this.f33470d);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo67054a() {
        synchronized (this.f33468b) {
            if (this.f33468b.mo67153c()) {
                this.f33467a.mo67060a("view pool profiling", this.f33468b.mo67151b());
            }
            this.f33468b.mo67148a();
            Unit unit = Unit.INSTANCE;
        }
    }
}
