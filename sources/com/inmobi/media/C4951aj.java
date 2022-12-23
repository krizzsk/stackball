package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.inmobi.media.aj */
/* compiled from: AdAssetBatch */
public final class C4951aj {

    /* renamed from: a */
    public List<C4949ai> f11209a = new ArrayList();

    /* renamed from: b */
    Set<C5005ba> f11210b;

    /* renamed from: c */
    Set<String> f11211c = new HashSet();

    /* renamed from: d */
    int f11212d;

    /* renamed from: e */
    int f11213e;

    /* renamed from: f */
    public String f11214f;

    /* renamed from: g */
    public String f11215g;

    /* renamed from: h */
    private String f11216h;

    /* renamed from: i */
    private String f11217i;

    /* renamed from: j */
    private final WeakReference<C4980au> f11218j;

    public C4951aj(String str, String str2, Set<C5005ba> set, C4980au auVar) {
        this.f11216h = str;
        this.f11217i = str2;
        this.f11210b = set;
        this.f11218j = new WeakReference<>(auVar);
    }

    public C4951aj(String str, Set<C5005ba> set, C4980au auVar, String str2) {
        this.f11216h = str;
        this.f11215g = str2;
        this.f11210b = set;
        this.f11218j = new WeakReference<>(auVar);
    }

    /* renamed from: a */
    public final C4980au mo40060a() {
        return (C4980au) this.f11218j.get();
    }

    public final String toString() {
        return "AdAssetBatch{mRawAssets=" + this.f11210b + ", mBatchDownloadSuccessCount=" + this.f11212d + ", mBatchDownloadFailureCount=" + this.f11213e + '}';
    }
}
