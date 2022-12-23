package com.fyber.inneractive.sdk.player.p059c.p060a;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.appsflyer.internal.referrer.Payload;
import com.fyber.inneractive.sdk.player.p059c.C3236d;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3296m;
import com.fyber.inneractive.sdk.player.p059c.p060a.C3194d;
import com.fyber.inneractive.sdk.player.p059c.p060a.C3202e;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3224c;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3406a;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3407b;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3409c;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3411d;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3542g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.h */
public final class C3215h extends C3407b implements C3542g {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3194d.C3195a f8053j;

    /* renamed from: k */
    private final C3202e f8054k;

    /* renamed from: l */
    private boolean f8055l;

    /* renamed from: m */
    private boolean f8056m;

    /* renamed from: n */
    private MediaFormat f8057n;

    /* renamed from: o */
    private int f8058o;

    /* renamed from: p */
    private int f8059p;

    /* renamed from: q */
    private long f8060q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f8061r;

    /* renamed from: s */
    protected static void m7790s() {
    }

    /* renamed from: t */
    protected static void m7791t() {
    }

    /* renamed from: u */
    protected static void m7792u() {
    }

    /* renamed from: c */
    public final C3542g mo18883c() {
        return this;
    }

    public C3215h(C3409c cVar) {
        this(cVar, (byte) 0);
    }

    private C3215h(C3409c cVar, byte b) {
        this(cVar, 0);
    }

    private C3215h(C3409c cVar, char c) {
        this(cVar, new C3192c[0]);
    }

