package com.ironsource.p133c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.ServerParameters;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5517c;
import com.ironsource.environment.C5527g;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5710l;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.tapjoy.TapjoyConstants;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.c.b */
public class C5500b {

    /* renamed from: a */
    private C5710l f12660a = new C5710l();

    /* renamed from: com.ironsource.c.b$a */
    public static class C5501a {

        /* renamed from: a */
        final String f12661a;

        /* renamed from: b */
        final String f12662b;

        /* renamed from: c */
        final String f12663c;

        /* renamed from: d */
        final int f12664d;

        /* renamed from: e */
        final int f12665e;

        /* renamed from: f */
        final String f12666f;

        /* renamed from: g */
        ArrayList<Pair<String, String>> f12667g;

        /* renamed from: com.ironsource.c.b$a$a */
        public static class C5502a {

            /* renamed from: a */
            List<Pair<String, String>> f12668a = new ArrayList();

            /* renamed from: b */
            public String f12669b;

            /* renamed from: c */
            public String f12670c = "POST";

            /* renamed from: d */
            public String f12671d;

            /* renamed from: e */
            int f12672e = 15000;

            /* renamed from: f */
            int f12673f = 15000;

            /* renamed from: g */
            String f12674g = "UTF-8";

            /* renamed from: a */
            public final C5502a mo41213a(List<Pair<String, String>> list) {
                this.f12668a.addAll(list);
                return this;
            }

            /* renamed from: a */
            public final C5501a mo41214a() {
                return new C5501a(this);
            }
        }

        public C5501a(C5502a aVar) {
            this.f12661a = aVar.f12669b;
            this.f12662b = aVar.f12670c;
            this.f12663c = aVar.f12671d;
            this.f12667g = new ArrayList<>(aVar.f12668a);
            this.f12664d = aVar.f12672e;
            this.f12665e = aVar.f12673f;
            this.f12666f = aVar.f12674g;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.p133c.C5503c m13052a(com.ironsource.p133c.C5500b.C5501a r7) {
        /*
            java.lang.String r0 = r7.f12661a
            java.lang.String r1 = r7.f12663c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x00ce
            com.ironsource.c.c r0 = new com.ironsource.c.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f12661a     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f12664d     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f12665e     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f12662b     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f12667g     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m13054a((java.net.HttpURLConnection) r2, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f12662b     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r7.f12663c     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r4 = r7.f12666f     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r4 = r3.length     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m13055a((java.net.HttpURLConnection) r2, (byte[]) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x005f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f12675a = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r1 == 0) goto L_0x0071
            byte[] r3 = com.ironsource.environment.C5505a.C55061.m13075a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f12676b = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            if (r2 == 0) goto L_0x00bd
            r2.disconnect()
            goto L_0x00bd
        L_0x007c:
            r7 = move-exception
            goto L_0x00c3
        L_0x007e:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0088
        L_0x0083:
            r7 = move-exception
            r2 = r1
            goto L_0x00c3
        L_0x0086:
            r3 = move-exception
            r2 = r1
        L_0x0088:
            if (r1 == 0) goto L_0x00be
            int r4 = r1.getResponseCode()     // Catch:{ all -> 0x00bf }
            r0.f12675a = r4     // Catch:{ all -> 0x00bf }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00be
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r7.f12661a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            int r7 = r0.f12675a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00bf }
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
            r1.disconnect()
        L_0x00bd:
            return r0
        L_0x00be:
            throw r3     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x00c3:
            if (r1 == 0) goto L_0x00c8
            r1.close()
        L_0x00c8:
            if (r2 == 0) goto L_0x00cd
            r2.disconnect()
        L_0x00cd:
            throw r7
        L_0x00ce:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.p133c.C5500b.m13052a(com.ironsource.c.b$a):com.ironsource.c.c");
    }

    /* renamed from: a */
    public static C5503c m13053a(String str, String str2, List<Pair<String, String>> list) {
        C5501a.C5502a aVar = new C5501a.C5502a();
        aVar.f12669b = str;
        aVar.f12671d = str2;
        aVar.f12670c = "POST";
        aVar.mo41213a(list);
        return m13052a(aVar.mo41214a());
    }

    /* renamed from: a */
    private static void m13054a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair next : list) {
            httpURLConnection.setRequestProperty((String) next.first, (String) next.second);
        }
    }

    /* renamed from: a */
    private static void m13055a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    public void mo41206a(Context context) {
        ContextProvider.getInstance().postOnUIThread(new Runnable(context) {

            /* renamed from: a */
            private /* synthetic */ Context f12715a;

            {
                this.f12715a = r2;
            }

            public final void run() {
                try {
                    C5512a aVar = C5512a.this;
                    Context context = this.f12715a;
                    if (context != null && !aVar.f12714c.getAndSet(true)) {
                        aVar.mo41237a("auid", C5527g.m13181z(context));
                        aVar.mo41237a(ServerParameters.MODEL, C5527g.m13150g());
                        aVar.mo41237a("make", C5527g.m13151h());
                        aVar.mo41237a("os", C5527g.m13153i());
                        String e = C5527g.m13146e();
                        if (e != null) {
                            aVar.mo41237a("osv", e.replaceAll("[^0-9/.]", ""));
                            aVar.mo41237a("osvf", e);
                        }
                        aVar.mo41237a("apilvl", String.valueOf(C5527g.m13147f()));
                        String j = C5527g.m13155j(context);
                        if (j != null && j.length() > 0) {
                            aVar.mo41237a(ServerParameters.CARRIER, j);
                        }
                        String d = C5517c.m13107d(context);
                        if (!TextUtils.isEmpty(d)) {
                            aVar.mo41237a("instlr", d);
                        }
                        String B = C5527g.m13130B(context);
                        if (!TextUtils.isEmpty(B)) {
                            aVar.mo41237a("dt", B);
                        }
                        aVar.mo41237a(BidResponsed.KEY_BID_ID, context.getPackageName());
                        aVar.mo41237a("mem", String.valueOf(C5527g.m13145e(context)));
                        aVar.mo41237a("tkv", MBridgeConstans.NATIVE_VIDEO_VERSION);
                        aVar.mo41237a("tsu", Long.valueOf(C5517c.m13103b(context)));
                        aVar.mo41237a("tai", Long.valueOf(C5517c.m13100a(context)));
                        aVar.mo41237a("apv", C5517c.m13105c(context));
                        aVar.mo41237a("ptype", Integer.valueOf(C5505a.C55061.m13086f(context)));
                        aVar.mo41237a("simop", C5505a.C55061.m13085e(context));
                    }
                    C5512a.this.mo41236a(this.f12715a);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo41207a(String str) {
        C5710l.m14087a("apky", (Object) str);
    }

    /* renamed from: a */
    public void mo41208a(JSONObject jSONObject) {
        C5710l.m14087a("md", (Object) jSONObject);
    }

    /* renamed from: a */
    public void mo41209a(boolean z) {
        C5710l.m14087a("cnst", (Object) Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo41210b(String str) {
        C5710l.m14087a("medv", (Object) str);
    }

    /* renamed from: c */
    public void mo41211c(String str) {
        C5710l.m14087a("sid", (Object) str);
    }

    /* renamed from: d */
    public void mo41212d(String str) {
        C5710l.m14087a(TapjoyConstants.TJC_PLUGIN, (Object) str);
    }
}
