package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzas {
    public static zzd zzb(zzo zzo) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        zzo zzo2 = zzo;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zzo2.zzab;
        String str = map.get(HttpHeaders.DATE);
        long zzf = str != null ? zzf(str) : 0;
        String str2 = map.get(HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get(HttpHeaders.EXPIRES);
        long zzf2 = str3 != null ? zzf(str3) : 0;
        String str4 = map.get(HttpHeaders.LAST_MODIFIED);
        long zzf3 = str4 != null ? zzf(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zzf <= 0 || zzf2 < zzf) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zzf2 - zzf);
                j3 = j4;
            }
        }
        zzd zzd = new zzd();
        zzd.data = zzo2.data;
        zzd.zzg = str5;
        zzd.zzk = j4;
        zzd.zzj = j3;
        zzd.zzh = zzf;
        zzd.zzi = zzf3;
        zzd.zzl = map;
        zzd.zzm = zzo2.allHeaders;
        return zzd;
    }

    private static long zzf(String str) {
        try {
            return zzr().parse(str).getTime();
        } catch (ParseException e) {
            zzag.zza(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    static String zzb(long j) {
        return zzr().format(new Date(j));
    }

    private static SimpleDateFormat zzr() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
