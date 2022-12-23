package com.p243my.target;

import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.h2 */
public class C7435h2 extends C7768z1 {
    public C7479j2 content;
    public ImageData ctcIcon;
    public String ctcText = "Try to play";
    public final List<C7453i2> nativeAdCards = new ArrayList();
    public C7413g2<VideoData> videoBanner;

    public static C7435h2 newBanner() {
        return new C7435h2();
    }

    public void addNativeAdCard(C7453i2 i2Var) {
        this.nativeAdCards.add(i2Var);
    }

    public C7479j2 getContent() {
        return this.content;
    }

    public ImageData getCtcIcon() {
        return this.ctcIcon;
    }

    public String getCtcText() {
        return this.ctcText;
    }

    public List<C7453i2> getNativeAdCards() {
        return new ArrayList(this.nativeAdCards);
    }

    public C7413g2<VideoData> getVideoBanner() {
        return this.videoBanner;
    }

    public void setContent(C7479j2 j2Var) {
        this.content = j2Var;
    }

    public void setCtcIcon(ImageData imageData) {
        this.ctcIcon = imageData;
    }

    public void setCtcText(String str) {
        this.ctcText = str;
    }

    public void setVideoBanner(C7413g2<VideoData> g2Var) {
        this.videoBanner = g2Var;
    }
}
