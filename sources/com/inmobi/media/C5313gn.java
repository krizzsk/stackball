package com.inmobi.media;

import android.content.ContentValues;

/* renamed from: com.inmobi.media.gn */
/* compiled from: TelemetryEvent */
public class C5313gn {

    /* renamed from: a */
    int f12181a;

    /* renamed from: b */
    String f12182b;

    /* renamed from: c */
    long f12183c;

    /* renamed from: d */
    String f12184d;

    public C5313gn(String str) {
        this.f12182b = str;
        this.f12184d = null;
        this.f12183c = System.currentTimeMillis();
    }

    private C5313gn(String str, String str2) {
        this.f12182b = str;
        this.f12184d = str2;
        this.f12183c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String mo40655a() {
        String str = this.f12184d;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f12182b + " ";
    }

    /* renamed from: a */
    public static C5313gn m12187a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString("ts")).longValue();
        C5313gn gnVar = new C5313gn(asString, asString2);
        gnVar.f12183c = longValue;
        gnVar.f12181a = contentValues.getAsInteger("id").intValue();
        return gnVar;
    }
}
