package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.internal.C9170ds;
import com.tapjoy.internal.C9181dy;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ec */
public final class C9188ec extends C9180dx {
    public C9188ec(C9181dy.C9183b bVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C9150dd a;
        if (!TextUtils.isEmpty(str) && (a = C9150dd.m24507a()) != null) {
            for (C9145cz czVar : Collections.unmodifiableCollection(a.f22499a)) {
                if (this.f22563a.contains(czVar.f22483f)) {
                    C9170ds dsVar = czVar.f22480c;
                    if (this.f22565c >= dsVar.f22533e) {
                        dsVar.f22532d = C9170ds.C9171a.f22535b;
                        C9155dg.m24515a().mo57954b(dsVar.mo57966c(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C9163dm.m24540b(this.f22564b, this.f22567e.mo57976a())) {
            return null;
        }
        this.f22567e.mo57977a(this.f22564b);
        return this.f22564b.toString();
    }
}
