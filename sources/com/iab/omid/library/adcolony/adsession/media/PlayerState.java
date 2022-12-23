package com.iab.omid.library.adcolony.adsession.media;

public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");
    

    /* renamed from: a */
    private final String f10272a;

    private PlayerState(String str) {
        this.f10272a = str;
    }

    public String toString() {
        return this.f10272a;
    }
}
