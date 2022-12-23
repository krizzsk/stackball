package com.p243my.target.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p243my.target.C7296R;
import com.p243my.target.C7298a;
import com.p243my.target.C7320b0;
import com.p243my.target.C7363d6;
import com.p243my.target.C7374e0;
import com.p243my.target.C7493k1;
import com.p243my.target.C7524l3;
import com.p243my.target.C7618q2;
import com.p243my.target.C7731x2;
import com.p243my.target.C7761y8;
import com.p243my.target.common.CustomParams;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.ads.MyTargetView */
public final class MyTargetView extends FrameLayout {
    private final C7298a adConfig;
    private AdSize adSize;
    private boolean attached;
    private C7493k1 engine;
    private boolean fixedSize;
    private final AtomicBoolean isLoaded;
    private MyTargetViewListener listener;

    /* renamed from: com.my.target.ads.MyTargetView$AdSize */
    public static final class AdSize {
        public static final AdSize ADSIZE_300x250 = new AdSize(ErrorCode.GENERAL_WRAPPER_ERROR, 250, 1);
        public static final AdSize ADSIZE_320x50 = new AdSize(320, 50, 0);
        public static final AdSize ADSIZE_728x90 = new AdSize(728, 90, 2);
        public static final int BANNER_300x250 = 1;
        public static final int BANNER_320x50 = 0;
        public static final int BANNER_728x90 = 2;
        public static final int BANNER_ADAPTIVE = 3;
        private static final float MAX_HEIGHT_PROPORTION = 0.15f;
        private static final int MIN_HEIGHT = 50;
        /* access modifiers changed from: private */
        public final int height;
        private final int heightPixels;
        private final int type;
        /* access modifiers changed from: private */
        public final int width;
        private final int widthPixels;

        private AdSize(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            float a = C7761y8.m20928a();
            this.widthPixels = (int) (((float) i) * a);
            this.heightPixels = (int) (((float) i2) * a);
            this.type = i3;
        }

        private AdSize(int i, int i2, int i3, int i4, int i5) {
            this.width = i;
            this.height = i2;
            this.widthPixels = i3;
            this.heightPixels = i4;
            this.type = i5;
        }

        /* access modifiers changed from: private */
        public static AdSize fromInt(int i, Context context) {
            return i != 1 ? i != 2 ? i != 3 ? ADSIZE_320x50 : getAdSizeForCurrentOrientation(context) : ADSIZE_728x90 : ADSIZE_300x250;
        }

        public static AdSize getAdSizeForCurrentOrientation(int i, int i2, Context context) {
            Point b = C7761y8.m20944b(context);
            float a = C7761y8.m20928a();
            return getSize(((float) i) * a, Math.min(((float) i2) * a, ((float) b.y) * MAX_HEIGHT_PROPORTION));
        }

        public static AdSize getAdSizeForCurrentOrientation(int i, Context context) {
            return getSize(((float) i) * C7761y8.m20928a(), ((float) C7761y8.m20944b(context).y) * MAX_HEIGHT_PROPORTION);
        }

        public static AdSize getAdSizeForCurrentOrientation(Context context) {
            Point b = C7761y8.m20944b(context);
            return getSize((float) b.x, ((float) b.y) * MAX_HEIGHT_PROPORTION);
        }

        private static AdSize getSize(float f, float f2) {
            float a = C7761y8.m20928a();
            float max = Math.max(Math.min(f > 524.0f ? (f / 728.0f) * 90.0f : (f / 320.0f) * 50.0f, f2), 50.0f * a);
            return new AdSize((int) (f / a), (int) (max / a), (int) f, (int) max, 3);
        }

        /* access modifiers changed from: private */
        public static boolean isSame(AdSize adSize, AdSize adSize2) {
            return adSize.height == adSize2.height && adSize.width == adSize2.width && adSize.type == adSize2.type;
        }

        public int getHeight() {
            return this.height;
        }

        public int getHeightPixels() {
            return this.heightPixels;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public int getWidthPixels() {
            return this.widthPixels;
        }
    }

    /* renamed from: com.my.target.ads.MyTargetView$MyTargetViewListener */
    public interface MyTargetViewListener {
        void onClick(MyTargetView myTargetView);

        void onLoad(MyTargetView myTargetView);

        void onNoAd(String str, MyTargetView myTargetView);

        void onShow(MyTargetView myTargetView);
    }

