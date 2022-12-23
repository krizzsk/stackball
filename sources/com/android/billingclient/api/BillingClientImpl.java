package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
class BillingClientImpl extends BillingClient {
    /* access modifiers changed from: private */
    public int zza;
    /* access modifiers changed from: private */
    public final String zzb;
    private final Handler zzc;
    private zze zzd;
    private Context zze;
    /* access modifiers changed from: private */
    public Context zzf;
    /* access modifiers changed from: private */
    public zzd zzg;
    private zzah zzh;
    /* access modifiers changed from: private */
    public boolean zzi;
    /* access modifiers changed from: private */
    public boolean zzj;
    /* access modifiers changed from: private */
    public int zzk;
    /* access modifiers changed from: private */
    public boolean zzl;
    /* access modifiers changed from: private */
    public boolean zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    /* access modifiers changed from: private */
    public boolean zzo;
    /* access modifiers changed from: private */
    public boolean zzp;
    /* access modifiers changed from: private */
    public boolean zzq;
    /* access modifiers changed from: private */
    public boolean zzr;
    /* access modifiers changed from: private */
    public boolean zzs;
    private boolean zzt;
    private ExecutorService zzu;

    private BillingClientImpl(Activity activity, boolean z, String str) {
        this(activity.getApplicationContext(), z, new zzaj(), str, (String) null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.zzf = applicationContext;
        this.zzd = new zze(applicationContext, purchasesUpdatedListener);
        this.zze = context;
        this.zzt = z;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, long j) {
        launchPriceChangeConfirmationFlow(activity, priceChangeFlowParams, (PriceChangeConfirmationListener) new zzaj(j));
    }

    private void startConnection(long j) {
        zzaj zzaj = new zzaj(j);
        if (isReady()) {
            zza.zza("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaj.onBillingSetupFinished(zzam.zzp);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            zza.zzb("BillingClient", "Client is already in the process of connecting to billing service.");
            zzaj.onBillingSetupFinished(zzam.zzd);
        } else if (i == 3) {
            zza.zzb("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzaj.onBillingSetupFinished(zzam.zzq);
        } else {
            this.zza = 1;
            this.zzd.zza();
            zza.zza("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzah(this, zzaj, (zzs) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zza.zzb("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zzf.bindService(intent2, this.zzh, 1)) {
                            zza.zza("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        zza.zzb("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.zza = 0;
            zza.zza("BillingClient", "Billing service unavailable on device.");
            zzaj.onBillingSetupFinished(zzam.zzc);
        }
    }

    private final BillingResult zzA(String str) {
        try {
            if (((Integer) zzz(new zzt(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS)).intValue() == 0) {
                return zzam.zzp;
            }
            return zzam.zzi;
        } catch (Exception unused) {
            zza.zzb("BillingClient", "Exception while checking if billing is supported; try to reconnect");
            return zzam.zzq;
        }
    }

    /* access modifiers changed from: private */
    public final void zzB(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.zzc.post(runnable);
        }
    }

    static /* synthetic */ Purchase.PurchasesResult zzd(BillingClientImpl billingClientImpl, String str) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        zza.zza("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzh2 = zza.zzh(billingClientImpl.zzn, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        do {
            try {
                if (billingClientImpl.zzn) {
                    bundle = billingClientImpl.zzg.zzk(9, billingClientImpl.zzf.getPackageName(), str, str2, zzh2);
                } else {
                    bundle = billingClientImpl.zzg.zzd(3, billingClientImpl.zzf.getPackageName(), str, str2);
                }
                BillingResult zza2 = zzao.zza(bundle, "BillingClient", "getPurchase()");
                if (zza2 != zzam.zzp) {
                    return new Purchase.PurchasesResult(zza2, (List<Purchase>) null);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    String valueOf2 = String.valueOf(stringArrayList.get(i));
                    zza.zza("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            zza.zzb("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                        i++;
                    } catch (JSONException e) {
                        String valueOf3 = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        zza.zzb("BillingClient", sb.toString());
                        return new Purchase.PurchasesResult(zzam.zzl, (List<Purchase>) null);
                    }
                }
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                zza.zza("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
            } catch (Exception e2) {
                String valueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zza.zzb("BillingClient", sb2.toString());
                return new Purchase.PurchasesResult(zzam.zzq, (List<Purchase>) null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.PurchasesResult(zzam.zzp, arrayList);
    }

    static /* synthetic */ void zzf(BillingClientImpl billingClientImpl, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        String str;
        int i;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            String valueOf = String.valueOf(purchaseToken);
            zza.zza("BillingClient", valueOf.length() != 0 ? "Consuming purchase with token: ".concat(valueOf) : new String("Consuming purchase with token: "));
            if (billingClientImpl.zzn) {
                Bundle zzl2 = billingClientImpl.zzg.zzl(9, billingClientImpl.zzf.getPackageName(), purchaseToken, zza.zzj(consumeParams, billingClientImpl.zzn, billingClientImpl.zzb));
                int i2 = zzl2.getInt("RESPONSE_CODE");
                str = zza.zze(zzl2, "BillingClient");
                i = i2;
            } else {
                i = billingClientImpl.zzg.zze(3, billingClientImpl.zzf.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(i);
            newBuilder.setDebugMessage(str);
            BillingResult build = newBuilder.build();
            if (i == 0) {
                billingClientImpl.zzB(new zzu(billingClientImpl, consumeResponseListener, build, purchaseToken));
            } else {
                billingClientImpl.zzB(new zzv(billingClientImpl, i, consumeResponseListener, build, purchaseToken));
            }
        } catch (Exception e) {
            billingClientImpl.zzB(new zzw(billingClientImpl, e, consumeResponseListener, purchaseToken));
        }
    }

    static /* synthetic */ zzai zzg(BillingClientImpl billingClientImpl, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Querying purchase history, item type: ".concat(valueOf);
        } else {
            str2 = new String("Querying purchase history, item type: ");
        }
        zza.zza("BillingClient", str2);
        ArrayList arrayList = new ArrayList();
        Bundle zzh2 = zza.zzh(billingClientImpl.zzn, billingClientImpl.zzt, billingClientImpl.zzb);
        String str3 = null;
        while (billingClientImpl.zzl) {
            try {
                Bundle zzh3 = billingClientImpl.zzg.zzh(6, billingClientImpl.zzf.getPackageName(), str, str3, zzh2);
                BillingResult zza2 = zzao.zza(zzh3, "BillingClient", "getPurchaseHistory()");
                if (zza2 != zzam.zzp) {
                    return new zzai(zza2, (List<PurchaseHistoryRecord>) null);
                }
                ArrayList<String> stringArrayList = zzh3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i);
                    String str5 = stringArrayList3.get(i);
                    String valueOf2 = String.valueOf(stringArrayList.get(i));
                    zza.zza("BillingClient", valueOf2.length() != 0 ? "Purchase record found for sku : ".concat(valueOf2) : new String("Purchase record found for sku : "));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str4, str5);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            zza.zzb("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i++;
                    } catch (JSONException e) {
                        String valueOf3 = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        zza.zzb("BillingClient", sb.toString());
                        return new zzai(zzam.zzl, (List<PurchaseHistoryRecord>) null);
                    }
                }
                str3 = zzh3.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str3);
                zza.zza("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
                if (TextUtils.isEmpty(str3)) {
                    return new zzai(zzam.zzp, arrayList);
                }
            } catch (RemoteException e2) {
                String valueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 64);
                sb2.append("Got exception trying to get purchase history: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zza.zzb("BillingClient", sb2.toString());
                return new zzai(zzam.zzq, (List<PurchaseHistoryRecord>) null);
            }
        }
        zza.zzb("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzai(zzam.zzj, (List<PurchaseHistoryRecord>) null);
    }

    private final BillingResult zzy(BillingResult billingResult) {
        this.zzd.zzb().onPurchasesUpdated(billingResult, (List<Purchase>) null);
        return billingResult;
    }

    /* access modifiers changed from: private */
    public final <T> Future<T> zzz(Callable<T> callable, long j, Runnable runnable) {
        long j2 = (long) (((double) j) * 0.95d);
        if (this.zzu == null) {
            this.zzu = Executors.newFixedThreadPool(zza.zza, new zzq(this));
        }
        try {
            Future<T> submit = this.zzu.submit(callable);
            this.zzc.postDelayed(new zzr(this, submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Async task throws exception ");
            sb.append(valueOf);
            zza.zzb("BillingClient", sb.toString());
            return null;
        }
    }

    public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzam.zzq);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            zza.zzb("BillingClient", "Please provide a valid purchase token.");
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzam.zzk);
        } else if (!this.zzn) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzam.zzb);
        } else if (zzz(new zzo(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener), 30000, new zzp(this, acknowledgePurchaseResponseListener)) == null) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzC());
        }
    }

