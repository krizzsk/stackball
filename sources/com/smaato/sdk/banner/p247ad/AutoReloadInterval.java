package com.smaato.sdk.banner.p247ad;

/* renamed from: com.smaato.sdk.banner.ad.AutoReloadInterval */
public enum AutoReloadInterval {
    DISABLED(0),
    DEFAULT(60),
    VERY_SHORT(10),
    SHORT(30),
    NORMAL(60),
    LONG(120),
    VERY_LONG(240);
    
    private final int seconds;

    private AutoReloadInterval(int i) {
        this.seconds = i;
    }

    public final int getSeconds() {
        return this.seconds;
    }
}
