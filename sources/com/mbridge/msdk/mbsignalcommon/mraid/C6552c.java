package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.mbsignalcommon.mraid.C6549a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.c */
/* compiled from: MraidUriUtil */
public final class C6552c {

    /* renamed from: a */
    private static volatile ConcurrentHashMap<String, String> f16324a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ArrayList<String> f16325b = new ArrayList<>();

    /* renamed from: a */
    public static C6557a m16862a(WindVaneWebView windVaneWebView, String str) {
        Set<String> set;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        C6557a aVar = new C6557a();
        aVar.f16348d = C6348l.m16089b("n+ztLkxpVTzBLkxgHN==");
        aVar.f16349e = parse.getHost();
        int i = 0;
        if (f16325b.size() == 0) {
            for (Method name : C6551b.class.getDeclaredMethods()) {
                f16325b.add(name.getName());
            }
        }
        if (f16325b.contains(aVar.f16349e) || windVaneWebView == null) {
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery == null) {
                set = Collections.emptySet();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                do {
                    int indexOf = encodedQuery.indexOf(38, i);
                    if (indexOf == -1) {
                        indexOf = encodedQuery.length();
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i);
                    if (indexOf2 > indexOf || indexOf2 == -1) {
                        indexOf2 = indexOf;
                    }
                    linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                    i = indexOf + 1;
                } while (i < encodedQuery.length());
                set = Collections.unmodifiableSet(linkedHashSet);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str2 : set) {
                    jSONObject.put(str2, parse.getQueryParameter(str2));
                }
                aVar.f16350f = jSONObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return aVar;
        }
        String campaignId = windVaneWebView.getCampaignId();
        String str3 = aVar.f16349e;
        if (!TextUtils.isEmpty(campaignId)) {
            if (f16324a.containsKey(campaignId)) {
                String str4 = f16324a.get(campaignId);
                if (!TextUtils.isEmpty(str3) && !str4.contains(str3)) {
                    if (str4.length() > 0) {
                        str4 = str4.concat(",");
                    }
                    f16324a.put(campaignId, str4.concat(str3));
                }
            } else {
                f16324a.put(campaignId, str3);
            }
        }
        C6549a.C6550a.f16323a.mo44474a((WebView) windVaneWebView, aVar.f16349e);
        C6549a.C6550a.f16323a.mo44475a((WebView) windVaneWebView, aVar.f16349e, "Specified command is not implemented");
        return null;
    }

    /* renamed from: a */
    public static String m16863a(String str) {
        if (f16324a.containsKey(str)) {
            return f16324a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static void m16864b(String str) {
        if (!TextUtils.isEmpty(str)) {
            f16324a.remove(str);
        }
    }
}
