package com.mbridge.msdk.video.signal.p235a;

import android.app.Activity;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTContainer;

/* renamed from: com.mbridge.msdk.video.signal.a.i */
/* compiled from: JSBTModule */
public final class C7061i extends C7052b {

    /* renamed from: a */
    private Activity f17562a;

    /* renamed from: b */
    private MBridgeBTContainer f17563b;

    public C7061i(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f17562a = activity;
        this.f17563b = mBridgeBTContainer;
    }

    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f17563b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        MBridgeBTContainer mBridgeBTContainer = this.f17563b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.handlerH5Exception(i, str);
        }
    }

    public final void click(int i, String str) {
        super.click(i, str);
        MBridgeBTContainer mBridgeBTContainer = this.f17563b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.click(i, str);
        }
    }
}
