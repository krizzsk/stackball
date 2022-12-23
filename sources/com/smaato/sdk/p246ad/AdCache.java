package com.smaato.sdk.p246ad;

import com.smaato.sdk.util.Predicate;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.smaato.sdk.ad.AdCache */
public class AdCache<T> {
    private final Map<String, Bucket<T>> cache = new ConcurrentHashMap();
    private final int capacity;
    private final Predicate<T> validator;

    public AdCache(int i, Predicate<T> predicate) {
        this.capacity = i;
        this.validator = predicate;
    }

    public int remainingCapacity(String str) {
        if (str != null) {
            return this.capacity - getOrCreateBucket(str).size();
        }
        throw new NullPointerException("'key' specified as non-null is null");
    }

    public int trim(String str) {
        if (str != null) {
            Bucket orCreateBucket = getOrCreateBucket(str);
            Iterator it = orCreateBucket.iterator();
            while (it.hasNext()) {
                if (!this.validator.test(it.next())) {
                    it.remove();
                }
            }
            return this.capacity - orCreateBucket.size();
        }
        throw new NullPointerException("'key' specified as non-null is null");
    }

    public boolean put(String str, T t) {
        if (str == null) {
            throw new NullPointerException("'key' specified as non-null is null");
        } else if (t != null) {
            return getOrCreateBucket(str).offer(t);
        } else {
            throw new NullPointerException("'value' specified as non-null is null");
        }
    }

    public T get(String str) {
        if (str != null) {
            return getOrCreateBucket(str).peek();
        }
        throw new NullPointerException("'key' specified as non-null is null");
    }

    public T getAndRemove(String str, Predicate<T> predicate) {
        if (str == null) {
            throw new NullPointerException("'key' specified as non-null is null");
        } else if (predicate != null) {
            Iterator it = getOrCreateBucket(str).iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (predicate.test(next)) {
                    it.remove();
                    return next;
                }
            }
            return null;
        } else {
            throw new NullPointerException("'predicate' specified as non-null is null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = new com.smaato.sdk.p246ad.AdCache.Bucket<>(r2.capacity);
        r3 = r2.cache.put(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.smaato.sdk.p246ad.AdCache.Bucket<T> getOrCreateBucket(java.lang.String r3) {
        /*
            r2 = this;
            java.util.Map<java.lang.String, com.smaato.sdk.ad.AdCache$Bucket<T>> r0 = r2.cache
            java.lang.Object r0 = r0.get(r3)
            com.smaato.sdk.ad.AdCache$Bucket r0 = (com.smaato.sdk.p246ad.AdCache.Bucket) r0
            if (r0 != 0) goto L_0x001c
            com.smaato.sdk.ad.AdCache$Bucket r0 = new com.smaato.sdk.ad.AdCache$Bucket
            int r1 = r2.capacity
            r0.<init>(r1)
            java.util.Map<java.lang.String, com.smaato.sdk.ad.AdCache$Bucket<T>> r1 = r2.cache
            java.lang.Object r3 = r1.put(r3, r0)
            com.smaato.sdk.ad.AdCache$Bucket r3 = (com.smaato.sdk.p246ad.AdCache.Bucket) r3
            if (r3 == 0) goto L_0x001c
            return r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.p246ad.AdCache.getOrCreateBucket(java.lang.String):com.smaato.sdk.ad.AdCache$Bucket");
    }

    /* renamed from: com.smaato.sdk.ad.AdCache$Bucket */
    static class Bucket<T> extends AbstractQueue<T> {
        private final int capacity;
        private final Queue<T> objects = new ConcurrentLinkedQueue();

        Bucket(int i) {
            this.capacity = i;
        }

        public final boolean offer(T t) {
            return this.objects.size() < this.capacity && this.objects.offer(t);
        }

        public final T poll() {
            return this.objects.poll();
        }

        public final T peek() {
            return this.objects.peek();
        }

        public final int size() {
            return this.objects.size();
        }

        public final Iterator<T> iterator() {
            return this.objects.iterator();
        }
    }
}
