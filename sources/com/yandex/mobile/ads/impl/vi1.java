package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.models.p268ad.JavaScriptResource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class vi1 implements in1 {

    /* renamed from: a */
    private final String f41297a;

    /* renamed from: b */
    private final JavaScriptResource f41298b;

    /* renamed from: c */
    private final String f41299c;

    /* renamed from: d */
    private final Map<String, List<String>> f41300d;

    public vi1(String str, JavaScriptResource javaScriptResource, String str2, Map<String, List<String>> map) {
        this.f41297a = str;
        this.f41298b = javaScriptResource;
        this.f41299c = str2;
        this.f41300d = map;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo65493a() {
        return Collections.unmodifiableMap(this.f41300d);
    }

    /* renamed from: b */
    public JavaScriptResource mo70494b() {
        return this.f41298b;
    }

    /* renamed from: c */
    public String mo70495c() {
        return this.f41299c;
    }

    /* renamed from: d */
    public String mo70496d() {
        return this.f41297a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vi1.class != obj.getClass()) {
            return false;
        }
        vi1 vi1 = (vi1) obj;
        if (!this.f41297a.equals(vi1.f41297a)) {
            return false;
        }
        JavaScriptResource javaScriptResource = this.f41298b;
        if (javaScriptResource == null ? vi1.f41298b != null : !javaScriptResource.equals(vi1.f41298b)) {
            return false;
        }
        String str = this.f41299c;
        if (str == null ? vi1.f41299c == null : str.equals(vi1.f41299c)) {
            return this.f41300d.equals(vi1.f41300d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f41297a.hashCode() * 31;
        JavaScriptResource javaScriptResource = this.f41298b;
        int i = 0;
        int hashCode2 = (hashCode + (javaScriptResource != null ? javaScriptResource.hashCode() : 0)) * 31;
        String str = this.f41299c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f41300d.hashCode();
    }
}
