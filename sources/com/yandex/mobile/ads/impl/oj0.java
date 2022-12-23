package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdLoader;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class oj0 {

    /* renamed from: a */
    private final Context f38237a;

    /* renamed from: b */
    private final InstreamAdLoader f38238b;

    /* renamed from: c */
    private final InstreamAdRequestConfiguration f38239c;

    /* renamed from: com.yandex.mobile.ads.impl.oj0$a */
    private static class C14188a implements InstreamAdLoadListener {

        /* renamed from: a */
        private final WeakReference<ViewGroup> f38240a;

        /* renamed from: b */
        private final WeakReference<List<bk1>> f38241b;

        /* renamed from: c */
        private final C14189b f38242c;

        C14188a(ViewGroup viewGroup, List<bk1> list, C14189b bVar) {
            this.f38242c = bVar;
            this.f38240a = new WeakReference<>(viewGroup);
            this.f38241b = new WeakReference<>(list);
        }

        public void onInstreamAdFailedToLoad(String str) {
            this.f38242c.mo69172a(str);
        }

        public void onInstreamAdLoaded(InstreamAd instreamAd) {
            ViewGroup viewGroup = (ViewGroup) this.f38240a.get();
            List list = (List) this.f38241b.get();
            if (list == null) {
                list = Collections.emptyList();
            }
            if (viewGroup != null) {
                this.f38242c.mo69171a(viewGroup, list, instreamAd);
            } else {
                this.f38242c.mo69172a("Ad was received but there's no view group to display it");
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oj0$b */
    public interface C14189b {
        /* renamed from: a */
        void mo69171a(ViewGroup viewGroup, List<bk1> list, InstreamAd instreamAd);

        /* renamed from: a */
        void mo69172a(String str);
    }

    public oj0(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f38237a = context.getApplicationContext();
        this.f38239c = instreamAdRequestConfiguration;
        this.f38238b = new InstreamAdLoader(context);
    }

    /* renamed from: a */
    public void mo69168a(ViewGroup viewGroup, List<bk1> list, C14189b bVar) {
        this.f38238b.setInstreamAdLoadListener(new C14188a(viewGroup, list, bVar));
        this.f38238b.loadInstreamAd(this.f38237a, this.f38239c);
    }

    /* renamed from: a */
    public void mo69167a() {
        this.f38238b.setInstreamAdLoadListener((InstreamAdLoadListener) null);
    }
}
