package com.applovin.impl.adview;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.MediaController;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1355g;
import java.util.Map;

public class AppLovinVideoViewV2 extends SurfaceView implements MediaController.MediaPlayerControl {

    /* renamed from: A */
    private final MediaPlayer.OnInfoListener f1780A = new MediaPlayer.OnInfoListener() {
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (AppLovinVideoViewV2.this.f1800q == null) {
                return true;
            }
            AppLovinVideoViewV2.this.f1800q.onInfo(mediaPlayer, i, i2);
            return true;
        }
    };

    /* renamed from: B */
    private final MediaPlayer.OnErrorListener f1781B = new MediaPlayer.OnErrorListener() {
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C1505q a = AppLovinVideoViewV2.this.f1784a;
            a.mo13277b("AppLovinVideoView", "Media player error: " + i + ", " + i2);
            int unused = AppLovinVideoViewV2.this.f1787d = -1;
            int unused2 = AppLovinVideoViewV2.this.f1788e = -1;
            if (AppLovinVideoViewV2.this.f1799p == null || AppLovinVideoViewV2.this.f1799p.onError(AppLovinVideoViewV2.this.f1790g, i, i2)) {
            }
            return true;
        }
    };

    /* renamed from: C */
    private final MediaPlayer.OnBufferingUpdateListener f1782C = new MediaPlayer.OnBufferingUpdateListener() {
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            C1505q a = AppLovinVideoViewV2.this.f1784a;
            a.mo13277b("AppLovinVideoView", "Buffered: " + i + "%");
            int unused = AppLovinVideoViewV2.this.f1798o = i;
        }
    };

    /* renamed from: D */
    private final MediaPlayer.OnSeekCompleteListener f1783D = new MediaPlayer.OnSeekCompleteListener() {
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            AppLovinVideoViewV2.this.f1784a.mo13277b("AppLovinVideoView", "Seek finished");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1505q f1784a;

    /* renamed from: b */
    private final C1355g.C1360d f1785b;

    /* renamed from: c */
    private Uri f1786c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f1787d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f1788e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SurfaceHolder f1789f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MediaPlayer f1790g = null;

    /* renamed from: h */
    private int f1791h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1792i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f1793j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f1794k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1795l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public MediaPlayer.OnCompletionListener f1796m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public MediaPlayer.OnPreparedListener f1797n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f1798o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public MediaPlayer.OnErrorListener f1799p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public MediaPlayer.OnInfoListener f1800q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f1801r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f1802s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f1803t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f1804u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public AudioManager f1805v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f1806w = 1;

    /* renamed from: x */
    private final MediaPlayer.OnVideoSizeChangedListener f1807x = new MediaPlayer.OnVideoSizeChangedListener() {
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int unused = AppLovinVideoViewV2.this.f1792i = mediaPlayer.getVideoWidth();
            int unused2 = AppLovinVideoViewV2.this.f1793j = mediaPlayer.getVideoHeight();
            if (AppLovinVideoViewV2.this.f1792i != 0 && AppLovinVideoViewV2.this.f1793j != 0) {
                AppLovinVideoViewV2.this.getHolder().setFixedSize(AppLovinVideoViewV2.this.f1792i, AppLovinVideoViewV2.this.f1793j);
                AppLovinVideoViewV2.this.requestLayout();
            }
        }
    };

    /* renamed from: y */
    private final MediaPlayer.OnPreparedListener f1808y = new MediaPlayer.OnPreparedListener() {
        public void onPrepared(MediaPlayer mediaPlayer) {
            int unused = AppLovinVideoViewV2.this.f1787d = 2;
            AppLovinVideoViewV2 appLovinVideoViewV2 = AppLovinVideoViewV2.this;
            boolean unused2 = appLovinVideoViewV2.f1802s = appLovinVideoViewV2.f1803t = appLovinVideoViewV2.f1804u = true;
            if (AppLovinVideoViewV2.this.f1797n != null) {
                AppLovinVideoViewV2.this.f1797n.onPrepared(AppLovinVideoViewV2.this.f1790g);
            }
            int unused3 = AppLovinVideoViewV2.this.f1792i = mediaPlayer.getVideoWidth();
            int unused4 = AppLovinVideoViewV2.this.f1793j = mediaPlayer.getVideoHeight();
            int g = AppLovinVideoViewV2.this.f1801r;
            if (g != 0) {
                AppLovinVideoViewV2.this.seekTo(g);
            }
            if (AppLovinVideoViewV2.this.f1792i != 0 && AppLovinVideoViewV2.this.f1793j != 0) {
                AppLovinVideoViewV2.this.getHolder().setFixedSize(AppLovinVideoViewV2.this.f1792i, AppLovinVideoViewV2.this.f1793j);
                if (!(AppLovinVideoViewV2.this.f1794k == AppLovinVideoViewV2.this.f1792i && AppLovinVideoViewV2.this.f1795l == AppLovinVideoViewV2.this.f1793j && AppLovinVideoViewV2.this.f1788e == 3)) {
                    return;
                }
            } else if (AppLovinVideoViewV2.this.f1788e != 3) {
                return;
            }
            AppLovinVideoViewV2.this.start();
        }
    };

    /* renamed from: z */
    private final MediaPlayer.OnCompletionListener f1809z = new MediaPlayer.OnCompletionListener() {
        public void onCompletion(MediaPlayer mediaPlayer) {
            int unused = AppLovinVideoViewV2.this.f1787d = 5;
            int unused2 = AppLovinVideoViewV2.this.f1788e = 5;
            if (AppLovinVideoViewV2.this.f1796m != null) {
                AppLovinVideoViewV2.this.f1796m.onCompletion(AppLovinVideoViewV2.this.f1790g);
            }
            if (AppLovinVideoViewV2.this.f1806w != 0) {
                AppLovinVideoViewV2.this.f1805v.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            }
        }
    };

    public AppLovinVideoViewV2(C1355g.C1360d dVar, Context context, C1469j jVar) {
        super(context);
        this.f1785b = dVar;
        this.f1784a = jVar.mo13139v();
        this.f1805v = (AudioManager) context.getSystemService("audio");
        getHolder().addCallback(new SurfaceHolder.Callback() {
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C1505q a = AppLovinVideoViewV2.this.f1784a;
                a.mo13277b("AppLovinVideoView", "Surface changed with format: " + i + ", width: " + i2 + ", height: " + i3);
                int unused = AppLovinVideoViewV2.this.f1794k = i2;
                int unused2 = AppLovinVideoViewV2.this.f1795l = i3;
                boolean z = false;
                boolean z2 = AppLovinVideoViewV2.this.f1788e == 3 || AppLovinVideoViewV2.this.f1788e == 4;
                if (AppLovinVideoViewV2.this.f1792i == i2 && AppLovinVideoViewV2.this.f1793j == i3) {
                    z = true;
                }
                if (AppLovinVideoViewV2.this.f1790g != null && z2 && z) {
                    if (AppLovinVideoViewV2.this.f1801r != 0) {
                        AppLovinVideoViewV2 appLovinVideoViewV2 = AppLovinVideoViewV2.this;
                        appLovinVideoViewV2.seekTo(appLovinVideoViewV2.f1801r);
                    }
                    AppLovinVideoViewV2.this.start();
                }
            }

            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                AppLovinVideoViewV2.this.f1784a.mo13277b("AppLovinVideoView", "Surface created");
                SurfaceHolder unused = AppLovinVideoViewV2.this.f1789f = surfaceHolder;
                if (AppLovinVideoViewV2.this.f1790g != null) {
                    AppLovinVideoViewV2.this.f1790g.setSurface(surfaceHolder.getSurface());
                } else {
                    AppLovinVideoViewV2.this.m1435a();
                }
            }

            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                AppLovinVideoViewV2.this.f1784a.mo13277b("AppLovinVideoView", "Surface destroyed");
                SurfaceHolder unused = AppLovinVideoViewV2.this.f1789f = null;
            }
        });
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f1787d = 0;
        this.f1788e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1435a() {
        this.f1784a.mo13277b("AppLovinVideoView", "Opening video");
        if (this.f1786c != null && this.f1789f != null) {
            if (this.f1790g != null) {
                this.f1784a.mo13277b("AppLovinVideoView", "Using existing MediaPlayer");
                this.f1790g.start();
                return;
            }
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f1790g = mediaPlayer;
                if (this.f1791h != 0) {
                    mediaPlayer.setAudioSessionId(this.f1791h);
                } else {
                    this.f1791h = mediaPlayer.getAudioSessionId();
                }
                this.f1790g.setOnPreparedListener(this.f1808y);
                this.f1790g.setOnVideoSizeChangedListener(this.f1807x);
                this.f1790g.setOnCompletionListener(this.f1809z);
                this.f1790g.setOnErrorListener(this.f1781B);
                this.f1790g.setOnInfoListener(this.f1780A);
                this.f1790g.setOnBufferingUpdateListener(this.f1782C);
                this.f1790g.setOnSeekCompleteListener(this.f1783D);
                this.f1798o = 0;
                this.f1790g.setDataSource(getContext(), this.f1786c, (Map) null);
                this.f1790g.setDisplay(this.f1789f);
                this.f1790g.setScreenOnWhilePlaying(true);
                this.f1790g.prepareAsync();
                this.f1787d = 1;
            } catch (Throwable th) {
                C1505q.m3341c("AppLovinVideoView", "Unable to open video: " + this.f1786c, th);
                this.f1787d = -1;
                this.f1788e = -1;
                this.f1781B.onError(this.f1790g, 1, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r3.f1787d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1439b() {
        /*
            r3 = this;
            android.media.MediaPlayer r0 = r3.f1790g
            r1 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r3.f1787d
            r2 = -1
            if (r0 == r2) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            if (r0 == r1) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.AppLovinVideoViewV2.m1439b():boolean");
    }

    public boolean canPause() {
        return this.f1802s;
    }

    public boolean canSeekBackward() {
        return this.f1803t;
    }

    public boolean canSeekForward() {
        return this.f1804u;
    }

    public int getAudioSessionId() {
        if (this.f1791h == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f1791h = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f1791h;
    }

    public int getBufferPercentage() {
        if (this.f1790g != null) {
            return this.f1798o;
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (m1439b()) {
            return this.f1790g.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (m1439b()) {
            return this.f1790g.getDuration();
        }
        return -1;
    }

    public boolean isPlaying() {
        return m1439b() && this.f1790g.isPlaying();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.f1792i, i);
        int defaultSize2 = getDefaultSize(this.f1793j, i2);
        if (this.f1792i > 0 && this.f1793j > 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = true;
            boolean z2 = this.f1792i * defaultSize2 < this.f1793j * defaultSize;
            if (this.f1792i * defaultSize2 <= this.f1793j * defaultSize) {
                z = false;
            }
            if (this.f1785b == C1355g.C1360d.RESIZE_ASPECT) {
                if (z2) {
                    defaultSize = (this.f1792i * size2) / this.f1793j;
                    defaultSize2 = size2;
                } else {
                    if (z) {
                        defaultSize2 = (this.f1793j * size) / this.f1792i;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (this.f1785b == C1355g.C1360d.RESIZE_ASPECT_FILL) {
                if (z2) {
                    defaultSize2 = (int) (((float) this.f1793j) * (((float) size) / ((float) this.f1792i)));
                } else {
                    if (z) {
                        defaultSize = (int) (((float) this.f1792i) * (((float) size2) / ((float) this.f1793j)));
                        defaultSize2 = size2;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            }
            defaultSize = size;
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void pause() {
        this.f1784a.mo13277b("AppLovinVideoView", "Pausing video");
        if (m1439b() && this.f1790g.isPlaying()) {
            this.f1790g.pause();
        }
        this.f1788e = 4;
    }

    public void resume() {
        this.f1784a.mo13277b("AppLovinVideoView", "Resuming video");
        m1435a();
    }

    public void seekAndStart(long j) {
        C1505q qVar = this.f1784a;
        qVar.mo13277b("AppLovinVideoView", "Seeking and starting to " + j + "ms...");
        MediaPlayer mediaPlayer = this.f1790g;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) j);
        } else {
            this.f1784a.mo13281e("AppLovinVideoView", "Media player unavailable");
        }
    }

    public void seekTo(int i) {
        C1505q qVar = this.f1784a;
        qVar.mo13277b("AppLovinVideoView", "Seeking to " + i + "ms");
        if (m1439b()) {
            this.f1790g.seekTo(i);
            i = 0;
        } else {
            this.f1784a.mo13277b("AppLovinVideoView", "Seek delayed");
        }
        this.f1801r = i;
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f1796m = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f1799p = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f1800q = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f1797n = onPreparedListener;
    }

    public void setVideoURI(Uri uri) {
        C1505q qVar = this.f1784a;
        qVar.mo13277b("AppLovinVideoView", "Setting video uri: " + uri);
        this.f1786c = uri;
        this.f1801r = 0;
        m1435a();
        requestLayout();
        invalidate();
    }

    public void start() {
        this.f1784a.mo13277b("AppLovinVideoView", "Starting video");
        if (m1439b()) {
            this.f1790g.start();
        }
        this.f1788e = 3;
    }

    public void stopPlayback() {
        this.f1784a.mo13277b("AppLovinVideoView", "Stopping playback");
        MediaPlayer mediaPlayer = this.f1790g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f1790g.release();
            this.f1790g = null;
            this.f1787d = 0;
            this.f1788e = 0;
            this.f1805v.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        }
    }
}
