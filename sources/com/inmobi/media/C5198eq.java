package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5014bi;
import com.inmobi.media.C5022bn;
import com.inmobi.media.C5024bo;
import com.inmobi.media.C5154ee;
import com.squareup.picasso.Callback;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: com.inmobi.media.eq */
/* compiled from: NativeViewFactory */
public class C5198eq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11954a = C5198eq.class.getSimpleName();

    /* renamed from: c */
    private static final Map<Class, Byte> f11955c;

    /* renamed from: e */
    private static volatile WeakReference<C5198eq> f11956e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static WeakReference<Context> f11957f;

    /* renamed from: g */
    private static int f11958g = 1;

    /* renamed from: h */
    private static int f11959h = 1;

    /* renamed from: b */
    private int f11960b;

    /* renamed from: d */
    private Map<Byte, C5214d> f11961d = new HashMap();

    /* renamed from: a */
    static /* synthetic */ int m11896a(C5198eq eqVar) {
        int i = eqVar.f11960b;
        eqVar.f11960b = i + 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m11914b(C5198eq eqVar) {
        int i = eqVar.f11960b;
        eqVar.f11960b = i - 1;
        return i;
    }

    static {
        HashMap hashMap = new HashMap();
        f11955c = hashMap;
        hashMap.put(C5176ej.class, (byte) 0);
        f11955c.put(C5217et.class, (byte) 1);
        f11955c.put(C5216es.class, (byte) 2);
        f11955c.put(C5154ee.class, (byte) 3);
        f11955c.put(ImageView.class, (byte) 6);
        f11955c.put(C5197ep.class, (byte) 7);
        f11955c.put(C5212b.class, (byte) 4);
        f11955c.put(Button.class, (byte) 5);
        f11955c.put(C5027bq.class, (byte) 8);
        f11955c.put(C5415m.class, (byte) 9);
        f11955c.put(C5153ed.class, (byte) 10);
    }

    /* renamed from: com.inmobi.media.eq$d */
    /* compiled from: NativeViewFactory */
    abstract class C5214d {

        /* renamed from: a */
        private int f11981a = 0;

        /* renamed from: b */
        LinkedList<View> f11982b = new LinkedList<>();

        /* renamed from: d */
        private int f11984d = 0;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract View mo40541a(Context context);

        public C5214d() {
        }

        /* renamed from: a */
        public boolean mo40543a(View view) {
            C5198eq.m11918b(view);
            view.setOnClickListener((View.OnClickListener) null);
            this.f11982b.addLast(view);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            C5198eq.m11896a(C5198eq.this);
            return true;
        }

        /* renamed from: a */
        public final View mo40549a(Context context, C5010bf bfVar, C5220ev evVar) {
            View view;
            WeakReference unused = C5198eq.f11957f = new WeakReference(context);
            if (this.f11982b.isEmpty()) {
                this.f11981a++;
                view = mo40541a(context);
            } else {
                this.f11984d++;
                view = this.f11982b.removeFirst();
                C5198eq.m11914b(C5198eq.this);
            }
            if (view != null) {
                mo40542a(view, bfVar, evVar);
            }
            return view;
        }

        /* renamed from: a */
        public final void mo40550a() {
            if (this.f11982b.size() > 0) {
                this.f11982b.removeFirst();
            }
        }

        public String toString() {
            return "Size:" + this.f11982b.size() + " Miss Count:" + this.f11981a + " Hit Count:" + this.f11984d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
            view.setVisibility(bfVar.f11382x);
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    static void m11901a(int i) {
        f11958g = i;
    }

    /* renamed from: b */
    static void m11916b(int i) {
        f11959h = i;
    }

    /* renamed from: c */
    static int m11919c(int i) {
        int i2;
        Context context = (Context) f11957f.get();
        if ((context == null || !(context instanceof InMobiAdActivity)) && (i2 = f11958g) != 0) {
            return (int) (((double) i) * ((((double) i2) * 1.0d) / ((double) f11959h)));
        }
        return i;
    }

    private C5198eq(Context context) {
        f11957f = new WeakReference<>(context);
        this.f11961d.put((byte) 0, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5176ej(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11904a(view, bfVar.f11361c);
            }
        });
        this.f11961d.put((byte) 3, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5154ee(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11904a(view, bfVar.f11361c);
            }
        });
        this.f11961d.put((byte) 1, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5217et(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11904a(view, bfVar.f11361c);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                ((C5217et) view).f11988a = null;
                return super.mo40543a(view);
            }
        });
        this.f11961d.put((byte) 2, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5216es(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11904a(view, bfVar.f11361c);
            }
        });
        this.f11961d.put((byte) 6, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new ImageView(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11906a((ImageView) view, bfVar);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                if (!(view instanceof ImageView)) {
                    return false;
                }
                ((ImageView) view).setImageDrawable((Drawable) null);
                return super.mo40543a(view);
            }
        });
        this.f11961d.put((byte) 10, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5153ed(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11910a((C5153ed) view, bfVar);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                if (!(view instanceof C5153ed)) {
                    return false;
                }
                ((C5153ed) view).setGifImpl((C5149eb) null);
                return super.mo40543a(view);
            }
        });
        this.f11961d.put((byte) 7, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5197ep(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11911a((C5197ep) view, bfVar);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                if (!(view instanceof C5197ep)) {
                    return false;
                }
                C5197ep epVar = (C5197ep) view;
                epVar.getProgressBar().setVisibility(8);
                epVar.getPoster().setImageBitmap((Bitmap) null);
                epVar.getVideoView().mo40485a();
                return super.mo40543a(view);
            }
        });
        this.f11961d.put((byte) 4, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5212b(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11908a((TextView) view, bfVar);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                if (!(view instanceof TextView)) {
                    return false;
                }
                C5198eq.m11907a((TextView) view);
                return super.mo40543a(view);
            }
        });
        this.f11961d.put((byte) 5, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new Button(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11905a((Button) view, bfVar);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                if (!(view instanceof Button)) {
                    return false;
                }
                C5198eq.m11907a((TextView) (Button) view);
                return super.mo40543a(view);
            }
        });
        this.f11961d.put((byte) 8, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                return new C5027bq(context.getApplicationContext());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11912a(C5198eq.this, (C5027bq) view, bfVar);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                return (view instanceof C5027bq) && super.mo40543a(view);
            }
        });
        this.f11961d.put((byte) 9, new C5214d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final View mo40541a(Context context) {
                C5415m mVar = null;
                try {
                    C5415m mVar2 = new C5415m(context.getApplicationContext(), (byte) 0, (Set<C5096cx>) null, (String) null);
                    try {
                        mVar2.setShouldFireRenderBeacon(false);
                        return mVar2;
                    } catch (Exception e) {
                        e = e;
                        mVar = mVar2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    String unused = C5198eq.f11954a;
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                    return mVar;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo40542a(View view, C5010bf bfVar, C5220ev evVar) {
                super.mo40542a(view, bfVar, evVar);
                C5198eq.m11913a((C5415m) view, bfVar, evVar);
            }

            /* renamed from: a */
            public final boolean mo40543a(View view) {
                return (view instanceof C5415m) && !((C5415m) view).f12478w && super.mo40543a(view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.inmobi.media.eq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C5198eq m11898a(android.content.Context r3) {
        /*
            java.lang.ref.WeakReference<com.inmobi.media.eq> r0 = f11956e
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000f
        L_0x0007:
            java.lang.ref.WeakReference<com.inmobi.media.eq> r0 = f11956e
            java.lang.Object r0 = r0.get()
            com.inmobi.media.eq r0 = (com.inmobi.media.C5198eq) r0
        L_0x000f:
            if (r0 != 0) goto L_0x0037
            java.lang.Class<com.inmobi.media.eq> r2 = com.inmobi.media.C5198eq.class
            monitor-enter(r2)
            java.lang.ref.WeakReference<com.inmobi.media.eq> r0 = f11956e     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0019
            goto L_0x0022
        L_0x0019:
            java.lang.ref.WeakReference<com.inmobi.media.eq> r0 = f11956e     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0034 }
            r1 = r0
            com.inmobi.media.eq r1 = (com.inmobi.media.C5198eq) r1     // Catch:{ all -> 0x0034 }
        L_0x0022:
            if (r1 != 0) goto L_0x0031
            com.inmobi.media.eq r0 = new com.inmobi.media.eq     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ all -> 0x0034 }
            f11956e = r3     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5198eq.m11898a(android.content.Context):com.inmobi.media.eq");
    }

    /* renamed from: a */
    public final View mo40538a(Context context, C5010bf bfVar, C5220ev evVar) {
        C5214d dVar;
        byte a = m11895a(bfVar);
        if (-1 == a || (dVar = this.f11961d.get(Byte.valueOf(a))) == null) {
            return null;
        }
        return dVar.mo40549a(context, bfVar, evVar);
    }

    /* renamed from: a */
    public final void mo40540a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeViewAt(childCount);
            mo40539a(childAt);
        }
    }

    /* renamed from: a */
    public final void mo40539a(View view) {
        if ((view instanceof C5176ej) || (view instanceof C5154ee)) {
            C5154ee eeVar = (C5154ee) view;
            if (eeVar.getChildCount() != 0) {
                Stack stack = new Stack();
                stack.push(eeVar);
                while (!stack.isEmpty()) {
                    C5154ee eeVar2 = (C5154ee) stack.pop();
                    for (int childCount = eeVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = eeVar2.getChildAt(childCount);
                        eeVar2.removeViewAt(childCount);
                        if (childAt instanceof C5154ee) {
                            stack.push((C5154ee) childAt);
                        } else {
                            m11921c(childAt);
                        }
                    }
                    m11921c((View) eeVar2);
                }
                return;
            }
        }
        m11921c(view);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r10.equals(com.facebook.share.internal.ShareConstants.VIDEO_URL) != false) goto L_0x007d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m11895a(com.inmobi.media.C5010bf r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.C5012bh
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x001e
            com.inmobi.media.bh r10 = (com.inmobi.media.C5012bh) r10
            boolean r0 = r10.mo40174a()
            if (r0 == 0) goto L_0x0011
            return r3
        L_0x0011:
            boolean r0 = r10.mo40175b()
            if (r0 == 0) goto L_0x001d
            byte r10 = r10.f11395A
            if (r10 == r4) goto L_0x001c
            return r4
        L_0x001c:
            return r2
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.String r10 = r10.f11360b
            int r0 = r10.hashCode()
            r5 = 5
            r6 = 7
            r7 = 6
            r8 = 4
            r9 = -1
            switch(r0) {
                case 67056: goto L_0x0072;
                case 70564: goto L_0x0068;
                case 2241657: goto L_0x005e;
                case 2571565: goto L_0x0054;
                case 69775675: goto L_0x004a;
                case 79826725: goto L_0x0040;
                case 81665115: goto L_0x0037;
                case 1942407129: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x007c
        L_0x002d:
            java.lang.String r0 = "WEBVIEW"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = 6
            goto L_0x007d
        L_0x0037:
            java.lang.String r0 = "VIDEO"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            goto L_0x007d
        L_0x0040:
            java.lang.String r0 = "TIMER"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = 5
            goto L_0x007d
        L_0x004a:
            java.lang.String r0 = "IMAGE"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = 1
            goto L_0x007d
        L_0x0054:
            java.lang.String r0 = "TEXT"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = 0
            goto L_0x007d
        L_0x005e:
            java.lang.String r0 = "ICON"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = 2
            goto L_0x007d
        L_0x0068:
            java.lang.String r0 = "GIF"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = 7
            goto L_0x007d
        L_0x0072:
            java.lang.String r0 = "CTA"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007c
            r1 = 4
            goto L_0x007d
        L_0x007c:
            r1 = -1
        L_0x007d:
            switch(r1) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008c;
                case 2: goto L_0x008c;
                case 3: goto L_0x008b;
                case 4: goto L_0x008a;
                case 5: goto L_0x0087;
                case 6: goto L_0x0084;
                case 7: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            return r9
        L_0x0081:
            r10 = 10
            return r10
        L_0x0084:
            r10 = 9
            return r10
        L_0x0087:
            r10 = 8
            return r10
        L_0x008a:
            return r5
        L_0x008b:
            return r6
        L_0x008c:
            return r7
        L_0x008d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5198eq.m11895a(com.inmobi.media.bf):byte");
    }

    /* renamed from: c */
    private void m11921c(View view) {
        C5214d dVar;
        byte byteValue = f11955c.get(view.getClass()).byteValue();
        if (-1 != byteValue && (dVar = this.f11961d.get(Integer.valueOf(byteValue))) != null) {
            if (this.f11960b >= 300) {
                m11920c();
            }
            dVar.mo40543a(view);
        }
    }

    /* renamed from: c */
    private void m11920c() {
        C5214d d = m11922d();
        if (d != null) {
            d.mo40550a();
        }
    }

    /* renamed from: d */
    private C5214d m11922d() {
        int i = 0;
        C5214d dVar = null;
        for (Map.Entry next : this.f11961d.entrySet()) {
            if (((C5214d) next.getValue()).f11982b.size() > i) {
                C5214d dVar2 = (C5214d) next.getValue();
                dVar = dVar2;
                i = dVar2.f11982b.size();
            }
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11917b(Context context, ImageView imageView) {
        Bitmap bitmap;
        if (imageView.getDrawable() == null) {
            float f = C5343hf.m12333a().f12242c;
            C5041ca caVar = new C5041ca(context, f, (byte) 0);
            if (Build.VERSION.SDK_INT < 28) {
                caVar.layout(0, 0, (int) (((float) m11919c(40)) * f), (int) (((float) m11919c(40)) * f));
                caVar.setDrawingCacheEnabled(true);
                caVar.buildDrawingCache();
                bitmap = caVar.getDrawingCache();
            } else {
                caVar.layout(0, 0, (int) (((float) m11919c(40)) * f), (int) (((float) m11919c(40)) * f));
                bitmap = Bitmap.createBitmap((int) (((float) m11919c(40)) * f), (int) (((float) m11919c(40)) * f), Bitmap.Config.ARGB_8888);
                caVar.draw(new Canvas(bitmap));
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.inmobi.media.eq$c */
    /* compiled from: NativeViewFactory */
    static class C5213c implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<Context> f11978a;

        /* renamed from: b */
        private WeakReference<ImageView> f11979b;

        /* renamed from: c */
        private C5010bf f11980c;

        C5213c(Context context, ImageView imageView, C5010bf bfVar) {
            this.f11978a = new WeakReference<>(context);
            this.f11979b = new WeakReference<>(imageView);
            this.f11980c = bfVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = C5198eq.f11954a;
            if (method == null || !"onError".equalsIgnoreCase(method.getName())) {
                return null;
            }
            C5198eq.m11903a((Context) this.f11978a.get(), (ImageView) this.f11979b.get(), this.f11980c);
            return null;
        }
    }

    /* renamed from: com.inmobi.media.eq$a */
    /* compiled from: NativeViewFactory */
    static final class C5211a implements Runnable {

        /* renamed from: a */
        private WeakReference<Context> f11976a;

        /* renamed from: b */
        private WeakReference<ImageView> f11977b;

        C5211a(Context context, ImageView imageView) {
            this.f11976a = new WeakReference<>(context);
            this.f11977b = new WeakReference<>(imageView);
        }

        public final void run() {
            Context context = (Context) this.f11976a.get();
            ImageView imageView = (ImageView) this.f11977b.get();
            if (context != null && imageView != null) {
                C5198eq.m11917b(context, imageView);
            }
        }
    }

    /* renamed from: a */
    private static void m11909a(TextView textView, String[] strArr) {
        int paintFlags = textView.getPaintFlags();
        int i = 0;
        for (String str : strArr) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1178781136:
                    if (str.equals("italic")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026963764:
                    if (str.equals("underline")) {
                        c = 3;
                        break;
                    }
                    break;
                case -891985998:
                    if (str.equals("strike")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i |= 1;
            } else if (c == 1) {
                i |= 2;
            } else if (c == 2) {
                paintFlags |= 16;
            } else if (c == 3) {
                paintFlags |= 8;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i);
        textView.setPaintFlags(paintFlags);
    }

    /* renamed from: a */
    static void m11904a(View view, C5011bg bgVar) {
        int parseColor = Color.parseColor("#00000000");
        try {
            parseColor = Color.parseColor(bgVar.mo40170e());
        } catch (IllegalArgumentException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
        view.setBackgroundColor(parseColor);
        if ("line".equals(bgVar.mo40166a())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(parseColor);
            if ("curved".equals(bgVar.mo40167b())) {
                gradientDrawable.setCornerRadius(bgVar.mo40168c());
            }
            int parseColor2 = Color.parseColor("#ff000000");
            try {
                parseColor2 = Color.parseColor(bgVar.mo40169d());
            } catch (IllegalArgumentException e2) {
                C5275fn.m12068a().mo40590a(new C5308gk(e2));
            }
            gradientDrawable.setStroke(1, parseColor2);
            if (Build.VERSION.SDK_INT < 16) {
                view.setBackgroundDrawable(gradientDrawable);
            } else {
                view.setBackground(gradientDrawable);
            }
        }
    }

    /* renamed from: com.inmobi.media.eq$b */
    /* compiled from: NativeViewFactory */
    static final class C5212b extends TextView {
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public C5212b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            int lineHeight = getLineHeight() > 0 ? i2 / getLineHeight() : 0;
            if (lineHeight > 0) {
                setSingleLine(false);
                setLines(lineHeight);
            }
            if (lineHeight == 1) {
                setSingleLine();
            }
        }
    }

    /* renamed from: a */
    public static ViewGroup.LayoutParams m11897a(C5010bf bfVar, ViewGroup viewGroup) {
        Point point = bfVar.f11361c.f11384a;
        Point point2 = bfVar.f11361c.f11386c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(m11919c(point.x), m11919c(point.y));
        if (viewGroup instanceof C5154ee) {
            C5154ee.C5155a aVar = new C5154ee.C5155a(m11919c(point.x), m11919c(point.y));
            C5154ee.C5155a aVar2 = aVar;
            int c = m11919c(point2.x);
            int c2 = m11919c(point2.y);
            aVar2.f11834a = c;
            aVar2.f11835b = c2;
            return aVar;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m11919c(point.x), m11919c(point.y));
            layoutParams2.setMargins(m11919c(point2.x), m11919c(point2.y), 0, 0);
            return layoutParams2;
        } else if (viewGroup instanceof AbsListView) {
            return new AbsListView.LayoutParams(m11919c(point.x), m11919c(point.y));
        } else {
            if (!(viewGroup instanceof FrameLayout)) {
                return layoutParams;
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m11919c(point.x), m11919c(point.y));
            layoutParams3.setMargins(m11919c(point2.x), m11919c(point2.y), 0, 0);
            return layoutParams3;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m11918b(View view) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable((Drawable) null);
        } else {
            view.setBackground((Drawable) null);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11906a(ImageView imageView, C5010bf bfVar) {
        int i;
        int i2;
        int i3;
        String str = (String) bfVar.f11363e;
        if (str != null) {
            int c = m11919c(bfVar.f11361c.f11384a.x);
            int c2 = m11919c(bfVar.f11361c.f11384a.y);
            String f = bfVar.f11361c.mo40171f();
            char c3 = 65535;
            int hashCode = f.hashCode();
            int i4 = 0;
            if (hashCode != -1362001767) {
                if (hashCode == 727618043 && f.equals("aspectFill")) {
                    c3 = 1;
                }
            } else if (f.equals("aspectFit")) {
                c3 = 0;
            }
            if (c3 == 0) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (c3 != 1) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            Context context = (Context) f11957f.get();
            if (context != null && c > 0 && c2 > 0 && str.trim().length() != 0) {
                C5075cl.m11515a(context).load(str).into(imageView, (Callback) C5075cl.m11517a((InvocationHandler) new C5213c(context, imageView, bfVar)));
                if ("cross_button".equalsIgnoreCase(bfVar.f11362d) && bfVar.f11376r.length() == 0) {
                    new Handler().postDelayed(new C5211a(context, imageView), 2000);
                }
            }
            C5010bf bfVar2 = bfVar.f11378t;
            if (bfVar2 == null || !"line".equals(bfVar2.f11361c.mo40166a())) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int i5 = bfVar2.f11361c.f11386c.x == bfVar.f11361c.f11386c.x ? 1 : 0;
                i2 = m11919c(bfVar2.f11361c.f11384a.x) == m11919c(bfVar.f11361c.f11384a.x) + bfVar.f11361c.f11386c.x ? 1 : 0;
                i = m11919c(bfVar2.f11361c.f11386c.y) == m11919c(bfVar.f11361c.f11386c.y) ? 1 : 0;
                if (m11919c(bfVar2.f11361c.f11384a.y) == m11919c(bfVar.f11361c.f11384a.y) + m11919c(bfVar.f11361c.f11386c.y)) {
                    i4 = 1;
                }
                if (m11919c(bfVar2.f11361c.f11384a.x) == m11919c(bfVar.f11361c.f11384a.x)) {
                    i3 = i4;
                    i2 = 1;
                    i4 = 1;
                } else {
                    i3 = i4;
                    i4 = i5;
                }
            }
            if (Build.VERSION.SDK_INT < 17) {
                imageView.setPadding(i4, i, i2, i3);
            } else {
                imageView.setPaddingRelative(i4, i, i2, i3);
            }
            m11904a((View) imageView, bfVar.f11361c);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11910a(C5153ed edVar, C5010bf bfVar) {
        edVar.setLayoutParams(new ViewGroup.LayoutParams(m11919c(bfVar.f11361c.f11384a.x), m11919c(bfVar.f11361c.f11384a.y)));
        edVar.setContentMode(bfVar.f11361c.mo40171f());
        edVar.setGifImpl(((C5019bk) bfVar).f11435z);
        m11904a((View) edVar, bfVar.f11361c);
    }

    /* renamed from: a */
    static /* synthetic */ void m11911a(C5197ep epVar, C5010bf bfVar) {
        m11904a((View) epVar, bfVar.f11361c);
        if (bfVar.f11381w != null) {
            epVar.setPosterImage((Bitmap) bfVar.f11381w);
        }
        epVar.getProgressBar().setVisibility(0);
    }

    /* renamed from: a */
    static /* synthetic */ void m11908a(TextView textView, C5010bf bfVar) {
        C5022bn.C5023a aVar = (C5022bn.C5023a) bfVar.f11361c;
        textView.setLayoutParams(new ViewGroup.LayoutParams(m11919c(aVar.f11384a.x), m11919c(aVar.f11384a.y)));
        textView.setText((CharSequence) bfVar.f11363e);
        textView.setTypeface(Typeface.DEFAULT);
        byte b = aVar.f11440p;
        if (b == 1) {
            textView.setGravity(8388629);
        } else if (b != 2) {
            textView.setGravity(8388627);
        } else {
            textView.setGravity(17);
        }
        textView.setTextSize(1, (float) m11919c(aVar.mo40188h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.mo40189i());
        } catch (IllegalArgumentException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
        textView.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.mo40170e());
        } catch (IllegalArgumentException e2) {
            C5275fn.m12068a().mo40590a(new C5308gk(e2));
        }
        textView.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextAlignment(1);
        }
        m11909a(textView, aVar.mo40190j());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        m11904a((View) textView, (C5011bg) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m11907a(TextView textView) {
        textView.setTypeface(Typeface.DEFAULT, 0);
        textView.setPaintFlags(textView.getPaintFlags() & -17);
        textView.setPaintFlags(textView.getPaintFlags() & -9);
    }

    /* renamed from: a */
    static /* synthetic */ void m11905a(Button button, C5010bf bfVar) {
        C5014bi.C5015a aVar = (C5014bi.C5015a) bfVar.f11361c;
        button.setLayoutParams(new ViewGroup.LayoutParams(m11919c(aVar.f11384a.x), m11919c(aVar.f11384a.y)));
        button.setText((CharSequence) bfVar.f11363e);
        button.setTextSize(1, (float) m11919c(aVar.mo40188h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.mo40189i());
        } catch (IllegalArgumentException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
        button.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.mo40170e());
        } catch (IllegalArgumentException e2) {
            C5275fn.m12068a().mo40590a(new C5308gk(e2));
        }
        button.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            button.setTextAlignment(4);
        }
        button.setGravity(17);
        m11909a((TextView) button, aVar.mo40190j());
        m11904a((View) button, (C5011bg) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m11912a(C5198eq eqVar, final C5027bq bqVar, C5010bf bfVar) {
        long j;
        bqVar.setVisibility(4);
        final C5026bp bpVar = (C5026bp) bfVar;
        C5024bo.C5025a aVar = bpVar.f11447A.f11441a;
        C5024bo.C5025a aVar2 = bpVar.f11447A.f11442b;
        if (aVar != null) {
            try {
                j = aVar.mo40191a();
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
                return;
            }
        } else {
            j = 0;
        }
        long a = aVar2 != null ? aVar2.mo40191a() : 0;
        if (a >= 0) {
            bqVar.setTimerValue(a);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    if (C5198eq.f11957f.get() != null) {
                        if (bpVar.f11448z) {
                            bqVar.setVisibility(0);
                        }
                        bqVar.mo40192a();
                    }
                }
            }, j * 1000);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m11913a(com.inmobi.media.C5415m r4, com.inmobi.media.C5010bf r5, com.inmobi.media.C5220ev r6) {
        /*
            r0 = r5
            com.inmobi.media.bt r0 = (com.inmobi.media.C5033bt) r0     // Catch:{ Exception -> 0x004f }
            com.inmobi.media.m$a r1 = com.inmobi.media.C5415m.f12420a     // Catch:{ Exception -> 0x004f }
            r2 = 0
            r4.mo40849a((com.inmobi.media.C5415m.C5432a) r1, (com.inmobi.media.C5220ev) r6, (boolean) r2, (boolean) r2)     // Catch:{ Exception -> 0x004f }
            r6 = 1
            r4.f12464i = r6     // Catch:{ Exception -> 0x004f }
            java.lang.Object r5 = r5.f11363e     // Catch:{ Exception -> 0x004f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = r0.f11483z     // Catch:{ Exception -> 0x004f }
            r1 = -1
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x004f }
            switch(r3) {
                case -1081286672: goto L_0x0038;
                case 84303: goto L_0x002e;
                case 2228139: goto L_0x0024;
                case 83774455: goto L_0x001b;
                default: goto L_0x001a;
            }     // Catch:{ Exception -> 0x004f }
        L_0x001a:
            goto L_0x0042
        L_0x001b:
            java.lang.String r3 = "REF_HTML"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0024:
            java.lang.String r2 = "HTML"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r2 = "URL"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r2 = "REF_IFRAME"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0042
            r2 = 2
            goto L_0x0043
        L_0x0042:
            r2 = -1
        L_0x0043:
            if (r2 == 0) goto L_0x004b
            if (r2 == r6) goto L_0x004b
            r4.mo40857c((java.lang.String) r5)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004b:
            r4.mo40854b((java.lang.String) r5)     // Catch:{ Exception -> 0x004f }
            return
        L_0x004f:
            r4 = move-exception
            com.inmobi.media.fn r5 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r6 = new com.inmobi.media.gk
            r6.<init>(r4)
            r5.mo40590a((com.inmobi.media.C5308gk) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5198eq.m11913a(com.inmobi.media.m, com.inmobi.media.bf, com.inmobi.media.ev):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m11903a(Context context, ImageView imageView, C5010bf bfVar) {
        if (!(context == null || imageView == null)) {
            String str = bfVar.f11376r;
            if ("cross_button".equalsIgnoreCase(bfVar.f11362d) && str.trim().length() == 0) {
                m11917b(context, imageView);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", "603");
        bfVar.mo40163a("error", (Map<String, String>) hashMap);
    }
}
