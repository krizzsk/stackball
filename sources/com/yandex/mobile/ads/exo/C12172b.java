package com.yandex.mobile.ads.exo;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import com.yandex.mobile.ads.exo.C12172b;
import com.yandex.mobile.ads.impl.ih1;

/* renamed from: com.yandex.mobile.ads.exo.b */
final class C12172b {

    /* renamed from: a */
    private final AudioManager f29553a;

    /* renamed from: b */
    private final C12173a f29554b;

    /* renamed from: c */
    private C12174b f29555c;

    /* renamed from: d */
    private int f29556d;

    /* renamed from: e */
    private float f29557e = 1.0f;

    /* renamed from: com.yandex.mobile.ads.exo.b$a */
    private class C12173a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f29558a;

        public C12173a(Handler handler) {
            this.f29558a = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m31705a(int i) {
            C12172b.m31700a(C12172b.this, i);
        }

        public void onAudioFocusChange(int i) {
            this.f29558a.post(new Runnable(i) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C12172b.C12173a.this.m31705a(this.f$1);
                }
            });
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.b$b */
    public interface C12174b {
    }

    public C12172b(Context context, Handler handler, C12174b bVar) {
        this.f29553a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f29555c = bVar;
        this.f29554b = new C12173a(handler);
        this.f29556d = 0;
    }

    /* renamed from: a */
    static void m31700a(C12172b bVar, int i) {
        bVar.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                bVar.m31701b(3);
                return;
            }
            bVar.m31699a(0);
            bVar.m31701b(2);
        } else if (i == -1) {
            bVar.m31699a(-1);
            bVar.m31698a();
        } else if (i != 1) {
            Log.w("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            bVar.m31701b(1);
            bVar.m31699a(1);
        }
    }

    /* renamed from: b */
    public float mo64786b() {
        return this.f29557e;
    }

    /* renamed from: c */
    public void mo64787c() {
        this.f29555c = null;
        m31698a();
    }

    /* renamed from: b */
    private void m31701b(int i) {
        if (this.f29556d != i) {
            this.f29556d = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f29557e != f) {
                this.f29557e = f;
                C12174b bVar = this.f29555c;
                if (bVar != null) {
                    C12266p.this.m32153p();
                }
            }
        }
    }

    /* renamed from: a */
    public int mo64785a(boolean z, int i) {
        m31698a();
        return z ? 1 : -1;
    }

    /* renamed from: a */
    private void m31698a() {
        if (this.f29556d != 0) {
            if (ih1.f34858a < 26) {
                this.f29553a.abandonAudioFocus(this.f29554b);
            }
            m31701b(0);
        }
    }

    /* renamed from: a */
    private void m31699a(int i) {
        C12174b bVar = this.f29555c;
        if (bVar != null) {
            C12266p pVar = C12266p.this;
            pVar.m32142a(pVar.mo64915e(), i);
        }
    }
}
