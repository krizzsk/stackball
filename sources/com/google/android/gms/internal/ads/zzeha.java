package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzeha<T> implements zzegt<T>, zzehm<T> {
    private static final Object zzije = new Object();
    private volatile Object zzdyi = zzije;
    private volatile zzehm<T> zzijf;

    private zzeha(zzehm<T> zzehm) {
        this.zzijf = zzehm;
    }

    public final T get() {
        T t = this.zzdyi;
        if (t == zzije) {
            synchronized (this) {
                t = this.zzdyi;
                if (t == zzije) {
                    t = this.zzijf.get();
                    T t2 = this.zzdyi;
                    if (t2 != zzije && !(t2 instanceof zzehg)) {
                        if (t2 != t) {
                            String valueOf = String.valueOf(t2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.zzdyi = t;
                    this.zzijf = null;
                }
            }
        }
        return t;
    }

    public static <P extends zzehm<T>, T> zzehm<T> zzar(P p) {
        zzehf.checkNotNull(p);
        if (p instanceof zzeha) {
            return p;
        }
        return new zzeha(p);
    }

    public static <P extends zzehm<T>, T> zzegt<T> zzas(P p) {
        if (p instanceof zzegt) {
            return (zzegt) p;
        }
        return new zzeha((zzehm) zzehf.checkNotNull(p));
    }
}
