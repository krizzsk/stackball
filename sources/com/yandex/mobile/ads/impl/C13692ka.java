package com.yandex.mobile.ads.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.yandex.mobile.ads.impl.ka */
final class C13692ka {

    /* renamed from: a */
    private final C13693a f36062a;

    /* renamed from: b */
    private int f36063b;

    /* renamed from: c */
    private long f36064c;

    /* renamed from: d */
    private long f36065d;

    /* renamed from: e */
    private long f36066e;

    /* renamed from: f */
    private long f36067f;

    /* renamed from: com.yandex.mobile.ads.impl.ka$a */
    private static final class C13693a {

        /* renamed from: a */
        private final AudioTrack f36068a;

        /* renamed from: b */
        private final AudioTimestamp f36069b = new AudioTimestamp();

        /* renamed from: c */
        private long f36070c;

        /* renamed from: d */
        private long f36071d;

        /* renamed from: e */
        private long f36072e;

        public C13693a(AudioTrack audioTrack) {
            this.f36068a = audioTrack;
        }

        /* renamed from: a */
        public long mo68185a() {
            return this.f36072e;
        }

        /* renamed from: b */
        public long mo68186b() {
            return this.f36069b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean mo68187c() {
            boolean timestamp = this.f36068a.getTimestamp(this.f36069b);
            if (timestamp) {
                long j = this.f36069b.framePosition;
                if (this.f36071d > j) {
                    this.f36070c++;
                }
                this.f36071d = j;
                this.f36072e = j + (this.f36070c << 32);
            }
            return timestamp;
        }
    }

    public C13692ka(AudioTrack audioTrack) {
        if (ih1.f34858a >= 19) {
            this.f36062a = new C13693a(audioTrack);
            mo68184f();
            return;
        }
        this.f36062a = null;
        m38261a(3);
    }

    /* renamed from: a */
    public boolean mo68179a(long j) {
        C13693a aVar = this.f36062a;
        if (aVar == null || j - this.f36066e < this.f36065d) {
            return false;
        }
        this.f36066e = j;
        boolean c = aVar.mo68187c();
        int i = this.f36063b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        mo68184f();
                    }
                } else if (!c) {
                    mo68184f();
                }
            } else if (!c) {
                mo68184f();
            } else if (this.f36062a.mo68185a() > this.f36067f) {
                m38261a(2);
            }
        } else if (c) {
            if (this.f36062a.mo68186b() < this.f36064c) {
                return false;
            }
            this.f36067f = this.f36062a.mo68185a();
            m38261a(1);
        } else if (j - this.f36064c > 500000) {
            m38261a(3);
        }
        return c;
    }

    /* renamed from: b */
    public long mo68180b() {
        C13693a aVar = this.f36062a;
        if (aVar != null) {
            return aVar.mo68185a();
        }
        return -1;
    }

    /* renamed from: c */
    public long mo68181c() {
        C13693a aVar = this.f36062a;
        if (aVar != null) {
            return aVar.mo68186b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean mo68182d() {
        return this.f36063b == 2;
    }

    /* renamed from: e */
    public void mo68183e() {
        m38261a(4);
    }

    /* renamed from: f */
    public void mo68184f() {
        if (this.f36062a != null) {
            m38261a(0);
        }
    }

    /* renamed from: a */
    public void mo68178a() {
        if (this.f36063b == 4) {
            mo68184f();
        }
    }

    /* renamed from: a */
    private void m38261a(int i) {
        this.f36063b = i;
        if (i == 0) {
            this.f36066e = 0;
            this.f36067f = -1;
            this.f36064c = System.nanoTime() / 1000;
            this.f36065d = TapjoyConstants.TIMER_INCREMENT;
        } else if (i == 1) {
            this.f36065d = TapjoyConstants.TIMER_INCREMENT;
        } else if (i == 2 || i == 3) {
            this.f36065d = 10000000;
        } else if (i == 4) {
            this.f36065d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
