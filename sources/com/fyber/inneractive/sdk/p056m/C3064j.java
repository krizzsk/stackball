package com.fyber.inneractive.sdk.p056m;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.fyber.inneractive.sdk.util.C3670q;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.m.j */
final class C3064j {

    /* renamed from: g */
    private static final Pattern f7559g = Pattern.compile("max-age=(\\d+)");

    /* renamed from: h */
    private static final SimpleDateFormat f7560h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* renamed from: a */
    final byte[] f7561a;

    /* renamed from: b */
    final Map<String, String> f7562b;

    /* renamed from: c */
    final String f7563c;

    /* renamed from: d */
    final String f7564d;

    /* renamed from: e */
    final int f7565e;

    /* renamed from: f */
    final String f7566f;

    C3064j(byte[] bArr, Map<String, String> map, String str, String str2, int i, String str3) {
        this.f7561a = bArr;
        this.f7562b = map;
        this.f7563c = str;
        this.f7564d = str2;
        this.f7565e = i;
        this.f7566f = str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo18650a() {
        boolean z;
        String str;
        int i;
        if (TextUtils.isEmpty(this.f7566f)) {
            return false;
        }
        loop0:
        while (true) {
            z = true;
            for (String next : this.f7562b.keySet()) {
                if (!z) {
                    break loop0;
                }
                if (next != null && next.equalsIgnoreCase(HttpHeaders.CACHE_CONTROL)) {
                    String str2 = this.f7562b.get(next);
                    if (str2 != null) {
                        Matcher matcher = f7559g.matcher(str2.toLowerCase(Locale.ENGLISH));
                        if (!matcher.find() || matcher.groupCount() != 1) {
                            i = 0;
                        } else {
                            i = C3670q.m9151a(matcher.group(1), 0);
                        }
                        if ((str2.toLowerCase(Locale.ENGLISH).contains("public") || str2.toLowerCase(Locale.ENGLISH).contains("private") || ((long) i) > TimeUnit.SECONDS.convert(1, TimeUnit.HOURS)) && !str2.toLowerCase(Locale.ENGLISH).contains("no-") && !str2.toLowerCase(Locale.ENGLISH).contains("must-")) {
                        }
                    } else {
                        continue;
                    }
                } else if (next == null || !next.equalsIgnoreCase(HttpHeaders.VARY)) {
                    if (next != null && next.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                        String str3 = this.f7562b.get(next);
                        if (str3 != null) {
                            z = !str3.equalsIgnoreCase("no-cache");
                        }
                    } else if (!(next == null || !next.equalsIgnoreCase(HttpHeaders.EXPIRES) || (str = this.f7562b.get(next)) == null)) {
                        try {
                            Date parse = f7560h.parse(str);
                            if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS) > System.currentTimeMillis()) {
                            }
                        } catch (ParseException unused) {
                            continue;
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        return z;
    }

    /* renamed from: b */
    public final WebResourceResponse mo18651b() {
        return new WebResourceResponse(this.f7563c, this.f7564d, this.f7565e, this.f7566f, this.f7562b, new ByteArrayInputStream(this.f7561a));
    }
}
