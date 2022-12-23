package com.mbridge.msdk.reward.player;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p171f.C6233b;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.reward.p209a.C6738a;
import com.mbridge.msdk.reward.p210b.C6801a;
import com.mbridge.msdk.video.dynview.p221d.C6932a;
import com.mbridge.msdk.video.dynview.p226g.C6963b;
import com.mbridge.msdk.video.dynview.p227h.C6971b;
import com.mbridge.msdk.video.module.p233b.C7047a;
import com.mbridge.msdk.video.p214bt.module.MBTempContainer;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.p214bt.module.p216a.C6912a;
import com.mbridge.msdk.video.p214bt.module.p217b.C6922h;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.videocommon.C7165a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.download.C7184c;
import com.mbridge.msdk.videocommon.download.C7209k;
import com.mbridge.msdk.videocommon.p236a.C7167a;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.util.List;

public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f16791a;

    /* renamed from: b */
    private String f16792b;

    /* renamed from: c */
    private String f16793c;

    /* renamed from: d */
    private C7170c f16794d;

    /* renamed from: e */
    private int f16795e = 2;

    /* renamed from: f */
    private boolean f16796f = false;

    /* renamed from: g */
    private boolean f16797g = false;

    /* renamed from: h */
    private int f16798h;

    /* renamed from: i */
    private int f16799i;

    /* renamed from: j */
    private int f16800j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f16801k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C6922h f16802l;

    /* renamed from: m */
    private C7179c f16803m;

    /* renamed from: n */
    private boolean f16804n = false;

    /* renamed from: o */
    private boolean f16805o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C7180a f16806p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public CampaignEx f16807q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public List<C7180a> f16808r;

    /* renamed from: s */
    private List<CampaignEx> f16809s;

    /* renamed from: t */
    private MBTempContainer f16810t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public MBridgeBTContainer f16811u;

    /* renamed from: v */
    private WindVaneWebView f16812v;

    /* renamed from: w */
    private C6912a f16813w;

    /* renamed from: x */
    private String f16814x;

    /* renamed from: y */
    private String f16815y;

    /* renamed from: z */
    private C6932a f16816z = new C6932a() {
        /* renamed from: a */
        public final void mo47081a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.f16811u != null) {
                    new C6963b().mo48476b((View) MBRewardVideoActivity.this.f16811u, 500);
                }
                C6361q.m16154a("RewardMVVideoAdapter", "offer 被点击： " + campaignEx.getId() + "  " + campaignEx.getAppName());
                CampaignEx unused = MBRewardVideoActivity.this.f16807q = campaignEx;
                if (MBRewardVideoActivity.this.f16808r != null && MBRewardVideoActivity.this.f16808r.size() > 0) {
                    for (C7180a aVar : MBRewardVideoActivity.this.f16808r) {
                        CampaignEx g = aVar.mo49191g();
                        if (g != null && TextUtils.equals(g.getId(), campaignEx.getId()) && TextUtils.equals(g.getRequestId(), campaignEx.getRequestId())) {
                            C7180a unused2 = MBRewardVideoActivity.this.f16806p = aVar;
                        }
                    }
                }
                boolean unused3 = MBRewardVideoActivity.this.f16801k = true;
                MBRewardVideoActivity.this.m17180a();
                return;
            }
            MBRewardVideoActivity.this.m17182a("campaign is null");
        }

        /* renamed from: a */
        public final void mo47080a() {
            if (MBRewardVideoActivity.this.f16811u != null) {
                new C6963b().mo48476b((View) MBRewardVideoActivity.this.f16811u, 500);
            }
            boolean unused = MBRewardVideoActivity.this.f16801k = true;
            MBRewardVideoActivity.this.m17180a();
        }
    };

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        WindVaneWebView windVaneWebView;
        Bundle bundle2 = bundle;
        String str = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        try {
            int findLayout = findLayout("mbridge_more_offer_activity");
            if (findLayout < 0) {
                m17182a("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(findLayout);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(INTENT_UNITID);
            this.f16791a = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                m17182a("data empty error");
                return;
            }
            this.f16802l = C6738a.f16423b.get(this.f16791a);
            this.f16792b = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f16794d = C7170c.m18100b(intent.getStringExtra(INTENT_REWARD));
            this.f16793c = intent.getStringExtra(INTENT_USERID);
            this.f16795e = intent.getIntExtra(INTENT_MUTE, 2);
            this.f16796f = intent.getBooleanExtra(INTENT_ISIV, false);
            C6122a.m15302b().mo42885a(this.f16796f ? 287 : 94);
            this.f16797g = intent.getBooleanExtra(INTENT_ISBID, false);
            this.f16815y = intent.getStringExtra(INTENT_EXTRADATA);
            if (this.f16796f) {
                this.f16798h = intent.getIntExtra(INTENT_IVREWARD_MODETYPE, 0);
                this.f16799i = intent.getIntExtra(INTENT_IVREWARD_VALUETYPE, 0);
                this.f16800j = intent.getIntExtra(INTENT_IVREWARD_VALUE, 0);
            }
            this.jsFactory = new C7158b(this);
            registerJsFactory(this.jsFactory);
            if (this.f16802l == null) {
                m17182a("showRewardListener is null");
                return;
            }
            C7179c cVar = RewardUnitCacheManager.getInstance().get(this.f16792b, this.f16791a);
            this.f16803m = cVar;
            if (cVar == null) {
                C7179c a = C7177b.m18135a().mo49107a(C6122a.m15302b().mo42896e(), this.f16791a);
                this.f16803m = a;
                if (a == null) {
                    this.f16803m = C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f16791a, this.f16796f);
                }
            }
            if (this.f16803m != null) {
                this.f16794d.mo49083a(this.f16803m.mo49142k());
                this.f16794d.mo49084a(this.f16803m.mo49144l());
            }
            if (this.f16794d != null && this.f16794d.mo49085b() <= 0) {
                this.f16794d.mo49083a(1);
            }
            int a2 = C6347k.m16084a(this, "mbridge_reward_activity_open", "anim");
            int a3 = C6347k.m16084a(this, "mbridge_reward_activity_stay", "anim");
            if (a2 > 1 && a3 > 1) {
                overridePendingTransition(a2, a3);
            }
            if (bundle2 != null) {
                this.f16805o = bundle2.getBoolean(SAVE_STATE_KEY_REPORT);
            }
            this.f16808r = C7184c.getInstance().mo49210b(this.f16791a);
            this.f16801k = intent.getBooleanExtra(INTENT_ISBIG_OFFER, false);
            C6361q.m16154a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f16801k);
            if (!this.f16801k) {
                if (this.f16808r != null && this.f16808r.size() > 0) {
                    this.f16806p = this.f16808r.get(0);
                }
                if (this.f16806p != null) {
                    this.f16807q = this.f16806p.mo49191g();
                    this.f16806p.mo49179a(true);
                    this.f16806p.mo49183b(false);
                    if (this.f16807q != null) {
                        C6103b.m15225a((Context) this, this.f16807q.getMaitve(), this.f16807q.getMaitve_src());
                    }
                }
                if (this.f16806p == null || this.f16807q == null || this.f16794d == null) {
                    m17182a("data empty error");
                }
                m17180a();
                return;
            }
            List<CampaignEx> a4 = C7184c.getInstance().mo49204a(this.f16791a);
            this.f16809s = a4;
            this.f16814x = str;
            if (a4 != null && a4.size() > 0) {
                CampaignEx campaignEx = this.f16809s.get(0);
                str = campaignEx.getMof_template_url();
                this.f16814x = campaignEx.getRequestId();
                C6103b.m15225a((Context) this, campaignEx.getMaitve(), campaignEx.getMaitve_src());
            }
            C7165a.C7166a a5 = C7165a.m18055a(this.f16791a + "_" + this.f16814x + "_" + str);
            C7180a aVar = null;
            if (a5 != null) {
                windVaneWebView = a5.mo49054a();
            } else {
                windVaneWebView = null;
            }
            this.f16812v = windVaneWebView;
            if (windVaneWebView == null) {
                if (this.f16806p == null && this.f16808r != null && this.f16808r.size() > 0) {
                    this.f16806p = this.f16808r.get(0);
                }
                if (this.f16806p == null) {
                    C7184c instance = C7184c.getInstance();
                    int i = this.f16796f ? 287 : 94;
                    String str2 = this.f16791a;
                    boolean z = this.f16797g;
                    C7209k c = instance.mo49212c(str2);
                    if (c != null) {
                        aVar = c.mo49245b(i, z);
                    }
                    this.f16806p = aVar;
                }
                if (this.f16806p != null) {
                    this.f16807q = this.f16806p.mo49191g();
                    this.f16806p.mo49179a(true);
                    this.f16806p.mo49183b(false);
                }
                if (this.f16806p == null || this.f16807q == null || this.f16794d == null) {
                    m17182a("data empty error");
                }
                this.f16801k = false;
                try {
                    C6801a.m17157c(this.f16807q, C6122a.m15302b().mo42895d(), "showMoreOffer showBTOld", this.f16791a, this.f16797g, this.f16807q.getRequestId(), this.f16807q.getRequestIdNotice());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (C6366u.m16221f(str)) {
                    CampaignEx campaignEx2 = this.f16809s.get(0);
                    if (!(campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null)) {
                        int b = campaignEx2.getRewardTemplateMode().mo43508b();
                        if (!isFinishing()) {
                            if (b == 1) {
                                setRequestedOrientation(7);
                            } else if (b == 2) {
                                setRequestedOrientation(6);
                            } else if (C6971b.m17585a(this)) {
                                setRequestedOrientation(6);
                            } else {
                                setRequestedOrientation(7);
                            }
                        }
                    }
                    C6361q.m16154a("DynamicViewCampaignResourceDownloader", "展示新业务");
                    List<CampaignEx> a6 = C7167a.m18072a().mo49065a(this.f16809s);
                    if (a6 == null || a6.size() < 2) {
                        m17182a("no available campaign,timeout");
                    } else {
                        m17185b();
                    }
                } else {
                    C6361q.m16154a("DynamicViewCampaignResourceDownloader", "展示老业务");
                    m17180a();
                }
            } else {
                m17185b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            m17182a("onCreate error" + th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17182a(String str) {
        C6361q.m16158d("MBRewardVideoActivity", str);
        C6922h hVar = this.f16802l;
        if (hVar != null) {
            hVar.mo47005a(str);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17180a() {
        int findID = findID("mbridge_temp_container");
        if (findID < 0) {
            m17182a("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(findID);
        this.f16810t = mBTempContainer;
        if (mBTempContainer == null) {
            m17182a("env error");
        }
        List<CampaignEx> list = this.f16809s;
        if (list == null || list.size() <= 0) {
            this.f16810t.setVisibility(0);
        } else if (C6366u.m16221f(this.f16809s.get(0).getMof_template_url())) {
            new C6963b().mo48478c((View) this.f16810t, 500);
        }
        this.f16810t.setActivity(this);
        this.f16810t.setBidCampaign(this.f16797g);
        this.f16810t.setBigOffer(this.f16801k);
        this.f16810t.setCampaign(this.f16807q);
        this.f16810t.setCampaignDownLoadTask(this.f16806p);
        this.f16810t.setIV(this.f16796f);
        this.f16810t.setIVRewardEnable(this.f16798h, this.f16799i, this.f16800j);
        this.f16810t.setMute(this.f16795e);
        this.f16810t.setReward(this.f16794d);
        this.f16810t.setRewardUnitSetting(this.f16803m);
        this.f16810t.setUnitId(this.f16791a);
        this.f16810t.setPlacementId(this.f16792b);
        this.f16810t.setUserId(this.f16793c);
        this.f16810t.setShowRewardListener(this.f16802l);
        this.f16810t.setDeveloperExtraData(this.f16815y);
        this.f16810t.init(this);
        this.f16810t.onCreate();
        C6801a.m17157c(this.f16807q, C6122a.m15302b().mo42895d(), "showBTOld", this.f16791a, this.f16797g, "", "");
    }

    /* renamed from: b */
    private void m17185b() {
        int findID = findID("mbridge_bt_container");
        if (findID < 0) {
            m17182a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.f16811u = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            m17182a("env error");
        }
        this.f16811u.setVisibility(0);
        C6912a c = m17186c();
        this.f16813w = c;
        this.f16811u.setBTContainerCallback(c);
        this.f16811u.setShowRewardVideoListener(this.f16802l);
        this.f16811u.setChoiceOneCallback(this.f16816z);
        this.f16811u.setCampaigns(this.f16809s);
        this.f16811u.setCampaignDownLoadTasks(this.f16808r);
        this.f16811u.setRewardUnitSetting(this.f16803m);
        this.f16811u.setUnitId(this.f16791a);
        this.f16811u.setPlacementId(this.f16792b);
        this.f16811u.setUserId(this.f16793c);
        this.f16811u.setActivity(this);
        this.f16811u.setReward(this.f16794d);
        this.f16811u.setIVRewardEnable(this.f16798h, this.f16799i, this.f16800j);
        this.f16811u.setIV(this.f16796f);
        this.f16811u.setMute(this.f16795e);
        this.f16811u.setJSFactory((C7158b) this.jsFactory);
        this.f16811u.setDeveloperExtraData(this.f16815y);
        this.f16811u.init(this);
        this.f16811u.onCreate();
        List<C7180a> list = this.f16808r;
        if (list != null && list.size() > 0) {
            C6801a.m17157c(this.f16808r.get(0).mo49191g(), C6122a.m15302b().mo42895d(), "showMoreOffer", this.f16791a, this.f16797g, "", "");
        }
    }

    /* renamed from: c */
    private C6912a m17186c() {
        if (this.f16813w == null) {
            this.f16813w = new C6912a() {
                /* renamed from: a */
                public final void mo47082a() {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47003a();
                    }
                }

                /* renamed from: a */
                public final void mo47087a(boolean z, C7170c cVar) {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47008a(z, cVar);
                    }
                }

                /* renamed from: a */
                public final void mo47086a(boolean z, int i) {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47007a(z, i);
                    }
                }

                /* renamed from: a */
                public final void mo47084a(String str) {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47005a(str);
                    }
                }

                /* renamed from: a */
                public final void mo47088a(boolean z, String str, String str2) {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47009a(z, str, str2);
                    }
                }

                /* renamed from: a */
                public final void mo47085a(String str, String str2) {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47006a(str, str2);
                    }
                }

                /* renamed from: b */
                public final void mo47089b(String str, String str2) {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47010b(str, str2);
                    }
                }

                /* renamed from: a */
                public final void mo47083a(int i, String str, String str2) {
                    if (MBRewardVideoActivity.this.f16802l != null) {
                        MBRewardVideoActivity.this.f16802l.mo47004a(i, str, str2);
                    }
                }
            };
        }
        return this.f16813w;
    }

    public void onResume() {
        super.onResume();
        C6233b.m15776a().execute(new Runnable() {
            public final void run() {
                if (MBRewardVideoActivity.this.f16808r != null && MBRewardVideoActivity.this.f16808r.size() > 0) {
                    for (C7180a aVar : MBRewardVideoActivity.this.f16808r) {
                        if (!(aVar == null || aVar.mo49191g() == null)) {
                            C7167a.m18072a().mo49068a(aVar.mo49191g(), MBRewardVideoActivity.this.f16791a);
                        }
                    }
                }
            }
        });
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C7047a.m17791a(this.f16791a);
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f16810t = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f16811u = null;
        }
        C6233b.m15776a().execute(new C6811a(this.f16808r, this.f16791a, this.f16814x));
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
        }
    }

    /* renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$a */
    private static final class C6811a implements Runnable {

        /* renamed from: a */
        private final List<C7180a> f16820a;

        /* renamed from: b */
        private final String f16821b;

        /* renamed from: c */
        private final String f16822c;

        public C6811a(List<C7180a> list, String str, String str2) {
            this.f16820a = list;
            this.f16821b = str;
            this.f16822c = str2;
        }

        public final void run() {
            try {
                if (this.f16820a != null && this.f16820a.size() > 0) {
                    for (C7180a next : this.f16820a) {
                        if (!(next == null || next.mo49191g() == null)) {
                            CampaignEx g = next.mo49191g();
                            String str = g.getRequestId() + g.getId() + g.getVideoUrlEncode();
                            C7209k c = C7184c.getInstance().mo49212c(this.f16821b);
                            if (c != null) {
                                try {
                                    c.mo49247b(str);
                                } catch (Exception unused) {
                                }
                            }
                            if (g != null) {
                                if (g.getRewardTemplateMode() != null) {
                                    if (!TextUtils.isEmpty(g.getRewardTemplateMode().mo43510d())) {
                                        C7165a.m18063b(this.f16821b + "_" + g.getId() + "_" + this.f16822c + "_" + g.getRewardTemplateMode().mo43510d());
                                        C7165a.m18061b(g.getAdType(), g);
                                    }
                                    if (!TextUtils.isEmpty(g.getMof_template_url())) {
                                        C7165a.m18063b(this.f16821b + "_" + this.f16822c + "_" + g.getMof_template_url());
                                    }
                                    C7167a.m18072a().mo49067a(g);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C6361q.m16154a("MBRewardVideoActivity", e.getMessage());
            }
        }
    }

    public void finish() {
        super.finish();
        C6122a.m15302b().mo42885a(0);
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f16810t = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f16811u = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f16805o);
        super.onSaveInstanceState(bundle);
    }

    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        MBTempContainer mBTempContainer = this.f16810t;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f16811u;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public int findID(String str) {
        return C6347k.m16084a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C6347k.m16084a(getApplicationContext(), str, "layout");
    }
}
