package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.th */
public class C14680th {

    /* renamed from: a */
    private final Map<String, Object> f40323a = new HashMap();

    /* renamed from: b */
    private final List<String> f40324b = new ArrayList();

    /* renamed from: a */
    public static C14680th m42345a(C14680th thVar, long j) {
        Long valueOf = Long.valueOf(j);
        Map<String, Object> map = thVar.f40323a;
        valueOf.getClass();
        map.put(ContentMetadata.KEY_CONTENT_LENGTH, valueOf);
        thVar.f40324b.remove(ContentMetadata.KEY_CONTENT_LENGTH);
        return thVar;
    }

    /* renamed from: b */
    public List<String> mo70181b() {
        return Collections.unmodifiableList(new ArrayList(this.f40324b));
    }

    /* renamed from: a */
    public static C14680th m42346a(C14680th thVar, Uri uri) {
        if (uri == null) {
            thVar.f40324b.add(ContentMetadata.KEY_REDIRECTED_URI);
            thVar.f40323a.remove(ContentMetadata.KEY_REDIRECTED_URI);
            return thVar;
        }
        String uri2 = uri.toString();
        Map<String, Object> map = thVar.f40323a;
        uri2.getClass();
        map.put(ContentMetadata.KEY_REDIRECTED_URI, uri2);
        thVar.f40324b.remove(ContentMetadata.KEY_REDIRECTED_URI);
        return thVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo70180a() {
        HashMap hashMap = new HashMap(this.f40323a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
