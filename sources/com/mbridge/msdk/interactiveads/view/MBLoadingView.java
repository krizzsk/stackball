package com.mbridge.msdk.interactiveads.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.tools.C6347k;

public class MBLoadingView extends FrameLayout {

    /* renamed from: a */
    private MBCircleView f15995a;

    /* renamed from: b */
    private MBCircleView f15996b;

    /* renamed from: c */
    private MBCircleView f15997c;

    public MBLoadingView(Context context, AttributeSet attributeSet) {
        super(context);
        View inflate = View.inflate(context, C6347k.m16084a(context, "mbridge_loading_view", "layout"), this);
        if (inflate != null) {
            this.f15995a = (MBCircleView) inflate.findViewById(C6347k.m16084a(context, "mbridge_left", "id"));
            this.f15996b = (MBCircleView) inflate.findViewById(C6347k.m16084a(context, "mbridge_middle", "id"));
            this.f15997c = (MBCircleView) inflate.findViewById(C6347k.m16084a(context, "mbridge_right", "id"));
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            MBCircleView mBCircleView = this.f15995a;
            if (mBCircleView != null) {
                mBCircleView.startAnimationDelay(0);
            }
            MBCircleView mBCircleView2 = this.f15996b;
            if (mBCircleView2 != null) {
                mBCircleView2.startAnimationDelay(200);
            }
            MBCircleView mBCircleView3 = this.f15997c;
            if (mBCircleView3 != null) {
                mBCircleView3.startAnimationDelay(400);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MBCircleView mBCircleView = this.f15995a;
        if (mBCircleView != null) {
            mBCircleView.clearAnimation();
            this.f15995a = null;
        }
        MBCircleView mBCircleView2 = this.f15996b;
        if (mBCircleView2 != null) {
            mBCircleView2.clearAnimation();
            this.f15996b = null;
        }
        MBCircleView mBCircleView3 = this.f15997c;
        if (mBCircleView3 != null) {
            mBCircleView3.clearAnimation();
            this.f15997c = null;
        }
    }
}
