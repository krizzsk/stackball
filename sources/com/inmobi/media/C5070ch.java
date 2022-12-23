package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;

/* renamed from: com.inmobi.media.ch */
/* compiled from: MraidResizeProcessor */
public final class C5070ch {

    /* renamed from: a */
    public C5415m f11603a;

    /* renamed from: b */
    public ViewGroup f11604b;

    /* renamed from: c */
    public int f11605c;

    public C5070ch(C5415m mVar) {
        this.f11603a = mVar;
    }

    /* renamed from: a */
    public final void mo40327a() {
        if (this.f11604b == null) {
            ViewGroup viewGroup = (ViewGroup) this.f11603a.getParent();
            this.f11604b = viewGroup;
            this.f11605c = viewGroup.indexOfChild(this.f11603a);
        }
        C5073cj resizeProperties = this.f11603a.getResizeProperties();
        m11510b();
        m11509a(resizeProperties);
    }

    /* renamed from: b */
    private void m11510b() {
        if (this.f11604b != null) {
            FrameLayout frameLayout = new FrameLayout(this.f11603a.getContainerContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f11603a.getWidth(), this.f11603a.getHeight());
            frameLayout.setId(65535);
            this.f11604b.addView(frameLayout, this.f11605c, layoutParams);
            this.f11604b.removeView(this.f11603a);
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11509a(com.inmobi.media.C5073cj r10) {
        /*
            r9 = this;
            com.inmobi.media.hg r0 = com.inmobi.media.C5343hf.m12333a()
            float r0 = r0.f12242c
            int r1 = r10.width
            float r1 = (float) r1
            float r1 = r1 * r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            int r3 = r10.height
            float r3 = (float) r3
            float r3 = r3 * r0
            float r3 = r3 + r2
            int r0 = (int) r3
            android.view.ViewGroup r2 = r9.f11604b
            r3 = 0
            if (r2 != 0) goto L_0x001d
            r2 = r3
            goto L_0x0021
        L_0x001d:
            android.view.View r2 = r2.getRootView()
        L_0x0021:
            if (r2 == 0) goto L_0x008a
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            com.inmobi.media.m r5 = r9.f11603a
            android.content.Context r5 = r5.getContainerContext()
            r4.<init>(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout
            com.inmobi.media.m r7 = r9.f11603a
            android.content.Context r7 = r7.getContainerContext()
            r6.<init>(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r1, r0)
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r8.<init>(r1, r0)
            r0 = 65534(0xfffe, float:9.1833E-41)
            r4.setId(r0)
            com.inmobi.media.m r0 = r9.f11603a
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x006b
            com.inmobi.media.m r0 = r9.f11603a
            android.view.ViewParent r0 = r0.getParent()
            r3 = r0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x006b:
            if (r3 == 0) goto L_0x0070
            r3.removeAllViews()
        L_0x0070:
            com.inmobi.media.m r0 = r9.f11603a
            r6.addView(r0, r8)
            java.lang.String r0 = r10.customClosePosition
            r9.m11507a((android.view.ViewGroup) r6, (java.lang.String) r0)
            r4.addView(r6, r7)
            r2.addView(r4, r5)
            android.view.ViewGroup r0 = r9.f11604b
            m11508a(r2, r4, r10, r0)
            r10 = 0
            r4.setBackgroundColor(r10)
            return
        L_0x008a:
            r10 = 1
            java.lang.Class<com.inmobi.media.ch> r0 = com.inmobi.media.C5070ch.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "Couldn't process resize request as root view was found null."
            com.inmobi.media.C5327gw.m12263a((byte) r10, (java.lang.String) r0, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5070ch.m11509a(com.inmobi.media.cj):void");
    }

    /* renamed from: a */
    private void m11507a(ViewGroup viewGroup, String str) {
        float f = C5343hf.m12333a().f12242c;
        C5041ca caVar = new C5041ca(this.f11603a.getContainerContext(), f, (byte) 1);
        caVar.setId(65531);
        caVar.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C5070ch.this.f11603a.mo40686b();
            }
        });
        viewGroup.addView(caVar, m11504a(str, f));
    }

    /* renamed from: a */
    private static RelativeLayout.LayoutParams m11504a(String str, float f) {
        String a = m11506a(str);
        int i = (int) (f * 50.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        if (C5073cj.DEFAULT_POSITION.equals(a) || "bottom-right".equals(a)) {
            layoutParams.addRule(11);
        }
        if ("bottom-right".equals(a) || "bottom-left".equals(a) || "bottom-center".equals(a)) {
            layoutParams.addRule(12);
            layoutParams.addRule(4);
        }
        if ("bottom-center".equals(a) || "top-center".equals(a) || "center".equals(a)) {
            layoutParams.addRule(13);
        }
        if ("top-center".equals(a)) {
            layoutParams.addRule(10);
        }
        return layoutParams;
    }

    /* renamed from: a */
    private static String m11506a(String str) {
        if (str == null || str.length() == 0) {
            return C5073cj.DEFAULT_POSITION;
        }
        if ("top-left".equals(str) || C5073cj.DEFAULT_POSITION.equals(str) || "bottom-left".equals(str) || "bottom-right".equals(str) || "top-center".equals(str) || "bottom-center".equals(str) || "center".equals(str)) {
            return str;
        }
        return C5073cj.DEFAULT_POSITION;
    }

    /* renamed from: a */
    private static void m11508a(FrameLayout frameLayout, FrameLayout frameLayout2, C5073cj cjVar, ViewGroup viewGroup) {
        float f = C5343hf.m12333a().f12242c;
        int i = (int) ((((float) cjVar.width) * f) + 0.5f);
        int i2 = (int) ((((float) cjVar.height) * f) + 0.5f);
        int i3 = (int) ((((float) cjVar.offsetY) * f) + 0.5f);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        frameLayout.getLocationOnScreen(iArr2);
        iArr[1] = iArr[1] - iArr2[1];
        iArr[0] = iArr[0] - iArr2[0];
        iArr[0] = iArr[0] + ((int) ((((float) cjVar.offsetX) * f) + 0.5f));
        iArr[1] = iArr[1] + i3;
        if (!cjVar.allowOffscreen.booleanValue()) {
            if (i > frameLayout.getWidth() - iArr[0]) {
                iArr[0] = frameLayout.getWidth() - i;
            }
            if (i2 > frameLayout.getHeight() - iArr[1]) {
                iArr[1] = frameLayout.getHeight() - i2;
            }
            if (iArr[0] < 0) {
                iArr[0] = 0;
            }
            if (iArr[1] < 0) {
                iArr[1] = 0;
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.leftMargin = iArr[0];
        layoutParams.topMargin = iArr[1];
        layoutParams.gravity = GravityCompat.START;
        frameLayout2.setLayoutParams(layoutParams);
    }
}
