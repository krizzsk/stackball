package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.ea */
public final class C12963ea {

    /* renamed from: c */
    public static final C12963ea f32938c = new C12963ea(new int[]{2}, 8);

    /* renamed from: d */
    private static final C12963ea f32939d = new C12963ea(new int[]{2, 5, 6}, 8);

    /* renamed from: a */
    private final int[] f32940a;

    /* renamed from: b */
    private final int f32941b;

    public C12963ea(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f32940a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f32940a = new int[0];
        }
        this.f32941b = i;
    }

    /* renamed from: a */
    public static C12963ea m35606a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if ((ih1.f34858a >= 17 && ((sk0) x11.f42358a.mo70789b()).mo70005a().equals(ih1.f34860c)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f32939d;
        }
        if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f32938c;
        }
        return new C12963ea(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12963ea)) {
            return false;
        }
        C12963ea eaVar = (C12963ea) obj;
        if (!Arrays.equals(this.f32940a, eaVar.f32940a) || this.f32941b != eaVar.f32941b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f32941b + (Arrays.hashCode(this.f32940a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f32941b + ", supportedEncodings=" + Arrays.toString(this.f32940a) + "]";
    }

    /* renamed from: a */
    public boolean mo66788a(int i) {
        return Arrays.binarySearch(this.f32940a, i) >= 0;
    }

    /* renamed from: a */
    public int mo66787a() {
        return this.f32941b;
    }
}
