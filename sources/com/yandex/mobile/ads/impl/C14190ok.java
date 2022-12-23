package com.yandex.mobile.ads.impl;

import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C6603C;
import com.yandex.mobile.ads.exo.C12263o;
import com.yandex.mobile.ads.exo.trackselection.C12333e;

/* renamed from: com.yandex.mobile.ads.impl.ok */
public class C14190ok {

    /* renamed from: a */
    private final C15174xj f38243a;

    /* renamed from: b */
    private final long f38244b;

    /* renamed from: c */
    private final long f38245c;

    /* renamed from: d */
    private final long f38246d;

    /* renamed from: e */
    private final long f38247e;

    /* renamed from: f */
    private final long f38248f;

    /* renamed from: g */
    private final int f38249g;

    /* renamed from: h */
    private final boolean f38250h;

    /* renamed from: i */
    private final long f38251i;

    /* renamed from: j */
    private final boolean f38252j;

    /* renamed from: k */
    private int f38253k;

    /* renamed from: l */
    private boolean f38254l;

    /* renamed from: m */
    private boolean f38255m;

    public C14190ok() {
        this(new C15174xj(true, 65536));
    }

    /* renamed from: a */
    public C13477j7 mo69184a() {
        return this.f38243a;
    }

    /* renamed from: b */
    public long mo69188b() {
        return this.f38251i;
    }

    /* renamed from: c */
    public void mo69189c() {
        m40427a(false);
    }

    /* renamed from: d */
    public void mo69190d() {
        m40427a(true);
    }

    /* renamed from: e */
    public void mo69191e() {
        m40427a(true);
    }

    /* renamed from: f */
    public boolean mo69192f() {
        return this.f38252j;
    }

    @Deprecated
    public C14190ok(C15174xj xjVar) {
        this(xjVar, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    /* renamed from: a */
    public boolean mo69186a(long j, float f) {
        boolean z = true;
        boolean z2 = this.f38243a.mo70904c() >= this.f38253k;
        long j2 = this.f38255m ? this.f38245c : this.f38244b;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i > 0) {
            int i2 = ih1.f34858a;
            if (i != 0) {
                j2 = Math.round(((double) j2) * ((double) f));
            }
            j2 = Math.min(j2, this.f38246d);
        }
        if (j < j2) {
            if (!this.f38250h && z2) {
                z = false;
            }
            this.f38254l = z;
        } else if (j >= this.f38246d || z2) {
            this.f38254l = false;
        }
        return this.f38254l;
    }

    protected C14190ok(C15174xj xjVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, boolean z2) {
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i7;
        m40426a(i10, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        m40426a(i11, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        m40426a(i, i10, "minBufferAudioMs", "bufferForPlaybackMs");
        m40426a(i8, i10, "minBufferVideoMs", "bufferForPlaybackMs");
        m40426a(i, i11, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        m40426a(i8, i11, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        m40426a(i9, i, "maxBufferMs", "minBufferAudioMs");
        m40426a(i9, i8, "maxBufferMs", "minBufferVideoMs");
        m40426a(i12, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f38243a = xjVar;
        this.f38244b = C12874dd.m35212a((long) i);
        this.f38245c = C12874dd.m35212a((long) i8);
        this.f38246d = C12874dd.m35212a((long) i9);
        this.f38247e = C12874dd.m35212a((long) i10);
        this.f38248f = C12874dd.m35212a((long) i11);
        this.f38249g = i6;
        this.f38250h = z;
        this.f38251i = C12874dd.m35212a((long) i12);
        this.f38252j = z2;
    }

    /* renamed from: a */
    public boolean mo69187a(long j, float f, boolean z) {
        int i = ih1.f34858a;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        long j2 = z ? this.f38248f : this.f38247e;
        return j2 <= 0 || j >= j2 || (!this.f38250h && this.f38243a.mo70904c() >= this.f38253k);
    }

    /* renamed from: a */
    private void m40427a(boolean z) {
        this.f38253k = 0;
        this.f38254l = false;
        if (z) {
            this.f38243a.mo70905d();
        }
    }

    /* renamed from: a */
    public void mo69185a(C12263o[] oVarArr, C12333e eVar) {
        boolean z;
        int i;
        int i2 = 0;
        while (true) {
            if (i2 < oVarArr.length) {
                if (oVarArr[i2].mo64820o() == 2 && eVar.mo65401a(i2) != null) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        this.f38255m = z;
        int i3 = this.f38249g;
        if (i3 == -1) {
            i3 = 0;
            for (int i4 = 0; i4 < oVarArr.length; i4++) {
                if (eVar.mo65401a(i4) != null) {
                    switch (oVarArr[i4].mo64820o()) {
                        case 0:
                            i = 36438016;
                            break;
                        case 1:
                            i = C6603C.DEFAULT_AUDIO_BUFFER_SIZE;
                            break;
                        case 2:
                            i = 32768000;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            i = 131072;
                            break;
                        case 6:
                            i = 0;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    i3 += i;
                }
            }
        }
        this.f38253k = i3;
        this.f38243a.mo70900a(i3);
    }

    /* renamed from: a */
    private static void m40426a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C13479j9.m37706a(z, str + " cannot be less than " + str2);
    }
}
