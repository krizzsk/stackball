package com.fyber.inneractive.sdk.player.p059c.p081l;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.p059c.C3236d;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3224c;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3406a;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3407b;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3409c;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3411d;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3559s;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.fyber.inneractive.sdk.player.p059c.p081l.C3571f;

/* renamed from: com.fyber.inneractive.sdk.player.c.l.d */
public final class C3566d extends C3407b {

    /* renamed from: k */
    private static final int[] f9677k = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A */
    private float f9678A;

    /* renamed from: B */
    private int f9679B;

    /* renamed from: C */
    private int f9680C;

    /* renamed from: D */
    private int f9681D;

    /* renamed from: E */
    private float f9682E;

    /* renamed from: F */
    private int f9683F;

    /* renamed from: G */
    private int f9684G;

    /* renamed from: H */
    private int f9685H;

    /* renamed from: I */
    private float f9686I;

    /* renamed from: J */
    private boolean f9687J;

    /* renamed from: K */
    private int f9688K;

    /* renamed from: j */
    C3568b f9689j;

    /* renamed from: l */
    private final C3569e f9690l;

    /* renamed from: m */
    private final C3571f.C3572a f9691m;

    /* renamed from: n */
    private final long f9692n;

    /* renamed from: o */
    private final int f9693o;

    /* renamed from: p */
    private final boolean f9694p;

    /* renamed from: q */
    private C3290h[] f9695q;

    /* renamed from: r */
    private C3567a f9696r;

    /* renamed from: s */
    private Surface f9697s;

    /* renamed from: t */
    private int f9698t;

    /* renamed from: u */
    private boolean f9699u;

    /* renamed from: v */
    private long f9700v;

    /* renamed from: w */
    private long f9701w;

    /* renamed from: x */
    private int f9702x;

    /* renamed from: y */
    private int f9703y;

    /* renamed from: z */
    private int f9704z;

