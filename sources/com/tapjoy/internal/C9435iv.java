package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* renamed from: com.tapjoy.internal.iv */
public final class C9435iv {

    /* renamed from: a */
    static final Logger f23453a = Logger.getLogger(C9435iv.class.getName());

    private C9435iv() {
    }

    /* renamed from: a */
    public static C9433it m25359a(C9445jc jcVar) {
        if (jcVar != null) {
            return new C9439ix(jcVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public static C9432is m25358a(C9444jb jbVar) {
        if (jbVar != null) {
            return new C9438iw(jbVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    public static C9444jb m25360a(final OutputStream outputStream) {
        final C9446jd jdVar = new C9446jd();
        if (outputStream != null) {
            return new C9444jb() {
                /* renamed from: a */
                public final void mo58381a(C9431ir irVar, long j) {
                    C9448je.m25404a(irVar.f23447b, 0, j);
                    while (j > 0) {
                        jdVar.mo58427a();
                        C9440iy iyVar = irVar.f23446a;
                        int min = (int) Math.min(j, (long) (iyVar.f23466c - iyVar.f23465b));
                        outputStream.write(iyVar.f23464a, iyVar.f23465b, min);
                        iyVar.f23465b += min;
                        long j2 = (long) min;
                        j -= j2;
                        irVar.f23447b -= j2;
                        if (iyVar.f23465b == iyVar.f23466c) {
                            irVar.f23446a = iyVar.mo58423a();
                            C9441iz.m25386a(iyVar);
                        }
                    }
                }

                public final void flush() {
                    outputStream.flush();
                }

                public final void close() {
                    outputStream.close();
                }

                public final String toString() {
                    return "sink(" + outputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: a */
    public static C9445jc m25361a(final InputStream inputStream) {
        final C9446jd jdVar = new C9446jd();
        if (inputStream != null) {
            return new C9445jc() {
                /* renamed from: b */
                public final long mo58382b(C9431ir irVar, long j) {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j);
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            jdVar.mo58427a();
                            C9440iy c = irVar.mo58389c(1);
                            int read = inputStream.read(c.f23464a, c.f23466c, (int) Math.min(j, (long) (8192 - c.f23466c)));
                            if (read == -1) {
                                return -1;
                            }
                            c.f23466c += read;
                            long j2 = (long) read;
                            irVar.f23447b += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (C9435iv.m25362a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() {
                    inputStream.close();
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: a */
    static boolean m25362a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
