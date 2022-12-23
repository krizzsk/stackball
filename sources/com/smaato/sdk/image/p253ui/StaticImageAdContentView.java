package com.smaato.sdk.image.p253ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.smaato.sdk.core.C8590R;
import com.smaato.sdk.core.p250ui.AdContentView;
import com.smaato.sdk.core.p250ui.ProgressView;
import com.smaato.sdk.core.p250ui.WatermarkImageButton;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.image.p252ad.ImageAdObject;

/* renamed from: com.smaato.sdk.image.ui.StaticImageAdContentView */
public final class StaticImageAdContentView extends AdContentView {
    private final View.OnClickListener internalClickListener;

    private StaticImageAdContentView(Context context, ImageAdObject imageAdObject, View.OnClickListener onClickListener) {
        super(context);
        this.internalClickListener = onClickListener;
        ImageView imageView = new ImageView(getContext());
        int dpToPx = UIUtils.dpToPx(getContext(), (float) imageAdObject.getWidth());
        int dpToPx2 = UIUtils.dpToPx(getContext(), (float) imageAdObject.getHeight());
        addView(imageView, generateDefaultLayoutParams(dpToPx, dpToPx2));
        addView(new WatermarkImageButton(getContext()));
        imageView.setImageBitmap(imageAdObject.getBitmap());
        setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx2, 17));
        super.setOnClickListener(this.internalClickListener);
    }

    public static StaticImageAdContentView create(Context context, ImageAdObject imageAdObject, View.OnClickListener onClickListener) {
        return new StaticImageAdContentView((Context) Objects.requireNonNull(context, "Parameter context cannot be null for StaticImageAdContentView::create"), (ImageAdObject) Objects.requireNonNull(imageAdObject, "Parameter imageAdObject cannot be null for StaticImageAdContentView::create"), (View.OnClickListener) Objects.requireNonNull(onClickListener, "Parameter internalClickListener cannot be null for StaticImageAdContentView::create"));
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener(onClickListener) {
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                StaticImageAdContentView.this.lambda$setOnClickListener$1$StaticImageAdContentView(this.f$1, view);
            }
        });
    }

    public /* synthetic */ void lambda$setOnClickListener$1$StaticImageAdContentView(View.OnClickListener onClickListener, View view) {
        this.internalClickListener.onClick(view);
        Objects.onNotNull(onClickListener, new Consumer(view) {
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((View.OnClickListener) obj).onClick(this.f$0);
            }
        });
    }

    public final void showProgressIndicator(boolean z) {
        Threads.ensureMainThread();
        if (z) {
            addView(new ProgressView(getContext()));
        } else {
            removeView((ProgressView) findViewById(C8590R.C8592id.smaato_sdk_core_progress_view_id));
        }
    }
}
