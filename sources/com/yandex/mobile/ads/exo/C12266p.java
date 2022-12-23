package com.yandex.mobile.ads.exo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.yandex.mobile.ads.exo.C12169a;
import com.yandex.mobile.ads.exo.C12172b;
import com.yandex.mobile.ads.exo.C12227m;
import com.yandex.mobile.ads.exo.C12260n;
import com.yandex.mobile.ads.exo.drm.C12182b;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.source.C12279a;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.C12290g;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12333e;
import com.yandex.mobile.ads.exo.trackselection.C12334f;
import com.yandex.mobile.ads.exo.video.C12344d;
import com.yandex.mobile.ads.impl.C12579bb;
import com.yandex.mobile.ads.impl.C13038fa;
import com.yandex.mobile.ads.impl.C13209gk;
import com.yandex.mobile.ads.impl.C13296ha;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13493jf;
import com.yandex.mobile.ads.impl.C13957m7;
import com.yandex.mobile.ads.impl.C14190ok;
import com.yandex.mobile.ads.impl.C14283pj;
import com.yandex.mobile.ads.impl.C14467rk;
import com.yandex.mobile.ads.impl.C14683ti;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.im1;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.nd1;
import com.yandex.mobile.ads.impl.qn0;
import com.yandex.mobile.ads.impl.s70;
import com.yandex.mobile.ads.impl.sz0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.mobile.ads.exo.p */
public class C12266p extends C12175c {

    /* renamed from: A */
    private boolean f30001A;

    /* renamed from: b */
    protected final C12263o[] f30002b;

    /* renamed from: c */
    private final C12215g f30003c;

    /* renamed from: d */
    private final Handler f30004d;

    /* renamed from: e */
    private final C12269c f30005e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CopyOnWriteArraySet<im1> f30006f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final CopyOnWriteArraySet<C13038fa> f30007g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<nd1> f30008h = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final CopyOnWriteArraySet<qn0> f30009i = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final CopyOnWriteArraySet<C12344d> f30010j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final CopyOnWriteArraySet<C13296ha> f30011k;

    /* renamed from: l */
    private final C12579bb f30012l;

    /* renamed from: m */
    private final C13957m7 f30013m;

    /* renamed from: n */
    private final C12169a f30014n;

    /* renamed from: o */
    private final C12172b f30015o;

    /* renamed from: p */
    private final C12274r f30016p;

    /* renamed from: q */
    private final C12275s f30017q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Surface f30018r;

    /* renamed from: s */
    private boolean f30019s;

    /* renamed from: t */
    private TextureView f30020t;

    /* renamed from: u */
    private int f30021u;

    /* renamed from: v */
    private int f30022v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f30023w;

    /* renamed from: x */
    private float f30024x;

    /* renamed from: y */
    private C12287f f30025y;

    /* renamed from: z */
    private boolean f30026z;

    @Deprecated
    protected C12266p(Context context, C14467rk rkVar, C12334f fVar, C14190ok okVar, C12188d<s70> dVar, C12579bb bbVar, C13957m7 m7Var, C13493jf jfVar, Looper looper) {
        Context context2 = context;
        C12188d<s70> dVar2 = dVar;
        C13957m7 m7Var2 = m7Var;
        this.f30012l = bbVar;
        this.f30013m = m7Var2;
        C12269c cVar = new C12269c();
        this.f30005e = cVar;
        CopyOnWriteArraySet<im1> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f30006f = copyOnWriteArraySet;
        CopyOnWriteArraySet<C13038fa> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f30007g = copyOnWriteArraySet2;
        CopyOnWriteArraySet<C12344d> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.f30010j = copyOnWriteArraySet3;
        CopyOnWriteArraySet<C13296ha> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.f30011k = copyOnWriteArraySet4;
        Handler handler = new Handler(looper);
        this.f30004d = handler;
        Handler handler2 = handler;
        C12263o[] a = rkVar.mo69775a(handler, cVar, cVar, cVar, cVar, dVar);
        this.f30002b = a;
        this.f30024x = 1.0f;
        this.f30023w = 0;
        Collections.emptyList();
        C12215g gVar = r2;
        C12215g gVar2 = new C12215g(a, fVar, okVar, bbVar, jfVar, looper);
        this.f30003c = gVar;
        m7Var2.mo68588a((C12227m) gVar);
        gVar.mo64907a((C12227m.C12228a) m7Var2);
        gVar.mo64907a((C12227m.C12228a) cVar);
        copyOnWriteArraySet3.add(m7Var2);
        copyOnWriteArraySet.add(m7Var2);
        copyOnWriteArraySet4.add(m7Var2);
        copyOnWriteArraySet2.add(m7Var2);
        mo65153a((qn0) m7Var2);
        bbVar.mo65789a(handler2, m7Var2);
        C12188d<s70> dVar3 = dVar;
        if (!(dVar3 instanceof C12182b)) {
            Context context3 = context;
            this.f30014n = new C12169a(context3, handler2, cVar);
            this.f30015o = new C12172b(context3, handler2, cVar);
            this.f30016p = new C12274r(context3);
            this.f30017q = new C12275s(context3);
            return;
        }
        ((C12182b) dVar3).mo64852a(handler2, (C13209gk) m7Var2);
        throw null;
    }

