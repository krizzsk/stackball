package com.fyber.inneractive.sdk.player.p059c.p074g;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.p059c.C3300q;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3442a;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3454d;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3497b;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3528s;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.g.b */
public final class C3450b implements C3454d, C3454d.C3455a {

    /* renamed from: a */
    private final Uri f9341a;

    /* renamed from: b */
    private final C3506g.C3507a f9342b;

    /* renamed from: c */
    private final C3271i f9343c;

    /* renamed from: d */
    private final int f9344d;

    /* renamed from: e */
    private final Handler f9345e;

    /* renamed from: f */
    private final C3451a f9346f;

    /* renamed from: g */
    private final C3300q.C3302a f9347g = new C3300q.C3302a();

    /* renamed from: h */
    private final String f9348h;

    /* renamed from: i */
    private C3454d.C3455a f9349i;

    /* renamed from: j */
    private C3300q f9350j;

    /* renamed from: k */
    private boolean f9351k;

    /* renamed from: com.fyber.inneractive.sdk.player.c.g.b$a */
    public interface C3451a {
        /* renamed from: a */
        void mo18805a(IOException iOException);
    }

    public C3450b(Uri uri, C3506g.C3507a aVar, C3271i iVar, int i, Handler handler, C3451a aVar2, String str) {
        this.f9341a = uri;
        this.f9342b = aVar;
        this.f9343c = iVar;
        this.f9344d = i;
        this.f9345e = handler;
        this.f9346f = aVar2;
        this.f9348h = str;
    }

    /* renamed from: a */
    public final void mo19282a(C3454d.C3455a aVar) {
        this.f9349i = aVar;
        C3459g gVar = new C3459g(-9223372036854775807L, false);
        this.f9350j = gVar;
        aVar.mo19077a(gVar);
    }

    /* renamed from: a */
    public final C3452c mo19279a(int i, C3497b bVar) {
        C3535a.m8782a(i == 0);
        return new C3442a(this.f9341a, this.f9342b.mo18709a(), this.f9343c.mo19002a(), this.f9344d, this.f9345e, this.f9346f, this, bVar, this.f9348h);
    }

    /* renamed from: a */
    public final void mo19281a(C3452c cVar) {
        C3442a aVar = (C3442a) cVar;
        C3442a.C3448b bVar = aVar.f9298e;
        C3528s sVar = aVar.f9297d;
        C3442a.C34453 r2 = new Runnable(bVar) {

            /* renamed from: a */
            final /* synthetic */ C3448b f9322a;

            {
                this.f9322a = r2;
            }

            public final void run() {
                C3448b bVar = this.f9322a;
                if (bVar.f9336a != null) {
                    bVar.f9336a = null;
                }
                int size = C3442a.this.f9302i.size();
                for (int i = 0; i < size; i++) {
                    C3442a.this.f9302i.valueAt(i).mo19036a();
                }
            }
        };
        if (sVar.f9573b != null) {
            sVar.f9573b.mo19360a(true);
        }
        sVar.f9572a.execute(r2);
        sVar.f9572a.shutdown();
        aVar.f9301h.removeCallbacksAndMessages((Object) null);
        aVar.f9315v = true;
    }

    /* renamed from: a */
    public final void mo19280a() {
        this.f9349i = null;
    }

    /* renamed from: a */
    public final void mo19077a(C3300q qVar) {
        boolean z = false;
        if (qVar.mo19104a(0, this.f9347g, false).f8528d != -9223372036854775807L) {
            z = true;
        }
        if (!this.f9351k || z) {
            this.f9350j = qVar;
            this.f9351k = z;
            this.f9349i.mo19077a(qVar);
        }
    }
}
