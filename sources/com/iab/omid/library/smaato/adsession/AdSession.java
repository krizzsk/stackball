package com.iab.omid.library.smaato.adsession;

import android.view.View;
import com.iab.omid.library.smaato.p122d.C4829e;
import com.iab.omid.library.smaato.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4829e.m10709a();
        C4829e.m10712a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4829e.m10712a((Object) adSessionContext, "AdSessionContext is null");
        return new C4809a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void start();
}
