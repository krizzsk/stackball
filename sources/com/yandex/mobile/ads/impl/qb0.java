package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sa0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

public final class qb0 implements Closeable {

    /* renamed from: f */
    public static final C14375a f39072f = new C14375a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Logger f39073g;

    /* renamed from: b */
    private final BufferedSource f39074b;

    /* renamed from: c */
    private final boolean f39075c;

    /* renamed from: d */
    private final C14376b f39076d;

    /* renamed from: e */
    private final sa0.C14574a f39077e;

    /* renamed from: com.yandex.mobile.ads.impl.qb0$a */
    public static final class C14375a {
        private C14375a() {
        }

        public /* synthetic */ C14375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo69569a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qb0$b */
    public static final class C14376b implements Source {

        /* renamed from: b */
        private final BufferedSource f39078b;

        /* renamed from: c */
        private int f39079c;

        /* renamed from: d */
        private int f39080d;

        /* renamed from: e */
        private int f39081e;

        /* renamed from: f */
        private int f39082f;

        /* renamed from: g */
        private int f39083g;

        public C14376b(BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "source");
            this.f39078b = bufferedSource;
        }

        /* renamed from: a */
        public final void mo69570a(int i) {
            this.f39080d = i;
        }

        /* renamed from: b */
        public final int mo69571b() {
            return this.f39082f;
        }

        /* renamed from: c */
        public final void mo69573c(int i) {
            this.f39079c = i;
        }

        public void close() throws IOException {
        }

        /* renamed from: d */
        public final void mo69574d(int i) {
            this.f39083g = i;
        }

        /* renamed from: e */
        public final void mo69575e(int i) {
            this.f39081e = i;
        }

