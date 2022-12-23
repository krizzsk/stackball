package com.inmobi.media;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.en */
/* compiled from: NativeVideoController */
public class C5181en extends FrameLayout {

    /* renamed from: b */
    private static final String f11897b = C5181en.class.getSimpleName();

    /* renamed from: a */
    boolean f11898a;

    /* renamed from: c */
    private C5410k f11899c;

    /* renamed from: d */
    private C5183a f11900d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5184eo f11901e;

    /* renamed from: f */
    private C5041ca f11902f;

    /* renamed from: g */
    private C5041ca f11903g;

    /* renamed from: h */
    private ProgressBar f11904h;

    /* renamed from: i */
    private RelativeLayout f11905i;

    /* renamed from: j */
    private boolean f11906j;

    /* renamed from: k */
    private float f11907k;

    /* renamed from: l */
    private final View.OnClickListener f11908l;

    public C5181en(Context context) {
        this(context, (byte) 0);
    }

    private C5181en(Context context, byte b) {
        this(context, 0);
    }

    private C5181en(Context context, char c) {
        super(context, (AttributeSet) null, 0);
        this.f11906j = false;
        this.f11908l = new View.OnClickListener() {
            public final void onClick(View view) {
                C5181en.m11858c(C5181en.this);
            }
        };
        this.f11905i = new RelativeLayout(getContext());
        addView(this.f11905i, new RelativeLayout.LayoutParams(-1, -1));
        this.f11905i.setPadding(0, 0, 0, 0);
        if (this.f11905i != null) {
            this.f11907k = C5343hf.m12333a().f12242c;
            this.f11902f = new C5041ca(getContext(), this.f11907k, (byte) 9);
            this.f11903g = new C5041ca(getContext(), this.f11907k, Ascii.f10113VT);
            ProgressBar progressBar = new ProgressBar(getContext(), (AttributeSet) null, 16842872);
            this.f11904h = progressBar;
            progressBar.setScaleY(0.8f);
            m11857c();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, -1);
            float f = C5343hf.m12333a().f12242c;
            layoutParams.setMargins(0, (int) (-6.0f * f), 0, (int) (f * -8.0f));
            LayerDrawable layerDrawable = (LayerDrawable) this.f11904h.getProgressDrawable();
            if (layerDrawable != null) {
                layerDrawable.getDrawable(0).setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                layerDrawable.getDrawable(2).setColorFilter(-327674, PorterDuff.Mode.SRC_IN);
            }
            this.f11905i.addView(this.f11904h, layoutParams);
        }
        this.f11900d = new C5183a(this);
    }

    public void setMediaPlayer(C5184eo eoVar) {
        this.f11901e = eoVar;
        C5031bs bsVar = (C5031bs) eoVar.getTag();
        if (bsVar != null && bsVar.f11473B && !bsVar.mo40204a()) {
            this.f11906j = true;
            this.f11905i.removeView(this.f11903g);
            this.f11905i.removeView(this.f11902f);
            m11859d();
        }
    }

    /* renamed from: c */
    private void m11857c() {
        float f = this.f11907k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f * 30.0f), (int) (f * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f11905i.addView(this.f11902f, layoutParams);
        this.f11902f.setOnClickListener(this.f11908l);
    }

    /* renamed from: d */
    private void m11859d() {
        float f = this.f11907k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f * 30.0f), (int) (f * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f11905i.addView(this.f11903g, layoutParams);
        this.f11903g.setOnClickListener(this.f11908l);
    }

    /* renamed from: a */
    public final void mo40475a() {
        if (!this.f11898a) {
            m11860e();
            this.f11898a = true;
            C5031bs bsVar = (C5031bs) this.f11901e.getTag();
            if (bsVar != null) {
                int i = 4;
                this.f11902f.setVisibility(bsVar.f11473B ? 0 : 4);
                ProgressBar progressBar = this.f11904h;
                if (bsVar.f11475D) {
                    i = 0;
                }
                progressBar.setVisibility(i);
            }
            setVisibility(0);
        }
        this.f11900d.sendEmptyMessage(2);
    }

    /* renamed from: b */
    public final void mo40476b() {
        if (this.f11898a) {
            try {
                this.f11900d.removeMessages(2);
                setVisibility(8);
            } catch (IllegalArgumentException e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
            this.f11898a = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11860e() {
        C5184eo eoVar = this.f11901e;
        if (eoVar != null) {
            int currentPosition = eoVar.getCurrentPosition();
            int duration = this.f11901e.getDuration();
            ProgressBar progressBar = this.f11904h;
            if (progressBar != null && duration != 0) {
                progressBar.setProgress((currentPosition * 100) / duration);
            }
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        C5184eo eoVar = this.f11901e;
        if (eoVar == null || !eoVar.mo40489b()) {
            return false;
        }
        if (this.f11898a) {
            mo40476b();
            return false;
        }
        mo40475a();
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z) {
                if (this.f11901e.isPlaying()) {
                    this.f11901e.pause();
                } else {
                    this.f11901e.start();
                }
                mo40475a();
            }
            return true;
        } else if (keyCode == 126) {
            if (z && !this.f11901e.isPlaying()) {
                this.f11901e.start();
                mo40475a();
            }
            return true;
        } else if (keyCode == 86 || keyCode == 127) {
            if (z && this.f11901e.isPlaying()) {
                this.f11901e.pause();
                mo40475a();
            }
            return true;
        } else if (keyCode == 25 || keyCode == 24 || keyCode == 164 || keyCode == 27) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            mo40475a();
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C5181en.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C5181en.class.getName());
    }

    /* renamed from: com.inmobi.media.en$a */
    /* compiled from: NativeVideoController */
    static final class C5183a extends Handler {

        /* renamed from: a */
        private final WeakReference<C5181en> f11910a;

        C5183a(C5181en enVar) {
            this.f11910a = new WeakReference<>(enVar);
        }

        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            C5181en enVar = (C5181en) this.f11910a.get();
            if (enVar != null) {
                enVar.m11860e();
                if (enVar.f11898a && enVar.f11901e.isPlaying()) {
                    sendMessageDelayed(obtainMessage(2), 200);
                }
            }
        }
    }

    public void setVideoAd(C5410k kVar) {
        this.f11899c = kVar;
    }

    /* renamed from: c */
    static /* synthetic */ void m11858c(C5181en enVar) {
        C5410k kVar;
        C5410k kVar2;
        C5184eo eoVar = enVar.f11901e;
        if (eoVar != null) {
            C5031bs bsVar = (C5031bs) eoVar.getTag();
            if (enVar.f11906j) {
                enVar.f11901e.mo40495e();
                enVar.f11906j = false;
                enVar.f11905i.removeView(enVar.f11903g);
                enVar.f11905i.removeView(enVar.f11902f);
                enVar.m11857c();
                if (bsVar != null && (kVar2 = enVar.f11899c) != null) {
                    try {
                        kVar2.mo40844f(bsVar);
                        bsVar.f11472A = true;
                    } catch (Exception e) {
                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                    }
                }
            } else {
                enVar.f11901e.mo40494d();
                enVar.f11906j = true;
                enVar.f11905i.removeView(enVar.f11902f);
                enVar.f11905i.removeView(enVar.f11903g);
                enVar.m11859d();
                if (bsVar != null && (kVar = enVar.f11899c) != null) {
                    try {
                        kVar.mo40843e(bsVar);
                        bsVar.f11472A = false;
                    } catch (Exception e2) {
                        C5275fn.m12068a().mo40590a(new C5308gk(e2));
                    }
                }
            }
        }
    }
}
