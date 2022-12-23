package com.ogury.p244cm.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.aaid.OguryAaid;

/* renamed from: com.ogury.cm.internal.ababb */
public final class ababb {

    /* renamed from: a */
    public static final ababb f20396a = new ababb();

    /* renamed from: com.ogury.cm.internal.ababb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<String> {

        /* renamed from: a */
        final /* synthetic */ Context f20397a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(Context context) {
            super(0);
            this.f20397a = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            OguryAaid aaid = InternalCore.getAaid(this.f20397a);
            bbabc.m22048a((Object) aaid, "InternalCore.getAaid(context)");
            return aaid.getId();
        }
    }

    /* renamed from: com.ogury.cm.internal.ababb$aaaab */
    static final class aaaab extends bbaca implements bbaab<String, babcc> {

        /* renamed from: a */
        final /* synthetic */ ababa f20398a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(ababa ababa) {
            super(1);
            this.f20398a = ababa;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo52626a(Object obj) {
            String str = (String) obj;
            ababa ababa = this.f20398a;
            bbabc.m22048a((Object) str, "aaid");
            ababa.mo52607a(str);
            return babcc.f20603a;
        }
    }

    private ababb() {
    }

    /* renamed from: a */
    public static void m21806a(Context context, ababa ababa) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(ababa, "aaidCallback");
        new abacb(new aaaaa(context)).mo52672a(new aaaab(ababa));
    }
}
