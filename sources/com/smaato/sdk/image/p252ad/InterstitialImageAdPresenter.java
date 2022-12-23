package com.smaato.sdk.image.p252ad;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.deeplink.UrlResolveListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdStateMachine;
import com.smaato.sdk.core.p248ad.BaseAdPresenter;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.tracker.VisibilityTrackerListener;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.image.p252ad.ImageAdInteractor;
import com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter;
import com.smaato.sdk.image.p253ui.StaticImageAdContentView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.image.ad.InterstitialImageAdPresenter */
final class InterstitialImageAdPresenter extends BaseAdPresenter implements InterstitialAdPresenter {
    /* access modifiers changed from: private */
    public final ImageAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public final AppBackgroundDetector appBackgroundDetector;
    private final VisibilityTrackerCreator imageVisibilityTrackerCreator;
    /* access modifiers changed from: private */
    public WeakReference<InterstitialAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public final Logger logger;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    /* access modifiers changed from: private */
    public final Timer timer;
    /* access modifiers changed from: private */
    public final Timer.Listener timerListener = new Timer.Listener() {
        public final void onTimePassed() {
            InterstitialImageAdPresenter.this.lambda$new$0$InterstitialImageAdPresenter();
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<VisibilityTracker> visibilityTrackerReference = new AtomicReference<>();

    public final void setFriendlyObstructionView(View view) {
    }

    public /* synthetic */ void lambda$new$0$InterstitialImageAdPresenter() {
        Objects.onNotNull(this.listener.get(), $$Lambda$nk0D4u8wrNMCMfE3WzHxisIX_k.INSTANCE);
    }

    InterstitialImageAdPresenter(Logger logger2, ImageAdInteractor imageAdInteractor, VisibilityTrackerCreator visibilityTrackerCreator, Timer timer2, AppBackgroundDetector appBackgroundDetector2) {
        super(imageAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adInteractor = (ImageAdInteractor) Objects.requireNonNull(imageAdInteractor);
        this.imageVisibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.timer = (Timer) Objects.requireNonNull(timer2);
        C8733x2b8a7028 r5 = new StateMachine.Listener(imageAdInteractor, logger2) {
            public final /* synthetic */ ImageAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                InterstitialImageAdPresenter.this.lambda$new$2$InterstitialImageAdPresenter(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r5;
        imageAdInteractor.addStateListener(r5);
        imageAdInteractor.setOnImpressionTriggered(new ImageAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                InterstitialImageAdPresenter.this.lambda$new$4$InterstitialImageAdPresenter();
            }
        });
        imageAdInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    /* renamed from: com.smaato.sdk.image.ad.InterstitialImageAdPresenter$4 */
    static /* synthetic */ class C87474 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p248ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x003e }
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87474.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$2$InterstitialImageAdPresenter(ImageAdInteractor imageAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C87474.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Objects.onNotNull(this.listener.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialImageAdPresenter.this.lambda$null$1$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
                    }
                });
                return;
            case 7:
                imageAdInteractor.removeStateListener(this.stateListener);
                return;
            default:
                logger2.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public /* synthetic */ void lambda$null$1$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$4$InterstitialImageAdPresenter() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialImageAdPresenter.this.lambda$null$3$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$3$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    public final AdContentView getAdContentView(Context context) {
        final AtomicReference atomicReference = new AtomicReference((Object) null);
        final StaticImageAdContentView create = StaticImageAdContentView.create(context, (ImageAdObject) this.adInteractor.getAdObject(), new View.OnClickListener() {
            private UrlResolveListener resolveListener = new UrlResolveListener() {
                public final void onError() {
                    Threads.runOnUi(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
                          (wrap: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM : 0x0006: CONSTRUCTOR  (r1v0 com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM) = 
                          (r2v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                          (wrap: java.util.concurrent.atomic.AtomicReference : 0x0002: IGET  (r0v1 java.util.concurrent.atomic.AtomicReference) = 
                          (wrap: com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 : 0x0000: IGET  (r0v0 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1) = 
                          (r2v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.this$1 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1)
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.val$contentViewRef java.util.concurrent.atomic.AtomicReference)
                         call: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM.<init>(com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1, java.util.concurrent.atomic.AtomicReference):void type: CONSTRUCTOR)
                         com.smaato.sdk.core.util.Threads.runOnUi(java.lang.Runnable):boolean type: STATIC in method: com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.onError():void, dex: classes3.dex
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
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:98)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:480)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:437)
                        	at jadx.core.codegen.ClassGen.addField(ClassGen.java:378)
                        	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:348)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v0 com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM) = 
                          (r2v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                          (wrap: java.util.concurrent.atomic.AtomicReference : 0x0002: IGET  (r0v1 java.util.concurrent.atomic.AtomicReference) = 
                          (wrap: com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 : 0x0000: IGET  (r0v0 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1) = 
                          (r2v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.this$1 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1)
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.val$contentViewRef java.util.concurrent.atomic.AtomicReference)
                         call: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM.<init>(com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1, java.util.concurrent.atomic.AtomicReference):void type: CONSTRUCTOR in method: com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.onError():void, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 74 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 80 more
                        */
                    /*
                        this = this;
                        com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 r0 = com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87431.this
                        java.util.concurrent.atomic.AtomicReference r0 = r0
                        com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM r1 = new com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$_cdV4oAT602ckMiwOy1-N38NCFM
                        r1.<init>(r2, r0)
                        com.smaato.sdk.core.util.Threads.runOnUi(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87431.C87441.onError():void");
                }

                public /* synthetic */ void lambda$onError$2$InterstitialImageAdPresenter$1$1(AtomicReference atomicReference) {
                    InterstitialImageAdPresenter.this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
                    Objects.onNotNull(InterstitialImageAdPresenter.this.listener.get(), 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: INVOKE  
                          (wrap: java.lang.Object : 0x001a: INVOKE  (r0v6 java.lang.Object) = 
                          (wrap: java.lang.ref.WeakReference : 0x0016: INVOKE  (r0v5 java.lang.ref.WeakReference) = 
                          (wrap: com.smaato.sdk.image.ad.InterstitialImageAdPresenter : 0x0014: IGET  (r0v4 com.smaato.sdk.image.ad.InterstitialImageAdPresenter) = 
                          (wrap: com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 : 0x0012: IGET  (r0v3 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1) = 
                          (r4v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.this$1 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1)
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.this$0 com.smaato.sdk.image.ad.InterstitialImageAdPresenter)
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.access$100(com.smaato.sdk.image.ad.InterstitialImageAdPresenter):java.lang.ref.WeakReference type: STATIC)
                         java.lang.ref.WeakReference.get():java.lang.Object type: VIRTUAL)
                          (wrap: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8 : 0x0020: CONSTRUCTOR  (r1v1 com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8) = 
                          (r4v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                         call: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8.<init>(com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1):void type: CONSTRUCTOR)
                         com.smaato.sdk.core.util.Objects.onNotNull(java.lang.Object, com.smaato.sdk.core.util.fi.Consumer):void type: STATIC in method: com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.lambda$onError$2$InterstitialImageAdPresenter$1$1(java.util.concurrent.atomic.AtomicReference):void, dex: classes3.dex
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
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:98)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:480)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:437)
                        	at jadx.core.codegen.ClassGen.addField(ClassGen.java:378)
                        	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:348)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: CONSTRUCTOR  (r1v1 com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8) = 
                          (r4v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                         call: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8.<init>(com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1):void type: CONSTRUCTOR in method: com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.lambda$onError$2$InterstitialImageAdPresenter$1$1(java.util.concurrent.atomic.AtomicReference):void, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 74 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 80 more
                        */
                    /*
                        this = this;
                        com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 r0 = com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87431.this
                        com.smaato.sdk.image.ad.InterstitialImageAdPresenter r0 = com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.this
                        com.smaato.sdk.core.log.Logger r0 = r0.logger
                        com.smaato.sdk.core.log.LogDomain r1 = com.smaato.sdk.core.log.LogDomain.AD
                        r2 = 0
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        java.lang.String r3 = "The url seems to be invalid"
                        r0.error(r1, r3, r2)
                        com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 r0 = com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87431.this
                        com.smaato.sdk.image.ad.InterstitialImageAdPresenter r0 = com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.this
                        java.lang.ref.WeakReference r0 = r0.listener
                        java.lang.Object r0 = r0.get()
                        com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8 r1 = new com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$ChSoGCxzofjhvgPlgbbU38hJag8
                        r1.<init>(r4)
                        com.smaato.sdk.core.util.Objects.onNotNull(r0, r1)
                        java.lang.Object r5 = r5.get()
                        com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$HiXJUcO1V92Isl5fb8C7yD6heyU r0 = com.smaato.sdk.image.p252ad.C8724xc4f430f.INSTANCE
                        com.smaato.sdk.core.util.Objects.onNotNull(r5, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87431.C87441.lambda$onError$2$InterstitialImageAdPresenter$1$1(java.util.concurrent.atomic.AtomicReference):void");
                }

                public /* synthetic */ void lambda$null$0$InterstitialImageAdPresenter$1$1(InterstitialAdPresenter.Listener listener) {
                    listener.onAdError(InterstitialImageAdPresenter.this);
                }

                public final void onSuccess(Consumer<Context> consumer) {
                    Threads.runOnUi(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
                          (wrap: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE : 0x0006: CONSTRUCTOR  (r1v0 com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE) = 
                          (wrap: java.util.concurrent.atomic.AtomicReference : 0x0002: IGET  (r0v1 java.util.concurrent.atomic.AtomicReference) = 
                          (wrap: com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 : 0x0000: IGET  (r0v0 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1) = 
                          (r2v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.this$1 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1)
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.val$contentViewRef java.util.concurrent.atomic.AtomicReference)
                          (r3v0 'consumer' com.smaato.sdk.core.util.fi.Consumer<android.content.Context>)
                         call: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE.<init>(java.util.concurrent.atomic.AtomicReference, com.smaato.sdk.core.util.fi.Consumer):void type: CONSTRUCTOR)
                         com.smaato.sdk.core.util.Threads.runOnUi(java.lang.Runnable):boolean type: STATIC in method: com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void, dex: classes3.dex
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
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:98)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:480)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:437)
                        	at jadx.core.codegen.ClassGen.addField(ClassGen.java:378)
                        	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:348)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v0 com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE) = 
                          (wrap: java.util.concurrent.atomic.AtomicReference : 0x0002: IGET  (r0v1 java.util.concurrent.atomic.AtomicReference) = 
                          (wrap: com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 : 0x0000: IGET  (r0v0 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1) = 
                          (r2v0 'this' com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1$1 A[THIS])
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.this$1 com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1)
                         com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.val$contentViewRef java.util.concurrent.atomic.AtomicReference)
                          (r3v0 'consumer' com.smaato.sdk.core.util.fi.Consumer<android.content.Context>)
                         call: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE.<init>(java.util.concurrent.atomic.AtomicReference, com.smaato.sdk.core.util.fi.Consumer):void type: CONSTRUCTOR in method: com.smaato.sdk.image.ad.InterstitialImageAdPresenter.1.1.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 74 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 80 more
                        */
                    /*
                        this = this;
                        com.smaato.sdk.image.ad.InterstitialImageAdPresenter$1 r0 = com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87431.this
                        java.util.concurrent.atomic.AtomicReference r0 = r0
                        com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE r1 = new com.smaato.sdk.image.ad.-$$Lambda$InterstitialImageAdPresenter$1$1$M8po613vv-bOQNqXB7AJjDdU1oE
                        r1.<init>(r0, r3)
                        com.smaato.sdk.core.util.Threads.runOnUi(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p252ad.InterstitialImageAdPresenter.C87431.C87441.onSuccess(com.smaato.sdk.core.util.fi.Consumer):void");
                }

                static /* synthetic */ void lambda$null$3(Consumer consumer, StaticImageAdContentView staticImageAdContentView) {
                    consumer.accept(staticImageAdContentView.getContext());
                    staticImageAdContentView.showProgressIndicator(false);
                }
            };

            public final void onClick(View view) {
                if (InterstitialImageAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                    InterstitialImageAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
                    return;
                }
                ((StaticImageAdContentView) view).showProgressIndicator(true);
                InterstitialImageAdPresenter.this.adInteractor.resolveClickUrl(this.resolveListener);
                InterstitialImageAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
            }
        });
        atomicReference.set(create);
        this.visibilityTrackerReference.set(this.imageVisibilityTrackerCreator.createTracker(create, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                InterstitialImageAdPresenter.this.lambda$getAdContentView$5$InterstitialImageAdPresenter();
            }
        }));
        create.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                InterstitialImageAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                Objects.onNotNull(InterstitialImageAdPresenter.this.visibilityTrackerReference.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialImageAdPresenter.C87452.this.lambda$onViewDetachedFromWindow$0$InterstitialImageAdPresenter$2((VisibilityTracker) obj);
                    }
                });
            }

            public /* synthetic */ void lambda$onViewDetachedFromWindow$0$InterstitialImageAdPresenter$2(VisibilityTracker visibilityTracker) {
                InterstitialImageAdPresenter.this.visibilityTrackerReference.set((Object) null);
                visibilityTracker.destroy();
            }
        });
        create.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public final boolean onPreDraw() {
                create.getViewTreeObserver().removeOnPreDrawListener(this);
                InterstitialImageAdPresenter.this.timer.start(InterstitialImageAdPresenter.this.timerListener);
                return true;
            }
        });
        return create;
    }

    public /* synthetic */ void lambda$getAdContentView$5$InterstitialImageAdPresenter() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    public /* synthetic */ void lambda$onCloseClicked$6$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onClose(this);
    }

    public final void onCloseClicked() {
        Objects.onNotNull(this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialImageAdPresenter.this.lambda$onCloseClicked$6$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public final void setListener(InterstitialAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    public final void onDestroy() {
        this.adInteractor.onEvent(AdStateMachine.Event.DESTROY);
        this.adInteractor.stopUrlResolving();
        this.listener.clear();
    }
}
