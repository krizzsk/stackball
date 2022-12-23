package com.p243my.target.instreamads;

import android.content.Context;
import com.p243my.target.C7374e0;
import com.p243my.target.C7391f;
import com.p243my.target.C7413g2;
import com.p243my.target.C7566n8;
import com.p243my.target.C7618q2;
import com.p243my.target.C7632r2;
import com.p243my.target.C7661t0;
import com.p243my.target.C7673t5;
import com.p243my.target.C7686u2;
import com.p243my.target.common.BaseAd;
import com.p243my.target.common.models.VideoData;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.instreamads.InstreamAd */
public final class InstreamAd extends BaseAd {
    private static final int DEFAULT_LOADING_TIMEOUT_SECONDS = 10;
    private static final int MIN_LOADING_TIMEOUT_SECONDS = 5;
    private final Context context;
    private C7661t0 engine;
    private boolean isFullscreen;
    private InstreamAdListener listener;
    private int loadingTimeoutSeconds = 10;
    private float[] midpoints;
    private InstreamAdPlayer player;
    private C7632r2 section;
    private float[] userMidpoints;
    private float videoDuration;
    private float volume = 1.0f;

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdBanner */
    public static final class InstreamAdBanner {
        public final boolean allowClose;
        public final float allowCloseDelay;
        public final boolean allowPause;
        public final String ctaText;
        public final float duration;

        /* renamed from: id */
        public final String f18787id;
        public final int videoHeight;
        public final int videoWidth;

        private InstreamAdBanner(String str, boolean z, float f, float f2, int i, int i2, String str2, boolean z2) {
            this.f18787id = str;
            this.allowClose = z;
            this.allowCloseDelay = f;
            this.duration = f2;
            this.videoHeight = i2;
            this.videoWidth = i;
            this.ctaText = str2;
            this.allowPause = z2;
        }

        public static InstreamAdBanner newBanner(C7413g2 g2Var) {
            return new InstreamAdBanner(g2Var.getId(), g2Var.isAllowClose(), g2Var.getAllowCloseDelay(), g2Var.getDuration(), g2Var.getWidth(), g2Var.getHeight(), g2Var.getCtaText(), g2Var.isAllowPause());
        }
    }

