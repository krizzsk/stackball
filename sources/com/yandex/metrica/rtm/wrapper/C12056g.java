package com.yandex.metrica.rtm.wrapper;

import com.yandex.metrica.rtm.client.DataSender;
import com.yandex.metrica.rtm.client.ReporterDescriptor;
import com.yandex.metrica.rtm.client.Utils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.rtm.wrapper.g */
public class C12056g implements C12053d {

    /* renamed from: a */
    private final DataSender f29004a;

    public C12056g(C12060k kVar, String str, boolean z) throws Throwable {
        this(new C12051b(new DataSender(new C12062m(kVar), new ReporterDescriptor(str, z))));
    }

    public void reportError(JSONObject jSONObject) {
        try {
            this.f29004a.sendData(jSONObject.toString(), "com.yandex.metrica.rtm.REPORT_ERROR");
        } catch (Throwable unused) {
        }
    }

    public void reportEvent(JSONObject jSONObject) {
        try {
            this.f29004a.sendData(jSONObject.toString(), "com.yandex.metrica.rtm.REPORT_EVENT");
        } catch (Throwable unused) {
        }
    }

    public void reportException(String str, String str2) {
        try {
            this.f29004a.sendData(new JSONObject().put("message", str).put("exception", str2).toString(), "com.yandex.metrica.rtm.REPORT_EXCEPTION");
        } catch (Throwable unused) {
        }
    }

    public void sendData(String str) {
        try {
            this.f29004a.sendData(str, "com.yandex.metrica.rtm.SET_DATA");
        } catch (Throwable unused) {
        }
    }

    C12056g(C12051b bVar) throws Throwable {
        this.f29004a = bVar.mo64327a();
    }

    public void reportException(String str, Throwable th) {
        try {
            this.f29004a.sendData(new JSONObject().put("message", str).put("exception", Utils.getShrunkStacktrace(th)).toString(), "com.yandex.metrica.rtm.REPORT_EXCEPTION");
        } catch (Throwable unused) {
        }
    }
}
