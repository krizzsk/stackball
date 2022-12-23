package com.p243my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p243my.target.C7353c9;
import com.p243my.target.C7546m6;
import com.p243my.target.C7651s5;
import com.p243my.target.C7757y5;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.m0 */
public class C7536m0 implements C7353c9.C7354a, C7651s5.C7652a, C7546m6.C7551e, C7757y5.C7758a {

    /* renamed from: a */
    public final C7413g2<VideoData> f18956a;

    /* renamed from: b */
    public final VideoData f18957b;

    /* renamed from: c */
    public final AudioManager.OnAudioFocusChangeListener f18958c;

    /* renamed from: d */
    public final C7435h2 f18959d;

    /* renamed from: e */
    public final C7452i1 f18960e;

    /* renamed from: f */
    public final C7336b9 f18961f;

    /* renamed from: g */
    public Uri f18962g;

    /* renamed from: h */
    public final C7679t8 f18963h;

    /* renamed from: i */
    public View.OnClickListener f18964i;

    /* renamed from: j */
    public WeakReference<MediaAdView> f18965j;

    /* renamed from: k */
    public WeakReference<C7651s5> f18966k;

    /* renamed from: l */
    public WeakReference<C7546m6> f18967l;

    /* renamed from: m */
    public WeakReference<Context> f18968m;

    /* renamed from: n */
    public int f18969n;

    /* renamed from: o */
    public boolean f18970o;

    /* renamed from: p */
    public boolean f18971p;

    /* renamed from: q */
    public boolean f18972q;

    /* renamed from: r */
    public boolean f18973r;

    /* renamed from: s */
    public C7539c f18974s;

    /* renamed from: t */
    public C7353c9 f18975t;

    /* renamed from: u */
    public boolean f18976u;

    /* renamed from: v */
    public long f18977v;

    /* renamed from: w */
    public boolean f18978w;

    /* renamed from: x */
    public boolean f18979x;

    /* renamed from: com.my.target.m0$b */
    public class C7538b implements AudioManager.OnAudioFocusChangeListener {
        public C7538b() {
        }

        public void onAudioFocusChange(int i) {
            if (i == -3) {
                C7536m0.this.mo50835s();
            } else if (i == -2 || i == -1) {
                C7536m0.this.mo50840x();
                C7374e0.m18989a("Audiofocus loss, pausing");
            } else if ((i == 1 || i == 2 || i == 4) && C7536m0.this.f18971p) {
                C7374e0.m18989a("Audiofocus gain, unmuting");
                C7536m0.this.mo50842z();
            }
        }
    }

    /* renamed from: com.my.target.m0$c */
    public interface C7539c {
        /* renamed from: c */
        void mo50115c();

        /* renamed from: d */
        void mo50116d();

        /* renamed from: e */
        void mo50117e();

        /* renamed from: f */
        void mo50118f();
    }

    public C7536m0(C7435h2 h2Var, C7413g2<VideoData> g2Var, VideoData videoData, C7452i1 i1Var) {
        this.f18956a = g2Var;
        this.f18959d = h2Var;
        this.f18960e = i1Var;
        this.f18957b = videoData;
        String str = (String) videoData.getData();
        this.f18962g = Uri.parse(str == null ? videoData.getUrl() : str);
        this.f18970o = g2Var.isAutoPlay();
        this.f18973r = g2Var.isAutoMute();
        this.f18961f = C7336b9.m18814a(g2Var.getStatHolder());
        this.f18963h = i1Var.mo50357a(g2Var);
        this.f18958c = new C7538b();
    }

    /* renamed from: A */
    public void mo50817A() {
        MediaAdView mediaAdView;
        mo50837u();
        this.f18961f.mo49775a((View) null);
        this.f18963h.mo51601a((Context) null);
        mo50834r();
        WeakReference<MediaAdView> weakReference = this.f18965j;
        if (weakReference != null && (mediaAdView = (MediaAdView) weakReference.get()) != null && (mediaAdView.getChildAt(1) instanceof C7757y5)) {
            mediaAdView.removeViewAt(1);
        }
    }