    public MyTargetView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MyTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyTargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLoaded = new AtomicBoolean();
        this.fixedSize = false;
        C7374e0.m18991c("MyTargetView created. Version: 5.15.0");
        this.adConfig = C7298a.newConfig(0, "");
        this.adSize = AdSize.getAdSizeForCurrentOrientation(context);
        if (attributeSet != null) {
            TypedArray typedArray = null;
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, C7296R.styleable.MyTargetView);
            } catch (Throwable th) {
                C7374e0.m18989a("unable to get view attributes: " + th.getMessage());
            }
            if (typedArray != null) {
                this.adConfig.setSlotId(typedArray.getInt(C7296R.styleable.MyTargetView_myTarget_slotId, 0));
                this.adConfig.setRefreshAd(typedArray.getBoolean(C7296R.styleable.MyTargetView_myTarget_isRefreshAd, true));
                int i2 = typedArray.getInt(C7296R.styleable.MyTargetView_myTarget_adSize, -1);
                if (i2 >= 0) {
                    if (i2 != 3) {
                        this.fixedSize = true;
                    }
                    this.adSize = AdSize.fromInt(i2, context);
                }
                typedArray.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleResult */
    public void lambda$load$0$MyTargetView(C7731x2 x2Var, String str, C7524l3.C7525a aVar) {
        MyTargetViewListener myTargetViewListener = this.listener;
        if (myTargetViewListener != null) {
            if (x2Var == null) {
                if (str == null) {
                    str = "no ad";
                }
                myTargetViewListener.onNoAd(str, this);
                return;
            }
            C7493k1 k1Var = this.engine;
            if (k1Var != null) {
                k1Var.mo50612a();
            }
            C7493k1 a = C7493k1.m19529a(this, this.adConfig, aVar);
            this.engine = a;
            a.mo50616a(this.attached);
            this.engine.mo50618b(x2Var);
            this.adConfig.setBidId((String) null);
        }
    }

    private void setFormat() {
        C7298a aVar;
        String str;
        AdSize adSize2 = this.adSize;
        if (adSize2 == AdSize.ADSIZE_320x50) {
            aVar = this.adConfig;
            str = "standard_320x50";
        } else if (adSize2 == AdSize.ADSIZE_300x250) {
            aVar = this.adConfig;
            str = "standard_300x250";
        } else if (adSize2 == AdSize.ADSIZE_728x90) {
            aVar = this.adConfig;
            str = "standard_728x90";
        } else {
            aVar = this.adConfig;
            str = "standard";
        }
        aVar.setFormat(str);
    }

    private void updateAdaptiveSize() {
        Context context = getContext();
        Point b = C7761y8.m20944b(context);
        int i = b.x;
        float f = (float) b.y;
        if (i != this.adSize.width || ((float) this.adSize.height) > f * 0.15f) {
            AdSize adSizeForCurrentOrientation = AdSize.getAdSizeForCurrentOrientation(context);
            this.adSize = adSizeForCurrentOrientation;
            C7493k1 k1Var = this.engine;
            if (k1Var != null) {
                k1Var.mo50613a(adSizeForCurrentOrientation);
            }
        }
    }

    public void destroy() {
        C7493k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo50612a();
            this.engine = null;
        }
        this.listener = null;
    }

    public String getAdSource() {
        C7493k1 k1Var = this.engine;
        if (k1Var != null) {
            return k1Var.mo50617b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C7493k1 k1Var = this.engine;
        if (k1Var != null) {
            return k1Var.mo50620c();
        }
        return 0.0f;
    }

    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    public MyTargetViewListener getListener() {
        return this.listener;
    }

    public AdSize getSize() {
        return this.adSize;
    }

    public final void handleSection(C7731x2 x2Var, AdSize adSize2) {
        C7524l3.C7525a a = C7524l3.m19687a(this.adConfig.getSlotId());
        C7320b0.m18753a(x2Var, this.adConfig, a).mo49685a(new C7320b0.C7322b(a) {
            public final /* synthetic */ C7524l3.C7525a f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                MyTargetView.this.lambda$handleSection$1$MyTargetView(this.f$1, (C7731x2) q2Var, str);
            }
        }).mo49692b(a.mo50803a(), getContext());
    }

    @Deprecated
    public void init(int i) {
        init(i, true);
    }

    @Deprecated
    public void init(int i, int i2) {
        init(i, i2, true);
    }

    @Deprecated
    public void init(int i, int i2, boolean z) {
        setAdSize(AdSize.fromInt(i2, getContext()));
        this.adConfig.setSlotId(i);
        this.adConfig.setRefreshAd(z);
        C7374e0.m18989a("MyTargetView initialized");
    }

    @Deprecated
    public void init(int i, boolean z) {
        init(i, 0, z);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public final void load() {
        if (!this.isLoaded.compareAndSet(false, true)) {
            C7374e0.m18989a("MyTargetView doesn't support multiple load");
            return;
        }
        C7524l3.C7525a a = C7524l3.m19687a(this.adConfig.getSlotId());
        C7524l3 a2 = a.mo50803a();
        C7374e0.m18989a("MyTargetView load");
        setFormat();
        C7320b0.m18752a(this.adConfig, a).mo49685a(new C7320b0.C7322b(a) {
            public final /* synthetic */ C7524l3.C7525a f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                MyTargetView.this.lambda$load$0$MyTargetView(this.f$1, (C7731x2) q2Var, str);
            }
        }).mo49692b(a2, getContext());
    }

    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        this.adConfig.setRefreshAd(false);
        load();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        C7493k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo50616a(true);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        C7493k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo50616a(false);
        }
    }

    public void onMeasure(int i, int i2) {
        if (!this.fixedSize) {
            updateAdaptiveSize();
        }
        super.onMeasure(i, i2);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C7493k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo50619b(z);
        }
    }

    public void setAdSize(AdSize adSize2) {
        if (adSize2 == null) {
            C7374e0.m18989a("AdSize cannot be null");
        } else if (!this.fixedSize || !AdSize.isSame(this.adSize, adSize2)) {
            this.fixedSize = true;
            if (this.isLoaded.get()) {
                AdSize adSize3 = this.adSize;
                AdSize adSize4 = AdSize.ADSIZE_300x250;
                if (AdSize.isSame(adSize3, adSize4) || AdSize.isSame(adSize2, adSize4)) {
                    C7374e0.m18989a("unable to switch size to/from 300x250");
                    return;
                }
            }
            C7493k1 k1Var = this.engine;
            if (k1Var != null) {
                k1Var.mo50613a(adSize2);
                View childAt = getChildAt(0);
                if (childAt instanceof C7363d6) {
                    childAt.requestLayout();
                }
            }
            this.adSize = adSize2;
            setFormat();
        }
    }

    public void setListener(MyTargetViewListener myTargetViewListener) {
        this.listener = myTargetViewListener;
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public void setRefreshAd(boolean z) {
        this.adConfig.setRefreshAd(z);
    }

    public void setSlotId(int i) {
        if (!this.isLoaded.get()) {
            this.adConfig.setSlotId(i);
        }
    }
}
