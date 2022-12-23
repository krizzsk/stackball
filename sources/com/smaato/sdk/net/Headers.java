package com.smaato.sdk.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public abstract class Headers implements Iterable<Map.Entry<String, List<String>>> {
    /* access modifiers changed from: package-private */
    public abstract Map<String, List<String>> headers();

    public static Builder builder() {
        return new Builder(Collections.emptyMap());
    }

    /* renamed from: of */
    public static Headers m24082of(Map<String, List<String>> map) {
        if (map != null) {
            return new Builder(map).build();
        }
        throw new NullPointerException("'headers' specified as non-null is null");
    }

    public static Headers empty() {
        return new AutoValue_Headers(Collections.emptyMap());
    }

    public Set<String> names() {
        return headers().keySet();
    }

    public List<String> values(String str) {
        if (str != null) {
            List<String> list = headers().get(str);
            return list == null ? Collections.emptyList() : list;
        }
        throw new NullPointerException("'name' specified as non-null is null");
    }

    public int size() {
        return headers().size();
    }

    public Builder buildUpon() {
        return new Builder(headers());
    }

    public Iterator<Map.Entry<String, List<String>>> iterator() {
        return headers().entrySet().iterator();
    }

    public static class Builder {
        private final Map<String, List<String>> headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);

        Builder(Map<String, List<String>> map) {
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() != null) {
                    this.headers.put(next.getKey(), next.getValue());
                }
            }
        }

        public Builder put(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("'name' specified as non-null is null");
            } else if (str2 != null) {
                List list = this.headers.get(str);
                if (list == null) {
                    list = new ArrayList();
                    this.headers.put(str, list);
                }
                list.add(str2);
                return this;
            } else {
                throw new NullPointerException("'value' specified as non-null is null");
            }
        }

        public Headers build() {
            return new AutoValue_Headers(Collections.unmodifiableMap(this.headers));
        }
    }
}
