package com.amazon.device.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringUtils {
    private static final String LOGTAG = StringUtils.class.getSimpleName();
    private static final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    private StringUtils() {
    }

    public static boolean containsRegEx(String str, String str2) {
        return Pattern.compile(str).matcher(str2).find();
    }

    public static String getFirstMatch(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.equals("");
    }

    public static final boolean isNullOrWhiteSpace(String str) {
        return isNullOrEmpty(str) || str.trim().equals("");
    }

    protected static boolean doesExceptionContainLockedDatabaseMessage(Exception exc) {
        if (exc == null || exc.getMessage() == null) {
            return false;
        }
        return exc.getMessage().contains("database is locked");
    }

    public static String sha1(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        logger.mo10939e("Unable to read the stream.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        logger.mo10939e("IOException while trying to close the stream.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readStringFromInputStream(java.io.InputStream r6) {
        /*
            java.lang.String r0 = "IOException while trying to close the stream."
            if (r6 != 0) goto L_0x0006
            r6 = 0
            return r6
        L_0x0006:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
        L_0x000f:
            int r3 = r6.read(r2)     // Catch:{ IOException -> 0x002c }
            r4 = -1
            if (r3 == r4) goto L_0x0020
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x002c }
            r5 = 0
            r4.<init>(r2, r5, r3)     // Catch:{ IOException -> 0x002c }
            r1.append(r4)     // Catch:{ IOException -> 0x002c }
            goto L_0x000f
        L_0x0020:
            r6.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0034
        L_0x0024:
            com.amazon.device.ads.MobileAdsLogger r6 = logger
            r6.mo10939e(r0)
            goto L_0x0034
        L_0x002a:
            r1 = move-exception
            goto L_0x0039
        L_0x002c:
            com.amazon.device.ads.MobileAdsLogger r2 = logger     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "Unable to read the stream."
            r2.mo10939e(r3)     // Catch:{ all -> 0x002a }
            goto L_0x0020
        L_0x0034:
            java.lang.String r6 = r1.toString()
            return r6
        L_0x0039:
            r6.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0042
        L_0x003d:
            com.amazon.device.ads.MobileAdsLogger r6 = logger
            r6.mo10939e(r0)
        L_0x0042:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.StringUtils.readStringFromInputStream(java.io.InputStream):java.lang.String");
    }
}
