package com.p243my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.p243my.target.C7353c9;
import com.p243my.target.C7757y5;
import com.p243my.target.common.models.VideoData;

/* renamed from: com.my.target.s4 */
public class C7649s4 implements C7562n4, AudioManager.OnAudioFocusChangeListener, C7353c9.C7354a, C7757y5.C7758a {

    /* renamed from: a */
    public final C7650a f19320a;

    /* renamed from: b */
    public C7757y5 f19321b;

    /* renamed from: c */
    public final C7413g2<VideoData> f19322c;

    /* renamed from: d */
    public final C7353c9 f19323d;

    /* renamed from: e */
    public final C7336b9 f19324e;

    /* renamed from: f */
    public final C7679t8 f19325f;

    /* renamed from: g */
    public final float f19326g;

    /* renamed from: h */
    public boolean f19327h;

    /* renamed from: com.my.target.s4$a */
    public interface C7650a {
        /* renamed from: a */
        void mo51495a(float f, float f2);

        /* renamed from: c */
        void mo51496c();

        /* renamed from: f */
        void mo51497f();

        /* renamed from: g */
        void mo51498g();

        /* renamed from: h */
        void mo51499h();

        /* renamed from: k */
        void mo51500k();

        /* renamed from: l */
        void mo51501l();

        void onVideoCompleted();

        void onVolumeChanged(float f);
    }

    public C7649s4(C7413g2<VideoData> g2Var, C7757y5 y5Var, C7650a aVar, C7565n7 n7Var, C7353c9 c9Var) {
        this.f19320a = aVar;
        this.f19321b = y5Var;
        this.f19323d = c9Var;
        y5Var.setAdVideoViewListener(this);
        this.f19322c = g2Var;
        C7336b9 a = C7336b9.m18814a(g2Var.getStatHolder());
        this.f19324e = a;
        this.f19325f = n7Var.mo51008a(g2Var);
        a.mo49775a((View) y5Var);
        this.f19326g = g2Var.getDuration();
        c9Var.mo49852a((C7353c9.C7354a) this);
        c9Var.setVolume(g2Var.isAutoMute() ? 0.0f : 1.0f);
    }

    /* renamed from: a */
    public static C7649s4 m20318a(C7413g2<VideoData> g2Var, C7757y5 y5Var, C7650a aVar, C7565n7 n7Var, C7353c9 c9Var) {
        return new C7649s4(g2Var, y5Var, aVar, n7Var, c9Var);
    }

    /* renamed from: a */
    public void mo51488a() {
        VideoData mediaData = this.f19322c.getMediaData();
        this.f19325f.mo51609c();
        if (mediaData != null) {
            if (!this.f19323d.mo49862i()) {
                mo51492b(this.f19321b.getContext());
            }
            this.f19323d.mo49852a((C7353c9.C7354a) this);
            this.f19323d.mo49853a(this.f19321b);
            mo51491a(mediaData);
        }
    }

    /* renamed from: a */
    public void mo49870a(float f) {
        this.f19320a.onVolumeChanged(f);
    }

    /* renamed from: a */
    public void mo49871a(float f, float f2) {
        float f3 = this.f19326g;
        if (f <= f3) {
            if (f != 0.0f) {
                this.f19320a.mo51495a(f, f2);
                this.f19325f.mo51600a(f, f2);
                this.f19324e.mo49774a(f, f2);
            }
            if (f == f2) {
                if (this.f19323d.mo49855c()) {
                    onVideoCompleted();
                }
                this.f19323d.mo49858e();
                return;
            }
            return;
        }
        mo49871a(f2, f3);
    }

    /* renamed from: a */
    public final void m20319b(int i) {
        if (i == -2 || i == -1) {
            mo50991i();
            C7374e0.m18989a("Audiofocus loss, pausing");
        }
    }

    /* renamed from: a */
    public final void mo51490a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    /* renamed from: a */
    public final void mo51491a(VideoData videoData) {
        String str = (String) videoData.getData();
        this.f19321b.mo51888a(videoData.getWidth(), videoData.getHeight());
        if (str != null) {
            this.f19327h = true;
            this.f19323d.mo49850a(Uri.parse(str), this.f19321b.getContext());
            return;
        }
        this.f19327h = false;
        this.f19323d.mo49850a(Uri.parse(videoData.getUrl()), this.f19321b.getContext());
    }

