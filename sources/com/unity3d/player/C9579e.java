package com.unity3d.player;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.unity3d.player.e */
public final class C9579e extends Fragment {

    /* renamed from: a */
    private final IPermissionRequestCallbacks f23858a;

    /* renamed from: b */
    private final Activity f23859b;

    /* renamed from: c */
    private final Looper f23860c;

    /* renamed from: com.unity3d.player.e$a */
    class C9580a implements Runnable {

        /* renamed from: b */
        private IPermissionRequestCallbacks f23862b;

        /* renamed from: c */
        private String f23863c;

        /* renamed from: d */
        private int f23864d;

        /* renamed from: e */
        private boolean f23865e;

        C9580a(IPermissionRequestCallbacks iPermissionRequestCallbacks, String str, int i, boolean z) {
            this.f23862b = iPermissionRequestCallbacks;
            this.f23863c = str;
            this.f23864d = i;
            this.f23865e = z;
        }

        public final void run() {
            int i = this.f23864d;
            if (i == -1) {
                if (this.f23865e) {
                    this.f23862b.onPermissionDenied(this.f23863c);
                } else {
                    this.f23862b.onPermissionDeniedAndDontAskAgain(this.f23863c);
                }
            } else if (i == 0) {
                this.f23862b.onPermissionGranted(this.f23863c);
            }
        }
    }

    public C9579e() {
        this.f23858a = null;
        this.f23859b = null;
        this.f23860c = null;
    }

    public C9579e(Activity activity, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.f23858a = iPermissionRequestCallbacks;
        this.f23859b = activity;
        this.f23860c = Looper.myLooper();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 96489) {
            if (strArr.length == 0) {
                requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
                return;
            }
            int i2 = 0;
            while (i2 < strArr.length && i2 < iArr.length) {
                if (!(this.f23858a == null || this.f23859b == null || this.f23860c == null)) {
                    String str = strArr[i2] == null ? "<null>" : strArr[i2];
                    new Handler(this.f23860c).post(new C9580a(this.f23858a, str, iArr[i2], this.f23859b.shouldShowRequestPermissionRationale(str)));
                }
                i2++;
            }
            FragmentTransaction beginTransaction = getActivity().getFragmentManager().beginTransaction();
            beginTransaction.remove(this);
            beginTransaction.commit();
        }
    }
}
