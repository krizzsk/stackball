package com.smaato.sdk.richmedia.mraid.presenter;

import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p251fi.BiConsumer;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExpandProperties;
import com.smaato.sdk.richmedia.mraid.mvp.Presenter;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;

public interface MraidPresenter extends Presenter<RichMediaAdContentView> {
    void handleClose();

    void handleMraidUrl(String str, boolean z);

    void onFailedToExpand();

    void onFailedToResize(String str);

    void onHtmlLoaded();

    void onWasClosed();

    void onWasExpanded();

    void onWasResized();

    void setAdViolationCallback(BiConsumer<String, String> biConsumer);

    void setOnCollapseCallback(Consumer<Whatever> consumer);

    void setOnExpandCallback(BiConsumer<String, MraidExpandProperties> biConsumer);

    void setOnHideCallback(Consumer<Whatever> consumer);

    void setOnOpenCallback(Consumer<String> consumer);

    void setOnPlayVideoCallback(Consumer<String> consumer);

    void setOnUnloadCallback(Consumer<Whatever> consumer);

    void setResizeCallback(Consumer<ResizeParams> consumer);
}
