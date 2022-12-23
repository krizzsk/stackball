package com.ironsource.sdk.controller;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.ironsource.environment.C5505a;
import com.ironsource.sdk.C5820a;
import com.ironsource.sdk.controller.C5923w;
import com.ironsource.sdk.p144b.C5830a;
import com.ironsource.sdk.p145c.C5840c;
import com.ironsource.sdk.p145c.C5844d;
import com.ironsource.sdk.p145c.C5846e;
import com.ironsource.sdk.p150g.C6015f;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.a */
public final class C5856a implements C5830a {

    /* renamed from: a */
    C5977x f14282a;

    /* renamed from: b */
    private C5844d f14283b = C5844d.m14444a();

    /* renamed from: c */
    private C5860c f14284c;

    /* renamed from: com.ironsource.sdk.controller.a$a */
    static class C5857a {

        /* renamed from: a */
        String f14285a;

        /* renamed from: b */
        JSONObject f14286b;

        /* renamed from: c */
        String f14287c;

        /* renamed from: d */
        String f14288d;

        private C5857a() {
        }

        /* synthetic */ C5857a(byte b) {
            this();
        }
    }

    public C5856a(C5860c cVar) {
        this.f14284c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42241a(String str, C5923w.C5942d.C5970a aVar) {
        JSONObject jSONObject = new JSONObject(str);
        C5857a aVar2 = new C5857a((byte) 0);
        aVar2.f14285a = jSONObject.optString("functionName");
        aVar2.f14286b = jSONObject.optJSONObject("functionParams");
        aVar2.f14287c = jSONObject.optString("success");
        aVar2.f14288d = jSONObject.optString("fail");
        C6015f fVar = new C6015f();
        try {
            String str2 = aVar2.f14285a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals("removeAdView")) {
                        c = 2;
                        break;
                    }
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1491535759:
                    if (str2.equals("webviewAction")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                C5844d dVar = this.f14283b;
                JSONObject jSONObject2 = aVar2.f14286b;
                Activity a = this.f14284c.mo42245a();
                String str3 = aVar2.f14287c;
                String str4 = aVar2.f14288d;
                String string = jSONObject2.getString("adViewId");
                if (!string.isEmpty()) {
                    C5820a c2 = dVar.mo42195c(jSONObject2);
                    if (!dVar.f14239b.containsKey(string)) {
                        C5840c cVar = new C5840c(this, a, string, c2);
                        cVar.f14226e.runOnUiThread(new Runnable(str4, jSONObject2, str3) {

                            /* renamed from: a */
                            private /* synthetic */ String f14228a;

                            /* renamed from: b */
                            private /* synthetic */ JSONObject f14229b;

                            /* renamed from: c */
                            private /* synthetic */ String f14230c;

                            public final void run(
/*
Method generation error in method: com.ironsource.sdk.c.c.1.run():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.c.c.1.run():void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                        if (C5844d.m14447b(jSONObject2)) {
                            a.runOnUiThread(new Runnable(cVar, a, string) {

                                /* renamed from: a */
                                private /* synthetic */ C5840c f14240a;

                                /* renamed from: b */
                                private /* synthetic */ Activity f14241b;

                                /* renamed from: c */
                                private /* synthetic */ String f14242c;

                                public final void run(
/*
Method generation error in method: com.ironsource.sdk.c.d.1.run():void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.c.d.1.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                        } else {
                            dVar.f14239b.put(string, cVar);
                        }
                    } else {
                        Logger.m14957i(C5844d.f14237a, "sendMessageToAd fail - collection already contain adViewId");
                        throw new Exception("collection already contain adViewId");
                    }
                } else {
                    Logger.m14957i(C5844d.f14237a, "loadWithUrl fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                }
            } else if (c == 1) {
                C5844d dVar2 = this.f14283b;
                JSONObject jSONObject3 = aVar2.f14286b;
                String str5 = aVar2.f14287c;
                String str6 = aVar2.f14288d;
                String string2 = new JSONObject(jSONObject3.getString(NativeProtocol.WEB_DIALOG_PARAMS)).getString("adViewId");
                if (string2.isEmpty()) {
                    Logger.m14957i(C5844d.f14237a, "sendMessageToAd fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (dVar2.f14239b.containsKey(string2)) {
                    C5846e eVar = dVar2.f14239b.get(string2);
                    if (eVar != null) {
                        eVar.mo42182b(jSONObject3, str5, str6);
                    }
                } else {
                    Logger.m14957i(C5844d.f14237a, "sendMessageToAd fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                }
            } else if (c == 2) {
                C5844d dVar3 = this.f14283b;
                JSONObject jSONObject4 = aVar2.f14286b;
                String str7 = aVar2.f14287c;
                String str8 = aVar2.f14288d;
                String string3 = jSONObject4.getString("adViewId");
                if (string3.isEmpty()) {
                    Logger.m14957i(C5844d.f14237a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (dVar3.f14239b.containsKey(string3)) {
                    C5846e eVar2 = dVar3.f14239b.get(string3);
                    dVar3.f14239b.remove(string3);
                    if (eVar2 != null) {
                        eVar2.mo42179a(str7, str8);
                    }
                } else {
                    Logger.m14957i(C5844d.f14237a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                }
            } else if (c == 3) {
                C5844d dVar4 = this.f14283b;
                JSONObject jSONObject5 = aVar2.f14286b;
                String str9 = aVar2.f14287c;
                String str10 = aVar2.f14288d;
                String string4 = jSONObject5.getString("adViewId");
                if (string4.isEmpty()) {
                    Logger.m14957i(C5844d.f14237a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (dVar4.f14239b.containsKey(string4)) {
                    C5846e eVar3 = dVar4.f14239b.get(string4);
                    if (eVar3 != null) {
                        eVar3.mo42181a(jSONObject5, str9, str10);
                    }
                } else {
                    Logger.m14957i(C5844d.f14237a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                }
            } else if (c == 4) {
                C5844d dVar5 = this.f14283b;
                JSONObject jSONObject6 = aVar2.f14286b;
                String str11 = aVar2.f14287c;
                String str12 = aVar2.f14288d;
                String string5 = jSONObject6.getString("adViewId");
                if (string5.isEmpty()) {
                    Logger.m14957i(C5844d.f14237a, "performWebViewAction fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (dVar5.f14239b.containsKey(string5)) {
                    C5846e eVar4 = dVar5.f14239b.get(string5);
                    String string6 = jSONObject6.getString("actionName");
                    if (eVar4 != null) {
                        eVar4.mo42180a(string6, str11, str12);
                    }
                } else {
                    Logger.m14957i(C5844d.f14237a, "performWebViewAction fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                }
            } else {
                throw new IllegalArgumentException(String.format("%s | unsupported AdViews API", new Object[]{aVar2.f14285a}));
            }
        } catch (Exception e) {
            fVar.mo42559a("errMsg", e.getMessage());
            String a2 = C5844d.m14445a(aVar2.f14286b);
            if (!TextUtils.isEmpty(a2)) {
                fVar.mo42559a("adViewId", a2);
            }
            aVar.mo42467a(false, aVar2.f14288d, fVar);
        }
    }

    /* renamed from: a */
    public final void mo42160a(String str, String str2, String str3) {
        mo42161a(str, C5505a.C55061.m13077b(str2, str3));
    }

    /* renamed from: a */
    public final void mo42161a(String str, JSONObject jSONObject) {
        if (this.f14282a != null && !TextUtils.isEmpty(str)) {
            this.f14282a.mo42363a(str, jSONObject);
        }
    }
}
