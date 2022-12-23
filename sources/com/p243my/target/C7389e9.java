package com.p243my.target;

import android.content.Context;
import android.net.Uri;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.p243my.target.C7353c9;
import java.util.List;

/* renamed from: com.my.target.e9 */
public class C7389e9 implements Player.EventListener, C7353c9 {

    /* renamed from: a */
    public final C7710v8 f18539a = C7710v8.m20686a(200);

    /* renamed from: b */
    public final SimpleExoPlayer f18540b;

    /* renamed from: c */
    public final C7390a f18541c;

    /* renamed from: d */
    public C7353c9.C7354a f18542d;

    /* renamed from: e */
    public boolean f18543e;

    /* renamed from: f */
    public boolean f18544f;

    /* renamed from: g */
    public MediaSource f18545g;

    /* renamed from: h */
    public Uri f18546h;

    /* renamed from: com.my.target.e9$a */
    public static class C7390a implements Runnable {

        /* renamed from: a */
        public final int f18547a;

        /* renamed from: b */
        public final SimpleExoPlayer f18548b;

        /* renamed from: c */
        public C7353c9.C7354a f18549c;

        /* renamed from: d */
        public int f18550d;

        /* renamed from: e */
        public float f18551e;

        public C7390a(int i, SimpleExoPlayer simpleExoPlayer) {
            this.f18547a = i;
            this.f18548b = simpleExoPlayer;
        }

        /* renamed from: a */
        public void mo50091a(C7353c9.C7354a aVar) {
            this.f18549c = aVar;
        }

        public void run() {
            try {
                float currentPosition = ((float) this.f18548b.getCurrentPosition()) / 1000.0f;
                float duration = ((float) this.f18548b.getDuration()) / 1000.0f;
                if (this.f18551e == currentPosition) {
                    this.f18550d++;
                } else {
                    C7353c9.C7354a aVar = this.f18549c;
                    if (aVar != null) {
                        aVar.mo49871a(currentPosition, duration);
                    }
                    this.f18551e = currentPosition;
                    if (this.f18550d > 0) {
                        this.f18550d = 0;
                    }
                }
                if (this.f18550d > this.f18547a) {
                    C7353c9.C7354a aVar2 = this.f18549c;
                    if (aVar2 != null) {
                        aVar2.mo49877l();
                    }
                    this.f18550d = 0;
                }
            } catch (Throwable th) {
                String str = "ExoPlayer error: " + th.getMessage();
                C7374e0.m18989a(str);
                C7353c9.C7354a aVar3 = this.f18549c;
                if (aVar3 != null) {
                    aVar3.mo49872a(str);
                }
            }
        }
    }

    public C7389e9(Context context) {
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(context).build();
        this.f18540b = build;
        this.f18541c = new C7390a(50, build);
        build.addListener(this);
    }

    /* renamed from: a */
    public static C7389e9 m19051a(Context context) {
        return new C7389e9(context);
    }

    /* renamed from: a */
    public void mo49848a() {
        try {
            if (this.f18543e) {
                this.f18540b.setPlayWhenReady(true);
                return;
            }
            MediaSource mediaSource = this.f18545g;
            if (mediaSource != null) {
                this.f18540b.setMediaSource(mediaSource, true);
                this.f18540b.prepare();
            }
        } catch (Throwable th) {
            mo50090a(th);
        }
    }

