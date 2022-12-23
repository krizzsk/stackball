package com.tapjoy.internal;

import android.os.AsyncTask;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dy */
public abstract class C9181dy extends AsyncTask {

    /* renamed from: d */
    C9182a f22566d;

    /* renamed from: e */
    protected final C9183b f22567e;

    /* renamed from: com.tapjoy.internal.dy$a */
    public interface C9182a {
        /* renamed from: a */
        void mo57975a();
    }

    /* renamed from: com.tapjoy.internal.dy$b */
    public interface C9183b {
        /* renamed from: a */
        JSONObject mo57976a();

        /* renamed from: a */
        void mo57977a(JSONObject jSONObject);
    }

    public C9181dy(C9183b bVar) {
        this.f22567e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C9182a aVar = this.f22566d;
        if (aVar != null) {
            aVar.mo57975a();
        }
    }
}
