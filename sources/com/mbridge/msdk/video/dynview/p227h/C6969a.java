package com.mbridge.msdk.video.dynview.p227h;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;

/* renamed from: com.mbridge.msdk.video.dynview.h.a */
/* compiled from: BlurUtil */
public class C6969a {

    /* renamed from: a */
    private static volatile C6969a f17175a;

    /* renamed from: a */
    public static C6969a m17579a() {
        if (f17175a == null) {
            synchronized (C6969a.class) {
                if (f17175a == null) {
                    f17175a = new C6969a();
                }
            }
        }
        return f17175a;
    }

    /* renamed from: a */
    public final Bitmap mo48487a(Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 17) {
                return m17578a(i);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(C6122a.m15302b().mo42895d());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(18.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m17578a(int i) {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            if (i == 1) {
                bitmap.eraseColor(Color.parseColor("#FF0000"));
            } else {
                bitmap.eraseColor(Color.parseColor("#FFFFFF"));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return bitmap;
    }
}
