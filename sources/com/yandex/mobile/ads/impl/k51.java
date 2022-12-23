package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12735ch;
import com.yandex.mobile.ads.impl.hb1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

final class k51 {

    /* renamed from: a */
    private final String f35968a;

    /* renamed from: b */
    private int f35969b;

    /* renamed from: c */
    private int f35970c;

    /* renamed from: d */
    private final List<C12735ch> f35971d = new ArrayList();

    public k51(String str) {
        Intrinsics.checkNotNullParameter(str, "input");
        this.f35968a = str;
    }

    /* renamed from: a */
    public final Void mo68131a(String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        String str2 = this.f35968a;
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "input");
        throw new oy0(qy0.INVALID_VALUE, str, (Throwable) null, (wh0) null, str2, 12);
    }

    /* renamed from: b */
    public final void mo68133b() {
        List<C12735ch> list = this.f35971d;
        String substring = this.f35968a.substring(this.f35969b, this.f35970c);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        list.add(new C12735ch.C12738c(substring));
        this.f35969b = this.f35970c;
    }

    /* renamed from: c */
    public final List<C12735ch> mo68134c() {
        hb1.C13303e eVar;
        hb1 hb1 = hb1.C13307i.f34359a;
        String str = this.f35968a;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            if ((('A' <= charAt && charAt < '[') || ('a' <= charAt && charAt < '{')) || charAt == '_') {
                eVar = hb1.C13303e.Letter;
            } else {
                if (charAt == '.' || ('0' <= charAt && charAt < ':')) {
                    eVar = hb1.C13303e.VarSpecial;
                } else if (charAt == '(') {
                    eVar = hb1.C13303e.OpeningBracket;
                } else if (charAt == '\'') {
                    eVar = hb1.C13303e.SingleQuote;
                } else if (charAt == '\\') {
                    eVar = hb1.C13303e.EscapeCharacter;
                } else {
                    eVar = hb1.C13303e.Other;
                }
            }
            hb1 = hb1.mo67508a(eVar, this);
            this.f35970c++;
        }
        hb1.mo67508a(hb1.C13303e.EndOfLine, this);
        return this.f35971d;
    }

    /* renamed from: a */
    public final void mo68132a() {
        List<C12735ch> list = this.f35971d;
        String substring = this.f35968a.substring(this.f35969b, this.f35970c);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        list.add(new C12735ch.C12737b(substring));
        this.f35969b = this.f35970c;
    }
}
