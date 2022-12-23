package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;

public class lt0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final v51 f36913a;

    /* renamed from: b */
    private final y70 f36914b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f36915c;

    public lt0(AdResponse<?> adResponse, ae1 ae1, ht0 ht0) {
        this.f36914b = new w51().mo70650a(adResponse, new C13896b(), ht0);
        this.f36913a = new v51(ae1);
    }

    /* renamed from: c */
    public void mo68507c() {
        y70 y70 = this.f36914b;
        if (y70 != null) {
            y70.resume();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lt0$b */
    private class C13896b implements r11 {
        private C13896b() {
        }

        /* renamed from: a */
        public void mo68508a() {
            if (lt0.this.f36915c != null) {
                lt0.this.f36915c.setVisibility(8);
            }
        }

        /* renamed from: a */
        public void mo68509a(long j, long j2) {
            if (lt0.this.f36915c != null) {
                lt0.this.f36913a.mo70449a(lt0.this.f36915c, j, j2);
            }
        }
    }

    /* renamed from: a */
    public void mo68505a(View view) {
        this.f36915c = view;
        y70 y70 = this.f36914b;
        if (y70 != null) {
            y70.mo65894a();
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo68506b() {
        y70 y70 = this.f36914b;
        if (y70 != null) {
            y70.pause();
        }
    }

    /* renamed from: a */
    public void mo68504a() {
        this.f36915c = null;
        y70 y70 = this.f36914b;
        if (y70 != null) {
            y70.invalidate();
        }
    }
}
