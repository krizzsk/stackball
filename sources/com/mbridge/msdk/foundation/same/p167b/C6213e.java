package com.mbridge.msdk.foundation.same.p167b;

import android.util.Log;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6363s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.e */
/* compiled from: MBridgeDirManager */
public final class C6213e {

    /* renamed from: c */
    private static C6213e f15445c;

    /* renamed from: a */
    private C6210b f15446a;

    /* renamed from: b */
    private ArrayList<C6214a> f15447b = new ArrayList<>();

    private C6213e(C6210b bVar) {
        this.f15446a = bVar;
    }

    /* renamed from: a */
    public static synchronized void m15723a(C6210b bVar) {
        synchronized (C6213e.class) {
            if (f15445c == null) {
                f15445c = new C6213e(bVar);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C6213e m15721a() {
        C6213e eVar;
        synchronized (C6213e.class) {
            if (f15445c == null && C6122a.m15302b().mo42895d() != null) {
                C6363s.m16166a(C6122a.m15302b().mo42895d());
            }
            if (f15445c == null) {
                Log.e("MBridgeDirManager", "mDirectoryManager == null");
            }
            eVar = f15445c;
        }
        return eVar;
    }

    /* renamed from: a */
    public static File m15722a(C6211c cVar) {
        try {
            if (m15721a() == null || m15721a().f15447b == null || m15721a().f15447b.size() <= 0) {
                return null;
            }
            Iterator<C6214a> it = m15721a().f15447b.iterator();
            while (it.hasNext()) {
                C6214a next = it.next();
                if (next.f15448a.equals(cVar)) {
                    return next.f15449b;
                }
            }
            return null;
        } catch (Throwable th) {
            C6361q.m16155a("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m15725b(C6211c cVar) {
        File a = m15722a(cVar);
        if (a != null) {
            return a.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo43783b() {
        return m15724a(this.f15446a.mo43780a());
    }

    /* renamed from: a */
    private boolean m15724a(C6209a aVar) {
        String str;
        C6209a c = aVar.mo43778c();
        if (c == null) {
            str = aVar.mo43777b();
        } else {
            File a = m15722a(c.mo43772a());
            if (a == null) {
                return false;
            }
            str = a.getAbsolutePath() + File.separator + aVar.mo43777b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f15447b.add(new C6214a(aVar.mo43772a(), file));
        List<C6209a> d = aVar.mo43779d();
        if (d != null) {
            for (C6209a a2 : d) {
                if (!m15724a(a2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: com.mbridge.msdk.foundation.same.b.e$a */
    /* compiled from: MBridgeDirManager */
    private static final class C6214a {

        /* renamed from: a */
        public C6211c f15448a;

        /* renamed from: b */
        public File f15449b;

        public C6214a(C6211c cVar, File file) {
            this.f15448a = cVar;
            this.f15449b = file;
        }
    }
}
