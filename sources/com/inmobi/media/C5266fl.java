package com.inmobi.media;

import com.smaato.sdk.video.vast.model.ErrorCode;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fl */
/* compiled from: SignalsConfig */
public class C5266fl extends C5238ex {
    public JSONObject ext = null;
    public C5269b ice = new C5269b();

    /* renamed from: com.inmobi.media.fl$b */
    /* compiled from: SignalsConfig */
    public static class C5269b {

        /* renamed from: c */
        public C5268a f12044c = new C5268a();
        public boolean locationEnabled = false;
        public int sampleInterval = ErrorCode.GENERAL_WRAPPER_ERROR;
        public boolean sessionEnabled = false;
        public int stopRequestTimeout = 3;

        /* renamed from: w */
        public C5270c f12045w = new C5270c();
    }

    /* renamed from: b */
    public String mo40557b() {
        return "signals";
    }

    /* renamed from: a */
    public static C5352hm<C5266fl> m12058a() {
        return new C5352hm<>();
    }

    C5266fl(String str) {
        super(str);
    }

    /* renamed from: d */
    public boolean mo40559d() {
        return this.ice.sampleInterval >= 0 && this.ice.stopRequestTimeout >= 0 && this.ice.f12045w.f12046wf >= 0 && this.ice.f12044c.cof >= 0;
    }

    /* renamed from: com.inmobi.media.fl$c */
    /* compiled from: SignalsConfig */
    public static final class C5270c {
        public boolean cwe;
        public boolean vwe;

        /* renamed from: wf */
        public int f12046wf;

        private C5270c() {
            this.f12046wf = 0;
            this.vwe = false;
            this.cwe = false;
        }
    }

    /* renamed from: com.inmobi.media.fl$a */
    /* compiled from: SignalsConfig */
    public static final class C5268a {
        public boolean cce;
        public int cof;

        /* renamed from: oe */
        public boolean f12043oe;
        public boolean vce;

        private C5268a() {
            this.cof = 0;
            this.f12043oe = false;
            this.vce = false;
            this.cce = false;
        }
    }

    /* renamed from: c */
    public JSONObject mo40558c() {
        return new C5352hm().mo40711a(this);
    }
}
