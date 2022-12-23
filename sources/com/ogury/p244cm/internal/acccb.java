package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.ogury.p244cm.internal.aacaa;

/* renamed from: com.ogury.cm.internal.acccb */
public final class acccb extends accca {

    /* renamed from: b */
    public static final aaaaa f20562b = new aaaaa((bbabb) null);

    /* renamed from: c */
    private String f20563c = "cacheConsentV2";

    /* renamed from: com.ogury.cm.internal.acccb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: b */
    private static abcac m21981b() {
        abbba abbba = abbba.f20411a;
        return (abcac) abcab.m21880d();
    }

    /* renamed from: a */
    public final String mo52761a() {
        return this.f20563c;
    }

    /* renamed from: a */
    public final void mo52758a(Context context) {
        bbabc.m22051b(context, "context");
        super.mo52758a(context);
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("TCF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences(this.f20563c, 0).edit();
            edit.putInt("purposes", m21981b().mo52713g());
            edit.putString("acceptedVendors", aacaa.aaaaa.m21768a(m21981b().mo52711e()));
            edit.putInt("specialFeatures", m21981b().mo52715i());
            edit.putString("vendorsLi", aacaa.aaaaa.m21768a(m21981b().mo52712f()));
            edit.putInt("purposesLi", m21981b().mo52714h());
            edit.putString("vendorPurposesAndSF", String.valueOf(m21981b().mo52717k()));
            edit.putInt("maxVendorId", m21981b().mo52718l());
            edit.apply();
        }
    }

    /* renamed from: c */
    public final void mo52760c(Context context) {
        bbabc.m22051b(context, "context");
        super.mo52760c(context);
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("TCF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.f20563c, 0);
            abcac b = m21981b();
            b.mo52703a(sharedPreferences.getInt("purposes", 0));
            String string = sharedPreferences.getString("acceptedVendors", "");
            bbabc.m22048a((Object) string, "prefs.getString(ACCEPTED_VENDORS, \"\")");
            Object[] array = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(string)).toArray(new Integer[0]);
            if (array != null) {
                b.mo52705a((Integer[]) array);
                b.mo52709c(sharedPreferences.getInt("specialFeatures", 0));
                String string2 = sharedPreferences.getString("vendorsLi", "");
                bbabc.m22048a((Object) string2, "prefs.getString(VENDORS_LI, \"\")");
                Object[] array2 = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(string2)).toArray(new Integer[0]);
                if (array2 != null) {
                    b.mo52708b((Integer[]) array2);
                    b.mo52706b(sharedPreferences.getInt("purposesLi", 0));
                    String string3 = sharedPreferences.getString("vendorPurposesAndSF", "");
                    bbabc.m22048a((Object) string3, "prefs.getString(VENDOR_PURPOSES_AND_SF, \"\")");
                    b.mo52707b(aacaa.aaaaa.m21770a(string3));
                    b.mo52710d(sharedPreferences.getInt("maxVendorId", 0));
                    return;
                }
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
