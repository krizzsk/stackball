package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.smaato.sdk.video.vast.model.ErrorCode;

public class BannerSize {
    public static final int DEV_SET_TYPE = 5;
    public static final int LARGE_TYPE = 1;
    public static final int MEDIUM_TYPE = 2;
    public static final int SMART_TYPE = 3;
    public static final int STANDARD_TYPE = 4;
    private int height;
    private int width;

    public BannerSize(int i, int i2, int i3) {
        if (i == 1) {
            this.height = 90;
            this.width = 320;
        } else if (i == 2) {
            this.height = 250;
            this.width = ErrorCode.GENERAL_WRAPPER_ERROR;
        } else if (i == 3) {
            setSmartMode();
        } else if (i == 4) {
            this.height = 50;
            this.width = 320;
        } else if (i == 5) {
            this.height = i3;
            this.width = i2;
        }
    }

    private void setSmartMode() {
        if (C6349m.m16112i(C6122a.m15302b().mo42895d()) < 720) {
            this.height = 50;
            this.width = 320;
            return;
        }
        this.height = 90;
        this.width = 728;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
