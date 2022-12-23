package com.tapjoy.internal;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompatExtras;
import com.tapjoy.internal.C9452ji;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.tapjoy.internal.jk */
final class C9458jk {

    /* renamed from: a */
    private static final Object f23543a = new Object();

    /* renamed from: b */
    private static Field f23544b;

    /* renamed from: c */
    private static boolean f23545c;

    /* renamed from: d */
    private static final Object f23546d = new Object();

    /* renamed from: a */
    public static SparseArray m25441a(List list) {
        int size = list.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m25440a(Notification notification) {
        synchronized (f23543a) {
            if (f23545c) {
                return null;
            }
            try {
                if (f23544b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(NotificationCompatJellybean.TAG, "Notification.extras field is not of type Bundle");
                        f23545c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f23544b = declaredField;
                }
                Bundle bundle = (Bundle) f23544b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f23544b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e);
                f23545c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e2);
                f23545c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Bundle[] m25442a(C9459jl[] jlVarArr) {
        if (jlVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jlVarArr.length];
        for (int i = 0; i < jlVarArr.length; i++) {
            C9459jl jlVar = jlVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", jlVar.f23547a);
            bundle.putCharSequence("label", jlVar.f23548b);
            bundle.putCharSequenceArray("choices", jlVar.f23549c);
            bundle.putBoolean("allowFreeFormInput", jlVar.f23550d);
            bundle.putBundle("extras", jlVar.f23551e);
            Set<String> set = jlVar.f23552f;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (String add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* renamed from: a */
    public static Bundle m25439a(Notification.Builder builder, C9452ji.C9453a aVar) {
        builder.addAction(aVar.f23487e, aVar.f23488f, aVar.f23489g);
        Bundle bundle = new Bundle(aVar.f23483a);
        if (aVar.f23484b != null) {
            bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, m25442a(aVar.f23484b));
        }
        if (aVar.f23485c != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m25442a(aVar.f23485c));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f23486d);
        return bundle;
    }
}
