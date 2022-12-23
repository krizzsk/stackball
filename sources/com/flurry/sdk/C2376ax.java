package com.flurry.sdk;

/* renamed from: com.flurry.sdk.ax */
public enum C2376ax {
    COMPLETE(1),
    f5480b(2),
    INVALID_RESPONSE(3),
    PENDING_COMPLETION(4);
    

    /* renamed from: e */
    int f5484e;

    private C2376ax(int i) {
        this.f5484e = i;
    }

    /* renamed from: a */
    public static C2376ax m5092a(int i) {
        if (i == 1) {
            return COMPLETE;
        }
        if (i == 2) {
            return f5480b;
        }
        if (i == 3) {
            return INVALID_RESPONSE;
        }
        if (i != 4) {
            return null;
        }
        return PENDING_COMPLETION;
    }
}
