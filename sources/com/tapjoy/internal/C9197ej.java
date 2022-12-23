package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tapjoy.internal.ej */
public abstract class C9197ej {

    /* renamed from: c */
    public static final C9197ej f22598c = new C9197ej(C9192eg.VARINT, Boolean.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo57983a(Object obj) {
            return 1;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58010c(((Boolean) obj).booleanValue() ? 1 : 0);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            int d = ekVar.mo58004d();
            if (d == 0) {
                return Boolean.FALSE;
            }
            if (d == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(d)}));
        }
    };

    /* renamed from: d */
    public static final C9197ej f22599d = new C9197ej(C9192eg.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                return C9214el.m24663a(intValue);
            }
            return 10;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                elVar.mo58010c(intValue);
            } else {
                elVar.mo58011c((long) intValue);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return Integer.valueOf(ekVar.mo58004d());
        }
    };

    /* renamed from: e */
    public static final C9197ej f22600e = new C9197ej(C9192eg.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            return C9214el.m24663a(((Integer) obj).intValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58010c(((Integer) obj).intValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return Integer.valueOf(ekVar.mo58004d());
        }
    };

    /* renamed from: f */
    public static final C9197ej f22601f = new C9197ej(C9192eg.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            return C9214el.m24663a(C9214el.m24666b(((Integer) obj).intValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58010c(C9214el.m24666b(((Integer) obj).intValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            int d = ekVar.mo58004d();
            return Integer.valueOf((-(d & 1)) ^ (d >>> 1));
        }
    };

    /* renamed from: g */
    public static final C9197ej f22602g;

    /* renamed from: h */
    public static final C9197ej f22603h;

    /* renamed from: i */
    public static final C9197ej f22604i = new C9197ej(C9192eg.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            return C9214el.m24665a(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58011c(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return Long.valueOf(ekVar.mo58005e());
        }
    };

    /* renamed from: j */
    public static final C9197ej f22605j = new C9197ej(C9192eg.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            return C9214el.m24665a(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58011c(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return Long.valueOf(ekVar.mo58005e());
        }
    };

    /* renamed from: k */
    public static final C9197ej f22606k = new C9197ej(C9192eg.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            return C9214el.m24665a(C9214el.m24667b(((Long) obj).longValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58011c(C9214el.m24667b(((Long) obj).longValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            long e = ekVar.mo58005e();
            return Long.valueOf((-(e & 1)) ^ (e >>> 1));
        }
    };

    /* renamed from: l */
    public static final C9197ej f22607l;

    /* renamed from: m */
    public static final C9197ej f22608m;

    /* renamed from: n */
    public static final C9197ej f22609n = new C9197ej(C9192eg.FIXED32, Float.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo57983a(Object obj) {
            return 4;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58012d(Float.floatToIntBits(((Float) obj).floatValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return Float.valueOf(Float.intBitsToFloat(ekVar.mo58006f()));
        }
    };

    /* renamed from: o */
    public static final C9197ej f22610o = new C9197ej(C9192eg.FIXED64, Double.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo57983a(Object obj) {
            return 8;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58013d(Double.doubleToLongBits(((Double) obj).doubleValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return Double.valueOf(Double.longBitsToDouble(ekVar.mo58007g()));
        }
    };

    /* renamed from: p */
    public static final C9197ej f22611p = new C9197ej(C9192eg.LENGTH_DELIMITED, String.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            int i;
            String str = (String) obj;
            int length = str.length();
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt >= 128) {
                    if (charAt < 2048) {
                        i3 += 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i3 += 3;
                    } else if (charAt <= 56319 && (i = i2 + 1) < length && str.charAt(i) >= 56320 && str.charAt(i) <= 57343) {
                        i3 += 4;
                        i2 = i;
                    }
                    i2++;
                }
                i3++;
                i2++;
            }
            return i3;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.f22626a.mo58385b((String) obj);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return ekVar.f22618a.mo58390c(ekVar.mo58008h());
        }
    };

    /* renamed from: q */
    public static final C9197ej f22612q = new C9197ej(C9192eg.LENGTH_DELIMITED, C9434iu.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo57983a(Object obj) {
            return ((C9434iu) obj).mo58413c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
            elVar.mo58009a((C9434iu) obj);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
            return ekVar.f22618a.mo58386b(ekVar.mo58008h());
        }
    };

    /* renamed from: a */
    final Class f22613a;

    /* renamed from: b */
    C9197ej f22614b;

    /* renamed from: r */
    private final C9192eg f22615r;

    /* renamed from: a */
    public abstract int mo57983a(Object obj);

    /* renamed from: a */
    public abstract Object mo57985a(C9213ek ekVar);

    /* renamed from: a */
    public abstract void mo57986a(C9214el elVar, Object obj);

    public C9197ej(C9192eg egVar, Class cls) {
        this.f22615r = egVar;
        this.f22613a = cls;
    }

    /* renamed from: a */
    public int mo57993a(int i, Object obj) {
        int a = mo57983a(obj);
        if (this.f22615r == C9192eg.LENGTH_DELIMITED) {
            a += C9214el.m24663a(a);
        }
        return a + C9214el.m24663a(C9214el.m24664a(i, C9192eg.VARINT));
    }

    /* renamed from: a */
    public void mo57997a(C9214el elVar, int i, Object obj) {
        elVar.mo58010c(C9214el.m24664a(i, this.f22615r));
        if (this.f22615r == C9192eg.LENGTH_DELIMITED) {
            elVar.mo58010c(mo57983a(obj));
        }
        mo57986a(elVar, obj);
    }

    /* renamed from: a */
    private void m24595a(C9432is isVar, Object obj) {
        C9196ei.m24593a(obj, "value == null");
        C9196ei.m24593a(isVar, "sink == null");
        mo57986a(new C9214el(isVar), obj);
    }

    /* renamed from: b */
    public final byte[] mo57999b(Object obj) {
        C9196ei.m24593a(obj, "value == null");
        C9431ir irVar = new C9431ir();
        try {
            m24595a((C9432is) irVar, obj);
            return irVar.mo58403g();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo57998a(OutputStream outputStream, Object obj) {
        C9196ei.m24593a(obj, "value == null");
        C9196ei.m24593a(outputStream, "stream == null");
        C9432is a = C9435iv.m25358a(C9435iv.m25360a(outputStream));
        m24595a(a, obj);
        a.mo58379a();
    }

    /* renamed from: a */
    public final Object mo57996a(byte[] bArr) {
        C9196ei.m24593a(bArr, "bytes == null");
        C9431ir irVar = new C9431ir();
        if (bArr != null) {
            return m24594a((C9433it) irVar.mo58378a(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final Object mo57995a(InputStream inputStream) {
        C9196ei.m24593a(inputStream, "stream == null");
        return m24594a(C9435iv.m25359a(C9435iv.m25361a(inputStream)));
    }

    /* renamed from: a */
    private Object m24594a(C9433it itVar) {
        C9196ei.m24593a(itVar, "source == null");
        return mo57985a(new C9213ek(itVar));
    }

    /* renamed from: c */
    public static String m24596c(Object obj) {
        return obj.toString();
    }

    static {
        C919910 r0 = new C9197ej(C9192eg.FIXED32, Integer.class) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo57983a(Object obj) {
                return 4;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
                elVar.mo58012d(((Integer) obj).intValue());
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
                return Integer.valueOf(ekVar.mo58006f());
            }
        };
        f22602g = r0;
        f22603h = r0;
        C920314 r02 = new C9197ej(C9192eg.FIXED64, Long.class) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo57983a(Object obj) {
                return 8;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
                elVar.mo58013d(((Long) obj).longValue());
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
                return Long.valueOf(ekVar.mo58007g());
            }
        };
        f22607l = r02;
        f22608m = r02;
    }

    /* renamed from: a */
    public final C9197ej mo57994a() {
        C9197ej ejVar = this.f22614b;
        if (ejVar != null) {
            return ejVar;
        }
        C92086 r0 = new C9197ej(this.f22615r, List.class) {
            /* renamed from: a */
            public final /* synthetic */ int mo57993a(int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += C9197ej.this.mo57993a(i, list.get(i3));
                }
                return i2;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo57997a(C9214el elVar, int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C9197ej.this.mo57997a(elVar, i, list.get(i2));
                }
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
                return Collections.singletonList(C9197ej.this.mo57985a(ekVar));
            }

            /* renamed from: a */
            public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            /* renamed from: a */
            public final /* synthetic */ int mo57983a(Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }
        };
        this.f22614b = r0;
        return r0;
    }

    /* renamed from: com.tapjoy.internal.ej$a */
    public static final class C9212a extends IllegalArgumentException {

        /* renamed from: a */
        public final int f22617a;

        C9212a(int i, Class cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.f22617a = i;
        }
    }
}
