package com.facebook.ads;

import com.facebook.ads.C2043Ad;

public interface FullScreenAd extends C2043Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    C2043Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
