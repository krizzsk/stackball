package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2792j;
import com.fyber.inneractive.sdk.config.C2796l;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.p034a.C2740a;
import com.fyber.inneractive.sdk.config.p034a.C2760l;
import com.fyber.inneractive.sdk.config.p034a.C2761m;
import com.fyber.inneractive.sdk.config.p034a.C2766r;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.p029a.C2700d;
import com.fyber.inneractive.sdk.p029a.p030a.C2682a;
import com.fyber.inneractive.sdk.p039dv.p042c.C2871a;
import com.fyber.inneractive.sdk.p039dv.p042c.C2872b;
import com.fyber.inneractive.sdk.p039dv.p042c.C2876c;
import com.fyber.inneractive.sdk.p049h.C2939ac;
import com.fyber.inneractive.sdk.p049h.C2946ai;
import com.fyber.inneractive.sdk.p049h.C2947aj;
import com.fyber.inneractive.sdk.p049h.C2951b;
import com.fyber.inneractive.sdk.p049h.C2952c;
import com.fyber.inneractive.sdk.p049h.C2955d;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p049h.C2977r;
import com.fyber.inneractive.sdk.p049h.C2978s;
import com.fyber.inneractive.sdk.p049h.C2979t;
import com.fyber.inneractive.sdk.p049h.C2988y;
import com.fyber.inneractive.sdk.p056m.C3062i;
import com.fyber.inneractive.sdk.util.C3620ab;
import com.fyber.inneractive.sdk.util.C3626ag;
import com.fyber.inneractive.sdk.util.C3634an;
import com.fyber.inneractive.sdk.util.C3640ao;
import com.fyber.inneractive.sdk.util.C3651h;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3669p;
import com.fyber.inneractive.sdk.util.C3671r;
import com.fyber.inneractive.sdk.util.C3675s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class IAConfigManager {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static long f6418G;

    /* renamed from: n */
    public static final IAConfigManager f6419n = new IAConfigManager();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C2740a f6420A;

    /* renamed from: B */
    private final C3620ab f6421B = new C3620ab();

    /* renamed from: C */
    private C2988y<C2736a> f6422C;

    /* renamed from: D */
    private C2988y<C2760l> f6423D;

    /* renamed from: E */
    private C2786d f6424E;

    /* renamed from: F */
    private final C2871a f6425F;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C2700d f6426H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C2952c f6427I;

    /* renamed from: J */
    private final Map<C3671r.C3674b, C3671r.C3673a> f6428J;

    /* renamed from: a */
    String f6429a = null;

    /* renamed from: b */
    Map<String, C2807s> f6430b = new HashMap();

    /* renamed from: c */
    Map<String, C2808t> f6431c = new HashMap();

    /* renamed from: d */
    public String f6432d;

    /* renamed from: e */
    boolean f6433e = false;

    /* renamed from: f */
    String f6434f;

    /* renamed from: g */
    String f6435g;

    /* renamed from: h */
    public final C2799m f6436h = new C2799m();

    /* renamed from: i */
    InneractiveUserConfig f6437i;

    /* renamed from: j */
    boolean f6438j = true;

    /* renamed from: k */
    public String f6439k;

    /* renamed from: l */
    public List<String> f6440l;

    /* renamed from: m */
    public String f6441m = "";

    /* renamed from: o */
    private C2738c f6442o = new C2738c();

    /* renamed from: p */
    private String f6443p;

    /* renamed from: q */
    private String f6444q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Context f6445r;

    /* renamed from: s */
    private List<OnConfigurationReadyAndValidListener> f6446s;

    /* renamed from: t */
    private boolean f6447t = false;

    /* renamed from: u */
    private boolean f6448u = true;

    /* renamed from: v */
    private final C2979t f6449v = new C2979t();

    /* renamed from: w */
    private C2792j f6450w;

    /* renamed from: x */
    private C2795k f6451x;

    /* renamed from: y */
    private final C2813y f6452y = new C2813y();

    /* renamed from: z */
    private C3634an f6453z;

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$a */
    public static class C2736a {

        /* renamed from: a */
        String f6457a;

        /* renamed from: b */
        String f6458b;

        /* renamed from: c */
        String f6459c;

        /* renamed from: d */
        String f6460d;

        /* renamed from: e */
        Map<String, C2807s> f6461e = new HashMap();

        /* renamed from: f */
        Map<String, C2808t> f6462f = new HashMap();

        /* renamed from: g */
        C2738c f6463g = new C2738c();
    }

    IAConfigManager() {
        this.f6425F = C3657l.m9117a("com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback") ? new C2872b() : new C2876c();
        this.f6426H = new C2700d();
        this.f6427I = new C2952c();
        this.f6428J = new HashMap();
        this.f6446s = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public static void m5912a(Context context, String str, String str2, String str3) {
        IAConfigManager iAConfigManager = f6419n;
        if (!iAConfigManager.f6433e) {
            C2979t tVar = iAConfigManager.f6449v;
            if (!tVar.f7255b) {
                tVar.f7255b = true;
                for (int i = 0; i < 6; i++) {
                    tVar.f7256c.submit(tVar.f7257d);
                }
            }
            C3062i.m7244a();
            C3062i.m7248b();
            C3634an anVar = new C3634an();
            iAConfigManager.f6453z = anVar;
            anVar.f9906b = context.getApplicationContext();
            C3662m.f9942a.execute(new Runnable() {
                public final void run() {
                    if (C3634an.this.f9906b != null) {
                        SharedPreferences sharedPreferences = C3634an.this.f9906b.getSharedPreferences("fyber.ua", 0);
                        C3634an.this.f9905a = sharedPreferences.getString("ua", (String) null);
                        if (!TextUtils.isEmpty(C3634an.this.f9905a)) {
                            IAlog.m9034b("UserAgentProvider | populated user agent form shared prefs", new Object[0]);
                            C3634an.this.f9907c.compareAndSet(false, true);
                        }
                        C3634an.m9053a(C3634an.this);
                    }
                }
            });
            iAConfigManager.f6424E = new C2786d();
            C2792j jVar = new C2792j(context);
            iAConfigManager.f6450w = jVar;
            iAConfigManager.f6451x = new C2795k(jVar);
            iAConfigManager.f6450w.mo18053a();
            C2952c cVar = iAConfigManager.f6427I;
            Application application = (Application) context.getApplicationContext();
            if (!cVar.f7107f) {
                cVar.f7107f = true;
                cVar.f7103b.start();
                cVar.f7104c = new C3626ag(cVar.f7103b.getLooper(), cVar);
            }
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                public final void onActivityDestroyed(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityResumed(Activity activity) {
                    if (C2952c.this.f7104c != null) {
                        C2952c.this.f7104c.removeMessages(20150330);
                    }
                }

                public final void onActivityPaused(Activity activity) {
                    if (C2952c.this.f7104c != null) {
                        C2952c.this.f7104c.sendEmptyMessageDelayed(20150330, 3500);
                    }
                }
            });
            iAConfigManager.f6450w.mo18054a(new C2792j.C2794a() {
                public final void onGlobalConfigChanged(C2792j jVar, C2791i iVar) {
                    IAConfigManager.this.f6426H.mo17907a();
                    C2952c b = IAConfigManager.this.f6427I;
                    int i = 30;
                    int a = IAConfigManager.m5929c().f6586a.mo18046a("send_events_batch_interval", 30, -1);
                    if (a >= 0) {
                        i = a;
                    }
                    b.f7106e = true;
                    b.f7105d = i;
                    b.mo18412a();
                    if (b.f7104c != null) {
                        b.f7104c.sendEmptyMessageDelayed(12312329, (long) (b.f7105d * 1000));
                    }
                }
            });
            iAConfigManager.f6420A = new C2740a(new C2766r());
            IAlog.m9034b("Initializing config manager", new Object[0]);
            IAlog.m9034b("Config manager: lib name = %s", str2);
            IAlog.m9034b("Config manager: app version = %s", str3);
            C3675s a = C3675s.C3680a.f9970a;
            a.f9959a = context.getApplicationContext();
            if (a.f9959a != null && f6419n.f6448u) {
                a.f9961c = new C3651h.C3652a() {
                    /* renamed from: a */
                    public final void mo19571a(Location location) {
                        C3675s.this.f9960b = location;
                    }
                };
                C3651h.m9077a(a.f9959a, a.f9961c);
            }
            C2796l lVar = C2796l.C2797a.f6595a;
            if (lVar.f6593a == null) {
                lVar.f6593a = context;
                new Thread(new Runnable(context, lVar) {

                    /* renamed from: a */
                    final /* synthetic */ Context f6636a;

                    /* renamed from: b */
                    final /* synthetic */ C2804a f6637b;

                    public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.config.p.1.run():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.config.p.1.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            if (!str.matches("[0-9]+")) {
                IAlog.m9037e("************************************************************************************************************************", new Object[0]);
                IAlog.m9037e("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                IAlog.m9037e("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                IAlog.m9037e("************************************************************************************************************************", new Object[0]);
            }
            iAConfigManager.f6445r = context;
            iAConfigManager.f6432d = str;
            iAConfigManager.f6434f = str2;
            iAConfigManager.f6435g = str3;
            iAConfigManager.f6437i = new InneractiveUserConfig();
            iAConfigManager.f6433e = true;
            C2813y yVar = iAConfigManager.f6452y;
            yVar.f6665b = new C2769b(yVar);
            C2769b bVar = yVar.f6665b;
            if (!f6419n.f6450w.f6588c) {
                f6419n.f6450w.mo18054a(bVar);
            }
            bVar.f6516c = new C3640ao(TimeUnit.MINUTES, (long) f6419n.f6450w.f6586a.mo18046a("session_duration", 30, 1));
            bVar.f6516c.f9916b = bVar.f6519f;
            yVar.mo18090b("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
            yVar.f6664a = new C2682a((byte) 0);
            C3662m.m9138a(new Runnable() {
                public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.a.a.a.2.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.a.a.a.2.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            });
            C2939ac acVar = new C2939ac(new C2977r<C2736a>() {
                /* renamed from: a */
                public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                    C2736a aVar = (C2736a) obj;
                    if (IAConfigManager.this.f6440l == null) {
                        IAConfigManager iAConfigManager = IAConfigManager.this;
                        Context c = iAConfigManager.f6445r;
                        HashSet hashSet = new HashSet();
                        C2787e.m6072a(c, hashSet);
                        if (hashSet.isEmpty()) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(",")));
                            } else {
                                Locale locale = Locale.getDefault();
                                if (locale != null) {
                                    hashSet.add(locale.toString().replace("_", "-"));
                                }
                            }
                        }
                        iAConfigManager.f6440l = new ArrayList(hashSet);
                    }
                    if (aVar != null) {
                        if (aVar.f6460d != null) {
                            IAConfigManager.this.f6429a = aVar.f6460d;
                        }
                        if (z) {
                            IAConfigManager.this.m5913a(aVar);
                        } else {
                            long unused = IAConfigManager.f6418G = System.currentTimeMillis();
                            IAConfigManager.m5924b(IAConfigManager.this, aVar);
                        }
                    } else if (exc instanceof C2955d) {
                        long unused2 = IAConfigManager.f6418G = System.currentTimeMillis();
                    }
                    if (!z) {
                        IAConfigManager.m5915a(IAConfigManager.this, IAConfigManager.m5952w(), exc);
                        if (IAConfigManager.m5952w()) {
                            IAConfigManager.m5932d(IAConfigManager.this);
                        }
                    }
                }
            }, iAConfigManager.f6445r, new C2785c());
            iAConfigManager.f6422C = acVar;
            iAConfigManager.f6449v.mo18441a((C2988y<?>) acVar);
            iAConfigManager.f6439k = C2787e.m6071a();
            iAConfigManager.f6425F.mo18245a();
        }
    }

    /* renamed from: a */
    public static void m5911a() {
        f6419n.f6433e = false;
        C3675s a = C3675s.C3680a.f9970a;
        IAlog.m9034b("%sdestroy called", "Location Manager: ");
        a.mo19585b();
        a.mo19584a(a.f9963e);
        a.mo19584a(a.f9964f);
        a.f9963e = null;
        a.f9964f = null;
        a.f9959a = null;
        a.f9961c = null;
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f6419n.f6446s.add(onConfigurationReadyAndValidListener);
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f6419n.f6446s.remove(onConfigurationReadyAndValidListener);
    }

    /* renamed from: b */
    private void m5925b(Exception exc) {
        for (OnConfigurationReadyAndValidListener next : this.f6446s) {
            if (next != null) {
                boolean w = m5952w();
                IAlog.m9033a("notifying listener configuration state has been resolved", new Object[0]);
                next.onConfigurationReadyAndValid(this, w, !w ? exc : null);
            }
        }
    }

    /* renamed from: b */
    public static C3634an m5923b() {
        return f6419n.f6453z;
    }

    /* renamed from: c */
    public static C2792j m5929c() {
        return f6419n.f6450w;
    }

    /* renamed from: d */
    public static C2871a m5931d() {
        return f6419n.f6425F;
    }

    /* renamed from: e */
    public static C2740a m5933e() {
        return f6419n.f6420A;
    }

    /* renamed from: f */
    public static C2795k m5935f() {
        return f6419n.f6451x;
    }

    /* renamed from: g */
    public static C2786d m5936g() {
        return f6419n.f6424E;
    }

    /* renamed from: h */
    public static C2978s m5937h() {
        return f6419n.f6449v;
    }

    /* renamed from: i */
    public static void m5938i() {
        IAConfigManager iAConfigManager = f6419n;
        C2988y<C2736a> yVar = iAConfigManager.f6422C;
        if (yVar != null) {
            iAConfigManager.f6449v.mo18441a((C2988y<?>) yVar);
        }
        if (!f6419n.f6450w.f6588c) {
            f6419n.f6450w.mo18053a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5913a(C2736a aVar) {
        this.f6444q = aVar.f6459c;
        this.f6443p = aVar.f6458b;
        this.f6430b = aVar.f6461e;
        this.f6431c = aVar.f6462f;
        this.f6442o = aVar.f6463g;
    }

    /* renamed from: a */
    public static void m5916a(InneractiveUserConfig inneractiveUserConfig) {
        f6419n.f6437i = inneractiveUserConfig;
        IAlog.m9034b("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        m5938i();
        f6419n.f6426H.mo17907a();
        com.fyber.inneractive.sdk.util.C3662m.m9138a(new com.fyber.inneractive.sdk.p056m.C3062i.C30631(com.fyber.inneractive.sdk.p056m.C3062i.m7244a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((java.lang.System.currentTimeMillis() - f6418G <= 3600000) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r1 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r1 == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r1 = f6419n.f6450w;
        r1.f6588c = false;
        com.fyber.inneractive.sdk.util.C3657l.m9114a((com.fyber.inneractive.sdk.p029a.C2681a) r1.f6589d);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5939j() {
        /*
            boolean r0 = m5952w()
            java.lang.Boolean r1 = com.fyber.inneractive.sdk.config.C2788f.m6082j()
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r0 == 0) goto L_0x0022
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = f6418G
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            if (r1 == 0) goto L_0x0047
        L_0x0024:
            if (r1 == 0) goto L_0x0031
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = f6419n
            com.fyber.inneractive.sdk.config.j r1 = r1.f6450w
            r1.f6588c = r2
            com.fyber.inneractive.sdk.a.b r1 = r1.f6589d
            com.fyber.inneractive.sdk.util.C3657l.m9114a((com.fyber.inneractive.sdk.p029a.C2681a) r1)
        L_0x0031:
            m5938i()
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = f6419n
            com.fyber.inneractive.sdk.a.d r1 = r1.f6426H
            r1.mo17907a()
            com.fyber.inneractive.sdk.m.i r1 = com.fyber.inneractive.sdk.p056m.C3062i.m7244a()
            com.fyber.inneractive.sdk.m.i$1 r2 = new com.fyber.inneractive.sdk.m.i$1
            r2.<init>()
            com.fyber.inneractive.sdk.util.C3662m.m9138a(r2)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.IAConfigManager.m5939j():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static boolean m5952w() {
        return f6419n.f6444q != null;
    }

    /* renamed from: k */
    public static String m5940k() {
        return f6419n.f6443p;
    }

    /* renamed from: a */
    public static void m5920a(boolean z) {
        f6419n.f6447t = z;
        IAlog.m9034b("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (!C3669p.m9149a() && !z) {
            IAlog.m9036d("************************************************************************************************************************", new Object[0]);
            IAlog.m9036d("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
            IAlog.m9036d("***  The traffic will be Secured  ", new Object[0]);
            IAlog.m9036d("************************************************************************************************************************", new Object[0]);
        }
    }

    /* renamed from: l */
    public static boolean m5941l() {
        return f6419n.f6447t;
    }

    /* renamed from: a */
    public static void m5919a(String str) {
        f6419n.f6441m = str;
    }

    /* renamed from: m */
    public static C3620ab m5942m() {
        return f6419n.f6421B;
    }

    /* renamed from: n */
    public static C2813y m5943n() {
        return f6419n.f6452y;
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$b */
    public static class C2737b extends Exception {
        /* synthetic */ C2737b(byte b) {
            this();
        }

        private C2737b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.IAConfigManager$c */
    static class C2738c {

        /* renamed from: a */
        Set<Vendor> f6464a = new HashSet();

        C2738c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo17977a(Set<Vendor> set) {
            if (set != null) {
                for (Vendor next : set) {
                    if (next != null && !this.f6464a.contains(next)) {
                        this.f6464a.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m5926b(String str) {
        if (C3657l.m9125p() == null) {
            IAlog.m9036d("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        C2786d dVar = f6419n.f6424E;
        if (C3657l.m9125p() != null) {
            dVar.mo18026a();
            dVar.f6577d = str;
            if (dVar.f6579f == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.f6579f.edit().putString("keyUserID", str).apply();
            } else {
                dVar.f6579f.edit().remove("keyUserID").apply();
            }
        }
    }

    /* renamed from: o */
    public static String m5944o() {
        return f6419n.f6424E.f6577d;
    }

    /* renamed from: p */
    public static String m5945p() {
        return f6419n.f6432d;
    }

    /* renamed from: b */
    public static void m5927b(boolean z) {
        f6419n.f6448u = z;
    }

    /* renamed from: q */
    public static boolean m5946q() {
        return f6419n.f6448u;
    }

    /* renamed from: c */
    public static void m5930c(String str) {
        IAConfigManager iAConfigManager = f6419n;
        iAConfigManager.f6432d = str;
        iAConfigManager.f6429a = "";
        Map<String, C2807s> map = iAConfigManager.f6430b;
        if (map != null) {
            map.clear();
        }
        Map<String, C2808t> map2 = f6419n.f6431c;
        if (map2 != null) {
            map2.clear();
        }
        IAConfigManager iAConfigManager2 = f6419n;
        iAConfigManager2.f6444q = null;
        iAConfigManager2.f6443p = "";
    }

    /* renamed from: r */
    public static C2700d m5947r() {
        return f6419n.f6426H;
    }

    /* renamed from: s */
    public static C2952c m5948s() {
        return f6419n.f6427I;
    }

    /* renamed from: a */
    public static void m5917a(C3671r.C3673a aVar) {
        f6419n.f6428J.put(aVar.mo18655a(), aVar);
    }

    /* renamed from: a */
    public static boolean m5921a(C3671r.C3674b bVar, String str) {
        C3671r.C3673a aVar = f6419n.f6428J.get(bVar);
        if (aVar != null) {
            return aVar.mo18656a(str);
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m5949t() {
        SharedPreferences sharedPreferences = C3657l.m9125p().getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences == null || !sharedPreferences.contains("IAConfigFQE")) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static void m5950u() {
        SharedPreferences sharedPreferences = C3657l.m9125p().getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5924b(IAConfigManager iAConfigManager, C2736a aVar) {
        if (aVar != null) {
            IAlog.m9034b("Got new remote configuration from server:", new Object[0]);
            iAConfigManager.m5913a(aVar);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5915a(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        int i;
        if (z) {
            iAConfigManager.m5925b((Exception) null);
            return;
        }
        boolean z2 = true;
        if (!(exc instanceof InvalidAppIdException) && !(exc instanceof FileNotFoundException) && (!(exc instanceof C2947aj) ? !TextUtils.isEmpty(iAConfigManager.f6432d.trim()) : (i = ((C2947aj) exc).f7095a) < 400 || i >= 500)) {
            z2 = false;
        }
        if (z2) {
            iAConfigManager.m5925b((Exception) new InvalidAppIdException());
        } else if (exc instanceof C2951b) {
            iAConfigManager.m5925b(exc);
        } else {
            iAConfigManager.m5925b((Exception) new C2737b((byte) 0));
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m5932d(IAConfigManager iAConfigManager) {
        if (iAConfigManager.f6423D == null) {
            iAConfigManager.f6423D = new C2939ac(new C2977r<C2760l>() {
                /* renamed from: a */
                public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                    C2760l lVar = (C2760l) obj;
                    if (lVar != null) {
                        IAlog.m9034b("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
                        IAConfigManager.this.f6420A.f6467b = lVar;
                    } else if (exc == null) {
                    } else {
                        if (exc instanceof C2955d) {
                            IAlog.m9034b("remote features config not modified", new Object[0]);
                            return;
                        }
                        IAlog.m9034b("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
                        new C2968n.C2969a(C2966l.FATAL_FEATURES_CONFIG_ERROR).mo18435a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).mo18436b((String) null);
                    }
                }
            }, iAConfigManager.f6445r, new C2761m());
        }
        int p = iAConfigManager.f6423D.mo18402p();
        if (p != C2946ai.f7092c && p != C2946ai.f7091b) {
            iAConfigManager.f6449v.mo18441a((C2988y<?>) iAConfigManager.f6423D);
        }
    }
}
