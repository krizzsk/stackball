package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.adcolony.sdk.C0580a0;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.v0 */
class C0857v0 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f1467A;

    /* renamed from: B */
    private boolean f1468B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f1469C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f1470D;

    /* renamed from: E */
    private boolean f1471E;

    /* renamed from: F */
    private String f1472F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f1473G;

    /* renamed from: H */
    private FileInputStream f1474H;

    /* renamed from: I */
    private C0645d0 f1475I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C0589c f1476J;

    /* renamed from: K */
    private Surface f1477K;

    /* renamed from: L */
    private SurfaceTexture f1478L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public RectF f1479M = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C0867j f1480N;

    /* renamed from: O */
    private ProgressBar f1481O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public MediaPlayer f1482P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C0897z0 f1483Q = C0894y.m1151b();

    /* renamed from: R */
    private ExecutorService f1484R = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C0645d0 f1485S;

    /* renamed from: a */
    private float f1486a;

    /* renamed from: b */
    private float f1487b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f1488c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f1489d;

    /* renamed from: e */
    private float f1490e;

    /* renamed from: f */
    private float f1491f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1492g;

    /* renamed from: h */
    private boolean f1493h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Paint f1494i = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Paint f1495j = new Paint(1);

    /* renamed from: k */
    private int f1496k;

    /* renamed from: l */
    private int f1497l;

    /* renamed from: m */
    private int f1498m;

    /* renamed from: n */
    private int f1499n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f1500o;

    /* renamed from: p */
    private int f1501p;

    /* renamed from: q */
    private int f1502q;

    /* renamed from: r */
    private int f1503r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public double f1504s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public double f1505t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f1506u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f1507v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f1508w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f1509x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f1510y;

    /* renamed from: z */
    private boolean f1511z;

    /* renamed from: com.adcolony.sdk.v0$a */
    class C0858a implements C0685f0 {
        C0858a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0857v0.this.m969a(d0Var)) {
                C0857v0.this.mo9929i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$b */
    class C0859b implements C0685f0 {
        C0859b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0857v0.this.m969a(d0Var)) {
                C0857v0.this.m979c(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$c */
    class C0860c implements C0685f0 {
        C0860c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0857v0.this.m969a(d0Var)) {
                C0857v0.this.m982d(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$d */
    class C0861d implements C0685f0 {
        C0861d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0857v0.this.m969a(d0Var)) {
                C0857v0.this.mo9928h();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$e */
    class C0862e implements C0685f0 {
        C0862e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0857v0.this.m969a(d0Var)) {
                boolean unused = C0857v0.this.m975b(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$f */
    class C0863f implements C0685f0 {
        C0863f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0857v0.this.m969a(d0Var)) {
                boolean unused = C0857v0.this.m986e(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$g */
    class C0864g implements Runnable {
        C0864g() {
        }

        public void run() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (C0857v0.this.f1485S != null) {
                C0897z0 b = C0894y.m1151b();
                C0894y.m1156b(b, "id", C0857v0.this.f1500o);
                C0894y.m1148a(b, "ad_session_id", C0857v0.this.f1473G);
                C0894y.m1158b(b, "success", true);
                C0857v0.this.f1485S.mo9530a(b).mo9536d();
                C0645d0 unused = C0857v0.this.f1485S = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$h */
    class C0865h implements Runnable {
        C0865h() {
        }

        public void run() {
            long unused = C0857v0.this.f1506u = 0;
            while (!C0857v0.this.f1507v && !C0857v0.this.f1510y && C0578a.m144d()) {
                Context b = C0578a.m141b();
                if (!C0857v0.this.f1507v && !C0857v0.this.f1467A && b != null && (b instanceof Activity)) {
                    if (C0857v0.this.f1482P.isPlaying()) {
                        if (C0857v0.this.f1506u == 0 && C0578a.f183d) {
                            long unused2 = C0857v0.this.f1506u = System.currentTimeMillis();
                        }
                        boolean unused3 = C0857v0.this.f1509x = true;
                        C0857v0 v0Var = C0857v0.this;
                        double unused4 = v0Var.f1504s = ((double) v0Var.f1482P.getCurrentPosition()) / 1000.0d;
                        C0857v0 v0Var2 = C0857v0.this;
                        double unused5 = v0Var2.f1505t = ((double) v0Var2.f1482P.getDuration()) / 1000.0d;
                        if (System.currentTimeMillis() - C0857v0.this.f1506u > 1000 && !C0857v0.this.f1470D && C0578a.f183d) {
                            if (C0857v0.this.f1504s == 0.0d) {
                                new C0580a0.C0581a().mo9419a("getCurrentPosition() not working, firing ").mo9419a("AdSession.on_error").mo9421a(C0580a0.f192j);
                                C0857v0.this.m990g();
                            } else {
                                boolean unused6 = C0857v0.this.f1470D = true;
                            }
                        }
                        if (C0857v0.this.f1469C) {
                            C0857v0.this.mo9926e();
                        }
                    }
                    if (C0857v0.this.f1509x && !C0857v0.this.f1507v && !C0857v0.this.f1510y) {
                        C0894y.m1156b(C0857v0.this.f1483Q, "id", C0857v0.this.f1500o);
                        C0894y.m1156b(C0857v0.this.f1483Q, "container_id", C0857v0.this.f1476J.mo9450c());
                        C0894y.m1148a(C0857v0.this.f1483Q, "ad_session_id", C0857v0.this.f1473G);
                        C0894y.m1145a(C0857v0.this.f1483Q, "elapsed", C0857v0.this.f1504s);
                        C0894y.m1145a(C0857v0.this.f1483Q, "duration", C0857v0.this.f1505t);
                        new C0645d0("VideoView.on_progress", C0857v0.this.f1476J.mo9469k(), C0857v0.this.f1483Q).mo9536d();
                    }
                    if (C0857v0.this.f1508w || ((Activity) b).isFinishing()) {
                        boolean unused7 = C0857v0.this.f1508w = false;
                        C0857v0.this.mo9930j();
                        return;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException unused8) {
                        C0857v0.this.m990g();
                        new C0580a0.C0581a().mo9419a("InterruptedException in ADCVideoView's update thread.").mo9421a(C0580a0.f191i);
                    }
                } else {
                    return;
                }
            }
            if (C0857v0.this.f1508w) {
                C0857v0.this.mo9930j();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v0$i */
    class C0866i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f1520a;

        C0866i(Context context) {
            this.f1520a = context;
        }

        public void run() {
            C0867j unused = C0857v0.this.f1480N = new C0867j(this.f1520a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C0857v0.this.f1488c * 4.0f), (int) (C0857v0.this.f1488c * 4.0f));
            layoutParams.setMargins(0, C0857v0.this.f1476J.mo9447b() - ((int) (C0857v0.this.f1488c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            C0857v0.this.f1476J.addView(C0857v0.this.f1480N, layoutParams);
        }
    }

    /* renamed from: com.adcolony.sdk.v0$j */
    private class C0867j extends View {
        C0867j(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                getClass().getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
            } catch (Exception unused) {
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(C0857v0.this.f1479M, 270.0f, C0857v0.this.f1489d, false, C0857v0.this.f1494i);
            canvas.drawText("" + C0857v0.this.f1492g, C0857v0.this.f1479M.centerX(), (float) (((double) C0857v0.this.f1479M.centerY()) + (((double) C0857v0.this.f1495j.getFontMetrics().bottom) * 1.35d)), C0857v0.this.f1495j);
            invalidate();
        }
    }

    private C0857v0(Context context) {
        super(context);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f1507v = true;
        this.f1504s = this.f1505t;
        C0894y.m1156b(this.f1483Q, "id", this.f1500o);
        C0894y.m1156b(this.f1483Q, "container_id", this.f1476J.mo9450c());
        C0894y.m1148a(this.f1483Q, "ad_session_id", this.f1473G);
        C0894y.m1145a(this.f1483Q, "elapsed", this.f1504s);
        C0894y.m1145a(this.f1483Q, "duration", this.f1505t);
        new C0645d0("VideoView.on_progress", this.f1476J.mo9469k(), this.f1483Q).mo9536d();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m990g();
        C0580a0.C0581a aVar = new C0580a0.C0581a();
        aVar.mo9419a("MediaPlayer error: " + i + "," + i2).mo9421a(C0580a0.f191i);
        return true;
    }

    public void onMeasure(int i, int i2) {
        m996l();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f1511z = true;
        if (this.f1471E) {
            this.f1476J.removeView(this.f1481O);
        }
        if (this.f1468B) {
            this.f1501p = mediaPlayer.getVideoWidth();
            this.f1502q = mediaPlayer.getVideoHeight();
            m996l();
            new C0580a0.C0581a().mo9419a("MediaPlayer getVideoWidth = ").mo9417a(mediaPlayer.getVideoWidth()).mo9421a(C0580a0.f188f);
            new C0580a0.C0581a().mo9419a("MediaPlayer getVideoHeight = ").mo9417a(mediaPlayer.getVideoHeight()).mo9421a(C0580a0.f188f);
        }
        C0897z0 b = C0894y.m1151b();
        C0894y.m1156b(b, "id", this.f1500o);
        C0894y.m1156b(b, "container_id", this.f1476J.mo9450c());
        C0894y.m1148a(b, "ad_session_id", this.f1473G);
        new C0645d0("VideoView.on_ready", this.f1476J.mo9469k(), b).mo9536d();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f1484R;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.f1484R.submit(new C0864g());
            } catch (RejectedExecutionException unused) {
                m990g();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture == null || this.f1467A) {
            new C0580a0.C0581a().mo9419a("Null texture provided by system's onSurfaceTextureAvailable or ").mo9419a("MediaPlayer has been destroyed.").mo9421a(C0580a0.f192j);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f1477K = surface;
        try {
            this.f1482P.setSurface(surface);
        } catch (IllegalStateException unused) {
            new C0580a0.C0581a().mo9419a("IllegalStateException thrown when calling MediaPlayer.setSurface()").mo9421a(C0580a0.f191i);
            m990g();
        }
        this.f1478L = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f1478L = surfaceTexture;
        if (!this.f1467A) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f1478L = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f1478L = surfaceTexture;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0693i c = C0578a.m143c();
        C0612d d = c.mo9597d();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0897z0 b = C0894y.m1151b();
        C0894y.m1156b(b, "view_id", this.f1500o);
        C0894y.m1148a(b, "ad_session_id", this.f1473G);
        C0894y.m1156b(b, "container_x", this.f1496k + x);
        C0894y.m1156b(b, "container_y", this.f1497l + y);
        C0894y.m1156b(b, "view_x", x);
        C0894y.m1156b(b, "view_y", y);
        C0894y.m1156b(b, "id", this.f1476J.mo9450c());
        if (action == 0) {
            new C0645d0("AdContainer.on_touch_began", this.f1476J.mo9469k(), b).mo9536d();
        } else if (action == 1) {
            if (!this.f1476J.mo9476p()) {
                c.mo9585a(d.mo9506d().get(this.f1473G));
            }
            new C0645d0("AdContainer.on_touch_ended", this.f1476J.mo9469k(), b).mo9536d();
        } else if (action == 2) {
            new C0645d0("AdContainer.on_touch_moved", this.f1476J.mo9469k(), b).mo9536d();
        } else if (action == 3) {
            new C0645d0("AdContainer.on_touch_cancelled", this.f1476J.mo9469k(), b).mo9536d();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action2)) + this.f1496k);
            C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action2)) + this.f1497l);
            C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action2));
            C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action2));
            new C0645d0("AdContainer.on_touch_began", this.f1476J.mo9469k(), b).mo9536d();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0894y.m1156b(b, "container_x", ((int) motionEvent2.getX(action3)) + this.f1496k);
            C0894y.m1156b(b, "container_y", ((int) motionEvent2.getY(action3)) + this.f1497l);
            C0894y.m1156b(b, "view_x", (int) motionEvent2.getX(action3));
            C0894y.m1156b(b, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f1476J.mo9476p()) {
                c.mo9585a(d.mo9506d().get(this.f1473G));
            }
            new C0645d0("AdContainer.on_touch_ended", this.f1476J.mo9469k(), b).mo9536d();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m990g() {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "id", this.f1473G);
        new C0645d0("AdSession.on_error", this.f1476J.mo9469k(), b).mo9536d();
        this.f1507v = true;
    }

    /* renamed from: l */
    private void m996l() {
        double min = Math.min(((double) this.f1498m) / ((double) this.f1501p), ((double) this.f1499n) / ((double) this.f1502q));
        int i = (int) (((double) this.f1501p) * min);
        int i2 = (int) (((double) this.f1502q) * min);
        new C0580a0.C0581a().mo9419a("setMeasuredDimension to ").mo9417a(i).mo9419a(" by ").mo9417a(i2).mo9421a(C0580a0.f188f);
        setMeasuredDimension(i, i2);
        if (this.f1468B) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: m */
    private void m999m() {
        try {
            this.f1484R.submit(new C0865h());
        } catch (RejectedExecutionException unused) {
            m990g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9928h() {
        if (!this.f1511z) {
            new C0580a0.C0581a().mo9419a("ADCVideoView pause() called while MediaPlayer is not prepared.").mo9421a(C0580a0.f190h);
            return false;
        } else if (!this.f1509x) {
            return false;
        } else {
            this.f1503r = this.f1482P.getCurrentPosition();
            this.f1505t = (double) this.f1482P.getDuration();
            this.f1482P.pause();
            this.f1510y = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9929i() {
        if (!this.f1511z) {
            return false;
        }
        if (!this.f1510y && C0578a.f183d) {
            this.f1482P.start();
            m999m();
        } else if (!this.f1507v && C0578a.f183d) {
            this.f1482P.start();
            this.f1510y = false;
            if (!this.f1484R.isShutdown()) {
                m999m();
            }
            C0867j jVar = this.f1480N;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9930j() {
        new C0580a0.C0581a().mo9419a("MediaPlayer stopped and released.").mo9421a(C0580a0.f188f);
        try {
            if (!this.f1507v && this.f1511z && this.f1482P.isPlaying()) {
                this.f1482P.stop();
            }
        } catch (IllegalStateException unused) {
            new C0580a0.C0581a().mo9419a("Caught IllegalStateException when calling stop on MediaPlayer").mo9421a(C0580a0.f190h);
        }
        ProgressBar progressBar = this.f1481O;
        if (progressBar != null) {
            this.f1476J.removeView(progressBar);
        }
        this.f1507v = true;
        this.f1511z = false;
        this.f1482P.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9931k() {
        this.f1508w = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9925d() {
        Context b;
        C0897z0 b2 = this.f1475I.mo9532b();
        this.f1473G = C0894y.m1169h(b2, "ad_session_id");
        this.f1496k = C0894y.m1163d(b2, "x");
        this.f1497l = C0894y.m1163d(b2, "y");
        this.f1498m = C0894y.m1163d(b2, "width");
        this.f1499n = C0894y.m1163d(b2, "height");
        this.f1469C = C0894y.m1155b(b2, "enable_timer");
        this.f1471E = C0894y.m1155b(b2, "enable_progress");
        this.f1472F = C0894y.m1169h(b2, "filepath");
        this.f1501p = C0894y.m1163d(b2, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_WIDTH);
        this.f1502q = C0894y.m1163d(b2, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_HEIGHT);
        this.f1491f = C0578a.m143c().mo9611o().mo9750o();
        new C0580a0.C0581a().mo9419a("Original video dimensions = ").mo9417a(this.f1501p).mo9419a("x").mo9417a(this.f1502q).mo9421a(C0580a0.f186d);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f1498m, this.f1499n);
        layoutParams.setMargins(this.f1496k, this.f1497l, 0, 0);
        layoutParams.gravity = 0;
        this.f1476J.addView(this, layoutParams);
        if (this.f1471E && (b = C0578a.m141b()) != null) {
            ProgressBar progressBar = new ProgressBar(b);
            this.f1481O = progressBar;
            C0589c cVar = this.f1476J;
            int i = (int) (this.f1491f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
        }
        this.f1482P = new MediaPlayer();
        this.f1511z = false;
        try {
            if (!this.f1472F.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.f1472F);
                this.f1474H = fileInputStream;
                this.f1482P.setDataSource(fileInputStream.getFD());
            } else {
                this.f1468B = true;
                this.f1482P.setDataSource(this.f1472F);
            }
            this.f1482P.setOnErrorListener(this);
            this.f1482P.setOnPreparedListener(this);
            this.f1482P.setOnCompletionListener(this);
            this.f1482P.prepareAsync();
        } catch (IOException e) {
            new C0580a0.C0581a().mo9419a("Failed to create/prepare MediaPlayer: ").mo9419a(e.toString()).mo9421a(C0580a0.f191i);
            m990g();
        }
        this.f1476J.mo9465i().add(C0578a.m135a("VideoView.play", (C0685f0) new C0858a(), true));
        this.f1476J.mo9465i().add(C0578a.m135a("VideoView.set_bounds", (C0685f0) new C0859b(), true));
        this.f1476J.mo9465i().add(C0578a.m135a("VideoView.set_visible", (C0685f0) new C0860c(), true));
        this.f1476J.mo9465i().add(C0578a.m135a("VideoView.pause", (C0685f0) new C0861d(), true));
        this.f1476J.mo9465i().add(C0578a.m135a("VideoView.seek_to_time", (C0685f0) new C0862e(), true));
        this.f1476J.mo9465i().add(C0578a.m135a("VideoView.set_volume", (C0685f0) new C0863f(), true));
        this.f1476J.mo9467j().add("VideoView.play");
        this.f1476J.mo9467j().add("VideoView.set_bounds");
        this.f1476J.mo9467j().add("VideoView.set_visible");
        this.f1476J.mo9467j().add("VideoView.pause");
        this.f1476J.mo9467j().add("VideoView.seek_to_time");
        this.f1476J.mo9467j().add("VideoView.set_volume");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9926e() {
        if (this.f1493h) {
            this.f1490e = (float) (360.0d / this.f1505t);
            this.f1495j.setColor(-3355444);
            this.f1495j.setShadowLayer((float) ((int) (this.f1491f * 2.0f)), 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
            this.f1495j.setTextAlign(Paint.Align.CENTER);
            this.f1495j.setLinearText(true);
            this.f1495j.setTextSize(this.f1491f * 12.0f);
            this.f1494i.setStyle(Paint.Style.STROKE);
            float f = this.f1491f * 2.0f;
            if (f > 6.0f) {
                f = 6.0f;
            }
            if (f < 4.0f) {
                f = 4.0f;
            }
            this.f1494i.setStrokeWidth(f);
            this.f1494i.setShadowLayer((float) ((int) (this.f1491f * 3.0f)), 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
            this.f1494i.setColor(-3355444);
            Rect rect = new Rect();
            this.f1495j.getTextBounds("0123456789", 0, 9, rect);
            this.f1488c = (float) rect.height();
            Context b = C0578a.m141b();
            if (b != null) {
                C0849u0.m931b((Runnable) new C0866i(b));
            }
            this.f1493h = false;
        }
        this.f1492g = (int) (this.f1505t - this.f1504s);
        float f2 = this.f1488c;
        float f3 = (float) ((int) f2);
        this.f1486a = f3;
        float f4 = (float) ((int) (3.0f * f2));
        this.f1487b = f4;
        float f5 = f2 / 2.0f;
        float f6 = f2 * 2.0f;
        this.f1479M.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
        this.f1489d = (float) (((double) this.f1490e) * (this.f1505t - this.f1504s));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9927f() {
        return this.f1507v;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m979c(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f1496k = C0894y.m1163d(b, "x");
        this.f1497l = C0894y.m1163d(b, "y");
        this.f1498m = C0894y.m1163d(b, "width");
        this.f1499n = C0894y.m1163d(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1496k, this.f1497l, 0, 0);
        layoutParams.width = this.f1498m;
        layoutParams.height = this.f1499n;
        setLayoutParams(layoutParams);
        if (this.f1469C && this.f1480N != null) {
            int i = (int) (this.f1488c * 4.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.setMargins(0, this.f1476J.mo9447b() - ((int) (this.f1488c * 4.0f)), 0, 0);
            layoutParams2.gravity = 0;
            this.f1480N.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m975b(C0645d0 d0Var) {
        if (!this.f1511z) {
            return false;
        }
        if (this.f1507v) {
            this.f1507v = false;
        }
        this.f1485S = d0Var;
        int d = C0894y.m1163d(d0Var.mo9532b(), "time");
        int duration = this.f1482P.getDuration() / 1000;
        this.f1482P.setOnSeekCompleteListener(this);
        this.f1482P.seekTo(d * 1000);
        if (duration == d) {
            this.f1507v = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9922a() {
        if (this.f1478L != null) {
            this.f1467A = true;
        }
        this.f1484R.shutdown();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m969a(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        return C0894y.m1163d(b, "id") == this.f1500o && C0894y.m1163d(b, "container_id") == this.f1476J.mo9450c() && C0894y.m1169h(b, "ad_session_id").equals(this.f1476J.mo9441a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9924c() {
        return this.f1482P != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public MediaPlayer mo9923b() {
        return this.f1482P;
    }

    C0857v0(Context context, C0645d0 d0Var, int i, C0589c cVar) {
        super(context);
        this.f1476J = cVar;
        this.f1475I = d0Var;
        this.f1500o = i;
        setSurfaceTextureListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m986e(C0645d0 d0Var) {
        boolean z = false;
        if (!this.f1511z) {
            return false;
        }
        float c = (float) C0894y.m1160c(d0Var.mo9532b(), "volume");
        AdColonyInterstitial k = C0578a.m143c().mo9607k();
        if (k != null) {
            if (((double) c) <= 0.0d) {
                z = true;
            }
            k.mo9322a(z);
        }
        this.f1482P.setVolume(c, c);
        C0897z0 b = C0894y.m1151b();
        C0894y.m1158b(b, "success", true);
        d0Var.mo9530a(b).mo9536d();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m982d(C0645d0 d0Var) {
        C0867j jVar;
        C0867j jVar2;
        if (C0894y.m1155b(d0Var.mo9532b(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
            if (this.f1469C && (jVar2 = this.f1480N) != null) {
                jVar2.setVisibility(0);
                return;
            }
            return;
        }
        setVisibility(4);
        if (this.f1469C && (jVar = this.f1480N) != null) {
            jVar.setVisibility(4);
        }
    }
}
