package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class jb1 {

    /* renamed from: d */
    public static final C13485a f35211d = new C13485a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final w11 f35212a;

    /* renamed from: b */
    public final int f35213b;

    /* renamed from: c */
    public final String f35214c;

    /* renamed from: com.yandex.mobile.ads.impl.jb1$a */
    public static final class C13485a {
        private C13485a() {
        }

        public /* synthetic */ C13485a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final jb1 mo67962a(String str) throws IOException {
            w11 w11;
            String str2;
            Intrinsics.checkNotNullParameter(str, "statusLine");
            int i = 9;
            if (StringsKt.startsWith$default(str, "HTTP/1.", false, 2, (Object) null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    w11 = w11.HTTP_1_0;
                } else if (charAt == 1) {
                    w11 = w11.HTTP_1_1;
                } else {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
                }
            } else if (StringsKt.startsWith$default(str, "ICY ", false, 2, (Object) null)) {
                w11 = w11.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
                    }
                    return new jb1(w11, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", str));
            }
        }
    }

    public jb1(w11 w11, int i, String str) {
        Intrinsics.checkNotNullParameter(w11, "protocol");
        Intrinsics.checkNotNullParameter(str, "message");
        this.f35212a = w11;
        this.f35213b = i;
        this.f35214c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f35212a == w11.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f35213b);
        sb.append(' ');
        sb.append(this.f35214c);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
