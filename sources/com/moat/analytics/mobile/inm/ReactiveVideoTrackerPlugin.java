package com.moat.analytics.mobile.inm;

import android.app.Activity;
import android.view.View;
import com.moat.analytics.mobile.inm.C7286x;
import com.moat.analytics.mobile.inm.p240a.p242b.C7224a;
import java.util.Map;

public class ReactiveVideoTrackerPlugin implements MoatPlugin<ReactiveVideoTracker> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f18092a;

    /* renamed from: com.moat.analytics.mobile.inm.ReactiveVideoTrackerPlugin$a */
    static class C7220a implements ReactiveVideoTracker {
        C7220a() {
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

        public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
            return false;
        }
    }

    public ReactiveVideoTrackerPlugin(String str) {
        this.f18092a = str;
    }

    /* renamed from: c */
    public ReactiveVideoTracker mo49284a() {
        return (ReactiveVideoTracker) C7286x.m18603a(new C7286x.C7288a<ReactiveVideoTracker>() {
            /* renamed from: a */
            public C7224a<ReactiveVideoTracker> mo49314a() {
                C7261p.m18547a("[INFO] ", "Attempting to create ReactiveVideoTracker");
                return C7224a.m18385a(new C7290y(ReactiveVideoTrackerPlugin.this.f18092a));
            }
        }, ReactiveVideoTracker.class);
    }

    /* renamed from: d */
    public ReactiveVideoTracker mo49285b() {
        return new C7220a();
    }
}
