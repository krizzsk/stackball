package com.yandex.metrica.impl.p265ob;

import android.content.pm.FeatureInfo;

/* renamed from: com.yandex.metrica.impl.ob.Yb */
public abstract class C10953Yb {

    /* renamed from: com.yandex.metrica.impl.ob.Yb$a */
    public static class C10954a extends C10953Yb {
        /* renamed from: b */
        public C10988Zb mo62533b(FeatureInfo featureInfo) {
            return new C10988Zb(featureInfo.name, featureInfo.version, mo62534c(featureInfo));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Yb$b */
    public static class C10955b extends C10953Yb {
        /* renamed from: b */
        public C10988Zb mo62533b(FeatureInfo featureInfo) {
            return new C10988Zb(featureInfo.name, -1, mo62534c(featureInfo));
        }
    }

    /* renamed from: a */
    public C10988Zb mo62532a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo62533b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return mo62533b(featureInfo);
        }
        return new C10988Zb("openGlFeature", i, mo62534c(featureInfo));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C10988Zb mo62533b(FeatureInfo featureInfo);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo62534c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
