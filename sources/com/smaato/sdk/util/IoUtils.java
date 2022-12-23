package com.smaato.sdk.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class IoUtils {
    private IoUtils() {
    }

    public static Optional<String> consumeToString(InputStream inputStream) {
        if (inputStream != null) {
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                StringBuilder sb = new StringBuilder();
                char[] cArr = new char[4096];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read <= 0) {
                        return Optional.m24104of(sb.toString());
                    }
                    sb.append(cArr, 0, read);
                }
            } catch (IOException unused) {
                return Optional.empty();
            }
        } else {
            throw new NullPointerException("'source' specified as non-null is null");
        }
    }
}
