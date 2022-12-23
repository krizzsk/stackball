package com.amazon.device.ads;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.amazon.device.ads.LayoutFactory;
import com.amazon.device.ads.ThreadUtils;

class NativeCloseButton {
    private static final int CLOSE_BUTTON_SIZE_DP = 60;
    private static final int CLOSE_BUTTON_TAP_TARGET_SIZE_DP = 80;
    private static final String CONTENT_DESCRIPTION_NATIVE_CLOSE_BUTTON = "nativeCloseButton";
    private static final String CONTENT_DESCRIPTION_NATIVE_CLOSE_BUTTON_CONTAINER = "nativeCloseButtonContainer";
    private static final String CONTENT_DESCRIPTION_NATIVE_CLOSE_BUTTON_IMAGE = "nativeCloseButtonImage";
    private final AdCloser adCloser;
    private ViewGroup closeButton;
    private ViewGroup closeButtonContainer;
    private ImageView closeButtonImage;
    private boolean hasNativeCloseButton;
    private final ImageViewFactory imageViewFactory;
    private final LayoutFactory layoutFactory;
    private final ThreadUtils.ThreadRunner threadRunner;
    private final ViewGroup viewGroup;

    public NativeCloseButton(ViewGroup viewGroup2, AdCloser adCloser2) {
        this(viewGroup2, adCloser2, ThreadUtils.getThreadRunner(), new LayoutFactory(), new ImageButtonFactory());
    }

    NativeCloseButton(ViewGroup viewGroup2, AdCloser adCloser2, ThreadUtils.ThreadRunner threadRunner2, LayoutFactory layoutFactory2, ImageViewFactory imageViewFactory2) {
        this.hasNativeCloseButton = false;
        this.viewGroup = viewGroup2;
        this.adCloser = adCloser2;
        this.threadRunner = threadRunner2;
        this.layoutFactory = layoutFactory2;
        this.imageViewFactory = imageViewFactory2;
    }

    private Context getContext() {
        return this.viewGroup.getContext();
    }

    public void enable(boolean z, RelativePosition relativePosition) {
        this.hasNativeCloseButton = true;
        ViewGroup viewGroup2 = this.closeButton;
        if (viewGroup2 == null || this.closeButtonImage == null || !this.viewGroup.equals(viewGroup2.getParent()) || (!this.closeButton.equals(this.closeButtonImage.getParent()) && z)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            final int i = (int) ((displayMetrics.density * 60.0f) + 0.5f);
            final int i2 = (int) ((displayMetrics.density * 80.0f) + 0.5f);
            final boolean z2 = z;
            final RelativePosition relativePosition2 = relativePosition;
            this.threadRunner.executeAsyncTask(new ThreadUtils.MobileAdsAsyncTask<Void, Void, Void>() {
                /* access modifiers changed from: protected */
                public Void doInBackground(Void... voidArr) {
                    NativeCloseButton.this.createButtonIfNeeded(i2);
                    return null;
                }

                /* access modifiers changed from: protected */
                public void onPostExecute(Void voidR) {
                    NativeCloseButton.this.addCloseButtonToTapTargetIfNeeded(z2, relativePosition2, i, i2);
                }
            }, new Void[0]);
        } else if (!z) {
            hideImage();
        }
    }

