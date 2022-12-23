package com.iab.omid.library.corpmailru.walking.p100a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.b */
public abstract class C4645b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4646a f10473a;

    /* renamed from: d */
    public final C4647b f10474d;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$a */
    public interface C4646a {
        /* renamed from: a */
        void mo38869a(C4645b bVar);
    }

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$b */
    public interface C4647b {
        /* renamed from: a */
        void mo38870a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo38871b();
    }

    public C4645b(C4647b bVar) {
        this.f10474d = bVar;
    }

    /* renamed from: a */
    public void mo38865a(C4646a aVar) {
        this.f10473a = aVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        C4646a aVar = this.f10473a;
        if (aVar != null) {
            aVar.mo38869a(this);
        }
    }

    /* renamed from: a */
    public void mo38867a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
