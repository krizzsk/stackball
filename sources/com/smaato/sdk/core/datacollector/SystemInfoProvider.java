package com.smaato.sdk.core.datacollector;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkConnectionType;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.reflection.Reflections;
import java.util.Locale;

class SystemInfoProvider {
    private final Context context;
    private GoogleAdvertisingClientInfo googleAdvertisingClientInfo;
    private final Logger logger;
    private final NetworkStateMonitor networkStateMonitor;
    private final TelephonyManager telephonyManager;
    private final UserAgentProvider userAgentProvider;

    SystemInfoProvider(Logger logger2, Context context2, NetworkStateMonitor networkStateMonitor2, TelephonyManager telephonyManager2, UserAgentProvider userAgentProvider2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for SystemInfoProvider::new");
        this.context = (Context) Objects.requireNonNull(context2, "Parameter context cannot be null for SystemInfoProvider::new");
        this.networkStateMonitor = (NetworkStateMonitor) Objects.requireNonNull(networkStateMonitor2, "Parameter networkStateMonitor cannot be null for SystemInfoProvider::new");
        this.telephonyManager = (TelephonyManager) Objects.requireNonNull(telephonyManager2, "Parameter telephonyManager cannot be null for SystemInfoProvider::new");
        this.userAgentProvider = (UserAgentProvider) Objects.requireNonNull(userAgentProvider2, "Parameter userAgentProvider cannot be null for SystemInfoProvider::new");
    }

    public SystemInfo getSystemInfoSnapshot() {
        Locale locale;
        String simOperatorName = this.telephonyManager.getSimOperatorName();
        String simOperator = this.telephonyManager.getSimOperator();
        GoogleAdvertisingClientInfo googleAdvertisingClientInfo2 = this.googleAdvertisingClientInfo;
        if (googleAdvertisingClientInfo2 == null && Reflections.isClassInClasspath("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            googleAdvertisingClientInfo2 = new GoogleAdvertisingClientInfo(this.logger, this.context);
            this.googleAdvertisingClientInfo = googleAdvertisingClientInfo2;
        }
        String str = (String) Objects.transformOrNull(googleAdvertisingClientInfo2, $$Lambda$GO_lA4WitxSmPAnr6G0BjX_TVKI.INSTANCE);
        Boolean bool = (Boolean) Objects.transformOrNull(googleAdvertisingClientInfo2, $$Lambda$gVylY46Wvwp1OInI80o4WgpqcIQ.INSTANCE);
        String str2 = Build.MODEL;
        NetworkConnectionType networkConnectionType = this.networkStateMonitor.getNetworkConnectionType();
        String packageName = this.context.getPackageName();
        String str3 = this.userAgentProvider.get();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = this.context.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = this.context.getResources().getConfiguration().locale;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            language = Locale.getDefault().getLanguage();
        }
        return new SystemInfo(simOperatorName, simOperator, str, bool, str2, networkConnectionType, str3, packageName, language);
    }
}
