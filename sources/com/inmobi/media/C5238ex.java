package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.ex */
/* compiled from: Config */
public abstract class C5238ex {
    private C5257fh includeIds = new C5257fh();
    @C5351hl
    private String mAccountId;

    /* renamed from: b */
    public abstract String mo40557b();

    /* renamed from: c */
    public abstract JSONObject mo40558c();

    /* renamed from: d */
    public abstract boolean mo40559d();

    public C5238ex(String str) {
        this.mAccountId = str;
    }

    /* renamed from: f */
    public C5257fh mo40563f() {
        return this.includeIds;
    }

    /* renamed from: g */
    public String mo40564g() {
        return this.mAccountId;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof C5238ex)) {
            return false;
        }
        C5238ex exVar = (C5238ex) obj;
        if (!exVar.mo40557b().equals(mo40557b())) {
            return false;
        }
        if ((this.mAccountId != null || exVar.mAccountId != null) && ((str = this.mAccountId) == null || !str.equals(exVar.mAccountId))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = mo40557b().hashCode();
        String str = this.mAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C5238ex m11980a(java.lang.String r1, java.lang.String r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -60641721: goto L_0x0044;
                case 3579: goto L_0x003a;
                case 96432: goto L_0x0030;
                case 3506402: goto L_0x0026;
                case 780346297: goto L_0x001c;
                case 1728886350: goto L_0x0012;
                case 2088265419: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x004e
        L_0x0008:
            java.lang.String r0 = "signals"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 5
            goto L_0x004f
        L_0x0012:
            java.lang.String r0 = "appOwnership"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 7
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "telemetry"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 6
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "root"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 4
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "ads"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r0 = "pk"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "crashReporting"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x004e:
            r1 = -1
        L_0x004f:
            switch(r1) {
                case 2: goto L_0x0076;
                case 3: goto L_0x0070;
                case 4: goto L_0x006a;
                case 5: goto L_0x0064;
                case 6: goto L_0x005e;
                case 7: goto L_0x0058;
                default: goto L_0x0052;
            }
        L_0x0052:
            com.inmobi.media.ev r1 = new com.inmobi.media.ev
            r1.<init>(r2)
            goto L_0x007b
        L_0x0058:
            com.inmobi.media.ew r1 = new com.inmobi.media.ew
            r1.<init>(r2)
            goto L_0x007b
        L_0x005e:
            com.inmobi.media.fm r1 = new com.inmobi.media.fm
            r1.<init>(r2)
            goto L_0x007b
        L_0x0064:
            com.inmobi.media.fl r1 = new com.inmobi.media.fl
            r1.<init>(r2)
            goto L_0x007b
        L_0x006a:
            com.inmobi.media.fk r1 = new com.inmobi.media.fk
            r1.<init>(r2)
            goto L_0x007b
        L_0x0070:
            com.inmobi.media.fj r1 = new com.inmobi.media.fj
            r1.<init>(r2)
            goto L_0x007b
        L_0x0076:
            com.inmobi.media.fg r1 = new com.inmobi.media.fg
            r1.<init>(r2)
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5238ex.m11980a(java.lang.String, java.lang.String):com.inmobi.media.ex");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C5238ex m11981a(java.lang.String r1, org.json.JSONObject r2, java.lang.String r3) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -60641721: goto L_0x0044;
                case 3579: goto L_0x003a;
                case 96432: goto L_0x0030;
                case 3506402: goto L_0x0026;
                case 780346297: goto L_0x001c;
                case 1728886350: goto L_0x0012;
                case 2088265419: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x004e
        L_0x0008:
            java.lang.String r0 = "signals"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 5
            goto L_0x004f
        L_0x0012:
            java.lang.String r0 = "appOwnership"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 7
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "telemetry"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 6
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "root"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 4
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "ads"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r0 = "pk"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "crashReporting"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x004e:
            r1 = -1
        L_0x004f:
            switch(r1) {
                case 1: goto L_0x00a2;
                case 2: goto L_0x0095;
                case 3: goto L_0x0088;
                case 4: goto L_0x007b;
                case 5: goto L_0x006e;
                case 6: goto L_0x0061;
                case 7: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            r1 = 0
            goto L_0x00ae
        L_0x0054:
            com.inmobi.media.hm r1 = com.inmobi.media.C5236ew.m11976a()
            java.lang.Class<com.inmobi.media.ew> r0 = com.inmobi.media.C5236ew.class
            java.lang.Object r1 = r1.mo40710a((org.json.JSONObject) r2, r0)
            com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
            goto L_0x00ae
        L_0x0061:
            com.inmobi.media.hm r1 = com.inmobi.media.C5271fm.m12062a()
            java.lang.Class<com.inmobi.media.fm> r0 = com.inmobi.media.C5271fm.class
            java.lang.Object r1 = r1.mo40710a((org.json.JSONObject) r2, r0)
            com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
            goto L_0x00ae
        L_0x006e:
            com.inmobi.media.hm r1 = com.inmobi.media.C5266fl.m12058a()
            java.lang.Class<com.inmobi.media.fl> r0 = com.inmobi.media.C5266fl.class
            java.lang.Object r1 = r1.mo40710a((org.json.JSONObject) r2, r0)
            com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
            goto L_0x00ae
        L_0x007b:
            com.inmobi.media.hm r1 = com.inmobi.media.C5261fk.m12041a()
            java.lang.Class<com.inmobi.media.fk> r0 = com.inmobi.media.C5261fk.class
            java.lang.Object r1 = r1.mo40710a((org.json.JSONObject) r2, r0)
            com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
            goto L_0x00ae
        L_0x0088:
            com.inmobi.media.hm r1 = com.inmobi.media.C5260fj.m12037a()
            java.lang.Class<com.inmobi.media.fj> r0 = com.inmobi.media.C5260fj.class
            java.lang.Object r1 = r1.mo40710a((org.json.JSONObject) r2, r0)
            com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
            goto L_0x00ae
        L_0x0095:
            com.inmobi.media.hm r1 = com.inmobi.media.C5256fg.m12031a()
            java.lang.Class<com.inmobi.media.fg> r0 = com.inmobi.media.C5256fg.class
            java.lang.Object r1 = r1.mo40710a((org.json.JSONObject) r2, r0)
            com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
            goto L_0x00ae
        L_0x00a2:
            com.inmobi.media.hm r1 = com.inmobi.media.C5220ev.m11965a()
            java.lang.Class<com.inmobi.media.ev> r0 = com.inmobi.media.C5220ev.class
            java.lang.Object r1 = r1.mo40710a((org.json.JSONObject) r2, r0)
            com.inmobi.media.ex r1 = (com.inmobi.media.C5238ex) r1
        L_0x00ae:
            if (r1 == 0) goto L_0x00b2
            r1.mAccountId = r3
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5238ex.m11981a(java.lang.String, org.json.JSONObject, java.lang.String):com.inmobi.media.ex");
    }
}
