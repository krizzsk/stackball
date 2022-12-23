package com.amazon.device.ads;

import android.content.Context;

/* compiled from: AdUtils */
class AdUtils2 {
    private final AdUtilsStatic adUtilsAdapter = new AdUtilsStatic();

    AdUtils2() {
    }

    public boolean checkDefinedActivities(Context context) {
        return this.adUtilsAdapter.checkDefinedActivities(context);
    }

    public void setConnectionMetrics(ConnectionInfo connectionInfo, MetricsCollector metricsCollector) {
        this.adUtilsAdapter.setConnectionMetrics(connectionInfo, metricsCollector);
    }

    public double getViewportInitialScale(double d) {
        return this.adUtilsAdapter.getViewportInitialScale(d);
    }

    public double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
        return this.adUtilsAdapter.calculateScalingMultiplier(i, i2, i3, i4);
    }

    public int pixelToDeviceIndependentPixel(int i) {
        return this.adUtilsAdapter.pixelToDeviceIndependentPixel(i);
    }

    public int deviceIndependentPixelToPixel(int i) {
        return this.adUtilsAdapter.deviceIndependentPixelToPixel(i);
    }

    public float getScalingFactorAsFloat() {
        return this.adUtilsAdapter.getScalingFactorAsFloat();
    }

    /* compiled from: AdUtils */
    private static class AdUtilsStatic {
        private AdUtilsStatic() {
        }

        /* access modifiers changed from: package-private */
        public boolean checkDefinedActivities(Context context) {
            return AdUtils.checkDefinedActivities(context);
        }

        /* access modifiers changed from: package-private */
        public void setConnectionMetrics(ConnectionInfo connectionInfo, MetricsCollector metricsCollector) {
            AdUtils.setConnectionMetrics(connectionInfo, metricsCollector);
        }

        /* access modifiers changed from: package-private */
        public double getViewportInitialScale(double d) {
            return AdUtils.getViewportInitialScale(d);
        }

        /* access modifiers changed from: package-private */
        public double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
            return AdUtils.calculateScalingMultiplier(i, i2, i3, i4);
        }

        /* access modifiers changed from: package-private */
        public int pixelToDeviceIndependentPixel(int i) {
            return AdUtils.pixelToDeviceIndependentPixel(i);
        }

        /* access modifiers changed from: package-private */
        public int deviceIndependentPixelToPixel(int i) {
            return AdUtils.deviceIndependentPixelToPixel(i);
        }

        /* access modifiers changed from: package-private */
        public float getScalingFactorAsFloat() {
            return AdUtils.getScalingFactorAsFloat();
        }
    }
}