        public long read(Buffer buffer, long j) throws IOException {
            int i;
            int readInt;
            Intrinsics.checkNotNullParameter(buffer, "sink");
            do {
                int i2 = this.f39082f;
                if (i2 == 0) {
                    this.f39078b.skip((long) this.f39083g);
                    this.f39083g = 0;
                    if ((this.f39080d & 4) != 0) {
                        return -1;
                    }
                    i = this.f39081e;
                    int a = jh1.m37814a(this.f39078b);
                    this.f39082f = a;
                    this.f39079c = a;
                    byte readByte = this.f39078b.readByte() & 255;
                    this.f39080d = this.f39078b.readByte() & 255;
                    C14375a aVar = qb0.f39072f;
                    if (qb0.f39073g.isLoggable(Level.FINE)) {
                        qb0.f39073g.fine(mb0.f37283a.mo68639a(true, this.f39081e, this.f39079c, readByte, this.f39080d));
                    }
                    readInt = this.f39078b.readInt() & Integer.MAX_VALUE;
                    this.f39081e = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long read = this.f39078b.read(buffer, Math.min(j, (long) i2));
                    if (read == -1) {
                        return -1;
                    }
                    this.f39082f -= (int) read;
                    return read;
                }
            } while (readInt == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public Timeout timeout() {
            return this.f39078b.timeout();
        }

        /* renamed from: b */
        public final void mo69572b(int i) {
            this.f39082f = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qb0$c */
    public interface C14377c {
        /* renamed from: a */
        void mo69013a();

        /* renamed from: a */
        void mo69014a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo69015a(int i, int i2, List<o90> list) throws IOException;

        /* renamed from: a */
        void mo69016a(int i, long j);

        /* renamed from: a */
        void mo69017a(int i, o30 o30);

        /* renamed from: a */
        void mo69018a(int i, o30 o30, ByteString byteString);

        /* renamed from: a */
        void mo69019a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo69020a(boolean z, int i, int i2, List<o90> list);

        /* renamed from: a */
        void mo69021a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* renamed from: a */
        void mo69022a(boolean z, e81 e81);
    }

    static {
        Logger logger = Logger.getLogger(mb0.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f39073g = logger;
    }

    public qb0(BufferedSource bufferedSource, boolean z) {
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        this.f39074b = bufferedSource;
        this.f39075c = z;
        C14376b bVar = new C14376b(bufferedSource);
        this.f39076d = bVar;
        this.f39077e = new sa0.C14574a(bVar, 4096, 0, 4);
    }

    /* renamed from: a */
    public final void mo69566a(C14377c cVar) throws IOException {
        Intrinsics.checkNotNullParameter(cVar, "handler");
        if (!this.f39075c) {
            BufferedSource bufferedSource = this.f39074b;
            ByteString byteString = mb0.f37284b;
            ByteString readByteString = bufferedSource.readByteString((long) byteString.size());
            Logger logger = f39073g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(jh1.m37820a(Intrinsics.stringPlus("<< CONNECTION ", readByteString.hex()), new Object[0]));
            }
            if (!Intrinsics.areEqual((Object) byteString, (Object) readByteString)) {
                throw new IOException(Intrinsics.stringPlus("Expected a connection header but was ", readByteString.utf8()));
            }
        } else if (!mo69567a(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public void close() throws IOException {
        this.f39074b.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01df, code lost:
        throw new java.io.IOException(kotlin.jvm.internal.Intrinsics.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", java.lang.Integer.valueOf(r13)));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo69567a(boolean r17, com.yandex.mobile.ads.impl.qb0.C14377c r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            okio.BufferedSource r3 = r0.f39074b     // Catch:{ EOFException -> 0x0336 }
            r4 = 9
            r3.require(r4)     // Catch:{ EOFException -> 0x0336 }
            okio.BufferedSource r3 = r0.f39074b
            int r3 = com.yandex.mobile.ads.impl.jh1.m37814a((okio.BufferedSource) r3)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r10) goto L_0x0326
            okio.BufferedSource r4 = r0.f39074b
            byte r4 = r4.readByte()
            r11 = r4 & 255(0xff, float:3.57E-43)
            okio.BufferedSource r4 = r0.f39074b
            byte r4 = r4.readByte()
            r12 = r4 & 255(0xff, float:3.57E-43)
            okio.BufferedSource r4 = r0.f39074b
            int r4 = r4.readInt()
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = r4 & r13
            java.util.logging.Logger r15 = f39073g
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r15.isLoggable(r4)
            if (r4 == 0) goto L_0x004e
            com.yandex.mobile.ads.impl.mb0 r4 = com.yandex.mobile.ads.impl.mb0.f37283a
            r5 = 1
            r6 = r14
            r7 = r3
            r8 = r11
            r9 = r12
            java.lang.String r4 = r4.mo68639a(r5, r6, r7, r8, r9)
            r15.fine(r4)
        L_0x004e:
            r4 = 4
            if (r17 == 0) goto L_0x0066
            if (r11 != r4) goto L_0x0054
            goto L_0x0066
        L_0x0054:
            java.io.IOException r1 = new java.io.IOException
            com.yandex.mobile.ads.impl.mb0 r2 = com.yandex.mobile.ads.impl.mb0.f37283a
            java.lang.String r2 = r2.mo68638a(r11)
            java.lang.String r3 = "Expected a SETTINGS frame but was "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0066:
            r5 = 0
            r6 = 5
            r7 = 8
            r8 = 1
            switch(r11) {
                case 0: goto L_0x02e3;
                case 1: goto L_0x02ac;
                case 2: goto L_0x027f;
                case 3: goto L_0x0220;
                case 4: goto L_0x016e;
                case 5: goto L_0x013f;
                case 6: goto L_0x010d;
                case 7: goto L_0x00a8;
                case 8: goto L_0x0076;
                default: goto L_0x006e;
            }
        L_0x006e:
            okio.BufferedSource r1 = r0.f39074b
            long r2 = (long) r3
            r1.skip(r2)
            goto L_0x0325
        L_0x0076:
            if (r3 != r4) goto L_0x0098
            okio.BufferedSource r2 = r0.f39074b
            int r2 = r2.readInt()
            byte[] r3 = com.yandex.mobile.ads.impl.jh1.f35305a
            long r2 = (long) r2
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = r2 & r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0090
            r1.mo69016a((int) r14, (long) r2)
            goto L_0x0325
        L_0x0090:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "windowSizeIncrement was 0"
            r1.<init>(r2)
            throw r1
        L_0x0098:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x00a8:
            if (r3 < r7) goto L_0x00fd
            if (r14 != 0) goto L_0x00f5
            okio.BufferedSource r4 = r0.f39074b
            int r4 = r4.readInt()
            okio.BufferedSource r6 = r0.f39074b
            int r6 = r6.readInt()
            int r3 = r3 - r7
            com.yandex.mobile.ads.impl.o30[] r7 = com.yandex.mobile.ads.impl.o30.values()
            int r9 = r7.length
            r10 = 0
        L_0x00bf:
            if (r10 >= r9) goto L_0x00d3
            r11 = r7[r10]
            int r12 = r11.mo69100a()
            if (r12 != r6) goto L_0x00cb
            r12 = 1
            goto L_0x00cc
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            if (r12 == 0) goto L_0x00d0
            r5 = r11
            goto L_0x00d3
        L_0x00d0:
            int r10 = r10 + 1
            goto L_0x00bf
        L_0x00d3:
            if (r5 == 0) goto L_0x00e5
            okio.ByteString r2 = okio.ByteString.EMPTY
            if (r3 <= 0) goto L_0x00e0
            okio.BufferedSource r2 = r0.f39074b
            long r6 = (long) r3
            okio.ByteString r2 = r2.readByteString(r6)
        L_0x00e0:
            r1.mo69018a((int) r4, (com.yandex.mobile.ads.impl.o30) r5, (okio.ByteString) r2)
            goto L_0x0325
        L_0x00e5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.String r3 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x00f5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x00fd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "TYPE_GOAWAY length < 8: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x010d:
            if (r3 != r7) goto L_0x012f
            if (r14 != 0) goto L_0x0127
            okio.BufferedSource r3 = r0.f39074b
            int r3 = r3.readInt()
            okio.BufferedSource r4 = r0.f39074b
            int r4 = r4.readInt()
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0122
            r2 = 1
        L_0x0122:
            r1.mo69019a((boolean) r2, (int) r3, (int) r4)
            goto L_0x0325
        L_0x0127:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x012f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "TYPE_PING length != 8: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x013f:
            if (r14 == 0) goto L_0x0166
            r5 = r12 & 8
            if (r5 == 0) goto L_0x014f
            okio.BufferedSource r2 = r0.f39074b
            byte r2 = r2.readByte()
            byte[] r5 = com.yandex.mobile.ads.impl.jh1.f35305a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x014f:
            okio.BufferedSource r5 = r0.f39074b
            int r5 = r5.readInt()
            r5 = r5 & r13
            com.yandex.mobile.ads.impl.qb0$a r6 = f39072f
            int r3 = r3 - r4
            int r3 = r6.mo69569a(r3, r12, r2)
            java.util.List r2 = r0.m41164a(r3, r2, r12, r14)
            r1.mo69015a((int) r14, (int) r5, (java.util.List<com.yandex.mobile.ads.impl.o90>) r2)
            goto L_0x0325
        L_0x0166:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x016e:
            if (r14 != 0) goto L_0x0218
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0183
            if (r3 != 0) goto L_0x017b
            r18.mo69013a()
            goto L_0x0325
        L_0x017b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r1.<init>(r2)
            throw r1
        L_0x0183:
            int r5 = r3 % 6
            if (r5 != 0) goto L_0x0208
            com.yandex.mobile.ads.impl.e81 r5 = new com.yandex.mobile.ads.impl.e81
            r5.<init>()
            kotlin.ranges.IntRange r3 = kotlin.ranges.RangesKt.until((int) r2, (int) r3)
            r7 = 6
            kotlin.ranges.IntProgression r3 = kotlin.ranges.RangesKt.step((kotlin.ranges.IntProgression) r3, (int) r7)
            int r7 = r3.getFirst()
            int r9 = r3.getLast()
            int r3 = r3.getStep()
            if (r3 <= 0) goto L_0x01a5
            if (r7 <= r9) goto L_0x01a9
        L_0x01a5:
            if (r3 >= 0) goto L_0x0203
            if (r9 > r7) goto L_0x0203
        L_0x01a9:
            int r11 = r7 + r3
            okio.BufferedSource r12 = r0.f39074b
            short r12 = r12.readShort()
            byte[] r13 = com.yandex.mobile.ads.impl.jh1.f35305a
            r13 = 65535(0xffff, float:9.1834E-41)
            r12 = r12 & r13
            okio.BufferedSource r13 = r0.f39074b
            int r13 = r13.readInt()
            r14 = 2
            if (r12 == r14) goto L_0x01ee
            r14 = 3
            if (r12 == r14) goto L_0x01ec
            if (r12 == r4) goto L_0x01e0
            if (r12 == r6) goto L_0x01c8
            goto L_0x01fb
        L_0x01c8:
            if (r13 < r10) goto L_0x01d0
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            if (r13 > r14) goto L_0x01d0
            goto L_0x01fb
        L_0x01d0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.String r3 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x01e0:
            r12 = 7
            if (r13 < 0) goto L_0x01e4
            goto L_0x01fb
        L_0x01e4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            r12 = 4
            goto L_0x01fb
        L_0x01ee:
            if (r13 == 0) goto L_0x01fb
            if (r13 != r8) goto L_0x01f3
            goto L_0x01fb
        L_0x01f3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r1.<init>(r2)
            throw r1
        L_0x01fb:
            r5.mo66778a(r12, r13)
            if (r7 != r9) goto L_0x0201
            goto L_0x0203
        L_0x0201:
            r7 = r11
            goto L_0x01a9
        L_0x0203:
            r1.mo69022a((boolean) r2, (com.yandex.mobile.ads.impl.e81) r5)
            goto L_0x0325
        L_0x0208:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0218:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x0220:
            if (r3 != r4) goto L_0x0263
            if (r14 == 0) goto L_0x025b
            okio.BufferedSource r3 = r0.f39074b
            int r3 = r3.readInt()
            com.yandex.mobile.ads.impl.o30[] r4 = com.yandex.mobile.ads.impl.o30.values()
            int r6 = r4.length
            r7 = 0
        L_0x0230:
            if (r7 >= r6) goto L_0x0244
            r9 = r4[r7]
            int r10 = r9.mo69100a()
            if (r10 != r3) goto L_0x023c
            r10 = 1
            goto L_0x023d
        L_0x023c:
            r10 = 0
        L_0x023d:
            if (r10 == 0) goto L_0x0241
            r5 = r9
            goto L_0x0244
        L_0x0241:
            int r7 = r7 + 1
            goto L_0x0230
        L_0x0244:
            if (r5 == 0) goto L_0x024b
            r1.mo69017a((int) r14, (com.yandex.mobile.ads.impl.o30) r5)
            goto L_0x0325
        L_0x024b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x025b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0263:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "TYPE_RST_STREAM length: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " != 4"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x027f:
            if (r3 != r6) goto L_0x0290
            if (r14 == 0) goto L_0x0288
            r0.m41165a((com.yandex.mobile.ads.impl.qb0.C14377c) r1, (int) r14)
            goto L_0x0325
        L_0x0288:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0290:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "TYPE_PRIORITY length: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " != 5"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02ac:
            if (r14 == 0) goto L_0x02db
            r4 = r12 & 1
            if (r4 == 0) goto L_0x02b4
            r4 = 1
            goto L_0x02b5
        L_0x02b4:
            r4 = 0
        L_0x02b5:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x02c3
            okio.BufferedSource r2 = r0.f39074b
            byte r2 = r2.readByte()
            byte[] r5 = com.yandex.mobile.ads.impl.jh1.f35305a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x02c3:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x02cc
            r0.m41165a((com.yandex.mobile.ads.impl.qb0.C14377c) r1, (int) r14)
            int r3 = r3 + -5
        L_0x02cc:
            com.yandex.mobile.ads.impl.qb0$a r5 = f39072f
            int r3 = r5.mo69569a(r3, r12, r2)
            java.util.List r2 = r0.m41164a(r3, r2, r12, r14)
            r3 = -1
            r1.mo69020a((boolean) r4, (int) r14, (int) r3, (java.util.List<com.yandex.mobile.ads.impl.o90>) r2)
            goto L_0x0325
        L_0x02db:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x02e3:
            if (r14 == 0) goto L_0x031d
            r4 = r12 & 1
            if (r4 == 0) goto L_0x02eb
            r4 = 1
            goto L_0x02ec
        L_0x02eb:
            r4 = 0
        L_0x02ec:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x02f2
            r5 = 1
            goto L_0x02f3
        L_0x02f2:
            r5 = 0
        L_0x02f3:
            if (r5 != 0) goto L_0x0315
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0303
            okio.BufferedSource r2 = r0.f39074b
            byte r2 = r2.readByte()
            byte[] r5 = com.yandex.mobile.ads.impl.jh1.f35305a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0303:
            com.yandex.mobile.ads.impl.qb0$a r5 = f39072f
            int r3 = r5.mo69569a(r3, r12, r2)
            okio.BufferedSource r5 = r0.f39074b
            r1.mo69021a((boolean) r4, (int) r14, (okio.BufferedSource) r5, (int) r3)
            okio.BufferedSource r1 = r0.f39074b
            long r2 = (long) r2
            r1.skip(r2)
            goto L_0x0325
        L_0x0315:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r1.<init>(r2)
            throw r1
        L_0x031d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0325:
            return r8
        L_0x0326:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "FRAME_SIZE_ERROR: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0336:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qb0.mo69567a(boolean, com.yandex.mobile.ads.impl.qb0$c):boolean");
    }

    /* renamed from: a */
    private final List<o90> m41164a(int i, int i2, int i3, int i4) throws IOException {
        this.f39076d.mo69572b(i);
        C14376b bVar = this.f39076d;
        bVar.mo69573c(bVar.mo69571b());
        this.f39076d.mo69574d(i2);
        this.f39076d.mo69570a(i3);
        this.f39076d.mo69575e(i4);
        this.f39077e.mo69920d();
        return this.f39077e.mo69918b();
    }

    /* renamed from: a */
    private final void m41165a(C14377c cVar, int i) throws IOException {
        int readInt = this.f39074b.readInt();
        boolean z = (Integer.MIN_VALUE & readInt) != 0;
        byte readByte = this.f39074b.readByte();
        byte[] bArr = jh1.f35305a;
        cVar.mo69014a(i, readInt & Integer.MAX_VALUE, (readByte & 255) + 1, z);
    }
}
