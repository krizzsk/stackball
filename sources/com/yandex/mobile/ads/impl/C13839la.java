package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: com.yandex.mobile.ads.impl.la */
final class C13839la {

    /* renamed from: A */
    private long f36568A;

    /* renamed from: B */
    private boolean f36569B;

    /* renamed from: C */
    private long f36570C;

    /* renamed from: D */
    private long f36571D;

    /* renamed from: a */
    private final C13840a f36572a;

    /* renamed from: b */
    private final long[] f36573b;

    /* renamed from: c */
    private AudioTrack f36574c;

    /* renamed from: d */
    private int f36575d;

    /* renamed from: e */
    private int f36576e;

    /* renamed from: f */
    private C13692ka f36577f;

    /* renamed from: g */
    private int f36578g;

    /* renamed from: h */
    private boolean f36579h;

    /* renamed from: i */
    private long f36580i;

    /* renamed from: j */
    private long f36581j;

    /* renamed from: k */
    private long f36582k;

    /* renamed from: l */
    private Method f36583l;

    /* renamed from: m */
    private long f36584m;

    /* renamed from: n */
    private boolean f36585n;

    /* renamed from: o */
    private boolean f36586o;

    /* renamed from: p */
    private long f36587p;

    /* renamed from: q */
    private long f36588q;

    /* renamed from: r */
    private long f36589r;

    /* renamed from: s */
    private long f36590s;

    /* renamed from: t */
    private int f36591t;

    /* renamed from: u */
    private int f36592u;

    /* renamed from: v */
    private long f36593v;

    /* renamed from: w */
    private long f36594w;

    /* renamed from: x */
    private long f36595x;

    /* renamed from: y */
    private long f36596y;

    /* renamed from: z */
    private long f36597z;

    /* renamed from: com.yandex.mobile.ads.impl.la$a */
    public interface C13840a {
        /* renamed from: a */
        void mo68389a(int i, long j);

        /* renamed from: a */
        void mo68390a(long j);

        /* renamed from: a */
        void mo68391a(long j, long j2, long j3, long j4);

        /* renamed from: b */
        void mo68392b(long j, long j2, long j3, long j4);
    }

