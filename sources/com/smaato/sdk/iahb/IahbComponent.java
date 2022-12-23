package com.smaato.sdk.iahb;

import com.smaato.sdk.inject.Component;

@Component
abstract class IahbComponent {
    /* access modifiers changed from: package-private */
    public abstract IahbInteractor interactor();

    IahbComponent() {
    }
}
