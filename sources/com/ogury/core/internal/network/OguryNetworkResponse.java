package com.ogury.core.internal.network;

import com.ogury.core.internal.C7920ah;
import com.ogury.core.internal.C7921ai;

/* compiled from: OguryNetworkResponse.kt */
public abstract class OguryNetworkResponse {

    /* compiled from: OguryNetworkResponse.kt */
    public static final class Success extends OguryNetworkResponse {

        /* renamed from: a */
        private final String f20778a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super((C7920ah) null);
            C7921ai.m22144b(str, "responseBody");
            this.f20778a = str;
        }

        public final String getResponseBody() {
            return this.f20778a;
        }
    }

    private OguryNetworkResponse() {
    }

    public /* synthetic */ OguryNetworkResponse(C7920ah ahVar) {
        this();
    }

    /* compiled from: OguryNetworkResponse.kt */
    public static final class Failure extends OguryNetworkResponse {

        /* renamed from: a */
        private final Throwable f20777a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Throwable th) {
            super((C7920ah) null);
            C7921ai.m22144b(th, "exception");
            this.f20777a = th;
        }

        public final Throwable getException() {
            return this.f20777a;
        }
    }
}
