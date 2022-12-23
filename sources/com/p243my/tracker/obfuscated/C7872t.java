package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p243my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.t */
public abstract class C7872t<T> {

    /* renamed from: com.my.tracker.obfuscated.t$a */
    public interface C7873a {
        /* renamed from: a */
        String mo52377a();

        /* renamed from: a */
        void mo52384a(OutputStream outputStream);
    }

    /* renamed from: com.my.tracker.obfuscated.t$b */
    public static final class C7874b<T> {

        /* renamed from: a */
        boolean f20166a;

        /* renamed from: b */
        T f20167b;

        /* renamed from: c */
        String f20168c;

        private C7874b() {
        }

        /* renamed from: c */
        static <T> C7874b<T> m21537c() {
            return new C7874b<>();
        }

        /* renamed from: a */
        public T mo52504a() {
            return this.f20167b;
        }

        /* renamed from: b */
        public boolean mo52505b() {
            return this.f20166a;
        }
    }

    /* renamed from: a */
    public static C7872t<String> m21531a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new C7811f0(okHttpClientProvider);
            } catch (Throwable th) {
                C7877u0.m21548a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C7867r();
    }

    /* renamed from: a */
    public static C7872t<String> m21532a(C7873a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        if (okHttpClientProvider != null) {
            try {
                return new C7813g0(aVar, okHttpClientProvider, z);
            } catch (Throwable th) {
                C7877u0.m21548a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C7870s(aVar, z);
    }

    /* renamed from: a */
    public static boolean m21533a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    /* renamed from: a */
    public abstract C7874b<T> mo52289a(String str);
}