    /* access modifiers changed from: private */
    public void createButtonIfNeeded(int i) {
        boolean z;
        synchronized (this) {
            if (this.closeButton == null) {
                this.closeButton = this.layoutFactory.createLayout(getContext(), LayoutFactory.LayoutType.RELATIVE_LAYOUT, CONTENT_DESCRIPTION_NATIVE_CLOSE_BUTTON);
                this.closeButtonImage = this.imageViewFactory.createImageView(getContext(), CONTENT_DESCRIPTION_NATIVE_CLOSE_BUTTON_IMAGE);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            final BitmapDrawable createBitmapDrawable = this.imageViewFactory.createBitmapDrawable(getContext().getResources(), Assets.getInstance().getFilePath(Assets.CLOSE_NORMAL));
            final BitmapDrawable createBitmapDrawable2 = this.imageViewFactory.createBitmapDrawable(getContext().getResources(), Assets.getInstance().getFilePath(Assets.CLOSE_PRESSED));
            this.closeButtonImage.setImageDrawable(createBitmapDrawable);
            this.closeButtonImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.closeButtonImage.setBackgroundDrawable((Drawable) null);
            C09752 r2 = new View.OnClickListener() {
                public void onClick(View view) {
                    NativeCloseButton.this.closeAd();
                }
            };
            this.closeButtonImage.setOnClickListener(r2);
            this.closeButton.setOnClickListener(r2);
            C09763 r22 = new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    NativeCloseButton.this.animateCloseButton(motionEvent, createBitmapDrawable, createBitmapDrawable2);
                    return false;
                }
            };
            this.closeButton.setOnTouchListener(r22);
            this.closeButtonImage.setOnTouchListener(r22);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            ViewGroup createLayout = this.layoutFactory.createLayout(getContext(), LayoutFactory.LayoutType.RELATIVE_LAYOUT, CONTENT_DESCRIPTION_NATIVE_CLOSE_BUTTON_CONTAINER);
            this.closeButtonContainer = createLayout;
            createLayout.addView(this.closeButton, layoutParams);
        }
    }

    /* access modifiers changed from: private */
    public void closeAd() {
        this.adCloser.closeAd();
    }

    /* access modifiers changed from: private */
    public void animateCloseButton(MotionEvent motionEvent, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.closeButtonImage.setImageDrawable(bitmapDrawable2);
        } else if (action == 1) {
            this.closeButtonImage.setImageDrawable(bitmapDrawable);
        }
    }

    /* access modifiers changed from: private */
    public void addCloseButtonToTapTargetIfNeeded(boolean z, RelativePosition relativePosition, int i, int i2) {
        if (z && !this.closeButton.equals(this.closeButtonImage.getParent())) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
            layoutParams.addRule(13);
            this.closeButton.addView(this.closeButtonImage, layoutParams);
        } else if (!z && this.closeButton.equals(this.closeButtonImage.getParent())) {
            this.closeButton.removeView(this.closeButtonImage);
        }
        if (!this.viewGroup.equals(this.closeButtonContainer.getParent())) {
            this.viewGroup.addView(this.closeButtonContainer, new FrameLayout.LayoutParams(-1, -1));
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
        if (relativePosition == null) {
            relativePosition = RelativePosition.TOP_RIGHT;
        }
        switch (C09796.$SwitchMap$com$amazon$device$ads$RelativePosition[relativePosition.ordinal()]) {
            case 1:
                layoutParams2.addRule(12);
                layoutParams2.addRule(14);
                break;
            case 2:
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                break;
            case 3:
                layoutParams2.addRule(12);
                layoutParams2.addRule(11);
                break;
            case 4:
                layoutParams2.addRule(13);
                break;
            case 5:
                layoutParams2.addRule(10);
                layoutParams2.addRule(14);
                break;
            case 6:
                layoutParams2.addRule(10);
                layoutParams2.addRule(9);
                break;
            case 7:
                layoutParams2.addRule(10);
                layoutParams2.addRule(11);
                break;
            default:
                layoutParams2.addRule(10);
                layoutParams2.addRule(11);
                break;
        }
        this.closeButton.setLayoutParams(layoutParams2);
        this.closeButtonContainer.bringToFront();
    }

    /* renamed from: com.amazon.device.ads.NativeCloseButton$6 */
    static /* synthetic */ class C09796 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$RelativePosition;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.amazon.device.ads.RelativePosition[] r0 = com.amazon.device.ads.RelativePosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$RelativePosition = r0
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.BOTTOM_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x003e }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.TOP_CENTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.NativeCloseButton.C09796.<clinit>():void");
        }
    }

    public void remove() {
        this.hasNativeCloseButton = false;
        this.threadRunner.execute(new Runnable() {
            public void run() {
                NativeCloseButton.this.removeNativeCloseButtonOnMainThread();
            }
        }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.MAIN_THREAD);
    }

    /* access modifiers changed from: private */
    public void removeNativeCloseButtonOnMainThread() {
        this.viewGroup.removeView(this.closeButtonContainer);
    }

    public void showImage(boolean z) {
        if (this.hasNativeCloseButton && this.closeButton != null) {
            if (z) {
                enable(true, (RelativePosition) null);
            } else {
                hideImage();
            }
        }
    }

    private void hideImage() {
        this.threadRunner.execute(new Runnable() {
            public void run() {
                NativeCloseButton.this.hideImageOnMainThread();
            }
        }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.MAIN_THREAD);
    }

    /* access modifiers changed from: private */
    public void hideImageOnMainThread() {
        this.closeButton.removeAllViews();
    }
}
