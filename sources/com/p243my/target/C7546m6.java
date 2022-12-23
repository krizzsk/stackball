package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.common.views.StarsRatingView;
import com.p243my.target.nativeads.views.MediaAdView;

/* renamed from: com.my.target.m6 */
public class C7546m6 extends ViewGroup {

    /* renamed from: a */
    public static final int f19001a = C7761y8.m20948c();

    /* renamed from: b */
    public static final int f19002b = C7761y8.m20948c();

    /* renamed from: c */
    public static final int f19003c = C7761y8.m20948c();

    /* renamed from: d */
    public static final int f19004d = C7761y8.m20948c();

    /* renamed from: e */
    public static final int f19005e = C7761y8.m20948c();

    /* renamed from: f */
    public static final int f19006f = C7761y8.m20948c();

    /* renamed from: g */
    public static final int f19007g = C7761y8.m20948c();

    /* renamed from: h */
    public static final int f19008h = C7761y8.m20948c();

    /* renamed from: i */
    public static final int f19009i = C7761y8.m20948c();

    /* renamed from: j */
    public static final int f19010j = C7761y8.m20948c();

    /* renamed from: k */
    public static final int f19011k = C7761y8.m20948c();

    /* renamed from: l */
    public static final int f19012l = C7761y8.m20948c();

    /* renamed from: m */
    public static final int f19013m = C7761y8.m20948c();

    /* renamed from: A */
    public final C7381e6 f19014A;

    /* renamed from: B */
    public final C7381e6 f19015B;

    /* renamed from: C */
    public final C7381e6 f19016C;

    /* renamed from: D */
    public final Runnable f19017D = new C7549c();

    /* renamed from: E */
    public final C7550d f19018E = new C7550d();

    /* renamed from: F */
    public final View.OnClickListener f19019F = new C7548b();

    /* renamed from: G */
    public final int f19020G;

    /* renamed from: H */
    public final Bitmap f19021H;

    /* renamed from: I */
    public final Bitmap f19022I;

    /* renamed from: J */
    public int f19023J;

    /* renamed from: K */
    public final int f19024K;

    /* renamed from: L */
    public boolean f19025L;

    /* renamed from: M */
    public C7551e f19026M;

    /* renamed from: n */
    public final TextView f19027n;

    /* renamed from: o */
    public final StarsRatingView f19028o;

    /* renamed from: p */
    public final Button f19029p;

    /* renamed from: q */
    public final Button f19030q;

    /* renamed from: r */
    public final C7761y8 f19031r;

    /* renamed from: s */
    public final LinearLayout f19032s;

    /* renamed from: t */
    public final TextView f19033t;

    /* renamed from: u */
    public final FrameLayout f19034u;

    /* renamed from: v */
    public final MediaAdView f19035v;

    /* renamed from: w */
    public final TextView f19036w;

    /* renamed from: x */
    public final C7588o6 f19037x;

    /* renamed from: y */
    public final C7422g6 f19038y;

    /* renamed from: z */
    public final C7757y5 f19039z;

    /* renamed from: com.my.target.m6$b */
    public class C7548b implements View.OnClickListener {
        public C7548b() {
        }

        public void onClick(View view) {
            if (C7546m6.this.f19026M != null) {
                int id = view.getId();
                if (id == C7546m6.f19002b) {
                    C7546m6.this.f19026M.mo50821a(view);
                } else if (id == C7546m6.f19003c) {
                    C7546m6.this.f19026M.mo50831e();
                } else if (id == C7546m6.f19005e) {
                    C7546m6.this.f19026M.mo50832i();
                } else if (id == C7546m6.f19004d) {
                    C7546m6.this.f19026M.mo50833k();
                } else if (id == C7546m6.f19001a) {
                    C7546m6.this.f19026M.mo50818a();
                } else if (id == C7546m6.f19010j) {
                    C7546m6.this.f19026M.mo50830d();
                }
            }
        }
    }

    /* renamed from: com.my.target.m6$c */
    public class C7549c implements Runnable {
        public C7549c() {
        }

        public void run() {
            if (C7546m6.this.f19023J == 2) {
                C7546m6.this.mo50871a();
            }
        }
    }

    /* renamed from: com.my.target.m6$d */
    public class C7550d implements View.OnClickListener {
        public C7550d() {
        }

