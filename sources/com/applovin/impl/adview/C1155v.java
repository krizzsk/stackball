package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.v */
public final class C1155v {

    /* renamed from: a */
    private C1469j f2128a;

    /* renamed from: b */
    private JSONObject f2129b;

    public C1155v(JSONObject jSONObject, C1469j jVar) {
        this.f2128a = jVar;
        this.f2129b = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo12070a() {
        int i;
        String b = C1521i.m3487b(this.f2129b, "mixed_content_mode", (String) null, this.f2128a);
        if (C1553o.m3554b(b)) {
            if ("always_allow".equalsIgnoreCase(b)) {
                i = 0;
            } else if ("never_allow".equalsIgnoreCase(b)) {
                i = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(b)) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public WebSettings.PluginState mo12071b() {
        String b = C1521i.m3487b(this.f2129b, "plugin_state", (String) null, this.f2128a);
        if (C1553o.m3554b(b)) {
            if (TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON.equalsIgnoreCase(b)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(b)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(b)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Boolean mo12072c() {
        return C1521i.m3463a(this.f2129b, "allow_file_access", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Boolean mo12073d() {
        return C1521i.m3463a(this.f2129b, "load_with_overview_mode", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Boolean mo12074e() {
        return C1521i.m3463a(this.f2129b, "use_wide_view_port", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Boolean mo12075f() {
        return C1521i.m3463a(this.f2129b, "allow_content_access", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean mo12076g() {
        return C1521i.m3463a(this.f2129b, "use_built_in_zoom_controls", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Boolean mo12077h() {
        return C1521i.m3463a(this.f2129b, "display_zoom_controls", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Boolean mo12078i() {
        return C1521i.m3463a(this.f2129b, "save_form_data", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Boolean mo12079j() {
        return C1521i.m3463a(this.f2129b, "geolocation_enabled", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Boolean mo12080k() {
        return C1521i.m3463a(this.f2129b, "need_initial_focus", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Boolean mo12081l() {
        return C1521i.m3463a(this.f2129b, "allow_file_access_from_file_urls", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Boolean mo12082m() {
        return C1521i.m3463a(this.f2129b, "allow_universal_access_from_file_urls", (Boolean) null, this.f2128a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Boolean mo12083n() {
        return C1521i.m3463a(this.f2129b, "offscreen_pre_raster", (Boolean) null, this.f2128a);
    }
}
