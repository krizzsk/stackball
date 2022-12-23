package com.chartboost.sdk.Libraries;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.chartboost.sdk.C1887f;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Libraries.i */
public class C1830i {

    /* renamed from: a */
    private C1831a f4397a;

    /* renamed from: b */
    private final C1887f f4398b;

    /* renamed from: c */
    private float f4399c = 1.0f;

    /* renamed from: com.chartboost.sdk.Libraries.i$a */
    public static class C1831a {

        /* renamed from: a */
        private int f4400a;

        /* renamed from: b */
        private final String f4401b;

        /* renamed from: c */
        private final File f4402c;

        /* renamed from: d */
        private Bitmap f4403d;

        /* renamed from: e */
        private final C1828g f4404e;

        /* renamed from: f */
        private int f4405f = -1;

        /* renamed from: g */
        private int f4406g = -1;

        public C1831a(String str, File file, C1828g gVar) {
            this.f4402c = file;
            this.f4401b = str;
            this.f4403d = null;
            this.f4400a = 1;
            this.f4404e = gVar;
        }

        /* renamed from: b */
        private void m4057b() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(this.f4402c.getAbsolutePath(), options);
                this.f4405f = options.outWidth;
                this.f4406g = options.outHeight;
            } catch (Exception e) {
                CBLogging.m3992a("MemoryBitmap", "Error decoding file size", e);
            }
        }

        /* renamed from: a */
        public void mo14249a() {
            if (this.f4403d == null) {
                CBLogging.m3991a("MemoryBitmap", "Loading image '" + this.f4401b + "' from cache");
                byte[] b = this.f4404e.mo14238b(this.f4402c);
                if (b == null) {
                    CBLogging.m3993b("MemoryBitmap", "decode() - bitmap not found");
                    return;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(b, 0, b.length, options);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inDither = false;
                options2.inPurgeable = true;
                options2.inInputShareable = true;
                options2.inTempStorage = new byte[32768];
                options2.inSampleSize = 1;
                while (true) {
                    if (options2.inSampleSize >= 32) {
                        break;
                    }
                    try {
                        this.f4403d = BitmapFactory.decodeByteArray(b, 0, b.length, options2);
                        break;
                    } catch (OutOfMemoryError e) {
                        CBLogging.m3992a("MemoryBitmap", "OutOfMemoryError suppressed - trying larger sample size", e);
                        options2.inSampleSize *= 2;
                    } catch (Exception e2) {
                        CBLogging.m3992a("MemoryBitmap", "Exception raised decoding bitmap", e2);
                    }
                }
                this.f4400a = options2.inSampleSize;
            }
            return;
            if (this.f4403d == null) {
                this.f4402c.delete();
                throw new RuntimeException("Unable to decode " + this.f4401b);
            }
            this.f4400a = options2.inSampleSize;
        }

        /* renamed from: c */
        public Bitmap mo14250c() {
            if (this.f4403d == null) {
                mo14249a();
            }
            return this.f4403d;
        }

        /* renamed from: d */
        public int mo14251d() {
            Bitmap bitmap = this.f4403d;
            if (bitmap != null) {
                return bitmap.getHeight();
            }
            int i = this.f4406g;
            if (i >= 0) {
                return i;
            }
            m4057b();
            return this.f4406g;
        }

        /* renamed from: e */
        public int mo14252e() {
            Bitmap bitmap = this.f4403d;
            if (bitmap != null) {
                return bitmap.getWidth();
            }
            int i = this.f4405f;
            if (i >= 0) {
                return i;
            }
            m4057b();
            return this.f4405f;
        }

        /* renamed from: f */
        public int mo14253f() {
            return this.f4400a;
        }
    }

    public C1830i(C1887f fVar) {
        this.f4398b = fVar;
    }

    /* renamed from: a */
    public boolean mo14243a(String str) {
        return mo14244a(this.f4398b.mo14528e(), str);
    }

    /* renamed from: b */
    public Bitmap mo14245b() {
        C1831a aVar = this.f4397a;
        if (aVar != null) {
            return aVar.mo14250c();
        }
        return null;
    }

    /* renamed from: c */
    public int mo14246c() {
        return this.f4397a.mo14251d() * this.f4397a.mo14253f();
    }

    /* renamed from: d */
    public int mo14247d() {
        return this.f4397a.mo14252e() * this.f4397a.mo14253f();
    }

    /* renamed from: e */
    public boolean mo14248e() {
        return this.f4397a != null;
    }

    /* renamed from: a */
    public boolean mo14244a(JSONObject jSONObject, String str) {
        JSONObject a = C1825e.m4024a(jSONObject, str);
        if (a == null) {
            return true;
        }
        String optString = a.optString("url");
        this.f4399c = (float) a.optDouble("scale", 1.0d);
        if (optString.isEmpty()) {
            return true;
        }
        String optString2 = a.optString(BitLength.CHECKSUM);
        if (optString2.isEmpty()) {
            return false;
        }
        C1831a b = this.f4398b.f4717g.f4458k.mo14348b(optString2);
        this.f4397a = b;
        if (b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public float mo14242a() {
        return this.f4399c;
    }
}
