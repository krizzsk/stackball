package com.smaato.sdk;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.smaato.sdk.SdkBase;
import com.smaato.sdk.dns.DnsLookup;
import com.smaato.sdk.dns.DnsLookupImpl_Factory;
import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.inject.Providers;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.p246ad.AdCache;
import com.smaato.sdk.p246ad.AdRequestInterceptor;
import com.smaato.sdk.p246ad.BeaconTracker;
import com.smaato.sdk.p246ad.BeaconTrackerImpl_Factory;
import com.smaato.sdk.p246ad.ExpirationChecker;
import com.smaato.sdk.p246ad.ExpirationCheckerImpl_Factory;
import com.smaato.sdk.p246ad.LinkResolver;
import com.smaato.sdk.p246ad.LinkResolverImpl_Factory;
import com.smaato.sdk.p246ad.UserAgentInterceptor;
import com.smaato.sdk.p257ub.AdMarkup;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.res.ImageLoader;
import com.smaato.sdk.res.ImageLoaderImpl_Factory;
import com.smaato.sdk.res.IntentLauncher;
import com.smaato.sdk.res.IntentLauncherImpl_Factory;
import com.smaato.sdk.sys.LocationAware;
import com.smaato.sdk.sys.LocationAwareImpl_Factory;
import com.smaato.sdk.sys.NetWatcher;
import com.smaato.sdk.sys.NetWatcherBase;
import com.smaato.sdk.sys.NetWatcherL;
import com.smaato.sdk.sys.SimInfo;
import com.smaato.sdk.sys.TzSettings;
import com.smaato.sdk.util.Schedulers;

public final class SmaatoSdkBase extends SdkBase {
    private final Provider<? extends BeaconTracker> beaconTracker;
    private final Provider<? extends Context> context;
    private final Provider<? extends DnsLookup> dnsLookup;
    private final Provider<? extends ExpirationChecker> expirationChecker;
    private final Provider<? extends HttpClient> httpClient;
    private final Provider<? extends ImageLoader> imageLoader;
    private final Provider<? extends IntentLauncher> intentLauncher;
    private final Provider<? extends LinkResolver> linkResolver;
    private final Provider<? extends LocationAware> locationAware;
    private final Provider<? extends NetWatcher> netWatcher;
    private final Provider<? extends Schedulers> schedulers;
    private final Provider<? extends SimInfo> simInfo;
    private final Provider<? extends SmaatoBridge> smaatoBridge;
    private final Provider<? extends HttpClient> somaClientHttpClient;
    private final Provider<? extends String> somaUrl;
    private final Provider<? extends TzSettings> tzSettings;
    private final Provider<? extends AdCache<AdMarkup>> ubAdCacheAdCache;
    private final Provider<? extends UbCache> ubCache;

    static /* synthetic */ String lambda$new$1() {
        return "com.smaato.sdk.SdkBase.Graph.defaultHttpClient(com.smaato.sdk.util.Schedulers) returned null value";
    }

    static /* synthetic */ String lambda$new$11() {
        return "com.smaato.sdk.SdkBase.Graph.simInfo(android.content.Context) returned null value";
    }

    static /* synthetic */ String lambda$new$13() {
        return "com.smaato.sdk.SdkBase.Graph.tzSettings(android.content.Context) returned null value";
    }

    static /* synthetic */ String lambda$new$3() {
        return "com.smaato.sdk.SdkBase.Graph.somaHttpClient(com.smaato.sdk.net.HttpClient,android.content.Context,com.smaato.sdk.SmaatoBridge) returned null value";
    }

    static /* synthetic */ String lambda$new$5() {
        return "com.smaato.sdk.SdkBase.Graph.netWatcher(android.content.Context) returned null value";
    }

    static /* synthetic */ String lambda$new$7() {
        return "com.smaato.sdk.SdkBase.Graph.ubAdCache() returned null value";
    }

    static /* synthetic */ String lambda$new$9() {
        return "com.smaato.sdk.SdkBase.Graph.ubCache(com.smaato.sdk.ad.AdCache<com.smaato.sdk.ub.AdMarkup>) returned null value";
    }

    /* synthetic */ SmaatoSdkBase(Provider provider, Provider provider2, Provider provider3, Provider provider4, byte b) {
        this(provider, provider2, provider3, provider4);
    }

