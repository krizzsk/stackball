package com.yandex.mobile.ads.exo.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.C12290g;
import com.yandex.mobile.ads.impl.C12874dd;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13504jj;
import com.yandex.mobile.ads.impl.C13957m7;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.exo.source.g */
public interface C12290g {

    /* renamed from: com.yandex.mobile.ads.exo.source.g$a */
    public static final class C12291a {

        /* renamed from: a */
        public final int f30090a;

        /* renamed from: b */
        public final C12287f.C12288a f30091b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C12292a> f30092c;

        /* renamed from: d */
        private final long f30093d;

        /* renamed from: com.yandex.mobile.ads.exo.source.g$a$a */
        private static final class C12292a {

            /* renamed from: a */
            public final Handler f30094a;

            /* renamed from: b */
            public final C12290g f30095b;

            public C12292a(Handler handler, C12290g gVar) {
                this.f30094a = handler;
                this.f30095b = gVar;
            }
        }

        public C12291a() {
            this(new CopyOnWriteArrayList(), 0, (C12287f.C12288a) null, 0);
        }

        /* renamed from: a */
        public C12291a mo65286a(int i, C12287f.C12288a aVar, long j) {
            return new C12291a(this.f30092c, i, aVar, j);
        }

        /* renamed from: b */
        public void mo65297b() {
            C12287f.C12288a aVar = this.f30091b;
            aVar.getClass();
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, aVar) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12287f.C12288a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32297b(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: c */
        public void mo65301c(C12293b bVar, C12294c cVar) {
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, bVar, cVar) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12290g.C12293b f$2;
                    public final /* synthetic */ C12290g.C12294c f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32300c(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        private C12291a(CopyOnWriteArrayList<C12292a> copyOnWriteArrayList, int i, C12287f.C12288a aVar, long j) {
            this.f30092c = copyOnWriteArrayList;
            this.f30090a = i;
            this.f30091b = aVar;
            this.f30093d = j;
        }

        /* renamed from: a */
        public void mo65289a(Handler handler, C12290g gVar) {
            C13479j9.m37705a((handler == null || gVar == null) ? false : true);
            this.f30092c.add(new C12292a(handler, gVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m32300c(C12290g gVar, C12293b bVar, C12294c cVar) {
            ((C13957m7) gVar).mo68594c(this.f30090a, this.f30091b, bVar, cVar);
        }

        /* renamed from: a */
        public void mo65293a(C12290g gVar) {
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                if (next.f30095b == gVar) {
                    this.f30092c.remove(next);
                }
            }
        }

        /* renamed from: c */
        public void mo65300c() {
            C12287f.C12288a aVar = this.f30091b;
            aVar.getClass();
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, aVar) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12287f.C12288a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32299c(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m32297b(C12290g gVar, C12287f.C12288a aVar) {
            ((C13957m7) gVar).mo68593c(this.f30090a, aVar);
        }

        /* renamed from: a */
        public void mo65287a() {
            C12287f.C12288a aVar = this.f30091b;
            aVar.getClass();
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, aVar) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12287f.C12288a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32293a(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo65299b(C13504jj jjVar, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            mo65298b(new C12293b(jjVar, uri, map, j3, j4, j5), new C12294c(i, i2, (Format) null, i3, (Object) null, m32291a(j), m32291a(j2)));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m32299c(C12290g gVar, C12287f.C12288a aVar) {
            ((C13957m7) gVar).mo68596d(this.f30090a, aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m32293a(C12290g gVar, C12287f.C12288a aVar) {
            ((C13957m7) gVar).mo68591b(this.f30090a, aVar);
        }

        /* renamed from: a */
        public void mo65294a(C13504jj jjVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
            C13504jj jjVar2 = jjVar;
            mo65301c(new C12293b(jjVar2, jjVar2.f35322a, Collections.emptyMap(), j3, 0, 0), new C12294c(i, i2, (Format) null, i3, (Object) null, m32291a(j), m32291a(j2)));
        }

        /* renamed from: b */
        public void mo65298b(C12293b bVar, C12294c cVar) {
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, bVar, cVar) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12290g.C12293b f$2;
                    public final /* synthetic */ C12290g.C12294c f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32298b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m32298b(C12290g gVar, C12293b bVar, C12294c cVar) {
            ((C13957m7) gVar).mo68592b(this.f30090a, this.f30091b, bVar, cVar);
        }

        /* renamed from: a */
        public void mo65295a(C13504jj jjVar, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            mo65290a(new C12293b(jjVar, uri, map, j3, j4, j5), new C12294c(i, i2, (Format) null, i3, (Object) null, m32291a(j), m32291a(j2)));
        }

        /* renamed from: a */
        public void mo65290a(C12293b bVar, C12294c cVar) {
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, bVar, cVar) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12290g.C12293b f$2;
                    public final /* synthetic */ C12290g.C12294c f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32294a(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m32294a(C12290g gVar, C12293b bVar, C12294c cVar) {
            ((C13957m7) gVar).mo68585a(this.f30090a, this.f30091b, bVar, cVar);
        }

        /* renamed from: a */
        public void mo65296a(C13504jj jjVar, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            mo65291a(new C12293b(jjVar, uri, map, j3, j4, j5), new C12294c(i, i2, (Format) null, i3, (Object) null, m32291a(j), m32291a(j2)), iOException, z);
        }

        /* renamed from: a */
        public void mo65291a(C12293b bVar, C12294c cVar, IOException iOException, boolean z) {
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, bVar, cVar, iOException, z) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12290g.C12293b f$2;
                    public final /* synthetic */ C12290g.C12294c f$3;
                    public final /* synthetic */ IOException f$4;
                    public final /* synthetic */ boolean f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32295a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m32295a(C12290g gVar, C12293b bVar, C12294c cVar, IOException iOException, boolean z) {
            ((C13957m7) gVar).mo68586a(this.f30090a, this.f30091b, bVar, cVar, iOException, z);
        }

        /* renamed from: a */
        public void mo65288a(int i, Format format, int i2, Object obj, long j) {
            mo65292a(new C12294c(1, i, format, i2, (Object) null, m32291a(j), -9223372036854775807L));
        }

        /* renamed from: a */
        public void mo65292a(C12294c cVar) {
            Iterator<C12292a> it = this.f30092c.iterator();
            while (it.hasNext()) {
                C12292a next = it.next();
                m32292a(next.f30094a, (Runnable) new Runnable(next.f30095b, cVar) {
                    public final /* synthetic */ C12290g f$1;
                    public final /* synthetic */ C12290g.C12294c f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C12290g.C12291a.this.m32296a(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m32296a(C12290g gVar, C12294c cVar) {
            ((C13957m7) gVar).mo68587a(this.f30090a, this.f30091b, cVar);
        }

        /* renamed from: a */
        private long m32291a(long j) {
            long b = C12874dd.m35213b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f30093d + b;
        }

        /* renamed from: a */
        private void m32292a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.g$b */
    public static final class C12293b {
        public C12293b(C13504jj jjVar, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.g$c */
    public static final class C12294c {

        /* renamed from: a */
        public final Object f30096a;

        public C12294c(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            this.f30096a = obj;
        }
    }
}
