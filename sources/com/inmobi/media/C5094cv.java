package com.inmobi.media;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.inmobi.media.C5220ev;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.cv */
/* compiled from: VastResponse */
public final class C5094cv implements C5095cw {

    /* renamed from: a */
    List<C5084cq> f11676a;

    /* renamed from: b */
    public String f11677b;

    /* renamed from: c */
    public String f11678c;

    /* renamed from: d */
    public List<C5030br> f11679d;

    /* renamed from: e */
    public List<C5082cp> f11680e;

    /* renamed from: f */
    public int f11681f;

    /* renamed from: g */
    private String f11682g;

    /* renamed from: h */
    private C5082cp f11683h;

    /* renamed from: i */
    private C5220ev.C5232i f11684i;

    /* renamed from: j */
    private C5084cq f11685j;

    /* renamed from: a */
    private static boolean m11568a(double d, double d2, double d3) {
        return d3 > d && d3 <= d2;
    }

    C5094cv(C5220ev.C5232i iVar) {
        this.f11685j = null;
        this.f11676a = new ArrayList();
        this.f11679d = new ArrayList();
        this.f11680e = new ArrayList();
        this.f11684i = iVar;
        this.f11681f = 0;
    }

    private C5094cv(List<C5030br> list, C5220ev.C5232i iVar) {
        this(iVar);
        if (list.size() != 0) {
            this.f11679d = new ArrayList(list);
        }
    }

    public C5094cv(String str, String str2, String str3, List<C5030br> list, List<C5082cp> list2, C5220ev.C5232i iVar) {
        this(list, iVar);
        if (list2.size() != 0) {
            this.f11680e = new ArrayList(list2);
        }
        this.f11682g = str;
        this.f11676a.add(new C5084cq(str));
        this.f11677b = str2;
        this.f11678c = str3;
    }

    /* renamed from: a */
    public final String mo40356a() {
        return this.f11678c;
    }

    /* renamed from: b */
    public final String mo40359b() {
        C5084cq cqVar;
        int i;
        String str = this.f11682g;
        if (str != null) {
            return str;
        }
        C4967ar.m11264a();
        List<String> f = C4967ar.m11273f();
        C5084cq cqVar2 = null;
        if (!f.isEmpty()) {
            Iterator<C5084cq> it = this.f11676a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cqVar = it.next();
                if (f.contains(cqVar.f11640a)) {
                    break;
                }
            }
        }
        cqVar = null;
        if (cqVar != null) {
            this.f11685j = cqVar;
            String str2 = cqVar.f11640a;
            this.f11682g = str2;
            return str2;
        }
        double d = (((double) this.f11684i.optimalVastVideoSize) * 2.0d) / 1048576.0d;
        double d2 = 1.0d;
        double d3 = (((double) this.f11684i.vastMaxAssetSize) * 1.0d) / 1048576.0d;
        for (C5084cq next : this.f11676a) {
            String[] split = this.f11677b.split(CertificateUtil.DELIMITER);
            try {
                i = (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                i = 0;
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
            double d4 = ((((double) next.f11641b) * d2) * ((double) i)) / 8192.0d;
            next.f11642c = d4;
            double d5 = d4;
            C5084cq cqVar3 = next;
            if (m11568a(0.0d, d, d5)) {
                cqVar = m11565a(cqVar, cqVar3, d5);
            } else {
                if (m11568a(d, d3, d5)) {
                    cqVar2 = m11569b(cqVar2, cqVar3, d5);
                }
            }
            d2 = 1.0d;
        }
        m11566a(cqVar, cqVar2);
        if (TextUtils.isEmpty(this.f11682g)) {
            C5220ev.C5225b bVar = this.f11684i.bitRate;
            if (bVar.bitrate_mandatory || this.f11676a.size() == 0) {
                return this.f11682g;
            }
            CountDownLatch countDownLatch = new CountDownLatch(this.f11676a.size());
            try {
                m11567a(bVar, countDownLatch);
                countDownLatch.await((long) bVar.headerTimeout, TimeUnit.MILLISECONDS);
                for (C5084cq next2 : this.f11676a) {
                    double d6 = next2.f11642c;
                    double d7 = d6;
                    if (m11568a(0.0d, d, d6)) {
                        cqVar = m11565a(cqVar, next2, d7);
                    } else {
                        if (m11568a(d, d3, d7)) {
                            cqVar2 = m11569b(cqVar2, next2, d7);
                        }
                    }
                }
            } catch (Exception e2) {
                C5275fn.m12068a().mo40590a(new C5308gk(e2));
                for (C5084cq next3 : this.f11676a) {
                    double d8 = next3.f11642c;
                    double d9 = d8;
                    if (m11568a(0.0d, d, d8)) {
                        cqVar = m11565a(cqVar, next3, d9);
                    } else {
                        if (m11568a(d, d3, d9)) {
                            cqVar2 = m11569b(cqVar2, next3, d9);
                        }
                    }
                }
            } catch (Throwable th) {
                for (C5084cq next4 : this.f11676a) {
                    double d10 = next4.f11642c;
                    double d11 = d10;
                    if (m11568a(0.0d, d, d10)) {
                        cqVar = m11565a(cqVar, next4, d11);
                    } else {
                        if (m11568a(d, d3, d11)) {
                            cqVar2 = m11569b(cqVar2, next4, d11);
                        }
                    }
                }
                m11566a(cqVar, cqVar2);
                throw th;
            }
            m11566a(cqVar, cqVar2);
        }
        return this.f11682g;
    }

    /* renamed from: a */
    private void m11567a(C5220ev.C5225b bVar, CountDownLatch countDownLatch) {
        for (C5084cq crVar : this.f11676a) {
            C5085cr crVar2 = new C5085cr(crVar, bVar.headerTimeout, countDownLatch);
            crVar2.f11654c = SystemClock.elapsedRealtime();
            C5085cr.f11645d.execute(new Runnable() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.cr.2.run():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.cr.2.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
        }
    }

    /* renamed from: a */
    private void m11566a(C5084cq cqVar, C5084cq cqVar2) {
        if (cqVar != null) {
            this.f11685j = cqVar;
            this.f11682g = cqVar.f11640a;
        } else if (cqVar2 != null) {
            this.f11685j = cqVar2;
            this.f11682g = cqVar2.f11640a;
        }
    }

    /* renamed from: c */
    public final List<C5084cq> mo40360c() {
        return this.f11676a;
    }

    /* renamed from: d */
    public final List<C5030br> mo40361d() {
        return this.f11679d;
    }

    /* renamed from: e */
    public final List<C5082cp> mo40362e() {
        return this.f11680e;
    }

    /* renamed from: a */
    public final void mo40358a(C5082cp cpVar) {
        this.f11683h = cpVar;
    }

    /* renamed from: f */
    public final C5082cp mo40363f() {
        return this.f11683h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40357a(C5030br brVar) {
        this.f11679d.add(brVar);
    }

    /* renamed from: a */
    private static C5084cq m11565a(C5084cq cqVar, C5084cq cqVar2, double d) {
        return (cqVar != null && d <= cqVar.f11642c) ? cqVar : cqVar2;
    }

    /* renamed from: b */
    private static C5084cq m11569b(C5084cq cqVar, C5084cq cqVar2, double d) {
        return (cqVar != null && d >= cqVar.f11642c) ? cqVar : cqVar2;
    }
}
