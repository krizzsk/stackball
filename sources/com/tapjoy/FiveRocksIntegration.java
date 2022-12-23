package com.tapjoy;

import com.tapjoy.internal.C9083az;
import com.tapjoy.internal.C9324gl;
import com.tapjoy.internal.C9325gm;
import com.tapjoy.internal.C9327go;
import com.tapjoy.internal.C9344gz;
import com.tapjoy.internal.C9347ha;

public class FiveRocksIntegration {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C9083az f21845a = new C9083az();

    public static void addPlacementCallback(String str, TJPlacement tJPlacement) {
        synchronized (f21845a) {
            f21845a.put(str, tJPlacement);
        }
    }

    /* renamed from: a */
    public static void m24111a() {
        C9344gz a = C9344gz.m25060a();
        if (!a.f23113c) {
            a.f23113c = true;
        }
        C89821 r0 = new C9327go() {
            /* renamed from: a */
            public final void mo57310a(String str) {
            }

            /* renamed from: d */
            public final void mo57315d(String str) {
            }

            /* renamed from: b */
            public final void mo57313b(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f21845a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f21845a.get(str);
                }
                if (tJPlacement != null && tJPlacement.f22060a != null) {
                    tJPlacement.f22060a.onContentReady(tJPlacement);
                }
            }

            /* renamed from: c */
            public final void mo57314c(String str) {
                TJPlacement tJPlacement;
                synchronized (FiveRocksIntegration.f21845a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f21845a.get(str);
                }
                if (tJPlacement != null && tJPlacement.f22060a != null) {
                    tJPlacement.f22060a.onContentShow(tJPlacement);
                }
            }

            /* renamed from: a */
            public final void mo57311a(String str, C9324gl glVar) {
                if (glVar != null) {
                    glVar.mo58215a(m24113e(str));
                }
            }

            /* renamed from: a */
            public final void mo57312a(String str, String str2, C9324gl glVar) {
                TJPlacement tJPlacement;
                if (glVar != null) {
                    glVar.mo58215a(m24113e(str));
                }
                synchronized (FiveRocksIntegration.f21845a) {
                    tJPlacement = (TJPlacement) FiveRocksIntegration.f21845a.get(str);
                }
                if (tJPlacement != null) {
                    TapjoyConnectCore.viewDidClose(str2);
                    if (tJPlacement.f22060a != null) {
                        tJPlacement.f22060a.onContentDismiss(tJPlacement);
                    }
                }
            }

            /* renamed from: e */
            private C9325gm m24113e(final String str) {
                return new C9325gm() {
                    /* renamed from: a */
                    public final void mo57316a(final String str, String str2) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f21845a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f21845a.get(str);
                        }
                        if (tJPlacement != null && tJPlacement.f22060a != null) {
                            tJPlacement.f22060a.onPurchaseRequest(tJPlacement, new TJActionRequest() {
                                public final void cancelled() {
                                }

                                public final void completed() {
                                }

                                public final String getToken() {
                                    return null;
                                }

                                public final String getRequestId() {
                                    return str;
                                }
                            }, str2);
                        }
                    }

                    /* renamed from: a */
                    public final void mo57317a(final String str, String str2, int i, final String str3) {
                        TJPlacement tJPlacement;
                        synchronized (FiveRocksIntegration.f21845a) {
                            tJPlacement = (TJPlacement) FiveRocksIntegration.f21845a.get(str);
                        }
                        if (tJPlacement != null && tJPlacement.f22060a != null) {
                            tJPlacement.f22060a.onRewardRequest(tJPlacement, new TJActionRequest() {
                                public final void cancelled() {
                                }

                                public final void completed() {
                                }

                                public final String getRequestId() {
                                    return str;
                                }

                                public final String getToken() {
                                    return str3;
                                }
                            }, str2, i);
                        }
                    }
                };
            }
        };
        C9344gz.m25060a().f23126p = C9347ha.m25088a((C9327go) r0);
    }
}
