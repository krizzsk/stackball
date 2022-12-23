package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.im1;

public class zm1 implements im1 {

    /* renamed from: a */
    private y81 f43232a;

    /* renamed from: b */
    private y81 f43233b;

    /* renamed from: c */
    private TextureView f43234c;

    /* renamed from: d */
    private bn1 f43235d;

    /* renamed from: b */
    private void m44724b() {
        if (this.f43235d != null && this.f43234c != null) {
            Matrix matrix = new Matrix();
            matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
            this.f43234c.setTransform(matrix);
        }
    }

    /* renamed from: a */
    public void mo71255a(bn1 bn1) {
        this.f43235d = bn1;
        m44724b();
    }

    public /* synthetic */ void onRenderedFirstFrame() {
        im1.CC.$default$onRenderedFirstFrame(this);
    }

    public void onSurfaceSizeChanged(int i, int i2) {
        this.f43233b = new y81(i, i2);
        m44723a();
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        if (f > 0.0f) {
            i = Math.round(((float) i) * f);
        }
        this.f43232a = new y81(i, i2);
        m44723a();
    }

    /* renamed from: a */
    public void mo71254a(TextureView textureView) {
        this.f43234c = textureView;
        m44724b();
    }

    /* renamed from: a */
    private void m44723a() {
        y81 y81;
        bn1 bn1;
        Matrix a;
        y81 y812 = this.f43232a;
        if (y812 != null && (y81 = this.f43233b) != null && (bn1 = this.f43235d) != null && this.f43234c != null && (a = new an1(y81, y812).mo65828a(bn1)) != null) {
            this.f43234c.setTransform(a);
        }
    }
}
