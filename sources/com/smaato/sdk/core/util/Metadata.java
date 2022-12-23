package com.smaato.sdk.core.util;

import android.os.Bundle;

public final class Metadata {
    private final Bundle args;

    /* synthetic */ Metadata(Bundle bundle, byte b) {
        this(bundle);
    }

    private Metadata(Bundle bundle) {
        this.args = (Bundle) Objects.requireNonNull(bundle);
    }

    public final Integer getInt(String str) {
        int i = this.args.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static class Builder {
        private final Bundle args = new Bundle();

        public Builder putInt(String str, int i) {
            this.args.putInt(str, i);
            return this;
        }

        public Metadata build() {
            return new Metadata(this.args, (byte) 0);
        }
    }
}
