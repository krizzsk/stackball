package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.y0 */
public class C11966y0 {

    /* renamed from: a */
    private boolean f28748a;

    /* renamed from: b */
    private DeferredDeeplinkListener f28749b;

    /* renamed from: c */
    private DeferredDeeplinkParametersListener f28750c;

    /* renamed from: d */
    private C11927x0 f28751d;

    /* renamed from: com.yandex.metrica.impl.ob.y0$a */
    enum C11967a {
        NOT_A_FIRST_LAUNCH,
        PARSE_ERROR,
        NO_REFERRER
    }

    public C11966y0(boolean z) {
        this.f28748a = z;
    }

    /* renamed from: a */
    public void mo64116a(C11927x0 x0Var) {
        this.f28751d = x0Var;
        m30872a();
    }

    /* renamed from: a */
    private void m30873a(C11967a aVar) {
        DeferredDeeplinkListener.Error error;
        C11927x0 x0Var = this.f28751d;
        String str = x0Var == null ? null : x0Var.f28689c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f28749b;
        if (deferredDeeplinkListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkListener.Error.NO_REFERRER;
            }
            deferredDeeplinkListener.onError(error, str == null ? "" : str);
            this.f28749b = null;
        }
        m30874a(aVar, str);
    }

    /* renamed from: a */
    public void mo64115a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f28750c = deferredDeeplinkParametersListener;
        if (this.f28748a) {
            m30873a(C11967a.NOT_A_FIRST_LAUNCH);
        } else {
            m30872a();
        }
    }

    /* renamed from: a */
    public void mo64114a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f28749b = deferredDeeplinkListener;
        if (this.f28748a) {
            m30873a(C11967a.NOT_A_FIRST_LAUNCH);
        } else {
            m30872a();
        }
    }

    /* renamed from: a */
    private void m30872a() {
        C11927x0 x0Var = this.f28751d;
        if (x0Var != null) {
            String str = x0Var.f28688b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f28749b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f28749b = null;
                }
                if (!C10796U2.m27897b((Map) this.f28751d.f28687a)) {
                    Map<String, String> map = this.f28751d.f28687a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f28750c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f28750c = null;
                        return;
                    }
                    return;
                }
                m30874a(C11967a.PARSE_ERROR, this.f28751d.f28689c);
            } else if (x0Var.f28689c != null) {
                m30873a(C11967a.PARSE_ERROR);
            } else {
                m30873a(C11967a.NO_REFERRER);
            }
        }
    }

    /* renamed from: a */
    private void m30874a(C11967a aVar, String str) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f28750c;
        if (deferredDeeplinkParametersListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkParametersListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            }
            if (str == null) {
                str = "";
            }
            deferredDeeplinkParametersListener.onError(error, str);
            this.f28750c = null;
        }
    }
}
