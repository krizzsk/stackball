package com.smaato.sdk.p246ad;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.smaato.sdk.SmaatoBridge;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;
import com.smaato.sdk.flow.Publisher;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.util.Schedulers;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.smaato.sdk.ad.LinkResolverImpl */
public class LinkResolverImpl implements LinkResolver {
    private final SmaatoBridge bridge;
    private final Context context;
    private final HttpClient httpClient;
    private final Schedulers schedulers;

    @Inject
    LinkResolverImpl(Context context2, HttpClient httpClient2, Schedulers schedulers2, SmaatoBridge smaatoBridge) {
        this.context = context2;
        this.httpClient = httpClient2;
        this.schedulers = schedulers2;
        this.bridge = smaatoBridge;
    }

    public Flow<Intent> resolve(String str) {
        if (str != null) {
            return Flow.fromCallable(new Callable(str) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final Object call() {
                    return LinkResolverImpl.this.lambda$resolve$0$LinkResolverImpl(this.f$1);
                }
            }).switchIfError(new Function1(str) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final Object apply(Object obj) {
                    return LinkResolverImpl.this.lambda$resolve$1$LinkResolverImpl(this.f$1, (Throwable) obj);
                }
            }).subscribeOn(this.schedulers.mo56385io()).observeOn(this.schedulers.main());
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        if (r2 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ android.content.Intent lambda$resolveRedirectUrl$2$LinkResolverImpl(java.lang.String r8) throws java.lang.Exception {
        /*
            r7 = this;
            com.smaato.sdk.net.Request r0 = com.smaato.sdk.net.Request.get(r8)
            com.smaato.sdk.net.Request$Builder r0 = r0.buildUpon()
            r1 = 0
            com.smaato.sdk.net.Request$Builder r0 = r0.followRedirects(r1)
            com.smaato.sdk.net.Request r0 = r0.build()
        L_0x0011:
            com.smaato.sdk.net.HttpClient r2 = r7.httpClient     // Catch:{ Exception -> 0x00b2 }
            com.smaato.sdk.net.Call r2 = r2.newCall(r0)     // Catch:{ Exception -> 0x00b2 }
            com.smaato.sdk.net.Response r2 = r2.execute()     // Catch:{ Exception -> 0x00b2 }
            boolean r3 = r2.isRedirect()     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x008e
            com.smaato.sdk.net.Headers r3 = r2.headers()     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "Location"
            java.util.List r3 = r3.values(r4)     // Catch:{ all -> 0x00a4 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x0076
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a4 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x00a4 }
            boolean r4 = r3.isAbsolute()     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x004e
            com.smaato.sdk.net.Request$Builder r4 = r0.buildUpon()     // Catch:{ all -> 0x00a4 }
            com.smaato.sdk.net.Request$Builder r3 = r4.uri(r3)     // Catch:{ all -> 0x00a4 }
            com.smaato.sdk.net.Request r0 = r3.build()     // Catch:{ all -> 0x00a4 }
            goto L_0x0076
        L_0x004e:
            com.smaato.sdk.net.Request$Builder r4 = r0.buildUpon()     // Catch:{ all -> 0x00a4 }
            android.net.Uri r5 = r0.uri()     // Catch:{ all -> 0x00a4 }
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ all -> 0x00a4 }
            java.lang.String r6 = r3.getPath()     // Catch:{ all -> 0x00a4 }
            android.net.Uri$Builder r5 = r5.path(r6)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = r3.getQuery()     // Catch:{ all -> 0x00a4 }
            android.net.Uri$Builder r3 = r5.query(r3)     // Catch:{ all -> 0x00a4 }
            android.net.Uri r3 = r3.build()     // Catch:{ all -> 0x00a4 }
            com.smaato.sdk.net.Request$Builder r3 = r4.uri(r3)     // Catch:{ all -> 0x00a4 }
            com.smaato.sdk.net.Request r0 = r3.build()     // Catch:{ all -> 0x00a4 }
        L_0x0076:
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ Exception -> 0x00b2 }
        L_0x007b:
            if (r0 == 0) goto L_0x007e
            goto L_0x0011
        L_0x007e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "Unable to resolve "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        L_0x008e:
            com.smaato.sdk.net.Request r8 = r2.request()     // Catch:{ all -> 0x00a4 }
            android.net.Uri r8 = r8.uri()     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00a4 }
            android.content.Intent r8 = r7.lambda$resolve$0$LinkResolverImpl(r8)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ Exception -> 0x00b2 }
        L_0x00a3:
            return r8
        L_0x00a4:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            if (r2 == 0) goto L_0x00b1
            r2.close()     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r2 = move-exception
            r8.addSuppressed(r2)     // Catch:{ Exception -> 0x00b2 }
        L_0x00b1:
            throw r1     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            android.net.Uri r8 = r0.uri()
            java.lang.String r8 = r8.toString()
            android.content.Intent r8 = r7.createInternalBrowserIntent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.p246ad.LinkResolverImpl.lambda$resolveRedirectUrl$2$LinkResolverImpl(java.lang.String):android.content.Intent");
    }

    /* access modifiers changed from: private */
    /* renamed from: resolveExternalAppUrl */
    public Intent lambda$resolve$0$LinkResolverImpl(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            PackageManager packageManager = this.context.getPackageManager();
            HashSet hashSet = new HashSet();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://")), 0)) {
                hashSet.add(resolveInfo.activityInfo.targetActivity);
            }
            Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT");
            for (ResolveInfo resolveInfo2 : packageManager.queryIntentActivities(addCategory, 0)) {
                if (!hashSet.contains(resolveInfo2.activityInfo.targetActivity)) {
                    return addCategory.addFlags(268435456);
                }
            }
            throw new IllegalArgumentException("No such app supports ".concat(String.valueOf(str)));
        } else if (SDKConstants.PARAM_INTENT.equalsIgnoreCase(str.substring(0, 6))) {
            return createExternalAppIntent(str);
        } else {
            return new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
    }

    private Intent createExternalAppIntent(String str) {
        boolean z = true;
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            List<ResolveInfo> queryIntentActivities = this.context.getPackageManager().queryIntentActivities(parseUri, 0);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (z) {
                return parseUri;
            }
            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                return createInternalBrowserIntent(stringExtra);
            }
            String stringExtra2 = parseUri.getStringExtra("package");
            if (!TextUtils.isEmpty(stringExtra2)) {
                return new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", stringExtra2).build());
            }
            throw new IllegalArgumentException("No such app supports ".concat(String.valueOf(str)));
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private Intent createInternalBrowserIntent(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return this.bridge.createBrowserIntent(this.context, str);
        }
        throw new IllegalArgumentException("Not browsable url ".concat(String.valueOf(str)));
    }

    public /* synthetic */ Publisher lambda$resolve$1$LinkResolverImpl(String str, Throwable th) throws Throwable {
        return Flow.fromCallable(new Callable(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object call() {
                return LinkResolverImpl.this.lambda$resolveRedirectUrl$2$LinkResolverImpl(this.f$1);
            }
        });
    }
}
