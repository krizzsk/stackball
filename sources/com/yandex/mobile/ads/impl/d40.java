package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.referrer.Payload;
import com.facebook.share.internal.ShareConstants;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.yandex.mobile.ads.impl.b51;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

public final class d40 {

    /* renamed from: a */
    private final x21 f32364a;

    /* renamed from: b */
    private final b40 f32365b;

    /* renamed from: c */
    private final f40 f32366c;

    /* renamed from: d */
    private final e40 f32367d;

    /* renamed from: e */
    private boolean f32368e;

    /* renamed from: f */
    private final y21 f32369f;

    /* renamed from: com.yandex.mobile.ads.impl.d40$a */
    private final class C12851a extends ForwardingSink {

        /* renamed from: b */
        private final long f32370b;

        /* renamed from: c */
        private boolean f32371c;

        /* renamed from: d */
        private long f32372d;

        /* renamed from: e */
        private boolean f32373e;

        /* renamed from: f */
        final /* synthetic */ d40 f32374f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12851a(d40 d40, Sink sink, long j) {
            super(sink);
            Intrinsics.checkNotNullParameter(d40, "this$0");
            Intrinsics.checkNotNullParameter(sink, "delegate");
            this.f32374f = d40;
            this.f32370b = j;
        }

        /* renamed from: a */
        private final <E extends IOException> E m35007a(E e) {
            if (this.f32371c) {
                return e;
            }
            this.f32371c = true;
            return this.f32374f.mo66405a(this.f32372d, false, true, e);
        }

