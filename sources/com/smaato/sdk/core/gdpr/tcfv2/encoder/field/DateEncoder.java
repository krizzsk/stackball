package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class DateEncoder implements BaseEncoder<String> {
    private static final DateEncoder instance = new DateEncoder();

    private DateEncoder() {
    }

    public static DateEncoder getInstance() {
        return instance;
    }

    public final String decode(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d yyyy HH:mm:ss Z", Locale.getDefault());
        try {
            return simpleDateFormat.format(new Date(Long.parseLong(str, 2) * 100));
        } catch (Exception unused) {
            return simpleDateFormat.format(new Date(System.currentTimeMillis()));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return java.lang.Long.valueOf(new java.text.SimpleDateFormat("EEE, dd MM yyyy HH:mm:ss zzz", new java.util.Locale("en", "US", "POSIX")).parse(r8).getTime());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long decodeHeaderDate(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = new java.util.Locale
            java.lang.String r3 = "en"
            java.lang.String r4 = "US"
            java.lang.String r5 = "POSIX"
            r2.<init>(r3, r4, r5)
            java.lang.String r6 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            r1.<init>(r6, r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r3, r4, r5)
            java.lang.String r3 = "EEE, dd MM yyyy HH:mm:ss zzz"
            r2.<init>(r3, r6)
            java.util.Date r1 = r1.parse(r8)     // Catch:{ ParseException -> 0x002f }
            long r3 = r1.getTime()     // Catch:{ ParseException -> 0x002f }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ ParseException -> 0x002f }
            return r8
        L_0x002f:
            java.util.Date r8 = r2.parse(r8)     // Catch:{ ParseException -> 0x003c }
            long r1 = r8.getTime()     // Catch:{ ParseException -> 0x003c }
            java.lang.Long r8 = java.lang.Long.valueOf(r1)     // Catch:{ ParseException -> 0x003c }
            return r8
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.gdpr.tcfv2.encoder.field.DateEncoder.decodeHeaderDate(java.lang.String):java.lang.Long");
    }
}
