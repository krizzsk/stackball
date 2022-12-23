package com.smaato.sdk.video.network;

import com.smaato.sdk.core.util.Objects;

final class BodyEncodingPair {
    public final String encoding;
    public final byte[] responseBody;

    BodyEncodingPair(byte[] bArr, String str) {
        Objects.requireNonNull(bArr, "Parameter responseBody cannot be null for BodyEncodingPair::new");
        this.responseBody = bArr;
        this.encoding = str;
    }
}
