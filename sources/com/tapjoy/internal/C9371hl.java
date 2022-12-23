package com.tapjoy.internal;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hl */
public final class C9371hl implements Flushable {

    /* renamed from: a */
    final Object f23230a = this;

    /* renamed from: b */
    C9081ax f23231b;

    /* renamed from: c */
    private final File f23232c;

    public C9371hl(File file) {
        this.f23232c = file;
        try {
            this.f23231b = C9078au.m24312a((C9081ax) new C9299g(file, new C9088bd() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo57833a(OutputStream outputStream, Object obj) {
                    C9232ev.f22672c.mo57998a(outputStream, (Object) (C9232ev) obj);
                }

                /* renamed from: b */
                public final /* synthetic */ Object mo57832b(InputStream inputStream) {
                    return (C9232ev) C9232ev.f22672c.mo57995a(inputStream);
                }
            }));
        } catch (Exception unused) {
            mo58309a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58309a() {
        this.f23232c.delete();
        C9081ax axVar = this.f23231b;
        if (axVar instanceof Closeable) {
            try {
                ((Closeable) axVar).close();
            } catch (Exception unused) {
            }
        }
        this.f23231b = new C9079av(new LinkedList());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void flush() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f23230a
            monitor-enter(r0)
            com.tapjoy.internal.ax r1 = r2.f23231b     // Catch:{ all -> 0x0016 }
            boolean r1 = r1 instanceof java.io.Flushable     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0014
            com.tapjoy.internal.ax r1 = r2.f23231b     // Catch:{ Exception -> 0x0011 }
            java.io.Flushable r1 = (java.io.Flushable) r1     // Catch:{ Exception -> 0x0011 }
            r1.flush()     // Catch:{ Exception -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            r2.mo58309a()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9371hl.flush():void");
    }

    /* renamed from: b */
    public final int mo58311b() {
        int size;
        synchronized (this.f23230a) {
            try {
                size = this.f23231b.size();
            } catch (Exception unused) {
                mo58309a();
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return size;
    }

    /* renamed from: c */
    public final boolean mo58313c() {
        boolean isEmpty;
        synchronized (this.f23230a) {
            try {
                isEmpty = this.f23231b.isEmpty();
            } catch (Exception unused) {
                mo58309a();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return isEmpty;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58310a(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f23230a
            monitor-enter(r0)
            com.tapjoy.internal.ax r1 = r2.f23231b     // Catch:{ Exception -> 0x000b }
            r1.mo57778b(r3)     // Catch:{ Exception -> 0x000b }
            goto L_0x000e
        L_0x0009:
            r3 = move-exception
            goto L_0x0010
        L_0x000b:
            r2.mo58309a()     // Catch:{ all -> 0x0009 }
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9371hl.mo58310a(int):void");
    }

    @Nullable
    /* renamed from: b */
    public final C9232ev mo58312b(int i) {
        C9232ev evVar;
        synchronized (this.f23230a) {
            try {
                evVar = (C9232ev) this.f23231b.mo57777a(i);
            } catch (Exception unused) {
                mo58309a();
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return evVar;
    }
}
