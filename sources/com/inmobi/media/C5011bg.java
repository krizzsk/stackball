package com.inmobi.media;

import android.graphics.Point;
import java.util.Locale;

/* renamed from: com.inmobi.media.bg */
/* compiled from: NativeAssetStyle */
public class C5011bg {

    /* renamed from: a */
    public Point f11384a;

    /* renamed from: b */
    public Point f11385b;

    /* renamed from: c */
    public Point f11386c;

    /* renamed from: d */
    public Point f11387d;

    /* renamed from: e */
    protected String f11388e;

    /* renamed from: f */
    protected String f11389f;

    /* renamed from: g */
    protected String f11390g;

    /* renamed from: h */
    protected float f11391h;

    /* renamed from: i */
    protected String f11392i;

    /* renamed from: j */
    protected String f11393j;

    /* renamed from: k */
    protected C5024bo f11394k;

    public C5011bg() {
        this.f11384a = new Point(0, 0);
        this.f11386c = new Point(0, 0);
        this.f11385b = new Point(0, 0);
        this.f11387d = new Point(0, 0);
        this.f11388e = "none";
        this.f11389f = "straight";
        this.f11391h = 10.0f;
        this.f11392i = "#ff000000";
        this.f11393j = "#00000000";
        this.f11390g = "fill";
        this.f11394k = null;
    }

    public C5011bg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, C5024bo boVar) {
        this(i, i2, i3, i4, i5, i6, i7, i8, "fill", str, str2, str3, str4, boVar);
    }

    public C5011bg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, String str5, C5024bo boVar) {
        this.f11384a = new Point(i3, i4);
        this.f11385b = new Point(i7, i8);
        this.f11386c = new Point(i, i2);
        this.f11387d = new Point(i5, i6);
        this.f11388e = str2;
        this.f11389f = str3;
        this.f11391h = 10.0f;
        this.f11390g = str;
        this.f11392i = str4.length() == 0 ? "#ff000000" : str4;
        this.f11393j = str5.length() == 0 ? "#00000000" : str5;
        this.f11394k = boVar;
    }

    /* renamed from: a */
    public final String mo40166a() {
        return this.f11388e;
    }

    /* renamed from: b */
    public final String mo40167b() {
        return this.f11389f;
    }

    /* renamed from: c */
    public final float mo40168c() {
        return this.f11391h;
    }

    /* renamed from: d */
    public final String mo40169d() {
        return this.f11392i.toLowerCase(Locale.US);
    }

    /* renamed from: e */
    public String mo40170e() {
        return this.f11393j.toLowerCase(Locale.US);
    }

    /* renamed from: f */
    public final String mo40171f() {
        return this.f11390g;
    }

    /* renamed from: g */
    public final C5024bo mo40172g() {
        return this.f11394k;
    }
}
