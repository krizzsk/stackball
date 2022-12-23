package com.ogury.p244cm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.cm.internal.bbbcc */
final class bbbcc implements bbbba<bbbac> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f20644a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f20645b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f20646c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final bbaac<CharSequence, Integer, babbc<Integer, Integer>> f20647d;

    /* renamed from: com.ogury.cm.internal.bbbcc$aaaaa */
    public static final class aaaaa implements Iterator<bbbac> {

        /* renamed from: a */
        final /* synthetic */ bbbcc f20648a;

        /* renamed from: b */
        private int f20649b = -1;

        /* renamed from: c */
        private int f20650c;

        /* renamed from: d */
        private int f20651d;

        /* renamed from: e */
        private bbbac f20652e;

        /* renamed from: f */
        private int f20653f;

        aaaaa(bbbcc bbbcc) {
            this.f20648a = bbbcc;
            int d = bbbcc.f20645b;
            int length = bbbcc.f20644a.length();
            if (length >= 0) {
                if (d < 0) {
                    d = 0;
                } else if (d > length) {
                    d = length;
                }
                this.f20650c = d;
                this.f20651d = d;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            if (r0 < com.ogury.p244cm.internal.bbbcc.m22070a(r6.f20648a)) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m22075a() {
            /*
                r6 = this;
                int r0 = r6.f20651d
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f20649b = r1
                r0 = 0
                r6.f20652e = r0
                return
            L_0x000b:
                com.ogury.cm.internal.bbbcc r0 = r6.f20648a
                int r0 = r0.f20646c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0022
                int r0 = r6.f20653f
                int r0 = r0 + r3
                r6.f20653f = r0
                com.ogury.cm.internal.bbbcc r4 = r6.f20648a
                int r4 = r4.f20646c
                if (r0 >= r4) goto L_0x0030
            L_0x0022:
                int r0 = r6.f20651d
                com.ogury.cm.internal.bbbcc r4 = r6.f20648a
                java.lang.CharSequence r4 = r4.f20644a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0046
            L_0x0030:
                int r0 = r6.f20650c
                com.ogury.cm.internal.bbbac r1 = new com.ogury.cm.internal.bbbac
                com.ogury.cm.internal.bbbcc r4 = r6.f20648a
                java.lang.CharSequence r4 = r4.f20644a
                int r4 = com.ogury.p244cm.internal.bbcbc.m22099b(r4)
                r1.<init>(r0, r4)
            L_0x0041:
                r6.f20652e = r1
            L_0x0043:
                r6.f20651d = r2
                goto L_0x0096
            L_0x0046:
                com.ogury.cm.internal.bbbcc r0 = r6.f20648a
                com.ogury.cm.internal.bbaac r0 = r0.f20647d
                com.ogury.cm.internal.bbbcc r4 = r6.f20648a
                java.lang.CharSequence r4 = r4.f20644a
                int r5 = r6.f20651d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo52836a(r4, r5)
                com.ogury.cm.internal.babbc r0 = (com.ogury.p244cm.internal.babbc) r0
                if (r0 != 0) goto L_0x0072
                int r0 = r6.f20650c
                com.ogury.cm.internal.bbbac r1 = new com.ogury.cm.internal.bbbac
                com.ogury.cm.internal.bbbcc r4 = r6.f20648a
                java.lang.CharSequence r4 = r4.f20644a
                int r4 = com.ogury.p244cm.internal.bbcbc.m22099b(r4)
                r1.<init>(r0, r4)
                goto L_0x0041
            L_0x0072:
                java.lang.Object r2 = r0.mo52785c()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo52786d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f20650c
                com.ogury.cm.internal.bbbac r4 = com.ogury.p244cm.internal.bbbaa.aaaaa.m22058a(r4, r2)
                r6.f20652e = r4
                int r2 = r2 + r0
                r6.f20650c = r2
                if (r0 != 0) goto L_0x0094
                r1 = 1
            L_0x0094:
                int r2 = r2 + r1
                goto L_0x0043
            L_0x0096:
                r6.f20649b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p244cm.internal.bbbcc.aaaaa.m22075a():void");
        }

        public final boolean hasNext() {
            if (this.f20649b == -1) {
                m22075a();
            }
            return this.f20649b == 1;
        }

        public final /* synthetic */ Object next() {
            if (this.f20649b == -1) {
                m22075a();
            }
            if (this.f20649b != 0) {
                bbbac bbbac = this.f20652e;
                if (bbbac != null) {
                    this.f20652e = null;
                    this.f20649b = -1;
                    return bbbac;
                }
                throw new babca("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bbbcc(CharSequence charSequence, int i, int i2, bbaac<? super CharSequence, ? super Integer, babbc<Integer, Integer>> bbaac) {
        bbabc.m22051b(charSequence, "input");
        bbabc.m22051b(bbaac, "getNextMatch");
        this.f20644a = charSequence;
        this.f20647d = bbaac;
    }

    /* renamed from: a */
    public final Iterator<bbbac> mo52829a() {
        return new aaaaa(this);
    }
}
