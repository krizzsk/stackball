package com.flurry.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.billingclient.api.BillingClient;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.bn */
public class C2419bn {

    /* renamed from: a */
    private static final String f5616a = C2419bn.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Object f5617b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static List<C2423b> f5618c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static IInAppBillingService f5619d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static ServiceConnection f5620e;

    /* renamed from: com.flurry.sdk.bn$a */
    public static abstract class C2422a {
        /* renamed from: a */
        public abstract void mo17523a(int i, C2425c cVar);
    }

    /* renamed from: a */
    public static void m5202a(final Context context, final String str, final C2422a aVar) {
        try {
            Class.forName("com.android.vending.billing.IInAppBillingService");
            C2530db.m5474a(3, f5616a, "Google play billing library is available");
            C24201 r0 = new C2423b() {
                /* renamed from: a */
                public final void mo17629a(int i, IInAppBillingService iInAppBillingService) {
                    if (i == 0) {
                        C2425c a = C2419bn.m5203b(iInAppBillingService, context, BillingClient.SkuType.INAPP, str);
                        if (a == null) {
                            a = C2419bn.m5203b(iInAppBillingService, context, BillingClient.SkuType.SUBS, str);
                        }
                        aVar.mo17523a(i, a);
                        return;
                    }
                    aVar.mo17523a(i, (C2425c) null);
                }
            };
            Boolean bool = Boolean.FALSE;
            synchronized (f5617b) {
                if (f5620e == null) {
                    f5620e = new ServiceConnection() {
                        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                            synchronized (C2419bn.f5617b) {
                                IInAppBillingService unused = C2419bn.f5619d = IInAppBillingService.Stub.asInterface(iBinder);
                                for (C2423b b : C2419bn.f5618c) {
                                    b.mo17632b(0, C2419bn.f5619d);
                                }
                                C2419bn.f5618c.clear();
                            }
                        }

                        public final void onServiceDisconnected(ComponentName componentName) {
                            synchronized (C2419bn.f5617b) {
                                ServiceConnection unused = C2419bn.f5620e = null;
                                IInAppBillingService unused2 = C2419bn.f5619d = null;
                                for (C2423b b : C2419bn.f5618c) {
                                    b.mo17632b(1, (IInAppBillingService) null);
                                }
                                C2419bn.f5618c.clear();
                            }
                        }
                    };
                    bool = Boolean.TRUE;
                }
                if (f5619d == null) {
                    f5618c.add(r0);
                } else {
                    r0.mo17632b(0, f5619d);
                }
                if (bool.booleanValue()) {
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        r0.mo17632b(1, (IInAppBillingService) null);
                        f5620e = null;
                    } else {
                        context.bindService(intent, f5620e, 1);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            C2530db.m5482b(f5616a, "Could not find google play billing library");
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2425c m5203b(IInAppBillingService iInAppBillingService, Context context, String str, String str2) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
        try {
            Bundle skuDetails = iInAppBillingService.getSkuDetails(3, context.getPackageName(), str, bundle);
            if (skuDetails.containsKey("DETAILS_LIST")) {
                ArrayList<String> stringArrayList = skuDetails.getStringArrayList("DETAILS_LIST");
                if (stringArrayList.size() > 0) {
                    return new C2425c(str, stringArrayList.get(0));
                }
            }
            return null;
        } catch (RemoteException e) {
            C2530db.m5477a(f5616a, "RemoteException getting SKU Details", (Throwable) e);
            return null;
        } catch (JSONException e2) {
            C2530db.m5477a(f5616a, "JSONException parsing SKU Details", (Throwable) e2);
            return null;
        }
    }

    /* renamed from: com.flurry.sdk.bn$b */
    static abstract class C2423b {
        /* renamed from: a */
        public abstract void mo17629a(int i, IInAppBillingService iInAppBillingService);

        private C2423b() {
        }

        /* synthetic */ C2423b(byte b) {
            this();
        }

        /* renamed from: b */
        public final void mo17632b(final int i, final IInAppBillingService iInAppBillingService) {
            new Thread(new Runnable() {
                public final void run() {
                    C2423b.this.mo17629a(i, iInAppBillingService);
                }
            }).start();
        }
    }

    /* renamed from: com.flurry.sdk.bn$c */
    public static class C2425c {

        /* renamed from: a */
        public final String f5627a;

        /* renamed from: b */
        public final long f5628b;

        /* renamed from: c */
        public final String f5629c;

        /* renamed from: d */
        public final String f5630d;

        /* renamed from: e */
        private final String f5631e;

        /* renamed from: f */
        private final String f5632f;

        /* renamed from: g */
        private final String f5633g;

        /* renamed from: h */
        private final String f5634h;

        /* renamed from: i */
        private final String f5635i;

        public C2425c(String str, String str2) throws JSONException {
            this.f5631e = str;
            this.f5635i = str2;
            JSONObject jSONObject = new JSONObject(this.f5635i);
            this.f5632f = jSONObject.optString("productId");
            this.f5627a = jSONObject.optString("type");
            this.f5633g = jSONObject.optString("price");
            this.f5628b = jSONObject.optLong("price_amount_micros");
            this.f5629c = jSONObject.optString("price_currency_code");
            this.f5630d = jSONObject.optString("title");
            this.f5634h = jSONObject.optString("description");
        }

        public final String toString() {
            return "SkuDetails:" + this.f5635i;
        }
    }
}
