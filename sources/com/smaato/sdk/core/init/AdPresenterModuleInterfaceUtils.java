package com.smaato.sdk.core.init;

import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.NullableFunction;
import java.util.ArrayList;
import java.util.List;

public final class AdPresenterModuleInterfaceUtils {
    private AdPresenterModuleInterfaceUtils() {
    }

    public static List<AdPresenterModuleInterface> getValidModuleInterfaces(String str, Iterable<AdPresenterModuleInterface> iterable) {
        ArrayList arrayList = new ArrayList();
        for (AdPresenterModuleInterface next : iterable) {
            if (next.version().equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static List<DiRegistry> getDiOfModules(AdPresenterNameShaper adPresenterNameShaper, List<AdPresenterModuleInterface> list) {
        Objects.requireNonNull(list);
        return Lists.mapLazy(list, new NullableFunction() {
            public final Object apply(Object obj) {
                return AdPresenterModuleInterfaceUtils.lambda$getDiOfModules$0(AdPresenterNameShaper.this, (AdPresenterModuleInterface) obj);
            }
        });
    }

    static /* synthetic */ DiRegistry lambda$getDiOfModules$0(AdPresenterNameShaper adPresenterNameShaper, AdPresenterModuleInterface adPresenterModuleInterface) {
        AdPresenterModuleInterface adPresenterModuleInterface2 = (AdPresenterModuleInterface) Objects.requireNonNull(adPresenterModuleInterface);
        Objects.requireNonNull(adPresenterModuleInterface2);
        return DiRegistry.m24065of(new Consumer() {
            public final void accept(Object obj) {
                ((DiRegistry) obj).registerFactory(AdPresenterModuleInterface.this.moduleDiName(), AdLoaderPlugin.class, (ClassFactory) Objects.requireNonNull(AdPresenterModuleInterface.this.getAdLoaderPluginFactory()));
            }
        }).addFrom(adPresenterModuleInterface2.moduleDiRegistry()).addFrom(adPresenterModuleInterface2.moduleAdPresenterDiRegistry(adPresenterNameShaper));
    }
}
