package com.ogury.p244cm;

import android.app.Activity;
import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p244cm.internal.aaaaa;
import com.ogury.p244cm.internal.aaaab;
import com.ogury.p244cm.internal.aaaac;
import com.ogury.p244cm.internal.aaaba;
import com.ogury.p244cm.internal.aabbb;
import com.ogury.p244cm.internal.aacaa;
import com.ogury.p244cm.internal.abbba;
import com.ogury.p244cm.internal.abbca;
import com.ogury.p244cm.internal.accba;
import com.ogury.p244cm.internal.babca;
import com.ogury.p244cm.internal.bbabb;
import com.ogury.p244cm.internal.bbabc;
import com.ogury.p244cm.internal.bbacb;
import com.ogury.p244cm.internal.bbcbc;

/* renamed from: com.ogury.cm.OguryChoiceManager */
public final class OguryChoiceManager {
    public static final int CCPAF_VERSION_1 = 1;
    public static final OguryChoiceManager INSTANCE = new OguryChoiceManager();
    public static final int TCF_VERSION_2 = 2;

    /* renamed from: a */
    private static aaaaa f20225a;

    /* renamed from: b */
    private static bbacb f20226b;

    /* renamed from: c */
    private static Context f20227c;

    /* renamed from: d */
    private static String f20228d;

    /* renamed from: e */
    private static boolean f20229e;

    /* renamed from: com.ogury.cm.OguryChoiceManager$Answer */
    public enum Answer {
        FULL_APPROVAL,
        PARTIAL_APPROVAL,
        REFUSAL,
        NO_ANSWER,
        CCPAF_SALE_DENIED,
        CCPAF_SALE_ALLOWED
    }

    /* renamed from: com.ogury.cm.OguryChoiceManager$CcpafV1 */
    public static final class CcpafV1 {
        public static final CcpafV1 INSTANCE = new CcpafV1();

        private CcpafV1() {
        }

        public static final String getUspString() {
            OguryChoiceManager.m21633b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m22047a();
            }
            abbba abbba = abbba.f20411a;
            return abbba.m21830c().mo52681d().mo52688a();
        }

