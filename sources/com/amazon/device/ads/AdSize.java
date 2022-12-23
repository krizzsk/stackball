package com.amazon.device.ads;

import com.smaato.sdk.video.vast.model.ErrorCode;

public class AdSize {
    private static final String LOGTAG = AdSize.class.getSimpleName();
    public static final AdSize SIZE_1024x50 = new AdSize(1024, 50);
    public static final AdSize SIZE_300x250 = new AdSize((int) ErrorCode.GENERAL_WRAPPER_ERROR, 250);
    public static final AdSize SIZE_320x50 = new AdSize(320, 50);
    public static final AdSize SIZE_600x90 = new AdSize(600, 90);
    public static final AdSize SIZE_728x90 = new AdSize(728, 90);
    public static final AdSize SIZE_AUTO = new AdSize(SizeType.AUTO);
    public static final AdSize SIZE_AUTO_NO_SCALE = new AdSize(SizeType.AUTO, Scaling.NO_UPSCALE);
    static final AdSize SIZE_INTERSTITIAL = new AdSize(SizeType.INTERSTITIAL, Modality.MODAL);
    static final AdSize SIZE_MODELESS_INTERSTITIAL = new AdSize(SizeType.INTERSTITIAL);
    private int gravity;
    private int height;
    private final MobileAdsLogger logger;
    private int maxWidth;
    private Modality modality;
    private Scaling scaling;
    private SizeType type;
    private int width;

    private enum Modality {
        MODAL,
        MODELESS
    }

    private enum Scaling {
        CAN_UPSCALE,
        NO_UPSCALE
    }

    enum SizeType {
        EXPLICIT,
        AUTO,
        INTERSTITIAL
    }

    public AdSize(int i, int i2) {
        this.gravity = 17;
        this.type = SizeType.EXPLICIT;
        this.modality = Modality.MODELESS;
        this.scaling = Scaling.CAN_UPSCALE;
        this.logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
        initialize(i, i2);
    }

    AdSize(String str, String str2) {
        this.gravity = 17;
        this.type = SizeType.EXPLICIT;
        this.modality = Modality.MODELESS;
        this.scaling = Scaling.CAN_UPSCALE;
        this.logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
        initialize(NumberUtils.parseInt(str, 0), NumberUtils.parseInt(str2, 0));
    }

    AdSize(SizeType sizeType) {
        this.gravity = 17;
        this.type = SizeType.EXPLICIT;
        this.modality = Modality.MODELESS;
        this.scaling = Scaling.CAN_UPSCALE;
        this.logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
        this.type = sizeType;
    }

    AdSize(SizeType sizeType, Modality modality2) {
        this(sizeType);
        this.modality = modality2;
    }

    AdSize(SizeType sizeType, Scaling scaling2) {
        this(sizeType);
        this.scaling = scaling2;
    }

    private AdSize deepClone() {
        AdSize adSize = new AdSize(this.type);
        adSize.width = this.width;
        adSize.height = this.height;
        adSize.gravity = this.gravity;
        adSize.modality = this.modality;
        adSize.scaling = this.scaling;
        adSize.maxWidth = this.maxWidth;
        return adSize;
    }

    private void initialize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            this.logger.mo10939e("The width and height must be positive integers.");
            throw new IllegalArgumentException("The width and height must be positive integers.");
        }
        this.width = i;
        this.height = i2;
        this.type = SizeType.EXPLICIT;
    }

    public AdSize newGravity(int i) {
        AdSize deepClone = deepClone();
        deepClone.gravity = i;
        return deepClone;
    }

    public int getGravity() {
        return this.gravity;
    }

    /* renamed from: com.amazon.device.ads.AdSize$1 */
    static /* synthetic */ class C09291 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdSize$SizeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.amazon.device.ads.AdSize$SizeType[] r0 = com.amazon.device.ads.AdSize.SizeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$AdSize$SizeType = r0
                com.amazon.device.ads.AdSize$SizeType r1 = com.amazon.device.ads.AdSize.SizeType.EXPLICIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdSize$SizeType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.AdSize$SizeType r1 = com.amazon.device.ads.AdSize.SizeType.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$AdSize$SizeType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.AdSize$SizeType r1 = com.amazon.device.ads.AdSize.SizeType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.AdSize.C09291.<clinit>():void");
        }
    }

    public String toString() {
        int i = C09291.$SwitchMap$com$amazon$device$ads$AdSize$SizeType[this.type.ordinal()];
        if (i == 1) {
            return getAsSizeString(this.width, this.height);
        }
        if (i == 2) {
            return TtmlNode.TEXT_EMPHASIS_AUTO;
        }
        if (i != 3) {
            return null;
        }
        return "interstitial";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (!this.type.equals(adSize.type)) {
            return false;
        }
        if ((!this.type.equals(SizeType.EXPLICIT) || (this.width == adSize.width && this.height == adSize.height)) && this.gravity == adSize.gravity && this.maxWidth == adSize.maxWidth && this.scaling == adSize.scaling && this.modality == adSize.modality) {
            return true;
        }
        return false;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isAuto() {
        return this.type == SizeType.AUTO;
    }

    /* access modifiers changed from: package-private */
    public boolean isModal() {
        return Modality.MODAL.equals(this.modality);
    }

    /* access modifiers changed from: package-private */
    public SizeType getSizeType() {
        return this.type;
    }

    public boolean canUpscale() {
        return Scaling.CAN_UPSCALE.equals(this.scaling);
    }

    public AdSize disableScaling() {
        AdSize deepClone = deepClone();
        deepClone.scaling = Scaling.NO_UPSCALE;
        return deepClone;
    }

    /* access modifiers changed from: package-private */
    public AdSize newMaxWidth(int i) {
        AdSize deepClone = deepClone();
        deepClone.maxWidth = i;
        return deepClone;
    }

    /* access modifiers changed from: package-private */
    public int getMaxWidth() {
        return this.maxWidth;
    }

    static String getAsSizeString(int i, int i2) {
        return Integer.toString(i) + "x" + Integer.toString(i2);
    }
}
