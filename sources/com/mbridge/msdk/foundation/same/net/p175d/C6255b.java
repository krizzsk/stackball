package com.mbridge.msdk.foundation.same.net.p175d;

import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6290i;
import com.mbridge.msdk.foundation.same.net.C6291j;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.b */
/* compiled from: FileDownloader */
public final class C6255b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6291j f15520a;

    /* renamed from: b */
    private int f15521b;

    /* renamed from: c */
    private LinkedList<C6257a> f15522c = new LinkedList<>();

    public C6255b(C6291j jVar, int i) {
        this.f15520a = jVar;
        this.f15521b = i;
    }

    /* renamed from: a */
    public final C6257a mo43840a(File file, String str, C6263e<Void> eVar) {
        C6257a aVar = new C6257a(file, str, eVar);
        synchronized (this) {
            this.f15522c.add(aVar);
        }
        m15810a();
        return aVar;
    }

    /* renamed from: a */
    private void m15810a() {
        synchronized (this) {
            int i = 0;
            Iterator it = this.f15522c.iterator();
            while (it.hasNext()) {
                if (((C6257a) it.next()).mo43841a()) {
                    i++;
                }
            }
            if (i < this.f15521b) {
                Iterator it2 = this.f15522c.iterator();
                while (it2.hasNext()) {
                    if (C6257a.m15814a((C6257a) it2.next()) && (i = i + 1) == this.f15521b) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.d.b$a */
    /* compiled from: FileDownloader */
    public class C6257a {

        /* renamed from: b */
        private String f15524b;

        /* renamed from: c */
        private File f15525c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C6263e<Void> f15526d;

        /* renamed from: e */
        private C6254a f15527e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f15528f;

        private C6257a(File file, String str, C6263e<Void> eVar) {
            this.f15525c = file;
            this.f15526d = eVar;
            this.f15524b = str;
        }

        /* renamed from: a */
        public final boolean mo43841a() {
            return this.f15528f == 1;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m15814a(C6257a aVar) {
            if (aVar.f15528f != 0) {
                return false;
            }
            C6255b bVar = C6255b.this;
            C6254a aVar2 = new C6254a(aVar.f15525c, aVar.f15524b);
            aVar.f15527e = aVar2;
            aVar2.mo43879a(new C6269f<Void>() {

                /* renamed from: a */
                boolean f15529a;

                /* renamed from: a */
                public final void mo43842a() {
                    C6257a.this.f15526d.mo43842a();
                }

                /* renamed from: b */
                public final void mo43800b() {
                    if (!this.f15529a) {
                        int unused = C6257a.this.f15528f = 3;
                        C6257a.this.f15526d.mo43800b();
                        C6255b.m15811a(C6255b.this, C6257a.this);
                    }
                }

                /* renamed from: a */
                public final void mo43799a(C6293k kVar) {
                    if (!this.f15529a) {
                        C6257a.this.f15526d.mo43799a(kVar);
                    }
                }

                /* renamed from: a */
                public final void mo43798a(C6240a aVar) {
                    if (!this.f15529a) {
                        C6257a.this.f15526d.mo43798a(aVar);
                    }
                }

                /* renamed from: c */
                public final void mo43843c() {
                    C6257a.this.f15526d.mo43843c();
                    this.f15529a = true;
                }

                /* renamed from: a */
                public final void mo43797a(long j, long j2) {
                    C6257a.this.f15526d.mo43797a(j, j2);
                }
            });
            aVar.f15528f = 1;
            C6255b.this.f15520a.mo43894a((C6290i) aVar.f15527e);
            return true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m15811a(C6255b bVar, C6257a aVar) {
        synchronized (bVar) {
            bVar.f15522c.remove(aVar);
        }
        bVar.m15810a();
    }
}
