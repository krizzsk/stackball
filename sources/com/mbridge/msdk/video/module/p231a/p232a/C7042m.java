package com.mbridge.msdk.video.module.p231a.p232a;

import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.mbridge.msdk.video.module.a.a.m */
/* compiled from: VideoViewDefaultListener */
public final class C7042m extends C7046o {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MBridgeVideoView f17523k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MBridgeContainerView f17524l;

    /* renamed from: m */
    private int f17525m;

    /* renamed from: n */
    private Timer f17526n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f17527o = new Handler();

    /* renamed from: p */
    private boolean f17528p = false;

    /* renamed from: q */
    private int f17529q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7042m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C7170c cVar, C7180a aVar, String str, String str2, int i, int i2, C7027a aVar2, double d, int i3, boolean z) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, d, i3, z);
        MBridgeVideoView mBridgeVideoView2 = mBridgeVideoView;
        MBridgeContainerView mBridgeContainerView2 = mBridgeContainerView;
        this.f17523k = mBridgeVideoView2;
        this.f17524l = mBridgeContainerView2;
        this.f17529q = i;
        this.f17525m = i2;
        if (mBridgeVideoView2 != null) {
            this.f17528p = mBridgeVideoView.getVideoSkipTime() == 0;
        }
        if (mBridgeVideoView2 == null || mBridgeContainerView2 == null) {
            this.f17509a = false;
        }
    }

    /* renamed from: a */
    public final void mo48315a(int i, Object obj) {
        Integer num;
        if (this.f17509a) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                switch (i) {
                                    case 10:
                                        this.f17523k.soundOperate(0, 2);
                                        this.f17523k.progressOperate(0, 2);
                                        break;
                                    case 11:
                                    case 12:
                                        this.f17523k.videoOperate(3);
                                        this.f17523k.dismissAllAlert();
                                        if (this.f17510b.getVideo_end_type() != 3) {
                                            this.f17523k.setVisibility(8);
                                        } else {
                                            this.f17523k.setVisibility(0);
                                        }
                                        this.f17524l.showEndcard(this.f17510b.getVideo_end_type());
                                        break;
                                    case 13:
                                        this.f17523k.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.f17528p) {
                                            this.f17523k.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof MBridgeVideoView.C7025a)) {
                                            MBridgeVideoView.C7025a aVar = (MBridgeVideoView.C7025a) obj;
                                            int videoInteractiveType = this.f17524l.getVideoInteractiveType();
                                            if (videoInteractiveType >= 0 && aVar.f17481a >= videoInteractiveType) {
                                                this.f17524l.showVideoClickView(1);
                                                this.f17523k.soundOperate(0, 1);
                                            }
                                            this.f17528p = aVar.f17483c;
                                            if (this.f17525m >= 0 && aVar.f17481a >= this.f17525m && !this.f17528p) {
                                                this.f17523k.closeVideoOperate(0, 2);
                                                this.f17528p = true;
                                                break;
                                            }
                                        }
                                }
                            } else {
                                MBridgeContainerView mBridgeContainerView = this.f17524l;
                                if (mBridgeContainerView == null) {
                                    MBridgeVideoView mBridgeVideoView = this.f17523k;
                                    if (mBridgeVideoView != null) {
                                        mBridgeVideoView.showAlertView();
                                    }
                                } else if (!mBridgeContainerView.showAlertWebView()) {
                                    MBridgeVideoView mBridgeVideoView2 = this.f17523k;
                                    if (mBridgeVideoView2 != null) {
                                        mBridgeVideoView2.showAlertView();
                                    }
                                } else {
                                    MBridgeVideoView mBridgeVideoView3 = this.f17523k;
                                    if (mBridgeVideoView3 != null) {
                                        mBridgeVideoView3.alertWebViewShowed();
                                    }
                                }
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f17523k.soundOperate(num.intValue(), -1);
                    }
                }
                this.f17523k.dismissAllAlert();
                this.f17523k.videoOperate(3);
                if (this.f17529q != 2 || this.f17524l.endCardShowing()) {
                    i = 16;
                } else {
                    this.f17524l.showEndcard(this.f17510b.getVideo_end_type());
                }
            } else if (!this.f17524l.endCardShowing()) {
                int videoInteractiveType2 = this.f17524l.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f17524l.isLast()) {
                            this.f17524l.showVideoClickView(1);
                            this.f17523k.soundOperate(0, 1);
                            try {
                                m17781i();
                                this.f17526n = new Timer();
                                this.f17526n.schedule(new TimerTask() {
                                    public final void run() {
                                        try {
                                            C7042m.this.f17527o.post(new Runnable() {
                                                public final void run() {
                                                    C7042m.this.f17524l.showVideoClickView(-1);
                                                    C7042m.this.f17523k.soundOperate(0, 2);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            if (MBridgeConstans.DEBUG) {
                                                th.printStackTrace();
                                            }
                                        }
                                    }
                                }, 3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            this.f17524l.showVideoClickView(-1);
                            this.f17523k.soundOperate(0, 2);
                            m17781i();
                        }
                    }
                } else if (this.f17524l.miniCardLoaded()) {
                    this.f17524l.showVideoClickView(2);
                }
            }
        }
        super.mo48315a(i, obj);
    }

    /* renamed from: i */
    private void m17781i() {
        try {
            if (this.f17526n != null) {
                this.f17526n.cancel();
                this.f17526n = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
