package com.ogury.p245ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.network.OguryNetworkResponse;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ex */
public final class C8210ex {

    /* renamed from: a */
    public static final C8210ex f21258a = new C8210ex();

    private C8210ex() {
    }

    /* renamed from: a */
    public final void mo53452a(List<C8185eb> list, C8207ev evVar, C8171dv dvVar) throws C8209ew {
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        C8467mq.m23881b(evVar, "mraidDao");
        C8467mq.m23881b(dvVar, "presageApi");
        C8185eb a = m22961a(list);
        if (a != null) {
            if (!(!C8467mq.m23880a((Object) a.mo53361k(), (Object) evVar.mo53448a()))) {
                if (!(evVar.mo53450b().length() == 0)) {
                    return;
                }
            }
            try {
                m22962a(a.mo53361k(), true, evVar, dvVar);
            } catch (C8209ew e) {
                C8147di diVar = C8147di.f21106a;
                C8147di.m22716a((C8146dh) new C8157dl("loaded_error", a));
                throw e;
            }
        }
    }

    /* renamed from: a */
    private static C8185eb m22961a(List<C8185eb> list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C8185eb) obj).mo53361k().length() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C8185eb) obj;
    }

    /* renamed from: a */
    private final void m22962a(String str, boolean z, C8207ev evVar, C8171dv dvVar) throws C8209ew {
        OguryNetworkResponse b = dvVar.mo53324b(str);
        if (b instanceof OguryNetworkResponse.Success) {
            OguryNetworkResponse.Success success = (OguryNetworkResponse.Success) b;
            String responseBody = success.getResponseBody();
            C8467mq.m23878a((Object) responseBody, "response.responseBody");
            if (responseBody.length() > 0) {
                String responseBody2 = success.getResponseBody();
                C8467mq.m23878a((Object) responseBody2, "response.responseBody");
                evVar.mo53449a(responseBody2);
                evVar.mo53451b(str);
                return;
            }
        }
        if (z) {
            Thread.sleep(400);
            m22962a(str, false, evVar, dvVar);
            return;
        }
        throw new C8209ew();
    }
}
