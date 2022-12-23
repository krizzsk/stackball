package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.p265ob.C11962y;

/* renamed from: com.yandex.metrica.impl.ob.i0 */
public final class C11328i0 {

    /* renamed from: a */
    private Context f27085a;

    /* renamed from: b */
    private final C11962y.C11964b f27086b;

    /* renamed from: c */
    private final C11962y f27087c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final IReporter f27088d;

    /* renamed from: com.yandex.metrica.impl.ob.i0$a */
    static final class C11329a implements C11962y.C11964b {

        /* renamed from: a */
        final /* synthetic */ C11328i0 f27089a;

        C11329a(C11328i0 i0Var) {
            this.f27089a = i0Var;
        }

        /* renamed from: a */
        public final void mo61122a(Activity activity, C11962y.C11963a aVar) {
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                this.f27089a.f27088d.resumeSession();
            } else if (ordinal == 2) {
                this.f27089a.f27088d.pauseSession();
            }
        }
    }

    public C11328i0(C11962y yVar) {
        this(yVar, (IReporter) null, 2);
    }

    public C11328i0(C11962y yVar, IReporter iReporter) {
        this.f27087c = yVar;
        this.f27088d = iReporter;
        this.f27086b = new C11329a(this);
    }

    /* renamed from: a */
    public final synchronized void mo63025a(Context context) {
        if (this.f27085a == null) {
            Context applicationContext = context.getApplicationContext();
            this.f27087c.mo64106a(applicationContext);
            this.f27087c.mo64107a(this.f27086b, C11962y.C11963a.RESUMED, C11962y.C11963a.PAUSED);
            this.f27085a = applicationContext;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C11328i0(com.yandex.metrica.impl.p265ob.C11962y r1, com.yandex.metrica.IReporter r2, int r3) {
        /*
            r0 = this;
            r2 = r3 & 2
            if (r2 == 0) goto L_0x000e
            com.yandex.metrica.impl.ob.W0 r2 = com.yandex.metrica.impl.p265ob.C10611Oh.m27142a()
            java.lang.String r3 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11328i0.<init>(com.yandex.metrica.impl.ob.y, com.yandex.metrica.IReporter, int):void");
    }
}
