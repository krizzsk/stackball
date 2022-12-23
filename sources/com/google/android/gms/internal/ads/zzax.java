package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C3716C;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzax extends zzq<String> {
    private final Object mLock = new Object();
    private zzab<String> zzcn;

    public zzax(int i, String str, zzab<String> zzab, zzy zzy) {
        super(i, str, zzy);
        this.zzcn = zzab;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzh */
    public void zza(String str) {
        zzab<String> zzab;
        synchronized (this.mLock) {
            zzab = this.zzcn;
        }
        if (zzab != null) {
            zzab.zzb(str);
        }
    }

    /* access modifiers changed from: protected */
    public final zzz<String> zza(zzo zzo) {
        String str;
        try {
            byte[] bArr = zzo.data;
            Map<String, String> map = zzo.zzab;
            String str2 = C3716C.ISO88591_NAME;
            String str3 = map.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzo.data);
        }
        return zzz.zza(str, zzas.zzb(zzo));
    }
}
