package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TIMEOUT_MS = 10000;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    /* access modifiers changed from: private */
    public static long elapsedRealtimeOffsetMs;
    /* access modifiers changed from: private */
    public static boolean isInitialized;
    /* access modifiers changed from: private */
    public static final Object loaderLock = new Object();
    private static String ntpHost = DEFAULT_NTP_HOST;
    /* access modifiers changed from: private */
    public static final Object valueLock = new Object();

    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    private SntpClient() {
    }

    public static String getNtpHost() {
        String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static void setNtpHost(String str) {
        synchronized (valueLock) {
            if (!ntpHost.equals(str)) {
                ntpHost = str;
                isInitialized = false;
            }
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (valueLock) {
            z = isInitialized;
        }
        return z;
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j;
        synchronized (valueLock) {
            j = isInitialized ? elapsedRealtimeOffsetMs : -9223372036854775807L;
        }
        return j;
    }

    public static void initialize(Loader loader, InitializationCallback initializationCallback) {
        if (!isInitialized()) {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
        } else if (initializationCallback != null) {
            initializationCallback.onInitialized();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0078, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0079, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0073, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long loadNtpTimeOffsetMs() throws java.io.IOException {
        /*
            java.lang.String r0 = getNtpHost()
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)
            java.net.DatagramSocket r1 = new java.net.DatagramSocket
            r1.<init>()
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setSoTimeout(r2)     // Catch:{ all -> 0x0071 }
            r2 = 48
            byte[] r3 = new byte[r2]     // Catch:{ all -> 0x0071 }
            java.net.DatagramPacket r4 = new java.net.DatagramPacket     // Catch:{ all -> 0x0071 }
            r5 = 123(0x7b, float:1.72E-43)
            r4.<init>(r3, r2, r0, r5)     // Catch:{ all -> 0x0071 }
            r0 = 27
            r5 = 0
            r3[r5] = r0     // Catch:{ all -> 0x0071 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0071 }
            r0 = 40
            writeTimestamp(r3, r0, r6)     // Catch:{ all -> 0x0071 }
            r1.send(r4)     // Catch:{ all -> 0x0071 }
            java.net.DatagramPacket r4 = new java.net.DatagramPacket     // Catch:{ all -> 0x0071 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x0071 }
            r1.receive(r4)     // Catch:{ all -> 0x0071 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0071 }
            long r8 = r10 - r8
            long r6 = r6 + r8
            byte r2 = r3[r5]     // Catch:{ all -> 0x0071 }
            int r2 = r2 >> 6
            r2 = r2 & 3
            byte r2 = (byte) r2     // Catch:{ all -> 0x0071 }
            byte r4 = r3[r5]     // Catch:{ all -> 0x0071 }
            r4 = r4 & 7
            byte r4 = (byte) r4     // Catch:{ all -> 0x0071 }
            r5 = 1
            byte r5 = r3[r5]     // Catch:{ all -> 0x0071 }
            r5 = r5 & 255(0xff, float:3.57E-43)
            r8 = 24
            long r8 = readTimestamp(r3, r8)     // Catch:{ all -> 0x0071 }
            r12 = 32
            long r12 = readTimestamp(r3, r12)     // Catch:{ all -> 0x0071 }
            long r14 = readTimestamp(r3, r0)     // Catch:{ all -> 0x0071 }
            checkValidServerReply(r2, r4, r5, r14)     // Catch:{ all -> 0x0071 }
            long r12 = r12 - r8
            long r14 = r14 - r6
            long r12 = r12 + r14
            r2 = 2
            long r12 = r12 / r2
            long r6 = r6 + r12
            long r6 = r6 - r10
            r1.close()
            return r6
        L_0x0071:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x007c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.SntpClient.loadNtpTimeOffsetMs():long");
    }

    private static long readTimestamp(byte[] bArr, int i) {
        long read32 = read32(bArr, i);
        long read322 = read32(bArr, i + 4);
        if (read32 == 0 && read322 == 0) {
            return 0;
        }
        return ((read32 - OFFSET_1900_TO_1970) * 1000) + ((read322 * 1000) / 4294967296L);
    }

    private static void writeTimestamp(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + OFFSET_1900_TO_1970;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j4 >> 24));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j4 >> 16));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j4 >> 8));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j4 >> 0));
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j5 >> 24));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j5 >> 16));
        bArr[i7] = (byte) ((int) (j5 >> 8));
        bArr[i7 + 1] = (byte) ((int) (Math.random() * 255.0d));
    }

    private static long read32(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + 128;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    private static void checkValidServerReply(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + b2);
        } else if (i == 0 || i > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    private static final class NtpTimeLoadable implements Loader.Loadable {
        public void cancelLoad() {
        }

        private NtpTimeLoadable() {
        }

        public void load() throws IOException {
            synchronized (SntpClient.loaderLock) {
                synchronized (SntpClient.valueLock) {
                    if (!SntpClient.isInitialized) {
                        long access$400 = SntpClient.loadNtpTimeOffsetMs();
                        synchronized (SntpClient.valueLock) {
                            long unused = SntpClient.elapsedRealtimeOffsetMs = access$400;
                            boolean unused2 = SntpClient.isInitialized = true;
                        }
                    }
                }
            }
        }
    }

    private static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        private final InitializationCallback callback;

        public void onLoadCanceled(Loader.Loadable loadable, long j, long j2, boolean z) {
        }

        public NtpTimeCallback(InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        public void onLoadCompleted(Loader.Loadable loadable, long j, long j2) {
            if (this.callback == null) {
                return;
            }
            if (!SntpClient.isInitialized()) {
                this.callback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
            } else {
                this.callback.onInitialized();
            }
        }

        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
            InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }
    }
}
