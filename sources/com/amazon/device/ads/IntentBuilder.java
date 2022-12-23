package com.amazon.device.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import java.util.TreeMap;

class IntentBuilder {
    private Activity activity;
    private Class<?> clazz;
    private Context context;
    private TreeMap<String, String> extras = new TreeMap<>();

    IntentBuilder() {
    }

    public IntentBuilder withContext(Context context2) {
        this.context = context2;
        return this;
    }

    public IntentBuilder withActivity(Activity activity2) {
        this.activity = activity2;
        return this;
    }

    public IntentBuilder withClass(Class<?> cls) {
        this.clazz = cls;
        return this;
    }

    public IntentBuilder withExtra(String str, String str2) {
        this.extras.put(str, str2);
        return this;
    }

    public boolean fireIntent() {
        try {
            Intent intent = new Intent(this.context, this.clazz);
            for (Map.Entry next : this.extras.entrySet()) {
                intent.putExtra((String) next.getKey(), (String) next.getValue());
            }
            if (this.activity != null) {
                this.activity.startActivity(intent);
                return true;
            }
            if (this.context != null) {
                intent.addFlags(268435456);
                this.context.startActivity(intent);
                return true;
            }
            return false;
        } catch (ActivityNotFoundException unused) {
        }
    }
}