        public static final boolean hasSeenNotice() {
            OguryChoiceManager.m21633b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m22047a();
            }
            abbba abbba = abbba.f20411a;
            return abbba.m21830c().mo52681d().mo52692b();
        }

        public static final boolean isLspa() {
            OguryChoiceManager.m21633b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m22047a();
            }
            abbba abbba = abbba.f20411a;
            return abbba.m21830c().mo52681d().mo52696d();
        }

        public static final boolean isOptOutSale() {
            OguryChoiceManager.m21633b();
            if (OguryChoiceManager.INSTANCE.getClientConsentImpl() == null) {
                bbabc.m22047a();
            }
            abbba abbba = abbba.f20411a;
            return abbba.m21830c().mo52681d().mo52694c();
        }
    }

    /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2 */
    public static final class TcfV2 {
        public static final TcfV2 INSTANCE = new TcfV2();

        /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2$Purpose */
        public static final class Purpose {
            public static final int CREATE_PERSONALISED_ADS = 8;
            public static final int CREATE_PERSONALISED_CONTENT = 32;
            public static final int DEVELOP_AND_IMPROVE_PRODUCTS = 1024;
            public static final Purpose INSTANCE = new Purpose();
            public static final int MARKET_RESEARCH = 512;
            public static final int MEASURE_AD_PERFORMANCE = 128;
            public static final int MEASURE_CONTENT_PERFORMANCE = 256;
            public static final int SELECT_BASIC_ADS = 4;
            public static final int SELECT_PERSONALISED_ADS = 16;
            public static final int SELECT_PERSONALISED_CONTENT = 64;
            public static final int STORE_INFORMATION = 2;

            private Purpose() {
            }
        }

        /* renamed from: com.ogury.cm.OguryChoiceManager$TcfV2$SpecialFeature */
        public static final class SpecialFeature {
            public static final SpecialFeature INSTANCE = new SpecialFeature();
            public static final int PRECISE_GEOLOCATION = 2;
            public static final int SCAN_DEVICE_CHARACTERISTICS = 4;

            private SpecialFeature() {
            }
        }

        private TcfV2() {
        }

        public static final String getIabString() {
            OguryIntegrationLogger.m22104d("[Consent] Choice Manager - getIabString() called");
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                aaaba aaaba = (aaaba) a;
                if (aaaba.mo52623a().mo52698a().length() > 0) {
                    return aaaba.mo52623a().mo52698a();
                }
                OguryIntegrationLogger.m22105e("[Consent][data] Consent info not yet available");
                return "";
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52628c(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isAllVendorConditionsMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52633h(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isLiPurposeMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52630e(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isLiVendorMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52629d(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isPurposeAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52627b(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isSpecialFeatureAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52624a(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isVendorAndItsPurposesAccepted(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52631f(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }

        public static final boolean isVendorsLiAndLiPurposeMet(int i) {
            OguryChoiceManager.access$checkInstance(OguryChoiceManager.INSTANCE, 2);
            aaaaa clientConsentImpl = OguryChoiceManager.INSTANCE.getClientConsentImpl();
            if (clientConsentImpl == null) {
                bbabc.m22047a();
            }
            aaaac a = clientConsentImpl.mo52610a();
            if (a != null) {
                return ((aaaba) a).mo52632g(i);
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.choiceManager.ClientConsentImplTcfV2");
        }
    }

    private OguryChoiceManager() {
    }

    /* renamed from: a */
    private static void m21632a() {
        if (f20227c != null) {
            CharSequence charSequence = f20228d;
            if (charSequence == null || bbcbc.m22087a(charSequence)) {
                OguryIntegrationLogger.m22105e("[Consent][setup] Failed (module not correctly started: asset key is null or empty)");
                throw new IllegalStateException("AssetKey is not allowed to be empty.");
            }
            return;
        }
        OguryIntegrationLogger.m22105e("[Consent][setup] Failed (module not started)");
        throw new IllegalStateException("You must first call initialize method.");
    }

    public static final /* synthetic */ void access$checkInstance(OguryChoiceManager oguryChoiceManager, int i) {
        m21633b();
        if (i == 2) {
            aaaaa aaaaa = f20225a;
            if (aaaaa == null) {
                bbabc.m22047a();
            }
            if (!(aaaaa.mo52610a() instanceof aaaba)) {
                throw new IllegalStateException("You cannot use method from another TCF version.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Bad TCF version is passed, you can use one of versions declared in class OguryChoiceManager.");
    }

    public static final void ask(Activity activity, OguryConsentListener oguryConsentListener) {
        bbabc.m22051b(activity, "activity");
        bbabc.m22051b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m22104d("[Consent] Choice Manager - ask() called");
        f20229e = true;
        m21633b();
        aaaaa aaaaa = f20225a;
        if (aaaaa == null) {
            bbabc.m22047a();
        }
        Context context = activity;
        String str = f20228d;
        if (str == null) {
            bbabc.m22047a();
        }
        aaaaa.mo52612a(context, str, oguryConsentListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m21633b() {
        m21632a();
        if (!f20229e) {
            m21634c();
            Context context = f20227c;
            if (context == null) {
                bbabc.m22047a();
            }
            boolean a = bbacb.m22052a(context);
            OguryIntegrationLogger.m22105e("[Consent] Failed (consent data not synced). Please call ask() method first");
            if (a) {
                throw new IllegalStateException("You must first call ask to get config.");
            }
        }
    }

    /* renamed from: c */
    private static bbacb m21634c() {
        if (f20226b == null) {
            f20226b = new bbacb();
        }
        bbacb bbacb = f20226b;
        if (bbacb == null) {
            bbabc.m22047a();
        }
        return bbacb;
    }

    public static final boolean ccpaApplies() {
        m21633b();
        if (f20225a == null) {
            bbabc.m22047a();
        }
        abbba abbba = abbba.f20411a;
        return abbba.m21830c().mo52681d().mo52697e();
    }

    public static /* synthetic */ void clientConsentImpl$annotations() {
    }

    public static /* synthetic */ void debugUtilVal$annotations() {
    }

    public static final void edit(Activity activity, OguryConsentListener oguryConsentListener) {
        bbabc.m22051b(activity, "activity");
        bbabc.m22051b(oguryConsentListener, "oguryConsentListener");
        OguryIntegrationLogger.m22104d("[Consent] Choice Manager - edit() called");
        f20229e = true;
        m21633b();
        aaaaa aaaaa = f20225a;
        if (aaaaa == null) {
            bbabc.m22047a();
        }
        Context context = activity;
        String str = f20228d;
        if (str == null) {
            bbabc.m22047a();
        }
        aaaaa.mo52616b(context, str, oguryConsentListener);
    }

    public static final boolean gdprApplies() {
        m21633b();
        if (f20225a == null) {
            bbabc.m22047a();
        }
        abbba abbba = abbba.f20411a;
        return abbba.m21830c().mo52680c().mo52701b();
    }

    public static final boolean hasPaid() {
        m21633b();
        if (f20225a == null) {
            bbabc.m22047a();
        }
        Context context = f20227c;
        if (context == null) {
            bbabc.m22047a();
        }
        bbabc.m22051b(context, "context");
        return accba.m21962a(context);
    }

    @Deprecated
    public static final void initialize(Context context, String str, OguryCmConfig oguryCmConfig) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(oguryCmConfig, "oguryCmConfig");
        OguryIntegrationLogger.m22104d("[Consent] Setting up...");
        new abbca(context, (accba) null, (aabbb) null, 6, (bbabb) null).mo52675a();
        aacaa.aaaaa aaaaa = aacaa.f20364a;
        aacaa.aaaaa.m21771a(context, oguryCmConfig);
        if (f20225a == null) {
            f20227c = context.getApplicationContext();
            f20228d = str;
            aaaab aaaab = aaaab.f20280a;
            f20225a = aaaab.m21684a(oguryCmConfig);
        }
        m21632a();
        OguryIntegrationLogger.m22104d("[Consent][setup] TCF version: " + oguryCmConfig.getTcfVersion());
        OguryIntegrationLogger.m22104d("[Consent][setup] CCPA version: " + oguryCmConfig.getCcpafVersion());
        OguryIntegrationLogger.m22104d("[Consent][setup] Completed!");
    }

    @Deprecated
    public static /* synthetic */ void initialize$default(Context context, String str, OguryCmConfig oguryCmConfig, int i, Object obj) {
        if ((i & 4) != 0) {
            oguryCmConfig = new OguryCmConfig();
        }
        initialize(context, str, oguryCmConfig);
    }

    public static final boolean isEditAvailable() {
        m21633b();
        if (f20225a == null) {
            bbabc.m22047a();
        }
        Context context = f20227c;
        if (context == null) {
            bbabc.m22047a();
        }
        bbabc.m22051b(context, "context");
        return accba.m21964b(context);
    }

    public static final void updateOguryCmConfig(OguryCmConfig oguryCmConfig) {
        bbabc.m22051b(oguryCmConfig, "oguryCmConfig");
        OguryIntegrationLogger.m22104d("[Consent] Choice Manager - updateOguryCmConfig() called with tcfVersion: " + oguryCmConfig.getTcfVersion() + " and ccpaVersion: " + oguryCmConfig.getCcpafVersion());
        OguryIntegrationLogger.m22104d("[Consent][setup] Manual setting up TCF and CCPA versions...");
        if (f20227c == null) {
            OguryIntegrationLogger.m22105e("[Consent][setup] Failed to set up versions (module not started)");
        } else if (f20229e) {
            OguryIntegrationLogger.m22105e("[Consent][setup] TCF or CCPA versions cannot be changed when ask() method is already called");
        } else {
            abbba abbba = abbba.f20411a;
            if (abbba.m21818a() == oguryCmConfig.getTcfVersion()) {
                abbba abbba2 = abbba.f20411a;
                if (abbba.m21827b() == oguryCmConfig.getCcpafVersion()) {
                    OguryIntegrationLogger.m22104d("[Consent][setup] versions setup aborted (no change detected)");
                    return;
                }
            }
            aacaa.aaaaa aaaaa = aacaa.f20364a;
            Context context = f20227c;
            if (context == null) {
                bbabc.m22047a();
            }
            aacaa.aaaaa.m21771a(context, oguryCmConfig);
            aaaab aaaab = aaaab.f20280a;
            f20225a = aaaab.m21684a(oguryCmConfig);
            OguryIntegrationLogger.m22104d("[Consent][setup] TCF version: " + oguryCmConfig.getTcfVersion());
            OguryIntegrationLogger.m22104d("[Consent][setup] CCPA version: " + oguryCmConfig.getCcpafVersion());
            OguryIntegrationLogger.m22104d("[Consent][setup] Manual setup done! ");
        }
    }

    public final aaaaa getClientConsentImpl() {
        return f20225a;
    }

    public final bbacb getDebugUtilVal$3dacfc6e() {
        return f20226b;
    }

    public final void resetClientConsentImpl$consent_manager_prodRelease() {
        f20225a = null;
    }

    public final void resetFieldsForTests() {
        f20227c = null;
        f20228d = null;
        f20229e = false;
    }

    public final void setClientConsentImpl(aaaaa aaaaa) {
        f20225a = aaaaa;
    }

    public final void setDebugUtilVal$47bacc58(bbacb bbacb) {
        f20226b = bbacb;
    }
}
