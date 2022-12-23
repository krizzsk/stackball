package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C5320gt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.ii */
/* compiled from: UnifiedSdk */
public final class C5384ii {

    /* renamed from: a */
    public static boolean f12335a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f12336b = C5384ii.class.getSimpleName();

    /* renamed from: c */
    private static C5320gt.C5324c f12337c = new C5386a((byte) 0);

    /* renamed from: b */
    public static void m12472b(Context context) {
        C5320gt a = C5320gt.m12247a();
        if (a != null) {
            a.mo40660a(context, f12337c);
        }
    }

    /* renamed from: com.inmobi.media.ii$a */
    /* compiled from: UnifiedSdk */
    static class C5386a implements C5320gt.C5324c {
        private C5386a() {
        }

        /* synthetic */ C5386a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo40669a(final boolean z) {
            C5314go.m12201b(z);
            C5314go.m12195a((Runnable) new Runnable() {
                public final void run() {
                    if (z) {
                        C5384ii.m12473c();
                    } else {
                        C5384ii.m12468a();
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m12474c(final Context context) {
        if (!f12335a) {
            C5239ey.m11989a();
            C5309gl.m12169a().mo40653b();
            C5314go.m12195a((Runnable) new Runnable() {
                public final void run() {
                    if (C5315gp.m12227b(context) && C5362hv.m12402b(context).isEmpty()) {
                        C5315gp.m12225a(context, false);
                    }
                    C5348hj.m12353a();
                    C5384ii.m12473c();
                    try {
                        C4970at.m11277a().mo40122b();
                        C4970at.m11277a().mo40124d();
                    } catch (Exception unused) {
                        String unused2 = C5384ii.f12336b;
                    }
                    C5384ii.f12335a = true;
                }
            });
        }
    }

    /* renamed from: a */
    public static void m12468a() {
        try {
            C5239ey.m11995b();
            C5309gl a = C5309gl.m12169a();
            C5309gl.f12168a.set(true);
            if (a.f12172c != null) {
                C5284fu fuVar = a.f12172c;
                if (fuVar.f12086e != null) {
                    fuVar.f12086e.shutdownNow();
                    fuVar.f12086e = null;
                }
                fuVar.f12082a.set(false);
                fuVar.f12083b.set(true);
                fuVar.f12085d.clear();
                fuVar.f12084c.clear();
                a.f12172c = null;
            }
            C5371hz.m12430a().mo40736c();
            C4970at.m11277a().mo40123c();
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 1, f12336b, "SDK encountered unexpected error while stopping internal components");
        }
    }

    /* renamed from: a */
    public static void m12470a(C5382ig igVar) {
        try {
            C5314go.m12218k();
            Context c = C5314go.m12203c();
            if (c != null) {
                File file = new File(C5314go.m12204c(c), "asConfigs");
                if (file.exists()) {
                    file.delete();
                }
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                objectOutputStream.writeObject(igVar);
                objectOutputStream.close();
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    public static C5382ig m12471b() {
        try {
            if (C5314go.m12203c() == null) {
                return null;
            }
            File file = new File(C5314go.m12204c(C5314go.m12203c()), "asConfigs");
            if (!file.exists()) {
                return null;
            }
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            C5382ig igVar = (C5382ig) objectInputStream.readObject();
            try {
                objectInputStream.close();
            } catch (IOException | ClassNotFoundException unused) {
            }
            return igVar;
        } catch (IOException | ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m12469a(Context context) {
        if (C5315gp.m12223a(context) == null || !C5315gp.m12223a(context).equals(C5315gp.m12226b())) {
            C5315gp.m12225a(context, C5362hv.m12400a(context));
            C5315gp.m12224a(context, C5315gp.m12226b());
            Context applicationContext = context.getApplicationContext();
            File b = C5314go.m12198b(applicationContext);
            File c = C5314go.m12204c(applicationContext);
            C5314go.m12194a(b, (String) null);
            C5314go.m12194a(c, (String) null);
            C5314go.m12207d(applicationContext);
            C5314go.m12219l();
            if (!b.mkdir()) {
                b.isDirectory();
            }
            if (!c.mkdir()) {
                c.isDirectory();
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m12473c() {
        try {
            C5359ht.m12386a().mo40718b();
            C5239ey.m11989a();
            C4983ax.m11340a().mo40135b();
            C5275fn a = C5275fn.m12068a();
            C5275fn.f12047a.set(false);
            a.f12049b = (C5256fg) C5239ey.m11987a("crashReporting", C5314go.m12211f(), a);
            a.f12051d = a.f12049b.url;
            if (a.f12050c.mo40594a() > 0) {
                a.mo40591b();
            }
            C5309gl.m12169a().mo40653b();
            C5371hz.m12430a().mo40735b();
            C4970at.m11277a().mo40122b();
            C5309gl.m12169a().mo40652a("SessionStarted", (Map<String, Object>) new HashMap());
        } catch (Exception unused) {
            C5327gw.m12263a((byte) 2, f12336b, "SDK encountered unexpected error while starting internal components");
        }
    }
}
