package com.yandex.mobile.ads.impl;

import android.view.Surface;
import com.yandex.mobile.ads.exo.C12227m;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.C12290g;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12333e;
import com.yandex.mobile.ads.exo.video.C12344d;
import com.yandex.mobile.ads.impl.C12579bb;
import com.yandex.mobile.ads.impl.C14059n7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.yandex.mobile.ads.impl.m7 */
public class C13957m7 implements C12227m.C12228a, qn0, C13296ha, C12344d, C12290g, C12579bb.C12580a, C13209gk, im1, C13038fa {

    /* renamed from: a */
    private final CopyOnWriteArraySet<C14059n7> f37205a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    private final C13493jf f37206b;

    /* renamed from: c */
    private final C12270q.C12273c f37207c = new C12270q.C12273c();

    /* renamed from: d */
    private final C13959b f37208d = new C13959b();

    /* renamed from: e */
    private C12227m f37209e;

    /* renamed from: com.yandex.mobile.ads.impl.m7$a */
    private static final class C13958a {

        /* renamed from: a */
        public final C12287f.C12288a f37210a;

        /* renamed from: b */
        public final C12270q f37211b;

        /* renamed from: c */
        public final int f37212c;

        public C13958a(C12287f.C12288a aVar, C12270q qVar, int i) {
            this.f37210a = aVar;
            this.f37211b = qVar;
            this.f37212c = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.m7$b */
    private static final class C13959b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ArrayList<C13958a> f37213a = new ArrayList<>();

        /* renamed from: b */
        private final HashMap<C12287f.C12288a, C13958a> f37214b = new HashMap<>();

        /* renamed from: c */
        private final C12270q.C12272b f37215c = new C12270q.C12272b();

        /* renamed from: d */
        private C13958a f37216d;

        /* renamed from: e */
        private C13958a f37217e;

        /* renamed from: f */
        private C13958a f37218f;

        /* renamed from: g */
        private C12270q f37219g = C12270q.f30037a;

        /* renamed from: b */
        public C13958a mo68602b() {
            if (this.f37213a.isEmpty()) {
                return null;
            }
            ArrayList<C13958a> arrayList = this.f37213a;
            return arrayList.get(arrayList.size() - 1);
        }

        /* renamed from: c */
        public C13958a mo68604c() {
            if (this.f37213a.isEmpty() || this.f37219g.mo65194d()) {
                return null;
            }
            return this.f37213a.get(0);
        }

        /* renamed from: d */
        public C13958a mo68606d() {
            return this.f37218f;
        }

        /* renamed from: e */
        public void mo68607e() {
            this.f37217e = this.f37216d;
        }

        /* renamed from: a */
        public C13958a mo68597a() {
            return this.f37217e;
        }

        /* renamed from: a */
        public C13958a mo68599a(C12287f.C12288a aVar) {
            return this.f37214b.get(aVar);
        }

        /* renamed from: a */
        public C13958a mo68598a(int i) {
            C13958a aVar = null;
            for (int i2 = 0; i2 < this.f37213a.size(); i2++) {
                C13958a aVar2 = this.f37213a.get(i2);
                int a = this.f37219g.mo65186a(aVar2.f37210a.f30085a);
                if (a != -1 && this.f37219g.mo65188a(a, this.f37215c, false).f30040c == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        /* renamed from: b */
        public boolean mo68603b(C12287f.C12288a aVar) {
            C13958a remove = this.f37214b.remove(aVar);
            if (remove == null) {
                return false;
            }
            this.f37213a.remove(remove);
            C13958a aVar2 = this.f37218f;
            if (aVar2 != null && aVar.equals(aVar2.f37210a)) {
                this.f37218f = this.f37213a.isEmpty() ? null : this.f37213a.get(0);
            }
            if (this.f37213a.isEmpty()) {
                return true;
            }
            this.f37216d = this.f37213a.get(0);
            return true;
        }

        /* renamed from: c */
        public void mo68605c(C12287f.C12288a aVar) {
            this.f37218f = this.f37214b.get(aVar);
        }

        /* renamed from: a */
        public void mo68601a(C12270q qVar) {
            for (int i = 0; i < this.f37213a.size(); i++) {
                C13958a a = m39303a(this.f37213a.get(i), qVar);
                this.f37213a.set(i, a);
                this.f37214b.put(a.f37210a, a);
            }
            C13958a aVar = this.f37218f;
            if (aVar != null) {
                this.f37218f = m39303a(aVar, qVar);
            }
            this.f37219g = qVar;
            this.f37217e = this.f37216d;
        }

        /* renamed from: a */
        public void mo68600a(int i, C12287f.C12288a aVar) {
            int a = this.f37219g.mo65186a(aVar.f30085a);
            boolean z = a != -1;
            C12270q qVar = z ? this.f37219g : C12270q.f30037a;
            if (z) {
                i = this.f37219g.mo65188a(a, this.f37215c, false).f30040c;
            }
            C13958a aVar2 = new C13958a(aVar, qVar, i);
            this.f37213a.add(aVar2);
            this.f37214b.put(aVar, aVar2);
            this.f37216d = this.f37213a.get(0);
            if (this.f37213a.size() == 1 && !this.f37219g.mo65194d()) {
                this.f37217e = this.f37216d;
            }
        }

        /* renamed from: a */
        private C13958a m39303a(C13958a aVar, C12270q qVar) {
            int a = qVar.mo65186a(aVar.f37210a.f30085a);
            if (a == -1) {
                return aVar;
            }
            return new C13958a(aVar.f37210a, qVar, qVar.mo65188a(a, this.f37215c, false).f30040c);
        }
    }

    public C13957m7(C13493jf jfVar) {
        this.f37206b = (C13493jf) C13479j9.m37703a(jfVar);
    }

    /* renamed from: a */
    public void mo68588a(C12227m mVar) {
        C13479j9.m37708b(this.f37209e == null || this.f37208d.f37213a.isEmpty());
        this.f37209e = mVar;
    }

    /* renamed from: b */
    public final void mo65172b(String str, long j, long j2) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68904c();
        }
    }

    /* renamed from: c */
    public final void mo65173c(C14283pj pjVar) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68899B();
        }
    }

