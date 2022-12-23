package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.aaaac */
public abstract class aaaac {

    /* renamed from: com.ogury.cm.internal.aaaac$aaaaa */
    static final class aaaaa extends bbaca implements bbaab<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ aaaac f20282a;

        /* renamed from: b */
        final /* synthetic */ int f20283b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(aaaac aaaac, int i) {
            super(1);
            this.f20282a = aaaac;
            this.f20283b = i;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52626a(Object obj) {
            ((Number) obj).intValue();
            aabcc aabcc = aabcc.f20363a;
            return Boolean.valueOf(aabcc.m21766a(this.f20282a.mo52623a().mo52702c(), this.f20283b));
        }
    }

    /* renamed from: a */
    public static boolean m21685a(int i, Integer[] numArr, bbaab<? super Integer, Boolean> bbaab) {
        bbabc.m22051b(numArr, "conditionValues");
        bbabc.m22051b(bbaab, "unit");
        if (m21686a(numArr, i)) {
            return bbaab.mo52626a(Integer.valueOf(i)).booleanValue();
        }
        abbbc abbbc = abbbc.f20427a;
        abbbc.m21853a("Value that you are trying to check is not valid.");
        return false;
    }

    /* renamed from: a */
    private static boolean m21686a(Integer[] numArr, int i) {
        if (numArr.length == 0) {
            return true;
        }
        if (i != 0) {
            aabcc aabcc = aabcc.f20363a;
            bbabc.m22051b(numArr, "receiver$0");
            int i2 = 0;
            for (Integer intValue : numArr) {
                i2 += intValue.intValue();
            }
            if (aabcc.m21766a(i2, i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract abcab mo52623a();

    /* renamed from: a */
    public final boolean mo52624a(int i) {
        return m21685a(i, mo52625b(), new aaaaa(this, i));
    }

    /* renamed from: b */
    public abstract Integer[] mo52625b();
}
