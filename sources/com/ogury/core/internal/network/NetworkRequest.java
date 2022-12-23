package com.ogury.core.internal.network;

import com.ogury.core.internal.C7920ah;
import com.ogury.core.internal.C7921ai;

/* compiled from: NetworkRequest.kt */
public final class NetworkRequest {

    /* renamed from: a */
    private final String f20770a;

    /* renamed from: b */
    private final String f20771b;

    /* renamed from: c */
    private final String f20772c;

    /* renamed from: d */
    private final HeadersLoader f20773d;

    public NetworkRequest(String str, String str2, String str3, HeadersLoader headersLoader) {
        C7921ai.m22144b(str, "url");
        C7921ai.m22144b(str2, "method");
        C7921ai.m22144b(str3, "body");
        C7921ai.m22144b(headersLoader, "headers");
        this.f20770a = str;
        this.f20771b = str2;
        this.f20772c = str3;
        this.f20773d = headersLoader;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkRequest(String str, String str2, String str3, HeadersLoader headersLoader, int i, C7920ah ahVar) {
        this(str, str2, (i & 4) != 0 ? "" : str3, headersLoader);
    }

    public final String getBody() {
        return this.f20772c;
    }

    public final HeadersLoader getHeaders() {
        return this.f20773d;
    }

    public final String getMethod() {
        return this.f20771b;
    }

    public final String getUrl() {
        return this.f20770a;
    }
}