    public C3566d(Context context, C3409c cVar, Handler handler, C3571f fVar) {
        this(context, cVar, handler, fVar, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3566d(Context context, C3409c cVar, Handler handler, C3571f fVar, byte b) {
        super(2, cVar, false);
        boolean z = false;
        this.f9692n = 5000;
        this.f9693o = -1;
        this.f9690l = new C3569e(context);
        this.f9691m = new C3571f.C3572a(handler, fVar);
        if (C3560t.f9655a <= 22 && "foster".equals(C3560t.f9656b) && "NVIDIA".equals(C3560t.f9657c)) {
            z = true;
        }
        this.f9694p = z;
        this.f9700v = -9223372036854775807L;
        this.f9679B = -1;
        this.f9680C = -1;
        this.f9682E = -1.0f;
        this.f9678A = -1.0f;
        this.f9698t = 1;
        m8911v();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18945a(com.fyber.inneractive.sdk.player.p059c.p071e.C3409c r13, com.fyber.inneractive.sdk.player.p059c.C3290h r14) throws com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.C3413b {
        /*
            r12 = this;
            java.lang.String r0 = r14.f8493f
            boolean r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8801b(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.fyber.inneractive.sdk.player.c.c.a r1 = r14.f8496i
            if (r1 == 0) goto L_0x001e
            r3 = 0
            r4 = 0
        L_0x0010:
            int r5 = r1.f8142b
            if (r3 >= r5) goto L_0x001f
            com.fyber.inneractive.sdk.player.c.c.a$a[] r5 = r1.f8141a
            r5 = r5[r3]
            boolean r5 = r5.f8146c
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L_0x0010
        L_0x001e:
            r4 = 0
        L_0x001f:
            com.fyber.inneractive.sdk.player.c.e.a r13 = r13.mo19193a(r0, r4)
            r0 = 1
            if (r13 != 0) goto L_0x0027
            return r0
        L_0x0027:
            java.lang.String r1 = r14.f8490c
            if (r1 == 0) goto L_0x0157
            java.lang.String r3 = r13.f9194d
            if (r3 != 0) goto L_0x0031
            goto L_0x0157
        L_0x0031:
            if (r1 == 0) goto L_0x00eb
            java.lang.String r3 = r1.trim()
            java.lang.String r4 = "avc1"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L_0x00e8
            java.lang.String r4 = "avc3"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x0049
            goto L_0x00e8
        L_0x0049:
            java.lang.String r4 = "hev1"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L_0x00e5
            java.lang.String r4 = "hvc1"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x005b
            goto L_0x00e5
        L_0x005b:
            java.lang.String r4 = "vp9"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x0067
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x00ec
        L_0x0067:
            java.lang.String r4 = "vp8"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x0073
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x00ec
        L_0x0073:
            java.lang.String r4 = "mp4a"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x007f
            java.lang.String r3 = "audio/mp4a-latm"
            goto L_0x00ec
        L_0x007f:
            java.lang.String r4 = "ac-3"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L_0x00e2
            java.lang.String r4 = "dac3"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x0090
            goto L_0x00e2
        L_0x0090:
            java.lang.String r4 = "ec-3"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L_0x00df
            java.lang.String r4 = "dec3"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x00a1
            goto L_0x00df
        L_0x00a1:
            java.lang.String r4 = "dtsc"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L_0x00dc
            java.lang.String r4 = "dtse"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x00b2
            goto L_0x00dc
        L_0x00b2:
            java.lang.String r4 = "dtsh"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L_0x00d9
            java.lang.String r4 = "dtsl"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x00c3
            goto L_0x00d9
        L_0x00c3:
            java.lang.String r4 = "opus"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r3 = "audio/opus"
            goto L_0x00ec
        L_0x00ce:
            java.lang.String r4 = "vorbis"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x00eb
            java.lang.String r3 = "audio/vorbis"
            goto L_0x00ec
        L_0x00d9:
            java.lang.String r3 = "audio/vnd.dts.hd"
            goto L_0x00ec
        L_0x00dc:
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x00ec
        L_0x00df:
            java.lang.String r3 = "audio/eac3"
            goto L_0x00ec
        L_0x00e2:
            java.lang.String r3 = "audio/ac3"
            goto L_0x00ec
        L_0x00e5:
            java.lang.String r3 = "video/hevc"
            goto L_0x00ec
        L_0x00e8:
            java.lang.String r3 = "video/avc"
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            if (r3 != 0) goto L_0x00ef
            goto L_0x0157
        L_0x00ef:
            java.lang.String r4 = r13.f9194d
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = ", "
            if (r4 != 0) goto L_0x0112
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "codec.mime "
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r13.mo19184a(r1)
        L_0x0110:
            r1 = 0
            goto L_0x0158
        L_0x0112:
            android.util.Pair r4 = com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.m8510a((java.lang.String) r1)
            if (r4 != 0) goto L_0x0119
            goto L_0x0157
        L_0x0119:
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r13.mo19186a()
            int r7 = r6.length
            r8 = 0
        L_0x011f:
            if (r8 >= r7) goto L_0x013f
            r9 = r6[r8]
            int r10 = r9.profile
            java.lang.Object r11 = r4.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x013c
            int r9 = r9.level
            java.lang.Object r10 = r4.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 < r10) goto L_0x013c
            goto L_0x0157
        L_0x013c:
            int r8 = r8 + 1
            goto L_0x011f
        L_0x013f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "codec.profileLevel, "
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r13.mo19184a(r1)
            goto L_0x0110
        L_0x0157:
            r1 = 1
        L_0x0158:
            if (r1 == 0) goto L_0x01b3
            int r3 = r14.f8497j
            if (r3 <= 0) goto L_0x01b3
            int r3 = r14.f8498k
            if (r3 <= 0) goto L_0x01b3
            int r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r3 = 21
            if (r1 < r3) goto L_0x0174
            int r0 = r14.f8497j
            int r1 = r14.f8498k
            float r14 = r14.f8499l
            double r3 = (double) r14
            boolean r1 = r13.mo19185a(r0, r1, r3)
            goto L_0x01b3
        L_0x0174:
            int r1 = r14.f8497j
            int r3 = r14.f8498k
            int r1 = r1 * r3
            int r3 = com.fyber.inneractive.sdk.player.p059c.p071e.C3411d.m8516b()
            if (r1 > r3) goto L_0x0181
            goto L_0x0182
        L_0x0181:
            r0 = 0
        L_0x0182:
            if (r0 != 0) goto L_0x01b2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "FalseCheck [legacyFrameSize, "
            r1.<init>(r3)
            int r3 = r14.f8497j
            r1.append(r3)
            java.lang.String r3 = "x"
            r1.append(r3)
            int r14 = r14.f8498k
            r1.append(r14)
            java.lang.String r14 = "] ["
            r1.append(r14)
            java.lang.String r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9659e
            r1.append(r14)
            java.lang.String r14 = "]"
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            java.lang.String r1 = "MediaCodecVideoRenderer"
            android.util.Log.d(r1, r14)
        L_0x01b2:
            r1 = r0
        L_0x01b3:
            boolean r14 = r13.f9192b
            if (r14 == 0) goto L_0x01ba
            r14 = 8
            goto L_0x01bb
        L_0x01ba:
            r14 = 4
        L_0x01bb:
            boolean r13 = r13.f9193c
            if (r13 == 0) goto L_0x01c1
            r2 = 16
        L_0x01c1:
            if (r1 == 0) goto L_0x01c5
            r13 = 3
            goto L_0x01c6
        L_0x01c5:
            r13 = 2
        L_0x01c6:
            r14 = r14 | r2
            r13 = r13 | r14
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p081l.C3566d.mo18945a(com.fyber.inneractive.sdk.player.c.e.c, com.fyber.inneractive.sdk.player.c.h):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18879a(boolean z) throws C3236d {
        super.mo18879a(z);
        int i = this.f7920a.f8523b;
        this.f9688K = i;
        this.f9687J = i != 0;
        C3571f.C3572a aVar = this.f9691m;
        C3224c cVar = this.f9218i;
        if (aVar.f9727b != null) {
            aVar.f9726a.post(new Runnable(cVar) {

                /* renamed from: a */
                final /* synthetic */ C3224c f9728a;

                public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.l.f.a.1.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.l.f.a.1.run():void, class status: UNLOADED
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
        C3569e eVar = this.f9690l;
        eVar.f9716h = false;
        if (eVar.f9710b) {
            eVar.f9709a.f9722b.sendEmptyMessage(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18880a(C3290h[] hVarArr) throws C3236d {
        this.f9695q = hVarArr;
        super.mo18880a(hVarArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18877a(long j, boolean z) throws C3236d {
        super.mo18877a(j, z);
        m8910u();
        this.f9703y = 0;
        if (z) {
            m8909t();
        } else {
            this.f9700v = -9223372036854775807L;
        }
    }

    /* renamed from: q */
    public final boolean mo18953q() {
        if ((this.f9699u || super.mo19191z()) && super.mo18953q()) {
            this.f9700v = -9223372036854775807L;
            return true;
        } else if (this.f9700v == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f9700v) {
                return true;
            }
            this.f9700v = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo18894n() {
        super.mo18894n();
        this.f9702x = 0;
        this.f9701w = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo18895o() {
        this.f9700v = -9223372036854775807L;
        m8901D();
        super.mo18895o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo18896p() {
        this.f9679B = -1;
        this.f9680C = -1;
        this.f9682E = -1.0f;
        this.f9678A = -1.0f;
        m8911v();
        m8910u();
        C3569e eVar = this.f9690l;
        if (eVar.f9710b) {
            eVar.f9709a.f9722b.sendEmptyMessage(2);
        }
        this.f9689j = null;
        try {
            super.mo18896p();
        } finally {
            this.f9218i.mo18965a();
            this.f9691m.mo19439a(this.f9218i);
        }
    }

    /* renamed from: a */
    public final void mo18875a(int i, Object obj) throws C3236d {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.f9697s != surface) {
                this.f9697s = surface;
                int i2 = this.f7922c;
                if (i2 == 1 || i2 == 2) {
                    MediaCodec mediaCodec = this.f9217h;
                    if (C3560t.f9655a < 23 || mediaCodec == null || surface == null) {
                        mo19187A();
                        mo19190y();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface != null) {
                    m8900C();
                    m8910u();
                    if (i2 == 2) {
                        m8909t();
                        return;
                    }
                    return;
                }
                m8911v();
                m8910u();
            } else if (surface != null) {
                m8900C();
                if (this.f9699u) {
                    this.f9691m.mo19438a(this.f9697s);
                }
            }
        } else if (i == 4) {
            this.f9698t = ((Integer) obj).intValue();
            MediaCodec mediaCodec2 = this.f9217h;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(this.f9698t);
            }
        } else {
            super.mo18875a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f9697s;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19191z() {
        /*
            r1 = this;
            boolean r0 = super.mo19191z()
            if (r0 == 0) goto L_0x0012
            android.view.Surface r0 = r1.f9697s
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p081l.C3566d.mo19191z():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18949a(C3406a aVar, MediaCodec mediaCodec, C3290h hVar, MediaCrypto mediaCrypto) throws C3411d.C3413b {
        C3567a aVar2;
        C3406a aVar3 = aVar;
        MediaCodec mediaCodec2 = mediaCodec;
        C3290h hVar2 = hVar;
        C3290h[] hVarArr = this.f9695q;
        int i = hVar2.f8497j;
        int i2 = hVar2.f8498k;
        int c = m8907c(hVar);
        if (hVarArr.length == 1) {
            aVar2 = new C3567a(i, i2, c);
        } else {
            boolean z = false;
            for (C3290h hVar3 : hVarArr) {
                if (m8906b(aVar3.f9192b, hVar2, hVar3)) {
                    z |= hVar3.f8497j == -1 || hVar3.f8498k == -1;
                    i = Math.max(i, hVar3.f8497j);
                    i2 = Math.max(i2, hVar3.f8498k);
                    c = Math.max(c, m8907c(hVar3));
                }
            }
            if (z) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
                Point a = m8903a(aVar3, hVar2);
                if (a != null) {
                    i = Math.max(i, a.x);
                    i2 = Math.max(i2, a.y);
                    c = Math.max(c, m8902a(hVar2.f8493f, i, i2));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
                }
            }
            aVar2 = new C3567a(i, i2, c);
        }
        this.f9696r = aVar2;
        boolean z2 = this.f9694p;
        int i3 = this.f9688K;
        MediaFormat b = hVar.mo19089b();
        b.setInteger("max-width", aVar2.f9705a);
        b.setInteger("max-height", aVar2.f9706b);
        if (aVar2.f9707c != -1) {
            b.setInteger("max-input-size", aVar2.f9707c);
        }
        if (z2) {
            b.setInteger("auto-frc", 0);
        }
        if (i3 != 0) {
            b.setFeatureEnabled("tunneled-playback", true);
            b.setInteger("audio-session-id", i3);
        }
        mediaCodec2.configure(b, this.f9697s, mediaCrypto, 0);
        if (C3560t.f9655a >= 23 && this.f9687J) {
            this.f9689j = new C3568b(this, mediaCodec2, (byte) 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18950a(String str, long j, long j2) {
        C3571f.C3572a aVar = this.f9691m;
        if (aVar.f9727b != null) {
            aVar.f9726a.post(new Runnable(str, j, j2) {

                /* renamed from: a */
                final /* synthetic */ String f9730a;

                /* renamed from: b */
                final /* synthetic */ long f9731b;

                /* renamed from: c */
                final /* synthetic */ long f9732c;

                public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.l.f.a.2.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.l.f.a.2.run():void, class status: UNLOADED
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
        C3571f.C3572a aVar = this.f9691m;
        if (aVar.f9727b != null) {
            aVar.f9726a.post(new Runnable(hVar) {

                /* renamed from: a */
                final /* synthetic */ C3290h f9734a;

                public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.l.f.a.3.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.l.f.a.3.run():void, class status: UNLOADED
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
        this.f9678A = hVar.f8501n == -1.0f ? 1.0f : hVar.f8501n;
        this.f9704z = m8908d(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo19188B() {
        if (C3560t.f9655a < 23 && this.f9687J) {
            mo19432s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18948a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f9679B = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f9680C = i2;
        this.f9682E = this.f9678A;
        if (C3560t.f9655a >= 21) {
            int i3 = this.f9704z;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f9679B;
                this.f9679B = this.f9680C;
                this.f9680C = i4;
                this.f9682E = 1.0f / this.f9682E;
            }
        } else {
            this.f9681D = this.f9704z;
        }
        mediaCodec.setVideoScalingMode(this.f9698t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19189a(boolean z, C3290h hVar, C3290h hVar2) {
        return m8906b(z, hVar, hVar2) && hVar2.f8497j <= this.f9696r.f9705a && hVar2.f8498k <= this.f9696r.f9706b && hVar2.f8494g <= this.f9696r.f9707c;
    }

    /* renamed from: a */
    private void m8904a(MediaCodec mediaCodec, int i) {
        m8912w();
        C3559s.m8868a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C3559s.m8867a();
        this.f9218i.f8125d++;
        this.f9703y = 0;
        mo19432s();
    }

    /* renamed from: a */
    private void m8905a(MediaCodec mediaCodec, int i, long j) {
        m8912w();
        C3559s.m8868a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        C3559s.m8867a();
        this.f9218i.f8125d++;
        this.f9703y = 0;
        mo19432s();
    }

    /* renamed from: t */
    private void m8909t() {
        this.f9700v = this.f9692n > 0 ? SystemClock.elapsedRealtime() + this.f9692n : -9223372036854775807L;
    }

    /* renamed from: u */
    private void m8910u() {
        MediaCodec mediaCodec;
        this.f9699u = false;
        if (C3560t.f9655a >= 23 && this.f9687J && (mediaCodec = this.f9217h) != null) {
            this.f9689j = new C3568b(this, mediaCodec, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo19432s() {
        if (!this.f9699u) {
            this.f9699u = true;
            this.f9691m.mo19438a(this.f9697s);
        }
    }

    /* renamed from: v */
    private void m8911v() {
        this.f9683F = -1;
        this.f9684G = -1;
        this.f9686I = -1.0f;
        this.f9685H = -1;
    }

    /* renamed from: w */
    private void m8912w() {
        if (this.f9679B != -1 || this.f9680C != -1) {
            if (this.f9683F != this.f9679B || this.f9684G != this.f9680C || this.f9685H != this.f9681D || this.f9686I != this.f9682E) {
                this.f9691m.mo19437a(this.f9679B, this.f9680C, this.f9681D, this.f9682E);
                this.f9683F = this.f9679B;
                this.f9684G = this.f9680C;
                this.f9685H = this.f9681D;
                this.f9686I = this.f9682E;
            }
        }
    }

    /* renamed from: C */
    private void m8900C() {
        if (this.f9683F != -1 || this.f9684G != -1) {
            this.f9691m.mo19437a(this.f9683F, this.f9684G, this.f9685H, this.f9686I);
        }
    }

    /* renamed from: D */
    private void m8901D() {
        if (this.f9702x > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f9701w;
            C3571f.C3572a aVar = this.f9691m;
            int i = this.f9702x;
            if (aVar.f9727b != null) {
                aVar.f9726a.post(new Runnable(i, j) {

                    /* renamed from: a */
                    final /* synthetic */ int f9736a;

                    /* renamed from: b */
                    final /* synthetic */ long f9737b;

                    public final void run(
/*
Method generation error in method: com.fyber.inneractive.sdk.player.c.l.f.a.4.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.fyber.inneractive.sdk.player.c.l.f.a.4.run():void, class status: UNLOADED
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
            this.f9702x = 0;
            this.f9701w = elapsedRealtime;
        }
    }

    /* renamed from: a */
    private static Point m8903a(C3406a aVar, C3290h hVar) throws C3411d.C3413b {
        int i = 0;
        boolean z = hVar.f8498k > hVar.f8497j;
        int i2 = z ? hVar.f8498k : hVar.f8497j;
        int i3 = z ? hVar.f8497j : hVar.f8498k;
        float f = ((float) i3) / ((float) i2);
        int[] iArr = f9677k;
        int length = iArr.length;
        while (true) {
            Point point = null;
            if (i >= length) {
                break;
            }
            int i4 = iArr[i];
            int i5 = (int) (((float) i4) * f);
            if (i4 <= i2 || i5 <= i3) {
                break;
            }
            if (C3560t.f9655a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                if (aVar.f9195e == null) {
                    aVar.mo19184a("align.caps");
                } else {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = aVar.f9195e.getVideoCapabilities();
                    if (videoCapabilities == null) {
                        aVar.mo19184a("align.vCaps");
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(C3560t.m8871a(i6, widthAlignment) * widthAlignment, C3560t.m8871a(i4, heightAlignment) * heightAlignment);
                    }
                }
                if (aVar.mo19185a(point.x, point.y, (double) hVar.f8499l)) {
                    return point;
                }
            } else {
                int a = C3560t.m8871a(i4, 16) * 16;
                int a2 = C3560t.m8871a(i5, 16) * 16;
                if (a * a2 <= C3411d.m8516b()) {
                    int i7 = z ? a2 : a;
                    if (!z) {
                        a = a2;
                    }
                    return new Point(i7, a);
                }
            }
            i++;
        }
        return null;
    }

    /* renamed from: c */
    private static int m8907c(C3290h hVar) {
        if (hVar.f8494g != -1) {
            return hVar.f8494g;
        }
        return m8902a(hVar.f8493f, hVar.f8497j, hVar.f8498k);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m8902a(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x0086
            if (r9 != r0) goto L_0x0007
            goto L_0x0086
        L_0x0007:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            if (r7 == 0) goto L_0x007d
            if (r7 == r3) goto L_0x007d
            if (r7 == r6) goto L_0x0061
            if (r7 == r5) goto L_0x007d
            if (r7 == r4) goto L_0x005e
            if (r7 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r8 = r8 * r9
            goto L_0x0080
        L_0x0061:
            java.lang.String r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9658d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x006c
            return r0
        L_0x006c:
            r7 = 16
            int r8 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8871a((int) r8, (int) r7)
            int r9 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8871a((int) r9, (int) r7)
            int r8 = r8 * r9
            int r8 = r8 * 16
            int r8 = r8 * 16
            goto L_0x007f
        L_0x007d:
            int r8 = r8 * r9
        L_0x007f:
            r4 = 2
        L_0x0080:
            int r8 = r8 * 3
            int r4 = r4 * 2
            int r8 = r8 / r4
            return r8
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p081l.C3566d.m8902a(java.lang.String, int, int):int");
    }

    /* renamed from: b */
    private static boolean m8906b(boolean z, C3290h hVar, C3290h hVar2) {
        if (!hVar.f8493f.equals(hVar2.f8493f) || m8908d(hVar) != m8908d(hVar2)) {
            return false;
        }
        if (!z) {
            return hVar.f8497j == hVar2.f8497j && hVar.f8498k == hVar2.f8498k;
        }
        return true;
    }

    /* renamed from: d */
    private static int m8908d(C3290h hVar) {
        if (hVar.f8500m == -1) {
            return 0;
        }
        return hVar.f8500m;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.l.d$a */
    protected static final class C3567a {

        /* renamed from: a */
        public final int f9705a;

        /* renamed from: b */
        public final int f9706b;

        /* renamed from: c */
        public final int f9707c;

        public C3567a(int i, int i2, int i3) {
            this.f9705a = i;
            this.f9706b = i2;
            this.f9707c = i3;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.l.d$b */
    private final class C3568b implements MediaCodec.OnFrameRenderedListener {
        /* synthetic */ C3568b(C3566d dVar, MediaCodec mediaCodec, byte b) {
            this(mediaCodec);
        }

        private C3568b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (this == C3566d.this.f9689j) {
                C3566d.this.mo19432s();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18951a(long r20, long r22, android.media.MediaCodec r24, java.nio.ByteBuffer r25, int r26, int r27, long r28, boolean r30) {
        /*
            r19 = this;
            r0 = r19
            r1 = r24
            r2 = r26
            r3 = r28
            r5 = 0
            r6 = 1
            if (r30 == 0) goto L_0x001f
            java.lang.String r3 = "skipVideoBuffer"
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8868a(r3)
            r1.releaseOutputBuffer(r2, r5)
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8867a()
            com.fyber.inneractive.sdk.player.c.b.c r1 = r0.f9218i
            int r2 = r1.f8126e
            int r2 = r2 + r6
            r1.f8126e = r2
            return r6
        L_0x001f:
            boolean r7 = r0.f9699u
            r8 = 21
            if (r7 != 0) goto L_0x0035
            int r3 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r3 < r8) goto L_0x0031
            long r3 = java.lang.System.nanoTime()
            r0.m8905a((android.media.MediaCodec) r1, (int) r2, (long) r3)
            goto L_0x0034
        L_0x0031:
            r0.m8904a((android.media.MediaCodec) r1, (int) r2)
        L_0x0034:
            return r6
        L_0x0035:
            int r7 = r0.f7922c
            r9 = 2
            if (r7 == r9) goto L_0x003b
            return r5
        L_0x003b:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            long r9 = r9 - r22
            long r13 = r3 - r20
            long r13 = r13 - r9
            long r9 = java.lang.System.nanoTime()
            long r13 = r13 * r11
            long r13 = r13 + r9
            com.fyber.inneractive.sdk.player.c.l.e r7 = r0.f9690l
            r20 = r9
            long r8 = r3 * r11
            boolean r10 = r7.f9716h
            if (r10 == 0) goto L_0x009c
            long r11 = r7.f9713e
            int r10 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x006a
            long r10 = r7.f9719k
            r15 = 1
            long r10 = r10 + r15
            r7.f9719k = r10
            long r10 = r7.f9715g
            r7.f9714f = r10
        L_0x006a:
            long r10 = r7.f9719k
            r15 = 6
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0093
            long r10 = r7.f9718j
            long r10 = r8 - r10
            long r5 = r7.f9719k
            long r10 = r10 / r5
            long r5 = r7.f9714f
            long r5 = r5 + r10
            boolean r10 = r7.mo19434a(r5, r13)
            if (r10 == 0) goto L_0x0086
            r10 = 0
            r7.f9716h = r10
            goto L_0x009c
        L_0x0086:
            r10 = 0
            long r11 = r7.f9717i
            long r11 = r11 + r5
            r22 = r5
            long r5 = r7.f9718j
            long r11 = r11 - r5
            r5 = r22
            r10 = r11
            goto L_0x009e
        L_0x0093:
            r10 = 0
            boolean r5 = r7.mo19434a(r8, r13)
            if (r5 == 0) goto L_0x009c
            r7.f9716h = r10
        L_0x009c:
            r5 = r8
            r10 = r13
        L_0x009e:
            boolean r12 = r7.f9716h
            r0 = 0
            if (r12 != 0) goto L_0x00ad
            r7.f9718j = r8
            r7.f9717i = r13
            r7.f9719k = r0
            r8 = 1
            r7.f9716h = r8
        L_0x00ad:
            r7.f9713e = r3
            r7.f9715g = r5
            com.fyber.inneractive.sdk.player.c.l.e$a r3 = r7.f9709a
            if (r3 == 0) goto L_0x00e4
            com.fyber.inneractive.sdk.player.c.l.e$a r3 = r7.f9709a
            long r3 = r3.f9721a
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            com.fyber.inneractive.sdk.player.c.l.e$a r0 = r7.f9709a
            long r0 = r0.f9721a
            long r3 = r7.f9711c
            long r5 = r10 - r0
            long r5 = r5 / r3
            long r5 = r5 * r3
            long r0 = r0 + r5
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x00d1
            long r3 = r0 - r3
            goto L_0x00d7
        L_0x00d1:
            long r3 = r3 + r0
            r17 = r0
            r0 = r3
            r3 = r17
        L_0x00d7:
            long r5 = r0 - r10
            long r10 = r10 - r3
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r0 = r3
        L_0x00e0:
            long r3 = r7.f9712d
            long r10 = r0 - r3
        L_0x00e4:
            long r0 = r10 - r20
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r3 = -30000(0xffffffffffff8ad0, double:NaN)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f1
            r3 = 1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            if (r3 == 0) goto L_0x012f
            java.lang.String r0 = "dropVideoBuffer"
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8868a(r0)
            r3 = r24
            r0 = 0
            r3.releaseOutputBuffer(r2, r0)
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8867a()
            r4 = r19
            com.fyber.inneractive.sdk.player.c.b.c r0 = r4.f9218i
            int r1 = r0.f8127f
            r2 = 1
            int r1 = r1 + r2
            r0.f8127f = r1
            int r0 = r4.f9702x
            int r0 = r0 + r2
            r4.f9702x = r0
            int r0 = r4.f9703y
            int r0 = r0 + r2
            r4.f9703y = r0
            com.fyber.inneractive.sdk.player.c.b.c r0 = r4.f9218i
            int r1 = r4.f9703y
            com.fyber.inneractive.sdk.player.c.b.c r2 = r4.f9218i
            int r2 = r2.f8128g
            int r1 = java.lang.Math.max(r1, r2)
            r0.f8128g = r1
            int r0 = r4.f9702x
            int r1 = r4.f9693o
            if (r0 != r1) goto L_0x012d
            r19.m8901D()
        L_0x012d:
            r5 = 1
            return r5
        L_0x012f:
            r4 = r19
            r3 = r24
            r5 = 1
            int r6 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r7 = 21
            if (r6 < r7) goto L_0x0145
            r6 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0167
            r4.m8905a((android.media.MediaCodec) r3, (int) r2, (long) r10)
            return r5
        L_0x0145:
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0167
            r5 = 11000(0x2af8, double:5.4347E-320)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0162
            r5 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x015b }
            goto L_0x0162
        L_0x015b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0162:
            r4.m8904a((android.media.MediaCodec) r3, (int) r2)
            r0 = 1
            return r0
        L_0x0167:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p081l.C3566d.mo18951a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }
}
