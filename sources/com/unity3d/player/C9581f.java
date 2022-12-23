package com.unity3d.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;

/* renamed from: com.unity3d.player.f */
final class C9581f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    WeakReference f23866a = new WeakReference((Object) null);

    /* renamed from: b */
    Activity f23867b;

    /* renamed from: c */
    View f23868c = null;

    /* renamed from: com.unity3d.player.f$a */
    class C9582a extends View implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        Bitmap f23869a;

        C9582a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final void mo58766a(SurfaceView surfaceView) {
            Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            this.f23869a = createBitmap;
            PixelCopy.request(surfaceView, createBitmap, this, new Handler(Looper.getMainLooper()));
        }

        public final void onPixelCopyFinished(int i) {
            if (i == 0) {
                setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ViewCompat.MEASURED_STATE_MASK), new BitmapDrawable(getResources(), this.f23869a)}));
            }
        }
    }

    C9581f(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f23867b = activity;
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public final void mo58755a() {
        Activity activity = this.f23867b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public final void mo58756a(SurfaceView surfaceView) {
        if (PlatformSupport.NOUGAT_SUPPORT && this.f23866a.get() != this.f23867b && this.f23868c == null) {
            C9582a aVar = new C9582a(this.f23867b);
            aVar.mo58766a(surfaceView);
            this.f23868c = aVar;
        }
    }

    /* renamed from: a */
    public final void mo58757a(ViewGroup viewGroup) {
        View view = this.f23868c;
        if (view != null && view.getParent() == null) {
            viewGroup.addView(this.f23868c);
            viewGroup.bringChildToFront(this.f23868c);
        }
    }

    /* renamed from: b */
    public final void mo58758b(ViewGroup viewGroup) {
        View view = this.f23868c;
        if (view != null && view.getParent() != null) {
            viewGroup.removeView(this.f23868c);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        this.f23866a = new WeakReference(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
