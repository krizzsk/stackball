package com.mbridge.msdk.foundation.entity;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p164db.p165a.C6138a;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.foundation.tools.C6369x;
import com.mbridge.msdk.system.NoProGuard;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CampaignEx extends DomainCampaignEx implements NoProGuard, Serializable {
    public static final int CAMPAIN_NV_T2_VALUE_3 = 3;
    public static final int CAMPAIN_NV_T2_VALUE_4 = 4;
    public static final String CLICKMODE_ON = "5";
    public static final int CLICK_TIMEOUT_INTERVAL_DEFAULT_VALUE = 2;
    public static final int C_UA_DEFAULT_VALUE = 1;
    private static final int DEFAULT_READY_RATE = 100;
    public static final String ENDCARD_URL = "endcard_url";
    public static final int FLAG_DEFAULT_SPARE_OFFER = -1;
    public static final int FLAG_IS_SPARE_OFFER = 1;
    public static final int FLAG_NOT_SPARE_OFFER = 0;
    public static final int IMP_UA_DEFAULT_VALUE = 1;
    public static final String JSON_AD_IMP_KEY = "sec";
    public static final String JSON_AD_IMP_VALUE = "url";
    public static final String JSON_KEY_ADVIMP = "adv_imp";
    public static final String JSON_KEY_AD_AKS = "aks";
    public static final String JSON_KEY_AD_AL = "al";
    public static final String JSON_KEY_AD_HTML = "ad_html";
    public static final String JSON_KEY_AD_K = "k";
    public static final String JSON_KEY_AD_MP = "mp";
    public static final String JSON_KEY_AD_Q = "q";
    public static final String JSON_KEY_AD_R = "r";
    public static final String JSON_KEY_AD_SOURCE_ID = "ad_source_id";
    public static final String JSON_KEY_AD_TMP_IDS = "tmp_ids";
    public static final String JSON_KEY_AD_TRACKING_DROPOUT_TRACK = "dropout_track";
    public static final String JSON_KEY_AD_TRACKING_IMPRESSION_T2 = "impression_t2";
    public static final String JSON_KEY_AD_TRACKING_PLYCMPT_TRACK = "plycmpt_track";
    public static final String JSON_KEY_AD_URL_LIST = "ad_url_list";
    public static final String JSON_KEY_AD_ZIP = "ad_tpl_url";
    public static final String JSON_KEY_APP_SIZE = "app_size";
    public static final String JSON_KEY_BANNER_HTML = "banner_html";
    public static final String JSON_KEY_BANNER_URL = "banner_url";
    public static final String JSON_KEY_BTY = "ctype";
    public static final String JSON_KEY_CAMPAIGN_UNITID = "unitId";
    public static final String JSON_KEY_CLICK_INTERVAL = "c_ct";
    public static final String JSON_KEY_CLICK_MODE = "click_mode";
    public static final String JSON_KEY_CLICK_TIMEOUT_INTERVAL = "c_toi";
    public static final String JSON_KEY_CLICK_URL = "click_url";
    public static final String JSON_KEY_CREATIVE_ID = "creative_id";
    public static final String JSON_KEY_CTA_TEXT = "ctatext";
    public static final String JSON_KEY_C_UA = "c_ua";
    public static final String JSON_KEY_DEEP_LINK_URL = "deep_link";
    public static final String JSON_KEY_DESC = "desc";
    public static final String JSON_KEY_ENDCARD_CLICK = "endcard_click_result";
    public static final String JSON_KEY_EXT_DATA = "ext_data";
    public static final String JSON_KEY_FCA = "fca";
    public static final String JSON_KEY_FCB = "fcb";
    public static final String JSON_KEY_FLB = "flb";
    public static final String JSON_KEY_FLB_SKIP_TIME = "flb_skiptime";
    public static final String JSON_KEY_GIF_URL = "gif_url";
    public static final String JSON_KEY_GUIDELINES = "guidelines";
    public static final String JSON_KEY_HASMBTPLMARK = "hasMBTplMark";
    public static final String JSON_KEY_HB = "hb";
    public static final String JSON_KEY_ICON_URL = "icon_url";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_IMAGE_SIZE = "image_size";
    public static final String JSON_KEY_IMAGE_URL = "image_url";
    public static final String JSON_KEY_IMPRESSION_URL = "impression_url";
    public static final String JSON_KEY_IMP_UA = "imp_ua";
    public static final String JSON_KEY_JM_PD = "jm_pd";
    public static final String JSON_KEY_LANDING_TYPE = "landing_type";
    public static final String JSON_KEY_LINK_TYPE = "link_type";
    public static final String JSON_KEY_MAITVE = "maitve";
    public static final String JSON_KEY_MAITVESRC = "maitve_src";
    public static final String JSON_KEY_MRAID = "mraid";
    public static final String JSON_KEY_MRAIDFORH5 = "mraid_src";
    public static final String JSON_KEY_NOTICE_URL = "notice_url";
    public static final String JSON_KEY_NUMBER_RATING = "number_rating";
    public static final String JSON_KEY_NV_T2 = "nv_t2";
    public static final String JSON_KEY_OFFER_TYPE = "offer_type";
    public static final String JSON_KEY_PACKAGE_NAME = "package_name";
    public static final String JSON_KEY_PLCT = "plct";
    public static final String JSON_KEY_PLCTB = "plctb";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_READY_RATE = "ready_rate";
    public static final String JSON_KEY_RETARGET_OFFER = "retarget_offer";
    public static final String JSON_KEY_RETARGET_TYPE = "rtins_type";
    public static final String JSON_KEY_REWARD_AMOUNT = "reward_amount";
    public static final String JSON_KEY_REWARD_NAME = "reward_name";
    public static final String JSON_KEY_REWARD_PLUS = "rw_pl";
    public static final String JSON_KEY_REWARD_TEMPLATE = "rv";
    public static final String JSON_KEY_REWARD_VIDEO_MD5 = "md5_file";
    public static final String JSON_KEY_STAR = "rating";
    public static final String JSON_KEY_ST_IEX = "iex";
    public static final String JSON_KEY_ST_TS = "ts";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_TIMESTAMP = "timestamp";
    public static final String JSON_KEY_TITLE = "title";
    public static final String JSON_KEY_T_IMP = "t_imp";
    public static final String JSON_KEY_USER_ACTIVATION = "user_activation";
    public static final String JSON_KEY_VCN = "vcn";
    public static final String JSON_KEY_VIDEO_LENGTHL = "video_length";
    public static final String JSON_KEY_VIDEO_RESOLUTION = "video_resolution";
    public static final String JSON_KEY_VIDEO_SIZE = "video_size";
    public static final String JSON_KEY_VIDEO_URL = "video_url";
    public static final String JSON_KEY_WATCH_MILE = "watch_mile";
    public static final String JSON_KEY_WITHOUT_INSTALL_CHECK = "wtick";
    public static final String JSON_NATIVE_VIDEO_AD_TRACKING = "ad_tracking";
    public static final String JSON_NATIVE_VIDEO_CLICK = "click";
    public static final String JSON_NATIVE_VIDEO_CLOSE = "close";
    public static final String JSON_NATIVE_VIDEO_COMPLETE = "complete";
    public static final String JSON_NATIVE_VIDEO_ENDCARD = "endcard";
    public static final String JSON_NATIVE_VIDEO_ENDCARD_SHOW = "endcard_show";
    public static final String JSON_NATIVE_VIDEO_ERROR = "error";
    public static final String JSON_NATIVE_VIDEO_FIRST_QUARTILE = "first_quartile";
    public static final String JSON_NATIVE_VIDEO_MIDPOINT = "midpoint";
    public static final String JSON_NATIVE_VIDEO_MUTE = "mute";
    public static final String JSON_NATIVE_VIDEO_PAUSE = "pause";
    public static final String JSON_NATIVE_VIDEO_PLAY_PERCENTAGE = "play_percentage";
    public static final String JSON_NATIVE_VIDEO_RESUME = "resume";
    public static final String JSON_NATIVE_VIDEO_START = "start";
    public static final String JSON_NATIVE_VIDEO_THIRD_QUARTILE = "third_quartile";
    public static final String JSON_NATIVE_VIDEO_UNMUTE = "unmute";
    public static final String JSON_NATIVE_VIDEO_VIDEO_CLICK = "video_click";
    public static final String JSON_NATIVE_VIDOE_IMPRESSION = "impression";
    public static final String KEY_ADCHOICE = "adchoice";
    public static final String KEY_AD_TYPE = "ad_type";
    public static final String KEY_IA_CACHE = "ia_cache";
    public static final String KEY_IA_EXT1 = "ia_ext1";
    public static final String KEY_IA_EXT2 = "ia_ext2";
    public static final String KEY_IA_ICON = "ia_icon";
    public static final String KEY_IA_ORI = "ia_ori";
    public static final String KEY_IA_RST = "ia_rst";
    public static final String KEY_IA_URL = "ia_url";
    public static final String KEY_IS_DOWNLOAD = "is_download_zip";
    public static final String KEY_OC_TIME = "oc_time";
    public static final String KEY_OC_TYPE = "oc_type";
    public static final String KEY_OMID = "omid";
    public static final String KEY_T_LIST = "t_list";
    public static final int LANDING_TYPE_VALUE_OPEN_BROWSER = 1;
    public static final int LANDING_TYPE_VALUE_OPEN_GP_BY_PACKAGE = 3;
    public static final int LANDING_TYPE_VALUE_OPEN_WEBVIEW = 2;
    public static final int LINK_TYPE_1 = 1;
    public static final int LINK_TYPE_2 = 2;
    public static final int LINK_TYPE_3 = 3;
    public static final int LINK_TYPE_4 = 4;
    public static final int LINK_TYPE_8 = 8;
    public static final int LINK_TYPE_9 = 9;
    public static final String PLAYABLE_ADS_WITHOUT_VIDEO = "playable_ads_without_video";
    public static final int PLAYABLE_ADS_WITHOUT_VIDEO_DEFAULT = 1;
    public static final int PLAYABLE_ADS_WITHOUT_VIDEO_ENDCARD = 2;
    public static final int RETAR_GETING_IS = 1;
    public static final int RETAR_GETING_NOT = 2;
    public static final int RTINS_TYPE_DONE = 1;
    public static final int RTINS_TYPE_NOT_DONE = 2;
    public static final String TAG = CampaignEx.class.getSimpleName();
    public static final String VIDEO_END_TYPE = "video_end_type";
    public static final int VIDEO_END_TYPE_BROWSER = 5;
    public static final int VIDEO_END_TYPE_DEFAULT = 2;
    public static final int VIDEO_END_TYPE_FINISH = 1;
    public static final int VIDEO_END_TYPE_NATIVE = 100;
    public static final int VIDEO_END_TYPE_REULSE = 2;
    public static final int VIDEO_END_TYPE_VAST = 3;
    public static final int VIDEO_END_TYPE_WEBVIEW = 4;
    private static final long serialVersionUID = 1;
    private String adHtml = "";
    private int adType;
    private String adZip = "";
    private String ad_url_list;
    private C6187a adchoice;
    private String advImp;
    private HashMap<String, String> aks;

    /* renamed from: al */
    private String f15231al;
    private String bannerHtml = "";
    private String bannerUrl = "";
    private String bidToken = "";
    private int bty;
    private int cUA = 1;
    private long cVersionCode;
    private int cacheLevel;
    private String campaignUnitId;
    private int cbt;
    private int clickInterval;
    private int clickTimeOutInterval = 2;
    private String clickURL = "";
    private String click_mode;
    private long creativeId = 0;
    private String deepLinkUrl = "";
    private String endScreenUrl;
    private int endcard_click_result;
    private String endcard_url;
    private String ext_data;
    private int fca;
    private int fcb;
    private int flb;
    private int flbSkipTime;
    private String gifUrl;
    private String guidelines;
    private boolean hasMBTplMark;
    private boolean hasReportAdTrackPause = false;
    private String htmlUrl;
    private String ia_ext1;
    private String ia_ext2;
    private int iex;
    private String imageSize = "";
    private int impUA = 1;
    private String impressionURL = "";
    private String interactiveCache;
    private int isAddSuccesful;
    private boolean isBidCampaign;
    private boolean isCallBackImpression = false;
    private boolean isCallbacked;
    private int isClick;
    private int isDeleted;
    private int isDownLoadZip;
    private boolean isMraid;
    private boolean isReady = false;
    private boolean isReport;
    private boolean isReportClick;
    private int jmPd;
    private CommonJumpLoader.JumpLoaderResult jumpResult;

    /* renamed from: k */
    private String f15232k;
    private String keyIaIcon;
    private int keyIaOri;
    private int keyIaRst;
    private String keyIaUrl;
    private String label;
    private String landingType;
    private int linkType;
    private int loadTimeoutState = 0;
    private int maitve;
    private String maitve_src;
    private C6188b mediaViewHolder;
    private String mof_template_url;
    private int mof_tplid;

    /* renamed from: mp */
    private String f15233mp;
    private String mraid;
    private C6199i nativeVideoTracking;
    private String nativeVideoTrackingString;
    private String noticeUrl = "";
    private int nscpt = 1;
    private int nvT2 = 6;
    private int oc_time;
    private int oc_type = 0;
    private int offerType;
    private String omid = null;
    private String onlyImpressionURL = "";
    private String pkgSource;
    private String placementId;
    private int playable_ads_without_video = 1;
    private long plct = 0;
    private long plctb = 0;
    private List<String> pv_urls;

    /* renamed from: q */
    private String f15234q;

    /* renamed from: r */
    private String f15235r;
    private int readyState = 1;
    private int ready_rate = -1;
    private String req_ext_data;
    private String requestId;
    private String requestIdNotice;
    private int retarget_offer;
    private int rewardAmount;
    private int rewardPlayStatus;
    public RewardPlus rewardPlus;
    private C6189c rewardTemplateMode;
    private String reward_name;
    private int rtinsType;
    private int spareOfferFlag = -1;
    private int t_imp;
    private String t_list;
    private int tab = -1;
    private int template;

    /* renamed from: ts */
    private long f15236ts;
    private boolean userActivation = false;
    private int vcn = 0;
    public String videoMD5Value = "";
    private String videoResolution;
    private int videoSize;
    private String videoUrlEncode = "";
    private int video_end_type = 2;
    private int watchMile;
    private int wtick = 0;

    /* renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$b */
    public static final class C6188b implements Serializable {

        /* renamed from: a */
        public boolean f15248a = false;

        /* renamed from: b */
        public boolean f15249b = false;

        /* renamed from: c */
        public boolean f15250c = false;

        /* renamed from: d */
        public boolean f15251d = false;

        /* renamed from: e */
        public boolean f15252e = false;

        /* renamed from: f */
        public boolean f15253f = false;

        /* renamed from: g */
        public boolean f15254g = false;

        /* renamed from: h */
        public boolean f15255h = false;

        /* renamed from: i */
        public boolean f15256i = false;

        /* renamed from: j */
        public boolean f15257j = false;

        /* renamed from: k */
        public boolean f15258k = false;

        /* renamed from: l */
        public Map<Integer, String> f15259l;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public void setAdZip(String str) {
        this.adZip = str;
    }

    public String getAdHtml() {
        return this.adHtml;
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public void setPv_urls(List<String> list) {
        this.pv_urls = list;
    }

    public List<String> getPv_urls() {
        return this.pv_urls;
    }

    public int getReadyState() {
        return this.readyState;
    }

    public int getVcn() {
        int i = this.vcn;
        if (i > 0) {
            return i;
        }
        return 1;
    }

    public void setVcn(int i) {
        this.vcn = i;
    }

    public int getSpareOfferFlag() {
        return this.spareOfferFlag;
    }

    public void setSpareOfferFlag(int i) {
        this.spareOfferFlag = i;
    }

    public long getPlct() {
        return this.plct;
    }

    public void setPlct(long j) {
        this.plct = j;
    }

    public long getPlctb() {
        return this.plctb;
    }

    public void setPlctb(long j) {
        this.plctb = j;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public long getCreativeId() {
        return this.creativeId;
    }

    public void setCreativeId(long j) {
        this.creativeId = j;
    }

    public boolean isHasMBTplMark() {
        return this.hasMBTplMark;
    }

    public void setHasMBTplMark(boolean z) {
        this.hasMBTplMark = z;
    }

    public int getFlb() {
        return this.flb;
    }

    public void setFlb(int i) {
        this.flb = i;
    }

    public int getFlbSkipTime() {
        return this.flbSkipTime;
    }

    public void setFlbSkipTime(int i) {
        this.flbSkipTime = i;
    }

    public C6187a getAdchoice() {
        return this.adchoice;
    }

    public void setAdchoice(C6187a aVar) {
        this.adchoice = aVar;
    }

    public RewardPlus getRewardPlus() {
        return this.rewardPlus;
    }

    public void setRewardPlus(RewardPlus rewardPlus2) {
        this.rewardPlus = rewardPlus2;
    }

    public int getOc_type() {
        return this.oc_type;
    }

    public void setOc_type(int i) {
        this.oc_type = i;
    }

    public int getOc_time() {
        return this.oc_time;
    }

    public void setOc_time(int i) {
        this.oc_time = i;
    }

    public String getT_list() {
        return this.t_list;
    }

    public void setT_list(String str) {
        this.t_list = str;
    }

    public String getInteractiveCache() {
        return this.interactiveCache;
    }

    public void setInteractiveCache(String str) {
        this.interactiveCache = str;
    }

    public int getIsDownLoadZip() {
        return this.isDownLoadZip;
    }

    public void setIsDownLoadZip(int i) {
        this.isDownLoadZip = i;
    }

    public int getAdType() {
        return this.adType;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public String getIa_ext1() {
        return this.ia_ext1;
    }

    public void setIa_ext1(String str) {
        this.ia_ext1 = str;
    }

    public String getIa_ext2() {
        return this.ia_ext2;
    }

    public void setIa_ext2(String str) {
        this.ia_ext2 = str;
    }

    public String getKeyIaIcon() {
        return this.keyIaIcon;
    }

    public void setKeyIaIcon(String str) {
        this.keyIaIcon = str;
    }

    public int getKeyIaRst() {
        return this.keyIaRst;
    }

    public void setKeyIaRst(int i) {
        this.keyIaRst = i;
    }

    public String getKeyIaUrl() {
        return this.keyIaUrl;
    }

    public void setKeyIaUrl(String str) {
        this.keyIaUrl = str;
    }

    public int getKeyIaOri() {
        return this.keyIaOri;
    }

    public void setKeyIaOri(int i) {
        this.keyIaOri = i;
    }

    public int getIsAddSuccesful() {
        return this.isAddSuccesful;
    }

    public void setIsAddSuccesful(int i) {
        this.isAddSuccesful = i;
    }

    public int getJmPd() {
        return this.jmPd;
    }

    public int getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(int i) {
        this.isDeleted = i;
    }

    public int getIsClick() {
        return this.isClick;
    }

    public void setIsClick(int i) {
        this.isClick = i;
    }

    public void setJmPd(int i) {
        this.jmPd = i;
    }

    public int getNvT2() {
        return this.nvT2;
    }

    public void setNvT2(int i) {
        this.nvT2 = i;
    }

    public String getGifUrl() {
        return this.gifUrl;
    }

    public void setGifUrl(String str) {
        this.gifUrl = str;
    }

    public int getRtinsType() {
        return this.rtinsType;
    }

    public void setRtinsType(int i) {
        this.rtinsType = i;
    }

    public HashMap<String, String> getAks() {
        return this.aks;
    }

    public void setAks(HashMap<String, String> hashMap) {
        this.aks = hashMap;
    }

    public String getK() {
        return this.f15232k;
    }

    public void setK(String str) {
        this.f15232k = str;
    }

    public String getQ() {
        return this.f15234q;
    }

    public void setQ(String str) {
        this.f15234q = str;
    }

    public String getR() {
        return this.f15235r;
    }

    public void setR(String str) {
        this.f15235r = str;
    }

    public String getAl() {
        return this.f15231al;
    }

    public void setAl(String str) {
        this.f15231al = str;
    }

    public String getMp() {
        return this.f15233mp;
    }

    public void setMp(String str) {
        this.f15233mp = str;
    }

    public boolean isBidCampaign() {
        return this.isBidCampaign;
    }

    public void setIsBidCampaign(boolean z) {
        this.isBidCampaign = z;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public int getEndcard_click_result() {
        return this.endcard_click_result;
    }

    public void setEndcard_click_result(int i) {
        this.endcard_click_result = i;
    }

    public int getImpUA() {
        return this.impUA;
    }

    public void setImpUA(int i) {
        this.impUA = i;
    }

    public int getcUA() {
        return this.cUA;
    }

    public void setcUA(int i) {
        this.cUA = i;
    }

    public String getVideoMD5Value() {
        return this.videoMD5Value;
    }

    public void setVideoMD5Value(String str) {
        this.videoMD5Value = str;
    }

    public int getVideo_end_type() {
        return this.video_end_type;
    }

    public void setVideo_end_type(int i) {
        this.video_end_type = i;
    }

    public String getMraid() {
        return this.mraid;
    }

    public void setMraid(String str) {
        this.mraid = str;
    }

    public boolean isMraid() {
        return this.isMraid;
    }

    public void setIsMraid(boolean z) {
        this.isMraid = z;
    }

    public String getendcard_url() {
        return this.endcard_url;
    }

    public void setendcard_url(String str) {
        this.endcard_url = str;
    }

    public int getPlayable_ads_without_video() {
        return this.playable_ads_without_video;
    }

    public void setPlayable_ads_without_video(int i) {
        this.playable_ads_without_video = i;
    }

    public String getCampaignUnitId() {
        return this.campaignUnitId;
    }

    public void setCampaignUnitId(String str) {
        this.campaignUnitId = str;
    }

    public String getNativeVideoTrackingString() {
        return this.nativeVideoTrackingString;
    }

    public void setNativeVideoTrackingString(String str) {
        this.nativeVideoTrackingString = str;
    }

    public C6199i getNativeVideoTracking() {
        return this.nativeVideoTracking;
    }

    public void setNativeVideoTracking(C6199i iVar) {
        this.nativeVideoTracking = iVar;
    }

    public String getAd_url_list() {
        return this.ad_url_list;
    }

    public void setAd_url_list(String str) {
        this.ad_url_list = str;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String getPkgSource() {
        return this.pkgSource;
    }

    public void setPkgSource(String str) {
        this.pkgSource = str;
    }

    public int getIex() {
        return this.iex;
    }

    public void setIex(int i) {
        this.iex = i;
    }

    public long getTs() {
        return this.f15236ts;
    }

    public void setTs(long j) {
        this.f15236ts = j;
    }

    public C6188b getMediaViewHolder() {
        return this.mediaViewHolder;
    }

    public void setMediaViewHolder(C6188b bVar) {
        this.mediaViewHolder = bVar;
    }

    public C6189c getRewardTemplateMode() {
        return this.rewardTemplateMode;
    }

    public void setRewardTemplateMode(C6189c cVar) {
        this.rewardTemplateMode = cVar;
    }

    public int getRetarget_offer() {
        return this.retarget_offer;
    }

    public void setRetarget_offer(int i) {
        this.retarget_offer = i;
    }

    public int getRewardPlayStatus() {
        return this.rewardPlayStatus;
    }

    public void setRewardPlayStatus(int i) {
        this.rewardPlayStatus = i;
    }

    public String getGuidelines() {
        return this.guidelines;
    }

    public void setGuidelines(String str) {
        this.guidelines = str;
    }

    public int getOfferType() {
        return this.offerType;
    }

    public void setOfferType(int i) {
        this.offerType = i;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public String getEndScreenUrl() {
        return this.endScreenUrl;
    }

    public void setEndScreenUrl(String str) {
        this.endScreenUrl = str;
    }

    public int getRewardAmount() {
        return this.rewardAmount;
    }

    public void setRewardAmount(int i) {
        this.rewardAmount = i;
    }

    public String getRewardName() {
        return this.reward_name;
    }

    public void setRewardName(String str) {
        this.reward_name = str;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setAdCall(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.linkType != 2 ? "learn more" : "install";
        }
        super.setAdCall(str);
    }

    public int getBty() {
        return this.bty;
    }

    public void setBty(int i) {
        this.bty = i;
    }

    public String getAdvImp() {
        return this.advImp;
    }

    public void setAdvImp(String str) {
        this.advImp = str;
    }

    public Map<Integer, String> getAdvImpList() {
        return generateAdImpression(this.advImp);
    }

    public int getTImp() {
        return this.t_imp;
    }

    public void setTImp(int i) {
        this.t_imp = i;
    }

    public String getVideoUrlEncode() {
        return this.videoUrlEncode;
    }

    public void setVideoUrlEncode(String str) {
        this.videoUrlEncode = str;
    }

    public int getVideoSize() {
        return this.videoSize;
    }

    public void setVideoSize(int i) {
        this.videoSize = i;
    }

    public String getVideoResolution() {
        return this.videoResolution;
    }

    public void setVideoResolution(String str) {
        this.videoResolution = str;
    }

    public int getWatchMile() {
        return this.watchMile;
    }

    public void setWatchMile(int i) {
        this.watchMile = i;
    }

    public int getCacheLevel() {
        return this.cacheLevel;
    }

    public void setCacheLevel(int i) {
        this.cacheLevel = i;
    }

    public boolean isCallBackImpression() {
        return this.isCallBackImpression;
    }

    public void setCallBackImpression(boolean z) {
        this.isCallBackImpression = z;
    }

    public void setReport(boolean z) {
        this.isReport = z;
    }

    public boolean isReport() {
        return this.isReport;
    }

    public boolean isReportClick() {
        return this.isReportClick;
    }

    public void setReportClick(boolean z) {
        this.isReportClick = z;
    }

    public int getClickInterval() {
        return this.clickInterval;
    }

    public void setClickInterval(int i) {
        this.clickInterval = i;
    }

    public int getClickTimeOutInterval() {
        return this.clickTimeOutInterval;
    }

    public void setClickTimeOutInterval(int i) {
        this.clickTimeOutInterval = i;
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (TextUtils.isEmpty(this.onlyImpressionURL)) {
                return null;
            }
            Uri parse = Uri.parse(this.onlyImpressionURL);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(JSON_KEY_AD_K);
                this.requestId = queryParameter;
                setRequestId(queryParameter);
            }
            return this.requestId;
        } catch (Exception unused) {
            return null;
        }
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public String getRequestIdNotice() {
        try {
            if (!TextUtils.isEmpty(this.requestIdNotice)) {
                return this.requestIdNotice;
            }
            if (TextUtils.isEmpty(this.noticeUrl)) {
                return "";
            }
            Uri parse = Uri.parse(this.noticeUrl);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(JSON_KEY_AD_K);
                this.requestIdNotice = queryParameter;
                setRequestIdNotice(queryParameter);
            }
            return this.requestIdNotice;
        } catch (Exception unused) {
            return "";
        }
    }

    public void setRequestIdNotice(String str) {
        this.requestIdNotice = str;
    }

    public String getClick_mode() {
        return this.click_mode;
    }

    public void setClick_mode(String str) {
        this.click_mode = str;
    }

    public String getLandingType() {
        return this.landingType;
    }

    public void setLandingType(String str) {
        this.landingType = str;
    }

    public int getFca() {
        return this.fca;
    }

    public void setFca(int i) {
        this.fca = i;
    }

    public int getFcb() {
        return this.fcb;
    }

    public void setFcb(int i) {
        this.fcb = i;
    }

    public int getTab() {
        return this.tab;
    }

    public void setTab(int i) {
        this.tab = i;
    }

    public String getClickURL() {
        return this.clickURL;
    }

    public void setClickURL(String str) {
        this.clickURL = str;
    }

    public int getWtick() {
        return this.wtick;
    }

    public void setWtick(int i) {
        this.wtick = i;
    }

    public String getDeepLinkURL() {
        return this.deepLinkUrl;
    }

    public void setDeepLinkUrl(String str) {
        this.deepLinkUrl = str;
    }

    public void setUserActivation(boolean z) {
        this.userActivation = z;
    }

    public boolean getUserActivation() {
        return this.userActivation;
    }

    public String getImpressionURL() {
        return this.impressionURL;
    }

    public void setImpressionURL(String str) {
        this.impressionURL = str;
    }

    public String getNoticeUrl() {
        return this.noticeUrl;
    }

    public void setNoticeUrl(String str) {
        this.noticeUrl = str;
    }

    public String getOnlyImpressionURL() {
        return this.onlyImpressionURL;
    }

    public void setOnlyImpressionURL(String str) {
        this.onlyImpressionURL = str;
    }

    public CommonJumpLoader.JumpLoaderResult getJumpResult() {
        return this.jumpResult;
    }

    public void setJumpResult(CommonJumpLoader.JumpLoaderResult jumpLoaderResult) {
        this.jumpResult = jumpLoaderResult;
    }

    public int getTemplate() {
        return this.template;
    }

    public void setTemplate(int i) {
        this.template = i;
    }

    public String getImageSize() {
        return this.imageSize;
    }

    public void setImageSize(String str) {
        this.imageSize = str;
    }

    public String getHost() {
        if (!TextUtils.isEmpty(getNoticeUrl())) {
            try {
                URL url = new URL(getNoticeUrl());
                return url.getProtocol() + "://" + url.getHost();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static CampaignEx parseSettingCampaign(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        campaignEx.setId(jSONObject.optString("campaignid"));
        campaignEx.setPackageName(jSONObject.optString("packageName"));
        campaignEx.setAppName(jSONObject.optString("title"));
        campaignEx.setAdCall(jSONObject.optString(SDKConstants.PARAM_GAME_REQUESTS_CTA));
        campaignEx.setAppDesc(jSONObject.optString(JSON_KEY_DESC));
        campaignEx.setImpressionURL(jSONObject.optString(JSON_KEY_IMPRESSION_URL));
        campaignEx.setImageUrl(jSONObject.optString("image_url"));
        campaignEx.setPlct(jSONObject.optLong(JSON_KEY_PLCT));
        campaignEx.setPlctb(jSONObject.optLong(JSON_KEY_PLCTB));
        campaignEx.setAdHtml(jSONObject.optString(JSON_KEY_AD_HTML));
        campaignEx.setAdZip(jSONObject.optString(JSON_KEY_AD_ZIP));
        campaignEx.setBannerUrl(jSONObject.optString(JSON_KEY_BANNER_URL));
        campaignEx.setBannerHtml(jSONObject.optString(JSON_KEY_BANNER_HTML));
        campaignEx.setCreativeId((long) jSONObject.optInt(JSON_KEY_CREATIVE_ID));
        campaignEx.setPlacementId(jSONObject.optString(MBridgeConstans.PLACEMENT_ID));
        return campaignEx;
    }

    private static boolean isBreakCampainOrSetItByEndCard(CampaignEx campaignEx, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C6122a.m15302b().mo42898g() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        campaignEx.setendcard_url(str);
        return false;
    }

    public static CampaignEx parseCampaignWithBackData(JSONObject jSONObject) {
        CampaignEx campaignEx;
        ArrayList arrayList;
        CampaignEx campaignEx2 = null;
        if (jSONObject != null) {
            try {
                campaignEx = new CampaignEx();
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return campaignEx2;
            }
            try {
                campaignEx.setId(jSONObject.optString("id"));
                campaignEx.setAppName(jSONObject.optString("title"));
                campaignEx.setAppDesc(jSONObject.optString(JSON_KEY_DESC));
                campaignEx.setPackageName(jSONObject.optString(JSON_KEY_PACKAGE_NAME));
                campaignEx.setRtinsType(jSONObject.optInt(JSON_KEY_RETARGET_TYPE));
                campaignEx.setIconUrl(jSONObject.optString(JSON_KEY_ICON_URL));
                campaignEx.setImageUrl(jSONObject.optString("image_url"));
                campaignEx.setSize(jSONObject.optString(JSON_KEY_APP_SIZE));
                campaignEx.setImageSize(jSONObject.optString(JSON_KEY_IMAGE_SIZE));
                campaignEx.setImpressionURL(jSONObject.optString(JSON_KEY_IMPRESSION_URL));
                campaignEx.setClickURL(jSONObject.optString("click_url"));
                campaignEx.setRewardPlus(RewardPlus.parseByString(jSONObject.optString(JSON_KEY_REWARD_PLUS)));
                campaignEx.setWtick(jSONObject.optInt(JSON_KEY_WITHOUT_INSTALL_CHECK));
                campaignEx.setDeepLinkUrl(jSONObject.optString(JSON_KEY_DEEP_LINK_URL));
                campaignEx.setUserActivation(jSONObject.optBoolean(JSON_KEY_USER_ACTIVATION, false));
                campaignEx.setNoticeUrl(jSONObject.optString(JSON_KEY_NOTICE_URL));
                campaignEx.setTemplate(jSONObject.optInt("template"));
                campaignEx.setType(jSONObject.optInt(JSON_KEY_AD_SOURCE_ID, 1));
                campaignEx.setFca(jSONObject.optInt(JSON_KEY_FCA));
                campaignEx.setFcb(jSONObject.optInt(JSON_KEY_FCB));
                campaignEx.setEndcard_click_result(jSONObject.optInt(JSON_KEY_ENDCARD_CLICK));
                if (!TextUtils.isEmpty(jSONObject.optString(JSON_KEY_STAR))) {
                    campaignEx.setRating(Double.parseDouble(jSONObject.optString(JSON_KEY_STAR, AppEventsConstants.EVENT_PARAM_VALUE_NO)));
                }
                if (!TextUtils.isEmpty(jSONObject.optString(JSON_KEY_NUMBER_RATING))) {
                    campaignEx.setNumberRating(jSONObject.optInt(JSON_KEY_NUMBER_RATING, 333333));
                }
                campaignEx.setClick_mode(jSONObject.optString(JSON_KEY_CLICK_MODE));
                campaignEx.setLandingType(jSONObject.optString(JSON_KEY_LANDING_TYPE));
                campaignEx.setLinkType(jSONObject.optInt(JSON_KEY_LINK_TYPE, 4));
                campaignEx.setClickInterval(jSONObject.optInt(JSON_KEY_CLICK_INTERVAL));
                campaignEx.setAdCall(jSONObject.optString(JSON_KEY_CTA_TEXT));
                campaignEx.setAd_url_list(jSONObject.optString(JSON_KEY_AD_URL_LIST));
                campaignEx.setRetarget_offer(jSONObject.optInt(JSON_KEY_RETARGET_OFFER, 2));
                campaignEx.setVideoUrlEncode(jSONObject.optString("video_url"));
                campaignEx.setVideoLength(jSONObject.optInt(JSON_KEY_VIDEO_LENGTHL));
                campaignEx.setVideoSize(jSONObject.optInt(JSON_KEY_VIDEO_SIZE));
                campaignEx.setVideoResolution(jSONObject.optString(JSON_KEY_VIDEO_RESOLUTION));
                campaignEx.setWatchMile(jSONObject.optInt(JSON_KEY_WATCH_MILE));
                campaignEx.setTimestamp(System.currentTimeMillis());
                campaignEx.setBty(jSONObject.optInt(JSON_KEY_BTY));
                campaignEx.setAdvImp(jSONObject.optString(JSON_KEY_ADVIMP));
                campaignEx.setTImp(jSONObject.optInt(JSON_KEY_T_IMP));
                campaignEx.setHtmlUrl(jSONObject.optString(CampaignUnit.JSON_KEY_HTML_URL));
                campaignEx.setEndScreenUrl(jSONObject.optString(CampaignUnit.JSON_KEY_END_SCREEN_URL));
                campaignEx.setGuidelines(jSONObject.optString(JSON_KEY_GUIDELINES));
                campaignEx.setOfferType(jSONObject.optInt(JSON_KEY_OFFER_TYPE));
                campaignEx.setRewardName(jSONObject.optString(JSON_KEY_REWARD_NAME));
                campaignEx.setRewardAmount(jSONObject.optInt(JSON_KEY_REWARD_AMOUNT));
                try {
                    if (jSONObject.has(JSON_NATIVE_VIDEO_AD_TRACKING)) {
                        String optString = jSONObject.optString(JSON_NATIVE_VIDEO_AD_TRACKING);
                        if (!TextUtils.isEmpty(optString)) {
                            campaignEx.setNativeVideoTrackingString(optString);
                            campaignEx.setNativeVideoTracking(TrackingStr2Object(optString));
                        }
                    }
                } catch (Exception unused) {
                }
                try {
                    campaignEx.setReady_rate(jSONObject.optInt(JSON_KEY_READY_RATE, -1));
                    JSONObject optJSONObject = jSONObject.optJSONObject("ext_data");
                    if (optJSONObject != null) {
                        campaignEx.setExt_data(optJSONObject.toString());
                    }
                    campaignEx.setMof_tplid(jSONObject.optInt(CampaignUnit.JSON_KEY_MOF_TPLID));
                    campaignEx.setMof_template_url(jSONObject.optString(CampaignUnit.JSON_KEY_MOF_TEMPLATE_URL));
                    campaignEx.setNscpt(jSONObject.optInt(CampaignUnit.JSON_KEY_NSCPT));
                    new JSONArray();
                    JSONArray optJSONArray = jSONObject.optJSONArray("pv_urls");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(optJSONArray.length());
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.optString(i));
                        }
                    }
                    campaignEx.setPv_urls(arrayList);
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(CampaignUnit.JSON_KEY_REQ_EXT_DATA);
                    if (optJSONObject2 != null) {
                        campaignEx.setReq_ext_data(optJSONObject2.toString());
                    }
                } catch (Exception unused2) {
                }
                campaignEx.setVideo_end_type(jSONObject.optInt(VIDEO_END_TYPE, 2));
                if (isBreakCampainOrSetItByEndCard(campaignEx, jSONObject.optString(ENDCARD_URL))) {
                    return null;
                }
                campaignEx.setPlayable_ads_without_video(jSONObject.optInt(PLAYABLE_ADS_WITHOUT_VIDEO, 1));
                if (jSONObject.has(JSON_KEY_REWARD_VIDEO_MD5)) {
                    campaignEx.setVideoMD5Value(jSONObject.optString(JSON_KEY_REWARD_VIDEO_MD5));
                }
                if (jSONObject.has(JSON_KEY_NV_T2)) {
                    campaignEx.setNvT2(jSONObject.optInt(JSON_KEY_NV_T2));
                }
                if (jSONObject.has(JSON_KEY_GIF_URL)) {
                    campaignEx.setGifUrl(jSONObject.optString(JSON_KEY_GIF_URL));
                }
                campaignEx.setRewardTemplateMode(C6189c.m15490a(jSONObject.optJSONObject(JSON_KEY_REWARD_TEMPLATE)));
                campaignEx.setClickTimeOutInterval(jSONObject.optInt(JSON_KEY_CLICK_TIMEOUT_INTERVAL, 2));
                campaignEx.setImpUA(jSONObject.optInt(JSON_KEY_IMP_UA, 1));
                campaignEx.setcUA(jSONObject.optInt(JSON_KEY_C_UA, 1));
                campaignEx.setJmPd(jSONObject.optInt(JSON_KEY_JM_PD));
                campaignEx.setKeyIaIcon(jSONObject.optString("ia_icon"));
                campaignEx.setKeyIaRst(jSONObject.optInt("ia_rst"));
                campaignEx.setKeyIaUrl(jSONObject.optString("ia_url"));
                campaignEx.setKeyIaOri(jSONObject.optInt("ia_ori"));
                campaignEx.setAdType(jSONObject.optInt("ad_type"));
                campaignEx.setIa_ext1(jSONObject.optString(KEY_IA_EXT1));
                campaignEx.setIa_ext2(jSONObject.optString(KEY_IA_EXT2));
                campaignEx.setIsDownLoadZip(jSONObject.optInt(KEY_IS_DOWNLOAD));
                campaignEx.setInteractiveCache(jSONObject.optString(KEY_IA_CACHE));
                campaignEx.setOc_time(jSONObject.optInt(KEY_OC_TIME));
                campaignEx.setOc_type(jSONObject.optInt(KEY_OC_TYPE));
                campaignEx.setT_list(jSONObject.optString(KEY_T_LIST));
                campaignEx.setAdchoice(C6187a.m15479a(jSONObject.optString(KEY_ADCHOICE, "")));
                campaignEx.setPlct(jSONObject.optLong(JSON_KEY_PLCT));
                campaignEx.setPlctb(jSONObject.optLong(JSON_KEY_PLCTB));
                JSONArray optJSONArray2 = jSONObject.optJSONArray(KEY_OMID);
                if (optJSONArray2 != null) {
                    campaignEx.setOmid(optJSONArray2.toString());
                } else if (!TextUtils.isEmpty(jSONObject.optString(KEY_OMID))) {
                    campaignEx.setOmid(jSONObject.optString(KEY_OMID));
                } else {
                    campaignEx.setOmid((String) null);
                }
                campaignEx.setCreativeId((long) jSONObject.optInt(JSON_KEY_CREATIVE_ID));
                String optString2 = jSONObject.optString("cam_tpl_url");
                Uri parse = Uri.parse(optString2);
                if (TextUtils.isEmpty(parse.getPath()) || (!parse.getPath().endsWith(".zip") && !parse.getPath().endsWith(".ZIP"))) {
                    campaignEx.setBannerUrl(optString2);
                } else {
                    campaignEx.setAdZip(optString2);
                }
                campaignEx.setBannerHtml(jSONObject.optString("cam_html"));
                campaignEx.setAdHtml(jSONObject.optString("cam_html"));
                campaignEx.setCampaignUnitId(jSONObject.optString("unitId"));
                String optString3 = jSONObject.optString(JSON_KEY_MRAID);
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = jSONObject.optString(JSON_KEY_MRAIDFORH5);
                }
                if (!TextUtils.isEmpty(optString3)) {
                    campaignEx.setIsMraid(true);
                    campaignEx.setMraid(optString3);
                } else if (TextUtils.isEmpty(campaignEx.getAdHtml()) || campaignEx.getAdHtml().contains("<MBTPLMARK>")) {
                    campaignEx.setIsMraid(false);
                } else {
                    campaignEx.setIsMraid(true);
                }
                try {
                    String optString4 = jSONObject.optString(CampaignUnit.JSON_KEY_ONLY_IMPRESSION_URL);
                    if (!TextUtils.isEmpty(optString4)) {
                        campaignEx.setOnlyImpressionURL(optString4);
                        Uri parse2 = Uri.parse(optString4);
                        if (parse2 != null) {
                            campaignEx.setRequestId(parse2.getQueryParameter(JSON_KEY_AD_K));
                        }
                    }
                    String optString5 = jSONObject.optString(JSON_KEY_NOTICE_URL);
                    if (!TextUtils.isEmpty(optString5)) {
                        campaignEx.setNoticeUrl(optString5);
                        Uri parse3 = Uri.parse(optString5);
                        if (parse3 != null) {
                            campaignEx.setRequestIdNotice(parse3.getQueryParameter(JSON_KEY_AD_K));
                        }
                    }
                } catch (Exception unused3) {
                }
                campaignEx.setIsBidCampaign(jSONObject.optBoolean(JSON_KEY_HB, false));
                campaignEx.setPlacementId(jSONObject.optString(MBridgeConstans.PLACEMENT_ID));
                campaignEx.setMaitve(jSONObject.optInt(JSON_KEY_MAITVE));
                campaignEx.setMaitve_src(jSONObject.optString(JSON_KEY_MAITVESRC));
                campaignEx.setFlb(jSONObject.optInt(JSON_KEY_FLB));
                campaignEx.setFlbSkipTime(jSONObject.optInt(JSON_KEY_FLB_SKIP_TIME));
                return parseCampaignWithBackData(jSONObject, campaignEx);
            } catch (Exception e2) {
                e = e2;
                campaignEx2 = campaignEx;
                e.printStackTrace();
                return campaignEx2;
            }
        }
        return campaignEx2;
    }

    private static JSONObject dealV5Temp(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (!jSONObject.has(JSON_KEY_AD_TMP_IDS) || (optJSONArray = jSONObject.optJSONArray(JSON_KEY_AD_TMP_IDS)) == null || optJSONArray.length() <= 0) {
                return jSONObject;
            }
            jSONObject.remove(JSON_KEY_AD_TMP_IDS);
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject a = C6138a.m15352a().mo42943a(optJSONArray.getString(i));
                if (a != null) {
                    Iterator<String> keys = a.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, a.opt(next));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static CampaignEx parseCampaign(JSONObject jSONObject, String str, String str2, String str3, boolean z, CampaignUnit campaignUnit) {
        return parseCampaign(jSONObject, str, str2, str3, z, campaignUnit, "");
    }

    public static CampaignEx parseCampaign(JSONObject jSONObject, String str, String str2, String str3, boolean z, CampaignUnit campaignUnit, String str4) {
        CampaignEx campaignEx;
        ArrayList arrayList;
        CampaignUnit campaignUnit2 = campaignUnit;
        JSONObject dealV5Temp = dealV5Temp(jSONObject);
        if (dealV5Temp == null) {
            return null;
        }
        try {
            CampaignEx campaignEx2 = new CampaignEx();
            try {
                String optString = dealV5Temp.optString(JSON_KEY_AD_AKS);
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                        keys = keys;
                    }
                    campaignEx2.setAks(hashMap);
                }
                if (!TextUtils.isEmpty(str4)) {
                    campaignEx2.setBidToken(str4);
                    campaignEx2.setIsBidCampaign(true);
                }
                try {
                    campaignEx2.setReady_rate(dealV5Temp.optInt(JSON_KEY_READY_RATE, -1));
                    JSONObject optJSONObject = dealV5Temp.optJSONObject("ext_data");
                    if (optJSONObject != null) {
                        campaignEx2.setExt_data(optJSONObject.toString());
                    }
                    campaignEx2.setMof_tplid(dealV5Temp.optInt(CampaignUnit.JSON_KEY_MOF_TPLID));
                    campaignEx2.setMof_template_url(dealV5Temp.optString(CampaignUnit.JSON_KEY_MOF_TEMPLATE_URL));
                    campaignEx2.setNscpt(dealV5Temp.optInt(CampaignUnit.JSON_KEY_NSCPT));
                    new JSONArray();
                    JSONArray optJSONArray = dealV5Temp.optJSONArray("pv_urls");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(optJSONArray.length());
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.optString(i));
                        }
                    }
                    campaignEx2.setPv_urls(arrayList);
                    JSONObject optJSONObject2 = dealV5Temp.optJSONObject(CampaignUnit.JSON_KEY_REQ_EXT_DATA);
                    if (optJSONObject2 != null) {
                        campaignEx2.setReq_ext_data(optJSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
                campaignEx2.setId(dealV5Temp.optString("id"));
                campaignEx2.setAppName(dealV5Temp.optString("title"));
                campaignEx2.setCampaignUnitId(dealV5Temp.optString("unitId", ""));
                campaignEx2.setAppDesc(dealV5Temp.optString(JSON_KEY_DESC));
                campaignEx2.setPackageName(dealV5Temp.optString(JSON_KEY_PACKAGE_NAME));
                campaignEx2.setRtinsType(dealV5Temp.optInt(JSON_KEY_RETARGET_TYPE));
                campaignEx2.setIconUrl(dealV5Temp.optString(JSON_KEY_ICON_URL));
                campaignEx2.setImageUrl(dealV5Temp.optString("image_url"));
                campaignEx2.setSize(dealV5Temp.optString(JSON_KEY_APP_SIZE));
                campaignEx2.setImageSize(dealV5Temp.optString(JSON_KEY_IMAGE_SIZE));
                campaignEx2.setImpressionURL(replaceValueByKey(campaignUnit2, campaignEx2, dealV5Temp.optString(JSON_KEY_IMPRESSION_URL)));
                campaignEx2.setClickURL(replaceValueByKey(campaignUnit2, campaignEx2, dealV5Temp.optString("click_url")));
                campaignEx2.setRewardPlus(RewardPlus.parseByString(dealV5Temp.optString(JSON_KEY_REWARD_PLUS)));
                campaignEx2.setWtick(dealV5Temp.optInt(JSON_KEY_WITHOUT_INSTALL_CHECK));
                campaignEx2.setDeepLinkUrl(replaceValueByKey(campaignUnit2, campaignEx2, dealV5Temp.optString(JSON_KEY_DEEP_LINK_URL)));
                campaignEx2.setUserActivation(dealV5Temp.optBoolean(JSON_KEY_USER_ACTIVATION, false));
                campaignEx2.setNoticeUrl(replaceValueByKey(campaignUnit2, campaignEx2, dealV5Temp.optString(JSON_KEY_NOTICE_URL)));
                campaignEx2.setTemplate(dealV5Temp.optInt("template"));
                campaignEx2.setType(dealV5Temp.optInt(JSON_KEY_AD_SOURCE_ID, 1));
                campaignEx2.setFca(dealV5Temp.optInt(JSON_KEY_FCA));
                campaignEx2.setFcb(dealV5Temp.optInt(JSON_KEY_FCB));
                campaignEx2.setEndcard_click_result(dealV5Temp.optInt(JSON_KEY_ENDCARD_CLICK));
                if (!TextUtils.isEmpty(dealV5Temp.optString(JSON_KEY_STAR))) {
                    campaignEx2.setRating(Double.parseDouble(dealV5Temp.optString(JSON_KEY_STAR, AppEventsConstants.EVENT_PARAM_VALUE_NO)));
                }
                if (!TextUtils.isEmpty(dealV5Temp.optString(JSON_KEY_NUMBER_RATING))) {
                    campaignEx2.setNumberRating(dealV5Temp.optInt(JSON_KEY_NUMBER_RATING, 333333));
                }
                campaignEx2.setClick_mode(dealV5Temp.optString(JSON_KEY_CLICK_MODE));
                campaignEx2.setLandingType(dealV5Temp.optString(JSON_KEY_LANDING_TYPE));
                campaignEx2.setLinkType(dealV5Temp.optInt(JSON_KEY_LINK_TYPE, 4));
                campaignEx2.setClickInterval(dealV5Temp.optInt(JSON_KEY_CLICK_INTERVAL));
                campaignEx2.setAdCall(dealV5Temp.optString(JSON_KEY_CTA_TEXT));
                campaignEx2.setAd_url_list(dealV5Temp.optString(JSON_KEY_AD_URL_LIST));
                campaignEx2.setRetarget_offer(dealV5Temp.optInt(JSON_KEY_RETARGET_OFFER, 2));
                String optString2 = dealV5Temp.optString("video_url");
                if (!TextUtils.isEmpty(optString2)) {
                    if (z) {
                        campaignEx2.setVideoUrlEncode(optString2);
                    } else {
                        campaignEx2.setVideoUrlEncode(C6348l.m16089b(optString2));
                    }
                }
                campaignEx2.setVideoLength(dealV5Temp.optInt(JSON_KEY_VIDEO_LENGTHL));
                campaignEx2.setVideoSize(dealV5Temp.optInt(JSON_KEY_VIDEO_SIZE));
                campaignEx2.setVideoResolution(dealV5Temp.optString(JSON_KEY_VIDEO_RESOLUTION));
                campaignEx2.setWatchMile(dealV5Temp.optInt(JSON_KEY_WATCH_MILE));
                campaignEx2.setTimestamp(System.currentTimeMillis());
                campaignEx2.setOnlyImpressionURL(replaceValueByKey(campaignUnit2, campaignEx2, str));
                campaignEx2.setBty(dealV5Temp.optInt(JSON_KEY_BTY));
                campaignEx2.setAdvImp(dealV5Temp.optString(JSON_KEY_ADVIMP));
                campaignEx2.setTImp(dealV5Temp.optInt(JSON_KEY_T_IMP));
                campaignEx2.setHtmlUrl(str2);
                campaignEx2.setEndScreenUrl(str3);
                campaignEx2.setGuidelines(dealV5Temp.optString(JSON_KEY_GUIDELINES));
                campaignEx2.setOfferType(dealV5Temp.optInt(JSON_KEY_OFFER_TYPE));
                campaignEx2.setRewardName(dealV5Temp.optString(JSON_KEY_REWARD_NAME));
                campaignEx2.setRewardAmount(dealV5Temp.optInt(JSON_KEY_REWARD_AMOUNT));
                try {
                    if (dealV5Temp.has(JSON_NATIVE_VIDEO_AD_TRACKING)) {
                        String replaceValueByKey = replaceValueByKey(campaignUnit2, campaignEx2, dealV5Temp.optString(JSON_NATIVE_VIDEO_AD_TRACKING));
                        if (!TextUtils.isEmpty(replaceValueByKey)) {
                            campaignEx2.setNativeVideoTrackingString(replaceValueByKey);
                            campaignEx2.setNativeVideoTracking(TrackingStr2Object(replaceValueByKey));
                        }
                    }
                } catch (Exception unused2) {
                }
                campaignEx2.setVideo_end_type(dealV5Temp.optInt(VIDEO_END_TYPE, 2));
                if (isBreakCampainOrSetItByEndCard(campaignEx2, dealV5Temp.optString(ENDCARD_URL))) {
                    return null;
                }
                campaignEx2.setPlayable_ads_without_video(dealV5Temp.optInt(PLAYABLE_ADS_WITHOUT_VIDEO, 1));
                if (dealV5Temp.has(JSON_KEY_REWARD_VIDEO_MD5)) {
                    campaignEx2.setVideoMD5Value(dealV5Temp.optString(JSON_KEY_REWARD_VIDEO_MD5));
                }
                if (dealV5Temp.has(JSON_KEY_NV_T2)) {
                    campaignEx2.setNvT2(dealV5Temp.optInt(JSON_KEY_NV_T2));
                }
                if (dealV5Temp.has(JSON_KEY_GIF_URL)) {
                    campaignEx2.setGifUrl(dealV5Temp.optString(JSON_KEY_GIF_URL));
                }
                campaignEx2.setRewardTemplateMode(C6189c.m15490a(dealV5Temp.optJSONObject(JSON_KEY_REWARD_TEMPLATE)));
                campaignEx2.setClickTimeOutInterval(dealV5Temp.optInt(JSON_KEY_CLICK_TIMEOUT_INTERVAL, 2));
                campaignEx2.setImpUA(dealV5Temp.optInt(JSON_KEY_IMP_UA, 1));
                campaignEx2.setcUA(dealV5Temp.optInt(JSON_KEY_C_UA, 1));
                campaignEx2.setJmPd(dealV5Temp.optInt(JSON_KEY_JM_PD));
                campaignEx2.setKeyIaIcon(dealV5Temp.optString("ia_icon"));
                campaignEx2.setKeyIaRst(dealV5Temp.optInt("ia_rst"));
                campaignEx2.setKeyIaUrl(dealV5Temp.optString("ia_url"));
                campaignEx2.setKeyIaOri(dealV5Temp.optInt("ia_ori"));
                campaignEx2.setAdType(campaignUnit.getAdType());
                campaignEx2.setVcn(campaignUnit.getVcn());
                campaignEx2.setIa_ext1(dealV5Temp.optString(KEY_IA_EXT1));
                campaignEx2.setIa_ext2(dealV5Temp.optString(KEY_IA_EXT2));
                campaignEx2.setIsDownLoadZip(dealV5Temp.optInt(KEY_IS_DOWNLOAD));
                campaignEx2.setInteractiveCache(dealV5Temp.optString(KEY_IA_CACHE));
                campaignEx2.setOc_time(dealV5Temp.optInt(KEY_OC_TIME));
                campaignEx2.setOc_type(dealV5Temp.optInt(KEY_OC_TYPE));
                campaignEx2.setT_list(dealV5Temp.optString(KEY_T_LIST));
                campaignEx2.setAdchoice(C6187a.m15479a(dealV5Temp.optString(KEY_ADCHOICE, "")));
                campaignEx2.setPlct(dealV5Temp.optLong(JSON_KEY_PLCT));
                campaignEx2.setPlctb(dealV5Temp.optLong(JSON_KEY_PLCTB));
                campaignEx2.setCreativeId(dealV5Temp.optLong(JSON_KEY_CREATIVE_ID));
                String optString3 = dealV5Temp.optString("cam_tpl_url");
                Uri parse = Uri.parse(optString3);
                if (TextUtils.isEmpty(parse.getPath()) || (!parse.getPath().endsWith(".zip") && !parse.getPath().endsWith(".ZIP"))) {
                    campaignEx2.setBannerUrl(optString3);
                } else {
                    campaignEx2.setAdZip(optString3);
                }
                campaignEx2.setBannerHtml(dealV5Temp.optString("cam_html"));
                campaignEx2.setAdHtml(dealV5Temp.optString("cam_html"));
                String optString4 = dealV5Temp.optString(JSON_KEY_MRAID);
                if (!TextUtils.isEmpty(optString4)) {
                    campaignEx2.setIsMraid(true);
                    campaignEx2.setMraid(optString4);
                } else if (TextUtils.isEmpty(campaignEx2.getAdHtml()) || campaignEx2.getAdHtml().contains("<MBTPLMARK>")) {
                    campaignEx2.setIsMraid(false);
                } else {
                    campaignEx2.setIsMraid(true);
                }
                JSONArray optJSONArray2 = dealV5Temp.optJSONArray(KEY_OMID);
                if (optJSONArray2 != null) {
                    campaignEx2.setOmid(optJSONArray2.toString());
                } else if (!TextUtils.isEmpty(dealV5Temp.optString(KEY_OMID))) {
                    campaignEx2.setOmid(dealV5Temp.optString(KEY_OMID));
                } else {
                    campaignEx2.setOmid((String) null);
                }
                campaignEx2.setPlacementId(dealV5Temp.optString(MBridgeConstans.PLACEMENT_ID));
                campaignEx2.setMaitve(dealV5Temp.optInt(JSON_KEY_MAITVE));
                campaignEx2.setMaitve_src(dealV5Temp.optString(JSON_KEY_MAITVESRC));
                campaignEx2.setFlb(dealV5Temp.optInt(JSON_KEY_FLB));
                campaignEx2.setFlbSkipTime(dealV5Temp.optInt(JSON_KEY_FLB_SKIP_TIME));
                campaignEx = parseCampaign(dealV5Temp, campaignEx2);
                try {
                    campaignEx.setImpressionURL(C6366u.m16190a(C6122a.m15302b().mo42895d(), campaignEx.getPackageName(), campaignEx.getImpressionURL()));
                } catch (Exception e) {
                    try {
                        C6361q.m16158d("campaign", e.getMessage());
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        return campaignEx;
                    }
                }
                return campaignEx;
            } catch (Exception e3) {
                e = e3;
                campaignEx = campaignEx2;
                e.printStackTrace();
                return campaignEx;
            }
        } catch (Exception e4) {
            e = e4;
            campaignEx = null;
            e.printStackTrace();
            return campaignEx;
        }
    }

    public static C6199i TrackingStr2Object(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                C6199i iVar = new C6199i();
                iVar.mo43687o(processNativeVideoTrackingArray(jSONObject.optJSONArray("impression")));
                iVar.mo43666d(processNativeVideoTrackingArray(jSONObject.optJSONArray("start")));
                iVar.mo43667e(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_FIRST_QUARTILE)));
                iVar.mo43669f(processNativeVideoTrackingArray(jSONObject.optJSONArray("midpoint")));
                iVar.mo43671g(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_THIRD_QUARTILE)));
                iVar.mo43673h(processNativeVideoTrackingArray(jSONObject.optJSONArray("complete")));
                iVar.mo43658a(parsePlayCentage(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_PLAY_PERCENTAGE)));
                iVar.mo43675i(processNativeVideoTrackingArray(jSONObject.optJSONArray("mute")));
                iVar.mo43677j(processNativeVideoTrackingArray(jSONObject.optJSONArray("unmute")));
                iVar.mo43679k(processNativeVideoTrackingArray(jSONObject.optJSONArray("click")));
                iVar.mo43681l(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_PAUSE)));
                iVar.mo43683m(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_RESUME)));
                iVar.mo43685n(processNativeVideoTrackingArray(jSONObject.optJSONArray("error")));
                iVar.mo43689p(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_ENDCARD)));
                iVar.mo43693r(processNativeVideoTrackingArray(jSONObject.optJSONArray("close")));
                iVar.mo43691q(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_NATIVE_VIDEO_ENDCARD_SHOW)));
                iVar.mo43694s(processNativeVideoTrackingArray(jSONObject.optJSONArray("video_click")));
                iVar.mo43663c(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_KEY_AD_TRACKING_IMPRESSION_T2)));
                iVar.mo43659a(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_KEY_AD_TRACKING_DROPOUT_TRACK)));
                iVar.mo43661b(processNativeVideoTrackingArray(jSONObject.optJSONArray(JSON_KEY_AD_TRACKING_PLYCMPT_TRACK)));
                return trackingStr2Object(jSONObject, iVar);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    protected static String[] processNativeVideoTrackingArray(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    private Map<Integer, String> generateAdImpression(String str) {
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            HashMap hashMap2 = new HashMap();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt(JSON_AD_IMP_KEY);
                    hashMap2.put(Integer.valueOf(optInt), optJSONObject.optString("url"));
                    i++;
                } catch (Exception e) {
                    e = e;
                    hashMap = hashMap2;
                    e.printStackTrace();
                    return hashMap;
                }
            }
            return hashMap2;
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return hashMap;
        }
    }

    public List<String> getAdUrlList() {
        ArrayList arrayList;
        Exception e;
        String ad_url_list2 = getAd_url_list();
        try {
            if (TextUtils.isEmpty(ad_url_list2)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(ad_url_list2);
            arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    arrayList.add(jSONArray.optString(i));
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
            e.printStackTrace();
            return arrayList;
        }
    }

    public static JSONArray parseCamplistToJson(List<CampaignEx> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        for (CampaignEx campaignToJsonObject : list) {
                            try {
                                jSONArray2.put(campaignToJsonObject(campaignToJsonObject));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return jSONArray2;
                    } catch (Exception e) {
                        e = e;
                        jSONArray = jSONArray2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return jSONArray;
            }
        }
        return jSONArray;
    }

    public static JSONObject campaignToJsonObject(CampaignEx campaignEx, boolean z, boolean z2) throws JSONException {
        JSONObject campaignToJsonObject = campaignToJsonObject(campaignEx);
        campaignToJsonObject.put("isReady", z);
        campaignToJsonObject.put("expired", z2);
        return campaignToJsonObject;
    }

    public static JSONObject campaignToJsonObject(CampaignEx campaignEx) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", campaignEx.getId());
        jSONObject.put(JSON_KEY_FLB, campaignEx.getFlb());
        jSONObject.put(JSON_KEY_FLB_SKIP_TIME, campaignEx.getFlbSkipTime());
        if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
            jSONObject.put("unitId", campaignEx.getCampaignUnitId());
        }
        if (!TextUtils.isEmpty(campaignEx.getExt_data())) {
            try {
                jSONObject.put("ext_data", new JSONObject(campaignEx.getExt_data()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(campaignEx.getReq_ext_data())) {
            try {
                jSONObject.put(CampaignUnit.JSON_KEY_REQ_EXT_DATA, new JSONObject(campaignEx.getReq_ext_data()));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String put : campaignEx.getPv_urls()) {
                    jSONArray.put(put);
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
            jSONObject.put(CampaignUnit.JSON_KEY_MOF_TPLID, campaignEx.getMof_tplid());
            jSONObject.put(CampaignUnit.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
            jSONObject.put(CampaignUnit.JSON_KEY_NSCPT, campaignEx.getNscpt());
        }
        jSONObject.put(JSON_KEY_READY_RATE, campaignEx.getReady_rate());
        jSONObject.put("title", campaignEx.getAppName());
        jSONObject.put(JSON_KEY_DESC, campaignEx.getAppDesc());
        jSONObject.put(JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
        jSONObject.put(JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
        jSONObject.put(JSON_KEY_ICON_URL, campaignEx.getIconUrl());
        jSONObject.put("image_url", campaignEx.getImageUrl());
        jSONObject.put(JSON_KEY_APP_SIZE, campaignEx.getSize());
        jSONObject.put(JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
        jSONObject.put(JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
        jSONObject.put("click_url", campaignEx.getClickURL());
        if (campaignEx.getRewardPlus() != null) {
            jSONObject.put(JSON_KEY_REWARD_PLUS, campaignEx.getRewardPlus().toJsonObject());
        }
        jSONObject.put(JSON_KEY_WITHOUT_INSTALL_CHECK, campaignEx.getWtick());
        jSONObject.put(JSON_KEY_DEEP_LINK_URL, campaignEx.getDeepLinkURL());
        jSONObject.put(JSON_KEY_USER_ACTIVATION, campaignEx.getUserActivation());
        jSONObject.put(JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
        jSONObject.put("template", campaignEx.getTemplate());
        jSONObject.put(JSON_KEY_AD_SOURCE_ID, campaignEx.getType());
        jSONObject.put(JSON_KEY_FCA, campaignEx.getFca());
        jSONObject.put(JSON_KEY_FCB, campaignEx.getFcb());
        jSONObject.put(JSON_KEY_STAR, campaignEx.getRating() + "");
        jSONObject.put(JSON_KEY_NUMBER_RATING, campaignEx.getNumberRating());
        jSONObject.put(JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
        jSONObject.put(JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
        jSONObject.put(JSON_KEY_LINK_TYPE, campaignEx.getLinkType());
        jSONObject.put(JSON_KEY_CLICK_INTERVAL, campaignEx.getClickInterval());
        jSONObject.put(JSON_KEY_CTA_TEXT, campaignEx.getAdCall());
        jSONObject.put(JSON_KEY_ENDCARD_CLICK, campaignEx.getEndcard_click_result());
        jSONObject.put(JSON_KEY_RETARGET_OFFER, campaignEx.getRetarget_offer());
        jSONObject.put("video_url", campaignEx.getVideoUrlEncode());
        jSONObject.put(JSON_KEY_VIDEO_LENGTHL, campaignEx.getVideoLength());
        jSONObject.put(JSON_KEY_VIDEO_SIZE, campaignEx.getVideoSize());
        jSONObject.put(JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
        jSONObject.put(JSON_KEY_WATCH_MILE, campaignEx.getWatchMile());
        jSONObject.put(JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
        jSONObject.put(CampaignUnit.JSON_KEY_ONLY_IMPRESSION_URL, campaignEx.getOnlyImpressionURL());
        jSONObject.put(JSON_KEY_BTY, campaignEx.getBty());
        jSONObject.put(JSON_KEY_T_IMP, campaignEx.getTImp());
        jSONObject.put(JSON_KEY_ADVIMP, campaignEx.getAdvImp());
        jSONObject.put(CampaignUnit.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
        jSONObject.put(CampaignUnit.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
        jSONObject.put(JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
        jSONObject.put(JSON_KEY_OFFER_TYPE, campaignEx.getOfferType());
        jSONObject.put(JSON_KEY_REWARD_AMOUNT, campaignEx.getRewardAmount());
        jSONObject.put(JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
        jSONObject.put(JSON_KEY_GIF_URL, campaignEx.getGifUrl());
        if (C6369x.m16236b(campaignEx.getNativeVideoTrackingString())) {
            jSONObject.put(JSON_NATIVE_VIDEO_AD_TRACKING, new JSONObject(campaignEx.getNativeVideoTrackingString()));
        }
        jSONObject.put(VIDEO_END_TYPE, campaignEx.getVideo_end_type());
        jSONObject.put(ENDCARD_URL, campaignEx.getendcard_url());
        jSONObject.put(PLAYABLE_ADS_WITHOUT_VIDEO, campaignEx.getPlayable_ads_without_video());
        if (!(campaignEx == null || campaignEx.getRewardTemplateMode() == null || !C6369x.m16236b(campaignEx.getRewardTemplateMode().mo43507a()))) {
            jSONObject.put(JSON_KEY_REWARD_TEMPLATE, new JSONObject(campaignEx.getRewardTemplateMode().mo43507a()));
        }
        jSONObject.put(JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
        jSONObject.put(JSON_KEY_CLICK_TIMEOUT_INTERVAL, campaignEx.getClickTimeOutInterval());
        jSONObject.put(JSON_KEY_C_UA, campaignEx.getcUA());
        jSONObject.put(JSON_KEY_IMP_UA, campaignEx.getImpUA());
        jSONObject.put(JSON_KEY_JM_PD, campaignEx.getJmPd());
        jSONObject.put("ia_icon", campaignEx.getKeyIaIcon());
        jSONObject.put("ia_rst", campaignEx.getKeyIaRst());
        jSONObject.put("ia_url", campaignEx.getKeyIaUrl());
        jSONObject.put("ia_ori", campaignEx.getKeyIaOri());
        jSONObject.put("ad_type", campaignEx.getAdType());
        jSONObject.put(KEY_IA_EXT1, campaignEx.getIa_ext1());
        jSONObject.put(KEY_IA_EXT2, campaignEx.getIa_ext2());
        jSONObject.put(KEY_IS_DOWNLOAD, campaignEx.getIsDownLoadZip());
        jSONObject.put(KEY_IA_CACHE, campaignEx.getInteractiveCache());
        jSONObject.put(KEY_OC_TYPE, campaignEx.getOc_type());
        jSONObject.put(KEY_OC_TIME, campaignEx.getOc_time());
        jSONObject.put(KEY_T_LIST, campaignEx.getT_list());
        C6187a adchoice2 = campaignEx.getAdchoice();
        if (adchoice2 != null) {
            jSONObject.put(KEY_ADCHOICE, new JSONObject(adchoice2.mo43503c()));
        }
        jSONObject.put(JSON_KEY_PLCT, campaignEx.getPlct());
        jSONObject.put(JSON_KEY_PLCTB, campaignEx.getPlctb());
        jSONObject.put(KEY_OMID, campaignEx.getOmid());
        jSONObject.put(JSON_KEY_CREATIVE_ID, campaignEx.getCreativeId());
        jSONObject.put("cam_html", campaignEx.getBannerHtml());
        jSONObject.put("cam_tpl_url", campaignEx.getBannerUrl() != null ? campaignEx.getBannerUrl() : campaignEx.getAdZip());
        jSONObject.put(JSON_KEY_MRAID, campaignEx.getMraid());
        jSONObject.put(JSON_KEY_MRAIDFORH5, campaignEx.getMraid());
        jSONObject.put("timestamp", campaignEx.getTimestamp());
        jSONObject.put(JSON_KEY_HB, campaignEx.isBidCampaign);
        jSONObject.put(MBridgeConstans.PLACEMENT_ID, campaignEx.getPlacementId());
        jSONObject.put(JSON_KEY_MAITVE, campaignEx.getMaitve());
        jSONObject.put(JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
        jSONObject.put("vcn", campaignEx.getVcn());
        try {
            jSONObject.put("misk_spt", C6366u.m16211c());
            jSONObject.put("misk_spt_det", C6366u.m16216d());
        } catch (JSONException unused) {
        }
        return campaignToJsonObject(jSONObject, campaignEx);
    }

    private static List<Map<Integer, String>> parsePlayCentage(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap hashMap = new HashMap();
                        int i2 = jSONObject.getInt("rate");
                        hashMap.put(Integer.valueOf(i2), jSONObject.getString("url"));
                        arrayList.add(hashMap);
                    }
                    i++;
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public boolean isCallbacked() {
        return this.isCallbacked;
    }

    public void setCallbacked(boolean z) {
        this.isCallbacked = z;
    }

    public int getReady_rate() {
        return this.ready_rate;
    }

    public void setReady_rate(int i) {
        this.ready_rate = i;
    }

    public String getExt_data() {
        return this.ext_data;
    }

    public void setExt_data(String str) {
        this.ext_data = str;
    }

    public int getNscpt() {
        return this.nscpt;
    }

    public void setNscpt(int i) {
        this.nscpt = i;
    }

    public String getMof_template_url() {
        return this.mof_template_url;
    }

    public void setMof_template_url(String str) {
        this.mof_template_url = str;
    }

    public int getMof_tplid() {
        return this.mof_tplid;
    }

    public void setMof_tplid(int i) {
        this.mof_tplid = i;
    }

    public String getReq_ext_data() {
        return this.req_ext_data;
    }

    public void setReq_ext_data(String str) {
        this.req_ext_data = str;
    }

    public void setReadyState(int i) {
        this.readyState = i;
    }

    public boolean isReady() {
        return this.isReady;
    }

    public void setReady(boolean z) {
        this.isReady = z;
    }

    public int getLoadTimeoutState() {
        return this.loadTimeoutState;
    }

    public void setLoadTimeoutState(int i) {
        this.loadTimeoutState = i;
    }

    public int getMaitve() {
        return this.maitve;
    }

    public void setMaitve(int i) {
        this.maitve = i;
    }

    public String getMaitve_src() {
        return this.maitve_src;
    }

    public void setMaitve_src(String str) {
        this.maitve_src = str;
    }

    /* renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$c */
    public static final class C6189c implements Serializable {

        /* renamed from: a */
        private String f15260a;

        /* renamed from: b */
        private int f15261b;

        /* renamed from: c */
        private int f15262c;

        /* renamed from: d */
        private String f15263d;

        /* renamed from: e */
        private String f15264e;

        /* renamed from: f */
        private List<C6190a> f15265f;

        /* renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$c$a */
        public static final class C6190a implements Serializable {

            /* renamed from: a */
            public String f15266a;

            /* renamed from: b */
            public List<String> f15267b = new ArrayList();
        }

        private C6189c(String str) {
            this.f15260a = str;
        }

        /* renamed from: a */
        public final String mo43507a() {
            return this.f15260a;
        }

        /* renamed from: b */
        public final int mo43508b() {
            return this.f15262c;
        }

        /* renamed from: c */
        public final String mo43509c() {
            return this.f15263d;
        }

        /* renamed from: d */
        public final String mo43510d() {
            return this.f15264e;
        }

        /* renamed from: e */
        public final List<C6190a> mo43511e() {
            return this.f15265f;
        }

        /* renamed from: a */
        public static C6189c m15489a(String str) {
            try {
                if (C6369x.m16236b(str)) {
                    return m15490a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static C6189c m15490a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!C6369x.m16236b(jSONObject.toString())) {
                    return null;
                }
                C6189c cVar = new C6189c(jSONObject.toString());
                cVar.f15261b = jSONObject.optInt("video_template", 1);
                cVar.f15264e = jSONObject.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_TEMPLATE_URL);
                cVar.f15262c = jSONObject.optInt("orientation");
                cVar.f15263d = jSONObject.optString("paused_url");
                JSONObject optJSONObject = jSONObject.optJSONObject("image");
                if (optJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        List<String> b = C6366u.m16206b(optJSONObject.optJSONArray(next));
                        if (b != null && b.size() > 0) {
                            C6190a aVar = new C6190a();
                            aVar.f15266a = next;
                            aVar.f15267b.addAll(b);
                            arrayList.add(aVar);
                        }
                    }
                    cVar.f15265f = arrayList;
                }
                return cVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public boolean isHasReportAdTrackPause() {
        return this.hasReportAdTrackPause;
    }

    public void setHasReportAdTrackPause(boolean z) {
        this.hasReportAdTrackPause = z;
    }

    /* renamed from: com.mbridge.msdk.foundation.entity.CampaignEx$a */
    public static final class C6187a implements Serializable {

        /* renamed from: a */
        private String f15237a = "";

        /* renamed from: b */
        private String f15238b = "";

        /* renamed from: c */
        private String f15239c = "";

        /* renamed from: d */
        private String f15240d = "";

        /* renamed from: e */
        private String f15241e = "";

        /* renamed from: f */
        private String f15242f = "";

        /* renamed from: g */
        private String f15243g = "";

        /* renamed from: h */
        private String f15244h = "";

        /* renamed from: i */
        private int f15245i = 0;

        /* renamed from: j */
        private int f15246j = 0;

        /* renamed from: k */
        private String f15247k = "";

        /* renamed from: a */
        public final int mo43501a() {
            return this.f15245i;
        }

        /* renamed from: b */
        public final int mo43502b() {
            return this.f15246j;
        }

        /* renamed from: c */
        public final String mo43503c() {
            return this.f15247k;
        }

        /* renamed from: d */
        public final String mo43504d() {
            return this.f15238b;
        }

        /* renamed from: e */
        public final String mo43505e() {
            return this.f15239c;
        }

        /* renamed from: f */
        public final String mo43506f() {
            return this.f15240d;
        }

        /* renamed from: a */
        public static C6187a m15479a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return m15480a(new JSONObject(str));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.mbridge.msdk.foundation.entity.CampaignEx.C6187a m15480a(org.json.JSONObject r3) {
            /*
                r0 = 0
                if (r3 == 0) goto L_0x0073
                com.mbridge.msdk.foundation.entity.CampaignEx$a r1 = new com.mbridge.msdk.foundation.entity.CampaignEx$a     // Catch:{ Exception -> 0x006b, all -> 0x0062 }
                r1.<init>()     // Catch:{ Exception -> 0x006b, all -> 0x0062 }
                java.lang.String r0 = "adchoice_icon"
                java.lang.String r0 = r3.optString(r0)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15239c = r0     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r0 = "adchoice_link"
                java.lang.String r0 = r3.optString(r0)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15238b = r0     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r0 = "adchoice_size"
                java.lang.String r0 = r3.optString(r0)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15240d = r0     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r2 = "ad_logo_link"
                java.lang.String r2 = r3.optString(r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15237a = r2     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r2 = "adv_logo"
                java.lang.String r2 = r3.optString(r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15244h = r2     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r2 = "adv_name"
                java.lang.String r2 = r3.optString(r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15243g = r2     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r2 = "platform_logo"
                java.lang.String r2 = r3.optString(r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15242f = r2     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r2 = "platform_name"
                java.lang.String r2 = r3.optString(r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15241e = r2     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                int r2 = m15481b(r0)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15246j = r2     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                int r0 = m15482c(r0)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15245i = r0     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r1.f15247k = r3     // Catch:{ Exception -> 0x005f, all -> 0x005c }
                r0 = r1
                goto L_0x0073
            L_0x005c:
                r3 = move-exception
                r0 = r1
                goto L_0x0063
            L_0x005f:
                r3 = move-exception
                r0 = r1
                goto L_0x006c
            L_0x0062:
                r3 = move-exception
            L_0x0063:
                boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r1 == 0) goto L_0x0073
                r3.printStackTrace()
                goto L_0x0073
            L_0x006b:
                r3 = move-exception
            L_0x006c:
                boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r1 == 0) goto L_0x0073
                r3.printStackTrace()
            L_0x0073:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.entity.CampaignEx.C6187a.m15480a(org.json.JSONObject):com.mbridge.msdk.foundation.entity.CampaignEx$a");
        }

        /* renamed from: b */
        private static int m15481b(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 1) {
                    return Integer.parseInt(split[1]);
                }
            } catch (Exception | NumberFormatException unused) {
            }
            return 0;
        }

        /* renamed from: c */
        private static int m15482c(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 0) {
                    return Integer.parseInt(split[0]);
                }
            } catch (Exception | NumberFormatException unused) {
            }
            return 0;
        }
    }

    public boolean isSpareOffer(long j, long j2) {
        if (isEffectiveOffer(j)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (getPlctb() > 0) {
            if (getTimestamp() + (getPlctb() * 1000) >= currentTimeMillis) {
                return true;
            }
            return false;
        } else if (getTimestamp() + j2 >= currentTimeMillis) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEffectiveOffer(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (getPlct() > 0) {
            if (getTimestamp() + (getPlct() * 1000) >= currentTimeMillis) {
                return true;
            }
            return false;
        } else if (getTimestamp() + j >= currentTimeMillis) {
            return true;
        } else {
            return false;
        }
    }

    public String getOmid() {
        return this.omid;
    }

    public void setOmid(String str) {
        this.omid = str;
    }

    public boolean isActiveOm() {
        return !TextUtils.isEmpty(this.omid) && !TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL);
    }

    public int getCbt() {
        return this.cbt;
    }

    public void setCbt(int i) {
        this.cbt = i;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public boolean needShowIDialog() {
        return super.needShowIDialog(this);
    }

    public long getcVersionCode() {
        return this.cVersionCode;
    }

    public void setcVersionCode(long j) {
        this.cVersionCode = j;
    }
}
