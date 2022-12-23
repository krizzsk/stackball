package com.tapjoy.internal;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.cz */
public final class C9145cz extends C9138cs {

    /* renamed from: a */
    public final C9139ct f22478a;

    /* renamed from: b */
    public final List f22479b = new ArrayList();

    /* renamed from: c */
    public C9170ds f22480c;

    /* renamed from: d */
    public boolean f22481d = false;

    /* renamed from: e */
    public boolean f22482e = false;

    /* renamed from: f */
    public String f22483f;

    /* renamed from: g */
    boolean f22484g;

    /* renamed from: h */
    private final C9140cu f22485h;

    /* renamed from: i */
    private C9168dq f22486i;

    /* renamed from: b */
    private void m24483b(View view) {
        this.f22486i = new C9168dq(view);
    }

    /* renamed from: c */
    public final View mo57930c() {
        return (View) this.f22486i.get();
    }

    /* renamed from: d */
    public final boolean mo57931d() {
        return this.f22481d && !this.f22482e;
    }

    C9145cz(C9139ct ctVar, C9140cu cuVar) {
        this.f22478a = ctVar;
        this.f22485h = cuVar;
        this.f22483f = UUID.randomUUID().toString();
        m24483b((View) null);
        if (cuVar.f22463f == C9141cv.HTML) {
            this.f22480c = new C9172dt(cuVar.f22459b);
        } else {
            this.f22480c = new C9173du(Collections.unmodifiableList(cuVar.f22460c), cuVar.f22461d);
        }
        this.f22480c.mo57959a();
        C9150dd.m24507a().f22499a.add(this);
        C9170ds dsVar = this.f22480c;
        C9155dg a = C9155dg.m24515a();
        WebView c = dsVar.mo57966c();
        JSONObject jSONObject = new JSONObject();
        C9163dm.m24535a(jSONObject, "impressionOwner", ctVar.f22455a);
        C9163dm.m24535a(jSONObject, "videoEventsOwner", ctVar.f22456b);
        C9163dm.m24535a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(ctVar.f22457c));
        a.mo57953a(c, "init", jSONObject);
    }

    /* renamed from: a */
    public final void mo57925a() {
        if (!this.f22481d) {
            this.f22481d = true;
            C9150dd a = C9150dd.m24507a();
            boolean b = a.mo57947b();
            a.f22500b.add(this);
            if (!b) {
                C9157dh a2 = C9157dh.m24521a();
                C9151de.m24509a().f22506e = a2;
                C9151de a3 = C9151de.m24509a();
                a3.f22503b = new BroadcastReceiver() {
                    public final void onReceive(
/*
Method generation error in method: com.tapjoy.internal.de.1.onReceive(android.content.Context, android.content.Intent):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tapjoy.internal.de.1.onReceive(android.content.Context, android.content.Intent):void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                a3.f22502a.registerReceiver(a3.f22503b, intentFilter);
                a3.f22504c = true;
                a3.mo57949c();
                if (C9151de.m24509a().mo57948b()) {
                    C9175dv.m24560a();
                    C9175dv.m24564b();
                }
                C9135cp cpVar = a2.f22516b;
                cpVar.f22450b = cpVar.mo57921a();
                cpVar.mo57922b();
                cpVar.f22449a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cpVar);
            }
            this.f22480c.mo57960a(C9157dh.m24521a().f22515a);
            this.f22480c.mo57962a(this, this.f22485h);
        }
    }

    /* renamed from: a */
    public final void mo57926a(View view) {
        if (!this.f22482e) {
            C9166do.m24543a((Object) view, "AdView is null");
            if (mo57930c() != view) {
                m24483b(view);
                this.f22480c.mo57967d();
                Collection<C9145cz> unmodifiableCollection = Collections.unmodifiableCollection(C9150dd.m24507a().f22499a);
                if (unmodifiableCollection != null && unmodifiableCollection.size() > 0) {
                    for (C9145cz czVar : unmodifiableCollection) {
                        if (czVar != this && czVar.mo57930c() == view) {
                            czVar.f22486i.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo57927b() {
        if (!this.f22482e) {
            this.f22486i.clear();
            if (!this.f22482e) {
                this.f22479b.clear();
            }
            this.f22482e = true;
            C9155dg.m24515a().mo57953a(this.f22480c.mo57966c(), "finishSession", new Object[0]);
            C9150dd a = C9150dd.m24507a();
            boolean b = a.mo57947b();
            a.f22499a.remove(this);
            a.f22500b.remove(this);
            if (b && !a.mo57947b()) {
                C9157dh a2 = C9157dh.m24521a();
                C9175dv a3 = C9175dv.m24560a();
                C9175dv.m24566c();
                a3.f22548b.clear();
                C9175dv.f22543a.post(new Runnable() {
                    public final void run() {
                        C9175dv.this.f22552h.mo57982b();
                    }
                });
                C9151de a4 = C9151de.m24509a();
                if (!(a4.f22502a == null || a4.f22503b == null)) {
                    a4.f22502a.unregisterReceiver(a4.f22503b);
                    a4.f22503b = null;
                }
                a4.f22504c = false;
                a4.f22505d = false;
                a4.f22506e = null;
                C9135cp cpVar = a2.f22516b;
                cpVar.f22449a.getContentResolver().unregisterContentObserver(cpVar);
            }
            this.f22480c.mo57965b();
            this.f22480c = null;
        }
    }
}
