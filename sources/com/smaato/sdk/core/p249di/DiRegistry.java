package com.smaato.sdk.core.p249di;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.di.DiRegistry */
public final class DiRegistry {
    Map<DiKey, ClassFactory> holder = new HashMap();

    private DiRegistry() {
    }

    /* renamed from: of */
    public static DiRegistry m24065of(Consumer<DiRegistry> consumer) {
        DiRegistry diRegistry = new DiRegistry();
        consumer.accept(diRegistry);
        return diRegistry;
    }

    public final <T> void registerFactory(Class<T> cls, ClassFactory<T> classFactory) {
        registerFactory((String) null, cls, classFactory);
    }

    public final <T> void registerFactory(String str, Class<T> cls, ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        Objects.requireNonNull(cls);
        DiKey diKey = new DiKey(str, cls);
        ensureUniqueKey(diKey);
        this.holder.put(diKey, classFactory);
    }

    public final <T> void registerSingletonFactory(Class<T> cls, ClassFactory<T> classFactory) {
        registerSingletonFactory((String) null, cls, classFactory);
    }

    public final <T> void registerSingletonFactory(String str, Class<T> cls, ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        Objects.requireNonNull(cls);
        DiKey diKey = new DiKey(str, cls);
        ensureUniqueKey(diKey);
        this.holder.put(diKey, SingletonFactory.wrap(classFactory));
    }

    private void ensureUniqueKey(DiKey diKey) {
        if (this.holder.containsKey(diKey)) {
            throw new IllegalStateException("There is already registered factory for ".concat(String.valueOf(diKey)));
        }
    }

    public final DiRegistry addFrom(DiRegistry diRegistry) {
        if (diRegistry != null) {
            for (Map.Entry next : diRegistry.holder.entrySet()) {
                DiKey diKey = (DiKey) next.getKey();
                ensureUniqueKey(diKey);
                this.holder.put(diKey, next.getValue());
            }
        }
        return this;
    }
}
