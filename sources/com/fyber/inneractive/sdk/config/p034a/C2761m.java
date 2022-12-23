package com.fyber.inneractive.sdk.config.p034a;

import com.fyber.inneractive.sdk.config.C2788f;
import com.fyber.inneractive.sdk.p029a.C2681a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a.m */
public final class C2761m implements C2681a<C2760l> {
    /* renamed from: a */
    public final String mo17886a() {
        return "IALastModifiedFromHeader.remote";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17887a(Object obj) {
    }

    /* renamed from: b */
    public final String mo17888b() {
        return "ia-remote.config";
    }

    /* renamed from: d */
    public final boolean mo17890d() {
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17885a(String str) throws Exception {
        return m5996b(str);
    }

    /* renamed from: b */
    private static C2760l m5996b(String str) throws Exception {
        try {
            return C2760l.m5995a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.m9037e("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f9870a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    /* renamed from: c */
    public final String mo17889c() {
        if (C2788f.m6081i() != null) {
            return C2788f.m6081i();
        }
        return String.format(Locale.ENGLISH, "https://%sfeatures_config.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});
    }
}