    public final void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            consumeResponseListener.onConsumeResponse(zzam.zzq, consumeParams.getPurchaseToken());
        } else if (zzz(new zzh(this, consumeParams, consumeResponseListener), 30000, new zzi(this, consumeResponseListener, consumeParams)) == null) {
            consumeResponseListener.onConsumeResponse(zzC(), consumeParams.getPurchaseToken());
        }
    }

    public final void endConnection() {
        try {
            this.zze = null;
            this.zzd.zzc();
            zzah zzah = this.zzh;
            if (zzah != null) {
                zzah.zza();
            }
            if (!(this.zzh == null || this.zzg == null)) {
                zza.zza("BillingClient", "Unbinding from service.");
                this.zzf.unbindService(this.zzh);
                this.zzh = null;
            }
            this.zzg = null;
            ExecutorService executorService = this.zzu;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzu = null;
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(valueOf);
            zza.zzb("BillingClient", sb.toString());
        } finally {
            this.zza = 3;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.isReady()
            if (r0 != 0) goto L_0x0009
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzq
            return r3
        L_0x0009:
            int r0 = r3.hashCode()
            switch(r0) {
                case -422092961: goto L_0x006e;
                case 96321: goto L_0x0064;
                case 97314: goto L_0x005a;
                case 98307: goto L_0x004f;
                case 99300: goto L_0x0045;
                case 100293: goto L_0x003a;
                case 207616302: goto L_0x0030;
                case 292218239: goto L_0x0026;
                case 1219490065: goto L_0x001c;
                case 1987365622: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0078
        L_0x0012:
            java.lang.String r0 = "subscriptions"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 0
            goto L_0x0079
        L_0x001c:
            java.lang.String r0 = "subscriptionsOnVr"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 3
            goto L_0x0079
        L_0x0026:
            java.lang.String r0 = "inAppItemsOnVr"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 2
            goto L_0x0079
        L_0x0030:
            java.lang.String r0 = "priceChangeConfirmation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 4
            goto L_0x0079
        L_0x003a:
            java.lang.String r0 = "eee"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 9
            goto L_0x0079
        L_0x0045:
            java.lang.String r0 = "ddd"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 7
            goto L_0x0079
        L_0x004f:
            java.lang.String r0 = "ccc"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 8
            goto L_0x0079
        L_0x005a:
            java.lang.String r0 = "bbb"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 5
            goto L_0x0079
        L_0x0064:
            java.lang.String r0 = "aaa"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 6
            goto L_0x0079
        L_0x006e:
            java.lang.String r0 = "subscriptionsUpdate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = -1
        L_0x0079:
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x00cd;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00ab;
                case 6: goto L_0x00a1;
                case 7: goto L_0x0097;
                case 8: goto L_0x008d;
                case 9: goto L_0x008d;
                default: goto L_0x007c;
            }
        L_0x007c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Unsupported feature: "
            int r1 = r3.length()
            if (r1 == 0) goto L_0x00e1
            java.lang.String r3 = r0.concat(r3)
            goto L_0x00e6
        L_0x008d:
            boolean r3 = r2.zzs
            if (r3 == 0) goto L_0x0094
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzp
            goto L_0x0096
        L_0x0094:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzi
        L_0x0096:
            return r3
        L_0x0097:
            boolean r3 = r2.zzq
            if (r3 == 0) goto L_0x009e
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzp
            goto L_0x00a0
        L_0x009e:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzi
        L_0x00a0:
            return r3
        L_0x00a1:
            boolean r3 = r2.zzr
            if (r3 == 0) goto L_0x00a8
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzp
            goto L_0x00aa
        L_0x00a8:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzi
        L_0x00aa:
            return r3
        L_0x00ab:
            boolean r3 = r2.zzp
            if (r3 == 0) goto L_0x00b2
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzp
            goto L_0x00b4
        L_0x00b2:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzi
        L_0x00b4:
            return r3
        L_0x00b5:
            boolean r3 = r2.zzm
            if (r3 == 0) goto L_0x00bc
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzp
            goto L_0x00be
        L_0x00bc:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzi
        L_0x00be:
            return r3
        L_0x00bf:
            java.lang.String r3 = "subs"
            com.android.billingclient.api.BillingResult r3 = r2.zzA(r3)
            return r3
        L_0x00c6:
            java.lang.String r3 = "inapp"
            com.android.billingclient.api.BillingResult r3 = r2.zzA(r3)
            return r3
        L_0x00cd:
            boolean r3 = r2.zzj
            if (r3 == 0) goto L_0x00d4
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzp
            goto L_0x00d6
        L_0x00d4:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzi
        L_0x00d6:
            return r3
        L_0x00d7:
            boolean r3 = r2.zzi
            if (r3 == 0) goto L_0x00de
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzp
            goto L_0x00e0
        L_0x00de:
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzi
        L_0x00e0:
            return r3
        L_0x00e1:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L_0x00e6:
            java.lang.String r0 = "BillingClient"
            com.google.android.gms.internal.play_billing.zza.zzb(r0, r3)
            com.android.billingclient.api.BillingResult r3 = com.android.billingclient.api.zzam.zzv
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    public final BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        String str;
        String str2;
        String str3;
        Future future;
        long j;
        boolean z;
        int i;
        int i2;
        String str4;
        Activity activity2 = activity;
        BillingFlowParams billingFlowParams2 = billingFlowParams;
        String str5 = "BUY_INTENT";
        if (!isReady()) {
            BillingResult billingResult = zzam.zzq;
            zzy(billingResult);
            return billingResult;
        }
        ArrayList<SkuDetails> zza2 = billingFlowParams.zza();
        SkuDetails skuDetails = zza2.get(0);
        String type = skuDetails.getType();
        if (!type.equals(BillingClient.SkuType.SUBS) || this.zzi) {
            String oldSku = billingFlowParams.getOldSku();
            if (oldSku != null && !this.zzj) {
                zza.zzb("BillingClient", "Current client doesn't support subscriptions update.");
                BillingResult billingResult2 = zzam.zzt;
                zzy(billingResult2);
                return billingResult2;
            } else if (billingFlowParams.zzc() && !this.zzl) {
                zza.zzb("BillingClient", "Current client doesn't support extra params for buy intent.");
                BillingResult billingResult3 = zzam.zzh;
                zzy(billingResult3);
                return billingResult3;
            } else if (zza2.size() <= 1 || this.zzs) {
                String str6 = "";
                String str7 = str6;
                int i3 = 0;
                while (i3 < zza2.size()) {
                    String valueOf = String.valueOf(str7);
                    String valueOf2 = String.valueOf(zza2.get(i3));
                    String str8 = str6;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                    sb.append(valueOf);
                    sb.append(valueOf2);
                    String sb2 = sb.toString();
                    if (i3 < zza2.size() - 1) {
                        sb2 = String.valueOf(sb2).concat(", ");
                    }
                    str7 = sb2;
                    i3++;
                    str6 = str8;
                }
                String str9 = str6;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + 41 + String.valueOf(type).length());
                sb3.append("Constructing buy intent for ");
                sb3.append(str7);
                sb3.append(", item type: ");
                sb3.append(type);
                zza.zza("BillingClient", sb3.toString());
                if (this.zzl) {
                    Bundle zzg2 = zza.zzg(billingFlowParams2, this.zzn, this.zzt, this.zzb);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    str3 = "; try to reconnect";
                    int size = zza2.size();
                    str2 = str7;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (i4 < size) {
                        SkuDetails skuDetails2 = zza2.get(i4);
                        if (!skuDetails2.zzb().isEmpty()) {
                            i2 = size;
                            arrayList.add(skuDetails2.zzb());
                        } else {
                            i2 = size;
                        }
                        String str10 = str5;
                        try {
                            str4 = new JSONObject(skuDetails2.getOriginalJson()).optString("offer_id_token");
                        } catch (JSONException unused) {
                            str4 = str9;
                        }
                        String zzc2 = skuDetails2.zzc();
                        int zzd2 = skuDetails2.zzd();
                        arrayList2.add(str4);
                        z2 |= !TextUtils.isEmpty(str4);
                        arrayList3.add(zzc2);
                        z3 |= !TextUtils.isEmpty(zzc2);
                        arrayList4.add(Integer.valueOf(zzd2));
                        z4 |= zzd2 != 0;
                        i4++;
                        size = i2;
                        str5 = str10;
                    }
                    str = str5;
                    if (!arrayList.isEmpty()) {
                        zzg2.putStringArrayList("skuDetailsTokens", arrayList);
                    }
                    if (z2) {
                        if (!this.zzq) {
                            BillingResult billingResult4 = zzam.zzi;
                            zzy(billingResult4);
                            return billingResult4;
                        }
                        zzg2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
                    }
                    if (z3) {
                        zzg2.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
                    }
                    if (z4) {
                        zzg2.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList4);
                    }
                    if (!TextUtils.isEmpty(skuDetails.zza())) {
                        zzg2.putString("skuPackageName", skuDetails.zza());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!TextUtils.isEmpty((CharSequence) null)) {
                        zzg2.putString("accountName", (String) null);
                    }
                    if (zza2.size() > 1) {
                        ArrayList arrayList5 = new ArrayList(zza2.size() - 1);
                        ArrayList arrayList6 = new ArrayList(zza2.size() - 1);
                        for (int i5 = 1; i5 < zza2.size(); i5++) {
                            arrayList5.add(zza2.get(i5).getSku());
                            arrayList6.add(zza2.get(i5).getType());
                        }
                        zzg2.putStringArrayList("additionalSkus", arrayList5);
                        zzg2.putStringArrayList("additionalSkuTypes", arrayList6);
                    }
                    if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                        zzg2.putString("proxyPackage", stringExtra);
                        try {
                            zzg2.putString("proxyPackageVersion", this.zzf.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            zzg2.putString("proxyPackageVersion", "package not found");
                        }
                    }
                    if (!this.zzr || !z) {
                        i = this.zzn ? 9 : billingFlowParams.getVrPurchaseFlow() ? 7 : 6;
                    } else {
                        i = 15;
                    }
                    j = 5000;
                    future = zzz(new zzy(this, i, skuDetails, type, billingFlowParams, zzg2), 5000, (Runnable) null);
                } else {
                    str = str5;
                    str3 = "; try to reconnect";
                    str2 = str7;
                    j = 5000;
                    if (oldSku != null) {
                        future = zzz(new zzz(this, billingFlowParams2, skuDetails), 5000, (Runnable) null);
                    } else {
                        future = zzz(new zzaa(this, skuDetails, type), 5000, (Runnable) null);
                    }
                }
                try {
                    Bundle bundle = (Bundle) future.get(j, TimeUnit.MILLISECONDS);
                    int zzd3 = zza.zzd(bundle, "BillingClient");
                    String zze2 = zza.zze(bundle, "BillingClient");
                    if (zzd3 != 0) {
                        StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("Unable to buy item, Error response code: ");
                        sb4.append(zzd3);
                        zza.zzb("BillingClient", sb4.toString());
                        BillingResult.Builder newBuilder = BillingResult.newBuilder();
                        newBuilder.setResponseCode(zzd3);
                        newBuilder.setDebugMessage(zze2);
                        BillingResult build = newBuilder.build();
                        zzy(build);
                        return build;
                    }
                    Intent intent = new Intent(activity2, ProxyBillingActivity.class);
                    String str11 = str;
                    intent.putExtra(str11, (PendingIntent) bundle.getParcelable(str11));
                    activity2.startActivity(intent);
                    return zzam.zzp;
                } catch (CancellationException | TimeoutException unused3) {
                    String str12 = str2;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str12).length() + 68);
                    sb5.append("Time out while launching billing flow: ; for sku: ");
                    sb5.append(str12);
                    sb5.append(str3);
                    zza.zzb("BillingClient", sb5.toString());
                    BillingResult billingResult5 = zzam.zzr;
                    zzy(billingResult5);
                    return billingResult5;
                } catch (Exception unused4) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str2).length() + 69);
                    sb6.append("Exception while launching billing flow: ; for sku: ");
                    sb6.append(str2);
                    sb6.append(str3);
                    zza.zzb("BillingClient", sb6.toString());
                    BillingResult billingResult6 = zzam.zzq;
                    zzy(billingResult6);
                    return billingResult6;
                }
            } else {
                zza.zzb("BillingClient", "Current client doesn't support multi-item purchases.");
                BillingResult billingResult7 = zzam.zzu;
                zzy(billingResult7);
                return billingResult7;
            }
        } else {
            zza.zzb("BillingClient", "Current client doesn't support subscriptions.");
            BillingResult billingResult8 = zzam.zzs;
            zzy(billingResult8);
            return billingResult8;
        }
    }

    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzam.zzq, (List<PurchaseHistoryRecord>) null);
        } else if (zzz(new zzk(this, str, purchaseHistoryResponseListener), 30000, new zzl(this, purchaseHistoryResponseListener)) == null) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzC(), (List<PurchaseHistoryRecord>) null);
        }
    }

    public final Purchase.PurchasesResult queryPurchases(String str) {
        if (!isReady()) {
            return new Purchase.PurchasesResult(zzam.zzq, (List<Purchase>) null);
        }
        if (TextUtils.isEmpty(str)) {
            zza.zzb("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.PurchasesResult(zzam.zzg, (List<Purchase>) null);
        }
        try {
            return (Purchase.PurchasesResult) zzz(new zzab(this, str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.PurchasesResult(zzam.zzr, (List<Purchase>) null);
        } catch (Exception unused2) {
            return new Purchase.PurchasesResult(zzam.zzl, (List<Purchase>) null);
        }
    }

    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            skuDetailsResponseListener.onSkuDetailsResponse(zzam.zzq, (List<SkuDetails>) null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            zza.zzb("BillingClient", "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzam.zzg, (List<SkuDetails>) null);
        } else if (skusList != null) {
            ArrayList arrayList = new ArrayList();
            for (String zza2 : skusList) {
                zzas zzas = new zzas((zzar) null);
                zzas.zza(zza2);
                arrayList.add(zzas.zzb());
            }
            if (zzz(new zzad(this, skuType, arrayList, (String) null, skuDetailsResponseListener), 30000, new zzg(this, skuDetailsResponseListener)) == null) {
                skuDetailsResponseListener.onSkuDetailsResponse(zzC(), (List<SkuDetails>) null);
            }
        } else {
            zza.zzb("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzam.zzf, (List<SkuDetails>) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzap zza(String str, List<zzat> list, String str2) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i, i2 > size ? size : i2));
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((zzat) arrayList2.get(i3)).zza());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle2.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    bundle = this.zzg.zzm(10, this.zzf.getPackageName(), str, bundle2, zza.zzi(this.zzk, this.zzt, this.zzb, (String) null, arrayList2));
                    String str3 = str;
                } else {
                    bundle = this.zzg.zzb(3, this.zzf.getPackageName(), str, bundle2);
                }
                if (bundle == null) {
                    zza.zzb("BillingClient", "querySkuDetailsAsync got null sku details list");
                    return new zzap(4, "Item is unavailable for purchase.", (List<SkuDetails>) null);
                } else if (!bundle.containsKey("DETAILS_LIST")) {
                    int zzd2 = zza.zzd(bundle, "BillingClient");
                    String zze2 = zza.zze(bundle, "BillingClient");
                    if (zzd2 != 0) {
                        StringBuilder sb = new StringBuilder(50);
                        sb.append("getSkuDetails() failed. Response code: ");
                        sb.append(zzd2);
                        zza.zzb("BillingClient", sb.toString());
                        return new zzap(zzd2, zze2, arrayList);
                    }
                    zza.zzb("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new zzap(6, zze2, arrayList);
                } else {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null) {
                        int i4 = 0;
                        while (i4 < stringArrayList.size()) {
                            try {
                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                                String valueOf = String.valueOf(skuDetails);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 17);
                                sb2.append("Got sku details: ");
                                sb2.append(valueOf);
                                zza.zza("BillingClient", sb2.toString());
                                arrayList.add(skuDetails);
                                i4++;
                            } catch (JSONException unused) {
                                zza.zzb("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                                return new zzap(6, "Error trying to decode SkuDetails.", (List<SkuDetails>) null);
                            }
                        }
                        i = i2;
                    } else {
                        zza.zzb("BillingClient", "querySkuDetailsAsync got null response list");
                        return new zzap(4, "Item is unavailable for purchase.", (List<SkuDetails>) null);
                    }
                }
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 63);
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(valueOf2);
                zza.zzb("BillingClient", sb3.toString());
                return new zzap(-1, "Service connection is disconnected.", (List<SkuDetails>) null);
            }
        }
        return new zzap(0, "", arrayList);
    }

    /* access modifiers changed from: private */
    public final BillingResult zzC() {
        int i = this.zza;
        if (i == 0 || i == 3) {
            return zzam.zzq;
        }
        return zzam.zzl;
    }

    public final void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (!isReady()) {
            priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzq);
        } else if (priceChangeFlowParams == null || priceChangeFlowParams.getSkuDetails() == null) {
            zza.zzb("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
            priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzn);
        } else {
            String sku = priceChangeFlowParams.getSkuDetails().getSku();
            if (sku == null) {
                zza.zzb("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
                priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzn);
            } else if (!this.zzm) {
                zza.zzb("BillingClient", "Current client doesn't support price change confirmation flow.");
                priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzi);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", this.zzb);
                bundle.putBoolean("subs_price_change", true);
                try {
                    Bundle bundle2 = (Bundle) zzz(new zzs(this, sku, bundle), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
                    int zzd2 = zza.zzd(bundle2, "BillingClient");
                    String zze2 = zza.zze(bundle2, "BillingClient");
                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                    newBuilder.setResponseCode(zzd2);
                    newBuilder.setDebugMessage(zze2);
                    BillingResult build = newBuilder.build();
                    if (zzd2 == 0) {
                        zzx zzx = new zzx(this, this.zzc, priceChangeConfirmationListener);
                        Intent intent = new Intent(activity, ProxyBillingActivity.class);
                        intent.putExtra("SUBS_MANAGEMENT_INTENT", (PendingIntent) bundle2.getParcelable("SUBS_MANAGEMENT_INTENT"));
                        intent.putExtra("result_receiver", zzx);
                        activity.startActivity(intent);
                        return;
                    }
                    StringBuilder sb = new StringBuilder(68);
                    sb.append("Unable to launch price change flow, error response code: ");
                    sb.append(zzd2);
                    zza.zzb("BillingClient", sb.toString());
                    priceChangeConfirmationListener.onPriceChangeConfirmationResult(build);
                } catch (CancellationException | TimeoutException unused) {
                    StringBuilder sb2 = new StringBuilder(sku.length() + 70);
                    sb2.append("Time out while launching Price Change Flow for sku: ");
                    sb2.append(sku);
                    sb2.append("; try to reconnect");
                    zza.zzb("BillingClient", sb2.toString());
                    priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzr);
                } catch (Exception unused2) {
                    StringBuilder sb3 = new StringBuilder(sku.length() + 78);
                    sb3.append("Exception caught while launching Price Change Flow for sku: ");
                    sb3.append(sku);
                    sb3.append("; try to reconnect");
                    zza.zzb("BillingClient", sb3.toString());
                    priceChangeConfirmationListener.onPriceChangeConfirmationResult(zzam.zzq);
                }
            }
        }
    }

    private BillingClientImpl(Context context, boolean z, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, z);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    BillingClientImpl(java.lang.String r7, boolean r8, android.content.Context r9, com.android.billingclient.api.PurchasesUpdatedListener r10) {
        /*
            r6 = this;
            java.lang.String r7 = "com.android.billingclient.ktx.BuildConfig"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r8 = "VERSION_NAME"
            java.lang.reflect.Field r7 = r7.getField(r8)     // Catch:{ Exception -> 0x0014 }
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            java.lang.String r7 = "3.0.3"
        L_0x0016:
            r4 = r7
            r2 = 1
            r5 = 0
            r0 = r6
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.<init>(java.lang.String, boolean, android.content.Context, com.android.billingclient.api.PurchasesUpdatedListener):void");
    }

    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            zza.zza("BillingClient", "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzp);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            zza.zzb("BillingClient", "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzd);
        } else if (i == 3) {
            zza.zzb("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzq);
        } else {
            this.zza = 1;
            this.zzd.zza();
            zza.zza("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzah(this, billingClientStateListener, (zzs) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zzf.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zza.zzb("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zzf.bindService(intent2, this.zzh, 1)) {
                            zza.zza("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        zza.zzb("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.zza = 0;
            zza.zza("BillingClient", "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(zzam.zzc);
        }
    }
}