        public void close() throws IOException {
            if (!this.f32373e) {
                this.f32373e = true;
                long j = this.f32370b;
                if (j == -1 || this.f32372d == j) {
                    try {
                        super.close();
                        m35007a((IOException) null);
                    } catch (IOException e) {
                        throw m35007a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m35007a(e);
            }
        }

        public void write(Buffer buffer, long j) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "source");
            if (!this.f32373e) {
                long j2 = this.f32370b;
                if (j2 == -1 || this.f32372d + j <= j2) {
                    try {
                        super.write(buffer, j);
                        this.f32372d += j;
                    } catch (IOException e) {
                        throw m35007a(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f32370b + " bytes but received " + (this.f32372d + j));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.d40$b */
    public final class C12852b extends ForwardingSource {

        /* renamed from: b */
        private final long f32375b;

        /* renamed from: c */
        private long f32376c;

        /* renamed from: d */
        private boolean f32377d = true;

        /* renamed from: e */
        private boolean f32378e;

        /* renamed from: f */
        private boolean f32379f;

        /* renamed from: g */
        final /* synthetic */ d40 f32380g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12852b(d40 d40, Source source, long j) {
            super(source);
            Intrinsics.checkNotNullParameter(d40, "this$0");
            Intrinsics.checkNotNullParameter(source, "delegate");
            this.f32380g = d40;
            this.f32375b = j;
            if (j == 0) {
                mo66425a((IOException) null);
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E mo66425a(E e) {
            if (this.f32378e) {
                return e;
            }
            this.f32378e = true;
            if (e == null && this.f32377d) {
                this.f32377d = false;
                b40 g = this.f32380g.mo66415g();
                x21 e2 = this.f32380g.mo66413e();
                g.getClass();
                Intrinsics.checkNotNullParameter(e2, NotificationCompat.CATEGORY_CALL);
            }
            return this.f32380g.mo66405a(this.f32376c, true, false, e);
        }

        public void close() throws IOException {
            if (!this.f32379f) {
                this.f32379f = true;
                try {
                    super.close();
                    mo66425a((IOException) null);
                } catch (IOException e) {
                    throw mo66425a(e);
                }
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "sink");
            if (!this.f32379f) {
                try {
                    long read = delegate().read(buffer, j);
                    if (this.f32377d) {
                        this.f32377d = false;
                        b40 g = this.f32380g.mo66415g();
                        x21 e = this.f32380g.mo66413e();
                        g.getClass();
                        Intrinsics.checkNotNullParameter(e, NotificationCompat.CATEGORY_CALL);
                    }
                    if (read == -1) {
                        mo66425a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f32376c + read;
                    long j3 = this.f32375b;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f32375b + " bytes but received " + j2);
                        }
                    }
                    this.f32376c = j2;
                    if (j2 == j3) {
                        mo66425a((IOException) null);
                    }
                    return read;
                } catch (IOException e2) {
                    throw mo66425a(e2);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public d40(x21 x21, b40 b40, f40 f40, e40 e40) {
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(b40, "eventListener");
        Intrinsics.checkNotNullParameter(f40, "finder");
        Intrinsics.checkNotNullParameter(e40, MediaFile.CODEC);
        this.f32364a = x21;
        this.f32365b = b40;
        this.f32366c = f40;
        this.f32367d = e40;
        this.f32369f = e40.mo66762d();
    }

    /* renamed from: a */
    public final void mo66408a(m41 m41) throws IOException {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        try {
            b40 b40 = this.f32365b;
            x21 x21 = this.f32364a;
            b40.getClass();
            Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
            this.f32367d.mo66758a(m41);
            b40 b402 = this.f32365b;
            x21 x212 = this.f32364a;
            b402.getClass();
            Intrinsics.checkNotNullParameter(x212, NotificationCompat.CATEGORY_CALL);
            Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        } catch (IOException e) {
            this.f32365b.mo65965a((C12380ae) this.f32364a, e);
            this.f32366c.mo66917a(e);
            this.f32367d.mo66762d().mo70975a(this.f32364a, e);
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo66410b(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        b40 b40 = this.f32365b;
        x21 x21 = this.f32364a;
        b40.getClass();
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
    }

    /* renamed from: c */
    public final void mo66411c() throws IOException {
        try {
            this.f32367d.mo66760b();
        } catch (IOException e) {
            this.f32365b.mo65965a((C12380ae) this.f32364a, e);
            this.f32366c.mo66917a(e);
            this.f32367d.mo66762d().mo70975a(this.f32364a, e);
            throw e;
        }
    }

    /* renamed from: d */
    public final void mo66412d() throws IOException {
        try {
            this.f32367d.mo66761c();
        } catch (IOException e) {
            this.f32365b.mo65965a((C12380ae) this.f32364a, e);
            this.f32366c.mo66917a(e);
            this.f32367d.mo66762d().mo70975a(this.f32364a, e);
            throw e;
        }
    }

    /* renamed from: e */
    public final x21 mo66413e() {
        return this.f32364a;
    }

    /* renamed from: f */
    public final y21 mo66414f() {
        return this.f32369f;
    }

    /* renamed from: g */
    public final b40 mo66415g() {
        return this.f32365b;
    }

    /* renamed from: h */
    public final f40 mo66416h() {
        return this.f32366c;
    }

    /* renamed from: i */
    public final boolean mo66417i() {
        return !Intrinsics.areEqual((Object) this.f32366c.mo66916a().mo69885k().mo66958g(), (Object) this.f32369f.mo70988k().mo68140a().mo69885k().mo66958g());
    }

    /* renamed from: j */
    public final boolean mo66418j() {
        return this.f32368e;
    }

    /* renamed from: k */
    public final void mo66419k() {
        this.f32367d.mo66762d().mo70987j();
    }

    /* renamed from: l */
    public final void mo66420l() {
        this.f32364a.mo70792a(this, true, false, null);
    }

    /* renamed from: m */
    public final void mo66421m() {
        b40 b40 = this.f32365b;
        x21 x21 = this.f32364a;
        b40.getClass();
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: b */
    public final void mo66409b() {
        this.f32367d.mo66757a();
        this.f32364a.mo70792a(this, true, true, null);
    }

    /* renamed from: a */
    public final Sink mo66406a(m41 m41, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        this.f32368e = z;
        o41 a = m41.mo68561a();
        Intrinsics.checkNotNull(a);
        long a2 = a.mo68888a();
        b40 b40 = this.f32365b;
        x21 x21 = this.f32364a;
        b40.getClass();
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        return new C12851a(this, this.f32367d.mo66755a(m41, a2), a2);
    }

    /* renamed from: a */
    public final b51.C12571a mo66403a(boolean z) throws IOException {
        try {
            b51.C12571a a = this.f32367d.mo66754a(z);
            if (a != null) {
                a.mo66002a(this);
            }
            return a;
        } catch (IOException e) {
            this.f32365b.mo65966b(this.f32364a, e);
            this.f32366c.mo66917a(e);
            this.f32367d.mo66762d().mo70975a(this.f32364a, e);
            throw e;
        }
    }

    /* renamed from: a */
    public final e51 mo66404a(b51 b51) throws IOException {
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        try {
            String a = b51.m34138a(b51, "Content-Type", (String) null, 2);
            long b = this.f32367d.mo66759b(b51);
            return new d31(a, b, Okio.buffer((Source) new C12852b(this, this.f32367d.mo66756a(b51), b)));
        } catch (IOException e) {
            this.f32365b.mo65966b(this.f32364a, e);
            this.f32366c.mo66917a(e);
            this.f32367d.mo66762d().mo70975a(this.f32364a, e);
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo66407a() {
        this.f32367d.mo66757a();
    }

    /* renamed from: a */
    public final <E extends IOException> E mo66405a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            this.f32366c.mo66917a((IOException) e);
            this.f32367d.mo66762d().mo70975a(this.f32364a, (IOException) e);
        }
        if (z2) {
            if (e != null) {
                this.f32365b.mo65965a((C12380ae) this.f32364a, (IOException) e);
            } else {
                b40 b40 = this.f32365b;
                x21 x21 = this.f32364a;
                b40.getClass();
                Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
            }
        }
        if (z) {
            if (e != null) {
                this.f32365b.mo65966b(this.f32364a, e);
            } else {
                b40 b402 = this.f32365b;
                x21 x212 = this.f32364a;
                b402.getClass();
                Intrinsics.checkNotNullParameter(x212, NotificationCompat.CATEGORY_CALL);
            }
        }
        return this.f32364a.mo70792a(this, z2, z, e);
    }
}
