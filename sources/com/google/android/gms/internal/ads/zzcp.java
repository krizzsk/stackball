package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcp implements Runnable {
    private zzcp() {
    }

    public final void run() {
        try {
            MessageDigest unused = zzcn.zzng = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException unused2) {
        } finally {
            zzcn.zznj.countDown();
        }
    }
}
