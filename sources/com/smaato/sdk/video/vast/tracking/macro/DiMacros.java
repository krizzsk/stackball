package com.smaato.sdk.video.vast.tracking.macro;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.p248ad.RequestInfoProvider;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.video.utils.DateFormatUtils;
import com.smaato.sdk.video.utils.RandomUtils;
import com.smaato.sdk.video.utils.UriUtils;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.macro.ClickInfoMacros;
import com.smaato.sdk.video.vast.tracking.macro.PlayerStateInfoMacros;

public final class DiMacros {

    interface AdBreakInfoMacrosProvider extends NullableArgumentFunction<VastScenario, AdBreakInfoMacros> {
    }

    interface PlayerStateInfoMacrosProvider extends NullableArgumentFunction<VastScenario, PlayerStateInfoMacros> {
    }

    private DiMacros() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiMacros$IFiSjqlOwyHD6Www3DGbsAmMxqg.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$17(DiRegistry diRegistry) {
        diRegistry.registerFactory(MacrosInjectorProviderFunction.class, $$Lambda$DiMacros$z8oMUcb0YrGMxzsglePdfCJhVk.INSTANCE);
        diRegistry.registerFactory(UriUtils.class, $$Lambda$DiMacros$ZpmIrQ8PvbHFNYXS37o3VOcGo0.INSTANCE);
        diRegistry.registerFactory(DateFormatUtils.class, $$Lambda$DiMacros$cBZuXEoZyc7g_QQCqVydbCZlA.INSTANCE);
        diRegistry.registerFactory(RandomUtils.class, $$Lambda$DiMacros$HCAlgke5pHqEFYYotBUsWv_iGI.INSTANCE);
        diRegistry.registerFactory(AdBreakInfoMacrosProvider.class, $$Lambda$DiMacros$Z9ljXnl_Gjdj6op8udWKI4ju20Y.INSTANCE);
        diRegistry.registerFactory(CapabilitiesInfoMacro.class, $$Lambda$DiMacros$f2kP9qiFFlkO0yIZjhy3qA8hqA.INSTANCE);
        diRegistry.registerFactory(ClientInfoMacros.class, $$Lambda$DiMacros$TTk8seIOjlIB9WO1pFg_zLLLO4.INSTANCE);
        diRegistry.registerFactory(GenericMacros.class, $$Lambda$DiMacros$n1JO9t2I5RSg53_sZprjih_ioI.INSTANCE);
        diRegistry.registerFactory(PlayerStateInfoMacrosProvider.class, $$Lambda$DiMacros$LawpJaGrHKaVg5TFXgcfvo8Qwg.INSTANCE);
        diRegistry.registerFactory(PublisherInfoMacro.class, $$Lambda$DiMacros$NibR3BZxI0JcAzU3aevu2fTaXzY.INSTANCE);
        diRegistry.registerFactory(RegulationInfoMacros.class, $$Lambda$DiMacros$Sl8sqsxeGbAuxe2t91y_vy3ciE.INSTANCE);
        diRegistry.registerFactory(VerificationInfoMacros.class, $$Lambda$DiMacros$8ASb8enZJh6urgg4FnbQTjN38lc.INSTANCE);
        diRegistry.registerFactory(ErrorInfoMacros.class, $$Lambda$DiMacros$_lDuiMNEMZCVt7Ra38UdgaQQGWk.INSTANCE);
        diRegistry.addFrom(DiRegistry.m24065of($$Lambda$DiMacros$iDJ3QUJj0nBnxSRXUrBjg7WC1eE.INSTANCE));
    }

    static /* synthetic */ MacroInjector lambda$null$0(DiConstructor diConstructor, VastScenario vastScenario) {
        return new MacroInjector((UriUtils) diConstructor.get(UriUtils.class), (AdBreakInfoMacros) ((AdBreakInfoMacrosProvider) diConstructor.get(AdBreakInfoMacrosProvider.class)).apply(vastScenario), (CapabilitiesInfoMacro) diConstructor.get(CapabilitiesInfoMacro.class), (ClientInfoMacros) diConstructor.get(ClientInfoMacros.class), (GenericMacros) diConstructor.get(GenericMacros.class), (PlayerStateInfoMacros) ((PlayerStateInfoMacrosProvider) diConstructor.get(PlayerStateInfoMacrosProvider.class)).apply(vastScenario), (PublisherInfoMacro) diConstructor.get(PublisherInfoMacro.class), (RegulationInfoMacros) diConstructor.get(RegulationInfoMacros.class), (VerificationInfoMacros) diConstructor.get(VerificationInfoMacros.class), (ClickInfoMacros) diConstructor.get(ClickInfoMacros.class), (ErrorInfoMacros) diConstructor.get(ErrorInfoMacros.class));
    }