        public void onClick(View view) {
            C7546m6 m6Var = C7546m6.this;
            m6Var.removeCallbacks(m6Var.f19017D);
            if (C7546m6.this.f19023J == 2) {
                C7546m6.this.mo50871a();
                return;
            }
            if (C7546m6.this.f19023J == 0) {
                C7546m6.this.mo50876c();
            }
            C7546m6 m6Var2 = C7546m6.this;
            m6Var2.postDelayed(m6Var2.f19017D, 4000);
        }
    }

    /* renamed from: com.my.target.m6$e */
    public interface C7551e {
        /* renamed from: a */
        void mo50818a();

        /* renamed from: a */
        void mo50821a(View view);

        /* renamed from: d */
        void mo50830d();

        /* renamed from: e */
        void mo50831e();

        /* renamed from: i */
        void mo50832i();

        /* renamed from: k */
        void mo50833k();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7546m6(Context context) {
        super(context);
        Context context2 = context;
        Button button = new Button(context2);
        this.f19030q = button;
        TextView textView = new TextView(context2);
        this.f19027n = textView;
        StarsRatingView starsRatingView = new StarsRatingView(context2);
        this.f19028o = starsRatingView;
        Button button2 = new Button(context2);
        this.f19029p = button2;
        TextView textView2 = new TextView(context2);
        this.f19033t = textView2;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f19034u = frameLayout;
        C7381e6 e6Var = new C7381e6(context2);
        this.f19014A = e6Var;
        C7381e6 e6Var2 = new C7381e6(context2);
        this.f19015B = e6Var2;
        C7381e6 e6Var3 = new C7381e6(context2);
        this.f19016C = e6Var3;
        TextView textView3 = new TextView(context2);
        this.f19036w = textView3;
        MediaAdView mediaAdView = new MediaAdView(context2);
        this.f19035v = mediaAdView;
        C7588o6 o6Var = new C7588o6(context2);
        this.f19037x = o6Var;
        C7422g6 g6Var = new C7422g6(context2);
        this.f19038y = g6Var;
        this.f19032s = new LinearLayout(context2);
        C7761y8 c = C7761y8.m20950c(context);
        this.f19031r = c;
        this.f19039z = new C7757y5(context2);
        this.f19021H = C7635r5.m20252c(c.mo51902b(28));
        this.f19022I = C7635r5.m20250b(c.mo51902b(28));
        C7761y8.m20947b(button, "dismiss_button");
        C7761y8.m20947b(textView, "title_text");
        C7761y8.m20947b(starsRatingView, "stars_view");
        C7761y8.m20947b(button2, "cta_button");
        C7761y8.m20947b(textView2, "replay_text");
        C7761y8.m20947b(frameLayout, "shadow");
        C7761y8.m20947b(e6Var, "pause_button");
        C7761y8.m20947b(e6Var2, "play_button");
        C7761y8.m20947b(e6Var3, "replay_button");
        C7761y8.m20947b(textView3, "domain_text");
        C7761y8.m20947b(mediaAdView, "media_view");
        C7761y8.m20947b(o6Var, "video_progress_wheel");
        C7761y8.m20947b(g6Var, "sound_button");
        this.f19024K = c.mo51902b(28);
        this.f19020G = c.mo51902b(16);
        mo50875b();
    }

