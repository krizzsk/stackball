package com.amazon.device.ads;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.amazon.device.ads.Metrics;
import java.util.HashSet;

class AdUtils {
    public static final String REQUIRED_ACTIVITY = "com.amazon.device.ads.AdActivity";
    private static AdUtilsExecutor executor = new AdUtilsExecutor();

    private AdUtils() {
    }

    static boolean checkDefinedActivities(Context context) {
        return executor.checkDefinedActivities(context);
    }

    static void setConnectionMetrics(ConnectionInfo connectionInfo, MetricsCollector metricsCollector) {
        executor.setConnectionMetrics(connectionInfo, metricsCollector);
    }

    public static double getViewportInitialScale(double d) {
        return executor.getViewportInitialScale(d);
    }

    public static double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
        return executor.calculateScalingMultiplier(i, i2, i3, i4);
    }

    public static int pixelToDeviceIndependentPixel(int i) {
        return executor.pixelToDeviceIndependentPixel(i);
    }

    public static int deviceIndependentPixelToPixel(int i) {
        return executor.deviceIndependentPixelToPixel(i);
    }

    public static float getScalingFactorAsFloat() {
        return executor.getScalingFactorAsFloat();
    }

    static class AdUtilsExecutor {
        private boolean hasRequiredActivities = false;
        private final HashSet<String> requiredActivities;

        /* access modifiers changed from: package-private */
        public double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
            double d = ((double) i3) / ((double) i);
            double d2 = ((double) i4) / ((double) i2);
            if ((d2 < d || d == 0.0d) && d2 != 0.0d) {
                d = d2;
            }
            if (d == 0.0d) {
                return 1.0d;
            }
            return d;
        }

        AdUtilsExecutor() {
            HashSet<String> hashSet = new HashSet<>();
            this.requiredActivities = hashSet;
            hashSet.add(AdUtils.REQUIRED_ACTIVITY);
        }

        /* access modifiers changed from: package-private */
        public boolean checkDefinedActivities(Context context) {
            if (this.hasRequiredActivities) {
                return true;
            }
            HashSet hashSet = new HashSet();
            try {
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageArchiveInfo(context.getPackageCodePath(), 1).activities) {
                    hashSet.add(activityInfo.name);
                }
                boolean containsAll = hashSet.containsAll(this.requiredActivities);
                this.hasRequiredActivities = containsAll;
                return containsAll;
            } catch (Exception unused) {
                this.hasRequiredActivities = true;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setConnectionMetrics(ConnectionInfo connectionInfo, MetricsCollector metricsCollector) {
            if (connectionInfo != null) {
                if (connectionInfo.isWiFi()) {
                    metricsCollector.incrementMetric(Metrics.MetricType.WIFI_PRESENT);
                } else {
                    metricsCollector.setMetricString(Metrics.MetricType.CONNECTION_TYPE, connectionInfo.getConnectionType());
                }
            }
            DeviceInfo deviceInfo = MobileAdsInfoStore.getInstance().getDeviceInfo();
            if (deviceInfo.getCarrier() != null) {
                metricsCollector.setMetricString(Metrics.MetricType.CARRIER_NAME, deviceInfo.getCarrier());
            }
        }

        /* access modifiers changed from: package-private */
        public double getViewportInitialScale(double d) {
            if (AndroidTargetUtils.isAtLeastAndroidAPI(19)) {
                return 1.0d;
            }
            return d;
        }

        /* access modifiers changed from: package-private */
        public int pixelToDeviceIndependentPixel(int i) {
            return (int) (((float) i) / getScalingFactorAsFloat());
        }

        /* access modifiers changed from: package-private */
        public int deviceIndependentPixelToPixel(int i) {
            return (int) (i == -1 ? (float) i : ((float) i) * getScalingFactorAsFloat());
        }

        /* access modifiers changed from: package-private */
        public float getScalingFactorAsFloat() {
            return MobileAdsInfoStore.getInstance().getDeviceInfo().getScalingFactorAsFloat();
        }
    }
}
