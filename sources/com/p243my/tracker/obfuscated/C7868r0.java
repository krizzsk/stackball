package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.p243my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.time.DurationKt;

/* renamed from: com.my.tracker.obfuscated.r0 */
public final class C7868r0 {

    /* renamed from: a */
    final AtomicInteger f20152a = new AtomicInteger();

    /* renamed from: b */
    final C7828m f20153b;

    /* renamed from: c */
    final AntiFraudConfig f20154c;

    /* renamed from: d */
    final Context f20155d;

    /* renamed from: e */
    C7869a f20156e;

    /* renamed from: f */
    Runnable f20157f;

    /* renamed from: g */
    Runnable f20158g;

    /* renamed from: h */
    long f20159h = -1;

    /* renamed from: com.my.tracker.obfuscated.r0$a */
    static final class C7869a implements SensorEventListener {

        /* renamed from: a */
        private final C7828m f20160a;

        /* renamed from: b */
        private final SensorManager f20161b;

        /* renamed from: c */
        private final AntiFraudConfig f20162c;

        /* renamed from: d */
        private final ArrayList<Sensor> f20163d = new ArrayList<>();

        C7869a(C7828m mVar, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.f20160a = mVar;
            this.f20161b = sensorManager;
            this.f20162c = antiFraudConfig;
        }

        /* renamed from: a */
        public static C7869a m21525a(C7828m mVar, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new C7869a(mVar, sensorManager, antiFraudConfig);
        }

        /* renamed from: a */
        public void mo52500a() {
            C7877u0.m21547a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i = 0; i < 5; i++) {
                int i2 = iArr[i];
                if (!((i2 == 5 && !this.f20162c.useLightSensor) || (i2 == 2 && !this.f20162c.useMagneticFieldSensor) || ((i2 == 4 && !this.f20162c.useGyroscope) || ((i2 == 6 && !this.f20162c.usePressureSensor) || (i2 == 8 && !this.f20162c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.f20161b.getDefaultSensor(i2);
                        if (defaultSensor != null) {
                            this.f20161b.registerListener(this, defaultSensor, DurationKt.NANOS_IN_MILLIS);
                            this.f20163d.add(defaultSensor);
                        }
                    } catch (Throwable th) {
                        C7877u0.m21547a("SensorEventListenerImpl: exception at register listener: " + th);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo52501b() {
            C7877u0.m21547a("SensorEventListenerImpl: stop()");
            Iterator<Sensor> it = this.f20163d.iterator();
            while (it.hasNext()) {
                try {
                    this.f20161b.unregisterListener(this, it.next());
                } catch (Throwable th) {
                    C7877u0.m21547a("SensorEventListenerImpl: exception at unregister listener: " + th);
                }
            }
            this.f20163d.clear();
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float f;
            StringBuilder sb;
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                C7828m mVar = this.f20160a;
                float[] fArr = sensorEvent.values;
                mVar.mo52367b(fArr[0], fArr[1], fArr[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: magnetometer - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 8) {
                this.f20160a.mo52372c(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: proximity - ");
                f = sensorEvent.values[0];
            } else if (type == 4) {
                C7828m mVar2 = this.f20160a;
                float[] fArr2 = sensorEvent.values;
                mVar2.mo52350a(fArr2[0], fArr2[1], fArr2[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: gyroscope - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 5) {
                this.f20160a.mo52349a(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: light - ");
                f = sensorEvent.values[0];
            } else if (type == 6) {
                this.f20160a.mo52366b(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: pressure - ");
                f = sensorEvent.values[0];
            } else {
                return;
            }
            sb.append(f);
            C7877u0.m21547a(sb.toString());
        }
    }

    C7868r0(C7828m mVar, AntiFraudConfig antiFraudConfig, Context context) {
        this.f20153b = mVar;
        this.f20154c = antiFraudConfig;
        this.f20155d = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C7868r0 m21519a(C7828m mVar, AntiFraudConfig antiFraudConfig, Context context) {
        return new C7868r0(mVar, antiFraudConfig, context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21520a() {
        if (!this.f20152a.compareAndSet(2, 1)) {
            C7877u0.m21547a("SensorHandler: handle isn't running");
            return;
        }
        this.f20156e.mo52501b();
        this.f20153b.mo52348a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21521b() {
        C7806d.m21130a(new Runnable() {
            public final void run() {
                C7868r0.this.m21520a();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21522b(long j) {
        if (!this.f20152a.compareAndSet(1, 2)) {
            C7877u0.m21547a("SensorHandler: handler can't start, current state: " + this.f20152a.get());
        } else if (this.f20156e == null) {
            C7877u0.m21547a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (C7875t0.m21540a() - j > 259200) {
            C7877u0.m21547a(String.format(Locale.ENGLISH, "SensorHandler: more than %d seconds passed since the app was installed", new Object[]{259200}));
        } else {
            this.f20156e.mo52500a();
            C7806d.f19851a.postDelayed(this.f20157f, SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US);
        }
    }

    /* renamed from: a */
    public void mo52498a(long j) {
        if (j <= 0) {
            C7877u0.m21547a("SensorHandler: install timestamp is empty, do nothing");
        } else if (!this.f20152a.compareAndSet(0, 1)) {
            C7877u0.m21547a("SensorHandler: handler has already been initialized");
        } else {
            C7869a a = C7869a.m21525a(this.f20153b, this.f20155d.getApplicationContext(), this.f20154c);
            this.f20156e = a;
            if (a == null) {
                C7877u0.m21547a("SensorHandler: sensor event listener is null");
                return;
            }
            this.f20157f = new Runnable() {
                public final void run() {
                    C7868r0.this.m21521b();
                }
            };
            this.f20158g = new Runnable(j) {
                public final /* synthetic */ long f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7868r0.this.m21522b(this.f$1);
                }
            };
            this.f20159h = j;
            C7877u0.m21547a("SensorHandler: initialized");
            this.f20158g.run();
        }
    }

    /* renamed from: c */
    public void mo52499c() {
        Runnable runnable = this.f20158g;
        if (runnable == null) {
            C7877u0.m21547a("SensorHandler: can't start, startRunnable is null");
        } else {
            C7806d.m21130a(runnable);
        }
    }
}
