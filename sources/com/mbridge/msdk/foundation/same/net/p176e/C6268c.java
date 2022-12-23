package com.mbridge.msdk.foundation.same.net.p176e;

import com.mbridge.msdk.foundation.same.net.C6290i;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p176e.C6265b;
import com.mbridge.msdk.foundation.same.net.p177f.C6271b;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.MediaType;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.RequestBody;
import com.mbridge.msdk.thrid.okhttp.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.c */
/* compiled from: OkHttpStack */
public final class C6268c implements C6264a {

    /* renamed from: a */
    private final OkHttpClient f15540a = C6265b.C6267a.f15539a.mo43847a();

    /* renamed from: b */
    private static RequestBody m15838b(C6290i iVar) {
        byte[] e = iVar.mo43844e();
        if (e == null) {
            return null;
        }
        return RequestBody.create((MediaType) null, e);
    }

    /* renamed from: a */
    public final C6271b mo43846a(C6290i<?> iVar) throws IOException {
        int h = iVar.mo43888h();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Protocol.HTTP_1_1);
        arrayList.add(Protocol.HTTP_2);
        long j = (long) h;
        OkHttpClient build = this.f15540a.newBuilder().protocols(arrayList).readTimeout(j, TimeUnit.MILLISECONDS).connectTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).build();
        Request.Builder builder = new Request.Builder();
        Map<String, String> d = iVar.mo43886d();
        for (String next : d.keySet()) {
            builder.addHeader(next, d.get(next));
        }
        for (Map.Entry next2 : iVar.mo43886d().entrySet()) {
            builder.addHeader((String) next2.getKey(), (String) next2.getValue());
        }
        switch (iVar.mo43873a()) {
            case 0:
                builder.get();
                break;
            case 1:
                builder.post(m15838b(iVar));
                break;
            case 2:
                builder.put(m15838b(iVar));
                break;
            case 3:
                builder.delete();
                break;
            case 4:
                builder.head();
                break;
            case 5:
                builder.method("OPTIONS", (RequestBody) null);
                break;
            case 6:
                builder.method("TRACE", (RequestBody) null);
                break;
            case 7:
                builder.patch(m15838b(iVar));
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        Response execute = build.newCall(builder.url(iVar.mo43883b()).build()).execute();
        Headers headers = execute.headers();
        ArrayList arrayList2 = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if (name != null) {
                arrayList2.add(new C6245b(name, value));
            }
        }
        return new C6271b(execute.code(), arrayList2, execute.body().byteStream());
    }
}
