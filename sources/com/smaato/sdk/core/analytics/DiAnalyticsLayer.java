package com.smaato.sdk.core.analytics;

import android.content.Context;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public final class DiAnalyticsLayer {

    interface VideoTrackerProvider extends Function<String, VideoViewabilityTracker> {
    }

    interface WebViewTrackerProvider extends Function<String, WebViewViewabilityTracker> {
    }

    private DiAnalyticsLayer() {
    }

    static /* synthetic */ void lambda$createRegistry$6(List list, DiRegistry diRegistry) {
        Iterables.forEach(list, new Consumer() {
            public final void accept(Object obj) {
                DiRegistry.this.addFrom(((ViewabilityPlugin) obj).diRegistry());
            }
        });
        diRegistry.registerSingletonFactory(Analytics.class, new ClassFactory(list) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final Object get(DiConstructor diConstructor) {
                return DiAnalyticsLayer.lambda$null$1(this.f$0, diConstructor);
            }
        });
        diRegistry.registerFactory(WebViewTrackerProvider.class, $$Lambda$DiAnalyticsLayer$j3EK0Gz7irImxkwkKgjTDsoRDSs.INSTANCE);
        diRegistry.registerFactory(VideoTrackerProvider.class, $$Lambda$DiAnalyticsLayer$yO6F0DYsuz7QH2o4mpTLJkRgZ8.INSTANCE);
    }

    static /* synthetic */ Analytics lambda$null$1(List list, DiConstructor diConstructor) {
        return new Analytics(list, (WebViewTrackerProvider) diConstructor.get(WebViewTrackerProvider.class), (VideoTrackerProvider) diConstructor.get(VideoTrackerProvider.class));
    }

    static /* synthetic */ WebViewViewabilityTracker lambda$null$2(DiConstructor diConstructor, String str) {
        return (WebViewViewabilityTracker) diConstructor.get(str, WebViewViewabilityTracker.class);
    }

    static /* synthetic */ WebViewTrackerProvider lambda$null$3(DiConstructor diConstructor) {
        return new WebViewTrackerProvider() {
            public final Object apply(Object obj) {
                return DiAnalyticsLayer.lambda$null$2(DiConstructor.this, (String) obj);
            }
        };
    }

    static /* synthetic */ VideoViewabilityTracker lambda$null$4(DiConstructor diConstructor, String str) {
        return (VideoViewabilityTracker) diConstructor.get(str, VideoViewabilityTracker.class);
    }

    static /* synthetic */ VideoTrackerProvider lambda$null$5(DiConstructor diConstructor) {
        return new VideoTrackerProvider() {
            public final Object apply(Object obj) {
                return DiAnalyticsLayer.lambda$null$4(DiConstructor.this, (String) obj);
            }
        };
    }

    public static DiRegistry createRegistry(Context context) {
        ServiceLoader<S> load = ServiceLoader.load(ViewabilityPlugin.class, context.getClassLoader());
        ArrayList arrayList = new ArrayList();
        for (S s : load) {
            if (!s.getName().isEmpty()) {
                s.init(context);
                arrayList.add(s);
            }
        }
        return DiRegistry.m24065of(new Consumer(arrayList) {
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                DiAnalyticsLayer.lambda$createRegistry$6(this.f$0, (DiRegistry) obj);
            }
        });
    }
}
