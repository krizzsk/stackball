package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.C1505q;

/* renamed from: com.applovin.impl.sdk.utils.c */
public class C1514c {

    /* renamed from: a */
    private static C1514c f3698a;

    /* renamed from: b */
    private static final Object f3699b = new Object();

    /* renamed from: c */
    private final Bundle f3700c;

    /* renamed from: d */
    private final int f3701d;

    private C1514c(Context context) {
        Bundle bundle = null;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            C1505q.m3341c("AndroidManifest", "Failed to get meta data.", e);
        } catch (Throwable th) {
            this.f3700c = null;
            throw th;
        }
        this.f3700c = bundle;
        int i = 0;
        try {
            XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = openXmlResourceParser.getEventType();
            int i2 = 0;
            do {
                if (2 == eventType) {
                    try {
                        if (openXmlResourceParser.getName().equals("application")) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= openXmlResourceParser.getAttributeCount()) {
                                    break;
                                }
                                String attributeName = openXmlResourceParser.getAttributeName(i3);
                                String attributeValue = openXmlResourceParser.getAttributeValue(i3);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    i2 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    break;
                                }
                                i3++;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        try {
                            C1505q.m3341c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                        } finally {
                            this.f3701d = i;
                        }
                    }
                }
                eventType = openXmlResourceParser.next();
            } while (eventType != 1);
            this.f3701d = i2;
        } catch (Throwable th3) {
            th = th3;
            C1505q.m3341c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
        }
    }

    /* renamed from: a */
    public static C1514c m3412a(Context context) {
        C1514c cVar;
        synchronized (f3699b) {
            if (f3698a == null) {
                f3698a = new C1514c(context);
            }
            cVar = f3698a;
        }
        return cVar;
    }

    /* renamed from: a */
    public String mo13302a(String str, String str2) {
        return this.f3700c.getString(str, str2);
    }

    /* renamed from: a */
    public boolean mo13303a() {
        return this.f3701d != 0;
    }

    /* renamed from: a */
    public boolean mo13304a(String str) {
        return this.f3700c.containsKey(str);
    }

    /* renamed from: a */
    public boolean mo13305a(String str, boolean z) {
        return this.f3700c.getBoolean(str, z);
    }
}
