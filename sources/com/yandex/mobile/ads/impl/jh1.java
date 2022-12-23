package com.yandex.mobile.ads.impl;

import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.e51;
import com.yandex.mobile.ads.impl.o41;
import com.yandex.mobile.ads.impl.q90;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;

public final class jh1 {

    /* renamed from: a */
    public static final byte[] f35305a;

    /* renamed from: b */
    public static final q90 f35306b = q90.f39028c.mo69523a(new String[0]);

    /* renamed from: c */
    public static final e51 f35307c;

    /* renamed from: d */
    public static final TimeZone f35308d;

    /* renamed from: e */
    private static final Regex f35309e = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: f */
    public static final boolean f35310f = hw0.class.desiredAssertionStatus();

    /* renamed from: g */
    public static final String f35311g;

    static {
        byte[] bArr = new byte[0];
        f35305a = bArr;
        f35307c = e51.C12956a.m35581a(e51.f32914b, bArr, 1);
        o41.C14166a.m40287a(o41.f38088a, bArr, 0, 0, 7);
        Options.Companion.of(new ByteString[]{ByteString.Companion.decodeHex("efbbbf"), ByteString.Companion.decodeHex("feff"), ByteString.Companion.decodeHex("fffe"), ByteString.Companion.decodeHex("0000ffff"), ByteString.Companion.decodeHex("ffff0000")});
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f35308d = timeZone;
        String name = hw0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f35311g = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttplib."), (CharSequence) "Client");
    }

