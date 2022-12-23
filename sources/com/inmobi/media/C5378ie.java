package com.inmobi.media;

/* renamed from: com.inmobi.media.ie */
/* compiled from: WifiInfoUtil */
public final class C5378ie {
    /* renamed from: a */
    public static boolean m12452a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: a */
    public static boolean m12451a(int i) {
        return !m12452a(i, 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.inmobi.media.id} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C5377id m12450a(boolean r7, boolean r8) {
        /*
            java.lang.String r0 = "\""
            android.content.Context r1 = com.inmobi.media.C5314go.m12203c()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r3 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0062 }
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch:{ Exception -> 0x0062 }
            android.net.wifi.WifiInfo r1 = r1.getConnectionInfo()     // Catch:{ Exception -> 0x0062 }
            if (r1 == 0) goto L_0x006f
            java.lang.String r3 = r1.getBSSID()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r4 = r1.getSSID()     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x006f
            boolean r7 = m12453a((boolean) r7, (java.lang.String) r4)     // Catch:{ Exception -> 0x0062 }
            if (r7 != 0) goto L_0x006f
            com.inmobi.media.id r7 = new com.inmobi.media.id     // Catch:{ Exception -> 0x0062 }
            r7.<init>()     // Catch:{ Exception -> 0x0062 }
            long r5 = m12449a((java.lang.String) r3)     // Catch:{ Exception -> 0x005f }
            r7.f12316a = r5     // Catch:{ Exception -> 0x005f }
            if (r4 == 0) goto L_0x004b
            boolean r3 = r4.startsWith(r0)     // Catch:{ Exception -> 0x005f }
            if (r3 == 0) goto L_0x004b
            boolean r0 = r4.endsWith(r0)     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x004b
            int r0 = r4.length()     // Catch:{ Exception -> 0x005f }
            r3 = 1
            int r0 = r0 - r3
            java.lang.String r4 = r4.substring(r3, r0)     // Catch:{ Exception -> 0x005f }
        L_0x004b:
            if (r8 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = r4
        L_0x004f:
            r7.f12317b = r2     // Catch:{ Exception -> 0x005f }
            int r8 = r1.getRssi()     // Catch:{ Exception -> 0x005f }
            r7.f12318c = r8     // Catch:{ Exception -> 0x005f }
            int r8 = r1.getIpAddress()     // Catch:{ Exception -> 0x005f }
            r7.f12319d = r8     // Catch:{ Exception -> 0x005f }
            r2 = r7
            goto L_0x006f
        L_0x005f:
            r8 = move-exception
            r2 = r7
            goto L_0x0063
        L_0x0062:
            r8 = move-exception
        L_0x0063:
            com.inmobi.media.fn r7 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r0 = new com.inmobi.media.gk
            r0.<init>(r8)
            r7.mo40590a((com.inmobi.media.C5308gk) r0)
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5378ie.m12450a(boolean, boolean):com.inmobi.media.id");
    }

    /* renamed from: a */
    static boolean m12453a(boolean z, String str) {
        return z && str != null && str.endsWith("_nomap");
    }

    /* renamed from: a */
    static long m12449a(String str) {
        String[] split = str.split("\\:");
        byte[] bArr = new byte[6];
        int i = 0;
        while (i < 6) {
            try {
                bArr[i] = (byte) Integer.parseInt(split[i], 16);
                i++;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        long j = (((long) bArr[5]) & 255) | ((((long) bArr[4]) & 255) << 8);
        return ((((long) bArr[0]) & 255) << 40) | ((((long) bArr[3]) & 255) << 16) | j | ((((long) bArr[2]) & 255) << 24) | ((((long) bArr[1]) & 255) << 32);
    }
}
