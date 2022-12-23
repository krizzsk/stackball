package com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix;

import com.yandex.mobile.ads.impl.jh1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo72093d2 = {"Lcom/yandex/mobile/ads/embedded/okhttp/src/main/kotlin/okhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "e", "a", "mobileads_externalRelease"}, mo72094k = 1, mo72095mv = {1, 5, 1})
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final C12167a f29509e = new C12167a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final byte[] f29510f = {42};

    /* renamed from: g */
    private static final List<String> f29511g = CollectionsKt.listOf("*");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final PublicSuffixDatabase f29512h = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f29513a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f29514b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f29515c;

    /* renamed from: d */
    private byte[] f29516d;

    /* renamed from: com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C12167a {
        private C12167a() {
        }

        public /* synthetic */ C12167a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final String m31667a(C12167a aVar, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            byte b;
            int i3;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        byte b2 = bArr4[i9][i10];
                        byte[] bArr5 = jh1.f35305a;
                        byte b3 = b2 & 255;
                        z = z2;
                        b = b3;
                    }
                    byte b4 = bArr3[i6 + i11];
                    byte[] bArr6 = jh1.f35305a;
                    i3 = b - (b4 & 255);
                    if (i3 == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            z2 = true;
                            i10 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (i3 >= 0) {
                    if (i3 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int i13 = i9 + 1;
                        int length3 = bArr4.length;
                        if (i13 < length3) {
                            while (true) {
                                int i14 = i13 + 1;
                                length2 += bArr4[i13].length;
                                if (i14 >= length3) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }
    }

    /* renamed from: b */
    private final List<String> m31664b(String str) {
        List<String> split$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt.last(split$default), (Object) "") ? CollectionsKt.dropLast(split$default, 1) : split$default;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r6 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r6 != false) goto L_0x0041;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo64761a(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "domain"
            r2 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r21)
            java.lang.String r3 = "unicodeDomain"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.util.List r3 = r1.m31664b(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f29513a
            boolean r0 = r0.get()
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f29513a
            boolean r0 = r0.compareAndSet(r5, r4)
            if (r0 == 0) goto L_0x0058
            r6 = 0
        L_0x0029:
            r20.m31665b()     // Catch:{ InterruptedIOException -> 0x0049, IOException -> 0x0031 }
            if (r6 == 0) goto L_0x0065
            goto L_0x0041
        L_0x002f:
            r0 = move-exception
            goto L_0x004e
        L_0x0031:
            r0 = move-exception
            r7 = r0
            com.yandex.mobile.ads.impl.lz0$a r0 = com.yandex.mobile.ads.impl.lz0.f37135a     // Catch:{ all -> 0x002f }
            com.yandex.mobile.ads.impl.lz0 r0 = com.yandex.mobile.ads.impl.lz0.f37136b     // Catch:{ all -> 0x002f }
            java.lang.String r8 = "Failed to read public suffix list"
            r9 = 5
            r0.mo68534a((java.lang.String) r8, (int) r9, (java.lang.Throwable) r7)     // Catch:{ all -> 0x002f }
            if (r6 == 0) goto L_0x0065
        L_0x0041:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0065
        L_0x0049:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x002f }
            r6 = 1
            goto L_0x0029
        L_0x004e:
            if (r6 == 0) goto L_0x0057
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L_0x0057:
            throw r0
        L_0x0058:
            java.util.concurrent.CountDownLatch r0 = r1.f29514b     // Catch:{ InterruptedException -> 0x005e }
            r0.await()     // Catch:{ InterruptedException -> 0x005e }
            goto L_0x0065
        L_0x005e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0065:
            byte[] r0 = r1.f29515c
            if (r0 == 0) goto L_0x006b
            r0 = 1
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            if (r0 == 0) goto L_0x01b8
            int r0 = r3.size()
            byte[][] r6 = new byte[r0][]
            r7 = 0
        L_0x0075:
            if (r7 >= r0) goto L_0x009c
            java.lang.Object r8 = r3.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r10 = "UTF_8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            if (r8 == 0) goto L_0x0094
            byte[] r8 = r8.getBytes(r9)
            java.lang.String r9 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0075
        L_0x0094:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r2)
            throw r0
        L_0x009c:
            int r7 = r0 + -1
            java.lang.String r8 = "publicSuffixListBytes"
            r9 = 0
            if (r7 < 0) goto L_0x00bd
            r10 = 0
        L_0x00a4:
            int r11 = r10 + 1
            com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r12 = f29509e
            byte[] r13 = r1.f29515c
            if (r13 == 0) goto L_0x00b9
            java.lang.String r10 = com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.C12167a.m31667a(r12, r13, r6, r10)
            if (r10 == 0) goto L_0x00b4
            r12 = r10
            goto L_0x00be
        L_0x00b4:
            if (r11 <= r7) goto L_0x00b7
            goto L_0x00bd
        L_0x00b7:
            r10 = r11
            goto L_0x00a4
        L_0x00b9:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            throw r9
        L_0x00bd:
            r12 = r9
        L_0x00be:
            if (r0 <= r4) goto L_0x00e7
            java.lang.Object r7 = r6.clone()
            byte[][] r7 = (byte[][]) r7
            int r10 = r7.length
            int r10 = r10 - r4
            if (r10 <= 0) goto L_0x00e7
            r11 = 0
        L_0x00cb:
            int r13 = r11 + 1
            byte[] r14 = f29510f
            r7[r11] = r14
            com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r14 = f29509e
            byte[] r15 = r1.f29515c
            if (r15 == 0) goto L_0x00e3
            java.lang.String r11 = com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.C12167a.m31667a(r14, r15, r7, r11)
            if (r11 == 0) goto L_0x00de
            goto L_0x00e8
        L_0x00de:
            if (r13 < r10) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            r11 = r13
            goto L_0x00cb
        L_0x00e3:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            throw r9
        L_0x00e7:
            r11 = r9
        L_0x00e8:
            if (r11 == 0) goto L_0x0108
            int r0 = r0 - r4
            if (r0 <= 0) goto L_0x0108
            r7 = 0
        L_0x00ee:
            int r8 = r7 + 1
            com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r10 = f29509e
            byte[] r13 = r1.f29516d
            if (r13 == 0) goto L_0x0102
            java.lang.String r7 = com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.C12167a.m31667a(r10, r13, r6, r7)
            if (r7 == 0) goto L_0x00fd
            goto L_0x0109
        L_0x00fd:
            if (r8 < r0) goto L_0x0100
            goto L_0x0108
        L_0x0100:
            r7 = r8
            goto L_0x00ee
        L_0x0102:
            java.lang.String r0 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r9
        L_0x0108:
            r7 = r9
        L_0x0109:
            r0 = 46
            if (r7 == 0) goto L_0x0120
            java.lang.String r6 = "!"
            java.lang.String r10 = kotlin.jvm.internal.Intrinsics.stringPlus(r6, r7)
            char[] r11 = new char[r4]
            r11[r5] = r0
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            java.util.List r0 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r10, (char[]) r11, (boolean) r12, (int) r13, (int) r14, (java.lang.Object) r15)
            goto L_0x0165
        L_0x0120:
            if (r12 != 0) goto L_0x0127
            if (r11 != 0) goto L_0x0127
            java.util.List<java.lang.String> r0 = f29511g
            goto L_0x0165
        L_0x0127:
            if (r12 != 0) goto L_0x012b
            r6 = r9
            goto L_0x0139
        L_0x012b:
            char[] r13 = new char[r4]
            r13[r5] = r0
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            java.util.List r6 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r12, (char[]) r13, (boolean) r14, (int) r15, (int) r16, (java.lang.Object) r17)
        L_0x0139:
            if (r6 != 0) goto L_0x013f
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L_0x013f:
            if (r11 != 0) goto L_0x0143
            r0 = r9
            goto L_0x0154
        L_0x0143:
            char[] r15 = new char[r4]
            r15[r5] = r0
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r14 = r11
            java.util.List r0 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r14, (char[]) r15, (boolean) r16, (int) r17, (int) r18, (java.lang.Object) r19)
        L_0x0154:
            if (r0 != 0) goto L_0x015a
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x015a:
            int r7 = r6.size()
            int r8 = r0.size()
            if (r7 <= r8) goto L_0x0165
            r0 = r6
        L_0x0165:
            int r6 = r3.size()
            int r7 = r0.size()
            r8 = 33
            if (r6 != r7) goto L_0x017e
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            char r6 = r6.charAt(r5)
            if (r6 == r8) goto L_0x017e
            return r9
        L_0x017e:
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            char r5 = r6.charAt(r5)
            if (r5 != r8) goto L_0x0193
            int r3 = r3.size()
            int r0 = r0.size()
            goto L_0x019c
        L_0x0193:
            int r3 = r3.size()
            int r0 = r0.size()
            int r0 = r0 + r4
        L_0x019c:
            int r3 = r3 - r0
            java.util.List r0 = r20.m31664b(r21)
            kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.drop(r0, r3)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.lang.String r5 = "."
            java.lang.String r0 = kotlin.sequences.SequencesKt.joinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x01b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo64761a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        kotlin.p271io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31665b() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            okio.GzipSource r1 = new okio.GzipSource
            okio.Source r0 = okio.Okio.source((java.io.InputStream) r0)
            r1.<init>(r0)
            okio.BufferedSource r0 = okio.Okio.buffer((okio.Source) r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0047 }
            long r2 = (long) r2     // Catch:{ all -> 0x0047 }
            byte[] r2 = r0.readByteArray(r2)     // Catch:{ all -> 0x0047 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0047 }
            long r3 = (long) r3     // Catch:{ all -> 0x0047 }
            byte[] r3 = r0.readByteArray(r3)     // Catch:{ all -> 0x0047 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0047 }
            kotlin.p271io.CloseableKt.closeFinally(r0, r1)
            monitor-enter(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ all -> 0x0044 }
            r5.f29515c = r2     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch:{ all -> 0x0044 }
            r5.f29516d = r3     // Catch:{ all -> 0x0044 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0044 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f29514b
            r0.countDown()
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r2 = move-exception
            kotlin.p271io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.m31665b():void");
    }
}
