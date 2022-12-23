package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;

public abstract class it1 extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C13447a f35031a;

    /* renamed from: b */
    protected final C13448b f35032b;

    /* renamed from: com.yandex.mobile.ads.impl.it1$a */
    public interface C13447a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.it1$b */
    public interface C13448b {
    }

    public it1(C13448b bVar) {
        this.f35032b = bVar;
    }

    /* renamed from: a */
    public void mo67893a(C13447a aVar) {
        this.f35031a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C13447a aVar = this.f35031a;
        if (aVar != null) {
            ((ot1) aVar).mo69267a(this);
        }
    }
}
