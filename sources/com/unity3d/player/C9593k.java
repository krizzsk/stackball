package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;

/* renamed from: com.unity3d.player.k */
public final class C9593k extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f23897a = false;

    /* renamed from: b */
    private final Context f23898b;

    /* renamed from: c */
    private final SurfaceView f23899c;

    /* renamed from: d */
    private final SurfaceHolder f23900d;

    /* renamed from: e */
    private final String f23901e;

    /* renamed from: f */
    private final int f23902f;

    /* renamed from: g */
    private final int f23903g;

    /* renamed from: h */
    private final boolean f23904h;

    /* renamed from: i */
    private final long f23905i;

    /* renamed from: j */
    private final long f23906j;

    /* renamed from: k */
    private final FrameLayout f23907k;

    /* renamed from: l */
    private final Display f23908l;

    /* renamed from: m */
    private int f23909m;

    /* renamed from: n */
    private int f23910n;

    /* renamed from: o */
    private int f23911o;

    /* renamed from: p */
    private int f23912p;

    /* renamed from: q */
    private MediaPlayer f23913q;

    /* renamed from: r */
    private MediaController f23914r;

    /* renamed from: s */
    private boolean f23915s = false;

    /* renamed from: t */
    private boolean f23916t = false;

    /* renamed from: u */
    private int f23917u = 0;

    /* renamed from: v */
    private boolean f23918v = false;

    /* renamed from: w */
    private boolean f23919w = false;

    /* renamed from: x */
    private C9594a f23920x;

    /* renamed from: y */
    private C9595b f23921y;

    /* renamed from: z */
    private volatile int f23922z = 0;

    /* renamed from: com.unity3d.player.k$a */
    public interface C9594a {
        /* renamed from: a */
        void mo58824a(int i);
    }

    /* renamed from: com.unity3d.player.k$b */
    public class C9595b implements Runnable {

        /* renamed from: b */
        private C9593k f23924b;

        /* renamed from: c */
        private boolean f23925c = false;

        public C9595b(C9593k kVar) {
            this.f23924b = kVar;
        }

        /* renamed from: a */
        public final void mo58825a() {
            this.f23925c = true;
        }

        public final void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (!this.f23925c) {
                if (C9593k.f23897a) {
                    C9593k.m25694b("Stopping the video player due to timeout.");
                }
                this.f23924b.CancelOnPrepare();
            }
        }
    }

    protected C9593k(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, C9594a aVar) {
        super(context);
        this.f23920x = aVar;
        this.f23898b = context;
        this.f23907k = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f23899c = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f23900d = holder;
        holder.addCallback(this);
        this.f23907k.setBackgroundColor(i);
        this.f23907k.addView(this.f23899c);
        this.f23908l = ((WindowManager) this.f23898b.getSystemService("window")).getDefaultDisplay();
        this.f23901e = str;
        this.f23902f = i2;
        this.f23903g = i3;
        this.f23904h = z;
        this.f23905i = j;
        this.f23906j = j2;
        if (f23897a) {
            m25694b("fileName: " + this.f23901e);
        }
        if (f23897a) {
            m25694b("backgroundColor: " + i);
        }
        if (f23897a) {
            m25694b("controlMode: " + this.f23902f);
        }
        if (f23897a) {
            m25694b("scalingMode: " + this.f23903g);
        }
        if (f23897a) {
            m25694b("isURL: " + this.f23904h);
        }
        if (f23897a) {
            m25694b("videoOffset: " + this.f23905i);
        }
        if (f23897a) {
            m25694b("videoLength: " + this.f23906j);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    private void m25692a(int i) {
        this.f23922z = i;
        C9594a aVar = this.f23920x;
        if (aVar != null) {
            aVar.mo58824a(this.f23922z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m25694b(String str) {
        Log.i("Video", "VideoPlayer: " + str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25696c() {
        /*
            r8 = this;
            android.media.MediaPlayer r0 = r8.f23913q
            if (r0 == 0) goto L_0x001c
            android.view.SurfaceHolder r1 = r8.f23900d
            r0.setDisplay(r1)
            boolean r0 = r8.f23918v
            if (r0 != 0) goto L_0x001b
            boolean r0 = f23897a
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "Resuming playback"
            m25694b(r0)
        L_0x0016:
            android.media.MediaPlayer r0 = r8.f23913q
            r0.start()
        L_0x001b:
            return
        L_0x001c:
            r0 = 0
            r8.m25692a((int) r0)
            r8.doCleanUp()
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x00cc }
            r0.<init>()     // Catch:{ Exception -> 0x00cc }
            r8.f23913q = r0     // Catch:{ Exception -> 0x00cc }
            boolean r1 = r8.f23904h     // Catch:{ Exception -> 0x00cc }
            if (r1 == 0) goto L_0x003a
            android.content.Context r1 = r8.f23898b     // Catch:{ Exception -> 0x00cc }
            java.lang.String r2 = r8.f23901e     // Catch:{ Exception -> 0x00cc }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00cc }
            r0.setDataSource(r1, r2)     // Catch:{ Exception -> 0x00cc }
            goto L_0x008e
        L_0x003a:
            long r0 = r8.f23906j     // Catch:{ Exception -> 0x00cc }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x005a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f23901e     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r2 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ Exception -> 0x00cc }
            long r4 = r8.f23905i     // Catch:{ Exception -> 0x00cc }
            long r6 = r8.f23906j     // Catch:{ Exception -> 0x00cc }
            r2.setDataSource(r3, r4, r6)     // Catch:{ Exception -> 0x00cc }
        L_0x0056:
            r0.close()     // Catch:{ Exception -> 0x00cc }
            goto L_0x008e
        L_0x005a:
            android.content.res.Resources r0 = r8.getResources()     // Catch:{ Exception -> 0x00cc }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f23901e     // Catch:{ IOException -> 0x007d }
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)     // Catch:{ IOException -> 0x007d }
            android.media.MediaPlayer r1 = r8.f23913q     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r2 = r0.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            long r3 = r0.getStartOffset()     // Catch:{ IOException -> 0x007d }
            long r5 = r0.getLength()     // Catch:{ IOException -> 0x007d }
            r1.setDataSource(r2, r3, r5)     // Catch:{ IOException -> 0x007d }
            r0.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x008e
        L_0x007d:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f23901e     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r1 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            java.io.FileDescriptor r2 = r0.getFD()     // Catch:{ Exception -> 0x00cc }
            r1.setDataSource(r2)     // Catch:{ Exception -> 0x00cc }
            goto L_0x0056
        L_0x008e:
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            android.view.SurfaceHolder r1 = r8.f23900d     // Catch:{ Exception -> 0x00cc }
            r0.setDisplay(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            r1 = 1
            r0.setScreenOnWhilePlaying(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            r0.setOnBufferingUpdateListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            r0.setOnCompletionListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            r0.setOnPreparedListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            r0.setOnVideoSizeChangedListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            r1 = 3
            r0.setAudioStreamType(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f23913q     // Catch:{ Exception -> 0x00cc }
            r0.prepareAsync()     // Catch:{ Exception -> 0x00cc }
            com.unity3d.player.k$b r0 = new com.unity3d.player.k$b     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00cc }
            r8.f23921y = r0     // Catch:{ Exception -> 0x00cc }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ Exception -> 0x00cc }
            com.unity3d.player.k$b r1 = r8.f23921y     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            r0.start()     // Catch:{ Exception -> 0x00cc }
            return
        L_0x00cc:
            r0 = move-exception
            boolean r1 = f23897a
            if (r1 == 0) goto L_0x00e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m25694b(r0)
        L_0x00e9:
            r0 = 2
            r8.m25692a((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C9593k.m25696c():void");
    }

    /* renamed from: d */
    private void m25697d() {
        if (!isPlaying()) {
            m25692a(1);
            if (f23897a) {
                m25694b("startVideoPlayback");
            }
            updateVideoLayout();
            if (!this.f23918v) {
                start();
            }
        }
    }

    public final void CancelOnPrepare() {
        m25692a(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo58800a() {
        return this.f23918v;
    }

    public final boolean canPause() {
        return true;
    }

    public final boolean canSeekBackward() {
        return true;
    }

    public final boolean canSeekForward() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void destroyPlayer() {
        if (f23897a) {
            m25694b("destroyPlayer");
        }
        if (!this.f23918v) {
            pause();
        }
        doCleanUp();
    }

    /* access modifiers changed from: protected */
    public final void doCleanUp() {
        C9595b bVar = this.f23921y;
        if (bVar != null) {
            bVar.mo58825a();
            this.f23921y = null;
        }
        MediaPlayer mediaPlayer = this.f23913q;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f23913q = null;
        }
        this.f23911o = 0;
        this.f23912p = 0;
        this.f23916t = false;
        this.f23915s = false;
    }

    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.f23913q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    public final int getBufferPercentage() {
        if (this.f23904h) {
            return this.f23917u;
        }
        return 100;
    }

    public final int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f23913q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    public final int getDuration() {
        MediaPlayer mediaPlayer = this.f23913q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    public final boolean isPlaying() {
        boolean z = this.f23916t && this.f23915s;
        MediaPlayer mediaPlayer = this.f23913q;
        return mediaPlayer == null ? !z : mediaPlayer.isPlaying() || !z;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (f23897a) {
            m25694b("onBufferingUpdate percent:" + i);
        }
        this.f23917u = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (f23897a) {
            m25694b("onCompletion called");
        }
        destroyPlayer();
        m25692a(3);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 || (this.f23902f == 2 && i != 0 && !keyEvent.isSystem())) {
            destroyPlayer();
            m25692a(3);
            return true;
        }
        MediaController mediaController = this.f23914r;
        return mediaController != null ? mediaController.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (f23897a) {
            m25694b("onPrepared called");
        }
        C9595b bVar = this.f23921y;
        if (bVar != null) {
            bVar.mo58825a();
            this.f23921y = null;
        }
        int i = this.f23902f;
        if (i == 0 || i == 1) {
            MediaController mediaController = new MediaController(this.f23898b);
            this.f23914r = mediaController;
            mediaController.setMediaPlayer(this);
            this.f23914r.setAnchorView(this);
            this.f23914r.setEnabled(true);
            Context context = this.f23898b;
            if (context instanceof Activity) {
                this.f23914r.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f23914r.show();
        }
        this.f23916t = true;
        if (1 != 0 && this.f23915s) {
            m25697d();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f23902f == 2 && action == 0) {
            destroyPlayer();
            m25692a(3);
            return true;
        }
        MediaController mediaController = this.f23914r;
        return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (f23897a) {
            m25694b("onVideoSizeChanged called " + i + "x" + i2);
        }
        if (i != 0 && i2 != 0) {
            this.f23915s = true;
            this.f23911o = i;
            this.f23912p = i2;
            if (this.f23916t && 1 != 0) {
                m25697d();
            }
        } else if (f23897a) {
            m25694b("invalid video width(" + i + ") or height(" + i2 + ")");
        }
    }

    public final void pause() {
        MediaPlayer mediaPlayer = this.f23913q;
        if (mediaPlayer != null) {
            if (this.f23919w) {
                mediaPlayer.pause();
            }
            this.f23918v = true;
        }
    }

    public final void seekTo(int i) {
        MediaPlayer mediaPlayer = this.f23913q;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    public final void start() {
        if (f23897a) {
            m25694b("Start");
        }
        MediaPlayer mediaPlayer = this.f23913q;
        if (mediaPlayer != null) {
            if (this.f23919w) {
                mediaPlayer.start();
            }
            this.f23918v = false;
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (f23897a) {
            m25694b("surfaceChanged called " + i + " " + i2 + "x" + i3);
        }
        if (this.f23909m != i2 || this.f23910n != i3) {
            this.f23909m = i2;
            this.f23910n = i3;
            if (this.f23919w) {
                updateVideoLayout();
            }
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (f23897a) {
            m25694b("surfaceCreated called");
        }
        this.f23919w = true;
        m25696c();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (f23897a) {
            m25694b("surfaceDestroyed called");
        }
        this.f23919w = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r5 <= r3) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r0 = (int) (((float) r1) * r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r5 >= r3) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateVideoLayout() {
        /*
            r8 = this;
            boolean r0 = f23897a
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "updateVideoLayout"
            m25694b(r0)
        L_0x0009:
            android.media.MediaPlayer r0 = r8.f23913q
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            int r0 = r8.f23909m
            if (r0 == 0) goto L_0x0016
            int r0 = r8.f23910n
            if (r0 != 0) goto L_0x0034
        L_0x0016:
            android.content.Context r0 = r8.f23898b
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            r8.f23909m = r0
            int r0 = r1.heightPixels
            r8.f23910n = r0
        L_0x0034:
            int r0 = r8.f23909m
            int r1 = r8.f23910n
            boolean r2 = r8.f23915s
            if (r2 == 0) goto L_0x0065
            int r2 = r8.f23911o
            float r3 = (float) r2
            int r4 = r8.f23912p
            float r5 = (float) r4
            float r3 = r3 / r5
            float r5 = (float) r0
            float r6 = (float) r1
            float r5 = r5 / r6
            int r6 = r8.f23903g
            r7 = 1
            if (r6 != r7) goto L_0x0058
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0053
        L_0x004f:
            float r1 = (float) r0
            float r1 = r1 / r3
            int r1 = (int) r1
            goto L_0x006e
        L_0x0053:
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L_0x006e
        L_0x0058:
            r7 = 2
            if (r6 != r7) goto L_0x0060
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            goto L_0x004f
        L_0x0060:
            if (r6 != 0) goto L_0x006e
            r0 = r2
            r1 = r4
            goto L_0x006e
        L_0x0065:
            boolean r2 = f23897a
            if (r2 == 0) goto L_0x006e
            java.lang.String r2 = "updateVideoLayout: Video size is not known yet"
            m25694b(r2)
        L_0x006e:
            int r2 = r8.f23909m
            if (r2 != r0) goto L_0x0076
            int r2 = r8.f23910n
            if (r2 == r1) goto L_0x00a1
        L_0x0076:
            boolean r2 = f23897a
            if (r2 == 0) goto L_0x0093
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "frameWidth = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "; frameHeight = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            m25694b(r2)
        L_0x0093:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r0, r1, r3)
            android.widget.FrameLayout r0 = r8.f23907k
            android.view.SurfaceView r1 = r8.f23899c
            r0.updateViewLayout(r1, r2)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C9593k.updateVideoLayout():void");
    }
}
