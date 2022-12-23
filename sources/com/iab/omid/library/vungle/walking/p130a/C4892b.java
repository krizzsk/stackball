package com.iab.omid.library.vungle.walking.p130a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.b */
public abstract class C4892b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4893a f11022a;

    /* renamed from: d */
    protected final C4894b f11023d;

    /* renamed from: com.iab.omid.library.vungle.walking.a.b$a */
    public interface C4893a {
        /* renamed from: a */
        void mo39791a(C4892b bVar);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.a.b$b */
    public interface C4894b {
        /* renamed from: a */
        void mo39792a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo39793b();
    }

    public C4892b(C4894b bVar) {
        this.f11023d = bVar;
    }

    /* renamed from: a */
    public void mo39787a(C4893a aVar) {
        this.f11022a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4893a aVar = this.f11022a;
        if (aVar != null) {
            aVar.mo39791a(this);
        }
    }

    /* renamed from: a */
    public void mo39789a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
