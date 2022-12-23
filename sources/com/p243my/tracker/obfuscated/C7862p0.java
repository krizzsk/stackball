package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p243my.tracker.obfuscated.C7825l0;
import com.p243my.tracker.obfuscated.C7828m;
import com.p243my.tracker.obfuscated.C7862p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.p0 */
public final class C7862p0 {

    /* renamed from: a */
    final Context f20132a;

    /* renamed from: b */
    final C7828m f20133b;

    /* renamed from: c */
    final C7828m.C7830b f20134c = new C7828m.C7830b() {
        /* renamed from: a */
        public final void mo52113a(List list) {
            C7862p0.this.mo52482b(list);
        }
    };

    /* renamed from: com.my.tracker.obfuscated.p0$a */
    final class C7863a implements C7825l0.C7827b {

        /* renamed from: a */
        private final List<C7866q0> f20135a;

        C7863a(List<C7866q0> list) {
            this.f20135a = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m21494a(Map map) {
            for (C7866q0 next : this.f20135a) {
                next.mo52490a((JSONObject) map.get(next.mo52493c()));
            }
            C7862p0.this.f20133b.mo52370b(this.f20135a);
        }

        /* renamed from: a */
        public void mo52347a(int i, Map<String, JSONObject> map) {
            if (i == 1) {
                C7877u0.m21551b("PurchaseHandler error: can't retrieve information about products");
            } else {
                C7806d.m21130a(new Runnable(map) {
                    public final /* synthetic */ Map f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7862p0.C7863a.this.m21494a(this.f$1);
                    }
                });
            }
        }
    }

    private C7862p0(C7828m mVar, Context context) {
        this.f20133b = mVar;
        this.f20132a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C7862p0 m21485a(C7828m mVar, Context context) {
        return new C7862p0(mVar, context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21486a(String str, String str2) {
        C7866q0 a = C7866q0.m21507a(str, str2, C7875t0.m21540a());
        if (a != null) {
            this.f20133b.mo52363a((List<C7866q0>) Collections.singletonList(a), this.f20134c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21487a(List list) {
        C7877u0.m21547a("PurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        for (Object a : list) {
            C7866q0 a2 = C7825l0.m21268a(a);
            if (a2 == null) {
                C7877u0.m21547a("PurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            C7877u0.m21547a("PurchaseHandler: skip empty purchases list");
        } else {
            this.f20133b.mo52363a((List<C7866q0>) arrayList, this.f20134c);
        }
    }

    /* renamed from: a */
    public void mo52477a() {
        this.f20133b.mo52356a(this.f20134c);
    }

    /* renamed from: a */
    public void mo52478a(int i, Intent intent) {
        if (i != -1) {
            C7877u0.m21547a("PurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            C7877u0.m21547a("PurchaseHandler: empty intent has been received");
        } else {
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            if (TextUtils.isEmpty(stringExtra)) {
                C7877u0.m21547a("PurchaseHandler: empty purchase data in intent");
                return;
            }
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            if (stringExtra2 == null) {
                C7877u0.m21547a("PurchaseHandler: null data signature in intent");
            } else {
                C7806d.m21130a(new Runnable(stringExtra, stringExtra2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7862p0.this.m21486a(this.f$1, this.f$2);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo52479a(int i, List<Object> list) {
        if (i != 0) {
            C7877u0.m21547a("PurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
        } else if (list == null || list.isEmpty()) {
            C7877u0.m21547a("PurchaseHandler: null or empty purchases list has been received");
        } else if (!C7825l0.f19930g.booleanValue()) {
            C7877u0.m21551b("PurchaseHandler error: classes com.android.billingclient:billing aren't found");
        } else {
            C7806d.m21130a(new Runnable(list) {
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7862p0.this.m21487a(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52480a(List<C7866q0> list, boolean z) {
        if (list.isEmpty()) {
            C7877u0.m21547a(z ? "PurchaseHandler: empty inapp raw purchases list" : "PurchaseHandler: empty subs raw purchases list");
        } else {
            C7825l0.m21271a(list, z, (C7825l0.C7827b) new C7863a(list), this.f20132a);
        }
    }

    /* renamed from: a */
    public void mo52481a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        this.f20133b.mo52364a(jSONObject, jSONObject2, str, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52482b(List<C7866q0> list) {
        C7877u0.m21547a("PurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C7866q0 next : list) {
            String c = next.mo52493c();
            if (next.mo52497g()) {
                C7877u0.m21547a("PurchaseHandler: inapp raw purchase, product id: " + c);
                arrayList2.add(next);
            } else {
                C7877u0.m21547a("PurchaseHandler: subs raw purchase, product id: " + c);
                arrayList.add(next);
            }
        }
        mo52480a((List<C7866q0>) arrayList, false);
        mo52480a((List<C7866q0>) arrayList2, true);
    }
}