    /* renamed from: a */
    public void mo50818a() {
        WeakReference<C7651s5> weakReference = this.f18966k;
        C7651s5 s5Var = weakReference == null ? null : (C7651s5) weakReference.get();
        if (s5Var != null && s5Var.isShowing()) {
            s5Var.dismiss();
        }
    }

    /* renamed from: a */
    public void mo49870a(float f) {
        C7546m6 m6Var;
        WeakReference<C7546m6> weakReference = this.f18967l;
        if (weakReference != null && (m6Var = (C7546m6) weakReference.get()) != null) {
            m6Var.mo50874a(f <= 0.0f);
        }
    }

    /* renamed from: a */
    public void mo49871a(float f, float f2) {
        C7353c9 c9Var;
        C7353c9 c9Var2;
        C7546m6 m6Var;
        mo49878o();
        this.f18961f.mo49774a(f, f2);
        this.f18963h.mo51600a(f, f2);
        if (!this.f18972q) {
            C7539c cVar = this.f18974s;
            if (cVar != null) {
                cVar.mo50118f();
            }
            this.f18972q = true;
        }
        float duration = this.f18956a.getDuration();
        WeakReference<C7546m6> weakReference = this.f18967l;
        if (!(weakReference == null || (m6Var = (C7546m6) weakReference.get()) == null)) {
            m6Var.mo50872a(f, duration);
        }
        if (f <= duration) {
            if (f > 0.0f && (c9Var2 = this.f18975t) != null) {
                this.f18977v = c9Var2.mo49867n();
            }
            if (f == duration && (c9Var = this.f18975t) != null) {
                if (this.f18979x) {
                    c9Var.mo49861h();
                    return;
                }
                mo49876j();
                this.f18969n = 3;
                this.f18970o = false;
                this.f18975t.mo49858e();
                C7539c cVar2 = this.f18974s;
                if (cVar2 != null) {
                    cVar2.mo50117e();
                }
                this.f18963h.mo51609c();
                return;
            }
            return;
        }
        mo49871a(duration, duration);
    }

