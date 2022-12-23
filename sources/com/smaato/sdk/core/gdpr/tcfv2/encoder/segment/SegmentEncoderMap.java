package com.smaato.sdk.core.gdpr.tcfv2.encoder.segment;

public final class SegmentEncoderMap {
    private static final SegmentEncoderMap instance = new SegmentEncoderMap();

    private SegmentEncoderMap() {
    }

    public static SegmentEncoderMap getInstance() {
        return instance;
    }

    public final CoreTCEncoder getCore() {
        return CoreTCEncoder.getInstance();
    }

    public final OOBVendorsEncoder getVendorsDisclosed() {
        return OOBVendorsEncoder.getInstance();
    }

    public final OOBVendorsEncoder getVendorsAllowed() {
        return OOBVendorsEncoder.getInstance();
    }

    public final PublisherTCEncoder getPublisherTC() {
        return PublisherTCEncoder.getInstance();
    }
}
