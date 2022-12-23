package com.mbridge.msdk.video.dynview.p220c;

/* renamed from: com.mbridge.msdk.video.dynview.c.a */
/* compiled from: CusError */
public enum C6931a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one");
    

    /* renamed from: e */
    private int f17092e;

    /* renamed from: f */
    private String f17093f;

    private C6931a(int i, String str) {
        this.f17092e = i;
        this.f17093f = str;
    }

    /* renamed from: a */
    public final int mo48441a() {
        return this.f17092e;
    }

    /* renamed from: b */
    public final String mo48442b() {
        return this.f17093f;
    }
}
