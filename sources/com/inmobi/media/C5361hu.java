package com.inmobi.media;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hu */
/* compiled from: UidMap */
public class C5361hu {

    /* renamed from: a */
    private C5257fh f12280a;

    public C5361hu(C5257fh fhVar) {
        this.f12280a = fhVar;
    }

    /* renamed from: a */
    public final HashMap<String, String> mo40722a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("u-id-map", m12395b());
        return hashMap;
    }

    /* renamed from: b */
    private String m12395b() {
        return new JSONObject(m12396c()).toString();
    }

    /* renamed from: c */
    private Map<String, String> m12396c() {
        C5358hs e;
        HashMap hashMap = new HashMap();
        String str = null;
        try {
            if (!(!this.f12280a.GPID || (e = C5359ht.m12386a().mo40720e()) == null || (str = e.mo40717b()) == null)) {
                hashMap.put("GPID", str);
            }
            m12394a(hashMap, str);
        } catch (Exception unused) {
            C5361hu.class.getSimpleName();
            m12394a(hashMap, (String) null);
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m12394a(Map<String, String> map, String str) {
        try {
            if (this.f12280a.UM5 && str == null) {
                C5359ht.m12386a();
                C5359ht.m12386a();
                map.put("UM5", C5359ht.m12387a(C5359ht.m12388d(), SameMD5.TAG));
            }
            if (this.f12280a.f12040O1 && str == null) {
                C5359ht.m12386a();
                C5359ht.m12386a();
                map.put("O1", C5359ht.m12387a(C5359ht.m12388d(), "SHA-1"));
            }
        } catch (Exception unused) {
            C5361hu.class.getSimpleName();
        }
    }
}
