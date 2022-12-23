package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.C10080g;
import com.yandex.metrica.impl.p265ob.C11493lg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Kh */
public class C10433Kh {

    /* renamed from: a */
    private final C10463Lh f25060a;

    /* renamed from: b */
    private final C10080g f25061b;

    public C10433Kh() {
        this(new C10463Lh(), C10611Oh.m27142a());
    }

    /* renamed from: a */
    public void mo61668a(C11493lg.C11498e.C11500b bVar) {
        this.f25061b.mo61022b("provided_request_result", this.f25060a.mo61736a(bVar));
    }

    /* renamed from: b */
    public void mo61669b(C11493lg.C11498e.C11499a aVar) {
        String str;
        C10080g gVar = this.f25061b;
        this.f25060a.getClass();
        try {
            str = new JSONObject().put("id", aVar.f27680a).toString();
        } catch (Throwable th) {
            str = th.toString();
        }
        gVar.mo61022b("provided_request_send", str);
    }

    C10433Kh(C10463Lh lh, C10080g gVar) {
        this.f25060a = lh;
        this.f25061b = gVar;
    }

    /* renamed from: a */
    public void mo61667a(C11493lg.C11498e.C11499a aVar) {
        String str;
        C10080g gVar = this.f25061b;
        this.f25060a.getClass();
        try {
            str = new JSONObject().put("id", aVar.f27680a).toString();
        } catch (Throwable th) {
            str = th.toString();
        }
        gVar.mo61022b("provided_request_schedule", str);
    }
}
