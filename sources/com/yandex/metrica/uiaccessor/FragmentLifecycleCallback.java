package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.metrica.uiaccessor.C12063a;
import java.lang.ref.WeakReference;

public class FragmentLifecycleCallback extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a */
    private final C12063a.C12064a f29007a;

    /* renamed from: b */
    private final WeakReference<Activity> f29008b;

    public FragmentLifecycleCallback(C12063a.C12064a aVar, Activity activity) {
        this.f29007a = aVar;
        this.f29008b = new WeakReference<>(activity);
    }

    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        Activity activity = (Activity) this.f29008b.get();
        if (activity != null) {
            this.f29007a.fragmentAttached(activity);
        }
    }
}
