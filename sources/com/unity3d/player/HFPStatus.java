package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

public class HFPStatus {

    /* renamed from: a */
    private Context f23660a;

    /* renamed from: b */
    private BroadcastReceiver f23661b = null;

    /* renamed from: c */
    private Intent f23662c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f23663d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AudioManager f23664e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f23665f = C9523a.f23667a;

    /* renamed from: com.unity3d.player.HFPStatus$a */
    enum C9523a {
        ;

        static {
            f23670d = new int[]{1, 2, 3};
        }
    }

    public HFPStatus(Context context) {
        this.f23660a = context;
        this.f23664e = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    /* renamed from: a */
    public final void mo58591a() {
        deinitHFPStatusJni();
    }

    /* access modifiers changed from: protected */
    public boolean getHFPStat() {
        return this.f23665f == C9523a.f23668b;
    }

    /* access modifiers changed from: protected */
    public void requestHFPStat() {
        C95221 r0 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                if (intExtra == 0) {
                    if (HFPStatus.this.f23663d) {
                        HFPStatus.this.f23664e.setMode(0);
                    }
                    boolean unused = HFPStatus.this.f23663d = false;
                } else if (intExtra == 1) {
                    int unused2 = HFPStatus.this.f23665f = C9523a.f23668b;
                    if (!HFPStatus.this.f23663d) {
                        HFPStatus.this.f23664e.stopBluetoothSco();
                    } else {
                        HFPStatus.this.f23664e.setMode(3);
                    }
                } else if (intExtra == 2) {
                    if (HFPStatus.this.f23665f == C9523a.f23668b) {
                        boolean unused3 = HFPStatus.this.f23663d = true;
                    } else {
                        int unused4 = HFPStatus.this.f23665f = C9523a.f23669c;
                    }
                }
            }
        };
        this.f23661b = r0;
        this.f23662c = this.f23660a.registerReceiver(r0, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f23664e.startBluetoothSco();
        } catch (NullPointerException unused) {
            C9578d.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }
}
