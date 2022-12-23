package com.moat.analytics.mobile.inm;

import android.media.MediaPlayer;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.moat.analytics.mobile.inm.u */
class C7269u extends C7239h implements NativeVideoTracker {

    /* renamed from: m */
    private WeakReference<MediaPlayer> f18239m;

    C7269u(String str) {
        super(str);
        C7261p.m18544a(3, "NativeVideoTracker", (Object) this, "In initialization method.");
        if (str == null || str.isEmpty()) {
            StringBuilder sb = new StringBuilder("PartnerCode is ");
            sb.append(str == null ? "null" : "empty");
            String sb2 = sb.toString();
            C7261p.m18545a("[ERROR] ", 3, "NativeVideoTracker", this, "NativeDisplayTracker creation problem, ".concat(String.valueOf(sb2)));
            this.f18102a = new C7252m(sb2);
        }
        C7261p.m18547a("[SUCCESS] ", mo49337a() + " created");
    }

    /* renamed from: a */
    private void m18573a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.getCurrentPosition();
            } catch (Exception unused) {
                throw new C7252m("Playback has already completed");
            }
        } else {
            throw new C7252m("Null player instance");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo49337a() {
        return "NativeVideoTracker";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49341a(List<String> list) {
        if (!mo49376n()) {
            list.add("Player is null");
        }
        super.mo49341a(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Map<String, Object> mo49359i() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f18239m.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo49376n() {
        WeakReference<MediaPlayer> weakReference = this.f18239m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Integer mo49377o() {
        return Integer.valueOf(((MediaPlayer) this.f18239m.get()).getCurrentPosition());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo49379q() {
        return ((MediaPlayer) this.f18239m.get()).isPlaying();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo49380r() {
        return Integer.valueOf(((MediaPlayer) this.f18239m.get()).getDuration());
    }

    public boolean trackVideoAd(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        try {
            mo49343c();
            mo49345d();
            m18573a(mediaPlayer);
            this.f18239m = new WeakReference<>(mediaPlayer);
            return super.mo49357a(map, view);
        } catch (Exception e) {
            C7252m.m18508a(e);
            String a = C7252m.m18506a("trackVideoAd", e);
            if (this.f18105d != null) {
                this.f18105d.onTrackingFailedToStart(a);
            }
            C7261p.m18544a(3, "NativeVideoTracker", (Object) this, a);
            C7261p.m18547a("[ERROR] ", mo49337a() + " " + a);
            return false;
        }
    }
}
