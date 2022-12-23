package com.smaato.sdk.richmedia.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.C8847R;

public final class ClosableView extends FrameLayout {
    ImageButton close;
    FrameLayout container = ((FrameLayout) findViewById(C8847R.C8849id.container));
    private OnCloseClickListener listener;

    public interface OnCloseClickListener {
        void onCloseClick();
    }

    public ClosableView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(C8847R.layout.smaato_sdk_richmedia_layout_closable, this, true);
        ImageButton imageButton = (ImageButton) findViewById(C8847R.C8849id.close);
        this.close = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClosableView.this.lambda$new$0$ClosableView(view);
            }
        });
    }

    public /* synthetic */ void lambda$new$0$ClosableView(View view) {
        callOnCloseListener();
    }

    public final ImageButton getCloseButton() {
        return this.close;
    }

    /* access modifiers changed from: package-private */
    public final void addContent(View view) {
        this.container.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void setOnCloseClickListener(OnCloseClickListener onCloseClickListener) {
        this.listener = onCloseClickListener;
    }

    public final void callOnCloseListener() {
        Objects.onNotNull(this.listener, $$Lambda$83SwcdXIyxy0mQX9UE0wcqcKCyA.INSTANCE);
    }
}
