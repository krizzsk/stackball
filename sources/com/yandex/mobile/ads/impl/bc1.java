package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;

public interface bc1 {

    /* renamed from: a */
    public static final bc1 f31292a = new C12582a();

    /* renamed from: com.yandex.mobile.ads.impl.bc1$a */
    class C12582a implements bc1 {
        C12582a() {
        }

        /* renamed from: a */
        public zb1 mo66040a(Format format) {
            String str = format.f29530j;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = 10;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new o20(format.f29532l);
                    case 1:
                        return new dz0();
                    case 2:
                        return new qo0();
                    case 3:
                        return new kq1();
                    case 4:
                        return new ag1(format.f29532l);
                    case 5:
                        return new ab1(format.f29532l);
                    case 6:
                    case 7:
                        return new C13972me(str, format.f29519C);
                    case 8:
                        return new C14180oe(format.f29519C);
                    case 9:
                        return new wb1();
                    case 10:
                        return new vf1();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }
}
