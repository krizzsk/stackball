package com.smaato.sdk.sys;

import android.content.Context;
import android.text.TextUtils;
import com.adcolony.sdk.AdColonyAppOptions;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.dns.DnsLookup;
import com.smaato.sdk.dns.TxtRecord;
import com.smaato.sdk.log.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class LocationAwareImpl implements LocationAware {

    /* renamed from: EU */
    static final Set<String> f21807EU = new HashSet(TZ_TO_COUNTRY.values());
    private static final Set<String> ONLY_APPLICABLE_FOR;
    static final Map<String, String> TZ_TO_COUNTRY = new HashMap();
    private final Context context;
    private final DnsLookup dns;
    private volatile Boolean isGeoDns;
    private final SimInfo simInfo;
    private final TzSettings tzSettings;

    static {
        HashSet hashSet = new HashSet();
        ONLY_APPLICABLE_FOR = hashSet;
        hashSet.add("com.grindrapp.android");
        TZ_TO_COUNTRY.put("Europe/Amsterdam", "NL");
        TZ_TO_COUNTRY.put("Europe/Athens", "CY");
        TZ_TO_COUNTRY.put("Europe/Berlin", "DE");
        TZ_TO_COUNTRY.put("Europe/Bratislava", "SK");
        TZ_TO_COUNTRY.put("Europe/Brussels", "BE");
        TZ_TO_COUNTRY.put("Europe/Bucharest", "RO");
        TZ_TO_COUNTRY.put("Europe/Budapest", "HU");
        TZ_TO_COUNTRY.put("Europe/Copenhagen", "DK");
        TZ_TO_COUNTRY.put("Europe/Dublin", "IE");
        TZ_TO_COUNTRY.put("Europe/Helsinki", "FI");
        TZ_TO_COUNTRY.put("Europe/Lisbon", "PT");
        TZ_TO_COUNTRY.put("Europe/Ljubljana", "SI");
        TZ_TO_COUNTRY.put("Europe/London", "GB");
        TZ_TO_COUNTRY.put("Europe/Luxembourg", "LU");
        TZ_TO_COUNTRY.put("Europe/Madrid", "ES");
        TZ_TO_COUNTRY.put("Europe/Malta", "MT");
        TZ_TO_COUNTRY.put("Europe/Oslo", "NO");
        TZ_TO_COUNTRY.put("Europe/Paris", "FR");
        TZ_TO_COUNTRY.put("Europe/Prague", "CZ");
        TZ_TO_COUNTRY.put("Europe/Riga", "LV");
        TZ_TO_COUNTRY.put("Europe/Rome", "IT");
        TZ_TO_COUNTRY.put("Europe/Sofia", "BG");
        TZ_TO_COUNTRY.put("Europe/Stockholm", "SE");
        TZ_TO_COUNTRY.put("Europe/Tallinn", "EE");
        TZ_TO_COUNTRY.put("Europe/Vaduz", "LI");
        TZ_TO_COUNTRY.put("Europe/Vienna", "AT");
        TZ_TO_COUNTRY.put("Europe/Vilnius", "LT");
        TZ_TO_COUNTRY.put("Europe/Warsaw", "PL");
        TZ_TO_COUNTRY.put("Europe/Zagreb", "HR");
        TZ_TO_COUNTRY.put("Atlantic/Reykjavik", IronSourceConstants.INTERSTITIAL_EVENT_TYPE);
    }

    @Inject
    LocationAwareImpl(Context context2, SimInfo simInfo2, TzSettings tzSettings2, DnsLookup dnsLookup) {
        this.context = context2;
        this.simInfo = simInfo2;
        this.tzSettings = tzSettings2;
        this.dns = dnsLookup;
    }

    public boolean isApplicable() {
        return ONLY_APPLICABLE_FOR.isEmpty() || ONLY_APPLICABLE_FOR.contains(this.context.getPackageName());
    }

    public boolean isGdprCountry() {
        boolean z;
        if (isGdprCountry(this.simInfo.getSimCountryIso()) || isGdprCountry(this.simInfo.getNetworkCountryIso())) {
            return true;
        }
        if (this.tzSettings.isAutoTimeZoneEnabled()) {
            z = TZ_TO_COUNTRY.containsKey(TimeZone.getDefault().getID());
        } else {
            z = false;
        }
        if (z || isGdprGeoDns()) {
            return true;
        }
        return false;
    }

    private boolean isGdprGeoDns() {
        if (this.isGeoDns == null) {
            synchronized (this) {
                if (this.isGeoDns == null) {
                    try {
                        this.isGeoDns = Boolean.FALSE;
                        for (TxtRecord data : this.dns.blockingTxt("geoclue.smaato.net")) {
                            String[] split = data.data().split(CertificateUtil.DELIMITER);
                            if (split.length > 1 && AdColonyAppOptions.GDPR.equalsIgnoreCase(split[1].trim())) {
                                this.isGeoDns = Boolean.TRUE;
                            }
                        }
                    } catch (IOException e) {
                        Logger.m24078e(e);
                    }
                }
            }
        }
        if (this.isGeoDns == null || !this.isGeoDns.booleanValue()) {
            return false;
        }
        return true;
    }

    private static boolean isGdprCountry(String str) {
        return !TextUtils.isEmpty(str) && f21807EU.contains(str.toUpperCase(Locale.US));
    }
}
