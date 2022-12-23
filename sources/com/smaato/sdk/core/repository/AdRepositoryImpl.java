package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.api.ExpirationTimestampFactory;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.p248ad.AdLoaderException;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdRequest;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Supplier;
import com.smaato.sdk.flow.Action1;
import com.smaato.sdk.flow.Emitter;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.p257ub.AdMarkup;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.p257ub.UbId;
import com.smaato.sdk.util.Schedulers;
import java.util.Map;

final class AdRepositoryImpl implements AdRepository {
    private Supplier<AdLoader> adLoaderSupplier;
    private final Schedulers executors;
    private final ExpirationTimestampFactory expirationTimestampFactory;
    private final AdLoadersRegistry loadersRegistry;
    private final Logger logger;
    private final SomaGdprDataSource somaGdprDataSource;
    private final UbCache ubCache;
    private final UbErrorReporting ubErrorReporting;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.smaato.sdk.core.util.fi.Supplier<com.smaato.sdk.core.ad.AdLoader>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AdRepositoryImpl(com.smaato.sdk.core.log.Logger r1, com.smaato.sdk.p257ub.UbCache r2, com.smaato.sdk.core.repository.AdLoadersRegistry r3, com.smaato.sdk.core.util.p251fi.Supplier<com.smaato.sdk.core.p248ad.AdLoader> r4, com.smaato.sdk.util.Schedulers r5, com.smaato.sdk.core.gdpr.SomaGdprDataSource r6, com.smaato.sdk.core.UbErrorReporting r7, com.smaato.sdk.core.api.ExpirationTimestampFactory r8) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.log.Logger r1 = (com.smaato.sdk.core.log.Logger) r1
            r0.logger = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.ub.UbCache r1 = (com.smaato.sdk.p257ub.UbCache) r1
            r0.ubCache = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.repository.AdLoadersRegistry r1 = (com.smaato.sdk.core.repository.AdLoadersRegistry) r1
            r0.loadersRegistry = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.fi.Supplier r1 = (com.smaato.sdk.core.util.p251fi.Supplier) r1
            r0.adLoaderSupplier = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.util.Schedulers r1 = (com.smaato.sdk.util.Schedulers) r1
            r0.executors = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.core.gdpr.SomaGdprDataSource r1 = (com.smaato.sdk.core.gdpr.SomaGdprDataSource) r1
            r0.somaGdprDataSource = r1
            r0.ubErrorReporting = r7
            r0.expirationTimestampFactory = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.repository.AdRepositoryImpl.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.ub.UbCache, com.smaato.sdk.core.repository.AdLoadersRegistry, com.smaato.sdk.core.util.fi.Supplier, com.smaato.sdk.util.Schedulers, com.smaato.sdk.core.gdpr.SomaGdprDataSource, com.smaato.sdk.core.UbErrorReporting, com.smaato.sdk.core.api.ExpirationTimestampFactory):void");
    }

    public final void loadAd(AdTypeStrategy adTypeStrategy, AdRequest adRequest, AdRepository.Listener listener, Map<String, Object> map) {
        Objects.requireNonNull(listener);
        loadAd(adTypeStrategy, adRequest, map).subscribe(new Action1(adTypeStrategy) {
            public final /* synthetic */ AdTypeStrategy f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AdRepository.Listener.this.onAdLoadSuccess(this.f$1, (AdPresenter) obj);
            }
        }, (Action1<? super Throwable>) new Action1(adTypeStrategy) {
            public final /* synthetic */ AdTypeStrategy f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AdRepository.Listener.this.onAdLoadError(this.f$1, (AdLoaderException) ((Throwable) obj));
            }
        });
    }

    public final Flow<AdPresenter> loadAd(AdTypeStrategy adTypeStrategy, AdRequest adRequest, Map<String, Object> map) {
        Flow flow;
        Objects.requireNonNull(adRequest);
        Objects.requireNonNull(adTypeStrategy);
        if (!this.somaGdprDataSource.getSomaGdprData().isUsageAllowedFor(PiiParam.LOAD_ADS)) {
            return Flow.error((Throwable) new AdLoaderException(AdLoader.Error.NO_AD, new RuntimeException("GDPR permissions do not allow ad loading!")));
        }
        UbId create = UbId.create(adRequest.getAdSettings().getAdSpaceId(), adRequest.getUbUniqueId());
        if (create != null) {
            flow = Flow.create(new Action1(create, adRequest, adTypeStrategy) {
                public final /* synthetic */ UbId f$1;
                public final /* synthetic */ AdRequest f$2;
                public final /* synthetic */ AdTypeStrategy f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void invoke(Object obj) {
                    AdRepositoryImpl.this.lambda$ubPipeline$5$AdRepositoryImpl(this.f$1, this.f$2, this.f$3, (Emitter) obj);
                }
            });
        } else {
            flow = Flow.create(new Action1(adTypeStrategy, map, adRequest) {
                public final /* synthetic */ AdTypeStrategy f$1;
                public final /* synthetic */ Map f$2;
                public final /* synthetic */ AdRequest f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void invoke(Object obj) {
                    AdRepositoryImpl.this.lambda$loadAdFromNetwork$6$AdRepositoryImpl(this.f$1, this.f$2, this.f$3, (Emitter) obj);
                }
            });
        }
        return flow.doOnError(new Action1() {
            public final void invoke(Object obj) {
                AdRepositoryImpl.this.lambda$loadAd$2$AdRepositoryImpl((Throwable) obj);
            }
        }).subscribeOn(this.executors.mo56385io()).observeOn(this.executors.main());
    }

    public /* synthetic */ void lambda$loadAd$2$AdRepositoryImpl(Throwable th) throws Throwable {
        this.logger.error(LogDomain.CORE, th.getMessage(), new Object[0]);
    }

    public /* synthetic */ void lambda$ubPipeline$5$AdRepositoryImpl(UbId ubId, AdRequest adRequest, AdTypeStrategy adTypeStrategy, Emitter emitter) throws Throwable {
        AdFormat adFormat;
        AdMarkup adMarkup = this.ubCache.get(ubId);
        if (adMarkup != null) {
            ApiAdResponse.Builder builder = ApiAdResponse.builder();
            String adFormat2 = adMarkup.adFormat();
            char c = 65535;
            switch (adFormat2.hashCode()) {
                case -1968751561:
                    if (adFormat2.equals("Native")) {
                        c = 3;
                        break;
                    }
                    break;
                case 73635:
                    if (adFormat2.equals("Img")) {
                        c = 0;
                        break;
                    }
                    break;
                case 82650203:
                    if (adFormat2.equals("Video")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1173835880:
                    if (adFormat2.equals("Richmedia")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                adFormat = AdFormat.STATIC_IMAGE;
            } else if (c == 1) {
                adFormat = AdFormat.VIDEO;
            } else if (c == 2) {
                adFormat = AdFormat.RICH_MEDIA;
            } else if (c != 3) {
                adFormat = AdFormat.valueOf(adFormat2);
            } else {
                adFormat = AdFormat.NATIVE;
            }
            ApiAdResponse build = builder.adFormat(adFormat).body(adMarkup.markup().getBytes()).expiration(this.expirationTimestampFactory.createExpirationTimestampFor(adMarkup.expiresAt(), (Long) null)).sessionId(adMarkup.sessionId()).build();
            if (!build.getExpiration().isExpired()) {
                AdLoader adLoader = this.adLoaderSupplier.get();
                adLoader.setListener(new AdLoaderListener(emitter, this.loadersRegistry, adTypeStrategy));
                adLoader.buildAdPresenter(adTypeStrategy, adRequest, build);
                return;
            }
            AdLoaderException adLoaderException = new AdLoaderException(AdLoader.Error.TTL_EXPIRED, new UbCacheException("Cached UB Ad Response has been already expired."));
            Objects.onNotNull(this.ubErrorReporting, new Consumer(UbErrorReporting.Param.builder().setAdSpaceId(adRequest.getAdSettings().getAdSpaceId()).setPublisherId(adRequest.getAdSettings().getPublisherId()).setAdFormat(build.getAdFormat()).setCreativeId(build.getCreativeId()).setSessionId(build.getSessionId()).build()) {
                public final /* synthetic */ UbErrorReporting.Param f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((UbErrorReporting) obj).report(AdLoaderException.this.getErrorType(), this.f$1);
                }
            });
            throw adLoaderException;
        }
        AdLoaderException adLoaderException2 = new AdLoaderException(AdLoader.Error.NO_AD, new UbCacheException("Cached Ad Response is not found."));
        Objects.onNotNull(this.ubErrorReporting, new Consumer(UbErrorReporting.Param.builder().setAdSpaceId(adRequest.getAdSettings().getAdSpaceId()).setPublisherId(adRequest.getAdSettings().getPublisherId()).build()) {
            public final /* synthetic */ UbErrorReporting.Param f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((UbErrorReporting) obj).report(AdLoaderException.this.getErrorType(), this.f$1);
            }
        });
        throw adLoaderException2;
    }

    public /* synthetic */ void lambda$loadAdFromNetwork$6$AdRepositoryImpl(AdTypeStrategy adTypeStrategy, Map map, AdRequest adRequest, Emitter emitter) throws Throwable {
        String uniqueKey = adTypeStrategy.getUniqueKey();
        if (this.loadersRegistry.remainingCapacity(uniqueKey) <= 0) {
            this.logger.info(LogDomain.CORE, "Ad loading request for provided publisherId and adSpaceId was already in progress", new Object[0]);
            emitter.onComplete();
            return;
        }
        AdLoader adLoader = this.adLoaderSupplier.get();
        adLoader.setListener(new AdLoaderListener(emitter, this.loadersRegistry, adTypeStrategy));
        adLoader.setObjectExtras(map);
        this.loadersRegistry.register(uniqueKey, adLoader);
        adLoader.requestAd(adRequest, adTypeStrategy);
    }

    static class AdLoaderListener implements AdLoader.Listener {
        private final Emitter<? super AdPresenter> emitter;
        private final AdLoadersRegistry loadersRegistry;
        private final AdTypeStrategy strategy;

        AdLoaderListener(Emitter<? super AdPresenter> emitter2, AdLoadersRegistry adLoadersRegistry, AdTypeStrategy adTypeStrategy) {
            this.emitter = emitter2;
            this.loadersRegistry = adLoadersRegistry;
            this.strategy = adTypeStrategy;
        }

        public void onAdLoadSuccess(AdLoader adLoader, AdPresenter adPresenter) {
            this.loadersRegistry.unregister(this.strategy.getUniqueKey(), adLoader);
            this.emitter.onNext(adPresenter);
            this.emitter.onComplete();
        }

        public void onAdLoadError(AdLoader adLoader, AdLoaderException adLoaderException) {
            this.loadersRegistry.unregister(this.strategy.getUniqueKey(), adLoader);
            this.emitter.onError(adLoaderException);
        }
    }

    static final class UbCacheException extends Exception {
        UbCacheException(String str) {
            super(str);
        }
    }
}
