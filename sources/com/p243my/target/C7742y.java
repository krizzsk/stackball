package com.p243my.target;

import android.content.Context;
import com.p243my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.y */
public class C7742y extends C7355d<C7718w2> {
    /* renamed from: a */
    public static C7742y m20834a() {
        return new C7742y();
    }

    /* renamed from: a */
    public C7718w2 mo49976a(C7718w2 w2Var, C7298a aVar, Context context) {
        if (aVar.getCachePeriod() > 0 && !w2Var.mo51790m() && w2Var.mo51787j() != null) {
            C7442h8 a = C7442h8.m19263a(context);
            int slotId = aVar.getSlotId();
            if (a != null) {
                a.mo50315a(slotId, w2Var.mo51787j().toString(), false);
            } else {
                C7374e0.m18989a("unable to open disk cache and save data for slotId " + slotId);
            }
        }
        int cachePolicy = aVar.getCachePolicy();
        if (cachePolicy == 0 || cachePolicy == 1) {
            ArrayList arrayList = new ArrayList();
            for (C7497k2 next : w2Var.mo51774c()) {
                ImageData statusIcon = next.getStatusIcon();
                ImageData coinsIcon = next.getCoinsIcon();
                ImageData gotoAppIcon = next.getGotoAppIcon();
                ImageData icon = next.getIcon();
                ImageData labelIcon = next.getLabelIcon();
                ImageData bubbleIcon = next.getBubbleIcon();
                ImageData itemHighlightIcon = next.getItemHighlightIcon();
                ImageData crossNotifIcon = next.getCrossNotifIcon();
                if (statusIcon != null) {
                    arrayList.add(statusIcon);
                }
                if (coinsIcon != null) {
                    arrayList.add(coinsIcon);
                }
                if (gotoAppIcon != null) {
                    arrayList.add(gotoAppIcon);
                }
                if (icon != null) {
                    arrayList.add(icon);
                }
                if (labelIcon != null) {
                    arrayList.add(labelIcon);
                }
                if (bubbleIcon != null) {
                    arrayList.add(bubbleIcon);
                }
                if (itemHighlightIcon != null) {
                    arrayList.add(itemHighlightIcon);
                }
                if (crossNotifIcon != null) {
                    arrayList.add(crossNotifIcon);
                }
            }
            if (arrayList.size() > 0) {
                C7509k8.m19616a((List<ImageData>) arrayList).mo50747c(context);
            }
        }
        return w2Var;
    }
}
