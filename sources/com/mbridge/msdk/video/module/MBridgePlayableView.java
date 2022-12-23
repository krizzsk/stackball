package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.video.signal.factory.C7158b;

public class MBridgePlayableView extends MBridgeH5EndCardView {
    public MBridgePlayableView(Context context) {
        super(context);
    }

    public MBridgePlayableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        super.init(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo48573a() {
        return super.mo48573a();
    }

    public void preLoadData(C7158b bVar) {
        super.preLoadData(bVar);
        super.setLoadPlayable(true);
    }

    public void onBackPress() {
        super.onBackPress();
    }
}
