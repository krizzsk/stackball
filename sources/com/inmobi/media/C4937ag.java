package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5435p;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ag */
/* compiled from: UnifiedAdManager */
public abstract class C4937ag extends C5435p.C5453a {

    /* renamed from: a */
    public static final String f11159a = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ";

    /* renamed from: b */
    public static final String f11160b = "Ad show is already called. Please wait for the the ad to be shown.";

    /* renamed from: c */
    public static final String f11161c = "preload() and load() cannot be called on the same instance, please use a different instance.";

    /* renamed from: d */
    public static final String f11162d = "Please make an ad request first in order to start loading the ad.";

    /* renamed from: e */
    public static final String f11163e = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ";

    /* renamed from: k */
    private static final String f11164k = C4937ag.class.getSimpleName();

    /* renamed from: f */
    byte f11165f = 0;

    /* renamed from: g */
    Boolean f11166g = null;

    /* renamed from: h */
    PublisherCallbacks f11167h;

    /* renamed from: i */
    final Handler f11168i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    AdMetaInfo f11169j;

    /* renamed from: m */
    public abstract C5435p mo39975m();

    C4937ag() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo40015c(final C5435p pVar, final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f11165f = 3;
        this.f11168i.post(new Runnable() {
            public final void run() {
                C5435p pVar = pVar;
                if (pVar != null) {
                    pVar.mo40997e((byte) 1);
                }
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onAdLoadFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo39966a(AdMetaInfo adMetaInfo) {
        this.f11165f = 7;
    }

    /* renamed from: a */
    public void mo39999a(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f11165f = 3;
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onAdFetchFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo40007b() {
        byte b = this.f11165f;
        if (b != 4 && b != 5) {
            this.f11168i.post(new Runnable() {
                public final void run() {
                    if (C4937ag.this.f11167h != null) {
                        C4937ag.this.f11167h.onAdWillDisplay();
                    }
                }
            });
            this.f11165f = 4;
        }
    }

    /* renamed from: c */
    public void mo40014c(final AdMetaInfo adMetaInfo) {
        if (this.f11165f != 5) {
            this.f11169j = adMetaInfo;
            this.f11168i.post(new Runnable() {
                public final void run() {
                    if (C4937ag.this.f11167h != null) {
                        C4937ag.this.f11167h.onAdDisplayed(adMetaInfo);
                    }
                }
            });
            this.f11165f = 5;
        }
    }

    /* renamed from: a */
    public void mo40000a(C5435p pVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!mo40016c(inMobiAdRequestStatus) || pVar == null) {
            mo40015c(pVar, inMobiAdRequestStatus);
        } else {
            pVar.mo40975a(inMobiAdRequestStatus);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo40016c(InMobiAdRequestStatus inMobiAdRequestStatus) {
        return inMobiAdRequestStatus == null || InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR == inMobiAdRequestStatus.getStatusCode() || InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE == inMobiAdRequestStatus.getStatusCode();
    }

    /* renamed from: a */
    public void mo40002a(final Map<Object, Object> map) {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onAdClicked(map);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo40009b(PublisherCallbacks publisherCallbacks) {
        C5435p m = mo39975m();
        if (m != null) {
            this.f11167h = publisherCallbacks;
            m.mo40951C();
        }
    }

    /* renamed from: a */
    public final void mo40001a(C5435p pVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            pVar.mo39949T();
        } else {
            pVar.mo40955G();
        }
        mo40011b(pVar, z, inMobiAdRequestStatus);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40011b(C5435p pVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!z) {
            mo40015c(pVar, inMobiAdRequestStatus);
        }
    }

    /* renamed from: C */
    public String mo39997C() {
        AdMetaInfo adMetaInfo = this.f11169j;
        return adMetaInfo == null ? "" : adMetaInfo.getCreativeID();
    }

    /* renamed from: a */
    public void mo40004a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        Boolean bool = this.f11166g;
        if (bool == null || !bool.booleanValue()) {
            this.f11166g = Boolean.FALSE;
            this.f11165f = 1;
            C5435p m = mo39975m();
            if (m != null) {
                this.f11167h = publisherCallbacks;
                m.mo40986a(bArr);
                return;
            }
            return;
        }
        C5327gw.m12263a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
    }

    /* renamed from: D */
    public JSONObject mo39998D() {
        AdMetaInfo adMetaInfo = this.f11169j;
        return adMetaInfo == null ? new JSONObject() : adMetaInfo.getBidInfo();
    }

    /* renamed from: b */
    public void mo39969b(AdMetaInfo adMetaInfo) {
        this.f11169j = adMetaInfo;
        C5435p m = mo39975m();
        if (m != null) {
            m.mo40997e((byte) 1);
        }
    }

    /* renamed from: b */
    public void mo40010b(C5435p pVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        mo40015c(pVar, inMobiAdRequestStatus);
    }

    /* renamed from: d */
    public void mo40017d() {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onUserLeftApplication();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo40012b(final Map<Object, Object> map) {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onRewardsUnlocked(map);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo40003a(final byte[] bArr) {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onRequestPayloadCreated(bArr);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo40008b(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40006a(String str, String str2, PublisherCallbacks publisherCallbacks) {
        PublisherCallbacks publisherCallbacks2 = this.f11167h;
        if (publisherCallbacks2 == null || publisherCallbacks == null || publisherCallbacks2.getType() == publisherCallbacks.getType()) {
            byte b = this.f11165f;
            if (b != 1) {
                if (b == 5) {
                    C5327gw.m12263a((byte) 1, str, f11159a.concat(String.valueOf(str2)));
                    mo40015c(mo39975m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                    return false;
                } else if (b != 8) {
                    return true;
                }
            }
            C5327gw.m12263a((byte) 1, str, f11163e.concat(String.valueOf(str2)));
            return false;
        }
        C5327gw.m12263a((byte) 1, f11164k, f11161c);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40005a(String str, String str2) throws IllegalStateException {
        byte b = this.f11165f;
        if (b != 1) {
            if (b == 5) {
                C5327gw.m12263a((byte) 1, str, f11159a.concat(String.valueOf(str2)));
                mo40015c(mo39975m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                return false;
            } else if (b == 7) {
                return true;
            } else {
                if (b != 8) {
                    throw new IllegalStateException(f11162d);
                }
            }
        }
        C5327gw.m12263a((byte) 1, str, f11163e.concat(String.valueOf(str2)));
        return false;
    }

    /* renamed from: c */
    public void mo40013c() {
        this.f11168i.post(new Runnable() {
            public final void run() {
                if (C4937ag.this.f11167h != null) {
                    C4937ag.this.f11167h.onAdDismissed();
                }
            }
        });
    }
}
