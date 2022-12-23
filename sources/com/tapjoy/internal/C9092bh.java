package com.tapjoy.internal;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bh */
public final class C9092bh implements C9099bl {

    /* renamed from: a */
    private final StringWriter f22382a;

    /* renamed from: b */
    private final C9111bt f22383b;

    public C9092bh() {
        StringWriter stringWriter = new StringWriter();
        this.f22382a = stringWriter;
        this.f22383b = new C9111bt(stringWriter);
    }

    public final String toString() {
        try {
            this.f22383b.f22428a.flush();
            return this.f22382a.toString();
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final void mo57841a(Writer writer) {
        try {
            this.f22383b.f22428a.flush();
            writer.write(this.f22382a.toString());
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final C9092bh mo57834a() {
        try {
            this.f22383b.mo57881a();
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: b */
    public final C9092bh mo57842b() {
        try {
            this.f22383b.mo57889b();
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: c */
    public final C9092bh mo57844c() {
        try {
            this.f22383b.mo57891c();
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: d */
    public final C9092bh mo57845d() {
        try {
            this.f22383b.mo57893d();
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final C9092bh mo57838a(String str) {
        try {
            this.f22383b.mo57886a(str);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final C9092bh mo57836a(C9099bl blVar) {
        try {
            this.f22383b.mo57883a(blVar);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: b */
    public final C9092bh mo57843b(String str) {
        try {
            this.f22383b.mo57890b(str);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final C9092bh mo57835a(long j) {
        try {
            this.f22383b.mo57882a(j);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final C9092bh mo57837a(Number number) {
        try {
            this.f22383b.mo57884a(number);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: b */
    private C9092bh m24337b(Object obj) {
        try {
            this.f22383b.mo57885a(obj);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final C9092bh mo57839a(Collection collection) {
        try {
            this.f22383b.mo57887a(collection);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public final C9092bh mo57840a(Map map) {
        try {
            this.f22383b.mo57888a(map);
            return this;
        } catch (IOException e) {
            throw C9466jr.m25450a(e);
        }
    }

    /* renamed from: a */
    public static String m24336a(Object obj) {
        return new C9092bh().m24337b(obj).toString();
    }
}
