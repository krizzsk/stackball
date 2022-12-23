package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3550m;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.r */
public interface C3520r extends C3506g {

    /* renamed from: a */
    public static final C3550m<String> f9563a = new C3550m<String>() {
        /* renamed from: a */
        public final /* synthetic */ boolean mo19355a(Object obj) {
            String d = C3560t.m8892d((String) obj);
            if (!TextUtils.isEmpty(d)) {
                return (!d.contains("text") || d.contains("text/vtt")) && !d.contains(TJAdUnitConstants.String.HTML) && !d.contains("xml");
            }
            return false;
        }
    };

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.r$b */
    public interface C3523b extends C3506g.C3507a {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.r$f */
    public static final class C3527f {

        /* renamed from: a */
        private final Map<String, String> f9570a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f9571b;

        /* renamed from: a */
        public final synchronized Map<String, String> mo19356a() {
            if (this.f9571b == null) {
                this.f9571b = Collections.unmodifiableMap(new HashMap(this.f9570a));
            }
            return this.f9571b;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.r$c */
    public static class C3524c extends IOException {

        /* renamed from: a */
        public final int f9565a;

        /* renamed from: b */
        public final C3509i f9566b;

        public C3524c(String str, C3509i iVar) {
            super(str);
            this.f9566b = iVar;
            this.f9565a = 1;
        }

        public C3524c(IOException iOException, C3509i iVar, int i) {
            super(iOException);
            this.f9566b = iVar;
            this.f9565a = i;
        }

        public C3524c(String str, IOException iOException, C3509i iVar) {
            super(str, iOException);
            this.f9566b = iVar;
            this.f9565a = 1;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.r$d */
    public static final class C3525d extends C3524c {

        /* renamed from: c */
        public final String f9567c;

        public C3525d(String str, C3509i iVar) {
            super("Invalid content type: " + str, iVar);
            this.f9567c = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.r$e */
    public static final class C3526e extends C3524c {

        /* renamed from: c */
        public final int f9568c;

        /* renamed from: d */
        public final Map<String, List<String>> f9569d;

        public C3526e(int i, Map<String, List<String>> map, C3509i iVar) {
            super("Response code: " + i, iVar);
            this.f9568c = i;
            this.f9569d = map;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.r$a */
    public static abstract class C3522a implements C3523b {

        /* renamed from: a */
        private final C3527f f9564a = new C3527f();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C3520r mo19354a(C3527f fVar);

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C3506g mo18709a() {
            return mo19354a(this.f9564a);
        }
    }
}
