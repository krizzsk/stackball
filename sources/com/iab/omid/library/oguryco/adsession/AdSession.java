package com.iab.omid.library.oguryco.adsession;

import android.view.View;
import com.iab.omid.library.oguryco.p116d.C4780e;
import com.iab.omid.library.oguryco.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4780e.m10494a();
        C4780e.m10497a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4780e.m10497a((Object) adSessionContext, "AdSessionContext is null");
        return new C4758a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view);

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
