package com.tapjoy.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.tapjoy.internal.gj */
public class C9321gj extends Observable {

    /* renamed from: b */
    public final List f23064b = new ArrayList();

    /* renamed from: com.tapjoy.internal.gj$a */
    public class C9322a {

        /* renamed from: a */
        public final String f23065a;

        /* renamed from: b */
        public volatile Map f23066b;

        C9322a(String str) {
            this.f23065a = str;
        }

        /* renamed from: a */
        public final Object mo58213a(String str) {
            Map map = this.f23066b;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9322a mo58208a(String str) {
        C9322a aVar = new C9322a(str);
        this.f23064b.add(aVar);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void setChanged() {
        super.setChanged();
        notifyObservers();
    }

    /* renamed from: a */
    public final boolean mo58209a(String str, boolean z) {
        for (C9322a a : this.f23064b) {
            Object a2 = a.mo58213a(str);
            if (a2 != null) {
                if (a2 instanceof Boolean) {
                    return ((Boolean) a2).booleanValue();
                }
                if (!(a2 instanceof String)) {
                    continue;
                } else if ("true".equals(a2)) {
                    return true;
                } else {
                    if ("false".equals(a2)) {
                        return false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public final long mo58210b(String str) {
        for (C9322a a : this.f23064b) {
            Object a2 = a.mo58213a(str);
            if (a2 != null) {
                if (a2 instanceof Number) {
                    return ((Number) a2).longValue();
                }
                if (a2 instanceof String) {
                    try {
                        return Long.parseLong((String) a2);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static long m24991a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final C9320gi mo58211c(String str) {
        double parseDouble;
        for (C9322a a : this.f23064b) {
            Object a2 = a.mo58213a(str);
            if (a2 instanceof List) {
                List list = (List) a2;
                try {
                    long a3 = m24991a(list.get(0));
                    long a4 = m24991a(list.get(1));
                    long a5 = m24991a(list.get(2));
                    Object obj = list.get(3);
                    if (obj instanceof Number) {
                        parseDouble = ((Number) obj).doubleValue();
                    } else if (obj instanceof String) {
                        parseDouble = Double.parseDouble((String) obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return new C9320gi(a3, a4, a5, parseDouble);
                } catch (RuntimeException unused) {
                }
            }
        }
        return C9320gi.f23058a;
    }
}
