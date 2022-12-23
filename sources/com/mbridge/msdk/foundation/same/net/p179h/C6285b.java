package com.mbridge.msdk.foundation.same.net.p179h;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p164db.p165a.C6138a;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.net.C6235Aa;
import com.mbridge.msdk.foundation.same.net.C6237a;
import com.mbridge.msdk.foundation.same.net.C6241b;
import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.C6290i;
import com.mbridge.msdk.foundation.same.net.C6294l;
import com.mbridge.msdk.foundation.same.net.C6295m;
import com.mbridge.msdk.foundation.same.net.C6299n;
import com.mbridge.msdk.foundation.same.net.p175d.C6259c;
import com.mbridge.msdk.foundation.same.net.p175d.C6260d;
import com.mbridge.msdk.foundation.same.net.p175d.C6262f;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import java.io.File;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.same.net.h.b */
/* compiled from: CommonAsyncHttpRequest */
public class C6285b {

    /* renamed from: b */
    private static final String f15596b = C6285b.class.getSimpleName();

    /* renamed from: a */
    protected Context f15597a;

    public C6285b(Context context) {
        if (context == null) {
            this.f15597a = C6122a.m15302b().mo42895d();
        } else {
            this.f15597a = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public void mo42743a(String str, C6287d dVar) {
        if (dVar != null) {
            dVar.mo43870a("open", C6204a.f15410t);
            String a = C6235Aa.m15777a();
            if (a == null) {
                a = "";
            }
            dVar.mo43870a("channel", a);
            dVar.mo43870a("band_width", C6237a.m15781a().mo43815b() + "");
            String str2 = dVar.mo43871b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    dVar.mo43870a("ch_info", customInfoByUnitId);
                }
                C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), str2);
                if (e != null && !TextUtils.isEmpty(e.mo42770a())) {
                    dVar.mo43870a("u_stid", e.mo42770a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43864a(int i, String str, C6287d dVar, C6263e eVar) {
        mo43865a(i, str, dVar, new C6241b(), eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43865a(int r7, java.lang.String r8, com.mbridge.msdk.foundation.same.net.p179h.C6287d r9, com.mbridge.msdk.foundation.same.net.C6294l r10, com.mbridge.msdk.foundation.same.net.C6263e r11) {
        /*
            r6 = this;
            if (r9 != 0) goto L_0x0008
            com.mbridge.msdk.foundation.same.net.h.d r0 = new com.mbridge.msdk.foundation.same.net.h.d     // Catch:{ Exception -> 0x005f }
            r0.<init>()     // Catch:{ Exception -> 0x005f }
            r9 = r0
        L_0x0008:
            r6.mo42743a(r8, r9)     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.same.net.p179h.C6288e.m15897c(r9)     // Catch:{ Exception -> 0x005f }
            java.util.Map r0 = r9.mo43871b()     // Catch:{ Exception -> 0x005f }
            java.lang.String r1 = "sign"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x005f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005f }
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x001f
            r0 = r1
        L_0x001f:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = "ts"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
            r5.<init>()     // Catch:{ Exception -> 0x005f }
            r5.append(r2)     // Catch:{ Exception -> 0x005f }
            r5.append(r1)     // Catch:{ Exception -> 0x005f }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x005f }
            r9.mo43870a(r4, r1)     // Catch:{ Exception -> 0x005f }
            java.lang.String r1 = "st"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
            r4.<init>()     // Catch:{ Exception -> 0x005f }
            r4.append(r2)     // Catch:{ Exception -> 0x005f }
            r4.append(r0)     // Catch:{ Exception -> 0x005f }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x005f }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r0)     // Catch:{ Exception -> 0x005f }
            r9.mo43870a(r1, r0)     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.same.net.g.c r0 = com.mbridge.msdk.foundation.same.net.p178g.C6276c.m15863a()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.same.net.k r0 = r0.mo43855a((com.mbridge.msdk.foundation.same.net.p179h.C6287d) r9)     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x0069
            if (r11 == 0) goto L_0x0069
            r11.mo43799a(r0)     // Catch:{ Exception -> 0x005f }
            return
        L_0x005f:
            r0 = move-exception
            java.lang.String r1 = f15596b
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r1, r0)
        L_0x0069:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "?"
            r0.append(r8)
            java.lang.String r8 = r9.toString()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9 = 0
            r0 = 0
            if (r7 == 0) goto L_0x0098
            r1 = 1
            if (r7 == r1) goto L_0x0092
            r1 = 2
            if (r7 == r1) goto L_0x008c
            goto L_0x009e
        L_0x008c:
            com.mbridge.msdk.foundation.same.net.d.c r7 = new com.mbridge.msdk.foundation.same.net.d.c
            r7.<init>(r9, r8, r0, r11)
            goto L_0x009d
        L_0x0092:
            com.mbridge.msdk.foundation.same.net.d.d r7 = new com.mbridge.msdk.foundation.same.net.d.d
            r7.<init>(r9, r8, r0, r11)
            goto L_0x009d
        L_0x0098:
            com.mbridge.msdk.foundation.same.net.d.f r7 = new com.mbridge.msdk.foundation.same.net.d.f
            r7.<init>(r9, r8, r0, r11)
        L_0x009d:
            r0 = r7
        L_0x009e:
            if (r0 == 0) goto L_0x00a6
            r0.mo43876a((com.mbridge.msdk.foundation.same.net.C6294l) r10)
            com.mbridge.msdk.foundation.same.net.C6299n.m15942a((com.mbridge.msdk.foundation.same.net.C6290i) r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.p179h.C6285b.mo43865a(int, java.lang.String, com.mbridge.msdk.foundation.same.net.h.d, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e):void");
    }

    /* renamed from: a */
    public static void m15878a(File file, String str, C6263e eVar) {
        C6299n.m15940a().mo43840a(file, str, eVar);
    }

    /* renamed from: b */
    public final void mo43866b(int i, String str, C6287d dVar, C6263e eVar) {
        String str2 = dVar.mo43871b().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        dVar.mo43870a("ts", currentTimeMillis + "");
        dVar.mo43870a(UserDataStore.STATE, SameMD5.getMD5(currentTimeMillis + str2));
        m15879b(i, str, dVar, new C6241b(), eVar);
    }

    /* renamed from: c */
    public final void mo43867c(int i, String str, C6287d dVar, C6263e eVar) {
        m15879b(i, str, dVar, new C6241b(), eVar);
    }

    /* renamed from: b */
    private void m15879b(int i, String str, C6287d dVar, C6294l lVar, C6263e eVar) {
        if (dVar == null) {
            try {
                dVar = new C6287d();
            } catch (Exception e) {
                C6361q.m16154a(f15596b, e.getMessage());
            }
        }
        mo42743a(str, dVar);
        C6288e.m15897c(dVar);
        if (str.contains(C6280d.m15868c().f15565a)) {
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            int i2 = 0;
            if (b != null) {
                i2 = b.mo42671P();
            }
            if (i2 != 2) {
                if (i2 == 1) {
                    C6295m.m15932a().mo43899a(dVar.toString(), eVar);
                    return;
                }
            } else {
                return;
            }
        } else if (str.contains(C6280d.m15868c().f15572h)) {
            if (dVar != null) {
                str = str + "?" + dVar.toString();
            }
            JSONArray b2 = C6138a.m15352a().mo42945b();
            if (b2 != null) {
                dVar = new C6287d();
                dVar.mo43870a(C6287d.f15602e, b2.toString());
            }
        }
        C6290i iVar = null;
        if (i == 0) {
            iVar = new C6262f(1, str, dVar.toString(), eVar);
            iVar.mo43882a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i == 1) {
            iVar = new C6260d(1, str, dVar.toString(), eVar);
            iVar.mo43882a("Content-Type", "application/x-www-form-urlencoded");
        } else if (i == 2) {
            iVar = new C6259c(1, str, dVar.toString(), eVar);
            iVar.mo43882a("Content-Type", "application/x-www-form-urlencoded");
        }
        if (iVar != null) {
            iVar.mo43876a(lVar);
            C6299n.m15942a(iVar);
        }
    }
}
