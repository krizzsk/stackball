package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import com.inmobi.media.C4949ai;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.eo */
/* compiled from: NativeVideoView */
public class C5184eo extends TextureView implements MediaController.MediaPlayerControl {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f11911f = C5184eo.class.getSimpleName();

    /* renamed from: A */
    private MediaPlayer.OnInfoListener f11912A = new MediaPlayer.OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (Build.VERSION.SDK_INT < 17 || 3 != i) {
                return true;
            }
            C5184eo.this.mo40487a(8, 8);
            return true;
        }
    };

    /* renamed from: B */
    private MediaPlayer.OnBufferingUpdateListener f11913B = new MediaPlayer.OnBufferingUpdateListener() {
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            int unused = C5184eo.this.f11936v = i;
        }
    };

    /* renamed from: C */
    private MediaPlayer.OnErrorListener f11914C = new MediaPlayer.OnErrorListener() {
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String unused = C5184eo.f11911f;
            if (C5184eo.this.f11932r != null) {
                C5184eo.this.f11932r.mo40469a();
            }
            if (C5184eo.this.f11916a != null) {
                C5184eo.this.f11916a.f11892a = -1;
                C5184eo.this.f11916a.f11893b = -1;
            }
            if (C5184eo.this.f11935u != null) {
                C5184eo.this.f11935u.mo40476b();
            }
            C5184eo.m11879h(C5184eo.this);
            return true;
        }
    };

    /* renamed from: D */
    private final TextureView.SurfaceTextureListener f11915D = new TextureView.SurfaceTextureListener() {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface unused = C5184eo.this.f11923i = new Surface(surfaceTexture);
            C5184eo.this.m11877g();
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            int intValue;
            boolean z = true;
            boolean z2 = C5184eo.this.f11916a != null && C5184eo.this.f11916a.f11893b == 3;
            if (i <= 0 || i2 <= 0) {
                z = false;
            }
            if (C5184eo.this.f11916a != null && z2 && z) {
                if (!(C5184eo.this.getTag() == null || (intValue = ((Integer) ((C5031bs) C5184eo.this.getTag()).f11380v.get("seekPosition")).intValue()) == 0)) {
                    C5184eo.this.mo40486a(intValue);
                }
                C5184eo.this.start();
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (C5184eo.this.f11923i != null) {
                C5184eo.this.f11923i.release();
                Surface unused = C5184eo.this.f11923i = null;
            }
            if (C5184eo.this.f11935u != null) {
                C5184eo.this.f11935u.mo40476b();
            }
            C5184eo.this.mo40490c();
            return true;
        }
    };

    /* renamed from: a */
    public C5175ei f11916a = null;

    /* renamed from: b */
    public Handler f11917b;

    /* renamed from: c */
    public boolean f11918c;

    /* renamed from: d */
    MediaPlayer.OnVideoSizeChangedListener f11919d = new MediaPlayer.OnVideoSizeChangedListener() {
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int unused = C5184eo.this.f11925k = mediaPlayer.getVideoWidth();
            int unused2 = C5184eo.this.f11926l = mediaPlayer.getVideoHeight();
            if (C5184eo.this.f11925k != 0 && C5184eo.this.f11926l != 0) {
                C5184eo.this.requestLayout();
            }
        }
    };

    /* renamed from: e */
    MediaPlayer.OnPreparedListener f11920e = new MediaPlayer.OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C5184eo.this.f11916a != null) {
                C5184eo.this.f11916a.f11892a = 2;
                C5184eo eoVar = C5184eo.this;
                boolean unused = eoVar.f11937w = eoVar.f11938x = eoVar.f11939y = true;
                if (C5184eo.this.f11935u != null) {
                    C5184eo.this.f11935u.setEnabled(true);
                }
                int unused2 = C5184eo.this.f11925k = mediaPlayer.getVideoWidth();
                int unused3 = C5184eo.this.f11926l = mediaPlayer.getVideoHeight();
                C5031bs bsVar = (C5031bs) C5184eo.this.getTag();
                int i = 0;
                if (bsVar != null && ((Boolean) bsVar.f11380v.get("didCompleteQ4")).booleanValue()) {
                    C5184eo.this.mo40487a(8, 0);
                    if (((Byte) bsVar.f11380v.get("placementType")).byteValue() == 1) {
                        return;
                    }
                }
                if (C5184eo.this.getPlaybackEventListener() != null) {
                    C5184eo.this.getPlaybackEventListener().mo40468a((byte) 0);
                }
                if (bsVar != null && !((Boolean) bsVar.f11380v.get("didCompleteQ4")).booleanValue()) {
                    i = ((Integer) bsVar.f11380v.get("seekPosition")).intValue();
                }
                if (C5184eo.this.f11925k == 0 || C5184eo.this.f11926l == 0) {
                    if (3 == C5184eo.this.f11916a.f11893b && bsVar != null && ((Boolean) bsVar.f11380v.get("isFullScreen")).booleanValue()) {
                        C5184eo.this.start();
                    }
                } else if (3 == C5184eo.this.f11916a.f11893b) {
                    if (bsVar != null && ((Boolean) bsVar.f11380v.get("isFullScreen")).booleanValue()) {
                        C5184eo.this.start();
                    }
                    if (C5184eo.this.f11935u != null) {
                        C5184eo.this.f11935u.mo40475a();
                    }
                } else if (C5184eo.this.isPlaying()) {
                } else {
                    if ((i != 0 || C5184eo.this.getCurrentPosition() > 0) && C5184eo.this.f11935u != null) {
                        C5184eo.this.f11935u.mo40475a();
                    }
                }
            }
        }
    };

    /* renamed from: g */
    private Uri f11921g;

    /* renamed from: h */
    private Map<String, String> f11922h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Surface f11923i = null;

    /* renamed from: j */
    private int f11924j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f11925k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f11926l;

    /* renamed from: m */
    private int f11927m;

    /* renamed from: n */
    private int f11928n = Integer.MIN_VALUE;

    /* renamed from: o */
    private int f11929o = 0;

    /* renamed from: p */
    private C5195c f11930p;

    /* renamed from: q */
    private C5194b f11931q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C5193a f11932r;

    /* renamed from: s */
    private boolean f11933s;

    /* renamed from: t */
    private C5196d f11934t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C5181en f11935u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f11936v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f11937w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f11938x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f11939y;

    /* renamed from: z */
    private MediaPlayer.OnCompletionListener f11940z = new MediaPlayer.OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C5184eo.m11875f(C5184eo.this);
            } catch (Exception e) {
                String unused = C5184eo.f11911f;
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        }
    };

    /* renamed from: com.inmobi.media.eo$a */
    /* compiled from: NativeVideoView */
    interface C5193a {
        /* renamed from: a */
        void mo40469a();
    }

    /* renamed from: com.inmobi.media.eo$b */
    /* compiled from: NativeVideoView */
    public interface C5194b {
        /* renamed from: a */
        void mo40468a(byte b);
    }

    /* renamed from: com.inmobi.media.eo$c */
    /* compiled from: NativeVideoView */
    interface C5195c {
        /* renamed from: a */
        void mo40467a(byte b);
    }

    public void seekTo(int i) {
    }

    /* renamed from: com.inmobi.media.eo$d */
    /* compiled from: NativeVideoView */
    static final class C5196d extends Handler {

        /* renamed from: a */
        private final WeakReference<C5184eo> f11949a;

        C5196d(C5184eo eoVar) {
            this.f11949a = new WeakReference<>(eoVar);
        }

        public final void handleMessage(Message message) {
            C5184eo eoVar = (C5184eo) this.f11949a.get();
            if (eoVar != null && message.what == 1) {
                int duration = eoVar.getDuration();
                int currentPosition = eoVar.getCurrentPosition();
                if (!(duration == -1 || currentPosition == 0)) {
                    C5031bs bsVar = (C5031bs) eoVar.getTag();
                    if (!((Boolean) bsVar.f11380v.get("didCompleteQ1")).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        bsVar.f11380v.put("didCompleteQ1", Boolean.TRUE);
                        eoVar.getQuartileCompletedListener().mo40467a((byte) 0);
                    }
                    if (!((Boolean) bsVar.f11380v.get("didCompleteQ2")).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        bsVar.f11380v.put("didCompleteQ2", Boolean.TRUE);
                        eoVar.getQuartileCompletedListener().mo40467a((byte) 1);
                    }
                    if (!((Boolean) bsVar.f11380v.get("didCompleteQ3")).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        bsVar.f11380v.put("didCompleteQ3", Boolean.TRUE);
                        eoVar.getQuartileCompletedListener().mo40467a((byte) 2);
                    }
                    boolean booleanValue = ((Boolean) bsVar.f11380v.get("didQ4Fire")).booleanValue();
                    if ((((float) currentPosition) / ((float) duration)) * 100.0f > ((float) bsVar.f11476E) && !booleanValue) {
                        eoVar.getPlaybackEventListener().mo40468a((byte) 5);
                    }
                }
                sendEmptyMessageDelayed(1, 1000);
            }
            super.handleMessage(message);
        }
    }

    public C5184eo(Context context) {
        super(context);
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    public final void mo40488a(C5031bs bsVar) {
        C5175ei eiVar;
        this.f11925k = 0;
        this.f11926l = 0;
        this.f11921g = Uri.parse(((C5095cw) bsVar.f11363e).mo40359b());
        if (1 == ((Byte) bsVar.f11380v.get("placementType")).byteValue()) {
            eiVar = new C5175ei();
        } else {
            eiVar = C5175ei.m11850a();
        }
        this.f11916a = eiVar;
        int i = this.f11924j;
        if (i != 0) {
            eiVar.setAudioSessionId(i);
        } else {
            this.f11924j = eiVar.getAudioSessionId();
        }
        try {
            this.f11916a.setDataSource(getContext().getApplicationContext(), this.f11921g, this.f11922h);
            setTag(bsVar);
            this.f11934t = new C5196d(this);
            setSurfaceTextureListener(this.f11915D);
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
        } catch (IOException unused) {
            this.f11916a.f11892a = -1;
            this.f11916a.f11893b = -1;
        }
    }

    public C5175ei getMediaPlayer() {
        return this.f11916a;
    }

    /* renamed from: a */
    public final void mo40485a() {
        Surface surface = this.f11923i;
        if (surface != null) {
            surface.release();
            this.f11923i = null;
        }
        mo40490c();
    }

    public int getState() {
        C5175ei eiVar = this.f11916a;
        if (eiVar != null) {
            return eiVar.f11892a;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r1 > r6) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r0 = getDefaultSize(r0, r6)     // Catch:{ Exception -> 0x0096 }
            int r1 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r1 = getDefaultSize(r1, r7)     // Catch:{ Exception -> 0x0096 }
            int r2 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            if (r2 <= 0) goto L_0x0093
            int r2 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            if (r2 <= 0) goto L_0x0093
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch:{ Exception -> 0x0096 }
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch:{ Exception -> 0x0096 }
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch:{ Exception -> 0x0096 }
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch:{ Exception -> 0x0096 }
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0050
            if (r1 != r2) goto L_0x0050
            int r0 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r0 = r0 * r7
            int r1 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x003d
            int r7 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r7 = r7 * r6
            int r0 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r1 = r7 / r0
            goto L_0x0061
        L_0x003d:
            int r0 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r0 = r0 * r7
            int r1 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0070
            int r6 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r6 = r6 * r7
            int r0 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r0 = r6 / r0
            goto L_0x0092
        L_0x0050:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0063
            int r0 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r0 = r0 * r6
            int r2 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0060
            if (r0 <= r7) goto L_0x0060
            goto L_0x0070
        L_0x0060:
            r1 = r0
        L_0x0061:
            r0 = r6
            goto L_0x0093
        L_0x0063:
            if (r1 != r2) goto L_0x0072
            int r1 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r1 = r1 * r7
            int r2 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0091
            if (r1 <= r6) goto L_0x0091
        L_0x0070:
            r0 = r6
            goto L_0x0092
        L_0x0072:
            int r2 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r4 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            if (r1 != r3) goto L_0x0082
            if (r4 <= r7) goto L_0x0082
            int r1 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r1 = r1 * r7
            int r2 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r1 = r1 / r2
            goto L_0x0084
        L_0x0082:
            r1 = r2
            r7 = r4
        L_0x0084:
            if (r0 != r3) goto L_0x0091
            if (r1 <= r6) goto L_0x0091
            int r7 = r5.f11926l     // Catch:{ Exception -> 0x0096 }
            int r7 = r7 * r6
            int r0 = r5.f11925k     // Catch:{ Exception -> 0x0096 }
            int r1 = r7 / r0
            goto L_0x0061
        L_0x0091:
            r0 = r1
        L_0x0092:
            r1 = r7
        L_0x0093:
            r5.setMeasuredDimension(r0, r1)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5184eo.onMeasure(int, int):void");
    }

    public C5181en getMediaController() {
        return this.f11935u;
    }

    /* renamed from: b */
    public final boolean mo40489b() {
        C5175ei eiVar = this.f11916a;
        return (eiVar == null || eiVar.f11892a == -1 || this.f11916a.f11892a == 0 || this.f11916a.f11892a == 1) ? false : true;
    }

    public void setIsLockScreen(boolean z) {
        this.f11933s = z;
    }

    public void start() {
        boolean z;
        PowerManager powerManager = (PowerManager) getContext().getSystemService("power");
        boolean inKeyguardRestrictedInputMode = ((KeyguardManager) getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        if (Build.VERSION.SDK_INT < 20) {
            z = powerManager.isScreenOn();
        } else {
            z = powerManager.isInteractive();
        }
        boolean b = mo40489b();
        C5031bs bsVar = (C5031bs) getTag();
        int i = 0;
        boolean z2 = bsVar == null || ((Boolean) bsVar.f11380v.get("shouldAutoPlay")).booleanValue();
        if (b && !z2) {
            mo40487a(8, 0);
        }
        if (b && z && !this.f11916a.isPlaying() && z2 && (this.f11933s || !inKeyguardRestrictedInputMode)) {
            if (bsVar != null && !((Boolean) bsVar.f11380v.get("didCompleteQ4")).booleanValue()) {
                i = ((Integer) bsVar.f11380v.get("seekPosition")).intValue();
            }
            mo40494d();
            mo40486a(i);
            this.f11916a.start();
            this.f11916a.f11892a = 3;
            mo40487a(8, 8);
            if (bsVar != null) {
                bsVar.f11380v.put("didCompleteQ4", Boolean.FALSE);
                if (bsVar.mo40204a()) {
                    mo40495e();
                }
                if (((Boolean) bsVar.f11380v.get("didPause")).booleanValue()) {
                    getPlaybackEventListener().mo40468a((byte) 3);
                    bsVar.f11380v.put("didPause", Boolean.FALSE);
                } else {
                    getPlaybackEventListener().mo40468a((byte) 1);
                }
                C5196d dVar = this.f11934t;
                if (dVar != null && !dVar.hasMessages(1)) {
                    this.f11934t.sendEmptyMessage(1);
                }
            }
            C5181en enVar = this.f11935u;
            if (enVar != null) {
                enVar.mo40475a();
            }
        }
        C5175ei eiVar = this.f11916a;
        if (eiVar != null) {
            eiVar.f11893b = 3;
        }
    }

    public void pause() {
        if (mo40489b() && this.f11916a.isPlaying()) {
            this.f11916a.pause();
            this.f11916a.f11892a = 4;
            if (getTag() != null) {
                C5031bs bsVar = (C5031bs) getTag();
                bsVar.f11380v.put("didPause", Boolean.TRUE);
                bsVar.f11380v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            getPlaybackEventListener().mo40468a((byte) 2);
        }
        C5175ei eiVar = this.f11916a;
        if (eiVar != null) {
            eiVar.f11893b = 4;
        }
        this.f11918c = false;
    }

    public int getDuration() {
        if (mo40489b()) {
            return this.f11916a.getDuration();
        }
        return -1;
    }

    public int getCurrentPosition() {
        if (mo40489b()) {
            return this.f11916a.getCurrentPosition();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40486a(int i) {
        if (mo40489b()) {
            this.f11916a.seekTo(i);
        }
    }

    public boolean isPlaying() {
        return mo40489b() && this.f11916a.isPlaying();
    }

    public int getBufferPercentage() {
        if (this.f11916a != null) {
            return this.f11936v;
        }
        return 0;
    }

    public boolean canPause() {
        return this.f11937w;
    }

    public boolean canSeekBackward() {
        return this.f11938x;
    }

    public boolean canSeekForward() {
        return this.f11939y;
    }

    public int getAudioSessionId() {
        if (this.f11924j == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11924j = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f11924j;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m11877g() {
        C5175ei eiVar;
        if (this.f11921g != null && this.f11923i != null) {
            if (this.f11916a == null) {
                C5031bs bsVar = (C5031bs) getTag();
                if (1 == (bsVar != null ? ((Byte) bsVar.f11380v.get("placementType")).byteValue() : 1)) {
                    eiVar = new C5175ei();
                } else {
                    eiVar = C5175ei.m11850a();
                }
                this.f11916a = eiVar;
                int i = this.f11924j;
                if (i != 0) {
                    eiVar.setAudioSessionId(i);
                } else {
                    this.f11924j = eiVar.getAudioSessionId();
                }
                try {
                    this.f11916a.setDataSource(getContext().getApplicationContext(), this.f11921g, this.f11922h);
                } catch (IOException unused) {
                    this.f11916a.f11892a = -1;
                    this.f11916a.f11893b = -1;
                    return;
                }
            }
            try {
                C5031bs bsVar2 = (C5031bs) getTag();
                this.f11916a.setOnPreparedListener(this.f11920e);
                this.f11916a.setOnVideoSizeChangedListener(this.f11919d);
                this.f11916a.setOnCompletionListener(this.f11940z);
                this.f11916a.setOnErrorListener(this.f11914C);
                this.f11916a.setOnInfoListener(this.f11912A);
                this.f11916a.setOnBufferingUpdateListener(this.f11913B);
                this.f11916a.setSurface(this.f11923i);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f11916a.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build());
                } else {
                    this.f11916a.setAudioStreamType(3);
                }
                this.f11916a.prepareAsync();
                this.f11936v = 0;
                this.f11916a.f11892a = 1;
                m11880i();
                if (bsVar2 != null) {
                    if (((Boolean) bsVar2.f11380v.get("shouldAutoPlay")).booleanValue()) {
                        this.f11916a.f11893b = 3;
                    }
                    if (((Boolean) bsVar2.f11380v.get("didCompleteQ4")).booleanValue()) {
                        mo40487a(8, 0);
                        return;
                    }
                }
                mo40487a(0, 0);
            } catch (Exception e) {
                this.f11916a.f11892a = -1;
                this.f11916a.f11893b = -1;
                this.f11914C.onError(this.f11916a, 1, 0);
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        }
    }

    /* renamed from: c */
    public final void mo40490c() {
        if (this.f11916a != null) {
            C5196d dVar = this.f11934t;
            if (dVar != null) {
                dVar.removeMessages(1);
            }
            if (getTag() != null) {
                ((C5031bs) getTag()).f11380v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            this.f11916a.f11892a = 0;
            this.f11916a.f11893b = 0;
            this.f11916a.reset();
            m11878h();
            if (getTag() == null) {
                this.f11916a.mo40470b();
            } else if (((Byte) ((C5031bs) getTag()).f11380v.get("placementType")).byteValue() == 0) {
                this.f11916a.mo40470b();
            }
            AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            }
            this.f11916a = null;
        }
    }

    /* renamed from: h */
    private void m11878h() {
        this.f11916a.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        this.f11916a.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
        this.f11916a.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        this.f11916a.setOnErrorListener((MediaPlayer.OnErrorListener) null);
        this.f11916a.setOnInfoListener((MediaPlayer.OnInfoListener) null);
        this.f11916a.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
    }

    /* renamed from: d */
    public final void mo40494d() {
        C5175ei eiVar = this.f11916a;
        if (eiVar != null) {
            this.f11927m = 0;
            eiVar.setVolume(0.0f, 0.0f);
            if (getTag() != null) {
                ((C5031bs) getTag()).f11380v.put("currentMediaVolume", 0);
            }
        }
    }

    /* renamed from: e */
    public final void mo40495e() {
        C5175ei eiVar = this.f11916a;
        if (eiVar != null) {
            this.f11927m = 1;
            eiVar.setVolume(1.0f, 1.0f);
            if (getTag() != null) {
                ((C5031bs) getTag()).f11380v.put("currentMediaVolume", 15);
            }
        }
    }

    public int getVolume() {
        if (mo40489b()) {
            return this.f11927m;
        }
        return -1;
    }

    /* renamed from: i */
    private void m11880i() {
        C5181en enVar;
        if (this.f11916a != null && (enVar = this.f11935u) != null) {
            enVar.setMediaPlayer(this);
            this.f11935u.setEnabled(mo40489b());
            this.f11935u.mo40475a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40487a(int i, int i2) {
        if (this.f11916a != null) {
            ProgressBar progressBar = ((C5197ep) getParent()).getProgressBar();
            ImageView poster = ((C5197ep) getParent()).getPoster();
            progressBar.setVisibility(i);
            poster.setVisibility(i2);
        }
    }

    public int getVideoVolume() {
        if (isPlaying()) {
            return this.f11927m;
        }
        return -1;
    }

    public int getLastVolume() {
        return this.f11928n;
    }

    public void setLastVolume(int i) {
        this.f11928n = i;
    }

    public void setMediaController(C5181en enVar) {
        if (enVar != null) {
            this.f11935u = enVar;
            m11880i();
        }
    }

    public C5195c getQuartileCompletedListener() {
        return this.f11930p;
    }

    public void setQuartileCompletedListener(C5195c cVar) {
        this.f11930p = cVar;
    }

    public C5194b getPlaybackEventListener() {
        return this.f11931q;
    }

    public void setPlaybackEventListener(C5194b bVar) {
        this.f11931q = bVar;
    }

    public void setMediaErrorListener(C5193a aVar) {
        this.f11932r = aVar;
    }

    public void setVideoURI(Uri uri) {
        this.f11921g = uri;
        this.f11922h = null;
        m11877g();
        requestLayout();
        invalidate();
    }

    /* renamed from: f */
    static /* synthetic */ void m11875f(C5184eo eoVar) {
        C5175ei eiVar = eoVar.f11916a;
        if (eiVar != null) {
            eiVar.f11892a = 5;
            eoVar.f11916a.f11893b = 5;
        }
        C5181en enVar = eoVar.f11935u;
        if (enVar != null) {
            enVar.mo40476b();
        }
        C5196d dVar = eoVar.f11934t;
        if (dVar != null) {
            dVar.removeMessages(1);
        }
        if (eoVar.getTag() != null) {
            C5031bs bsVar = (C5031bs) eoVar.getTag();
            if (!((Boolean) bsVar.f11380v.get("didCompleteQ4")).booleanValue()) {
                bsVar.f11380v.put("didCompleteQ4", Boolean.TRUE);
                if (eoVar.getQuartileCompletedListener() != null) {
                    eoVar.getQuartileCompletedListener().mo40467a((byte) 3);
                }
            }
            bsVar.f11380v.put("didSignalVideoCompleted", Boolean.TRUE);
            if (bsVar != null) {
                bsVar.f11380v.put("didCompleteQ1", Boolean.FALSE);
                bsVar.f11380v.put("didCompleteQ2", Boolean.FALSE);
                bsVar.f11380v.put("didCompleteQ3", Boolean.FALSE);
                bsVar.f11380v.put("didPause", Boolean.FALSE);
                bsVar.f11380v.put("didStartPlaying", Boolean.FALSE);
                bsVar.f11380v.put("didQ4Fire", Boolean.FALSE);
            }
            if (bsVar.f11474C) {
                eoVar.start();
            } else if (((Boolean) bsVar.f11380v.get("isFullScreen")).booleanValue()) {
                eoVar.mo40487a(8, 0);
            }
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m11879h(C5184eo eoVar) {
        try {
            if (eoVar.f11921g != null) {
                String uri = eoVar.f11921g.toString();
                C4967ar.m11264a();
                C5306gi a = C5306gi.m12146a();
                List<ContentValues> a2 = a.mo40636a("asset", C4967ar.f11256a, "disk_uri=? ", new String[]{uri}, (String) null, (String) null, "created_ts DESC ", "1");
                a.mo40641b();
                C4949ai a3 = a2.isEmpty() ? null : C4967ar.m11262a(a2.get(0));
                C4949ai.C4950a aVar = new C4949ai.C4950a();
                if (a3 != null) {
                    C4949ai a4 = aVar.mo40057a(a3.f11192d, 0, 0).mo40059a();
                    C4967ar.m11264a();
                    C4967ar.m11265b(a4);
                }
            }
        } catch (Exception unused) {
        }
    }
}
