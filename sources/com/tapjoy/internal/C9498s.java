package com.tapjoy.internal;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.net.ContentHandler;
import java.net.URLConnection;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.s */
public final class C9498s extends ContentHandler {

    /* renamed from: a */
    public static final C9498s f23602a = new C9498s();

    @Nullable
    public final /* synthetic */ Object getContent(URLConnection uRLConnection) {
        return m25535a(uRLConnection);
    }

    private C9498s() {
    }

    @Nullable
    /* renamed from: a */
    private static Bitmap m25535a(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            return C9499t.f23603a.mo57832b(inputStream);
        } finally {
            inputStream.close();
        }
    }

    @Nullable
    /* renamed from: a */
    public static Bitmap m25534a(InputStream inputStream) {
        try {
            return C9499t.f23603a.mo57832b(inputStream);
        } finally {
            inputStream.close();
        }
    }
}
