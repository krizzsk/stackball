package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p244cm.internal.aacaa;
import com.ogury.p244cm.internal.bacab;
import java.util.List;

/* renamed from: com.ogury.cm.internal.aabbb */
public final class aabbb {

    /* renamed from: a */
    public static final aaaaa f20342a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final SharedPreferences f20343b;

    /* renamed from: c */
    private final abaab f20344c;

    /* renamed from: com.ogury.cm.internal.aabbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public aabbb(Context context, abaab abaab) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(abaab, "timeUtils");
        this.f20344c = abaab;
        SharedPreferences sharedPreferences = context.getSharedPreferences("cacheConsentExternal", 0);
        bbabc.m22048a((Object) sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f20343b = sharedPreferences;
    }

    public /* synthetic */ aabbb(Context context, abaab abaab, int i, bbabb bbabb) {
        this(context, abaab.f20382a);
    }

    /* renamed from: a */
    private static aabac m21747a(aabab aabab) {
        return aabab instanceof aabac ? (aabac) aabab : new aabac(aabab.mo52648b(), aabab.mo52649c(), new Integer[0]);
    }

    /* renamed from: b */
    private synchronized aabab m21749b() {
        Integer[] numArr;
        int i = this.f20343b.getInt("tcfVersion", 0);
        String string = this.f20343b.getString("consentString", "");
        if (i == 2) {
            SharedPreferences sharedPreferences = this.f20343b;
            Integer[] numArr2 = new Integer[0];
            bbabc.m22051b(sharedPreferences, "receiver$0");
            bbabc.m22051b("tcfv2_nonIabVendorIdsAccepted", SDKConstants.PARAM_KEY);
            bbabc.m22051b(numArr2, "defaultIntArray");
            String string2 = sharedPreferences.getString("tcfv2_nonIabVendorIdsAccepted", "");
            bbabc.m22048a((Object) string2, "serializedIntArray");
            if (string2.length() == 0) {
                numArr = numArr2;
            } else {
                Object[] array = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(string2)).toArray(new Integer[0]);
                if (array != null) {
                    numArr = (Integer[]) array;
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            bbabc.m22048a((Object) string, "consentString");
            return new aabac(string, (aabba) null, numArr, 2, (bbabb) null);
        }
        bbabc.m22048a((Object) string, "consentString");
        return new aabab(i, string, (aabba) null, 4, (bbabb) null);
    }

    /* renamed from: a */
    public final void mo52651a() {
        this.f20343b.edit().clear().apply();
    }

    /* renamed from: a */
    public final synchronized void mo52652a(aaacc aaacc, boolean z) {
        bbabc.m22051b(aaacc, "externalConsentData");
        if (aaacc instanceof aabab) {
            OguryIntegrationLogger.m22104d("[Consent][External] Marking the consent data as sent...");
            SharedPreferences.Editor edit = this.f20343b.edit();
            edit.clear();
            edit.putLong("dt", z ? abaab.m21793a() : -1);
            edit.putInt("tcfVersion", ((aabab) aaacc).mo52647a());
            edit.putString("consentString", ((aabab) aaacc).mo52648b());
            if (((aabab) aaacc).mo52647a() == 2) {
                Integer[] d = aaacc instanceof aabac ? ((aabac) aaacc).mo52650d() : new Integer[0];
                bbabc.m22048a((Object) edit, "editor");
                bbabc.m22051b(edit, "receiver$0");
                bbabc.m22051b("tcfv2_nonIabVendorIdsAccepted", SDKConstants.PARAM_KEY);
                bbabc.m22051b(d, "intArray");
                edit.putString("tcfv2_nonIabVendorIdsAccepted", aacaa.aaaaa.m21768a(d));
            }
            edit.apply();
            OguryIntegrationLogger.m22104d("[Consent][External] Consent data marked");
        }
    }

    /* renamed from: a */
    public final boolean mo52653a(aaacc aaacc) {
        bbabc.m22051b(aaacc, "externalConsentData");
        if (!(aaacc instanceof aabab)) {
            return false;
        }
        aabab b = m21749b();
        aabab aabab = (aabab) aaacc;
        if (b.mo52647a() != aabab.mo52647a() || (!bbabc.m22050a((Object) b.mo52648b(), (Object) aabab.mo52648b()))) {
            return false;
        }
        if (b.mo52647a() != 2) {
            return true;
        }
        List a = bacab.aaaaa.m22027a((T[]) m21747a(b).mo52650d());
        List a2 = bacab.aaaaa.m22027a((T[]) m21747a(aabab).mo52650d());
        bbabc.m22051b(a, "receiver$0");
        bbabc.m22051b(a2, "other");
        if (a == a2) {
            return true;
        }
        if (a.size() != a2.size()) {
            return false;
        }
        return a.containsAll(a2);
    }

    /* renamed from: b */
    public final boolean mo52654b(aaacc aaacc) {
        bbabc.m22051b(aaacc, "externalConsentData");
        if (!(aaacc instanceof aabab)) {
            return true;
        }
        long j = this.f20343b.getLong("dt", 0);
        if (j == -1) {
            return false;
        }
        return j == 0 || abaab.m21793a() > j + 86400000;
    }
}
