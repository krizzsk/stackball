package com.iab.omid.library.adcolony.walking.p094a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.b */
public abstract class C4595b extends AsyncTask<Object, Void, String> {

    /* renamed from: d */
    protected final C4597b f10360d;

    /* renamed from: e */
    private C4596a f10361e;

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$a */
    public interface C4596a {
        /* renamed from: a */
        void mo38675a(C4595b bVar);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$b */
    public interface C4597b {
        /* renamed from: a */
        void mo38676a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo38677b();
    }

    public C4595b(C4597b bVar) {
        this.f10360d = bVar;
    }

    /* renamed from: a */
    public void mo38671a(C4596a aVar) {
        this.f10361e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4596a aVar = this.f10361e;
        if (aVar != null) {
            aVar.mo38675a(this);
        }
    }

    /* renamed from: a */
    public void mo38673a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
