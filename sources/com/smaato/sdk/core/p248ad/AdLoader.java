package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.api.ApiConnectorException;
import com.smaato.sdk.core.csm.CsmAdPresenterBuilder;
import com.smaato.sdk.core.csm.CsmAdPresenterBuilderImpl;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdRequestMapper;
import com.smaato.sdk.core.repository.AdTypeStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentExceptionUtil;
import com.smaato.sdk.core.util.SdkConfigHintBuilder;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.violationreporter.AdQualityViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.core.ad.AdLoader */
public class AdLoader {
    private final AdLoaderPlugin adLoaderPlugin;
    /* access modifiers changed from: private */
    public final AdLoaderAdQualityViolationUtils adQualityViolationUtils;
    private final AdRequestMapper adRequestMapper;
    private final ApiConnector apiConnector;
    /* access modifiers changed from: private */
    public Listener listener;
    /* access modifiers changed from: private */
    public final Logger logger;
    private Map<String, Object> objectExtras = new HashMap();
    private final SdkConfigHintBuilder sdkConfigHintBuilder;
    /* access modifiers changed from: private */
    public final AtomicReference<TaskRequestHolder> startedTask = new AtomicReference<>();

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$Error */
    public enum Error {
        NO_AD,
        BAD_REQUEST,
        PRESENTER_BUILDER_GENERIC,
        INVALID_RESPONSE,
        API,
        CANCELLED,
        NETWORK,
        NO_CONNECTION,
        CONFIGURATION_ERROR,
        INTERNAL,
        CREATIVE_RESOURCE_EXPIRED,
        TTL_EXPIRED,
        NO_MANDATORY_CACHE,
        CACHE_LIMIT_REACHED
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$Listener */
    public interface Listener {
        void onAdLoadError(AdLoader adLoader, AdLoaderException adLoaderException);

        void onAdLoadSuccess(AdLoader adLoader, AdPresenter adPresenter);
    }

    public AdLoader(final Logger logger2, AdRequestMapper adRequestMapper2, AdLoaderPlugin adLoaderPlugin2, ApiConnector apiConnector2, SdkConfigHintBuilder sdkConfigHintBuilder2, AdLoaderAdQualityViolationUtils adLoaderAdQualityViolationUtils) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adRequestMapper = (AdRequestMapper) Objects.requireNonNull(adRequestMapper2);
        this.adLoaderPlugin = (AdLoaderPlugin) Objects.requireNonNull(adLoaderPlugin2);
        this.apiConnector = (ApiConnector) Objects.requireNonNull(apiConnector2);
        this.sdkConfigHintBuilder = (SdkConfigHintBuilder) Objects.requireNonNull(sdkConfigHintBuilder2);
        this.adQualityViolationUtils = (AdLoaderAdQualityViolationUtils) Objects.requireNonNull(adLoaderAdQualityViolationUtils);
        this.apiConnector.setListener(new ApiConnector.Listener() {
            public void onAdRequestSuccess(ApiConnector apiConnector, Task task, ApiAdResponse apiAdResponse) {
                Objects.requireNonNull(apiConnector);
                Objects.requireNonNull(apiAdResponse);
                TaskRequestHolder taskRequestHolder = (TaskRequestHolder) AdLoader.this.startedTask.get();
                if (AdLoader.access$100(AdLoader.this, taskRequestHolder, task)) {
                    AdLoader.this.buildAdPresenter(new SomaApiContext(taskRequestHolder.apiAdRequest, apiAdResponse), taskRequestHolder.clazz);
                }
            }

            public void onAdRequestError(ApiConnector apiConnector, Task task, ApiConnectorException apiConnectorException) {
                Objects.requireNonNull(apiConnector);
                Objects.requireNonNull(apiConnectorException);
                if (AdLoader.access$100(AdLoader.this, (TaskRequestHolder) AdLoader.this.startedTask.get(), task)) {
                    logger2.error(LogDomain.AD, "Failed to perform ad request. Error: %s", apiConnectorException);
                    AdLoader.access$300(AdLoader.this, apiConnectorException);
                }
            }
        });
    }

    public void setListener(Listener listener2) {
        this.listener = (Listener) Objects.requireNonNull(listener2);
    }

    public void setObjectExtras(Map<String, Object> map) {
        this.objectExtras = (Map) Objects.requireNonNull(map);
    }