    static /* synthetic */ MacrosInjectorProviderFunction lambda$null$1(DiConstructor diConstructor) {
        return new MacrosInjectorProviderFunction() {
            public final Object apply(Object obj) {
                return DiMacros.lambda$null$0(DiConstructor.this, (VastScenario) obj);
            }
        };
    }

    static /* synthetic */ UriUtils lambda$null$2(DiConstructor diConstructor) {
        return new UriUtils();
    }

    static /* synthetic */ DateFormatUtils lambda$null$3(DiConstructor diConstructor) {
        return new DateFormatUtils();
    }

    static /* synthetic */ RandomUtils lambda$null$4(DiConstructor diConstructor) {
        return new RandomUtils();
    }

    static /* synthetic */ AdBreakInfoMacros lambda$null$5(DiConstructor diConstructor, VastScenario vastScenario) {
        return new AdBreakInfoMacros((DateFormatUtils) diConstructor.get(DateFormatUtils.class), vastScenario, vastScenario == null ? null : vastScenario.vastMediaFileScenario.vastScenarioCreativeData.universalAdId);
    }

    static /* synthetic */ AdBreakInfoMacrosProvider lambda$null$6(DiConstructor diConstructor) {
        return new AdBreakInfoMacrosProvider() {
            public final Object apply(Object obj) {
                return DiMacros.lambda$null$5(DiConstructor.this, (VastScenario) obj);
            }
        };
    }

    static /* synthetic */ CapabilitiesInfoMacro lambda$null$7(DiConstructor diConstructor) {
        return new CapabilitiesInfoMacro();
    }

    static /* synthetic */ ClientInfoMacros lambda$null$8(DiConstructor diConstructor) {
        return new ClientInfoMacros((DataCollector) diConstructor.get(DataCollector.class), (RequestInfoProvider) diConstructor.get(RequestInfoProvider.class), (SdkConfiguration) diConstructor.get(SdkConfiguration.class));
    }

    static /* synthetic */ GenericMacros lambda$null$9(DiConstructor diConstructor) {
        return new GenericMacros((DateFormatUtils) diConstructor.get(DateFormatUtils.class), (RandomUtils) diConstructor.get(RandomUtils.class));
    }

    static /* synthetic */ PlayerStateInfoMacros lambda$null$11(DiConstructor diConstructor, VastScenario vastScenario) {
        $$Lambda$DiMacros$JljvxTEXWIJl9msHvBWSUlZFBeY r1 = new PlayerStateInfoMacros.ScreenSizeProvider() {
            public final Object get() {
                return UIUtils.getDisplaySizeInDp((Context) DiConstructor.this.get(Application.class));
            }
        };
        DateFormatUtils dateFormatUtils = (DateFormatUtils) diConstructor.get(DateFormatUtils.class);
        String str = null;
        String str2 = vastScenario == null ? null : vastScenario.vastMediaFileScenario.mediaFile.url;
        if (vastScenario != null) {
            str = vastScenario.adServingId;
        }
        return new PlayerStateInfoMacros(r1, dateFormatUtils, str2, str);
    }

    static /* synthetic */ PlayerStateInfoMacrosProvider lambda$null$12(DiConstructor diConstructor) {
        return new PlayerStateInfoMacrosProvider() {
            public final Object apply(Object obj) {
                return DiMacros.lambda$null$11(DiConstructor.this, (VastScenario) obj);
            }
        };
    }

    static /* synthetic */ PublisherInfoMacro lambda$null$13(DiConstructor diConstructor) {
        return new PublisherInfoMacro((DataCollector) diConstructor.get(DataCollector.class));
    }

    static /* synthetic */ RegulationInfoMacros lambda$null$14(DiConstructor diConstructor) {
        return new RegulationInfoMacros((SomaGdprDataSource) diConstructor.get(SomaGdprDataSource.class), (DataCollector) diConstructor.get(DataCollector.class), $$Lambda$xheW8tq3xjPPNyy_G1jprmzd1Qo.INSTANCE);
    }

    static /* synthetic */ VerificationInfoMacros lambda$null$15(DiConstructor diConstructor) {
        return new VerificationInfoMacros();
    }

    static /* synthetic */ ErrorInfoMacros lambda$null$16(DiConstructor diConstructor) {
        return new ErrorInfoMacros();
    }

    static /* synthetic */ ClickInfoMacros lambda$null$19(DiConstructor diConstructor) {
        return new ClickInfoMacros(new ClickInfoMacros.PxToDpConverter() {
            public final Object apply(Object obj) {
                return Integer.valueOf(UIUtils.pxToDp((Context) DiConstructor.this.get(Application.class), ((Float) obj).floatValue()));
            }
        });
    }
}
