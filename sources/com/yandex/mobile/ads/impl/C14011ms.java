package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p271io.FilesKt;

/* renamed from: com.yandex.mobile.ads.impl.ms */
public final class C14011ms {

    /* renamed from: a */
    private final C14624so f37498a;

    /* renamed from: b */
    private final C14213ot f37499b;

    /* renamed from: c */
    private final C13903lw f37500c;

    /* renamed from: com.yandex.mobile.ads.impl.ms$a */
    public static final class C14012a extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a */
        private final WeakReference<C14628ss> f37501a;

        /* renamed from: b */
        private final C15163xd f37502b;

        public C14012a(WeakReference<C14628ss> weakReference, C15163xd xdVar) {
            Intrinsics.checkNotNullParameter(weakReference, "view");
            Intrinsics.checkNotNullParameter(xdVar, "cachedBitmap");
            this.f37501a = weakReference;
            this.f37502b = xdVar;
        }

        /* renamed from: a */
        private final Drawable m39723a() throws IOException, IllegalStateException {
            byte[] b = this.f37502b.mo70884b();
            if (b != null) {
                C14628ss ssVar = (C14628ss) this.f37501a.get();
                Context context = ssVar == null ? null : ssVar.getContext();
                if (context != null) {
                    File createTempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
                    try {
                        Intrinsics.checkNotNullExpressionValue(createTempFile, "tempFile");
                        FilesKt.writeBytes(createTempFile, b);
                        ImageDecoder.Source createSource = ImageDecoder.createSource(createTempFile);
                        Intrinsics.checkNotNullExpressionValue(createSource, "createSource(tempFile)");
                        Drawable decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                        Intrinsics.checkNotNullExpressionValue(decodeDrawable, "{\n                tempFi…ble(source)\n            }");
                        return decodeDrawable;
                    } finally {
                        createTempFile.delete();
                    }
                } else {
                    throw new IllegalStateException("failed retrieve context");
                }
            } else {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0022 A[SYNTHETIC, Splitter:B:12:0x0022] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[SYNTHETIC, Splitter:B:19:0x0034] */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r3) {
            /*
                r2 = this;
                java.lang.Void[] r3 = (java.lang.Void[]) r3
                java.lang.String r0 = "params"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r3 = 0
                android.graphics.drawable.Drawable r3 = r2.m39723a()     // Catch:{ IOException -> 0x0010, IllegalStateException -> 0x000d }
                goto L_0x003b
            L_0x000d:
                com.yandex.mobile.ads.impl.ii0 r0 = com.yandex.mobile.ads.impl.ii0.f34887a
                goto L_0x0012
            L_0x0010:
                com.yandex.mobile.ads.impl.ii0 r0 = com.yandex.mobile.ads.impl.ii0.f34887a
            L_0x0012:
                com.yandex.mobile.ads.impl.xd r0 = r2.f37502b
                android.net.Uri r0 = r0.mo70885c()
                if (r0 != 0) goto L_0x001c
                r0 = r3
                goto L_0x0020
            L_0x001c:
                java.lang.String r0 = r0.getPath()
            L_0x0020:
                if (r0 == 0) goto L_0x002f
                java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x002c }
                r1.<init>(r0)     // Catch:{ IOException -> 0x002c }
                android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r1)     // Catch:{ IOException -> 0x002c }
                goto L_0x0032
            L_0x002c:
                com.yandex.mobile.ads.impl.ii0 r0 = com.yandex.mobile.ads.impl.ii0.f34887a
                goto L_0x0031
            L_0x002f:
                com.yandex.mobile.ads.impl.ii0 r0 = com.yandex.mobile.ads.impl.ii0.f34887a
            L_0x0031:
                r0 = r3
            L_0x0032:
                if (r0 == 0) goto L_0x003b
                android.graphics.drawable.Drawable r3 = android.graphics.ImageDecoder.decodeDrawable(r0)     // Catch:{ IOException -> 0x0039 }
                goto L_0x003b
            L_0x0039:
                com.yandex.mobile.ads.impl.ii0 r0 = com.yandex.mobile.ads.impl.ii0.f34887a
            L_0x003b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14011ms.C14012a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public void onPostExecute(Object obj) {
            Drawable drawable = (Drawable) obj;
            super.onPostExecute(drawable);
            if (drawable == null || !(drawable instanceof AnimatedImageDrawable)) {
                C14628ss ssVar = (C14628ss) this.f37501a.get();
                if (ssVar != null) {
                    ssVar.setImage(this.f37502b.mo70883a());
                }
            } else {
                C14628ss ssVar2 = (C14628ss) this.f37501a.get();
                if (ssVar2 != null) {
                    ssVar2.setImage(drawable);
                }
            }
            C14628ss ssVar3 = (C14628ss) this.f37501a.get();
            if (ssVar3 != null) {
                ssVar3.mo68443g();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ms$b */
    static final class C14013b extends Lambda implements Function1<C14709tt, Unit> {

        /* renamed from: b */
        final /* synthetic */ C14628ss f37503b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14013b(C14628ss ssVar) {
            super(1);
            this.f37503b = ssVar;
        }

        public Object invoke(Object obj) {
            C14709tt ttVar = (C14709tt) obj;
            Intrinsics.checkNotNullParameter(ttVar, "scale");
            this.f37503b.setImageScale(C14175ob.m40333a(ttVar));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ms$c */
    static final class C14014c extends Lambda implements Function1<Uri, Unit> {

        /* renamed from: b */
        final /* synthetic */ C14011ms f37504b;

        /* renamed from: c */
        final /* synthetic */ C14628ss f37505c;

        /* renamed from: d */
        final /* synthetic */ C13513jm f37506d;

        /* renamed from: e */
        final /* synthetic */ j50 f37507e;

        /* renamed from: f */
        final /* synthetic */ C13885ls f37508f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14014c(C14011ms msVar, C14628ss ssVar, C13513jm jmVar, j50 j50, C13885ls lsVar) {
            super(1);
            this.f37504b = msVar;
            this.f37505c = ssVar;
            this.f37506d = jmVar;
            this.f37507e = j50;
            this.f37508f = lsVar;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((Uri) obj, "it");
            C14011ms.m39721a(this.f37504b, this.f37505c, this.f37506d, this.f37507e, this.f37508f);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C14011ms(C14624so soVar, C14213ot otVar, C13903lw lwVar) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(otVar, "imageLoader");
        Intrinsics.checkNotNullParameter(lwVar, "placeholderLoader");
        this.f37498a = soVar;
        this.f37499b = otVar;
        this.f37500c = lwVar;
    }

    /* renamed from: a */
    public static final void m39721a(C14011ms msVar, C14628ss ssVar, C13513jm jmVar, j50 j50, C13885ls lsVar) {
        msVar.getClass();
        Uri a = lsVar.f36890q.mo66924a(j50);
        if (!ssVar.mo68240e() || !Intrinsics.areEqual((Object) a, (Object) ssVar.mo70051i())) {
            if (!Intrinsics.areEqual((Object) a, (Object) ssVar.mo70051i())) {
                ssVar.mo70052j();
            }
            C13903lw lwVar = msVar.f37500c;
            f50<String> f50 = lsVar.f36898y;
            lwVar.mo68520a(ssVar, f50 == null ? null : f50.mo66924a(j50), lsVar.f36896w.mo66924a(j50).intValue(), false);
            ij0 b = msVar.f37499b.mo69265b(a.toString(), new C14129ns(jmVar, ssVar, a, msVar));
            Intrinsics.checkNotNullExpressionValue(b, "private fun DivGifImageV…ce(reference, this)\n    }");
            jmVar.mo68028a(b, (View) ssVar);
        }
    }

    /* renamed from: a */
    public void mo68854a(C14628ss ssVar, C13885ls lsVar, C13513jm jmVar) {
        f50<Double> f50;
        Intrinsics.checkNotNullParameter(ssVar, "view");
        Intrinsics.checkNotNullParameter(lsVar, "div");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        C13885ls h = ssVar.mo70050h();
        if (!Intrinsics.areEqual((Object) lsVar, (Object) h)) {
            j50 b = jmVar.mo66388b();
            ssVar.mo65871b();
            ssVar.setDiv$div_release(lsVar);
            if (h != null) {
                this.f37498a.mo70038a((View) ssVar, (C14697tn) h, jmVar);
            }
            this.f37498a.mo70039a((View) ssVar, (C14697tn) lsVar, (C14697tn) h, jmVar);
            C14175ob.m40337a(ssVar, jmVar, lsVar.f36875b, lsVar.f36877d, lsVar.f36893t, lsVar.f36887n, lsVar.f36876c);
            C14298pn pnVar = lsVar.f36881h;
            if (pnVar == null) {
                f50 = null;
            } else {
                f50 = pnVar.f38748a;
            }
            if (f50 == null) {
                ssVar.setAspectRatio(0.0f);
            } else {
                ssVar.mo65870a(pnVar.f38748a.mo66925b(b, new C14212os(ssVar)));
            }
            ssVar.mo65870a(lsVar.f36864A.mo66925b(b, new C14013b(ssVar)));
            f50<C13215gn> f502 = lsVar.f36885l;
            f50<C13332hn> f503 = lsVar.f36886m;
            ssVar.setGravity(C14175ob.m40325a(f502.mo66924a(b), f503.mo66924a(b)));
            C14628ss ssVar2 = ssVar;
            C14308ps psVar = new C14308ps(this, ssVar2, b, f502, f503);
            ssVar.mo65870a(f502.mo66923a(b, psVar));
            ssVar.mo65870a(f503.mo66923a(b, psVar));
            ssVar.mo65870a(lsVar.f36890q.mo66925b(b, new C14014c(this, ssVar2, jmVar, b, lsVar)));
        }
    }
}
