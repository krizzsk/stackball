package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.MediaView;
import kotlin.jvm.internal.Intrinsics;

public abstract class gm0 extends un1<MediaView, dm0> {

    /* renamed from: com.yandex.mobile.ads.impl.gm0$a */
    public enum C13214a {
        WEB_VIEW("webview"),
        f34039d("video"),
        MULTIBANNER("multibanner"),
        f34041f("image"),
        MEDIATION("mediation");
        

        /* renamed from: b */
        private final String f34044b;

        private C13214a(String str) {
            this.f34044b = str;
        }

        /* renamed from: a */
        public final String mo67329a() {
            return this.f34044b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gm0(MediaView mediaView) {
        super(mediaView);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
    }

    /* renamed from: a */
    public abstract void mo65824a(dm0 dm0);

    /* renamed from: e */
    public abstract C13214a mo65827e();
}
