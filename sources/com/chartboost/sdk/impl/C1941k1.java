package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.C1945l1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.chartboost.sdk.impl.k1 */
public class C1941k1 extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, C1945l1.C1946a {

    /* renamed from: a */
    private Uri f4961a;

    /* renamed from: b */
    private int f4962b;

    /* renamed from: c */
    private int f4963c = 0;

    /* renamed from: d */
    private int f4964d = 0;

    /* renamed from: e */
    private Surface f4965e = null;

    /* renamed from: f */
    private MediaPlayer f4966f = null;

    /* renamed from: g */
    private int f4967g;

    /* renamed from: h */
    private int f4968h;

    /* renamed from: i */
    private MediaPlayer.OnCompletionListener f4969i;

    /* renamed from: j */
    private MediaPlayer.OnPreparedListener f4970j;

    /* renamed from: k */
    private MediaPlayer.OnErrorListener f4971k;

    /* renamed from: l */
    private int f4972l;

    public C1941k1(Context context) {
        super(context);
        m4670g();
    }

    /* renamed from: f */
    private void m4669f() {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(this.f4961a.toString());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(19);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            this.f4968h = Integer.parseInt(extractMetadata);
            this.f4967g = Integer.parseInt(extractMetadata2);
        } catch (Exception e) {
            CBLogging.m3994b("play video", "read size error", e);
        }
    }

    /* renamed from: g */
    private void m4670g() {
        this.f4967g = 0;
        this.f4968h = 0;
        setSurfaceTextureListener(this);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f4963c = 0;
        this.f4964d = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r3.f4963c;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4671h() {
        /*
            r3 = this;
            android.media.MediaPlayer r0 = r3.f4966f
            r1 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r3.f4963c
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
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1941k1.m4671h():boolean");
    }

    /* renamed from: i */
    private void m4672i() {
        if (this.f4961a != null && this.f4965e != null) {
            Intent intent = new Intent("com.android.music.musicservicecommand");
            intent.putExtra("command", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            getContext().sendBroadcast(intent);
            m4668a(false);
            m4669f();
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f4966f = mediaPlayer;
                mediaPlayer.setOnPreparedListener(this);
                this.f4966f.setOnVideoSizeChangedListener(this);
                this.f4962b = -1;
                this.f4966f.setOnCompletionListener(this);
                this.f4966f.setOnErrorListener(this);
                this.f4966f.setOnBufferingUpdateListener(this);
                FileInputStream fileInputStream = new FileInputStream(new File(this.f4961a.toString()));
                this.f4966f.setDataSource(fileInputStream.getFD());
                fileInputStream.close();
                this.f4966f.setSurface(this.f4965e);
                this.f4966f.setAudioStreamType(3);
                this.f4966f.setScreenOnWhilePlaying(true);
                this.f4966f.prepareAsync();
                this.f4963c = 1;
            } catch (IOException e) {
                CBLogging.m3994b("VideoTextureView", "Unable to open content: " + this.f4961a, e);
                this.f4963c = -1;
                this.f4964d = -1;
                onError(this.f4966f, 1, 0);
            } catch (IllegalArgumentException e2) {
                CBLogging.m3994b("VideoTextureView", "Unable to open content: " + this.f4961a, e2);
                this.f4963c = -1;
                this.f4964d = -1;
                onError(this.f4966f, 1, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo14656a(Uri uri) {
        mo14678a(uri, (Map<String, String>) null);
    }

    /* renamed from: b */
    public int mo14658b() {
        if (m4671h()) {
            int i = this.f4962b;
            if (i > 0) {
                return i;
            }
            int duration = this.f4966f.getDuration();
            this.f4962b = duration;
            return duration;
        }
        this.f4962b = -1;
        return -1;
    }

    /* renamed from: c */
    public boolean mo14659c() {
        return m4671h() && this.f4966f.isPlaying();
    }

    /* renamed from: d */
    public int mo14660d() {
        if (m4671h()) {
            return this.f4966f.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo14661e() {
        if (m4671h() && this.f4966f.isPlaying()) {
            this.f4966f.pause();
            this.f4963c = 4;
        }
        this.f4964d = 4;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f4964d = 5;
        if (this.f4963c != 5) {
            this.f4963c = 5;
            MediaPlayer.OnCompletionListener onCompletionListener = this.f4969i;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(this.f4966f);
            }
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        CBLogging.m3991a("VideoTextureView", "Error: " + i + "," + i2);
        if (i == 100) {
            m4672i();
            return true;
        }
        this.f4963c = -1;
        this.f4964d = -1;
        MediaPlayer.OnErrorListener onErrorListener = this.f4971k;
        if (onErrorListener == null || onErrorListener.onError(this.f4966f, i, i2)) {
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f4963c = 2;
        this.f4967g = mediaPlayer.getVideoWidth();
        this.f4968h = mediaPlayer.getVideoHeight();
        MediaPlayer.OnPreparedListener onPreparedListener = this.f4970j;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this.f4966f);
        }
        int i = this.f4972l;
        if (i != 0) {
            mo14651a(i);
        }
        if (this.f4964d == 3) {
            mo14650a();
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f4965e = new Surface(surfaceTexture);
        m4672i();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f4965e = null;
        m4668a(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean z = this.f4964d == 3;
        if (this.f4966f != null && z) {
            int i3 = this.f4972l;
            if (i3 != 0) {
                mo14651a(i3);
            }
            mo14650a();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f4967g = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f4968h = videoHeight;
        if (this.f4967g != 0 && videoHeight != 0) {
            mo14652a(getWidth(), getHeight());
        }
    }

    /* renamed from: a */
    public void mo14652a(int i, int i2) {
        int i3;
        int i4 = this.f4967g;
        if (i4 != 0 && (i3 = this.f4968h) != 0 && i != 0 && i2 != 0) {
            float f = (float) i;
            float f2 = (float) i2;
            float min = Math.min(f / ((float) i4), f2 / ((float) i3));
            float f3 = ((float) this.f4967g) * min;
            float f4 = min * ((float) this.f4968h);
            Matrix matrix = new Matrix();
            matrix.setScale(f3 / f, f4 / f2, f / 2.0f, f2 / 2.0f);
            setTransform(matrix);
        }
    }

    /* renamed from: a */
    public void mo14678a(Uri uri, Map<String, String> map) {
        this.f4961a = uri;
        this.f4972l = 0;
        m4672i();
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    public void mo14655a(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f4970j = onPreparedListener;
    }

    /* renamed from: a */
    public void mo14653a(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f4969i = onCompletionListener;
    }

    /* renamed from: a */
    public void mo14654a(MediaPlayer.OnErrorListener onErrorListener) {
        this.f4971k = onErrorListener;
    }

    /* renamed from: a */
    private void m4668a(boolean z) {
        MediaPlayer mediaPlayer = this.f4966f;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f4966f.release();
            this.f4966f = null;
            this.f4963c = 0;
            if (z) {
                this.f4964d = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo14650a() {
        if (m4671h()) {
            this.f4966f.start();
            this.f4963c = 3;
        }
        this.f4964d = 3;
    }

    /* renamed from: a */
    public void mo14651a(int i) {
        if (m4671h()) {
            this.f4966f.seekTo(i);
            this.f4972l = 0;
            return;
        }
        this.f4972l = i;
    }
}
