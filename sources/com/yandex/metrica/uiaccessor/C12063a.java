package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

/* renamed from: com.yandex.metrica.uiaccessor.a */
public class C12063a implements C12065b {

    /* renamed from: a */
    private final C12064a f29009a;

    /* renamed from: b */
    private FragmentManager.FragmentLifecycleCallbacks f29010b;

    /* renamed from: com.yandex.metrica.uiaccessor.a$a */
    public interface C12064a {
        void fragmentAttached(Activity activity);
    }

    public C12063a(C12064a aVar) throws Throwable {
        this.f29009a = aVar;
    }

    public void subscribe(Activity activity) throws Throwable {
        if (activity instanceof FragmentActivity) {
            if (this.f29010b == null) {
                this.f29010b = new FragmentLifecycleCallback(this.f29009a, activity);
            }
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.f29010b);
            supportFragmentManager.registerFragmentLifecycleCallbacks(this.f29010b, true);
        }
    }

    public void unsubscribe(Activity activity) throws Throwable {
        if ((activity instanceof FragmentActivity) && this.f29010b != null) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f29010b);
        }
    }
}