    /* renamed from: com.my.target.instreamads.InstreamAd$InstreamAdListener */
    public interface InstreamAdListener {
        void onBannerComplete(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerPause(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerResume(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerStart(InstreamAd instreamAd, InstreamAdBanner instreamAdBanner);

        void onBannerTimeLeftChange(float f, float f2, InstreamAd instreamAd);

        void onComplete(String str, InstreamAd instreamAd);

        void onError(String str, InstreamAd instreamAd);

        void onLoad(InstreamAd instreamAd);

        void onNoAd(String str, InstreamAd instreamAd);
    }

    public InstreamAd(int i, Context context2) {
        super(i, "instreamads");
        this.context = context2;
        C7374e0.m18991c("InstreamAd created. Version: 5.15.0");
    }

    /* access modifiers changed from: private */
    public void handleResult(C7632r2 r2Var, String str) {
        if (this.listener != null) {
            if (r2Var == null || !r2Var.mo51447d()) {
                InstreamAdListener instreamAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                instreamAdListener.onNoAd(str, this);
                return;
            }
            this.section = r2Var;
            C7661t0 a = C7661t0.m20387a(this, r2Var, this.adConfig, this.metricFactory);
            this.engine = a;
            a.mo51544a(this.loadingTimeoutSeconds);
            this.engine.mo51543a(this.volume);
            InstreamAdPlayer instreamAdPlayer = this.player;
            if (instreamAdPlayer != null) {
                this.engine.mo51546a(instreamAdPlayer);
            }
            configureMidpoints(this.videoDuration, this.userMidpoints);
            this.listener.onLoad(this);
        }
    }

    private void start(String str) {
        C7661t0 t0Var = this.engine;
        if (t0Var == null) {
            C7374e0.m18989a("Unable to start ad: not loaded yet");
        } else if (t0Var.mo51556b() == null) {
            C7374e0.m18989a("Unable to start ad: player has not set");
        } else {
            this.engine.mo51552a(str);
        }
    }

    public void configureMidpoints(float f) {
        configureMidpoints(f, (float[]) null);
    }

    public void configureMidpoints(float f, float[] fArr) {
        C7686u2<VideoData> a;
        String str;
        if (f <= 0.0f) {
            str = "midpoints are not configured, duration is not set or <= zero";
        } else if (this.midpoints != null) {
            str = "midpoints already configured";
        } else {
            this.userMidpoints = fArr;
            this.videoDuration = f;
            C7632r2 r2Var = this.section;
            if (r2Var != null && (a = r2Var.mo51445a(InstreamAdBreakType.MIDROLL)) != null) {
                float[] a2 = C7566n8.m19953a(a, this.userMidpoints, f);
                this.midpoints = a2;
                C7661t0 t0Var = this.engine;
                if (t0Var != null) {
                    t0Var.mo51555a(a2);
                    return;
                }
                return;
            }
            return;
        }
        C7374e0.m18989a(str);
    }

    public void configureMidpointsPercents(float f, float[] fArr) {
        if (fArr == null) {
            configureMidpoints(f);
        } else {
            configureMidpoints(f, C7566n8.m19951a(f, fArr));
        }
    }

    public void destroy() {
        this.listener = null;
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51542a();
        }
    }

    public InstreamAdListener getListener() {
        return this.listener;
    }

    public int getLoadingTimeout() {
        return this.loadingTimeoutSeconds;
    }

    public float[] getMidPoints() {
        float[] fArr = this.midpoints;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public InstreamAdPlayer getPlayer() {
        return this.player;
    }

    public int getVideoQuality() {
        return this.adConfig.getVideoQuality();
    }

    public List<String> getVideoSectionNames() {
        if (this.section == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<C7686u2<VideoData>> c = this.section.mo51446c();
        if (c.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Iterator<C7686u2<VideoData>> it = c.iterator();
        while (it.hasNext()) {
            C7686u2 next = it.next();
            if (next.mo51416a() > 0 || next.mo51663i()) {
                arrayList.add(next.mo51662h());
            }
        }
        return arrayList;
    }

    public float getVolume() {
        C7661t0 t0Var = this.engine;
        return t0Var != null ? t0Var.mo51560c() : this.volume;
    }

    public void handleClick() {
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51561d();
        }
    }

    public boolean isFullscreen() {
        return this.isFullscreen;
    }

    public void load() {
        if (isLoadCalled()) {
            C7374e0.m18989a("InstreamAd doesn't support multiple load");
            return;
        }
        C7391f.m19074a(this.adConfig, this.metricFactory, this.loadingTimeoutSeconds).mo49685a(new C7391f.C7394c() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                InstreamAd.this.handleResult((C7632r2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.context);
    }

    public void pause() {
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51562e();
        }
    }

    public void resume() {
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51564g();
        }
    }

    public void setFullscreen(boolean z) {
        this.isFullscreen = z;
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51554a(z);
        }
    }

    public void setListener(InstreamAdListener instreamAdListener) {
        this.listener = instreamAdListener;
    }

    public void setLoadingTimeout(int i) {
        if (i < 5) {
            C7374e0.m18989a("unable to set ad loading timeout < 5, set to 5 seconds");
            this.loadingTimeoutSeconds = 5;
        } else {
            C7374e0.m18989a("ad loading timeout set to " + i + " seconds");
            this.loadingTimeoutSeconds = i;
        }
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51544a(this.loadingTimeoutSeconds);
        }
    }

    public void setPlayer(InstreamAdPlayer instreamAdPlayer) {
        this.player = instreamAdPlayer;
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51546a(instreamAdPlayer);
        }
    }

    public void setVideoQuality(int i) {
        this.adConfig.setVideoQuality(i);
    }

    public void setVolume(float f) {
        if (Float.compare(f, 0.0f) < 0 || Float.compare(f, 1.0f) > 0) {
            C7374e0.m18989a("unable to set volume" + f + ", volume must be in range [0..1]");
            return;
        }
        this.volume = f;
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51543a(f);
        }
    }

    public void skip() {
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51565h();
        }
    }

    public void skipBanner() {
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51566i();
        }
    }

    public void startMidroll(float f) {
        C7661t0 t0Var = this.engine;
        if (t0Var == null) {
            C7374e0.m18989a("Unable to start ad: not loaded yet");
        } else if (t0Var.mo51556b() == null) {
            C7374e0.m18989a("Unable to start ad: player has not set");
        } else {
            this.engine.mo51557b(f);
        }
    }

    public void startPauseroll() {
        start(InstreamAdBreakType.PAUSEROLL);
    }

    public void startPostroll() {
        start("postroll");
    }

    public void startPreroll() {
        start(InstreamAdBreakType.PREROLL);
    }

    public void stop() {
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51567j();
        }
    }

    public void swapPlayer(InstreamAdPlayer instreamAdPlayer) {
        this.player = instreamAdPlayer;
        C7661t0 t0Var = this.engine;
        if (t0Var != null) {
            t0Var.mo51558b(instreamAdPlayer);
        }
    }

    public void useDefaultPlayer() {
        useDefaultPlayer(true);
    }

    public void useDefaultPlayer(boolean z) {
        C7673t5 t5Var = new C7673t5(this.context);
        t5Var.setUseExoPlayer(z);
        setPlayer(t5Var);
    }
}
