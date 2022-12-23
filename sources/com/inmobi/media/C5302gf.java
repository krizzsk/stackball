package com.inmobi.media;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: com.inmobi.media.gf */
/* compiled from: VastBitRateNetworkConnection */
public final class C5302gf extends C5297ga {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5300gd mo40612a() {
        return super.mo40612a();
    }

    public C5302gf(C5299gc gcVar) {
        super(gcVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5300gd mo40613b() {
        C5300gd gdVar = new C5300gd();
        try {
            this.f12119c.getResponseCode();
            gdVar.f12146b = this.f12119c.getContentLength();
            this.f12119c.disconnect();
        } catch (SocketTimeoutException unused) {
            gdVar.f12145a = new C5298gb(504, "HTTP_GATEWAY_TIMEOUT");
        } catch (IOException unused2) {
            gdVar.f12145a = new C5298gb(-2, "NETWORK_IO_ERROR");
        } catch (OutOfMemoryError unused3) {
            gdVar.f12145a = new C5298gb(-3, "OUT_OF_MEMORY_ERROR");
        } catch (Exception unused4) {
            gdVar.f12145a = new C5298gb(-1, "UNKNOWN_ERROR");
        } catch (Throwable th) {
            this.f12119c.disconnect();
            throw th;
        }
        return gdVar;
    }
}
