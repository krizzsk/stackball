package com.iab.omid.library.corpmailru.adsession;

import android.view.View;
import com.iab.omid.library.corpmailru.p098d.C4631e;
import com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4631e.m9834a();
        C4631e.m9837a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4631e.m9837a((Object) adSessionContext, "AdSessionContext is null");
        return new C4610a(adSessionConfiguration, adSessionContext);
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
