package com.smaato.sdk.richmedia.p255ad;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.core.analytics.WebViewViewabilityTracker;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.deeplink.UrlResolveListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.BaseAdPresenter;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p255ad.InterstitialRichMediaAdPresenter;
import com.smaato.sdk.richmedia.p255ad.RichMediaAdInteractor;
import com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTracker;
import com.smaato.sdk.richmedia.p255ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.p255ad.tracker.VisibilityTrackerListener;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter */
final class InterstitialRichMediaAdPresenter extends BaseAdPresenter implements InterstitialAdPresenter {
    /* access modifiers changed from: private */
    public final RichMediaAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public final AppBackgroundDetector appBackgroundDetector;
    /* access modifiers changed from: private */
    public WeakReference<RichMediaAdContentView> contentViewRef = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public final List<WeakReference<View>> friendlyObstructionViews = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public WeakReference<InterstitialAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public final Logger logger;
    private final MraidConfigurator mraidConfigurator;
    private final RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    /* access modifiers changed from: private */
    public final Timer timer;
    /* access modifiers changed from: private */
    public final Timer.Listener timerListener = new Timer.Listener() {
        public final void onTimePassed() {
            InterstitialRichMediaAdPresenter.this.lambda$new$0$InterstitialRichMediaAdPresenter();
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<RichMediaVisibilityTracker> visibilityTrackerReference = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final WebViewViewabilityTracker webViewViewabilityTracker;

    public /* synthetic */ void lambda$new$0$InterstitialRichMediaAdPresenter() {
        Objects.onNotNull(this.listener.get(), $$Lambda$nk0D4u8wrNMCMfE3WzHxisIX_k.INSTANCE);
    }

    InterstitialRichMediaAdPresenter(Logger logger2, RichMediaAdInteractor richMediaAdInteractor, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator2, Timer timer2, AppBackgroundDetector appBackgroundDetector2, MraidConfigurator mraidConfigurator2, WebViewViewabilityTracker webViewViewabilityTracker2) {
        super(richMediaAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adInteractor = (RichMediaAdInteractor) Objects.requireNonNull(richMediaAdInteractor);
        this.richMediaVisibilityTrackerCreator = (RichMediaVisibilityTrackerCreator) Objects.requireNonNull(richMediaVisibilityTrackerCreator2);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.mraidConfigurator = (MraidConfigurator) Objects.requireNonNull(mraidConfigurator2);
        this.webViewViewabilityTracker = (WebViewViewabilityTracker) Objects.requireNonNull(webViewViewabilityTracker2);
        this.timer = (Timer) Objects.requireNonNull(timer2);
        C8876xbbfd39a5 r5 = new StateMachine.Listener(richMediaAdInteractor, logger2) {
            public final /* synthetic */ RichMediaAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                InterstitialRichMediaAdPresenter.this.lambda$new$2$InterstitialRichMediaAdPresenter(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r5;
        richMediaAdInteractor.addStateListener(r5);
        richMediaAdInteractor.callback = new RichMediaAdInteractor.Callback(webViewViewabilityTracker2) {
            public final /* synthetic */ WebViewViewabilityTracker f$1;

            {
                this.f$1 = r2;
            }

            public final void onImpressionTriggered() {
                InterstitialRichMediaAdPresenter.this.lambda$new$4$InterstitialRichMediaAdPresenter(this.f$1);
            }
        };
        richMediaAdInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$3 */
    static /* synthetic */ class C88973 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x003e }
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p255ad.InterstitialRichMediaAdPresenter.C88973.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$2$InterstitialRichMediaAdPresenter(RichMediaAdInteractor richMediaAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C88973.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Objects.onNotNull(this.listener.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialRichMediaAdPresenter.this.lambda$null$1$InterstitialRichMediaAdPresenter((InterstitialAdPresenter.Listener) obj);
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

    public /* synthetic */ void lambda$null$1$InterstitialRichMediaAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$4$InterstitialRichMediaAdPresenter(WebViewViewabilityTracker webViewViewabilityTracker2) {
        Objects.onNotNull(this.listener.get(), new Consumer(webViewViewabilityTracker2) {
            public final /* synthetic */ WebViewViewabilityTracker f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InterstitialRichMediaAdPresenter.this.lambda$null$3$InterstitialRichMediaAdPresenter(this.f$1, (InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$3$InterstitialRichMediaAdPresenter(WebViewViewabilityTracker webViewViewabilityTracker2, InterstitialAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
        webViewViewabilityTracker2.trackImpression();
    }

    public final AdContentView getAdContentView(Context context) {
        RichMediaAdContentViewCallback richMediaAdContentViewCallback = new RichMediaAdContentViewCallback(this, (byte) 0);
        final RichMediaAdContentView createViewForInterstitial = this.mraidConfigurator.createViewForInterstitial(context, (RichMediaAdObject) this.adInteractor.getAdObject(), richMediaAdContentViewCallback);
        if (createViewForInterstitial == null) {
            return null;
        }
        createViewForInterstitial.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                InterstitialRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                InterstitialRichMediaAdPresenter.this.friendlyObstructionViews.clear();
                InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.stopTracking();
                Objects.onNotNull(InterstitialRichMediaAdPresenter.this.visibilityTrackerReference.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialRichMediaAdPresenter.C88951.this.mo55962x3865df61((RichMediaVisibilityTracker) obj);
                    }
                });
                Objects.onNotNull(InterstitialRichMediaAdPresenter.this.contentViewRef.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialRichMediaAdPresenter.C88951.this.mo55963xaca517c0((RichMediaAdContentView) obj);
                    }
                });
            }

            /* renamed from: lambda$onViewDetachedFromWindow$0$InterstitialRichMediaAdPresenter$1 */
            public /* synthetic */ void mo55962x3865df61(RichMediaVisibilityTracker richMediaVisibilityTracker) {
                InterstitialRichMediaAdPresenter.this.visibilityTrackerReference.set((Object) null);
                richMediaVisibilityTracker.destroy();
            }

            /* renamed from: lambda$onViewDetachedFromWindow$1$InterstitialRichMediaAdPresenter$1 */
            public /* synthetic */ void mo55963xaca517c0(RichMediaAdContentView richMediaAdContentView) {
                InterstitialRichMediaAdPresenter.this.contentViewRef.clear();
                richMediaAdContentView.destroy();
            }
        });
        createViewForInterstitial.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public final boolean onPreDraw() {
                createViewForInterstitial.getViewTreeObserver().removeOnPreDrawListener(this);
                InterstitialRichMediaAdPresenter.this.timer.start(InterstitialRichMediaAdPresenter.this.timerListener);
                return true;
            }
        });
        this.visibilityTrackerReference.set(this.richMediaVisibilityTrackerCreator.createTracker(createViewForInterstitial, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                InterstitialRichMediaAdPresenter.this.lambda$getAdContentView$5$InterstitialRichMediaAdPresenter();
            }
        }));
        this.contentViewRef = new WeakReference<>(createViewForInterstitial);
        return createViewForInterstitial;
    }

    public /* synthetic */ void lambda$getAdContentView$5$InterstitialRichMediaAdPresenter() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    public /* synthetic */ void lambda$onCloseClicked$6$InterstitialRichMediaAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onClose(this);
    }

