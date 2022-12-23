package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p243my.target.C7353c9;
import com.p243my.target.C7757y5;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;

/* renamed from: com.my.target.d7 */
public class C7364d7 extends ViewGroup implements C7757y5.C7758a {

    /* renamed from: a */
    public final C7506k6 f18455a;

    /* renamed from: b */
    public final C7761y8 f18456b;

    /* renamed from: c */
    public final boolean f18457c;

    /* renamed from: d */
    public final C7422g6 f18458d;

    /* renamed from: e */
    public final C7367c f18459e;

    /* renamed from: f */
    public final C7757y5 f18460f;

    /* renamed from: g */
    public final FrameLayout f18461g;

    /* renamed from: h */
    public final ProgressBar f18462h;

    /* renamed from: i */
    public final boolean f18463i;

    /* renamed from: j */
    public C7353c9 f18464j;

    /* renamed from: k */
    public VideoData f18465k;

    /* renamed from: l */
    public C7366b f18466l;

    /* renamed from: m */
    public int f18467m;

    /* renamed from: n */
    public int f18468n;

    /* renamed from: o */
    public Bitmap f18469o;

    /* renamed from: p */
    public boolean f18470p = true;

    /* renamed from: com.my.target.d7$b */
    public interface C7366b extends AudioManager.OnAudioFocusChangeListener, C7353c9.C7354a {
        /* renamed from: b */
        void mo50018b();

        /* renamed from: c */
        void mo50019c();

        /* renamed from: m */
        void mo50020m();

        /* renamed from: n */
        void mo50021n();
    }

    /* renamed from: com.my.target.d7$c */
    public class C7367c implements View.OnClickListener {
        public C7367c() {
        }

        public void onClick(View view) {
            if (C7364d7.this.f18466l != null) {
                if (!C7364d7.this.mo50007d() && !C7364d7.this.mo50006c()) {
                    C7364d7.this.f18466l.mo50020m();
                } else if (!C7364d7.this.mo50006c()) {
                    C7364d7.this.f18466l.mo50019c();
                } else {
                    C7364d7.this.f18466l.mo50021n();
                }
            }
        }
    }

    public C7364d7(Context context, C7761y8 y8Var, boolean z, boolean z2) {
        super(context);
        this.f18456b = y8Var;
        this.f18457c = z;
        this.f18463i = z2;
        this.f18455a = new C7506k6(context);
        this.f18458d = new C7422g6(context);
        this.f18462h = new ProgressBar(context, (AttributeSet) null, 16842874);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18461g = frameLayout;
        C7761y8.m20936a((View) frameLayout, 0, 868608760);
        C7757y5 y5Var = new C7757y5(context);
        this.f18460f = y5Var;
        y5Var.setAdVideoViewListener(this);
        this.f18459e = new C7367c();
    }

    /* renamed from: a */
    public void mo49997a() {
        C7353c9 c9Var = this.f18464j;
        if (c9Var != null) {
            c9Var.destroy();
        }
        this.f18464j = null;
    }

    /* renamed from: a */
    public void mo49998a(int i) {
        C7353c9 c9Var = this.f18464j;
        if (c9Var == null) {
            return;
        }
        if (i == 0) {
            c9Var.mo49868o();
        } else if (i != 1) {
            c9Var.mo49863j();
        } else {
            c9Var.mo49865l();
        }
    }

    /* renamed from: a */
    public final void mo49999a(C7399f2 f2Var) {
        this.f18461g.setVisibility(0);
        setOnClickListener((View.OnClickListener) null);
        this.f18458d.setVisibility(8);
        this.f18462h.setVisibility(8);
        this.f18460f.setVisibility(8);
        this.f18455a.setVisibility(0);
        ImageData image = f2Var.getImage();
        if (image != null && image.getData() != null) {
            this.f18468n = image.getWidth();
            int height = image.getHeight();
            this.f18467m = height;
            if (this.f18468n == 0 || height == 0) {
                this.f18468n = image.getData().getWidth();
                this.f18467m = image.getData().getHeight();
            }
            this.f18455a.setImageBitmap(image.getData());
            this.f18455a.setClickable(false);
        }
    }

