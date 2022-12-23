package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

public class FMODAudioDevice implements Runnable {

    /* renamed from: h */
    private static int f44218h = 0;

    /* renamed from: i */
    private static int f44219i = 1;

    /* renamed from: j */
    private static int f44220j = 2;

    /* renamed from: k */
    private static int f44221k = 3;

    /* renamed from: a */
    private volatile Thread f44222a = null;

    /* renamed from: b */
    private volatile boolean f44223b = false;

    /* renamed from: c */
    private AudioTrack f44224c = null;

    /* renamed from: d */
    private boolean f44225d = false;

    /* renamed from: e */
    private ByteBuffer f44226e = null;

    /* renamed from: f */
    private byte[] f44227f = null;

    /* renamed from: g */
    private volatile C15638a f44228g;

    private native int fmodGetInfo(int i);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f44224c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f44224c.stop();
            }
            this.f44224c.release();
            this.f44224c = null;
        }
        this.f44226e = null;
        this.f44227f = null;
        this.f44225d = false;
    }

    public synchronized void close() {
        stop();
    }

    /* access modifiers changed from: package-private */
    public native int fmodProcessMicData(ByteBuffer byteBuffer, int i);

    public boolean isRunning() {
        return this.f44222a != null && this.f44222a.isAlive();
    }

    public void run() {
        int i = 3;
        while (this.f44223b) {
            if (!this.f44225d && i > 0) {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(f44218h);
                int round = Math.round(((float) AudioTrack.getMinBufferSize(fmodGetInfo, 12, 2)) * 1.1f) & -4;
                int fmodGetInfo2 = fmodGetInfo(f44219i);
                int fmodGetInfo3 = fmodGetInfo(f44220j) * fmodGetInfo2 * 4;
                AudioTrack audioTrack = new AudioTrack(3, fmodGetInfo, 12, 2, fmodGetInfo3 > round ? fmodGetInfo3 : round, 1);
                this.f44224c = audioTrack;
                boolean z = audioTrack.getState() == 1;
                this.f44225d = z;
                if (z) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fmodGetInfo2 * 2 * 2);
                    this.f44226e = allocateDirect;
                    this.f44227f = new byte[allocateDirect.capacity()];
                    this.f44224c.play();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f44224c.getState() + ")");
                    releaseAudioTrack();
                    i += -1;
                }
            }
            if (this.f44225d) {
                if (fmodGetInfo(f44221k) == 1) {
                    fmodProcess(this.f44226e);
                    ByteBuffer byteBuffer = this.f44226e;
                    byteBuffer.get(this.f44227f, 0, byteBuffer.capacity());
                    this.f44224c.write(this.f44227f, 0, this.f44226e.capacity());
                    this.f44226e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f44222a != null) {
            stop();
        }
        this.f44222a = new Thread(this, "FMODAudioDevice");
        this.f44222a.setPriority(10);
        this.f44223b = true;
        this.f44222a.start();
        if (this.f44228g != null) {
            this.f44228g.mo74557b();
        }
    }

    public synchronized int startAudioRecord(int i, int i2, int i3) {
        if (this.f44228g == null) {
            this.f44228g = new C15638a(this, i, i2);
            this.f44228g.mo74557b();
        }
        return this.f44228g.mo74556a();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:16:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            java.lang.Thread r0 = r1.f44222a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0011
            r0 = 0
            r1.f44223b = r0     // Catch:{ all -> 0x001c }
            java.lang.Thread r0 = r1.f44222a     // Catch:{ InterruptedException -> 0x0001 }
            r0.join()     // Catch:{ InterruptedException -> 0x0001 }
            r0 = 0
            r1.f44222a = r0     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0011:
            org.fmod.a r0 = r1.f44228g     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            org.fmod.a r0 = r1.f44228g     // Catch:{ all -> 0x001c }
            r0.mo74558c()     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fmod.FMODAudioDevice.stop():void");
    }

    public synchronized void stopAudioRecord() {
        if (this.f44228g != null) {
            this.f44228g.mo74558c();
            this.f44228g = null;
        }
    }
}
