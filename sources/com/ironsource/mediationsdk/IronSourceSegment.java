package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a */
    String f12989a;

    /* renamed from: b */
    int f12990b = -1;

    /* renamed from: c */
    String f12991c;

    /* renamed from: d */
    int f12992d = -1;

    /* renamed from: e */
    AtomicBoolean f12993e = null;

    /* renamed from: f */
    double f12994f = -1.0d;

    /* renamed from: g */
    long f12995g = 0;

    /* renamed from: h */
    Vector<Pair<String, String>> f12996h = new Vector<>();

    /* renamed from: i */
    private int f12997i = 999999;

    /* renamed from: j */
    private double f12998j = 999999.99d;

    /* renamed from: k */
    private final String f12999k = Payload.CUSTOM;

    /* renamed from: l */
    private final int f13000l = 5;

    /* renamed from: a */
    private static boolean m13433a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: a */
    private static boolean m13434a(String str, int i, int i2) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    public int getAge() {
        return this.f12990b;
    }

    public String getGender() {
        return this.f12991c;
    }

    public double getIapt() {
        return this.f12994f;
    }

    public AtomicBoolean getIsPaying() {
        return this.f12993e;
    }

    public int getLevel() {
        return this.f12992d;
    }

    public String getSegmentName() {
        return this.f12989a;
    }

    public long getUcd() {
        return this.f12995g;
    }

    public void setAge(int i) {
        if (i <= 0 || i > 199) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
            return;
        }
        this.f12990b = i;
    }

    public void setCustom(String str, String str2) {
        try {
            if (!m13433a(str) || !m13433a(str2) || !m13434a(str, 1, 32) || !m13434a(str2, 1, 32)) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
                return;
            }
            String str3 = ContentMetadata.KEY_CUSTOM_PREFIX + str;
            if (this.f12996h.size() < 5) {
                this.f12996h.add(new Pair(str3, str2));
                return;
            }
            this.f12996h.remove(0);
            this.f12996h.add(new Pair(str3, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (TextUtils.isEmpty(str) || (!str.toLowerCase(Locale.ENGLISH).equals("male") && !str.toLowerCase(Locale.ENGLISH).equals("female"))) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
            return;
        }
        this.f12991c = str;
    }

    public void setIAPTotal(double d) {
        if (d <= 0.0d || d >= this.f12998j) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f12998j, 2);
            return;
        }
        this.f12994f = Math.floor(d * 100.0d) / 100.0d;
    }

    public void setIsPaying(boolean z) {
        if (this.f12993e == null) {
            this.f12993e = new AtomicBoolean();
        }
        this.f12993e.set(z);
    }

    public void setLevel(int i) {
        if (i <= 0 || i >= this.f12997i) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.f12997i, 2);
            return;
        }
        this.f12992d = i;
    }

    public void setSegmentName(String str) {
        if (!m13433a(str) || !m13434a(str, 1, 32)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
            return;
        }
        this.f12989a = str;
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.f12995g = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }
}
