package com.chartboost.sdk.Networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.chartboost.sdk.Networking.m */
public class C1863m {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HttpURLConnection mo14357a(C1851c<?> cVar) throws IOException {
        return (HttpURLConnection) new URL(cVar.f4561b).openConnection();
    }
}
