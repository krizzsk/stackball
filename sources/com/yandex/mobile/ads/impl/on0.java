package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.MimeTypes;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.metadata.id3.C12248a;
import com.yandex.mobile.ads.exo.metadata.scte35.C12259a;

public interface on0 {

    /* renamed from: a */
    public static final on0 f38286a = new C14202a();

    /* renamed from: com.yandex.mobile.ads.impl.on0$a */
    class C14202a implements on0 {
        C14202a() {
        }

        /* renamed from: a */
        public nn0 mo69236a(Format format) {
            String str = format.f29530j;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1348231605:
                        if (str.equals(MimeTypes.APPLICATION_ICY)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return new mc0();
                }
                if (c == 1) {
                    return new C12248a((C12248a.C12249a) null);
                }
                if (c == 2) {
                    return new c40();
                }
                if (c == 3) {
                    return new C12259a();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        /* renamed from: b */
        public boolean mo69237b(Format format) {
            String str = format.f29530j;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || MimeTypes.APPLICATION_ICY.equals(str);
        }
    }

    /* renamed from: a */
    nn0 mo69236a(Format format);

    /* renamed from: b */
    boolean mo69237b(Format format);
}
