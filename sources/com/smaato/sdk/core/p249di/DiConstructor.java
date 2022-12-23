package com.smaato.sdk.core.p249di;

import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.smaato.sdk.core.di.DiConstructor */
public final class DiConstructor {
    private final Map<DiKey, ClassFactory> holder = new HashMap();

    @SafeVarargs
    private DiConstructor(Map<DiKey, ClassFactory>... mapArr) {
        for (Map<DiKey, ClassFactory> entrySet : mapArr) {
            for (Map.Entry next : entrySet.entrySet()) {
                DiKey diKey = (DiKey) next.getKey();
                if (!this.holder.containsKey(diKey)) {
                    this.holder.put(next.getKey(), next.getValue());
                } else {
                    throw new IllegalStateException("There is already registered factory for ".concat(String.valueOf(diKey)));
                }
            }
        }
    }

    public static DiConstructor create(DiRegistry diRegistry) {
        return new DiConstructor(diRegistry.holder);
    }

    public static DiConstructor create(DiRegistry... diRegistryArr) {
        Objects.requireNonNull(diRegistryArr);
        if (diRegistryArr.length != 0) {
            ArrayList arrayList = new ArrayList(diRegistryArr.length);
            for (DiRegistry diRegistry : diRegistryArr) {
                arrayList.add(diRegistry.holder);
            }
            return create((Map<DiKey, ClassFactory>[]) (Map[]) arrayList.toArray(new Map[0]));
        }
        throw new IllegalStateException("No registries passed");
    }

    public static DiConstructor create(Set<DiRegistry> set) {
        return create((DiRegistry[]) set.toArray(new DiRegistry[0]));
    }

    @SafeVarargs
    private static DiConstructor create(Map<DiKey, ClassFactory>... mapArr) {
        return new DiConstructor(mapArr);
    }

    public final <T> T get(Class<T> cls) {
        return get((String) null, cls);
    }

    public final <T> T get(String str, Class<T> cls) {
        Objects.requireNonNull(cls);
        try {
            ClassFactory classFactory = this.holder.get(new DiKey(str, cls));
            if (classFactory != null) {
                return Objects.requireNonNull(cls.cast(classFactory.get(this)), "FACTORY RETURNED NULL.");
            }
            throw new CannotConstructInstanceException("NO FACTORY PROVIDED. Cannot create instance of " + cls + " named '" + str + "'");
        } catch (ClassCastException e) {
            throw new CannotConstructInstanceException("FACTORY RETURNED WRONG INSTANCE. Cannot create instance of " + cls + " named '" + str + "'", e);
        } catch (Exception e2) {
            if (e2 instanceof CannotConstructInstanceException) {
                throw e2;
            }
            throw new CannotConstructInstanceException("Cannot create instance of " + cls + " named '" + str + "'", e2);
        }
    }

    public final <T> T getOrNull(Class<T> cls) {
        return getOrNull((String) null, cls);
    }

    public final <T> T getOrNull(String str, Class<T> cls) {
        try {
            return get(str, cls);
        } catch (CannotConstructInstanceException unused) {
            return null;
        }
    }

    public final DiConstructor addRegistry(DiRegistry diRegistry) {
        Objects.requireNonNull(diRegistry);
        return create((Map<DiKey, ClassFactory>[]) new Map[]{this.holder, diRegistry.holder});
    }
}
