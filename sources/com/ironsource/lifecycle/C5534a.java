package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: com.ironsource.lifecycle.a */
public final class C5534a extends Fragment {

    /* renamed from: a */
    C5535a f12750a;

    /* renamed from: com.ironsource.lifecycle.a$a */
    interface C5535a {
        /* renamed from: a */
        void mo41265a(Activity activity);

        /* renamed from: b */
        void mo41266b(Activity activity);
    }

    /* renamed from: a */
    static C5534a m13188a(Activity activity) {
        return (C5534a) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
    }

    /* renamed from: b */
    static void m13189b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") == null) {
            fragmentManager.beginTransaction().add(new C5534a(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f12750a != null) {
            getActivity();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f12750a = null;
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        C5535a aVar = this.f12750a;
        if (aVar != null) {
            aVar.mo41266b(getActivity());
        }
    }

    public final void onStart() {
        super.onStart();
        C5535a aVar = this.f12750a;
        if (aVar != null) {
            aVar.mo41265a(getActivity());
        }
    }

    public final void onStop() {
        super.onStop();
    }
}
