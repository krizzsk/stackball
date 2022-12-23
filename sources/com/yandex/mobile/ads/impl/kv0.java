package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.ErrorCode;
import com.yandex.mobile.ads.impl.C13045fd;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class kv0 {

    /* renamed from: com.yandex.mobile.ads.impl.kv0$b */
    static class C13788b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f36428a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final op1 f36429b;

        private C13788b(String str, op1 op1) {
            this.f36428a = str;
            this.f36429b = op1;
        }
    }

    /* renamed from: a */
    static void m38496a(long j, l41<?> l41, byte[] bArr, int i) {
        if (pp1.f38780b || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = l41;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(l41.mo68345h().mo70002a());
            pp1.m40899b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    static fv0 m38495a(l41<?> l41, long j, List<n90> list) {
        C13045fd.C13046a c = l41.mo68340c();
        if (c == null) {
            return new fv0((int) ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR, (byte[]) null, true, j, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (n90 a : list) {
                treeSet.add(a.mo68936a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<n90> list2 = c.f33326h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (n90 next : c.f33326h) {
                    if (!treeSet.contains(next.mo68936a())) {
                        arrayList.add(next);
                    }
                }
            }
        } else if (!c.f33325g.isEmpty()) {
            for (Map.Entry next2 : c.f33325g.entrySet()) {
                if (!treeSet.contains(next2.getKey())) {
                    arrayList.add(new n90((String) next2.getKey(), (String) next2.getValue()));
                }
            }
        }
        return new fv0((int) ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR, c.f33319a, true, j, (List<n90>) arrayList);
    }

    /* renamed from: a */
    static byte[] m38497a(InputStream inputStream, int i, C12724cd cdVar) throws IOException {
        byte[] bArr;
        l01 l01 = new l01(cdVar, i);
        try {
            bArr = cdVar.mo66255a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    l01.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        pp1.m40901d("Error occurred when closing InputStream", new Object[0]);
                    }
                    cdVar.mo66254a(bArr);
                    l01.close();
                    throw th;
                }
            }
            byte[] byteArray = l01.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                pp1.m40901d("Error occurred when closing InputStream", new Object[0]);
            }
            cdVar.mo66254a(bArr);
            l01.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
            inputStream.close();
            cdVar.mo66254a(bArr);
            l01.close();
            throw th;
        }
    }
}
