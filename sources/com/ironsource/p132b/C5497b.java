package com.ironsource.p132b;

import android.os.AsyncTask;
import android.util.Pair;
import com.ironsource.p133c.C5500b;
import java.util.ArrayList;

/* renamed from: com.ironsource.b.b */
public final class C5497b extends AsyncTask<Object, Void, Boolean> {

    /* renamed from: a */
    private ArrayList f12656a;

    /* renamed from: b */
    private C5498c f12657b;

    public C5497b() {
    }

    public C5497b(C5498c cVar) {
        this.f12657b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Boolean doInBackground(Object... objArr) {
        try {
            this.f12656a = objArr[2];
            boolean z = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", WebRequest.CONTENT_TYPE_JSON));
            if (C5500b.m13053a(objArr[1], objArr[0], arrayList).f12675a != 200) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        C5498c cVar = this.f12657b;
        if (cVar != null) {
            cVar.mo41201a(this.f12656a, bool.booleanValue());
        }
    }
}
