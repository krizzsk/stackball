package com.fyber.inneractive.sdk.player.p059c.p060a;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.C3220b;
import com.fyber.inneractive.sdk.player.p059c.C3296m;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.e */
public final class C3202e {

    /* renamed from: a */
    public static boolean f7961a = false;

    /* renamed from: b */
    public static boolean f7962b = false;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final ConditionVariable f7963A;

    /* renamed from: B */
    private final long[] f7964B;

    /* renamed from: C */
    private final LinkedList<C3211g> f7965C;

    /* renamed from: D */
    private AudioTrack f7966D;

    /* renamed from: E */
    private AudioTrack f7967E;

    /* renamed from: F */
    private C3296m f7968F;

    /* renamed from: G */
    private long f7969G;

    /* renamed from: H */
    private long f7970H;

    /* renamed from: I */
    private ByteBuffer f7971I;

    /* renamed from: J */
    private int f7972J;

    /* renamed from: K */
    private int f7973K;

    /* renamed from: L */
    private long f7974L;

    /* renamed from: M */
    private long f7975M;

    /* renamed from: N */
    private boolean f7976N;

    /* renamed from: O */
    private long f7977O;

    /* renamed from: P */
    private Method f7978P;

    /* renamed from: Q */
    private long f7979Q;

    /* renamed from: R */
    private long f7980R;

    /* renamed from: S */
    private long f7981S;

    /* renamed from: T */
    private long f7982T;

    /* renamed from: U */
    private int f7983U;

    /* renamed from: V */
    private long f7984V;

    /* renamed from: W */
    private long f7985W;

    /* renamed from: X */
    private long f7986X;

    /* renamed from: Y */
    private C3192c[] f7987Y;

    /* renamed from: Z */
    private ByteBuffer[] f7988Z;

    /* renamed from: aa */
    private ByteBuffer f7989aa;

    /* renamed from: ab */
    private ByteBuffer f7990ab;

    /* renamed from: ac */
    private byte[] f7991ac;

    /* renamed from: ad */
    private int f7992ad;

    /* renamed from: ae */
    private int f7993ae;

    /* renamed from: af */
    private boolean f7994af;

    /* renamed from: ag */
    private long f7995ag;

    /* renamed from: c */
    final C3191b f7996c = null;

    /* renamed from: d */
    final C3213f f7997d;

    /* renamed from: e */
    final C3192c[] f7998e;

    /* renamed from: f */
    final C3205a f7999f;

    /* renamed from: g */
    int f8000g;

    /* renamed from: h */
    int f8001h;

    /* renamed from: i */
    int f8002i;

    /* renamed from: j */
    int f8003j;

    /* renamed from: k */
    int f8004k;

    /* renamed from: l */
    boolean f8005l;

    /* renamed from: m */
    int f8006m;

    /* renamed from: n */
    long f8007n;

    /* renamed from: o */
    C3296m f8008o;

    /* renamed from: p */
    int f8009p;

    /* renamed from: q */
    int f8010q;

    /* renamed from: r */
    int f8011r;

    /* renamed from: s */
    int f8012s;

    /* renamed from: t */
    float f8013t;

    /* renamed from: u */
    boolean f8014u;

    /* renamed from: v */
    boolean f8015v;

    /* renamed from: w */
    int f8016w;

    /* renamed from: x */
    boolean f8017x;

    /* renamed from: y */
    private final C3219k f8018y;

    /* renamed from: z */
    private final C3210f f8019z;

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$f */
    public interface C3210f {
        /* renamed from: a */
        void mo18942a();

        /* renamed from: a */
        void mo18943a(int i);

        /* renamed from: a */
        void mo18944a(int i, long j, long j2);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$c */
    public static final class C3207c extends Exception {
        public C3207c(Throwable th) {
            super(th);
        }

