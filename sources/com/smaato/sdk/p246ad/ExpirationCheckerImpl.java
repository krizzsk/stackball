package com.smaato.sdk.p246ad;

import com.google.common.net.HttpHeaders;
import com.smaato.sdk.log.Logger;
import com.smaato.sdk.net.Headers;
import com.smaato.sdk.util.Disposable;
import com.smaato.sdk.util.Schedulers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.smaato.sdk.ad.ExpirationCheckerImpl */
public class ExpirationCheckerImpl implements ExpirationChecker {
    private static final Disposable EMPTY_DISPOSABLE = $$Lambda$ExpirationCheckerImpl$ZhImGfSAFrTujX8PAubnMcctA.INSTANCE;
    private final Schedulers schedulers;

    static /* synthetic */ void lambda$static$0() {
    }

    @Inject
    ExpirationCheckerImpl(Schedulers schedulers2) {
        this.schedulers = schedulers2;
    }

    public Disposable schedule(Headers headers, Runnable runnable) {
        if (headers == null) {
            throw new NullPointerException("'headers' specified as non-null is null");
        } else if (runnable != null) {
            long ttl = getTtl(headers);
            if (Long.MAX_VALUE == ttl) {
                Logger.m24081w("Immortal AD!", new Object[0]);
                return EMPTY_DISPOSABLE;
            } else if (ttl > 0) {
                return this.schedulers.comp().scheduleWithDelay(runnable, ttl, TimeUnit.MILLISECONDS);
            } else {
                runnable.run();
                return EMPTY_DISPOSABLE;
            }
        } else {
            throw new NullPointerException("'onExpire' specified as non-null is null");
        }
    }

    private long getTtl(Headers headers) {
        if (headers != null) {
            List<String> values = headers.values("X-SMT-Expires");
            if (values.isEmpty()) {
                return Long.MAX_VALUE;
            }
            try {
                long parseLong = Long.parseLong(values.get(0));
                List<String> values2 = headers.values(HttpHeaders.DATE);
                if (values2.isEmpty()) {
                    return parseLong - System.currentTimeMillis();
                }
                Long decodeHeaderDate = decodeHeaderDate(values2.get(0));
                return parseLong - (decodeHeaderDate == null ? System.currentTimeMillis() : decodeHeaderDate.longValue());
            } catch (NumberFormatException e) {
                Logger.m24078e(e);
                return 0;
            }
        } else {
            throw new NullPointerException("'headers' specified as non-null is null");
        }
    }

    public Long decodeHeaderDate(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Long.valueOf(new SimpleDateFormat("EEE, dd MM yyyy HH:mm:ss zzz", new Locale("en", "US", "POSIX")).parse(str).getTime());
        } catch (ParseException unused) {
            return null;
        }
    }
}
