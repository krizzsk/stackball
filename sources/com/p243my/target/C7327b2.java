package com.p243my.target;

import com.p243my.target.common.models.ImageData;

/* renamed from: com.my.target.b2 */
public abstract class C7327b2 extends C7768z1 {
    public boolean allowBackButton = true;
    public boolean allowClose = true;
    public float allowCloseDelay;
    public ImageData closeIcon;

    public C7327b2() {
        this.clickArea = C7631r1.f19277b;
    }

    public float getAllowCloseDelay() {
        return this.allowCloseDelay;
    }

    public ImageData getCloseIcon() {
        return this.closeIcon;
    }

    public boolean isAllowBackButton() {
        return this.allowBackButton;
    }

    public boolean isAllowClose() {
        return this.allowClose;
    }

    public void setAllowBackButton(boolean z) {
        this.allowBackButton = z;
    }

    public void setAllowClose(boolean z) {
        this.allowClose = z;
    }

    public void setAllowCloseDelay(float f) {
        this.allowCloseDelay = f;
    }

    public void setCloseIcon(ImageData imageData) {
        this.closeIcon = imageData;
    }
}
