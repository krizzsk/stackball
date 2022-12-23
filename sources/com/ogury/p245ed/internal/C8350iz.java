package com.ogury.p245ed.internal;

import android.graphics.Rect;
import com.facebook.internal.NativeProtocol;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.iz */
public final class C8350iz {

    /* renamed from: a */
    public static final C8351a f21570a = new C8351a((byte) 0);

    /* renamed from: b */
    private boolean f21571b;

    /* renamed from: c */
    private int f21572c;

    /* renamed from: d */
    private int f21573d;

    /* renamed from: e */
    private int f21574e;

    /* renamed from: f */
    private int f21575f;

    /* renamed from: g */
    private int f21576g;

    /* renamed from: a */
    public static /* synthetic */ C8350iz m23639a(C8350iz izVar, boolean z, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            z = izVar.f21571b;
        }
        if ((i5 & 2) != 0) {
            i = izVar.f21572c;
        }
        if ((i5 & 4) != 0) {
            i2 = izVar.f21573d;
        }
        if ((i5 & 8) != 0) {
            i3 = izVar.f21574e;
        }
        if ((i5 & 16) != 0) {
            i4 = izVar.f21575f;
        }
        return m23640a(z, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static C8350iz m23640a(boolean z, int i, int i2, int i3, int i4) {
        return new C8350iz(z, i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8350iz)) {
            return false;
        }
        C8350iz izVar = (C8350iz) obj;
        return this.f21571b == izVar.f21571b && this.f21572c == izVar.f21572c && this.f21573d == izVar.f21573d && this.f21574e == izVar.f21574e && this.f21575f == izVar.f21575f;
    }

    public final int hashCode() {
        boolean z = this.f21571b;
        if (z) {
            z = true;
        }
        return ((((((((z ? 1 : 0) * true) + this.f21572c) * 31) + this.f21573d) * 31) + this.f21574e) * 31) + this.f21575f;
    }

    public final String toString() {
        return "ResizeProps(allowOffscreen=" + this.f21571b + ", width=" + this.f21572c + ", height=" + this.f21573d + ", offsetX=" + this.f21574e + ", offsetY=" + this.f21575f + ')';
    }

    public C8350iz(boolean z, int i, int i2, int i3, int i4) {
        this.f21571b = z;
        this.f21572c = i;
        this.f21573d = i2;
        this.f21574e = i3;
        this.f21575f = i4;
    }

    /* renamed from: a */
    public final void mo53780a(boolean z) {
        this.f21571b = z;
    }

    /* renamed from: a */
    public final boolean mo53781a() {
        return this.f21571b;
    }

    /* renamed from: a */
    public final void mo53779a(int i) {
        this.f21572c = i;
    }

    /* renamed from: b */
    public final int mo53782b() {
        return this.f21572c;
    }

    /* renamed from: b */
    public final void mo53783b(int i) {
        this.f21573d = i;
    }

    /* renamed from: c */
    public final int mo53784c() {
        return this.f21573d;
    }

    /* renamed from: c */
    public final void mo53785c(int i) {
        this.f21574e = i;
    }

    /* renamed from: d */
    public final int mo53786d() {
        return this.f21574e;
    }

    /* renamed from: d */
    public final void mo53787d(int i) {
        this.f21575f = i;
    }

    /* renamed from: e */
    public final int mo53788e() {
        return this.f21575f;
    }

    /* renamed from: e */
    public final void mo53789e(int i) {
        this.f21576g = i;
    }

    /* renamed from: f */
    public final int mo53791f() {
        return this.f21576g;
    }

    public C8350iz() {
        this(false, 0, 0, 0, 0);
    }

    /* renamed from: g */
    public final Rect mo53792g() {
        int i = this.f21574e;
        int i2 = this.f21575f;
        return new Rect(i, i2, this.f21572c + i, this.f21573d + i2);
    }

    /* renamed from: com.ogury.ed.internal.iz$a */
    public static final class C8351a {
        public /* synthetic */ C8351a(byte b) {
            this();
        }

        private C8351a() {
        }

        /* renamed from: a */
        public static C8350iz m23656a(Map<String, String> map) {
            C8467mq.m23881b(map, NativeProtocol.WEB_DIALOG_PARAMS);
            C8350iz izVar = new C8350iz();
            String str = map.get("allowOffscreen");
            izVar.mo53780a(str == null ? true : Boolean.parseBoolean(str));
            try {
                izVar.mo53779a(C8258gi.m23195b(C8256gg.m23191a(map, "width")));
                izVar.mo53783b(C8258gi.m23195b(C8256gg.m23191a(map, "height")));
                izVar.mo53785c(C8258gi.m23195b(C8256gg.m23191a(map, "offsetX")));
                izVar.mo53787d(C8258gi.m23195b(C8256gg.m23191a(map, "offsetY")));
                return izVar;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static C8350iz m23655a(Rect rect) {
            C8467mq.m23881b(rect, "rect");
            return m23654a(rect.left, rect.top, rect.width(), rect.height());
        }

        /* renamed from: a */
        private static C8350iz m23654a(int i, int i2, int i3, int i4) {
            C8350iz izVar = new C8350iz();
            izVar.mo53780a(false);
            izVar.mo53785c(i);
            izVar.mo53787d(i2);
            izVar.mo53779a(i3);
            izVar.mo53783b(i4);
            return izVar;
        }
    }
}
