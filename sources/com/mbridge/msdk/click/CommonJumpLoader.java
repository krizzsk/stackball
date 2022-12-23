package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p170e.C6228b;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

public final class CommonJumpLoader extends C6106c {

    /* renamed from: a */
    JumpLoaderResult f15025a = null;

    /* renamed from: b */
    private int f15026b = 0;

    /* renamed from: c */
    private String f15027c = null;

    /* renamed from: d */
    private C6107d f15028d = null;

    /* renamed from: e */
    private boolean f15029e = true;

    /* renamed from: f */
    private C6228b f15030f;

    /* renamed from: g */
    private C6117g f15031g;

    /* renamed from: h */
    private Handler f15032h = new Handler(Looper.getMainLooper());

    public CommonJumpLoader(Context context) {
        this.f15030f = new C6228b(context);
        this.f15031g = new C6117g(context);
    }

    /* renamed from: a */
    public final void mo42812a(String str, CampaignEx campaignEx, C6107d dVar, String str2, boolean z, boolean z2) {
        String str3;
        boolean z3;
        this.f15027c = str2;
        this.f15028d = dVar;
        this.f15025a = null;
        boolean z4 = false;
        if (campaignEx != null) {
            if (CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode())) {
                z4 = true;
            }
            str3 = campaignEx.getId();
            z3 = z4;
        } else {
            str3 = "";
            z3 = false;
        }
        this.f15031g.mo42874a(str2, dVar, z3, str3, str, campaignEx, z, z2);
    }

    /* renamed from: a */
    public final void mo42811a(String str, CampaignEx campaignEx, C6107d dVar) {
        this.f15027c = new String(campaignEx.getClickURL());
        this.f15028d = dVar;
        this.f15025a = null;
        this.f15031g.mo42874a(campaignEx.getClickURL(), dVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false);
    }

    /* renamed from: a */
    public final void mo42810a() {
        this.f15029e = false;
    }

    public static class JumpLoaderResult implements NoProGuard, Serializable {
        public static final int CODE_DOWNLOAD = 3;
        public static final int CODE_LINK = 2;
        public static final int CODE_MARKET = 1;
        public static final int CODE_NULL = 4;
        private static final long serialVersionUID = 1;
        private int code;
        private String content;
        private String exceptionMsg;
        private String header;
        private boolean is302Jump;
        private boolean jumpDone;
        private String msg;
        private String noticeurl;
        private int statusCode;
        private boolean success;
        private int type;
        private String url;

        public int getStatusCode() {
            return this.statusCode;
        }

        public void setStatusCode(int i) {
            this.statusCode = i;
        }

        public boolean isIs302Jump() {
            return this.is302Jump;
        }

        public void setIs302Jump(boolean z) {
            this.is302Jump = z;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int i) {
            this.type = i;
        }

        public String getHeader() {
            return this.header;
        }

        public void setHeader(String str) {
            this.header = str;
        }

        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public void setExceptionMsg(String str) {
            this.exceptionMsg = str;
        }

        public String getContent() {
            return this.content;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public String getNoticeurl() {
            return this.noticeurl;
        }

        public void setNoticeurl(String str) {
            this.noticeurl = str;
        }

        public boolean isSuccess() {
            return this.success;
        }

        public void setSuccess(boolean z) {
            this.success = z;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String str) {
            this.msg = str;
        }

        public int getCode() {
            return this.code;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public boolean isjumpDone() {
            return this.jumpDone;
        }

        public void setjumpDone(boolean z) {
            this.jumpDone = z;
        }
    }
}
