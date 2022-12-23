package com.flurry.android;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.ServerParameters;
import com.facebook.AccessToken;
import com.facebook.appevents.codeless.internal.Constants;
import com.flurry.sdk.C2643fb;
import com.flurry.sdk.C2645fc;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;

public interface FlurryPrivacySession {

    public interface Callback {
        void failure();

        void success();
    }

    public static class Request implements C2643fb.C2644a {

        /* renamed from: a */
        final String f5320a;

        /* renamed from: b */
        final String f5321b;

        /* renamed from: c */
        final String f5322c;
        public final Callback callback;
        public final Context context;
        public final String verifier;

        public Request(Context context2, Callback callback2) {
            String str;
            this.context = context2;
            this.callback = callback2;
            this.f5321b = context2.getPackageName();
            String a = C2645fc.C2647b.m5751a();
            this.verifier = a;
            MessageDigest a2 = C2645fc.C2646a.m5750a("SHA-256");
            if (a2 != null) {
                a2.update(a.getBytes(Charset.defaultCharset()));
                str = Base64.encodeToString(a2.digest(), 11);
            } else {
                str = "";
            }
            this.f5320a = str;
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            language = TextUtils.isEmpty(language) ? f6206e : language;
            String country = locale.getCountry();
            country = TextUtils.isEmpty(country) ? f6205d : country;
            this.f5322c = language + "-" + country;
        }
    }

    /* renamed from: com.flurry.android.FlurryPrivacySession$a */
    public static class C2326a {

        /* renamed from: a */
        public final Uri f5323a;

        public C2326a(String str, long j, Request request) {
            this.f5323a = new Uri.Builder().scheme("https").authority("flurry.mydashboard.oath.com").appendQueryParameter(Constants.DEVICE_SESSION_ID, str).appendQueryParameter(AccessToken.EXPIRES_IN_KEY, String.valueOf(j)).appendQueryParameter("device_verifier", request.f5320a).appendQueryParameter(ServerParameters.LANG, request.f5322c).build();
        }
    }
}
