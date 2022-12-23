package com.applovin.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1557r;
import java.io.File;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLovinSdkUtils {

    /* renamed from: a */
    private static final Handler f3926a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    private static void m3689a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                ((BitmapDrawable) drawable).getBitmap().recycle();
            }
        }
    }

    public static int dpToPx(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static boolean isTablet(Context context) {
        Point a = C1519g.m3428a(context);
        return Math.min(a.x, a.y) >= dpToPx(context, 600);
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i) {
        return (int) Math.ceil((double) (((float) i) / context.getResources().getDisplayMetrics().density));
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThread(boolean z, Runnable runnable) {
        if (z || !C1557r.m3620b()) {
            f3926a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, f3926a);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (C1557r.m3620b()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void safePopulateImageView(Context context, ImageView imageView, int i, int i2) {
        m3689a(imageView);
        Bitmap a = C1557r.m3580a(context, i, i2);
        if (a != null) {
            imageView.setImageBitmap(a);
        }
    }

    public static void safePopulateImageView(ImageView imageView, Bitmap bitmap) {
        m3689a(imageView);
        if (imageView != null && bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void safePopulateImageView(ImageView imageView, Uri uri, int i) {
        m3689a(imageView);
        Bitmap a = C1557r.m3581a(new File(uri.getPath()), i);
        if (a != null) {
            imageView.setImageBitmap(a);
        }
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return C1521i.m3470a(jSONObject);
    }
}
