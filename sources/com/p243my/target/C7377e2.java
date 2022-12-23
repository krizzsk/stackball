package com.p243my.target;

import com.p243my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.e2 */
public class C7377e2 extends C7327b2 {
    public final List<ImageData> landscapeImages = new ArrayList();
    public ImageData optimalLandscapeImage;
    public ImageData optimalPortraitImage;
    public final List<ImageData> portraitImages = new ArrayList();

    public static C7377e2 fromCompanion(C7302a2 a2Var) {
        C7377e2 newBanner = newBanner();
        newBanner.setId(a2Var.getId());
        String staticResource = a2Var.getStaticResource();
        if (staticResource != null) {
            newBanner.addPortraitImage(ImageData.newImageData(staticResource, a2Var.getWidth(), a2Var.getHeight()));
            newBanner.getStatHolder().mo49802a(a2Var.getStatHolder(), 0.0f);
            newBanner.trackingLink = a2Var.trackingLink;
        }
        return newBanner;
    }

    public static C7377e2 newBanner() {
        return new C7377e2();
    }

    public void addLandscapeImage(ImageData imageData) {
        this.landscapeImages.add(imageData);
    }

    public void addPortraitImage(ImageData imageData) {
        this.portraitImages.add(imageData);
    }

    public List<ImageData> getLandscapeImages() {
        return new ArrayList(this.landscapeImages);
    }

    public ImageData getOptimalLandscapeImage() {
        return this.optimalLandscapeImage;
    }

    public ImageData getOptimalPortraitImage() {
        return this.optimalPortraitImage;
    }

    public List<ImageData> getPortraitImages() {
        return new ArrayList(this.portraitImages);
    }

    public void setOptimalLandscapeImage(ImageData imageData) {
        this.optimalLandscapeImage = imageData;
    }

    public void setOptimalPortraitImage(ImageData imageData) {
        this.optimalPortraitImage = imageData;
    }
}
