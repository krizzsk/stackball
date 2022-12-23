package com.p243my.target;

import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.f2 */
public class C7399f2 extends C7327b2 {
    public ImageData adIcon;
    public String adIconClickLink;
    public boolean closeOnClick = true;
    public C7327b2 endCard;
    public final List<C7342c2> interstitialAdCards = new ArrayList();
    public final C7698v1 promoStyleSettings = C7698v1.m20637l();
    public int style;
    public C7413g2<VideoData> videoBanner;
    public boolean videoRequired = false;

    public static C7399f2 newBanner() {
        return new C7399f2();
    }

    public void addInterstitialAdCard(C7342c2 c2Var) {
        this.interstitialAdCards.add(c2Var);
    }

    public ImageData getAdIcon() {
        return this.adIcon;
    }

    public String getAdIconClickLink() {
        return this.adIconClickLink;
    }

    public C7327b2 getEndCard() {
        return this.endCard;
    }

    public List<C7342c2> getInterstitialAdCards() {
        return this.interstitialAdCards;
    }

    public C7698v1 getPromoStyleSettings() {
        return this.promoStyleSettings;
    }

    public int getStyle() {
        return this.style;
    }

    public C7413g2<VideoData> getVideoBanner() {
        return this.videoBanner;
    }

    public boolean isCloseOnClick() {
        if (this.videoBanner != null) {
            return false;
        }
        return this.closeOnClick;
    }

    public boolean isVideoRequired() {
        return this.videoRequired;
    }

    public void setAdIcon(ImageData imageData) {
        this.adIcon = imageData;
    }

    public void setAdIconClickLink(String str) {
        this.adIconClickLink = str;
    }

    public void setCloseOnClick(boolean z) {
        this.closeOnClick = z;
    }

    public void setEndCard(C7327b2 b2Var) {
        this.endCard = b2Var;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setVideoBanner(C7413g2<VideoData> g2Var) {
        this.videoBanner = g2Var;
    }

    public void setVideoRequired(boolean z) {
        this.videoRequired = z;
    }
}
