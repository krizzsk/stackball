package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.mbsignalcommon.p207c.C6539a;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.i */
/* compiled from: WindVaneSignalCommunication */
public final class C6565i implements Handler.Callback, C6559c {

    /* renamed from: a */
    protected Pattern f16372a;

    /* renamed from: b */
    protected String f16373b;

    /* renamed from: c */
    protected final int f16374c = 1;

    /* renamed from: d */
    protected Context f16375d;

    /* renamed from: e */
    protected WindVaneWebView f16376e;

    /* renamed from: f */
    protected Handler f16377f;

    public C6565i(Context context) {
        this.f16375d = context;
        this.f16377f = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public final void mo44512a(WindVaneWebView windVaneWebView) {
        this.f16376e = windVaneWebView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44514b(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 2
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L_0x000d
            goto L_0x006c
        L_0x000d:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r7.f16376e
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = com.mbridge.msdk.mbsignalcommon.mraid.C6552c.m16862a(r3, r8)
            if (r3 == 0) goto L_0x001a
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f16376e
            r3.f16345a = r8
            goto L_0x006d
        L_0x001a:
            java.util.regex.Pattern r3 = r7.f16372a
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L_0x006c
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = new com.mbridge.msdk.mbsignalcommon.windvane.a
            r3.<init>()
            int r4 = r8.groupCount()
            r5 = 5
            if (r4 < r5) goto L_0x0038
            java.lang.String r5 = r8.group(r5)
            r3.f16350f = r5
        L_0x0038:
            r5 = 3
            if (r4 < r5) goto L_0x006c
            java.lang.String r4 = r8.group(r2)
            r3.f16348d = r4
            java.lang.String r4 = r8.group(r0)
            r3.f16351g = r4
            java.lang.String r8 = r8.group(r5)
            r3.f16349e = r8
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.C6538e.f16309k
            if (r8 == 0) goto L_0x0067
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.C6538e.f16309k
            java.lang.String r4 = r3.f16349e
            boolean r8 = r8.containsKey(r4)
            if (r8 == 0) goto L_0x0067
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.C6538e.f16309k
            java.lang.String r4 = r3.f16349e
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r3.f16349e = r8
        L_0x0067:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f16376e
            r3.f16345a = r8
            goto L_0x006d
        L_0x006c:
            r3 = r1
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            return
        L_0x0070:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.f16345a
            if (r8 != 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.f16345a
            java.lang.String r1 = r3.f16348d
            java.lang.Object r1 = r8.getJsObject(r1)
        L_0x007d:
            if (r1 != 0) goto L_0x0080
            goto L_0x00c9
        L_0x0080:
            android.content.Context r8 = r7.f16375d     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.String r4 = r4.getName()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            com.mbridge.msdk.mbsignalcommon.c.a$c r8 = com.mbridge.msdk.mbsignalcommon.p207c.C6539a.m16804a(r8, r4)     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.String r4 = r3.f16349e     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r5 = 0
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r0[r5] = r6     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r2] = r5     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            com.mbridge.msdk.mbsignalcommon.c.a$d r8 = r8.mo44436a(r4, r0)     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r8.mo44438a()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x00c9
            boolean r0 = r1 instanceof com.mbridge.msdk.mbsignalcommon.windvane.C6564h     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            if (r0 == 0) goto L_0x00c9
            r3.f16346b = r1     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r3.f16347c = r8     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r3.f16346b = r1     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            android.os.Message r8 = android.os.Message.obtain()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r8.what = r2     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r8.obj = r3     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            android.os.Handler r0 = r7.f16377f     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r0.sendMessage(r8)     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            goto L_0x00c9
        L_0x00c0:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00c9
        L_0x00c5:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.windvane.C6565i.mo44514b(java.lang.String):void");
    }

    public final boolean handleMessage(Message message) {
        String str;
        C6557a aVar = (C6557a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what != 1) {
                return false;
            }
            Object obj = aVar.f16346b;
            C6539a.C6544d dVar = aVar.f16347c;
            Object[] objArr = new Object[2];
            objArr[0] = aVar;
            if (TextUtils.isEmpty(aVar.f16350f)) {
                str = "{}";
            } else {
                str = aVar.f16350f;
            }
            objArr[1] = str;
            dVar.mo44437a(obj, objArr);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final boolean mo44513a(String str) {
        if (!C6566j.m16900a(str)) {
            return false;
        }
        this.f16372a = C6566j.m16901b(str);
        this.f16373b = str;
        return true;
    }
}
