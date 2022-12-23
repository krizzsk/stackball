package com.mbridge.msdk.videocommon;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.videocommon.a */
/* compiled from: TemplateWebviewCache */
public final class C7165a {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C7166a> f17869a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, C7166a> f17870b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, C7166a> f17871c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static ConcurrentHashMap<String, C7166a> f17872d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static ConcurrentHashMap<String, C7166a> f17873e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static ConcurrentHashMap<String, C7166a> f17874f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static ConcurrentHashMap<String, C7166a> f17875g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static ConcurrentHashMap<String, C7166a> f17876h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static ConcurrentHashMap<String, C7166a> f17877i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private static ConcurrentHashMap<String, C7166a> f17878j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a */
    /* compiled from: TemplateWebviewCache */
    public static class C7166a {

        /* renamed from: a */
        private WindVaneWebView f17879a;

        /* renamed from: b */
        private boolean f17880b;

        /* renamed from: a */
        public final WindVaneWebView mo49054a() {
            return this.f17879a;
        }

        /* renamed from: a */
        public final void mo49055a(WindVaneWebView windVaneWebView) {
            this.f17879a = windVaneWebView;
        }

        /* renamed from: a */
        public final void mo49056a(String str) {
            WindVaneWebView windVaneWebView = this.f17879a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        /* renamed from: b */
        public final String mo49058b() {
            WindVaneWebView windVaneWebView = this.f17879a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        /* renamed from: c */
        public final boolean mo49059c() {
            return this.f17880b;
        }

        /* renamed from: a */
        public final void mo49057a(boolean z) {
            this.f17880b = z;
        }
    }

    /* renamed from: a */
    public static C7166a m18055a(String str) {
        if (f17875g.containsKey(str)) {
            return f17875g.get(str);
        }
        if (f17876h.containsKey(str)) {
            return f17876h.get(str);
        }
        if (f17877i.containsKey(str)) {
            return f17877i.get(str);
        }
        if (f17878j.containsKey(str)) {
            return f17878j.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m18059a(String str, C7166a aVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                f17876h.put(str, aVar);
            } else {
                f17875g.put(str, aVar);
            }
        } else if (z2) {
            f17878j.put(str, aVar);
        } else {
            f17877i.put(str, aVar);
        }
    }

    /* renamed from: b */
    public static void m18063b(String str) {
        if (f17875g.containsKey(str)) {
            f17875g.remove(str);
        }
        if (f17877i.containsKey(str)) {
            f17877i.remove(str);
        }
        if (f17876h.containsKey(str)) {
            f17876h.remove(str);
        }
        if (f17878j.containsKey(str)) {
            f17878j.remove(str);
        }
    }

    /* renamed from: a */
    public static void m18056a() {
        f17875g.clear();
        f17876h.clear();
    }

    /* renamed from: b */
    public static void m18060b() {
        f17877i.clear();
        f17878j.clear();
    }

    /* renamed from: c */
    public static void m18064c(String str) {
        for (Map.Entry next : f17875g.entrySet()) {
            if (((String) next.getKey()).contains(str)) {
                f17875g.remove(next.getKey());
            }
        }
    }

    /* renamed from: d */
    public static void m18065d(String str) {
        for (Map.Entry next : f17876h.entrySet()) {
            if (((String) next.getKey()).contains(str)) {
                f17876h.remove(next.getKey());
            }
        }
    }

    /* renamed from: a */
    public static C7166a m18054a(int i, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i != 94) {
                if (i != 287) {
                    if (i != 288) {
                        if (f17869a != null && f17869a.size() > 0) {
                            return f17869a.get(requestIdNotice);
                        }
                    } else if (f17872d != null && f17872d.size() > 0) {
                        return f17872d.get(requestIdNotice);
                    }
                } else if (campaignEx.isBidCampaign()) {
                    if (f17871c != null && f17871c.size() > 0) {
                        return f17871c.get(requestIdNotice);
                    }
                } else if (f17874f != null && f17874f.size() > 0) {
                    return f17874f.get(requestIdNotice);
                }
            } else if (campaignEx.isBidCampaign()) {
                if (f17870b != null && f17870b.size() > 0) {
                    return f17870b.get(requestIdNotice);
                }
            } else if (f17873e != null && f17873e.size() > 0) {
                return f17873e.get(requestIdNotice);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m18061b(int i, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                String requestIdNotice = campaignEx.getRequestIdNotice();
                if (i == 288) {
                    requestIdNotice = campaignEx.getKeyIaUrl();
                }
                if (i != 94) {
                    if (i != 287) {
                        if (i != 288) {
                            if (f17869a != null) {
                                f17869a.remove(requestIdNotice);
                            }
                        } else if (f17872d != null) {
                            f17872d.remove(requestIdNotice);
                        }
                    } else if (campaignEx.isBidCampaign()) {
                        if (f17871c != null) {
                            f17871c.remove(requestIdNotice);
                        }
                    } else if (f17874f != null) {
                        f17874f.remove(requestIdNotice);
                    }
                } else if (campaignEx.isBidCampaign()) {
                    if (f17870b != null) {
                        f17870b.remove(requestIdNotice);
                    }
                } else if (f17873e != null) {
                    f17873e.remove(requestIdNotice);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18057a(int i) {
        if (i != 94) {
            if (i != 287) {
                if (i != 288) {
                    try {
                        if (f17869a != null) {
                            f17869a.clear();
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                } else if (f17872d != null) {
                    f17872d.clear();
                }
            } else if (f17874f != null) {
                f17874f.clear();
            }
        } else if (f17873e != null) {
            f17873e.clear();
        }
    }

    /* renamed from: a */
    public static void m18058a(int i, String str, C7166a aVar) {
        if (i == 94) {
            if (f17870b == null) {
                f17870b = new ConcurrentHashMap<>();
            }
            f17870b.put(str, aVar);
        } else if (i == 287) {
            try {
                if (f17871c == null) {
                    f17871c = new ConcurrentHashMap<>();
                }
                f17871c.put(str, aVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m18062b(int i, String str, C7166a aVar) {
        if (i == 94) {
            if (f17873e == null) {
                f17873e = new ConcurrentHashMap<>();
            }
            f17873e.put(str, aVar);
        } else if (i == 287) {
            if (f17874f == null) {
                f17874f = new ConcurrentHashMap<>();
            }
            f17874f.put(str, aVar);
        } else if (i != 288) {
            try {
                if (f17869a == null) {
                    f17869a = new ConcurrentHashMap<>();
                }
                f17869a.put(str, aVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        } else {
            if (f17872d == null) {
                f17872d = new ConcurrentHashMap<>();
            }
            f17872d.put(str, aVar);
        }
    }
}
