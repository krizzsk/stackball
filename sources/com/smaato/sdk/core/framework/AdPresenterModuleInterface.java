package com.smaato.sdk.core.framework;

import com.smaato.sdk.core.configcheck.ExpectedManifestEntries;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiRegistry;

public interface AdPresenterModuleInterface extends BaseModuleInterface {
    ClassFactory<AdLoaderPlugin> getAdLoaderPluginFactory();

    ExpectedManifestEntries getExpectedManifestEntries();

    boolean isFormatSupported(AdFormat adFormat, Class<? extends AdPresenter> cls);

    DiRegistry moduleAdPresenterDiRegistry(AdPresenterNameShaper adPresenterNameShaper);

    String moduleDiName();

    DiRegistry moduleDiRegistry();

    String version();
}
