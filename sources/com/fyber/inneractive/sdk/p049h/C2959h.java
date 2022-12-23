package com.fyber.inneractive.sdk.p049h;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.h.h */
abstract class C2959h {

    /* renamed from: a */
    Map<String, Object> f7120a;

    /* renamed from: b */
    private String f7121b;

    /* renamed from: c */
    private String f7122c = null;

    /* renamed from: d */
    public abstract boolean mo18428d();

    C2959h(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7120a = new HashMap();
            this.f7121b = str;
            return;
        }
        throw new InvalidParameterException();
    }

    /* renamed from: a */
    public String mo18423a() {
        return this.f7121b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18425a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f7120a.put(str, obj);
        }
    }

    /* renamed from: b */
    public void mo18426b() {
        if (mo18428d()) {
            C2952c s = IAConfigManager.m5948s();
            s.f7102a.offer(C2952c.m6615a(this));
            if (s.f7102a.size() > 30) {
                s.mo18412a();
                if (s.f7104c != null) {
                    s.f7104c.sendEmptyMessage(12312329);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo18424a(String str) {
        this.f7122c = str;
    }

    /* renamed from: c */
    public String mo18427c() {
        return this.f7122c;
    }
}