    /* renamed from: a */
    public void mo49872a(String str) {
        C7374e0.m18989a("Video playing error: " + str);
        this.f19325f.mo51612f();
        if (this.f19327h) {
            C7374e0.m18989a("Try to play video stream from URL");
            this.f19327h = false;
            VideoData mediaData = this.f19322c.getMediaData();
            if (mediaData != null) {
                this.f19323d.mo49850a(Uri.parse(mediaData.getUrl()), this.f19321b.getContext());
                return;
            }
        }
        this.f19320a.mo51496c();
        this.f19323d.mo49858e();
        this.f19323d.destroy();
    }

    /* renamed from: b */
    public final void mo51492b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
    }

    /* renamed from: d */
    public void mo50988d() {
        this.f19323d.mo49856d();
        this.f19325f.mo51608b(!this.f19323d.mo49862i());
    }

    public void destroy() {
        mo50991i();
        this.f19323d.destroy();
        this.f19324e.mo49772a();
    }

    /* renamed from: e */
    public void mo50990e() {
        this.f19325f.mo51610d();
        destroy();
    }

    /* renamed from: f */
    public void mo49873f() {
        this.f19320a.mo51497f();
    }

    /* renamed from: g */
    public void mo49874g() {
        this.f19320a.mo51498g();
    }

    /* renamed from: h */
    public void mo49875h() {
        this.f19320a.mo51499h();
    }

    /* renamed from: i */
    public void mo50991i() {
        mo51490a(this.f19321b.getContext());
        this.f19323d.mo49854b();
    }

    /* renamed from: j */
    public void mo49876j() {
    }

    /* renamed from: k */
    public void mo50992k() {
        if (this.f19322c.isAutoPlay()) {
            this.f19320a.mo51498g();
            mo51488a();
            return;
        }
        this.f19320a.mo51501l();
    }

    /* renamed from: l */
    public void mo49877l() {
        C7374e0.m18989a("Video playing timeout");
        this.f19325f.mo51613g();
        this.f19320a.mo51496c();
        this.f19323d.mo49858e();
        this.f19323d.destroy();
    }

    /* renamed from: o */
    public void mo49878o() {
        this.f19320a.mo51500k();
    }

    public void onAudioFocusChange(int i) {
        if (Build.VERSION.SDK_INT >= 23 ? Looper.getMainLooper().isCurrentThread() : Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m20319b(i);
        } else {
            C7395f0.m19090c(new Runnable(i) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7649s4.this.m20319b(this.f$1);
                }
            });
        }
    }

    public void onVideoCompleted() {
        this.f19320a.onVideoCompleted();
        this.f19323d.mo49858e();
    }

    /* renamed from: p */
    public void mo50016p() {
        if (this.f19323d instanceof C7389e9) {
            this.f19321b.setViewMode(1);
            this.f19323d.mo49853a(this.f19321b);
            VideoData mediaData = this.f19322c.getMediaData();
            if (this.f19323d.mo49855c() && mediaData != null) {
                if (mediaData.getData() != null) {
                    this.f19327h = true;
                }
                mo51491a(mediaData);
                return;
            }
            return;
        }
        mo49872a("Playback within no hardware accelerated view is available only with ExoPlayer");
    }

    /* renamed from: q */
    public void mo50993q() {
        if (this.f19323d.mo49855c()) {
            mo50991i();
            this.f19325f.mo51611e();
        } else if (this.f19323d.mo49867n() > 0) {
            mo51494r();
            this.f19325f.mo51614h();
        } else {
            mo51488a();
        }
    }

    /* renamed from: r */
    public void mo51494r() {
        this.f19323d.mo49848a();
        if (this.f19323d.mo49862i()) {
            mo51490a(this.f19321b.getContext());
        } else if (this.f19323d.mo49855c()) {
            mo51492b(this.f19321b.getContext());
        }
    }
}
