package com.smaato.sdk.core.network.execution;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.util.Optional;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.util.p251fi.Predicate;
import com.smaato.sdk.core.util.p251fi.Supplier;
import java.util.Set;

public final class HttpsOnlyPolicy {
    private final Set<String> baseUrls;
    private final Logger logger;
    private final Optional<NetworkSecurityPolicy> networkSecurityPolicyOptional;
    private final UrlCreator urlCreator;

    /* JADX WARNING: type inference failed for: r5v0, types: [com.smaato.sdk.core.util.Optional<android.security.NetworkSecurityPolicy>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpsOnlyPolicy(com.smaato.sdk.core.log.Logger r2, java.util.Collection<java.lang.String> r3, com.smaato.sdk.core.network.UrlCreator r4, com.smaato.sdk.core.util.Optional<android.security.NetworkSecurityPolicy> r5) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Parameter logger cannot be null for HttpsOnlyPolicy::new"
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2, r0)
            com.smaato.sdk.core.log.Logger r2 = (com.smaato.sdk.core.log.Logger) r2
            r1.logger = r2
            java.lang.String r2 = "Parameter baseUrls cannot be null for HttpsOnlyPolicy::new"
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3, r2)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Set r2 = com.smaato.sdk.core.util.collections.Sets.toImmutableSet(r2)
            r1.baseUrls = r2
            java.lang.String r2 = "Parameter urlCreator cannot be null for HttpsOnlyPolicy::new"
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r4, r2)
            com.smaato.sdk.core.network.UrlCreator r2 = (com.smaato.sdk.core.network.UrlCreator) r2
            r1.urlCreator = r2
            java.lang.String r2 = "Parameter networkSecurityPolicyOptional cannot be null for HttpsOnlyPolicy::new"
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r5, r2)
            com.smaato.sdk.core.util.Optional r2 = (com.smaato.sdk.core.util.Optional) r2
            r1.networkSecurityPolicyOptional = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.network.execution.HttpsOnlyPolicy.<init>(com.smaato.sdk.core.log.Logger, java.util.Collection, com.smaato.sdk.core.network.UrlCreator, com.smaato.sdk.core.util.Optional):void");
    }

    public final boolean validateUrl(SomaApiContext somaApiContext, String str) {
        if (somaApiContext == null) {
            Set<String> set = this.baseUrls;
            str.getClass();
            if (Lists.any(set, new Predicate(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final boolean test(Object obj) {
                    return this.f$0.startsWith((String) obj);
                }
            })) {
                return true;
            }
        }
        return ((Boolean) this.networkSecurityPolicyOptional.filter($$Lambda$HttpsOnlyPolicy$2W8avqAbm1W8cUBqW36yHub58g.INSTANCE).map(new Function(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return HttpsOnlyPolicy.this.lambda$validateUrl$1$HttpsOnlyPolicy(this.f$1, (NetworkSecurityPolicy) obj);
            }
        }).map(new Function(str, somaApiContext) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ SomaApiContext f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return HttpsOnlyPolicy.this.lambda$validateUrl$2$HttpsOnlyPolicy(this.f$1, this.f$2, (Boolean) obj);
            }
        }).orElseGet(new Supplier(str, somaApiContext) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ SomaApiContext f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object get() {
                return HttpsOnlyPolicy.this.lambda$validateUrl$3$HttpsOnlyPolicy(this.f$1, this.f$2);
            }
        })).booleanValue();
    }

    static /* synthetic */ boolean lambda$validateUrl$0(NetworkSecurityPolicy networkSecurityPolicy) {
        return Build.VERSION.SDK_INT >= 23 && !networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    public /* synthetic */ Boolean lambda$validateUrl$1$HttpsOnlyPolicy(String str, NetworkSecurityPolicy networkSecurityPolicy) {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 24 && networkSecurityPolicy.isCleartextTrafficPermitted(this.urlCreator.extractHostname(str)));
    }

    public /* synthetic */ Boolean lambda$validateUrl$2$HttpsOnlyPolicy(String str, SomaApiContext somaApiContext, Boolean bool) {
        String extractScheme = this.urlCreator.extractScheme(str);
        boolean z = false;
        boolean z2 = this.urlCreator.isSecureScheme(extractScheme) || (this.urlCreator.isInsecureScheme(extractScheme) && somaApiContext != null && !somaApiContext.isHttpsOnly());
        if (bool.booleanValue() || z2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ Boolean lambda$validateUrl$3$HttpsOnlyPolicy(String str, SomaApiContext somaApiContext) {
        String extractScheme = this.urlCreator.extractScheme(str);
        boolean z = this.urlCreator.isSecureScheme(extractScheme) || (this.urlCreator.isInsecureScheme(extractScheme) && somaApiContext != null && !somaApiContext.isHttpsOnly());
        if (!z) {
            this.logger.error(LogDomain.NETWORK, "Invalid url or violation of httpsOnly rule: Url: %s , SomaApiContext: %s", str, somaApiContext);
        }
        return Boolean.valueOf(z);
    }
}
