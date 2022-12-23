package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.android.exoplayer2.C3716C;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.inmobi.media.cd */
/* compiled from: MediaRenderView */
public final class C5056cd extends VideoView implements Application.ActivityLifecycleCallbacks, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f11559l = C5056cd.class.getSimpleName();

    /* renamed from: a */
    public C5058a f11560a;

    /* renamed from: b */
    public Bitmap f11561b;

    /* renamed from: c */
    public ViewGroup f11562c;

    /* renamed from: d */
    public C5059b f11563d;

    /* renamed from: e */
    int f11564e;

    /* renamed from: f */
    boolean f11565f;

    /* renamed from: g */
    public String f11566g;

    /* renamed from: h */
    public String f11567h;

    /* renamed from: i */
    boolean f11568i;

    /* renamed from: j */
    int f11569j;

    /* renamed from: k */
    int f11570k;

    /* renamed from: m */
    private boolean f11571m = false;

    /* renamed from: n */
    private WeakReference<Activity> f11572n;

    /* renamed from: com.inmobi.media.cd$b */
    /* compiled from: MediaRenderView */
    interface C5059b {
        /* renamed from: a */
        void mo40316a();

        /* renamed from: a */
        void mo40317a(C5056cd cdVar);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
    }

    public C5056cd(Activity activity) {
        super(activity);
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f11564e = 100;
        this.f11569j = -1;
        this.f11570k = 0;
        this.f11565f = false;
        this.f11572n = new WeakReference<>(activity);
        C5314go.m12191a((Context) activity, (Application.ActivityLifecycleCallbacks) this);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHolder().setSizeFromLayout();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            Context c = C5314go.m12203c();
            if (c != null) {
                setBackground(new BitmapDrawable(c.getResources(), this.f11561b));
                return;
            }
            return;
        }
        setBackgroundDrawable(new BitmapDrawable(this.f11561b));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo40294a();
        return false;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                String unused = C5056cd.f11559l;
                if (C5056cd.this.f11560a == null) {
                    C5058a unused2 = C5056cd.this.f11560a = new C5058a(C5056cd.this.getContext());
                    C5056cd.this.f11560a.setAnchorView(C5056cd.this);
                    C5056cd cdVar = C5056cd.this;
                    cdVar.setMediaController(cdVar.f11560a);
                    C5056cd.this.requestLayout();
                    C5056cd.this.requestFocus();
                }
            }
        });
        int i = this.f11570k;
        if (i < getDuration()) {
            this.f11570k = i;
            seekTo(i);
        }
        this.f11568i = true;
        this.f11563d.mo40316a();
        start();
    }

    public final void setPlaybackData(String str) {
        this.f11567h = m11479a(str);
        this.f11566g = "anonymous";
        if (this.f11561b == null) {
            this.f11561b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
            this.f11561b = m11480b(this.f11567h);
        }
    }

    public final void start() {
        if (!this.f11571m) {
            super.start();
        }
    }

    public final void pause() {
        super.pause();
    }

    /* renamed from: a */
    public final void mo40294a() {
        stopPlayback();
        m11482c();
        super.setMediaController((MediaController) null);
        this.f11560a = null;
        C5059b bVar = this.f11563d;
        if (bVar != null) {
            bVar.mo40317a(this);
        }
    }

    public final ViewGroup getViewContainer() {
        return this.f11562c;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f11562c = viewGroup;
    }

    public final void setListener(C5059b bVar) {
        this.f11563d = bVar;
    }

    /* renamed from: c */
    private void m11482c() {
        ViewGroup viewGroup = this.f11562c;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f11562c);
            }
            ViewGroup viewGroup3 = (ViewGroup) getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f11562c = null;
        }
    }

    /* renamed from: a */
    public static String m11479a(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if ((b & 128) > 0) {
                sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb.append(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & Ascii.f10109SI]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            return new String(sb.toString().getBytes(), C3716C.ISO88591_NAME);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static Bitmap m11480b(String str) {
        try {
            return (Bitmap) Class.forName("android.media.ThumbnailUtils").getDeclaredMethod("createVideoThumbnail", new Class[]{String.class, Integer.TYPE}).invoke((Object) null, new Object[]{str, 1});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: com.inmobi.media.cd$a */
    /* compiled from: MediaRenderView */
    public static class C5058a extends MediaController {
        public C5058a(Context context) {
            super(context);
        }

        public final void show(int i) {
            super.show(i);
            if (Build.VERSION.SDK_INT < 19) {
                try {
                    Field declaredField = MediaController.class.getDeclaredField("mAnchor");
                    declaredField.setAccessible(true);
                    View view = (View) declaredField.get(this);
                    Field declaredField2 = MediaController.class.getDeclaredField("mDecor");
                    declaredField2.setAccessible(true);
                    View view2 = (View) declaredField2.get(this);
                    Field declaredField3 = MediaController.class.getDeclaredField("mDecorLayoutParams");
                    declaredField3.setAccessible(true);
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) declaredField3.get(this);
                    Field declaredField4 = MediaController.class.getDeclaredField("mWindowManager");
                    declaredField4.setAccessible(true);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    view2.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(view.getHeight(), Integer.MIN_VALUE));
                    view2.setPadding(0, 0, 0, 0);
                    layoutParams.verticalMargin = 0.0f;
                    layoutParams.horizontalMargin = 0.0f;
                    layoutParams.width = view.getWidth();
                    layoutParams.gravity = 8388659;
                    layoutParams.x = iArr[0];
                    layoutParams.y = (iArr[1] + view.getHeight()) - view2.getMeasuredHeight();
                    ((WindowManager) declaredField4.get(this)).updateViewLayout(view2, layoutParams);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f11572n.get() != null && ((Activity) this.f11572n.get()).equals(activity)) {
            this.f11571m = false;
            start();
        }
    }

    public final void onActivityStopped(Activity activity) {
        Activity activity2 = (Activity) this.f11572n.get();
        if (activity2 != null && activity2.equals(activity)) {
            this.f11571m = true;
            if (getCurrentPosition() != 0) {
                this.f11570k = getCurrentPosition();
            }
            pause();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