    private C3215h(C3409c cVar, C3192c... cVarArr) {
        super(1, cVar, true);
        this.f8054k = new C3202e(cVarArr, new C3216a(this, (byte) 0));
        this.f8053j = new C3194d.C3195a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r4 == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014f, code lost:
        if (r11 == false) goto L_0x0152;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18945a(com.fyber.inneractive.sdk.player.p059c.p071e.C3409c r11, com.fyber.inneractive.sdk.player.p059c.C3290h r12) throws com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.C3413b {
        /*
            r10 = this;
            java.lang.String r0 = r12.f8493f
            boolean r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8800a(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r3 = 16
            r4 = 21
            if (r1 < r4) goto L_0x0015
            r1 = 16
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            boolean r5 = r10.m7788a((java.lang.String) r0)
            r6 = 3
            if (r5 == 0) goto L_0x0027
            com.fyber.inneractive.sdk.player.c.e.a r5 = r11.mo19192a()
            if (r5 == 0) goto L_0x0027
            r11 = r1 | 4
            r11 = r11 | r6
            return r11
        L_0x0027:
            com.fyber.inneractive.sdk.player.c.e.a r11 = r11.mo19193a(r0, r2)
            r0 = 1
            if (r11 != 0) goto L_0x002f
            return r0
        L_0x002f:
            int r5 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r5 < r4) goto L_0x0151
            int r4 = r12.f8506s
            r5 = -1
            if (r4 == r5) goto L_0x006e
            int r4 = r12.f8506s
            android.media.MediaCodecInfo$CodecCapabilities r7 = r11.f9195e
            if (r7 != 0) goto L_0x0045
            java.lang.String r4 = "sampleRate.caps"
            r11.mo19184a(r4)
        L_0x0043:
            r4 = 0
            goto L_0x006c
        L_0x0045:
            android.media.MediaCodecInfo$CodecCapabilities r7 = r11.f9195e
            android.media.MediaCodecInfo$AudioCapabilities r7 = r7.getAudioCapabilities()
            if (r7 != 0) goto L_0x0053
            java.lang.String r4 = "sampleRate.aCaps"
            r11.mo19184a(r4)
            goto L_0x0043
        L_0x0053:
            boolean r7 = r7.isSampleRateSupported(r4)
            if (r7 != 0) goto L_0x006b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "sampleRate.support, "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r11.mo19184a(r4)
            goto L_0x0043
        L_0x006b:
            r4 = 1
        L_0x006c:
            if (r4 == 0) goto L_0x0152
        L_0x006e:
            int r4 = r12.f8505r
            if (r4 == r5) goto L_0x0151
            int r12 = r12.f8505r
            android.media.MediaCodecInfo$CodecCapabilities r4 = r11.f9195e
            if (r4 != 0) goto L_0x0080
            java.lang.String r12 = "channelCount.caps"
            r11.mo19184a(r12)
        L_0x007d:
            r11 = 0
            goto L_0x014f
        L_0x0080:
            android.media.MediaCodecInfo$CodecCapabilities r4 = r11.f9195e
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x008e
            java.lang.String r12 = "channelCount.aCaps"
            r11.mo19184a(r12)
            goto L_0x007d
        L_0x008e:
            java.lang.String r5 = r11.f9191a
            java.lang.String r7 = r11.f9194d
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r0) goto L_0x0139
            int r8 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r9 = 26
            if (r8 < r9) goto L_0x00a2
            if (r4 <= 0) goto L_0x00a2
            goto L_0x0139
        L_0x00a2:
            java.lang.String r8 = "audio/mpeg"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/3gpp"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/amr-wb"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/mp4a-latm"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/vorbis"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/opus"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/raw"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/flac"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/g711-alaw"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/g711-mlaw"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0139
            java.lang.String r8 = "audio/gsm"
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x00fb
            goto L_0x0139
        L_0x00fb:
            java.lang.String r8 = "audio/ac3"
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x0105
            r3 = 6
            goto L_0x0110
        L_0x0105:
            java.lang.String r8 = "audio/eac3"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r3 = 30
        L_0x0110:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "AssumedMaxChannelAdjustment: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = ", ["
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = " to "
            r7.append(r4)
            r7.append(r3)
            java.lang.String r4 = "]"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.String r5 = "MediaCodecInfo"
            android.util.Log.w(r5, r4)
            r4 = r3
        L_0x0139:
            if (r4 >= r12) goto L_0x014e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "channelCount.support, "
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r11.mo19184a(r12)
            goto L_0x007d
        L_0x014e:
            r11 = 1
        L_0x014f:
            if (r11 == 0) goto L_0x0152
        L_0x0151:
            r2 = 1
        L_0x0152:
            if (r2 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r6 = 2
        L_0x0156:
            r11 = r1 | 4
            r11 = r11 | r6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p060a.C3215h.mo18945a(com.fyber.inneractive.sdk.player.c.e.c, com.fyber.inneractive.sdk.player.c.h):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3406a mo18946a(C3409c cVar, C3290h hVar, boolean z) throws C3411d.C3413b {
        C3406a a;
        if (!m7788a(hVar.f8493f) || (a = cVar.mo19192a()) == null) {
            this.f8055l = false;
            return super.mo18946a(cVar, hVar, z);
        }
        this.f8055l = true;
        return a;
    }

    /* renamed from: a */
    private boolean m7788a(String str) {
        C3202e eVar = this.f8054k;
        if (eVar.f7996c != null) {
            if (Arrays.binarySearch(eVar.f7996c.f7940b, C3202e.m7736a(str)) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18949a(C3406a aVar, MediaCodec mediaCodec, C3290h hVar, MediaCrypto mediaCrypto) {
        this.f8056m = C3560t.f9655a < 24 && "OMX.SEC.aac.dec".equals(aVar.f9191a) && Payload.SOURCE_SAMSUNG.equals(C3560t.f9657c) && (C3560t.f9656b.startsWith("zeroflte") || C3560t.f9656b.startsWith("herolte") || C3560t.f9656b.startsWith("heroqlte"));
        if (this.f8055l) {
            MediaFormat b = hVar.mo19089b();
            this.f8057n = b;
            b.setString("mime", "audio/raw");
            mediaCodec.configure(this.f8057n, (Surface) null, mediaCrypto, 0);
            this.f8057n.setString("mime", hVar.f8493f);
            return;
        }
        mediaCodec.configure(hVar.mo19089b(), (Surface) null, mediaCrypto, 0);
        this.f8057n = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18950a(String str, long j, long j2) {
        C3194d.C3195a aVar = this.f8053j;
        if (aVar.f7944b != null) {
            aVar.f7943a.post(new Runnable(str, j, j2) {

                /* renamed from: a */
                final /* synthetic */ String f7947a;

                /* renamed from: b */
                final /* synthetic */ long f7948b;

                /* renamed from: c */
                final /* synthetic */ long f7949c;

                public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.a.d.a.2.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.a.d.a.2.run():void, class status: UNLOADED
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
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18952b(C3290h hVar) throws C3236d {
        super.mo18952b(hVar);
        C3194d.C3195a aVar = this.f8053j;
        if (aVar.f7944b != null) {
            aVar.f7943a.post(new Runnable(hVar) {

                /* renamed from: a */
                final /* synthetic */ C3290h f7951a;

                public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.a.d.a.3.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.a.d.a.3.run():void, class status: UNLOADED
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
        this.f8058o = "audio/raw".equals(hVar.f8493f) ? hVar.f8507t : 2;
        this.f8059p = hVar.f8505r;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fc A[Catch:{ a -> 0x007b, c -> 0x0189 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18948a(android.media.MediaCodec r14, android.media.MediaFormat r15) throws com.fyber.inneractive.sdk.player.p059c.C3236d {
        /*
            r13 = this;
            android.media.MediaFormat r14 = r13.f8057n
            r0 = 0
            r1 = 1
            if (r14 == 0) goto L_0x0008
            r14 = 1
            goto L_0x0009
        L_0x0008:
            r14 = 0
        L_0x0009:
            java.lang.String r2 = "audio/raw"
            if (r14 == 0) goto L_0x0016
            android.media.MediaFormat r3 = r13.f8057n
            java.lang.String r4 = "mime"
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            if (r14 == 0) goto L_0x001b
            android.media.MediaFormat r15 = r13.f8057n
        L_0x001b:
            java.lang.String r14 = "channel-count"
            int r14 = r15.getInteger(r14)
            java.lang.String r4 = "sample-rate"
            int r15 = r15.getInteger(r4)
            boolean r4 = r13.f8056m
            r5 = 6
            if (r4 == 0) goto L_0x003e
            if (r14 != r5) goto L_0x003e
            int r4 = r13.f8059p
            if (r4 >= r5) goto L_0x003e
            int[] r4 = new int[r4]
            r6 = 0
        L_0x0035:
            int r7 = r13.f8059p
            if (r6 >= r7) goto L_0x003f
            r4[r6] = r6
            int r6 = r6 + 1
            goto L_0x0035
        L_0x003e:
            r4 = 0
        L_0x003f:
            com.fyber.inneractive.sdk.player.c.a.e r6 = r13.f8054k     // Catch:{ c -> 0x0189 }
            int r7 = r13.f8058o     // Catch:{ c -> 0x0189 }
            boolean r2 = r2.equals(r3)     // Catch:{ c -> 0x0189 }
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x004f
            int r3 = com.fyber.inneractive.sdk.player.p059c.p060a.C3202e.m7736a((java.lang.String) r3)     // Catch:{ c -> 0x0189 }
            goto L_0x0050
        L_0x004f:
            r3 = r7
        L_0x0050:
            if (r2 != 0) goto L_0x0088
            int r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8888b(r7, r14)     // Catch:{ c -> 0x0189 }
            r6.f8010q = r7     // Catch:{ c -> 0x0189 }
            com.fyber.inneractive.sdk.player.c.a.f r7 = r6.f7997d     // Catch:{ c -> 0x0189 }
            r7.f8042b = r4     // Catch:{ c -> 0x0189 }
            com.fyber.inneractive.sdk.player.c.a.c[] r4 = r6.f7998e     // Catch:{ c -> 0x0189 }
            int r7 = r4.length     // Catch:{ c -> 0x0189 }
            r8 = 0
            r9 = 0
        L_0x0061:
            if (r8 >= r7) goto L_0x0082
            r10 = r4[r8]     // Catch:{ c -> 0x0189 }
            boolean r11 = r10.mo18902a(r15, r14, r3)     // Catch:{ a -> 0x007b }
            r9 = r9 | r11
            boolean r11 = r10.mo18901a()     // Catch:{ c -> 0x0189 }
            if (r11 == 0) goto L_0x0078
            int r14 = r10.mo18903b()     // Catch:{ c -> 0x0189 }
            int r3 = r10.mo18904c()     // Catch:{ c -> 0x0189 }
        L_0x0078:
            int r8 = r8 + 1
            goto L_0x0061
        L_0x007b:
            r14 = move-exception
            com.fyber.inneractive.sdk.player.c.a.e$c r15 = new com.fyber.inneractive.sdk.player.c.a.e$c     // Catch:{ c -> 0x0189 }
            r15.<init>((java.lang.Throwable) r14)     // Catch:{ c -> 0x0189 }
            throw r15     // Catch:{ c -> 0x0189 }
        L_0x0082:
            if (r9 == 0) goto L_0x0089
            r6.mo18920a()     // Catch:{ c -> 0x0189 }
            goto L_0x0089
        L_0x0088:
            r9 = 0
        L_0x0089:
            r4 = 252(0xfc, float:3.53E-43)
            r7 = 12
            switch(r14) {
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a6;
                case 3: goto L_0x00a3;
                case 4: goto L_0x00a0;
                case 5: goto L_0x009d;
                case 6: goto L_0x009a;
                case 7: goto L_0x0097;
                case 8: goto L_0x0094;
                default: goto L_0x0090;
            }     // Catch:{ c -> 0x0189 }
        L_0x0090:
            com.fyber.inneractive.sdk.player.c.a.e$c r15 = new com.fyber.inneractive.sdk.player.c.a.e$c     // Catch:{ c -> 0x0189 }
            goto L_0x0177
        L_0x0094:
            int r8 = com.fyber.inneractive.sdk.player.p059c.C3220b.f8104a     // Catch:{ c -> 0x0189 }
            goto L_0x00aa
        L_0x0097:
            r8 = 1276(0x4fc, float:1.788E-42)
            goto L_0x00aa
        L_0x009a:
            r8 = 252(0xfc, float:3.53E-43)
            goto L_0x00aa
        L_0x009d:
            r8 = 220(0xdc, float:3.08E-43)
            goto L_0x00aa
        L_0x00a0:
            r8 = 204(0xcc, float:2.86E-43)
            goto L_0x00aa
        L_0x00a3:
            r8 = 28
            goto L_0x00aa
        L_0x00a6:
            r8 = 12
            goto L_0x00aa
        L_0x00a9:
            r8 = 4
        L_0x00aa:
            int r10 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ c -> 0x0189 }
            r11 = 23
            r12 = 5
            if (r10 > r11) goto L_0x00d1
            java.lang.String r10 = "foster"
            java.lang.String r11 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ c -> 0x0189 }
            boolean r10 = r10.equals(r11)     // Catch:{ c -> 0x0189 }
            if (r10 == 0) goto L_0x00d1
            java.lang.String r10 = "NVIDIA"
            java.lang.String r11 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9657c     // Catch:{ c -> 0x0189 }
            boolean r10 = r10.equals(r11)     // Catch:{ c -> 0x0189 }
            if (r10 == 0) goto L_0x00d1
            r10 = 3
            if (r14 == r10) goto L_0x00d2
            if (r14 == r12) goto L_0x00d2
            r4 = 7
            if (r14 == r4) goto L_0x00ce
            goto L_0x00d1
        L_0x00ce:
            int r4 = com.fyber.inneractive.sdk.player.p059c.C3220b.f8104a     // Catch:{ c -> 0x0189 }
            goto L_0x00d2
        L_0x00d1:
            r4 = r8
        L_0x00d2:
            int r8 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ c -> 0x0189 }
            r10 = 25
            if (r8 > r10) goto L_0x00e7
            java.lang.String r8 = "fugu"
            java.lang.String r10 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b     // Catch:{ c -> 0x0189 }
            boolean r8 = r8.equals(r10)     // Catch:{ c -> 0x0189 }
            if (r8 == 0) goto L_0x00e7
            if (r2 == 0) goto L_0x00e7
            if (r14 != r1) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r7 = r4
        L_0x00e8:
            if (r9 != 0) goto L_0x00fc
            boolean r4 = r6.mo18929h()     // Catch:{ c -> 0x0189 }
            if (r4 == 0) goto L_0x00fc
            int r4 = r6.f8002i     // Catch:{ c -> 0x0189 }
            if (r4 != r3) goto L_0x00fc
            int r4 = r6.f8000g     // Catch:{ c -> 0x0189 }
            if (r4 != r15) goto L_0x00fc
            int r4 = r6.f8001h     // Catch:{ c -> 0x0189 }
            if (r4 == r7) goto L_0x0176
        L_0x00fc:
            r6.mo18927f()     // Catch:{ c -> 0x0189 }
            r6.f8002i = r3     // Catch:{ c -> 0x0189 }
            r6.f8005l = r2     // Catch:{ c -> 0x0189 }
            r6.f8000g = r15     // Catch:{ c -> 0x0189 }
            r6.f8001h = r7     // Catch:{ c -> 0x0189 }
            r4 = 2
            if (r2 == 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r3 = 2
        L_0x010c:
            r6.f8003j = r3     // Catch:{ c -> 0x0189 }
            int r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8888b(r4, r14)     // Catch:{ c -> 0x0189 }
            r6.f8011r = r14     // Catch:{ c -> 0x0189 }
            if (r2 == 0) goto L_0x0126
            int r14 = r6.f8003j     // Catch:{ c -> 0x0189 }
            if (r14 == r12) goto L_0x0123
            int r14 = r6.f8003j     // Catch:{ c -> 0x0189 }
            if (r14 != r5) goto L_0x011f
            goto L_0x0123
        L_0x011f:
            r14 = 49152(0xc000, float:6.8877E-41)
            goto L_0x015b
        L_0x0123:
            r14 = 20480(0x5000, float:2.8699E-41)
            goto L_0x015b
        L_0x0126:
            int r14 = r6.f8003j     // Catch:{ c -> 0x0189 }
            int r14 = android.media.AudioTrack.getMinBufferSize(r15, r7, r14)     // Catch:{ c -> 0x0189 }
            r15 = -2
            if (r14 == r15) goto L_0x0130
            r0 = 1
        L_0x0130:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r0)     // Catch:{ c -> 0x0189 }
            int r15 = r14 * 4
            r0 = 250000(0x3d090, double:1.235164E-318)
            long r0 = r6.mo18922b(r0)     // Catch:{ c -> 0x0189 }
            int r1 = (int) r0     // Catch:{ c -> 0x0189 }
            int r0 = r6.f8011r     // Catch:{ c -> 0x0189 }
            int r0 = r0 * r1
            long r3 = (long) r14     // Catch:{ c -> 0x0189 }
            r7 = 750000(0xb71b0, double:3.70549E-318)
            long r7 = r6.mo18922b(r7)     // Catch:{ c -> 0x0189 }
            int r14 = r6.f8011r     // Catch:{ c -> 0x0189 }
            long r9 = (long) r14     // Catch:{ c -> 0x0189 }
            long r7 = r7 * r9
            long r3 = java.lang.Math.max(r3, r7)     // Catch:{ c -> 0x0189 }
            int r14 = (int) r3     // Catch:{ c -> 0x0189 }
            if (r15 >= r0) goto L_0x0157
            r14 = r0
            goto L_0x015b
        L_0x0157:
            if (r15 <= r14) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r14 = r15
        L_0x015b:
            r6.f8006m = r14     // Catch:{ c -> 0x0189 }
            if (r2 == 0) goto L_0x0165
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x016f
        L_0x0165:
            int r14 = r6.f8006m     // Catch:{ c -> 0x0189 }
            int r15 = r6.f8011r     // Catch:{ c -> 0x0189 }
            int r14 = r14 / r15
            long r14 = (long) r14     // Catch:{ c -> 0x0189 }
            long r14 = r6.mo18917a((long) r14)     // Catch:{ c -> 0x0189 }
        L_0x016f:
            r6.f8007n = r14     // Catch:{ c -> 0x0189 }
            com.fyber.inneractive.sdk.player.c.m r14 = r6.f8008o     // Catch:{ c -> 0x0189 }
            r6.mo18919a((com.fyber.inneractive.sdk.player.p059c.C3296m) r14)     // Catch:{ c -> 0x0189 }
        L_0x0176:
            return
        L_0x0177:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ c -> 0x0189 }
            java.lang.String r1 = "Unsupported channel count: "
            r0.<init>(r1)     // Catch:{ c -> 0x0189 }
            r0.append(r14)     // Catch:{ c -> 0x0189 }
            java.lang.String r14 = r0.toString()     // Catch:{ c -> 0x0189 }
            r15.<init>((java.lang.String) r14)     // Catch:{ c -> 0x0189 }
            throw r15     // Catch:{ c -> 0x0189 }
        L_0x0189:
            r14 = move-exception
            int r15 = r13.f7921b
            com.fyber.inneractive.sdk.player.c.d r14 = com.fyber.inneractive.sdk.player.p059c.C3236d.m7869a(r14, r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p060a.C3215h.mo18948a(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18879a(boolean z) throws C3236d {
        super.mo18879a(z);
        C3194d.C3195a aVar = this.f8053j;
        C3224c cVar = this.f9218i;
        if (aVar.f7944b != null) {
            aVar.f7943a.post(new Runnable(cVar) {

                /* renamed from: a */
                final /* synthetic */ C3224c f7945a;

                public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.a.d.a.1.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.a.d.a.1.run():void, class status: UNLOADED
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
        int i = this.f7920a.f8523b;
        boolean z2 = false;
        if (i != 0) {
            C3202e eVar = this.f8054k;
            if (C3560t.f9655a >= 21) {
                z2 = true;
            }
            C3535a.m8784b(z2);
            if (!eVar.f8017x || eVar.f8016w != i) {
                eVar.f8017x = true;
                eVar.f8016w = i;
                eVar.mo18927f();
                return;
            }
            return;
        }
        C3202e eVar2 = this.f8054k;
        if (eVar2.f8017x) {
            eVar2.f8017x = false;
            eVar2.f8016w = 0;
            eVar2.mo18927f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18877a(long j, boolean z) throws C3236d {
        super.mo18877a(j, z);
        this.f8054k.mo18927f();
        this.f8060q = j;
        this.f8061r = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo18894n() {
        super.mo18894n();
        this.f8054k.mo18923b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo18895o() {
        C3202e eVar = this.f8054k;
        eVar.f8015v = false;
        if (eVar.mo18929h()) {
            eVar.mo18931j();
            eVar.f7999f.mo18934a();
        }
        super.mo18895o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo18896p() {
        try {
            C3202e eVar = this.f8054k;
            eVar.mo18927f();
            eVar.mo18928g();
            for (C3192c h : eVar.f7998e) {
                h.mo18909h();
            }
            eVar.f8016w = 0;
            eVar.f8015v = false;
            try {
                super.mo18896p();
            } finally {
                this.f9218i.mo18965a();
                this.f8053j.mo18910a(this.f9218i);
            }
        } catch (Throwable th) {
            super.mo18896p();
            throw th;
        } finally {
            this.f9218i.mo18965a();
            this.f8053j.mo18910a(this.f9218i);
        }
    }

    /* renamed from: r */
    public final boolean mo18954r() {
        if (super.mo18954r()) {
            C3202e eVar = this.f8054k;
            if (!eVar.mo18929h() || (eVar.f8014u && !eVar.mo18925d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo18953q() {
        return this.f8054k.mo18925d() || super.mo18953q();
    }

    /* renamed from: v */
    public final long mo18955v() {
        long a = this.f8054k.mo18918a(mo18954r());
        if (a != Long.MIN_VALUE) {
            if (!this.f8061r) {
                a = Math.max(this.f8060q, a);
            }
            this.f8060q = a;
            this.f8061r = false;
        }
        return this.f8060q;
    }

    /* renamed from: a */
    public final C3296m mo18947a(C3296m mVar) {
        return this.f8054k.mo18919a(mVar);
    }

    /* renamed from: w */
    public final C3296m mo18956w() {
        return this.f8054k.f8008o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18951a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C3236d {
        if (this.f8055l && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f9218i.f8126e++;
            C3202e eVar = this.f8054k;
            if (eVar.f8012s == 1) {
                eVar.f8012s = 2;
            }
            return true;
        } else {
            try {
                if (!this.f8054k.mo18921a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f9218i.f8125d++;
                return true;
            } catch (C3202e.C3208d | C3202e.C3212h e) {
                throw C3236d.m7869a(e, this.f7921b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo18957x() throws C3236d {
        try {
            C3202e eVar = this.f8054k;
            if (eVar.f8014u) {
                return;
            }
            if (eVar.mo18929h()) {
                if (eVar.mo18924c()) {
                    eVar.f7999f.mo18935a(eVar.mo18930i());
                    eVar.f8009p = 0;
                    eVar.f8014u = true;
                }
            }
        } catch (C3202e.C3212h e) {
            throw C3236d.m7869a(e, this.f7921b);
        }
    }

    /* renamed from: a */
    public final void mo18875a(int i, Object obj) throws C3236d {
        if (i == 2) {
            C3202e eVar = this.f8054k;
            float floatValue = ((Float) obj).floatValue();
            if (eVar.f8013t != floatValue) {
                eVar.f8013t = floatValue;
                eVar.mo18926e();
            }
        } else if (i != 3) {
            super.mo18875a(i, obj);
        } else {
            int intValue = ((Integer) obj).intValue();
            C3202e eVar2 = this.f8054k;
            if (eVar2.f8004k != intValue) {
                eVar2.f8004k = intValue;
                if (!eVar2.f8017x) {
                    eVar2.mo18927f();
                    eVar2.f8016w = 0;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.h$a */
    private final class C3216a implements C3202e.C3210f {
        private C3216a() {
        }

        /* synthetic */ C3216a(C3215h hVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo18943a(int i) {
            C3194d.C3195a a = C3215h.this.f8053j;
            if (a.f7944b != null) {
                a.f7943a.post(new Runnable(i) {

                    /* renamed from: a */
                    final /* synthetic */ int f7959a;

                    public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.a.d.a.6.run():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.a.d.a.6.run():void, class status: UNLOADED
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
                    
*/
                });
            }
            C3215h.m7790s();
        }

        /* renamed from: a */
        public final void mo18942a() {
            C3215h.m7791t();
            boolean unused = C3215h.this.f8061r = true;
        }

        /* renamed from: a */
        public final void mo18944a(int i, long j, long j2) {
            C3194d.C3195a a = C3215h.this.f8053j;
            if (a.f7944b != null) {
                a.f7943a.post(new Runnable(i, j, j2) {

                    /* renamed from: a */
                    final /* synthetic */ int f7953a;

                    /* renamed from: b */
                    final /* synthetic */ long f7954b;

                    /* renamed from: c */
                    final /* synthetic */ long f7955c;

                    public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.a.d.a.4.run():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.a.d.a.4.run():void, class status: UNLOADED
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
                    
*/
                });
            }
            C3215h.m7792u();
        }
    }
}