        public C3207c(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$d */
    public static final class C3208d extends Exception {

        /* renamed from: a */
        public final int f8037a;

        public C3208d(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.f8037a = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$h */
    public static final class C3212h extends Exception {

        /* renamed from: a */
        public final int f8041a;

        public C3212h(int i) {
            super("AudioTrack write failed: " + i);
            this.f8041a = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$e */
    public static final class C3209e extends RuntimeException {
        public C3209e(String str) {
            super(str);
        }
    }

    public C3202e(C3192c[] cVarArr, C3210f fVar) {
        this.f8019z = fVar;
        this.f7963A = new ConditionVariable(true);
        if (C3560t.f9655a >= 18) {
            try {
                this.f7978P = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C3560t.f9655a >= 19) {
            this.f7999f = new C3206b();
        } else {
            this.f7999f = new C3205a((byte) 0);
        }
        this.f7997d = new C3213f();
        this.f8018y = new C3219k();
        C3192c[] cVarArr2 = new C3192c[(cVarArr.length + 3)];
        this.f7998e = cVarArr2;
        cVarArr2[0] = new C3217i();
        C3192c[] cVarArr3 = this.f7998e;
        cVarArr3[1] = this.f7997d;
        System.arraycopy(cVarArr, 0, cVarArr3, 2, cVarArr.length);
        this.f7998e[cVarArr.length + 2] = this.f8018y;
        this.f7964B = new long[10];
        this.f8013t = 1.0f;
        this.f8012s = 0;
        this.f8004k = 3;
        this.f8016w = 0;
        this.f8008o = C3296m.f8518a;
        this.f7993ae = -1;
        this.f7987Y = new C3192c[0];
        this.f7988Z = new ByteBuffer[0];
        this.f7965C = new LinkedList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18920a() {
        ArrayList arrayList = new ArrayList();
        for (C3192c cVar : this.f7998e) {
            if (cVar.mo18901a()) {
                arrayList.add(cVar);
            } else {
                cVar.mo18908g();
            }
        }
        int size = arrayList.size();
        this.f7987Y = (C3192c[]) arrayList.toArray(new C3192c[size]);
        this.f7988Z = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            C3192c cVar2 = this.f7987Y[i];
            cVar2.mo18908g();
            this.f7988Z[i] = cVar2.mo18906e();
        }
    }

    /* renamed from: b */
    public final void mo18923b() {
        this.f8015v = true;
        if (mo18929h()) {
            this.f7985W = System.nanoTime() / 1000;
            this.f7967E.play();
        }
    }

    /* renamed from: a */
    public final boolean mo18921a(ByteBuffer byteBuffer, long j) throws C3208d, C3212h {
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f7989aa;
        C3535a.m8782a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!mo18929h()) {
            this.f7963A.block();
            if (this.f8017x) {
                this.f7967E = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f8001h).setEncoding(this.f8003j).setSampleRate(this.f8000g).build(), this.f8006m, 1, this.f8016w);
            } else if (this.f8016w == 0) {
                this.f7967E = new AudioTrack(this.f8004k, this.f8000g, this.f8001h, this.f8003j, this.f8006m, 1);
            } else {
                this.f7967E = new AudioTrack(this.f8004k, this.f8000g, this.f8001h, this.f8003j, this.f8006m, 1, this.f8016w);
            }
            int state = this.f7967E.getState();
            if (state == 1) {
                int audioSessionId = this.f7967E.getAudioSessionId();
                if (f7961a && C3560t.f9655a < 21) {
                    AudioTrack audioTrack = this.f7966D;
                    if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                        mo18928g();
                    }
                    if (this.f7966D == null) {
                        AudioTrack audioTrack2 = r8;
                        AudioTrack audioTrack3 = new AudioTrack(this.f8004k, 4000, 4, 2, 2, 0, audioSessionId);
                        this.f7966D = audioTrack2;
                    }
                }
                if (this.f8016w != audioSessionId) {
                    this.f8016w = audioSessionId;
                    this.f8019z.mo18943a(audioSessionId);
                }
                this.f7999f.mo18936a(this.f7967E, m7742l());
                mo18926e();
                this.f7994af = false;
                if (this.f8015v) {
                    mo18923b();
                }
            } else {
                try {
                    this.f7967E.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f7967E = null;
                    throw th;
                }
                this.f7967E = null;
                throw new C3208d(state, this.f8000g, this.f8001h, this.f8006m);
            }
        }
        if (m7742l()) {
            if (this.f7967E.getPlayState() == 2) {
                this.f7994af = false;
                return false;
            } else if (this.f7967E.getPlayState() == 1 && this.f7999f.mo18937b() != 0) {
                return false;
            }
        }
        boolean z = this.f7994af;
        boolean d = mo18925d();
        this.f7994af = d;
        if (z && !d && this.f7967E.getPlayState() != 1) {
            this.f8019z.mo18944a(this.f8006m, C3220b.m7843a(this.f8007n), SystemClock.elapsedRealtime() - this.f7995ag);
        }
        if (this.f7989aa == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f8005l && this.f7983U == 0) {
                int i2 = this.f8003j;
                if (i2 == 7 || i2 == 8) {
                    i = C3214g.m7783a(byteBuffer);
                } else if (i2 == 5) {
                    i = C3189a.m7718a();
                } else if (i2 == 6) {
                    i = C3189a.m7720a(byteBuffer);
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i2);
                }
                this.f7983U = i;
            }
            if (this.f7968F != null) {
                if (!mo18924c()) {
                    return false;
                }
                this.f7965C.add(new C3211g(this.f7968F, Math.max(0, j2), mo18917a(mo18930i()), (byte) 0));
                this.f7968F = null;
                mo18920a();
            }
            if (this.f8012s == 0) {
                this.f7984V = Math.max(0, j2);
                this.f8012s = 1;
            } else {
                long a = this.f7984V + mo18917a(m7741k());
                if (this.f8012s == 1 && Math.abs(a - j2) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + a + ", got " + j2 + "]");
                    this.f8012s = 2;
                }
                if (this.f8012s == 2) {
                    this.f7984V += j2 - a;
                    this.f8012s = 1;
                    this.f8019z.mo18942a();
                }
            }
            if (this.f8005l) {
                this.f7980R += (long) this.f7983U;
            } else {
                this.f7979Q += (long) byteBuffer.remaining();
            }
            this.f7989aa = byteBuffer2;
        }
        if (this.f8005l) {
            m7738b(this.f7989aa, j2);
        } else {
            m7739c(j2);
        }
        if (this.f7989aa.hasRemaining()) {
            return false;
        }
        this.f7989aa = null;
        return true;
    }

