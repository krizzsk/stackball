package com.fyber.inneractive.sdk.p032b;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.b.c */
public final class C2722c extends C2720a {
    /* renamed from: a */
    public final void mo17960a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        Intent intent = new Intent(activity, InneractiveFullscreenAdActivity.class);
        intent.putExtra(InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, inneractiveAdSpot.getLocalUniqueId());
        try {
            IAlog.m9034b("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m9029a((Object) activity), inneractiveAdSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.m9035c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m9029a((Object) activity));
        }
    }
}
