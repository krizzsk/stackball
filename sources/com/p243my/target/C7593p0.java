package com.p243my.target;

import android.content.Context;
import com.p243my.target.ads.Reward;

/* renamed from: com.my.target.p0 */
public interface C7593p0 {

    /* renamed from: com.my.target.p0$a */
    public interface C7594a {
        void onClick();

        void onDismiss();

        void onDisplay();

        void onLoad();

        void onNoAd(String str);

        void onStartDisplaying();

        void onVideoCompleted();
    }

    /* renamed from: com.my.target.p0$b */
    public interface C7595b {
        void onReward(Reward reward);
    }

    /* renamed from: a */
    void mo49535a(Context context);

    /* renamed from: a */
    void mo49538a(C7595b bVar);

    /* renamed from: c */
    String mo51313c();

    /* renamed from: d */
    float mo51314d();

    void destroy();

    void dismiss();
}
