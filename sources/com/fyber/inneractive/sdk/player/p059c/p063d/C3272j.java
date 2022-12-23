package com.fyber.inneractive.sdk.player.p059c.p063d;

import com.fyber.inneractive.sdk.player.p059c.p072f.C3417a;
import com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3428e;
import com.fyber.inneractive.sdk.player.p059c.p072f.p073a.C3432g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.j */
public final class C3272j {

    /* renamed from: a */
    public static final C3432g.C3433a f8378a = new C3432g.C3433a() {
        /* renamed from: a */
        public final boolean mo19061a(int i, int i2, int i3, int i4, int i5) {
            if (i2 == 67 && i3 == 79 && i4 == 77) {
                return i5 == 77 || i == 2;
            }
            return false;
        }
    };

    /* renamed from: d */
    private static final Pattern f8379d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: b */
    public int f8380b = -1;

    /* renamed from: c */
    public int f8381c = -1;

    /* renamed from: a */
    private boolean m8033a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f8379d.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f8380b = parseInt;
                    this.f8381c = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19059a() {
        return (this.f8380b == -1 || this.f8381c == -1) ? false : true;
    }

    /* renamed from: a */
    public final boolean mo19060a(C3417a aVar) {
        for (C3417a.C3419a aVar2 : aVar.f9251a) {
            if (aVar2 instanceof C3428e) {
                C3428e eVar = (C3428e) aVar2;
                if (m8033a(eVar.f9269b, eVar.f9270c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
