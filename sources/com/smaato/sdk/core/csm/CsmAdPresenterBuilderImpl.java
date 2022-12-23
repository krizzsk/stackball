package com.smaato.sdk.core.csm;

import android.app.Activity;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.csm.CsmAdPresenter;
import com.smaato.sdk.core.csm.CsmAdPresenterBuilder;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.lifecycle.ActivityProvider;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class CsmAdPresenterBuilderImpl<Presenter extends AdPresenter> implements CsmAdPresenterBuilder {
    private final CsmAdResponseParser csmAdResponseParser;
    private final Function<CsmAdObject, CsmAdInteractor> interactorProviderFunction;
    /* access modifiers changed from: private */
    public CsmAdPresenterBuilder.Listener listener;
    private final Logger logger;
    /* access modifiers changed from: private */
    public final ArrayDeque<Network> networks = new ArrayDeque<>();
    private Map<String, Object> objectExtras = new HashMap();
    private final Function<CsmAdInteractor, Presenter> presenterProviderFunction;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.core.csm.CsmAdObject, com.smaato.sdk.core.csm.CsmAdInteractor>, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.core.csm.CsmAdInteractor, Presenter>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CsmAdPresenterBuilderImpl(com.smaato.sdk.core.log.Logger r2, com.smaato.sdk.core.csm.CsmAdResponseParser r3, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.core.csm.CsmAdObject, com.smaato.sdk.core.csm.CsmAdInteractor> r4, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.core.csm.CsmAdInteractor, Presenter> r5) {
        /*
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.networks = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.objectExtras = r0
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.log.Logger r2 = (com.smaato.sdk.core.log.Logger) r2
            r1.logger = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.csm.CsmAdResponseParser r2 = (com.smaato.sdk.core.csm.CsmAdResponseParser) r2
            r1.csmAdResponseParser = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.fi.Function r2 = (com.smaato.sdk.core.util.p251fi.Function) r2
            r1.interactorProviderFunction = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.util.fi.Function r2 = (com.smaato.sdk.core.util.p251fi.Function) r2
            r1.presenterProviderFunction = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.csm.CsmAdPresenterBuilderImpl.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.core.csm.CsmAdResponseParser, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.util.fi.Function):void");
    }

    public void buildAdPresenter(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener2) {
        CsmAdResponse createCsmAdResponse = createCsmAdResponse(somaApiContext, listener2);
        if (createCsmAdResponse != null) {
            Collections.sort(createCsmAdResponse.getNetworks(), $$Lambda$CsmAdPresenterBuilderImpl$dhcvdbsadctNDeY5g1MXwEkJI4.INSTANCE);
            this.networks.addAll(createCsmAdResponse.getNetworks());
            buildAdPresenter(somaApiContext, createCsmAdResponse, listener2);
        }
    }

    public void setListener(CsmAdPresenterBuilder.Listener listener2) {
        this.listener = listener2;
    }

    public void setObjectExtras(Map<String, Object> map) {
        this.objectExtras = map;
    }

    public CsmAdPresenter.Listener createAdLoadedListener(SomaApiContext somaApiContext, CsmAdResponse csmAdResponse, AdPresenterBuilder.Listener listener2, CsmAdObject csmAdObject) {
        final AdPresenterBuilder.Listener listener3 = listener2;
        final CsmAdObject csmAdObject2 = csmAdObject;
        final SomaApiContext somaApiContext2 = somaApiContext;
        final CsmAdResponse csmAdResponse2 = csmAdResponse;
        return new CsmAdPresenter.Listener() {
            public void onAdLoaded(CsmAdPresenter csmAdPresenter) {
                listener3.onAdPresenterBuildSuccess(CsmAdPresenterBuilderImpl.this, csmAdPresenter);
            }

            public void onAdFailedToLoad(CsmAdPresenter csmAdPresenter) {
                if (CsmAdPresenterBuilderImpl.this.networks.isEmpty()) {
                    Objects.onNotNull(CsmAdPresenterBuilderImpl.this.listener, new Consumer() {
                        public final void accept(Object obj) {
                            ((CsmAdPresenterBuilder.Listener) obj).onCallPassbackUrl(CsmAdObject.this.getPassback());
                        }
                    });
                } else {
                    CsmAdPresenterBuilderImpl.this.buildAdPresenter(somaApiContext2, csmAdResponse2, listener3);
                }
                csmAdPresenter.getClass();
                Threads.runOnUi(new Runnable() {
                    public final void run() {
                        CsmAdPresenter.this.release();
                    }
                });
            }
        };
    }

    /* access modifiers changed from: private */
    public void buildAdPresenter(SomaApiContext somaApiContext, CsmAdResponse csmAdResponse, AdPresenterBuilder.Listener listener2) {
        CsmAdObject createCsmAdObject = createCsmAdObject(somaApiContext, csmAdResponse, listener2);
        if (createCsmAdObject != null) {
            this.logger.info(LogDomain.AD, "parsed CsmAdObject = %s", createCsmAdObject);
            Activity currentActivity = ActivityProvider.get().getCurrentActivity();
            if (currentActivity == null) {
                this.logger.error(LogDomain.AD, "Could not get current activity context, calling passbackUrl", new Object[0]);
                Objects.onNotNull(this.listener, new Consumer() {
                    public final void accept(Object obj) {
                        ((CsmAdPresenterBuilder.Listener) obj).onCallPassbackUrl(CsmAdObject.this.getPassback());
                    }
                });
                return;
            }
            CsmAdPresenter csmAdPresenter = (CsmAdPresenter) ((AdPresenter) this.presenterProviderFunction.apply(this.interactorProviderFunction.apply(createCsmAdObject)));
            csmAdPresenter.setAdLoadedListener(createAdLoadedListener(somaApiContext, csmAdResponse, listener2, createCsmAdObject));
            csmAdPresenter.requestAd(currentActivity, createParamsMap(createCsmAdObject.getNetwork()), this.objectExtras);
        }
    }

    private CsmAdResponse createCsmAdResponse(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener2) {
        ApiAdResponse apiAdResponse = somaApiContext.getApiAdResponse();
        try {
            try {
                return this.csmAdResponseParser.parseResponse(new String(apiAdResponse.getBody(), apiAdResponse.getCharset()));
            } catch (CsmAdResponseParser.ParsingException e) {
                this.logger.error(LogDomain.AD, e, "Invalid AdResponse: %s", apiAdResponse);
                listener2.onAdPresenterBuildError(this, new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, e));
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.logger.error(LogDomain.AD, e2, "Invalid AdResponse: %s. Cannot parse AdResponse with provided charset: %s", apiAdResponse, apiAdResponse.getCharset());
            listener2.onAdPresenterBuildError(this, new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, e2));
            return null;
        }
    }

    private CsmAdObject createCsmAdObject(SomaApiContext somaApiContext, CsmAdResponse csmAdResponse, AdPresenterBuilder.Listener listener2) {
        try {
            return CsmAdObject.builder().setSomaApiContext(somaApiContext).setNetwork(this.networks.pop()).setSessionId(csmAdResponse.getSessionId()).setPassback(csmAdResponse.getPassback()).build();
        } catch (Exception e) {
            this.logger.error(LogDomain.AD, e, "Failed to build CsmAdObject", new Object[0]);
            listener2.onAdPresenterBuildError(this, new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, e));
            return null;
        }
    }

    private static Map<String, String> createParamsMap(Network network) {
        HashMap hashMap = new HashMap();
        hashMap.put("width", String.valueOf(network.getWidth()));
        hashMap.put("height", String.valueOf(network.getHeight()));
        Objects.onNotNull(network.getAdUnitId(), new Consumer(hashMap) {
            public final /* synthetic */ Map f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.put("adUnitId", (String) obj);
            }
        });
        hashMap.putAll(TextUtils.convertJsonStringToMap(network.getCustomData()));
        return hashMap;
    }
}
