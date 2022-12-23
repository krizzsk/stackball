package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.internal.security.CertificateUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.hf */
/* compiled from: DisplayInfo */
public class C5343hf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12237a = C5343hf.class.getSimpleName();

    /* renamed from: a */
    public static int m12332a(int i) {
        return Math.round(((float) i) * m12333a().f12242c);
    }

    /* renamed from: a */
    public static C5345hg m12333a() {
        Context c = C5314go.m12203c();
        if (c == null) {
            return new C5345hg(0, 0, 2.0f);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density;
        return new C5345hg(Math.round(((float) displayMetrics.widthPixels) / f), Math.round(((float) displayMetrics.heightPixels) / f), f);
    }

    /* renamed from: b */
    public static int m12337b(int i) {
        return Math.round(((float) i) / m12333a().f12242c);
    }

    /* renamed from: b */
    public static byte m12336b() {
        Context c = C5314go.m12203c();
        if (c == null) {
            return 1;
        }
        int rotation = ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = c.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i != 2) {
                return 1;
            }
            return (rotation == 0 || rotation == 1) ? (byte) 3 : 4;
        } else if (rotation == 1 || rotation == 2) {
            return 2;
        } else {
            return 1;
        }
    }

    /* renamed from: c */
    public static Map<String, String> m12338c() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(m12333a().f12242c));
            C5345hg a = m12333a();
            hashMap.put("d-device-screen-size", a.f12240a + "X" + a.f12241b);
            Context c = C5314go.m12203c();
            if (c == null) {
                str = "0x0";
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                str = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
            }
            hashMap.put("d-density-dependent-screen-size", str);
            hashMap.put("d-orientation", String.valueOf(m12336b()));
            hashMap.put("d-textsize", String.valueOf(new TextView(C5314go.m12203c()).getTextSize()));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m12334a(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null) {
            m12335a(context, rootWindowInsets);
        }
    }

    /* renamed from: a */
    public static void m12335a(final Context context, final WindowInsets windowInsets) {
        C5314go.m12195a((Runnable) new Runnable() {
            public final void run() {
                try {
                    String[] split = windowInsets.getSystemGestureInsets().toString().split("Insets");
                    StringBuffer stringBuffer = new StringBuffer();
                    if (split.length > 1) {
                        String[] split2 = split[1].replaceAll("[^0-9,=a-zA-Z]*", "").split(",");
                        stringBuffer.append("{");
                        for (int i = 0; i < split2.length; i++) {
                            String[] split3 = split2[i].split("=");
                            if (split3.length == 2) {
                                stringBuffer.append("\"" + split3[0] + "\"");
                                stringBuffer.append(CertificateUtil.DELIMITER);
                                stringBuffer.append(C5343hf.m12337b(Integer.parseInt(split3[1])));
                                if (i < split2.length - 1) {
                                    stringBuffer.append(", ");
                                }
                            }
                        }
                        stringBuffer.append("}");
                    }
                    if (stringBuffer.length() > 0) {
                        C5307gj.m12157a(context, "gesture_info_store").mo40645a("gesture_margin", stringBuffer.toString());
                    }
                } catch (Exception unused) {
                    String unused2 = C5343hf.f12237a;
                }
            }
        });
    }

    /* renamed from: d */
    public static String m12339d() {
        Context c = C5314go.m12203c();
        if (c == null) {
            return null;
        }
        return C5307gj.m12157a(c, "gesture_info_store").mo40648b("gesture_margin");
    }
}
