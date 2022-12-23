package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.p092d.C4581e;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4581e.m9610a();
        C4581e.m9613a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4581e.m9613a((Object) adSessionContext, "AdSessionContext is null");
        return new C4560a(adSessionConfiguration, adSessionContext);
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
