package com.p243my.target.nativeads;

import android.content.Context;
import android.widget.ImageView;
import com.p243my.target.C7328b3;
import com.p243my.target.C7374e0;
import com.p243my.target.C7412g1;
import com.p243my.target.C7424g8;
import com.p243my.target.C7497k2;
import com.p243my.target.C7509k8;
import com.p243my.target.C7618q2;
import com.p243my.target.C7659s8;
import com.p243my.target.C7711w;
import com.p243my.target.C7718w2;
import com.p243my.target.C7741x8;
import com.p243my.target.common.BaseAd;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.nativeads.banners.NativeAppwallBanner;
import com.p243my.target.nativeads.views.AppwallAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeAppwallAd */
public final class NativeAppwallAd extends BaseAd {
    private static final String DEFAULT_TITLE = "Apps";
    private static final int DEFAULT_TITLE_BACKGROUND_COLOR = -12232093;
    private static final int DEFAULT_TITLE_SUPPLEMENTARY_COLOR = -13220531;
    private static final int DEFAULT_TITLE_TEXT_COLOR = -1;
    private final ArrayList<NativeAppwallBanner> banners = new ArrayList<>();
    private final HashMap<NativeAppwallBanner, C7497k2> bannersMap = new HashMap<>();
    private final C7424g8 clickHandler = C7424g8.m19196a();
    private final Context context;
    private C7412g1 engine;
    private boolean hideStatusBarInDialog = false;
    private AppwallAdListener listener;
    private C7718w2 section;
    private String title = DEFAULT_TITLE;
    private int titleBackgroundColor = DEFAULT_TITLE_BACKGROUND_COLOR;
    private int titleSupplementaryColor = DEFAULT_TITLE_SUPPLEMENTARY_COLOR;
    private int titleTextColor = -1;
    /* access modifiers changed from: private */
    public WeakReference<AppwallAdView> viewWeakReference;

    /* renamed from: com.my.target.nativeads.NativeAppwallAd$AppwallAdListener */
    public interface AppwallAdListener {
        void onClick(NativeAppwallBanner nativeAppwallBanner, NativeAppwallAd nativeAppwallAd);

        void onDismiss(NativeAppwallAd nativeAppwallAd);

        void onDisplay(NativeAppwallAd nativeAppwallAd);

        void onLoad(NativeAppwallAd nativeAppwallAd);

        void onNoAd(String str, NativeAppwallAd nativeAppwallAd);
    }

    public NativeAppwallAd(int i, Context context2) {
        super(i, "appwall");
        this.context = context2;
        this.adConfig.setCachePolicy(0);
        C7374e0.m18991c("NativeAppwallAd created. Version: 5.15.0");
    }

    /* access modifiers changed from: private */
    public void handleResult(C7718w2 w2Var, String str) {
        AppwallAdListener appwallAdListener = this.listener;
        if (appwallAdListener != null) {
            if (w2Var == null) {
                if (str == null) {
                    str = "no ad";
                }
                appwallAdListener.onNoAd(str, this);
                return;
            }
            this.section = w2Var;
            for (C7497k2 next : w2Var.mo51774c()) {
                NativeAppwallBanner newBanner = NativeAppwallBanner.newBanner(next);
                this.banners.add(newBanner);
                this.bannersMap.put(newBanner, next);
            }
            this.listener.onLoad(this);
        }
    }

    public static void loadImageToView(ImageData imageData, ImageView imageView) {
        C7509k8.m19623b(imageData, imageView);
    }

    public void destroy() {
        unregisterAppwallAdView();
        C7412g1 g1Var = this.engine;
        if (g1Var != null) {
            g1Var.mo50164a();
            this.engine = null;
        }
        this.listener = null;
    }

    public void dismiss() {
        C7412g1 g1Var = this.engine;
        if (g1Var != null) {
            g1Var.mo50169b();
        }
    }

    public ArrayList<NativeAppwallBanner> getBanners() {
        return this.banners;
    }

    public long getCachePeriod() {
        return this.adConfig.getCachePeriod();
    }

