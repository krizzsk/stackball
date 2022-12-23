package com.ogury.p244cm.internal;

import com.ogury.p244cm.internal.bbbaa;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* renamed from: com.ogury.cm.internal.bbcba */
final class bbcba implements bbcac {

    /* renamed from: a */
    private final bbcab f20656a = new aaaab(this);

    /* renamed from: b */
    private List<String> f20657b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Matcher f20658c;

    /* renamed from: d */
    private final CharSequence f20659d;

    /* renamed from: com.ogury.cm.internal.bbcba$aaaaa */
    public static final class aaaaa extends bacab<String> {

        /* renamed from: b */
        final /* synthetic */ bbcba f20660b;

        aaaaa(bbcba bbcba) {
            this.f20660b = bbcba;
        }

        /* renamed from: a */
        public final int mo52791a() {
            return this.f20660b.f20658c.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        public final /* synthetic */ Object get(int i) {
            String group = this.f20660b.f20658c.group(i);
            return group == null ? "" : group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    /* renamed from: com.ogury.cm.internal.bbcba$aaaab */
    public static final class aaaab extends bacaa<bbcaa> implements bbcab {

        /* renamed from: a */
        final /* synthetic */ bbcba f20661a;

        /* renamed from: com.ogury.cm.internal.bbcba$aaaab$aaaaa */
        static final class aaaaa extends bbaca implements bbaab<Integer, bbcaa> {

            /* renamed from: a */
            final /* synthetic */ aaaab f20662a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaaa(aaaab aaaab) {
                super(1);
                this.f20662a = aaaab;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo52626a(Object obj) {
                int intValue = ((Number) obj).intValue();
                aaaab aaaab = this.f20662a;
                MatchResult a = aaaab.f20661a.f20658c;
                bbbac a2 = bbbaa.aaaaa.m22058a(a.start(intValue), a.end(intValue));
                if (a2.mo52840a() < 0) {
                    return null;
                }
                String group = aaaab.f20661a.f20658c.group(intValue);
                bbabc.m22048a((Object) group, "matchResult.group(index)");
                return new bbcaa(group, a2);
            }
        }

        aaaab(bbcba bbcba) {
            this.f20661a = bbcba;
        }

        /* renamed from: a */
        public final int mo52791a() {
            return this.f20661a.f20658c.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj != null ? obj instanceof bbcaa : true)) {
                return false;
            }
            return super.contains((bbcaa) obj);
        }

        public final boolean isEmpty() {
            return false;
        }

        public final Iterator<bbcaa> iterator() {
            bbabc.m22051b(this, "receiver$0");
            Iterable bbbac = new bbbac(0, size() - 1);
            bbabc.m22051b(bbbac, "receiver$0");
            return bbbbb.m22063a(new bacac(bbbac), new aaaaa(this)).mo52829a();
        }
    }

    public bbcba(Matcher matcher, CharSequence charSequence) {
        bbabc.m22051b(matcher, "matcher");
        bbabc.m22051b(charSequence, "input");
        this.f20658c = matcher;
        this.f20659d = charSequence;
    }

    /* renamed from: a */
    public final List<String> mo52859a() {
        if (this.f20657b == null) {
            this.f20657b = new aaaaa(this);
        }
        List<String> list = this.f20657b;
        if (list == null) {
            bbabc.m22047a();
        }
        return list;
    }
}
