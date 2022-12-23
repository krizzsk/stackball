package com.moat.analytics.mobile.inm;

import android.app.Activity;
import android.app.Application;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.inm.NativeDisplayTracker;
import java.util.Map;

/* renamed from: com.moat.analytics.mobile.inm.v */
abstract class C7270v {

    /* renamed from: com.moat.analytics.mobile.inm.v$a */
    public static class C7271a extends MoatAnalytics {
        public void prepareNativeDisplayTracking(String str) {
        }

        public void start(Application application) {
        }

        public void start(MoatOptions moatOptions, Application application) {
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.v$b */
    public static class C7272b extends MoatFactory {
        public <T> T createCustomTracker(MoatPlugin<T> moatPlugin) {
            return moatPlugin.mo49285b();
        }

        public NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map) {
            return new C7273c();
        }

        public NativeVideoTracker createNativeVideoTracker(String str) {
            return new C7274d();
        }

        public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
            return new C7275e();
        }

        public WebAdTracker createWebAdTracker(WebView webView) {
            return new C7275e();
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.v$c */
    static class C7273c implements NativeDisplayTracker {
        C7273c() {
        }

        public void removeListener() {
        }

        public void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        }

        public void setActivity(Activity activity) {
        }

        public void setListener(TrackerListener trackerListener) {
        }

        public void startTracking() {
        }

        public void stopTracking() {
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.v$d */
    static class C7274d implements NativeVideoTracker {
        C7274d() {
        }

        public void changeTargetView(View view) {
        }

        public void dispatchEvent(MoatAdEvent moatAdEvent) {
        }

        public void removeListener() {
        }

        public void removeVideoListener() {
        }

        public void setActivity(Activity activity) {
        }

        public void setListener(TrackerListener trackerListener) {
        }

        public void setPlayerVolume(Double d) {
        }

        public void setVideoListener(VideoTrackerListener videoTrackerListener) {
        }

        public void stopTracking() {
        }

        public boolean trackVideoAd(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
            return false;
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.v$e */
    static class C7275e implements WebAdTracker {
        C7275e() {
        }

        public void removeListener() {
        }

        public void setActivity(Activity activity) {
        }

        public void setListener(TrackerListener trackerListener) {
        }

        public void startTracking() {
        }

        public void stopTracking() {
        }
    }

    C7270v() {
    }
}
