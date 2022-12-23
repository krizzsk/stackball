package com.smaato.sdk.util;

import java.util.Collection;

public interface Disposable {
    void addTo(Collection<Disposable> collection);

    void dispose();

    /* renamed from: com.smaato.sdk.util.Disposable$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$addTo(Disposable _this, Collection collection) {
            if (collection != null) {
                collection.add(_this);
                return;
            }
            throw new NullPointerException("'disposables' specified as non-null is null");
        }
    }
}
