package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10474M;
import com.yandex.metrica.impl.p265ob.C10883Wc;

/* renamed from: com.yandex.metrica.impl.ob.Xe */
public class C10926Xe {

    /* renamed from: a */
    public final String f26257a;

    /* renamed from: b */
    public String f26258b;

    /* renamed from: c */
    public final Integer f26259c;

    /* renamed from: d */
    public final Integer f26260d;

    /* renamed from: e */
    public final Integer f26261e;

    /* renamed from: f */
    public final Long f26262f;

    /* renamed from: g */
    public final String f26263g;

    /* renamed from: h */
    public final String f26264h;

    /* renamed from: i */
    public final String f26265i;

    /* renamed from: j */
    public final C11413k1 f26266j;

    /* renamed from: k */
    public final Integer f26267k;

    /* renamed from: l */
    public final String f26268l;

    /* renamed from: m */
    public final String f26269m;

    /* renamed from: n */
    public final Integer f26270n;

    /* renamed from: o */
    public final Integer f26271o;

    /* renamed from: p */
    public final String f26272p;

    /* renamed from: q */
    public final String f26273q;

    /* renamed from: r */
    public final C11538mn f26274r;

    /* renamed from: s */
    public final C10533N0 f26275s;

    /* renamed from: t */
    public final C10474M.C10476b.C10477a f26276t;

    /* renamed from: u */
    public final C10883Wc.C10884a f26277u;

    /* renamed from: v */
    public final Integer f26278v;

    /* renamed from: w */
    public final Integer f26279w;

    /* renamed from: x */
    public final C10351I0 f26280x;

    /* renamed from: y */
    public final Boolean f26281y;

    /* renamed from: z */
    public final Integer f26282z;

    public C10926Xe(ContentValues contentValues) {
        C11413k1 k1Var;
        Integer asInteger = contentValues.getAsInteger("type");
        C10351I0 i0 = null;
        if (asInteger == null) {
            k1Var = null;
        } else {
            k1Var = C11413k1.m29450a(asInteger.intValue());
        }
        this.f26266j = k1Var;
        this.f26267k = contentValues.getAsInteger("custom_type");
        this.f26257a = contentValues.getAsString("name");
        this.f26258b = contentValues.getAsString("value");
        this.f26262f = contentValues.getAsLong("time");
        this.f26259c = contentValues.getAsInteger("number");
        this.f26260d = contentValues.getAsInteger("global_number");
        this.f26261e = contentValues.getAsInteger("number_of_type");
        this.f26264h = contentValues.getAsString("cell_info");
        this.f26263g = contentValues.getAsString("location_info");
        this.f26265i = contentValues.getAsString("wifi_network_info");
        this.f26268l = contentValues.getAsString("error_environment");
        this.f26269m = contentValues.getAsString("user_info");
        this.f26270n = contentValues.getAsInteger("truncated");
        this.f26271o = contentValues.getAsInteger(TapjoyConstants.TJC_CONNECTION_TYPE);
        this.f26272p = contentValues.getAsString("cellular_connection_type");
        this.f26273q = contentValues.getAsString("profile_id");
        this.f26274r = C11538mn.m29810a(contentValues.getAsInteger("encrypting_mode"));
        this.f26275s = C10533N0.m26998a(contentValues.getAsInteger("first_occurrence_status"));
        this.f26276t = C10474M.C10476b.C10477a.m26871a(contentValues.getAsInteger("battery_charge_type"));
        this.f26277u = C10883Wc.C10884a.m28133a(contentValues.getAsString("collection_mode"));
        this.f26278v = contentValues.getAsInteger("has_omitted_data");
        this.f26279w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger("source");
        this.f26280x = asInteger2 != null ? C10351I0.m26494a(asInteger2.intValue()) : i0;
        this.f26281y = contentValues.getAsBoolean("attribution_id_changed");
        this.f26282z = contentValues.getAsInteger("open_id");
    }
}
