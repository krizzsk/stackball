package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.io */
public final class C9424io extends RelativeLayout {

    /* renamed from: a */
    private C9382hr f23415a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9427a f23416b;

    /* renamed from: c */
    private C9052aa f23417c = C9052aa.UNSPECIFIED;

    /* renamed from: d */
    private int f23418d = 0;

    /* renamed from: e */
    private int f23419e = 0;

    /* renamed from: f */
    private C9403ia f23420f = null;

    /* renamed from: g */
    private ArrayList f23421g = null;

    /* renamed from: h */
    private ArrayList f23422h = null;

    /* renamed from: com.tapjoy.internal.io$a */
    public interface C9427a {
        /* renamed from: a */
        void mo58227a();

        /* renamed from: a */
        void mo58228a(C9400hz hzVar);
    }

    public C9424io(Context context, C9382hr hrVar, C9427a aVar) {
        super(context);
        this.f23415a = hrVar;
        this.f23416b = aVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23416b.mo58227a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getSize(r18)
            int r2 = android.view.View.MeasureSpec.getSize(r19)
            if (r1 < r2) goto L_0x001a
            com.tapjoy.internal.aa r3 = r0.f23417c
            com.tapjoy.internal.aa r4 = com.tapjoy.internal.C9052aa.LANDSCAPE
            if (r3 == r4) goto L_0x0027
            com.tapjoy.internal.aa r3 = com.tapjoy.internal.C9052aa.LANDSCAPE
            r0.f23417c = r3
            r17.m25301a()
            goto L_0x0027
        L_0x001a:
            com.tapjoy.internal.aa r3 = r0.f23417c
            com.tapjoy.internal.aa r4 = com.tapjoy.internal.C9052aa.PORTRAIT
            if (r3 == r4) goto L_0x0027
            com.tapjoy.internal.aa r3 = com.tapjoy.internal.C9052aa.PORTRAIT
            r0.f23417c = r3
            r17.m25301a()
        L_0x0027:
            int r3 = r0.f23418d
            if (r3 != r1) goto L_0x002f
            int r3 = r0.f23419e
            if (r3 == r2) goto L_0x0118
        L_0x002f:
            r0.f23418d = r1
            r0.f23419e = r2
            float r1 = (float) r1
            float r2 = (float) r2
            com.tapjoy.internal.ia r3 = r0.f23420f
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0084
            android.graphics.PointF r3 = r3.f23322b
            if (r3 == 0) goto L_0x0084
            com.tapjoy.internal.ia r3 = r0.f23420f
            android.graphics.PointF r3 = r3.f23322b
            float r3 = r3.y
            float r3 = r3 * r1
            com.tapjoy.internal.ia r6 = r0.f23420f
            android.graphics.PointF r6 = r6.f23322b
            float r6 = r6.x
            float r3 = r3 / r6
            float r3 = r3 / r2
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x006d
            com.tapjoy.internal.ia r3 = r0.f23420f
            android.graphics.PointF r3 = r3.f23322b
            float r3 = r3.y
            float r3 = r3 * r1
            com.tapjoy.internal.ia r6 = r0.f23420f
            android.graphics.PointF r6 = r6.f23322b
            float r6 = r6.x
            float r3 = r3 / r6
            float r2 = r2 - r3
            float r2 = r2 / r5
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x0085
        L_0x006d:
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            com.tapjoy.internal.ia r3 = r0.f23420f
            android.graphics.PointF r3 = r3.f23322b
            float r3 = r3.x
            float r3 = r3 * r2
            com.tapjoy.internal.ia r6 = r0.f23420f
            android.graphics.PointF r6 = r6.f23322b
            float r6 = r6.y
            float r3 = r3 / r6
            float r1 = r1 - r3
            float r1 = r1 / r5
            r4 = r1
            r1 = r3
        L_0x0084:
            r3 = 0
        L_0x0085:
            java.lang.Iterable r6 = com.tapjoy.internal.C9054ac.m24287a(r17)
            java.util.Iterator r6 = r6.iterator()
        L_0x008d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0118
            java.lang.Object r7 = r6.next()
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r8 = (android.widget.RelativeLayout.LayoutParams) r8
            java.lang.Object r7 = r7.getTag()
            com.tapjoy.internal.hz r7 = (com.tapjoy.internal.C9400hz) r7
            com.tapjoy.internal.ib r9 = r7.f23306a
            float r9 = r9.mo58334a(r1, r2)
            com.tapjoy.internal.ib r10 = r7.f23307b
            float r10 = r10.mo58334a(r1, r2)
            com.tapjoy.internal.ib r11 = r7.f23308c
            float r11 = r11.mo58334a(r1, r2)
            com.tapjoy.internal.ib r12 = r7.f23309d
            float r12 = r12.mo58334a(r1, r2)
            int r13 = r7.f23310e
            int r7 = r7.f23311f
            r14 = 14
            if (r13 != r14) goto L_0x00cb
            float r13 = r1 - r11
            float r13 = r13 / r5
            float r9 = r9 + r13
            r13 = 9
        L_0x00cb:
            r14 = 15
            r15 = 10
            if (r7 != r14) goto L_0x00d7
            float r7 = r2 - r12
            float r7 = r7 / r5
            float r10 = r10 + r7
            r7 = 10
        L_0x00d7:
            r14 = -1
            r8.addRule(r13, r14)
            r8.addRule(r7, r14)
            int r11 = java.lang.Math.round(r11)
            r8.width = r11
            int r11 = java.lang.Math.round(r12)
            r8.height = r11
            r11 = 9
            if (r13 != r11) goto L_0x00f6
            float r9 = r9 + r4
            int r9 = java.lang.Math.round(r9)
            r8.leftMargin = r9
            goto L_0x0101
        L_0x00f6:
            r11 = 11
            if (r13 != r11) goto L_0x0101
            float r9 = r9 + r4
            int r9 = java.lang.Math.round(r9)
            r8.rightMargin = r9
        L_0x0101:
            if (r7 != r15) goto L_0x010b
            float r10 = r10 + r3
            int r7 = java.lang.Math.round(r10)
            r8.topMargin = r7
            goto L_0x008d
        L_0x010b:
            r9 = 12
            if (r7 != r9) goto L_0x008d
            float r10 = r10 + r3
            int r7 = java.lang.Math.round(r10)
            r8.bottomMargin = r7
            goto L_0x008d
        L_0x0118:
            super.onMeasure(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9424io.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            ArrayList arrayList = this.f23422h;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C9411ig igVar = (C9411ig) ((WeakReference) it.next()).get();
                    if (igVar != null) {
                        igVar.setVisibility(4);
                        igVar.mo58344b();
                    }
                }
            }
            ArrayList arrayList2 = this.f23421g;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C9411ig igVar2 = (C9411ig) ((WeakReference) it2.next()).get();
                    if (igVar2 != null) {
                        igVar2.setVisibility(0);
                        igVar2.mo58342a();
                    }
                }
                return;
            }
            return;
        }
        ArrayList arrayList3 = this.f23421g;
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C9411ig igVar3 = (C9411ig) ((WeakReference) it3.next()).get();
                if (igVar3 != null) {
                    igVar3.mo58344b();
                }
            }
        }
        ArrayList arrayList4 = this.f23422h;
        if (arrayList4 != null) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                C9411ig igVar4 = (C9411ig) ((WeakReference) it4.next()).get();
                if (igVar4 != null) {
                    igVar4.mo58344b();
                }
            }
        }
    }

    /* renamed from: a */
    private void m25301a() {
        C9411ig igVar;
        C9411ig igVar2;
        Bitmap bitmap;
        Iterator it = this.f23415a.f23250a.iterator();
        C9403ia iaVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C9403ia iaVar2 = (C9403ia) it.next();
            if (iaVar2.f23321a == this.f23417c) {
                iaVar = iaVar2;
                break;
            } else if (iaVar2.f23321a == C9052aa.UNSPECIFIED) {
                iaVar = iaVar2;
            }
        }
        removeAllViews();
        ArrayList arrayList = this.f23421g;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C9411ig igVar3 = (C9411ig) ((WeakReference) it2.next()).get();
                if (igVar3 != null) {
                    igVar3.mo58345c();
                }
            }
            this.f23421g.clear();
        }
        ArrayList arrayList2 = this.f23422h;
        if (arrayList2 != null) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C9411ig igVar4 = (C9411ig) ((WeakReference) it3.next()).get();
                if (igVar4 != null) {
                    igVar4.mo58345c();
                }
            }
            this.f23422h.clear();
        }
        if (iaVar != null) {
            this.f23420f = iaVar;
            Context context = getContext();
            Iterator it4 = iaVar.f23323c.iterator();
            while (it4.hasNext()) {
                C9400hz hzVar = (C9400hz) it4.next();
                RelativeLayout relativeLayout = new RelativeLayout(context);
                if (hzVar.f23317l.f23298c != null) {
                    C9411ig igVar5 = new C9411ig(context);
                    igVar5.setScaleType(ImageView.ScaleType.FIT_XY);
                    igVar5.mo58343a(hzVar.f23317l.f23299d, hzVar.f23317l.f23298c);
                    if (this.f23421g == null) {
                        this.f23421g = new ArrayList();
                    }
                    this.f23421g.add(new WeakReference(igVar5));
                    igVar = igVar5;
                } else {
                    igVar = null;
                }
                if (hzVar.f23318m == null || hzVar.f23318m.f23298c == null) {
                    igVar2 = null;
                } else {
                    C9411ig igVar6 = new C9411ig(context);
                    igVar6.setScaleType(ImageView.ScaleType.FIT_XY);
                    igVar6.mo58343a(hzVar.f23318m.f23299d, hzVar.f23318m.f23298c);
                    if (this.f23422h == null) {
                        this.f23422h = new ArrayList();
                    }
                    this.f23422h.add(new WeakReference(igVar6));
                    igVar2 = igVar6;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                Bitmap bitmap2 = hzVar.f23317l.f23297b;
                if (hzVar.f23318m != null) {
                    bitmap = hzVar.f23318m.f23297b;
                } else {
                    bitmap = null;
                }
                final BitmapDrawable bitmapDrawable = bitmap2 != null ? new BitmapDrawable((Resources) null, bitmap2) : null;
                final BitmapDrawable bitmapDrawable2 = bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null;
                if (bitmapDrawable != null) {
                    C9053ab.m24286a(relativeLayout, bitmapDrawable);
                }
                if (igVar != null) {
                    relativeLayout.addView(igVar, layoutParams2);
                    igVar.mo58342a();
                }
                if (igVar2 != null) {
                    relativeLayout.addView(igVar2, layoutParams2);
                    igVar2.setVisibility(4);
                }
                final C9411ig igVar7 = igVar2;
                final C9411ig igVar8 = igVar;
                relativeLayout.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        C9411ig igVar;
                        if (motionEvent.getAction() == 0) {
                            if (!(igVar7 == null && bitmapDrawable2 == null)) {
                                C9411ig igVar2 = igVar8;
                                if (igVar2 != null) {
                                    igVar2.mo58344b();
                                    igVar8.setVisibility(4);
                                }
                                C9053ab.m24286a(view, (Drawable) null);
                            }
                            BitmapDrawable bitmapDrawable = bitmapDrawable2;
                            if (bitmapDrawable != null) {
                                C9053ab.m24286a(view, bitmapDrawable);
                            } else {
                                C9411ig igVar3 = igVar7;
                                if (igVar3 != null) {
                                    igVar3.setVisibility(0);
                                    igVar7.mo58342a();
                                }
                            }
                        } else {
                            boolean z = true;
                            if (motionEvent.getAction() == 1) {
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x >= 0.0f && x < ((float) view.getWidth()) && y >= 0.0f && y < ((float) view.getHeight())) {
                                    z = false;
                                }
                                if (z) {
                                    BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                                    if (bitmapDrawable2 != null) {
                                        C9053ab.m24286a(view, bitmapDrawable2);
                                    } else if (bitmapDrawable2 != null) {
                                        C9053ab.m24286a(view, (Drawable) null);
                                    }
                                }
                                C9411ig igVar4 = igVar7;
                                if (igVar4 != null) {
                                    igVar4.mo58344b();
                                    igVar7.setVisibility(4);
                                }
                                if (!((igVar7 == null && bitmapDrawable2 == null) || (igVar = igVar8) == null || !z)) {
                                    igVar.setVisibility(0);
                                    igVar8.mo58342a();
                                }
                            }
                        }
                        return false;
                    }
                });
                final RelativeLayout relativeLayout2 = relativeLayout;
                final C9400hz hzVar2 = hzVar;
                relativeLayout.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C9411ig igVar = igVar7;
                        if (igVar != null) {
                            igVar.mo58344b();
                            relativeLayout2.removeView(igVar7);
                        }
                        C9411ig igVar2 = igVar8;
                        if (igVar2 != null) {
                            igVar2.mo58344b();
                            relativeLayout2.removeView(igVar8);
                        }
                        C9424io.this.f23416b.mo58228a(hzVar2);
                    }
                });
                relativeLayout.setTag(hzVar);
                addView(relativeLayout, layoutParams);
            }
        }
    }
}
