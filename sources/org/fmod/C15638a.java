package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: org.fmod.a */
final class C15638a implements Runnable {

    /* renamed from: a */
    private final FMODAudioDevice f44229a;

    /* renamed from: b */
    private final ByteBuffer f44230b;

    /* renamed from: c */
    private final int f44231c;

    /* renamed from: d */
    private final int f44232d;

    /* renamed from: e */
    private final int f44233e = 2;

    /* renamed from: f */
    private volatile Thread f44234f;

    /* renamed from: g */
    private volatile boolean f44235g;

    /* renamed from: h */
    private AudioRecord f44236h;

    /* renamed from: i */
    private boolean f44237i;

    C15638a(FMODAudioDevice fMODAudioDevice, int i, int i2) {
        this.f44229a = fMODAudioDevice;
        this.f44231c = i;
        this.f44232d = i2;
        this.f44230b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, 2));
    }

    /* renamed from: d */
    private void m45534d() {
        AudioRecord audioRecord = this.f44236h;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f44236h.stop();
            }
            this.f44236h.release();
            this.f44236h = null;
        }
        this.f44230b.position(0);
        this.f44237i = false;
    }

    /* renamed from: a */
    public final int mo74556a() {
        return this.f44230b.capacity();
    }

    /* renamed from: b */
    public final void mo74557b() {
        if (this.f44234f != null) {
            mo74558c();
        }
        this.f44235g = true;
        this.f44234f = new Thread(this);
        this.f44234f.start();
    }

    /* renamed from: c */
    public final void mo74558c() {
        while (this.f44234f != null) {
            this.f44235g = false;
            try {
                this.f44234f.join();
                this.f44234f = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void run() {
        int i = 3;
        while (this.f44235g) {
            if (!this.f44237i && i > 0) {
                m45534d();
                AudioRecord audioRecord = new AudioRecord(1, this.f44231c, this.f44232d, this.f44233e, this.f44230b.capacity());
                this.f44236h = audioRecord;
                int state = audioRecord.getState();
                boolean z = true;
                if (state != 1) {
                    z = false;
                }
                this.f44237i = z;
                if (z) {
                    this.f44230b.position(0);
                    this.f44236h.startRecording();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f44236h.getState() + ")");
                    i += -1;
                    m45534d();
                }
            }
            if (this.f44237i && this.f44236h.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f44236h;
                ByteBuffer byteBuffer = this.f44230b;
                this.f44229a.fmodProcessMicData(this.f44230b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f44230b.position(0);
            }
        }
        m45534d();
    }
}
