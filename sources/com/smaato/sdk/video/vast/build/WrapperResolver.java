package com.smaato.sdk.video.vast.build;

import android.text.TextUtils;
import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.build.VastResult;
import com.smaato.sdk.video.vast.exceptions.wrapper.GeneralWrapperErrorException;
import com.smaato.sdk.video.vast.exceptions.wrapper.WrapperRequestTimeoutException;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.parser.ParseError;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WrapperResolver {
    private final InLineChecker inLineChecker;
    private final int maxDepth;
    private final WrapperAdContainerPicker wrapperAdContainerPicker;
    private final WrapperLoader wrapperLoader;

    public WrapperResolver(int i, WrapperLoader wrapperLoader2, InLineChecker inLineChecker2, WrapperAdContainerPicker wrapperAdContainerPicker2) {
        if (i >= 0) {
            this.inLineChecker = inLineChecker2;
            this.wrapperAdContainerPicker = wrapperAdContainerPicker2;
            this.maxDepth = i;
            this.wrapperLoader = wrapperLoader2;
            return;
        }
        throw new IllegalArgumentException("Cannot construct WrapperResolver: maxDepth can't be negative");
    }

    /* access modifiers changed from: package-private */
    public final void resolveWrappers(Logger logger, SomaApiContext somaApiContext, VastTree vastTree, boolean z, int i, NonNullConsumer<VastResult<VastTree>> nonNullConsumer) {
        VastTree vastTree2 = vastTree;
        NonNullConsumer<VastResult<VastTree>> nonNullConsumer2 = nonNullConsumer;
        VastResult.Builder result = new VastResult.Builder().setResult(vastTree);
        boolean isEmpty = vastTree2.ads.isEmpty();
        Integer valueOf = Integer.valueOf(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR);
        if (isEmpty) {
            result.setErrors(Collections.singleton(valueOf));
            nonNullConsumer2.accept(result.build());
        } else if (InLineChecker.hasInLine(vastTree2.ads)) {
            nonNullConsumer2.accept(result.build());
        } else if (!z) {
            result.setErrors(Collections.singleton(valueOf));
            nonNullConsumer2.accept(result.build());
        } else {
            AdContainer<Wrapper> pickWrapperContainer = WrapperAdContainerPicker.pickWrapperContainer(vastTree2.ads);
            if (pickWrapperContainer == null) {
                result.setErrors(Collections.singleton(valueOf));
                nonNullConsumer2.accept(result.build());
            } else if (i > this.maxDepth) {
                result.setErrors(Collections.singleton(302));
                nonNullConsumer2.accept(result.build());
            } else {
                WrapperLoader wrapperLoader2 = this.wrapperLoader;
                Wrapper wrapper = (Wrapper) pickWrapperContainer.model;
                $$Lambda$WrapperResolver$t_6D_Eeyy6_wkcYTiXjY5sb4tFU r0 = new NonNullConsumer(logger, somaApiContext, pickWrapperContainer, i, nonNullConsumer, vastTree) {
                    public final /* synthetic */ Logger f$1;
                    public final /* synthetic */ SomaApiContext f$2;
                    public final /* synthetic */ AdContainer f$3;
                    public final /* synthetic */ int f$4;
                    public final /* synthetic */ NonNullConsumer f$5;
                    public final /* synthetic */ VastTree f$6;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                        this.f$6 = r7;
                    }

                    public final void accept(Object obj) {
                        WrapperResolver.this.lambda$resolveWrappers$1$WrapperResolver(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (ParseResult) obj);
                    }
                };
                if (TextUtils.isEmpty(wrapper.vastAdTagUri)) {
                    r0.accept(ParseResult.error(Wrapper.VAST_AD_TAG_URI, new GeneralWrapperErrorException("Cannot resolve wrapper: vastAdTagUri is missing")));
                    return;
                }
                Logger logger2 = logger;
                SomaApiContext somaApiContext2 = somaApiContext;
                wrapperLoader2.executioner.submitRequest(wrapper.vastAdTagUri, somaApiContext, (Task.Listener<ParseResult<VastTree>, NetworkClient.Error>) new Task.Listener<ParseResult<VastTree>, NetworkClient.Error>(r0, wrapper, logger) {
                    final /* synthetic */ Logger val$logger;
                    final /* synthetic */ NonNullConsumer val$parseResultConsumer;
                    final /* synthetic */ Wrapper val$wrapper;

                    public final /* bridge */ /* synthetic */ void onFailure(
/*
Method generation error in method: com.smaato.sdk.video.vast.build.WrapperLoader.1.onFailure(com.smaato.sdk.core.Task, java.lang.Object):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.smaato.sdk.video.vast.build.WrapperLoader.1.onFailure(com.smaato.sdk.core.Task, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
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
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                    
*/

                    public final /* bridge */ /* synthetic */ void onSuccess(
/*
Method generation error in method: com.smaato.sdk.video.vast.build.WrapperLoader.1.onSuccess(com.smaato.sdk.core.Task, java.lang.Object):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.smaato.sdk.video.vast.build.WrapperLoader.1.onSuccess(com.smaato.sdk.core.Task, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
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
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                    
*/
                }).start();
            }
        }
    }

    public /* synthetic */ void lambda$resolveWrappers$1$WrapperResolver(Logger logger, SomaApiContext somaApiContext, AdContainer adContainer, int i, NonNullConsumer nonNullConsumer, VastTree vastTree, ParseResult parseResult) {
        AdContainer adContainer2 = adContainer;
        ParseResult parseResult2 = parseResult;
        $$Lambda$WrapperResolver$435aYmLajukATNdptyIEAq0A6_s r2 = new NonNullConsumer(nonNullConsumer, vastTree, adContainer) {
            public final /* synthetic */ NonNullConsumer f$1;
            public final /* synthetic */ VastTree f$2;
            public final /* synthetic */ AdContainer f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                WrapperResolver.this.lambda$null$0$WrapperResolver(this.f$1, this.f$2, this.f$3, (VastResult) obj);
            }
        };
        VastResult.Builder builder = new VastResult.Builder();
        HashSet hashSet = new HashSet();
        builder.setErrors(hashSet);
        if (!parseResult2.errors.isEmpty()) {
            hashSet.addAll(Lists.mapLazy(parseResult2.errors, $$Lambda$WrapperResolver$Z70mF7pdyLELSyRVPmdx1tEdNZ0.INSTANCE));
            hashSet.remove((Object) null);
        }
        if (parseResult2.value == null) {
            if (!parseResult2.errors.isEmpty()) {
                hashSet.add(100);
            }
            r2.accept(builder.build());
            return;
        }
        $$Lambda$WrapperResolver$I0cXiY11VehlPqwjzC_XjjynkGU r9 = new NonNullConsumer(hashSet, builder, parseResult2, r2) {
            public final /* synthetic */ Set f$0;
            public final /* synthetic */ VastResult.Builder f$1;
            public final /* synthetic */ ParseResult f$2;
            public final /* synthetic */ NonNullConsumer f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                WrapperResolver.lambda$checkLoadResultAndResolveIfNeeded$3(this.f$0, this.f$1, this.f$2, this.f$3, (VastResult) obj);
            }
        };
        resolveWrappers(logger, somaApiContext, (VastTree) parseResult2.value, ((Wrapper) adContainer2.model).followAdditionalWrappers, i + 1, r9);
    }

    static /* synthetic */ Integer lambda$checkLoadResultAndResolveIfNeeded$2(ParseError parseError) {
        Exception exc = parseError == null ? null : parseError.exception;
        if (exc instanceof GeneralWrapperErrorException) {
            return Integer.valueOf(ErrorCode.GENERAL_WRAPPER_ERROR);
        }
        if (exc instanceof WrapperRequestTimeoutException) {
            return Integer.valueOf(ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR);
        }
        return null;
    }

    static /* synthetic */ void lambda$checkLoadResultAndResolveIfNeeded$3(Set set, VastResult.Builder builder, ParseResult parseResult, NonNullConsumer nonNullConsumer, VastResult vastResult) {
        set.addAll(vastResult.errors);
        if (vastResult.value != null) {
            builder.setResult(vastResult.value);
        } else {
            builder.setResult(parseResult.value);
        }
        nonNullConsumer.accept(builder.build());
    }

    public /* synthetic */ void lambda$null$0$WrapperResolver(NonNullConsumer nonNullConsumer, VastTree vastTree, AdContainer adContainer, VastResult vastResult) {
        VastResult.Builder builder = new VastResult.Builder();
        HashSet hashSet = new HashSet(vastResult.errors);
        builder.setErrors(hashSet);
        VastTree vastTree2 = (VastTree) vastResult.value;
        if (vastTree2 == null) {
            hashSet.add(Integer.valueOf(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR));
            builder.setResult(vastTree);
        } else {
            builder.setResult(ResolvedWrapperMergeUtils.mergeParsedResultWithParents(vastTree2, vastTree, adContainer));
        }
        nonNullConsumer.accept(builder.build());
    }
}
