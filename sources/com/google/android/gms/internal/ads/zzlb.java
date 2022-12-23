package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public abstract class zzlb extends zzgp {
    private static final byte[] zzayp = zzov.zzbk("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzhf zzahd;
    private ByteBuffer[] zzakl;
    private final zzld zzayq;
    private final zzjf<zzjh> zzayr;
    private final boolean zzays;
    private final zzjb zzayt;
    private final zzjb zzayu;
    private final zzhh zzayv;
    private final List<Long> zzayw;
    private final MediaCodec.BufferInfo zzayx;
    private zzjd<zzjh> zzayy;
    private zzjd<zzjh> zzayz;
    private MediaCodec zzaza;
    private zzlc zzazb;
    private boolean zzazc;
    private boolean zzazd;
    private boolean zzaze;
    private boolean zzazf;
    private boolean zzazg;
    private boolean zzazh;
    private boolean zzazi;
    private boolean zzazj;
    private boolean zzazk;
    private ByteBuffer[] zzazl;
    private long zzazm;
    private int zzazn;
    private int zzazo;
    private boolean zzazp;
    private boolean zzazq;
    private int zzazr;
    private int zzazs;
    private boolean zzazt;
    private boolean zzazu;
    private boolean zzazv;
    private boolean zzazw;
    private boolean zzazx;
    private boolean zzazy;
    protected zziy zzazz;

    public zzlb(int i, zzld zzld, zzjf<zzjh> zzjf, boolean z) {
        super(i);
        zzoh.checkState(zzov.SDK_INT >= 16);
        this.zzayq = (zzld) zzoh.checkNotNull(zzld);
        this.zzayr = zzjf;
        this.zzays = z;
        this.zzayt = new zzjb(0);
        this.zzayu = new zzjb(0);
        this.zzayv = new zzhh();
        this.zzayw = new ArrayList();
        this.zzayx = new MediaCodec.BufferInfo();
        this.zzazr = 0;
        this.zzazs = 0;
    }

    /* access modifiers changed from: protected */
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzgq {
    }

    /* access modifiers changed from: protected */
    public void onStarted() {
    }

    /* access modifiers changed from: protected */
    public void onStopped() {
    }

    /* access modifiers changed from: protected */
    public abstract int zza(zzld zzld, zzhf zzhf) throws zzlj;

    /* access modifiers changed from: protected */
    public void zza(zzjb zzjb) {
    }

    /* access modifiers changed from: protected */
    public abstract void zza(zzlc zzlc, MediaCodec mediaCodec, zzhf zzhf, MediaCrypto mediaCrypto) throws zzlj;

    /* access modifiers changed from: protected */
    public abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzgq;

    /* access modifiers changed from: protected */
    public boolean zza(MediaCodec mediaCodec, boolean z, zzhf zzhf, zzhf zzhf2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean zza(zzlc zzlc) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void zzc(String str, long j, long j2) {
    }

    public final int zzef() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public void zzgd() throws zzgq {
    }

    public final int zza(zzhf zzhf) throws zzgq {
        try {
            return zza(this.zzayq, zzhf);
        } catch (zzlj e) {
            throw zzgq.zza(e, getIndex());
        }
    }

    /* access modifiers changed from: protected */
    public zzlc zza(zzld zzld, zzhf zzhf, boolean z) throws zzlj {
        return zzld.zzb(zzhf.zzagi, z);
    }

    /* access modifiers changed from: protected */
    public final void zzhb() throws zzgq {
        zzhf zzhf;
        if (this.zzaza == null && (zzhf = this.zzahd) != null) {
            this.zzayy = this.zzayz;
            String str = zzhf.zzagi;
            zzjd<zzjh> zzjd = this.zzayy;
            if (zzjd != null) {
                int state = zzjd.getState();
                if (state == 0) {
                    throw zzgq.zza(this.zzayy.zzgo(), getIndex());
                } else if (state == 3 || state == 4) {
                    zzjh zzgn = this.zzayy.zzgn();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.zzazb == null) {
                    try {
                        this.zzazb = zza(this.zzayq, this.zzahd, false);
                    } catch (zzlj e) {
                        zza(new zzle(this.zzahd, (Throwable) e, false, -49998));
                    }
                    if (this.zzazb == null) {
                        zza(new zzle(this.zzahd, (Throwable) null, false, -49999));
                    }
                }
                if (zza(this.zzazb)) {
                    String str2 = this.zzazb.name;
                    this.zzazc = zzov.SDK_INT < 21 && this.zzahd.zzagk.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.zzazd = zzov.SDK_INT < 18 || (zzov.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzov.SDK_INT == 19 && zzov.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.zzaze = zzov.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzov.DEVICE) || "flounder_lte".equals(zzov.DEVICE) || "grouper".equals(zzov.DEVICE) || "tilapia".equals(zzov.DEVICE));
                    this.zzazf = zzov.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.zzazg = (zzov.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzov.SDK_INT <= 19 && "hb2000".equals(zzov.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.zzazh = zzov.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.zzazi = zzov.SDK_INT <= 18 && this.zzahd.zzags == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        zzow.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.zzaza = MediaCodec.createByCodecName(str2);
                        zzow.endSection();
                        zzow.beginSection("configureCodec");
                        zza(this.zzazb, this.zzaza, this.zzahd, (MediaCrypto) null);
                        zzow.endSection();
                        zzow.beginSection("startCodec");
                        this.zzaza.start();
                        zzow.endSection();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.zzazl = this.zzaza.getInputBuffers();
                        this.zzakl = this.zzaza.getOutputBuffers();
                    } catch (Exception e2) {
                        zza(new zzle(this.zzahd, (Throwable) e2, false, str2));
                    }
                    this.zzazm = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.zzazn = -1;
                    this.zzazo = -1;
                    this.zzazy = true;
                    this.zzazz.zzane++;
                }
            }
        }
    }

    private final void zza(zzle zzle) throws zzgq {
        throw zzgq.zza(zzle, getIndex());
    }

    /* access modifiers changed from: protected */
    public final MediaCodec zzhc() {
        return this.zzaza;
    }

    /* access modifiers changed from: protected */
    public final zzlc zzhd() {
        return this.zzazb;
    }

    /* access modifiers changed from: protected */
    public void zze(boolean z) throws zzgq {
        this.zzazz = new zziy();
    }

    /* access modifiers changed from: protected */
    public void zza(long j, boolean z) throws zzgq {
        this.zzazv = false;
        this.zzazw = false;
        if (this.zzaza != null) {
            this.zzazm = -9223372036854775807L;
            this.zzazn = -1;
            this.zzazo = -1;
            this.zzazy = true;
            this.zzazx = false;
            this.zzazp = false;
            this.zzayw.clear();
            this.zzazj = false;
            this.zzazk = false;
            if (this.zzazd || (this.zzazg && this.zzazu)) {
                zzhe();
                zzhb();
            } else if (this.zzazs != 0) {
                zzhe();
                zzhb();
            } else {
                this.zzaza.flush();
                this.zzazt = false;
            }
            if (this.zzazq && this.zzahd != null) {
                this.zzazr = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzeg() {
        this.zzahd = null;
        try {
            zzhe();
            try {
                if (this.zzayy != null) {
                    this.zzayr.zza(this.zzayy);
                }
                try {
                    if (!(this.zzayz == null || this.zzayz == this.zzayy)) {
                        this.zzayr.zza(this.zzayz);
                    }
                } finally {
                    this.zzayy = null;
                    this.zzayz = null;
                }
            } catch (Throwable th) {
                if (!(this.zzayz == null || this.zzayz == this.zzayy)) {
                    this.zzayr.zza(this.zzayz);
                }
                throw th;
            } finally {
                this.zzayy = null;
                this.zzayz = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.zzayz == null || this.zzayz == this.zzayy)) {
                    this.zzayr.zza(this.zzayz);
                }
                throw th2;
            } finally {
                this.zzayy = null;
                this.zzayz = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void zzhe() {
        this.zzazm = -9223372036854775807L;
        this.zzazn = -1;
        this.zzazo = -1;
        this.zzazx = false;
        this.zzazp = false;
        this.zzayw.clear();
        this.zzazl = null;
        this.zzakl = null;
        this.zzazb = null;
        this.zzazq = false;
        this.zzazt = false;
        this.zzazc = false;
        this.zzazd = false;
        this.zzaze = false;
        this.zzazf = false;
        this.zzazg = false;
        this.zzazi = false;
        this.zzazj = false;
        this.zzazk = false;
        this.zzazu = false;
        this.zzazr = 0;
        this.zzazs = 0;
        this.zzayt.zzcs = null;
        if (this.zzaza != null) {
            this.zzazz.zzanf++;
            try {
                this.zzaza.stop();
                try {
                    this.zzaza.release();
                    this.zzaza = null;
                    zzjd<zzjh> zzjd = this.zzayy;
                    if (zzjd != null && this.zzayz != zzjd) {
                        try {
                            this.zzayr.zza(zzjd);
                        } finally {
                            this.zzayy = null;
                        }
                    }
                } catch (Throwable th) {
                    this.zzaza = null;
                    zzjd<zzjh> zzjd2 = this.zzayy;
                    if (!(zzjd2 == null || this.zzayz == zzjd2)) {
                        this.zzayr.zza(zzjd2);
                    }
                    throw th;
                } finally {
                    this.zzayy = null;
                }
            } catch (Throwable th2) {
                this.zzaza = null;
                zzjd<zzjh> zzjd3 = this.zzayy;
                if (!(zzjd3 == null || this.zzayz == zzjd3)) {
                    try {
                        this.zzayr.zza(zzjd3);
                    } finally {
                        this.zzayy = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    public final void zzb(long j, long j2) throws zzgq {
        if (this.zzazw) {
            zzgd();
            return;
        }
        if (this.zzahd == null) {
            this.zzayu.clear();
            int zza = zza(this.zzayv, this.zzayu, true);
            if (zza == -5) {
                zzd(this.zzayv.zzahd);
            } else if (zza == -4) {
                zzoh.checkState(this.zzayu.zzgh());
                this.zzazv = true;
                zzhg();
                return;
            } else {
                return;
            }
        }
        zzhb();
        if (this.zzaza != null) {
            zzow.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzhf());
            zzow.endSection();
        } else {
            zzdn(j);
            this.zzayu.clear();
            int zza2 = zza(this.zzayv, this.zzayu, false);
            if (zza2 == -5) {
                zzd(this.zzayv.zzahd);
            } else if (zza2 == -4) {
                zzoh.checkState(this.zzayu.zzgh());
                this.zzazv = true;
                zzhg();
            }
        }
        this.zzazz.zzgm();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0149 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzhf() throws com.google.android.gms.internal.ads.zzgq {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.zzaza
            r1 = 0
            if (r0 == 0) goto L_0x01d4
            int r2 = r14.zzazs
            r3 = 2
            if (r2 == r3) goto L_0x01d4
            boolean r2 = r14.zzazv
            if (r2 == 0) goto L_0x0010
            goto L_0x01d4
        L_0x0010:
            int r2 = r14.zzazn
            if (r2 >= 0) goto L_0x002c
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.zzazn = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.google.android.gms.internal.ads.zzjb r2 = r14.zzayt
            java.nio.ByteBuffer[] r4 = r14.zzazl
            r0 = r4[r0]
            r2.zzcs = r0
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            r0.clear()
        L_0x002c:
            int r0 = r14.zzazs
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0049
            boolean r0 = r14.zzazf
            if (r0 != 0) goto L_0x0046
            r14.zzazu = r4
            android.media.MediaCodec r5 = r14.zzaza
            int r6 = r14.zzazn
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzazn = r2
        L_0x0046:
            r14.zzazs = r3
            return r1
        L_0x0049:
            boolean r0 = r14.zzazj
            if (r0 == 0) goto L_0x006b
            r14.zzazj = r1
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            java.nio.ByteBuffer r0 = r0.zzcs
            byte[] r1 = zzayp
            r0.put(r1)
            android.media.MediaCodec r5 = r14.zzaza
            int r6 = r14.zzazn
            r7 = 0
            byte[] r0 = zzayp
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzazn = r2
            r14.zzazt = r4
            return r4
        L_0x006b:
            boolean r0 = r14.zzazx
            if (r0 == 0) goto L_0x0072
            r0 = -4
            r5 = 0
            goto L_0x00aa
        L_0x0072:
            int r0 = r14.zzazr
            if (r0 != r4) goto L_0x0097
            r0 = 0
        L_0x0077:
            com.google.android.gms.internal.ads.zzhf r5 = r14.zzahd
            java.util.List<byte[]> r5 = r5.zzagk
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0095
            com.google.android.gms.internal.ads.zzhf r5 = r14.zzahd
            java.util.List<byte[]> r5 = r5.zzagk
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.zzjb r6 = r14.zzayt
            java.nio.ByteBuffer r6 = r6.zzcs
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0095:
            r14.zzazr = r3
        L_0x0097:
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            java.nio.ByteBuffer r0 = r0.zzcs
            int r0 = r0.position()
            com.google.android.gms.internal.ads.zzhh r5 = r14.zzayv
            com.google.android.gms.internal.ads.zzjb r6 = r14.zzayt
            int r5 = r14.zza((com.google.android.gms.internal.ads.zzhh) r5, (com.google.android.gms.internal.ads.zzjb) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00aa:
            r6 = -3
            if (r0 != r6) goto L_0x00ae
            return r1
        L_0x00ae:
            r6 = -5
            if (r0 != r6) goto L_0x00c4
            int r0 = r14.zzazr
            if (r0 != r3) goto L_0x00bc
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            r0.clear()
            r14.zzazr = r4
        L_0x00bc:
            com.google.android.gms.internal.ads.zzhh r0 = r14.zzayv
            com.google.android.gms.internal.ads.zzhf r0 = r0.zzahd
            r14.zzd(r0)
            return r4
        L_0x00c4:
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            boolean r0 = r0.zzgh()
            if (r0 == 0) goto L_0x0100
            int r0 = r14.zzazr
            if (r0 != r3) goto L_0x00d7
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            r0.clear()
            r14.zzazr = r4
        L_0x00d7:
            r14.zzazv = r4
            boolean r0 = r14.zzazt
            if (r0 != 0) goto L_0x00e1
            r14.zzhg()
            return r1
        L_0x00e1:
            boolean r0 = r14.zzazf     // Catch:{ CryptoException -> 0x00f6 }
            if (r0 != 0) goto L_0x00f5
            r14.zzazu = r4     // Catch:{ CryptoException -> 0x00f6 }
            android.media.MediaCodec r5 = r14.zzaza     // Catch:{ CryptoException -> 0x00f6 }
            int r6 = r14.zzazn     // Catch:{ CryptoException -> 0x00f6 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f6 }
            r14.zzazn = r2     // Catch:{ CryptoException -> 0x00f6 }
        L_0x00f5:
            return r1
        L_0x00f6:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzgq r0 = com.google.android.gms.internal.ads.zzgq.zza(r0, r1)
            throw r0
        L_0x0100:
            boolean r0 = r14.zzazy
            if (r0 == 0) goto L_0x0118
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            boolean r0 = r0.zzgi()
            if (r0 != 0) goto L_0x0118
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            r0.clear()
            int r0 = r14.zzazr
            if (r0 != r3) goto L_0x0117
            r14.zzazr = r4
        L_0x0117:
            return r4
        L_0x0118:
            r14.zzazy = r1
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt
            boolean r0 = r0.isEncrypted()
            com.google.android.gms.internal.ads.zzjd<com.google.android.gms.internal.ads.zzjh> r3 = r14.zzayy
            if (r3 == 0) goto L_0x0144
            int r3 = r3.getState()
            if (r3 == 0) goto L_0x0135
            r6 = 4
            if (r3 == r6) goto L_0x0144
            if (r0 != 0) goto L_0x0133
            boolean r3 = r14.zzays
            if (r3 != 0) goto L_0x0144
        L_0x0133:
            r3 = 1
            goto L_0x0145
        L_0x0135:
            com.google.android.gms.internal.ads.zzjd<com.google.android.gms.internal.ads.zzjh> r0 = r14.zzayy
            com.google.android.gms.internal.ads.zzjg r0 = r0.zzgo()
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzgq r0 = com.google.android.gms.internal.ads.zzgq.zza(r0, r1)
            throw r0
        L_0x0144:
            r3 = 0
        L_0x0145:
            r14.zzazx = r3
            if (r3 == 0) goto L_0x014a
            return r1
        L_0x014a:
            boolean r3 = r14.zzazc
            if (r3 == 0) goto L_0x0164
            if (r0 != 0) goto L_0x0164
            com.google.android.gms.internal.ads.zzjb r3 = r14.zzayt
            java.nio.ByteBuffer r3 = r3.zzcs
            com.google.android.gms.internal.ads.zzon.zzk(r3)
            com.google.android.gms.internal.ads.zzjb r3 = r14.zzayt
            java.nio.ByteBuffer r3 = r3.zzcs
            int r3 = r3.position()
            if (r3 != 0) goto L_0x0162
            return r4
        L_0x0162:
            r14.zzazc = r1
        L_0x0164:
            com.google.android.gms.internal.ads.zzjb r3 = r14.zzayt     // Catch:{ CryptoException -> 0x01ca }
            long r10 = r3.timeUs     // Catch:{ CryptoException -> 0x01ca }
            com.google.android.gms.internal.ads.zzjb r3 = r14.zzayt     // Catch:{ CryptoException -> 0x01ca }
            boolean r3 = r3.zzgg()     // Catch:{ CryptoException -> 0x01ca }
            if (r3 == 0) goto L_0x0179
            java.util.List<java.lang.Long> r3 = r14.zzayw     // Catch:{ CryptoException -> 0x01ca }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01ca }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01ca }
        L_0x0179:
            com.google.android.gms.internal.ads.zzjb r3 = r14.zzayt     // Catch:{ CryptoException -> 0x01ca }
            java.nio.ByteBuffer r3 = r3.zzcs     // Catch:{ CryptoException -> 0x01ca }
            r3.flip()     // Catch:{ CryptoException -> 0x01ca }
            com.google.android.gms.internal.ads.zzjb r3 = r14.zzayt     // Catch:{ CryptoException -> 0x01ca }
            r14.zza((com.google.android.gms.internal.ads.zzjb) r3)     // Catch:{ CryptoException -> 0x01ca }
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt     // Catch:{ CryptoException -> 0x01ca }
            com.google.android.gms.internal.ads.zzix r0 = r0.zzano     // Catch:{ CryptoException -> 0x01ca }
            android.media.MediaCodec$CryptoInfo r9 = r0.zzgl()     // Catch:{ CryptoException -> 0x01ca }
            if (r5 != 0) goto L_0x0192
            goto L_0x01a1
        L_0x0192:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01ca }
            if (r0 != 0) goto L_0x019a
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01ca }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01ca }
        L_0x019a:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01ca }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01ca }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01ca }
        L_0x01a1:
            android.media.MediaCodec r6 = r14.zzaza     // Catch:{ CryptoException -> 0x01ca }
            int r7 = r14.zzazn     // Catch:{ CryptoException -> 0x01ca }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01ca }
            goto L_0x01bc
        L_0x01ab:
            android.media.MediaCodec r6 = r14.zzaza     // Catch:{ CryptoException -> 0x01ca }
            int r7 = r14.zzazn     // Catch:{ CryptoException -> 0x01ca }
            r8 = 0
            com.google.android.gms.internal.ads.zzjb r0 = r14.zzayt     // Catch:{ CryptoException -> 0x01ca }
            java.nio.ByteBuffer r0 = r0.zzcs     // Catch:{ CryptoException -> 0x01ca }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01ca }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01ca }
        L_0x01bc:
            r14.zzazn = r2     // Catch:{ CryptoException -> 0x01ca }
            r14.zzazt = r4     // Catch:{ CryptoException -> 0x01ca }
            r14.zzazr = r1     // Catch:{ CryptoException -> 0x01ca }
            com.google.android.gms.internal.ads.zziy r0 = r14.zzazz     // Catch:{ CryptoException -> 0x01ca }
            int r1 = r0.zzang     // Catch:{ CryptoException -> 0x01ca }
            int r1 = r1 + r4
            r0.zzang = r1     // Catch:{ CryptoException -> 0x01ca }
            return r4
        L_0x01ca:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzgq r0 = com.google.android.gms.internal.ads.zzgq.zza(r0, r1)
            throw r0
        L_0x01d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlb.zzhf():boolean");
    }

    /* access modifiers changed from: protected */
    public void zzd(zzhf zzhf) throws zzgq {
        zzja zzja;
        MediaCodec mediaCodec;
        zzhf zzhf2 = this.zzahd;
        this.zzahd = zzhf;
        zzja zzja2 = zzhf.zzagl;
        if (zzhf2 == null) {
            zzja = null;
        } else {
            zzja = zzhf2.zzagl;
        }
        boolean zza = zzov.zza(zzja2, zzja);
        boolean z = true;
        if (!zza) {
            if (this.zzahd.zzagl != null) {
                zzjf<zzjh> zzjf = this.zzayr;
                if (zzjf != null) {
                    zzjd<zzjh> zza2 = zzjf.zza(Looper.myLooper(), this.zzahd.zzagl);
                    this.zzayz = zza2;
                    if (zza2 == this.zzayy) {
                        this.zzayr.zza(zza2);
                    }
                } else {
                    throw zzgq.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
            } else {
                this.zzayz = null;
            }
        }
        if (this.zzayz == this.zzayy && (mediaCodec = this.zzaza) != null && zza(mediaCodec, this.zzazb.zzbaa, zzhf2, this.zzahd)) {
            this.zzazq = true;
            this.zzazr = 1;
            if (!(this.zzaze && this.zzahd.width == zzhf2.width && this.zzahd.height == zzhf2.height)) {
                z = false;
            }
            this.zzazj = z;
        } else if (this.zzazt) {
            this.zzazs = 1;
        } else {
            zzhe();
            zzhb();
        }
    }

    public boolean zzfd() {
        return this.zzazw;
    }

    public boolean isReady() {
        if (this.zzahd == null || this.zzazx) {
            return false;
        }
        if (zzei() || this.zzazo >= 0) {
            return true;
        }
        return this.zzazm != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzazm;
    }

    private final boolean zzd(long j, long j2) throws zzgq {
        boolean z;
        boolean z2;
        if (this.zzazo < 0) {
            if (!this.zzazh || !this.zzazu) {
                this.zzazo = this.zzaza.dequeueOutputBuffer(this.zzayx, 0);
            } else {
                try {
                    this.zzazo = this.zzaza.dequeueOutputBuffer(this.zzayx, 0);
                } catch (IllegalStateException unused) {
                    zzhg();
                    if (this.zzazw) {
                        zzhe();
                    }
                    return false;
                }
            }
            int i = this.zzazo;
            if (i >= 0) {
                if (this.zzazk) {
                    this.zzazk = false;
                    this.zzaza.releaseOutputBuffer(i, false);
                    this.zzazo = -1;
                    return true;
                } else if ((this.zzayx.flags & 4) != 0) {
                    zzhg();
                    this.zzazo = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.zzakl[this.zzazo];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.zzayx.offset);
                        byteBuffer.limit(this.zzayx.offset + this.zzayx.size);
                    }
                    long j3 = this.zzayx.presentationTimeUs;
                    int size = this.zzayw.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z2 = false;
                            break;
                        } else if (this.zzayw.get(i2).longValue() == j3) {
                            this.zzayw.remove(i2);
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    this.zzazp = z2;
                }
            } else if (i == -2) {
                MediaFormat outputFormat = this.zzaza.getOutputFormat();
                if (this.zzaze && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.zzazk = true;
                } else {
                    if (this.zzazi) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    onOutputFormatChanged(this.zzaza, outputFormat);
                }
                return true;
            } else if (i == -3) {
                this.zzakl = this.zzaza.getOutputBuffers();
                return true;
            } else {
                if (this.zzazf && (this.zzazv || this.zzazs == 2)) {
                    zzhg();
                }
                return false;
            }
        }
        if (!this.zzazh || !this.zzazu) {
            MediaCodec mediaCodec = this.zzaza;
            ByteBuffer[] byteBufferArr = this.zzakl;
            int i3 = this.zzazo;
            z = zza(j, j2, mediaCodec, byteBufferArr[i3], i3, this.zzayx.flags, this.zzayx.presentationTimeUs, this.zzazp);
        } else {
            try {
                z = zza(j, j2, this.zzaza, this.zzakl[this.zzazo], this.zzazo, this.zzayx.flags, this.zzayx.presentationTimeUs, this.zzazp);
            } catch (IllegalStateException unused2) {
                zzhg();
                if (this.zzazw) {
                    zzhe();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.zzayx.presentationTimeUs;
        this.zzazo = -1;
        return true;
    }

    private final void zzhg() throws zzgq {
        if (this.zzazs == 2) {
            zzhe();
            zzhb();
            return;
        }
        this.zzazw = true;
        zzgd();
    }
}
