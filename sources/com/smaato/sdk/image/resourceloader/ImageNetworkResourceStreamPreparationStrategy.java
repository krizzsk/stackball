package com.smaato.sdk.image.resourceloader;

import com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;

public class ImageNetworkResourceStreamPreparationStrategy implements NetworkResourceStreamPreparationStrategy {
    private final HeaderUtils headerUtils;

    public ImageNetworkResourceStreamPreparationStrategy(HeaderUtils headerUtils2) {
        this.headerUtils = (HeaderUtils) Objects.requireNonNull(headerUtils2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r4 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream prepare(java.net.URLConnection r4) throws java.io.IOException {
        /*
            r3 = this;
            com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.HeaderUtils r0 = r3.headerUtils
            java.util.Map r1 = r4.getHeaderFields()
            boolean r0 = r0.isChunkedTransferEncoding(r1)
            if (r0 == 0) goto L_0x0047
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x003b }
            com.smaato.sdk.core.util.IOUtils.copy(r4, r0)     // Catch:{ all -> 0x002d }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002d }
            byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x002d }
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            if (r4 == 0) goto L_0x0029
            r4.close()     // Catch:{ all -> 0x003b }
        L_0x0029:
            r0.close()
            return r1
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r2 = move-exception
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ all -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch:{ all -> 0x003b }
        L_0x003a:
            throw r2     // Catch:{ all -> 0x003b }
        L_0x003b:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r4.addSuppressed(r0)
        L_0x0046:
            throw r1
        L_0x0047:
            java.io.InputStream r4 = r4.getInputStream()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.resourceloader.ImageNetworkResourceStreamPreparationStrategy.prepare(java.net.URLConnection):java.io.InputStream");
    }
}
