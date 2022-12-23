package com.iab.omid.library.smaato.walking.p124a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.a.b */
public abstract class C4842b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4843a f10909a;

    /* renamed from: d */
    protected final C4844b f10910d;

    /* renamed from: com.iab.omid.library.smaato.walking.a.b$a */
    public interface C4843a {
        /* renamed from: a */
        void mo39597a(C4842b bVar);
    }

    /* renamed from: com.iab.omid.library.smaato.walking.a.b$b */
    public interface C4844b {
        /* renamed from: a */
        void mo39598a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo39599b();
    }

    public C4842b(C4844b bVar) {
        this.f10910d = bVar;
    }

    /* renamed from: a */
    public void mo39593a(C4843a aVar) {
        this.f10909a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4843a aVar = this.f10909a;
        if (aVar != null) {
            aVar.mo39597a(this);
        }
    }

    /* renamed from: a */
    public void mo39595a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
