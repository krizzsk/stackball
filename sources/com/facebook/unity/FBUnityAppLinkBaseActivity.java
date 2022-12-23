package com.facebook.unity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public abstract class FBUnityAppLinkBaseActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Log.v(C2305FB.TAG, "Saving deep link from deep linking activity");
        C2305FB.SetIntent(getIntent());
        Log.v(C2305FB.TAG, "Returning to main activity");
        startActivity(new Intent(this, getMainActivityClass()));
        finish();
    }

    private Class<?> getMainActivityClass() {
        try {
            return Class.forName(getPackageManager().getLaunchIntentForPackage(getPackageName()).getComponent().getClassName());
        } catch (Exception unused) {
            Log.e(C2305FB.TAG, "Unable to find Main Activity Class");
            return null;
        }
    }
}
