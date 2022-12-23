package com.mbridge.msdk.video.module.p231a.p232a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.signal.C7156f;
import com.mbridge.msdk.video.signal.C7161i;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p237b.C7170c;

/* renamed from: com.mbridge.msdk.video.module.a.a.n */
/* compiled from: VideoViewJSListener */
public final class C7045n extends C7046o {

    /* renamed from: k */
    private IJSFactory f17532k;

    /* renamed from: l */
    private int f17533l;

    /* renamed from: m */
    private boolean f17534m = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7045n(IJSFactory iJSFactory, CampaignEx campaignEx, C7170c cVar, C7180a aVar, String str, String str2, int i, int i2, C7027a aVar2, double d, int i3, boolean z) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, d, i3, z);
        IJSFactory iJSFactory2 = iJSFactory;
        this.f17532k = iJSFactory2;
        this.f17533l = i;
        this.f17534m = i2 == 0;
        if (iJSFactory2 == null) {
            this.f17509a = false;
        }
    }

    /* renamed from: a */
    public final void mo48315a(int i, Object obj) {
        Integer num;
        if (this.f17509a) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        int i3 = 6;
                        if (i != 6) {
                            if (i != 8) {
                                if (i != 114) {
                                    if (i != 116) {
                                        switch (i) {
                                            case 10:
                                                this.f17532k.getJSNotifyProxy().mo48829a(0);
                                                break;
                                            case 11:
                                            case 12:
                                                this.f17532k.getJSVideoModule().videoOperate(3);
                                                if (this.f17510b.getVideo_end_type() != 3) {
                                                    this.f17532k.getJSVideoModule().setVisible(8);
                                                } else {
                                                    this.f17532k.getJSVideoModule().setVisible(0);
                                                }
                                                if (i == 12) {
                                                    i2 = 2;
                                                }
                                                this.f17532k.getJSNotifyProxy().mo48829a(i2);
                                                if (this.f17532k.getJSCommon().mo48820g() == 2) {
                                                    this.f17532k.getJSVideoModule().setVisible(0);
                                                    C7161i jSVideoModule = this.f17532k.getJSVideoModule();
                                                    this.f17532k.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                } else {
                                                    this.f17532k.getJSContainerModule().showEndcard(this.f17510b.getVideo_end_type());
                                                }
                                                this.f17532k.getJSVideoModule().dismissAllAlert();
                                                break;
                                            case 13:
                                                if (!this.f17532k.getJSVideoModule().isH5Canvas()) {
                                                    this.f17532k.getJSVideoModule().closeVideoOperate(0, 2);
                                                }
                                                this.f17532k.getJSNotifyProxy().mo48829a(-1);
                                                break;
                                            case 14:
                                                if (!this.f17534m) {
                                                    this.f17532k.getJSVideoModule().closeVideoOperate(0, 1);
                                                    break;
                                                }
                                                break;
                                            case 15:
                                                if (obj != null && (obj instanceof MBridgeVideoView.C7025a)) {
                                                    this.f17534m = true;
                                                    this.f17532k.getJSNotifyProxy().mo48832a((MBridgeVideoView.C7025a) obj);
                                                    break;
                                                }
                                            default:
                                                switch (i) {
                                                    case 123:
                                                    case 124:
                                                        C7156f jSNotifyProxy = this.f17532k.getJSNotifyProxy();
                                                        if (i == 123) {
                                                            i3 = 7;
                                                        }
                                                        jSNotifyProxy.mo48831a(i3, "");
                                                        break;
                                                    case 125:
                                                        this.f17532k.getJSContainerModule().hideAlertWebview();
                                                        break;
                                                }
                                        }
                                    } else {
                                        C7161i jSVideoModule2 = this.f17532k.getJSVideoModule();
                                        this.f17532k.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                    }
                                } else if (this.f17532k.getJSCommon().mo48820g() == 2) {
                                    C7161i jSVideoModule3 = this.f17532k.getJSVideoModule();
                                    this.f17532k.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                }
                            } else if (!this.f17532k.getJSContainerModule().showAlertWebView()) {
                                this.f17532k.getJSVideoModule().showAlertView();
                            } else {
                                this.f17532k.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f17532k.getJSVideoModule().soundOperate(num.intValue(), -1);
                        C7156f jSNotifyProxy2 = this.f17532k.getJSNotifyProxy();
                        jSNotifyProxy2.mo48831a(5, num + "");
                    }
                }
                this.f17532k.getJSVideoModule().dismissAllAlert();
                if (i == 2) {
                    this.f17532k.getJSNotifyProxy().mo48831a(2, "");
                }
                this.f17532k.getJSVideoModule().videoOperate(3);
                if (this.f17532k.getJSCommon().mo48820g() != 2) {
                    if (this.f17510b.getVideo_end_type() != 3) {
                        this.f17532k.getJSVideoModule().setVisible(8);
                    } else {
                        this.f17532k.getJSVideoModule().setVisible(0);
                    }
                    if (this.f17533l == 2 && !this.f17532k.getJSContainerModule().endCardShowing()) {
                        this.f17532k.getJSContainerModule().showEndcard(this.f17510b.getVideo_end_type());
                        this.f17532k.getJSNotifyProxy().mo48829a(1);
                    }
                }
                i = 16;
                this.f17532k.getJSNotifyProxy().mo48829a(1);
            } else if (!this.f17532k.getJSContainerModule().endCardShowing()) {
                this.f17532k.getJSNotifyProxy().mo48831a(1, "");
            }
        }
        super.mo48315a(i, obj);
    }
}
