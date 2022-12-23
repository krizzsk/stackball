package com.mbridge.msdk.video.dynview.endcard.moffer;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.GmsVersion;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C6241b;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6370y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.video.dynview.endcard.C6939a;
import com.mbridge.msdk.video.dynview.endcard.C6947b;
import com.mbridge.msdk.video.dynview.endcard.C6948c;
import com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter;
import com.mbridge.msdk.video.dynview.endcard.p224a.C6940a;
import com.mbridge.msdk.video.dynview.endcard.p224a.C6942b;
import com.mbridge.msdk.video.dynview.p222e.C6935a;
import com.mbridge.msdk.video.dynview.p222e.C6938b;
import com.mbridge.msdk.video.dynview.p222e.p223a.C6937a;
import com.mbridge.msdk.video.dynview.p226g.C6963b;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.dynview.widget.MBridgeTextView;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class MOfferModel implements NoProGuard {
    private final String AD_NUM = "ad_num";
    private final String API_VERSION = "api_version";
    private final String APP_ID = "app_id";
    private final String CATEGORY = "category";
    private final String COUNTRY_CODE = TapjoyConstants.TJC_DEVICE_COUNTRY_CODE;
    private final String CRT_CID = "crt_cid";
    private final String CRT_RID = "crt_rid";
    private final int DO_ACTION_IMPRESSION = 0;
    private final int DO_ACTION_ONLY_IMPRESSION = 1;

    /* renamed from: E */
    private final String f17109E = "e";
    private final String EC_ID = "ec_id";
    private final String H5_T = "h5_t";
    private final String H5_TYPE = "h5_type";
    private final String HTTP_REQ = "http_req";
    private final String IMEI = ServerParameters.IMEI;
    private final String I_FMD5 = "i_fmd5";

    /* renamed from: K */
    private final String f17110K = CampaignEx.JSON_KEY_AD_K;
    private final String MCC = "mcc";
    private final String MNC = "mnc";
    private final String MOF = "mof";
    private final String MOF_DATA = "mof_data";
    private final String MOF_T = "mof_t";
    private final String MOF_TEST_UID = "mof_testuid";
    private final String MOF_TYPE = "mof_type";
    private final String MOF_UID = "mof_uid";
    private final String MOF_VER = "mof_ver";
    private final String MORE_OFFER_CLICK = "more offer click";
    private final String MORE_OFFER_DEFAULT_APP_ID = "92762";
    private final String MORE_OFFER_DEFAULT_APP_KEY = "936dcbdd57fe235fd7cf61c2e93da3c4";
    private final String MORE_OFFER_DEFAULT_UNIT_ID = "117361";
    private final String MORE_OFFER_LOAD_FAILED = "more offer load failed";
    private final String MORE_OFFER_LOAD_SUCCESS = "more offer load success";
    private final String MORE_OFFER_SHOW = "more offer show";
    private final String MORE_OFFER_SHOW_FAILED = "more offer show fail";
    private final String OFFER_ID = "offer_id";
    private final String OFF_SET = "offset";
    private final String ONLY_IMPRESSION = "only_impression";
    private final String PARENT_UNIT = "parent_unit";
    private final String PING_MODE = "ping_mode";
    private final String RV_TID = "rv_tid";
    private final String R_ID = "r_id";
    private final String SIGN = "sign";
    private final String TNUM = "tnum";
    private final String TP_LGP = "tplgp";
    private final String UC_PARENT_UNIT = "uc_parent_unit";
    private final String UNIT_ID = MBridgeConstans.PROPERTIES_UNIT_ID;
    private final String VALUE_AD_NUM = "20";
    private final String VALUE_API_VERSION = "1.3";
    private final String VALUE_CATEGORY = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private final String VALUE_COUNTRY_CODE = "CN";
    private final String VALUE_H5_TYPE = "1";
    private final String VALUE_HTTP_REQ = "2";
    private final String VALUE_MOF = "1";
    private final String VALUE_MOF_TYPE = "1";
    private final String VALUE_MOF_VER = "1";
    private final String VALUE_OFF_SET = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private final String VALUE_ONLY_IMPRESSION = "1";
    private final String VALUE_PING_MODE = "1";
    private final String VALUE_TNUM = "20";
    private final String V_FMD5 = "v_fmd5";
    /* access modifiers changed from: private */
    public List<Integer> cacheImpressionReportList;
    /* access modifiers changed from: private */
    public List<Integer> cacheOnlyImpressionReportList;
    /* access modifiers changed from: private */
    public C6940a exposeMonitor;

    public void bulidMofferAd(View view, CampaignEx campaignEx, C7027a aVar) {
        C6287d dVar = new C6287d();
        buildRequestParams(dVar, campaignEx);
        C6938b bVar = new C6938b(view.getContext());
        final C6287d dVar2 = dVar;
        final CampaignEx campaignEx2 = campaignEx;
        final View view2 = view;
        final C7027a aVar2 = aVar;
        C69491 r0 = new C6937a() {
            /* renamed from: a */
            public final void mo48446a(List<C6245b> list, CampaignUnit campaignUnit) {
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() >= 5) {
                    String str = dVar2.mo43871b().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                    String str2 = dVar2.mo43871b().get("r_id");
                    C6935a.m17518a(campaignEx2, C6122a.m15302b().mo42895d(), "more offer load success", str, str2);
                    MOfferModel.this.createMoreOfferView(view2, campaignUnit, campaignEx2, str, str2, aVar2);
                }
            }

            /* renamed from: a */
            public final void mo48445a(int i, String str) {
                CampaignEx campaignEx = campaignEx2;
                Context d = C6122a.m15302b().mo42895d();
                C6935a.m17518a(campaignEx, d, "more offer load failed errorCode:" + i + "errorMsg:" + str, dVar2.mo43871b().get(MBridgeConstans.PROPERTIES_UNIT_ID), dVar2.mo43871b().get("r_id"));
            }
        };
        C6938b bVar2 = bVar;
        bVar2.mo43865a(1, C6280d.m15868c().f15570f, dVar, new C6241b(GmsVersion.VERSION_SAGA, 1), r0);
    }

    private void buildRequestParams(C6287d dVar, CampaignEx campaignEx) {
        C6287d dVar2 = dVar;
        String campaignUnitId = campaignEx.getCampaignUnitId();
        String id = campaignEx.getId();
        String a = C6370y.m16238a(campaignEx.getNoticeUrl(), CampaignEx.JSON_KEY_AD_K);
        String a2 = C6370y.m16238a(campaignEx.getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(a2)) {
            a2 = C6370y.m16238a(campaignEx.getendcard_url(), "mof_uid");
        }
        String a3 = C6370y.m16238a(campaignEx.getendcard_url(), "mcc");
        String a4 = C6370y.m16238a(campaignEx.getendcard_url(), "mnc");
        String a5 = C6370y.m16238a(campaignEx.getendcard_url(), "rv_tid");
        String a6 = C6370y.m16238a(campaignEx.getendcard_url(), "ec_id");
        String a7 = C6370y.m16238a(campaignEx.getendcard_url(), "tplgp");
        String str = "v_fmd5";
        String a8 = C6370y.m16238a(campaignEx.getendcard_url(), "v_fmd5");
        String a9 = C6370y.m16238a(campaignEx.getendcard_url(), "i_fmd5");
        String str2 = "i_fmd5";
        C6275b.m15859a(dVar2, "app_id", C6122a.m15302b().mo42896e());
        StringBuilder sb = new StringBuilder();
        String str3 = "app_id";
        sb.append(C6122a.m15302b().mo42896e());
        sb.append(C6122a.m15302b().mo42897f());
        C6275b.m15859a(dVar2, "sign", SameMD5.getMD5(sb.toString()));
        C6275b.m15859a(dVar2, "r_id", a);
        String str4 = "sign";
        C6275b.m15859a(dVar2, "e", Arrays.toString(new String[]{id}));
        C6275b.m15859a(dVar2, "mof_type", "1");
        C6275b.m15859a(dVar2, "h5_type", "1");
        C6275b.m15859a(dVar2, "mof", "1");
        String str5 = "tplgp";
        C6275b.m15859a(dVar2, TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, "CN");
        C6275b.m15859a(dVar2, "mof_ver", "1");
        if (TextUtils.isEmpty(a2)) {
            C6275b.m15859a(dVar2, "uc_parent_unit", campaignUnitId);
        } else {
            C6275b.m15859a(dVar2, "parent_unit", campaignUnitId);
        }
        C6275b.m15859a(dVar2, "mnc", a4);
        C6275b.m15859a(dVar2, "mcc", a3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crt_cid", id);
            jSONObject.put("crt_rid", a);
            jSONObject.put("rv_tid", a5);
            jSONObject.put("ec_id", a6);
            jSONObject.put(str5, a7);
            jSONObject.put(str, a8);
            jSONObject.put(str2, a9);
            jSONObject.put("h5_t", 1);
            jSONObject.put("mof_t", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C6275b.m15859a(dVar2, "mof_data", C6348l.m16088a(jSONObject.toString().getBytes()));
        C6275b.m15859a(dVar2, ServerParameters.IMEI, "");
        C6275b.m15859a(dVar2, "offer_id", id);
        C6275b.m15859a(dVar2, "offset", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        C6275b.m15859a(dVar2, "category", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        C6275b.m15859a(dVar2, "only_impression", "1");
        C6275b.m15859a(dVar2, "ping_mode", "1");
        C6275b.m15859a(dVar2, "http_req", "2");
        C6275b.m15859a(dVar2, "ad_num", "20");
        C6275b.m15859a(dVar2, "tnum", "20");
        C6275b.m15859a(dVar2, "api_version", "1.3");
        if (TextUtils.isEmpty(a2)) {
            C6275b.m15859a(dVar2, str3, "92762");
            C6275b.m15859a(dVar2, str4, SameMD5.getMD5("92762936dcbdd57fe235fd7cf61c2e93da3c4"));
            a2 = "117361";
        }
        C6275b.m15859a(dVar2, MBridgeConstans.PROPERTIES_UNIT_ID, a2);
    }

    /* access modifiers changed from: private */
    public void createMoreOfferView(View view, CampaignUnit campaignUnit, CampaignEx campaignEx, String str, String str2, C7027a aVar) {
        Context context;
        View view2 = view;
        if (campaignUnit != null && view2 != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (context = view.getContext()) != null) {
            MBridgeRelativeLayout mBridgeRelativeLayout = (MBridgeRelativeLayout) view.findViewById(findID("mbridge_reward_end_card_more_offer_rl"));
            if (mBridgeRelativeLayout != null) {
                final CampaignEx campaignEx2 = campaignEx;
                final View view3 = view;
                final String str3 = str;
                final String str4 = str2;
                final CampaignUnit campaignUnit2 = campaignUnit;
                mBridgeRelativeLayout.setMoreOfferCacheReportCallBack(new C6939a() {
                    /* renamed from: a */
                    public final void mo48447a() {
                        if (MOfferModel.this.cacheImpressionReportList != null) {
                            for (int i = 0; i < MOfferModel.this.cacheImpressionReportList.size(); i++) {
                                C6935a.m17518a(campaignEx2, view3.getContext(), "more offer show", str3, str4);
                                C6935a.m17519a(campaignUnit2, ((Integer) MOfferModel.this.cacheImpressionReportList.get(i)).intValue(), 0, "117361");
                            }
                        }
                        if (MOfferModel.this.cacheOnlyImpressionReportList != null) {
                            for (int i2 = 0; i2 < MOfferModel.this.cacheOnlyImpressionReportList.size(); i2++) {
                                C6935a.m17519a(campaignUnit2, ((Integer) MOfferModel.this.cacheOnlyImpressionReportList.get(i2)).intValue(), 1, "117361");
                            }
                        }
                        MOfferModel.this.release();
                    }
                });
                final MBridgeRelativeLayout mBridgeRelativeLayout2 = mBridgeRelativeLayout;
                final CampaignEx campaignEx3 = campaignEx;
                final View view4 = view;
                final String str5 = str;
                final String str6 = str2;
                mBridgeRelativeLayout.setMoreOfferShowFailedCallBack(new C6948c() {
                    /* renamed from: a */
                    public final void mo48458a() {
                        MBridgeRelativeLayout mBridgeRelativeLayout = mBridgeRelativeLayout2;
                        if (!(mBridgeRelativeLayout == null || mBridgeRelativeLayout.getVisibility() == 0)) {
                            C6935a.m17518a(campaignEx3, view4.getContext(), "more offer show fail", str5, str6);
                        }
                        MOfferModel.this.release();
                        if (MOfferModel.this.exposeMonitor != null) {
                            MOfferModel.this.exposeMonitor.mo48448a();
                        }
                    }
                });
            }
            RecyclerView recyclerView = (RecyclerView) view.findViewById(findID("mbridge_reward_end_card_list_rlv"));
            if (recyclerView != null) {
                buildAdapter(context, view, recyclerView, mBridgeRelativeLayout, campaignEx, campaignUnit, str, str2, aVar);
                addLikeTextView(view, recyclerView);
            }
        }
    }

    private void buildAdapter(Context context, final View view, RecyclerView recyclerView, final MBridgeRelativeLayout mBridgeRelativeLayout, CampaignEx campaignEx, CampaignUnit campaignUnit, String str, String str2, C7027a aVar) {
        RecyclerView recyclerView2 = recyclerView;
        Context context2 = context;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C6940a aVar2 = new C6940a();
        this.exposeMonitor = aVar2;
        final MBridgeRelativeLayout mBridgeRelativeLayout2 = mBridgeRelativeLayout;
        final CampaignEx campaignEx2 = campaignEx;
        final String str3 = str;
        final String str4 = str2;
        final CampaignUnit campaignUnit2 = campaignUnit;
        aVar2.mo48449a(recyclerView, new C6942b() {
        });
        MBMoreOfferAdapter mBMoreOfferAdapter = new MBMoreOfferAdapter();
        mBMoreOfferAdapter.setMoreOfferData(campaignUnit.getAds());
        View view2 = view;
        mBMoreOfferAdapter.setMoreOfferShowCallBack(new C6947b() {
            /* renamed from: a */
            public final void mo48457a() {
                if (mBridgeRelativeLayout != null) {
                    new C6963b().mo48473a((RelativeLayout) view.findViewById(MOfferModel.this.findID("mbridge_native_ec_layout")), 0, C6366u.m16203b(C6122a.m15302b().mo42895d(), 80.0f), 500);
                    new C6963b().mo48472a(mBridgeRelativeLayout, 0, C6366u.m16224h(C6122a.m15302b().mo42895d()), 0, C6366u.m16203b(C6122a.m15302b().mo42895d(), 80.0f), 500);
                }
            }
        });
        if (campaignEx != null) {
            mBMoreOfferAdapter.setRewardEndCardurl(campaignEx.getendcard_url());
        }
        recyclerView.setAdapter(mBMoreOfferAdapter);
        final CampaignUnit campaignUnit3 = campaignUnit;
        final C7027a aVar3 = aVar;
        final CampaignEx campaignEx3 = campaignEx;
        final String str5 = str;
        final String str6 = str2;
        mBMoreOfferAdapter.setOnItemClickListener(new MBMoreOfferAdapter.C6945a() {
            /* renamed from: a */
            public final void mo48456a(int i) {
                CampaignEx campaignEx;
                CampaignUnit campaignUnit = campaignUnit3;
                if (campaignUnit != null && campaignUnit.ads != null && campaignUnit3.ads.size() > 0 && (campaignEx = campaignUnit3.ads.get(i)) != null) {
                    C7027a aVar = aVar3;
                    if (aVar != null) {
                        MOfferModel.this.callBackClick(aVar);
                    }
                    C6935a.m17518a(campaignEx3, C6122a.m15302b().mo42895d(), "more offer click", str5, str6);
                    C6935a.m17517a(C6122a.m15302b().mo42895d(), campaignEx, str5);
                }
            }
        });
    }

    private void addLikeTextView(View view, final RecyclerView recyclerView) {
        MBridgeTextView mBridgeTextView = (MBridgeTextView) view.findViewById(findID("mbridge_reward_end_card_like_tv"));
        if (mBridgeTextView != null) {
            mBridgeTextView.setStrokeData(C6366u.m16203b(C6122a.m15302b().mo42895d(), 1.0f), Color.parseColor("#ff5f5f5f"));
            mBridgeTextView.setTextColor(Color.parseColor("#FF000000"));
            mBridgeTextView.setEachCornerRadius(0, C6366u.m16203b(C6122a.m15302b().mo42895d(), 10.0f), 0, C6366u.m16203b(C6122a.m15302b().mo42895d(), 10.0f));
            mBridgeTextView.setTextSize(10.0f);
            if (C6349m.m16100c(C6122a.m15302b().mo42895d()).contains("zh")) {
                mBridgeTextView.setEms(1);
                mBridgeTextView.getLayoutParams().width = C6366u.m16203b(C6122a.m15302b().mo42895d(), 30.0f);
                mBridgeTextView.setText("猜你喜欢");
            } else {
                mBridgeTextView.setText("Just\nfor\nYou");
            }
            mBridgeTextView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    new C6963b().mo48474a((View) recyclerView, 300);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void callBackClick(C7027a aVar) {
        aVar.mo48315a(128, "");
    }

    /* access modifiers changed from: private */
    public int findID(String str) {
        return C6347k.m16084a(C6122a.m15302b().mo42895d(), str, "id");
    }

    /* access modifiers changed from: private */
    public void release() {
        List<Integer> list = this.cacheImpressionReportList;
        if (list != null) {
            list.clear();
            this.cacheImpressionReportList = null;
        }
        List<Integer> list2 = this.cacheOnlyImpressionReportList;
        if (list2 != null) {
            list2.clear();
            this.cacheOnlyImpressionReportList = null;
        }
    }
}