    /* renamed from: a */
    public final void mo50871a() {
        if (this.f19023J != 0) {
            this.f19023J = 0;
            this.f19035v.getImageView().setVisibility(8);
            this.f19035v.getProgressBarView().setVisibility(8);
            this.f19032s.setVisibility(8);
            this.f19015B.setVisibility(8);
            this.f19014A.setVisibility(8);
            this.f19034u.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo50872a(float f, float f2) {
        if (this.f19037x.getVisibility() != 0) {
            this.f19037x.setVisibility(0);
        }
        this.f19037x.setProgress(f / f2);
        this.f19037x.setDigit((int) Math.ceil((double) (f2 - f)));
    }

    /* renamed from: a */
    public void mo50873a(C7435h2 h2Var, VideoData videoData) {
        C7413g2<VideoData> videoBanner = h2Var.getVideoBanner();
        if (videoBanner != null) {
            this.f19037x.setMax(h2Var.getDuration());
            this.f19025L = videoBanner.isAllowReplay();
            this.f19029p.setText(h2Var.getCtaText());
            this.f19027n.setText(h2Var.getTitle());
            if ("store".equals(h2Var.getNavigationType())) {
                this.f19036w.setVisibility(8);
                if (h2Var.getVotes() == 0 || h2Var.getRating() <= 0.0f) {
                    this.f19028o.setVisibility(8);
                } else {
                    this.f19028o.setVisibility(0);
                    this.f19028o.setRating(h2Var.getRating());
                }
            } else {
                this.f19028o.setVisibility(8);
                this.f19036w.setVisibility(0);
                this.f19036w.setText(h2Var.getDomain());
            }
            this.f19030q.setText(videoBanner.getCloseActionText());
            this.f19033t.setText(videoBanner.getReplayActionText());
            Bitmap c = C7635r5.m20251c();
            if (c != null) {
                this.f19016C.setImageBitmap(c);
            }
            this.f19035v.setPlaceHolderDimension(videoData.getWidth(), videoData.getHeight());
            ImageData image = h2Var.getImage();
            if (image != null) {
                this.f19035v.getImageView().setImageBitmap(image.getBitmap());
            }
        }
    }

    /* renamed from: a */
    public void mo50874a(boolean z) {
        C7422g6 g6Var;
        String str;
        if (z) {
            this.f19038y.mo50226a(this.f19022I, false);
            g6Var = this.f19038y;
            str = "sound off";
        } else {
            this.f19038y.mo50226a(this.f19021H, false);
            g6Var = this.f19038y;
            str = "sound on";
        }
        g6Var.setContentDescription(str);
    }

    /* renamed from: b */
    public final void mo50875b() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i = this.f19020G;
        this.f19038y.setId(f19010j);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f19035v.setId(f19013m);
        this.f19035v.setLayoutParams(layoutParams);
        this.f19035v.setId(f19009i);
        this.f19035v.setOnClickListener(this.f19018E);
        this.f19035v.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f19034u.setBackgroundColor(-1728053248);
        this.f19034u.setVisibility(8);
        this.f19030q.setId(f19001a);
        this.f19030q.setTextSize(2, 16.0f);
        this.f19030q.setTransformationMethod((TransformationMethod) null);
        this.f19030q.setEllipsize(TextUtils.TruncateAt.END);
        this.f19030q.setMaxLines(2);
        this.f19030q.setPadding(i, i, i, i);
        this.f19030q.setTextColor(-1);
        C7761y8.m20939a(this.f19030q, -2013265920, -1, -1, this.f19031r.mo51902b(1), this.f19031r.mo51902b(4));
        this.f19027n.setId(f19007g);
        this.f19027n.setMaxLines(2);
        this.f19027n.setEllipsize(TextUtils.TruncateAt.END);
        this.f19027n.setTextSize(2, 18.0f);
        this.f19027n.setTextColor(-1);
        C7761y8.m20939a(this.f19029p, -2013265920, -1, -1, this.f19031r.mo51902b(1), this.f19031r.mo51902b(4));
        this.f19029p.setId(f19002b);
        this.f19029p.setTextColor(-1);
        this.f19029p.setTransformationMethod((TransformationMethod) null);
        this.f19029p.setGravity(1);
        this.f19029p.setTextSize(2, 16.0f);
        this.f19029p.setLines(1);
        this.f19029p.setEllipsize(TextUtils.TruncateAt.END);
        this.f19029p.setMinimumWidth(this.f19031r.mo51902b(100));
        this.f19029p.setPadding(i, i, i, i);
        this.f19027n.setShadowLayer((float) this.f19031r.mo51902b(1), (float) this.f19031r.mo51902b(1), (float) this.f19031r.mo51902b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f19036w.setId(f19008h);
        this.f19036w.setTextColor(-3355444);
        this.f19036w.setMaxEms(10);
        this.f19036w.setShadowLayer((float) this.f19031r.mo51902b(1), (float) this.f19031r.mo51902b(1), (float) this.f19031r.mo51902b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f19032s.setId(f19003c);
        this.f19032s.setOnClickListener(this.f19019F);
        this.f19032s.setGravity(17);
        this.f19032s.setVisibility(8);
        this.f19032s.setPadding(this.f19031r.mo51902b(8), 0, this.f19031r.mo51902b(8), 0);
        this.f19033t.setSingleLine();
        this.f19033t.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.f19033t;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f19033t.setTextColor(-1);
        this.f19033t.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = this.f19031r.mo51902b(4);
        this.f19016C.setPadding(this.f19031r.mo51902b(16), this.f19031r.mo51902b(16), this.f19031r.mo51902b(16), this.f19031r.mo51902b(16));
        this.f19014A.setId(f19005e);
        this.f19014A.setOnClickListener(this.f19019F);
        this.f19014A.setVisibility(8);
        this.f19014A.setPadding(this.f19031r.mo51902b(16), this.f19031r.mo51902b(16), this.f19031r.mo51902b(16), this.f19031r.mo51902b(16));
        this.f19015B.setId(f19004d);
        this.f19015B.setOnClickListener(this.f19019F);
        this.f19015B.setVisibility(8);
        this.f19015B.setPadding(this.f19031r.mo51902b(16), this.f19031r.mo51902b(16), this.f19031r.mo51902b(16), this.f19031r.mo51902b(16));
        this.f19034u.setId(f19011k);
        Bitmap b = C7635r5.m20249b();
        if (b != null) {
            this.f19015B.setImageBitmap(b);
        }
        Bitmap a = C7635r5.m20246a();
        if (a != null) {
            this.f19014A.setImageBitmap(a);
        }
        C7761y8.m20939a(this.f19014A, -2013265920, -1, -1, this.f19031r.mo51902b(1), this.f19031r.mo51902b(4));
        C7761y8.m20939a(this.f19015B, -2013265920, -1, -1, this.f19031r.mo51902b(1), this.f19031r.mo51902b(4));
        C7761y8.m20939a(this.f19016C, -2013265920, -1, -1, this.f19031r.mo51902b(1), this.f19031r.mo51902b(4));
        this.f19028o.setId(f19012l);
        this.f19028o.setStarSize(this.f19031r.mo51902b(12));
        this.f19037x.setId(f19006f);
        this.f19037x.setVisibility(8);
        this.f19035v.addView(this.f19039z, new ViewGroup.LayoutParams(-1, -1));
        addView(this.f19035v);
        addView(this.f19034u);
        addView(this.f19038y);
        addView(this.f19030q);
        addView(this.f19037x);
        addView(this.f19032s);
        addView(this.f19014A);
        addView(this.f19015B);
        addView(this.f19028o);
        addView(this.f19036w);
        addView(this.f19029p);
        addView(this.f19027n);
        this.f19032s.addView(this.f19016C);
        this.f19032s.addView(this.f19033t, layoutParams2);
        this.f19029p.setOnClickListener(this.f19019F);
        this.f19030q.setOnClickListener(this.f19019F);
        this.f19038y.setOnClickListener(this.f19019F);
    }

    /* renamed from: c */
    public final void mo50876c() {
        if (this.f19023J != 2) {
            this.f19023J = 2;
            this.f19035v.getImageView().setVisibility(8);
            this.f19035v.getProgressBarView().setVisibility(8);
            this.f19032s.setVisibility(8);
            this.f19015B.setVisibility(8);
            this.f19014A.setVisibility(0);
            this.f19034u.setVisibility(8);
        }
    }

    /* renamed from: d */
    public void mo50877d() {
        if (this.f19023J != 3) {
            this.f19023J = 3;
            this.f19035v.getProgressBarView().setVisibility(0);
            this.f19032s.setVisibility(8);
            this.f19015B.setVisibility(8);
            this.f19014A.setVisibility(8);
            this.f19034u.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void mo50878e() {
        if (this.f19023J != 1) {
            this.f19023J = 1;
            this.f19035v.getImageView().setVisibility(0);
            this.f19035v.getProgressBarView().setVisibility(8);
            this.f19032s.setVisibility(8);
            this.f19015B.setVisibility(0);
            this.f19014A.setVisibility(8);
            this.f19034u.setVisibility(0);
        }
    }

    /* renamed from: f */
    public void mo50879f() {
        int i = this.f19023J;
        if (i != 0 && i != 2) {
            this.f19023J = 0;
            this.f19035v.getImageView().setVisibility(8);
            this.f19035v.getProgressBarView().setVisibility(8);
            this.f19032s.setVisibility(8);
            this.f19015B.setVisibility(8);
            if (this.f19023J != 2) {
                this.f19014A.setVisibility(8);
            }
        }
    }

    /* renamed from: g */
    public void mo50880g() {
        this.f19035v.getImageView().setVisibility(0);
    }

    public C7757y5 getAdVideoView() {
        return this.f19039z;
    }

    public MediaAdView getMediaAdView() {
        return this.f19035v;
    }

    /* renamed from: h */
    public void mo50883h() {
        if (this.f19023J != 4) {
            this.f19023J = 4;
            this.f19035v.getImageView().setVisibility(0);
            this.f19035v.getProgressBarView().setVisibility(8);
            if (this.f19025L) {
                this.f19032s.setVisibility(0);
                this.f19034u.setVisibility(0);
            }
            this.f19015B.setVisibility(8);
            this.f19014A.setVisibility(8);
            this.f19037x.setVisibility(8);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.f19035v.getMeasuredWidth();
        int measuredHeight = this.f19035v.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.f19035v.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.f19034u.layout(this.f19035v.getLeft(), this.f19035v.getTop(), this.f19035v.getRight(), this.f19035v.getBottom());
        int measuredWidth2 = this.f19015B.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.f19015B.getMeasuredHeight() >> 1;
        this.f19015B.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.f19014A.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.f19014A.getMeasuredHeight() >> 1;
        this.f19014A.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.f19032s.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f19032s.getMeasuredHeight() >> 1;
        this.f19032s.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        Button button = this.f19030q;
        int i14 = this.f19020G;
        button.layout(i14, i14, button.getMeasuredWidth() + i14, this.f19020G + this.f19030q.getMeasuredHeight());
        if (i5 > i6) {
            int max = Math.max(this.f19029p.getMeasuredHeight(), Math.max(this.f19027n.getMeasuredHeight(), this.f19028o.getMeasuredHeight()));
            Button button2 = this.f19029p;
            int measuredWidth5 = (i5 - this.f19020G) - button2.getMeasuredWidth();
            int measuredHeight5 = ((i6 - this.f19020G) - this.f19029p.getMeasuredHeight()) - ((max - this.f19029p.getMeasuredHeight()) >> 1);
            int i15 = this.f19020G;
            button2.layout(measuredWidth5, measuredHeight5, i5 - i15, (i6 - i15) - ((max - this.f19029p.getMeasuredHeight()) >> 1));
            this.f19038y.layout((this.f19029p.getRight() - this.f19038y.getMeasuredWidth()) + this.f19038y.getPadding(), (((this.f19035v.getBottom() - (this.f19020G << 1)) - this.f19038y.getMeasuredHeight()) - max) + this.f19038y.getPadding(), this.f19029p.getRight() + this.f19038y.getPadding(), ((this.f19035v.getBottom() - (this.f19020G << 1)) - max) + this.f19038y.getPadding());
            StarsRatingView starsRatingView = this.f19028o;
            int left = (this.f19029p.getLeft() - this.f19020G) - this.f19028o.getMeasuredWidth();
            int measuredHeight6 = ((i6 - this.f19020G) - this.f19028o.getMeasuredHeight()) - ((max - this.f19028o.getMeasuredHeight()) >> 1);
            int left2 = this.f19029p.getLeft();
            int i16 = this.f19020G;
            starsRatingView.layout(left, measuredHeight6, left2 - i16, (i6 - i16) - ((max - this.f19028o.getMeasuredHeight()) >> 1));
            TextView textView = this.f19036w;
            int left3 = (this.f19029p.getLeft() - this.f19020G) - this.f19036w.getMeasuredWidth();
            int measuredHeight7 = ((i6 - this.f19020G) - this.f19036w.getMeasuredHeight()) - ((max - this.f19036w.getMeasuredHeight()) >> 1);
            int left4 = this.f19029p.getLeft();
            int i17 = this.f19020G;
            textView.layout(left3, measuredHeight7, left4 - i17, (i6 - i17) - ((max - this.f19036w.getMeasuredHeight()) >> 1));
            int min = Math.min(this.f19028o.getLeft(), this.f19036w.getLeft());
            TextView textView2 = this.f19027n;
            int measuredWidth6 = (min - this.f19020G) - textView2.getMeasuredWidth();
            int measuredHeight8 = ((i6 - this.f19020G) - this.f19027n.getMeasuredHeight()) - ((max - this.f19027n.getMeasuredHeight()) >> 1);
            int i18 = this.f19020G;
            textView2.layout(measuredWidth6, measuredHeight8, min - i18, (i6 - i18) - ((max - this.f19027n.getMeasuredHeight()) >> 1));
            C7588o6 o6Var = this.f19037x;
            int i19 = this.f19020G;
            o6Var.layout(i19, ((i6 - i19) - o6Var.getMeasuredHeight()) - ((max - this.f19037x.getMeasuredHeight()) >> 1), this.f19020G + this.f19037x.getMeasuredWidth(), (i6 - this.f19020G) - ((max - this.f19037x.getMeasuredHeight()) >> 1));
            return;
        }
        this.f19038y.layout(((this.f19035v.getRight() - this.f19020G) - this.f19038y.getMeasuredWidth()) + this.f19038y.getPadding(), ((this.f19035v.getBottom() - this.f19020G) - this.f19038y.getMeasuredHeight()) + this.f19038y.getPadding(), (this.f19035v.getRight() - this.f19020G) + this.f19038y.getPadding(), (this.f19035v.getBottom() - this.f19020G) + this.f19038y.getPadding());
        TextView textView3 = this.f19027n;
        int i20 = i5 >> 1;
        textView3.layout(i20 - (textView3.getMeasuredWidth() >> 1), this.f19035v.getBottom() + this.f19020G, (this.f19027n.getMeasuredWidth() >> 1) + i20, this.f19035v.getBottom() + this.f19020G + this.f19027n.getMeasuredHeight());
        StarsRatingView starsRatingView2 = this.f19028o;
        starsRatingView2.layout(i20 - (starsRatingView2.getMeasuredWidth() >> 1), this.f19027n.getBottom() + this.f19020G, (this.f19028o.getMeasuredWidth() >> 1) + i20, this.f19027n.getBottom() + this.f19020G + this.f19028o.getMeasuredHeight());
        TextView textView4 = this.f19036w;
        textView4.layout(i20 - (textView4.getMeasuredWidth() >> 1), this.f19027n.getBottom() + this.f19020G, (this.f19036w.getMeasuredWidth() >> 1) + i20, this.f19027n.getBottom() + this.f19020G + this.f19036w.getMeasuredHeight());
        Button button3 = this.f19029p;
        button3.layout(i20 - (button3.getMeasuredWidth() >> 1), this.f19028o.getBottom() + this.f19020G, i20 + (this.f19029p.getMeasuredWidth() >> 1), this.f19028o.getBottom() + this.f19020G + this.f19029p.getMeasuredHeight());
        this.f19037x.layout(this.f19020G, (this.f19035v.getBottom() - this.f19020G) - this.f19037x.getMeasuredHeight(), this.f19020G + this.f19037x.getMeasuredWidth(), this.f19035v.getBottom() - this.f19020G);
    }

    public void onMeasure(int i, int i2) {
        this.f19038y.measure(View.MeasureSpec.makeMeasureSpec(this.f19024K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f19024K, 1073741824));
        this.f19037x.measure(View.MeasureSpec.makeMeasureSpec(this.f19024K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f19024K, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f19035v.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.f19020G << 1;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.f19030q.measure(View.MeasureSpec.makeMeasureSpec(i4 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f19014A.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f19015B.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f19032s.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.f19020G * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f19028o.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f19034u.measure(View.MeasureSpec.makeMeasureSpec(this.f19035v.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f19035v.getMeasuredHeight(), 1073741824));
        this.f19029p.measure(View.MeasureSpec.makeMeasureSpec(i4 - (this.f19020G * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f19027n.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f19036w.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.f19029p.getMeasuredWidth();
            int measuredWidth2 = this.f19027n.getMeasuredWidth();
            if (this.f19037x.getMeasuredWidth() + measuredWidth2 + Math.max(this.f19028o.getMeasuredWidth(), this.f19036w.getMeasuredWidth()) + measuredWidth + (this.f19020G * 3) > i4) {
                int measuredWidth3 = (i4 - this.f19037x.getMeasuredWidth()) - (this.f19020G * 3);
                int i6 = measuredWidth3 / 3;
                this.f19029p.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f19028o.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f19036w.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f19027n.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.f19029p.getMeasuredWidth()) - this.f19036w.getMeasuredWidth()) - this.f19028o.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setVideoDialogViewListener(C7551e eVar) {
        this.f19026M = eVar;
    }
}
