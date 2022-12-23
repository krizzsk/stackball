package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.GravityCompat;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.media.C5027bq;
import com.inmobi.media.C5145ea;
import com.inmobi.media.C5177ek;
import com.inmobi.media.C5184eo;
import com.inmobi.media.C5397j;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.inmobi.media.eh */
/* compiled from: NativeLayoutInflater */
public final class C5162eh implements C5177ek.C5178a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f11854d = C5162eh.class.getSimpleName();

    /* renamed from: m */
    private static Handler f11855m = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    int f11856a = 0;

    /* renamed from: b */
    public final C5145ea f11857b;

    /* renamed from: c */
    C5198eq f11858c;

    /* renamed from: e */
    private final WeakReference<Context> f11859e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5016bj f11860f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5397j f11861g;

    /* renamed from: h */
    private final C5220ev f11862h;

    /* renamed from: i */
    private C5174c f11863i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5172a f11864j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5173b f11865k;

    /* renamed from: l */
    private C5179el f11866l;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f11867n = false;

    /* renamed from: o */
    private C5415m f11868o;

    /* renamed from: com.inmobi.media.eh$a */
    /* compiled from: NativeLayoutInflater */
    interface C5172a {
        /* renamed from: a */
        void mo40454a(View view, C5010bf bfVar);
    }

    /* renamed from: com.inmobi.media.eh$b */
    /* compiled from: NativeLayoutInflater */
    interface C5173b {
        /* renamed from: a */
        void mo40452a(C5026bp bpVar);
    }

    /* renamed from: com.inmobi.media.eh$c */
    /* compiled from: NativeLayoutInflater */
    interface C5174c {
        /* renamed from: a */
        void mo40453a(int i, C5010bf bfVar);
    }

    public C5162eh(Context context, C5220ev evVar, C5397j jVar, C5016bj bjVar, C5174c cVar, C5172a aVar, C5173b bVar) {
        this.f11859e = new WeakReference<>(context);
        this.f11861g = jVar;
        this.f11860f = bjVar;
        this.f11863i = cVar;
        this.f11864j = aVar;
        this.f11865k = bVar;
        this.f11857b = new C5145ea();
        this.f11862h = evVar;
        this.f11858c = C5198eq.m11898a(context);
    }

    /* renamed from: c */
    private Context m11831c() {
        return (Context) this.f11859e.get();
    }

    /* renamed from: a */
    public final C5176ej mo40457a(C5176ej ejVar, ViewGroup viewGroup, C5415m mVar) {
        this.f11868o = mVar;
        C5176ej a = m11822a(ejVar, viewGroup);
        if (!this.f11867n) {
            mo40459b(a, this.f11860f.f11405d);
        }
        return a;
    }

    /* renamed from: b */
    public final C5176ej mo40460b(C5176ej ejVar, final ViewGroup viewGroup, C5415m mVar) {
        this.f11868o = mVar;
        final C5176ej a = m11822a(ejVar, viewGroup);
        f11855m.post(new Runnable() {
            public final void run() {
                if (!C5162eh.this.f11867n) {
                    C5162eh ehVar = C5162eh.this;
                    ehVar.mo40459b(a, ehVar.f11860f.f11405d);
                }
            }
        });
        return a;
    }

    /* renamed from: a */
    private C5176ej m11822a(C5176ej ejVar, ViewGroup viewGroup) {
        C5176ej ejVar2 = ejVar == null ? (C5176ej) this.f11858c.mo40538a(m11831c(), (C5010bf) this.f11860f.f11405d, this.f11862h) : ejVar;
        if (!(ejVar2 == null || ejVar == null)) {
            m11827a(ejVar2);
            this.f11858c.mo40540a((ViewGroup) ejVar2);
            C5198eq.m11904a((View) ejVar2, this.f11860f.f11405d.f11361c);
        }
        C5198eq.m11916b(this.f11860f.f11405d.f11361c.f11384a.x);
        ejVar2.setLayoutParams(C5198eq.m11897a((C5010bf) this.f11860f.f11405d, viewGroup));
        return ejVar2;
    }

    /* renamed from: a */
    private static void m11827a(C5176ej ejVar) {
        ViewParent parent = ejVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(ejVar);
        }
    }

    /* renamed from: a */
    public final ViewGroup mo40456a(ViewGroup viewGroup, C5012bh bhVar) {
        ViewGroup viewGroup2 = (ViewGroup) this.f11858c.mo40538a(m11831c(), (C5010bf) bhVar, this.f11862h);
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(C5198eq.m11897a((C5010bf) bhVar, viewGroup));
        }
        return viewGroup2;
    }

    /* renamed from: a */
    public final int mo40455a(int i) {
        this.f11856a = i;
        this.f11863i.mo40453a(i, this.f11860f.mo40180a(i));
        return m11833d();
    }

    /* renamed from: a */
    private void m11825a(final C5026bp bpVar, C5027bq bqVar) {
        bqVar.setTimerEventsListener(new C5027bq.C5029b() {
            /* renamed from: a */
            public final void mo40201a() {
                if (C5162eh.this.f11865k != null) {
                    C5162eh.this.f11865k.mo40452a(bpVar);
                }
            }
        });
    }

    /* renamed from: a */
    private void m11823a(View view, final C5010bf bfVar) {
        boolean z;
        final List<C5145ea.C5148a> a = this.f11857b.mo40428a(view, bfVar);
        if (a == null) {
            Iterator<C5030br> it = bfVar.f11379u.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("creativeView".equals(it.next().f11469d)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                C5162eh.this.f11857b.mo40430a(a);
                C5397j unused = C5162eh.this.f11861g;
                C5010bf a = C5397j.m12508a(C5162eh.this.f11861g.mo40784k(), bfVar);
                C5010bf bfVar = bfVar;
                C5397j e = C5162eh.this.f11861g;
                if (a == null) {
                    a = bfVar;
                }
                bfVar.mo40163a("creativeView", e.mo40768a(a));
            }

            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                C5145ea d = C5162eh.this.f11857b;
                List<C5145ea.C5148a> list = a;
                if (list != null) {
                    for (C5145ea.C5148a aVar : list) {
                        aVar.f11819a.cancel();
                    }
                    d.f11811a.removeAll(list);
                }
            }
        });
    }

    /* renamed from: b */
    public final ViewGroup mo40459b(ViewGroup viewGroup, C5012bh bhVar) {
        C5415m mVar;
        m11824a((C5010bf) bhVar, (View) viewGroup);
        Iterator<C5010bf> it = bhVar.iterator();
        while (it.hasNext()) {
            C5010bf next = it.next();
            if (!"CONTAINER".equals(next.f11360b)) {
                View view = null;
                if ("WEBVIEW".equals(next.f11360b)) {
                    C5033bt btVar = (C5033bt) next;
                    if (btVar.f11481A && (mVar = this.f11868o) != null) {
                        if (mVar.getParent() != null) {
                            ((ViewGroup) mVar.getParent()).removeView(mVar);
                        }
                        this.f11868o = null;
                        view = mVar;
                    } else if ("UNKNOWN".equals(btVar.f11483z)) {
                    }
                } else if (ShareConstants.IMAGE_URL.equals(next.f11360b) && next.f11363e == null) {
                }
                if (view == null) {
                    view = this.f11858c.mo40538a(m11831c(), next, this.f11862h);
                }
                if (view != null) {
                    final WeakReference weakReference = new WeakReference(view);
                    if (next.f11373o != -1) {
                        view.setVisibility(4);
                        f11855m.postDelayed(new Runnable() {
                            public final void run() {
                                View view = (View) weakReference.get();
                                if (view != null) {
                                    view.setVisibility(0);
                                }
                            }
                        }, (long) (next.f11373o * 1000));
                    } else if (next.f11374p != -1) {
                        f11855m.postDelayed(new Runnable() {
                            public final void run() {
                                View view = (View) weakReference.get();
                                if (view != null) {
                                    view.setVisibility(4);
                                }
                            }
                        }, (long) (next.f11374p * 1000));
                    }
                    view.setLayoutParams(C5198eq.m11897a(next, viewGroup));
                    m11823a(view, next);
                    viewGroup.addView(view);
                    if (ShareConstants.VIDEO_URL.equals(next.f11360b)) {
                        m11826a((C5031bs) next, ((C5197ep) view).getVideoView());
                    }
                    m11824a(next, view);
                    if ("TIMER".equals(next.f11360b)) {
                        view.setTag("timerView");
                        m11825a((C5026bp) next, (C5027bq) view);
                    }
                    if (ShareConstants.VIDEO_URL.equals(next.f11360b)) {
                        ((C5197ep) view).mo40533a();
                    }
                    if ("WEBVIEW".equals(next.f11360b) && (view instanceof C5415m)) {
                        C5415m mVar2 = (C5415m) view;
                        C5033bt btVar2 = (C5033bt) next;
                        mVar2.setScrollable(btVar2.f11482B);
                        mVar2.setReferenceContainer(this.f11861g.f12384m);
                        mVar2.setRenderViewEventListener(this.f11861g.mo40804x());
                        mVar2.setPlacementId(this.f11861g.f12375d);
                        mVar2.setAllowAutoRedirection(this.f11861g.f12377f);
                        mVar2.setCreativeId(this.f11861g.f12376e);
                        mVar2.setImpressionId(this.f11861g.f12374c);
                        if (!btVar2.f11481A) {
                            this.f11861g.mo40776a(mVar2);
                        }
                    }
                }
            } else if (next.f11362d.equalsIgnoreCase("card_scrollable")) {
                C5177ek ekVar = (C5177ek) this.f11858c.mo40538a(m11831c(), next, this.f11862h);
                if (ekVar != null) {
                    C5179el a = C5180em.m11854a(ekVar.getType(), this.f11860f, this);
                    this.f11866l = a;
                    if (a != null) {
                        ekVar.mo40473a((C5012bh) next, a, this.f11856a, m11833d(), this);
                        ekVar.setLayoutParams(C5198eq.m11897a(next, viewGroup));
                        m11823a((View) ekVar, next);
                        viewGroup.addView(ekVar);
                    }
                }
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f11858c.mo40538a(m11831c(), next, this.f11862h);
                if (viewGroup2 != null) {
                    ViewGroup b = mo40459b(viewGroup2, (C5012bh) next);
                    b.setLayoutParams(C5198eq.m11897a(next, viewGroup));
                    m11823a((View) b, next);
                    viewGroup.addView(b);
                }
            }
        }
        return viewGroup;
    }

    /* renamed from: d */
    private int m11833d() {
        if (this.f11856a == 0) {
            return GravityCompat.START;
        }
        if (this.f11860f.mo40184c() - 1 == this.f11856a) {
            return GravityCompat.END;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo40458a() {
        this.f11867n = true;
        this.f11859e.clear();
        this.f11865k = null;
        C5179el elVar = this.f11866l;
        if (elVar != null) {
            elVar.destroy();
            this.f11866l = null;
        }
    }

    /* renamed from: a */
    private void m11824a(final C5010bf bfVar, View view) {
        if (bfVar.f11366h) {
            view.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C5162eh.this.f11864j.mo40454a(view, bfVar);
                }
            });
        }
    }

    /* renamed from: a */
    private void m11826a(final C5031bs bsVar, C5184eo eoVar) {
        C5012bh bhVar = (C5012bh) bsVar.f11378t;
        long currentTimeMillis = System.currentTimeMillis();
        if (!(bhVar == null || 0 == bhVar.f11398z)) {
            currentTimeMillis = bhVar.f11398z;
        }
        if (bhVar != null) {
            bhVar.f11398z = currentTimeMillis;
        }
        eoVar.setClickable(false);
        eoVar.setId(Integer.MAX_VALUE);
        eoVar.mo40488a(bsVar);
        if (bsVar.f11383y != null) {
            bsVar.mo40203a((C5031bs) bsVar.f11383y);
        }
        eoVar.setQuartileCompletedListener(new C5184eo.C5195c() {
            /* renamed from: a */
            public final void mo40467a(byte b) {
                if (!C5162eh.this.f11861g.f12382k && (C5162eh.this.f11861g instanceof C5410k)) {
                    ((C5410k) C5162eh.this.f11861g).mo40838a(bsVar, b);
                    if (3 == b) {
                        try {
                            C5410k kVar = (C5410k) C5162eh.this.f11861g;
                            C5031bs bsVar = bsVar;
                            if (!((Boolean) bsVar.f11380v.get("didSignalVideoCompleted")).booleanValue()) {
                                kVar.mo40798r();
                                C5397j.C5409c h = kVar.mo40781h();
                                if (h != null) {
                                    h.mo40835h();
                                }
                            }
                            if (1 == kVar.getPlacementType()) {
                                kVar.mo40779c((C5010bf) bsVar);
                            }
                        } catch (Exception unused) {
                            String unused2 = C5162eh.f11854d;
                        }
                    }
                }
            }
        });
        eoVar.setPlaybackEventListener(new C5184eo.C5194b() {
            /* renamed from: a */
            public final void mo40468a(byte b) {
                if (!C5162eh.this.f11861g.f12382k && (C5162eh.this.f11861g instanceof C5410k)) {
                    if (b == 0) {
                        ((C5410k) C5162eh.this.f11861g).mo40846z();
                    } else if (b == 1) {
                        ((C5410k) C5162eh.this.f11861g).mo40840b(bsVar);
                    } else if (b == 2) {
                        ((C5410k) C5162eh.this.f11861g).mo40841c(bsVar);
                    } else if (b == 3) {
                        ((C5410k) C5162eh.this.f11861g).mo40842d(bsVar);
                    } else if (b == 5) {
                        try {
                            ((C5410k) C5162eh.this.f11861g).mo40845g(bsVar);
                        } catch (Exception e) {
                            String unused = C5162eh.f11854d;
                            C5275fn.m12068a().mo40590a(new C5308gk(e));
                        }
                    }
                }
            }
        });
        eoVar.setMediaErrorListener(new C5184eo.C5193a() {
            /* renamed from: a */
            public final void mo40469a() {
                if (!C5162eh.this.f11861g.f12382k && (C5162eh.this.f11861g instanceof C5410k)) {
                    try {
                        ((C5410k) C5162eh.this.f11861g).mo40837a(bsVar);
                    } catch (Exception unused) {
                        String unused2 = C5162eh.f11854d;
                    }
                }
            }
        });
        if (!this.f11861g.f12382k) {
            C5397j jVar = this.f11861g;
            if (jVar instanceof C5410k) {
                try {
                    ((C5410k) jVar).mo40839a(eoVar);
                } catch (Exception unused) {
                }
            }
        }
    }
}
