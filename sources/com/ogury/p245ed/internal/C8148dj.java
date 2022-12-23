package com.ogury.p245ed.internal;

import android.content.Context;
import com.vungle.warren.model.VisionDataDBAdapter;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dj */
public final class C8148dj {

    /* renamed from: a */
    public static final C8149a f21108a = new C8149a((byte) 0);

    /* renamed from: b */
    private final C8171dv f21109b;

    /* renamed from: c */
    private final C8164dp f21110c;

    /* renamed from: d */
    private final Context f21111d;

    public /* synthetic */ C8148dj(C8171dv dvVar, C8164dp dpVar, Context context, byte b) {
        this(dvVar, dpVar, context);
    }

    private C8148dj(C8171dv dvVar, C8164dp dpVar, Context context) {
        this.f21109b = dvVar;
        this.f21110c = dpVar;
        this.f21111d = context;
    }

    /* renamed from: com.ogury.ed.internal.dj$a */
    public static final class C8149a {
        public /* synthetic */ C8149a(byte b) {
            this();
        }

        private C8149a() {
        }

        /* renamed from: a */
        public static C8148dj m22725a(Context context) {
            C8467mq.m23881b(context, "context");
            C8172dw dwVar = C8172dw.f21148a;
            return new C8148dj(C8172dw.m22770a(context), new C8164dp(context), context, (byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo53305a(C8146dh dhVar) {
        C8467mq.m23881b(dhVar, "event");
        if (dhVar instanceof C8156dk) {
            m22719a((C8156dk) dhVar);
        } else if (dhVar instanceof C8157dl) {
            m22720a((C8157dl) dhVar);
        } else if (dhVar instanceof C8145dg) {
            m22718a((C8145dg) dhVar);
        }
    }

    /* renamed from: a */
    private final void m22719a(C8156dk dkVar) {
        this.f21109b.mo53322a(m22722b(dkVar), dkVar.mo53306a()).mo53279a((C8432lk<? super Throwable, C8386ke>) new C8152d(C8255gf.f21372a)).mo53280a((C8431lj<C8386ke>) C8153e.f21113a);
    }

    /* renamed from: com.ogury.ed.internal.dj$d */
    /* synthetic */ class C8152d extends C8466mp implements C8432lk<Throwable, C8386ke> {
        C8152d(Object obj) {
            super(1, obj, C8255gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m22729a(Throwable th) {
            C8467mq.m23881b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22729a((Throwable) obj);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$e */
    static final class C8153e extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        public static final C8153e f21113a = new C8153e();

        C8153e() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53190a() {
            return C8386ke.f21633a;
        }
    }

    /* renamed from: b */
    private static JSONObject m22722b(C8156dk dkVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", dkVar.mo53304f());
        jSONObject.put("timestamp_diff", 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("content", jSONObject);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m22720a(C8157dl dlVar) {
        this.f21109b.mo53325b(m22723b(dlVar), dlVar.mo53307a().mo53383z()).mo53279a((C8432lk<? super Throwable, C8386ke>) new C8154f(C8255gf.f21372a)).mo53280a((C8431lj<C8386ke>) C8155g.f21114a);
    }

    /* renamed from: com.ogury.ed.internal.dj$f */
    /* synthetic */ class C8154f extends C8466mp implements C8432lk<Throwable, C8386ke> {
        C8154f(Object obj) {
            super(1, obj, C8255gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m22732a(Throwable th) {
            C8467mq.m23881b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22732a((Throwable) obj);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$g */
    static final class C8155g extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        public static final C8155g f21114a = new C8155g();

        C8155g() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53190a() {
            return C8386ke.f21633a;
        }
    }

    /* renamed from: a */
    private final String m22717a() {
        String str = this.f21111d.getPackageManager().getPackageInfo(this.f21111d.getPackageName(), 0).versionName;
        C8467mq.m23878a((Object) str, "context.packageManager.g…ckageName, 0).versionName");
        return str;
    }

    /* renamed from: b */
    private final JSONObject m22723b(C8157dl dlVar) {
        C8185eb a = dlVar.mo53307a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", dlVar.mo53304f());
        jSONObject.put("campaign", a.mo53353g());
        jSONObject.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, a.mo53350f());
        jSONObject.put("advert", a.mo53338b());
        jSONObject.put("ad_unit_id", a.mo53365m().mo53408a());
        jSONObject.put("version_publisher_app", m22717a());
        JSONObject a2 = this.f21110c.mo53311a();
        a2.put("content", jSONObject);
        return a2;
    }

    /* renamed from: a */
    private final void m22718a(C8145dg dgVar) {
        this.f21109b.mo53326c(m22721b(dgVar), dgVar.mo53299a().mo53329B()).mo53279a((C8432lk<? super Throwable, C8386ke>) new C8150b(C8255gf.f21372a)).mo53280a((C8431lj<C8386ke>) C8151c.f21112a);
    }

    /* renamed from: com.ogury.ed.internal.dj$b */
    /* synthetic */ class C8150b extends C8466mp implements C8432lk<Throwable, C8386ke> {
        C8150b(Object obj) {
            super(1, obj, C8255gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m22726a(Throwable th) {
            C8467mq.m23881b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22726a((Throwable) obj);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$c */
    static final class C8151c extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        public static final C8151c f21112a = new C8151c();

        C8151c() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53190a() {
            return C8386ke.f21633a;
        }
    }

    /* renamed from: b */
    private final JSONObject m22721b(C8145dg dgVar) {
        C8185eb a = dgVar.mo53299a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaign_id", a.mo53353g());
        jSONObject.put("advert_id", a.mo53338b());
        jSONObject.put("advertiser_id", a.mo53350f());
        jSONObject.put("ad_unit_id", a.mo53365m().mo53408a());
        jSONObject.put("url", dgVar.mo53300b());
        jSONObject.put("source", dgVar.mo53301c());
        if (dgVar.mo53302d() != null) {
            jSONObject.put("tracker_pattern", dgVar.mo53302d());
        }
        if (dgVar.mo53303e() != null) {
            jSONObject.put("tracker_url", dgVar.mo53303e());
        }
        JSONObject a2 = this.f21110c.mo53311a();
        a2.put("content", jSONObject);
        return a2;
    }
}
