package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.mj */
public final class C13980mj {

    /* renamed from: a */
    private static final C13981a f37392a = new C13981a();

    /* renamed from: b */
    private static final String[] f37393b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: c */
    private static final DateFormat[] f37394c = new DateFormat[15];

    /* renamed from: com.yandex.mobile.ads.impl.mj$a */
    public static final class C13981a extends ThreadLocal<DateFormat> {
        C13981a() {
        }

        public Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(jh1.f35308d);
            return simpleDateFormat;
        }
    }

    /* renamed from: a */
    public static final String m39463a(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String format = ((DateFormat) f37392a.get()).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
