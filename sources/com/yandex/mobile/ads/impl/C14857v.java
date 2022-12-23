package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.C15221y;
import com.yandex.mobile.ads.impl.h41;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.v */
public class C14857v {

    /* renamed from: a */
    private final Context f41162a;

    /* renamed from: b */
    private final C15221y f41163b;

    /* renamed from: c */
    private final C14858a f41164c = new C14858a(this);

    /* renamed from: d */
    private final C14332q f41165d = C14433r.m41458a();

    /* renamed from: e */
    private final vb1 f41166e = vb1.m43082a();

    public C14857v(Context context, C14645t1 t1Var, C15126x xVar, FalseClick falseClick) {
        this.f41162a = context.getApplicationContext();
        this.f41163b = new C15221y(context, t1Var, xVar, falseClick);
    }

    /* renamed from: a */
    public void mo70424a() {
        this.f41165d.mo69461b(this.f41162a, (C15287z) this.f41164c);
        this.f41165d.mo69460b(this.f41162a, (j51) this.f41164c);
    }

    /* renamed from: b */
    public void mo70426b() {
        this.f41163b.mo70953a(C15221y.C15222a.CUSTOM);
    }

    /* renamed from: c */
    public void mo70427c() {
        this.f41163b.mo70954b(C15221y.C15222a.CUSTOM);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo70428d() {
        this.f41163b.mo70953a(C15221y.C15222a.BROWSER);
        this.f41165d.mo69459a(this.f41162a, (C15287z) this.f41164c);
        this.f41165d.mo69458a(this.f41162a, (j51) this.f41164c);
        this.f41166e.mo70468a(ji0.RETURN_TO_APP, this);
    }

    /* renamed from: e */
    public void mo70429e() {
        this.f41166e.mo70469b(ji0.RETURN_TO_APP, this);
        this.f41165d.mo69461b(this.f41162a, (C15287z) this.f41164c);
        this.f41165d.mo69460b(this.f41162a, (j51) this.f41164c);
        this.f41163b.mo70954b(C15221y.C15222a.BROWSER);
    }

    /* renamed from: f */
    public void mo70430f() {
        this.f41163b.mo70953a(C15221y.C15222a.WEBVIEW);
    }

    /* renamed from: g */
    public void mo70431g() {
        this.f41163b.mo70954b(C15221y.C15222a.WEBVIEW);
    }

    /* renamed from: a */
    public void mo70425a(h41.C13275a aVar) {
        this.f41163b.mo70952a(aVar);
    }

    /* renamed from: com.yandex.mobile.ads.impl.v$a */
    static class C14858a implements C15287z, j51 {

        /* renamed from: a */
        private WeakReference<Activity> f41167a;

        /* renamed from: b */
        private String f41168b;

        /* renamed from: c */
        private final C14857v f41169c;

        C14858a(C14857v vVar) {
            this.f41169c = vVar;
        }

        /* renamed from: a */
        public void mo67930a(Activity activity, Bundle bundle) {
            String string;
            Objects.toString(activity);
            if (bundle != null && (string = bundle.getString("yandex_mobile_ads_activity_id")) != null && string.equals(this.f41168b)) {
                this.f41169c.mo70428d();
            }
        }

        /* renamed from: b */
        public void mo70433b(Activity activity) {
            Objects.toString(activity);
            WeakReference<Activity> weakReference = this.f41167a;
            if (weakReference != null && activity.equals(weakReference.get())) {
                this.f41169c.mo70428d();
            }
        }

        /* renamed from: a */
        public void mo70432a(Activity activity) {
            Objects.toString(activity);
            if (this.f41167a == null) {
                this.f41167a = new WeakReference<>(activity);
            }
        }

        /* renamed from: b */
        public void mo67931b(Activity activity, Bundle bundle) {
            WeakReference<Activity> weakReference;
            Objects.toString(activity);
            if (bundle != null && (weakReference = this.f41167a) != null && activity.equals(weakReference.get())) {
                String uuid = UUID.randomUUID().toString();
                this.f41168b = uuid;
                bundle.putString("yandex_mobile_ads_activity_id", uuid);
            }
        }
    }
}
