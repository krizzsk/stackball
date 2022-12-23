package com.fyber.inneractive.sdk.player.p057a;

/* renamed from: com.fyber.inneractive.sdk.player.a.i */
final class C3136i extends C3104b {

    /* renamed from: a */
    private final boolean f7745a;

    protected C3136i(boolean z) {
        this.f7745a = z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:53|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r4.release();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae A[Catch:{ all -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18676a(com.fyber.inneractive.sdk.player.p057a.C3103a r9) {
        /*
            r8 = this;
            int r0 = com.fyber.inneractive.sdk.player.p057a.C3104b.C3105a.f7635c
            android.media.MediaPlayer r1 = new android.media.MediaPlayer
            r1.<init>()
            boolean r2 = r9.mo18675b()
            r3 = 0
            if (r2 == 0) goto L_0x007e
            r2 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0064 }
            java.io.File r5 = r9.mo18672a()     // Catch:{ all -> 0x0064 }
            r4.<init>(r5)     // Catch:{ all -> 0x0064 }
            java.io.File r2 = r9.mo18672a()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1.setDataSource(r2)     // Catch:{ all -> 0x0062 }
            r1.prepare()     // Catch:{ all -> 0x0062 }
            int r2 = r1.getDuration()     // Catch:{ all -> 0x0062 }
            if (r2 <= 0) goto L_0x0075
            int r0 = com.fyber.inneractive.sdk.player.p057a.C3104b.C3105a.f7633a     // Catch:{ all -> 0x0062 }
            int r2 = r1.getVideoWidth()     // Catch:{ all -> 0x0062 }
            if (r2 <= 0) goto L_0x0054
            int r2 = r1.getVideoHeight()     // Catch:{ all -> 0x0062 }
            if (r2 <= 0) goto L_0x0054
            java.lang.String r2 = "video.width"
            int r5 = r1.getVideoWidth()     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0062 }
            r8.mo18678a(r2, r5)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "video.height"
            int r5 = r1.getVideoHeight()     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0062 }
            r8.mo18678a(r2, r5)     // Catch:{ all -> 0x0062 }
        L_0x0054:
            java.lang.String r2 = "video.duration"
            int r5 = r1.getDuration()     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0062 }
            r8.mo18678a(r2, r5)     // Catch:{ all -> 0x0062 }
            goto L_0x0075
        L_0x0062:
            r2 = move-exception
            goto L_0x0068
        L_0x0064:
            r4 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L_0x0068:
            java.lang.String r5 = "Exception raised while trying to open a cache candidate"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0079 }
            com.fyber.inneractive.sdk.util.IAlog.m9032a((java.lang.String) r5, (java.lang.Throwable) r2, (java.lang.Object[]) r6)     // Catch:{ all -> 0x0079 }
            boolean r2 = r9.f7626c     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            int r0 = com.fyber.inneractive.sdk.player.p057a.C3104b.C3105a.f7634b     // Catch:{ all -> 0x0079 }
        L_0x0075:
            com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r4)
            goto L_0x007e
        L_0x0079:
            r9 = move-exception
            com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r4)
            throw r9
        L_0x007e:
            r1.release()     // Catch:{ all -> 0x0082 }
            goto L_0x0083
        L_0x0082:
        L_0x0083:
            boolean r1 = r8.f7745a
            r2 = 1
            if (r1 == 0) goto L_0x0091
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r1 >= r4) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r1 = 0
            goto L_0x0092
        L_0x0091:
            r1 = 1
        L_0x0092:
            if (r1 != 0) goto L_0x00d1
            int r4 = com.fyber.inneractive.sdk.player.p057a.C3104b.C3105a.f7633a
            if (r0 != r4) goto L_0x00d1
            android.media.MediaExtractor r4 = new android.media.MediaExtractor
            r4.<init>()
            java.io.File r5 = r9.mo18672a()     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x00cc }
            r4.setDataSource(r5)     // Catch:{ all -> 0x00cc }
        L_0x00a8:
            int r5 = r4.getTrackCount()     // Catch:{ all -> 0x00cc }
            if (r3 >= r5) goto L_0x00c6
            android.media.MediaFormat r5 = r4.getTrackFormat(r3)     // Catch:{ all -> 0x00cc }
            java.lang.String r6 = "mime"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x00cc }
            if (r5 == 0) goto L_0x00c3
            java.lang.String r6 = "video/"
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x00cc }
            if (r5 == 0) goto L_0x00c3
            goto L_0x00c7
        L_0x00c3:
            int r3 = r3 + 1
            goto L_0x00a8
        L_0x00c6:
            r2 = r1
        L_0x00c7:
            r4.release()     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = r2
            goto L_0x00d1
        L_0x00cc:
            r4.release()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d1
        L_0x00d0:
        L_0x00d1:
            int r2 = com.fyber.inneractive.sdk.player.p057a.C3104b.C3105a.f7633a
            if (r0 != r2) goto L_0x00e1
            if (r1 != 0) goto L_0x00e1
            boolean r9 = r9.f7626c
            if (r9 == 0) goto L_0x00de
            int r9 = com.fyber.inneractive.sdk.player.p057a.C3104b.C3105a.f7634b
            goto L_0x00e0
        L_0x00de:
            int r9 = com.fyber.inneractive.sdk.player.p057a.C3104b.C3105a.f7635c
        L_0x00e0:
            r0 = r9
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3136i.mo18676a(com.fyber.inneractive.sdk.player.a.a):int");
    }
}
