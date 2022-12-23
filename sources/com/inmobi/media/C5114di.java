package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.inmobi.media.C5107df;
import com.inmobi.media.C5120dk;
import com.inmobi.media.C5220ev;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.di */
/* compiled from: NativeAdTracker */
public class C5114di {

    /* renamed from: a */
    static final Map<Context, C5107df> f11729a = new WeakHashMap();

    /* renamed from: b */
    private static final String f11730b = C5114di.class.getSimpleName();

    /* renamed from: c */
    private static final Map<Context, C5120dk> f11731c = new WeakHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<View, C5118a> f11732d = new HashMap();

    /* renamed from: e */
    private static final C5107df.C5109a f11733e = new C5107df.C5109a() {
        /* renamed from: a */
        public final void mo40389a(View view, Object obj) {
            ((C5397j) obj).mo40771a(view);
        }
    };

    /* renamed from: f */
    private static final C5120dk.C5121a f11734f = new C5120dk.C5121a() {

        /* renamed from: a */
        private final Rect f11737a = new Rect();

        /* renamed from: a */
        public final boolean mo40396a(View view, View view2, int i, Object obj) {
            C5175ei mediaPlayer;
            if (!(obj instanceof C5397j) || ((C5397j) obj).f12382k) {
                return false;
            }
            if (((view2 instanceof C5184eo) && (mediaPlayer = ((C5184eo) view2).getMediaPlayer()) != null && 3 != mediaPlayer.f11892a) || view2 == null || view == null || !view2.isShown() || view.getParent() == null || !view2.getGlobalVisibleRect(this.f11737a)) {
                return false;
            }
            long height = ((long) this.f11737a.height()) * ((long) this.f11737a.width());
            long width = ((long) view.getWidth()) * ((long) view.getHeight());
            if (width <= 0 || height * 100 < ((long) i) * width) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: g */
    private boolean f11735g;

    /* renamed from: h */
    private byte f11736h;

    /* renamed from: com.inmobi.media.di$a */
    /* compiled from: NativeAdTracker */
    public interface C5118a {
        /* renamed from: a */
        void mo40397a(View view, boolean z);
    }

    C5114di(byte b) {
        this.f11736h = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40394a(Context context, View view, C5397j jVar, C5220ev.C5234k kVar) {
        C5107df a = m11655a(context, kVar);
        if (this.f11736h != 0) {
            a.mo40384a(view, jVar, kVar.impressionMinPercentageViewed, kVar.impressionMinTimeViewed);
        } else {
            a.mo40384a(view, jVar, kVar.video.impressionMinPercentageViewed, kVar.video.impressionMinTimeViewed);
        }
    }

    /* renamed from: a */
    private C5107df m11655a(Context context, C5220ev.C5234k kVar) {
        C5107df dfVar = f11729a.get(context);
        if (dfVar == null) {
            if (context instanceof Activity) {
                dfVar = new C5107df(kVar, new C5105de(f11734f, (Activity) context), f11733e);
                if (!this.f11735g) {
                    this.f11735g = true;
                }
            } else {
                dfVar = new C5107df(kVar, new C5119dj(f11734f, kVar), f11733e);
            }
            f11729a.put(context, dfVar);
        }
        return dfVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40395a(Context context, C5397j jVar) {
        C5107df dfVar = f11729a.get(context);
        if (dfVar != null) {
            dfVar.mo40385a((Object) jVar);
            if (!dfVar.mo40386b()) {
                mo40391a(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40391a(Context context) {
        C5107df remove = f11729a.remove(context);
        if (remove != null) {
            remove.mo40387c();
        }
        if ((context instanceof Activity) && f11729a.isEmpty() && this.f11735g) {
            this.f11735g = false;
        }
    }

    /* renamed from: a */
    public final void mo40392a(Context context, View view, C5397j jVar) {
        C5120dk dkVar = f11731c.get(context);
        if (dkVar != null) {
            dkVar.mo40401a((Object) jVar);
            if (!dkVar.mo40403g()) {
                m11659d(context);
            }
        }
        f11732d.remove(view);
    }

    /* renamed from: d */
    private void m11659d(Context context) {
        C5120dk remove = f11731c.remove(context);
        if (remove != null) {
            remove.mo40381e();
        }
        if ((context instanceof Activity) && f11731c.isEmpty() && this.f11735g) {
            this.f11735g = false;
        }
    }

    /* renamed from: b */
    static void m11657b(Context context) {
        C5107df dfVar = f11729a.get(context);
        if (dfVar != null) {
            dfVar.mo40383a();
        }
    }

    /* renamed from: c */
    static void m11658c(Context context) {
        C5107df dfVar = f11729a.get(context);
        if (dfVar != null) {
            dfVar.f11704a.mo40402f();
            dfVar.f11706c.removeCallbacksAndMessages((Object) null);
            dfVar.f11705b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40393a(Context context, View view, C5397j jVar, C5118a aVar, C5220ev.C5234k kVar) {
        C5120dk dkVar;
        C5120dk dkVar2 = f11731c.get(context);
        if (dkVar2 == null) {
            boolean z = context instanceof Activity;
            if (z) {
                dkVar = new C5105de(f11734f, (Activity) context);
            } else {
                dkVar = new C5119dj(f11734f, kVar);
            }
            dkVar.f11742c = new C5120dk.C5123c() {
                /* renamed from: a */
                public final void mo40388a(List<View> list, List<View> list2) {
                    for (View next : list) {
                        C5118a aVar = (C5118a) C5114di.f11732d.get(next);
                        if (aVar != null) {
                            aVar.mo40397a(next, true);
                        }
                    }
                    for (View next2 : list2) {
                        C5118a aVar2 = (C5118a) C5114di.f11732d.get(next2);
                        if (aVar2 != null) {
                            aVar2.mo40397a(next2, false);
                        }
                    }
                }
            };
            f11731c.put(context, dkVar);
            if (z && !this.f11735g) {
                this.f11735g = true;
            }
            dkVar2 = dkVar;
        }
        f11732d.put(view, aVar);
        if (this.f11736h != 0) {
            dkVar2.mo40400a(view, jVar, kVar.displayMinPercentageAnimate);
        } else {
            dkVar2.mo40400a(view, jVar, kVar.video.videoMinPercentagePlay);
        }
    }
}
