package com.tapjoy.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.jz */
public final class C9476jz {

    /* renamed from: a */
    static final Logger f23566a = Logger.getLogger(C9476jz.class.getName());

    private C9476jz() {
    }

    /* renamed from: a */
    public static void m25460a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                try {
                    f23566a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    f23566a.log(Level.SEVERE, "IOException should not have been thrown.", e2);
                }
            }
        }
    }
}
