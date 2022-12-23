package com.ogury.p245ed.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ob */
public final class C8512ob implements Serializable {

    /* renamed from: a */
    public static final C8513a f21736a = new C8513a((byte) 0);

    /* renamed from: b */
    private final Pattern f21737b;

    public C8512ob(Pattern pattern) {
        C8467mq.m23881b(pattern, "nativePattern");
        this.f21737b = pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8512ob(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.ogury.p245ed.internal.C8467mq.m23881b(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r2, (java.lang.String) r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8512ob.<init>(java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo53999a(CharSequence charSequence) {
        C8467mq.m23881b(charSequence, "input");
        return this.f21737b.matcher(charSequence).find();
    }

    /* renamed from: b */
    public final List<String> mo54000b(CharSequence charSequence) {
        C8467mq.m23881b(charSequence, "input");
        int i = 0;
        C8516oc.m23962a(0);
        Matcher matcher = this.f21737b.matcher(charSequence);
        if (!matcher.find()) {
            return C8394km.m23752a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.f21737b.toString();
        C8467mq.m23878a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f21737b.pattern();
        C8467mq.m23878a((Object) pattern, "nativePattern.pattern()");
        return new C8514b(pattern, this.f21737b.flags());
    }

    /* renamed from: com.ogury.ed.internal.ob$b */
    static final class C8514b implements Serializable {

        /* renamed from: a */
        public static final C8515a f21738a = new C8515a((byte) 0);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final String f21739b;

        /* renamed from: c */
        private final int f21740c;

        /* renamed from: com.ogury.ed.internal.ob$b$a */
        public static final class C8515a {
            private C8515a() {
            }

            public /* synthetic */ C8515a(byte b) {
                this();
            }
        }

        public C8514b(String str, int i) {
            C8467mq.m23881b(str, "pattern");
            this.f21739b = str;
            this.f21740c = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f21739b, this.f21740c);
            C8467mq.m23878a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C8512ob(compile);
        }
    }

    /* renamed from: com.ogury.ed.internal.ob$a */
    public static final class C8513a {
        private C8513a() {
        }

        public /* synthetic */ C8513a(byte b) {
            this();
        }
    }
}