    /* renamed from: a */
    public final void mo50819a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f18958c);
        }
    }

    /* renamed from: a */
    public void mo50820a(View.OnClickListener onClickListener) {
        this.f18964i = onClickListener;
    }

    /* renamed from: a */
    public void mo50821a(View view) {
        if (this.f18969n == 1) {
            C7353c9 c9Var = this.f18975t;
            if (c9Var != null) {
                c9Var.mo49854b();
            }
            mo49873f();
        }
        View.OnClickListener onClickListener = this.f18964i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: a */
    public void mo50822a(C7539c cVar) {
        this.f18974s = cVar;
    }

    /* renamed from: a */
    public void mo50823a(MediaAdView mediaAdView, Context context) {
        C7757y5 y5Var;
        WeakReference<Context> weakReference;
        C7374e0.m18989a("register video ad with view " + mediaAdView);
        if (!this.f18971p) {
            WeakReference<MediaAdView> weakReference2 = this.f18965j;
            if (weakReference2 == null || weakReference2.get() != mediaAdView || (weakReference = this.f18968m) == null || weakReference.get() != context || !(mediaAdView.getChildAt(1) instanceof C7757y5)) {
                mo50817A();
                this.f18963h.mo51601a(context);
                this.f18965j = new WeakReference<>(mediaAdView);
                this.f18968m = new WeakReference<>(context);
                C7757y5 y5Var2 = new C7757y5(mediaAdView.getContext().getApplicationContext());
                mediaAdView.addView(y5Var2, 1);
                y5Var = y5Var2;
            } else {
                y5Var = (C7757y5) mediaAdView.getChildAt(1);
            }
            y5Var.setAdVideoViewListener(this);
            this.f18961f.mo49775a((View) y5Var);
            if (this.f18970o) {
                mo49874g();
            } else {
                mo49876j();
            }
        }
    }

    /* renamed from: a */
    public void mo50263a(C7651s5 s5Var, FrameLayout frameLayout) {
        mo50824a(s5Var, frameLayout, new C7546m6(frameLayout.getContext()));
    }

    /* renamed from: a */
    public final void mo50824a(C7651s5 s5Var, FrameLayout frameLayout, C7546m6 m6Var) {
        this.f18969n = 4;
        this.f18966k = new WeakReference<>(s5Var);
        m6Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(m6Var);
        this.f18967l = new WeakReference<>(m6Var);
        m6Var.mo50873a(this.f18959d, this.f18957b);
        m6Var.setVideoDialogViewListener(this);
        m6Var.mo50874a(this.f18973r);
        this.f18963h.mo51605a(true);
        mo50825a(m6Var.getAdVideoView(), this.f18973r);
    }

    /* renamed from: a */
    public final void mo50825a(C7757y5 y5Var, boolean z) {
        if (this.f18975t == null) {
            C7353c9 a = this.f18960e.mo50356a();
            this.f18975t = a;
            a.mo49852a((C7353c9.C7354a) this);
        }
        if (z) {
            mo50839w();
        } else {
            mo50842z();
        }
        this.f18975t.mo49853a(y5Var);
        y5Var.mo51888a(this.f18957b.getWidth(), this.f18957b.getHeight());
        if (!this.f18975t.mo49855c()) {
            this.f18975t.mo49850a(this.f18962g, y5Var.getContext());
            long j = this.f18977v;
            if (j > 0) {
                this.f18975t.mo49849a(j);
                return;
            }
            return;
        }
        mo49878o();
    }

    /* renamed from: a */
    public void mo49872a(String str) {
        this.f18963h.mo51612f();
        VideoData mediaData = this.f18956a.getMediaData();
        if (mediaData == null || !this.f18962g.toString().equals(mediaData.getData())) {
            C7539c cVar = this.f18974s;
            if (cVar != null) {
                cVar.mo50115c();
                return;
            }
            return;
        }
        C7374e0.m18989a("Try to play video stream from URL");
        this.f18962g = Uri.parse(mediaData.getUrl());
        WeakReference<Context> weakReference = this.f18968m;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        C7353c9 c9Var = this.f18975t;
        if (c9Var != null && context != null) {
            c9Var.mo49850a(this.f18962g, context);
        }
    }

    /* renamed from: a */
    public void mo50826a(boolean z) {
        this.f18979x = z;
    }

    /* renamed from: b */
    public final void mo50827b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f18958c, 3, 2);
        }
    }

    /* renamed from: b */
    public void mo50828b(View view) {
        WeakReference<Context> weakReference = this.f18968m;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context == null) {
            context = view.getContext();
        }
        mo50827b(context);
        if (!this.f18978w) {
            if (this.f18969n == 1) {
                this.f18969n = 4;
            }
            this.f18971p = true;
            try {
                C7651s5.m20348a(this, context).show();
            } catch (Throwable th) {
                th.printStackTrace();
                C7374e0.m18990b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
                mo50267q();
            }
        }
    }

    /* renamed from: b */
    public void mo50265b(boolean z) {
        C7353c9 c9Var = this.f18975t;
        if (c9Var != null && !z) {
            this.f18977v = c9Var.mo49867n();
            mo50834r();
            mo49873f();
        }
    }

    /* renamed from: c */
    public void mo50829c(boolean z) {
        this.f18978w = z;
    }

    /* renamed from: d */
    public void mo50830d() {
        C7353c9 c9Var = this.f18975t;
        if (c9Var == null) {
            this.f18973r = !this.f18973r;
        } else if (c9Var.mo49862i()) {
            this.f18975t.mo49863j();
            this.f18963h.mo51608b(true);
            this.f18973r = false;
        } else {
            this.f18975t.mo49868o();
            this.f18963h.mo51608b(false);
            this.f18973r = true;
        }
    }

    /* renamed from: e */
    public void mo50831e() {
        C7546m6 m6Var;
        mo50841y();
        WeakReference<C7546m6> weakReference = this.f18967l;
        if (!(weakReference == null || (m6Var = (C7546m6) weakReference.get()) == null)) {
            m6Var.mo50880g();
        }
        C7539c cVar = this.f18974s;
        if (cVar != null) {
            cVar.mo50118f();
        }
    }

    /* renamed from: f */
    public void mo49873f() {
        Context context;
        MediaAdView t = mo50836t();
        if (t != null) {
            context = t.getContext();
            if (!this.f18978w) {
                t.getPlayButtonView().setVisibility(0);
            }
            t.getProgressBarView().setVisibility(8);
        } else {
            context = null;
        }
        mo50840x();
        if (t != null) {
            mo50819a(context);
        }
        C7539c cVar = this.f18974s;
        if (cVar != null) {
            cVar.mo50116d();
        }
    }

    /* renamed from: g */
    public void mo49874g() {
        WeakReference<C7546m6> weakReference;
        C7546m6 m6Var;
        this.f18969n = 4;
        MediaAdView t = mo50836t();
        if (t != null) {
            if (!this.f18978w) {
                t.getProgressBarView().setVisibility(0);
            }
            t.getPlayButtonView().setVisibility(8);
        }
        if (this.f18971p && (weakReference = this.f18967l) != null && (m6Var = (C7546m6) weakReference.get()) != null) {
            m6Var.mo50877d();
        }
    }

    /* renamed from: h */
    public void mo49875h() {
    }

    /* renamed from: i */
    public void mo50832i() {
        if (this.f18969n == 1) {
            mo50840x();
            this.f18969n = 2;
            C7539c cVar = this.f18974s;
            if (cVar != null) {
                cVar.mo50116d();
            }
            WeakReference<C7651s5> weakReference = this.f18966k;
            if (weakReference != null && ((C7651s5) weakReference.get()) != null) {
                this.f18963h.mo51611e();
            }
        }
    }

    /* renamed from: j */
    public void mo49876j() {
        Context context;
        WeakReference<C7546m6> weakReference;
        C7546m6 m6Var;
        this.f18972q = false;
        this.f18977v = 0;
        MediaAdView t = mo50836t();
        if (t != null) {
            ImageView imageView = t.getImageView();
            ImageData image = this.f18956a.getImage();
            if (image != null) {
                imageView.setImageBitmap(image.getBitmap());
            }
            imageView.setVisibility(0);
            if (!this.f18978w) {
                t.getPlayButtonView().setVisibility(0);
            }
            t.getProgressBarView().setVisibility(8);
            context = t.getContext();
        } else {
            context = null;
        }
        if (!(!this.f18971p || (weakReference = this.f18967l) == null || (m6Var = (C7546m6) weakReference.get()) == null)) {
            m6Var.mo50883h();
            context = m6Var.getContext();
        }
        if (context != null) {
            mo50819a(context);
        }
    }

    /* renamed from: k */
    public void mo50833k() {
        C7651s5 s5Var;
        WeakReference<C7651s5> weakReference = this.f18966k;
        if (!(weakReference == null || (s5Var = (C7651s5) weakReference.get()) == null)) {
            s5Var.getContext();
            mo50841y();
            this.f18963h.mo51614h();
        }
        C7539c cVar = this.f18974s;
        if (cVar != null) {
            cVar.mo50118f();
        }
    }

    /* renamed from: l */
    public void mo49877l() {
        this.f18963h.mo51613g();
        C7539c cVar = this.f18974s;
        if (cVar != null) {
            cVar.mo50115c();
        }
    }

    /* renamed from: o */
    public void mo49878o() {
        WeakReference<C7546m6> weakReference;
        C7546m6 m6Var;
        if (this.f18969n != 1) {
            this.f18969n = 1;
            MediaAdView t = mo50836t();
            if (t != null) {
                t.getProgressBarView().setVisibility(8);
                t.getPlayButtonView().setVisibility(8);
            }
            if (this.f18971p && (weakReference = this.f18967l) != null && (m6Var = (C7546m6) weakReference.get()) != null) {
                if (this.f18975t != null) {
                    C7757y5 adVideoView = m6Var.getAdVideoView();
                    adVideoView.mo51888a(this.f18957b.getWidth(), this.f18957b.getHeight());
                    this.f18975t.mo49853a(adVideoView);
                }
                m6Var.mo50879f();
            }
        }
    }

    public void onVideoCompleted() {
        MediaAdView t = mo50836t();
        if (t != null) {
            t.getProgressBarView().setVisibility(8);
            if (!this.f18978w) {
                t.getPlayButtonView().setVisibility(0);
            }
        }
        this.f18977v = 0;
    }

    /* renamed from: p */
    public void mo50016p() {
        C7374e0.m18989a("Native Ad Views without hardware acceleration is not currently supported");
        C7539c cVar = this.f18974s;
        if (cVar != null) {
            cVar.mo50115c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if ((r2 instanceof com.p243my.target.C7757y5) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if ((r2 instanceof com.p243my.target.C7757y5) != false) goto L_0x0058;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50267q() {
        /*
            r7 = this;
            java.lang.String r0 = "Dismiss dialog"
            com.p243my.target.C7374e0.m18989a(r0)
            r0 = 0
            r7.f18966k = r0
            r1 = 0
            r7.f18971p = r1
            r7.mo50839w()
            com.my.target.nativeads.views.MediaAdView r2 = r7.mo50836t()
            if (r2 != 0) goto L_0x0015
            return
        L_0x0015:
            android.content.Context r3 = r2.getContext()
            r7.mo50819a((android.content.Context) r3)
            int r3 = r7.f18969n
            r4 = 4
            r5 = 1
            if (r3 == r5) goto L_0x0041
            r6 = 2
            if (r3 == r6) goto L_0x003b
            r6 = 3
            if (r3 == r6) goto L_0x003b
            if (r3 == r4) goto L_0x002d
            r7.f18970o = r1
            goto L_0x005d
        L_0x002d:
            r7.f18970o = r5
            r7.mo49874g()
            android.view.View r2 = r2.getChildAt(r5)
            boolean r3 = r2 instanceof com.p243my.target.C7757y5
            if (r3 == 0) goto L_0x005d
            goto L_0x0058
        L_0x003b:
            r7.f18970o = r1
            r7.mo49876j()
            goto L_0x005d
        L_0x0041:
            r7.f18969n = r4
            r7.mo49878o()
            com.my.target.g2<com.my.target.common.models.VideoData> r3 = r7.f18956a
            boolean r3 = r3.isAutoPlay()
            if (r3 == 0) goto L_0x0050
            r7.f18970o = r5
        L_0x0050:
            android.view.View r2 = r2.getChildAt(r5)
            boolean r3 = r2 instanceof com.p243my.target.C7757y5
            if (r3 == 0) goto L_0x005d
        L_0x0058:
            com.my.target.y5 r2 = (com.p243my.target.C7757y5) r2
            r7.mo50825a((com.p243my.target.C7757y5) r2, (boolean) r5)
        L_0x005d:
            com.my.target.t8 r2 = r7.f18963h
            r2.mo51605a((boolean) r1)
            r7.f18967l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7536m0.mo50267q():void");
    }

    /* renamed from: r */
    public final void mo50834r() {
        C7353c9 c9Var = this.f18975t;
        if (c9Var != null) {
            c9Var.mo49852a((C7353c9.C7354a) null);
            this.f18975t.destroy();
            this.f18975t = null;
        }
    }

    /* renamed from: s */
    public final void mo50835s() {
        C7353c9 c9Var = this.f18975t;
        if (c9Var != null && !this.f18973r) {
            c9Var.mo49865l();
        }
    }

    /* renamed from: t */
    public final MediaAdView mo50836t() {
        WeakReference<MediaAdView> weakReference = this.f18965j;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    /* renamed from: u */
    public void mo50837u() {
        C7353c9 c9Var;
        if (this.f18976u && !this.f18971p) {
            this.f18976u = false;
            if (this.f18969n == 1 && (c9Var = this.f18975t) != null) {
                c9Var.mo49854b();
                this.f18969n = 2;
            }
            C7353c9 c9Var2 = this.f18975t;
            if (c9Var2 != null) {
                c9Var2.mo49852a((C7353c9.C7354a) null);
                this.f18975t.mo49853a((C7757y5) null);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50838v() {
        /*
            r6 = this;
            com.my.target.nativeads.views.MediaAdView r0 = r6.mo50836t()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "Trying to play video in unregistered view"
            com.p243my.target.C7374e0.m18989a(r0)
            r6.mo50834r()
            return
        L_0x000f:
            int r1 = r0.getWindowVisibility()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0035
            int r0 = r6.f18969n
            if (r0 != r3) goto L_0x0031
            com.my.target.c9 r0 = r6.f18975t
            if (r0 == 0) goto L_0x0025
            long r0 = r0.mo49867n()
            r6.f18977v = r0
        L_0x0025:
            r6.mo50834r()
            r0 = 4
            r6.f18969n = r0
            r6.f18976u = r2
            r6.mo49874g()
            goto L_0x0034
        L_0x0031:
            r6.mo50834r()
        L_0x0034:
            return
        L_0x0035:
            boolean r1 = r6.f18976u
            if (r1 == 0) goto L_0x003a
            return
        L_0x003a:
            java.lang.ref.WeakReference<android.content.Context> r1 = r6.f18968m
            r4 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            goto L_0x0047
        L_0x0046:
            r1 = r4
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r6.mo50823a((com.p243my.target.nativeads.views.MediaAdView) r0, (android.content.Context) r1)
        L_0x004c:
            r6.f18976u = r3
            android.view.View r1 = r0.getChildAt(r3)
            boolean r1 = r1 instanceof com.p243my.target.C7757y5
            if (r1 == 0) goto L_0x005d
            android.view.View r1 = r0.getChildAt(r3)
            r4 = r1
            com.my.target.y5 r4 = (com.p243my.target.C7757y5) r4
        L_0x005d:
            if (r4 != 0) goto L_0x0063
            r6.mo50834r()
            return
        L_0x0063:
            com.my.target.c9 r1 = r6.f18975t
            if (r1 == 0) goto L_0x0076
            android.net.Uri r5 = r6.f18962g
            android.net.Uri r1 = r1.mo49864k()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0076
            r6.mo50834r()
        L_0x0076:
            boolean r1 = r6.f18970o
            if (r1 != 0) goto L_0x008e
            boolean r1 = r6.f18978w
            if (r1 != 0) goto L_0x0085
            android.view.View r1 = r0.getPlayButtonView()
            r1.setVisibility(r2)
        L_0x0085:
            android.widget.ProgressBar r0 = r0.getProgressBarView()
            r1 = 8
            r0.setVisibility(r1)
        L_0x008e:
            boolean r0 = r6.f18970o
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r6.f18971p
            if (r0 != 0) goto L_0x00c5
            com.my.target.c9 r0 = r6.f18975t
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r0.mo49859f()
            if (r0 == 0) goto L_0x00bf
            com.my.target.c9 r0 = r6.f18975t
            r0.mo49853a((com.p243my.target.C7757y5) r4)
            com.my.target.common.models.VideoData r0 = r6.f18957b
            int r0 = r0.getWidth()
            com.my.target.common.models.VideoData r1 = r6.f18957b
            int r1 = r1.getHeight()
            r4.mo51888a(r0, r1)
            com.my.target.c9 r0 = r6.f18975t
            r0.mo49852a((com.p243my.target.C7353c9.C7354a) r6)
            com.my.target.c9 r0 = r6.f18975t
            r0.mo49848a()
            goto L_0x00c2
        L_0x00bf:
            r6.mo50825a((com.p243my.target.C7757y5) r4, (boolean) r3)
        L_0x00c2:
            r6.mo50839w()
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7536m0.mo50838v():void");
    }

    /* renamed from: w */
    public final void mo50839w() {
        C7353c9 c9Var = this.f18975t;
        if (c9Var != null) {
            c9Var.mo49868o();
        }
    }

    /* renamed from: x */
    public final void mo50840x() {
        WeakReference<C7546m6> weakReference;
        if (this.f18971p && (weakReference = this.f18967l) != null) {
            this.f18969n = 2;
            C7546m6 m6Var = (C7546m6) weakReference.get();
            if (m6Var != null) {
                C7353c9 c9Var = this.f18975t;
                if (c9Var != null) {
                    c9Var.mo49854b();
                }
                m6Var.mo50878e();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50841y() {
        /*
            r4 = this;
            com.my.target.c9 r0 = r4.f18975t
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.mo49859f()
            if (r0 == 0) goto L_0x005d
            com.my.target.nativeads.views.MediaAdView r0 = r4.mo50836t()
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "Trying to play video in unregistered view"
            com.p243my.target.C7374e0.m18989a(r0)
            r4.mo50834r()
            return
        L_0x0019:
            r1 = 0
            boolean r2 = r4.f18971p
            if (r2 == 0) goto L_0x002d
            java.lang.ref.WeakReference<com.my.target.m6> r2 = r4.f18967l
            if (r2 == 0) goto L_0x002d
            java.lang.Object r0 = r2.get()
            com.my.target.m6 r0 = (com.p243my.target.C7546m6) r0
            com.my.target.y5 r1 = r0.getAdVideoView()
            goto L_0x003d
        L_0x002d:
            r2 = 1
            android.view.View r3 = r0.getChildAt(r2)
            boolean r3 = r3 instanceof com.p243my.target.C7757y5
            if (r3 == 0) goto L_0x003d
            android.view.View r0 = r0.getChildAt(r2)
            r1 = r0
            com.my.target.y5 r1 = (com.p243my.target.C7757y5) r1
        L_0x003d:
            if (r1 != 0) goto L_0x0043
            r4.mo50834r()
            return
        L_0x0043:
            com.my.target.common.models.VideoData r0 = r4.f18957b
            int r0 = r0.getWidth()
            com.my.target.common.models.VideoData r2 = r4.f18957b
            int r2 = r2.getHeight()
            r1.mo51888a(r0, r2)
            com.my.target.c9 r0 = r4.f18975t
            r0.mo49853a((com.p243my.target.C7757y5) r1)
            com.my.target.c9 r0 = r4.f18975t
            r0.mo49848a()
            goto L_0x0074
        L_0x005d:
            boolean r0 = r4.f18971p
            if (r0 == 0) goto L_0x0074
            java.lang.ref.WeakReference<com.my.target.m6> r0 = r4.f18967l
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r0.get()
            com.my.target.m6 r0 = (com.p243my.target.C7546m6) r0
            com.my.target.y5 r0 = r0.getAdVideoView()
            boolean r1 = r4.f18973r
            r4.mo50825a((com.p243my.target.C7757y5) r0, (boolean) r1)
        L_0x0074:
            r4.mo49874g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7536m0.mo50841y():void");
    }

    /* renamed from: z */
    public final void mo50842z() {
        C7353c9 c9Var = this.f18975t;
        if (c9Var != null) {
            c9Var.mo49863j();
        }
    }
}
