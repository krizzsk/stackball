package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.mobile.ads.impl.wi1;
import com.yandex.mobile.ads.video.models.p268ad.JavaScriptResource;
import java.net.MalformedURLException;
import java.net.URL;

public final class yw0 {
    /* renamed from: a */
    public aj1 mo71132a(vi1 vi1) throws wi1, IllegalArgumentException {
        JavaScriptResource b = vi1.mo70494b();
        if (b == null || !b.mo71962c().equals(CampaignEx.KEY_OMID)) {
            throw new wi1(vi1, wi1.C15052a.VERIFICATION_NOT_SUPPORTED);
        }
        try {
            URL url = new URL(b.mo71963d());
            String d = vi1.mo70496d();
            String c = vi1.mo70495c();
            if (TextUtils.isEmpty(c)) {
                return aj1.m33751a(url);
            }
            return aj1.m33750a(d, url, c);
        } catch (MalformedURLException unused) {
            throw new wi1(vi1, wi1.C15052a.ERROR_RESOURCE_LOAD);
        }
    }
}
