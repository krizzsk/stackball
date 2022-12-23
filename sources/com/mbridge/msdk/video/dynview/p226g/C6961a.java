package com.mbridge.msdk.video.dynview.p226g;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.video.dynview.p219b.C6929a;
import com.mbridge.msdk.video.dynview.p219b.C6930b;
import com.mbridge.msdk.video.dynview.p220c.C6931a;
import com.mbridge.msdk.video.dynview.p221d.C6933b;
import com.mbridge.msdk.video.dynview.p221d.C6934c;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.g.a */
/* compiled from: MBridgeUI */
public final class C6961a {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002b, code lost:
        r3 = r9.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6961a(android.content.Context r8, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r9, com.mbridge.msdk.video.dynview.p221d.C6934c r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r7 = this;
            r7.<init>()
            com.mbridge.msdk.video.dynview.i.c r0 = new com.mbridge.msdk.video.dynview.i.c
            r0.<init>()
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r0 = r0.mo42895d()
            int r0 = com.mbridge.msdk.foundation.tools.C6366u.m16224h(r0)
            float r0 = (float) r0
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r1 = r1.mo42895d()
            int r1 = com.mbridge.msdk.foundation.tools.C6366u.m16222g((android.content.Context) r1)
            float r1 = (float) r1
            r2 = 1
            if (r9 == 0) goto L_0x0043
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x0043
            r3 = 0
            java.lang.Object r3 = r9.get(r3)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            if (r3 == 0) goto L_0x0043
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r3.getRewardTemplateMode()
            if (r4 == 0) goto L_0x0043
            com.mbridge.msdk.foundation.entity.CampaignEx$c r3 = r3.getRewardTemplateMode()
            int r3 = r3.mo43508b()
            goto L_0x0044
        L_0x0043:
            r3 = 1
        L_0x0044:
            java.lang.String r4 = "mbridge_same_choice_one_layout_landscape"
            java.lang.String r5 = "mbridge_same_choice_one_layout_portrait"
            r6 = 2
            if (r3 == r2) goto L_0x0058
            if (r3 == r6) goto L_0x0059
            boolean r3 = com.mbridge.msdk.video.dynview.p227h.C6971b.m17585a(r8)
            if (r3 == 0) goto L_0x0055
            r3 = 2
            goto L_0x0059
        L_0x0055:
            r4 = r5
            r3 = 1
            goto L_0x0059
        L_0x0058:
            r4 = r5
        L_0x0059:
            com.mbridge.msdk.video.dynview.b$a r5 = new com.mbridge.msdk.video.dynview.b$a
            r5.<init>()
            com.mbridge.msdk.video.dynview.b$b r8 = r5.mo48430a((android.content.Context) r8)
            com.mbridge.msdk.video.dynview.b$b r8 = r8.mo48432a((java.lang.String) r4)
            com.mbridge.msdk.video.dynview.b$b r8 = r8.mo48429a((int) r2)
            com.mbridge.msdk.video.dynview.b$b r8 = r8.mo48428a((float) r1)
            com.mbridge.msdk.video.dynview.b$b r8 = r8.mo48435b((float) r0)
            com.mbridge.msdk.video.dynview.b$b r8 = r8.mo48433a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r9)
            com.mbridge.msdk.video.dynview.b$b r8 = r8.mo48436b((int) r3)
            com.mbridge.msdk.video.dynview.b r8 = r8.mo48434a()
            r7.m17564a(r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.p226g.C6961a.<init>(android.content.Context, java.util.List, com.mbridge.msdk.video.dynview.d.c, java.util.Map):void");
    }

    public C6961a(C6925b bVar, C6934c cVar, Map<String, Object> map) {
        m17564a(bVar, cVar, map);
    }

    /* renamed from: a */
    private void m17564a(C6925b bVar, final C6934c cVar, Map<String, Object> map) {
        if (cVar != null) {
            if (bVar == null) {
                cVar.mo48344a(C6931a.NOT_FOUND_VIEWOPTION);
            } else if (bVar.mo48420a() == null) {
                cVar.mo48344a(C6931a.NOT_FOUND_CONTEXT);
            } else if (TextUtils.isEmpty(bVar.mo48421b())) {
                cVar.mo48344a(C6931a.NOT_FOUND_LAYOUTNAME);
            } else {
                final View inflate = LayoutInflater.from(bVar.mo48420a()).inflate(C6347k.m16084a(bVar.mo48420a(), bVar.mo48421b(), "layout"), (ViewGroup) null);
                C6930b.m17506a().mo48440a(inflate, bVar, map);
                C6929a.m17503a().mo48439a(inflate, bVar, map, new C6933b() {
                    /* renamed from: a */
                    public final void mo48443a() {
                        cVar.mo48343a(inflate);
                    }

                    /* renamed from: a */
                    public final void mo48444a(C6931a aVar) {
                        cVar.mo48344a(aVar);
                    }
                });
            }
        }
    }
}
