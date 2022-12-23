package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.p128d.C4878e;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4878e.m10922a();
        C4878e.m10925a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4878e.m10925a((Object) adSessionContext, "AdSessionContext is null");
        return new C4857a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void start();
}
