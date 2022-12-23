package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    public static final String EXTRA_PARAM_KEY_OLD_SKUS = "skusToReplace";
    public static final String EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN = "oldSkuPurchaseToken";
    public static final String EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE = "prorationMode";
    public static final String EXTRA_PARAM_KEY_VR = "vr";
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public String zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public int zzf = 0;
    /* access modifiers changed from: private */
    public ArrayList<SkuDetails> zzg;
    /* access modifiers changed from: private */
    public boolean zzh;

    /* compiled from: com.android.billingclient:billing@@3.0.3 */
    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private String zzd;
        private int zze = 0;
        private ArrayList<SkuDetails> zzf;
        private boolean zzg;

        private Builder() {
        }

        /* synthetic */ Builder(zzak zzak) {
        }

        public BillingFlowParams build() {
            ArrayList<SkuDetails> arrayList = this.zzf;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.zzf;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (arrayList2.get(i) != null) {
                    i = i2;
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            }
            if (this.zzf.size() > 1) {
                SkuDetails skuDetails = this.zzf.get(0);
                String type = skuDetails.getType();
                ArrayList<SkuDetails> arrayList3 = this.zzf;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    SkuDetails skuDetails2 = arrayList3.get(i3);
                    if (type.equals("play_pass_subs") || skuDetails2.getType().equals("play_pass_subs") || type.equals(skuDetails2.getType())) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String zza2 = skuDetails.zza();
                ArrayList<SkuDetails> arrayList4 = this.zzf;
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    SkuDetails skuDetails3 = arrayList4.get(i4);
                    if (type.equals("play_pass_subs") || skuDetails3.getType().equals("play_pass_subs") || zza2.equals(skuDetails3.zza())) {
                        i4++;
                    } else {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams((zzak) null);
            boolean unused = billingFlowParams.zza = true ^ this.zzf.get(0).zza().isEmpty();
            String unused2 = billingFlowParams.zzb = this.zza;
            String unused3 = billingFlowParams.zze = this.zzd;
            String unused4 = billingFlowParams.zzc = this.zzb;
            String unused5 = billingFlowParams.zzd = this.zzc;
            int unused6 = billingFlowParams.zzf = this.zze;
            ArrayList unused7 = billingFlowParams.zzg = this.zzf;
            boolean unused8 = billingFlowParams.zzh = this.zzg;
            return billingFlowParams;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setOldSku(String str, String str2) {
            this.zzb = str;
            this.zzc = str2;
            return this;
        }

        public Builder setReplaceSkusProrationMode(int i) {
            this.zze = i;
            return this;
        }

        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.zzf = arrayList;
            return this;
        }

        public Builder setVrPurchaseFlow(boolean z) {
            this.zzg = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@3.0.3 */
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(zzak zzak) {
    }

    public static Builder newBuilder() {
        return new Builder((zzak) null);
    }

    public String getOldSku() {
        return this.zzc;
    }

    public String getOldSkuPurchaseToken() {
        return this.zzd;
    }

    public int getReplaceSkusProrationMode() {
        return this.zzf;
    }

    public String getSku() {
        return this.zzg.get(0).getSku();
    }

    public SkuDetails getSkuDetails() {
        return this.zzg.get(0);
    }

    public String getSkuType() {
        return this.zzg.get(0).getType();
    }

    public boolean getVrPurchaseFlow() {
        return this.zzh;
    }

    public final ArrayList<SkuDetails> zza() {
        ArrayList<SkuDetails> arrayList = new ArrayList<>();
        arrayList.addAll(this.zzg);
        return arrayList;
    }

    public final String zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc() {
        return (!this.zzh && this.zzb == null && this.zze == null && this.zzf == 0 && !this.zza) ? false : true;
    }

    public final String zzd() {
        return this.zze;
    }
}
