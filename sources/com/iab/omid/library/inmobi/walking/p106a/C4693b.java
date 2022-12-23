package com.iab.omid.library.inmobi.walking.p106a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.b */
public abstract class C4693b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4694a f10575a;

    /* renamed from: d */
    protected final C4695b f10576d;

    /* renamed from: com.iab.omid.library.inmobi.walking.a.b$a */
    public interface C4694a {
        /* renamed from: a */
        void mo39035a(C4693b bVar);
    }

    /* renamed from: com.iab.omid.library.inmobi.walking.a.b$b */
    public interface C4695b {
        /* renamed from: a */
        void mo39036a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo39037b();
    }

    public C4693b(C4695b bVar) {
        this.f10576d = bVar;
    }

    /* renamed from: a */
    public void mo39031a(C4694a aVar) {
        this.f10575a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4694a aVar = this.f10575a;
        if (aVar != null) {
            aVar.mo39035a(this);
        }
    }

    /* renamed from: a */
    public void mo39033a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
