package com.iab.omid.library.oguryco.walking.p118a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.a.b */
public abstract class C4794b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4795a f10810a;

    /* renamed from: d */
    protected final C4796b f10811d;

    /* renamed from: com.iab.omid.library.oguryco.walking.a.b$a */
    public interface C4795a {
        /* renamed from: a */
        void mo39435a(C4794b bVar);
    }

    /* renamed from: com.iab.omid.library.oguryco.walking.a.b$b */
    public interface C4796b {
        /* renamed from: a */
        void mo39436a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo39437b();
    }

    public C4794b(C4796b bVar) {
        this.f10811d = bVar;
    }

    /* renamed from: a */
    public void mo39431a(C4795a aVar) {
        this.f10810a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4795a aVar = this.f10810a;
        if (aVar != null) {
            aVar.mo39435a(this);
        }
    }

    /* renamed from: a */
    public void mo39433a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
