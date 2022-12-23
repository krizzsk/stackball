package com.vungle.warren.p261ui.contract;

import android.content.DialogInterface;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.p261ui.JavascriptBridge;
import com.vungle.warren.p261ui.PresenterAdOpenCallback;
import com.vungle.warren.p261ui.state.OptionsState;
import com.vungle.warren.utility.ActivityManager;

/* renamed from: com.vungle.warren.ui.contract.AdContract */
public interface AdContract {

    /* renamed from: com.vungle.warren.ui.contract.AdContract$AdStopReason */
    public @interface AdStopReason {
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;
    }

    /* renamed from: com.vungle.warren.ui.contract.AdContract$AdView */
    public interface AdView<T extends AdvertisementPresenter> {
        void close();

        void destroyAdView(long j);

        String getWebsiteUrl();

        boolean hasWebView();

        void open(String str, String str2, ActivityManager.LeftApplicationCallback leftApplicationCallback, PresenterAdOpenCallback presenterAdOpenCallback);

        void pauseWeb();

        void refreshDialogIfVisible();

        void removeWebView();

        void resumeWeb();

        void setImmersiveMode();

        void setOrientation(int i);

        void setPresenter(T t);

        void showCloseButton();

        void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener);

        void showWebsite(String str);
    }

    /* renamed from: com.vungle.warren.ui.contract.AdContract$AdvertisementBus */
    public interface AdvertisementBus {
        public static final String ACTION = "AdvertisementBus";
        public static final String COMMAND = "command";
        public static final String PLACEMENT = "placement";
        public static final String STOP_ALL = "stopAll";
    }

    /* renamed from: com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter */
    public interface AdvertisementPresenter<T extends AdView> extends JavascriptBridge.MraidHandler {

        /* renamed from: com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener */
        public interface EventListener {
            void onError(VungleException vungleException, String str);

            void onNext(String str, String str2, String str3);
        }

        void attach(T t, OptionsState optionsState);

        void detach(int i);

        void generateSaveState(OptionsState optionsState);

        boolean handleExit();

        void onViewConfigurationChanged();

        void restoreFromSave(OptionsState optionsState);

        void setEventListener(EventListener eventListener);

        void start();

        void stop(int i);
    }
}