    public C13839la(C13840a aVar) {
        this.f36572a = (C13840a) C13479j9.m37703a(aVar);
        if (ih1.f34858a >= 18) {
            try {
                this.f36583l = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f36573b = new long[10];
    }

    /* renamed from: a */
    public void mo68379a(AudioTrack audioTrack, int i, int i2, int i3) {
        this.f36574c = audioTrack;
        this.f36575d = i2;
        this.f36576e = i3;
        this.f36577f = new C13692ka(audioTrack);
        this.f36578g = audioTrack.getSampleRate();
        this.f36579h = ih1.f34858a < 23 && (i == 5 || i == 6);
        boolean d = ih1.m37396d(i);
        this.f36586o = d;
        this.f36580i = d ? m38667a((long) (i3 / i2)) : -9223372036854775807L;
        this.f36588q = 0;
        this.f36589r = 0;
        this.f36590s = 0;
        this.f36585n = false;
        this.f36593v = -9223372036854775807L;
        this.f36594w = -9223372036854775807L;
        this.f36587p = 0;
        this.f36584m = 0;
    }

    /* renamed from: b */
    public boolean mo68381b() {
        AudioTrack audioTrack = this.f36574c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: c */
    public void mo68382c(long j) {
        this.f36595x = m38666a();
        this.f36593v = SystemClock.elapsedRealtime() * 1000;
        this.f36596y = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo68385d(long r6) {
        /*
            r5 = this;
            long r0 = r5.m38666a()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0029
            boolean r6 = r5.f36579h
            if (r6 == 0) goto L_0x0026
            android.media.AudioTrack r6 = r5.f36574c
            r6.getClass()
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L_0x0026
            long r6 = r5.m38666a()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 == 0) goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13839la.mo68385d(long):boolean");
    }

    /* renamed from: e */
    public boolean mo68386e(long j) {
        return this.f36594w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f36594w >= 200;
    }

    /* renamed from: f */
    public void mo68387f() {
        C13692ka kaVar = this.f36577f;
        kaVar.getClass();
        kaVar.mo68184f();
    }

    /* renamed from: e */
    private void m38668e() {
        this.f36581j = 0;
        this.f36592u = 0;
        this.f36591t = 0;
        this.f36582k = 0;
        this.f36568A = 0;
        this.f36571D = 0;
    }

    /* renamed from: b */
    public int mo68380b(long j) {
        return this.f36576e - ((int) (j - (m38666a() * ((long) this.f36575d))));
    }

    /* renamed from: c */
    public boolean mo68383c() {
        m38668e();
        if (this.f36593v != -9223372036854775807L) {
            return false;
        }
        C13692ka kaVar = this.f36577f;
        kaVar.getClass();
        kaVar.mo68184f();
        return true;
    }

    /* renamed from: f */
    public boolean mo68388f(long j) {
        C13840a aVar;
        AudioTrack audioTrack = this.f36574c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f36579h) {
            if (playState == 2) {
                this.f36585n = false;
                return false;
            } else if (playState == 1 && m38666a() == 0) {
                return false;
            }
        }
        boolean z = this.f36585n;
        boolean d = mo68385d(j);
        this.f36585n = d;
        if (z && !d && playState != 1 && (aVar = this.f36572a) != null) {
            aVar.mo68389a(this.f36576e, C12874dd.m35213b(this.f36580i));
        }
        return true;
    }

    /* renamed from: d */
    public void mo68384d() {
        m38668e();
        this.f36574c = null;
        this.f36577f = null;
    }

    /* renamed from: a */
    public long mo68378a(boolean z) {
        long j;
        Method method;
        AudioTrack audioTrack = this.f36574c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long a = m38667a(m38666a());
            if (a != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f36582k >= 30000) {
                    long[] jArr = this.f36573b;
                    int i = this.f36591t;
                    jArr[i] = a - nanoTime;
                    this.f36591t = (i + 1) % 10;
                    int i2 = this.f36592u;
                    if (i2 < 10) {
                        this.f36592u = i2 + 1;
                    }
                    this.f36582k = nanoTime;
                    this.f36581j = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f36592u;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f36581j += this.f36573b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!this.f36579h) {
                    C13692ka kaVar = this.f36577f;
                    kaVar.getClass();
                    if (kaVar.mo68179a(nanoTime)) {
                        long c = kaVar.mo68181c();
                        long b = kaVar.mo68180b();
                        if (Math.abs(c - nanoTime) > 5000000) {
                            this.f36572a.mo68392b(b, c, nanoTime, a);
                            kaVar.mo68183e();
                        } else if (Math.abs(m38667a(b) - a) > 5000000) {
                            this.f36572a.mo68391a(b, c, nanoTime, a);
                            kaVar.mo68183e();
                        } else {
                            kaVar.mo68178a();
                        }
                    }
                    if (this.f36586o && (method = this.f36583l) != null && nanoTime - this.f36587p >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f36574c;
                            audioTrack2.getClass();
                            int i5 = ih1.f34858a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - this.f36580i;
                            this.f36584m = intValue;
                            long max = Math.max(intValue, 0);
                            this.f36584m = max;
                            if (max > 5000000) {
                                this.f36572a.mo68390a(max);
                                this.f36584m = 0;
                            }
                        } catch (Exception unused) {
                            this.f36583l = null;
                        }
                        this.f36587p = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        C13692ka kaVar2 = this.f36577f;
        kaVar2.getClass();
        boolean d = kaVar2.mo68182d();
        if (d) {
            j = m38667a(kaVar2.mo68180b()) + (nanoTime2 - kaVar2.mo68181c());
        } else {
            if (this.f36592u == 0) {
                j = m38667a(m38666a());
            } else {
                j = this.f36581j + nanoTime2;
            }
            if (!z) {
                j = Math.max(0, j - this.f36584m);
            }
        }
        if (this.f36569B != d) {
            this.f36571D = this.f36568A;
            this.f36570C = this.f36597z;
        }
        long j2 = nanoTime2 - this.f36571D;
        if (j2 < 1000000) {
            long j3 = this.f36570C + j2;
            long j4 = (j2 * 1000) / 1000000;
            j = ((j * j4) + ((1000 - j4) * j3)) / 1000;
        }
        this.f36568A = nanoTime2;
        this.f36597z = j;
        this.f36569B = d;
        return j;
    }

    /* renamed from: a */
    private long m38667a(long j) {
        return (j * 1000000) / ((long) this.f36578g);
    }

    /* renamed from: a */
    private long m38666a() {
        AudioTrack audioTrack = this.f36574c;
        audioTrack.getClass();
        if (this.f36593v != -9223372036854775807L) {
            return Math.min(this.f36596y, this.f36595x + ((((SystemClock.elapsedRealtime() * 1000) - this.f36593v) * ((long) this.f36578g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f36579h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f36590s = this.f36588q;
            }
            playbackHeadPosition += this.f36590s;
        }
        if (ih1.f34858a <= 29) {
            if (playbackHeadPosition == 0 && this.f36588q > 0 && playState == 3) {
                if (this.f36594w == -9223372036854775807L) {
                    this.f36594w = SystemClock.elapsedRealtime();
                }
                return this.f36588q;
            }
            this.f36594w = -9223372036854775807L;
        }
        if (this.f36588q > playbackHeadPosition) {
            this.f36589r++;
        }
        this.f36588q = playbackHeadPosition;
        return playbackHeadPosition + (this.f36589r << 32);
    }
}
