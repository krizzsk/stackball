package com.smaato.sdk.core.gdpr.tcfv2.encoder.field;

public enum VectorEncodingType {
    FIELD(0),
    RANGE(1);
    
    private int type;

    private VectorEncodingType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