    /* renamed from: c */
    private void m7739c(long j) throws C3212h {
        ByteBuffer byteBuffer;
        int length = this.f7987Y.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7988Z[i - 1];
            } else {
                byteBuffer = this.f7989aa;
                if (byteBuffer == null) {
                    byteBuffer = C3192c.f7942a;
                }
            }
            if (i == length) {
                m7738b(byteBuffer, j);
            } else {
                C3192c cVar = this.f7987Y[i];
                cVar.mo18900a(byteBuffer);
                ByteBuffer e = cVar.mo18906e();
                this.f7988Z[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7738b(java.nio.ByteBuffer r9, long r10) throws com.fyber.inneractive.sdk.player.p059c.p060a.C3202e.C3212h {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f7990ab
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8782a((boolean) r0)
            goto L_0x003b
        L_0x0018:
            r8.f7990ab = r9
            int r0 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.f7991ac
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.f7991ac = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.f7991ac
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f7992ad = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r4 >= r2) goto L_0x0079
            long r10 = r8.f7981S
            com.fyber.inneractive.sdk.player.c.a.e$a r2 = r8.f7999f
            long r4 = r2.mo18937b()
            int r2 = r8.f8011r
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r11 = (int) r10
            int r10 = r8.f8006m
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x0076
            int r10 = java.lang.Math.min(r0, r10)
            android.media.AudioTrack r11 = r8.f7967E
            byte[] r2 = r8.f7991ac
            int r4 = r8.f7992ad
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f0
            int r11 = r8.f7992ad
            int r11 = r11 + r10
            r8.f7992ad = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f0
        L_0x0076:
            r10 = 0
            goto L_0x00f0
        L_0x0079:
            boolean r2 = r8.f8017x
            if (r2 == 0) goto L_0x00ea
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r2)
            android.media.AudioTrack r2 = r8.f7967E
            java.nio.ByteBuffer r4 = r8.f7971I
            if (r4 != 0) goto L_0x00a7
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f7971I = r4
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f7971I
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a7:
            int r4 = r8.f8009p
            if (r4 != 0) goto L_0x00c3
            java.nio.ByteBuffer r4 = r8.f7971I
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f7971I
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f7971I
            r10.position(r3)
            r8.f8009p = r0
        L_0x00c3:
            java.nio.ByteBuffer r10 = r8.f7971I
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00da
            java.nio.ByteBuffer r11 = r8.f7971I
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d7
            r8.f8009p = r3
            r10 = r11
            goto L_0x00f0
        L_0x00d7:
            if (r11 >= r10) goto L_0x00da
            goto L_0x0076
        L_0x00da:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e3
            r8.f8009p = r3
            goto L_0x00e8
        L_0x00e3:
            int r10 = r8.f8009p
            int r10 = r10 - r9
            r8.f8009p = r10
        L_0x00e8:
            r10 = r9
            goto L_0x00f0
        L_0x00ea:
            android.media.AudioTrack r10 = r8.f7967E
            int r10 = r10.write(r9, r0, r1)
        L_0x00f0:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f7995ag = r4
            if (r10 < 0) goto L_0x0115
            boolean r9 = r8.f8005l
            if (r9 != 0) goto L_0x0102
            long r4 = r8.f7981S
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f7981S = r4
        L_0x0102:
            if (r10 != r0) goto L_0x0114
            boolean r9 = r8.f8005l
            if (r9 == 0) goto L_0x0110
            long r9 = r8.f7982T
            int r11 = r8.f7983U
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f7982T = r9
        L_0x0110:
            r9 = 0
            r8.f7990ab = r9
            return r1
        L_0x0114:
            return r3
        L_0x0115:
            com.fyber.inneractive.sdk.player.c.a.e$h r9 = new com.fyber.inneractive.sdk.player.c.a.e$h
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p060a.C3202e.m7738b(java.nio.ByteBuffer, long):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18924c() throws com.fyber.inneractive.sdk.player.p059c.p060a.C3202e.C3212h {
        /*
            r9 = this;
            int r0 = r9.f7993ae
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f8005l
            if (r0 == 0) goto L_0x000f
            com.fyber.inneractive.sdk.player.c.a.c[] r0 = r9.f7987Y
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f7993ae = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f7993ae
            com.fyber.inneractive.sdk.player.c.a.c[] r5 = r9.f7987Y
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo18905d()
        L_0x0028:
            r9.m7739c(r7)
            boolean r0 = r4.mo18907f()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f7993ae
            int r0 = r0 + r2
            r9.f7993ae = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f7990ab
            if (r0 == 0) goto L_0x0044
            r9.m7738b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7990ab
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f7993ae = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p060a.C3202e.mo18924c():boolean");
    }

    /* renamed from: d */
    public final boolean mo18925d() {
        if (mo18929h()) {
            if (mo18930i() <= this.f7999f.mo18937b()) {
                if (m7742l() && this.f7967E.getPlayState() == 2 && this.f7967E.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C3296m mo18919a(C3296m mVar) {
        if (this.f8005l) {
            C3296m mVar2 = C3296m.f8518a;
            this.f8008o = mVar2;
            return mVar2;
        }
        C3219k kVar = this.f8018y;
        kVar.f8093b = C3560t.m8869a(mVar.f8519b);
        float f = kVar.f8093b;
        C3219k kVar2 = this.f8018y;
        float f2 = mVar.f8520c;
        kVar2.f8094c = C3560t.m8869a(f2);
        C3296m mVar3 = new C3296m(f, f2);
        C3296m mVar4 = this.f7968F;
        if (mVar4 == null) {
            if (!this.f7965C.isEmpty()) {
                mVar4 = this.f7965C.getLast().f8038a;
            } else {
                mVar4 = this.f8008o;
            }
        }
        if (!mVar3.equals(mVar4)) {
            if (mo18929h()) {
                this.f7968F = mVar3;
            } else {
                this.f8008o = mVar3;
            }
        }
        return this.f8008o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo18926e() {
        if (!mo18929h()) {
            return;
        }
        if (C3560t.f9655a >= 21) {
            this.f7967E.setVolume(this.f8013t);
            return;
        }
        AudioTrack audioTrack = this.f7967E;
        float f = this.f8013t;
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: f */
    public final void mo18927f() {
        if (mo18929h()) {
            this.f7979Q = 0;
            this.f7980R = 0;
            this.f7981S = 0;
            this.f7982T = 0;
            this.f7983U = 0;
            C3296m mVar = this.f7968F;
            if (mVar != null) {
                this.f8008o = mVar;
                this.f7968F = null;
            } else if (!this.f7965C.isEmpty()) {
                this.f8008o = this.f7965C.getLast().f8038a;
            }
            this.f7965C.clear();
            this.f7969G = 0;
            this.f7970H = 0;
            this.f7989aa = null;
            this.f7990ab = null;
            int i = 0;
            while (true) {
                C3192c[] cVarArr = this.f7987Y;
                if (i >= cVarArr.length) {
                    break;
                }
                C3192c cVar = cVarArr[i];
                cVar.mo18908g();
                this.f7988Z[i] = cVar.mo18906e();
                i++;
            }
            this.f8014u = false;
            this.f7993ae = -1;
            this.f7971I = null;
            this.f8009p = 0;
            this.f8012s = 0;
            this.f7986X = 0;
            mo18931j();
            if (this.f7967E.getPlayState() == 3) {
                this.f7967E.pause();
            }
            final AudioTrack audioTrack = this.f7967E;
            this.f7967E = null;
            this.f7999f.mo18936a((AudioTrack) null, false);
            this.f7963A.close();
            new Thread() {
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        C3202e.this.f7963A.open();
                    }
                }
            }.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo18928g() {
        final AudioTrack audioTrack = this.f7966D;
        if (audioTrack != null) {
            this.f7966D = null;
            new Thread() {
                public final void run() {
                    audioTrack.release();
                }
            }.start();
        }
    }

    /* renamed from: d */
    private long m7740d(long j) {
        long j2;
        long j3;
        while (!this.f7965C.isEmpty() && j >= this.f7965C.getFirst().f8040c) {
            C3211g remove = this.f7965C.remove();
            this.f8008o = remove.f8038a;
            this.f7970H = remove.f8040c;
            this.f7969G = remove.f8039b - this.f7984V;
        }
        if (this.f8008o.f8519b == 1.0f) {
            return (j + this.f7969G) - this.f7970H;
        }
        if (!this.f7965C.isEmpty() || this.f8018y.f8096e < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = this.f7969G;
            j3 = (long) (((double) this.f8008o.f8519b) * ((double) (j - this.f7970H)));
        } else {
            j2 = this.f7969G;
            j3 = C3560t.m8877a(j - this.f7970H, this.f8018y.f8095d, this.f8018y.f8096e);
        }
        return j2 + j3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo18929h() {
        return this.f7967E != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo18917a(long j) {
        return (j * 1000000) / ((long) this.f8000g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo18922b(long j) {
        return (j * ((long) this.f8000g)) / 1000000;
    }

    /* renamed from: k */
    private long m7741k() {
        return this.f8005l ? this.f7980R : this.f7979Q / ((long) this.f8010q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final long mo18930i() {
        return this.f8005l ? this.f7982T : this.f7981S / ((long) this.f8011r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo18931j() {
        this.f7974L = 0;
        this.f7973K = 0;
        this.f7972J = 0;
        this.f7975M = 0;
        this.f7976N = false;
        this.f7977O = 0;
    }

    /* renamed from: l */
    private boolean m7742l() {
        if (C3560t.f9655a >= 23) {
            return false;
        }
        int i = this.f8003j;
        return i == 5 || i == 6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m7736a(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1095064472: goto L_0x002a;
                case 187078296: goto L_0x0020;
                case 1504578661: goto L_0x0016;
                case 1505942594: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 3
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x0045
            if (r5 == r4) goto L_0x0043
            if (r5 == r3) goto L_0x0041
            if (r5 == r2) goto L_0x003e
            return r1
        L_0x003e:
            r5 = 8
            return r5
        L_0x0041:
            r5 = 7
            return r5
        L_0x0043:
            r5 = 6
            return r5
        L_0x0045:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p060a.C3202e.m7736a(java.lang.String):int");
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$a */
    private static class C3205a {

        /* renamed from: a */
        protected AudioTrack f8024a;

        /* renamed from: b */
        private boolean f8025b;

        /* renamed from: c */
        private int f8026c;

        /* renamed from: d */
        private long f8027d;

        /* renamed from: e */
        private long f8028e;

        /* renamed from: f */
        private long f8029f;

        /* renamed from: g */
        private long f8030g;

        /* renamed from: h */
        private long f8031h;

        /* renamed from: i */
        private long f8032i;

        /* renamed from: d */
        public boolean mo18939d() {
            return false;
        }

        private C3205a() {
        }

        /* synthetic */ C3205a(byte b) {
            this();
        }

        /* renamed from: a */
        public void mo18936a(AudioTrack audioTrack, boolean z) {
            this.f8024a = audioTrack;
            this.f8025b = z;
            this.f8030g = -9223372036854775807L;
            this.f8027d = 0;
            this.f8028e = 0;
            this.f8029f = 0;
            if (audioTrack != null) {
                this.f8026c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: a */
        public final void mo18935a(long j) {
            this.f8031h = mo18937b();
            this.f8030g = SystemClock.elapsedRealtime() * 1000;
            this.f8032i = j;
            this.f8024a.stop();
        }

        /* renamed from: a */
        public final void mo18934a() {
            if (this.f8030g == -9223372036854775807L) {
                this.f8024a.pause();
            }
        }

        /* renamed from: b */
        public final long mo18937b() {
            if (this.f8030g != -9223372036854775807L) {
                return Math.min(this.f8032i, this.f8031h + ((((SystemClock.elapsedRealtime() * 1000) - this.f8030g) * ((long) this.f8026c)) / 1000000));
            }
            int playState = this.f8024a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = 4294967295L & ((long) this.f8024a.getPlaybackHeadPosition());
            if (this.f8025b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f8029f = this.f8027d;
                }
                playbackHeadPosition += this.f8029f;
            }
            if (this.f8027d > playbackHeadPosition) {
                this.f8028e++;
            }
            this.f8027d = playbackHeadPosition;
            return playbackHeadPosition + (this.f8028e << 32);
        }

        /* renamed from: c */
        public final long mo18938c() {
            return (mo18937b() * 1000000) / ((long) this.f8026c);
        }

        /* renamed from: e */
        public long mo18940e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public long mo18941f() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$b */
    private static class C3206b extends C3205a {

        /* renamed from: b */
        private final AudioTimestamp f8033b = new AudioTimestamp();

        /* renamed from: c */
        private long f8034c;

        /* renamed from: d */
        private long f8035d;

        /* renamed from: e */
        private long f8036e;

        public C3206b() {
            super((byte) 0);
        }

        /* renamed from: a */
        public final void mo18936a(AudioTrack audioTrack, boolean z) {
            super.mo18936a(audioTrack, z);
            this.f8034c = 0;
            this.f8035d = 0;
            this.f8036e = 0;
        }

        /* renamed from: d */
        public final boolean mo18939d() {
            boolean timestamp = this.f8024a.getTimestamp(this.f8033b);
            if (timestamp) {
                long j = this.f8033b.framePosition;
                if (this.f8035d > j) {
                    this.f8034c++;
                }
                this.f8035d = j;
                this.f8036e = j + (this.f8034c << 32);
            }
            return timestamp;
        }

        /* renamed from: e */
        public final long mo18940e() {
            return this.f8033b.nanoTime;
        }

        /* renamed from: f */
        public final long mo18941f() {
            return this.f8036e;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$g */
    private static final class C3211g {

        /* renamed from: a */
        final C3296m f8038a;

        /* renamed from: b */
        final long f8039b;

        /* renamed from: c */
        final long f8040c;

        /* synthetic */ C3211g(C3296m mVar, long j, long j2, byte b) {
            this(mVar, j, j2);
        }

        private C3211g(C3296m mVar, long j, long j2) {
            this.f8038a = mVar;
            this.f8039b = j;
            this.f8040c = j2;
        }
    }

    /* renamed from: a */
    public final long mo18918a(boolean z) {
        long j;
        if (!(mo18929h() && this.f8012s != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f7967E.getPlayState() == 3) {
            long c = this.f7999f.mo18938c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f7975M >= 30000) {
                    long[] jArr = this.f7964B;
                    int i = this.f7972J;
                    jArr[i] = c - nanoTime;
                    this.f7972J = (i + 1) % 10;
                    int i2 = this.f7973K;
                    if (i2 < 10) {
                        this.f7973K = i2 + 1;
                    }
                    this.f7975M = nanoTime;
                    this.f7974L = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f7973K;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f7974L += this.f7964B[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!m7742l() && nanoTime - this.f7977O >= 500000) {
                    boolean d = this.f7999f.mo18939d();
                    this.f7976N = d;
                    if (d) {
                        long e = this.f7999f.mo18940e() / 1000;
                        long f = this.f7999f.mo18941f();
                        if (e < this.f7985W) {
                            this.f7976N = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            String str = "Spurious audio timestamp (system clock mismatch): " + f + ", " + e + ", " + nanoTime + ", " + c + ", " + m7741k() + ", " + mo18930i();
                            if (!f7962b) {
                                Log.w("AudioTrack", str);
                                this.f7976N = false;
                            } else {
                                throw new C3209e(str);
                            }
                        } else if (Math.abs(mo18917a(f) - c) > 5000000) {
                            String str2 = "Spurious audio timestamp (frame position mismatch): " + f + ", " + e + ", " + nanoTime + ", " + c + ", " + m7741k() + ", " + mo18930i();
                            if (!f7962b) {
                                Log.w("AudioTrack", str2);
                                this.f7976N = false;
                            } else {
                                throw new C3209e(str2);
                            }
                        }
                    }
                    Method method = this.f7978P;
                    if (method != null && !this.f8005l) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f7967E, (Object[]) null)).intValue()) * 1000) - this.f8007n;
                            this.f7986X = intValue;
                            long max = Math.max(intValue, 0);
                            this.f7986X = max;
                            if (max > 5000000) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.f7986X);
                                this.f7986X = 0;
                            }
                        } catch (Exception unused) {
                            this.f7978P = null;
                        }
                    }
                    this.f7977O = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f7976N) {
            j = mo18917a(this.f7999f.mo18941f() + mo18922b(nanoTime2 - (this.f7999f.mo18940e() / 1000)));
        } else {
            if (this.f7973K == 0) {
                j = this.f7999f.mo18938c();
            } else {
                j = nanoTime2 + this.f7974L;
            }
            if (!z) {
                j -= this.f7986X;
            }
        }
        return this.f7984V + m7740d(j);
    }
}
