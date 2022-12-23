package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C13358hy;
import com.yandex.mobile.ads.impl.C13915lz;
import com.yandex.mobile.ads.impl.C14479rn;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.qt */
public class C14416qt {

    /* renamed from: a */
    private final C14213ot f39284a;

    /* renamed from: com.yandex.mobile.ads.impl.qt$a */
    public interface C14417a {
        /* renamed from: a */
        void mo65506a(boolean z);
    }

    /* renamed from: com.yandex.mobile.ads.impl.qt$b */
    private static final class C14418b extends wc0 {

        /* renamed from: a */
        private final C14417a f39285a;

        /* renamed from: b */
        private int f39286b;

        /* renamed from: c */
        private int f39287c;

        /* renamed from: d */
        private boolean f39288d;

        public C14418b(C14417a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "callback");
            this.f39285a = aVar;
        }

        /* renamed from: b */
        private final void m41411b() {
            int i = this.f39286b - 1;
            this.f39286b = i;
            if (i == 0 && this.f39288d) {
                this.f39285a.mo65506a(this.f39287c != 0);
            }
        }

        /* renamed from: a */
        public void mo67624a(C15163xd xdVar) {
            Intrinsics.checkNotNullParameter(xdVar, "cachedBitmap");
            m41411b();
        }

        /* renamed from: c */
        public final void mo69642c() {
            boolean z = true;
            this.f39288d = true;
            if (this.f39286b == 0) {
                C14417a aVar = this.f39285a;
                if (this.f39287c == 0) {
                    z = false;
                }
                aVar.mo65506a(z);
            }
        }

        /* renamed from: d */
        public final void mo69643d() {
            this.f39286b++;
        }

