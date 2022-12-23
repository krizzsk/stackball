package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.C1945l1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.chartboost.sdk.impl.j1 */
public class C1938j1 extends SurfaceView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, C1945l1.C1946a {

    /* renamed from: a */
    private Uri f4935a;

    /* renamed from: b */
    private int f4936b;

    /* renamed from: c */
    private int f4937c = 0;

    /* renamed from: d */
    private int f4938d = 0;

    /* renamed from: e */
    private SurfaceHolder f4939e = null;

    /* renamed from: f */
    private MediaPlayer f4940f = null;

    /* renamed from: g */
    private int f4941g;

    /* renamed from: h */
    private int f4942h;

    /* renamed from: i */
    private int f4943i;

    /* renamed from: j */
    private int f4944j;

    /* renamed from: k */
    private MediaPlayer.OnCompletionListener f4945k;

    /* renamed from: l */
    private MediaPlayer.OnPreparedListener f4946l;

    /* renamed from: m */
    private MediaPlayer.OnErrorListener f4947m;

    /* renamed from: n */
    private int f4948n;

    public C1938j1(Context context) {
        super(context);
        m4646f();
    }

    /* renamed from: f */
    private void m4646f() {
        this.f4941g = 0;
        this.f4942h = 0;
        getHolder().addCallback(this);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f4937c = 0;
        this.f4938d = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r3.f4937c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4647g() {
        /*
            r3 = this;
            android.media.MediaPlayer r0 = r3.f4940f
            r1 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r3.f4937c
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
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1938j1.m4647g():boolean");
    }

    /* renamed from: h */
    private void m4648h() {
        if (this.f4935a != null && this.f4939e != null) {
            Intent intent = new Intent("com.android.music.musicservicecommand");
            intent.putExtra("command", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            getContext().sendBroadcast(intent);
            m4645a(false);
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f4940f = mediaPlayer;
                mediaPlayer.setOnPreparedListener(this);
                this.f4940f.setOnVideoSizeChangedListener(this);
                this.f4936b = -1;
                this.f4940f.setOnCompletionListener(this);
                this.f4940f.setOnErrorListener(this);
                this.f4940f.setOnBufferingUpdateListener(this);
                this.f4940f.setDisplay(this.f4939e);
                this.f4940f.setAudioStreamType(3);
                this.f4940f.setScreenOnWhilePlaying(true);
                FileInputStream fileInputStream = new FileInputStream(new File(this.f4935a.toString()));
                this.f4940f.setDataSource(fileInputStream.getFD());
                fileInputStream.close();
                this.f4940f.prepareAsync();
                this.f4937c = 1;
            } catch (IOException e) {
                CBLogging.m3994b("VideoSurfaceView", "Unable to open content: " + this.f4935a, e);
                this.f4937c = -1;
                this.f4938d = -1;
                onError(this.f4940f, 1, 0);
            } catch (IllegalArgumentException e2) {
                CBLogging.m3994b("VideoSurfaceView", "Unable to open content: " + this.f4935a, e2);
                this.f4937c = -1;
                this.f4938d = -1;
                onError(this.f4940f, 1, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo14652a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo14656a(Uri uri) {
        mo14657a(uri, (Map<String, String>) null);
    }

    /* renamed from: b */
    public int mo14658b() {
        if (m4647g()) {
            int i = this.f4936b;
            if (i > 0) {
                return i;
            }
            int duration = this.f4940f.getDuration();
            this.f4936b = duration;
            return duration;
        }
        this.f4936b = -1;
        return -1;
    }

    /* renamed from: c */
    public boolean mo14659c() {
        return m4647g() && this.f4940f.isPlaying();
    }

    /* renamed from: d */
    public int mo14660d() {
        if (m4647g()) {
            return this.f4940f.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo14661e() {
        if (m4647g() && this.f4940f.isPlaying()) {
            this.f4940f.pause();
            this.f4937c = 4;
        }
        this.f4938d = 4;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f4938d = 5;
        if (this.f4937c != 5) {
            this.f4937c = 5;
            MediaPlayer.OnCompletionListener onCompletionListener = this.f4945k;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(this.f4940f);
            }
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        CBLogging.m3991a("VideoSurfaceView", "Error: " + i + "," + i2);
        this.f4937c = -1;
        this.f4938d = -1;
        MediaPlayer.OnErrorListener onErrorListener = this.f4947m;
        if (onErrorListener == null || onErrorListener.onError(this.f4940f, i, i2)) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = SurfaceView.getDefaultSize(0, i);
        int defaultSize2 = SurfaceView.getDefaultSize(0, i2);
        int i4 = this.f4941g;
        if (i4 > 0 && (i3 = this.f4942h) > 0) {
            int min = Math.min(defaultSize2, Math.round((((float) i3) / ((float) i4)) * ((float) defaultSize)));
            defaultSize = Math.min(defaultSize, Math.round((((float) this.f4941g) / ((float) this.f4942h)) * ((float) defaultSize2)));
            defaultSize2 = min;
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f4937c = 2;
        this.f4941g = mediaPlayer.getVideoWidth();
        this.f4942h = mediaPlayer.getVideoHeight();
        MediaPlayer.OnPreparedListener onPreparedListener = this.f4946l;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this.f4940f);
        }
        int i = this.f4948n;
        if (i != 0) {
            mo14651a(i);
        }
        if (this.f4941g != 0 && this.f4942h != 0) {
            getHolder().setFixedSize(this.f4941g, this.f4942h);
            if (this.f4943i == this.f4941g && this.f4944j == this.f4942h && this.f4938d == 3) {
                mo14650a();
            }
        } else if (this.f4938d == 3) {
            mo14650a();
        }
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f4941g = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f4942h = videoHeight;
        if (this.f4941g != 0 && videoHeight != 0) {
            getHolder().setFixedSize(this.f4941g, this.f4942h);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f4943i = i2;
        this.f4944j = i3;
        boolean z = true;
        boolean z2 = this.f4938d == 3;
        if (!(this.f4941g == i2 && this.f4942h == i3)) {
            z = false;
        }
        if (this.f4940f != null && z2 && z) {
            int i4 = this.f4948n;
            if (i4 != 0) {
                mo14651a(i4);
            }
            mo14650a();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f4939e = surfaceHolder;
        m4648h();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f4939e = null;
        m4645a(true);
    }

    /* renamed from: a */
    public void mo14657a(Uri uri, Map<String, String> map) {
        this.f4935a = uri;
        this.f4948n = 0;
        m4648h();
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    public void mo14655a(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f4946l = onPreparedListener;
    }

    /* renamed from: a */
    public void mo14653a(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f4945k = onCompletionListener;
    }

    /* renamed from: a */
    public void mo14654a(MediaPlayer.OnErrorListener onErrorListener) {
        this.f4947m = onErrorListener;
    }

    /* renamed from: a */
    private void m4645a(boolean z) {
        MediaPlayer mediaPlayer = this.f4940f;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f4940f.release();
            this.f4940f = null;
            this.f4937c = 0;
            if (z) {
                this.f4938d = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo14650a() {
        if (m4647g()) {
            this.f4940f.start();
            this.f4937c = 3;
        }
        this.f4938d = 3;
    }

    /* renamed from: a */
    public void mo14651a(int i) {
        if (m4647g()) {
            this.f4940f.seekTo(i);
            this.f4948n = 0;
            return;
        }
        this.f4948n = i;
    }
}
