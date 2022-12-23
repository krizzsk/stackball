package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.hw */
final class C9394hw extends C9378ho implements C9328gp {

    /* renamed from: a */
    public static final C9093bi f23291a = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            bnVar.mo57868h();
            String str = "";
            String str2 = str;
            while (bnVar.mo57870j()) {
                String l = bnVar.mo57872l();
                if ("campaign_id".equals(l)) {
                    str = bnVar.mo57858c("");
                } else if ("product_id".equals(l)) {
                    str2 = bnVar.mo57858c("");
                } else {
                    bnVar.mo57879s();
                }
            }
            bnVar.mo57869i();
            return new C9394hw(str, str2);
        }
    };

    /* renamed from: b */
    private final String f23292b;

    /* renamed from: c */
    private final String f23293c;

    C9394hw(String str, String str2) {
        this.f23292b = str;
        this.f23293c = str2;
    }

    /* renamed from: a */
    public final String mo58216a() {
        return this.f23292b;
    }

    /* renamed from: b */
    public final String mo58217b() {
        return this.f23293c;
    }
}
