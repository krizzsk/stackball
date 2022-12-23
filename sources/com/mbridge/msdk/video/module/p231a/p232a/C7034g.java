package com.mbridge.msdk.video.module.p231a.p232a;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.p231a.C7027a;

/* renamed from: com.mbridge.msdk.video.module.a.a.g */
/* compiled from: MiniCardProxyNotifyListener */
public final class C7034g extends C7036i {

    /* renamed from: a */
    private MBridgeClickMiniCardView f17506a;

    public C7034g(MBridgeClickMiniCardView mBridgeClickMiniCardView, C7027a aVar) {
        super(aVar);
        this.f17506a = mBridgeClickMiniCardView;
    }

    /* renamed from: a */
    public final void mo48315a(int i, Object obj) {
        boolean z = false;
        switch (i) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f17506a;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f17506a;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (!z) {
            super.mo48315a(i, obj);
        }
    }
}
