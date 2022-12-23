package com.p243my.target;

import android.content.Context;
import android.view.View;
import com.p243my.target.C7511l;
import com.p243my.target.common.BaseAd;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.InstreamResearch */
public class InstreamResearch extends BaseAd {
    private C7646s1 banner;
    private final Context context;
    private final int duration;
    private int lastPosition = -1;
    private InstreamResearchListener listener;
    private C7764z researchProgressTracker;
    private C7299a0 researchViewabilityTracker;
    private int state = 0;

    /* renamed from: com.my.target.InstreamResearch$InstreamResearchListener */
    public interface InstreamResearchListener {
        void onLoad(InstreamResearch instreamResearch);

        void onNoData(InstreamResearch instreamResearch, String str);
    }

    private InstreamResearch(int i, int i2, Context context2) {
        super(i, "instreamresearch");
        this.duration = i2;
        this.context = context2;
        C7374e0.m18991c("InstreamResearch created. Version: 5.15.0");
    }

    private String getReadableState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "completed" : TJAdUnitConstants.String.VIDEO_PAUSED : "started" : "idle";
    }

    /* access modifiers changed from: private */
    public void handleResult(C7664t1 t1Var, String str) {
        if (t1Var != null) {
            C7646s1 c = t1Var.mo51569c();
            this.banner = c;
            if (c != null) {
                this.researchProgressTracker = C7764z.m20958a(c.getStatHolder());
                this.researchViewabilityTracker = C7299a0.m18676a(this.banner.getStatHolder());
                InstreamResearchListener instreamResearchListener = this.listener;
                if (instreamResearchListener != null) {
                    instreamResearchListener.onLoad(this);
                    return;
                }
                return;
            }
        }
        InstreamResearchListener instreamResearchListener2 = this.listener;
        if (instreamResearchListener2 != null) {
            instreamResearchListener2.onNoData(this, str);
        }
    }

    public static InstreamResearch newResearch(int i, int i2, Context context2) {
        return new InstreamResearch(i, i2, context2);
    }

    private void trackEvent(String str) {
        C7646s1 s1Var = this.banner;
        if (s1Var != null) {
            ArrayList<C7328b3> a = s1Var.getStatHolder().mo49800a(str);
            if (!a.isEmpty()) {
                C7741x8.m20827c((List<C7328b3>) a, this.context);
            }
        }
    }

    public void load() {
        C7511l.m19629a(this.adConfig, this.metricFactory, this.duration).mo49685a(new C7511l.C7513b() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                InstreamResearch.this.handleResult((C7664t1) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.context);
    }

    public void registerPlayerView(View view) {
        C7299a0 a0Var = this.researchViewabilityTracker;
        if (a0Var != null) {
            a0Var.mo49531a(view);
        }
    }

    public void setListener(InstreamResearchListener instreamResearchListener) {
        this.listener = instreamResearchListener;
    }

    public void trackFullscreen(boolean z) {
        trackEvent(z ? "fullscreenOn" : "fullscreenOff");
    }

    public void trackMute(boolean z) {
        trackEvent(z ? "volumeOff" : "volumeOn");
    }

    public void trackPause() {
        if (this.state != 1) {
            C7374e0.m18990b("Unable to track pause, wrong state " + getReadableState(this.state));
            return;
        }
        trackEvent("playbackPaused");
        this.state = 2;
    }

    public void trackProgress(float f) {
        if (this.state < 1) {
            trackEvent("playbackStarted");
            this.state = 1;
        }
        if (this.state > 1) {
            C7374e0.m18989a("Unable to track progress while state is: " + getReadableState(this.state));
            return;
        }
        int round = Math.round(f);
        int i = this.lastPosition;
        if (round < i) {
            trackEvent("rewind");
        } else if (round == i) {
            return;
        }
        this.lastPosition = round;
        C7299a0 a0Var = this.researchViewabilityTracker;
        if (a0Var != null) {
            a0Var.mo49534b(round);
        }
        C7764z zVar = this.researchProgressTracker;
        if (zVar != null) {
            zVar.mo51905a(round, this.duration, this.context);
        }
    }

    public void trackResume() {
        if (this.state != 2) {
            C7374e0.m18990b("VideoAdTracker error: unable to track resume, wrong state " + getReadableState(this.state));
            return;
        }
        trackEvent("playbackResumed");
        this.state = 1;
    }

    public void unregisterPlayerView() {
        C7299a0 a0Var = this.researchViewabilityTracker;
        if (a0Var != null) {
            a0Var.mo49531a((View) null);
        }
    }
}
