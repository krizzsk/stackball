package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.p243my.target.C7509k8;
import com.p243my.target.common.models.ImageData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.my.target.k8 */
public class C7509k8 {

    /* renamed from: a */
    public static final WeakHashMap<ImageView, ImageData> f18912a = new WeakHashMap<>();

    /* renamed from: b */
    public final List<ImageData> f18913b;

    /* renamed from: c */
    public C7510a f18914c;

    /* renamed from: d */
    public boolean f18915d;

    /* renamed from: com.my.target.k8$a */
    public interface C7510a {
        /* renamed from: a */
        void mo49454a(boolean z);
    }

    public C7509k8(List<ImageData> list) {
        this.f18913b = list;
    }

    /* renamed from: a */
    public static C7509k8 m19615a(ImageData imageData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageData);
        return new C7509k8(arrayList);
    }

    /* renamed from: a */
    public static C7509k8 m19616a(List<ImageData> list) {
        return new C7509k8(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19617a(Context context) {
        mo50747c(context);
        mo50745a();
    }

    /* renamed from: a */
    public static void m19618a(Bitmap bitmap, ImageView imageView) {
        if (imageView instanceof C7506k6) {
            ((C7506k6) imageView).setImageBitmap(bitmap, true);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public static void m19619a(ImageData imageData, ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7374e0.m18990b("[ImageLoader] method cancel called from worker thread");
            return;
        }
        WeakHashMap<ImageView, ImageData> weakHashMap = f18912a;
        if (weakHashMap.get(imageView) == imageData) {
            weakHashMap.remove(imageView);
        }
    }

    /* renamed from: a */
    public static void m19620a(ImageData imageData, ImageView imageView, C7510a aVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7374e0.m18990b("[ImageLoader] method loadAndDisplay called from worker thread");
            return;
        }
        WeakHashMap<ImageView, ImageData> weakHashMap = f18912a;
        if (weakHashMap.get(imageView) != imageData) {
            weakHashMap.remove(imageView);
            if (imageData.getBitmap() != null) {
                m19618a(imageData.getBitmap(), imageView);
                return;
            }
            weakHashMap.put(imageView, imageData);
            m19615a(imageData).mo50744a((C7510a) new C7510a(new WeakReference(imageView), imageData, aVar) {
                public final /* synthetic */ WeakReference f$0;
                public final /* synthetic */ ImageData f$1;
                public final /* synthetic */ C7509k8.C7510a f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                /* renamed from: a */
                public final void mo49454a(boolean z) {
                    C7509k8.m19621a(this.f$0, this.f$1, this.f$2, z);
                }
            }).mo50746b(imageView.getContext());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m19621a(WeakReference weakReference, ImageData imageData, C7510a aVar, boolean z) {
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            WeakHashMap<ImageView, ImageData> weakHashMap = f18912a;
            if (imageData == weakHashMap.get(imageView)) {
                weakHashMap.remove(imageView);
                Bitmap bitmap = imageData.getBitmap();
                if (bitmap != null) {
                    m19618a(bitmap, imageView);
                }
            }
        }
        if (aVar != null) {
            aVar.mo49454a(imageData.getBitmap() != null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19622b() {
        C7510a aVar = this.f18914c;
        if (aVar != null) {
            aVar.mo49454a(true);
            this.f18914c = null;
        }
    }

    /* renamed from: b */
    public static void m19623b(ImageData imageData, ImageView imageView) {
        m19620a(imageData, imageView, (C7510a) null);
    }

    /* renamed from: a */
    public C7509k8 mo50744a(C7510a aVar) {
        this.f18914c = aVar;
        return this;
    }

    /* renamed from: a */
    public final void mo50745a() {
        if (this.f18914c != null) {
            C7395f0.m19090c(new Runnable() {
                public final void run() {
                    C7509k8.this.m19622b();
                }
            });
        }
    }

    /* renamed from: b */
    public void mo50746b(Context context) {
        if (this.f18913b.isEmpty()) {
            mo50745a();
        } else {
            C7395f0.m19086a(new Runnable(context.getApplicationContext()) {
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7509k8.this.m19617a(this.f$1);
                }
            });
        }
    }

    /* renamed from: c */
    public void mo50747c(Context context) {
        Bitmap bitmap;
        if (C7395f0.m19089b()) {
            C7374e0.m18990b("[ImageLoader] method loadSync called from main thread");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C7400f3 d = this.f18915d ? C7400f3.m19121d() : C7400f3.m19122e();
        for (ImageData next : this.f18913b) {
            if (next.getBitmap() == null && (bitmap = (Bitmap) d.mo50288b(next.getUrl(), (String) null, applicationContext)) != null) {
                next.setData(bitmap);
                if (next.getHeight() == 0 || next.getWidth() == 0) {
                    next.setHeight(bitmap.getHeight());
                    next.setWidth(bitmap.getWidth());
                }
            }
        }
    }
}
