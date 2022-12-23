package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.jf */
public final class C9449jf {

    /* renamed from: a */
    public static C9449jf f23479a = new C9449jf((String) null);

    /* renamed from: b */
    public String f23480b;

    /* renamed from: c */
    public Throwable f23481c;

    /* renamed from: d */
    private Object[] f23482d;

    public C9449jf(String str) {
        this(str, (Object[]) null, (Throwable) null);
    }

    public C9449jf(String str, Object[] objArr, Throwable th) {
        this.f23480b = str;
        this.f23481c = th;
        if (th == null) {
            this.f23482d = objArr;
        } else if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        } else {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.f23482d = objArr2;
        }
    }
}
