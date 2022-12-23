package com.smaato.sdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.smaato.sdk.SdkBase;
import com.smaato.sdk.inject.Component;
import com.smaato.sdk.inject.Provides;
import com.smaato.sdk.log.Logger;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.p246ad.AdCache;
import com.smaato.sdk.p246ad.BeaconTracker;
import com.smaato.sdk.p246ad.ExpirationChecker;
import com.smaato.sdk.p246ad.LinkResolver;
import com.smaato.sdk.p257ub.AdMarkup;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.res.ImageLoader;
import com.smaato.sdk.res.IntentLauncher;
import com.smaato.sdk.sys.LocationAware;
import com.smaato.sdk.sys.NetWatcher;
import com.smaato.sdk.sys.TzSettings;
import com.smaato.sdk.util.Schedulers;

@Component
public abstract class SdkBase {
    public abstract BeaconTracker beaconTracker();

    public abstract SmaatoBridge bridge();

    public abstract Context context();

    public abstract HttpClient defaultHttpClient();

    public abstract Schedulers executors();

    public abstract ExpirationChecker expirationChecker();

    public abstract ImageLoader imageLoader();

    public abstract IntentLauncher intentLauncher();

    public abstract LinkResolver linkResolver();

    public abstract LocationAware locationAware();

    public abstract NetWatcher netWatcher();

    public abstract HttpClient somaHttpClient();

    public abstract String somaUrl();

    public abstract UbCache ubCache();

    static {
        Logger.plant(new Logger.LogCatTree());
    }

    static abstract class Graph {
        static /* synthetic */ boolean lambda$ubAdCache$0(AdMarkup adMarkup) {
            return adMarkup.expiresAt() - System.currentTimeMillis() > 0;
        }

        /* access modifiers changed from: package-private */
        @Provides
        public static AdCache<AdMarkup> ubAdCache() {
            return new AdCache<>(20, $$Lambda$SdkBase$Graph$geRAmTYHxu3IpF4DY0TBQFy44.INSTANCE);
        }

        @Provides
        static TzSettings tzSettings(Context context) {
            return new TzSettings(context) {
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final boolean isAutoTimeZoneEnabled() {
                    return SdkBase.Graph.lambda$tzSettings$1(this.f$0);
                }
            };
        }

        static /* synthetic */ boolean lambda$tzSettings$1(Context context) {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "auto_time_zone", 0) > 0 : Settings.System.getInt(context.getContentResolver(), "auto_time_zone", 0) > 0;
        }
    }
}
