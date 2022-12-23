package com.p243my.target;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.my.target.d5 */
public final class C7362d5 extends C7438h5 {

    /* renamed from: a */
    public static final int[] f18450a = C7406f8.m19148a(260, 272, 268, 276, 516, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 532, 528, IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, 512, 264, 256, 280);

    /* renamed from: b */
    public Method f18451b;

    public C7362d5() {
        try {
            this.f18451b = BluetoothDevice.class.getMethod("isConnected", new Class[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static List<String> m18932a(BluetoothAdapter bluetoothAdapter, Method method) {
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice next : bluetoothAdapter.getBondedDevices()) {
                if (Arrays.binarySearch(f18450a, next.getBluetoothClass().getDeviceClass()) < 0) {
                    if (((Boolean) method.invoke(next, new Object[0])).booleanValue()) {
                        String name = next.getName();
                        if (!TextUtils.isEmpty(name)) {
                            arrayList.add(new String(Base64.encode(name.getBytes(), 2), "UTF-8"));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public void collectData(Context context) {
        if (this.f18451b != null) {
            if (!C7438h5.checkPermission("android.permission.BLUETOOTH", context)) {
                removeAll();
                return;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                removeAll();
                return;
            }
            List<String> a = m18932a(defaultAdapter, this.f18451b);
            String str = null;
            if (!a.isEmpty()) {
                str = C7406f8.m19145a(a);
            }
            addParam("bdn", str);
        }
    }
}
