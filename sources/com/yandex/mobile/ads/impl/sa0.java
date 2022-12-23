package com.yandex.mobile.ads.impl;

import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vungle.warren.model.CookieDBAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

public final class sa0 {

    /* renamed from: a */
    public static final sa0 f39885a = new sa0();

    /* renamed from: b */
    private static final o90[] f39886b;

    /* renamed from: c */
    private static final Map<ByteString, Integer> f39887c;

    static {
        o90 o90 = new o90(o90.f38122i, "");
        int i = 0;
        ByteString byteString = o90.f38119f;
        ByteString byteString2 = o90.f38120g;
        ByteString byteString3 = o90.f38121h;
        ByteString byteString4 = o90.f38118e;
        f39886b = new o90[]{o90, new o90(byteString, "GET"), new o90(byteString, "POST"), new o90(byteString2, "/"), new o90(byteString2, "/index.html"), new o90(byteString3, "http"), new o90(byteString3, "https"), new o90(byteString4, "200"), new o90(byteString4, "204"), new o90(byteString4, "206"), new o90(byteString4, "304"), new o90(byteString4, "400"), new o90(byteString4, "404"), new o90(byteString4, "500"), new o90("accept-charset", ""), new o90("accept-encoding", "gzip, deflate"), new o90("accept-language", ""), new o90("accept-ranges", ""), new o90("accept", ""), new o90("access-control-allow-origin", ""), new o90("age", ""), new o90("allow", ""), new o90("authorization", ""), new o90("cache-control", ""), new o90("content-disposition", ""), new o90("content-encoding", ""), new o90("content-language", ""), new o90("content-length", ""), new o90("content-location", ""), new o90("content-range", ""), new o90("content-type", ""), new o90((String) CookieDBAdapter.CookieColumns.TABLE_NAME, ""), new o90("date", ""), new o90((String) DownloadModel.ETAG, ""), new o90("expect", ""), new o90("expires", ""), new o90("from", ""), new o90("host", ""), new o90("if-match", ""), new o90("if-modified-since", ""), new o90("if-none-match", ""), new o90("if-range", ""), new o90("if-unmodified-since", ""), new o90("last-modified", ""), new o90("link", ""), new o90((String) FirebaseAnalytics.Param.LOCATION, ""), new o90("max-forwards", ""), new o90("proxy-authenticate", ""), new o90("proxy-authorization", ""), new o90("range", ""), new o90("referer", ""), new o90("refresh", ""), new o90("retry-after", ""), new o90("server", ""), new o90("set-cookie", ""), new o90("strict-transport-security", ""), new o90("transfer-encoding", ""), new o90("user-agent", ""), new o90("vary", ""), new o90("via", ""), new o90("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            int i2 = i + 1;
            o90[] o90Arr = f39886b;
            if (!linkedHashMap.containsKey(o90Arr[i].f38123a)) {
                linkedHashMap.put(o90Arr[i].f38123a, Integer.valueOf(i));
            }
            if (i2 > 60) {
                Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
                f39887c = unmodifiableMap;
                return;
            }
            i = i2;
        }
    }

    private sa0() {
    }

    /* renamed from: a */
    public final Map<ByteString, Integer> mo69914a() {
        return f39887c;
    }

    /* renamed from: b */
    public final o90[] mo69916b() {
        return f39886b;
    }

    /* renamed from: com.yandex.mobile.ads.impl.sa0$a */
    public static final class C14574a {

        /* renamed from: a */
        private final int f39888a;

        /* renamed from: b */
        private int f39889b;

        /* renamed from: c */
        private final List<o90> f39890c;

        /* renamed from: d */
        private final BufferedSource f39891d;

        /* renamed from: e */
        public o90[] f39892e;

        /* renamed from: f */
        private int f39893f;

        /* renamed from: g */
        public int f39894g;

        /* renamed from: h */
        public int f39895h;

        public C14574a(Source source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f39888a = i;
            this.f39889b = i2;
            this.f39890c = new ArrayList();
            this.f39891d = Okio.buffer(source);
            this.f39892e = new o90[8];
            this.f39893f = 7;
        }

        /* renamed from: a */
        private final void m41867a() {
            ArraysKt.fill$default((Object[]) this.f39892e, (Object) null, 0, 0, 6, (Object) null);
            this.f39893f = this.f39892e.length - 1;
            this.f39894g = 0;
            this.f39895h = 0;
        }

        /* renamed from: c */
        private final ByteString m41870c(int i) throws IOException {
            if (m41871d(i)) {
                return sa0.f39885a.mo69916b()[i].f38123a;
            }
            int a = m41866a(i - sa0.f39885a.mo69916b().length);
            if (a >= 0) {
                o90[] o90Arr = this.f39892e;
                if (a < o90Arr.length) {
                    o90 o90 = o90Arr[a];
                    Intrinsics.checkNotNull(o90);
                    return o90.f38123a;
                }
            }
            throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i + 1)));
        }

        /* renamed from: b */
        public final List<o90> mo69918b() {
            List<o90> list = CollectionsKt.toList(this.f39890c);
            this.f39890c.clear();
            return list;
        }

        /* renamed from: d */
        public final void mo69920d() throws IOException {
            while (!this.f39891d.exhausted()) {
                byte readByte = this.f39891d.readByte();
                byte[] bArr = jh1.f35305a;
                byte b = readByte & 255;
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((b & 128) == 128) {
                    int a = mo69917a((int) b, 127) - 1;
                    if (m41871d(a)) {
                        this.f39890c.add(sa0.f39885a.mo69916b()[a]);
                    } else {
                        int a2 = m41866a(a - sa0.f39885a.mo69916b().length);
                        if (a2 >= 0) {
                            o90[] o90Arr = this.f39892e;
                            if (a2 < o90Arr.length) {
                                List<o90> list = this.f39890c;
                                o90 o90 = o90Arr[a2];
                                Intrinsics.checkNotNull(o90);
                                list.add(o90);
                            }
                        }
                        throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(a + 1)));
                    }
                } else if (b == 64) {
                    m41868a(-1, new o90(sa0.f39885a.mo69915a(mo69919c()), mo69919c()));
                } else if ((b & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    m41868a(-1, new o90(m41870c(mo69917a((int) b, 63) - 1), mo69919c()));
                } else if ((b & 32) == 32) {
                    int a3 = mo69917a((int) b, 31);
                    this.f39889b = a3;
                    if (a3 < 0 || a3 > this.f39888a) {
                        throw new IOException(Intrinsics.stringPlus("Invalid dynamic table size update ", Integer.valueOf(this.f39889b)));
                    }
                    int i = this.f39895h;
                    if (a3 < i) {
                        if (a3 == 0) {
                            m41867a();
                        } else {
                            m41869b(i - a3);
                        }
                    }
                } else if (b == 16 || b == 0) {
                    this.f39890c.add(new o90(sa0.f39885a.mo69915a(mo69919c()), mo69919c()));
                } else {
                    this.f39890c.add(new o90(m41870c(mo69917a((int) b, 15) - 1), mo69919c()));
                }
            }
        }

        /* renamed from: b */
        private final int m41869b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f39892e.length;
                while (true) {
                    length--;
                    i2 = this.f39893f;
                    if (length < i2 || i <= 0) {
                        o90[] o90Arr = this.f39892e;
                        int i4 = i2 + 1;
                        System.arraycopy(o90Arr, i4, o90Arr, i4 + i3, this.f39894g);
                        this.f39893f += i3;
                    } else {
                        o90 o90 = this.f39892e[length];
                        Intrinsics.checkNotNull(o90);
                        int i5 = o90.f38125c;
                        i -= i5;
                        this.f39895h -= i5;
                        this.f39894g--;
                        i3++;
                    }
                }
                o90[] o90Arr2 = this.f39892e;
                int i42 = i2 + 1;
                System.arraycopy(o90Arr2, i42, o90Arr2, i42 + i3, this.f39894g);
                this.f39893f += i3;
            }
            return i3;
        }

        /* renamed from: a */
        private final int m41866a(int i) {
            return this.f39893f + 1 + i;
        }

        /* renamed from: a */
        private final void m41868a(int i, o90 o90) {
            this.f39890c.add(o90);
            int i2 = o90.f38125c;
            if (i != -1) {
                o90 o902 = this.f39892e[this.f39893f + 1 + i];
                Intrinsics.checkNotNull(o902);
                i2 -= o902.f38125c;
            }
            int i3 = this.f39889b;
            if (i2 > i3) {
                m41867a();
                return;
            }
            int b = m41869b((this.f39895h + i2) - i3);
            if (i == -1) {
                int i4 = this.f39894g + 1;
                o90[] o90Arr = this.f39892e;
                if (i4 > o90Arr.length) {
                    o90[] o90Arr2 = new o90[(o90Arr.length * 2)];
                    System.arraycopy(o90Arr, 0, o90Arr2, o90Arr.length, o90Arr.length);
                    this.f39893f = this.f39892e.length - 1;
                    this.f39892e = o90Arr2;
                }
                int i5 = this.f39893f;
                this.f39893f = i5 - 1;
                this.f39892e[i5] = o90;
                this.f39894g++;
            } else {
                this.f39892e[i + this.f39893f + 1 + i + b] = o90;
            }
            this.f39895h += i2;
        }

        /* renamed from: c */
        public final ByteString mo69919c() throws IOException {
            byte readByte = this.f39891d.readByte();
            byte[] bArr = jh1.f35305a;
            byte b = readByte & 255;
            boolean z = (b & 128) == 128;
            long a = (long) mo69917a((int) b, 127);
            if (!z) {
                return this.f39891d.readByteString(a);
            }
            Buffer buffer = new Buffer();
            gc0.f33930a.mo67231a(this.f39891d, a, (BufferedSink) buffer);
            return buffer.readByteString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14574a(Source source, int i, int i2, int i3) {
            this(source, i, (i3 & 4) != 0 ? i : i2);
        }

        /* renamed from: a */
        public final int mo69917a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = this.f39891d.readByte();
                byte[] bArr = jh1.f35305a;
                byte b = readByte & 255;
                if ((b & 128) == 0) {
                    return i2 + (b << i4);
                }
                i2 += (b & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }

        /* renamed from: d */
        private final boolean m41871d(int i) {
            return i >= 0 && i <= sa0.f39885a.mo69916b().length - 1;
        }
    }

    /* renamed from: a */
    public final ByteString mo69915a(ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "name");
        int size = byteString.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                byte b = byteString.getByte(i);
                if (65 <= b && b <= 90) {
                    throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", byteString.utf8()));
                } else if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return byteString;
    }

    /* renamed from: com.yandex.mobile.ads.impl.sa0$b */
    public static final class C14575b {

        /* renamed from: a */
        private final boolean f39896a;

        /* renamed from: b */
        private final Buffer f39897b;

        /* renamed from: c */
        private int f39898c;

        /* renamed from: d */
        private boolean f39899d;

        /* renamed from: e */
        public int f39900e;

        /* renamed from: f */
        public o90[] f39901f;

        /* renamed from: g */
        private int f39902g;

        /* renamed from: h */
        public int f39903h;

        /* renamed from: i */
        public int f39904i;

        public C14575b(int i, boolean z, Buffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "out");
            this.f39896a = z;
            this.f39897b = buffer;
            this.f39898c = Integer.MAX_VALUE;
            this.f39900e = i;
            this.f39901f = new o90[8];
            this.f39902g = 7;
        }

        /* renamed from: a */
        private final void m41877a() {
            ArraysKt.fill$default((Object[]) this.f39901f, (Object) null, 0, 0, 6, (Object) null);
            this.f39902g = this.f39901f.length - 1;
            this.f39903h = 0;
            this.f39904i = 0;
        }

        /* renamed from: b */
        public final void mo69924b(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f39900e;
            if (i2 != min) {
                if (min < i2) {
                    this.f39898c = Math.min(this.f39898c, min);
                }
                this.f39899d = true;
                this.f39900e = min;
                int i3 = this.f39904i;
                if (min >= i3) {
                    return;
                }
                if (min == 0) {
                    m41877a();
                } else {
                    m41876a(i3 - min);
                }
            }
        }

        /* renamed from: a */
        private final int m41876a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f39901f.length;
                while (true) {
                    length--;
                    i2 = this.f39902g;
                    if (length < i2 || i <= 0) {
                        o90[] o90Arr = this.f39901f;
                        int i4 = i2 + 1;
                        System.arraycopy(o90Arr, i4, o90Arr, i4 + i3, this.f39903h);
                        o90[] o90Arr2 = this.f39901f;
                        int i5 = this.f39902g + 1;
                        Arrays.fill(o90Arr2, i5, i5 + i3, (Object) null);
                        this.f39902g += i3;
                    } else {
                        o90 o90 = this.f39901f[length];
                        Intrinsics.checkNotNull(o90);
                        i -= o90.f38125c;
                        int i6 = this.f39904i;
                        o90 o902 = this.f39901f[length];
                        Intrinsics.checkNotNull(o902);
                        this.f39904i = i6 - o902.f38125c;
                        this.f39903h--;
                        i3++;
                    }
                }
                o90[] o90Arr3 = this.f39901f;
                int i42 = i2 + 1;
                System.arraycopy(o90Arr3, i42, o90Arr3, i42 + i3, this.f39903h);
                o90[] o90Arr22 = this.f39901f;
                int i52 = this.f39902g + 1;
                Arrays.fill(o90Arr22, i52, i52 + i3, (Object) null);
                this.f39902g += i3;
            }
            return i3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C14575b(int i, boolean z, Buffer buffer, int i2) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
        }

        /* renamed from: a */
        private final void m41878a(o90 o90) {
            int i = o90.f38125c;
            int i2 = this.f39900e;
            if (i > i2) {
                m41877a();
                return;
            }
            m41876a((this.f39904i + i) - i2);
            int i3 = this.f39903h + 1;
            o90[] o90Arr = this.f39901f;
            if (i3 > o90Arr.length) {
                o90[] o90Arr2 = new o90[(o90Arr.length * 2)];
                System.arraycopy(o90Arr, 0, o90Arr2, o90Arr.length, o90Arr.length);
                this.f39902g = this.f39901f.length - 1;
                this.f39901f = o90Arr2;
            }
            int i4 = this.f39902g;
            this.f39902g = i4 - 1;
            this.f39901f[i4] = o90;
            this.f39903h++;
            this.f39904i += i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb A[LOOP:1: B:30:0x008e->B:38:0x00cb, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0111 A[LOOP:0: B:9:0x002a->B:51:0x0111, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0114 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00cd A[EDGE_INSN: B:53:0x00cd->B:39:0x00cd ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo69922a(java.util.List<com.yandex.mobile.ads.impl.o90> r15) throws java.io.IOException {
            /*
                r14 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                boolean r0 = r14.f39899d
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r14.f39898c
                int r2 = r14.f39900e
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r14.mo69921a(r0, r4, r3)
            L_0x0017:
                r14.f39899d = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r14.f39898c = r0
                int r0 = r14.f39900e
                r14.mo69921a(r0, r4, r3)
            L_0x0023:
                int r0 = r15.size()
                if (r0 <= 0) goto L_0x0114
                r2 = 0
            L_0x002a:
                int r3 = r2 + 1
                java.lang.Object r2 = r15.get(r2)
                com.yandex.mobile.ads.impl.o90 r2 = (com.yandex.mobile.ads.impl.o90) r2
                okio.ByteString r4 = r2.f38123a
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r2.f38124b
                com.yandex.mobile.ads.impl.sa0 r6 = com.yandex.mobile.ads.impl.sa0.f39885a
                java.util.Map r7 = r6.mo69914a()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                r9 = 1
                if (r7 == 0) goto L_0x0082
                int r7 = r7.intValue()
                int r7 = r7 + r9
                r10 = 2
                if (r10 > r7) goto L_0x0057
                r10 = 7
                if (r7 > r10) goto L_0x0057
                r10 = 1
                goto L_0x0058
            L_0x0057:
                r10 = 0
            L_0x0058:
                if (r10 == 0) goto L_0x0080
                com.yandex.mobile.ads.impl.o90[] r10 = r6.mo69916b()
                int r11 = r7 + -1
                r10 = r10[r11]
                okio.ByteString r10 = r10.f38124b
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r5)
                if (r10 == 0) goto L_0x006c
                r6 = r7
                goto L_0x0084
            L_0x006c:
                com.yandex.mobile.ads.impl.o90[] r6 = r6.mo69916b()
                r6 = r6[r7]
                okio.ByteString r6 = r6.f38124b
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
                if (r6 == 0) goto L_0x0080
                int r6 = r7 + 1
                r13 = r7
                r7 = r6
                r6 = r13
                goto L_0x0084
            L_0x0080:
                r6 = r7
                goto L_0x0083
            L_0x0082:
                r6 = -1
            L_0x0083:
                r7 = -1
            L_0x0084:
                if (r7 != r8) goto L_0x00cd
                int r10 = r14.f39902g
                int r10 = r10 + r9
                com.yandex.mobile.ads.impl.o90[] r9 = r14.f39901f
                int r9 = r9.length
                if (r10 >= r9) goto L_0x00cd
            L_0x008e:
                int r11 = r10 + 1
                com.yandex.mobile.ads.impl.o90[] r12 = r14.f39901f
                r12 = r12[r10]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
                okio.ByteString r12 = r12.f38123a
                boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r4)
                if (r12 == 0) goto L_0x00c8
                com.yandex.mobile.ads.impl.o90[] r12 = r14.f39901f
                r12 = r12[r10]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
                okio.ByteString r12 = r12.f38124b
                boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r5)
                if (r12 == 0) goto L_0x00ba
                int r7 = r14.f39902g
                int r10 = r10 - r7
                com.yandex.mobile.ads.impl.sa0 r7 = com.yandex.mobile.ads.impl.sa0.f39885a
                com.yandex.mobile.ads.impl.o90[] r7 = r7.mo69916b()
                int r7 = r7.length
                int r7 = r7 + r10
                goto L_0x00cd
            L_0x00ba:
                if (r6 != r8) goto L_0x00c8
                int r6 = r14.f39902g
                int r10 = r10 - r6
                com.yandex.mobile.ads.impl.sa0 r6 = com.yandex.mobile.ads.impl.sa0.f39885a
                com.yandex.mobile.ads.impl.o90[] r6 = r6.mo69916b()
                int r6 = r6.length
                int r10 = r10 + r6
                r6 = r10
            L_0x00c8:
                if (r11 < r9) goto L_0x00cb
                goto L_0x00cd
            L_0x00cb:
                r10 = r11
                goto L_0x008e
            L_0x00cd:
                if (r7 == r8) goto L_0x00d7
                r2 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r14.mo69921a(r7, r2, r4)
                goto L_0x010e
            L_0x00d7:
                r7 = 64
                if (r6 != r8) goto L_0x00ea
                okio.Buffer r6 = r14.f39897b
                r6.writeByte((int) r7)
                r14.mo69923a((okio.ByteString) r4)
                r14.mo69923a((okio.ByteString) r5)
                r14.m41878a((com.yandex.mobile.ads.impl.o90) r2)
                goto L_0x010e
            L_0x00ea:
                okio.ByteString r8 = com.yandex.mobile.ads.impl.o90.f38117d
                boolean r8 = r4.startsWith((okio.ByteString) r8)
                if (r8 == 0) goto L_0x0103
                okio.ByteString r8 = com.yandex.mobile.ads.impl.o90.f38122i
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r4)
                if (r4 != 0) goto L_0x0103
                r2 = 15
                r14.mo69921a(r6, r2, r1)
                r14.mo69923a((okio.ByteString) r5)
                goto L_0x010e
            L_0x0103:
                r4 = 63
                r14.mo69921a(r6, r4, r7)
                r14.mo69923a((okio.ByteString) r5)
                r14.m41878a((com.yandex.mobile.ads.impl.o90) r2)
            L_0x010e:
                if (r3 < r0) goto L_0x0111
                goto L_0x0114
            L_0x0111:
                r2 = r3
                goto L_0x002a
            L_0x0114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sa0.C14575b.mo69922a(java.util.List):void");
        }

        /* renamed from: a */
        public final void mo69921a(int i, int i2, int i3) {
            if (i < i2) {
                this.f39897b.writeByte(i | i3);
                return;
            }
            this.f39897b.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f39897b.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f39897b.writeByte(i4);
        }

        /* renamed from: a */
        public final void mo69923a(ByteString byteString) throws IOException {
            Intrinsics.checkNotNullParameter(byteString, "data");
            if (this.f39896a) {
                gc0 gc0 = gc0.f33930a;
                if (gc0.mo67230a(byteString) < byteString.size()) {
                    Buffer buffer = new Buffer();
                    gc0.mo67232a(byteString, buffer);
                    ByteString readByteString = buffer.readByteString();
                    mo69921a(readByteString.size(), 127, 128);
                    this.f39897b.write(readByteString);
                    return;
                }
            }
            mo69921a(byteString.size(), 127, 0);
            this.f39897b.write(byteString);
        }
    }
}
