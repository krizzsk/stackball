package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.C9567a;

public class AudioVolumeHandler implements C9567a.C9569b {

    /* renamed from: a */
    private C9567a f23656a;

    AudioVolumeHandler(Context context) {
        C9567a aVar = new C9567a(context);
        this.f23656a = aVar;
        aVar.mo58730a(this);
    }

    /* renamed from: a */
    public final void mo58569a() {
        this.f23656a.mo58729a();
        this.f23656a = null;
    }

    public final native void onAudioVolumeChanged(int i);
}
