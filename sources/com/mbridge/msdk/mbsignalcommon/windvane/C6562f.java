package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.base.C6538e;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.f */
/* compiled from: WindVaneApiManager */
public final class C6562f {

    /* renamed from: a */
    private static HashMap<String, Class> f16364a = new HashMap<>();

    /* renamed from: b */
    private Context f16365b;

    /* renamed from: c */
    private Object f16366c;

    /* renamed from: d */
    private WindVaneWebView f16367d;

    public C6562f(Context context, WindVaneWebView windVaneWebView) {
        this.f16365b = context;
        this.f16367d = windVaneWebView;
        try {
            mo44520a(C6538e.f16299a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            mo44520a(C6538e.f16300b, Class.forName("com.mbridge.msdk.video.signal.communication.RewardSignal"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            mo44520a(C6538e.f16301c, Class.forName("com.mbridge.msdk.video.signal.communication.VideoCommunication"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            mo44520a(C6538e.f16302d, Class.forName("com.mbridge.msdk.interactiveads.signalcommon.Interactive"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            mo44520a(C6538e.f16303e, Class.forName("com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            mo44520a(C6538e.f16304f, Class.forName("com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            mo44520a(C6538e.f16305g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused7) {
        }
        try {
            mo44520a(C6538e.f16306h, Class.forName("com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal"));
        } catch (ClassNotFoundException unused8) {
        }
    }

    /* renamed from: a */
    public final void mo44518a(Context context) {
        this.f16365b = context;
    }

    /* renamed from: a */
    public final void mo44519a(Object obj) {
        this.f16366c = obj;
    }

    /* renamed from: a */
    private Object m16886a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f16364a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!C6564h.class.isAssignableFrom(cls)) {
                return null;
            }
            C6564h hVar = (C6564h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f16366c, windVaneWebView);
            return hVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo44520a(String str, Class cls) {
        if (f16364a == null) {
            f16364a = new HashMap<>();
        }
        f16364a.put(str, cls);
    }

    /* renamed from: a */
    public final Object mo44517a(String str) {
        if (f16364a == null) {
            f16364a = new HashMap<>();
        }
        return m16886a(str, this.f16367d, this.f16365b);
    }
}
