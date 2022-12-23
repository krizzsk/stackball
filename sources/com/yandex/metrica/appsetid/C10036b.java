package com.yandex.metrica.appsetid;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: com.yandex.metrica.appsetid.b */
public final class C10036b implements C10039d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f24077a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<OnCompleteListener<AppSetIdInfo>> f24078b = new ArrayList();

    /* renamed from: com.yandex.metrica.appsetid.b$a */
    static final class C10037a<TResult> implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: a */
        final /* synthetic */ C10036b f24079a;

        /* renamed from: b */
        final /* synthetic */ C10035a f24080b;

        C10037a(C10036b bVar, C10035a aVar) {
            this.f24079a = bVar;
            this.f24080b = aVar;
        }

        public final void onComplete(Task<AppSetIdInfo> task) {
            C10038c cVar;
            synchronized (this.f24079a.f24077a) {
                List a = this.f24079a.f24078b;
                C10036b bVar = this.f24079a;
                if (a != null) {
                    TypeIntrinsics.asMutableCollection(a).remove(bVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                }
            }
            Intrinsics.checkNotNullExpressionValue(task, "it");
            if (task.isSuccessful()) {
                C10035a aVar = this.f24080b;
                AppSetIdInfo result = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result, "it.result");
                String id = result.getId();
                C10036b bVar2 = this.f24079a;
                AppSetIdInfo result2 = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result2, "it.result");
                int scope = result2.getScope();
                bVar2.getClass();
                if (scope == 1) {
                    cVar = C10038c.APP;
                } else if (scope != 2) {
                    cVar = C10038c.UNKNOWN;
                } else {
                    cVar = C10038c.DEVELOPER;
                }
                aVar.mo60933a(id, cVar);
                return;
            }
            this.f24080b.mo60934a(task.getException());
        }
    }

    /* renamed from: a */
    public void mo60935a(Context context, C10035a aVar) throws Throwable {
        AppSetIdClient client = AppSet.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "AppSet.getClient(context)");
        Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
        Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
        C10037a aVar2 = new C10037a(this, aVar);
        synchronized (this.f24077a) {
            this.f24078b.add(aVar2);
        }
        appSetIdInfo.addOnCompleteListener(aVar2);
    }
}
