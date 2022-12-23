package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.fyber.inneractive.sdk.player.p057a.C3123g;
import java.io.File;

/* renamed from: com.fyber.inneractive.sdk.util.d */
public final class C3646d implements C3123g.C3133d {

    /* renamed from: a */
    public Bitmap f9929a;

    /* renamed from: b */
    private File f9930b;

    /* renamed from: a */
    public final void mo18727a(File file) {
        long currentTimeMillis = System.currentTimeMillis();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getPath());
            mediaMetadataRetriever.extractMetadata(8192);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1);
            this.f9929a = frameAtTime;
            if (frameAtTime != null && frameAtTime.getWidth() > 0 && this.f9929a.getHeight() > 0) {
                this.f9930b = file;
            }
        } catch (Exception e) {
            try {
                IAlog.m9034b("Failed getting frame from video file%s", C3670q.m9154a((Throwable) e));
            } catch (Throwable unused) {
            }
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused2) {
        }
        IAlog.m9033a("FirstFrameDownloadMediaProcessor processing finished in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return;
        throw th;
    }

    /* renamed from: b */
    public final boolean mo18728b(File file) {
        File file2 = this.f9930b;
        return (file2 == null || file == null || !file2.getAbsolutePath().equals(file.getAbsolutePath())) ? false : true;
    }
}
