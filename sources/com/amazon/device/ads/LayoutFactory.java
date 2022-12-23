package com.amazon.device.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

class LayoutFactory {

    enum LayoutType {
        RELATIVE_LAYOUT,
        LINEAR_LAYOUT,
        FRAME_LAYOUT
    }

    LayoutFactory() {
    }

    /* renamed from: com.amazon.device.ads.LayoutFactory$1 */
    static /* synthetic */ class C09531 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$LayoutFactory$LayoutType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.amazon.device.ads.LayoutFactory$LayoutType[] r0 = com.amazon.device.ads.LayoutFactory.LayoutType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$LayoutFactory$LayoutType = r0
                com.amazon.device.ads.LayoutFactory$LayoutType r1 = com.amazon.device.ads.LayoutFactory.LayoutType.RELATIVE_LAYOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$LayoutFactory$LayoutType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.LayoutFactory$LayoutType r1 = com.amazon.device.ads.LayoutFactory.LayoutType.FRAME_LAYOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$LayoutFactory$LayoutType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.LayoutFactory$LayoutType r1 = com.amazon.device.ads.LayoutFactory.LayoutType.LINEAR_LAYOUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.LayoutFactory.C09531.<clinit>():void");
        }
    }

    public ViewGroup createLayout(Context context, LayoutType layoutType, String str) {
        ViewGroup viewGroup;
        int i = C09531.$SwitchMap$com$amazon$device$ads$LayoutFactory$LayoutType[layoutType.ordinal()];
        if (i == 1) {
            viewGroup = new RelativeLayout(context);
        } else if (i != 2) {
            viewGroup = new LinearLayout(context);
        } else {
            viewGroup = new FrameLayout(context);
        }
        viewGroup.setContentDescription(str);
        return viewGroup;
    }
}
