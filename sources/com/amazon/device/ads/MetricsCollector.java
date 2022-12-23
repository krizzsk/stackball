package com.amazon.device.ads;

import com.amazon.device.ads.Metrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class MetricsCollector {
    private static final String LOGTAG = MetricsCollector.class.getSimpleName();
    private String adTypeMetricTag;
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
    protected Vector<MetricHit> metricHits = new Vector<>(60);

    public Vector<MetricHit> getMetricHits() {
        return this.metricHits;
    }

    public void incrementMetric(Metrics.MetricType metricType) {
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("METRIC Increment " + metricType.toString());
        this.metricHits.add(new MetricHitIncrement(metricType, 1));
    }

    public void setMetricString(Metrics.MetricType metricType, String str) {
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("METRIC Set " + metricType.toString() + ": " + str);
        this.metricHits.add(new MetricHitString(metricType, str));
    }

    public void publishMetricInMilliseconds(Metrics.MetricType metricType, long j) {
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("METRIC Publish " + metricType.toString());
        this.metricHits.add(new MetricHitTotalTime(metricType, j));
    }

    public void publishMetricInMillisecondsFromNanoseconds(Metrics.MetricType metricType, long j) {
        publishMetricInMilliseconds(metricType, NumberUtils.convertToMillisecondsFromNanoseconds(j));
    }

    public void startMetricInMillisecondsFromNanoseconds(Metrics.MetricType metricType, long j) {
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("METRIC Start " + metricType.toString());
        this.metricHits.add(new MetricHitStartTime(metricType, NumberUtils.convertToMillisecondsFromNanoseconds(j)));
    }

    public void startMetric(Metrics.MetricType metricType) {
        startMetricInMillisecondsFromNanoseconds(metricType, System.nanoTime());
    }

    public void stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType metricType, long j) {
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("METRIC Stop " + metricType.toString());
        this.metricHits.add(new MetricHitStopTime(metricType, NumberUtils.convertToMillisecondsFromNanoseconds(j)));
    }

    public void stopMetric(Metrics.MetricType metricType) {
        stopMetricInMillisecondsFromNanoseconds(metricType, System.nanoTime());
    }

    public void setAdTypeMetricTag(String str) {
        this.adTypeMetricTag = str;
    }

    public String getAdTypeMetricTag() {
        return this.adTypeMetricTag;
    }

    static class CompositeMetricsCollector extends MetricsCollector {
        private final ArrayList<MetricsCollector> collectors;

        public CompositeMetricsCollector(ArrayList<MetricsCollector> arrayList) {
            this.collectors = arrayList;
        }

        public void incrementMetric(Metrics.MetricType metricType) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().incrementMetric(metricType);
            }
        }

        public void setMetricString(Metrics.MetricType metricType, String str) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().setMetricString(metricType, str);
            }
        }

        public void publishMetricInMilliseconds(Metrics.MetricType metricType, long j) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().publishMetricInMilliseconds(metricType, j);
            }
        }

        public void publishMetricInMillisecondsFromNanoseconds(Metrics.MetricType metricType, long j) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().publishMetricInMillisecondsFromNanoseconds(metricType, j);
            }
        }

        public void startMetricInMillisecondsFromNanoseconds(Metrics.MetricType metricType, long j) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().startMetricInMillisecondsFromNanoseconds(metricType, j);
            }
        }

        public void startMetric(Metrics.MetricType metricType) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().startMetric(metricType);
            }
        }

        public void stopMetricInMillisecondsFromNanoseconds(Metrics.MetricType metricType, long j) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().stopMetricInMillisecondsFromNanoseconds(metricType, j);
            }
        }

        public void stopMetric(Metrics.MetricType metricType) {
            Iterator<MetricsCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().stopMetric(metricType);
            }
        }
    }

    public boolean isMetricsCollectorEmpty() {
        return this.metricHits.isEmpty();
    }

    static class MetricHit {
        public final Metrics.MetricType metric;

        public MetricHit(Metrics.MetricType metricType) {
            this.metric = metricType;
        }
    }

    static class MetricHitStartTime extends MetricHit {
        public final long startTime;

        public MetricHitStartTime(Metrics.MetricType metricType, long j) {
            super(metricType);
            this.startTime = j;
        }
    }

    static class MetricHitStopTime extends MetricHit {
        public final long stopTime;

        public MetricHitStopTime(Metrics.MetricType metricType, long j) {
            super(metricType);
            this.stopTime = j;
        }
    }

    static class MetricHitTotalTime extends MetricHit {
        public final long totalTime;

        public MetricHitTotalTime(Metrics.MetricType metricType, long j) {
            super(metricType);
            this.totalTime = j;
        }
    }

    static class MetricHitIncrement extends MetricHit {
        public final int increment;

        public MetricHitIncrement(Metrics.MetricType metricType, int i) {
            super(metricType);
            this.increment = i;
        }
    }

    static class MetricHitString extends MetricHit {
        public final String text;

        public MetricHitString(Metrics.MetricType metricType, String str) {
            super(metricType);
            this.text = str;
        }
    }
}