    private SmaatoSdkBase(Provider<? extends Context> provider, Provider<? extends Schedulers> provider2, Provider<? extends SmaatoBridge> provider3, Provider<? extends String> provider4) {
        this.context = provider;
        this.schedulers = provider2;
        this.httpClient = Providers.doubleCheck(Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoSdkBase.this.lambda$new$0$SmaatoSdkBase();
            }
        }, $$Lambda$SmaatoSdkBase$anAR8aUdKHe1a32Z3joYjqIWWB4.INSTANCE));
        this.smaatoBridge = provider3;
        this.somaClientHttpClient = Providers.doubleCheck(Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoSdkBase.this.lambda$new$2$SmaatoSdkBase();
            }
        }, $$Lambda$SmaatoSdkBase$_sruHz0clnNIsEmumEOkogRKGfE.INSTANCE));
        this.somaUrl = provider4;
        this.imageLoader = new ImageLoaderImpl_Factory(this.httpClient, this.schedulers);
        this.beaconTracker = new BeaconTrackerImpl_Factory(this.httpClient, this.schedulers);
        this.expirationChecker = new ExpirationCheckerImpl_Factory(this.schedulers);
        this.linkResolver = new LinkResolverImpl_Factory(this.context, this.httpClient, this.schedulers, this.smaatoBridge);
        this.intentLauncher = new IntentLauncherImpl_Factory(this.context, this.smaatoBridge);
        this.netWatcher = Providers.doubleCheck(Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoSdkBase.this.lambda$new$4$SmaatoSdkBase();
            }
        }, $$Lambda$SmaatoSdkBase$HVFkn6bCMYKHZnDRGV3GwVxQM.INSTANCE));
        this.ubAdCacheAdCache = Providers.nullSafe($$Lambda$SmaatoSdkBase$FkBTRyQ72IMrdTrAb9gfQxSBmOw.INSTANCE, $$Lambda$SmaatoSdkBase$umPdzmhZoiz8T92yjHic6G0ja4.INSTANCE);
        this.ubCache = Providers.doubleCheck(Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoSdkBase.this.lambda$new$8$SmaatoSdkBase();
            }
        }, $$Lambda$SmaatoSdkBase$tAlncRrO0a5UF3m5K_LUehm0.INSTANCE));
        this.dnsLookup = new DnsLookupImpl_Factory();
        this.simInfo = Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoSdkBase.this.lambda$new$10$SmaatoSdkBase();
            }
        }, $$Lambda$SmaatoSdkBase$xGDkwWyTTLfQq88gHZZsPPG7mU.INSTANCE);
        Provider<? extends TzSettings> nullSafe = Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoSdkBase.this.lambda$new$12$SmaatoSdkBase();
            }
        }, $$Lambda$SmaatoSdkBase$4I40_UGjZ4ObKE9e0Rz4TjNp2q8.INSTANCE);
        this.tzSettings = nullSafe;
        this.locationAware = new LocationAwareImpl_Factory(this.context, this.simInfo, nullSafe, this.dnsLookup);
    }

    public /* synthetic */ HttpClient lambda$new$0$SmaatoSdkBase() {
        return HttpClient.builder().executor(((Schedulers) this.schedulers.get()).mo56385io()).build();
    }

    public /* synthetic */ HttpClient lambda$new$2$SmaatoSdkBase() {
        return ((HttpClient) this.httpClient.get()).buildUpon().addInterceptor(new UserAgentInterceptor((Context) this.context.get())).addInterceptor(((SmaatoBridge) this.smaatoBridge.get()).apiCallInterceptor()).addInterceptor(new AdRequestInterceptor()).build();
    }

    public /* synthetic */ NetWatcher lambda$new$4$SmaatoSdkBase() {
        Context context2 = (Context) this.context.get();
        if (Build.VERSION.SDK_INT >= 21) {
            return new NetWatcherL(context2);
        }
        return new NetWatcherBase(context2);
    }

    public /* synthetic */ UbCache lambda$new$8$SmaatoSdkBase() {
        return new UbCache((AdCache) this.ubAdCacheAdCache.get());
    }

    public /* synthetic */ SimInfo lambda$new$10$SmaatoSdkBase() {
        return new SimInfo((TelephonyManager) ((Context) this.context.get()).getSystemService("phone")) {
            final /* synthetic */ TelephonyManager val$tm;

            public final java.lang.String getSimCountryIso(
/*
Method generation error in method: com.smaato.sdk.SdkBase.Graph.1.getSimCountryIso():java.lang.String, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.smaato.sdk.SdkBase.Graph.1.getSimCountryIso():java.lang.String, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
            
*/

            public final java.lang.String getNetworkCountryIso(
/*
Method generation error in method: com.smaato.sdk.SdkBase.Graph.1.getNetworkCountryIso():java.lang.String, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.smaato.sdk.SdkBase.Graph.1.getNetworkCountryIso():java.lang.String, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
            
*/
        };
    }

    public /* synthetic */ TzSettings lambda$new$12$SmaatoSdkBase() {
        return SdkBase.Graph.tzSettings((Context) this.context.get());
    }

    public final Context context() {
        return (Context) this.context.get();
    }

    public final HttpClient defaultHttpClient() {
        return (HttpClient) this.httpClient.get();
    }

    public final HttpClient somaHttpClient() {
        return (HttpClient) this.somaClientHttpClient.get();
    }

    public final String somaUrl() {
        return (String) this.somaUrl.get();
    }

    public final Schedulers executors() {
        return (Schedulers) this.schedulers.get();
    }

    public final ImageLoader imageLoader() {
        return (ImageLoader) this.imageLoader.get();
    }

    public final BeaconTracker beaconTracker() {
        return (BeaconTracker) this.beaconTracker.get();
    }

    public final ExpirationChecker expirationChecker() {
        return (ExpirationChecker) this.expirationChecker.get();
    }

    public final LinkResolver linkResolver() {
        return (LinkResolver) this.linkResolver.get();
    }

    public final IntentLauncher intentLauncher() {
        return (IntentLauncher) this.intentLauncher.get();
    }

    public final NetWatcher netWatcher() {
        return (NetWatcher) this.netWatcher.get();
    }

    public final SmaatoBridge bridge() {
        return (SmaatoBridge) this.smaatoBridge.get();
    }

    public final UbCache ubCache() {
        return (UbCache) this.ubCache.get();
    }

    public final LocationAware locationAware() {
        return (LocationAware) this.locationAware.get();
    }

    public static Builder builder() {
        return new Builder((byte) 0);
    }

    public static final class Builder {
        private Provider<? extends Context> context;
        private Provider<? extends Schedulers> schedulers;
        private Provider<? extends SmaatoBridge> smaatoBridge;
        private Provider<? extends String> somaUrl;

        static /* synthetic */ String lambda$context$0() {
            return "'context' provider returned null value";
        }

        static /* synthetic */ String lambda$schedulers$1() {
            return "'schedulers' provider returned null value";
        }

        static /* synthetic */ String lambda$smaatoBridge$2() {
            return "'smaatoBridge' provider returned null value";
        }

        static /* synthetic */ String lambda$somaUrl$3() {
            return "'somaUrl' provider returned null value";
        }

        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
        }

        public final Builder context(Provider<? extends Context> provider) {
            if (provider != null) {
                this.context = Providers.nullSafe(provider, $$Lambda$SmaatoSdkBase$Builder$xCNuBhZtIY_o6IFk4bAe5AXIyYQ.INSTANCE);
                return this;
            }
            throw new NullPointerException("'context' is null");
        }

        public final Builder schedulers(Provider<? extends Schedulers> provider) {
            if (provider != null) {
                this.schedulers = Providers.nullSafe(provider, $$Lambda$SmaatoSdkBase$Builder$1ia2Q_4n5B7lhGCStECAsTFHbG0.INSTANCE);
                return this;
            }
            throw new NullPointerException("'schedulers' is null");
        }

        public final Builder smaatoBridge(Provider<? extends SmaatoBridge> provider) {
            if (provider != null) {
                this.smaatoBridge = Providers.nullSafe(provider, $$Lambda$SmaatoSdkBase$Builder$Rx_4L4Lr8cUFKX2qzD0dToQ1p8c.INSTANCE);
                return this;
            }
            throw new NullPointerException("'smaatoBridge' is null");
        }

        public final Builder somaUrl(Provider<? extends String> provider) {
            if (provider != null) {
                this.somaUrl = Providers.nullSafe(provider, $$Lambda$SmaatoSdkBase$Builder$IvF8HL78pMaZwb_JfEUGupuEtY.INSTANCE);
                return this;
            }
            throw new NullPointerException("'somaUrl' is null");
        }

        public final SmaatoSdkBase build() {
            if (this.context == null) {
                throw new NullPointerException("Missing 'context' dependency");
            } else if (this.schedulers == null) {
                throw new NullPointerException("Missing 'schedulers' dependency");
            } else if (this.smaatoBridge == null) {
                throw new NullPointerException("Missing 'smaatoBridge' dependency");
            } else if (this.somaUrl != null) {
                return new SmaatoSdkBase(this.context, this.schedulers, this.smaatoBridge, this.somaUrl, (byte) 0);
            } else {
                throw new NullPointerException("Missing 'somaUrl' dependency");
            }
        }
    }
}
