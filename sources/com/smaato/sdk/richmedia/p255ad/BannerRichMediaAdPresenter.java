package com.smaato.sdk.richmedia.p255ad;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.core.analytics.WebViewViewabilityTracker;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.deeplink.UrlResolveListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdInteractor;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.p248ad.BaseAdPresenter;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p255ad.BannerRichMediaAdPresenter;
import com.smaato.sdk.richmedia.p255ad.RichMediaAdInteractor;
import com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTracker;
import com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.p255ad.tracker.VisibilityTrackerListener;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter */
final class BannerRichMediaAdPresenter extends BaseAdPresenter implements BannerAdPresenter {
    /* access modifiers changed from: private */
    public final RichMediaAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public final AppBackgroundDetector appBackgroundDetector;
    /* access modifiers changed from: private */
    public WeakReference<RichMediaAdContentView> contentViewRef = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public WeakReference<BannerAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public final Logger logger;
    private final MraidConfigurator mraidConfigurator;
    private final RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    private AdInteractor.TtlListener ttlListener = new AdInteractor.TtlListener() {
        public final void onTTLExpired(AdInteractor adInteractor) {
            BannerRichMediaAdPresenter.this.lambda$new$1$BannerRichMediaAdPresenter(adInteractor);
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<RichMediaVisibilityTracker> visibilityTrackerRef = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final WebViewViewabilityTracker webViewViewabilityTracker;

    public /* synthetic */ void lambda$new$1$BannerRichMediaAdPresenter(AdInteractor adInteractor2) {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$null$0$BannerRichMediaAdPresenter((BannerAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$0$BannerRichMediaAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onTTLExpired(this);
    }

    BannerRichMediaAdPresenter(Logger logger2, RichMediaAdInteractor richMediaAdInteractor, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator2, AppBackgroundDetector appBackgroundDetector2, MraidConfigurator mraidConfigurator2, WebViewViewabilityTracker webViewViewabilityTracker2) {
        super(richMediaAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adInteractor = (RichMediaAdInteractor) Objects.requireNonNull(richMediaAdInteractor);
        this.richMediaVisibilityTrackerCreator = (RichMediaVisibilityTrackerCreator) Objects.requireNonNull(richMediaVisibilityTrackerCreator2);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.mraidConfigurator = (MraidConfigurator) Objects.requireNonNull(mraidConfigurator2);
        this.webViewViewabilityTracker = (WebViewViewabilityTracker) Objects.requireNonNull(webViewViewabilityTracker2);
        $$Lambda$BannerRichMediaAdPresenter$G5FIx0rLf5dRKBcSsOa9lHpv28 r5 = new StateMachine.Listener(webViewViewabilityTracker2, richMediaAdInteractor, logger2) {
            public final /* synthetic */ WebViewViewabilityTracker f$1;
            public final /* synthetic */ RichMediaAdInteractor f$2;
            public final /* synthetic */ Logger f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                BannerRichMediaAdPresenter.this.lambda$new$3$BannerRichMediaAdPresenter(this.f$1, this.f$2, this.f$3, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r5;
        richMediaAdInteractor.addStateListener(r5);
        richMediaAdInteractor.addTtlListener(this.ttlListener);
        richMediaAdInteractor.callback = new RichMediaAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                BannerRichMediaAdPresenter.this.lambda$new$5$BannerRichMediaAdPresenter();
            }
        };
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$2 */
    static /* synthetic */ class C88922 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.ad.AdStateMachine$State[] r0 = com.smaato.sdk.core.p248ad.AdStateMachine.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State = r0
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.INIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.TO_BE_DELETED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p255ad.BannerRichMediaAdPresenter.C88922.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$3$BannerRichMediaAdPresenter(WebViewViewabilityTracker webViewViewabilityTracker2, RichMediaAdInteractor richMediaAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C88922.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                webViewViewabilityTracker2.trackImpression();
                return;
            case 6:
                Objects.onNotNull(this.listener.get(), new Consumer() {
                    public final void accept(Object obj) {
                        BannerRichMediaAdPresenter.this.lambda$null$2$BannerRichMediaAdPresenter((BannerAdPresenter.Listener) obj);
                    }
                });
                return;
            case 7:
                richMediaAdInteractor.removeStateListener(this.stateListener);
                return;
            default:
                logger2.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public /* synthetic */ void lambda$null$2$BannerRichMediaAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$5$BannerRichMediaAdPresenter() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$null$4$BannerRichMediaAdPresenter((BannerAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$4$BannerRichMediaAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    public final void initialize() {
        this.adInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    public final AdContentView getAdContentView(Context context) {
        RichMediaAdContentViewCallback richMediaAdContentViewCallback = new RichMediaAdContentViewCallback(this, (byte) 0);
        RichMediaAdContentView createViewForBanner = this.mraidConfigurator.createViewForBanner(context, (RichMediaAdObject) this.adInteractor.getAdObject(), richMediaAdContentViewCallback);
        if (createViewForBanner == null) {
            return null;
        }
        createViewForBanner.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                BannerRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.visibilityTrackerRef.set(this.richMediaVisibilityTrackerCreator.createTracker(createViewForBanner, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                BannerRichMediaAdPresenter.this.lambda$getAdContentView$6$BannerRichMediaAdPresenter();
            }
        }));
        this.contentViewRef = new WeakReference<>(createViewForBanner);
        return createViewForBanner;
    }

    public /* synthetic */ void lambda$getAdContentView$6$BannerRichMediaAdPresenter() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    public final void setListener(BannerAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.adInteractor.onEvent(AdStateMachine.Event.DESTROY);
        Objects.onNotNull(this.contentViewRef.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$onDestroy$7$BannerRichMediaAdPresenter((RichMediaAdContentView) obj);
            }
        });
        Objects.onNotNull(this.visibilityTrackerRef.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$onDestroy$8$BannerRichMediaAdPresenter((RichMediaVisibilityTracker) obj);
            }
        });
        this.webViewViewabilityTracker.stopTracking();
        this.adInteractor.stopUrlResolving();
        this.listener.clear();
    }

    public /* synthetic */ void lambda$onDestroy$7$BannerRichMediaAdPresenter(RichMediaAdContentView richMediaAdContentView) {
        richMediaAdContentView.destroy();
        this.contentViewRef.clear();
    }

    public /* synthetic */ void lambda$onDestroy$8$BannerRichMediaAdPresenter(RichMediaVisibilityTracker richMediaVisibilityTracker) {
        richMediaVisibilityTracker.destroy();
        this.visibilityTrackerRef.set((Object) null);
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
    final class RichMediaAdContentViewCallback implements RichMediaAdContentView.Callback {
        private final UrlResolveListener resolveClickListener;
        private final UrlResolveListener resolvePlayVideoListener;

        public final void onHidden(RichMediaAdContentView richMediaAdContentView) {
        }

        private RichMediaAdContentViewCallback() {
            this.resolveClickListener = new UrlResolveListener() {
                public final void onError() {
                    Threads.runOnUi(new Runnable() {
                        public final void run() {
                            BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55934x1ce280e1();
                        }
                    });
                }

                public final void onSuccess(Consumer<Context> consumer) {
                    Threads.runOnUi(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: INVOKE  
                          (wrap: com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8 : 0x0002: CONSTRUCTOR  (r0v0 com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8) = 
                          (r1v0 'this' com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1 A[THIS])
                          (r2v0 'consumer' com.smaato.sdk.core.util.fi.Consumer<android.content.Context>)
                         call: com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8.<init>(com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1, com.smaato.sdk.core.util.fi.Consumer):void type: CONSTRUCTOR)
                         com.smaato.sdk.core.util.Threads.runOnUi(java.lang.Runnable):boolean type: STATIC in method: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.1.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8) = 
                          (r1v0 'this' com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1 A[THIS])
                          (r2v0 'consumer' com.smaato.sdk.core.util.fi.Consumer<android.content.Context>)
                         call: com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8.<init>(com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1, com.smaato.sdk.core.util.fi.Consumer):void type: CONSTRUCTOR in method: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.1.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 74 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 80 more
                        */
                    /*
                        this = this;
                        com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8 r0 = new com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1$M7a5OnEQajbqAI0QossRxGHOvc8
                        r0.<init>(r1, r2)
                        com.smaato.sdk.core.util.Threads.runOnUi(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p255ad.BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.C88931.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void");
                }

                /* renamed from: lambda$onSuccess$0$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback$1 */
                public /* synthetic */ void mo55954x35d590ef(Consumer consumer) {
                    Threads.runOnUi(new Runnable(consumer) {
                        public final /* synthetic */ Consumer f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55935x6701e7de(this.f$1);
                        }
                    });
                    RichMediaAdContentViewCallback.access$400(RichMediaAdContentViewCallback.this);
                }
            };
            this.resolvePlayVideoListener = new UrlResolveListener() {
                public final void onError() {
                    Threads.runOnUi(new Runnable() {
                        public final void run() {
                            BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55934x1ce280e1();
                        }
                    });
                }

                public final void onSuccess(Consumer<Context> consumer) {
                    Threads.runOnUi(new Runnable(consumer) {
                        public final /* synthetic */ Consumer f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55935x6701e7de(this.f$1);
                        }
                    });
                }
            };
        }

        /* synthetic */ RichMediaAdContentViewCallback(BannerRichMediaAdPresenter bannerRichMediaAdPresenter, byte b) {
            this();
        }

        public final void onWebViewLoaded(RichMediaAdContentView richMediaAdContentView) {
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.registerAdView(richMediaAdContentView.getWebView());
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.startTracking();
            Objects.onNotNull(BannerRichMediaAdPresenter.this.visibilityTrackerRef.get(), $$Lambda$u0fuGW6C4x96oi_UHwrAM_O6eeI.INSTANCE);
        }

        public final void onUrlClicked(RichMediaAdContentView richMediaAdContentView, String str) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            BannerRichMediaAdPresenter.this.adInteractor.resolveClickUrl(str, this.resolveClickListener);
        }

        public final void onAdExpanded(RichMediaAdContentView richMediaAdContentView) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping expand event, because app is in background", new Object[0]);
            } else {
                Objects.onNotNull(BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                    public final void accept(Object obj) {
                        BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55938xd6633fd3((BannerAdPresenter.Listener) obj);
                    }
                });
            }
        }

        /* renamed from: lambda$onAdExpanded$0$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55938xd6633fd3(BannerAdPresenter.Listener listener) {
            listener.onAdExpanded(BannerRichMediaAdPresenter.this);
        }

        /* renamed from: lambda$null$1$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55936xc0125be0(BannerAdPresenter.Listener listener) {
            listener.onAdUnload(BannerRichMediaAdPresenter.this);
        }

        /* renamed from: lambda$onUnloadView$2$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55940x615fa99d() {
            Objects.onNotNull(BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55936xc0125be0((BannerAdPresenter.Listener) obj);
                }
            });
        }

        public final void onUnloadView(RichMediaAdContentView richMediaAdContentView) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55940x615fa99d();
                }
            });
        }

        public final void onAdResized(RichMediaAdContentView richMediaAdContentView) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping resize event, because app is in background", new Object[0]);
            } else {
                Objects.onNotNull(BannerRichMediaAdPresenter.this.listener.get(), $$Lambda$cYYIRl5OnGn12VImG_S6TxguU.INSTANCE);
            }
        }

        public final void onAdCollapsed(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull(BannerRichMediaAdPresenter.this.listener.get(), $$Lambda$DnClyV8LMK4oneag9X9lq8FTdY.INSTANCE);
        }

        public final void onAdViolation(String str, String str2) {
            BannerRichMediaAdPresenter.this.adInteractor.reportAdViolation(str, str2);
        }

        public final void registerFriendlyObstruction(View view) {
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.registerFriendlyObstruction(view);
        }

        public final void removeFriendlyObstruction(View view) {
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.removeFriendlyObstruction(view);
        }

        public final void updateAdView(RichMediaWebView richMediaWebView) {
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.updateAdView(richMediaWebView);
        }

        /* renamed from: lambda$onRenderProcessGone$3$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55939x54c438da(BannerAdPresenter.Listener listener) {
            listener.onAdError(BannerRichMediaAdPresenter.this);
        }

        public final void onRenderProcessGone(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull(BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55939x54c438da((BannerAdPresenter.Listener) obj);
                }
            });
        }

        public final void onPlayVideo(RichMediaAdContentView richMediaAdContentView, String str) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping play video event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            BannerRichMediaAdPresenter.this.adInteractor.resolveClickUrl(str, this.resolvePlayVideoListener);
        }

        /* renamed from: lambda$handleResolveUrlError$6$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55934x1ce280e1() {
            BannerRichMediaAdPresenter.this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            Objects.onNotNull(BannerRichMediaAdPresenter.this.contentViewRef.get(), C8858xa8d2c2c4.INSTANCE);
            Objects.onNotNull(BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55937x2e98ee4((BannerAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$null$5$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55937x2e98ee4(BannerAdPresenter.Listener listener) {
            listener.onAdError(BannerRichMediaAdPresenter.this);
        }

        /* renamed from: lambda$handleResolveUrlSuccess$8$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55935x6701e7de(Consumer consumer) {
            Objects.onNotNull(BannerRichMediaAdPresenter.this.contentViewRef.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.lambda$null$7(Consumer.this, (RichMediaAdContentView) obj);
                }
            });
        }

        static /* synthetic */ void lambda$null$7(Consumer consumer, RichMediaAdContentView richMediaAdContentView) {
            richMediaAdContentView.showProgressIndicator(false);
            consumer.accept(richMediaAdContentView.getContext());
        }

        static /* synthetic */ void access$400(RichMediaAdContentViewCallback richMediaAdContentViewCallback) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
            } else {
                BannerRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
            }
        }
    }
}
