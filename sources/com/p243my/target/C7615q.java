package com.p243my.target;

import android.content.Context;
import android.graphics.Point;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.q */
public class C7615q extends C7355d<C7665t2> {
    /* renamed from: a */
    public static C7615q m20116a() {
        return new C7615q();
    }

    /* renamed from: a */
    public final ImageData mo51356a(List<ImageData> list, int i, int i2) {
        float f;
        float f2;
        ImageData imageData = null;
        if (list.size() == 0) {
            return null;
        }
        if (i2 == 0 || i == 0) {
            C7374e0.m18989a("[InterstitialAdResultProcessor] display size is zero");
            return null;
        }
        float f3 = (float) i;
        float f4 = (float) i2;
        float f5 = f3 / f4;
        float f6 = 0.0f;
        for (ImageData next : list) {
            if (next.getWidth() > 0 && next.getHeight() > 0) {
                float width = ((float) next.getWidth()) / ((float) next.getHeight());
                if (f5 < width) {
                    f = (float) next.getWidth();
                    if (f > f3) {
                        f = f3;
                    }
                    f2 = f / width;
                } else {
                    float height = (float) next.getHeight();
                    if (height > f4) {
                        height = f4;
                    }
                    float f7 = height;
                    f = width * height;
                    f2 = f7;
                }
                float f8 = f2 * f;
                if (f8 <= f6) {
                    break;
                }
                imageData = next;
                f6 = f8;
            }
        }
        return imageData;
    }

    /* renamed from: a */
    public C7665t2 mo49976a(C7665t2 t2Var, C7298a aVar, Context context) {
        C7327b2 c = t2Var.mo51571c();
        if (c == null) {
            C7541m2 b = t2Var.mo51418b();
            if (b == null || !b.mo50848b()) {
                return null;
            }
            return t2Var;
        } else if (mo51359a(context, c)) {
            return t2Var;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo51358a(C7359d2 d2Var, Context context) {
        ArrayList arrayList = new ArrayList();
        C7596p1 adChoices = d2Var.getAdChoices();
        if (adChoices != null) {
            arrayList.add(adChoices.mo51318c());
        }
        ImageData closeIcon = d2Var.getCloseIcon();
        if (closeIcon != null) {
            arrayList.add(closeIcon);
        }
        C7509k8.m19616a((List<ImageData>) arrayList).mo50747c(context);
    }

    /* renamed from: a */
    public final boolean mo51359a(Context context, C7327b2 b2Var) {
        if (b2Var instanceof C7399f2) {
            return mo51361a((C7399f2) b2Var, context);
        }
        if (b2Var instanceof C7377e2) {
            return mo51360a((C7377e2) b2Var, context);
        }
        if (!(b2Var instanceof C7359d2)) {
            return false;
        }
        mo51358a((C7359d2) b2Var, context);
        return true;
    }

    /* renamed from: a */
    public final boolean mo51360a(C7377e2 e2Var, Context context) {
        ImageData closeIcon;
        ArrayList arrayList = new ArrayList();
        Point b = C7761y8.m20944b(context);
        ImageData a = mo51356a(e2Var.getPortraitImages(), Math.min(b.x, b.y), Math.max(b.x, b.y));
        if (a != null) {
            arrayList.add(a);
            e2Var.setOptimalPortraitImage(a);
        }
        ImageData a2 = mo51356a(e2Var.getLandscapeImages(), Math.max(b.x, b.y), Math.min(b.x, b.y));
        if (a2 != null) {
            arrayList.add(a2);
            e2Var.setOptimalLandscapeImage(a2);
        }
        if (!((a == null && a2 == null) || (closeIcon = e2Var.getCloseIcon()) == null)) {
            arrayList.add(closeIcon);
        }
        C7596p1 adChoices = e2Var.getAdChoices();
        if (adChoices != null) {
            arrayList.add(adChoices.mo51318c());
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        C7509k8.m19616a((List<ImageData>) arrayList).mo50747c(context);
        if (a == null || a.getBitmap() == null) {
            return (a2 == null || a2.getBitmap() == null) ? false : true;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo51361a(C7399f2 f2Var, Context context) {
        ArrayList arrayList = new ArrayList();
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            if (videoBanner.getPreview() != null) {
                arrayList.add(videoBanner.getPreview());
            }
            VideoData mediaData = videoBanner.getMediaData();
            if (mediaData != null && mediaData.isCacheable()) {
                String str = (String) C7480j3.m19502d().mo50288b(mediaData.getUrl(), (String) null, context);
                if (str != null) {
                    mediaData.setData(str);
                } else if (f2Var.isVideoRequired()) {
                    return false;
                }
            }
        }
        if (f2Var.getImage() != null) {
            arrayList.add(f2Var.getImage());
        }
        if (f2Var.getIcon() != null) {
            arrayList.add(f2Var.getIcon());
        }
        if (f2Var.getCloseIcon() != null) {
            arrayList.add(f2Var.getCloseIcon());
        }
        if (f2Var.getAdIcon() != null) {
            arrayList.add(f2Var.getAdIcon());
        }
        if (f2Var.getAdChoices() != null) {
            arrayList.add(f2Var.getAdChoices().mo51318c());
        }
        ImageData i = f2Var.getPromoStyleSettings().mo51722i();
        if (i != null) {
            arrayList.add(i);
        }
        List<C7342c2> interstitialAdCards = f2Var.getInterstitialAdCards();
        if (!interstitialAdCards.isEmpty()) {
            for (C7342c2 image : interstitialAdCards) {
                ImageData image2 = image.getImage();
                if (image2 != null) {
                    arrayList.add(image2);
                }
            }
        }
        C7327b2 endCard = f2Var.getEndCard();
        if (endCard != null && !mo51359a(context, endCard)) {
            f2Var.setEndCard((C7327b2) null);
        }
        if (arrayList.size() <= 0) {
            return true;
        }
        C7509k8.m19616a((List<ImageData>) arrayList).mo50747c(context);
        return true;
    }
}