    /* renamed from: d */
    public final void mo68595d() {
        Iterator it = new ArrayList(this.f37208d.f37213a).iterator();
        while (it.hasNext()) {
            C13958a aVar = (C13958a) it.next();
            mo68593c(aVar.f37212c, aVar.f37210a);
        }
    }

    public void onIsPlayingChanged(boolean z) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68925w();
        }
    }

    public final void onLoadingChanged(boolean z) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68909h();
        }
    }

    public void onPlaybackSuppressionReasonChanged(int i) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68918p();
        }
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68901D();
        }
    }

    public final void onPositionDiscontinuity(int i) {
        this.f37208d.mo68607e();
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68900C();
        }
    }

    public final void onRenderedFirstFrame() {
    }

    public final void onSeekProcessed() {
        this.f37208d.getClass();
    }

    public void onSurfaceSizeChanged(int i, int i2) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68912k();
        }
    }

    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68928z();
        }
    }

    public void onVolumeChanged(float f) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68910i();
        }
    }

    /* renamed from: b */
    public final void mo65170b(Format format) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68913l();
        }
    }

    /* renamed from: c */
    public final void mo68593c(int i, C12287f.C12288a aVar) {
        m39269a(i, aVar);
        if (this.f37208d.mo68603b(aVar)) {
            Iterator<C14059n7> it = this.f37205a.iterator();
            while (it.hasNext()) {
                it.next().mo68898A();
            }
        }
    }

    /* renamed from: d */
    public final void mo65174d(C14283pj pjVar) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68899B();
        }
    }

    /* renamed from: a */
    public final void mo65167a(Metadata metadata) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68919q();
        }
    }

    /* renamed from: b */
    public final void mo65171b(C14283pj pjVar) {
        m39268a();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68908g();
        }
    }

    /* renamed from: c */
    public final void mo68594c(int i, C12287f.C12288a aVar, C12290g.C12293b bVar, C12290g.C12294c cVar) {
        m39269a(i, aVar);
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68922t();
        }
    }

    /* renamed from: d */
    public final void mo68596d(int i, C12287f.C12288a aVar) {
        this.f37208d.mo68605c(aVar);
        m39269a(i, aVar);
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68916o();
        }
    }

    /* renamed from: a */
    public final void mo65169a(String str, long j, long j2) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68904c();
        }
    }

    /* renamed from: b */
    public final void mo68591b(int i, C12287f.C12288a aVar) {
        this.f37208d.mo68600a(i, aVar);
        m39269a(i, aVar);
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68923u();
        }
    }

    /* renamed from: c */
    private C14059n7.C14060a m39272c() {
        return m39270a(this.f37208d.mo68606d());
    }

    /* renamed from: a */
    public final void mo65166a(Format format) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68913l();
        }
    }

    /* renamed from: b */
    public final void mo68592b(int i, C12287f.C12288a aVar, C12290g.C12293b bVar, C12290g.C12294c cVar) {
        m39269a(i, aVar);
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68921s();
        }
    }

    /* renamed from: a */
    public final void mo65164a(int i, long j, long j2) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68924v();
        }
    }

    /* renamed from: b */
    private C14059n7.C14060a m39271b() {
        return m39270a(this.f37208d.mo68604c());
    }

    /* renamed from: a */
    public final void mo65168a(C14283pj pjVar) {
        m39268a();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68908g();
        }
    }

    /* renamed from: b */
    public final void mo68590b(int i, long j, long j2) {
        m39270a(this.f37208d.mo68602b());
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68926x();
        }
    }

    /* renamed from: a */
    public final void mo65162a(int i) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68914m();
        }
    }

    /* renamed from: a */
    public final void mo65163a(int i, long j) {
        m39268a();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68906e();
        }
    }

    /* renamed from: a */
    public final void mo65165a(Surface surface) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().onRenderedFirstFrame();
        }
    }

    /* renamed from: a */
    public final void mo68585a(int i, C12287f.C12288a aVar, C12290g.C12293b bVar, C12290g.C12294c cVar) {
        m39269a(i, aVar);
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68911j();
        }
    }

    /* renamed from: a */
    public final void mo68586a(int i, C12287f.C12288a aVar, C12290g.C12293b bVar, C12290g.C12294c cVar, IOException iOException, boolean z) {
        m39269a(i, aVar);
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68902a();
        }
    }

    /* renamed from: a */
    public final void mo68587a(int i, C12287f.C12288a aVar, C12290g.C12294c cVar) {
        m39269a(i, aVar);
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68903b();
        }
    }

    /* renamed from: a */
    public final void mo64984a(C12270q qVar, int i) {
        this.f37208d.mo68601a(qVar);
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68915n();
        }
    }

    /* renamed from: a */
    public final void mo64985a(TrackGroupArray trackGroupArray, C12333e eVar) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68927y();
        }
    }

    /* renamed from: a */
    public final void mo64986a(k40 k40) {
        m39268a();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68907f();
        }
    }

    /* renamed from: a */
    public final void mo64987a(sz0 sz0) {
        m39271b();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68905d();
        }
    }

    /* renamed from: a */
    public final void mo68589a(Exception exc) {
        m39272c();
        Iterator<C14059n7> it = this.f37205a.iterator();
        while (it.hasNext()) {
            it.next().mo68920r();
        }
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    /* renamed from: a */
    public C14059n7.C14060a mo68584a(C12270q qVar, int i, C12287f.C12288a aVar) {
        long j;
        if (qVar.mo65194d()) {
            aVar = null;
        }
        C12287f.C12288a aVar2 = aVar;
        long b = this.f37206b.mo67515b();
        boolean z = true;
        boolean z2 = qVar == this.f37209e.mo64916f() && i == this.f37209e.mo64918h();
        long j2 = 0;
        if (aVar2 != null && aVar2.mo65283a()) {
            if (!(z2 && this.f37209e.mo64920j() == aVar2.f30086b && this.f37209e.mo64904a() == aVar2.f30087c)) {
                z = false;
            }
            if (z) {
                j = this.f37209e.mo64919i();
            }
            return new C14059n7.C14060a(b, qVar, i, aVar2, j2, this.f37209e.mo64919i(), this.f37209e.mo64913c());
        } else if (z2) {
            j = this.f37209e.mo64911b();
        } else {
            if (!qVar.mo65194d()) {
                j = C12874dd.m35213b(qVar.mo65190a(i, this.f37207c, 0).f30055k);
            }
            return new C14059n7.C14060a(b, qVar, i, aVar2, j2, this.f37209e.mo64919i(), this.f37209e.mo64913c());
        }
        j2 = j;
        return new C14059n7.C14060a(b, qVar, i, aVar2, j2, this.f37209e.mo64919i(), this.f37209e.mo64913c());
    }

    /* renamed from: a */
    private C14059n7.C14060a m39270a(C13958a aVar) {
        this.f37209e.getClass();
        if (aVar == null) {
            int h = this.f37209e.mo64918h();
            C13958a a = this.f37208d.mo68598a(h);
            if (a == null) {
                C12270q f = this.f37209e.mo64916f();
                if (!(h < f.mo65193c())) {
                    f = C12270q.f30037a;
                }
                return mo68584a(f, h, (C12287f.C12288a) null);
            }
            aVar = a;
        }
        return mo68584a(aVar.f37211b, aVar.f37212c, aVar.f37210a);
    }

    /* renamed from: a */
    private C14059n7.C14060a m39268a() {
        return m39270a(this.f37208d.mo68597a());
    }

    /* renamed from: a */
    private C14059n7.C14060a m39269a(int i, C12287f.C12288a aVar) {
        this.f37209e.getClass();
        if (aVar != null) {
            C13958a a = this.f37208d.mo68599a(aVar);
            if (a != null) {
                return m39270a(a);
            }
            return mo68584a(C12270q.f30037a, i, aVar);
        }
        C12270q f = this.f37209e.mo64916f();
        if (!(i < f.mo65193c())) {
            f = C12270q.f30037a;
        }
        return mo68584a(f, i, (C12287f.C12288a) null);
    }
}
