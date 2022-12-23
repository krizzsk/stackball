package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.yandex.metrica.impl.p264ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.g8 */
public class C11271g8 {

    /* renamed from: m */
    private static final Set<String> f26960m;

    /* renamed from: a */
    private final Context f26961a;

    /* renamed from: b */
    private final C11769sn f26962b;

    /* renamed from: c */
    private final File f26963c;

    /* renamed from: d */
    private final List<String> f26964d;

    /* renamed from: e */
    private final File f26965e;

    /* renamed from: f */
    private final File f26966f;

    /* renamed from: g */
    private final C10864Vm<Void, String> f26967g;

    /* renamed from: h */
    private final C11611om f26968h;

    /* renamed from: i */
    private final C11234f8 f26969i;

    /* renamed from: j */
    private final Callable<String> f26970j;

    /* renamed from: k */
    private final C10949Y7 f26971k;

    /* renamed from: l */
    private final C10442L0 f26972l;

    /* renamed from: com.yandex.metrica.impl.ob.g8$a */
    class C11272a implements C10864Vm<Void, String> {
        C11272a() {
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            Void voidR = (Void) obj;
            return CrashpadHelper.getLibraryVersion();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$b */
    class C11273b implements Callable<String> {
        C11273b() {
        }

        public Object call() throws Exception {
            return CrashpadHelper.getLibDirInsideApk();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$c */
    static class C11274c implements C10864Vm<File, Boolean> {
        C11274c() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo61128a(Object obj) {
            File file = (File) obj;
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$d */
    static class C11275d implements C10864Vm<File, Boolean> {

        /* renamed from: a */
        private final String f26973a;

        public C11275d(String str) {
            this.f26973a = str;
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            return Boolean.valueOf(!((File) obj).getName().endsWith(this.f26973a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f26960m = hashSet;
        hashSet.add("armeabi-v7a");
        hashSet.add("arm64-v8a");
        hashSet.add("x86");
        hashSet.add("x86_64");
    }

    public C11271g8(Context context, C10442L0 l0, C11769sn snVar) {
        this(context, l0, snVar, Arrays.asList(new String[]{"libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p265ob.C11420k8 m29046a() {
        /*
            r10 = this;
            java.io.File r0 = r10.f26963c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r3 = 0
            if (r0 == 0) goto L_0x00b3
            android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "-"
            r0.append(r4)
            com.yandex.metrica.impl.ob.Vm<java.lang.Void, java.lang.String> r4 = r10.f26967g
            java.lang.Object r4 = r4.mo61128a(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.impl.ob.om r4 = r10.f26968h
            java.lang.String r4 = r4.mo63443a()
            if (r4 == 0) goto L_0x00b2
            java.io.File r5 = r10.f26966f
            if (r5 != 0) goto L_0x003c
            goto L_0x005d
        L_0x003c:
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x005f
            java.io.File r5 = r10.f26966f
            boolean r5 = r5.mkdirs()
            if (r5 != 0) goto L_0x004b
            goto L_0x005d
        L_0x004b:
            java.io.File r5 = r10.f26965e
            if (r5 == 0) goto L_0x005d
            boolean r5 = r5.setExecutable(r1, r2)
            if (r5 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            java.io.File r5 = r10.f26966f
            boolean r5 = r5.setExecutable(r1, r2)
            goto L_0x0060
        L_0x005d:
            r5 = 0
            goto L_0x0060
        L_0x005f:
            r5 = 1
        L_0x0060:
            if (r5 == 0) goto L_0x00b2
            com.yandex.metrica.impl.ob.g8$d r5 = new com.yandex.metrica.impl.ob.g8$d
            r5.<init>(r0)
            com.yandex.metrica.impl.ob.sn r6 = r10.f26962b
            com.yandex.metrica.impl.ob.h8 r7 = new com.yandex.metrica.impl.ob.h8
            r7.<init>(r10, r5)
            com.yandex.metrica.impl.ob.rn r6 = (com.yandex.metrica.impl.p265ob.C11725rn) r6
            r6.execute(r7)
            java.util.List<java.lang.String> r5 = r10.f26964d
            java.util.Iterator r5 = r5.iterator()
        L_0x0079:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.yandex.metrica.impl.ob.f8 r7 = r10.f26969i
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r4
            r8[r1] = r6
            java.lang.String r9 = "lib/%s/%s"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r0)
            java.lang.String r6 = r9.toString()
            java.lang.String r6 = r7.mo62893a(r8, r6)
            android.os.SystemClock.elapsedRealtime()
            if (r6 == 0) goto L_0x0079
            com.yandex.metrica.impl.ob.k8 r0 = new com.yandex.metrica.impl.ob.k8
            r0.<init>(r6, r2, r3)
            r3 = r0
        L_0x00b2:
            return r3
        L_0x00b3:
            java.io.File r0 = r10.f26963c
            java.lang.String r0 = r0.getAbsolutePath()
            com.yandex.metrica.impl.ob.k8 r1 = new com.yandex.metrica.impl.ob.k8
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11271g8.m29046a():com.yandex.metrica.impl.ob.k8");
    }

    /* renamed from: c */
    private File m29047c() {
        String str;
        try {
            str = this.f26970j.call();
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.f26972l.getClass();
        return new File(str);
    }

    /* renamed from: b */
    public C11420k8 mo62954b() {
        C10918X7 x7;
        C11420k8 k8Var = null;
        if (C10796U2.m27890a(29)) {
            File c = m29047c();
            if (c == null) {
                return null;
            }
            for (String file : this.f26964d) {
                this.f26972l.getClass();
                File file2 = new File(c, file);
                if (file2.exists()) {
                    return new C11420k8(file2.getAbsolutePath(), true, (C10918X7) null);
                }
            }
            return null;
        } else if (!C10796U2.m27890a(23)) {
            return m29046a();
        } else {
            C10949Y7 y7 = this.f26971k;
            Context context = this.f26961a;
            String a = this.f26968h.mo63443a();
            y7.getClass();
            try {
                String[] a2 = C11485l8.m29724a(context, a);
                x7 = new C10918X7(a2[0], a2[1], Environment.getDataDirectory().getAbsolutePath());
            } catch (Throwable unused) {
                x7 = null;
            }
            if (x7 != null) {
                File c2 = m29047c();
                if (c2 != null) {
                    Iterator<String> it = this.f26964d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        this.f26972l.getClass();
                        File file3 = new File(c2, it.next());
                        if (file3.exists()) {
                            k8Var = new C11420k8(file3.getAbsolutePath(), false, x7);
                            break;
                        }
                    }
                } else {
                    k8Var = new C11420k8("stub", false, x7);
                }
            }
            if (k8Var == null || k8Var.f27386d == null) {
                return m29046a();
            }
            ((C11725rn) this.f26962b).execute(new C11308h8(this, new C11274c()));
            return k8Var;
        }
    }

    private C11271g8(Context context, C10442L0 l0, C11769sn snVar, List<String> list) {
        this(context, snVar, list, l0, l0.mo61698a(l0.mo61696a(context), list.get(0)), l0.mo61700b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new C11272a(), new C11273b(), new C11611om(f26960m));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C11271g8(android.content.Context r13, com.yandex.metrica.impl.p265ob.C11769sn r14, java.util.List<java.lang.String> r15, com.yandex.metrica.impl.p265ob.C10442L0 r16, java.io.File r17, java.io.File r18, com.yandex.metrica.impl.p265ob.C10864Vm<java.lang.Void, java.lang.String> r19, java.util.concurrent.Callable<java.lang.String> r20, com.yandex.metrica.impl.p265ob.C11611om r21) {
        /*
            r12 = this;
            com.yandex.metrica.impl.ob.f8 r9 = new com.yandex.metrica.impl.ob.f8
            r1 = r13
            r5 = r18
            r9.<init>(r13, r5)
            com.yandex.metrica.impl.ob.Y7 r10 = new com.yandex.metrica.impl.ob.Y7
            r10.<init>()
            r0 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11271g8.<init>(android.content.Context, com.yandex.metrica.impl.ob.sn, java.util.List, com.yandex.metrica.impl.ob.L0, java.io.File, java.io.File, com.yandex.metrica.impl.ob.Vm, java.util.concurrent.Callable, com.yandex.metrica.impl.ob.om):void");
    }

    C11271g8(Context context, C11769sn snVar, List<String> list, File file, File file2, C10864Vm<Void, String> vm, Callable<String> callable, C11611om omVar, C11234f8 f8Var, C10949Y7 y7, C10442L0 l0) {
        this.f26961a = context;
        this.f26962b = snVar;
        this.f26964d = list;
        this.f26963c = file;
        this.f26965e = context.getCacheDir();
        this.f26966f = file2;
        this.f26967g = vm;
        this.f26970j = callable;
        this.f26968h = omVar;
        this.f26969i = f8Var;
        this.f26971k = y7;
        this.f26972l = l0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62953a(C10864Vm<File, Boolean> vm) {
        File[] listFiles;
        File file = this.f26966f;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (vm.mo61128a(file2).booleanValue()) {
                    file2.delete();
                }
            }
        }
    }
}
