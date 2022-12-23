package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.C12066R;

public class PlaybackControlsContainer extends FrameLayout {
    public PlaybackControlsContainer(Context context) {
        super(context);
    }

    /* renamed from: a */
    public TextView mo71930a() {
        return (TextView) findViewById(C12066R.C12068id.video_count_down_control);
    }

    /* renamed from: b */
    public CheckBox mo71931b() {
        return (CheckBox) findViewById(C12066R.C12068id.video_mute_control);
    }

    /* renamed from: c */
    public ProgressBar mo71932c() {
        return (ProgressBar) findViewById(C12066R.C12068id.video_progress_control);
    }

    public PlaybackControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlaybackControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PlaybackControlsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
