package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.p104d.C4680e;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C4680e.m10051a();
        C4680e.m10054a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C4680e.m10054a((Object) adSessionContext, "AdSessionContext is null");
        return new C4660a(adSessionConfiguration, adSessionContext);
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
