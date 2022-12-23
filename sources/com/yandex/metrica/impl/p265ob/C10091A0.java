package com.yandex.metrica.impl.p265ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.support.p003v4.media.session.PlaybackStateCompat;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.A0 */
public class C10091A0 {

    /* renamed from: a */
    private final Context f24298a;

    /* renamed from: b */
    private final C10093b f24299b;

    /* renamed from: com.yandex.metrica.impl.ob.A0$a */
    public static class C10092a {

        /* renamed from: a */
        public final long f24300a;

        /* renamed from: b */
        public final long f24301b;

        public C10092a(long j, long j2) {
            this.f24300a = j;
            this.f24301b = j2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.A0$b */
    static class C10093b {
        C10093b() {
        }
    }

    public C10091A0(Context context) {
        this(context, new C10093b());
    }

    /* renamed from: a */
    public C10092a mo61040a() {
        long j;
        long j2 = 0;
        if (C10796U2.m27890a(26)) {
            StorageStatsManager storageStatsManager = (StorageStatsManager) this.f24298a.getSystemService("storagestats");
            StorageManager storageManager = (StorageManager) this.f24298a.getSystemService("storage");
            if (storageManager == null || storageStatsManager == null) {
                j = 0;
            } else {
                long j3 = 0;
                for (StorageVolume uuid : storageManager.getStorageVolumes()) {
                    try {
                        String uuid2 = uuid.getUuid();
                        UUID fromString = uuid2 == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid2);
                        j2 += storageStatsManager.getTotalBytes(fromString);
                        j3 += storageStatsManager.getFreeBytes(fromString);
                    } catch (Throwable unused) {
                    }
                }
                long j4 = j2;
                j2 = j3;
                j = j4;
            }
            return new C10092a(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, j2 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        } else if (C10796U2.m27890a(18)) {
            try {
                this.f24299b.getClass();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                return new C10092a((statFs.getBlockCountLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, (statFs.getAvailableBlocksLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            } catch (Throwable unused2) {
                return new C10092a(0, 0);
            }
        } else {
            try {
                this.f24299b.getClass();
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSize = (long) statFs2.getBlockSize();
                return new C10092a((((long) statFs2.getBlockCount()) * blockSize) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, (((long) statFs2.getAvailableBlocks()) * blockSize) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            } catch (Throwable unused3) {
                return new C10092a(0, 0);
            }
        }
    }

    C10091A0(Context context, C10093b bVar) {
        this.f24298a = context;
        this.f24299b = bVar;
    }
}
