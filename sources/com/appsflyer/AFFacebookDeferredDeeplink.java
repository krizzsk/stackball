package com.appsflyer;

import android.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFFacebookDeferredDeeplink {

    /* renamed from: ı */
    String f3958;

    /* renamed from: ǃ */
    public String f3959;

    /* renamed from: ɩ */
    private byte[] f3960;

    /* renamed from: ι */
    String f3961;

    public interface AppLinkFetchEvents {
        void onAppLinkFetchFailed(String str);

        void onAppLinkFetchFinished(String str, String str2, String str3);
    }

    AFFacebookDeferredDeeplink() {
    }

    AFFacebookDeferredDeeplink(String str, byte[] bArr, String str2) {
        this.f3958 = str;
        this.f3960 = bArr;
        this.f3961 = str2;
    }

    public AFFacebookDeferredDeeplink(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f3958 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f3961 = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.f3961);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.f3960 = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            }
        }
        scanner.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final byte[] mo13844() {
        return this.f3960;
    }
}
