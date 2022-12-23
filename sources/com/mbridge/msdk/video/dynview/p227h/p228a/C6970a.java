package com.mbridge.msdk.video.dynview.p227h.p228a;

import android.graphics.Bitmap;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.video.dynview.p225f.C6956a;
import com.mbridge.msdk.video.dynview.p227h.C6969a;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.h.a.a */
/* compiled from: ChoiceOneDrawBitBg */
public class C6970a {

    /* renamed from: a */
    private static volatile C6970a f17176a;

    /* renamed from: b */
    private View f17177b;

    /* renamed from: c */
    private Bitmap f17178c;

    /* renamed from: d */
    private Bitmap f17179d;

    private C6970a() {
    }

    /* renamed from: a */
    public static C6970a m17581a() {
        C6970a aVar;
        if (f17176a != null) {
            return f17176a;
        }
        synchronized (C6970a.class) {
            if (f17176a == null) {
                f17176a = new C6970a();
            }
            aVar = f17176a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo48488a(Map map, C6925b bVar, View view) {
        Bitmap bitmap;
        List<CampaignEx> g;
        this.f17177b = view;
        int e = bVar.mo48424e();
        float d = bVar.mo48423d();
        float c = bVar.mo48422c();
        if (map != null && map.size() > 1 && (g = bVar.mo48426g()) != null && g.size() > 1) {
            if (map.get(SameMD5.getMD5(g.get(0).getImageUrl())) != null && (map.get(SameMD5.getMD5(g.get(0).getImageUrl())) instanceof Bitmap)) {
                Bitmap bitmap2 = (Bitmap) map.get(SameMD5.getMD5(g.get(0).getImageUrl()));
                if (!(g.get(0) == null || bitmap2 == null || bitmap2.isRecycled())) {
                    this.f17178c = C6969a.m17579a().mo48487a(bitmap2, 0);
                }
            }
            if (map.get(SameMD5.getMD5(g.get(1).getImageUrl())) != null && (map.get(SameMD5.getMD5(g.get(1).getImageUrl())) instanceof Bitmap)) {
                Bitmap bitmap3 = (Bitmap) map.get(SameMD5.getMD5(g.get(1).getImageUrl()));
                if (g.get(1) != null && !bitmap3.isRecycled()) {
                    this.f17179d = C6969a.m17579a().mo48487a(bitmap3, 1);
                }
            }
        }
        Bitmap bitmap4 = this.f17178c;
        if (bitmap4 != null && !bitmap4.isRecycled() && (bitmap = this.f17179d) != null && !bitmap.isRecycled()) {
            m17582a(e, d, c, this.f17178c, this.f17179d);
        }
    }

    /* renamed from: a */
    private synchronized void m17582a(int i, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        this.f17177b.setBackground(C6956a.m17540a().mo48464a(i).mo48463a(f).mo48467b(f2).mo48465a(bitmap).mo48468b(bitmap2).mo48466a());
    }

    /* renamed from: b */
    public final void mo48489b() {
        if (this.f17177b != null) {
            this.f17177b = null;
        }
        Bitmap bitmap = this.f17178c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f17178c.recycle();
            this.f17178c = null;
        }
        Bitmap bitmap2 = this.f17179d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f17179d.recycle();
            this.f17179d = null;
        }
    }
}
