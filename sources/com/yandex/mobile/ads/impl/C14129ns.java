package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import com.yandex.mobile.ads.impl.C14011ms;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ns */
public final class C14129ns extends C14130nt {

    /* renamed from: a */
    final /* synthetic */ C14628ss f37903a;

    /* renamed from: b */
    final /* synthetic */ Uri f37904b;

    /* renamed from: c */
    final /* synthetic */ C14011ms f37905c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14129ns(C13513jm jmVar, C14628ss ssVar, Uri uri, C14011ms msVar) {
        super(jmVar);
        this.f37903a = ssVar;
        this.f37904b = uri;
        this.f37905c = msVar;
    }

    /* renamed from: a */
    public void mo67624a(C15163xd xdVar) {
        Intrinsics.checkNotNullParameter(xdVar, "cachedBitmap");
        this.f37903a.setGifUrl$div_release(this.f37904b);
        if (Build.VERSION.SDK_INT >= 28) {
            C14011ms msVar = this.f37905c;
            C14628ss ssVar = this.f37903a;
            msVar.getClass();
            new C14011ms.C14012a(new WeakReference(ssVar), xdVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        this.f37903a.setImage(xdVar.mo70883a());
        this.f37903a.mo68443g();
    }
}
