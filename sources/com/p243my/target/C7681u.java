package com.p243my.target;

import android.content.Context;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.u */
public class C7681u extends C7355d<C7699v2> {
    /* renamed from: a */
    public static C7681u m20505a() {
        return new C7681u();
    }

    /* renamed from: a */
    public C7699v2 mo49976a(C7699v2 v2Var, C7298a aVar, Context context) {
        List<C7435h2> c = v2Var.mo51727c();
        if (c.isEmpty()) {
            C7541m2 b = v2Var.mo51418b();
            if (b == null || !b.mo50848b()) {
                return null;
            }
            return v2Var;
        }
        ArrayList arrayList = new ArrayList();
        int cachePolicy = aVar.getCachePolicy();
        boolean z = cachePolicy == 0 || cachePolicy == 1;
        for (C7435h2 next : c) {
            C7413g2<VideoData> videoBanner = next.getVideoBanner();
            if (videoBanner != null) {
                VideoData mediaData = videoBanner.getMediaData();
                boolean z2 = cachePolicy == 0 || cachePolicy == 2;
                if (mediaData != null && z2 && mediaData.isCacheable()) {
                    mediaData.setData((String) C7480j3.m19502d().mo50288b(mediaData.getUrl(), (String) null, context));
                }
            }
            ImageData image = next.getImage();
            if (image != null) {
                image.useCache(true);
                if (z) {
                    arrayList.add(image);
                }
            }
            ImageData icon = next.getIcon();
            if (icon != null) {
                icon.useCache(true);
                if (z) {
                    arrayList.add(icon);
                }
            }
            for (C7453i2 image2 : next.getNativeAdCards()) {
                ImageData image3 = image2.getImage();
                if (image3 != null) {
                    image3.useCache(true);
                    if (z) {
                        arrayList.add(image3);
                    }
                }
            }
            C7596p1 adChoices = next.getAdChoices();
            if (adChoices != null) {
                ImageData c2 = adChoices.mo51318c();
                c2.useCache(true);
                if (z) {
                    arrayList.add(c2);
                }
            }
            ImageData ctcIcon = next.getCtcIcon();
            if (ctcIcon != null) {
                arrayList.add(ctcIcon);
            }
        }
        if (arrayList.size() > 0) {
            C7509k8.m19616a((List<ImageData>) arrayList).mo50747c(context);
        }
        return v2Var;
    }
}
