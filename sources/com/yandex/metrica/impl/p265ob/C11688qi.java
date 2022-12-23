package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.yandex.metrica.impl.ob.qi */
public class C11688qi implements C11989yi {

    /* renamed from: b */
    private static final IIdentifierCallback f28026b = new C11689a();

    /* renamed from: a */
    private final AtomicReference<IIdentifierCallback> f28027a;

    /* renamed from: com.yandex.metrica.impl.ob.qi$a */
    class C11689a implements IIdentifierCallback {
        C11689a() {
        }

        public void onReceive(Map<String, String> map) {
        }

        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }

    public C11688qi(IIdentifierCallback iIdentifierCallback) {
        this.f28027a = new AtomicReference<>(iIdentifierCallback);
    }

    /* renamed from: a */
    public void mo63552a(IParamsCallback.Reason reason, Map<String, C11258g1> map) {
        IIdentifierCallback.Reason reason2;
        IIdentifierCallback andSet = this.f28027a.getAndSet(f28026b);
        int ordinal = reason.ordinal();
        if (ordinal == 1) {
            reason2 = IIdentifierCallback.Reason.NETWORK;
        } else if (ordinal != 2) {
            reason2 = IIdentifierCallback.Reason.UNKNOWN;
        } else {
            reason2 = IIdentifierCallback.Reason.INVALID_RESPONSE;
        }
        andSet.onRequestError(reason2);
    }

    public void onReceive(Map<String, C11258g1> map) {
        IIdentifierCallback andSet = this.f28027a.getAndSet(f28026b);
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(next.getKey(), ((C11258g1) next.getValue()).f26933a);
        }
        andSet.onReceive(hashMap);
    }
}