    /* renamed from: a */
    public void mo49849a(long j) {
        try {
            this.f18540b.seekTo(j);
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo49850a(Uri uri, Context context) {
        this.f18546h = uri;
        C7374e0.m18989a("Play video in ExoPlayer");
        this.f18544f = false;
        C7353c9.C7354a aVar = this.f18542d;
        if (aVar != null) {
            aVar.mo49874g();
        }
        try {
            if (!this.f18543e) {
                MediaSource a = C7407f9.m19149a(uri, context);
                this.f18545g = a;
                this.f18540b.setMediaSource(a);
                this.f18540b.prepare();
            }
            this.f18540b.setPlayWhenReady(true);
        } catch (Throwable th) {
            String str = "ExoPlayer error: " + th.getMessage();
            C7374e0.m18989a(str);
            C7353c9.C7354a aVar2 = this.f18542d;
            if (aVar2 != null) {
                aVar2.mo49872a(str);
            }
        }
    }

    /* renamed from: a */
    public void mo49851a(Uri uri, C7757y5 y5Var) {
        mo49853a(y5Var);
        mo49850a(uri, y5Var.getContext());
    }

    /* renamed from: a */
    public void mo49852a(C7353c9.C7354a aVar) {
        this.f18542d = aVar;
        this.f18541c.mo50091a(aVar);
    }

    /* renamed from: a */
    public void mo49853a(C7757y5 y5Var) {
        if (y5Var != null) {
            try {
                y5Var.setExoPlayer(this.f18540b);
            } catch (Throwable th) {
                mo50090a(th);
            }
        } else {
            this.f18540b.setVideoTextureView((TextureView) null);
        }
    }

    /* renamed from: a */
    public final void mo50090a(Throwable th) {
        String str = "ExoPlayer error: " + th.getMessage();
        C7374e0.m18989a(str);
        C7353c9.C7354a aVar = this.f18542d;
        if (aVar != null) {
            aVar.mo49872a(str);
        }
    }

    /* renamed from: b */
    public void mo49854b() {
        if (this.f18543e && !this.f18544f) {
            try {
                this.f18540b.setPlayWhenReady(false);
            } catch (Throwable th) {
                mo50090a(th);
            }
        }
    }

    /* renamed from: c */
    public boolean mo49855c() {
        return this.f18543e && !this.f18544f;
    }

    /* renamed from: d */
    public void mo49856d() {
        try {
            setVolume(((double) this.f18540b.getVolume()) == 1.0d ? 0.0f : 1.0f);
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
        }
    }

    public void destroy() {
        this.f18546h = null;
        this.f18543e = false;
        this.f18544f = false;
        this.f18542d = null;
        try {
            this.f18540b.setVideoTextureView((TextureView) null);
            this.f18540b.stop();
            this.f18540b.release();
            this.f18540b.removeListener(this);
            this.f18539a.mo51750b(this.f18541c);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public void mo49858e() {
        try {
            this.f18540b.stop(true);
        } catch (Throwable th) {
            mo50090a(th);
        }
    }

    /* renamed from: f */
    public boolean mo49859f() {
        return this.f18543e && this.f18544f;
    }

    /* renamed from: g */
    public boolean mo49860g() {
        return this.f18543e;
    }

    /* renamed from: h */
    public void mo49861h() {
        try {
            this.f18540b.seekTo(0);
            this.f18540b.setPlayWhenReady(true);
        } catch (Throwable th) {
            mo50090a(th);
        }
    }

    /* renamed from: i */
    public boolean mo49862i() {
        try {
            return this.f18540b.getVolume() == 0.0f;
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
            return false;
        }
    }

    /* renamed from: j */
    public void mo49863j() {
        try {
            this.f18540b.setVolume(1.0f);
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
        }
        C7353c9.C7354a aVar = this.f18542d;
        if (aVar != null) {
            aVar.mo49870a(1.0f);
        }
    }

    /* renamed from: k */
    public Uri mo49864k() {
        return this.f18546h;
    }

    /* renamed from: l */
    public void mo49865l() {
        try {
            this.f18540b.setVolume(0.2f);
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
        }
    }

    /* renamed from: m */
    public float mo49866m() {
        try {
            return ((float) this.f18540b.getDuration()) / 1000.0f;
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: n */
    public long mo49867n() {
        try {
            return this.f18540b.getCurrentPosition();
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
            return 0;
        }
    }

    /* renamed from: o */
    public void mo49868o() {
        try {
            this.f18540b.setVolume(0.0f);
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
        }
        C7353c9.C7354a aVar = this.f18542d;
        if (aVar != null) {
            aVar.mo49870a(0.0f);
        }
    }

    public /* synthetic */ void onEvents(Player player, Player.C3723Events events) {
        Player.EventListener.CC.$default$onEvents(this, player, events);
    }

    public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        Player.EventListener.CC.$default$onExperimentalOffloadSchedulingEnabledChanged(this, z);
    }

    public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
        Player.EventListener.CC.$default$onExperimentalSleepingForOffloadChanged(this, z);
    }

    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        Player.EventListener.CC.$default$onIsLoadingChanged(this, z);
    }

    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        Player.EventListener.CC.$default$onIsPlayingChanged(this, z);
    }

    @Deprecated
    public /* synthetic */ void onLoadingChanged(boolean z) {
        Player.EventListener.CC.$default$onLoadingChanged(this, z);
    }

    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        Player.EventListener.CC.$default$onMediaItemTransition(this, mediaItem, i);
    }

    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        Player.EventListener.CC.$default$onPlayWhenReadyChanged(this, z, i);
    }

    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        Player.EventListener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
    }

    public /* synthetic */ void onPlaybackStateChanged(int i) {
        Player.EventListener.CC.$default$onPlaybackStateChanged(this, i);
    }

    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        Player.EventListener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        this.f18544f = false;
        this.f18543e = false;
        if (this.f18542d != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ExoPlayer error: ");
            sb.append(exoPlaybackException != null ? exoPlaybackException.getMessage() : "Unknown video error");
            this.f18542d.mo49872a(sb.toString());
        }
    }

    public void onPlayerStateChanged(boolean z, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f18544f = false;
                        this.f18543e = false;
                        float m = mo49866m();
                        C7353c9.C7354a aVar = this.f18542d;
                        if (aVar != null) {
                            aVar.mo49871a(m, m);
                        }
                        C7353c9.C7354a aVar2 = this.f18542d;
                        if (aVar2 != null) {
                            aVar2.onVideoCompleted();
                        }
                    } else {
                        return;
                    }
                } else if (z) {
                    C7353c9.C7354a aVar3 = this.f18542d;
                    if (aVar3 != null) {
                        aVar3.mo49878o();
                    }
                    if (!this.f18543e) {
                        this.f18543e = true;
                    } else if (this.f18544f) {
                        this.f18544f = false;
                        C7353c9.C7354a aVar4 = this.f18542d;
                        if (aVar4 != null) {
                            aVar4.mo49875h();
                        }
                    }
                } else if (!this.f18544f) {
                    this.f18544f = true;
                    C7353c9.C7354a aVar5 = this.f18542d;
                    if (aVar5 != null) {
                        aVar5.mo49873f();
                    }
                }
            } else if (!z || this.f18543e) {
                return;
            }
            this.f18539a.mo51748a((Runnable) this.f18541c);
            return;
        } else if (this.f18543e) {
            this.f18543e = false;
            C7353c9.C7354a aVar6 = this.f18542d;
            if (aVar6 != null) {
                aVar6.mo49876j();
            }
        }
        this.f18539a.mo51750b(this.f18541c);
    }

    public /* synthetic */ void onPositionDiscontinuity(int i) {
        Player.EventListener.CC.$default$onPositionDiscontinuity(this, i);
    }

    public void onRepeatModeChanged(int i) {
    }

    @Deprecated
    public /* synthetic */ void onSeekProcessed() {
        Player.EventListener.CC.$default$onSeekProcessed(this);
    }

    public void onShuffleModeEnabledChanged(boolean z) {
    }

    public /* synthetic */ void onStaticMetadataChanged(List<Metadata> list) {
        Player.EventListener.CC.$default$onStaticMetadataChanged(this, list);
    }

    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        Player.EventListener.CC.$default$onTimelineChanged(this, timeline, i);
    }

    @Deprecated
    public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
        Player.EventListener.CC.$default$onTimelineChanged(this, timeline, obj, i);
    }

    public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        Player.EventListener.CC.$default$onTracksChanged(this, trackGroupArray, trackSelectionArray);
    }

    public void setVolume(float f) {
        try {
            this.f18540b.setVolume(f);
        } catch (Throwable th) {
            C7374e0.m18989a("ExoPlayer error: " + th.getMessage());
        }
        C7353c9.C7354a aVar = this.f18542d;
        if (aVar != null) {
            aVar.mo49870a(f);
        }
    }
}
