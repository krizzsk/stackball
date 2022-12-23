package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.yandex.mobile.ads.impl.C13386i9;
import com.yandex.mobile.ads.impl.C14393ql;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.n21;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.u60;
import com.yandex.mobile.ads.nativeads.C15504k0;
import com.yandex.mobile.ads.nativeads.C15510m;
import com.yandex.mobile.ads.nativeads.C15526t;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import com.yandex.mobile.ads.nativeads.template.C15531a;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import java.util.Arrays;

public final class NativeBannerView extends C15510m<C15504k0> {

    /* renamed from: A */
    private LinearLayout f43952A;

    /* renamed from: B */
    private MediaView f43953B;

    /* renamed from: C */
    private LinearLayout f43954C;

    /* renamed from: D */
    private NativeAdType f43955D;

    /* renamed from: E */
    private NativeAdAssets f43956E;

    /* renamed from: F */
    private C15547e f43957F;

    /* renamed from: G */
    private C15546d f43958G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public NativeAd f43959H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C15544b f43960I;

    /* renamed from: J */
    private final NativeAdImageLoadingListener f43961J = new C15528a();

    /* renamed from: b */
    private final C14393ql f43962b = new C14393ql();

    /* renamed from: c */
    private final int f43963c = lo1.m38864a(getContext(), 4.0f);

    /* renamed from: d */
    private final int f43964d = lo1.m38864a(getContext(), 8.0f);

    /* renamed from: e */
    private final int f43965e = lo1.m38864a(getContext(), 12.0f);

    /* renamed from: f */
    private NativeTemplateAppearance f43966f;

    /* renamed from: g */
    private TextView f43967g;

    /* renamed from: h */
    private TextView f43968h;

    /* renamed from: i */
    private Button f43969i;

    /* renamed from: j */
    private TextView f43970j;

    /* renamed from: k */
    private ImageView f43971k;

    /* renamed from: l */
    private ImageView f43972l;

    /* renamed from: m */
    private C15548f f43973m;

    /* renamed from: n */
    private TextView f43974n;

    /* renamed from: o */
    private TextView f43975o;

    /* renamed from: p */
    private ImageView f43976p;

    /* renamed from: q */
    private n21 f43977q;

    /* renamed from: r */
    private TextView f43978r;

    /* renamed from: s */
    private ImageView f43979s;

    /* renamed from: t */
    private ImageView f43980t;

    /* renamed from: u */
    private LinearLayout f43981u;

    /* renamed from: v */
    private FrameLayout f43982v;

    /* renamed from: w */
    private LinearLayout f43983w;

    /* renamed from: x */
    private LinearLayout f43984x;

    /* renamed from: y */
    private LinearLayout f43985y;

    /* renamed from: z */
    private ImageView f43986z;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.NativeBannerView$a */
    class C15528a implements NativeAdImageLoadingListener {
        C15528a() {
        }

        public void onFinishLoadingImages() {
            if (NativeBannerView.this.f43959H != null) {
                NativeBannerView.this.f43959H.removeImageLoadingListener(this);
            }
            NativeBannerView.this.f43960I.mo71899a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.NativeBannerView$b */
    static /* synthetic */ class C15529b {

        /* renamed from: a */
        static final /* synthetic */ int[] f43988a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType[] r0 = com.yandex.mobile.ads.nativeads.template.SizeConstraint.SizeConstraintType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43988a = r0
                com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType r1 = com.yandex.mobile.ads.nativeads.template.SizeConstraint.SizeConstraintType.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43988a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType r1 = com.yandex.mobile.ads.nativeads.template.SizeConstraint.SizeConstraintType.FIXED_RATIO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43988a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yandex.mobile.ads.nativeads.template.SizeConstraint$SizeConstraintType r1 = com.yandex.mobile.ads.nativeads.template.SizeConstraint.SizeConstraintType.PREFERRED_RATIO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.template.NativeBannerView.C15529b.<clinit>():void");
        }
    }

    public NativeBannerView(Context context) {
        super(context);
        m45274q();
    }

