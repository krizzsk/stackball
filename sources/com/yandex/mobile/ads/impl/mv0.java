package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.ad0;

public final class mv0 {

    /* renamed from: c */
    private static final Object f37527c = new Object();

    /* renamed from: d */
    private static volatile mv0 f37528d;

    /* renamed from: a */
    private final ad0 f37529a;

    /* renamed from: b */
    private final C14023c f37530b;

    /* renamed from: com.yandex.mobile.ads.impl.mv0$a */
    class C14021a extends LruCache<String, Bitmap> {
        C14021a(mv0 mv0, int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        public int sizeOf(Object obj, Object obj2) {
            String str = (String) obj;
            Bitmap bitmap = (Bitmap) obj2;
            if (bitmap != null) {
                return bitmap.getByteCount() / 1024;
            }
            return super.sizeOf(str, (Object) null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mv0$b */
    static class C14022b implements ad0.C12377c {

        /* renamed from: a */
        private final LruCache<String, Bitmap> f37531a;

        C14022b(LruCache<String, Bitmap> lruCache) {
            this.f37531a = lruCache;
        }

        /* renamed from: a */
        public Bitmap mo65731a(String str) {
            return this.f37531a.get(str);
        }

        /* renamed from: a */
        public void mo65732a(String str, Bitmap bitmap) {
            this.f37531a.put(str, bitmap);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mv0$c */
    public interface C14023c {
        /* renamed from: a */
        Bitmap mo68862a(String str);

        /* renamed from: a */
        void mo68863a(String str, Bitmap bitmap);
    }

    private mv0(Context context) {
        LruCache<String, Bitmap> a = m39738a(context);
        u41 b = m39739b(context);
        C14022b bVar = new C14022b(a);
        vc0 vc0 = new vc0();
        this.f37530b = new tg1(a, vc0);
        this.f37529a = new b91(b, bVar, vc0);
    }

    /* renamed from: a */
    private LruCache<String, Bitmap> m39738a(Context context) {
        int i;
        try {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i = Math.min(maxMemory / 8, ((int) ((((float) (displayMetrics.widthPixels * displayMetrics.heightPixels)) * displayMetrics.density) / 1024.0f)) * 3);
        } catch (IllegalArgumentException unused) {
            i = 5120;
        }
        return new C14021a(this, Math.max(i, 5120));
    }

    /* renamed from: c */
    public static mv0 m39740c(Context context) {
        if (f37528d == null) {
            synchronized (f37527c) {
                if (f37528d == null) {
                    f37528d = new mv0(context);
                }
            }
        }
        return f37528d;
    }

    /* renamed from: b */
    public C14023c mo68860b() {
        return this.f37530b;
    }

    /* renamed from: b */
    private u41 m39739b(Context context) {
        u41 a = v41.m43030a(context, 4);
        a.mo70285a();
        return a;
    }

    /* renamed from: a */
    public ad0 mo68859a() {
        return this.f37529a;
    }
}
