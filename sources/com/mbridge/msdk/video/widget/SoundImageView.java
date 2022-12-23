package com.mbridge.msdk.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C6347k;

public class SoundImageView extends ImageView {

    /* renamed from: a */
    private boolean f17868a = true;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SoundImageView(Context context) {
        super(context);
    }

    public boolean getStatus() {
        return this.f17868a;
    }

    public void setSoundStatus(boolean z) {
        this.f17868a = z;
        if (z) {
            setImageResource(C6347k.m16084a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(C6347k.m16084a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }
}
