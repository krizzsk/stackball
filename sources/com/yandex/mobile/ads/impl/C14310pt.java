package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.mobile.ads.impl.ad0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.pt */
public final class C14310pt implements C14213ot {

    /* renamed from: a */
    private final ad0 f38823a;

    /* renamed from: b */
    private final fk0 f38824b = new fk0();

    /* renamed from: com.yandex.mobile.ads.impl.pt$a */
    public static final class C14311a implements ad0.C12379e {

        /* renamed from: a */
        final /* synthetic */ wc0 f38825a;

        /* renamed from: b */
        final /* synthetic */ String f38826b;

        C14311a(wc0 wc0, String str) {
            this.f38825a = wc0;
            this.f38826b = str;
        }

        /* renamed from: a */
        public void mo64579a(op1 op1) {
            this.f38825a.mo69641a();
        }

        /* renamed from: a */
        public void mo65735a(ad0.C12378d dVar, boolean z) {
            Bitmap b = dVar.mo65734b();
            if (b != null) {
                this.f38825a.mo67624a(new C15163xd(b, (byte[]) null, Uri.parse(this.f38826b), z ? bd0.MEMORY : bd0.NETWORK));
            }
        }
    }

    public C14310pt(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ad0 a = mv0.m39740c(context).mo68859a();
        Intrinsics.checkNotNullExpressionValue(a, "getInstance(context).imageLoader");
        this.f38823a = a;
    }

    /* renamed from: c */
    private final ij0 m40958c(String str, wc0 wc0) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.f38824b.mo67024a(new Runnable(this, str, wc0) {
            public final /* synthetic */ C14310pt f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ wc0 f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C14310pt.m40957a(Ref.ObjectRef.this, this.f$1, this.f$2, this.f$3);
            }
        });
        return new ij0() {
            /* renamed from: a */
            public final void mo65575a() {
                C14310pt.m40956a(Ref.ObjectRef.this);
            }
        };
    }

    /* renamed from: a */
    public ij0 mo69264a(String str, wc0 wc0) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(wc0, "callback");
        return m40958c(str, wc0);
    }

    /* renamed from: b */
    public ij0 mo69265b(String str, wc0 wc0) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(wc0, "callback");
        return m40958c(str, wc0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m40957a(Ref.ObjectRef objectRef, C14310pt ptVar, String str, wc0 wc0) {
        Intrinsics.checkNotNullParameter(objectRef, "$imageContainer");
        Intrinsics.checkNotNullParameter(ptVar, "this$0");
        Intrinsics.checkNotNullParameter(str, "$imageUrl");
        Intrinsics.checkNotNullParameter(wc0, "$callback");
        objectRef.element = ptVar.f38823a.mo65722a(str, (ad0.C12379e) new C14311a(wc0, str), 0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m40956a(Ref.ObjectRef objectRef) {
        Intrinsics.checkNotNullParameter(objectRef, "$imageContainer");
        ad0.C12378d dVar = (ad0.C12378d) objectRef.element;
        if (dVar != null) {
            dVar.mo65733a();
        }
    }
}
