package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* renamed from: com.inmobi.media.h */
/* compiled from: AdContainer */
public interface C5331h {

    /* renamed from: com.inmobi.media.h$a */
    /* compiled from: AdContainer */
    public interface C5332a {
        /* renamed from: a */
        void mo40700a();

        /* renamed from: a */
        void mo40701a(Object obj);

        /* renamed from: b */
        void mo40702b(Object obj);
    }

    /* renamed from: a */
    void mo40683a();

    /* renamed from: a */
    void mo40684a(byte b, Map<String, String> map);

    /* renamed from: a */
    void mo40685a(String str);

    /* renamed from: b */
    void mo40686b();

    /* renamed from: c */
    boolean mo40687c();

    /* renamed from: d */
    void mo40688d();

    void destroy();

    /* renamed from: e */
    void mo40690e();

    /* renamed from: f */
    void mo40691f();

    C5220ev getAdConfig();

    Object getDataModel();

    C5332a getFullScreenEventsListener();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    C5098cz getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}