    public final void onCloseClicked() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialRichMediaAdPresenter.this.lambda$onCloseClicked$6$InterstitialRichMediaAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public final void setListener(InterstitialAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    public final void setFriendlyObstructionView(View view) {
        this.friendlyObstructionViews.add(new WeakReference(view));
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.adInteractor.onEvent(AdStateMachine.Event.DESTROY);
        this.adInteractor.stopUrlResolving();
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
    final class RichMediaAdContentViewCallback implements RichMediaAdContentView.Callback {
        private final UrlResolveListener resolveClickListener;
        private final UrlResolveListener resolvePlayVideoListener;

        public final void onAdCollapsed(RichMediaAdContentView richMediaAdContentView) {
        }

        public final void onAdExpanded(RichMediaAdContentView richMediaAdContentView) {
        }

        public final void onAdResized(RichMediaAdContentView richMediaAdContentView) {
        }

        public final void updateAdView(RichMediaWebView richMediaWebView) {
        }

        private RichMediaAdContentViewCallback() {
            this.resolveClickListener = new UrlResolveListener() {
                public final void onError() {
                    Threads.runOnUi(new Runnable() {
                        public final void run() {
                            InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55967xeecb8661();
                        }
                    });
                }

                public final void onSuccess(Consumer<Context> consumer) {
                    Threads.runOnUi(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: INVOKE  
                          (wrap: com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ : 0x0002: CONSTRUCTOR  (r0v0 com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ) = 
                          (r1v0 'this' com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1 A[THIS])
                          (r2v0 'consumer' com.smaato.sdk.core.util.fi.Consumer<android.content.Context>)
                         call: com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ.<init>(com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1, com.smaato.sdk.core.util.fi.Consumer):void type: CONSTRUCTOR)
                         com.smaato.sdk.core.util.Threads.runOnUi(java.lang.Runnable):boolean type: STATIC in method: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.1.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void, dex: classes3.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ) = 
                          (r1v0 'this' com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1 A[THIS])
                          (r2v0 'consumer' com.smaato.sdk.core.util.fi.Consumer<android.content.Context>)
                         call: com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ.<init>(com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1, com.smaato.sdk.core.util.fi.Consumer):void type: CONSTRUCTOR in method: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.1.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 74 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 80 more
                        */
                    /*
                        this = this;
                        com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ r0 = new com.smaato.sdk.richmedia.ad.-$$Lambda$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1$TDJn2HoyI1zpYa0ES-UnMKGoXvQ
                        r0.<init>(r1, r2)
                        com.smaato.sdk.core.util.Threads.runOnUi(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p255ad.InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.C88981.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void");
                }

                /* renamed from: lambda$onSuccess$0$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback$1 */
                public /* synthetic */ void mo55974xb21aa1af(Consumer consumer) {
                    Threads.runOnUi(new Runnable(consumer) {
                        public final /* synthetic */ Consumer f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55968xe8cefb9e(this.f$1);
                        }
                    });
                    RichMediaAdContentViewCallback.access$1000(RichMediaAdContentViewCallback.this);
                }
            };
            this.resolvePlayVideoListener = new UrlResolveListener() {
                public final void onError() {
                    Threads.runOnUi(new Runnable() {
                        public final void run() {
                            InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55967xeecb8661();
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
                            InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55968xe8cefb9e(this.f$1);
                        }
                    });
                }
            };
        }

        /* synthetic */ RichMediaAdContentViewCallback(InterstitialRichMediaAdPresenter interstitialRichMediaAdPresenter, byte b) {
            this();
        }

        public final void onWebViewLoaded(RichMediaAdContentView richMediaAdContentView) {
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.registerAdView(richMediaAdContentView.getWebView());
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.startTracking();
            for (WeakReference weakReference : InterstitialRichMediaAdPresenter.this.friendlyObstructionViews) {
                Object obj = weakReference.get();
                WebViewViewabilityTracker access$300 = InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker;
                access$300.getClass();
                Objects.onNotNull(obj, new Consumer() {
                    public final void accept(Object obj) {
                        WebViewViewabilityTracker.this.registerFriendlyObstruction((View) obj);
                    }
                });
            }
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.visibilityTrackerReference.get(), $$Lambda$u0fuGW6C4x96oi_UHwrAM_O6eeI.INSTANCE);
        }

        public final void onUrlClicked(RichMediaAdContentView richMediaAdContentView, String str) {
            if (InterstitialRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                InterstitialRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            InterstitialRichMediaAdPresenter.this.adInteractor.resolveClickUrl(str, this.resolveClickListener);
        }

        /* renamed from: lambda$null$0$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55969xa4c56e1f(InterstitialAdPresenter.Listener listener) {
            listener.onAdUnload(InterstitialRichMediaAdPresenter.this);
        }

        /* renamed from: lambda$onUnloadView$1$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55973xa61eba1c() {
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55969xa4c56e1f((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        public final void onUnloadView(RichMediaAdContentView richMediaAdContentView) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55973xa61eba1c();
                }
            });
        }

        /* renamed from: lambda$onHidden$2$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55971xb97bc603(InterstitialAdPresenter.Listener listener) {
            listener.onClose(InterstitialRichMediaAdPresenter.this);
        }

        public final void onHidden(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55971xb97bc603((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        public final void onAdViolation(String str, String str2) {
            InterstitialRichMediaAdPresenter.this.adInteractor.reportAdViolation(str, str2);
        }

        public final void registerFriendlyObstruction(View view) {
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.registerFriendlyObstruction(view);
        }

        public final void removeFriendlyObstruction(View view) {
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.removeFriendlyObstruction(view);
        }

        public final void onRenderProcessGone(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55972x2379f9a((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onRenderProcessGone$3$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55972x2379f9a(InterstitialAdPresenter.Listener listener) {
            listener.onAdError(InterstitialRichMediaAdPresenter.this);
            listener.onClose(InterstitialRichMediaAdPresenter.this);
        }

        public final void onPlayVideo(RichMediaAdContentView richMediaAdContentView, String str) {
            if (InterstitialRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                InterstitialRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping play video event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            InterstitialRichMediaAdPresenter.this.adInteractor.resolveClickUrl(str, this.resolvePlayVideoListener);
        }

        /* renamed from: lambda$handleResolveUrlError$6$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55967xeecb8661() {
            InterstitialRichMediaAdPresenter.this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.contentViewRef.get(), C8869x1a4ccc90.INSTANCE);
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo55970x2982c624((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$null$5$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55970x2982c624(InterstitialAdPresenter.Listener listener) {
            listener.onAdError(InterstitialRichMediaAdPresenter.this);
        }

        /* renamed from: lambda$handleResolveUrlSuccess$8$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo55968xe8cefb9e(Consumer consumer) {
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.contentViewRef.get(), new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.lambda$null$7(Consumer.this, (RichMediaAdContentView) obj);
                }
            });
        }

        static /* synthetic */ void lambda$null$7(Consumer consumer, RichMediaAdContentView richMediaAdContentView) {
            richMediaAdContentView.showProgressIndicator(false);
            consumer.accept(richMediaAdContentView.getContext());
        }

        static /* synthetic */ void access$1000(RichMediaAdContentViewCallback richMediaAdContentViewCallback) {
            if (InterstitialRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                InterstitialRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
            } else {
                InterstitialRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
            }
        }
    }
}
