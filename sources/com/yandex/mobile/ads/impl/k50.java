package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i50;
import com.yandex.mobile.ads.impl.sh1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

public final class k50 implements j50 {

    /* renamed from: b */
    private final th1 f35960b;

    /* renamed from: c */
    private final uh1 f35961c;

    /* renamed from: d */
    private final p30 f35962d;

    /* renamed from: com.yandex.mobile.ads.impl.k50$a */
    static final class C13681a extends Lambda implements Function1<sh1, Unit> {

        /* renamed from: b */
        final /* synthetic */ Function1<T, Unit> f35963b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13681a(Function1<? super T, Unit> function1) {
            super(1);
            this.f35963b = function1;
        }

        public Object invoke(Object obj) {
            sh1 sh1 = (sh1) obj;
            Intrinsics.checkNotNullParameter(sh1, "changed");
            this.f35963b.invoke(sh1.mo69977b());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k50$b */
    static final class C13682b extends Lambda implements Function1<sh1, Unit> {

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef<C15055wl> f35964b;

        /* renamed from: c */
        final /* synthetic */ k50 f35965c;

        /* renamed from: d */
        final /* synthetic */ String f35966d;

        /* renamed from: e */
        final /* synthetic */ Function1<T, Unit> f35967e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13682b(Ref.ObjectRef<C15055wl> objectRef, k50 k50, String str, Function1<? super T, Unit> function1) {
            super(1);
            this.f35964b = objectRef;
            this.f35965c = k50;
            this.f35966d = str;
            this.f35967e = function1;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((sh1) obj, "it");
            this.f35964b.element = this.f35965c.m38190a(this.f35966d, this.f35967e, true);
            return Unit.INSTANCE;
        }
    }

    public k50(th1 th1, uh1 uh1, p30 p30) {
        Intrinsics.checkNotNullParameter(th1, "variableController");
        Intrinsics.checkNotNullParameter(uh1, "declarationNotifier");
        Intrinsics.checkNotNullParameter(p30, "errorCollector");
        this.f35960b = th1;
        this.f35961c = uh1;
        this.f35962d = p30;
    }

    /* renamed from: a */
    public <R, T> T mo67928a(String str, String str2, List<? extends i50> list, Function1<? super R, ? extends T> function1, rh1<T> rh1, C15302zc zcVar, cg1<T> cg1, ny0 ny0) {
        ny0 ny02 = ny0;
        Intrinsics.checkNotNullParameter(str, "expressionKey");
        Intrinsics.checkNotNullParameter(str2, "rawExpression");
        Intrinsics.checkNotNullParameter(list, "parts");
        Intrinsics.checkNotNullParameter(rh1, "validator");
        Intrinsics.checkNotNullParameter(zcVar, "builtinVariables");
        Intrinsics.checkNotNullParameter(cg1, "fieldType");
        Intrinsics.checkNotNullParameter(ny02, "logger");
        try {
            return m38192a(false, str, str2, list, function1, rh1, zcVar, cg1);
        } catch (oy0 e) {
            oy0 oy0 = e;
            if (oy0.mo69284b() != qy0.MISSING_VARIABLE) {
                ny02.mo65565c(oy0);
                this.f35962d.mo69304a((Throwable) oy0);
                return m38192a(true, str, str2, list, function1, rh1, zcVar, cg1);
            }
            throw oy0;
        }
    }

    /* renamed from: a */
    private final <R, T> T m38192a(boolean z, String str, String str2, List<? extends i50> list, Function1<? super R, ? extends T> function1, rh1<T> rh1, C15302zc zcVar, cg1<T> cg1) {
        T t;
        i50 i50 = (i50) CollectionsKt.firstOrNull(list);
        if (list.size() != 1 || !(i50 instanceof i50.C13380b)) {
            StringBuilder sb = new StringBuilder(list.size());
            for (i50 i502 : list) {
                if (i502 instanceof i50.C13379a) {
                    sb.append(((i50.C13379a) i502).mo67734a());
                } else if (i502 instanceof i50.C13380b) {
                    i50.C13380b bVar = (i50.C13380b) i502;
                    Object a = m38191a(bVar.mo67735a(), zcVar, z);
                    if (a != null) {
                        sb.append(a instanceof Boolean ? String.valueOf(ky0.m38511a().invoke(a).intValue()) : a.toString());
                    } else {
                        throw py0.m40999a(str, str2, bVar.mo67735a());
                    }
                } else {
                    continue;
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
            T sb3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
            if (function1 != null) {
                try {
                    sb3 = function1.invoke(sb3);
                } catch (ClassCastException e) {
                    throw py0.m40998a(str, str2, (Object) sb3, (Throwable) e);
                }
            } else if (!(sb3 instanceof Object)) {
                sb3 = null;
            }
            if (sb3 != null) {
                try {
                    if (rh1.mo65491a(sb3)) {
                        return sb3;
                    }
                    throw py0.m40996a(str2, sb3);
                } catch (ClassCastException e2) {
                    throw py0.m40998a(str, str2, (Object) sb3, (Throwable) e2);
                }
            } else {
                throw py0.m40997a(str, str2, sb2);
            }
        } else {
            i50.C13380b bVar2 = (i50.C13380b) i50;
            T a2 = m38191a(bVar2.mo67735a(), zcVar, z);
            if (a2 != null) {
                if (!cg1.mo66292a(a2)) {
                    if (function1 == null) {
                        t = a2;
                    } else {
                        try {
                            t = function1.invoke(a2);
                        } catch (ClassCastException e3) {
                            throw py0.m40998a(str, str2, (Object) a2, (Throwable) e3);
                        }
                    }
                    if (t != null) {
                        a2 = t;
                    } else {
                        throw py0.m40997a(str, str2, a2);
                    }
                }
                try {
                    if (rh1.mo65491a(a2)) {
                        return a2;
                    }
                    throw py0.m40996a(str2, a2);
                } catch (ClassCastException e4) {
                    throw py0.m40998a(str, str2, (Object) a2, (Throwable) e4);
                }
            } else {
                throw py0.m40999a(str, str2, bVar2.mo67735a());
            }
        }
    }

    /* renamed from: a */
    private final <T> T m38191a(String str, C15302zc zcVar, boolean z) {
        T b = zcVar.mo65627b(str);
        if (b != null) {
            return b;
        }
        sh1 a = this.f35960b.mo70185a(str);
        if (a == null) {
            return null;
        }
        if (!z) {
            return a.mo69977b();
        }
        if (a instanceof sh1.C14598e) {
            return ((sh1.C14598e) a).mo69992c();
        }
        if (a instanceof sh1.C14597d) {
            return Integer.valueOf(((sh1.C14597d) a).mo69990c());
        }
        if (a instanceof sh1.C14594a) {
            return Boolean.valueOf(((sh1.C14594a) a).mo69981c());
        }
        if (a instanceof sh1.C14596c) {
            return Double.valueOf(((sh1.C14596c) a).mo69987c());
        }
        if (a instanceof sh1.C14595b) {
            return Integer.valueOf(((sh1.C14595b) a).mo69984c());
        }
        if (a instanceof sh1.C14599f) {
            return ((sh1.C14599f) a).mo69996c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public <T> C15055wl mo67927a(String str, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "variableName");
        Intrinsics.checkNotNullParameter(function1, "callback");
        return m38190a(str, function1, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <T> C15055wl m38190a(String str, Function1<? super T, Unit> function1, boolean z) {
        sh1 a = this.f35960b.mo70185a(str);
        if (a == null) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            return new C15055wl(objectRef) {
                public final /* synthetic */ Ref.ObjectRef f$1;

                {
                    this.f$1 = r2;
                }

                public final void close() {
                    k50.m38194a(C15055wl.this, this.f$1);
                }
            };
        }
        C13681a aVar = new C13681a(function1);
        a.mo69976a((Function1<? super sh1, Unit>) aVar);
        if (z) {
            aVar.invoke(a);
        }
        return new C15055wl(aVar) {
            public final /* synthetic */ Function1 f$1;

            {
                this.f$1 = r2;
            }

            public final void close() {
                k50.m38193a(sh1.this, this.f$1);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m38194a(C15055wl wlVar, Ref.ObjectRef objectRef) {
        Intrinsics.checkNotNullParameter(wlVar, "$declareDisposable");
        Intrinsics.checkNotNullParameter(objectRef, "$changeDisposable");
        wlVar.close();
        C15055wl wlVar2 = (C15055wl) objectRef.element;
        if (wlVar2 != null) {
            wlVar2.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m38193a(sh1 sh1, Function1 function1) {
        Intrinsics.checkNotNullParameter(sh1, "$variable");
        Intrinsics.checkNotNullParameter(function1, "$onVariableChanged");
        sh1.mo69979b((Function1<? super sh1, Unit>) function1);
    }

    /* renamed from: a */
    public void mo67929a(oy0 oy0) {
        Intrinsics.checkNotNullParameter(oy0, "e");
        this.f35962d.mo69304a((Throwable) oy0);
    }
}