    public /* synthetic */ void lambda$requestAd$0$AdLoader(AdRequestMapper.UnresolvedServerAdFormatException unresolvedServerAdFormatException, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(Error.CONFIGURATION_ERROR, unresolvedServerAdFormatException));
    }

    public /* synthetic */ void lambda$requestAd$1$AdLoader(Exception exc, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(Error.INTERNAL, exc));
    }

    /* access modifiers changed from: private */
    public void buildAdPresenter(SomaApiContext somaApiContext, Class<? extends AdPresenter> cls) {
        AdPresenterBuilderListener adPresenterBuilderListener = new AdPresenterBuilderListener(this, somaApiContext, (byte) 0);
        this.logger.debug(LogDomain.AD, "Requesting an Ad finished with success", new Object[0]);
        AdFormat adFormat = somaApiContext.getApiAdResponse().getAdFormat();
        AdPresenterBuilder adPresenterBuilder = this.adLoaderPlugin.getAdPresenterBuilder(adFormat, cls, this.logger);
        if (adPresenterBuilder == null) {
            this.logger.warning(LogDomain.AD, "No %s implementation was found for %s: %s", AdPresenterBuilder.class.getSimpleName(), AdFormat.class.getSimpleName(), adFormat);
            String buildSdkModuleMissedHintForAdFormat = this.sdkConfigHintBuilder.buildSdkModuleMissedHintForAdFormat(adFormat);
            this.logger.error(LogDomain.AD, buildSdkModuleMissedHintForAdFormat, new Object[0]);
            Objects.onNotNull(this.listener, new Consumer(Error.CONFIGURATION_ERROR, buildSdkModuleMissedHintForAdFormat) {
                public final /* synthetic */ AdLoader.Error f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    AdLoader.this.lambda$buildAdPresenter$3$AdLoader(this.f$1, this.f$2, (AdLoader.Listener) obj);
                }
            });
            return;
        }
        if (adPresenterBuilder instanceof CsmAdPresenterBuilder) {
            CsmAdPresenterBuilderImpl csmAdPresenterBuilderImpl = (CsmAdPresenterBuilderImpl) adPresenterBuilder;
            csmAdPresenterBuilderImpl.setListener(new CsmAdPresenterBuilder.Listener(somaApiContext) {
                public final /* synthetic */ SomaApiContext f$1;

                {
                    this.f$1 = r2;
                }

                public final void onCallPassbackUrl(String str) {
                    AdLoader.this.lambda$buildAdPresenter$4$AdLoader(this.f$1, str);
                }
            });
            csmAdPresenterBuilderImpl.setObjectExtras(this.objectExtras);
        }
        adPresenterBuilder.buildAdPresenter(somaApiContext, adPresenterBuilderListener);
    }

    public /* synthetic */ void lambda$buildAdPresenter$3$AdLoader(Error error, String str, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(error, new RuntimeException(str)));
    }

    public /* synthetic */ void lambda$buildAdPresenter$4$AdLoader(SomaApiContext somaApiContext, String str) {
        TaskRequestHolder taskRequestHolder = this.startedTask.get();
        Task performApiAdRequest = this.apiConnector.performApiAdRequest(str, somaApiContext);
        this.startedTask.set(new TaskRequestHolder(performApiAdRequest, taskRequestHolder.clazz, taskRequestHolder.apiAdRequest, (byte) 0));
        performApiAdRequest.start();
    }

    public void cancel() {
        TaskRequestHolder taskRequestHolder = this.startedTask.get();
        if (taskRequestHolder == null) {
            this.logger.debug(LogDomain.AD, "There is no request currently running. Nothing to cancel", new Object[0]);
            return;
        }
        this.logger.debug(LogDomain.AD, "Canceling request: %s", taskRequestHolder);
        taskRequestHolder.task.cancel();
    }

    public /* synthetic */ void lambda$handleApiConnectorException$5$AdLoader(Error error, ApiConnectorException apiConnectorException, Listener listener2) {
        listener2.onAdLoadError(this, new AdLoaderException(error, apiConnectorException));
    }

    public void buildAdPresenter(AdTypeStrategy adTypeStrategy, AdRequest adRequest, ApiAdResponse apiAdResponse) {
        buildAdPresenter(new SomaApiContext(this.adRequestMapper.map(adRequest), apiAdResponse), adTypeStrategy.getAdPresenterClass());
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$TaskRequestHolder */
    static final class TaskRequestHolder {
        final ApiAdRequest apiAdRequest;
        final Class<? extends AdPresenter> clazz;
        final Task task;

        /* synthetic */ TaskRequestHolder(Task task2, Class cls, ApiAdRequest apiAdRequest2, byte b) {
            this(task2, cls, apiAdRequest2);
        }

        private TaskRequestHolder(Task task2, Class<? extends AdPresenter> cls, ApiAdRequest apiAdRequest2) {
            this.task = (Task) Objects.requireNonNull(task2, "Parameter task cannot be null for TaskRequestHolder::new");
            this.clazz = (Class) Objects.requireNonNull(cls, "Parameter clazz cannot be null for TaskRequestHolder::new");
            this.apiAdRequest = (ApiAdRequest) Objects.requireNonNull(apiAdRequest2, "Parameter apiAdRequest cannot be null for TaskRequestHolder::new");
        }
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$AdPresenterBuilderListener */
    final class AdPresenterBuilderListener implements AdPresenterBuilder.Listener {
        private final SomaApiContext somaApiContext;

        /* synthetic */ AdPresenterBuilderListener(AdLoader adLoader, SomaApiContext somaApiContext2, byte b) {
            this(somaApiContext2);
        }

        private AdPresenterBuilderListener(SomaApiContext somaApiContext2) {
            this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        }

        public final void onAdPresenterBuildSuccess(AdPresenterBuilder adPresenterBuilder, AdPresenter adPresenter) {
            Objects.requireNonNull(adPresenterBuilder);
            Objects.requireNonNull(adPresenter);
            AdLoader.this.logger.debug(LogDomain.AD, "%s building with %s finished with success", AdPresenter.class.getSimpleName(), adPresenterBuilder.getClass().getSimpleName());
            Objects.onNotNull(AdLoader.this.listener, new Consumer(adPresenter) {
                public final /* synthetic */ AdPresenter f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdLoader.AdPresenterBuilderListener.this.mo54397x5954ce3e(this.f$1, (AdLoader.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onAdPresenterBuildSuccess$0$AdLoader$AdPresenterBuilderListener */
        public /* synthetic */ void mo54397x5954ce3e(AdPresenter adPresenter, Listener listener) {
            listener.onAdLoadSuccess(AdLoader.this, adPresenter);
        }

        public final void onAdPresenterBuildError(AdPresenterBuilder adPresenterBuilder, AdPresenterBuilderException adPresenterBuilderException) {
            Error error;
            Objects.requireNonNull(adPresenterBuilder);
            Objects.requireNonNull(adPresenterBuilderException);
            AdLoader.this.logger.error(LogDomain.AD, "Failed to build %s with %s. Error: %s", AdPresenter.class.getSimpleName(), adPresenterBuilder.getClass().getSimpleName(), adPresenterBuilderException);
            AdLoaderAdQualityViolationUtils access$800 = AdLoader.this.adQualityViolationUtils;
            Exception rootReason = SdkComponentExceptionUtil.getRootReason(adPresenterBuilderException);
            if (rootReason instanceof AdQualityViolationException) {
                AdQualityViolationException adQualityViolationException = (AdQualityViolationException) rootReason;
                access$800.adQualityViolationReporter.reportAdViolation(adQualityViolationException.adQualityViolationType, adQualityViolationException.somaApiContext, adQualityViolationException.violatedUrl, adQualityViolationException.originalUrl);
            }
            switch (C85972.$SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error[adPresenterBuilderException.getErrorType().ordinal()]) {
                case 1:
                    error = Error.CANCELLED;
                    break;
                case 2:
                    error = Error.INVALID_RESPONSE;
                    break;
                case 3:
                    error = Error.CREATIVE_RESOURCE_EXPIRED;
                    break;
                case 4:
                    error = Error.NO_CONNECTION;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    error = Error.NETWORK;
                    break;
                case 9:
                    error = Error.PRESENTER_BUILDER_GENERIC;
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected %s %s: %s", new Object[]{AdPresenterBuilder.class.getSimpleName(), AdPresenterBuilder.Error.class.getSimpleName(), adPresenterBuilderException}));
            }
            Objects.onNotNull(AdLoader.this.listener, new Consumer(error, adPresenterBuilderException) {
                public final /* synthetic */ AdLoader.Error f$1;
                public final /* synthetic */ AdPresenterBuilderException f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void accept(Object obj) {
                    AdLoader.AdPresenterBuilderListener.this.mo54396x963e2c4(this.f$1, this.f$2, (AdLoader.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onAdPresenterBuildError$1$AdLoader$AdPresenterBuilderListener */
        public /* synthetic */ void mo54396x963e2c4(Error error, AdPresenterBuilderException adPresenterBuilderException, Listener listener) {
            listener.onAdLoadError(AdLoader.this, new AdLoaderException(error, adPresenterBuilderException));
        }
    }

    /* renamed from: com.smaato.sdk.core.ad.AdLoader$2 */
    static /* synthetic */ class C85972 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|52) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b9 */
        static {
            /*
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error[] r0 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error = r0
                r1 = 1
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r2 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r3 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r4 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r5 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.TRANSPORT_NO_NETWORK_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r6 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.TRANSPORT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r7 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.TRANSPORT_IO_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r8 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.TRANSPORT_IO_TOO_MANY_REDIRECTS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r9 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.TRANSPORT_GENERIC     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r8 = $SwitchMap$com$smaato$sdk$core$ad$AdPresenterBuilder$Error     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.ad.AdPresenterBuilder$Error r9 = com.smaato.sdk.core.p248ad.AdPresenterBuilder.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x006c }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r10 = 9
                r8[r9] = r10     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                com.smaato.sdk.core.api.ApiConnector$Error[] r8 = com.smaato.sdk.core.api.ApiConnector.Error.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error = r8
                com.smaato.sdk.core.api.ApiConnector$Error r9 = com.smaato.sdk.core.api.ApiConnector.Error.NO_AD     // Catch:{ NoSuchFieldError -> 0x007d }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.smaato.sdk.core.api.ApiConnector$Error r8 = com.smaato.sdk.core.api.ApiConnector.Error.BAD_REQUEST     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.RESPONSE_MAPPING     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x009b }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.TRANSPORT_NO_NETWORK_CONNECTION     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.TRANSPORT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x00af }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.TRANSPORT_GENERIC     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.TRANSPORT_IO_ERROR     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.smaato.sdk.core.api.ApiConnector$Error r1 = com.smaato.sdk.core.api.ApiConnector.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p248ad.AdLoader.C85972.<clinit>():void");
        }
    }

    public void requestAd(AdRequest adRequest, AdTypeStrategy adTypeStrategy) {
        try {
            Objects.requireNonNull(adRequest);
            Objects.requireNonNull(adTypeStrategy);
            Objects.onNotNull(this.startedTask.get(), $$Lambda$AdLoader$ayCf2_bsV1DXmhFgwxOFxw1fD44.INSTANCE);
            Class<? extends AdPresenter> adPresenterClass = adTypeStrategy.getAdPresenterClass();
            ApiAdRequest map = this.adRequestMapper.map(adRequest);
            Task performApiAdRequest = this.apiConnector.performApiAdRequest(map);
            this.startedTask.set(new TaskRequestHolder(performApiAdRequest, adPresenterClass, map, (byte) 0));
            performApiAdRequest.start();
        } catch (AdRequestMapper.UnresolvedServerAdFormatException e) {
            this.logger.error(LogDomain.AD, e, "Configuration error: can not resolve ad format", new Object[0]);
            Objects.onNotNull(this.listener, new Consumer(e) {
                public final /* synthetic */ AdRequestMapper.UnresolvedServerAdFormatException f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdLoader.this.lambda$requestAd$0$AdLoader(this.f$1, (AdLoader.Listener) obj);
                }
            });
        } catch (Exception e2) {
            this.logger.error(LogDomain.AD, e2, "Internal error", new Object[0]);
            Objects.onNotNull(this.listener, new Consumer(e2) {
                public final /* synthetic */ Exception f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    AdLoader.this.lambda$requestAd$1$AdLoader(this.f$1, (AdLoader.Listener) obj);
                }
            });
        }
    }

    static /* synthetic */ boolean access$100(AdLoader adLoader, TaskRequestHolder taskRequestHolder, Task task) {
        if (taskRequestHolder == null) {
            adLoader.logger.info(LogDomain.AD, "There is no request currently running. Callback was not expected", new Object[0]);
            return false;
        } else if (task == taskRequestHolder.task) {
            return true;
        } else {
            adLoader.logger.info(LogDomain.AD, "Unknown task. Current task=%s, received task=%s", taskRequestHolder.task, task);
            return false;
        }
    }

    static /* synthetic */ void access$300(AdLoader adLoader, ApiConnectorException apiConnectorException) {
        Error error;
        switch (C85972.$SwitchMap$com$smaato$sdk$core$api$ApiConnector$Error[apiConnectorException.getErrorType().ordinal()]) {
            case 1:
                error = Error.NO_AD;
                break;
            case 2:
                error = Error.BAD_REQUEST;
                break;
            case 3:
                error = Error.API;
                break;
            case 4:
                error = Error.NO_CONNECTION;
                break;
            case 5:
            case 6:
            case 7:
                error = Error.NETWORK;
                break;
            case 8:
                error = Error.CANCELLED;
                break;
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s %s: %s", new Object[]{ApiConnector.class.getSimpleName(), ApiConnector.Error.class.getSimpleName(), apiConnectorException}));
        }
        Objects.onNotNull(adLoader.listener, new Consumer(error, apiConnectorException) {
            public final /* synthetic */ AdLoader.Error f$1;
            public final /* synthetic */ ApiConnectorException f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                AdLoader.this.lambda$handleApiConnectorException$5$AdLoader(this.f$1, this.f$2, (AdLoader.Listener) obj);
            }
        });
    }
}
