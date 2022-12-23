package com.smaato.sdk.core.deeplink;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.smaato.sdk.core.Task;
import com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Intents;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.net.URISyntaxException;
import java.util.List;

public final class LinkResolver {
    private final Application application;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final RedirectResolver redirectResolver;
    private final UrlCreator urlCreator;

    LinkResolver(Logger logger2, Application application2, RedirectResolver redirectResolver2, UrlCreator urlCreator2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for LinkResolver::new");
        this.application = (Application) Objects.requireNonNull(application2, "Parameter application cannot be null for LinkResolver::new");
        this.redirectResolver = (RedirectResolver) Objects.requireNonNull(redirectResolver2, "Parameter redirectResolver cannot be null for LinkResolver::new");
        this.urlCreator = (UrlCreator) Objects.requireNonNull(urlCreator2, "Parameter urlCreator cannot be null for LinkResolver::new");
    }

    public final Task handleClickThroughUrl(SomaApiContext somaApiContext, final String str, final UrlResolveListener urlResolveListener) {
        final Either<Intent, String> findExternalAppForUrl = findExternalAppForUrl(str);
        return findExternalAppForUrl != null ? new Task() {
            public void cancel() {
            }

            public void start() {
                Consumer access$000 = LinkResolver.access$000(LinkResolver.this, findExternalAppForUrl);
                if (access$000 != null) {
                    urlResolveListener.onSuccess(access$000);
                } else {
                    urlResolveListener.onError();
                }
            }
        } : this.redirectResolver.submitRequest(str, somaApiContext, (Task.Listener<String, Exception>) new Task.Listener<String, Exception>() {
            public void onSuccess(Task task, String str) {
                Consumer consumer;
                Either<Intent, String> findExternalAppForUrl = LinkResolver.this.findExternalAppForUrl(str);
                if (findExternalAppForUrl != null) {
                    consumer = LinkResolver.access$000(LinkResolver.this, findExternalAppForUrl);
                } else {
                    consumer = LinkResolver.this.getInternalBrowserLauncher(str);
                }
                if (consumer != null) {
                    urlResolveListener.onSuccess(consumer);
                } else {
                    urlResolveListener.onError();
                }
            }

            public void onFailure(Task task, Exception exc) {
                LinkResolver.this.logger.error(LogDomain.CORE, exc, "Failed to resolve url: %s", str);
                urlResolveListener.onError();
            }
        });
    }

    /* access modifiers changed from: private */
    public Consumer<Context> getInternalBrowserLauncher(String str) {
        if (this.urlCreator.isSupportedForNetworking(str)) {
            return new Consumer(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    Intents.startIntent((Context) obj, SmaatoSdkBrowserActivity.createIntent((Context) obj, this.f$0));
                }
            };
        }
        return null;
    }

    private Either<Intent, String> createIntentSchemeIntent(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (Intents.canHandleIntent(this.application, parseUri)) {
                return Either.left(parseUri);
            }
            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                return Either.right(stringExtra);
            }
            String stringExtra2 = parseUri.getStringExtra("package");
            if (TextUtils.isEmpty(stringExtra2)) {
                return null;
            }
            return Either.left(Intents.createViewIntent("market://details?id=".concat(String.valueOf(stringExtra2))));
        } catch (URISyntaxException e) {
            this.logger.error(LogDomain.CORE, e, "Failed to parse intent: uri", new Object[0]);
            return null;
        }
    }

    public final Intent getExternalBrowserIntent(String str) {
        Intent createViewIntent = Intents.createViewIntent(str);
        createViewIntent.addFlags(268435456);
        if (Intents.canHandleIntent(this.application, createViewIntent)) {
            return createViewIntent;
        }
        return null;
    }

    public final Intent getExternalBrowserAppInstallIntent(String str) {
        Intent createViewIntent = Intents.createViewIntent("market://search?q=browser&c=apps");
        if (Intents.canHandleIntent(this.application, createViewIntent)) {
            return createViewIntent;
        }
        return null;
    }

    public final Either<Intent, String> findExternalAppForUrl(String str) {
        if (this.urlCreator.isSupportedForNetworking(str)) {
            PackageManager packageManager = this.application.getPackageManager();
            boolean z = false;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(Intents.createViewIntent("https://"), 0);
            Intent addCategory = Intents.createViewIntent(str).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT");
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(addCategory, 0);
            if (queryIntentActivities.size() == queryIntentActivities2.size()) {
                z = Lists.mapLazy(queryIntentActivities, $$Lambda$LinkResolver$IZGqxrHbihWrusnbVuzGrglCKFQ.INSTANCE).equals(Lists.mapLazy(queryIntentActivities2, $$Lambda$LinkResolver$TLAKD2NXAIRqJZAZ4HAxbtpgjS0.INSTANCE));
            }
            Intent addFlags = z ? null : addCategory.addFlags(268435456);
            if (addFlags != null) {
                return Either.left(addFlags);
            }
            return null;
        } else if (SDKConstants.PARAM_INTENT.equalsIgnoreCase(this.urlCreator.extractScheme(str))) {
            return createIntentSchemeIntent(str);
        } else {
            Intent createViewIntent = Intents.createViewIntent(str);
            if (Intents.canHandleIntent(this.application, createViewIntent)) {
                return Either.left(createViewIntent);
            }
            return null;
        }
    }

    static /* synthetic */ Consumer access$000(LinkResolver linkResolver, Either either) {
        Intent intent = (Intent) either.left();
        if (intent != null) {
            return new Consumer(intent) {
                public final /* synthetic */ Intent f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    Intents.startIntent((Context) obj, this.f$0);
                }
            };
        }
        return linkResolver.getInternalBrowserLauncher((String) either.right());
    }
}
