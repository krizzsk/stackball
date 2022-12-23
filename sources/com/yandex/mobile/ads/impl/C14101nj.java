package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.nj */
public final class C14101nj implements Runnable {

    /* renamed from: b */
    private String f37812b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final kj0 f37813c;

    /* renamed from: d */
    private final boolean f37814d;

    /* renamed from: com.yandex.mobile.ads.impl.nj$a */
    static final class C14102a extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        final /* synthetic */ C14101nj f37815b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f37816c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14102a(C14101nj njVar, Bitmap bitmap) {
            super(0);
            this.f37815b = njVar;
            this.f37816c = bitmap;
        }

        public Object invoke() {
            if (!this.f37815b.f37813c.mo68240e()) {
                this.f37815b.f37813c.setPreview(this.f37816c);
            }
            this.f37815b.f37813c.mo68239d();
            return Unit.INSTANCE;
        }
    }

    public C14101nj(String str, kj0 kj0, boolean z) {
        Intrinsics.checkNotNullParameter(str, "base64string");
        Intrinsics.checkNotNullParameter(kj0, "targetView");
        this.f37812b = str;
        this.f37813c = kj0;
        this.f37814d = z;
    }

    public void run() {
        String str = this.f37812b;
        if (StringsKt.startsWith$default(str, "data:", false, 2, (Object) null)) {
            str = str.substring(StringsKt.indexOf$default((CharSequence) str, ',', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        }
        this.f37812b = str;
        try {
            byte[] decode = Base64.decode(str, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                C14102a aVar = new C14102a(this, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                if (this.f37814d) {
                    aVar.invoke();
                } else {
                    mg1.f37373a.mo68688a(aVar);
                }
            } catch (IllegalArgumentException unused) {
                ii0 ii0 = ii0.f34887a;
            }
        } catch (IllegalArgumentException unused2) {
            ii0 ii02 = ii0.f34887a;
        }
    }
}