    /* renamed from: a */
    public static final int m37807a(char c) {
        boolean z = true;
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c <= 'f')) {
            c2 = 'A';
            if ('A' > c || c > 'F') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final b40 m37817a(b40 b40, C12380ae aeVar) {
        Intrinsics.checkNotNullParameter(b40, "$this_asFactory");
        Intrinsics.checkNotNullParameter(aeVar, "it");
        return b40;
    }

    /* renamed from: a */
    public static final void m37825a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public static final String[] m37837b(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(strArr2, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                String str2 = strArr2[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: c */
    public static final String m37838c(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int a = m37810a(str, i, i2);
        String substring = str.substring(a, m37834b(str, a, i2));
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final ThreadFactory m37824a(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new ThreadFactory(str, z) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Thread newThread(Runnable runnable) {
                return jh1.m37821a(this.f$0, this.f$1, runnable);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final Thread m37821a(String str, boolean z, Runnable runnable) {
        Intrinsics.checkNotNullParameter(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: c */
    public static final boolean m37839c(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        if (StringsKt.equals(str, HttpHeaders.AUTHORIZATION, true) || StringsKt.equals(str, HttpHeaders.COOKIE, true) || StringsKt.equals(str, HttpHeaders.PROXY_AUTHORIZATION, true) || StringsKt.equals(str, HttpHeaders.SET_COOKIE, true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m37832a(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    Iterator it = ArrayIteratorKt.iterator(strArr2);
                    while (true) {
                        if (it.hasNext()) {
                            if (comparator.compare(str, (String) it.next()) == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final String m37819a(fc0 fc0, boolean z) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(fc0, "<this>");
        if (StringsKt.contains$default((CharSequence) fc0.mo66958g(), (CharSequence) CertificateUtil.DELIMITER, false, 2, (Object) null)) {
            str = '[' + fc0.mo66958g() + ']';
        } else {
            str = fc0.mo66958g();
        }
        if (!z) {
            int i2 = fc0.mo66961i();
            String l = fc0.mo66964l();
            Intrinsics.checkNotNullParameter(l, "scheme");
            if (Intrinsics.areEqual((Object) l, (Object) "http")) {
                i = 80;
            } else {
                i = Intrinsics.areEqual((Object) l, (Object) "https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + fc0.mo66961i();
    }

    /* renamed from: b */
    public static final int m37834b(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char charAt = str.charAt(i3);
                boolean z = false;
                if ((((charAt == 9 || charAt == 10) || charAt == 12) || charAt == 13) || charAt == ' ') {
                    z = true;
                }
                if (!z) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static final int m37833b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (length <= 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i;
            }
            if (i2 >= length) {
                return -1;
            }
            i = i2;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return r12;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m37836b(okio.Source r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch:{ InterruptedIOException -> 0x006a, all -> 0x0054 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x006a, all -> 0x0054 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch:{ InterruptedIOException -> 0x006a, all -> 0x0054 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.clear()     // Catch:{ InterruptedIOException -> 0x006a, all -> 0x0054 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0078
            goto L_0x0070
        L_0x0054:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0061
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0069
        L_0x0061:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x0069:
            throw r12
        L_0x006a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0078
        L_0x0070:
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0080
        L_0x0078:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x0080:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jh1.m37836b(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: b */
    public static final <T> List<T> m37835b(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList(list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: a */
    public static final int m37810a(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < i2) {
            while (true) {
                int i3 = i + 1;
                char charAt = str.charAt(i);
                boolean z = false;
                if ((((charAt == 9 || charAt == 10) || charAt == 12) || charAt == 13) || charAt == ' ') {
                    z = true;
                }
                if (!z) {
                    return i;
                }
                if (i3 >= i2) {
                    break;
                }
                i = i3;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m37812a(String str, String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "delimiters");
        if (i < i2) {
            while (true) {
                int i3 = i + 1;
                if (StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                if (i3 >= i2) {
                    break;
                }
                i = i3;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m37808a(String str, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < i2) {
            while (true) {
                int i3 = i + 1;
                if (str.charAt(i) == c) {
                    return i;
                }
                if (i3 >= i2) {
                    break;
                }
                i = i3;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final boolean m37829a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f35309e.matches(str);
    }

    /* renamed from: a */
    public static final String m37820a(String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "format");
        Intrinsics.checkNotNullParameter(objArr, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: a */
    public static final int m37811a(String str, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(str, "name");
        boolean z = true;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus(str, " too small.").toString());
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(Intrinsics.stringPlus(str, " < 0").toString());
    }

    /* renamed from: a */
    public static final q90 m37818a(List<o90> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        q90.C14366a aVar = new q90.C14366a();
        for (o90 next : list) {
            aVar.mo69519a(next.f38123a.utf8(), next.f38124b.utf8());
        }
        return aVar.mo69520a();
    }

    /* renamed from: a */
    public static final boolean m37828a(fc0 fc0, fc0 fc02) {
        Intrinsics.checkNotNullParameter(fc0, "<this>");
        Intrinsics.checkNotNullParameter(fc02, "other");
        return Intrinsics.areEqual((Object) fc0.mo66958g(), (Object) fc02.mo66958g()) && fc0.mo66961i() == fc02.mo66961i() && Intrinsics.areEqual((Object) fc0.mo66964l(), (Object) fc02.mo66964l());
    }

    /* renamed from: a */
    public static final b40.C12569b m37816a(b40 b40) {
        Intrinsics.checkNotNullParameter(b40, "<this>");
        return new b40.C12569b() {
            /* renamed from: a */
            public final b40 mo65537a(C12380ae aeVar) {
                return jh1.m37817a(b40.this, aeVar);
            }
        };
    }

    /* renamed from: a */
    public static final int m37814a(BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << Ascii.DLE) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: a */
    public static final boolean m37831a(Source source, int i, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return m37836b(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m37830a(Socket socket, BufferedSource bufferedSource) {
        int soTimeout;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !bufferedSource.exhausted();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: a */
    public static final int m37813a(Buffer buffer, byte b) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    /* renamed from: a */
    public static final long m37815a(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, "<this>");
        String a = b51.mo65982i().mo69510a(HttpHeaders.CONTENT_LENGTH);
        if (a == null) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(a, "<this>");
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static final int m37809a(String str, int i) {
        Long l;
        if (str == null) {
            l = null;
        } else {
            try {
                l = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (l == null) {
            return i;
        }
        long longValue = l.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    @SafeVarargs
    /* renamed from: a */
    public static final <T> List<T> m37823a(T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, MessengerShareContentUtility.ELEMENTS);
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: a */
    public static final void m37826a(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m37827a(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.areEqual((Object) e2.getMessage(), (Object) "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final Throwable m37822a(Exception exc, List<? extends Exception> list) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(list, "suppressed");
        if (list.size() > 1) {
            System.out.getClass();
        }
        for (Exception addSuppressed : list) {
            ExceptionsKt.addSuppressed(exc, addSuppressed);
        }
        return exc;
    }
}