    /* renamed from: o */
    private void m32152o() {
        TextureView textureView = this.f30020t;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f30005e) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f30020t.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f30020t = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m32153p() {
        float b = this.f30024x * this.f30015o.mo64786b();
        for (C12263o oVar : this.f30002b) {
            if (oVar.mo64820o() == 1) {
                this.f30003c.mo64905a((C12260n.C12262b) oVar).mo65122a(2).mo65123a((Object) Float.valueOf(b)).mo65132h();
            }
        }
    }

    /* renamed from: q */
    private void m32154q() {
        if (Looper.myLooper() != this.f30003c.mo64921l()) {
            bk0.m34271b("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.f30026z ? null : new IllegalStateException());
            this.f30026z = true;
        }
    }

    /* renamed from: e */
    public boolean mo64915e() {
        m32154q();
        return this.f30003c.mo64915e();
    }

    /* renamed from: l */
    public long mo65158l() {
        m32154q();
        return this.f30003c.mo64922m();
    }

    /* renamed from: m */
    public float mo65159m() {
        return this.f30024x;
    }

    /* renamed from: n */
    public void mo65160n() {
        m32154q();
        this.f30014n.mo64782a(false);
        this.f30016p.mo65213a(false);
        this.f30017q.mo65214a(false);
        this.f30015o.mo64787c();
        this.f30003c.mo64924o();
        m32152o();
        Surface surface = this.f30018r;
        if (surface != null) {
            if (this.f30019s) {
                surface.release();
            }
            this.f30018r = null;
        }
        C12287f fVar = this.f30025y;
        if (fVar != null) {
            fVar.mo65252a((C12290g) this.f30013m);
            this.f30025y = null;
        }
        if (!this.f30001A) {
            this.f30012l.mo65790a(this.f30013m);
            Collections.emptyList();
            return;
        }
        throw null;
    }

    /* renamed from: com.yandex.mobile.ads.exo.p$c */
    private final class C12269c implements C12344d, C13296ha, nd1, qn0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C12172b.C12174b, C12169a.C12171b, C12227m.C12228a {
        private C12269c() {
        }

        /* renamed from: a */
        public void mo65163a(int i, long j) {
            Iterator it = C12266p.this.f30010j.iterator();
            while (it.hasNext()) {
                ((C12344d) it.next()).mo65163a(i, j);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo64984a(C12270q qVar, int i) {
            C12227m.C12228a.CC.$default$a((C12227m.C12228a) this, qVar, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo64985a(TrackGroupArray trackGroupArray, C12333e eVar) {
            C12227m.C12228a.CC.$default$a((C12227m.C12228a) this, trackGroupArray, eVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo64986a(k40 k40) {
            C12227m.C12228a.CC.$default$a((C12227m.C12228a) this, k40);
        }

        /* renamed from: a */
        public /* synthetic */ void mo64987a(sz0 sz0) {
            C12227m.C12228a.CC.$default$a((C12227m.C12228a) this, sz0);
        }

        /* renamed from: b */
        public void mo65172b(String str, long j, long j2) {
            Iterator it = C12266p.this.f30010j.iterator();
            while (it.hasNext()) {
                ((C12344d) it.next()).mo65172b(str, j, j2);
            }
        }

        /* renamed from: c */
        public void mo65173c(C14283pj pjVar) {
            C12266p.this.getClass();
            Iterator it = C12266p.this.f30011k.iterator();
            while (it.hasNext()) {
                ((C13296ha) it.next()).mo65173c(pjVar);
            }
        }

        /* renamed from: d */
        public void mo65174d(C14283pj pjVar) {
            C12266p.this.getClass();
            Iterator it = C12266p.this.f30010j.iterator();
            while (it.hasNext()) {
                ((C12344d) it.next()).mo65174d(pjVar);
            }
        }

        public void onCues(List<C14683ti> list) {
            C12266p.this.getClass();
            Iterator it = C12266p.this.f30008h.iterator();
            while (it.hasNext()) {
                ((nd1) it.next()).onCues(list);
            }
        }

        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            C12227m.C12228a.CC.$default$onIsPlayingChanged(this, z);
        }

        public void onLoadingChanged(boolean z) {
            C12266p.this.getClass();
        }

        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C12227m.C12228a.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
        }

        public void onPlayerStateChanged(boolean z, int i) {
            C12266p.m32146e(C12266p.this);
        }

        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C12227m.C12228a.CC.$default$onPositionDiscontinuity(this, i);
        }

        public /* synthetic */ void onSeekProcessed() {
            C12227m.C12228a.CC.$default$onSeekProcessed(this);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C12266p.this.m32138a(new Surface(surfaceTexture), true);
            C12266p.this.m32137a(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C12266p.this.m32138a((Surface) null, true);
            C12266p.this.m32137a(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C12266p.this.m32137a(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            Iterator it = C12266p.this.f30006f.iterator();
            while (it.hasNext()) {
                im1 im1 = (im1) it.next();
                if (!C12266p.this.f30010j.contains(im1)) {
                    im1.onVideoSizeChanged(i, i2, i3, f);
                }
            }
            Iterator it2 = C12266p.this.f30010j.iterator();
            while (it2.hasNext()) {
                ((C12344d) it2.next()).onVideoSizeChanged(i, i2, i3, f);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C12266p.this.m32137a(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C12266p.this.m32138a(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C12266p.this.m32138a((Surface) null, false);
            C12266p.this.m32137a(0, 0);
        }

        /* renamed from: a */
        public void mo65165a(Surface surface) {
            if (C12266p.this.f30018r == surface) {
                Iterator it = C12266p.this.f30006f.iterator();
                while (it.hasNext()) {
                    ((im1) it.next()).onRenderedFirstFrame();
                }
            }
            Iterator it2 = C12266p.this.f30010j.iterator();
            while (it2.hasNext()) {
                ((C12344d) it2.next()).mo65165a(surface);
            }
        }

        /* renamed from: b */
        public void mo65170b(Format format) {
            C12266p.this.getClass();
            Iterator it = C12266p.this.f30010j.iterator();
            while (it.hasNext()) {
                ((C12344d) it.next()).mo65170b(format);
            }
        }

        /* renamed from: b */
        public void mo65171b(C14283pj pjVar) {
            Iterator it = C12266p.this.f30010j.iterator();
            while (it.hasNext()) {
                ((C12344d) it.next()).mo65171b(pjVar);
            }
            C12266p.this.getClass();
            C12266p.this.getClass();
        }

        /* renamed from: a */
        public void mo65162a(int i) {
            if (C12266p.this.f30023w != i) {
                int unused = C12266p.this.f30023w = i;
                Iterator it = C12266p.this.f30007g.iterator();
                while (it.hasNext()) {
                    C13038fa faVar = (C13038fa) it.next();
                    if (!C12266p.this.f30011k.contains(faVar)) {
                        faVar.mo66945a(i);
                    }
                }
                Iterator it2 = C12266p.this.f30011k.iterator();
                while (it2.hasNext()) {
                    ((C13296ha) it2.next()).mo65162a(i);
                }
            }
        }

        /* renamed from: a */
        public void mo65169a(String str, long j, long j2) {
            Iterator it = C12266p.this.f30011k.iterator();
            while (it.hasNext()) {
                ((C13296ha) it.next()).mo65169a(str, j, j2);
            }
        }

        /* renamed from: a */
        public void mo65166a(Format format) {
            C12266p.this.getClass();
            Iterator it = C12266p.this.f30011k.iterator();
            while (it.hasNext()) {
                ((C13296ha) it.next()).mo65166a(format);
            }
        }

        /* renamed from: a */
        public void mo65164a(int i, long j, long j2) {
            Iterator it = C12266p.this.f30011k.iterator();
            while (it.hasNext()) {
                ((C13296ha) it.next()).mo65164a(i, j, j2);
            }
        }

        /* renamed from: a */
        public void mo65168a(C14283pj pjVar) {
            Iterator it = C12266p.this.f30011k.iterator();
            while (it.hasNext()) {
                ((C13296ha) it.next()).mo65168a(pjVar);
            }
            C12266p.this.getClass();
            C12266p.this.getClass();
            int unused = C12266p.this.f30023w = 0;
        }

        /* renamed from: a */
        public void mo65167a(Metadata metadata) {
            Iterator it = C12266p.this.f30009i.iterator();
            while (it.hasNext()) {
                ((qn0) it.next()).mo65167a(metadata);
            }
        }
    }

    /* renamed from: b */
    public void mo65156b(im1 im1) {
        this.f30006f.remove(im1);
    }

    /* renamed from: c */
    public long mo64913c() {
        m32154q();
        return this.f30003c.mo64913c();
    }

    /* renamed from: d */
    public int mo64914d() {
        m32154q();
        return this.f30003c.mo64914d();
    }

    /* renamed from: f */
    public C12270q mo64916f() {
        m32154q();
        return this.f30003c.mo64916f();
    }

    /* renamed from: g */
    public int mo64917g() {
        m32154q();
        return this.f30003c.mo64917g();
    }

    /* renamed from: h */
    public int mo64918h() {
        m32154q();
        return this.f30003c.mo64918h();
    }

    /* renamed from: i */
    public long mo64919i() {
        m32154q();
        return this.f30003c.mo64919i();
    }

    /* renamed from: j */
    public int mo64920j() {
        m32154q();
        return this.f30003c.mo64920j();
    }

    /* renamed from: e */
    static void m32146e(C12266p pVar) {
        int g = pVar.mo64917g();
        if (g != 1) {
            if (g == 2 || g == 3) {
                pVar.f30016p.mo65213a(pVar.mo64915e());
                pVar.f30017q.mo65214a(pVar.mo64915e());
                return;
            } else if (g != 4) {
                throw new IllegalStateException();
            }
        }
        pVar.f30016p.mo65213a(false);
        pVar.f30017q.mo65214a(false);
    }

    /* renamed from: b */
    public void mo65155b(C12227m.C12228a aVar) {
        m32154q();
        this.f30003c.mo64912b(aVar);
    }

    /* renamed from: b */
    public void mo65157b(boolean z) {
        m32154q();
        this.f30015o.mo64785a(mo64915e(), 1);
        this.f30003c.mo64909a(z);
        C12287f fVar = this.f30025y;
        if (fVar != null) {
            fVar.mo65252a((C12290g) this.f30013m);
            this.f30013m.mo68595d();
            if (z) {
                this.f30025y = null;
            }
        }
        Collections.emptyList();
    }

    /* renamed from: a */
    public void mo65149a(TextureView textureView) {
        m32154q();
        m32152o();
        if (textureView != null) {
            m32154q();
            for (C12263o oVar : this.f30002b) {
                if (oVar.mo64820o() == 2) {
                    this.f30003c.mo64905a((C12260n.C12262b) oVar).mo65122a(8).mo65123a((Object) null).mo65132h();
                }
            }
        }
        this.f30020t = textureView;
        if (textureView == null) {
            m32138a((Surface) null, true);
            m32137a(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f30005e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m32138a((Surface) null, true);
            m32137a(0, 0);
            return;
        }
        m32138a(new Surface(surfaceTexture), true);
        m32137a(textureView.getWidth(), textureView.getHeight());
    }

    /* renamed from: com.yandex.mobile.ads.exo.p$b */
    public static final class C12268b {

        /* renamed from: a */
        private final Context f30027a;

        /* renamed from: b */
        private final C14467rk f30028b;

        /* renamed from: c */
        private C13493jf f30029c;

        /* renamed from: d */
        private C12334f f30030d;

        /* renamed from: e */
        private C14190ok f30031e;

        /* renamed from: f */
        private C12579bb f30032f;

        /* renamed from: g */
        private C13957m7 f30033g;

        /* renamed from: h */
        private Looper f30034h;

        /* renamed from: i */
        private boolean f30035i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C12268b(android.content.Context r11, com.yandex.mobile.ads.impl.C14467rk r12) {
            /*
                r10 = this;
                com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector r3 = new com.yandex.mobile.ads.exo.trackselection.DefaultTrackSelector
                r3.<init>(r11)
                com.yandex.mobile.ads.impl.ok r4 = new com.yandex.mobile.ads.impl.ok
                r4.<init>()
                com.yandex.mobile.ads.impl.ak r5 = com.yandex.mobile.ads.impl.C12390ak.m33756a((android.content.Context) r11)
                android.os.Looper r6 = com.yandex.mobile.ads.impl.ih1.m37371a()
                com.yandex.mobile.ads.impl.m7 r7 = new com.yandex.mobile.ads.impl.m7
                com.yandex.mobile.ads.impl.jf r9 = com.yandex.mobile.ads.impl.C13493jf.f35273a
                r7.<init>(r9)
                r8 = 1
                r0 = r10
                r1 = r11
                r2 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.C12266p.C12268b.<init>(android.content.Context, com.yandex.mobile.ads.impl.rk):void");
        }

        /* renamed from: a */
        public C12266p mo65161a() {
            C13479j9.m37708b(!this.f30035i);
            this.f30035i = true;
            return new C12266p(this.f30027a, this.f30028b, this.f30030d, this.f30031e, C12188d.f29588a, this.f30032f, this.f30033g, this.f30029c, this.f30034h);
        }

        public C12268b(Context context, C14467rk rkVar, C12334f fVar, C14190ok okVar, C12579bb bbVar, Looper looper, C13957m7 m7Var, boolean z, C13493jf jfVar) {
            this.f30027a = context;
            this.f30028b = rkVar;
            this.f30030d = fVar;
            this.f30031e = okVar;
            this.f30032f = bbVar;
            this.f30034h = looper;
            this.f30033g = m7Var;
            this.f30029c = jfVar;
        }
    }

    /* renamed from: b */
    public long mo64911b() {
        m32154q();
        return this.f30003c.mo64911b();
    }

    /* renamed from: a */
    public void mo65148a(float f) {
        m32154q();
        int i = ih1.f34858a;
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.f30024x != max) {
            this.f30024x = max;
            m32153p();
            Iterator<C13038fa> it = this.f30007g.iterator();
            while (it.hasNext()) {
                it.next().onVolumeChanged(max);
            }
        }
    }

    /* renamed from: a */
    public void mo65152a(im1 im1) {
        this.f30006f.add(im1);
    }

    /* renamed from: a */
    public void mo65153a(qn0 qn0) {
        this.f30009i.add(qn0);
    }

    /* renamed from: a */
    public void mo65150a(C12227m.C12228a aVar) {
        m32154q();
        this.f30003c.mo64907a(aVar);
    }

    /* renamed from: a */
    public void mo65151a(C12287f fVar) {
        m32154q();
        C12287f fVar2 = this.f30025y;
        if (fVar2 != null) {
            fVar2.mo65252a((C12290g) this.f30013m);
            this.f30013m.mo68595d();
        }
        this.f30025y = fVar;
        ((C12279a) fVar).mo65248a(this.f30004d, (C12290g) this.f30013m);
        boolean e = mo64915e();
        m32142a(e, this.f30015o.mo64785a(e, 2));
        this.f30003c.mo64908a(fVar, true, true);
    }

    /* renamed from: a */
    public void mo65154a(boolean z) {
        m32154q();
        m32142a(z, this.f30015o.mo64785a(z, mo64917g()));
    }

    /* renamed from: a */
    public int mo64904a() {
        m32154q();
        return this.f30003c.mo64904a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32138a(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (C12263o oVar : this.f30002b) {
            if (oVar.mo64820o() == 2) {
                arrayList.add(this.f30003c.mo64905a((C12260n.C12262b) oVar).mo65122a(1).mo65123a((Object) surface).mo65132h());
            }
        }
        Surface surface2 = this.f30018r;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C12260n) it.next()).mo65125a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f30019s) {
                this.f30018r.release();
            }
        }
        this.f30018r = surface;
        this.f30019s = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32137a(int i, int i2) {
        if (i != this.f30021u || i2 != this.f30022v) {
            this.f30021u = i;
            this.f30022v = i2;
            Iterator<im1> it = this.f30006f.iterator();
            while (it.hasNext()) {
                it.next().onSurfaceSizeChanged(i, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32142a(boolean z, int i) {
        int i2 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i2 = 1;
        }
        this.f30003c.mo64910a(z2, i2);
    }
}
