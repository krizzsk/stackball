package com.iab.omid.library.ironsrc.walking.p112a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.b */
public abstract class C4743b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C4744a f10689a;

    /* renamed from: d */
    protected final C4745b f10690d;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$a */
    public interface C4744a {
        /* renamed from: a */
        void mo39221a(C4743b bVar);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$b */
    public interface C4745b {
        /* renamed from: a */
        void mo39222a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo39223b();
    }

    public C4743b(C4745b bVar) {
        this.f10690d = bVar;
    }

    /* renamed from: a */
    public void mo39217a(C4744a aVar) {
        this.f10689a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C4744a aVar = this.f10689a;
        if (aVar != null) {
            aVar.mo39221a(this);
        }
    }

    /* renamed from: a */
    public void mo39219a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
