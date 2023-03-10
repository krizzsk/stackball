package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ViewIndexingTrigger implements SensorEventListener {
    private static final double SHAKE_THRESHOLD_GRAVITY = 2.299999952316284d;
    private OnShakeListener mListener;

    public interface OnShakeListener {
        void onShake();
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
        }
    }

    ViewIndexingTrigger() {
    }

    public void setOnShakeListener(OnShakeListener onShakeListener) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.mListener = onShakeListener;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (this.mListener != null) {
                    float f = sensorEvent.values[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (sensorEvent.values[1] / 9.80665f);
                    double d3 = (double) (sensorEvent.values[2] / 9.80665f);
                    if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > SHAKE_THRESHOLD_GRAVITY) {
                        this.mListener.onShake();
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
