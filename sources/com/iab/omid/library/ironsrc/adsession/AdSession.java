package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.p110d.C4729e;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4729e.m10265a();
        C4729e.m10268a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4729e.m10268a((Object) adSessionContext, "AdSessionContext is null");
        return new C4708a(adSessionConfiguration, adSessionContext);
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
