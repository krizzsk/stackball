package com.ogury.p244cm;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ogury.core.OguryError;
import com.ogury.p244cm.internal.aabca;
import com.ogury.p244cm.internal.abbbb;
import com.ogury.p244cm.internal.abbbc;
import com.ogury.p244cm.internal.babbc;
import com.ogury.p244cm.internal.babca;
import com.ogury.p244cm.internal.bbabb;
import com.ogury.p244cm.internal.bbabc;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.ConsentActivity */
public class ConsentActivity extends Activity {

    /* renamed from: a */
    public static final aaaaa f20222a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final FrameLayout.LayoutParams f20223b = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: c */
    private HashMap f20224c;

    /* renamed from: com.ogury.cm.ConsentActivity$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        private static int m21621a(int i, int i2) {
            int i3 = i % 1;
            return i3 >= 0 ? i3 : i3 + 1;
        }

        /* renamed from: a */
        public static int m21622a(int i, int i2, int i3) {
            return i >= i2 ? i2 : i2 - m21621a(m21621a(i2, 1) - m21621a(i, 1), 1);
        }

        /* renamed from: a */
        public static /* synthetic */ long m21623a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
            bbabc.m22051b(inputStream, "receiver$0");
            bbabc.m22051b(outputStream, "out");
            byte[] bArr = new byte[8192];
            int read = inputStream.read(bArr);
            long j = 0;
            while (read >= 0) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
                read = inputStream.read(bArr);
            }
            return j;
        }

        /* renamed from: a */
        private static long m21624a(Reader reader, Writer writer, int i) {
            bbabc.m22051b(reader, "receiver$0");
            bbabc.m22051b(writer, "out");
            char[] cArr = new char[8192];
            int read = reader.read(cArr);
            long j = 0;
            while (read >= 0) {
                writer.write(cArr, 0, read);
                j += (long) read;
                read = reader.read(cArr);
            }
            return j;
        }

        /* renamed from: a */
        public static NetworkInfo m21625a(Context context) {
            bbabc.m22051b(context, "receiver$0");
            bbabc.m22051b(context, "receiver$0");
            bbabc.m22051b("android.permission.ACCESS_NETWORK_STATE", "permission");
            if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
                return null;
            }
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                return ((ConnectivityManager) systemService).getActiveNetworkInfo();
            }
            throw new babca("null cannot be cast to non-null type android.net.ConnectivityManager");
        }

        /* renamed from: a */
        public static <A, B> babbc<A, B> m21626a(A a, B b) {
            return new babbc<>(a, b);
        }

        /* renamed from: a */
        public static String m21627a(Reader reader) {
            bbabc.m22051b(reader, "receiver$0");
            StringWriter stringWriter = new StringWriter();
            m21624a(reader, (Writer) stringWriter, 8192);
            String stringWriter2 = stringWriter.toString();
            bbabc.m22048a((Object) stringWriter2, "buffer.toString()");
            return stringWriter2;
        }

        /* renamed from: a */
        public static void m21628a(Closeable closeable) {
            bbabc.m22051b(closeable, "receiver$0");
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public static boolean m21629a(JSONObject jSONObject) {
            bbabc.m22051b(jSONObject, "receiver$0");
            return jSONObject.length() == 0;
        }

        /* renamed from: b */
        public static boolean m21630b(Context context) {
            bbabc.m22051b(context, "receiver$0");
            NetworkInfo a = m21625a(context);
            return a != null && a.isConnected();
        }

        /* renamed from: c */
        public static String m21631c(Context context) {
            PackageInfo packageInfo;
            bbabc.m22051b(context, "receiver$0");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) {
                return null;
            }
            return packageInfo.versionName;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f20224c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f20224c == null) {
            this.f20224c = new HashMap();
        }
        View view = (View) this.f20224c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f20224c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        aabca aabca = aabca.f20358a;
        aabca.m21762a("DISPLAYING");
        aaaac aaaac = aaaac.f20238a;
        if (aaaac.m21651c() != null) {
            Context context = this;
            FrameLayout frameLayout = new FrameLayout(context, (AttributeSet) null);
            frameLayout.setLayoutParams(this.f20223b);
            aaaac aaaac2 = aaaac.f20238a;
            aaaaa b = aaaac.m21650b();
            if (b != null) {
                b.mo52598a(context);
            }
            aaaac aaaac3 = aaaac.f20238a;
            WebView c = aaaac.m21651c();
            if (Build.VERSION.SDK_INT < 16 && c != null) {
                c.setLayerType(1, (Paint) null);
            }
            aaaac aaaac4 = aaaac.f20238a;
            frameLayout.addView(aaaac.m21651c(), this.f20223b);
            aaaac aaaac5 = aaaac.f20238a;
            aaaac.m21642a((WebView) null);
            setContentView(frameLayout);
            return;
        }
        aaaac aaaac6 = aaaac.f20238a;
        abbbb a = aaaac.m21640a();
        if (a != null) {
            a.mo52605a(new OguryError(1003, "Cached webview has been destroyed"));
        }
        abbbc abbbc = abbbc.f20427a;
        abbbc.m21856b("Cached webview has been destroyed");
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        aaaac aaaac = aaaac.f20238a;
        aaaac.m21642a((WebView) null);
        aaaac aaaac2 = aaaac.f20238a;
        aaaac.m21643a((aaaaa) null);
        super.onDestroy();
    }
}