    public AppwallAdListener getListener() {
        return this.listener;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTitleBackgroundColor() {
        return this.titleBackgroundColor;
    }

    public int getTitleSupplementaryColor() {
        return this.titleSupplementaryColor;
    }

    public int getTitleTextColor() {
        return this.titleTextColor;
    }

    public void handleBannerClick(NativeAppwallBanner nativeAppwallBanner) {
        C7497k2 k2Var = this.bannersMap.get(nativeAppwallBanner);
        if (k2Var != null) {
            this.clickHandler.mo50243a(k2Var, this.context);
            if (this.section != null) {
                nativeAppwallBanner.setHasNotification(false);
                C7659s8.m20379a(this.section, this.adConfig).mo51540a(k2Var, false, this.context);
            }
            AppwallAdListener appwallAdListener = this.listener;
            if (appwallAdListener != null) {
                appwallAdListener.onClick(nativeAppwallBanner, this);
                return;
            }
            return;
        }
        C7374e0.m18989a("unable to handle banner click: no internal banner for id " + nativeAppwallBanner.getId());
    }

    public void handleBannerShow(NativeAppwallBanner nativeAppwallBanner) {
        C7497k2 k2Var = this.bannersMap.get(nativeAppwallBanner);
        if (k2Var != null) {
            C7741x8.m20827c((List<C7328b3>) k2Var.getStatHolder().mo49800a("playbackStarted"), this.context);
            return;
        }
        C7374e0.m18989a("unable to handle banner show: no internal banner for id " + nativeAppwallBanner.getId());
    }

    public void handleBannersShow(List<NativeAppwallBanner> list) {
        ArrayList arrayList = new ArrayList();
        for (NativeAppwallBanner next : list) {
            C7497k2 k2Var = this.bannersMap.get(next);
            if (k2Var != null) {
                C7374e0.m18989a("Ad shown, banner Id = " + next.getId());
                arrayList.addAll(k2Var.getStatHolder().mo49800a("playbackStarted"));
            } else {
                C7374e0.m18989a("unable to handle banner show: no internal banner for id " + next.getId());
            }
        }
        if (arrayList.size() > 0) {
            C7741x8.m20827c((List<C7328b3>) arrayList, this.context);
        }
    }

    public boolean hasNotifications() {
        for (NativeAppwallBanner isHasNotification : this.bannersMap.keySet()) {
            if (isHasNotification.isHasNotification()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoLoadImages() {
        int cachePolicy = this.adConfig.getCachePolicy();
        return cachePolicy == 0 || cachePolicy == 1;
    }

    public boolean isHideStatusBarInDialog() {
        return this.hideStatusBarInDialog;
    }

    public void load() {
        if (isLoadCalled()) {
            C7374e0.m18989a("Appwall ad doesn't support multiple load");
            return;
        }
        C7711w.m20691a(this.adConfig, this.metricFactory).mo49685a(new C7711w.C7714c() {
            /* renamed from: a */
            public final void mo49446a(C7618q2 q2Var, String str) {
                NativeAppwallAd.this.handleResult((C7718w2) q2Var, str);
            }
        }).mo49692b(this.metricFactory.mo50803a(), this.context);
    }

    public String prepareBannerClickLink(NativeAppwallBanner nativeAppwallBanner) {
        C7497k2 k2Var = this.bannersMap.get(nativeAppwallBanner);
        if (k2Var != null) {
            C7741x8.m20827c((List<C7328b3>) k2Var.getStatHolder().mo49800a("click"), this.context);
            C7718w2 w2Var = this.section;
            if (w2Var != null) {
                C7659s8.m20379a(w2Var, this.adConfig).mo51540a(k2Var, false, this.context);
            }
            return k2Var.getTrackingLink();
        }
        C7374e0.m18989a("unable to handle banner click: no internal banner for id " + nativeAppwallBanner.getId());
        return null;
    }

    public void registerAppwallAdView(AppwallAdView appwallAdView) {
        unregisterAppwallAdView();
        this.viewWeakReference = new WeakReference<>(appwallAdView);
        appwallAdView.setAppwallAdViewListener(new AppwallAdView.AppwallAdViewListener() {
            public void onBannerClick(NativeAppwallBanner nativeAppwallBanner) {
                AppwallAdView appwallAdView;
                NativeAppwallAd.this.handleBannerClick(nativeAppwallBanner);
                if (NativeAppwallAd.this.viewWeakReference != null && (appwallAdView = (AppwallAdView) NativeAppwallAd.this.viewWeakReference.get()) != null) {
                    appwallAdView.notifyDataSetChanged();
                }
            }

            public void onBannersShow(List<NativeAppwallBanner> list) {
                NativeAppwallAd.this.handleBannersShow(list);
            }
        });
    }

    public void setAutoLoadImages(boolean z) {
        this.adConfig.setCachePolicy(0);
    }

    public void setCachePeriod(long j) {
        this.adConfig.setCachePeriod(j);
    }

    public void setHideStatusBarInDialog(boolean z) {
        this.hideStatusBarInDialog = z;
    }

    public void setListener(AppwallAdListener appwallAdListener) {
        this.listener = appwallAdListener;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleBackgroundColor(int i) {
        this.titleBackgroundColor = i;
    }

    public void setTitleSupplementaryColor(int i) {
        this.titleSupplementaryColor = i;
    }

    public void setTitleTextColor(int i) {
        this.titleTextColor = i;
    }

    public void show() {
        if (this.section == null || this.banners.size() <= 0) {
            C7374e0.m18991c("NativeAppwallAd.show: No ad");
            return;
        }
        if (this.engine == null) {
            this.engine = C7412g1.m19164a(this);
        }
        this.engine.mo50166a(this.context);
    }

    public void unregisterAppwallAdView() {
        WeakReference<AppwallAdView> weakReference = this.viewWeakReference;
        if (weakReference != null) {
            AppwallAdView appwallAdView = (AppwallAdView) weakReference.get();
            if (appwallAdView != null) {
                appwallAdView.setAppwallAdViewListener((AppwallAdView.AppwallAdViewListener) null);
            }
            this.viewWeakReference.clear();
            this.viewWeakReference = null;
        }
    }
}
