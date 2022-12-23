package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3480a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3536b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.k */
public final class C3494k implements C3480a {

    /* renamed from: a */
    final File f9472a;

    /* renamed from: b */
    final C3492i f9473b;

    /* renamed from: c */
    C3480a.C3481a f9474c;

    /* renamed from: d */
    private final C3489f f9475d;

    /* renamed from: e */
    private final HashMap<String, C3490g> f9476e;

    /* renamed from: f */
    private final HashMap<String, ArrayList<C3480a.C3482b>> f9477f;

    /* renamed from: g */
    private long f9478g;

    public C3494k(File file, C3489f fVar) {
        this(file, fVar, (byte) 0);
    }

    private C3494k(File file, C3489f fVar, byte b) {
        this.f9478g = 0;
        this.f9472a = file;
        this.f9475d = fVar;
        this.f9476e = new HashMap<>();
        this.f9473b = new C3492i(file);
        this.f9477f = new HashMap<>();
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread("SimpleCache.initialize()") {
            public final void run() {
                synchronized (C3494k.this) {
                    conditionVariable.open();
                    try {
                        C3494k kVar = C3494k.this;
                        if (!kVar.f9472a.exists()) {
                            kVar.f9472a.mkdirs();
                        } else {
                            C3492i iVar = kVar.f9473b;
                            C3535a.m8784b(!iVar.f9465d);
                            if (!iVar.mo19335c()) {
                                C3536b bVar = iVar.f9464c;
                                bVar.f9586a.delete();
                                bVar.f9587b.delete();
                                iVar.f9462a.clear();
                                iVar.f9463b.clear();
                            }
                            File[] listFiles = kVar.f9472a.listFiles();
                            if (listFiles != null) {
                                for (File file : listFiles) {
                                    if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                                        C3496l a = file.length() > 0 ? C3496l.m8700a(file, kVar.f9473b) : null;
                                        if (a != null) {
                                            kVar.mo19338a(a);
                                        } else {
                                            file.delete();
                                        }
                                    }
                                }
                                kVar.f9473b.mo19333b();
                                kVar.f9473b.mo19331a();
                            }
                        }
                    } catch (C3480a.C3481a e) {
                        C3494k.this.f9474c = e;
                    }
                }
            }
        }.start();
        conditionVariable.block();
    }

    /* renamed from: a */
    public final synchronized long mo19309a() {
        return this.f9478g;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized C3496l mo19311a(String str, long j) throws InterruptedException, C3480a.C3481a {
        C3496l e;
        while (true) {
            e = mo19315b(str, j);
            if (e == null) {
                wait();
            }
        }
        return e;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public synchronized C3496l mo19315b(String str, long j) throws C3480a.C3481a {
        C3496l lVar;
        C3496l lVar2;
        if (this.f9474c == null) {
            C3491h b = this.f9473b.mo19332b(str);
            if (b == null) {
                lVar = C3496l.m8704b(str, j);
            } else {
                while (true) {
                    C3496l a = C3496l.m8701a(b.f9459b, j);
                    C3496l floor = b.f9460c.floor(a);
                    if (floor == null || floor.f9453b + floor.f9454c <= j) {
                        C3496l ceiling = b.f9460c.ceiling(a);
                        if (ceiling == null) {
                            lVar2 = C3496l.m8704b(b.f9459b, j);
                        } else {
                            lVar2 = C3496l.m8702a(b.f9459b, j, ceiling.f9453b - j);
                        }
                    } else {
                        lVar2 = floor;
                    }
                    if (!lVar2.f9455d || lVar2.f9456e.length() == lVar2.f9454c) {
                        lVar = lVar2;
                    } else {
                        m8687b();
                    }
                }
                lVar = lVar2;
            }
            if (lVar.f9455d) {
                C3491h b2 = this.f9473b.mo19332b(str);
                C3535a.m8784b(b2.f9460c.remove(lVar));
                int i = b2.f9458a;
                C3535a.m8784b(lVar.f9455d);
                long currentTimeMillis = System.currentTimeMillis();
                C3496l lVar3 = new C3496l(lVar.f9452a, lVar.f9453b, lVar.f9454c, currentTimeMillis, C3496l.m8703a(lVar.f9456e.getParentFile(), i, lVar.f9453b, currentTimeMillis));
                if (lVar.f9456e.renameTo(lVar3.f9456e)) {
                    b2.f9460c.add(lVar3);
                    m8686a(lVar, (C3490g) lVar3);
                    return lVar3;
                }
                throw new C3480a.C3481a("Renaming of " + lVar.f9456e + " to " + lVar3.f9456e + " failed.");
            } else if (this.f9476e.containsKey(str)) {
                return null;
            } else {
                this.f9476e.put(str, lVar);
                return lVar;
            }
        } else {
            throw this.f9474c;
        }
    }

    /* renamed from: a */
    public final synchronized File mo19312a(String str, long j, long j2) throws C3480a.C3481a {
        C3535a.m8784b(this.f9476e.containsKey(str));
        if (!this.f9472a.exists()) {
            m8687b();
            this.f9472a.mkdirs();
        }
        this.f9475d.mo19325a(this, j2);
        return C3496l.m8703a(this.f9472a, this.f9473b.mo19334c(str), j, System.currentTimeMillis());
    }

    /* renamed from: a */
    public final synchronized void mo19314a(File file) throws C3480a.C3481a {
        C3496l a = C3496l.m8700a(file, this.f9473b);
        boolean z = true;
        C3535a.m8784b(a != null);
        C3535a.m8784b(this.f9476e.containsKey(a.f9452a));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            Long valueOf = Long.valueOf(mo19310a(a.f9452a));
            if (valueOf.longValue() != -1) {
                if (a.f9453b + a.f9454c > valueOf.longValue()) {
                    z = false;
                }
                C3535a.m8784b(z);
            }
            mo19338a(a);
            this.f9473b.mo19331a();
            notifyAll();
        }
    }

    /* renamed from: a */
    public final synchronized void mo19313a(C3490g gVar) {
        C3535a.m8784b(gVar == this.f9476e.remove(gVar.f9452a));
        notifyAll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19338a(C3496l lVar) {
        this.f9473b.mo19329a(lVar.f9452a).f9460c.add(lVar);
        this.f9478g += lVar.f9454c;
        ArrayList arrayList = this.f9477f.get(lVar.f9452a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C3480a.C3482b) arrayList.get(size)).mo19318a(this, lVar);
            }
        }
        this.f9475d.mo19318a(this, lVar);
    }

    /* renamed from: a */
    private void m8685a(C3490g gVar, boolean z) throws C3480a.C3481a {
        boolean z2;
        C3491h b = this.f9473b.mo19332b(gVar.f9452a);
        if (b != null) {
            if (b.f9460c.remove(gVar)) {
                gVar.f9456e.delete();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f9478g -= gVar.f9454c;
                if (z && b.f9460c.isEmpty()) {
                    this.f9473b.mo19336d(b.f9459b);
                    this.f9473b.mo19331a();
                }
                ArrayList arrayList = this.f9477f.get(gVar.f9452a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((C3480a.C3482b) arrayList.get(size)).mo19320a(gVar);
                    }
                }
                this.f9475d.mo19320a(gVar);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo19316b(C3490g gVar) throws C3480a.C3481a {
        m8685a(gVar, true);
    }

    /* renamed from: b */
    private void m8687b() throws C3480a.C3481a {
        LinkedList linkedList = new LinkedList();
        for (C3491h hVar : this.f9473b.f9462a.values()) {
            Iterator<C3496l> it = hVar.f9460c.iterator();
            while (it.hasNext()) {
                C3490g next = it.next();
                if (next.f9456e.length() != next.f9454c) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            m8685a((C3490g) it2.next(), false);
        }
        this.f9473b.mo19333b();
        this.f9473b.mo19331a();
    }

    /* renamed from: a */
    private void m8686a(C3496l lVar, C3490g gVar) {
        ArrayList arrayList = this.f9477f.get(lVar.f9452a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C3480a.C3482b) arrayList.get(size)).mo19319a(this, lVar, gVar);
            }
        }
        this.f9475d.mo19319a(this, lVar, gVar);
    }

    /* renamed from: c */
    public final synchronized void mo19317c(String str, long j) throws C3480a.C3481a {
        C3492i iVar = this.f9473b;
        C3491h b = iVar.mo19332b(str);
        if (b == null) {
            iVar.mo19330a(str, j);
        } else if (b.f9461d != j) {
            b.f9461d = j;
            iVar.f9465d = true;
        }
        this.f9473b.mo19331a();
    }

    /* renamed from: a */
    public final synchronized long mo19310a(String str) {
        C3491h b = this.f9473b.mo19332b(str);
        if (b == null) {
            return -1;
        }
        return b.f9461d;
    }
}
