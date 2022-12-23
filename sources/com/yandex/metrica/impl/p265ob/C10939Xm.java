package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Xm */
public class C10939Xm<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f26299a;

    /* renamed from: b */
    private int f26300b;

    /* renamed from: c */
    private int f26301c;

    /* renamed from: d */
    private int f26302d;

    /* renamed from: e */
    private int f26303e;

    /* renamed from: f */
    private int f26304f;

    /* renamed from: g */
    private int f26305g;

    public C10939Xm(int i) {
        if (i > 0) {
            this.f26301c = i;
            this.f26299a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: b */
    private int m28229b(K k, V v) {
        Pair pair = (Pair) v;
        int length = C10585O2.m27106c(((C10937Xk) k).f26297b).length + 4 + 4 + 4;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    public final synchronized V mo62493a(K k) {
        V v = this.f26299a.get(k);
        if (v != null) {
            this.f26304f++;
            return v;
        }
        this.f26305g++;
        return null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f26304f;
        i2 = this.f26305g + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f26301c), Integer.valueOf(this.f26304f), Integer.valueOf(this.f26305g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    /* renamed from: a */
    public final synchronized V mo62494a(K k, V v) {
        V put;
        this.f26302d++;
        this.f26300b += m28229b(k, v);
        put = this.f26299a.put(k, v);
        if (put != null) {
            this.f26300b -= m28229b(k, put);
        }
        m28228a(this.f26301c);
        return put;
    }

    /* renamed from: a */
    private void m28228a(int i) {
        Map.Entry next;
        while (this.f26300b > i && !this.f26299a.isEmpty() && (next = this.f26299a.entrySet().iterator().next()) != null) {
            Object key = next.getKey();
            Object value = next.getValue();
            this.f26299a.remove(key);
            this.f26300b -= m28229b(key, value);
            this.f26303e++;
        }
        if (this.f26300b < 0 || (this.f26299a.isEmpty() && this.f26300b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* renamed from: a */
    public final synchronized void mo62495a() {
        m28228a(-1);
    }
}
