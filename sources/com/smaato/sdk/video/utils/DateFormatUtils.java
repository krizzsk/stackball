package com.smaato.sdk.video.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateFormatUtils {
    public String offsetFromTimeInterval(long j) {
        boolean z;
        if (j < 0) {
            j = 0 - j;
            z = true;
        } else {
            z = false;
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j - TimeUnit.HOURS.toMillis(hours));
        long seconds = TimeUnit.MILLISECONDS.toSeconds((j - TimeUnit.HOURS.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes));
        long millis = TimeUnit.MILLISECONDS.toMillis(((j - TimeUnit.HOURS.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds));
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = z ? "-" : "";
        objArr[1] = Long.valueOf(hours);
        objArr[2] = Long.valueOf(minutes);
        objArr[3] = Long.valueOf(seconds);
        objArr[4] = Long.valueOf(millis);
        return String.format(locale, "%s%02d:%02d:%02d.%03d", objArr);
    }

    public String currentTimestamp() {
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }
}