    /* renamed from: q */
    private void m45274q() {
        this.f43966f = new NativeTemplateAppearance.Builder().build();
        this.f43980t = m45275r();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f43983w = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f43983w.setGravity(17);
        this.f43983w.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setGravity(17);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        C15548f fVar = new C15548f(getContext());
        fVar.setEllipsize(TextUtils.TruncateAt.END);
        fVar.setMaxLines(1);
        fVar.setGravity(17);
        fVar.setPadding(0, 0, 0, lo1.m38864a(getContext(), 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        fVar.setLayoutParams(layoutParams);
        this.f43973m = fVar;
        linearLayout3.addView(fVar);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setGravity(GravityCompat.START);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f43963c;
        textView.setLayoutParams(layoutParams2);
        this.f43967g = textView;
        linearLayout4.addView(textView);
        this.f43983w.addView(linearLayout4);
        this.f43983w.addView(linearLayout3);
        this.f43983w.addView(view);
        LinearLayout linearLayout5 = this.f43983w;
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        this.f43984x = linearLayout6;
        linearLayout6.setOrientation(0);
        this.f43984x.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f43963c;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams3);
        this.f43976p = m45275r();
        this.f43972l = m45275r();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f43979s = imageView;
        frameLayout.addView(this.f43976p);
        frameLayout.addView(this.f43972l);
        frameLayout.addView(this.f43979s);
        LinearLayout linearLayout7 = new LinearLayout(getContext());
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout7.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f43974n = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f43968h = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f43970j = textView4;
        linearLayout7.addView(this.f43974n);
        linearLayout7.addView(this.f43968h);
        linearLayout7.addView(this.f43970j);
        LinearLayout linearLayout8 = new LinearLayout(getContext());
        this.f43985y = linearLayout8;
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f43964d;
        this.f43985y.setLayoutParams(layoutParams4);
        LinearLayout linearLayout9 = new LinearLayout(getContext());
        linearLayout9.setOrientation(1);
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        n21 n21 = new n21(getContext(), (AttributeSet) null, 16842877);
        n21.setNumStars(5);
        n21.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f43964d;
        n21.setLayoutParams(layoutParams5);
        this.f43977q = n21;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f43978r = textView5;
        linearLayout9.addView(this.f43977q);
        linearLayout9.addView(this.f43978r);
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        linearLayout10.setOrientation(0);
        linearLayout10.setGravity(5);
        linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), (AttributeSet) null, 16843563);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setMaxLines(1);
        button.setTransformationMethod((TransformationMethod) null);
        int a = lo1.m38864a(getContext(), 26.0f);
        button.setMinimumHeight(a);
        button.setMinHeight(a);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f43969i = button;
        linearLayout10.addView(button);
        this.f43985y.addView(linearLayout9);
        this.f43985y.addView(linearLayout10);
        linearLayout7.addView(this.f43985y);
        this.f43984x.addView(frameLayout);
        this.f43984x.addView(linearLayout7);
        LinearLayout linearLayout11 = this.f43984x;
        this.f43952A = m45272b();
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f43986z = imageView2;
        this.f43952A.addView(imageView2);
        LinearLayout linearLayout12 = this.f43952A;
        this.f43954C = m45272b();
        MediaView mediaView = new MediaView(getContext());
        mediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f43953B = mediaView;
        this.f43954C.addView(mediaView);
        LinearLayout linearLayout13 = this.f43954C;
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(TextUtils.TruncateAt.END);
        this.f43975o = textView6;
        linearLayout.addView(linearLayout5);
        linearLayout.addView(linearLayout11);
        linearLayout.addView(linearLayout12);
        linearLayout.addView(linearLayout13);
        linearLayout.addView(textView6);
        this.f43981u = linearLayout;
        int a2 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getRight()) - this.f43964d;
        u60 u60 = new u60(getContext());
        this.f43982v = new n60(getContext()).mo68892a();
        ImageView a3 = u60.mo70294a(a2, this.f43963c);
        this.f43971k = a3;
        this.f43982v.addView(a3);
        this.f43982v.setVisibility(8);
        addView(this.f43980t, new ViewGroup.LayoutParams(-1, -2));
        addView(this.f43981u, new ViewGroup.LayoutParams(-1, -1));
        addView(this.f43982v);
        this.f43980t.setVisibility(8);
        this.f43981u.setVisibility(8);
        this.f43960I = new C15544b(this.f43979s, this.f43976p, this.f43972l, this.f43986z, this.f43980t);
        m45271a();
    }

    /* renamed from: r */
    private ImageView m45275r() {
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public void applyAppearance(NativeTemplateAppearance nativeTemplateAppearance) {
        if (nativeTemplateAppearance != null && !nativeTemplateAppearance.equals(this.f43966f)) {
            this.f43966f = nativeTemplateAppearance;
            m45271a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public TextView mo71763c() {
        return this.f43967g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public TextView mo71764d() {
        return this.f43968h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Button mo71765e() {
        return this.f43969i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public TextView mo71766f() {
        return this.f43970j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ImageView mo71767g() {
        return this.f43979s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ImageView mo71768h() {
        return this.f43971k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ImageView mo71769i() {
        return this.f43976p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ImageView mo71770j() {
        NativeAdImage image;
        ImageView imageView = this.f43972l;
        if (this.f43958G == null || (image = this.f43956E.getImage()) == null) {
            return imageView;
        }
        if (this.f43958G.mo71902a(image)) {
            return this.f43980t;
        }
        return this.f43958G.mo71904b(image) ? this.f43986z : imageView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public MediaView mo71771k() {
        return this.f43953B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public View mo71772l() {
        return this.f43977q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public TextView mo71773m() {
        return this.f43978r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public TextView mo71774n() {
        return this.f43973m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public TextView mo71775o() {
        return this.f43974n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeAd nativeAd = this.f43959H;
        if (nativeAd != null) {
            nativeAd.addImageLoadingListener(this.f43961J);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        NativeAd nativeAd = this.f43959H;
        if (nativeAd != null) {
            nativeAd.removeImageLoadingListener(this.f43961J);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        int i3;
        int i4;
        if (this.f43958G != null) {
            int size = View.MeasureSpec.getSize(i) - (this.f43962b.mo69618a(getContext(), this.f43966f.getBannerAppearance().getBorderWidth()) * 2);
            if (size < 0) {
                size = 0;
            }
            C15546d dVar = this.f43958G;
            Context context = getContext();
            int a = lo1.m38864a(context, this.f43966f.getBannerAppearance().getContentPadding().getLeft());
            int round = Math.round(TypedValue.applyDimension(1, this.f43966f.getBannerAppearance().getContentPadding().getRight(), context.getResources().getDisplayMetrics()));
            if (dVar.mo71903b() || dVar.mo71905c() || dVar.mo71908f()) {
                int round2 = Math.round((float) ((size - a) - round));
                int a2 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getImageMargins().getLeft()) + Math.round(TypedValue.applyDimension(1, (float) a, context.getResources().getDisplayMetrics()));
                int a3 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getImageMargins().getRight());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.mo71903b()) {
                    NativeAdImage favicon = this.f43956E.getFavicon();
                    C15531a.C15535d a4 = m45270a(this.f43966f.getFaviconAppearance().getWidthConstraint()).mo71788a(getContext(), round2, favicon.getWidth(), favicon.getHeight());
                    int a5 = lo1.m38864a(getContext(), 5.0f);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a4.mo71790b(), a4.mo71789a());
                    layoutParams3.leftMargin = a2;
                    layoutParams3.rightMargin = a5;
                    layoutParams2 = layoutParams3;
                }
                this.f43979s.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.mo71905c()) {
                    layoutParams4 = m45268a(this.f43956E.getIcon(), round2, a2, a3);
                }
                this.f43976p.setLayoutParams(layoutParams4);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.mo71908f()) {
                    layoutParams5 = m45268a(this.f43956E.getImage(), round2, a2, a3);
                }
                this.f43972l.setLayoutParams(layoutParams5);
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f43984x.getLayoutParams();
                layoutParams6.leftMargin = 0;
                this.f43984x.setLayoutParams(layoutParams6);
            } else {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(0, 0);
                this.f43979s.setLayoutParams(layoutParams7);
                this.f43976p.setLayoutParams(layoutParams7);
                this.f43972l.setLayoutParams(layoutParams7);
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) this.f43984x.getLayoutParams();
                layoutParams8.leftMargin = a;
                this.f43984x.setLayoutParams(layoutParams8);
            }
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, 0);
            if (dVar.mo71906d()) {
                NativeAdImage image = this.f43956E.getImage();
                int width = image.getWidth();
                int height = image.getHeight();
                float width2 = (float) image.getWidth();
                float height2 = (float) image.getHeight();
                if (height2 != 0.0f && width2 / height2 < 1.0f) {
                    i3 = Math.round((float) ((size * 3) / 4));
                    i4 = Math.round((((float) i3) / ((float) height)) * ((float) width));
                } else {
                    if (width != 0) {
                        height = Math.round(((float) height) * (((float) size) / ((float) width)));
                    }
                    i4 = size;
                    i3 = height;
                }
                float width3 = (float) image.getWidth();
                float height3 = (float) image.getHeight();
                if (!(height3 != 0.0f && width3 / height3 > 1.5f)) {
                    i3 = Math.round(((float) i3) * 0.8f);
                }
                layoutParams9 = new LinearLayout.LayoutParams(i4, i3);
                layoutParams9.topMargin = this.f43963c;
                layoutParams9.gravity = 1;
            }
            this.f43952A.setLayoutParams(layoutParams9);
            if (Build.VERSION.SDK_INT <= 17) {
                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.mo71901a()) {
                    NativeAdImage image2 = this.f43956E.getImage();
                    int width4 = image2.getWidth();
                    int height4 = image2.getHeight();
                    if (width4 != 0) {
                        height4 = Math.round(((float) height4) * (((float) size) / ((float) width4)));
                    }
                    layoutParams10 = new FrameLayout.LayoutParams(size, height4);
                }
                this.f43980t.setLayoutParams(layoutParams10);
            }
            C15546d dVar2 = this.f43958G;
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, 0);
            NativeAdMedia media = this.f43956E.getMedia();
            if (media != null && dVar2.mo71907e()) {
                layoutParams11 = new LinearLayout.LayoutParams(size, new C13386i9(media.getAspectRatio()).mo67752a(size));
            }
            this.f43954C.setLayoutParams(layoutParams11);
            if (this.f43957F.mo71911e()) {
                if (this.f43957F.mo71912f()) {
                    ((ViewManager) this.f43985y.getParent()).removeView(this.f43985y);
                    LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                    if (this.f43957F.mo71910c()) {
                        layoutParams12.topMargin = this.f43965e;
                    } else {
                        layoutParams12.topMargin = this.f43963c;
                    }
                    layoutParams12.bottomMargin = this.f43964d;
                    this.f43985y.setLayoutParams(layoutParams12);
                    this.f43985y.setPadding(lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getLeft()), 0, lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getRight()), 0);
                    LinearLayout linearLayout = this.f43981u;
                    linearLayout.addView(this.f43985y, linearLayout.getChildCount() - 1);
                } else {
                    ((ViewManager) this.f43985y.getParent()).removeView(this.f43985y);
                    this.f43985y.setPadding(0, 0, 0, 0);
                    LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
                    int i5 = this.f43964d;
                    layoutParams13.topMargin = i5;
                    layoutParams13.bottomMargin = i5;
                    ((ViewManager) this.f43970j.getParent()).addView(this.f43985y, layoutParams13);
                }
                if (this.f43957F.mo71909b()) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                this.f43969i.setLayoutParams(layoutParams);
            } else {
                this.f43985y.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            }
            int round3 = Math.round(((float) size) * 0.4f);
            this.f43969i.setMinWidth(round3);
            this.f43969i.setMinimumWidth(round3);
            if (this.f43957F.mo71913g()) {
                TextView textView = this.f43975o;
                if (this.f43957F.mo71914h()) {
                    textView.setBackgroundColor(0);
                } else {
                    textView.setBackgroundColor(lo1.m38863a(textView.getCurrentTextColor(), 92.0f));
                }
                this.f43975o.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public TextView mo71777p() {
        return this.f43975o;
    }

    public void setAd(NativeAd nativeAd) {
        NativeAdImage image;
        NativeAd nativeAd2 = this.f43959H;
        if (nativeAd2 != nativeAd) {
            if (nativeAd2 != null) {
                try {
                    nativeAd2.removeImageLoadingListener(this.f43961J);
                } catch (NativeAdException unused) {
                    return;
                }
            }
            nativeAd.addImageLoadingListener(this.f43961J);
            this.f43955D = nativeAd.getAdType();
            NativeAdAssets adAssets = nativeAd.getAdAssets();
            this.f43956E = adAssets;
            this.f43957F = new C15547e(adAssets, this.f43955D);
            this.f43958G = new C15546d(this.f43956E, this.f43955D);
            new l60(getContext(), this.f43956E).mo68358a(this.f43971k, this.f43982v, this.f43965e);
            ((C15526t) nativeAd).mo71675a(this);
            int i = 0;
            if (!(this.f43958G == null || (image = this.f43956E.getImage()) == null || !this.f43958G.mo71902a(image))) {
                this.f43980t.setVisibility(0);
                i = 8;
            }
            this.f43981u.setVisibility(i);
            this.f43959H = nativeAd;
        }
    }

    /* renamed from: a */
    private C15531a m45270a(SizeConstraint sizeConstraint) {
        int i = C15529b.f43988a[sizeConstraint.getSizeConstraintType().ordinal()];
        if (i == 1) {
            return new C15531a.C15532a(sizeConstraint.getValue());
        }
        if (i == 2) {
            return new C15531a.C15533b(sizeConstraint.getValue());
        }
        if (i != 3) {
            return new C15531a.C15534c(sizeConstraint.getValue());
        }
        return new C15531a.C15534c(sizeConstraint.getValue());
    }

    /* renamed from: b */
    private LinearLayout m45272b() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    /* renamed from: a */
    private void m45271a() {
        int a = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f43966f.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f43966f.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(((float) a) * 2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(a, a, a, a);
        int a2 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getLeft());
        int a3 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a2, this.f43964d, a3, this.f43963c);
        this.f43983w.setLayoutParams(layoutParams);
        this.f43983w.invalidate();
        int a4 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getLeft());
        int a5 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = a4;
        layoutParams2.rightMargin = a5;
        layoutParams2.bottomMargin = this.f43963c;
        this.f43984x.setLayoutParams(layoutParams2);
        this.f43984x.invalidate();
        int a6 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getLeft());
        int a7 = lo1.m38864a(getContext(), this.f43966f.getBannerAppearance().getContentPadding().getRight());
        TextView textView = this.f43975o;
        int i = this.f43963c;
        textView.setPadding(a6, i, a7, i);
        this.f43975o.invalidate();
        this.f43969i.setTextColor(this.f43966f.getCallToActionAppearance().getTextAppearance().getTextColor());
        this.f43969i.setTextSize(this.f43966f.getCallToActionAppearance().getTextAppearance().getTextSize());
        this.f43969i.setTypeface(Typeface.create(this.f43966f.getCallToActionAppearance().getTextAppearance().getFontFamilyName(), this.f43966f.getCallToActionAppearance().getTextAppearance().getFontStyle()));
        float[] fArr = new float[8];
        Arrays.fill(fArr, (float) lo1.m38864a(getContext(), 5.0f));
        RoundRectShape roundRectShape = new RoundRectShape(fArr, (RectF) null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f43966f.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f43966f.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, shapeDrawable3);
        stateListDrawable.addState(new int[]{16842919}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        int a8 = lo1.m38864a(getContext(), this.f43966f.getCallToActionAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f43966f.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth((float) a8);
        paint3.setStyle(Paint.Style.STROKE);
        this.f43969i.setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        LayerDrawable layerDrawable = (LayerDrawable) this.f43977q.getProgressDrawable();
        layerDrawable.getDrawable(2).setColorFilter(this.f43966f.getRatingAppearance().getProgressStarColor(), PorterDuff.Mode.SRC_ATOP);
        layerDrawable.getDrawable(1).setColorFilter(this.f43966f.getRatingAppearance().getBackgroundStarColor(), PorterDuff.Mode.SRC_ATOP);
        layerDrawable.getDrawable(0).setColorFilter(this.f43966f.getRatingAppearance().getBackgroundStarColor(), PorterDuff.Mode.SRC_ATOP);
        this.f43967g.setTypeface(Typeface.create(this.f43966f.getAgeAppearance().getFontFamilyName(), this.f43966f.getAgeAppearance().getFontStyle()));
        this.f43967g.setTextColor(this.f43966f.getAgeAppearance().getTextColor());
        this.f43967g.setTextSize(2, this.f43966f.getAgeAppearance().getTextSize());
        this.f43968h.setTypeface(Typeface.create(this.f43966f.getBodyAppearance().getFontFamilyName(), this.f43966f.getBodyAppearance().getFontStyle()));
        this.f43968h.setTextColor(this.f43966f.getBodyAppearance().getTextColor());
        this.f43968h.setTextSize(2, this.f43966f.getBodyAppearance().getTextSize());
        this.f43970j.setTypeface(Typeface.create(this.f43966f.getDomainAppearance().getFontFamilyName(), this.f43966f.getDomainAppearance().getFontStyle()));
        this.f43970j.setTextColor(this.f43966f.getDomainAppearance().getTextColor());
        this.f43970j.setTextSize(2, this.f43966f.getDomainAppearance().getTextSize());
        this.f43978r.setTypeface(Typeface.create(this.f43966f.getReviewCountAppearance().getFontFamilyName(), this.f43966f.getReviewCountAppearance().getFontStyle()));
        this.f43978r.setTextColor(this.f43966f.getReviewCountAppearance().getTextColor());
        this.f43978r.setTextSize(2, this.f43966f.getReviewCountAppearance().getTextSize());
        this.f43973m.setTypeface(Typeface.create(this.f43966f.getSponsoredAppearance().getFontFamilyName(), this.f43966f.getSponsoredAppearance().getFontStyle()));
        this.f43973m.setTextColor(this.f43966f.getSponsoredAppearance().getTextColor());
        this.f43973m.setTextSize(2, this.f43966f.getSponsoredAppearance().getTextSize());
        this.f43974n.setTypeface(Typeface.create(this.f43966f.getTitleAppearance().getFontFamilyName(), this.f43966f.getTitleAppearance().getFontStyle()));
        this.f43974n.setTextColor(this.f43966f.getTitleAppearance().getTextColor());
        this.f43974n.setTextSize(2, this.f43966f.getTitleAppearance().getTextSize());
        this.f43975o.setTypeface(Typeface.create(this.f43966f.getWarningAppearance().getFontFamilyName(), this.f43966f.getWarningAppearance().getFontStyle()));
        this.f43975o.setTextColor(this.f43966f.getWarningAppearance().getTextColor());
        this.f43975o.setTextSize(2, this.f43966f.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    public NativeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m45274q();
    }

    public NativeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45274q();
    }

    /* renamed from: a */
    private FrameLayout.LayoutParams m45268a(NativeAdImage nativeAdImage, int i, int i2, int i3) {
        C15531a.C15535d a = m45270a(this.f43966f.getImageAppearance().getWidthConstraint()).mo71788a(getContext(), i, nativeAdImage.getWidth(), nativeAdImage.getHeight());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.mo71790b(), a.mo71789a());
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i3;
        return layoutParams;
    }
}
