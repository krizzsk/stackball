package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.endcard.C6939a;
import com.mbridge.msdk.video.dynview.endcard.C6948c;

public class MBridgeRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C6948c f17267a;

    /* renamed from: b */
    private boolean f17268b;

    /* renamed from: c */
    private AnimatorSet f17269c;

    /* renamed from: d */
    private boolean f17270d;

    /* renamed from: e */
    private C6939a f17271e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f17269c = animatorSet;
    }

    public void setMoreOfferShowFailedCallBack(C6948c cVar) {
        this.f17267a = cVar;
    }

    public void setMoreOfferCacheReportCallBack(C6939a aVar) {
        this.f17271e = aVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f17269c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C6948c cVar;
        super.onDetachedFromWindow();
        if (!this.f17268b && (cVar = this.f17267a) != null) {
            this.f17268b = true;
            cVar.mo48458a();
        }
        AnimatorSet animatorSet = this.f17269c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C6939a aVar;
        super.onVisibilityChanged(view, i);
        if ((view instanceof MBridgeRelativeLayout) && i == 0 && (aVar = this.f17271e) != null && !this.f17270d) {
            this.f17270d = true;
            aVar.mo48447a();
        }
    }
}
