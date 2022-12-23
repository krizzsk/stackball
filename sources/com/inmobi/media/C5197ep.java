package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.inmobi.media.ep */
/* compiled from: NativeVideoWrapper */
public class C5197ep extends RelativeLayout {

    /* renamed from: a */
    private static final String f11950a = C5197ep.class.getSimpleName();

    /* renamed from: b */
    private C5184eo f11951b = new C5184eo(getContext());

    /* renamed from: c */
    private ImageView f11952c;

    /* renamed from: d */
    private ProgressBar f11953d;

    public C5197ep(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f11951b, layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.f11952c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f11952c.setVisibility(8);
        addView(this.f11952c, layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f11953d = progressBar;
        progressBar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(this.f11953d, layoutParams2);
        C5181en enVar = new C5181en(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        this.f11951b.setMediaController(enVar);
        addView(enVar, layoutParams3);
    }

    /* renamed from: a */
    public final void mo40533a() {
        RelativeLayout.LayoutParams layoutParams;
        double d;
        double d2;
        C5031bs bsVar = (C5031bs) this.f11951b.getTag();
        if (bsVar != null) {
            try {
                String b = bsVar.mo40205b().mo40359b();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b);
                int intValue = Integer.valueOf(mediaMetadataRetriever.extractMetadata(18)).intValue();
                int intValue2 = Integer.valueOf(mediaMetadataRetriever.extractMetadata(19)).intValue();
                mediaMetadataRetriever.release();
                Point point = bsVar.f11361c.f11384a;
                double d3 = (double) intValue;
                double d4 = (double) intValue2;
                if (((double) C5198eq.m11919c(point.x)) / ((double) C5198eq.m11919c(point.y)) > d3 / d4) {
                    d2 = d3 * ((((double) C5198eq.m11919c(point.y)) * 1.0d) / d4);
                    d = (double) C5198eq.m11919c(point.y);
                } else {
                    d2 = (double) C5198eq.m11919c(point.x);
                    d = d4 * ((((double) C5198eq.m11919c(point.x)) * 1.0d) / d3);
                }
                layoutParams = new RelativeLayout.LayoutParams((int) d2, (int) d);
            } catch (Exception e) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                C5275fn.m12068a().mo40590a(new C5308gk(e));
                layoutParams = layoutParams2;
            }
            layoutParams.addRule(13);
            this.f11951b.setLayoutParams(layoutParams);
        }
    }

    public void setPosterImage(Bitmap bitmap) {
        this.f11952c.setImageBitmap(bitmap);
    }

    public C5184eo getVideoView() {
        return this.f11951b;
    }

    public ImageView getPoster() {
        return this.f11952c;
    }

    public ProgressBar getProgressBar() {
        return this.f11953d;
    }
}
