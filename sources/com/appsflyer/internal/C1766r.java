package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.r */
public final class C1766r implements SensorEventListener {

    /* renamed from: ı */
    final long[] f4224 = new long[2];

    /* renamed from: ǃ */
    double f4225;

    /* renamed from: ɩ */
    private final int f4226;

    /* renamed from: ɹ */
    private final int f4227;

    /* renamed from: Ι */
    final float[][] f4228 = new float[2][];

    /* renamed from: ι */
    long f4229;

    /* renamed from: І */
    private final String f4230;

    /* renamed from: і */
    private final String f4231;

    /* renamed from: Ӏ */
    private final Executor f4232;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C1766r(Sensor sensor, Executor executor) {
        this.f4232 = executor;
        this.f4226 = sensor.getType();
        String name = sensor.getName();
        String str = "";
        this.f4231 = name == null ? str : name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.f4230 = str;
        this.f4227 = ((((this.f4226 + 31) * 31) + this.f4231.hashCode()) * 31) + str.hashCode();
    }

    /* renamed from: ι */
    static double m3893(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: ı */
    public static boolean m3890(Sensor sensor) {
        return (sensor == null || sensor.getName() == null || sensor.getVendor() == null) ? false : true;
    }

    /* renamed from: ι */
    private static List<Float> m3894(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.f4232.execute(new Runnable() {
            public final void run() {
                SensorEvent sensorEvent = sensorEvent;
                if (sensorEvent != null && sensorEvent.values != null && C1766r.m3890(sensorEvent.sensor)) {
                    C1766r rVar = C1766r.this;
                    int type = sensorEvent.sensor.getType();
                    String name = sensorEvent.sensor.getName();
                    String vendor = sensorEvent.sensor.getVendor();
                    long j = sensorEvent.timestamp;
                    float[] fArr = sensorEvent.values;
                    if (rVar.mo14099(type, name, vendor)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        float[] fArr2 = rVar.f4228[0];
                        if (fArr2 == null) {
                            rVar.f4228[0] = Arrays.copyOf(fArr, fArr.length);
                            rVar.f4224[0] = currentTimeMillis;
                            return;
                        }
                        float[] fArr3 = rVar.f4228[1];
                        if (fArr3 == null) {
                            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                            rVar.f4228[1] = copyOf;
                            rVar.f4224[1] = currentTimeMillis;
                            rVar.f4225 = C1766r.m3893(fArr2, copyOf);
                        } else if (50000000 <= j - rVar.f4229) {
                            rVar.f4229 = j;
                            if (Arrays.equals(fArr3, fArr)) {
                                rVar.f4224[1] = currentTimeMillis;
                                return;
                            }
                            double r3 = C1766r.m3893(fArr2, fArr);
                            if (r3 > rVar.f4225) {
                                rVar.f4228[1] = Arrays.copyOf(fArr, fArr.length);
                                rVar.f4224[1] = currentTimeMillis;
                                rVar.f4225 = r3;
                            }
                        }
                    }
                }
            }
        });
    }

    /* renamed from: ǃ */
    public final void mo14098(Map<C1766r, Map<String, Object>> map, boolean z) {
        if (m3891()) {
            map.put(this, m3895());
            if (z) {
                int length = this.f4228.length;
                for (int i = 0; i < length; i++) {
                    this.f4228[i] = null;
                }
                int length2 = this.f4224.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f4224[i2] = 0;
                }
                this.f4225 = 0.0d;
                this.f4229 = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m3895());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ */
    public final boolean mo14099(int i, String str, String str2) {
        return this.f4226 == i && this.f4231.equals(str) && this.f4230.equals(str2);
    }

    /* renamed from: ι */
    private Map<String, Object> m3895() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.f4226));
        concurrentHashMap.put("sN", this.f4231);
        concurrentHashMap.put("sV", this.f4230);
        float[] fArr = this.f4228[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", m3894(fArr));
        }
        float[] fArr2 = this.f4228[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", m3894(fArr2));
        }
        return concurrentHashMap;
    }

    /* renamed from: Ι */
    private boolean m3891() {
        return this.f4228[0] != null;
    }

    public final int hashCode() {
        return this.f4227;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1766r)) {
            return false;
        }
        C1766r rVar = (C1766r) obj;
        return mo14099(rVar.f4226, rVar.f4231, rVar.f4230);
    }
}
