package com.mbridge.msdk.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.out.NativeListener;

public class MBAdChoice extends MBImageView {

    /* renamed from: a */
    private static String f18063a = "MBAdChoice";

    /* renamed from: b */
    private String f18064b = "";

    /* renamed from: c */
    private String f18065c = "";

    /* renamed from: d */
    private String f18066d = "";

    /* renamed from: e */
    private Context f18067e;

    public MBAdChoice(Context context) {
        super(context);
        this.f18067e = context;
        m18360a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18067e = context;
        m18360a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18067e = context;
        m18360a();
    }

    /* renamed from: a */
    private void m18360a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (android.text.TextUtils.isEmpty(r4.mo42665J()) == false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCampaign(com.mbridge.msdk.out.Campaign r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.mbridge.msdk.foundation.entity.CampaignEx
            if (r0 == 0) goto L_0x0093
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r2 = r4.getAdchoice()
            if (r2 == 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r2 = r4.getAdchoice()
            java.lang.String r2 = r2.mo43505e()
            r3.f18064b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r2 = r4.getAdchoice()
            java.lang.String r2 = r2.mo43504d()
            r3.f18066d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0040
            com.mbridge.msdk.foundation.entity.CampaignEx$a r4 = r4.getAdchoice()
            java.lang.String r4 = r4.mo43506f()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x007a
            com.mbridge.msdk.b.b r4 = com.mbridge.msdk.p158b.C6076b.m15089a()
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r2 = r2.mo42896e()
            com.mbridge.msdk.b.a r4 = r4.mo42749b(r2)
            if (r4 == 0) goto L_0x0078
            java.lang.String r2 = r4.mo42664I()
            r3.f18064b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0078
            java.lang.String r2 = r4.mo42666K()
            r3.f18066d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0078
            java.lang.String r4 = r4.mo42665J()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r4 = r0
        L_0x007a:
            java.lang.String r0 = r3.f18064b
            r3.setImageUrl(r0)
            if (r4 == 0) goto L_0x0093
            android.content.Context r4 = r3.f18067e
            if (r4 == 0) goto L_0x0093
            com.mbridge.msdk.foundation.same.c.b r4 = com.mbridge.msdk.foundation.same.p168c.C6216b.m15729a((android.content.Context) r4)
            java.lang.String r0 = r3.f18064b
            com.mbridge.msdk.widget.MBAdChoice$1 r1 = new com.mbridge.msdk.widget.MBAdChoice$1
            r1.<init>()
            r4.mo43786a((java.lang.String) r0, (com.mbridge.msdk.foundation.same.p168c.C6219c) r1)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.widget.MBAdChoice.setCampaign(com.mbridge.msdk.out.Campaign):void");
    }

    public boolean performClick() {
        if (TextUtils.isEmpty(this.f18066d)) {
            return true;
        }
        C6364t.m16177b(this.f18067e, this.f18066d, (NativeListener.NativeTrackingListener) null);
        return true;
    }
}
