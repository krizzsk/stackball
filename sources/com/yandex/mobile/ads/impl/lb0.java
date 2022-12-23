package com.yandex.mobile.ads.impl;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.b51;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;

public final class lb0 implements e40 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final hw0 f36605a;

    /* renamed from: b */
    private final y21 f36606b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BufferedSource f36607c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BufferedSink f36608d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f36609e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final r90 f36610f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public q90 f36611g;

    /* renamed from: com.yandex.mobile.ads.impl.lb0$a */
    private abstract class C13842a implements Source {

        /* renamed from: b */
        private final ForwardingTimeout f36612b;

        /* renamed from: c */
        private boolean f36613c;

        /* renamed from: d */
        final /* synthetic */ lb0 f36614d;

        public C13842a(lb0 lb0) {
            Intrinsics.checkNotNullParameter(lb0, "this$0");
            this.f36614d = lb0;
            this.f36612b = new ForwardingTimeout(lb0.f36607c.timeout());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo68398a(boolean z) {
            this.f36613c = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo68399b() {
            return this.f36613c;
        }

        /* renamed from: c */
        public final void mo68400c() {
            if (this.f36614d.f36609e != 6) {
                if (this.f36614d.f36609e == 5) {
                    lb0.m38694a(this.f36614d, this.f36612b);
                    this.f36614d.f36609e = 6;
                    return;
                }
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(this.f36614d.f36609e)));
            }
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.checkNotNullParameter(buffer, "sink");
            try {
                return this.f36614d.f36607c.read(buffer, j);
            } catch (IOException e) {
                this.f36614d.mo66762d().mo70987j();
                mo68400c();
                throw e;
            }
        }

        public Timeout timeout() {
            return this.f36612b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb0$b */
    private final class C13843b implements Sink {

        /* renamed from: b */
        private final ForwardingTimeout f36615b;

        /* renamed from: c */
        private boolean f36616c;

        /* renamed from: d */
        final /* synthetic */ lb0 f36617d;

        public C13843b(lb0 lb0) {
            Intrinsics.checkNotNullParameter(lb0, "this$0");
            this.f36617d = lb0;
            this.f36615b = new ForwardingTimeout(lb0.f36608d.timeout());
        }

        public synchronized void close() {
            if (!this.f36616c) {
                this.f36616c = true;
                this.f36617d.f36608d.writeUtf8("0\r\n\r\n");
                lb0.m38694a(this.f36617d, this.f36615b);
                this.f36617d.f36609e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f36616c) {
                this.f36617d.f36608d.flush();
            }
        }

        public Timeout timeout() {
            return this.f36615b;
        }

        public void write(Buffer buffer, long j) {
            Intrinsics.checkNotNullParameter(buffer, "source");
            if (!(!this.f36616c)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                this.f36617d.f36608d.writeHexadecimalUnsignedLong(j);
                this.f36617d.f36608d.writeUtf8("\r\n");
                this.f36617d.f36608d.write(buffer, j);
                this.f36617d.f36608d.writeUtf8("\r\n");
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb0$c */
    private final class C13844c extends C13842a {

        /* renamed from: e */
        private final fc0 f36618e;

        /* renamed from: f */
        private long f36619f = -1;

        /* renamed from: g */
        private boolean f36620g = true;

        /* renamed from: h */
        final /* synthetic */ lb0 f36621h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13844c(lb0 lb0, fc0 fc0) {
            super(lb0);
            Intrinsics.checkNotNullParameter(lb0, "this$0");
            Intrinsics.checkNotNullParameter(fc0, "url");
            this.f36621h = lb0;
            this.f36618e = fc0;
        }

        public void close() {
            if (!mo68399b()) {
                if (this.f36620g && !jh1.m37831a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    this.f36621h.mo66762d().mo70987j();
                    mo68400c();
                }
                mo68398a(true);
            }
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.checkNotNullParameter(buffer, "sink");
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!mo68399b())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f36620g) {
                return -1;
            } else {
                long j2 = this.f36619f;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        this.f36621h.f36607c.readUtf8LineStrict();
                    }
                    try {
                        this.f36619f = this.f36621h.f36607c.readHexadecimalUnsignedLong();
                        String readUtf8LineStrict = this.f36621h.f36607c.readUtf8LineStrict();
                        if (readUtf8LineStrict != null) {
                            String obj = StringsKt.trim((CharSequence) readUtf8LineStrict).toString();
                            if (this.f36619f >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || StringsKt.startsWith$default(obj, ";", false, 2, (Object) null)) {
                                    if (this.f36619f == 0) {
                                        this.f36620g = false;
                                        lb0 lb0 = this.f36621h;
                                        lb0.f36611g = lb0.f36610f.mo69705a();
                                        hw0 a = this.f36621h.f36605a;
                                        Intrinsics.checkNotNull(a);
                                        C12979ei h = a.mo67650h();
                                        fc0 fc0 = this.f36618e;
                                        q90 f = this.f36621h.f36611g;
                                        Intrinsics.checkNotNull(f);
                                        yb0.m44241a(h, fc0, f);
                                        mo68400c();
                                    }
                                    if (!this.f36620g) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f36619f + obj + Typography.quote);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long read = super.read(buffer, Math.min(j, this.f36619f));
                if (read != -1) {
                    this.f36619f -= read;
                    return read;
                }
                this.f36621h.mo66762d().mo70987j();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo68400c();
                throw protocolException;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb0$d */
    private final class C13845d extends C13842a {

        /* renamed from: e */
        private long f36622e;

        /* renamed from: f */
        final /* synthetic */ lb0 f36623f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13845d(lb0 lb0, long j) {
            super(lb0);
            Intrinsics.checkNotNullParameter(lb0, "this$0");
            this.f36623f = lb0;
            this.f36622e = j;
            if (j == 0) {
                mo68400c();
            }
        }

        public void close() {
            if (!mo68399b()) {
                if (this.f36622e != 0 && !jh1.m37831a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    this.f36623f.mo66762d().mo70987j();
                    mo68400c();
                }
                mo68398a(true);
            }
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.checkNotNullParameter(buffer, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (true ^ mo68399b()) {
                long j2 = this.f36622e;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(buffer, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.f36622e - read;
                    this.f36622e = j3;
                    if (j3 == 0) {
                        mo68400c();
                    }
                    return read;
                }
                this.f36623f.mo66762d().mo70987j();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo68400c();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb0$e */
    private final class C13846e implements Sink {

        /* renamed from: b */
        private final ForwardingTimeout f36624b;

        /* renamed from: c */
        private boolean f36625c;

        /* renamed from: d */
        final /* synthetic */ lb0 f36626d;

        public C13846e(lb0 lb0) {
            Intrinsics.checkNotNullParameter(lb0, "this$0");
            this.f36626d = lb0;
            this.f36624b = new ForwardingTimeout(lb0.f36608d.timeout());
        }

        public void close() {
            if (!this.f36625c) {
                this.f36625c = true;
                lb0.m38694a(this.f36626d, this.f36624b);
                this.f36626d.f36609e = 3;
            }
        }

        public void flush() {
            if (!this.f36625c) {
                this.f36626d.f36608d.flush();
            }
        }

        public Timeout timeout() {
            return this.f36624b;
        }

        public void write(Buffer buffer, long j) {
            Intrinsics.checkNotNullParameter(buffer, "source");
            if (!this.f36625c) {
                jh1.m37825a(buffer.size(), 0, j);
                this.f36626d.f36608d.write(buffer, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb0$f */
    private final class C13847f extends C13842a {

        /* renamed from: e */
        private boolean f36627e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13847f(lb0 lb0) {
            super(lb0);
            Intrinsics.checkNotNullParameter(lb0, "this$0");
        }

        public void close() {
            if (!mo68399b()) {
                if (!this.f36627e) {
                    mo68400c();
                }
                mo68398a(true);
            }
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.checkNotNullParameter(buffer, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!mo68399b())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f36627e) {
                return -1;
            } else {
                long read = super.read(buffer, j);
                if (read != -1) {
                    return read;
                }
                this.f36627e = true;
                mo68400c();
                return -1;
            }
        }
    }

    public lb0(hw0 hw0, y21 y21, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(y21, "connection");
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        Intrinsics.checkNotNullParameter(bufferedSink, "sink");
        this.f36605a = hw0;
        this.f36606b = y21;
        this.f36607c = bufferedSource;
        this.f36608d = bufferedSink;
        this.f36610f = new r90(bufferedSource);
    }

    /* renamed from: a */
    public static final void m38694a(lb0 lb0, ForwardingTimeout forwardingTimeout) {
        lb0.getClass();
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* renamed from: b */
    public long mo66759b(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        if (!yb0.m44243a(b51)) {
            return 0;
        }
        if (StringsKt.equals("chunked", b51.m34138a(b51, HttpHeaders.TRANSFER_ENCODING, (String) null, 2), true)) {
            return -1;
        }
        return jh1.m37815a(b51);
    }

    /* renamed from: c */
    public void mo66761c() {
        this.f36608d.flush();
    }

    /* renamed from: d */
    public y21 mo66762d() {
        return this.f36606b;
    }

    /* renamed from: c */
    public final void mo68397c(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        long a = jh1.m37815a(b51);
        if (a != -1) {
            Source a2 = m38691a(a);
            jh1.m37836b(a2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            ((C13845d) a2).close();
        }
    }

    /* renamed from: b */
    public void mo66760b() {
        this.f36608d.flush();
    }

    /* renamed from: a */
    public void mo66757a() {
        this.f36606b.mo70972a();
    }

    /* renamed from: a */
    public void mo66758a(m41 m41) {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        Proxy.Type type = this.f36606b.mo70988k().mo68141b().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        Intrinsics.checkNotNullParameter(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(m41.mo68567f());
        sb.append(' ');
        if (!m41.mo68566e() && type == Proxy.Type.HTTP) {
            sb.append(m41.mo68568g());
        } else {
            fc0 g = m41.mo68568g();
            Intrinsics.checkNotNullParameter(g, "url");
            String c = g.mo66953c();
            String e = g.mo66955e();
            if (e != null) {
                c = c + '?' + e;
            }
            sb.append(c);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        mo68396a(m41.mo68565d(), sb2);
    }

    /* renamed from: a */
    public Sink mo66755a(m41 m41, long j) {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        if (m41.mo68561a() != null) {
            m41.mo68561a().getClass();
        }
        boolean z = true;
        if (StringsKt.equals("chunked", m41.mo68562a(HttpHeaders.TRANSFER_ENCODING), true)) {
            int i = this.f36609e;
            if (i != 1) {
                z = false;
            }
            if (z) {
                this.f36609e = 2;
                return new C13843b(this);
            }
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        } else if (j != -1) {
            int i2 = this.f36609e;
            if (i2 != 1) {
                z = false;
            }
            if (z) {
                this.f36609e = 2;
                return new C13846e(this);
            }
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i2)).toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: a */
    public Source mo66756a(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        if (!yb0.m44243a(b51)) {
            return m38691a(0);
        }
        boolean z = true;
        if (StringsKt.equals("chunked", b51.m34138a(b51, HttpHeaders.TRANSFER_ENCODING, (String) null, 2), true)) {
            fc0 g = b51.mo65988o().mo68568g();
            int i = this.f36609e;
            if (i != 4) {
                z = false;
            }
            if (z) {
                this.f36609e = 5;
                return new C13844c(this, g);
            }
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        long a = jh1.m37815a(b51);
        if (a != -1) {
            return m38691a(a);
        }
        int i2 = this.f36609e;
        if (i2 != 4) {
            z = false;
        }
        if (z) {
            this.f36609e = 5;
            this.f36606b.mo70987j();
            return new C13847f(this);
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i2)).toString());
    }

    /* renamed from: a */
    public final void mo68396a(q90 q90, String str) {
        Intrinsics.checkNotNullParameter(q90, "headers");
        Intrinsics.checkNotNullParameter(str, "requestLine");
        int i = this.f36609e;
        int i2 = 0;
        if (i == 0) {
            this.f36608d.writeUtf8(str).writeUtf8("\r\n");
            int size = q90.size();
            if (size > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    this.f36608d.writeUtf8(q90.mo69509a(i2)).writeUtf8(": ").writeUtf8(q90.mo69511b(i2)).writeUtf8("\r\n");
                    if (i3 >= size) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f36608d.writeUtf8("\r\n");
            this.f36609e = 1;
            return;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: a */
    public b51.C12571a mo66754a(boolean z) {
        int i = this.f36609e;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                jb1 a = jb1.f35211d.mo67962a(this.f36610f.mo69706b());
                b51.C12571a a2 = new b51.C12571a().mo65998a(a.f35212a).mo65991a(a.f35213b).mo65999a(a.f35214c).mo65997a(this.f36610f.mo69705a());
                if (z && a.f35213b == 100) {
                    return null;
                }
                if (a.f35213b == 100) {
                    this.f36609e = 3;
                    return a2;
                }
                this.f36609e = 4;
                return a2;
            } catch (EOFException e) {
                throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", this.f36606b.mo70988k().mo68140a().mo69885k().mo66963k()), e);
            }
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
    }

    /* renamed from: a */
    private final Source m38691a(long j) {
        int i = this.f36609e;
        if (i == 4) {
            this.f36609e = 5;
            return new C13845d(this, j);
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
    }
}