    /* renamed from: a */
    public final void mo50000a(C7399f2 f2Var, int i) {
        int i2;
        C7761y8 y8Var;
        this.f18461g.setVisibility(8);
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            VideoData mediaData = videoBanner.getMediaData();
            this.f18465k = mediaData;
            if (mediaData != null) {
                this.f18464j = (!this.f18463i || !C7566n8.m19950a()) ? C7370d9.m18958p() : C7389e9.m19051a(getContext());
                this.f18464j.mo49852a((C7353c9.C7354a) this.f18466l);
                if (videoBanner.isAutoMute()) {
                    this.f18464j.setVolume(0.0f);
                }
                this.f18468n = this.f18465k.getWidth();
                this.f18467m = this.f18465k.getHeight();
                ImageData preview = videoBanner.getPreview();
                if (preview != null) {
                    this.f18469o = preview.getData();
                    if (this.f18468n <= 0 || this.f18467m <= 0) {
                        this.f18468n = preview.getWidth();
                        this.f18467m = preview.getHeight();
                    }
                    this.f18455a.setImageBitmap(this.f18469o);
                } else {
                    ImageData image = f2Var.getImage();
                    if (image != null) {
                        if (this.f18468n <= 0 || this.f18467m <= 0) {
                            this.f18468n = image.getWidth();
                            this.f18467m = image.getHeight();
                        }
                        Bitmap data = image.getData();
                        this.f18469o = data;
                        this.f18455a.setImageBitmap(data);
                    }
                }
                if (i != 1) {
                    if (this.f18457c) {
                        y8Var = this.f18456b;
                        i2 = IronSourceConstants.USING_CACHE_FOR_INIT_EVENT;
                    } else {
                        y8Var = this.f18456b;
                        i2 = 96;
                    }
                    this.f18458d.mo50226a(C7622q5.m20196a(y8Var.mo51902b(i2)), false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo50001a(boolean z) {
        C7353c9 c9Var;
        C7353c9 c9Var2;
        this.f18458d.setVisibility(8);
        this.f18462h.setVisibility(0);
        if (this.f18465k != null && (c9Var = this.f18464j) != null) {
            c9Var.mo49852a((C7353c9.C7354a) this.f18466l);
            this.f18464j.mo49853a(this.f18460f);
            this.f18460f.mo51888a(this.f18465k.getWidth(), this.f18465k.getHeight());
            String str = (String) this.f18465k.getData();
            if (!z || str == null) {
                c9Var2 = this.f18464j;
                str = this.f18465k.getUrl();
            } else {
                c9Var2 = this.f18464j;
            }
            c9Var2.mo49850a(Uri.parse(str), this.f18460f.getContext());
        }
    }

    /* renamed from: b */
    public void mo50002b() {
        C7761y8.m20947b(this.f18458d, "play_button");
        C7761y8.m20947b(this.f18455a, "media_image");
        C7761y8.m20947b(this.f18460f, "video_texture");
        this.f18455a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f18455a.setAdjustViewBounds(true);
        addView(this.f18460f);
        this.f18462h.setVisibility(8);
        addView(this.f18455a);
        addView(this.f18462h);
        addView(this.f18458d);
        addView(this.f18461g);
    }

    /* renamed from: b */
    public void mo50003b(C7399f2 f2Var) {
        mo49997a();
        mo49999a(f2Var);
    }

    /* renamed from: b */
    public void mo50004b(C7399f2 f2Var, int i) {
        if (f2Var.getVideoBanner() != null) {
            mo50000a(f2Var, i);
        } else {
            mo49999a(f2Var);
        }
    }

    /* renamed from: b */
    public void mo50005b(boolean z) {
        C7353c9 c9Var = this.f18464j;
        if (c9Var != null) {
            c9Var.mo49858e();
        }
        this.f18462h.setVisibility(8);
        this.f18455a.setVisibility(0);
        this.f18455a.setImageBitmap(this.f18469o);
        this.f18470p = z;
        if (z) {
            this.f18458d.setVisibility(0);
            return;
        }
        this.f18455a.setOnClickListener((View.OnClickListener) null);
        this.f18458d.setOnClickListener((View.OnClickListener) null);
        setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: c */
    public boolean mo50006c() {
        C7353c9 c9Var = this.f18464j;
        return c9Var != null && c9Var.mo49859f();
    }

    /* renamed from: d */
    public boolean mo50007d() {
        C7353c9 c9Var = this.f18464j;
        return c9Var != null && c9Var.mo49855c();
    }

    /* renamed from: e */
    public void mo50008e() {
        C7353c9 c9Var = this.f18464j;
        if (c9Var != null) {
            c9Var.mo49854b();
            this.f18455a.setVisibility(0);
            Bitmap screenShot = this.f18460f.getScreenShot();
            if (screenShot != null && this.f18464j.mo49860g()) {
                this.f18455a.setImageBitmap(screenShot);
            }
            if (this.f18470p) {
                this.f18458d.setVisibility(0);
            }
        }
    }

    /* renamed from: f */
    public void mo50009f() {
        C7353c9 c9Var = this.f18464j;
        if (c9Var != null) {
            if (this.f18465k != null) {
                c9Var.mo49848a();
                this.f18455a.setVisibility(8);
            }
            this.f18458d.setVisibility(8);
        }
    }

    /* renamed from: g */
    public void mo50010g() {
        this.f18455a.setOnClickListener(this.f18459e);
        this.f18458d.setOnClickListener(this.f18459e);
        setOnClickListener(this.f18459e);
    }

    public FrameLayout getClickableLayout() {
        return this.f18461g;
    }

    public C7353c9 getVideoPlayer() {
        return this.f18464j;
    }

    /* renamed from: h */
    public void mo50013h() {
        this.f18455a.setVisibility(8);
        this.f18462h.setVisibility(8);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((i3 - i) - measuredWidth) / 2;
                int i7 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f18467m;
        if (i4 == 0 || (i3 = this.f18468n) == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (mode2 == 0 && size2 == 0) {
            size2 = i4;
            size = i3;
            mode = Integer.MIN_VALUE;
            mode2 = Integer.MIN_VALUE;
        }
        if (size2 == 0 || mode2 == 0) {
            size2 = (int) ((((float) size) / ((float) i3)) * ((float) i4));
        }
        if (size == 0 || mode == 0) {
            size = (int) ((((float) size2) / ((float) i4)) * ((float) i3));
        }
        float f = ((float) i3) / ((float) i4);
        float f2 = ((float) size) / f;
        float f3 = (float) size2;
        if (f2 > f3) {
            size = (int) (f * f3);
        } else {
            size2 = (int) f2;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = (childAt == this.f18455a || childAt == this.f18461g || childAt == this.f18460f) ? 1073741824 : Integer.MIN_VALUE;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i6), View.MeasureSpec.makeMeasureSpec(size2, i6));
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: p */
    public void mo50016p() {
        C7366b bVar;
        if (this.f18464j instanceof C7389e9) {
            this.f18460f.setViewMode(1);
            VideoData videoData = this.f18465k;
            if (videoData != null) {
                this.f18460f.mo51888a(videoData.getWidth(), this.f18465k.getHeight());
            }
            this.f18464j.mo49853a(this.f18460f);
            if (this.f18464j.mo49855c() && (bVar = this.f18466l) != null) {
                bVar.mo50018b();
                return;
            }
            return;
        }
        C7366b bVar2 = this.f18466l;
        if (bVar2 != null) {
            bVar2.mo49872a("Playback within no hardware accelerated view is available only with ExoPlayer");
        }
    }

    public void setInterstitialPromoViewListener(C7366b bVar) {
        this.f18466l = bVar;
        C7353c9 c9Var = this.f18464j;
        if (c9Var != null) {
            c9Var.mo49852a((C7353c9.C7354a) bVar);
        }
    }
}
