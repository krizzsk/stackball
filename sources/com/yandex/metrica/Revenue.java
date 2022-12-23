package com.yandex.metrica;

import com.yandex.metrica.impl.p265ob.C11697qo;
import com.yandex.metrica.impl.p265ob.C11726ro;
import com.yandex.metrica.impl.p265ob.C11829uo;
import java.util.Currency;

public class Revenue {
    public final Currency currency;
    public final String payload;
    @Deprecated
    public final Double price;
    public final Long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public String f24049a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f24050b;

            Builder() {
            }

            public Receipt build() {
                return new Receipt(this);
            }

            public Builder withData(String str) {
                this.f24049a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f24050b = str;
                return this;
            }
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        private Receipt(Builder builder) {
            this.data = builder.f24049a;
            this.signature = builder.f24050b;
        }
    }

    @Deprecated
    public static Builder newBuilder(double d, Currency currency2) {
        return new Builder(d, currency2);
    }

    public static Builder newBuilderWithMicros(long j, Currency currency2) {
        return new Builder(j, currency2);
    }

    private Revenue(Builder builder) {
        this.price = builder.f24042a;
        this.priceMicros = builder.f24043b;
        this.currency = builder.f24044c;
        this.quantity = builder.f24045d;
        this.productID = builder.f24046e;
        this.payload = builder.f24047f;
        this.receipt = builder.f24048g;
    }

    public static class Builder {

        /* renamed from: h */
        private static final C11829uo<Currency> f24041h = new C11726ro(new C11697qo("revenue currency"));

        /* renamed from: a */
        Double f24042a;

        /* renamed from: b */
        Long f24043b;

        /* renamed from: c */
        Currency f24044c;

        /* renamed from: d */
        Integer f24045d;

        /* renamed from: e */
        String f24046e;

        /* renamed from: f */
        String f24047f;

        /* renamed from: g */
        Receipt f24048g;

        Builder(double d, Currency currency) {
            ((C11726ro) f24041h).mo61590a(currency);
            this.f24042a = Double.valueOf(d);
            this.f24044c = currency;
        }

        public Revenue build() {
            return new Revenue(this);
        }

        public Builder withPayload(String str) {
            this.f24047f = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f24046e = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f24045d = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f24048g = receipt;
            return this;
        }

        Builder(long j, Currency currency) {
            ((C11726ro) f24041h).mo61590a(currency);
            this.f24043b = Long.valueOf(j);
            this.f24044c = currency;
        }
    }
}
