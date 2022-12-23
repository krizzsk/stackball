package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1369c;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.n */
public class C1552n implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final int f3776a;

    /* renamed from: b */
    private final float f3777b;

    /* renamed from: c */
    private final SensorManager f3778c;

    /* renamed from: d */
    private final Sensor f3779d;

    /* renamed from: e */
    private final Sensor f3780e = this.f3778c.getDefaultSensor(4);

    /* renamed from: f */
    private final C1469j f3781f;

    /* renamed from: g */
    private float[] f3782g;

    /* renamed from: h */
    private float f3783h;

    public C1552n(C1469j jVar) {
        this.f3781f = jVar;
        SensorManager sensorManager = (SensorManager) jVar.mo13065D().getSystemService("sensor");
        this.f3778c = sensorManager;
        this.f3779d = sensorManager.getDefaultSensor(9);
        this.f3776a = ((Integer) jVar.mo13088a(C1369c.f3112et)).intValue();
        this.f3777b = ((Float) jVar.mo13088a(C1369c.f3111es)).floatValue();
        jVar.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        jVar.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void mo13339a() {
        this.f3778c.unregisterListener(this);
        if (((Boolean) this.f3781f.mo13064C().mo12842a(C1369c.f3109eq)).booleanValue()) {
            this.f3778c.registerListener(this, this.f3779d, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f3776a));
        }
        if (((Boolean) this.f3781f.mo13064C().mo12842a(C1369c.f3110er)).booleanValue()) {
            this.f3778c.registerListener(this, this.f3780e, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f3776a));
        }
    }

    /* renamed from: b */
    public float mo13340b() {
        return this.f3783h;
    }

    /* renamed from: c */
    public float mo13341c() {
        float[] fArr = this.f3782g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos((double) (fArr[2] / 9.81f)));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f3778c.unregisterListener(this);
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo13339a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f3782g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.f3783h * this.f3777b;
            this.f3783h = f;
            this.f3783h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