        /* renamed from: a */
        public void mo69641a() {
            this.f39287c++;
            m41411b();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qt$d */
    public interface C14420d {
        /* renamed from: a */
        void mo69645a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.qt$e */
    private static final class C14421e implements C14420d {

        /* renamed from: a */
        private final List<ij0> f39293a = new ArrayList();

        /* renamed from: a */
        public final void mo69646a(ij0 ij0) {
            Intrinsics.checkNotNullParameter(ij0, "reference");
            this.f39293a.add(ij0);
        }

        /* renamed from: a */
        public void mo69645a() {
            for (ij0 a : this.f39293a) {
                a.mo65575a();
            }
        }
    }

    @Inject
    public C14416qt(C14213ot otVar) {
        Intrinsics.checkNotNullParameter(otVar, "imageLoader");
        this.f39284a = otVar;
    }

    /* renamed from: b */
    public static final void m41408b(C14416qt qtVar, String str, C14418b bVar, C14421e eVar) {
        ij0 b = qtVar.f39284a.mo69265b(str, bVar);
        Intrinsics.checkNotNullExpressionValue(b, "imageLoader.loadImageBytes(url, callback)");
        eVar.mo69646a(b);
        bVar.mo69643d();
    }

    /* renamed from: a */
    public C14420d mo69640a(C15177xl xlVar, j50 j50, C14417a aVar) {
        Intrinsics.checkNotNullParameter(xlVar, "div");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        Intrinsics.checkNotNullParameter(aVar, "callback");
        C14418b bVar = new C14418b(aVar);
        C14420d a = new C14419c(this, bVar, j50).mo69644a(xlVar);
        bVar.mo69642c();
        return a;
    }

    /* renamed from: a */
    public static final void m41407a(C14416qt qtVar, String str, C14418b bVar, C14421e eVar) {
        ij0 a = qtVar.f39284a.mo69264a(str, bVar);
        Intrinsics.checkNotNullExpressionValue(a, "imageLoader.loadImage(url, callback)");
        eVar.mo69646a(a);
        bVar.mo69643d();
    }

    /* renamed from: com.yandex.mobile.ads.impl.qt$c */
    private final class C14419c extends w10<Unit> {

        /* renamed from: a */
        private final C14418b f39289a;

        /* renamed from: b */
        private final j50 f39290b;

        /* renamed from: c */
        private final C14421e f39291c = new C14421e();

        /* renamed from: d */
        final /* synthetic */ C14416qt f39292d;

        public C14419c(C14416qt qtVar, C14418b bVar, j50 j50) {
            Intrinsics.checkNotNullParameter(qtVar, "this$0");
            Intrinsics.checkNotNullParameter(bVar, "callback");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            this.f39292d = qtVar;
            this.f39289a = bVar;
            this.f39290b = j50;
        }

        /* renamed from: a */
        public Object mo65638a(C13091fq fqVar, j50 j50) {
            Intrinsics.checkNotNullParameter(fqVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) fqVar, j50);
            for (C15177xl a : fqVar.f33547s) {
                mo70622a(a, j50);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65645a(C14406qq qqVar, j50 j50) {
            Intrinsics.checkNotNullParameter(qqVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) qqVar, j50);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65639a(C13111fs fsVar, j50 j50) {
            Intrinsics.checkNotNullParameter(fsVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) fsVar, j50);
            for (C15177xl a : fsVar.f33660q) {
                mo70622a(a, j50);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65641a(C13885ls lsVar, j50 j50) {
            Intrinsics.checkNotNullParameter(lsVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) lsVar, j50);
            if (lsVar.f36897x.mo66924a(j50).booleanValue()) {
                C14416qt qtVar = this.f39292d;
                String uri = lsVar.f36890q.mo66924a(j50).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "data.gifUrl.evaluate(resolver).toString()");
                C14416qt.m41408b(qtVar, uri, this.f39289a, this.f39291c);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65647a(C14924vs vsVar, j50 j50) {
            Intrinsics.checkNotNullParameter(vsVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) vsVar, j50);
            for (C15177xl a : vsVar.f41511s) {
                mo70622a(a, j50);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65637a(C12997et etVar, j50 j50) {
            Intrinsics.checkNotNullParameter(etVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) etVar, j50);
            if (etVar.f33140z.mo66924a(j50).booleanValue()) {
                C14416qt qtVar = this.f39292d;
                String uri = etVar.f33135u.mo66924a(j50).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "data.imageUrl.evaluate(resolver).toString()");
                C14416qt.m41407a(qtVar, uri, this.f39289a, this.f39291c);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65648a(C15107wt wtVar, j50 j50) {
            Intrinsics.checkNotNullParameter(wtVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) wtVar, j50);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65644a(C14215ov ovVar, j50 j50) {
            Intrinsics.checkNotNullParameter(ovVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) ovVar, j50);
            for (C15177xl a : ovVar.f38363n) {
                mo70622a(a, j50);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65646a(C14841uw uwVar, j50 j50) {
            Intrinsics.checkNotNullParameter(uwVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) uwVar, j50);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65643a(C14141nx nxVar, j50 j50) {
            Intrinsics.checkNotNullParameter(nxVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) nxVar, j50);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65640a(C13358hy hyVar, j50 j50) {
            Intrinsics.checkNotNullParameter(hyVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) hyVar, j50);
            for (C13358hy.C13365g gVar : hyVar.f34685r) {
                C15177xl xlVar = gVar.f34704c;
                if (xlVar != null) {
                    mo70622a(xlVar, j50);
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65636a(C12667bz bzVar, j50 j50) {
            Intrinsics.checkNotNullParameter(bzVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) bzVar, j50);
            for (C12667bz.C12674g gVar : bzVar.f31682n) {
                mo70622a(gVar.f31703a, j50);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public Object mo65642a(C13915lz lzVar, j50 j50) {
            Intrinsics.checkNotNullParameter(lzVar, "data");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            m41416a((C14697tn) lzVar, j50);
            List<C13915lz.C13934o> list = lzVar.f37062w;
            if (list != null) {
                C14416qt qtVar = this.f39292d;
                for (C13915lz.C13934o oVar : list) {
                    String uri = oVar.f37102d.mo66924a(j50).toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "it.url.evaluate(resolver).toString()");
                    C14416qt.m41407a(qtVar, uri, this.f39289a, this.f39291c);
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final C14420d mo69644a(C15177xl xlVar) {
            Intrinsics.checkNotNullParameter(xlVar, "div");
            mo70622a(xlVar, this.f39290b);
            return this.f39291c;
        }

        /* renamed from: a */
        private final void m41416a(C14697tn tnVar, j50 j50) {
            List<C14479rn> m = tnVar.mo66155m();
            if (m != null) {
                C14416qt qtVar = this.f39292d;
                for (C14479rn rnVar : m) {
                    if (rnVar instanceof C14479rn.C14483d) {
                        C14479rn.C14483d dVar = (C14479rn.C14483d) rnVar;
                        if (dVar.mo69794c().f33727e.mo66924a(j50).booleanValue()) {
                            String uri = dVar.mo69794c().f33726d.mo66924a(j50).toString();
                            Intrinsics.checkNotNullExpressionValue(uri, "background.value.imageUr…uate(resolver).toString()");
                            C14416qt.m41407a(qtVar, uri, this.f39289a, this.f39291c);
                        }
                    }
                }
            }
        }
    }
}
